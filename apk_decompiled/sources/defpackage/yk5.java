package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public final class yk5 implements xk5 {
    public final k99 a;
    public final o35 b;
    public final boolean c;
    public final unb d;
    public final n78 e;

    public yk5(k99 k99Var, o35 o35Var, unb unbVar) {
        n78 n78Var = new n78(23, new h35(k99Var, 1));
        this.a = k99Var;
        this.b = o35Var;
        this.c = true;
        this.d = unbVar;
        this.e = n78Var;
    }

    @Override // defpackage.xk5
    public final nyj a() {
        gbf feature;
        o35 o35Var = this.b;
        o35Var.getClass();
        y50 y50Var = new y50();
        y50Var.e = o35Var;
        y50Var.a = false;
        y50Var.b = o35Var;
        nyj nyjVar = new nyj(y50Var, this.d);
        if (this.c) {
            n78 n78Var = this.e;
            n78Var.getClass();
            k99 k99Var = (k99) ((zy7) n78Var.F).a();
            if (k99Var != null && (feature = k99Var.getFeature("rum")) != null) {
                Future futureP = v40.P(feature.a.a(), ij0.i("getContextFuture-", feature.c.getName()), feature.d, new nj5(feature, 1, sf5.f0("rum")));
                if (futureP != null) {
                    LinkedHashMap linkedHashMap = (LinkedHashMap) y50Var.c;
                    if (linkedHashMap == null) {
                        linkedHashMap = new LinkedHashMap();
                        y50Var.c = linkedHashMap;
                    }
                    linkedHashMap.put("_dd.datadog_initial_context", futureP);
                }
            }
        }
        return nyjVar;
    }

    @Override // defpackage.xk5
    public final nyj b() {
        h99 h99VarT = this.a.t();
        efe efeVar = this.b.g0;
        efeVar.getClass();
        return new nyj(h99VarT, efeVar);
    }
}
