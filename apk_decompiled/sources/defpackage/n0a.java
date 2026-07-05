package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n0a extends rok {
    public final k0a F;
    public final nz9 G;
    public final long H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ nz9 J;
    public final /* synthetic */ int K;
    public final /* synthetic */ int L;
    public final /* synthetic */ qt M;
    public final /* synthetic */ wo1 N;
    public final /* synthetic */ boolean O;
    public final /* synthetic */ int P;
    public final /* synthetic */ int Q;
    public final /* synthetic */ long R;
    public final /* synthetic */ x0a S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0a(long j, boolean z, k0a k0aVar, nz9 nz9Var, int i, int i2, qt qtVar, wo1 wo1Var, boolean z2, int i3, int i4, long j2, x0a x0aVar) {
        super(2);
        this.I = z;
        this.J = nz9Var;
        this.K = i;
        this.L = i2;
        this.M = qtVar;
        this.N = wo1Var;
        this.O = z2;
        this.P = i3;
        this.Q = i4;
        this.R = j2;
        this.S = x0aVar;
        this.F = k0aVar;
        this.G = nz9Var;
        this.H = sl4.b(0, z ? rl4.h(j) : Integer.MAX_VALUE, 0, z ? Integer.MAX_VALUE : rl4.g(j), 5);
    }

    public final q0a L0(int i, long j) {
        k0a k0aVar = this.F;
        Object objC = k0aVar.c(i);
        Object objU = k0aVar.b.u(i);
        return new q0a(i, s0(this.G, i, j), this.I, this.M, this.N, this.J.F.getLayoutDirection(), this.O, this.P, this.Q, i == this.K + (-1) ? 0 : this.L, this.R, objC, objU, this.S.o, j);
    }

    @Override // defpackage.rok
    public final oz9 p0(int i, int i2, int i3, long j) {
        return L0(i, j);
    }
}
