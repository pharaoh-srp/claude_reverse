package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class q8k extends a4 {
    public static final Parcelable.Creator<q8k> CREATOR = new zwj(22);
    public final int E;
    public final i8k F;
    public final i6l G;
    public final q5l H;
    public final PendingIntent I;
    public final q3l J;
    public final String K;

    public q8k(int i, i8k i8kVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        i6l y5lVar;
        q5l f5lVar;
        this.E = i;
        this.F = i8kVar;
        q3l t1lVar = null;
        if (iBinder != null) {
            int i2 = d6l.j;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            y5lVar = iInterfaceQueryLocalInterface instanceof i6l ? (i6l) iInterfaceQueryLocalInterface : new y5l(iBinder, "com.google.android.gms.location.ILocationListener", 2);
        } else {
            y5lVar = null;
        }
        this.G = y5lVar;
        this.I = pendingIntent;
        if (iBinder2 != null) {
            int i3 = i6k.k;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            f5lVar = iInterfaceQueryLocalInterface2 instanceof q5l ? (q5l) iInterfaceQueryLocalInterface2 : new f5l(iBinder2, "com.google.android.gms.location.ILocationCallback", 2);
        } else {
            f5lVar = null;
        }
        this.H = f5lVar;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            t1lVar = iInterfaceQueryLocalInterface3 instanceof q3l ? (q3l) iInterfaceQueryLocalInterface3 : new t1l(iBinder3, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", 2);
        }
        this.J = t1lVar;
        this.K = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E);
        xn5.E0(parcel, 2, this.F, i);
        i6l i6lVar = this.G;
        xn5.B0(parcel, 3, i6lVar == null ? null : i6lVar.asBinder());
        xn5.E0(parcel, 4, this.I, i);
        q5l q5lVar = this.H;
        xn5.B0(parcel, 5, q5lVar == null ? null : q5lVar.asBinder());
        q3l q3lVar = this.J;
        xn5.B0(parcel, 6, q3lVar != null ? q3lVar.asBinder() : null);
        xn5.F0(parcel, 8, this.K);
        xn5.L0(parcel, iK0);
    }
}
