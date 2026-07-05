package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class eob implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ String G;
    public final /* synthetic */ zy7 H;
    public final /* synthetic */ iqb I;

    public /* synthetic */ eob(String str, String str2, zy7 zy7Var, iqb iqbVar, int i, int i2) {
        this.E = i2;
        this.F = str;
        this.G = str2;
        this.H = zy7Var;
        this.I = iqbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(1);
                knk.l(this.F, this.G, this.H, this.I, (ld4) obj, iP0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(1);
                npf.c(this.F, this.G, this.H, this.I, (ld4) obj, iP02);
                break;
        }
        return ieiVar;
    }
}
