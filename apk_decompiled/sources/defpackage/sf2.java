package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sf2 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ iqb G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;

    public /* synthetic */ sf2(String str, iqb iqbVar, int i, int i2, int i3) {
        this.E = i3;
        this.F = str;
        this.G = iqbVar;
        this.H = i;
        this.I = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.I;
        int i3 = this.H;
        iqb iqbVar = this.G;
        String str = this.F;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                yhk.b(x44.p0(i3 | 1), i2, ld4Var, iqbVar, str);
                break;
            case 1:
                ypk.d(x44.p0(i3 | 1), i2, ld4Var, iqbVar, str);
                break;
            default:
                bj7.h(x44.p0(i3 | 1), i2, ld4Var, iqbVar, str);
                break;
        }
        return ieiVar;
    }
}
