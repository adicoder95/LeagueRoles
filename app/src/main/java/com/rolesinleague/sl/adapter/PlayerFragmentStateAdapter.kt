package com.rolesinleague.sl.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.rolesinleague.sl.model.Player

class PlayerFragmentStateAdapter(private val fragmentActivity: FragmentActivity, private val listOfPlayers: ArrayList<Player>)
    : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount() = listOfPlayers.size

    override fun createFragment(position: Int): Fragment {
        TODO("Not yet implemented")
    }
}