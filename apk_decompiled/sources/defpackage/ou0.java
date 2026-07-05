package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ou0 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ String F;
    public final /* synthetic */ zy7 G;
    public final /* synthetic */ iqb H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;

    public /* synthetic */ ou0(int i, zy7 zy7Var, String str, iqb iqbVar, int i2) {
        this.I = i;
        this.G = zy7Var;
        this.F = str;
        this.H = iqbVar;
        this.J = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(this.J | 1);
                ytk.a(this.I, iP0, (ld4) obj, this.G, this.H, this.F);
                break;
            default:
                ((Integer) obj2).getClass();
                ztj.b(x44.p0(this.I | 1), this.J, (ld4) obj, this.G, this.H, this.F);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ou0(String str, zy7 zy7Var, iqb iqbVar, int i, int i2) {
        this.F = str;
        this.G = zy7Var;
        this.H = iqbVar;
        this.I = i;
        this.J = i2;
    }
}
