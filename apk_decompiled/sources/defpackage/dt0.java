package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dt0 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ float F;

    public /* synthetic */ dt0(int i, float f) {
        this.E = i;
        this.F = f;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        fqb fqbVar = fqb.E;
        float f = this.F;
        ld4 ld4Var = (ld4) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    cv8.b(a.a(ud0.k, e18Var), d4c.j0(R.string.artifact_sheet_footer_previous, e18Var), b.o(fqbVar, f), 0L, e18Var, 8, 8);
                }
                break;
            case 1:
                e18 e18Var2 = (e18) ld4Var;
                if (!e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var2.T();
                } else {
                    cv8.b(a.a(ud0.m, e18Var2), d4c.j0(R.string.artifact_sheet_footer_next, e18Var2), b.o(fqbVar, f), 0L, e18Var2, 8, 8);
                }
                break;
            case 2:
                e18 e18Var3 = (e18) ld4Var;
                if (!e18Var3.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var3.T();
                } else {
                    iqb iqbVarO = b.o(fqbVar, f);
                    o5b o5bVarD = dw1.d(lja.K, false);
                    int iHashCode = Long.hashCode(e18Var3.T);
                    hyc hycVarL = e18Var3.l();
                    iqb iqbVarE = kxk.E(e18Var3, iqbVarO);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var3.e0();
                    if (e18Var3.S) {
                        e18Var3.k(re4Var);
                    } else {
                        e18Var3.n0();
                    }
                    d4c.i0(e18Var3, cd4.f, o5bVarD);
                    d4c.i0(e18Var3, cd4.e, hycVarL);
                    d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var3, cd4.h);
                    d4c.i0(e18Var3, cd4.d, iqbVarE);
                    ez1.a(null, vf2.G, 0L, e18Var3, 48, 5);
                    e18Var3.p(true);
                }
                break;
            default:
                e18 e18Var4 = (e18) ld4Var;
                if (!e18Var4.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var4.T();
                } else {
                    cv8.b(a.a(ud0.k, e18Var4), d4c.j0(R.string.generic_back_button_content_description, e18Var4), b.o(fqbVar, f), 0L, e18Var4, 8, 8);
                }
                break;
        }
        return ieiVar;
    }
}
