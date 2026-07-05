package io.sentry.protocol;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class x implements m2 {
    public final String E;
    public final String F;
    public HashMap G;

    public x(String str, String str2) {
        this.E = str;
        this.F = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x.class == obj.getClass()) {
            x xVar = (x) obj;
            if (Objects.equals(this.E, xVar.E) && Objects.equals(this.F, xVar.F)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.E, this.F);
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        io.sentry.y yVar = (io.sentry.y) q3Var;
        yVar.n();
        yVar.r("name");
        yVar.A(this.E);
        yVar.r("version");
        yVar.A(this.F);
        HashMap map = this.G;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.G, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
