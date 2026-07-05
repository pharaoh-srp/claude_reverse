package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class jqk extends a4 {
    public static final Parcelable.Creator<jqk> CREATOR = new xok(6);
    public final int E;
    public final int F;

    public jqk(int i, int i2) {
        this.E = i;
        this.F = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.E);
        xn5.J0(parcel, 3, 4);
        parcel.writeInt(this.F);
        xn5.L0(parcel, iK0);
    }
}
