package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vxf implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ bz7 F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ zy7 H;

    public /* synthetic */ vxf(bz7 bz7Var, Object obj, zy7 zy7Var, int i) {
        this.E = i;
        this.F = bz7Var;
        this.G = obj;
        this.H = zy7Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        zy7 zy7Var = this.H;
        Object obj = this.G;
        bz7 bz7Var = this.F;
        switch (i) {
            case 0:
                bz7Var.invoke(obj);
                zy7Var.a();
                break;
            default:
                bz7Var.invoke(obj);
                zy7Var.a();
                break;
        }
        return ieiVar;
    }
}
