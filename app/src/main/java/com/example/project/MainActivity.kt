package com.example.project

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val bottomBar = findViewById<BottomNavigationView>(R.id.btmbar1)

        bottomBar.setOnItemSelectedListener {

            if (it.itemId==R.id.guard){
                inflateFragment()
            }
            else if (it.itemId==R.id.hme){
                inflatehomefragment()
            }
            else if (it.itemId==R.id.dsb1){
                inflatehomedsbfragment()
            }
            else if  (it.itemId==R.id.profile){
                inflatehomeprofilefragment()
            }
            true

        }


        }

    private fun inflatehomeprofilefragment() {

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frag,ProfileFragment.newInstance())
        transaction.commit()
    }

    private fun inflatehomedsbfragment() {

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frag,DashboardFragment.newInstance())
        transaction.commit()
    }

    private fun inflatehomefragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frag,HomeFragment.newInstance())
        transaction.commit()
    }


    private fun inflateFragment() {

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frag,guardFragment.newInstance())
        transaction.commit()
    }
}


