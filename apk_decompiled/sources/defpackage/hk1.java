package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hk1 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ a80 F;

    public /* synthetic */ hk1(a80 a80Var, int i) {
        this.E = i;
        this.F = a80Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        a80 a80Var = this.F;
        xre xreVar = (xre) obj;
        xreVar.getClass();
        switch (i) {
            case 0:
                xreVar.b(((Number) a80Var.e()).floatValue());
                float fFloatValue = (((Number) a80Var.e()).floatValue() * 0.08f) + 0.92f;
                xreVar.l(fFloatValue);
                xreVar.m(fFloatValue);
                xreVar.e(1);
                break;
            case 1:
                xreVar.b(((Number) a80Var.e()).floatValue());
                break;
            default:
                xreVar.d(true);
                xreVar.o(xve.b(((va6) a80Var.e()).E));
                break;
        }
        return ieiVar;
    }
}
