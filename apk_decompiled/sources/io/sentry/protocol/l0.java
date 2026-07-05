package io.sentry.protocol;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l0 implements m2 {
    public String E;
    public String F;
    public String G;
    public String H;
    public Double I;
    public Double J;
    public Double K;
    public Double L;
    public String M;
    public Double N;
    public List O;
    public HashMap P;

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) throws IOException {
        io.sentry.y yVar = (io.sentry.y) q3Var;
        yVar.n();
        if (this.E != null) {
            yVar.r("rendering_system");
            yVar.A(this.E);
        }
        if (this.F != null) {
            yVar.r("type");
            yVar.A(this.F);
        }
        if (this.G != null) {
            yVar.r("identifier");
            yVar.A(this.G);
        }
        if (this.H != null) {
            yVar.r("tag");
            yVar.A(this.H);
        }
        if (this.I != null) {
            yVar.r("width");
            yVar.z(this.I);
        }
        if (this.J != null) {
            yVar.r("height");
            yVar.z(this.J);
        }
        if (this.K != null) {
            yVar.r("x");
            yVar.z(this.K);
        }
        if (this.L != null) {
            yVar.r("y");
            yVar.z(this.L);
        }
        if (this.M != null) {
            yVar.r("visibility");
            yVar.A(this.M);
        }
        if (this.N != null) {
            yVar.r("alpha");
            yVar.z(this.N);
        }
        List list = this.O;
        if (list != null && !list.isEmpty()) {
            yVar.r("children");
            yVar.x(a1Var, this.O);
        }
        HashMap map = this.P;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.P, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
