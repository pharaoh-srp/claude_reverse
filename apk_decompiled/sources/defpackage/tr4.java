package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tr4 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ vr4 F;

    public /* synthetic */ tr4(vr4 vr4Var, int i) {
        this.E = i;
        this.F = vr4Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        vr4 vr4Var = this.F;
        switch (i) {
            case 0:
                vr4Var.e.a();
                break;
            case 1:
                vr4Var.d.invoke(Boolean.TRUE);
                break;
            default:
                vr4Var.d.invoke(Boolean.FALSE);
                break;
        }
        return ieiVar;
    }
}
