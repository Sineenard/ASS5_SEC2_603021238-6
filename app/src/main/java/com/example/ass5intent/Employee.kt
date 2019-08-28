package com.example.ass5intent

import kotlinx.android.parcel.Parcelize
import android.os.Parcelable


@Parcelize
data class Employee(val name:String, val gender:String, val email:String, val salary:Int)
    : Parcelable {

}