package defpackage;

import com.anthropic.claude.code.remote.bottomsheet.a;
import com.anthropic.claude.code.remote.i;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gy3 implements rz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ i F;
    public final /* synthetic */ t4g G;
    public final /* synthetic */ bz7 H;

    public /* synthetic */ gy3(i iVar, bz7 bz7Var, t4g t4gVar) {
        this.F = iVar;
        this.H = bz7Var;
        this.G = t4gVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        lz1 lz1Var = jd4.a;
        bz7 bz7Var = this.H;
        t4g t4gVar = this.G;
        i iVar = this.F;
        switch (i) {
            case 0:
                i4g i4gVar = (i4g) obj;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                i4gVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((e18) ld4Var).f(i4gVar) ? 4 : 2;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    e18Var.T();
                } else {
                    hi6 hi6Var = iVar.X0;
                    List list = (List) ((wz5) hi6Var.I).getValue();
                    List list2 = (List) ((wz5) hi6Var.J).getValue();
                    String strS = iVar.R0() ? hi6Var.s() : iVar.u0();
                    boolean zF = e18Var.f(bz7Var) | e18Var.h(t4gVar);
                    Object objN = e18Var.N();
                    if (zF || objN == lz1Var) {
                        objN = new kp(bz7Var, 24, t4gVar);
                        e18Var.k0(objN);
                    }
                    ztj.a(list, list2, strS, (bz7) objN, i4gVar, null, e18Var, (iIntValue << 12) & 57344);
                }
                break;
            default:
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((i4g) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else {
                    int size = iVar.W1.size();
                    boolean zH = e18Var2.h(t4gVar) | e18Var2.f(bz7Var);
                    Object objN2 = e18Var2.N();
                    if (zH || objN2 == lz1Var) {
                        objN2 = new ty3(t4gVar, bz7Var, 0);
                        e18Var2.k0(objN2);
                    }
                    a.a(size, (bz7) objN2, iVar.f0, null, e18Var2, 0);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ gy3(i iVar, t4g t4gVar, bz7 bz7Var) {
        this.F = iVar;
        this.G = t4gVar;
        this.H = bz7Var;
    }
}
