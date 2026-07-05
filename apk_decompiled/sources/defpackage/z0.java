package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z0 extends ts9 implements pz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(int i, Object obj) {
        super(2);
        this.F = i;
        this.G = obj;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.F;
        iei ieiVar = iei.a;
        Object obj3 = this.G;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Number) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ((a1) obj3).a(0, e18Var);
                } else {
                    e18Var.T();
                }
                return ieiVar;
            case 1:
                zo6 zo6Var = (zo6) obj;
                zo6 zo6Var2 = (zo6) obj2;
                zo6 zo6Var3 = zo6.G;
                return Boolean.valueOf(zo6Var == zo6Var3 && zo6Var2 == zo6Var3 && !((d77) obj3).a.e);
            case 2:
                ((Number) obj2).intValue();
                ((ed4) obj3).a(x44.p0(1), (ld4) obj);
                return ieiVar;
            case 3:
                iqb iqbVar = (iqb) obj;
                iqb iqbVarD = (gqb) obj2;
                ld4 ld4Var2 = (ld4) obj3;
                if (iqbVarD instanceof id4) {
                    rz7 rz7Var = ((id4) iqbVarD).E;
                    nai.n(3, rz7Var);
                    iqbVarD = kxk.D(ld4Var2, (iqb) rz7Var.invoke(fqb.E, ld4Var2, 0));
                }
                return iqbVar.B(iqbVarD);
            default:
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var3;
                if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    List list = (List) obj3;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        pz7 pz7Var = (pz7) list.get(i2);
                        int iHashCode = Long.hashCode(e18Var2.T);
                        dd4.e.getClass();
                        v00 v00Var = cd4.c;
                        e18Var2.e0();
                        if (e18Var2.S) {
                            e18Var2.k(v00Var);
                        } else {
                            e18Var2.n0();
                        }
                        d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
                        pz7Var.invoke(e18Var2, 0);
                        e18Var2.p(true);
                    }
                } else {
                    e18Var2.T();
                }
                return ieiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(ed4 ed4Var, int i) {
        super(2);
        this.F = 2;
        this.G = ed4Var;
    }
}
