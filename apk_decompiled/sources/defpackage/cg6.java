package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.design.icon.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cg6 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ rf6 F;

    public /* synthetic */ cg6(rf6 rf6Var, int i) {
        this.E = i;
        this.F = rf6Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        fqb fqbVar = fqb.E;
        rf6 rf6Var = this.F;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    ud0 ud0Var = rf6Var.b;
                    ud0 ud0Var2 = ud0.d;
                    cv8.b(a.a(ud0Var, e18Var), null, b.o(fqbVar, 24.0f), 0L, e18Var, 440, 8);
                }
                break;
            default:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    ud0 ud0Var3 = rf6Var.b;
                    ud0 ud0Var4 = ud0.d;
                    cv8.b(a.a(ud0Var3, e18Var2), null, b.o(fqbVar, 24.0f), 0L, e18Var2, 440, 8);
                }
                break;
        }
        return ieiVar;
    }
}
