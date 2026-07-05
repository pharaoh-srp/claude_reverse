package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class df2 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ String F;
    public final /* synthetic */ ud0 G;
    public final /* synthetic */ iqb H;
    public final /* synthetic */ long I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;
    public final /* synthetic */ Object L;

    public /* synthetic */ df2(ud0 ud0Var, String str, iqb iqbVar, ef2 ef2Var, long j, int i, int i2) {
        this.G = ud0Var;
        this.F = str;
        this.H = iqbVar;
        this.L = ef2Var;
        this.I = j;
        this.J = i;
        this.K = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.J;
        Object obj3 = this.L;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                iv1.b(this.G, this.F, this.H, (ef2) obj3, this.I, (ld4) obj, iP0, this.K);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                dgj.e(this.F, this.G, (zy7) obj3, this.H, this.I, (ld4) obj, iP02, this.K);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ df2(String str, ud0 ud0Var, zy7 zy7Var, iqb iqbVar, long j, int i, int i2) {
        this.F = str;
        this.G = ud0Var;
        this.L = zy7Var;
        this.H = iqbVar;
        this.I = j;
        this.J = i;
        this.K = i2;
    }
}
