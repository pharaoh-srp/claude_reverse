package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jhg implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ long F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ int H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    public /* synthetic */ jhg(ud0 ud0Var, boolean z, long j, iqb iqbVar, int i) {
        this.I = ud0Var;
        this.G = z;
        this.F = j;
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
                owj.a((ud0) obj4, this.G, this.F, (iqb) obj3, (ld4) obj, iP0);
                break;
            default:
                ((Integer) obj2).intValue();
                int iP02 = x44.p0(i2 | 1);
                yrk.b((String) obj4, (String) obj3, this.F, this.G, (ld4) obj, iP02);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ jhg(String str, String str2, long j, boolean z, int i) {
        this.I = str;
        this.J = str2;
        this.F = j;
        this.G = z;
        this.H = i;
    }
}
