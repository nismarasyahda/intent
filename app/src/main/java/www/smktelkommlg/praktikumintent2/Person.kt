package www.smktelkommlg.praktikumintent2

import android.os.Parcel
import android.os.Parcelable

data class Person(
        val name: String?,
        val email: String?,
        val city: String?
): Parcelable {
        constructor(parcel: Parcel) : this(
                parcel.readString(),
                parcel.readString(),
                parcel.readString()
        ) {
        }

        override fun describeContents(): Int {
                TODO("Not yet implemented")
        }

        override fun writeToParcel(p0: Parcel?, p1: Int) {
                TODO("Not yet implemented")
        }

        companion object CREATOR : Parcelable.Creator<Person> {
                override fun createFromParcel(parcel: Parcel): Person {
                        return Person(parcel)
                }

                override fun newArray(size: Int): Array<Person?> {
                        return arrayOfNulls(size)
                }
        }
}