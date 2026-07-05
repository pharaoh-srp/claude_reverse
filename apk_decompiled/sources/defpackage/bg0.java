package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bg0 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zy7 F;

    public /* synthetic */ bg0(int i, zy7 zy7Var) {
        this.E = i;
        this.F = zy7Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        zy7 zy7Var = this.F;
        switch (i) {
            case 0:
                ((xre) obj).b(((Number) zy7Var.a()).floatValue());
                break;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    zy7Var.a();
                }
                break;
            case 2:
                ((lze) obj).getClass();
                break;
            default:
                obj.getClass();
                break;
        }
        return zy7Var.a();
    }
}
