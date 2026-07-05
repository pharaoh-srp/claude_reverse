package com.datadog.android.rum.internal.monitor;

import android.os.Handler;
import com.datadog.android.rum.internal.domain.scope.RumRawEvent;
import com.datadog.android.rum.internal.domain.scope.b;
import com.datadog.android.rum.internal.domain.scope.d;
import com.datadog.android.rum.internal.domain.scope.r;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.ach;
import defpackage.ag5;
import defpackage.bch;
import defpackage.bt9;
import defpackage.bz7;
import defpackage.cch;
import defpackage.cmk;
import defpackage.cpc;
import defpackage.cye;
import defpackage.dch;
import defpackage.ea9;
import defpackage.fd;
import defpackage.g99;
import defpackage.gbf;
import defpackage.gmf;
import defpackage.h4;
import defpackage.h99;
import defpackage.ha9;
import defpackage.hf;
import defpackage.hi5;
import defpackage.hr5;
import defpackage.i29;
import defpackage.i35;
import defpackage.ij0;
import defpackage.iuj;
import defpackage.ja9;
import defpackage.jbf;
import defpackage.jce;
import defpackage.jph;
import defpackage.jye;
import defpackage.k0j;
import defpackage.k2c;
import defpackage.k2e;
import defpackage.k99;
import defpackage.lj5;
import defpackage.lja;
import defpackage.lm6;
import defpackage.lye;
import defpackage.mdj;
import defpackage.mj5;
import defpackage.mp0;
import defpackage.mpk;
import defpackage.mr9;
import defpackage.nm6;
import defpackage.nt5;
import defpackage.nyj;
import defpackage.o29;
import defpackage.ov5;
import defpackage.oxe;
import defpackage.rl;
import defpackage.rog;
import defpackage.sf5;
import defpackage.sog;
import defpackage.sq6;
import defpackage.sta;
import defpackage.sxe;
import defpackage.tjb;
import defpackage.tog;
import defpackage.uog;
import defpackage.uu5;
import defpackage.uxe;
import defpackage.uye;
import defpackage.v40;
import defpackage.vkj;
import defpackage.vog;
import defpackage.vye;
import defpackage.x44;
import defpackage.xn5;
import defpackage.yf5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/datadog/android/rum/internal/monitor/DatadogRumMonitor;", "Lcye;", "Lhf;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
public final class DatadogRumMonitor implements cye, hf {
    public final k99 a;
    public final hi5 b;
    public final bch c;
    public final ov5 d;
    public final ExecutorService e;
    public final b f;
    public final vkj g;
    public final ConcurrentHashMap h;

    public DatadogRumMonitor(String str, k99 k99Var, nyj nyjVar, boolean z, boolean z2, hi5 hi5Var, Handler handler, bch bchVar, ov5 ov5Var, hr5 hr5Var, k0j k0jVar, k0j k0jVar2, k0j k0jVar3, lye lyeVar, ExecutorService executorService, o29 o29Var, bt9 bt9Var, nt5 nt5Var, k2e k2eVar, i29 i29Var, i29 i29Var2, ag5 ag5Var, lja ljaVar) {
        str.getClass();
        hi5Var.getClass();
        hr5Var.getClass();
        k0jVar.getClass();
        k0jVar2.getClass();
        k0jVar3.getClass();
        lyeVar.getClass();
        executorService.getClass();
        o29Var.getClass();
        k2eVar.getClass();
        i29Var.getClass();
        i29Var2.getClass();
        ljaVar.getClass();
        this.a = k99Var;
        this.b = hi5Var;
        this.c = bchVar;
        this.d = ov5Var;
        this.e = executorService;
        this.f = new b(str, k99Var, nyjVar, z, z2, hr5Var, k0jVar, k0jVar2, k0jVar3, ov5Var, new gmf(8, new lye[]{lyeVar, bchVar}), o29Var, bt9Var, nt5Var, k2eVar, i29Var, i29Var2, ag5Var, ljaVar);
        this.g = new vkj(this);
        this.h = new ConcurrentHashMap();
        new AtomicBoolean(false);
    }

    public static final void z(DatadogRumMonitor datadogRumMonitor, RumRawEvent rumRawEvent, lj5 lj5Var, bz7 bz7Var) {
        iuj uu5Var;
        tjb tjbVar;
        h99 h99VarT = datadogRumMonitor.a.t();
        String strF = jce.a.b(rumRawEvent.getClass()).f();
        if (strF == null) {
            strF = "Unknown";
        }
        String strConcat = "RUM event - ".concat(strF);
        h99VarT.getClass();
        String name = DatadogRumMonitor.class.getName();
        rl rlVar = (rl) h99VarT;
        if (!rl.S(0.001f)) {
            tjbVar = null;
        } else {
            if (jbf.a[0] != 1) {
                mr9.b();
                return;
            }
            k99 k99Var = (k99) rlVar.F;
            if (k99Var == null || (uu5Var = k99Var.y()) == null) {
                uu5Var = new uu5();
            }
            tjbVar = new tjb(rlVar, strConcat, name, uu5Var);
        }
        jye jyeVar = datadogRumMonitor.f;
        jyeVar.c(rumRawEvent, lj5Var, bz7Var, datadogRumMonitor.b);
        boolean z = ((jyeVar instanceof Collection) && ((Collection) jyeVar).isEmpty()) ? false : true;
        if (tjbVar != null) {
            tjbVar.a(z);
        }
    }

    public final sxe A() {
        d dVarE = this.f.e();
        if (dVarE == null) {
            return null;
        }
        r rVarE = dVarE.e();
        sxe sxeVarD = rVarE != null ? rVarE.d() : dVarE.d();
        String str = sxeVarD.b;
        String str2 = sxe.p;
        if (x44.r(str, sxe.p)) {
            return null;
        }
        return sxeVarD;
    }

    public final jph B() {
        k99 k99Var = this.a;
        k99Var.y().getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        k99Var.y().getClass();
        return new jph(jCurrentTimeMillis, System.nanoTime());
    }

    public final jph C(Map map) {
        Object obj = map.get("_dd.timestamp");
        Long l = obj instanceof Long ? (Long) obj : null;
        if (l == null) {
            return B();
        }
        long jLongValue = l.longValue();
        return new jph(jLongValue, TimeUnit.MILLISECONDS.toNanos(jLongValue - System.currentTimeMillis()) + System.nanoTime());
    }

    public final void D(RumRawEvent rumRawEvent) {
        cpc cpcVar;
        int i = 1;
        if ((rumRawEvent instanceof RumRawEvent.AddError) && ((RumRawEvent.AddError) rumRawEvent).e) {
            synchronized (this.f) {
                try {
                    gbf feature = this.a.getFeature("rum");
                    if (feature != null) {
                        Set setF0 = sf5.f0("session-replay");
                        String strI = ij0.i("getWriteContextSync-", feature.c.getName());
                        ThreadPoolExecutor threadPoolExecutorA = feature.a.a();
                        h99 h99Var = feature.d;
                        cpcVar = (cpc) v40.B(v40.P(threadPoolExecutorA, strI, h99Var, new mj5(feature, 2, setF0)), strI, h99Var);
                    } else {
                        cpcVar = null;
                    }
                    if (cpcVar != null) {
                        this.f.c(rumRawEvent, (lj5) cpcVar.E, (bz7) cpcVar.F, this.b);
                        this.a.p(new h4(13, A()), "rum", true);
                    } else {
                        dch.H(this.a.t(), 4, g99.E, yf5.c0, null, false, 56);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (!(rumRawEvent instanceof RumRawEvent.TelemetryEventWrapper)) {
            gbf feature2 = this.a.getFeature("rum");
            if (feature2 != null) {
                feature2.b(mp0.Z0(new String[]{"session-replay", "profiling", "tracing"}), new i35(this, i, rumRawEvent));
                return;
            }
            return;
        }
        bch bchVar = this.c;
        RumRawEvent.TelemetryEventWrapper telemetryEventWrapper = (RumRawEvent.TelemetryEventWrapper) rumRawEvent;
        hi5 hi5Var = this.b;
        LinkedHashSet linkedHashSet = bchVar.J;
        hi5Var.getClass();
        ja9 ja9Var = telemetryEventWrapper.a;
        g99 g99Var = g99.F;
        k99 k99Var = bchVar.E;
        boolean zF = false;
        if (bchVar.F.f(ja9Var)) {
            if (ja9Var instanceof ea9) {
                zF = bchVar.G.f(ja9Var);
            } else {
                cch cchVarL = cmk.l(ja9Var);
                if ((ja9Var instanceof ha9) && linkedHashSet.contains(cchVarL)) {
                    dch.H(k99Var.t(), 3, g99Var, new k2c(11, cchVarL), null, false, 56);
                } else if (bchVar.K >= bchVar.I) {
                    dch.H(k99Var.t(), 3, g99Var, uxe.h0, null, false, 56);
                } else {
                    zF = true;
                }
            }
        }
        if (zF) {
            linkedHashSet.add(cmk.l(ja9Var));
            if (!(ja9Var instanceof ea9)) {
                bchVar.K++;
            }
            gbf feature3 = k99Var.getFeature("rum");
            if (feature3 != null) {
                feature3.b(mp0.Z0(new String[]{"session-replay", "tracing", "rum"}), new ach(telemetryEventWrapper, ja9Var, bchVar, hi5Var));
            }
        }
    }

    @Override // defpackage.cye
    public final void a() {
        D(new RumRawEvent.AppStartTTFDEvent());
    }

    @Override // defpackage.cye
    public final void b(String str, String str2) {
        str.getClass();
        D(new RumRawEvent.AddFeatureFlagEvaluation(str, str2));
    }

    @Override // defpackage.cye
    public final void c() {
        D(new RumRawEvent.AddViewLoadingTime(B()));
    }

    @Override // defpackage.cye
    public final void d(Object obj, String str, Map map) {
        obj.getClass();
        str.getClass();
        map.getClass();
        D(new RumRawEvent.StartView(mpk.F(str, obj), sta.q0(map), C(map)));
    }

    @Override // defpackage.hf
    public final void e(long j, String str) {
        str.getClass();
        D(new RumRawEvent.AddLongTask(j, str));
    }

    @Override // defpackage.cye
    public final void f(String str) {
        D(new RumRawEvent.AddCustomTiming(str));
    }

    @Override // defpackage.hf
    public final void g() {
        h4 h4Var = new h4(12, this);
        v40.p(this.e, "Get current session ID", this.a.t(), new fd(this, 26, h4Var));
    }

    @Override // defpackage.cye
    public final Map getAttributes() {
        return this.h;
    }

    @Override // defpackage.hf
    public final void h(String str, xn5 xn5Var) {
        if (xn5Var instanceof rog) {
            D(new RumRawEvent.ActionDropped(str));
            return;
        }
        if (xn5Var instanceof vog) {
            D(new RumRawEvent.ResourceDropped(str, ((vog) xn5Var).f));
            return;
        }
        if (xn5Var instanceof sog) {
            D(new RumRawEvent.ErrorDropped(str, ((sog) xn5Var).M0()));
        } else if (xn5Var instanceof uog) {
            D(new RumRawEvent.LongTaskDropped(str, false));
        } else if (xn5Var instanceof tog) {
            D(new RumRawEvent.LongTaskDropped(str, true));
        }
    }

    @Override // defpackage.hf
    public final void i(String str, xn5 xn5Var) {
        if (xn5Var instanceof rog) {
            rog rogVar = (rog) xn5Var;
            D(new RumRawEvent.ActionSent(str, rogVar.f, rogVar.g, rogVar.h));
            return;
        }
        if (xn5Var instanceof vog) {
            vog vogVar = (vog) xn5Var;
            D(new RumRawEvent.ResourceSent(str, vogVar.f, vogVar.g));
        } else if (xn5Var instanceof sog) {
            sog sogVar = (sog) xn5Var;
            D(new RumRawEvent.ErrorSent(str, sogVar.M0(), sogVar.N0()));
        } else if (xn5Var instanceof uog) {
            D(new RumRawEvent.LongTaskSent(str, false));
        } else if (xn5Var instanceof tog) {
            D(new RumRawEvent.LongTaskSent(str, true));
        }
    }

    @Override // defpackage.hf
    public final void j(uye uyeVar) {
        D(new RumRawEvent.AppStartEvent(uyeVar));
    }

    @Override // defpackage.hf
    public final void k() {
        D(new RumRawEvent.WebViewEvent());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.cye
    public final void l(String str, String str2, Map map) {
        sq6.a(4);
        jph jphVarC = C(map);
        Object obj = map.get("_dd.error_type");
        String strN = null;
        String str3 = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("_dd.error.source_type");
        String str4 = obj2 instanceof String ? (String) obj2 : null;
        if (str4 != null) {
            Locale locale = Locale.US;
            strN = ij0.n(locale, str4, locale);
        }
        int i = 1;
        if (strN != null) {
            switch (strN.hashCode()) {
                case -861391249:
                    strN.equals("android");
                    break;
                case -760334308:
                    if (strN.equals("flutter")) {
                        i = 4;
                    }
                    break;
                case -380982102:
                    if (strN.equals("ndk+il2cpp")) {
                        i = 6;
                    }
                    break;
                case 108917:
                    if (strN.equals("ndk")) {
                        i = 5;
                    }
                    break;
                case 150940456:
                    if (strN.equals("browser")) {
                        i = 2;
                    }
                    break;
                case 828638245:
                    if (strN.equals("react-native")) {
                        i = 3;
                    }
                    break;
            }
        }
        D(new RumRawEvent.AddError(str, 4, null, str2, false, sta.q0(map), jphVarC, str3, i, lm6.E, null, FreeTypeConstants.FT_LOAD_NO_RECURSE));
    }

    @Override // defpackage.cye
    public final void m(String str, Integer num, Long l, int i, Map map) {
        sq6.a(i);
        D(new RumRawEvent.StopResource(str, num != null ? Long.valueOf(num.intValue()) : null, l, i, sta.q0(map), C(map)));
    }

    @Override // defpackage.hf
    public final void n(ja9 ja9Var) {
        D(new RumRawEvent.TelemetryEventWrapper(ja9Var));
    }

    @Override // defpackage.cye
    /* JADX INFO: renamed from: o, reason: from getter */
    public final vkj getG() {
        return this.g;
    }

    @Override // defpackage.cye
    public final void p(String str, String str2) {
        this.h.put(str, str2);
    }

    @Override // defpackage.cye
    public final void q(int i, String str, String str2, Map map) {
        sq6.a(i);
        str2.getClass();
        map.getClass();
        D(new RumRawEvent.StartResource(str, str2, i, sta.q0(map), C(map)));
    }

    @Override // defpackage.cye
    public final void r(Object obj, Map map) {
        map.getClass();
        D(new RumRawEvent.StopView(mpk.F(null, obj), sta.q0(map), C(map)));
    }

    @Override // defpackage.cye
    public final void s(String str, int i, Throwable th, Map map) {
        str.getClass();
        sq6.a(i);
        jph jphVarC = C(map);
        Object obj = map.get("_dd.error_type");
        String str2 = obj instanceof String ? (String) obj : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Object objRemove = linkedHashMap.remove("_dd.error.threads");
        List list = objRemove instanceof List ? (List) objRemove : null;
        if (list == null) {
            list = lm6.E;
        }
        D(new RumRawEvent.AddError(str, i, th, null, false, linkedHashMap, jphVarC, str2, 0, list, null, 1280));
    }

    @Override // defpackage.cye
    public final void t(oxe oxeVar, String str, Map map) {
        str.getClass();
        map.getClass();
        D(new RumRawEvent.StartAction(oxeVar, str, false, sta.q0(map), C(map)));
    }

    @Override // defpackage.cye
    public final void u(LinkedHashMap linkedHashMap) {
        jph jphVarC = C(linkedHashMap);
        D(new RumRawEvent.StartAction(oxe.F, "", true, sta.q0(linkedHashMap), jphVarC));
    }

    @Override // defpackage.cye
    public final void v(oxe oxeVar, LinkedHashMap linkedHashMap) {
        oxeVar.getClass();
        D(new RumRawEvent.StopAction(oxeVar, sta.q0(linkedHashMap), C(linkedHashMap)));
    }

    @Override // defpackage.hf
    public final void w(String str, Throwable th, ArrayList arrayList) {
        sq6.a(2);
        jph jphVarB = B();
        D(new RumRawEvent.AddError(str, 2, th, null, true, nm6.E, jphVarB, null, 0, arrayList, Long.valueOf(jphVarB.b - this.a.l()), 384));
    }

    @Override // defpackage.cye
    public final void x(String str, String str2, int i, Throwable th, Map map) {
        sq6.a(i);
        D(new RumRawEvent.StopResourceWithError(str, null, str2, i, th, sta.q0(map), C(map)));
    }

    @Override // defpackage.hf
    public final void y(vye vyeVar) {
        D(new RumRawEvent.AppStartTTIDEvent(vyeVar));
    }
}
