package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class vxk extends yak {
    public volatile xxk G;
    public volatile xxk H;
    public xxk I;
    public final ConcurrentHashMap J;
    public Activity K;
    public volatile boolean L;
    public volatile xxk M;
    public xxk N;
    public boolean O;
    public final Object P;

    public vxk(umk umkVar) {
        super(umkVar);
        this.P = new Object();
        this.J = new ConcurrentHashMap();
    }

    @Override // defpackage.yak
    public final boolean Q0() {
        return false;
    }

    public final String R0(Class cls) {
        umk umkVar = (umk) this.E;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] strArrSplit = canonicalName.split("\\.");
        String str = strArrSplit.length > 0 ? strArrSplit[strArrSplit.length - 1] : "";
        return str.length() > umkVar.K.M0(null, false) ? str.substring(0, umkVar.K.M0(null, false)) : str;
    }

    public final xxk S0(boolean z) {
        O0();
        K0();
        xxk xxkVar = this.I;
        return (z && xxkVar == null) ? this.N : xxkVar;
    }

    public final void T0(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!((umk) this.E).K.a1() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.J.put(activity, new xxk(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void U0(Activity activity, xxk xxkVar, boolean z) {
        xxk xxkVar2;
        xxk xxkVar3 = this.G == null ? this.H : this.G;
        if (xxkVar.b == null) {
            xxkVar2 = new xxk(xxkVar.a, activity != null ? R0(activity.getClass()) : null, xxkVar.c, xxkVar.e, xxkVar.f);
        } else {
            xxkVar2 = xxkVar;
        }
        this.H = this.G;
        this.G = xxkVar2;
        ((umk) this.E).R.getClass();
        O().T0(new ywk(this, xxkVar2, xxkVar3, SystemClock.elapsedRealtime(), z));
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V0(defpackage.xxk r19, defpackage.xxk r20, long r21, boolean r23, android.os.Bundle r24) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vxk.V0(xxk, xxk, long, boolean, android.os.Bundle):void");
    }

    public final void W0(xxk xxkVar, boolean z, long j) {
        umk umkVar = (umk) this.E;
        xoj xojVarH = umkVar.h();
        umkVar.R.getClass();
        xojVarH.O0(SystemClock.elapsedRealtime());
        if (!N0().J.j(j, xxkVar != null && xxkVar.d, z) || xxkVar == null) {
            return;
        }
        xxkVar.d = false;
    }

    public final xxk X0(Activity activity) {
        dgj.v(activity);
        xxk xxkVar = (xxk) this.J.get(activity);
        if (xxkVar == null) {
            xxk xxkVar2 = new xxk(null, R0(activity.getClass()), J0().U1());
            this.J.put(activity, xxkVar2);
            xxkVar = xxkVar2;
        }
        return this.M != null ? this.M : xxkVar;
    }
}
