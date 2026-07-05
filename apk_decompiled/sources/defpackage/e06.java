package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e06 extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ g06 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e06(g06 g06Var, int i) {
        super(1);
        this.F = i;
        this.G = g06Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.F;
        g06 g06Var = this.G;
        switch (i) {
            case 0:
                vai vaiVar = (vai) obj;
                vaiVar.getClass();
                if (vaiVar.c()) {
                    return "*";
                }
                yr9 yr9VarB = vaiVar.b();
                yr9VarB.getClass();
                String strZ = g06Var.Z(yr9VarB);
                if (vaiVar.a() == 1) {
                    return strZ;
                }
                return fsh.E(vaiVar.a()) + ' ' + strZ;
            case 1:
                il4 il4Var = (il4) obj;
                il4Var.getClass();
                return g06Var.C(il4Var);
            default:
                yr9 yr9Var = (yr9) obj;
                yr9Var.getClass();
                return g06Var.Z(yr9Var);
        }
    }
}
