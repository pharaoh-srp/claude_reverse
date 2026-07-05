package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class z83 implements rz7 {
    public final /* synthetic */ nwb E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ m83 G;
    public final /* synthetic */ uhd H;
    public final /* synthetic */ kg3 I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ g93 K;
    public final /* synthetic */ lvh L;

    public z83(nwb nwbVar, boolean z, m83 m83Var, uhd uhdVar, kg3 kg3Var, boolean z2, g93 g93Var, lvh lvhVar) {
        this.E = nwbVar;
        this.F = z;
        this.G = m83Var;
        this.H = uhdVar;
        this.I = kg3Var;
        this.J = z2;
        this.K = g93Var;
        this.L = lvhVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        s64 s64Var = (s64) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Number) obj3).intValue();
        s64Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((e18) ld4Var).f(s64Var) ? 4 : 2;
        }
        int i = 1;
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
            iqb iqbVar = e93.a;
            for (zhb zhbVar : (List) this.E.getValue()) {
                boolean z = zhbVar instanceof yhb;
                yhb yhbVar = z ? (yhb) zhbVar : null;
                mtc mtcVar = yhbVar != null ? yhbVar.a : null;
                boolean z2 = (mtcVar == null || mtcVar.getIsComplete()) ? 0 : i;
                boolean z3 = zhbVar instanceof xhb;
                boolean z4 = this.F;
                m83 m83Var = this.G;
                if (z3) {
                    e18Var.a0(799973112);
                    gwk.a(false, fd9.q0(-669764158, new x83((xhb) zhbVar, z4, m83Var), e18Var), e18Var, 48, i);
                    e18Var.p(false);
                } else {
                    if (!z) {
                        throw ebh.u(e18Var, 1965466147, false);
                    }
                    e18Var.a0(800691413);
                    gwk.a(z2, fd9.q0(133268217, new y83((yhb) zhbVar, this.H, s64Var, this.I, z4, this.J, this.K, m83Var, this.L), e18Var), e18Var, 48, 0);
                    e18Var.p(false);
                }
                i = 1;
            }
        } else {
            e18Var.T();
        }
        return iei.a;
    }
}
