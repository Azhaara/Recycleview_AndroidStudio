package com.example.recycleview_azhaara_06

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
@Parcelize
data class Novel(
    val imgNovel: Int,
    val nameNovel: String,
    val descNovel: String,
) :Parcelable

