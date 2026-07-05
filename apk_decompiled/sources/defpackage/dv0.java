package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dv0 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ pz7 F;
    public final /* synthetic */ int G;

    public /* synthetic */ dv0(int i, int i2, pz7 pz7Var) {
        this.E = i2;
        this.F = pz7Var;
        this.G = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        int i2 = this.G;
        pz7 pz7Var = this.F;
        switch (i) {
            case 0:
                pz7Var.invoke(Integer.valueOf(i2), Integer.valueOf(i2 - 1));
                break;
            case 1:
                pz7Var.invoke(Integer.valueOf(i2), Integer.valueOf(i2 + 1));
                break;
            case 2:
                pz7Var.invoke(Integer.valueOf(i2), Integer.valueOf(i2 - 1));
                break;
            case 3:
                pz7Var.invoke(Integer.valueOf(i2), 0);
                break;
            default:
                pz7Var.invoke(Integer.valueOf(i2), Integer.valueOf(i2 + 1));
                break;
        }
        return Boolean.TRUE;
    }
}
