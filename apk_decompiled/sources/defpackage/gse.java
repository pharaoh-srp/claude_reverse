package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gse implements Parcelable {
    public static final Parcelable.Creator<gse> CREATOR = new gqj(24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        bpj bpjVar = (bpj) this;
        parcel.writeParcelable(bpjVar.E, 0);
        parcel.writeInt(bpjVar.F ? 1 : 0);
    }
}
