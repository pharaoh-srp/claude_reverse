package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sx0 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ iqb G;
    public final /* synthetic */ Integer H;

    public /* synthetic */ sx0(String str, iqb iqbVar, Integer num, int i, int i2) {
        this.E = i2;
        this.F = str;
        this.G = iqbVar;
        this.H = num;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Integer num = this.H;
        iqb iqbVar = this.G;
        String str = this.F;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                nuk.a(str, iqbVar, num, ld4Var, x44.p0(1));
                break;
            default:
                wjk.a(str, iqbVar, num, ld4Var, x44.p0(1));
                break;
        }
        return ieiVar;
    }
}
