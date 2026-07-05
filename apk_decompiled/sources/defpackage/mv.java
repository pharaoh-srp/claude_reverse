package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mv implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    public /* synthetic */ mv(int i, int i2) {
        this.E = i2;
        this.F = i;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        hj6 hj6Var = tf2.E;
        fqb fqbVar = fqb.E;
        iei ieiVar = iei.a;
        int i2 = this.F;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    kxk.g(e18Var, b.e(fqbVar, 16.0f));
                    tjh.b(d4c.k0(R.string.chat_list_selected_count, new Object[]{Integer.valueOf(i2)}, e18Var), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).e, e18Var, 0, 0, 131070);
                    kxk.g(e18Var, b.e(fqbVar, 16.0f));
                } else {
                    e18Var.T();
                }
                break;
            case 1:
                int iIntValue2 = ((Integer) obj).intValue();
                ((Integer) obj3).getClass();
                e18 e18Var2 = (e18) ((ld4) obj2);
                e18Var2.a0(1357738605);
                qnc qncVar = qf2.a;
                hj6Var.getClass();
                oxf oxfVarB = qf2.b(hj6.L(iIntValue2, i2), e18Var2, 48);
                e18Var2.p(false);
                break;
            case 2:
                int iIntValue3 = ((Integer) obj).intValue();
                ((Integer) obj3).getClass();
                e18 e18Var3 = (e18) ((ld4) obj2);
                e18Var3.a0(1756289052);
                qnc qncVar2 = qf2.a;
                hj6Var.getClass();
                oxf oxfVarB2 = qf2.b(hj6.L(iIntValue3, i2), e18Var3, 48);
                e18Var3.p(false);
                break;
            case 3:
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var4 = (e18) ld4Var2;
                if (e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    int iE0 = wd6.e0(i2, 1, 5);
                    for (int i3 = 0; i3 < iE0; i3++) {
                        fuk.n(null, e18Var4, 0);
                    }
                } else {
                    e18Var4.T();
                }
                break;
            default:
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var5 = (e18) ld4Var3;
                if (e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    xo1 xo1Var = lja.K;
                    iqb iqbVarV = b.v(gb9.K(fqbVar, 1.0f, 2.0f), csg.A(14, e18Var5), MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                    o5b o5bVarD = dw1.d(xo1Var, false);
                    int iHashCode = Long.hashCode(e18Var5.T);
                    hyc hycVarL = e18Var5.l();
                    iqb iqbVarE = kxk.E(e18Var5, iqbVarV);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var5.e0();
                    if (e18Var5.S) {
                        e18Var5.k(re4Var);
                    } else {
                        e18Var5.n0();
                    }
                    d4c.i0(e18Var5, cd4.f, o5bVarD);
                    d4c.i0(e18Var5, cd4.e, hycVarL);
                    d4c.i0(e18Var5, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var5, cd4.h);
                    d4c.i0(e18Var5, cd4.d, iqbVarE);
                    tjh.b(i2 > 99 ? "99+" : String.valueOf(i2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, tkh.b(((jm3) gm3.c(e18Var5).e.E).h, 0L, 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777151), e18Var5, 0, 24960, 110590);
                    e18Var5.p(true);
                } else {
                    e18Var5.T();
                }
                break;
        }
        return ieiVar;
    }
}
