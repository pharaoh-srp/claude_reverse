package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class q10 extends ts9 implements pz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;
    public final /* synthetic */ qz7 I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ qz7 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q10(qz7 qz7Var, Object obj, qz7 qz7Var2, int i, int i2, int i3) {
        super(2);
        this.F = i3;
        this.I = qz7Var;
        this.J = obj;
        this.K = qz7Var2;
        this.G = i;
        this.H = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.F;
        iei ieiVar = iei.a;
        int i2 = this.G;
        qz7 qz7Var = this.K;
        Object obj3 = this.J;
        qz7 qz7Var2 = this.I;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                wpk.a((zy7) qz7Var2, (c36) obj3, (ta4) qz7Var, (ld4) obj, x44.p0(i2 | 1), this.H);
                break;
            default:
                ((Number) obj2).intValue();
                uj5.a((bz7) qz7Var2, (iqb) obj3, (bz7) qz7Var, (ld4) obj, x44.p0(i2 | 1), this.H);
                break;
        }
        return ieiVar;
    }
}
