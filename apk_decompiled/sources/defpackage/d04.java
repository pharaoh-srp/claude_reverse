package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;
import com.anthropic.claude.code.remote.e;
import com.anthropic.claude.design.icon.a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d04 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ x0a F;

    public /* synthetic */ d04(x0a x0aVar) {
        this.F = x0aVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        x0a x0aVar = this.F;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                e.m(x0aVar, (ld4) obj, x44.p0(1));
                break;
            default:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    wo1 wo1Var = lja.Q;
                    fqb fqbVar = fqb.E;
                    iqb iqbVarJ = gb9.J(fqbVar, 16.0f);
                    cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var, 48);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarJ);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    d4c.i0(e18Var, cd4.f, cxeVarA);
                    d4c.i0(e18Var, cd4.e, hycVarL);
                    d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var, cd4.h);
                    d4c.i0(e18Var, cd4.d, iqbVarE);
                    cv8.b(a.a(ud0.J, e18Var), d4c.j0(R.string.new_session, e18Var), b.o(fqbVar, 32.0f), 0L, e18Var, 392, 8);
                    wd6.K(fxe.a, !x0aVar.b() || x0aVar.j.f(), null, null, null, null, yhk.c, e18Var, 1572870, 30);
                    e18Var.p(true);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ d04(x0a x0aVar, int i) {
        this.F = x0aVar;
    }
}
