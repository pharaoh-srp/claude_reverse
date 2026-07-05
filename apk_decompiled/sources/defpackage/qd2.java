package defpackage;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qd2 implements bz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Serializable K;
    public final /* synthetic */ Serializable L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;

    public /* synthetic */ qd2(mb0 mb0Var, boolean z, xc2 xc2Var, z9e z9eVar, dae daeVar, l45 l45Var, dae daeVar2, z9e z9eVar2, dae daeVar3, gri griVar) {
        this.G = mb0Var;
        this.F = z;
        this.H = xc2Var;
        this.I = z9eVar;
        this.K = daeVar;
        this.N = l45Var;
        this.L = daeVar2;
        this.J = z9eVar2;
        this.M = daeVar3;
        this.O = griVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj2 = this.O;
        Object obj3 = this.N;
        Object obj4 = this.M;
        Serializable serializable = this.L;
        Serializable serializable2 = this.K;
        Object obj5 = this.J;
        boolean z = this.F;
        Object obj6 = this.I;
        Object obj7 = this.H;
        Object obj8 = this.G;
        tp4 tp4Var = null;
        switch (i) {
            case 0:
                mb0 mb0Var = (mb0) obj8;
                xc2 xc2Var = (xc2) obj7;
                z9e z9eVar = (z9e) obj6;
                dae daeVar = (dae) serializable2;
                l45 l45Var = (l45) obj3;
                dae daeVar2 = (dae) serializable;
                z9e z9eVar2 = (z9e) obj5;
                dae daeVar3 = (dae) obj4;
                gri griVar = (gri) obj2;
                rz7 rz7Var = (rz7) obj;
                rz7Var.getClass();
                if (mb0Var == null || z) {
                    daeVar2.E = gb9.D(l45Var, null, null, new nn1(rz7Var, griVar, tp4Var, 11), 3);
                } else {
                    ed2 ed2Var = ((wc2) xc2Var.F.getValue()).a;
                    z9eVar.E = true;
                    daeVar.E = gb9.D(l45Var, null, null, new ky0(mb0Var, z9eVar, z9eVar2, daeVar3, l45Var, daeVar2, rz7Var, griVar, (tp4) null), 3);
                }
                break;
            default:
                pz7 pz7Var = (pz7) obj8;
                List list = (List) obj7;
                pz7 pz7Var2 = (pz7) obj6;
                bz7 bz7Var = (bz7) obj5;
                String str = (String) serializable2;
                LocalDate localDate = (LocalDate) serializable;
                bz7 bz7Var2 = (bz7) obj4;
                bz7 bz7Var3 = (bz7) obj3;
                zy7 zy7Var = (zy7) obj2;
                j0a j0aVar = (j0a) obj;
                j0aVar.getClass();
                int i2 = 4;
                if (pz7Var != null) {
                    j0a.V(j0aVar, "header", null, new ta4(383640814, true, new ck1(i2, pz7Var)), 2);
                }
                if (list.isEmpty() && pz7Var2 != null) {
                    j0a.V(j0aVar, "empty", null, new ta4(-116095657, true, new ck1(5, pz7Var2)), 2);
                } else {
                    j0aVar.W(list.size(), new z04(new fc4(7), i2, list), new tq(list, 9), new ta4(802480018, true, new zj4(list, bz7Var, str, localDate, bz7Var2, bz7Var3)));
                    if (z) {
                        j0a.V(j0aVar, "load_more", null, new ta4(-274387149, true, new ii(list, 22, zy7Var)), 2);
                    }
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ qd2(pz7 pz7Var, List list, pz7 pz7Var2, boolean z, bz7 bz7Var, String str, LocalDate localDate, bz7 bz7Var2, bz7 bz7Var3, zy7 zy7Var) {
        this.G = pz7Var;
        this.H = list;
        this.I = pz7Var2;
        this.F = z;
        this.J = bz7Var;
        this.K = str;
        this.L = localDate;
        this.M = bz7Var2;
        this.N = bz7Var3;
        this.O = zy7Var;
    }
}
