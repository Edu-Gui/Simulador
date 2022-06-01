package BR.example.simulator.Domain;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class place implements Parcelable{
    @SerializedName("nome")
    private String name;
    @SerializedName("imagem")
    private String image;

    protected place(Parcel in) {
        name = in.readString();
        image = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(image);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<place> CREATOR = new Creator<place>() {
        @Override
        public place createFromParcel(Parcel in) {
            return new place(in);
        }

        @Override
        public place[] newArray(int size) {
            return new place[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}