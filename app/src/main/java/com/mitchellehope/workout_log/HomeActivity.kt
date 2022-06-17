package com.mitchellehope.workout_log

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.mitchellehope.workout_log.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
   lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        castviews()
        setupBottomNav()
    }
    fun castviews(){
//       binding.fcvhome = findViewById(R.id.fcvhome)
//      binding.bottomNavigation=findViewById(R.id.bottom_navigation)
    }
    fun setupBottomNav(){
       binding. bottomNavigation.setOnItemSelectedListener { item->
            when(item.itemId){
                R.id.plan->{
                    val transaction=supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.fcvhome,PlanFragment())
                    transaction.commit()
                    true
                }
                R.id.track->{
                    val transaction=supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.fcvhome,TrackFragment())
                    transaction.commit()
                    true
                }
                R.id.profile->{
                    val transaction=supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.fcvhome,ProfileFragment())
                    transaction.commit()
                    true

            }
                else->false
        }
    }
}



    }
