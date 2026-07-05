package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cv5 extends ev5 implements Comparable {
    public final int I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final boolean R;

    public cv5(int i, v3i v3iVar, int i2, bv5 bv5Var, int i3, String str, String str2) {
        int iF;
        super(i, v3iVar, i2);
        int i4 = 0;
        this.J = pe1.n(i3, false);
        int i5 = this.H.e;
        bv5Var.getClass();
        nz8 nz8Var = bv5Var.r;
        this.K = (i5 & 1) != 0;
        this.L = (i5 & 2) != 0;
        nz8 nz8VarU = str2 != null ? nz8.u(str2) : nz8Var.isEmpty() ? nz8.u("") : nz8Var;
        int i6 = 0;
        while (true) {
            if (i6 >= nz8VarU.size()) {
                iF = 0;
                i6 = Integer.MAX_VALUE;
                break;
            } else {
                iF = gv5.f(this.H, (String) nz8VarU.get(i6), false);
                if (iF > 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        this.M = i6;
        this.N = iF;
        int i7 = str2 != null ? 1088 : 0;
        int i8 = this.H.f;
        wjc wjcVar = gv5.k;
        int iBitCount = (i8 == 0 || i8 != i7) ? Integer.bitCount(i7 & i8) : Integer.MAX_VALUE;
        this.O = iBitCount;
        jw7 jw7Var = this.H;
        this.R = (1088 & jw7Var.f) != 0;
        int iA = gv5.a(jw7Var, bv5Var.s);
        this.P = iA;
        int iF2 = gv5.f(this.H, str, gv5.h(str) == null);
        this.Q = iF2;
        boolean z = iF > 0 || (nz8Var.isEmpty() && iBitCount > 0) || ((nz8Var.isEmpty() && iA != Integer.MAX_VALUE) || this.K || (this.L && iF2 > 0));
        if (pe1.n(i3, bv5Var.B) && z) {
            i4 = 1;
        }
        this.I = i4;
    }

    @Override // defpackage.ev5
    public final int a() {
        return this.I;
    }

    @Override // defpackage.ev5
    public final /* bridge */ /* synthetic */ boolean b(ev5 ev5Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(cv5 cv5Var) {
        s84 s84VarC = s84.a.c(this.J, cv5Var.J);
        Integer numValueOf = Integer.valueOf(this.M);
        Integer numValueOf2 = Integer.valueOf(cv5Var.M);
        dyb dybVar = dyb.F;
        dyb dybVar2 = dyb.G;
        s84 s84VarB = s84VarC.b(numValueOf, numValueOf2, dybVar2);
        int i = cv5Var.N;
        int i2 = this.N;
        s84 s84VarA = s84VarB.a(i2, i);
        int i3 = cv5Var.O;
        int i4 = this.O;
        s84 s84VarC2 = s84VarA.a(i4, i3).b(Integer.valueOf(this.P), Integer.valueOf(cv5Var.P), dybVar2).c(this.K, cv5Var.K);
        Boolean boolValueOf = Boolean.valueOf(this.L);
        Boolean boolValueOf2 = Boolean.valueOf(cv5Var.L);
        if (i2 != 0) {
            dybVar = dybVar2;
        }
        s84 s84VarA2 = s84VarC2.b(boolValueOf, boolValueOf2, dybVar).a(this.Q, cv5Var.Q);
        if (i4 == 0) {
            s84VarA2 = s84VarA2.d(this.R, cv5Var.R);
        }
        return s84VarA2.e();
    }
}
