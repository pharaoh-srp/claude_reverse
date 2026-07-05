package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fl3 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ String G;
    public final /* synthetic */ iqb H;

    public /* synthetic */ fl3(iqb iqbVar, String str, String str2, int i) {
        this.E = 5;
        this.H = iqbVar;
        this.F = str;
        this.G = str2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        String str = this.G;
        String str2 = this.F;
        iqb iqbVar = this.H;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                hl3.b(x44.p0(1), ld4Var, iqbVar, str2, str);
                break;
            case 1:
                rwj.f(x44.p0(385), ld4Var, iqbVar, str2, str);
                break;
            case 2:
                blk.c(x44.p0(1), ld4Var, iqbVar, str2, str);
                break;
            case 3:
                ouk.d(x44.p0(1), ld4Var, iqbVar, str2, str);
                break;
            case 4:
                oe5.b(x44.p0(1), ld4Var, iqbVar, str2, str);
                break;
            default:
                oe5.d(x44.p0(1), ld4Var, iqbVar, str2, str);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ fl3(String str, iqb iqbVar, String str2, int i) {
        this.E = 0;
        this.F = str;
        this.H = iqbVar;
        this.G = str2;
    }

    public /* synthetic */ fl3(String str, String str2, iqb iqbVar, int i, int i2) {
        this.E = i2;
        this.F = str;
        this.G = str2;
        this.H = iqbVar;
    }
}
