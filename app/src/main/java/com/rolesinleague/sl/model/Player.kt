package com.rolesinleague.sl.model

data class Player(
    val firstName: String,
    val lastName: String,
    val dateOfBirth: String,
    val role: Position)  {

    enum class Position { GOALKEEPER, DEFENDER, MIDFIELDER, STRIKER }

    var age = 0
    var numberOfGames = 0
    var goalsConceded = 0
    var goalsScored = 0
    var debutDate = ""
    var imageDrawable = 0


    override fun toString() =
        if (role == Position.GOALKEEPER)
            "$role: [$firstName $lastName, age = $age, conceded: $goalsConceded]"
        else
            "$role: [$firstName $lastName, age = $age, scored: $goalsScored]"

}