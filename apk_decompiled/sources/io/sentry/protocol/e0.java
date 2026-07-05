package io.sentry.protocol;

import io.sentry.a1;
import io.sentry.f7;
import io.sentry.i7;
import io.sentry.j7;
import io.sentry.m2;
import io.sentry.q3;
import io.sentry.r7;
import io.sentry.w4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends w4 implements m2 {
    public String T;
    public Double U;
    public Double V;
    public final ArrayList W;
    public final HashMap X;
    public g0 Y;
    public ConcurrentHashMap Z;

    public e0(f7 f7Var) {
        super(f7Var.a);
        this.W = new ArrayList();
        this.X = new HashMap();
        i7 i7Var = f7Var.b;
        this.U = Double.valueOf(i7Var.a.d() / 1.0E9d);
        this.V = Double.valueOf(i7Var.a.c(i7Var.b) / 1.0E9d);
        this.T = f7Var.e;
        for (i7 i7Var2 : f7Var.c) {
            Boolean bool = Boolean.TRUE;
            r7 r7Var = i7Var2.c.H;
            if (bool.equals(r7Var == null ? null : r7Var.a)) {
                this.W.add(new z(i7Var2));
            }
        }
        e eVar = this.F;
        eVar.l(f7Var.p);
        j7 j7Var = i7Var.c;
        ConcurrentHashMap concurrentHashMap = i7Var.k;
        j7 j7Var2 = new j7(j7Var.E, j7Var.F, j7Var.G, j7Var.I, j7Var.J, j7Var.H, j7Var.K, j7Var.M);
        for (Map.Entry entry : j7Var.L.entrySet()) {
            c((String) entry.getKey(), (String) entry.getValue());
        }
        if (concurrentHashMap != null) {
            for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (str != null) {
                    Map map = j7Var2.N;
                    if (value == null) {
                        map.remove(str);
                    } else {
                        map.put(str, value);
                    }
                }
            }
        }
        j jVarK = j7Var.R.k();
        if (jVarK != null) {
            for (i iVar : jVarK.a()) {
                j7Var2.N.put("flag.evaluation." + iVar.a(), iVar.b());
            }
        }
        eVar.v(j7Var2);
        this.Y = new g0(f7Var.n.apiName());
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        io.sentry.y yVar = (io.sentry.y) q3Var;
        yVar.n();
        if (this.T != null) {
            yVar.r("transaction");
            yVar.A(this.T);
        }
        yVar.r("start_timestamp");
        yVar.x(a1Var, io.sentry.p.f(this.U));
        if (this.V != null) {
            yVar.r("timestamp");
            yVar.x(a1Var, io.sentry.p.f(this.V));
        }
        ArrayList arrayList = this.W;
        if (!arrayList.isEmpty()) {
            yVar.r("spans");
            yVar.x(a1Var, arrayList);
        }
        yVar.r("type");
        yVar.A("transaction");
        HashMap map = this.X;
        if (!map.isEmpty()) {
            yVar.r("measurements");
            yVar.x(a1Var, map);
        }
        yVar.r("transaction_info");
        yVar.x(a1Var, this.Y);
        io.sentry.config.a.E(this, yVar, a1Var);
        ConcurrentHashMap concurrentHashMap = this.Z;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.Z, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }

    public e0(ArrayList arrayList, HashMap map, g0 g0Var) {
        Double dValueOf = Double.valueOf(0.0d);
        ArrayList arrayList2 = new ArrayList();
        this.W = arrayList2;
        HashMap map2 = new HashMap();
        this.X = map2;
        this.T = "";
        this.U = dValueOf;
        this.V = null;
        arrayList2.addAll(arrayList);
        map2.putAll(map);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.X.putAll(((z) it.next()).P);
        }
        this.Y = g0Var;
    }
}
