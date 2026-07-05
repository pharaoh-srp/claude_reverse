package defpackage;

import com.anthropic.claude.bell.b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pk1 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ wlg F;

    public /* synthetic */ pk1(int i, nwb nwbVar) {
        this.E = i;
        this.F = nwbVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        wlg wlgVar = this.F;
        s64 s64Var = (s64) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                s64Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((e18) ld4Var).f(s64Var) ? 4 : 2;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    e18Var.T();
                } else {
                    b.f(s64Var, (fn1) wlgVar.getValue(), e18Var, iIntValue & 14);
                }
                break;
            default:
                s64Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((e18) ld4Var).f(s64Var) ? 4 : 2;
                }
                e18 e18Var2 = (e18) ld4Var;
                if (!e18Var2.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    e18Var2.T();
                } else {
                    b.f(s64Var, (fn1) wlgVar.getValue(), e18Var2, iIntValue & 14);
                }
                break;
        }
        return ieiVar;
    }
}
