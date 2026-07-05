package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class z00 extends ts9 implements pz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z00(Object obj, int i, Object obj2) {
        super(2);
        this.F = i;
        this.G = obj;
        this.H = obj2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.F;
        iei ieiVar = iei.a;
        Object obj3 = this.H;
        Object obj4 = this.G;
        switch (i) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                wjf wjfVar = (wjf) obj2;
                a10 a10Var = (a10) obj3;
                if (!((xjf) obj4).b.c(wjfVar.f)) {
                    a10Var.i(iIntValue, wjfVar);
                    a10Var.L.r(ieiVar);
                }
                break;
            case 1:
                break;
            case 2:
                ld4 ld4Var = (ld4) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var.T();
                } else {
                    Boolean bool = (Boolean) ((gv9) obj4).g.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    pz7 pz7Var = (pz7) obj3;
                    e18Var.d0(bool);
                    boolean zG = e18Var.g(zBooleanValue);
                    if (zBooleanValue) {
                        pz7Var.invoke(e18Var, 0);
                    } else {
                        if (e18Var.l != 0) {
                            pd4.a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!e18Var.S) {
                            if (zG) {
                                rag ragVar = e18Var.G;
                                int i2 = ragVar.g;
                                int i3 = ragVar.h;
                                md4 md4Var = e18Var.M;
                                md4Var.getClass();
                                md4Var.d(false);
                                md4Var.b.f.a0(cic.d);
                                sf5.f(i2, i3, e18Var.s);
                                e18Var.G.t();
                            } else {
                                e18Var.S();
                            }
                        }
                    }
                    if (e18Var.y && e18Var.G.i == e18Var.z) {
                        e18Var.z = -1;
                        e18Var.y = false;
                    }
                    e18Var.p(false);
                }
                break;
            case 3:
                ((Number) obj2).intValue();
                w5d.a((bv2) obj4, (ta4) obj3, (ld4) obj, x44.p0(49));
                break;
            default:
                ((Number) obj2).intValue();
                o3g.a((iqb) obj4, (ta4) obj3, (ld4) obj, x44.p0(49));
                break;
        }
        return ieiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z00(Object obj, ta4 ta4Var, int i, int i2) {
        super(2);
        this.F = i2;
        this.G = obj;
        this.H = ta4Var;
    }
}
