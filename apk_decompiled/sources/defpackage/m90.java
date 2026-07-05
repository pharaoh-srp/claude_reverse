package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m90 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ iqb G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;

    public /* synthetic */ m90(int i, int i2, iqb iqbVar, String str, boolean z) {
        this.J = str;
        this.F = z;
        this.G = iqbVar;
        this.H = i;
        this.I = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.H;
        Object obj3 = this.J;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                int i3 = this.I;
                xrk.a(iP0, i3, (ld4) obj, this.G, (String) obj3, this.F);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                g34.c(this.F, (qnc) obj3, this.G, (ld4) obj, iP02, this.I);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ m90(boolean z, qnc qncVar, iqb iqbVar, int i, int i2) {
        this.F = z;
        this.J = qncVar;
        this.G = iqbVar;
        this.H = i;
        this.I = i2;
    }
}
