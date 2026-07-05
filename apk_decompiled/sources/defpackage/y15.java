package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y15 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ z15 F;

    public /* synthetic */ y15(z15 z15Var, int i, int i2) {
        this.E = i2;
        this.F = z15Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        z15 z15Var = this.F;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                gtk.b(z15Var, ld4Var, x44.p0(1));
                break;
            default:
                gtk.c(z15Var, ld4Var, x44.p0(1));
                break;
        }
        return ieiVar;
    }
}
