package defpackage;

import com.anthropic.claude.bell.b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ok1 implements rz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ mj1 F;
    public final /* synthetic */ pl3 G;
    public final /* synthetic */ wlg H;

    public /* synthetic */ ok1(mj1 mj1Var, pl3 pl3Var, wlg wlgVar) {
        this.F = mj1Var;
        this.G = pl3Var;
        this.H = wlgVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        wlg wlgVar = this.H;
        switch (i) {
            case 0:
                s64 s64Var = (s64) obj;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                s64Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((e18) ld4Var).f(s64Var) ? 4 : 2;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    e18Var.T();
                } else {
                    fn1 fn1Var = (fn1) wlgVar.getValue();
                    mj1 mj1Var = this.F;
                    pl3 pl3Var = this.G;
                    b.g(s64Var, fn1Var, pl3Var, fd9.q0(1452932450, new ok1(mj1Var, pl3Var, wlgVar), e18Var), e18Var, (iIntValue & 14) | 3072, 0);
                }
                break;
            default:
                s64 s64Var2 = (s64) obj;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                s64Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((e18) ld4Var2).f(s64Var2) ? 4 : 2;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    e18Var2.T();
                } else {
                    b.i(s64Var2, this.F, (fn1) wlgVar.getValue(), this.G, e18Var2, iIntValue2 & 14);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ok1(pl3 pl3Var, nwb nwbVar, mj1 mj1Var) {
        this.G = pl3Var;
        this.H = nwbVar;
        this.F = mj1Var;
    }
}
