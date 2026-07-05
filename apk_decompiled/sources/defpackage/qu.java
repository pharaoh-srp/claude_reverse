package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qu implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ yih F;

    public /* synthetic */ qu(yih yihVar, int i) {
        this.E = i;
        this.F = yihVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        fqb fqbVar = fqb.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else {
                    gwk.f(this.F, b.g(b.c(gb9.J(fqbVar, e84.h), 1.0f), 40.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), null, true, d4c.j0(R.string.search_chats, e18Var), null, gm3.a(e18Var).u, gm3.a(e18Var).n, gm3.a(e18Var).M, gm3.a(e18Var).O, gm3.a(e18Var).O, e84.g, xve.b(12.0f), e18Var, 3072, 36);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else {
                    gwk.f(this.F, b.g(b.c(gb9.J(fqbVar, e84.h), 1.0f), 40.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), null, true, d4c.j0(R.string.project_list_search_placeholder, e18Var2), null, gm3.a(e18Var2).u, gm3.a(e18Var2).n, gm3.a(e18Var2).M, gm3.a(e18Var2).O, gm3.a(e18Var2).O, e84.g, xve.b(12.0f), e18Var2, 3072, 36);
                }
                break;
            default:
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    e18Var3.T();
                } else {
                    yih yihVar = this.F;
                    boolean zF = e18Var3.f(yihVar);
                    Object objN = e18Var3.N();
                    if (zF || objN == jd4.a) {
                        objN = new ez3(yihVar, 3);
                        e18Var3.k0(objN);
                    }
                    ez1.e((zy7) objN, null, false, null, null, rqk.b, e18Var3, 1572864, 62);
                }
                break;
        }
        return ieiVar;
    }
}
