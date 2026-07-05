package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ynj extends a4 {
    public static final Parcelable.Creator<ynj> CREATOR = new zmj(7);
    public final int E;
    public final IBinder F;
    public final hh4 G;
    public final boolean H;
    public final boolean I;

    public ynj(int i, IBinder iBinder, hh4 hh4Var, boolean z, boolean z2) {
        this.E = i;
        this.F = iBinder;
        this.G = hh4Var;
        this.H = z;
        this.I = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ynj)) {
            return false;
        }
        ynj ynjVar = (ynj) obj;
        return this.G.equals(ynjVar.G) && gb9.v(l0(), ynjVar.l0());
    }

    public final ft8 l0() {
        IBinder iBinder = this.F;
        if (iBinder == null) {
            return null;
        }
        int i = m7.j;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        return iInterfaceQueryLocalInterface instanceof ft8 ? (ft8) iInterfaceQueryLocalInterface : new x4l(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 6);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E);
        xn5.B0(parcel, 2, this.F);
        xn5.E0(parcel, 3, this.G, i);
        xn5.J0(parcel, 4, 4);
        parcel.writeInt(this.H ? 1 : 0);
        xn5.J0(parcel, 5, 4);
        parcel.writeInt(this.I ? 1 : 0);
        xn5.L0(parcel, iK0);
    }
}
