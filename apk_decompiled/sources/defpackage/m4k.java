package defpackage;

import android.os.RemoteException;
import com.google.android.gms.location.LocationResult;

/* JADX INFO: loaded from: classes3.dex */
public final class m4k extends pea {
    public final /* synthetic */ j5h a;
    public final /* synthetic */ v6k b;

    public m4k(v6k v6kVar, j5h j5hVar) {
        this.a = j5hVar;
        this.b = v6kVar;
    }

    @Override // defpackage.pea
    public final void onLocationResult(LocationResult locationResult) {
        this.a.d(locationResult.l0());
        try {
            this.b.F(xwj.b("GetCurrentLocation", this), false, new j5h());
        } catch (RemoteException unused) {
        }
    }
}
