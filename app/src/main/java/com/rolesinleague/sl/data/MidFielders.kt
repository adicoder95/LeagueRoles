package com.rolesinleague.sl.data

import com.rolesinleague.sl.R
import com.rolesinleague.sl.model.Player
import com.rolesinleague.sl.util.MonthUtil

object MidFielders {

    val midfielderList = ArrayList<Player>()

    private val role = Player.Position.MIDFIELDER

    private val alexanderErokhin = Player(
        "АЛЕКСАНДР", "ЕРОХИН",
        "13-${MonthUtil.October}-1989", role
    )

    private val alexeyIonov = Player(
        "АЛЕКСЕЙ", "ИОНОВ",
        "18-${MonthUtil.February}-1989", role
    )

    private val andreMostovoy = Player(
        "АНДРЕЙ", "МОСТОВОЙ",
        "05-${MonthUtil.November}-1997", role
    )

    private val antonZinkovsky = Player(
        "АНТОН", "ЗИНЬКОВСКИЙ",
        "14-${MonthUtil.April}-1990", role
    )

    private val arsenZakharyan = Player(
        "АРСЕН", "ЗАХАРЯН",
        "26-${MonthUtil.May}-2003", role
    )

    private val dalerKuyaev = Player(
        "ДАЛЕР", "КУЗЯЕВ",
        "15-${MonthUtil.January}-1993", role
    )

    private val daniilFomin = Player(
        "ДАНИИЛ", "ФОМИН",
        "03-${MonthUtil.February}-1997", role
    )

    private val danilGlebov = Player(
        "ДАНИЛ", "ГЛЕБОВ",
        "03-${MonthUtil.November}-1999", role
    )

    private val dmitryBarinov = Player(
        "ДМИТРИЙ", "БАРИНОВ",
        "11-${MonthUtil.November}-1996", role
    )

    private val zelimkhanBakaev = Player(
        "ЗЕЛИМХАН", "БАКАЕВ",
        "01-${MonthUtil.July}-1996", role
    )

    private val rifatZhemaletdinov = Player(
        "РИФАТ", "ЖЕМАЛЕТДИНОВ",
        "20-${MonthUtil.September}-1996", role
    )

    init {
        //require (role == Player.Position.MIDFIELDER)

        alexanderErokhin.apply {
            age = 32
            debutDate = "31-${MonthUtil.August}-2016"
            goalsScored = 4
            numberOfGames = 32
            imageDrawable = R.drawable.alexander_erokhin

        }

        alexeyIonov.apply {
            age = 33
            debutDate = "29-${MonthUtil.March}-2011"
            goalsScored = 4
            numberOfGames = 38
            imageDrawable = R.drawable.alexey_ionov

        }

        andreMostovoy.apply {
            age = 24
            debutDate = "10-${MonthUtil.August}-2020"
            goalsScored = 1
            numberOfGames = 10
            imageDrawable = R.drawable.andrey_mostovoy

        }

        antonZinkovsky.apply {
            age = 26
            debutDate = "19-${MonthUtil.January}-2016"
            goalsScored = 0
            numberOfGames = 3
            imageDrawable = R.drawable.anton_zinkovsky

        }

        arsenZakharyan.apply {
            age = 19
            debutDate = "09-${MonthUtil.January}-2021"
            goalsScored = 0
            numberOfGames = 4
            imageDrawable = R.drawable.aresen_zakharyan

        }

        dalerKuyaev.apply {
            age = 29
            debutDate = "10-${MonthUtil.July}-2017"
            goalsScored = 2
            numberOfGames = 42
            imageDrawable = R.drawable.daler_kuzyaev

        }

        daniilFomin.apply {
            age = 25
            debutDate = "10-${MonthUtil.November}-2020"
            goalsScored = 0
            numberOfGames = 8
            imageDrawable = R.drawable.daniil_fomin

        }

        danilGlebov.apply {
            age = 22
            debutDate = "11-${MonthUtil.November}-2021"
            goalsScored = 0
            numberOfGames = 2
            imageDrawable = R.drawable.danil_glebov

        }

        dmitryBarinov.apply {
            age = 25
            debutDate = "06-${MonthUtil.August}-2019"
            goalsScored = 0
            numberOfGames = 13
            imageDrawable = R.drawable.dmitry_barinov

        }

        zelimkhanBakaev.apply {
            age = 26
            debutDate = "13-${MonthUtil.October}-2019"
            goalsScored = 1
            numberOfGames = 12
            imageDrawable = R.drawable.zelimkhan_bakaev

        }

        rifatZhemaletdinov.apply {
            age = 25
            debutDate = "24-${MonthUtil.March}-2019"
            goalsScored = 1
            numberOfGames = 9
            imageDrawable = R.drawable.rifat_zhemaletdinov

        }


        midfielderList.apply {
            add(alexanderErokhin)
            add(alexeyIonov)
            add(andreMostovoy)
            add(antonZinkovsky)
            add(arsenZakharyan)
            add(dalerKuyaev)
            add(daniilFomin)
            add(danilGlebov)
            add(dmitryBarinov)
            add(zelimkhanBakaev)
            add(rifatZhemaletdinov)

        }

    }
}