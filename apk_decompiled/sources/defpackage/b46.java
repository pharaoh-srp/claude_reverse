package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b46 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;
    public final /* synthetic */ Object I;

    public /* synthetic */ b46(int i, int i2, int i3, iqb iqbVar) {
        this.F = i;
        this.I = iqbVar;
        this.G = i2;
        this.H = i3;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.H;
        int i3 = this.G;
        Object obj3 = this.I;
        int i4 = this.F;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                xsc.a(i4, i3, (tkh) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i3 | 1);
                jwk.o(i4, iP0, i2, (ld4) obj, (iqb) obj3);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ b46(int i, int i2, tkh tkhVar, int i3) {
        this.F = i;
        this.G = i2;
        this.I = tkhVar;
        this.H = i3;
    }
}
