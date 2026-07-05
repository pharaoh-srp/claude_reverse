package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hwa implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ pz7 K;

    public /* synthetic */ hwa(Object obj, Object obj2, Object obj3, pz7 pz7Var, int i, int i2, int i3) {
        this.E = i3;
        this.H = obj;
        this.I = obj2;
        this.J = obj3;
        this.K = pz7Var;
        this.F = i;
        this.G = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.F;
        Object obj3 = this.J;
        Object obj4 = this.I;
        Object obj5 = this.H;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                jwa.b((n54) obj5, (j1g) obj4, (zbi) obj3, this.K, (ld4) obj, iP0, this.G);
                break;
            default:
                ((Integer) obj2).getClass();
                mwa.l((rwe) obj5, (iqb) obj4, (ojg) obj3, (ta4) this.K, (ld4) obj, x44.p0(i2 | 1), this.G);
                break;
        }
        return ieiVar;
    }
}
