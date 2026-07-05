package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uf2 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ zy7 G;
    public final /* synthetic */ iqb H;

    public /* synthetic */ uf2(String str, zy7 zy7Var, iqb iqbVar, int i, int i2) {
        this.E = i2;
        this.F = str;
        this.G = zy7Var;
        this.H = iqbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        iqb iqbVar = this.H;
        zy7 zy7Var = this.G;
        String str = this.F;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                zhk.a(x44.p0(1), ld4Var, zy7Var, iqbVar, str);
                break;
            case 1:
                ljk.a(x44.p0(1), ld4Var, zy7Var, iqbVar, str);
                break;
            case 2:
                csg.e(x44.p0(1), ld4Var, zy7Var, iqbVar, str);
                break;
            case 3:
                ztk.c(x44.p0(1), ld4Var, zy7Var, iqbVar, str);
                break;
            case 4:
                nik.d(x44.p0(1), ld4Var, zy7Var, iqbVar, str);
                break;
            case 5:
                djk.a(x44.p0(1), ld4Var, zy7Var, iqbVar, str);
                break;
            default:
                qik.f(x44.p0(1), ld4Var, zy7Var, iqbVar, str);
                break;
        }
        return ieiVar;
    }
}
