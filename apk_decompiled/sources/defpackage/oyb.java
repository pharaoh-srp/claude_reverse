package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oyb implements pz7 {
    public final /* synthetic */ int E = 2;
    public final /* synthetic */ long F;
    public final /* synthetic */ long G;
    public final /* synthetic */ int H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    public /* synthetic */ oyb(int i, long j, long j2, ud0 ud0Var, iqb iqbVar) {
        this.I = ud0Var;
        this.F = j;
        this.G = j2;
        this.J = iqbVar;
        this.H = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.H;
        Object obj3 = this.J;
        Object obj4 = this.I;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                ryb.a(this.F, this.G, (wbj) obj4, (ta4) obj3, (ld4) obj, iP0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                bvk.a((nyj) obj4, (iqb) obj3, this.F, this.G, (ld4) obj, iP02);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP03 = x44.p0(i2 | 1);
                long j = this.F;
                long j2 = this.G;
                ikk.b(iP03, j, j2, (ud0) obj4, (ld4) obj, (iqb) obj3);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ oyb(long j, long j2, wbj wbjVar, ta4 ta4Var, int i) {
        this.F = j;
        this.G = j2;
        this.I = wbjVar;
        this.J = ta4Var;
        this.H = i;
    }

    public /* synthetic */ oyb(nyj nyjVar, iqb iqbVar, long j, long j2, int i) {
        this.I = nyjVar;
        this.J = iqbVar;
        this.F = j;
        this.G = j2;
        this.H = i;
    }
}
