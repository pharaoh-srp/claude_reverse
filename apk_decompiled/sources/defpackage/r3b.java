package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r3b implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ tqh F;

    public /* synthetic */ r3b(tqh tqhVar, int i, int i2) {
        this.E = i2;
        this.F = tqhVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        tqh tqhVar = this.F;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                tqhVar.v(x44.p0(7), ld4Var);
                break;
            case 1:
                tqhVar.x(x44.p0(7), ld4Var);
                break;
            default:
                tqhVar.z(x44.p0(7), ld4Var);
                break;
        }
        return ieiVar;
    }
}
