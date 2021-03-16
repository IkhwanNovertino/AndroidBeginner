package com.a1631770.ikhwanov.antariksaapp

import android.os.Parcel
import android.os.Parcelable

data class Planet(
    var name: String? = "",
    var detail: String? = "",
    var photo: Int = 0
) : Parcelable {
  constructor(parcel: Parcel) : this(
      parcel.readString(),
      parcel.readString(),
      parcel.readInt()) {
  }

  override fun writeToParcel(parcel: Parcel, flags: Int) {
    parcel.writeString(name)
    parcel.writeString(detail)
    parcel.writeInt(photo)
  }

  override fun describeContents(): Int {
    return 0
  }

  companion object CREATOR : Parcelable.Creator<Planet> {
    override fun createFromParcel(parcel: Parcel): Planet {
      return Planet(parcel)
    }

    override fun newArray(size: Int): Array<Planet?> {
      return arrayOfNulls(size)
    }
  }
}