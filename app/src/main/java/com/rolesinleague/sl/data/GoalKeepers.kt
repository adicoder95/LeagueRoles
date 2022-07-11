package com.rolesinleague.sl.data

import com.rolesinleague.sl.R
import com.rolesinleague.sl.model.Player
import com.rolesinleague.sl.util.MonthUtil

object GoalKeepers {

    val goalKeeperList = ArrayList<Player>()

    private val role = Player.Position.GOALKEEPER

    private val alexanderAlexandrovich = Player(
       "АЛЕКСАНДР", "СЕЛИХОВ",
       "07-${MonthUtil.April}-1994", role
    )

    private val antonVladimirovich = Player(
        "АНТОН", "ШУНИН",
        "27-${MonthUtil.January}-1987", role
    )

    private val matveySafonov = Player(
        "МАТВЕЙ", "САФОНОВ",
        "25-${MonthUtil.February}-1999", role
    )

   init {
       //require (role == Player.Position.GOALKEEPER)

       alexanderAlexandrovich.apply {
           age = 28
           debutDate = "17-${MonthUtil.November}-2014"
           goalsConceded = 10
           numberOfGames = 6
           imageDrawable = R.drawable.alexander_alexandrovich

       }

       antonVladimirovich.apply {
           age = 35
           debutDate = "22-${MonthUtil.August}-2007"
           goalsConceded = 14
           numberOfGames = 13
           imageDrawable = R.drawable.anton_vladimirovich

       }

       matveySafonov.apply {
           age = 23
           debutDate = "06-${MonthUtil.June}-2021"
           goalsConceded = 5
           numberOfGames = 7
           imageDrawable = R.drawable.matvey_safonov

       }

       goalKeeperList.apply {
           add(alexanderAlexandrovich)
           add(antonVladimirovich)
           add(matveySafonov)
       }
   }

}