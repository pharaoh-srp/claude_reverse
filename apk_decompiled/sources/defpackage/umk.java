package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class umk implements jrk {
    public static volatile umk m0;
    public final Context E;
    public final String F;
    public final String G;
    public final String H;
    public final boolean I;
    public final s4i J;
    public final vqj K;
    public final vik L;
    public final qgk M;
    public final wlk N;
    public final yzk O;
    public final h1l P;
    public final ogk Q;
    public final ql8 R;
    public final vxk S;
    public final jsk T;
    public final xoj U;
    public final lxk V;
    public final String W;
    public ggk X;
    public hyk Y;
    public wuj Z;
    public ufk a0;
    public Boolean c0;
    public long d0;
    public volatile Boolean e0;
    public final Boolean f0;
    public final Boolean g0;
    public volatile boolean h0;
    public int i0;
    public int j0;
    public final long l0;
    public boolean b0 = false;
    public final AtomicInteger k0 = new AtomicInteger(0);

    public umk(odg odgVar) {
        Bundle bundle;
        boolean z = false;
        Context context = (Context) odgVar.c;
        int i = 2;
        s4i s4iVar = new s4i(i);
        this.J = s4iVar;
        iek.a = s4iVar;
        this.E = context;
        this.F = (String) odgVar.d;
        this.G = (String) odgVar.e;
        this.H = (String) odgVar.f;
        this.I = odgVar.b;
        this.e0 = (Boolean) odgVar.g;
        this.W = (String) odgVar.j;
        this.h0 = true;
        y5k y5kVar = (y5k) odgVar.h;
        if (y5kVar != null && (bundle = y5kVar.K) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f0 = (Boolean) obj;
            }
            Object obj2 = y5kVar.K.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.g0 = (Boolean) obj2;
            }
        }
        if (iqk.h == null && context != null) {
            Object obj3 = iqk.g;
            synchronized (obj3) {
                try {
                    if (iqk.h == null) {
                        synchronized (obj3) {
                            bnk bnkVar = iqk.h;
                            Context applicationContext = context.getApplicationContext();
                            applicationContext = applicationContext == null ? context : applicationContext;
                            if (bnkVar == null || bnkVar.a != applicationContext) {
                                if (bnkVar != null) {
                                    snk.d();
                                    krk.c();
                                    epk.B();
                                }
                                fqk fqkVar = new fqk();
                                fqkVar.E = applicationContext;
                                iqk.h = new bnk(applicationContext, knk.C(fqkVar));
                                iqk.i.incrementAndGet();
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                } finally {
                }
            }
        }
        this.R = ql8.G;
        Long l = (Long) odgVar.i;
        this.l0 = l != null ? l.longValue() : System.currentTimeMillis();
        vqj vqjVar = new vqj(this);
        vqjVar.H = new v4i(i);
        this.K = vqjVar;
        vik vikVar = new vik(this);
        vikVar.M0();
        this.L = vikVar;
        qgk qgkVar = new qgk(this);
        qgkVar.M0();
        this.M = qgkVar;
        h1l h1lVar = new h1l(this);
        h1lVar.M0();
        this.P = h1lVar;
        this.Q = new ogk(new fkk(this));
        this.U = new xoj(this);
        vxk vxkVar = new vxk(this);
        vxkVar.P0();
        this.S = vxkVar;
        jsk jskVar = new jsk(this);
        jskVar.P0();
        this.T = jskVar;
        yzk yzkVar = new yzk(this);
        yzkVar.P0();
        this.O = yzkVar;
        lxk lxkVar = new lxk(this);
        lxkVar.M0();
        this.V = lxkVar;
        wlk wlkVar = new wlk(this);
        wlkVar.M0();
        this.N = wlkVar;
        y5k y5kVar2 = (y5k) odgVar.h;
        if (y5kVar2 != null && y5kVar2.F != 0) {
            z = true;
        }
        if (context.getApplicationContext() instanceof Application) {
            b(jskVar);
            umk umkVar = (umk) jskVar.E;
            if (umkVar.E.getApplicationContext() instanceof Application) {
                Application application = (Application) umkVar.E.getApplicationContext();
                if (jskVar.G == null) {
                    jskVar.G = new af7(i, jskVar);
                }
                if (!z) {
                    application.unregisterActivityLifecycleCallbacks(jskVar.G);
                    application.registerActivityLifecycleCallbacks(jskVar.G);
                    jskVar.b0().R.b("Registered activity lifecycle callback");
                }
            }
        } else {
            d(qgkVar);
            qgkVar.M.b("Application context is not an Application");
        }
        wlkVar.T0(new c5a(this, 7, odgVar));
    }

    public static umk a(Context context, y5k y5kVar, Long l) {
        Bundle bundle;
        if (y5kVar != null && (y5kVar.I == null || y5kVar.J == null)) {
            y5kVar = new y5k(y5kVar.E, y5kVar.F, y5kVar.G, y5kVar.H, null, null, y5kVar.K, null);
        }
        dgj.v(context);
        dgj.v(context.getApplicationContext());
        if (m0 == null) {
            synchronized (umk.class) {
                try {
                    if (m0 == null) {
                        m0 = new umk(new odg(context, y5kVar, l));
                    }
                } finally {
                }
            }
        } else if (y5kVar != null && (bundle = y5kVar.K) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            dgj.v(m0);
            m0.e0 = Boolean.valueOf(y5kVar.K.getBoolean("dataCollectionDefaultEnabled"));
        }
        dgj.v(m0);
        return m0;
    }

    public static void b(yak yakVar) {
        if (yakVar == null) {
            sz6.j("Component not created");
        } else {
            if (yakVar.F) {
                return;
            }
            sz6.j("Component not initialized: ".concat(String.valueOf(yakVar.getClass())));
        }
    }

    public static void c(rok rokVar) {
        if (rokVar != null) {
            return;
        }
        sz6.j("Component not created");
    }

    public static void d(pqk pqkVar) {
        if (pqkVar == null) {
            sz6.j("Component not created");
        } else {
            if (pqkVar.F) {
                return;
            }
            sz6.j("Component not initialized: ".concat(String.valueOf(pqkVar.getClass())));
        }
    }

    @Override // defpackage.jrk
    public final wlk O() {
        wlk wlkVar = this.N;
        d(wlkVar);
        return wlkVar;
    }

    @Override // defpackage.jrk
    public final qgk b0() {
        qgk qgkVar = this.M;
        d(qgkVar);
        return qgkVar;
    }

    public final boolean e() {
        return g() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f() {
        /*
            r7 = this;
            boolean r0 = r7.b0
            r1 = 0
            if (r0 == 0) goto Lb3
            wlk r0 = r7.N
            d(r0)
            r0.K0()
            java.lang.Boolean r0 = r7.c0
            ql8 r2 = r7.R
            if (r0 == 0) goto L35
            long r3 = r7.d0
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L35
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lac
            r2.getClass()
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r5 = r7.d0
            long r3 = r3 - r5
            long r3 = java.lang.Math.abs(r3)
            r5 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto Lac
        L35:
            r2.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            r7.d0 = r2
            h1l r0 = r7.P
            c(r0)
            java.lang.String r2 = "android.permission.INTERNET"
            boolean r2 = r0.M1(r2)
            r3 = 1
            if (r2 == 0) goto L76
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r2 = r0.M1(r2)
            if (r2 == 0) goto L76
            android.content.Context r2 = r7.E
            gmf r4 = defpackage.nij.a(r2)
            boolean r4 = r4.G()
            if (r4 != 0) goto L74
            vqj r4 = r7.K
            boolean r4 = r4.P0()
            if (r4 != 0) goto L74
            boolean r4 = defpackage.h1l.r1(r2)
            if (r4 == 0) goto L76
            boolean r2 = defpackage.h1l.C1(r2)
            if (r2 == 0) goto L76
        L74:
            r2 = r3
            goto L77
        L76:
            r2 = r1
        L77:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            r7.c0 = r4
            if (r2 == 0) goto Lac
            ufk r2 = r7.j()
            java.lang.String r2 = r2.S0()
            ufk r4 = r7.j()
            r4.O0()
            java.lang.String r4 = r4.Q
            boolean r0 = r0.v1(r2, r4)
            if (r0 != 0) goto La5
            ufk r0 = r7.j()
            r0.O0()
            java.lang.String r0 = r0.Q
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto La6
        La5:
            r1 = r3
        La6:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r7.c0 = r0
        Lac:
            java.lang.Boolean r7 = r7.c0
            boolean r7 = r7.booleanValue()
            return r7
        Lb3:
            java.lang.String r7 = "AppMeasurement is not initialized"
            defpackage.sz6.j(r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.umk.f():boolean");
    }

    public final int g() {
        wlk wlkVar = this.N;
        d(wlkVar);
        wlkVar.K0();
        Boolean boolV0 = this.K.V0("firebase_analytics_collection_deactivated");
        if (boolV0 != null && boolV0.booleanValue()) {
            return 1;
        }
        Boolean bool = this.g0;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        wlk wlkVar2 = this.N;
        d(wlkVar2);
        wlkVar2.K0();
        if (!this.h0) {
            return 8;
        }
        vik vikVar = this.L;
        c(vikVar);
        vikVar.K0();
        Boolean boolValueOf = vikVar.T0().contains("measurement_enabled") ? Boolean.valueOf(vikVar.T0().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        Boolean boolV02 = this.K.V0("firebase_analytics_collection_enabled");
        if (boolV02 != null) {
            return boolV02.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f0;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.e0 == null || this.e0.booleanValue()) ? 0 : 7;
    }

    public final xoj h() {
        xoj xojVar = this.U;
        if (xojVar != null) {
            return xojVar;
        }
        sz6.j("Component not created");
        return null;
    }

    public final wuj i() {
        d(this.Z);
        return this.Z;
    }

    public final ufk j() {
        b(this.a0);
        return this.a0;
    }

    @Override // defpackage.jrk
    public final s4i k() {
        return this.J;
    }

    public final ggk l() {
        b(this.X);
        return this.X;
    }

    public final ogk m() {
        return this.Q;
    }

    public final hyk n() {
        b(this.Y);
        return this.Y;
    }

    public final void o() {
        c(this.P);
    }

    @Override // defpackage.jrk
    public final Context zza() {
        return this.E;
    }

    @Override // defpackage.jrk
    public final ql8 zzb() {
        return this.R;
    }
}
