package io.sentry.protocol;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class o implements m2 {
    public String E;
    public String F;
    public String G;
    public Boolean H;
    public AbstractMap I;
    public ConcurrentHashMap J;
    public Boolean K;
    public Integer L;
    public Integer M;
    public Boolean N;
    public HashMap O;

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) throws IOException {
        io.sentry.y yVar = (io.sentry.y) q3Var;
        yVar.n();
        if (this.E != null) {
            yVar.r("type");
            yVar.A(this.E);
        }
        if (this.F != null) {
            yVar.r("description");
            yVar.A(this.F);
        }
        if (this.G != null) {
            yVar.r("help_link");
            yVar.A(this.G);
        }
        if (this.H != null) {
            yVar.r("handled");
            yVar.y(this.H);
        }
        if (this.I != null) {
            yVar.r("meta");
            yVar.x(a1Var, this.I);
        }
        if (this.J != null) {
            yVar.r("data");
            yVar.x(a1Var, this.J);
        }
        if (this.K != null) {
            yVar.r("synthetic");
            yVar.y(this.K);
        }
        if (this.L != null) {
            yVar.r("exception_id");
            yVar.x(a1Var, this.L);
        }
        if (this.M != null) {
            yVar.r("parent_id");
            yVar.x(a1Var, this.M);
        }
        if (this.N != null) {
            yVar.r("is_exception_group");
            yVar.y(this.N);
        }
        HashMap map = this.O;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.O, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
