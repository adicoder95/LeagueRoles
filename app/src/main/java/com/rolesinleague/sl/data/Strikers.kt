package com.rolesinleague.sl.data

import com.rolesinleague.sl.R
import com.rolesinleague.sl.model.Player
import com.rolesinleague.sl.util.MonthUtil

object Strikers {

    val strikerList = ArrayList<Player>()

    private val role = Player.Position.STRIKER

    private val antonZabolotny = Player(
        "АНТОН", "ЗАБОЛОТНЫЙ",
        "13-${MonthUtil.June}-1991", role
    )

    private val ivanSergeev = Player(
        "ИВАН", "СЕРГЕЕВ",
        "11-${MonthUtil.May}-1995", role
    )

    private val fedorSmolov = Player(
        "ФЕДОР", "СМОЛОВ",
        "09-${MonthUtil.February}-1990", role
    )

    init {
        //require (role == Player.Position.STRIKER)

        antonZabolotny.apply {
            age = 31
            debutDate = "10-${MonthUtil.July}-2017"
            goalsScored = 2
            numberOfGames = 19
            imageDrawable = R.drawable.anton_zabolotny

        }

        ivanSergeev.apply {
            age = 27
            imageDrawable = R.drawable.ivan_sergeev
            //TODO: Missing stats
        }

        fedorSmolov.apply {
            age = 32
            debutDate = "14-${MonthUtil.November}-2012"
            goalsScored = 16
            numberOfGames = 45
            imageDrawable = R.drawable.fedor_smolov

        }


        strikerList.apply {
            add(antonZabolotny)
            add(ivanSergeev)
            add(fedorSmolov)

        }

    }

}