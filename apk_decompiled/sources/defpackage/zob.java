package defpackage;

import com.anthropic.claude.api.model.Badge;
import com.anthropic.claude.chat.bottomsheet.model.b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zob implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Badge F;

    public /* synthetic */ zob(Badge badge, int i) {
        this.E = i;
        this.F = badge;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Badge badge = this.F;
        ld4 ld4Var = (ld4) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    kpb.b(badge, null, e18Var, 0);
                }
                break;
            case 1:
                e18 e18Var2 = (e18) ld4Var;
                if (!e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var2.T();
                } else {
                    kpb.b(badge, null, e18Var2, 0);
                }
                break;
            case 2:
                e18 e18Var3 = (e18) ld4Var;
                if (!e18Var3.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var3.T();
                } else {
                    b.b(badge, null, e18Var3, 0);
                }
                break;
            default:
                e18 e18Var4 = (e18) ld4Var;
                if (!e18Var4.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var4.T();
                } else {
                    b.b(badge, null, e18Var4, 0);
                }
                break;
        }
        return ieiVar;
    }
}
