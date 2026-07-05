package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class veb implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ String G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ zy7 I;
    public final /* synthetic */ iqb J;

    public /* synthetic */ veb(String str, String str2, boolean z, zy7 zy7Var, iqb iqbVar, int i, int i2) {
        this.E = i2;
        this.F = str;
        this.G = str2;
        this.H = z;
        this.I = zy7Var;
        this.J = iqbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(1);
                yeb.a(this.F, this.G, this.H, this.I, this.J, (ld4) obj, iP0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(1);
                ikk.h(this.F, this.G, this.H, this.I, this.J, (ld4) obj, iP02);
                break;
        }
        return ieiVar;
    }
}
