package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fy2 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ tkh F;

    public /* synthetic */ fy2(tkh tkhVar, int i) {
        this.E = i;
        this.F = tkhVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        fqb fqbVar = fqb.E;
        tkh tkhVar = this.F;
        ld4 ld4Var = (ld4) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    cv8.b(a.a(ud0.s1, e18Var), d4c.j0(R.string.chat_starred, e18Var), b.o(fqbVar, ((cz5) e18Var.j(ve4.h)).D(tkhVar.a.b)), gm3.a(e18Var).N, e18Var, 8, 0);
                }
                break;
            default:
                e18 e18Var2 = (e18) ld4Var;
                if (!e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var2.T();
                } else {
                    cv8.b(a.a(ud0.s1, e18Var2), d4c.j0(R.string.project_starred, e18Var2), b.o(fqbVar, ((cz5) e18Var2.j(ve4.h)).D(tkhVar.a.b)), gm3.a(e18Var2).N, e18Var2, 8, 0);
                }
                break;
        }
        return ieiVar;
    }
}
