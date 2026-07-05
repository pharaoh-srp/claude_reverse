package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oma extends ts9 implements pz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ ta4 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oma(ta4 ta4Var, int i, int i2) {
        super(2);
        this.F = i2;
        this.G = ta4Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.F;
        iei ieiVar = iei.a;
        ta4 ta4Var = this.G;
        ld4 ld4Var = (ld4) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                wd6.Q(ta4Var, ld4Var, x44.p0(7));
                break;
            default:
                o3g.b(ta4Var, ld4Var, x44.p0(7));
                break;
        }
        return ieiVar;
    }
}
