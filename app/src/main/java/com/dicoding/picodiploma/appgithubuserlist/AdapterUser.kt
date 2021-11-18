package com.dicoding.picodiploma.appgithubuserlist

import android.content.ContentValues.TAG
import android.content.Context
import android.content.Intent
import android.content.res.Resources

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
        val userpos = users[position]
        holder.username.text = userpos.username
        holder.namalengkap.text = userpos.name
        holder.follow.text = userpos.followers+" Followers | "+userpos.followers+" Following"
        val avatar : String = userpos.avatar.toString()
        when(avatar){
            "@drawable/user1"->holder.image.setImageResource(R.drawable.user1)
            "@drawable/user2"->holder.image.setImageResource(R.drawable.user2)
            "@drawable/user3"->holder.image.setImageResource(R.drawable.user3)
            "@drawable/user4"->holder.image.setImageResource(R.drawable.user4)
            "@drawable/user5"->holder.image.setImageResource(R.drawable.user5)
            "@drawable/user6"->holder.image.setImageResource(R.drawable.user6)
            "@drawable/user7"->holder.image.setImageResource(R.drawable.user7)
            "@drawable/user8"->holder.image.setImageResource(R.drawable.user8)
            "@drawable/user9"->holder.image.setImageResource(R.drawable.user9)
            "@drawable/user10"->holder.image.setImageResource(R.drawable.user10)
        }


        holder.itemView.setOnClickListener() {
            val it2 = Intent(it.context, MoveDataWithActivity::class.java).apply {
                putExtra("EXTRA_USERS", userpos)
              }

                if(it2.hasExtra("EXTRA_USERS")==true) {
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
        val follow:TextView = itemView.findViewById(R.id.follow_txt)
        val image:ImageView = itemView.findViewById(R.id.avatar_img)

    }


    override fun getItemCount() = users.size
}