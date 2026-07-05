package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class fv5 extends ev5 {
    public final boolean I;
    public final bv5 J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public final boolean U;
    public final int V;
    public final boolean W;
    public final int X;
    public final boolean Y;
    public final boolean Z;
    public final boolean a0;
    public final int b0;
    public final boolean c0;
    public final String d0;

    /* JADX WARN: Removed duplicated region for block: B:134:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public fv5(int r7, defpackage.v3i r8, int r9, defpackage.bv5 r10, int r11, java.lang.String r12, int r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fv5.<init>(int, v3i, int, bv5, int, java.lang.String, int, boolean):void");
    }

    public static int c(fv5 fv5Var, fv5 fv5Var2) {
        s84 s84VarC = s84.a.c(fv5Var.L, fv5Var2.L);
        Integer numValueOf = Integer.valueOf(fv5Var.Q);
        Integer numValueOf2 = Integer.valueOf(fv5Var2.Q);
        dyb dybVar = dyb.G;
        return s84VarC.b(numValueOf, numValueOf2, dybVar).a(fv5Var.R, fv5Var2.R).a(fv5Var.S, fv5Var2.S).b(Integer.valueOf(fv5Var.T), Integer.valueOf(fv5Var2.T), dybVar).c(fv5Var.U, fv5Var2.U).a(fv5Var.V, fv5Var2.V).c(fv5Var.M, fv5Var2.M).c(fv5Var.I, fv5Var2.I).c(fv5Var.K, fv5Var2.K).b(Integer.valueOf(fv5Var.P), Integer.valueOf(fv5Var2.P), dybVar).c(fv5Var.Y, fv5Var2.Y).c(fv5Var.a0, fv5Var2.a0).e();
    }

    @Override // defpackage.ev5
    public final int a() {
        return this.X;
    }

    @Override // defpackage.ev5
    public final boolean b(ev5 ev5Var) {
        fv5 fv5Var = (fv5) ev5Var;
        if (!this.W && !Objects.equals(this.d0, fv5Var.d0)) {
            return false;
        }
        this.J.getClass();
        return this.Y == fv5Var.Y && this.a0 == fv5Var.a0;
    }
}
