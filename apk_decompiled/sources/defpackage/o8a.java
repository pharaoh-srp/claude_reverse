package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o8a implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ te3 F;
    public final /* synthetic */ ue3 G;
    public final /* synthetic */ qbd H;
    public final /* synthetic */ ta4 I;

    public /* synthetic */ o8a(te3 te3Var, ue3 ue3Var, qbd qbdVar, ta4 ta4Var, int i) {
        this.E = i;
        this.F = te3Var;
        this.G = ue3Var;
        this.H = qbdVar;
        this.I = ta4Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        ta4 ta4Var = this.I;
        qbd qbdVar = this.H;
        te3 te3Var = this.F;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                noh nohVar = (noh) obj;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                nohVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? ((e18) ld4Var).f(nohVar) : ((e18) ld4Var).h(nohVar) ? 4 : 2;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    e18Var.T();
                } else {
                    ez1.k(nohVar, null, fd9.q0(371848364, new o8a(this.F, this.G, this.H, this.I, 2), e18Var), e18Var, (iIntValue & 14) | 384);
                }
                break;
            case 1:
                noh nohVar2 = (noh) obj;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                nohVar2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? ((e18) ld4Var2).f(nohVar2) : ((e18) ld4Var2).h(nohVar2) ? 4 : 2;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    e18Var2.T();
                } else {
                    ez1.k(nohVar2, null, fd9.q0(-569072278, new o8a(this.F, this.G, this.H, this.I, 3), e18Var2), e18Var2, (iIntValue2 & 14) | 384);
                }
                break;
            case 2:
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((q90) obj).getClass();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    e18Var3.T();
                } else {
                    ArrayList arrayList = te3Var.b;
                    dch.l(arrayList, te3Var.d, this.G, (qbdVar == null || arrayList.size() <= 1 || !te3Var.c.isEmpty()) ? null : qbdVar, null, null, fd9.q0(-780727954, new xw9(ta4Var, 6), e18Var3), e18Var3, 1576960, 48);
                }
                break;
            default:
                ld4 ld4Var4 = (ld4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((q90) obj).getClass();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    e18Var4.T();
                } else {
                    ArrayList arrayList2 = te3Var.c;
                    dch.l(arrayList2, te3Var.d, this.G, (qbdVar == null || arrayList2.size() <= 1) ? null : qbdVar, null, null, fd9.q0(-1721648596, new xw9(ta4Var, 5), e18Var4), e18Var4, 1576960, 48);
                }
                break;
        }
        return ieiVar;
    }
}
