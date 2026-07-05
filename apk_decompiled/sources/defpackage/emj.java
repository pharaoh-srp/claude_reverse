package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public final class emj extends a4 implements kre {
    public static final Parcelable.Creator<emj> CREATOR = new s38(27);
    public final int E;
    public final int F;
    public final Intent G;

    public emj(int i, int i2, Intent intent) {
        this.E = i;
        this.F = i2;
        this.G = intent;
    }

    @Override // defpackage.kre
    public final Status e() {
        return this.F == 0 ? Status.I : Status.M;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.F);
        xn5.E0(parcel, 3, this.G, i);
        xn5.L0(parcel, iK0);
    }
}
