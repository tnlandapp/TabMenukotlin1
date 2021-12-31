package com.example.tabmenukotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import com.example.tabmenukotlin.adapters.viewpageradapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.contain_menu.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     // start menu code//
        setSupportActionBar(toolbar)

        val toggle = ActionBarDrawerToggle(this,drawer,toolbar,R.string.op,R.string.co)
        toggle.isDrawerIndicatorEnabled = true
        drawer.addDrawerListener(toggle)
        toggle.syncState()  //this is en for menu option code//


        //this is start for fragment
        val adapter = viewpageradapter(supportFragmentManager,lifecycle)

        viewpager2.adapter=adapter

        TabLayoutMediator(tablayout,viewpager2){tab,position->
            when(position){
                0->{
                    tab.text="first"
                }
                1->{
                    tab.text="secend"
                }
                2->{
                    tab.text="third"
                }
            }
        }.attach()


    }
}