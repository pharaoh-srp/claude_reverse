package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class yr5 implements Parcelable {
    public static final Parcelable.Creator<yr5> CREATOR = new dpj(22);
    public final int E;

    public yr5(int i) {
        this.E = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yr5) && this.E == ((yr5) obj).E;
    }

    public final int hashCode() {
        return Integer.hashCode(this.E);
    }

    public final String toString() {
        return vb7.r(new StringBuilder("DefaultLazyKey(index="), this.E, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.E);
    }
}
