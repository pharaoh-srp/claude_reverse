package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class if8 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ boolean G;

    public /* synthetic */ if8(zy7 zy7Var, boolean z) {
        this.E = 2;
        this.G = z;
        this.F = zy7Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        fqb fqbVar = fqb.E;
        iei ieiVar = iei.a;
        Object obj4 = this.F;
        switch (i) {
            case 0:
                mxd mxdVar = (mxd) obj4;
                mw1 mw1Var = (mw1) obj;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                mw1Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((e18) ld4Var).f(mw1Var) ? 4 : 2;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    e18Var.T();
                } else {
                    bxd.a.a(mxdVar, this.G, mw1Var.a(fqbVar, lja.H), 0L, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, 1572864);
                }
                break;
            case 1:
                mxd mxdVar2 = (mxd) obj4;
                mw1 mw1Var2 = (mw1) obj;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((e18) ld4Var2).f(mw1Var2) ? 4 : 2;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    e18Var2.T();
                } else {
                    bxd.a.a(mxdVar2, this.G, mw1Var2.a(fqbVar, lja.H), 0L, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var2, 1572864);
                }
                break;
            default:
                zy7 zy7Var = (zy7) obj4;
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    e18Var3.T();
                } else if (this.G && zy7Var != null) {
                    e18Var3.a0(424681462);
                    ez1.e(zy7Var, gb9.N(fqb.E, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 11), false, null, null, lok.b, e18Var3, 1572912, 60);
                    e18Var3.p(false);
                } else {
                    e18Var3.a0(425046642);
                    e18Var3.p(false);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ if8(mxd mxdVar, boolean z, int i) {
        this.E = i;
        this.F = mxdVar;
        this.G = z;
    }
}
