package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w implements Parcelable {
    public final Parcelable E;
    public static final u F = new u();
    public static final Parcelable.Creator<w> CREATOR = new v(0);

    public w(Parcelable parcelable) {
        if (parcelable != null) {
            this.E = parcelable == F ? null : parcelable;
        } else {
            sz6.p("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.E, i);
    }

    public w() {
        this.E = null;
    }

    public w(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.E = parcelable == null ? F : parcelable;
    }
}
