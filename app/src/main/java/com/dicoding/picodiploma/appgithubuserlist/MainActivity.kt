package com.dicoding.picodiploma.appgithubuserlist

import android.content.Context
import android.content.Intent
import android.content.res.Resources
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {


    private lateinit var mUser: RecyclerView
    private lateinit var myData : GitHubUser

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val users = mutableListOf<GitHubUser>()
        /*
        val arrListUsername = resources.getStringArray(R.array.username).toList()
        val arrListName = resources.getStringArray(R.array.name).toList()
        val arrListLocation = resources.getStringArray(R.array.name).toList()
        val arrListRepository = resources.getStringArray(R.array.repository).toList()
        val arrListCompany = resources.getStringArray(R.array.company).toList()
        val arrListFollowing = resources.getStringArray(R.array.following).toList()
        val arrListFollowers = resources.getStringArray(R.array.followers).toList()
        val arrListAvatar = resources.getStringArray(R.array.followers).toList()
        */
        Log.d("Tag","Test List Username:"+resources.getStringArray(R.array.username).get(0))
        if(resources.getStringArray(R.array.username).get(0)!==null) {
            Log.d("Tag","Test List Username:"+resources.getStringArray(R.array.username).get(0))
            users.add(
                GitHubUser(
                    username = "JakeWharton",
                    name = "Jake Wharton",
                    location = "Pittsburgh, PA, USA",
                    repository = "102",
                    company = "Google, Inc.",
                    following = "56995",
                    followers = "12",
                    avatar = "@drawable/user1"
                )
            )

            users.add(
                GitHubUser(
                    username = "amitshekhariitbhu",
                    name = "Amit Shekhar",
                    location = "New Delhi, India",
                    repository = "37",
                    company = "MindOrksOpenSource",
                    following = "12",
                    followers = "5153",
                    avatar = "@drawable/user2"
                )
            )
            users.add(
                GitHubUser(
                    username = "romainguy",
                    name = "Romain Guy",
                    location = "California",
                    repository = "9",
                    company = "Google",
                    following = "0",
                    followers = "7972",
                    avatar = "@drawable/user3"
                )
            )

            users.add(
                GitHubUser(
                    username = "chrisbanes",
                    name = "Chris Banes",
                    location = "Sydney, Australia",
                    repository = "30",
                    company = "Google working on @android",
                    following = "1",
                    followers = "14725",
                    avatar = "@drawable/user4"
                )
            )
            users.add(
                GitHubUser(
                    username = "tipsy",
                    name = "David",
                    location = "Trondheim, Norway",
                    repository = "56",
                    company = "Working Group Two",
                    following = "0",
                    followers = "788",
                    avatar = "@drawable/user5"
                )
            )
            users.add(
                GitHubUser(
                    username = "ravi8x",
                    name = "Ravi Tamada",
                    location = "India",
                    repository = "28",
                    company = "AndroidHive | Droid5",
                    following = "3",
                    followers = "18628",
                    avatar = "@drawable/user6"
                )
            )
            users.add(
                GitHubUser(
                    username = "jasoet",
                    name = "Deny Prasetyo",
                    location = "Kotagede, Yogyakarta, Indonesia",
                    repository = "44",
                    company = "gojek-engineering",
                    following = "39",
                    followers = "277",
                    avatar = "@drawable/user7"
                )
            )
            users.add(
                GitHubUser(
                    username = "budioktaviyan",
                    name = "Budi Oktaviyan",
                    location = "Jakarta, Indonesia",
                    repository = "110",
                    company = "KotlinID",
                    following = "23",
                    followers = "178",
                    avatar = "@drawable/user8"
                )
            )
            users.add(
                GitHubUser(
                    username = "hendisantika",
                    name = "Hendi Santika",
                    location = "Bojongsoang - Bandung Jawa Barat",
                    repository = "1064",
                    company = "JVMDeveloperID @KotlinID @IDDevOps",
                    following = "61",
                    followers = "428",
                    avatar = "@drawable/user9"
                )
            )
            users.add(
                GitHubUser(
                    username = "sidiqpermana",
                    name = "Sidiq Permana",
                    location = "Jakarta Indonesia",
                    repository = "65",
                    company = "Nusantara Beta Studio",
                    following = "10",
                    followers = "465",
                    avatar = "@drawable/user10"
                )
            )
        }
        mUser = findViewById(R.id.recView)
        mUser.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = AdapterUser(users)

        }
        
    }

}