package defpackage;

import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class xu5 extends ev5 implements Comparable {
    public final int I;
    public final boolean J;
    public final String K;
    public final bv5 L;
    public final boolean M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final boolean R;
    public final boolean S;
    public final int T;
    public final int U;
    public final boolean V;
    public final int W;
    public final int X;
    public final int Y;
    public final int Z;
    public final boolean a0;
    public final boolean b0;
    public final boolean c0;

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public xu5(int r8, defpackage.v3i r9, int r10, defpackage.bv5 r11, int r12, boolean r13, defpackage.vu5 r14, int r15) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xu5.<init>(int, v3i, int, bv5, int, boolean, vu5, int):void");
    }

    @Override // defpackage.ev5
    public final int a() {
        return this.I;
    }

    @Override // defpackage.ev5
    public final boolean b(ev5 ev5Var) {
        int i;
        String str;
        xu5 xu5Var = (xu5) ev5Var;
        jw7 jw7Var = xu5Var.H;
        this.L.getClass();
        jw7 jw7Var2 = this.H;
        int i2 = jw7Var2.G;
        if (i2 == -1 || i2 != jw7Var.G) {
            return false;
        }
        return (this.R || ((str = jw7Var2.o) != null && TextUtils.equals(str, jw7Var.o))) && (i = jw7Var2.H) != -1 && i == jw7Var.H && this.a0 == xu5Var.a0 && this.b0 == xu5Var.b0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(xu5 xu5Var) {
        boolean z = this.M;
        boolean z2 = this.J;
        wjc wjcVarA = (z2 && z) ? gv5.k : gv5.k.a();
        boolean z3 = xu5Var.M;
        int i = xu5Var.Y;
        s84 s84VarC = s84.a.c(z, z3);
        Integer numValueOf = Integer.valueOf(this.O);
        Integer numValueOf2 = Integer.valueOf(xu5Var.O);
        dyb dybVar = dyb.G;
        s84 s84VarB = s84VarC.b(numValueOf, numValueOf2, dybVar).a(this.N, xu5Var.N).a(this.P, xu5Var.P).b(Integer.valueOf(this.Q), Integer.valueOf(xu5Var.Q), dybVar).c(this.V, xu5Var.V).c(this.S, xu5Var.S).b(Integer.valueOf(this.T), Integer.valueOf(xu5Var.T), dybVar).a(this.U, xu5Var.U).c(z2, xu5Var.J).b(Integer.valueOf(this.Z), Integer.valueOf(xu5Var.Z), dybVar);
        this.L.getClass();
        s84 s84VarB2 = s84VarB.c(this.a0, xu5Var.a0).c(this.b0, xu5Var.b0).c(this.c0, xu5Var.c0).b(Integer.valueOf(this.W), Integer.valueOf(xu5Var.W), wjcVarA).b(Integer.valueOf(this.X), Integer.valueOf(xu5Var.X), wjcVarA);
        if (Objects.equals(this.K, xu5Var.K)) {
            s84VarB2 = s84VarB2.b(Integer.valueOf(this.Y), Integer.valueOf(i), wjcVarA);
        }
        return s84VarB2.e();
    }
}
