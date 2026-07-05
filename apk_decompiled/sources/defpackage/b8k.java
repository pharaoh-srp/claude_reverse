package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class b8k extends a4 {
    public static final Parcelable.Creator<b8k> CREATOR = new zwj(18);
    public final int E;
    public final IBinder F;
    public final IBinder G;
    public final PendingIntent H;
    public final String I;

    public b8k(int i, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str) {
        this.E = i;
        this.F = iBinder;
        this.G = iBinder2;
        this.H = pendingIntent;
        this.I = str;
    }

    public static b8k l0(i6k i6kVar, i6k i6kVar2, String str) {
        if (i6kVar == null) {
            i6kVar = null;
        }
        return new b8k(2, i6kVar, i6kVar2, null, str);
    }

    public static b8k x0(e4k e4kVar) {
        return new b8k(4, null, e4kVar, null, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E);
        xn5.B0(parcel, 2, this.F);
        xn5.B0(parcel, 3, this.G);
        xn5.E0(parcel, 4, this.H, i);
        xn5.F0(parcel, 6, this.I);
        xn5.L0(parcel, iK0);
    }
}
