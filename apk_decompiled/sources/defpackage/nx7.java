package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class nx7 implements Parcelable {
    public static final Parcelable.Creator<nx7> CREATOR = new dpj(27);
    public String E;
    public int F;

    public nx7(String str, int i) {
        this.E = str;
        this.F = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.E);
        parcel.writeInt(this.F);
    }
}
