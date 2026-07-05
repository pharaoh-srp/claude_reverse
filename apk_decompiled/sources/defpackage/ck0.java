package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes3.dex */
public final class ck0 {
    public final o5k a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public ck0(AppMeasurementDynamiteService appMeasurementDynamiteService, o5k o5kVar) {
        this.b = appMeasurementDynamiteService;
        this.a = o5kVar;
    }

    public final void a(long j, Bundle bundle, String str, String str2) {
        try {
            u5k u5kVar = (u5k) this.a;
            Parcel parcelB = u5kVar.b();
            parcelB.writeString(str);
            parcelB.writeString(str2);
            qxj.d(parcelB, bundle);
            parcelB.writeLong(j);
            u5kVar.K(parcelB, 1);
        } catch (RemoteException e) {
            umk umkVar = this.b.i;
            if (umkVar != null) {
                qgk qgkVar = umkVar.M;
                umk.d(qgkVar);
                qgkVar.M.c("Event listener threw exception", e);
            }
        }
    }
}
