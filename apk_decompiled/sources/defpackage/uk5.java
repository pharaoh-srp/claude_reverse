package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class uk5 implements fch {
    @Override // defpackage.fch
    public final void a() {
        if (kj5.b()) {
            t78.a(kj5.a(null)).a();
        }
    }

    @Override // defpackage.fch
    public final void b(String str, String str2) {
        if (kj5.b()) {
            t78.a(kj5.a(null)).p(str, str2);
        }
    }

    @Override // defpackage.fch
    public final void c(String str) {
        if (kj5.b()) {
            t78.a(kj5.a(null)).f(str);
        }
    }

    @Override // defpackage.fch
    public final void d(String str, String str2) {
        if (kj5.b()) {
            cye cyeVarA = t78.a(kj5.a(null));
            Map mapSingletonMap = Collections.singletonMap("span_type", "perf_span");
            mapSingletonMap.getClass();
            cyeVarA.q(2, str, str2, mapSingletonMap);
        }
    }

    @Override // defpackage.fch
    public final void e(String str, String str2, Map map) {
        str2.getClass();
        map.getClass();
        if (kj5.b() && !str2.equals("Analytics Event")) {
            cye cyeVarA = t78.a(kj5.a(null));
            lqa lqaVar = new lqa();
            lqaVar.put("category", str2);
            lqaVar.putAll(map);
            cyeVarA.t(oxe.J, str, lqaVar.c());
        }
    }

    @Override // defpackage.fch
    public final void f(vba vbaVar) {
        if (kj5.b()) {
            cye cyeVarA = t78.a(kj5.a(null));
            cyeVarA.f("loaded_".concat(vbaVar.E));
            cyeVarA.c();
        }
    }

    @Override // defpackage.fch
    public final void g(String str, String str2, Long l, String str3) {
        if (kj5.b()) {
            cye cyeVarA = t78.a(kj5.a(null));
            Map mapH0 = sta.h0(new cpc("span_type", "perf_span"), new cpc("outcome", str2));
            if (str2.equals("ok")) {
                cyeVarA.m(str, 200, l, 12, mapH0);
                return;
            }
            if (str2.equals("cancelled")) {
                cyeVarA.m(str, null, l, 12, mapH0);
                return;
            }
            String str4 = str3 == null ? str2 : str3;
            RuntimeException runtimeException = new RuntimeException(str3 == null ? str2 : str3);
            if (str3 != null) {
                str2 = str3;
            }
            cyeVarA.x(str, str4, 2, runtimeException, sta.m0(mapH0, new cpc("error_kind", str2)));
        }
    }

    @Override // defpackage.fch
    public final void h(Throwable th, Throwable th2, String str, ozf ozfVar, Map map) {
        th.getClass();
        if (kj5.b() && !r0c.b(th)) {
            ozf ozfVarB = skk.b(th);
            if (ozfVarB != null) {
                ozfVar = ozfVarB;
            }
            if (str == null && (str = th2.getMessage()) == null) {
                str = th2.toString();
            }
            lqa lqaVar = new lqa();
            lqaVar.put("level", ozfVar.name());
            lqaVar.putAll(map);
            lqa lqaVarC = lqaVar.c();
            int iOrdinal = ozfVar.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                cye cyeVarA = t78.a(kj5.a(null));
                Map mapSingletonMap = Collections.singletonMap("exception", th2.toString());
                mapSingletonMap.getClass();
                cyeVarA.t(oxe.J, str, sta.l0(lqaVarC, mapSingletonMap));
                return;
            }
            if (iOrdinal == 2 || iOrdinal == 3) {
                t78.a(kj5.a(null)).s(str, 2, th2, lqaVarC);
            } else {
                mr9.b();
            }
        }
    }
}
