package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class itf implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ jm3 F;

    public /* synthetic */ itf(int i, jm3 jm3Var) {
        this.E = i;
        this.F = jm3Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        fqb fqbVar = fqb.E;
        jm3 jm3Var = this.F;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    tjh.b(d4c.j0(R.string.session_pill_view_pr, e18Var), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jm3Var.h, e18Var, 0, 0, 131070);
                    kxk.g(e18Var, b.t(fqbVar, 8.0f));
                    iv1.b(ud0.d1, null, null, ef2.F, gm3.a(e18Var).l, e18Var, 3120, 4);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    tjh.b(d4c.j0(R.string.session_pill_plan, e18Var2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jm3Var.h, e18Var2, 0, 0, 131070);
                    kxk.g(e18Var2, b.t(fqbVar, 8.0f));
                    iv1.b(ud0.j1, null, null, null, 0L, e18Var2, 48, 28);
                }
                break;
            case 2:
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    tjh.b(d4c.j0(R.string.session_pill_create_pr, e18Var3), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jm3Var.h, e18Var3, 0, 0, 131070);
                    kxk.g(e18Var3, b.t(fqbVar, 8.0f));
                    iv1.b(ud0.d1, null, null, ef2.F, gm3.a(e18Var3).l, e18Var3, 3120, 4);
                }
                break;
            default:
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e18Var4.T();
                } else {
                    tjh.b(d4c.j0(R.string.session_pill_ci, e18Var4), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jm3Var.h, e18Var4, 0, 0, 131070);
                    kxk.g(e18Var4, b.t(fqbVar, 8.0f));
                    iv1.b(ud0.L1, null, null, ef2.F, gm3.a(e18Var4).N, e18Var4, 3120, 4);
                }
                break;
        }
        return ieiVar;
    }
}
