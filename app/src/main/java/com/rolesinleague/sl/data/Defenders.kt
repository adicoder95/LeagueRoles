package com.rolesinleague.sl.data

import com.rolesinleague.sl.R
import com.rolesinleague.sl.model.Player
import com.rolesinleague.sl.util.MonthUtil

object Defenders {

    val defenderList = ArrayList<Player>()

    private val role = Player.Position.DEFENDER

    private val alexeySutormin = Player(
        "АЛЕКСЕЙ", "СУТОРМИН",
        "10-${MonthUtil.January}-1994", role
    )

    private val georgyLikia = Player(
        "ГЕОРГИЙ", "ДЖИКИЯ",
        "21-${MonthUtil.November}-1993", role
    )

    private val danilKrugovoi = Player(
        "ДАНИЛ", "КРУГОВОЙ",
        "28-${MonthUtil.May}-1998", role
    )

    private val dmitriChristyakov = Player(
        "ДМИТРИЙ", "ЧИСТЯКОВ",
        "13-${MonthUtil.January}-1994", role
    )

    private val igorDiveev = Player(
        "ИГОРЬ", "ДИВЕЕВ",
        "27-${MonthUtil.September}-1999", role
    )

    private val ilyaSamoshnikov = Player(
        "ИЛЬЯ", "САМОШНИКОВ",
        "14-${MonthUtil.November}-1997", role
    )

    private val maximOsipenko = Player(
        "МАКСИМ", "ОСИПЕНКО",
        "16-${MonthUtil.May}-1997", role
    )

    private val sergeyTerekov = Player(
        "СЕРГЕЙ", "ТЕРЕХОВ",
        "27-${MonthUtil.June}-1990", role
    )

    init {
        //require (role == Player.Position.DEFENDER)

        alexeySutormin.apply {
            age = 28
            debutDate = "10-${MonthUtil.August}-2021"
            goalsScored = 1
            numberOfGames = 3
            imageDrawable = R.drawable.alexey_sutormin
        }

        georgyLikia.apply {
            age = 28
            debutDate = "06-${MonthUtil.May}-2017"
            goalsScored = 2
            numberOfGames = 41
            imageDrawable = R.drawable.georgy_likia
        }

        danilKrugovoi.apply {
            age = 24
            debutDate = "22-${MonthUtil.March}-2019"
            goalsScored = 1
            numberOfGames = 6
            imageDrawable = R.drawable.danil_krugovoi
        }

        dmitriChristyakov.apply {
            age = 28
            debutDate = "10-${MonthUtil.August}-2021"
            goalsScored = 0
            numberOfGames = 4
            imageDrawable = R.drawable.dmitry_christyakov
        }

        igorDiveev.apply {
            age = 22
            debutDate = "12-${MonthUtil.November}-2020"
            goalsScored = 1
            numberOfGames = 14
            imageDrawable = R.drawable.igor_diveev
        }

        ilyaSamoshnikov.apply {
            age = 24
            debutDate = "09-${MonthUtil.January}-2021"
            goalsScored = 0
            numberOfGames = 3
            imageDrawable = R.drawable.ilya_samoshnikov
        }

        maximOsipenko.apply {
            age = 28
            debutDate = "09-${MonthUtil.July}-2021"
            goalsScored = 0
            numberOfGames = 3
            imageDrawable = R.drawable.maxim_osipenko
        }

        sergeyTerekov.apply {
            age = 28
            debutDate = "09-${MonthUtil.July}-2021"
            goalsScored = 0
            numberOfGames = 2
            imageDrawable = R.drawable.sergey_terekhov
        }


        defenderList.apply {
            add(alexeySutormin)
            add(georgyLikia)
            add(danilKrugovoi)
            add(dmitriChristyakov)
            add(igorDiveev)
            add(ilyaSamoshnikov)
            add(maximOsipenko)
            add(sergeyTerekov)

        }
    }

}