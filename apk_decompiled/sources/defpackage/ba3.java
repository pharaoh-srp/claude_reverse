package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ba3 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    public /* synthetic */ ba3(int i, int i2, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar) {
        this.G = i;
        this.I = zy7Var;
        this.J = zy7Var2;
        this.F = iqbVar;
        this.H = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        Object obj3 = this.I;
        int i2 = this.H;
        iei ieiVar = iei.a;
        Object obj4 = this.F;
        Object obj5 = this.J;
        switch (i) {
            case 0:
                zy7 zy7Var = (zy7) obj5;
                iqb iqbVar = (iqb) obj4;
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                int i3 = this.G;
                zni.b(i3, iP0, (ld4) obj, (zy7) obj3, zy7Var, iqbVar);
                break;
            case 1:
                ((Integer) obj2).getClass();
                zh4.b((iqb) obj4, (tkh) obj3, (u2a) obj5, (ld4) obj, x44.p0(this.G | 1), this.H);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                zh4.c(this.I, this.G, (uz9) obj5, (ta4) obj4, (ld4) obj, iP02);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ba3(iqb iqbVar, tkh tkhVar, u2a u2aVar, int i, int i2) {
        this.F = iqbVar;
        this.I = tkhVar;
        this.J = u2aVar;
        this.G = i;
        this.H = i2;
    }

    public /* synthetic */ ba3(Object obj, int i, uz9 uz9Var, ta4 ta4Var, int i2) {
        this.I = obj;
        this.G = i;
        this.J = uz9Var;
        this.F = ta4Var;
        this.H = i2;
    }
}
