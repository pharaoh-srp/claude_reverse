package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class et0 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ iqb F;
    public final /* synthetic */ float G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ qz7 K;
    public final /* synthetic */ Object L;

    public /* synthetic */ et0(int i, int i2, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar, wu8 wu8Var, float f, int i3) {
        this.H = i;
        this.I = i2;
        this.J = zy7Var;
        this.K = zy7Var2;
        this.F = iqbVar;
        this.L = wu8Var;
        this.G = f;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.L;
        qz7 qz7Var = this.K;
        Object obj4 = this.J;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(24577);
                rtk.a(this.H, this.I, (zy7) obj4, (zy7) qz7Var, this.F, (wu8) obj3, this.G, (ld4) obj, iP0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(this.H | 1);
                ypk.c((uj4) obj4, (bz7) qz7Var, this.F, this.G, (hi4) obj3, (ld4) obj, iP02, this.I);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ et0(uj4 uj4Var, bz7 bz7Var, iqb iqbVar, float f, hi4 hi4Var, int i, int i2) {
        this.J = uj4Var;
        this.K = bz7Var;
        this.F = iqbVar;
        this.G = f;
        this.L = hi4Var;
        this.H = i;
        this.I = i2;
    }
}
