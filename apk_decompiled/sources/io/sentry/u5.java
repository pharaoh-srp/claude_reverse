package io.sentry;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class u5 implements m2 {
    public int E;
    public String F;
    public String G;
    public String H;
    public Long I;
    public ConcurrentHashMap J;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u5.class != obj.getClass()) {
            return false;
        }
        return p.h(this.F, ((u5) obj).F);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.F});
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) throws IOException {
        y yVar = (y) q3Var;
        yVar.n();
        yVar.r("type");
        yVar.w(this.E);
        if (this.F != null) {
            yVar.r("address");
            yVar.A(this.F);
        }
        if (this.G != null) {
            yVar.r("package_name");
            yVar.A(this.G);
        }
        if (this.H != null) {
            yVar.r("class_name");
            yVar.A(this.H);
        }
        if (this.I != null) {
            yVar.r("thread_id");
            yVar.z(this.I);
        }
        ConcurrentHashMap concurrentHashMap = this.J;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                e.b(this.J, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
