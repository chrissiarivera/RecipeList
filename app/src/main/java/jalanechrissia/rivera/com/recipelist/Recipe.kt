package jalanechrissia.rivera.com.recipelist

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by Jalane Chrissia on 07/12/2017.
 */

data class Recipe(
        val img: Int = 0,
        val name: String = "",
        val description: String = "",
        val ingredients: String = "",
        val instruction: String = "") : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readInt(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(img)
        parcel.writeString(name)
        parcel.writeString(description)
        parcel.writeString(ingredients)
        parcel.writeString(instruction)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Recipe> {
        override fun createFromParcel(parcel: Parcel): Recipe {
            return Recipe(parcel)
        }

        override fun newArray(size: Int): Array<Recipe?> {
            return arrayOfNulls(size)
        }
    }
}