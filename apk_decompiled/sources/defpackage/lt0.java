package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lt0 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zy7 F;
    public final /* synthetic */ bz7 G;
    public final /* synthetic */ String H;

    public /* synthetic */ lt0(zy7 zy7Var, bz7 bz7Var, String str) {
        this.E = 0;
        this.G = bz7Var;
        this.H = str;
        this.F = zy7Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        String str = this.H;
        bz7 bz7Var = this.G;
        zy7 zy7Var = this.F;
        switch (i) {
            case 0:
                bz7Var.invoke(str);
                zy7Var.a();
                break;
            case 1:
                zy7Var.a();
                bz7Var.invoke(str);
                break;
            default:
                zy7Var.a();
                bz7Var.invoke(str);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ lt0(zy7 zy7Var, bz7 bz7Var, String str, int i) {
        this.E = i;
        this.F = zy7Var;
        this.G = bz7Var;
        this.H = str;
    }
}
