package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x15 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ z15 F;

    public /* synthetic */ x15(z15 z15Var, int i) {
        this.E = i;
        this.F = z15Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        z15 z15Var = this.F;
        switch (i) {
            case 0:
                z15Var.c.invoke(Boolean.FALSE);
                break;
            case 1:
                z15Var.c.invoke(Boolean.TRUE);
                break;
            default:
                z15Var.c.invoke(Boolean.FALSE);
                break;
        }
        return ieiVar;
    }
}
