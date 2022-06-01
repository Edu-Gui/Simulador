package BR.example.simulator.Domain

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Team (
    @SerializedName("nome")
    val name: String,

    @SerializedName("forca")
    val Stars: Int,

    @SerializedName("imagem")
    val Image: String,

    var score: Int?


        ) : Parcelable {


}
