package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rfh implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ vfh F;

    public /* synthetic */ rfh(vfh vfhVar, int i) {
        this.E = i;
        this.F = vfhVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        tp4 tp4Var = null;
        int i2 = 1;
        iei ieiVar = iei.a;
        vfh vfhVar = this.F;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                boolean z = vfhVar.X;
                if (zBooleanValue) {
                    if (((l49) ((n49) ((m49) yb5.o(vfhVar, ve4.m))).a.getValue()).a != 1) {
                        vfhVar.W.C(false);
                    }
                    if (z) {
                        vfhVar.x1(false);
                    }
                } else {
                    vfhVar.t1();
                    i5i i5iVar = vfhVar.U;
                    yih yihVar = i5iVar.a;
                    k6e k6eVar = i5iVar.b;
                    yihVar.b.a().D();
                    dfh dfhVar = yihVar.b;
                    dfhVar.e(null);
                    i5iVar.l(dfhVar);
                    yih.a(yihVar, k6eVar, true, cgh.E);
                    yihVar.f(true);
                    vfhVar.U.a();
                }
                d4c.a0(vfhVar, new pfh(vfhVar, i2));
                return ieiVar;
            case 1:
                gb6 gb6Var = (gb6) obj;
                if (e6e.a(vfhVar) != null) {
                    stj.l(vfhVar, gb6Var);
                }
                return ieiVar;
            case 2:
                hb6 hb6Var = new hb6();
                vfhVar.a0.c(hb6Var);
                vfhVar.e0 = hb6Var;
                mi6 mi6VarA = e6e.a(vfhVar);
                if (mi6VarA != null) {
                    mi6VarA.b.d();
                }
                return ieiVar;
            case 3:
                long jK = aqk.k(vfhVar.V, ((fcc) obj).a);
                int iD = vfhVar.V.d(jK, true);
                if (iD >= 0) {
                    vfhVar.U.j(mwa.m(iD, iD));
                }
                vfhVar.W.H(te8.E, jK);
                return ieiVar;
            case 4:
                vfhVar.u1();
                vfhVar.W.i();
                mi6 mi6VarA2 = e6e.a(vfhVar);
                if (mi6VarA2 != null) {
                    mi6VarA2.b.c();
                }
                return ieiVar;
            case 5:
                vfhVar.u1();
                return ieiVar;
            case 6:
                gb9.D(vfhVar.d1(), null, o45.H, new k7h((oo9) obj, vfhVar, tp4Var, i2), 1);
                return ieiVar;
            case 7:
                List list = (List) obj;
                yjh yjhVarC = vfhVar.V.c();
                return Boolean.valueOf(yjhVarC != null ? list.add(yjhVarC) : false);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                vfhVar.W.l.setValue(bool);
                return ieiVar;
        }
    }
}
