package io.sentry;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d4 implements m2 {
    public Integer E;
    public List F;
    public HashMap G;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d4.class == obj.getClass()) {
            d4 d4Var = (d4) obj;
            if (p.h(this.E, d4Var.E) && p.h(this.F, d4Var.F)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, this.F});
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) throws IOException {
        y yVar = (y) q3Var;
        yVar.n();
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) yVar.F;
        if (this.E != null) {
            yVar.r("segment_id");
            yVar.z(this.E);
        }
        HashMap map = this.G;
        if (map != null) {
            for (String str : map.keySet()) {
                e.a(this.G, str, yVar, str, a1Var);
            }
        }
        yVar.p();
        cVar.J = true;
        if (this.E != null) {
            cVar.n();
            cVar.c();
            cVar.E.append((CharSequence) "\n");
        }
        List list = this.F;
        if (list != null) {
            yVar.x(a1Var, list);
        }
        cVar.J = false;
    }
}
