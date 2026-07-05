package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hv implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ int G;

    public /* synthetic */ hv(boolean z, int i, int i2) {
        this.E = i2;
        this.F = z;
        this.G = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        long j;
        long j2;
        int i = this.E;
        fqb fqbVar = fqb.E;
        int i2 = 0;
        iei ieiVar = iei.a;
        final int i3 = this.G;
        final boolean z = this.F;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, fqbVar);
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
                    tjh.b(d4c.j0(R.string.chat_list_screen_title, e18Var), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var, 0, 0, 262142);
                    Object objN = e18Var.N();
                    if (objN == jd4.a) {
                        objN = mpk.w(new zy7() { // from class: lv
                            @Override // defpackage.zy7
                            public final Object a() {
                                return Boolean.valueOf(z && i3 > 0);
                            }
                        });
                        e18Var.k0(objN);
                    }
                    wd6.H(s64.a, ((Boolean) ((wlg) objN).getValue()).booleanValue(), null, null, null, null, fd9.q0(-1791250292, new mv(i3, i2), e18Var), e18Var, 1572870, 30);
                    e18Var.p(true);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    if (z) {
                        e18Var2.a0(1958527230);
                        j = gm3.a(e18Var2).M;
                    } else {
                        e18Var2.a0(1958528252);
                        j = gm3.a(e18Var2).n;
                    }
                    e18Var2.p(false);
                    if (z) {
                        e18Var2.a0(1958530972);
                        j2 = gm3.a(e18Var2).n;
                    } else {
                        e18Var2.a0(1958531934);
                        j2 = gm3.a(e18Var2).M;
                    }
                    e18Var2.p(false);
                    long j3 = j2;
                    xo1 xo1Var = lja.K;
                    iqb iqbVarO = b.o(fqbVar, 32.0f);
                    vve vveVar = xve.a;
                    iqb iqbVarT = ez1.t(yfd.p(xn5.t0(iqbVarO, 4.0f, vveVar, 0L, 0L, 28), j, vveVar), MTTypesetterKt.kLineSkipLimitMultiplier, j3, vveVar);
                    o5b o5bVarD = dw1.d(xo1Var, false);
                    int iHashCode2 = Long.hashCode(e18Var2.T);
                    hyc hycVarL2 = e18Var2.l();
                    iqb iqbVarE2 = kxk.E(e18Var2, iqbVarT);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var2.e0();
                    if (e18Var2.S) {
                        e18Var2.k(re4Var2);
                    } else {
                        e18Var2.n0();
                    }
                    d4c.i0(e18Var2, cd4.f, o5bVarD);
                    d4c.i0(e18Var2, cd4.e, hycVarL2);
                    d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode2));
                    d4c.h0(e18Var2, cd4.h);
                    d4c.i0(e18Var2, cd4.d, iqbVarE2);
                    tjh.b(String.valueOf(i3 + 1), null, j3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).g, e18Var2, 0, 0, 131066);
                    e18Var2.p(true);
                }
                break;
            default:
                ((Integer) obj2).intValue();
                qik.g(z, (ld4) obj, x44.p0(i3 | 1));
                break;
        }
        return ieiVar;
    }
}
