package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t6e implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ String G;
    public final /* synthetic */ iqb H;
    public final /* synthetic */ int I;

    public /* synthetic */ t6e(int i, String str, String str2, iqb iqbVar, int i2) {
        this.E = 0;
        this.I = i;
        this.F = str;
        this.G = str2;
        this.H = iqbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        int i2 = this.I;
        iqb iqbVar = this.H;
        String str = this.G;
        String str2 = this.F;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(1);
                akk.a(this.I, this.F, this.G, this.H, (ld4) obj, iP0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                rlk.e(x44.p0(i2 | 1), (ld4) obj, iqbVar, str2, str);
                break;
            default:
                ((Integer) obj2).getClass();
                htk.b(x44.p0(i2 | 1), (ld4) obj, iqbVar, str2, str);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ t6e(String str, String str2, iqb iqbVar, int i, int i2) {
        this.E = i2;
        this.F = str;
        this.G = str2;
        this.H = iqbVar;
        this.I = i;
    }
}
