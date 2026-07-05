package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class hyk extends yak {
    public final fzk G;
    public pfk H;
    public volatile Boolean I;
    public final jyk J;
    public final g0l K;
    public final ArrayList L;
    public final jyk M;

    public hyk(umk umkVar) {
        super(umkVar);
        this.L = new ArrayList();
        this.K = new g0l(umkVar.R);
        this.G = new fzk(this);
        this.J = new jyk(this, umkVar, 0);
        this.M = new jyk(this, umkVar, 1);
    }

    @Override // defpackage.yak
    public final boolean Q0() {
        return false;
    }

    public final void R0(Runnable runnable) {
        K0();
        if (Y0()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.L;
        if (arrayList.size() >= 1000) {
            b0().J.b("Discarding data. Max runnable queue size reached");
            return;
        }
        arrayList.add(runnable);
        this.M.b(60000L);
        W0();
    }

    public final void S0(AtomicReference atomicReference) {
        K0();
        O0();
        R0(new eok(this, atomicReference, d1(false), 2));
    }

    public final void T0(kqj kqjVar) {
        boolean zS0;
        K0();
        O0();
        ggk ggkVarL = ((umk) this.E).l();
        ggkVarL.J0();
        byte[] bArrA1 = h1l.A1(kqjVar);
        if (bArrA1.length > 131072) {
            ggkVarL.b0().K.b("Conditional user property too long for local database. Sending directly to service");
            zS0 = false;
        } else {
            zS0 = ggkVarL.S0(bArrA1, 2);
        }
        boolean z = zS0;
        R0(new ujk(this, d1(true), z, new kqj(kqjVar), kqjVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0244 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x02a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x02a1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U0(defpackage.pfk r29, defpackage.a4 r30, defpackage.u1l r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hyk.U0(pfk, a4, u1l):void");
    }

    public final void V0(boolean z) {
        K0();
        O0();
        x1l.a();
        umk umkVar = (umk) this.E;
        if (!umkVar.K.X0(null, zvj.a1) && z) {
            umkVar.l().T0();
        }
        if (Z0()) {
            R0(new ryk(this, d1(false), 1));
        }
    }

    public final void W0() {
        K0();
        O0();
        if (Y0()) {
            return;
        }
        if (a1()) {
            fzk fzkVar = this.G;
            fzkVar.G.K0();
            Context context = ((umk) fzkVar.G.E).E;
            synchronized (fzkVar) {
                try {
                    if (fzkVar.E) {
                        fzkVar.G.b0().R.b("Connection attempt already in progress");
                        return;
                    }
                    if (fzkVar.F != null && (fzkVar.F.d() || fzkVar.F.a())) {
                        fzkVar.G.b0().R.b("Already awaiting connection attempt");
                        return;
                    }
                    fzkVar.F = new vgk(context, Looper.getMainLooper(), fzkVar, fzkVar);
                    fzkVar.G.b0().R.b("Connecting to remote service");
                    fzkVar.E = true;
                    dgj.v(fzkVar.F);
                    vgk vgkVar = fzkVar.F;
                    int iC = vgkVar.I.c(vgkVar.G, 12451000);
                    if (iC != 0) {
                        vgkVar.D(1, null);
                        vgkVar.A(new ive(vgkVar), iC, null);
                    } else {
                        vgkVar.f(new ive(vgkVar));
                    }
                    return;
                } finally {
                }
            }
        }
        if (((umk) this.E).K.P0()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = ((umk) this.E).E.getPackageManager().queryIntentServices(new Intent().setClassName(((umk) this.E).E, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            b0().J.b("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(((umk) this.E).E, "com.google.android.gms.measurement.AppMeasurementService"));
        fzk fzkVar2 = this.G;
        fzkVar2.G.K0();
        Context context2 = ((umk) fzkVar2.G.E).E;
        n78 n78VarK = n78.K();
        synchronized (fzkVar2) {
            try {
                boolean z = fzkVar2.E;
                hyk hykVar = fzkVar2.G;
                if (z) {
                    hykVar.b0().R.b("Connection attempt already in progress");
                    return;
                }
                hykVar.b0().R.b("Using local app measurement service");
                fzkVar2.E = true;
                n78VarK.f(context2, intent, fzkVar2.G.G, 129);
            } finally {
            }
        }
    }

    public final void X0() {
        K0();
        O0();
        fzk fzkVar = this.G;
        if (fzkVar.F != null && (fzkVar.F.a() || fzkVar.F.d())) {
            fzkVar.F.o();
        }
        fzkVar.F = null;
        try {
            n78.K().W(((umk) this.E).E, this.G);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.H = null;
    }

    public final boolean Y0() {
        K0();
        O0();
        return this.H != null;
    }

    public final boolean Z0() {
        K0();
        O0();
        return !a1() || J0().O1() >= ((Integer) zvj.r0.a(null)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a1() {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hyk.a1():boolean");
    }

    public final void b1() {
        K0();
        ygk ygkVar = b0().R;
        ArrayList arrayList = this.L;
        ygkVar.c("Processing queued up service tasks", Integer.valueOf(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e) {
                b0().J.c("Task exception while flushing queue", e);
            }
        }
        arrayList.clear();
        this.M.a();
    }

    public final void c1() {
        K0();
        g0l g0lVar = this.K;
        g0lVar.a.getClass();
        g0lVar.b = SystemClock.elapsedRealtime();
        this.J.b(((Long) zvj.L.a(null)).longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.u1l d1(boolean r45) {
        /*
            Method dump skipped, instruction units count: 982
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hyk.d1(boolean):u1l");
    }
}
