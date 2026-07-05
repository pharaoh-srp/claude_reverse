package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class br6 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zy7 F;
    public final /* synthetic */ ml3 G;

    public /* synthetic */ br6(zy7 zy7Var, ml3 ml3Var, int i) {
        this.E = i;
        this.F = zy7Var;
        this.G = ml3Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        ml3 ml3Var = this.G;
        int i2 = 1;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    ta4 ta4VarQ0 = fd9.q0(-176694388, new br6(this.F, ml3Var, i2), e18Var);
                    qnc qncVar = n2i.a;
                    eg0.d(jlk.a, null, ta4VarQ0, null, MTTypesetterKt.kLineSkipLimitMultiplier, null, n2i.d(d54.g, 0L, 0L, 0L, 0L, e18Var, 62), null, e18Var, 390, 442);
                }
                break;
            default:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    zy7 zy7Var = this.F;
                    if (zy7Var != null) {
                        e18Var2.a0(1727436134);
                        dgj.b(zy7Var, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var2, 0, 14);
                        e18Var2.p(false);
                    } else if (ml3Var == null) {
                        e18Var2.a0(1727725302);
                        e18Var2.p(false);
                    } else {
                        e18Var2.a0(1727555205);
                        int i3 = ml3.f;
                        sf5.b(ml3Var, null, null, e18Var2, 0);
                        e18Var2.p(false);
                    }
                }
                break;
        }
        return ieiVar;
    }
}
