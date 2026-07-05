package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bx9 extends rok {
    public final zw9 F;
    public final nz9 G;
    public final int H;
    public final /* synthetic */ nz9 I;
    public final /* synthetic */ lx9 J;
    public final /* synthetic */ int K;
    public final /* synthetic */ int L;
    public final /* synthetic */ long M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx9(zw9 zw9Var, nz9 nz9Var, int i, lx9 lx9Var, int i2, int i3, long j) {
        super(2);
        this.I = nz9Var;
        this.J = lx9Var;
        this.K = i2;
        this.L = i3;
        this.M = j;
        this.F = zw9Var;
        this.G = nz9Var;
        this.H = i;
    }

    public final ex9 L0(long j, int i, int i2, int i3, int i4) {
        int i5;
        zw9 zw9Var = this.F;
        Object objC = zw9Var.c(i);
        Object objU = zw9Var.b.u(i);
        List listS0 = s0(this.G, i, j);
        if (rl4.f(j)) {
            i5 = rl4.j(j);
        } else {
            if (!rl4.e(j)) {
                e39.a("does not have fixed height");
            }
            i5 = rl4.i(j);
        }
        fu9 layoutDirection = this.I.F.getLayoutDirection();
        hz9 hz9Var = this.J.m;
        return new ex9(i, objC, i5, i4, layoutDirection, this.K, this.L, listS0, this.M, objU, hz9Var, j, i2, i3);
    }

    @Override // defpackage.rok
    public final oz9 p0(int i, int i2, int i3, long j) {
        return L0(j, i, i2, i3, this.H);
    }
}
