package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class opj extends a4 {
    public static final Parcelable.Creator<opj> CREATOR = new zmj(27);
    public final long E;

    public opj(long j) {
        this.E = Long.valueOf(j).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof opj) && this.E == ((opj) obj).E;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.E)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 8);
        parcel.writeLong(this.E);
        xn5.L0(parcel, iK0);
    }
}
