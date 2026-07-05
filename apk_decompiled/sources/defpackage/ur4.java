package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ur4 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ vr4 F;

    public /* synthetic */ ur4(vr4 vr4Var, int i, int i2) {
        this.E = i2;
        this.F = vr4Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        vr4 vr4Var = this.F;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                bsk.a(vr4Var, ld4Var, x44.p0(1));
                break;
            default:
                bsk.b(vr4Var, ld4Var, x44.p0(1));
                break;
        }
        return ieiVar;
    }
}
