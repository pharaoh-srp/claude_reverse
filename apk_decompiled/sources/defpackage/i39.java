package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i39 implements pz7 {
    public final /* synthetic */ int E = 2;
    public final /* synthetic */ Object F;
    public final /* synthetic */ long G;
    public final /* synthetic */ int H;
    public final /* synthetic */ Object I;

    public /* synthetic */ i39(long j, v8g v8gVar, pz7 pz7Var, int i) {
        this.G = j;
        this.I = v8gVar;
        this.F = pz7Var;
        this.H = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        int i2 = this.H;
        iei ieiVar = iei.a;
        Object obj3 = this.F;
        Object obj4 = this.I;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                nvk.c((mw1) obj4, (h39) obj3, this.G, (ld4) obj, iP0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                nvk.a((h39) obj3, (iqb) obj4, this.G, (ld4) obj, iP02);
                break;
            case 2:
                ld4 ld4Var = (ld4) obj;
                ((Integer) obj2).getClass();
                int iP03 = x44.p0(i2 | 1);
                long j = this.G;
                lvj.d(iP03, j, ld4Var, (pz7) obj3, (v8g) obj4);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP04 = x44.p0(1);
                yjk.a((zy7) obj4, (iqb) obj3, this.G, (ld4) obj, iP04, this.H);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ i39(mw1 mw1Var, h39 h39Var, long j, int i) {
        this.I = mw1Var;
        this.F = h39Var;
        this.G = j;
        this.H = i;
    }

    public /* synthetic */ i39(zy7 zy7Var, iqb iqbVar, long j, int i, int i2) {
        this.I = zy7Var;
        this.F = iqbVar;
        this.G = j;
        this.H = i2;
    }

    public /* synthetic */ i39(h39 h39Var, iqb iqbVar, long j, int i) {
        this.F = h39Var;
        this.I = iqbVar;
        this.G = j;
        this.H = i;
    }
}
