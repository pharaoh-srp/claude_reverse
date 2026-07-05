package defpackage;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class hn9 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ in9 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hn9(in9 in9Var, int i) {
        super(0);
        this.F = i;
        this.G = in9Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        in9 in9Var = this.G;
        switch (i) {
            case 0:
                return vpi.d(in9Var.a());
            default:
                lrc lrcVarA = in9Var.a();
                ol9 ol9Var = in9Var.E;
                if (!(lrcVarA instanceof l6e) || !x44.r(vpi.g(ol9Var.t()), lrcVarA) || ol9Var.t().getKind() != 2) {
                    return (Type) ol9Var.q().a().get(in9Var.F);
                }
                bo5 bo5VarH = ol9Var.t().h();
                bo5VarH.getClass();
                Class clsJ = vpi.j((qqb) bo5VarH);
                if (clsJ != null) {
                    return clsJ;
                }
                rl7.n("Cannot determine receiver Java type of inherited declaration: ", lrcVarA);
                return null;
        }
    }
}
