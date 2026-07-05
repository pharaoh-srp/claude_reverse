package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class b89 implements arb {
    public final l45 E;
    public final ij8 F;
    public final a70 G;
    public final Object H;
    public int I;
    public long J;
    public ua2 K;

    public b89(drh drhVar) {
        ij8 ij8Var = new ij8(25);
        this.E = drhVar;
        this.F = ij8Var;
        this.G = new a70(new xi4(23, this));
        this.H = new Object();
        this.I = 5;
    }

    @Override // defpackage.c45
    public final Object K(pz7 pz7Var, Object obj) {
        return pz7Var.invoke(obj, this);
    }

    @Override // defpackage.c45
    public final c45 S(b45 b45Var) {
        return nai.W(this, b45Var);
    }

    public final void a() {
        synchronized (this.H) {
            ua2 ua2Var = this.K;
            if (ua2Var != null) {
                ua2Var.q(null);
            }
        }
    }

    @Override // defpackage.arb
    public final Object b0(tp4 tp4Var, bz7 bz7Var) {
        return this.G.b0(tp4Var, bz7Var);
    }

    @Override // defpackage.c45
    public final c45 r0(c45 c45Var) {
        return nai.Z(this, c45Var);
    }

    @Override // defpackage.c45
    public final a45 x0(b45 b45Var) {
        return nai.C(this, b45Var);
    }
}
