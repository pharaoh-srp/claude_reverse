package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xxb extends e45 implements gw5 {
    public final /* synthetic */ gw5 G;
    public final e45 H;
    public final String I;

    /* JADX WARN: Multi-variable type inference failed */
    public xxb(e45 e45Var, String str) {
        gw5 gw5Var = e45Var instanceof gw5 ? (gw5) e45Var : null;
        this.G = gw5Var == null ? er5.a : gw5Var;
        this.H = e45Var;
        this.I = str;
    }

    @Override // defpackage.e45
    public final void O0(c45 c45Var, Runnable runnable) {
        this.H.O0(c45Var, runnable);
    }

    @Override // defpackage.gw5
    public final y86 P(long j, Runnable runnable, c45 c45Var) {
        return this.G.P(j, runnable, c45Var);
    }

    @Override // defpackage.e45
    public final void P0(c45 c45Var, Runnable runnable) {
        this.H.P0(c45Var, runnable);
    }

    @Override // defpackage.e45
    public final boolean Q0(c45 c45Var) {
        return this.H.Q0(c45Var);
    }

    @Override // defpackage.gw5
    public final void l0(long j, ua2 ua2Var) {
        this.G.l0(j, ua2Var);
    }

    @Override // defpackage.e45
    public final String toString() {
        return this.I;
    }
}
