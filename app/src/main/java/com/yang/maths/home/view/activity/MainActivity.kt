package com.yang.maths.home.view.activity

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.GravityCompat
import com.yang.maths.R
import com.yang.maths.base.BaseActivity
import com.yang.maths.home.view.fragment.UserCenterFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar.setNavigationOnClickListener {
            if (dl_main.isDrawerOpen(GravityCompat.START)) {
                dl_main.closeDrawer(GravityCompat.START)
            }else{
                dl_main.openDrawer(GravityCompat.START,true)
            }
        }
        supportFragmentManager.beginTransaction().add(R.id.fl_user_content_root,UserCenterFragment(),"User_Fragment").commitAllowingStateLoss()
        //填充中间数据
        item_addition.findViewById<ImageView>(R.id.iv_label).setImageDrawable(resources.getDrawable(R.drawable.ic_addition_8a8a8a_24,null))
        item_addition.findViewById<TextView>(R.id.tv_name).text = resources.getText(R.string.addition)

        item_subtraction.findViewById<ImageView>(R.id.iv_label).setImageDrawable(resources.getDrawable(R.drawable.ic_subtraction_8a8a8a_24,null))
        item_subtraction.findViewById<TextView>(R.id.tv_name).text = resources.getText(R.string.subtraction)

        item_multiplication.findViewById<ImageView>(R.id.iv_label).setImageDrawable(resources.getDrawable(R.drawable.ic_multiplication_8a8a8a_24,null))
        item_multiplication.findViewById<TextView>(R.id.tv_name).text = resources.getText(R.string.multiplication)

        item_division.findViewById<ImageView>(R.id.iv_label).setImageDrawable(resources.getDrawable(R.drawable.ic_division_8a8a8a_24,null))
        item_division.findViewById<TextView>(R.id.tv_name).text = resources.getText(R.string.division)
    }
}
