package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class sh4 extends a4 {
    public static final Parcelable.Creator<sh4> CREATOR = new xok(17);
    public final jve E;
    public final boolean F;
    public final boolean G;
    public final int[] H;
    public final int I;
    public final int[] J;

    public sh4(jve jveVar, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.E = jveVar;
        this.F = z;
        this.G = z2;
        this.H = iArr;
        this.I = i;
        this.J = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.E0(parcel, 1, this.E, i);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.F ? 1 : 0);
        xn5.J0(parcel, 3, 4);
        parcel.writeInt(this.G ? 1 : 0);
        int[] iArr = this.H;
        if (iArr != null) {
            int iK02 = xn5.K0(parcel, 4);
            parcel.writeIntArray(iArr);
            xn5.L0(parcel, iK02);
        }
        xn5.J0(parcel, 5, 4);
        parcel.writeInt(this.I);
        int[] iArr2 = this.J;
        if (iArr2 != null) {
            int iK03 = xn5.K0(parcel, 6);
            parcel.writeIntArray(iArr2);
            xn5.L0(parcel, iK03);
        }
        xn5.L0(parcel, iK0);
    }
}
