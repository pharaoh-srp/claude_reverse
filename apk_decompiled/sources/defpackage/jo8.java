package defpackage;

import androidx.compose.foundation.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.project.knowledge.f;
import com.anthropic.claude.ui.demo.app.UiDemoAppDestination;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jo8 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ rwe F;

    public /* synthetic */ jo8(rwe rweVar) {
        this.E = 0;
        this.F = rweVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        fqb fqbVar;
        int i = this.E;
        iei ieiVar = iei.a;
        lz1 lz1Var = jd4.a;
        rwe rweVar = this.F;
        switch (i) {
            case 0:
                mnc mncVar = (mnc) obj;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                mncVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((e18) ld4Var).f(mncVar) ? 4 : 2;
                }
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    j9f j9fVarY = mpk.Y(e18Var);
                    fqb fqbVar2 = fqb.E;
                    iqb iqbVarL = gb9.L(gb9.I(mpk.b0(fqbVar2, j9fVarY, true), mncVar), MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, 1);
                    q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarL);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    d4c.i0(e18Var, cd4.f, q64VarA);
                    d4c.i0(e18Var, cd4.e, hycVarL);
                    d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var, cd4.h);
                    d4c.i0(e18Var, cd4.d, iqbVarE);
                    e18Var.a0(-354191049);
                    for (UiDemoAppDestination uiDemoAppDestination : UiDemoAppDestination.getEntries()) {
                        if (uiDemoAppDestination == UiDemoAppDestination.HOME) {
                            fqbVar = fqbVar2;
                        } else {
                            boolean zH = e18Var.h(rweVar) | e18Var.d(uiDemoAppDestination.ordinal());
                            Object objN = e18Var.N();
                            if (zH || objN == lz1Var) {
                                objN = new w95(rweVar, 24, uiDemoAppDestination);
                                e18Var.k0(objN);
                            }
                            fqbVar = fqbVar2;
                            kwj.e(pmk.c, b.c(fqbVar2, false, null, null, null, (zy7) objN, 15), MTTypesetterKt.kLineSkipLimitMultiplier, null, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(-1626695725, new mk4(25, uiDemoAppDestination), e18Var), e18Var, 12582918, 124);
                        }
                        fqbVar2 = fqbVar;
                    }
                    e18Var.p(false);
                    e18Var.p(true);
                } else {
                    e18Var.T();
                }
                break;
            case 1:
                s64 s64Var = (s64) obj;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                s64Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((e18) ld4Var2).f(s64Var) ? 4 : 2;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    boolean zH2 = e18Var2.h(rweVar);
                    Object objN2 = e18Var2.N();
                    if (zH2 || objN2 == lz1Var) {
                        objN2 = new av(rweVar, 25);
                        e18Var2.k0(objN2);
                    }
                    f.a(s64Var, (zy7) objN2, e18Var2, iIntValue2 & 14);
                } else {
                    e18Var2.T();
                }
                break;
            default:
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var3 = (e18) ld4Var3;
                if (e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    boolean zH3 = e18Var3.h(rweVar);
                    Object objN3 = e18Var3.N();
                    if (zH3 || objN3 == lz1Var) {
                        objN3 = new eyf(rweVar, 23);
                        e18Var3.k0(objN3);
                    }
                    hvk.a((zy7) objN3, e18Var3, 0);
                } else {
                    e18Var3.T();
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ jo8(rwe rweVar, int i) {
        this.E = i;
        this.F = rweVar;
    }
}
