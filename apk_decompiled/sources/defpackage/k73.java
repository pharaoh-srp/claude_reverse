package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k73 implements bz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ zy7 G;
    public final /* synthetic */ qz7 H;

    public /* synthetic */ k73(zy7 zy7Var, zy7 zy7Var2, boolean z) {
        this.F = z;
        this.G = zy7Var;
        this.H = zy7Var2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        qz7 qz7Var = this.H;
        zy7 zy7Var = this.G;
        boolean z = this.F;
        switch (i) {
            case 0:
                zy7 zy7Var2 = (zy7) qz7Var;
                ((w86) obj).getClass();
                if (z) {
                    zy7Var.a();
                }
                return new i83(zy7Var2, z);
            default:
                bz7 bz7Var = (bz7) qz7Var;
                b5g b5gVar = (b5g) obj;
                if (z && b5gVar == b5g.G) {
                    b5gVar = b5g.F;
                }
                return new v4g(z, zy7Var, b5gVar, bz7Var);
        }
    }

    public /* synthetic */ k73(boolean z, zy7 zy7Var, zy7 zy7Var2, bz7 bz7Var) {
        this.F = z;
        this.G = zy7Var;
        this.H = bz7Var;
    }
}
