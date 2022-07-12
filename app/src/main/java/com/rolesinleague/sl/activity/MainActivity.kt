package com.rolesinleague.sl.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.PopupWindow
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.daasuu.bl.BubbleLayout
import com.daasuu.bl.BubblePopupHelper
import com.rolesinleague.sl.R
import com.rolesinleague.sl.adapter.GoalKeeperFragmentStateAdapter
import com.thekhaeng.pushdownanim.PushDownAnim


class MainActivity: AppCompatActivity() {

    private lateinit var goalKeeperRoot: RelativeLayout
    private lateinit var defenderRoot: RelativeLayout
    private lateinit var midfieldRoot: RelativeLayout
    private lateinit var strikerRoot: RelativeLayout

    private lateinit var goalKeeperBubbleLayout: BubbleLayout
    private lateinit var defenderBubbleLayout: BubbleLayout
    private lateinit var midfieldBubbleLayout: BubbleLayout
    private lateinit var strikerBubbleLayout: BubbleLayout

    private lateinit var goalKeeperViewPager2: ViewPager2
    private lateinit var defenderViewPager2: ViewPager2
    private lateinit var midfieldViewPager2: ViewPager2
    private lateinit var strikerViewPager2: ViewPager2

    private lateinit var goalKeeperPopupWindow: PopupWindow
    private lateinit var defenderPopupWindow: PopupWindow
    private lateinit var midfieldPopupWindow: PopupWindow
    private lateinit var strikerPopupWindow: PopupWindow

    private lateinit var goalKeeperEmptyView: View
    private lateinit var defenderEmptyView: View
    private lateinit var midfieldEmptyView: View
    private lateinit var strikerEmptyView: View

    private var goalKeeperBubbleWidth = 0
    private var defenderBubbleWidth = 0
    private var midfieldBubbleWidth = 0
    private var strikerBubbleWidth = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupAllViews()
        setupAllPopUpWindows()
        setupAllClickListeners()
        PushDownAnim.setPushDownAnimTo(goalKeeperRoot, defenderRoot, midfieldRoot, strikerRoot)
    }

    private fun setupAllViews() {
        initRoots()
        initBubbleLayouts()
        initViewPagers()
        initEmptyViews()

    }

    private fun setupAllClickListeners() {
        setupGoalKeeperRootClickListener()
    }

    private fun setupAllPopUpWindows() {
        goalKeeperPopupWindow = BubblePopupHelper.create(this, goalKeeperBubbleLayout)
        defenderPopupWindow = BubblePopupHelper.create(this, defenderBubbleLayout)
        midfieldPopupWindow = BubblePopupHelper.create(this, midfieldBubbleLayout)
        strikerPopupWindow = BubblePopupHelper.create(this, strikerBubbleLayout)

        goalKeeperPopupWindow.apply {
            isFocusable = false
            isOutsideTouchable = false
        }

        defenderPopupWindow.apply {
            isFocusable = false
            isOutsideTouchable = false
        }

        midfieldPopupWindow.apply {
            isFocusable = false
            isOutsideTouchable = false
        }

        strikerPopupWindow.apply {
            isFocusable = false
            isOutsideTouchable = false
        }


    }

    private fun initRoots() {
        goalKeeperRoot = findViewById(R.id.goalkeeper_root)
        defenderRoot = findViewById(R.id.defender_root)
        midfieldRoot = findViewById(R.id.midfielder_root)
        strikerRoot = findViewById(R.id.striker_root)
    }

    @SuppressLint("InflateParams")
    private fun initBubbleLayouts() {
        goalKeeperBubbleLayout = layoutInflater.inflate(R.layout.bubble_layout, null) as BubbleLayout
        defenderBubbleLayout = layoutInflater.inflate(R.layout.bubble_layout, null) as BubbleLayout
        midfieldBubbleLayout = layoutInflater.inflate(R.layout.bubble_layout, null) as BubbleLayout
        strikerBubbleLayout = layoutInflater.inflate(R.layout.bubble_layout, null) as BubbleLayout

        goalKeeperBubbleLayout.apply {
            measure(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED)
            goalKeeperBubbleWidth = measuredWidth
        }

        defenderBubbleLayout.apply {
            measure(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED)
            defenderBubbleWidth = measuredWidth
        }

        midfieldBubbleLayout.apply {
            measure(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED)
            midfieldBubbleWidth  = measuredWidth
        }

        strikerBubbleLayout.apply {
            measure(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED)
            strikerBubbleWidth = measuredWidth
        }

    }


    private fun initViewPagers() {
        goalKeeperViewPager2 = goalKeeperBubbleLayout.findViewById(R.id.bubble_layout_viewpager2)
        //defenderViewPager2 = defenderBubbleLayout.findViewById(R.id.bubble_layout_viewpager2)
        //midfieldViewPager2 = midfieldBubbleLayout.findViewById(R.id.bubble_layout_viewpager2)
        //strikerViewPager2 = strikerBubbleLayout.findViewById(R.id.bubble_layout_viewpager2)

        goalKeeperViewPager2.apply {
            orientation = ViewPager2.ORIENTATION_HORIZONTAL
            adapter = GoalKeeperFragmentStateAdapter(this@MainActivity)

        }

    }

    private fun initEmptyViews() {
        goalKeeperEmptyView = findViewById(R.id.goalkeeper_empty_view)
        defenderEmptyView = findViewById(R.id.defender_empty_view)
        midfieldEmptyView = findViewById(R.id.midfielder_empty_view)
        strikerEmptyView = findViewById(R.id.striker_empty_view)
    }

    private fun setupGoalKeeperRootClickListener() {
        goalKeeperRoot.setOnClickListener {
            val location = IntArray(2)
            goalKeeperEmptyView.getLocationInWindow(location)
            goalKeeperPopupWindow.showAtLocation(
                goalKeeperEmptyView,
                Gravity.NO_GRAVITY,
                location[0],
                goalKeeperEmptyView.height - location[1]
            )

        }
    }


}