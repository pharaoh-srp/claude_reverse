package io.sentry.android.core;

import io.sentry.j5;
import io.sentry.j7;
import io.sentry.m7;
import io.sentry.n7;
import io.sentry.q2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h1 implements io.sentry.i0 {
    public final c E;
    public final SentryAndroidOptions F;
    public final io.sentry.util.a G = new io.sentry.util.a();

    public h1(SentryAndroidOptions sentryAndroidOptions, c cVar) {
        io.sentry.p.v("SentryAndroidOptions is required", sentryAndroidOptions);
        this.F = sentryAndroidOptions;
        this.E = cVar;
    }

    public static void a(io.sentry.android.core.performance.h hVar, io.sentry.protocol.e0 e0Var) {
        m7 m7Var;
        if (hVar.E != io.sentry.android.core.performance.g.COLD) {
            return;
        }
        io.sentry.protocol.e eVar = e0Var.F;
        ArrayList arrayList = e0Var.W;
        j7 j7VarI = eVar.i();
        if (j7VarI == null) {
            return;
        }
        io.sentry.protocol.w wVar = j7VarI.E;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                m7Var = null;
                break;
            }
            io.sentry.protocol.z zVar = (io.sentry.protocol.z) it.next();
            if (zVar.J.contentEquals("app.start.cold")) {
                m7Var = zVar.H;
                break;
            }
        }
        io.sentry.android.core.performance.i iVar = new io.sentry.android.core.performance.i();
        io.sentry.android.core.performance.i iVar2 = hVar.H;
        long j = iVar2.F;
        long j2 = iVar2.G;
        long j3 = io.sentry.android.core.performance.h.T;
        iVar.E = "Process Initialization";
        iVar.F = j;
        iVar.G = j2;
        iVar.H = j3;
        if (iVar.b() && Math.abs(iVar.a()) <= 10000) {
            arrayList.add(g(iVar, m7Var, wVar, "process.load"));
        }
        ArrayList arrayList2 = new ArrayList(hVar.K.values());
        Collections.sort(arrayList2);
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(g((io.sentry.android.core.performance.i) it2.next(), m7Var, wVar, "contentprovider.load"));
            }
        }
        io.sentry.android.core.performance.i iVar3 = hVar.J;
        if (iVar3.H != 0) {
            arrayList.add(g(iVar3, m7Var, wVar, "application.load"));
        }
    }

    public static boolean b(io.sentry.protocol.e0 e0Var) {
        for (io.sentry.protocol.z zVar : e0Var.W) {
            if (zVar.J.contentEquals("app.start.cold") || zVar.J.contentEquals("app.start.warm")) {
                return true;
            }
        }
        j7 j7VarI = e0Var.F.i();
        if (j7VarI == null) {
            return false;
        }
        String str = j7VarI.I;
        return str.equals("app.start.cold") || str.equals("app.start.warm");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(io.sentry.protocol.e0 r11) {
        /*
            java.util.ArrayList r11 = r11.W
            java.util.Iterator r0 = r11.iterator()
            r1 = 0
            r2 = r1
        L8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r0.next()
            io.sentry.protocol.z r3 = (io.sentry.protocol.z) r3
            java.lang.String r4 = "ui.load.initial_display"
            java.lang.String r5 = r3.J
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L20
            r1 = r3
            goto L2b
        L20:
            java.lang.String r4 = "ui.load.full_display"
            java.lang.String r5 = r3.J
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L2b
            r2 = r3
        L2b:
            if (r1 == 0) goto L8
            if (r2 == 0) goto L8
        L2f:
            if (r1 != 0) goto L35
            if (r2 != 0) goto L35
            goto Lc7
        L35:
            java.util.Iterator r11 = r11.iterator()
        L39:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Lc7
            java.lang.Object r0 = r11.next()
            io.sentry.protocol.z r0 = (io.sentry.protocol.z) r0
            if (r0 == r1) goto L39
            if (r0 != r2) goto L4a
            goto L39
        L4a:
            java.util.Map r3 = r0.O
            java.lang.Double r4 = r0.E
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L65
            java.lang.String r7 = "thread.name"
            java.lang.Object r3 = r3.get(r7)
            if (r3 == 0) goto L65
            java.lang.String r7 = "main"
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L63
            goto L65
        L63:
            r3 = r5
            goto L66
        L65:
            r3 = r6
        L66:
            if (r1 == 0) goto L86
            double r7 = r4.doubleValue()
            java.lang.Double r9 = r1.E
            double r9 = r9.doubleValue()
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 < 0) goto L86
            java.lang.Double r9 = r1.F
            if (r9 == 0) goto L82
            double r9 = r9.doubleValue()
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 > 0) goto L86
        L82:
            if (r3 == 0) goto L86
            r3 = r6
            goto L87
        L86:
            r3 = r5
        L87:
            if (r2 == 0) goto La4
            double r7 = r4.doubleValue()
            java.lang.Double r4 = r2.E
            double r9 = r4.doubleValue()
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 < 0) goto La4
            java.lang.Double r4 = r2.F
            if (r4 == 0) goto La3
            double r9 = r4.doubleValue()
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 > 0) goto La4
        La3:
            r5 = r6
        La4:
            if (r3 != 0) goto La8
            if (r5 == 0) goto L39
        La8:
            java.util.Map r4 = r0.O
            if (r4 != 0) goto Lb3
            java.util.concurrent.ConcurrentHashMap r4 = new java.util.concurrent.ConcurrentHashMap
            r4.<init>()
            r0.O = r4
        Lb3:
            if (r3 == 0) goto Lbc
            java.lang.String r0 = "ui.contributes_to_ttid"
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r4.put(r0, r3)
        Lbc:
            if (r5 == 0) goto L39
            java.lang.String r0 = "ui.contributes_to_ttfd"
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r4.put(r0, r3)
            goto L39
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.h1.f(io.sentry.protocol.e0):void");
    }

    public static io.sentry.protocol.z g(io.sentry.android.core.performance.i iVar, m7 m7Var, io.sentry.protocol.w wVar, String str) {
        long jA;
        HashMap map = new HashMap(2);
        map.put("thread.id", Long.valueOf(io.sentry.android.core.internal.util.f.b));
        map.put("thread.name", "main");
        Boolean bool = Boolean.TRUE;
        map.put("ui.contributes_to_ttid", bool);
        map.put("ui.contributes_to_ttfd", bool);
        Double dValueOf = Double.valueOf(iVar.F / 1000.0d);
        if (iVar.b()) {
            jA = iVar.a() + iVar.F;
        } else {
            jA = 0;
        }
        return new io.sentry.protocol.z(dValueOf, Double.valueOf(jA / 1000.0d), wVar, new m7(), m7Var, str, iVar.E, n7.OK, "auto.ui", new ConcurrentHashMap(), new ConcurrentHashMap(), map);
    }

    @Override // io.sentry.i0
    public final j5 d(j5 j5Var, io.sentry.n0 n0Var) {
        return j5Var;
    }

    @Override // io.sentry.i0
    public final io.sentry.protocol.e0 e(io.sentry.protocol.e0 e0Var, io.sentry.n0 n0Var) {
        Map map;
        SentryAndroidOptions sentryAndroidOptions = this.F;
        io.sentry.v vVarA = this.G.a();
        try {
            if (!sentryAndroidOptions.isTracingEnabled()) {
                vVarA.close();
                return e0Var;
            }
            io.sentry.android.core.performance.h hVarC = io.sentry.android.core.performance.h.c();
            boolean zB = b(e0Var);
            HashMap map2 = e0Var.X;
            io.sentry.protocol.e eVar = e0Var.F;
            if (zB) {
                if (hVarC.Q && ((Boolean) hVarC.F.a()).booleanValue()) {
                    long jA = hVarC.b(sentryAndroidOptions).a();
                    if (jA != 0) {
                        map2.put(hVarC.E == io.sentry.android.core.performance.g.COLD ? "app_start_cold" : "app_start_warm", new io.sentry.protocol.n(Float.valueOf(jA), q2.MILLISECOND.apiName()));
                        a(hVarC, e0Var);
                        hVarC.Q = false;
                        hVarC.K.clear();
                        hVarC.L.clear();
                    }
                }
                io.sentry.protocol.a aVarD = eVar.d();
                if (aVarD == null) {
                    aVarD = new io.sentry.protocol.a();
                    eVar.m(aVarD);
                }
                aVarD.N = hVarC.E == io.sentry.android.core.performance.g.COLD ? "cold" : "warm";
            }
            f(e0Var);
            io.sentry.protocol.w wVar = e0Var.E;
            j7 j7VarI = eVar.i();
            if (wVar != null && j7VarI != null && j7VarI.I.contentEquals("ui.load")) {
                c cVar = this.E;
                ConcurrentHashMap concurrentHashMap = cVar.c;
                io.sentry.v vVarA2 = cVar.f.a();
                try {
                    if (cVar.c()) {
                        map = (Map) concurrentHashMap.get(wVar);
                        concurrentHashMap.remove(wVar);
                        vVarA2.close();
                    } else {
                        vVarA2.close();
                        map = null;
                    }
                    if (map != null) {
                        map2.putAll(map);
                    }
                } finally {
                }
            }
            vVarA.close();
            return e0Var;
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
