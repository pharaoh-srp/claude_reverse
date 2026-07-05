package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ev4 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ lv4 F;

    public /* synthetic */ ev4(lv4 lv4Var, int i) {
        this.E = i;
        this.F = lv4Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        lv4 lv4Var = this.F;
        switch (i) {
            case 0:
                lv4Var.m.goBack();
                break;
            case 1:
                lv4Var.b();
                break;
            case 2:
                lv4Var.b();
                break;
            case 3:
                zy7 zy7Var = lv4Var.e;
                if (zy7Var != null) {
                    zy7Var.a();
                }
                break;
            default:
                zy7 zy7Var2 = lv4Var.f;
                if (zy7Var2 != null) {
                    zy7Var2.a();
                }
                break;
        }
        return ieiVar;
    }
}
