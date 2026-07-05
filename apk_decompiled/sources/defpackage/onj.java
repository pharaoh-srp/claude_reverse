package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class onj extends a4 {
    public static final Parcelable.Creator<onj> CREATOR = new zmj(4);
    public final int E;
    public final wnj F;

    public onj(int i, wnj wnjVar) {
        this.E = i;
        this.F = wnjVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E);
        xn5.E0(parcel, 2, this.F, i);
        xn5.L0(parcel, iK0);
    }
}
