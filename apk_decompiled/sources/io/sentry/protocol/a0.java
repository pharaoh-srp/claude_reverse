package io.sentry.protocol;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import io.sentry.u5;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements m2 {
    public List E;
    public List F;
    public Map G;
    public String H;
    public String I;
    public String J;
    public Integer K;
    public Integer L;
    public String M;
    public String N;
    public Boolean O;
    public String P;
    public Boolean Q;
    public String R;
    public String S;
    public String T;
    public String U;
    public String V;
    public String W;
    public ConcurrentHashMap X;
    public String Y;
    public u5 Z;

    public final boolean equals(Object obj) {
        if (obj == null || a0.class != obj.getClass()) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Objects.equals(this.E, a0Var.E) && Objects.equals(this.F, a0Var.F) && Objects.equals(this.G, a0Var.G) && Objects.equals(this.H, a0Var.H) && Objects.equals(this.I, a0Var.I) && Objects.equals(this.J, a0Var.J) && Objects.equals(this.K, a0Var.K) && Objects.equals(this.L, a0Var.L) && Objects.equals(this.M, a0Var.M) && Objects.equals(this.N, a0Var.N) && Objects.equals(this.O, a0Var.O) && Objects.equals(this.P, a0Var.P) && Objects.equals(this.Q, a0Var.Q) && Objects.equals(this.R, a0Var.R) && Objects.equals(this.S, a0Var.S) && Objects.equals(this.T, a0Var.T) && Objects.equals(this.U, a0Var.U) && Objects.equals(this.V, a0Var.V) && Objects.equals(this.W, a0Var.W) && Objects.equals(this.X, a0Var.X) && Objects.equals(this.Y, a0Var.Y) && Objects.equals(this.Z, a0Var.Z);
    }

    public final int hashCode() {
        return Objects.hash(this.E, this.F, this.G, null, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z);
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) throws IOException {
        io.sentry.y yVar = (io.sentry.y) q3Var;
        yVar.n();
        if (this.H != null) {
            yVar.r("filename");
            yVar.A(this.H);
        }
        if (this.I != null) {
            yVar.r("function");
            yVar.A(this.I);
        }
        if (this.J != null) {
            yVar.r("module");
            yVar.A(this.J);
        }
        if (this.K != null) {
            yVar.r("lineno");
            yVar.z(this.K);
        }
        if (this.L != null) {
            yVar.r("colno");
            yVar.z(this.L);
        }
        if (this.M != null) {
            yVar.r("abs_path");
            yVar.A(this.M);
        }
        if (this.N != null) {
            yVar.r("context_line");
            yVar.A(this.N);
        }
        if (this.O != null) {
            yVar.r("in_app");
            yVar.y(this.O);
        }
        if (this.P != null) {
            yVar.r("package");
            yVar.A(this.P);
        }
        if (this.Q != null) {
            yVar.r("native");
            yVar.y(this.Q);
        }
        if (this.R != null) {
            yVar.r("platform");
            yVar.A(this.R);
        }
        if (this.S != null) {
            yVar.r("image_addr");
            yVar.A(this.S);
        }
        if (this.T != null) {
            yVar.r("symbol_addr");
            yVar.A(this.T);
        }
        if (this.U != null) {
            yVar.r("instruction_addr");
            yVar.A(this.U);
        }
        if (this.V != null) {
            yVar.r("addr_mode");
            yVar.A(this.V);
        }
        if (this.Y != null) {
            yVar.r("raw_function");
            yVar.A(this.Y);
        }
        if (this.W != null) {
            yVar.r("symbol");
            yVar.A(this.W);
        }
        if (this.Z != null) {
            yVar.r("lock");
            yVar.x(a1Var, this.Z);
        }
        List list = this.E;
        if (list != null && !list.isEmpty()) {
            yVar.r("pre_context");
            yVar.x(a1Var, this.E);
        }
        List list2 = this.F;
        if (list2 != null && !list2.isEmpty()) {
            yVar.r("post_context");
            yVar.x(a1Var, this.F);
        }
        Map map = this.G;
        if (map != null && !map.isEmpty()) {
            yVar.r("vars");
            yVar.x(a1Var, this.G);
        }
        ConcurrentHashMap concurrentHashMap = this.X;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.X, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
