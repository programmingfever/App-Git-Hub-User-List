package com.dicoding.picodiploma.appgithubuserlist

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MoveDataWithActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_USERS = "extra_user"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_user)

        val IVavatar: ImageView = findViewById(R.id.avatarDet_img)
        val tVdetUsername: TextView = findViewById(R.id.usernameDet_txt)
        val tVdetNamaLengkap: TextView = findViewById(R.id.namaDet_txt)
        val tVdetFollowing: TextView = findViewById(R.id.followingDet_txt)
        val tVdetFollower: TextView = findViewById(R.id.followerDet_txt)
        val tVdetCompany: TextView = findViewById(R.id.CompanyDet_txt)
        val tVdetLocation: TextView = findViewById(R.id.locationDet_txt)
        val tvdetRepository: TextView = findViewById(R.id.repositoryDet_txt)
        val btnHome : Button = findViewById(R.id.home_btn)






        //tVdetUsername.text = users_extra?.get(0).toString()




        if(intent.hasExtra("EXTRA_USERS")){
            val bundleUser : Bundle? = intent.extras
            bundleUser.apply {
                //Serializable Data
                val SelUsers = this?.getParcelable("EXTRA_USERS") as GitHubUser?
                if (SelUsers != null) {
                    Log.d("TAg","Object dari SelUser ${SelUsers}")
                }
                tVdetUsername.text = SelUsers?.username
                tVdetNamaLengkap.text = SelUsers?.name
                tVdetFollowing.text = "Following(s): " + SelUsers?.following
                tVdetFollower.text = "Followers(s): " + SelUsers?.followers
                tVdetCompany.text = SelUsers?.company
                tVdetLocation.text = SelUsers?.location
                tvdetRepository.text = "Repository: " + SelUsers?.repository
                IVavatar.setImageResource(resources.getIdentifier(SelUsers?.avatar,"drawable",packageName))
            }


        }



        btnHome.setOnClickListener{

            val context1 : Context = it.context
            val it3 = Intent(it.context,MainActivity::class.java)
            context1.startActivity(it3)
        }
    }

}