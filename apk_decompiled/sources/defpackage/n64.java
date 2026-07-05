package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n64 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ q68 F;
    public final /* synthetic */ int G;
    public final /* synthetic */ ta4 H;

    public /* synthetic */ n64(q68 q68Var, int i, ta4 ta4Var, int i2, int i3) {
        this.E = i3;
        this.F = q68Var;
        this.G = i;
        this.H = ta4Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        ta4 ta4Var = this.H;
        int i2 = this.G;
        q68 q68Var = this.F;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                qok.a(q68Var, i2, ta4Var, ld4Var, x44.p0(3073));
                break;
            default:
                ctk.c(q68Var, i2, ta4Var, ld4Var, x44.p0(3073));
                break;
        }
        return ieiVar;
    }
}
