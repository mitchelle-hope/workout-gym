package com.mitchellehope.workout_log

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    lateinit var bottom_navigation:BottomNavigationView
    lateinit var fcvHome:FragmentContainerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        castviews()
        setupBottomNav()
    }
    fun castviews(){
        fcvHome = findViewById(R.id.fcvhome)
        bottom_navigation=findViewById(R.id.bottom_navigation)
    }
    fun setupBottomNav(){
        bottom_navigation.setOnItemSelectedListener { item->
            when(item.itemId){
                R.id.plan->{
                    var transaction=supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.fcvhome,PlanFragment())
                    transaction.commit()
                    true
                }
                R.id.track->{
                    var transaction=supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.fcvhome,TrackFragment())
                    transaction.commit()
                    true
                }
                R.id.profile->{
                    var transaction=supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.fcvhome,ProfileFragment())
                    transaction.commit()
                    true

            }
                else->false
        }
    }
}



    }
