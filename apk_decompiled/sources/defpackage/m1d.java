package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m1d implements sz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;

    public /* synthetic */ m1d(zy7 zy7Var, boolean z) {
        this.G = zy7Var;
        this.F = z;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj5 = this.G;
        switch (i) {
            case 0:
                zy7 zy7Var = (zy7) obj5;
                mnc mncVar = (mnc) obj2;
                ld4 ld4Var = (ld4) obj3;
                int iH = ebh.h((Integer) obj4, (s64) obj, mncVar);
                if ((iH & 48) == 0) {
                    iH |= ((e18) ld4Var).f(mncVar) ? 32 : 16;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iH & 1, (iH & 145) != 144)) {
                    e18Var.T();
                } else {
                    Object objN = e18Var.N();
                    lz1 lz1Var = jd4.a;
                    if (objN == lz1Var) {
                        objN = mpk.P(Boolean.FALSE);
                        e18Var.k0(objN);
                    }
                    nwb nwbVar = (nwb) objN;
                    if (((Boolean) nwbVar.getValue()).booleanValue()) {
                        e18Var.a0(1434518243);
                        boolean zF = e18Var.f(zy7Var);
                        Object objN2 = e18Var.N();
                        if (zF || objN2 == lz1Var) {
                            objN2 = new pn(zy7Var, nwbVar, 21);
                            e18Var.k0(objN2);
                        }
                        zy7 zy7Var2 = (zy7) objN2;
                        Object objN3 = e18Var.N();
                        if (objN3 == lz1Var) {
                            objN3 = new k3c(8, nwbVar);
                            e18Var.k0(objN3);
                        }
                        o1d.a(zy7Var2, (zy7) objN3, e18Var, 48);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(1434719092);
                        e18Var.p(false);
                    }
                    String strJ0 = d4c.j0(R.string.phone_call_end_call, e18Var);
                    iqb iqbVarC = b.c(gb9.L(gb9.I(fqb.E, mncVar), MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 1), 1.0f);
                    Object objN4 = e18Var.N();
                    if (objN4 == lz1Var) {
                        objN4 = new k3c(9, nwbVar);
                        e18Var.k0(objN4);
                    }
                    dxj.a(strJ0, this.F, iqbVarC, false, null, d12.a, null, 0L, (zy7) objN4, e18Var, 100859904, 216);
                }
                break;
            default:
                String str = (String) obj5;
                ld4 ld4Var2 = (ld4) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((mw1) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(1 & iIntValue, (iIntValue & 129) != 128)) {
                    e18Var2.T();
                } else {
                    if (!this.F) {
                        str = "";
                    }
                    twj.d(str, null, e18Var2, 0);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ m1d(boolean z, String str) {
        this.F = z;
        this.G = str;
    }
}
