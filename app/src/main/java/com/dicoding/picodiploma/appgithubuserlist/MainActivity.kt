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
    companion object {
        const val EXTRA_AVATAR = "extra_avatar"
        const val EXTRA_USERNAME = "username"
        const val EXTRA_NAMALENGKAP = "extra_namalengkap"
        const val EXTRA_REPOSITORY = "extra_repository"
        const val EXTRA_EMAIL = "extra_email"
        const val EXTRA_COMPANY = "extra_company"
        const val EXTRA_LOCATION = "extra_location"
        const val EXTRA_FOLLOWING = "extra_following"
        const val EXTRA_FOLLOWER = "extra_follower"
        val EXTRA_IMAGE_RESOURCES : Resources? = null
        fun CalltoOpen(mainActivity: MainActivity){
            val intent = Intent(mainActivity,MoveDataWithActivity::class.java).apply{
                val tVdetUsername: TextView = mainActivity.findViewById(R.id.usernameDet_txt)
                val tVdetNamaLengkap: TextView = mainActivity.findViewById(R.id.namaDet_txt)
                val tVdetEmail: TextView = mainActivity.findViewById(R.id.emailDet_txt)
                val tVdetFollowing: TextView = mainActivity.findViewById(R.id.followingDet_txt)
                val tVdetFollower: TextView = mainActivity.findViewById(R.id.followerDet_txt)
                val tVdetCompany: TextView = mainActivity.findViewById(R.id.CompanyDet_txt)
                val tVdetLocation: TextView = mainActivity.findViewById(R.id.locationDet_txt)
                val IvAvatar : ImageView = mainActivity.findViewById(R.id.avatarDet_img)
    

            }
            mainActivity.startActivity(intent)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val users = mutableListOf<GitHubUser>()
        users.add(
            GitHubUser(
                username = "ProgrammingFever",
                nama = "Abdul Rozak",
                email = "rozak.programming@gmail.com",
                avatar = "@drawable/avatar1",
                follower = "Jhon Doe, Jhon Lennon, Lenni",
                following = "Jhon Doe, Jhon Lennon, Lenni, Agus, Rendi, Ibrahim",
                company = "PT. Angin Ribut",
                location = "Jakarta",
                repository = "programmingfever"
            )
        )
        users.add(
            GitHubUser(
                username = "JhonDoe",
                nama = "Jhon Doe",
                email = "jhondoe@gmail.com",
                avatar = "@drawable/avatar2",
                follower = "Jhon Doe, Jhon Lennon, Lenni",
                following = "Jhon Doe, Jhon Lennon, Lenni, Agus, Rendi, Ibrahim",
                company = "PT. Maju Tak Gentar",
                location = "Jakarta",
                repository = "jhondoe"
            )
        )
        users.add(
            GitHubUser(
                username = "JhonLenonn",
                nama = "Jhon Lennon",
                email = "jhon_lenonn@gmail.com",
                avatar = "@drawable/avatar3",
                follower = "Jhon Doe, Jhon Lennon, Lenni",
                following = "Jhon Doe, Jhon Lennon, Lenni, Agus, Rendi, Ibrahim",
                company = "PT. Apa Saja",
                location = "Surabaya",
                repository = "jhonlennon"
            )
        )
        users.add(
            GitHubUser(
                username = "Jhony",
                nama = "Jhony",
                email = "jhony@gmail.com",
                avatar = "@drawable/avatar1",
                follower = "Jhon Doe, Jhon Lennon, Lenni",
                following = "Jhon Doe, Jhon Lennon, Lenni, Agus, Rendi, Ibrahim",
                company = "PT. Keren Dong",
                location = "Semarang",
                repository = "jhony"
            )
        )

        users.add(
            GitHubUser(
                username = "Agus",
                nama = "Agus",
                email = "agoes@gmail.com",
                avatar = "@drawable/avatar2",
                follower = "Jhon Doe, Jhon Lennon, Lenni",
                following = "Jhon Doe, Jhon Lennon, Lenni, Agus, Rendi, Ibrahim",
                company = "PT. Cerminan",
                location = "Bandung",
                repository = "agoess"
            )
        )
        users.add(
            GitHubUser(
                username = "Rendi",
                nama = "Rendi",
                email = "rendi_1@gmail.com",
                avatar = "@drawable/avatar3",
                follower = "Jhon Doe, Jhon Lennon, Lenni",
                following = "Jhon Doe, Jhon Lennon, Lenni, Agus, Rendi, Ibrahim",
                company = "PT. Yang Penting",
                location = "Solo",
                repository = "rendi"
            )
        )
        users.add(
            GitHubUser(
                username = "Ibrahim",
                nama = "Ibrahim",
                email = "aim_98@gmail.com",
                avatar = "@drawable/avatar1",
                follower = "Jhon Doe, Jhon Lennon, Lenni",
                following = "Jhon Doe, Jhon Lennon, Lenni, Agus, Rendi, Ibrahim",
                company = "PT. Sejahtera",
                location = "Jakarta",
                repository = "aim"
            )
        )

        users.add(
            GitHubUser(
                username = "Lenni",
                nama = "Lenni",
                email = "lenni_0@gmail.com",
                avatar = "@drawable/avatar2",
                follower = "Jhon Doe, Jhon Lennon, Lenni",
                following = "Jhon Doe, Jhon Lennon, Lenni, Agus, Rendi, Ibrahim",
                company = "PT. Mahakarya",
                location = "Solo",
                repository = "lenni"
            )
        )
        users.add(
            GitHubUser(
                username = "Rizal",
                nama = "Rizal",
                email = "rizal_ok@gmail.com",
                avatar = "@drawable/avatar3",
                follower = "Jhon Doe, Jhon Lennon, Lenni",
                following = "Jhon Doe, Jhon Lennon, Lenni, Agus, Rendi, Ibrahim",
                company = "PT. Sentosa",
                location = "Jakarta",
                repository = "rizal"
            )
        )
        users.add(
            GitHubUser(
                username = "Rahmat",
                nama = "Rahmat",
                email = "rahmat_s@gmail.com",
                avatar = "@drawable/avatar1",
                follower = "Jhon Doe, Jhon Lennon, Lenni",
                following = "Jhon Doe, Jhon Lennon, Lenni, Agus, Rendi, Ibrahim",
                company = "PT. Indah",
                location = "Jakarta",
                repository = "rahmat"
            )
        )

        mUser = findViewById(R.id.recView)
        mUser.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = AdapterUser(users)

        }
        
    }

}