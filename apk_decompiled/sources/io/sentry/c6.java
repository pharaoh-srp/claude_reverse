package io.sentry;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c6 implements m2 {
    public final List E;
    public HashMap F;

    public c6(List list) {
        this.E = list;
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        y yVar = (y) q3Var;
        yVar.n();
        yVar.r("items");
        yVar.x(a1Var, this.E);
        HashMap map = this.F;
        if (map != null) {
            for (String str : map.keySet()) {
                e.a(this.F, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
