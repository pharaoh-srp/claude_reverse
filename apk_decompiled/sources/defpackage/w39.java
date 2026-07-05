package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w39 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ fn1 F;
    public final /* synthetic */ iqb G;

    public /* synthetic */ w39(fn1 fn1Var, iqb iqbVar, int i, int i2) {
        this.E = i2;
        this.F = fn1Var;
        this.G = iqbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        iqb iqbVar = this.G;
        fn1 fn1Var = this.F;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                rvk.b(fn1Var, iqbVar, ld4Var, x44.p0(1));
                break;
            default:
                rvk.c(fn1Var, iqbVar, ld4Var, x44.p0(49));
                break;
        }
        return ieiVar;
    }
}
