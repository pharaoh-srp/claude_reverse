package defpackage;

import com.anthropic.claude.tasks.ui.j;
import com.anthropic.claude.tasks.ui.q;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u24 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ List F;
    public final /* synthetic */ t4g G;

    public /* synthetic */ u24(List list, t4g t4gVar, int i) {
        this.E = i;
        this.F = list;
        this.G = t4gVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        lz1 lz1Var = jd4.a;
        t4g t4gVar = this.G;
        List list = this.F;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else {
                    Object objN = e18Var.N();
                    if (objN == lz1Var) {
                        objN = vb7.g(0, e18Var);
                    }
                    isc iscVar = (isc) objN;
                    if (!list.isEmpty()) {
                        iscVar.i(list.size());
                    }
                    int iH = iscVar.h();
                    boolean zH = e18Var.h(list) | e18Var.h(t4gVar);
                    Object objN2 = e18Var.N();
                    if (zH || objN2 == lz1Var) {
                        objN2 = new ik1(list, 29, t4gVar);
                        e18Var.k0(objN2);
                    }
                    x41.g(iH, 0, e18Var, (zy7) objN2, null);
                }
                break;
            default:
                i4g i4gVar = (i4g) obj;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                i4gVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((e18) ld4Var2).f(i4gVar) ? 4 : 2;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    e18Var2.T();
                } else {
                    boolean zH2 = e18Var2.h(t4gVar);
                    Object objN3 = e18Var2.N();
                    if (zH2 || objN3 == lz1Var) {
                        objN3 = new j(t4gVar);
                        e18Var2.k0(objN3);
                    }
                    q.h(0, e18Var2, (bz7) objN3, ttj.m(fqb.E, i4gVar), list);
                }
                break;
        }
        return ieiVar;
    }
}
