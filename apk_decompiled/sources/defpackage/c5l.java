package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: loaded from: classes3.dex */
public final class c5l extends dmj {
    public c5l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService", 2);
    }

    public final void O(q8k q8kVar) {
        Parcel parcelH = H();
        zyj.b(parcelH, q8kVar);
        L(parcelH, 59);
    }

    public final void P(b8k b8kVar, LocationRequest locationRequest, t4k t4kVar) {
        Parcel parcelH = H();
        zyj.b(parcelH, b8kVar);
        zyj.b(parcelH, locationRequest);
        parcelH.writeStrongBinder(t4kVar);
        L(parcelH, 88);
    }

    public final void Q(b8k b8kVar, t4k t4kVar) {
        Parcel parcelH = H();
        zyj.b(parcelH, b8kVar);
        parcelH.writeStrongBinder(t4kVar);
        L(parcelH, 89);
    }
}
