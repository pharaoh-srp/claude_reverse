package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ew implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ uv F;
    public final /* synthetic */ zy7 G;
    public final /* synthetic */ zy7 H;

    public /* synthetic */ ew(uv uvVar, zy7 zy7Var, zy7 zy7Var2, int i) {
        this.E = i;
        this.F = uvVar;
        this.G = zy7Var;
        this.H = zy7Var2;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        zy7 zy7Var = this.H;
        zy7 zy7Var2 = this.G;
        uv uvVar = this.F;
        switch (i) {
            case 0:
                if (!((Boolean) uvVar.v.getValue()).booleanValue()) {
                    zy7Var.a();
                } else {
                    zy7Var2.a();
                }
                break;
            default:
                if (!((Boolean) uvVar.v.getValue()).booleanValue()) {
                    zy7Var.a();
                } else {
                    zy7Var2.a();
                }
                break;
        }
        return ieiVar;
    }
}
