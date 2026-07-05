package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ba6 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ hdc G;
    public final /* synthetic */ o3f H;
    public final /* synthetic */ iqb I;
    public final /* synthetic */ zy7 J;

    public /* synthetic */ ba6(String str, hdc hdcVar, o3f o3fVar, iqb iqbVar, zy7 zy7Var, int i, int i2) {
        this.E = i2;
        this.F = str;
        this.G = hdcVar;
        this.H = o3fVar;
        this.I = iqbVar;
        this.J = zy7Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(3073);
                etj.d(this.F, this.G, this.H, this.I, this.J, (ld4) obj, iP0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(3073);
                qwj.c(this.F, this.G, this.H, this.I, this.J, (ld4) obj, iP02);
                break;
        }
        return ieiVar;
    }
}
