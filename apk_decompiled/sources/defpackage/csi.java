package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class csi extends bsi {
    public final String E;
    public final List F;
    public final int G;
    public final jy1 H;
    public final float I;
    public final jy1 J;
    public final float K;
    public final float L;
    public final int M;
    public final int N;
    public final float O;
    public final float P;
    public final float Q;
    public final float R;

    public csi(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2, int i3, jy1 jy1Var, jy1 jy1Var2, String str, List list) {
        this.E = str;
        this.F = list;
        this.G = i;
        this.H = jy1Var;
        this.I = f;
        this.J = jy1Var2;
        this.K = f2;
        this.L = f3;
        this.M = i2;
        this.N = i3;
        this.O = f4;
        this.P = f5;
        this.Q = f6;
        this.R = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || csi.class != obj.getClass()) {
            return false;
        }
        csi csiVar = (csi) obj;
        return this.E.equals(csiVar.E) && x44.r(this.H, csiVar.H) && this.I == csiVar.I && x44.r(this.J, csiVar.J) && this.K == csiVar.K && this.L == csiVar.L && this.M == csiVar.M && this.N == csiVar.N && this.O == csiVar.O && this.P == csiVar.P && this.Q == csiVar.Q && this.R == csiVar.R && this.G == csiVar.G && x44.r(this.F, csiVar.F);
    }

    public final int hashCode() {
        int iM = kgh.m(this.E.hashCode() * 31, 31, this.F);
        jy1 jy1Var = this.H;
        int iB = vb7.b(this.I, (iM + (jy1Var != null ? jy1Var.hashCode() : 0)) * 31, 31);
        jy1 jy1Var2 = this.J;
        return Integer.hashCode(this.G) + vb7.b(this.R, vb7.b(this.Q, vb7.b(this.P, vb7.b(this.O, vb7.c(this.N, vb7.c(this.M, vb7.b(this.L, vb7.b(this.K, (iB + (jy1Var2 != null ? jy1Var2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
