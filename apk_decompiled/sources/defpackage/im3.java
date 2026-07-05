package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class im3 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;

    public /* synthetic */ im3(boolean z, int i) {
        this.E = i;
        this.F = z;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        boolean z = this.F;
        ld4 ld4Var = (ld4) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    o5b o5bVarD = dw1.d(lja.G, false);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    fqb fqbVar = fqb.E;
                    iqb iqbVarE = kxk.E(e18Var, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    d4c.i0(e18Var, cd4.f, o5bVarD);
                    d4c.i0(e18Var, cd4.e, hycVarL);
                    d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var, cd4.h);
                    d4c.i0(e18Var, cd4.d, iqbVarE);
                    cv8.b(a.a(ud0.M0, e18Var), d4c.j0(z ? R.string.generic_button_open_menu_new_feature : R.string.generic_button_open_menu, e18Var), null, 0L, e18Var, 8, 12);
                    if (z) {
                        e18Var.a0(-685791036);
                        dw1.a(yfd.p(b.o(sf5.M(nw1.a.a(fqbVar, lja.I), 2.0f, -2.0f), 8.0f), gm3.a(e18Var).c, xve.a), e18Var, 0);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(-685394143);
                        e18Var.p(false);
                    }
                    e18Var.p(true);
                }
                break;
            default:
                e18 e18Var2 = (e18) ld4Var;
                if (!e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var2.T();
                } else {
                    knk.e(Boolean.valueOf(z), null, kxk.N(200, 0, null, 6), "iconCrossfade", mpk.b, e18Var2, 28032, 2);
                }
                break;
        }
        return ieiVar;
    }
}
