package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wke implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ArrayList F;

    public /* synthetic */ wke(int i, ArrayList arrayList) {
        this.E = i;
        this.F = arrayList;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        ArrayList arrayList = this.F;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else {
                    xke.a(arrayList, e18Var, 0);
                }
                break;
            default:
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else {
                    tjh.b(d4c.k0(R.string.ccr_tool_calls_count, new Object[]{Integer.valueOf(arrayList.size())}, e18Var2), null, gm3.a(e18Var2).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).j, e18Var2, 0, 0, 131066);
                    kxk.g(e18Var2, b.e(fqb.E, 8.0f));
                }
                break;
        }
        return ieiVar;
    }
}
