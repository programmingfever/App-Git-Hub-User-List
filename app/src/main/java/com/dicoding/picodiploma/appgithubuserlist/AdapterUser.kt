package com.dicoding.picodiploma.appgithubuserlist

import android.content.ContentValues.TAG
import android.content.Context
import android.content.Intent
import android.content.res.Resources
import android.support.v4.content.ContextCompat

import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


class AdapterUser(private val users: MutableList<GitHubUser>) : RecyclerView.Adapter<AdapterUser.ViewHolder>() {
    private lateinit var cont : Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_user,parent,false)
        return ViewHolder(view)
    }



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.username.text = users[position].username
        holder.namalengkap.text = users[position].nama
        holder.email.text = users[position].email

        when (position) {
            0 -> holder.image.setImageResource(R.drawable.avatar1)
            1 -> holder.image.setImageResource(R.drawable.avatar2)
            2 -> holder.image.setImageResource(R.drawable.avatar3)
            3 -> holder.image.setImageResource(R.drawable.avatar1)
            4 -> holder.image.setImageResource(R.drawable.avatar2)
            5 -> holder.image.setImageResource(R.drawable.avatar3)
            6 -> holder.image.setImageResource(R.drawable.avatar1)
            7 -> holder.image.setImageResource(R.drawable.avatar2)
            8 -> holder.image.setImageResource(R.drawable.avatar3)
            9 -> holder.image.setImageResource(R.drawable.avatar1)
            10 -> holder.image.setImageResource(R.drawable.avatar2)
            11 -> holder.image.setImageResource(R.drawable.avatar3)
            else -> holder.image.setImageResource(R.drawable.avatar1)
         }


        val paramUsername : String = users[holder.adapterPosition].username.toString()
        val paramNama : String = users[holder.adapterPosition].nama.toString()
        val paramEmail : String = users[holder.adapterPosition].email.toString()
        val paramAvatar : Int = position
        val paramFollower : String = "Followers : " + users[holder.adapterPosition].follower.toString()
        val paramFollowing : String = "Followings : " + users[holder.adapterPosition].following.toString()
        val paramCompany : String = users[holder.adapterPosition].company.toString()
        val paramLocation : String = users[holder.adapterPosition].location.toString()
        val paramRepository : String = users[holder.adapterPosition].repository.toString()

        holder.itemView.setOnClickListener() {
            val it2 = Intent(it.context, MoveDataWithActivity::class.java).apply {
                putExtra("EXTRA_USERNAME", paramUsername.toString())
                putExtra("EXTRA_NAMALENGKAP", paramNama.toString())
                putExtra("EXTRA_EMAIL", paramEmail.toString())
                putExtra("EXTRA_COMPANY", paramCompany.toString())
                putExtra("EXTRA_FOLLOWING", paramFollowing.toString())
                putExtra("EXTRA_FOLLOWER", paramFollower.toString())
                putExtra("EXTRA_LOCATION", paramLocation.toString())
                putExtra("EXTRA_AVATAR",paramAvatar).toString()

            //Log.d(TAG, "Klik dari Item View " + paramUsername.toString())
                //Log.d(TAG, "Has Extra ?" + extras)



            }

                if(it2.hasExtra("EXTRA_USERNAME")==true) {
                 //startActivity(holder.itemView.context,it2,it2.extras)
                    Log.d(TAG, "Has Extra ?" + it2.extras)
                    val context = holder.itemView.context
                    context.startActivity(it2)
                }else{
                    Log.d(TAG, "Has Extra ? No, I think Not")
                }
        }

    }



    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
       val username:TextView = itemView.findViewById(R.id.username_txt)
        val namalengkap:TextView = itemView.findViewById(R.id.namalengkap_txt)
        val email:TextView = itemView.findViewById(R.id.email_txt)
        val image:ImageView = itemView.findViewById(R.id.avatar_img)
        /*
        val imageDet:ImageView = itemView.findViewById(R.id.avatarDet_img)
        val usernameDet:TextView = itemView.findViewById(R.id.usernameDet_txt)
        val namalengkapDet:TextView = itemView.findViewById(R.id.namaDet_txt)
        val locationDet:TextView = itemView.findViewById(R.id.locationDet_txt)
        val companyDet:TextView = itemView.findViewById(R.id.CompanyDet_txt)
        val emailDet:TextView = itemView.findViewById(R.id.emailDet_txt)
        val followingDet:TextView = itemView.findViewById(R.id.followingDet_txt)
        val followerDet:TextView = itemView.findViewById(R.id.followerDet_txt)
    */

    }


    override fun getItemCount() = users.size
}