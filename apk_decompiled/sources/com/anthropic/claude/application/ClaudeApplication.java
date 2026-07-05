package com.anthropic.claude.application;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.webkit.ProcessGlobalConfig;
import com.agog.mathdisplay.MathDisplayLogger;
import com.anthropic.claude.core.telemetry.SilentException;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.a2;
import defpackage.al3;
import defpackage.b6g;
import defpackage.bf0;
import defpackage.bj0;
import defpackage.c78;
import defpackage.cg4;
import defpackage.ck5;
import defpackage.cl3;
import defpackage.dx;
import defpackage.e45;
import defpackage.el3;
import defpackage.er9;
import defpackage.eve;
import defpackage.fch;
import defpackage.fj;
import defpackage.fk0;
import defpackage.fn0;
import defpackage.fr9;
import defpackage.g6g;
import defpackage.gb9;
import defpackage.ggg;
import defpackage.gsk;
import defpackage.h86;
import defpackage.hmf;
import defpackage.hr9;
import defpackage.hre;
import defpackage.iei;
import defpackage.im6;
import defpackage.j6k;
import defpackage.jce;
import defpackage.jre;
import defpackage.kce;
import defpackage.khi;
import defpackage.knk;
import defpackage.kw9;
import defpackage.lhi;
import defpackage.lmf;
import defpackage.m78;
import defpackage.m7f;
import defpackage.n0;
import defpackage.n30;
import defpackage.nai;
import defpackage.oqb;
import defpackage.p4a;
import defpackage.p7;
import defpackage.pd4;
import defpackage.pl7;
import defpackage.pmf;
import defpackage.ps8;
import defpackage.pze;
import defpackage.sfa;
import defpackage.slg;
import defpackage.smh;
import defpackage.sz6;
import defpackage.t7j;
import defpackage.tp4;
import defpackage.v40;
import defpackage.vl3;
import defpackage.w1a;
import defpackage.w44;
import defpackage.wd6;
import defpackage.x44;
import defpackage.xah;
import defpackage.yb5;
import defpackage.yd5;
import defpackage.yfa;
import defpackage.zbk;
import defpackage.zfa;
import defpackage.zp3;
import io.sentry.android.core.j1;
import io.sentry.android.core.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.koin.core.error.KoinApplicationAlreadyStartedException;

/* JADX INFO: loaded from: classes.dex */
public class ClaudeApplication extends Application implements cg4 {
    public static final /* synthetic */ int L = 0;
    public fr9 E;
    public b6g F;
    public vl3 G;
    public bj0 H;
    public final khi I = new khi();
    public final lhi J = new lhi();
    public final kw9 K = yb5.w(w1a.G, new p7(13, this));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application
    public final void onCreate() throws Throwable {
        Object hreVar;
        fr9 fr9Var;
        er9 er9VarE;
        Object hreVar2;
        super.onCreate();
        zfa.a.getClass();
        int i = 2;
        if (!yfa.b() && (getApplicationInfo().flags & 2) != 0) {
            synchronized (yfa.d) {
                try {
                    yfa yfaVar = yfa.a;
                    if (yfa.b()) {
                        RuntimeException runtimeException = yfa.c;
                        runtimeException.getClass();
                        System.out.println((Object) "Installing LogcatLogger even though it was previously installed here: ".concat(gsk.c(runtimeException)));
                    }
                    yfa.c = new RuntimeException("LogcatLogger previously installed here");
                } catch (Throwable th) {
                    throw th;
                }
            }
            yfa.b.add(new n30());
        }
        oqb oqbVar = fk0.K;
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        boolean zO = wd6.p0(applicationContext).o();
        if (v40.a == null) {
            synchronized (v40.b) {
                if (v40.a == null) {
                    pl7 pl7VarC = pl7.c();
                    pl7VarC.a();
                    v40.a = FirebaseAnalytics.getInstance(pl7VarC.a);
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics = v40.a;
        firebaseAnalytics.getClass();
        int i2 = 1;
        boolean z = !zO;
        try {
            j6k j6kVar = firebaseAnalytics.a;
            Boolean boolValueOf = Boolean.valueOf(z);
            j6kVar.getClass();
            j6kVar.c(new zbk(j6kVar, boolValueOf));
            hreVar = iei.a;
        } catch (Throwable th2) {
            hreVar = new hre(th2);
        }
        Throwable thA = jre.a(hreVar);
        if (thA != null) {
            Log.e("ThirdPartyAnalyticsGate", "Firebase collection sync failed", thA);
        }
        lmf lmfVar = new lmf(z);
        khi khiVar = this.I;
        List listW = x44.W(lmfVar.b);
        khiVar.getClass();
        khiVar.a = listW;
        lhi lhiVar = this.J;
        List listW2 = x44.W(lmfVar.c);
        lhiVar.getClass();
        lhiVar.a = listW2;
        Context applicationContext2 = getApplicationContext();
        applicationContext2.getClass();
        khi khiVar2 = this.I;
        lhi lhiVar2 = this.J;
        khiVar2.getClass();
        lhiVar2.getClass();
        pze pzeVar = new pze(khiVar2, lhiVar2, lmfVar);
        int i3 = 3;
        j1.b(applicationContext2, new t(i3), pzeVar);
        Context applicationContext3 = getApplicationContext();
        applicationContext3.getClass();
        if (x44.d != null) {
            sz6.j("Context already initialized");
            return;
        }
        x44.d = applicationContext3;
        int i4 = 12;
        MathDisplayLogger.INSTANCE.set(new sz6(12));
        a2 a2Var = new a2(17, this);
        synchronized (zp3.I) {
            fr9Var = new fr9();
            if (zp3.J != null) {
                throw new KoinApplicationAlreadyStartedException();
            }
            zp3.J = fr9Var.a;
            a2Var.invoke(fr9Var);
            fr9Var.a.a();
        }
        this.E = fr9Var;
        List list = xah.a;
        if (this instanceof hr9) {
            er9VarE = ((hr9) this).e();
        } else {
            er9VarE = zp3.J;
            if (er9VarE == null) {
                sz6.j("KoinApplication has not been started");
                return;
            }
        }
        m7f m7fVar = (m7f) er9VarE.c.I;
        kce kceVar = jce.a;
        ArrayList arrayListB = m7fVar.b(kceVar.b(fch.class));
        tp4 tp4Var = null;
        boolean zM = ((fk0) eve.z(this).a(kceVar.b(fk0.class), null, null)).m();
        xah.a = w44.p1(arrayListB);
        xah.b = zM;
        gb9.V(im6.E, new fj((c78) eve.z(this).a(kceVar.b(c78.class), null, null), tp4Var, 10));
        int i5 = 0;
        if (((m78) eve.z(this).a(kceVar.b(m78.class), null, null)).a.o("claudeai_webview_async_startup")) {
            bf0 bf0Var = t7j.a;
            Set<slg> setUnmodifiableSet = Collections.unmodifiableSet(slg.d);
            HashSet hashSet = new HashSet();
            for (slg slgVar : setUnmodifiableSet) {
                if (slgVar.a.equals("STARTUP_FEATURE_SET_UI_THREAD_STARTUP_MODE_V2")) {
                    hashSet.add(slgVar);
                }
            }
            if (hashSet.isEmpty()) {
                pmf.o("Unknown feature STARTUP_FEATURE_SET_UI_THREAD_STARTUP_MODE_V2");
                return;
            }
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    sfa sfaVar = sfa.DEBUG;
                    zfa.a.getClass();
                    if (yfa.b()) {
                        CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : copyOnWriteArrayList) {
                            ((n30) ((zfa) obj)).getClass();
                            arrayList.add(obj);
                        }
                        if (!arrayList.isEmpty()) {
                            zfa.a.getClass();
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                ((n30) ((zfa) it2.next())).b(sfaVar, "WebViewStartup", "chunked UI-thread startup not supported by this WebView APK");
                            }
                        }
                    }
                } else if (((slg) it.next()).a(this)) {
                    try {
                        ProcessGlobalConfig processGlobalConfig = new ProcessGlobalConfig();
                        processGlobalConfig.b(this);
                        ProcessGlobalConfig.a(processGlobalConfig);
                        hreVar2 = iei.a;
                    } catch (Throwable th3) {
                        hreVar2 = new hre(th3);
                    }
                    Throwable thA2 = jre.a(hreVar2);
                    if (thA2 != null) {
                        SilentException.a(new SilentException("Failed to apply ProcessGlobalConfig", thA2), null, false, 3);
                    }
                }
            }
        }
        m7f m7fVarZ = eve.z(this);
        kce kceVar2 = jce.a;
        this.F = (b6g) m7fVarZ.a(kceVar2.b(b6g.class), null, null);
        this.G = (vl3) eve.z(this).a(kceVar2.b(vl3.class), null, null);
        this.H = (bj0) eve.z(this).a(kceVar2.b(bj0.class), null, null);
        khi khiVar3 = this.I;
        lhi lhiVar3 = this.J;
        khiVar3.getClass();
        lhiVar3.getClass();
        khiVar3.a = x44.X(lmfVar.b, ((m7f) gb9.y().c.I).a(kceVar2.b(hmf.class), null, null), new yd5(i5), new yd5(i2), new yd5(i3), new yd5(i), new yd5(4));
        lhiVar3.a = x44.X(lmfVar.c, new ps8(), ((m7f) gb9.y().c.I).a(kceVar2.b(ggg.class), null, null));
        int i6 = 0;
        ((smh) eve.z(this).a(kceVar2.b(smh.class), null, null)).f = new n0(1, lmfVar, lmf.class, "setEnabled", "setEnabled(Z)V", i6, 7);
        ((smh) eve.z(this).a(kceVar2.b(smh.class), null, null)).g = new n0(1, eve.z(this).a(kceVar2.b(g6g.class), null, null), g6g.class, "setEnabled", "setEnabled(Z)V", i6, 8);
        ((ck5) eve.z(this).a(kceVar2.b(ck5.class), null, null)).a();
        pd4.a = 1;
        knk.j = false;
        b6g b6gVar = this.F;
        if (b6gVar == null) {
            x44.o0("activityLifecycleCallbacks");
            throw null;
        }
        registerActivityLifecycleCallbacks(b6gVar);
        p4a p4aVar = ProcessLifecycleOwner.M.J;
        vl3 vl3Var = this.G;
        if (vl3Var == null) {
            x44.o0("processLifecycleObserver");
            throw null;
        }
        p4aVar.a(vl3Var);
        bj0 bj0Var = this.H;
        if (bj0Var == null) {
            x44.o0("foregroundDetector");
            throw null;
        }
        p4aVar.a(bj0Var);
        el3 el3Var = (el3) eve.z(this).a(kceVar2.b(el3.class), null, null);
        al3 al3Var = new al3(zp3.G, i5);
        fn0 fn0Var = el3Var.b;
        h86 h86Var = el3Var.e;
        e45 e45Var = h86Var.getDefault();
        e45Var.getClass();
        gb9.D(fn0Var, nai.Z(e45Var, al3Var), null, new dx(el3Var, tp4Var, i4), 2);
        fn0 fn0Var2 = el3Var.b;
        e45 e45Var2 = h86Var.getDefault();
        e45Var2.getClass();
        gb9.D(fn0Var2, nai.Z(e45Var2, al3Var), null, new cl3(el3Var, tp4Var, i), 2);
    }

    @Override // android.app.Application
    public final void onTerminate() {
        super.onTerminate();
        b6g b6gVar = this.F;
        if (b6gVar != null) {
            unregisterActivityLifecycleCallbacks(b6gVar);
        } else {
            x44.o0("activityLifecycleCallbacks");
            throw null;
        }
    }
}
