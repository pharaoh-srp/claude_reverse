package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zv6 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ String G;
    public final /* synthetic */ String H;
    public final /* synthetic */ String I;
    public final /* synthetic */ iqb J;

    public /* synthetic */ zv6(String str, String str2, String str3, String str4, iqb iqbVar, int i, int i2) {
        this.E = i2;
        this.F = str;
        this.G = str2;
        this.H = str3;
        this.I = str4;
        this.J = iqbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(24577);
                aw6.b(this.F, this.G, this.H, this.I, this.J, (ld4) obj, iP0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(1);
                ykk.f(this.F, this.G, this.H, this.I, this.J, (ld4) obj, iP02);
                break;
        }
        return ieiVar;
    }
}
