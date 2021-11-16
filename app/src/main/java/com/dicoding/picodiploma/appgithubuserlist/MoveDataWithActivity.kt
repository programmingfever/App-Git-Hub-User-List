package com.dicoding.picodiploma.appgithubuserlist

import android.content.Context
import android.content.Intent
import android.nfc.Tag
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.widget.Button
import com.dicoding.picodiploma.appgithubuserlist.MainActivity.Companion.EXTRA_COMPANY
import com.dicoding.picodiploma.appgithubuserlist.MainActivity.Companion.EXTRA_EMAIL
import com.dicoding.picodiploma.appgithubuserlist.MainActivity.Companion.EXTRA_FOLLOWER
import com.dicoding.picodiploma.appgithubuserlist.MainActivity.Companion.EXTRA_FOLLOWING
import com.dicoding.picodiploma.appgithubuserlist.MainActivity.Companion.EXTRA_LOCATION
import com.dicoding.picodiploma.appgithubuserlist.MainActivity.Companion.EXTRA_NAMALENGKAP
import com.dicoding.picodiploma.appgithubuserlist.MainActivity.Companion.EXTRA_REPOSITORY
import com.dicoding.picodiploma.appgithubuserlist.MainActivity.Companion.EXTRA_USERNAME

class MoveDataWithActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_user)

        val IVavatar: ImageView = findViewById(R.id.avatarDet_img)
        val tVdetUsername: TextView = findViewById(R.id.usernameDet_txt)
        val tVdetNamaLengkap: TextView = findViewById(R.id.namaDet_txt)
        val tVdetEmail: TextView = findViewById(R.id.emailDet_txt)
        val tVdetFollowing: TextView = findViewById(R.id.followingDet_txt)
        val tVdetFollower: TextView = findViewById(R.id.followerDet_txt)
        val tVdetCompany: TextView = findViewById(R.id.CompanyDet_txt)
        val tVdetLocation: TextView = findViewById(R.id.locationDet_txt)
        val btnHome : Button = findViewById(R.id.home_btn)


        val namalengkap = intent.getStringExtra("EXTRA_NAMALENGKAP")
        val username = intent.getStringExtra("EXTRA_USERNAME")
        val email = intent.getStringExtra("EXTRA_EMAIL")
        val repository = intent.getStringExtra("EXTRA_REPOSITORY")
        val company = intent.getStringExtra("EXTRA_COMPANY")
        val location = intent.getStringExtra("EXTRA_LOCATION")
        val following = intent.getStringExtra("EXTRA_FOLLOWING")
        val follower = intent.getStringExtra("EXTRA_FOLLOWER")
        val avatar = intent.getIntExtra("EXTRA_AVATAR",0)

        when (avatar) {
            0 -> IVavatar.setImageResource(R.drawable.avatar1)
            1 -> IVavatar.setImageResource(R.drawable.avatar2)
            2 -> IVavatar.setImageResource(R.drawable.avatar3)
            3 -> IVavatar.setImageResource(R.drawable.avatar1)
            4 -> IVavatar.setImageResource(R.drawable.avatar2)
            5 -> IVavatar.setImageResource(R.drawable.avatar3)
            6 -> IVavatar.setImageResource(R.drawable.avatar1)
            7 -> IVavatar.setImageResource(R.drawable.avatar2)
            8 -> IVavatar.setImageResource(R.drawable.avatar3)
            9 -> IVavatar.setImageResource(R.drawable.avatar1)
            10 -> IVavatar.setImageResource(R.drawable.avatar2)
            11 -> IVavatar.setImageResource(R.drawable.avatar3)
            else -> IVavatar.setImageResource(R.drawable.avatar1)
        }
        tVdetUsername.text = username.toString()
        tVdetNamaLengkap.text = namalengkap.toString()
        tVdetEmail.text = email.toString()
        tVdetFollowing.text = following.toString()
        tVdetFollower.text = follower.toString()
        tVdetLocation.text = location.toString()
        tVdetCompany.text = company.toString()

        btnHome.setOnClickListener{
            if(intent.hasExtra("EXTRA_USERNAME")){
                Log.d("TAG","Extra Dari Move DataWithActivity, USERNAME "+username)
            }
            val context1 : Context = it.context
            val it3 = Intent(it.context,MainActivity::class.java)
            context1.startActivity(it3)
        }
    }

}