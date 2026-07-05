package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.qti;
import defpackage.rti;
import defpackage.s38;

/* JADX INFO: loaded from: classes2.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new s38(9);
    public final rti E;

    public ParcelImpl(Parcel parcel) {
        this.E = new qti(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new qti(parcel).i(this.E);
    }
}
