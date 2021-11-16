package com.dicoding.picodiploma.appgithubuserlist

import android.os.Parcel
import android.os.Parcelable

data class GitHubUser (
    val username : String?,
    val nama : String?,
    val email : String?,
    val avatar : String?,
    val follower : String?,
    val following : String?,
    val company : String?,
    val location : String?,
    val repository : String?

) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(username)
        parcel.writeString(nama)
        parcel.writeString(email)
        parcel.writeString(avatar)
        parcel.writeString(follower)
        parcel.writeString(following)
        parcel.writeString(company)
        parcel.writeString(location)
        parcel.writeString(repository)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<GitHubUser> {
        override fun createFromParcel(parcel: Parcel): GitHubUser {
            return GitHubUser(parcel)
        }

        override fun newArray(size: Int): Array<GitHubUser?> {
            return arrayOfNulls(size)
        }
    }
}