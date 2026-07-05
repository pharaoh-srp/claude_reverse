package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.datadog.android.rum.internal.monitor.DatadogRumMonitor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class aye implements qog, vf7 {
    public static final yxe p0;
    public final k99 E;
    public final String F;
    public final yxe G;
    public final bz7 H;
    public final jz1 I;
    public final Handler J;
    public hi5 K;
    public final AtomicBoolean L;
    public float M;
    public float N;
    public float O;
    public boolean P;
    public boolean Q;
    public pyi R;
    public emi S;
    public m4i T;
    public k0j U;
    public k0j V;
    public k0j W;
    public lye X;
    public ScheduledExecutorService Y;
    public ExecutorService Z;
    public o a0;
    public Context b0;
    public o29 c0;
    public bt9 d0;
    public nt5 e0;
    public final k2e f0;
    public i29 g0;
    public i29 h0;
    public final LinkedHashSet i0;
    public lja j0;
    public final u0h k0;
    public qxe l0;
    public final String m0;
    public final u0h n0;
    public final ug7 o0;

    static {
        m4c m4cVar = new m4c();
        gd gdVar = new gd();
        vpa vpaVar = new vpa();
        l4c l4cVar = new l4c();
        l4c l4cVar2 = new l4c();
        l4c l4cVar3 = new l4c();
        l4c l4cVar4 = new l4c();
        l4c l4cVar5 = new l4c();
        l4c l4cVar6 = new l4c();
        l4c l4cVar7 = new l4c();
        l4c l4cVar8 = new l4c();
        jz1.a.getClass();
        p0 = new yxe(20.0f, lm6.E, m4cVar, gdVar, vpaVar, l4cVar, l4cVar2, l4cVar3, l4cVar4, l4cVar5, l4cVar6, l4cVar7, l4cVar8, false, !iz1.b.g, 2, new r4c(), new mph(), new nph(), new efk(21), nm6.E, new lja(23), dd8.G);
    }

    public aye(k99 k99Var, yxe yxeVar) {
        lxe lxeVar = lxe.H;
        jz1.a.getClass();
        hz1 hz1Var = iz1.b;
        Handler handler = new Handler(Looper.getMainLooper());
        yxeVar.getClass();
        this.E = k99Var;
        this.F = "c93c9f6c-9a16-44b3-818e-43e89aa7ce46";
        this.G = yxeVar;
        this.H = lxeVar;
        this.I = hz1Var;
        this.J = handler;
        this.K = new j4c();
        this.L = new AtomicBoolean(false);
        int i = 24;
        this.R = new dd8(24);
        this.S = new zp3(24);
        this.T = new lja(24);
        this.U = new ql8(i);
        this.V = new ql8(i);
        this.W = new ql8(i);
        new AtomicReference(null);
        this.X = new r4c();
        this.Y = new s4c();
        this.c0 = new lz1(23);
        this.d0 = new a5(23);
        this.f0 = new k2e(21);
        this.g0 = new a5(22);
        this.h0 = new unb(22);
        this.i0 = new LinkedHashSet();
        this.j0 = new lja(23);
        this.k0 = new u0h(new zxe(this, 0));
        this.m0 = "rum";
        this.n0 = new u0h(new zxe(this, 1));
        this.o0 = new ug7(524288L, 500, 4194304L, 86400000L);
    }

    @Override // defpackage.vf7
    public final void a(Object obj) throws InterruptedException {
        BlockingQueue<Runnable> queue;
        boolean z = obj instanceof Map;
        g99 g99Var = g99.E;
        k99 k99Var = this.E;
        if (!z) {
            if (obj instanceof ak9) {
                ak9 ak9Var = (ak9) obj;
                cye cyeVarA = t78.a(k99Var);
                hf hfVar = cyeVarA instanceof hf ? (hf) cyeVarA : null;
                if (hfVar != null) {
                    hfVar.w(ak9Var.b, ak9Var.a, ak9Var.c);
                    return;
                }
                return;
            }
            if (!(obj instanceof ja9)) {
                dch.H(k99Var.t(), 4, g99Var, new ijd(5, obj), null, false, 56);
                return;
            }
            ja9 ja9Var = (ja9) obj;
            cye cyeVarA2 = t78.a(k99Var);
            hf hfVar2 = cyeVarA2 instanceof hf ? (hf) cyeVarA2 : null;
            if (hfVar2 == null) {
                return;
            }
            hfVar2.n(ja9Var);
            return;
        }
        Map map = (Map) obj;
        Object obj2 = map.get("type");
        if (x44.r(obj2, "ndk_crash")) {
            ((gk5) this.k0.getValue()).d(map, this.K);
            return;
        }
        boolean zR = x44.r(obj2, "logger_error");
        Map map2 = nm6.E;
        g99 g99Var2 = g99.G;
        if (zR) {
            Object obj3 = map.get("throwable");
            Throwable th = obj3 instanceof Throwable ? (Throwable) obj3 : null;
            Object obj4 = map.get("message");
            String str = obj4 instanceof String ? (String) obj4 : null;
            Object obj5 = map.get("attributes");
            Map map3 = obj5 instanceof Map ? (Map) obj5 : null;
            if (str == null) {
                dch.I(k99Var.t(), 4, x44.X(g99Var, g99Var2), uxe.I, null, 56);
                return;
            }
            cye cyeVarA3 = t78.a(k99Var);
            hf hfVar3 = cyeVarA3 instanceof hf ? (hf) cyeVarA3 : null;
            if (hfVar3 != null) {
                if (map3 != null) {
                    map2 = map3;
                }
                hfVar3.s(str, 4, th, map2);
                return;
            }
            return;
        }
        if (x44.r(obj2, "logger_error_with_stacktrace")) {
            Object obj6 = map.get("stacktrace");
            String str2 = obj6 instanceof String ? (String) obj6 : null;
            Object obj7 = map.get("message");
            String str3 = obj7 instanceof String ? (String) obj7 : null;
            Object obj8 = map.get("attributes");
            Map map4 = obj8 instanceof Map ? (Map) obj8 : null;
            if (str3 == null) {
                dch.I(k99Var.t(), 4, x44.X(g99Var, g99Var2), uxe.J, null, 56);
                return;
            }
            cye cyeVarA4 = t78.a(k99Var);
            hf hfVar4 = cyeVarA4 instanceof hf ? (hf) cyeVarA4 : null;
            if (hfVar4 != null) {
                if (map4 != null) {
                    map2 = map4;
                }
                hfVar4.l(str3, str2, map2);
                return;
            }
            return;
        }
        if (x44.r(obj2, "web_view_ingested_notification")) {
            cye cyeVarA5 = t78.a(k99Var);
            hf hfVar5 = cyeVarA5 instanceof hf ? (hf) cyeVarA5 : null;
            if (hfVar5 != null) {
                hfVar5.k();
                return;
            }
            return;
        }
        if (x44.r(obj2, "sr_skipped_frame")) {
            cye cyeVarA6 = t78.a(k99Var);
            hf hfVar6 = cyeVarA6 instanceof hf ? (hf) cyeVarA6 : null;
            if (hfVar6 != null) {
                hfVar6.g();
                return;
            }
            return;
        }
        if (!x44.r(obj2, "flush_and_stop_monitor")) {
            dch.H(k99Var.t(), 4, g99Var, new hc0(1, map), null, false, 56);
            return;
        }
        cye cyeVarA7 = t78.a(k99Var);
        DatadogRumMonitor datadogRumMonitor = cyeVarA7 instanceof DatadogRumMonitor ? (DatadogRumMonitor) cyeVarA7 : null;
        if (datadogRumMonitor != null) {
            ArrayList arrayList = new ArrayList();
            ExecutorService executorService = datadogRumMonitor.e;
            ThreadPoolExecutor threadPoolExecutor = executorService instanceof ThreadPoolExecutor ? (ThreadPoolExecutor) executorService : null;
            if (threadPoolExecutor != null && (queue = threadPoolExecutor.getQueue()) != null) {
                queue.drainTo(arrayList);
            }
            executorService.shutdown();
            executorService.awaitTermination(10L, TimeUnit.SECONDS);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    @Override // defpackage.if7
    public final void b() {
        this.E.n(this.m0);
        Iterator it = this.i0.iterator();
        while (it.hasNext()) {
            this.E.i((p0j) it.next());
        }
        this.i0.clear();
        Context context = this.b0;
        if (context == null) {
            x44.o0("appContext");
            throw null;
        }
        this.S.a(context);
        this.R.a(context);
        this.T.a(context);
        this.K = new j4c();
        int i = 24;
        this.R = new dd8(24);
        this.S = new zp3(24);
        this.T = new lja(24);
        this.U = new ql8(i);
        this.V = new ql8(i);
        this.W = new ql8(i);
        this.Y.shutdownNow();
        ExecutorService executorService = this.Z;
        if (executorService != null) {
            executorService.shutdownNow();
        }
        o oVar = this.a0;
        if (oVar != null) {
            oVar.G = true;
        }
        this.Y = new s4c();
        this.X = new r4c();
        this.G.getClass();
        this.g0.c();
        this.g0 = new a5(22);
        this.h0.c();
        this.h0 = new unb(22);
        qxe qxeVar = this.l0;
        if (!ask.g()) {
            this.J.post(new pya(6, qxeVar));
        } else if (qxeVar != null) {
            qxeVar.a();
        }
        this.l0 = null;
        LinkedHashMap linkedHashMap = t78.a;
        k99 k99Var = this.E;
        k99Var.getClass();
        LinkedHashMap linkedHashMap2 = t78.a;
        synchronized (linkedHashMap2) {
        }
        this.L.set(false);
    }

    @Override // defpackage.qog
    public final ug7 c() {
        return this.o0;
    }

    public final void d(o0j o0jVar, k0j k0jVar, long j) {
        ScheduledExecutorService scheduledExecutorService = this.Y;
        k99 k99Var = this.E;
        p0j p0jVar = new p0j(k99Var, o0jVar, k0jVar, scheduledExecutorService, j);
        k99Var.B(p0jVar);
        this.i0.add(p0jVar);
        v40.N(this.Y, "Vitals monitoring", j, this.E.t(), p0jVar);
    }

    @Override // defpackage.if7
    public final String getName() {
        return this.m0;
    }

    @Override // defpackage.qog
    public final kje h() {
        return (kje) this.n0.getValue();
    }

    @Override // defpackage.if7
    public final void j(Context context) {
        ce7 ce7Var;
        context.getClass();
        this.b0 = context;
        yxe yxeVar = this.G;
        yxeVar.getClass();
        this.c0 = yxeVar.q;
        this.d0 = yxeVar.r;
        this.j0 = yxeVar.u;
        k99 k99Var = this.E;
        k99Var.getClass();
        q28 q28Var = new q28(new vxe(yxeVar.f, yxeVar.g, yxeVar.h, yxeVar.i, yxeVar.j, yxeVar.k, yxeVar.l, yxeVar.m, k99Var.t()), 9, new xxe(k99Var.t()));
        dd8 dd8Var = new dd8(27);
        k99Var.getClass();
        fj0 fj0Var = new fj0();
        fj0Var.E = q28Var;
        fj0Var.F = dd8Var;
        fj0Var.G = k99Var;
        this.K = fj0Var;
        boolean zK = k99Var.k();
        g99 g99Var = g99.E;
        if (zK) {
            dch.H(k99Var.t(), 3, g99Var, uxe.M, null, false, 56);
        }
        this.M = 100.0f;
        this.N = 20.0f;
        this.O = yxeVar.a;
        this.P = yxeVar.n;
        this.Q = true;
        this.g0 = new aq5(context, k99Var.y());
        this.h0 = new uq5(context, k99Var.t());
        pyi pyiVar = yxeVar.d;
        if (pyiVar != null) {
            this.R = pyiVar;
        }
        kf9[] kf9VarArr = (kf9[]) yxeVar.b.toArray(new kf9[0]);
        m4c m4cVar = yxeVar.c;
        sb sbVar = yxeVar.s;
        h99 h99VarT = k99Var.t();
        kf9[] kf9VarArr2 = {new kf9()};
        kf9VarArr.getClass();
        int length = kf9VarArr.length;
        Object[] objArrCopyOf = Arrays.copyOf(kf9VarArr, length + 1);
        System.arraycopy(kf9VarArr2, 0, objArrCopyOf, length, 1);
        xj5 xj5Var = new xj5((kf9[]) objArrCopyOf, m4cVar, sbVar, h99VarT);
        this.S = ((hz1) this.I).f ? new fmi(xj5Var) : new gmi(xj5Var);
        m4i m4iVar = yxeVar.e;
        if (m4iVar != null) {
            this.T = m4iVar;
        }
        int i = yxeVar.w;
        if (i != 4) {
            this.Y = k99Var.m("rum-vital");
        }
        if (i != 4) {
            this.U = new yr();
            d(new j42(k99Var.t()), this.U, kgh.k(i));
        }
        if (i != 4) {
            this.V = new yr();
            d(new ncb(k99Var.t()), this.V, kgh.k(i));
        }
        Application application = context instanceof Application ? (Application) context : null;
        dch.H(k99Var.t(), 3, g99Var, re4.c0, null, false, 56);
        nt5 nt5Var = new nt5(new ov5(k99Var.t(), 0), this.j0, k99Var.y());
        this.e0 = nt5Var;
        if (i == 4) {
            ce7Var = null;
        } else {
            yr yrVar = new yr();
            this.W = yrVar;
            ce7Var = new ce7(yrVar);
        }
        int i2 = 2;
        ly7 ly7Var = new ly7(mp0.C0(new iy7[]{nt5Var, ce7Var}), k99Var.t());
        if (application != null) {
            application.registerActivityLifecycleCallbacks(ly7Var);
        }
        if (yxeVar.o) {
            o oVar = new o(k99Var, new Handler(Looper.getMainLooper()));
            ExecutorService executorServiceW = k99Var.w("rum-anr-detection");
            this.Z = executorServiceW;
            v40.p(executorServiceW, "ANR detection", k99Var.t(), oVar);
            this.a0 = oVar;
        }
        this.S.k(k99Var, context);
        this.R.k(k99Var, context);
        this.T.k(k99Var, context);
        this.X = yxeVar.p;
        Context context2 = this.b0;
        if (context2 == null) {
            x44.o0("appContext");
            throw null;
        }
        Context applicationContext = context2.getApplicationContext();
        applicationContext.getClass();
        Application application2 = (Application) applicationContext;
        gmf gmfVar = new gmf(25, this);
        dd8 dd8Var2 = yxeVar.v;
        dpf dpfVar = new dpf(k99Var.t(), new h35(k99Var, 3), new n78(24), new Handler(Looper.getMainLooper()));
        jz1.a.getClass();
        iz1 iz1Var = iz1.a;
        this.l0 = new qxe(application2, new h35(k99Var, i2), gmfVar, dd8Var2, dpfVar);
        k99Var.e(this.m0, this);
        this.L.set(true);
    }
}
