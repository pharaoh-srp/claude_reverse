package defpackage;

import com.anthropic.claude.code.remote.stores.b;
import com.anthropic.claude.types.strings.SessionId;

/* JADX INFO: loaded from: classes3.dex */
public final class gz3 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ gz3(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.G;
        Object obj4 = this.F;
        switch (i) {
            case 0:
                String strM1120unboximpl = ((SessionId) obj).m1120unboximpl();
                bz7 bz7Var = (bz7) obj2;
                strM1120unboximpl.getClass();
                bz7Var.getClass();
                gb9.D((l45) obj4, null, null, new cm(bz7Var, (b) obj3, strM1120unboximpl, null, 24), 3);
                return ieiVar;
            default:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Number) obj2).intValue();
                jta jtaVar = (jta) obj4;
                lsc lscVar = jtaVar.c;
                if ((iIntValue & 3) == 2) {
                    e18 e18Var = (e18) ld4Var;
                    if (e18Var.C()) {
                        e18Var.T();
                        return ieiVar;
                    }
                }
                e18 e18Var2 = (e18) ld4Var;
                e18Var2.a0(-2039993954);
                a0 a0Var = e18Var2.a;
                hqa hqaVar = (hqa) a0Var;
                n88 n88Var = hqaVar.I;
                kta ktaVar = hqaVar.J;
                if (((Boolean) jtaVar.a.getValue()).booleanValue()) {
                    ktaVar.setImportantForAccessibility(4);
                }
                cz5 cz5Var = (cz5) e18Var2.j(ve4.h);
                fu9 fu9Var = (fu9) e18Var2.j(ve4.n);
                e18Var2.a0(-513396093);
                boolean zF = e18Var2.f(jtaVar) | e18Var2.h(n88Var) | e18Var2.f(cz5Var) | e18Var2.f(fu9Var);
                Object objN = e18Var2.N();
                if (zF || objN == jd4.a) {
                    x04 x04Var = new x04(jtaVar, n88Var, cz5Var, fu9Var, 1);
                    e18Var2.k0(x04Var);
                    objN = x04Var;
                }
                zy7 zy7Var = (zy7) objN;
                e18Var2.p(false);
                if (!(a0Var instanceof hqa)) {
                    iuj.A();
                    throw null;
                }
                e18Var2.Y();
                if (e18Var2.S) {
                    e18Var2.k(zy7Var);
                } else {
                    e18Var2.n0();
                }
                d4c.q0(e18Var2, bw9.O, cz5Var);
                d4c.q0(e18Var2, bw9.Q, fu9Var);
                d4c.q0(e18Var2, bw9.R, (String) jtaVar.b.getValue());
                d4c.q0(e18Var2, new hta(n88Var, 16), (mnc) jtaVar.d.getValue());
                if (jtaVar.e.getValue() != null) {
                    mr9.o();
                    return null;
                }
                d4c.i0(e18Var2, new hta(n88Var, 17), null);
                jtaVar.a().getClass();
                Boolean bool = Boolean.FALSE;
                d4c.i0(e18Var2, new hta(n88Var, 18), bool);
                jtaVar.a().getClass();
                d4c.i0(e18Var2, new hta(n88Var, 19), bool);
                d4c.i0(e18Var2, new hta(n88Var, 20), Boolean.valueOf(jtaVar.a().a));
                jtaVar.a().getClass();
                d4c.i0(e18Var2, new hta(n88Var, 21), bool);
                jtaVar.a().getClass();
                d4c.i0(e18Var2, new hta(n88Var, 0), null);
                jtaVar.a().getClass();
                d4c.i0(e18Var2, new hta(n88Var, 1), null);
                d4c.i0(e18Var2, new hta(n88Var, 2), jtaVar.a().b);
                d4c.i0(e18Var2, new hta(n88Var, 3), Float.valueOf(jtaVar.a().c));
                d4c.i0(e18Var2, new hta(n88Var, 4), Float.valueOf(jtaVar.a().d));
                d4c.i0(e18Var2, new hta(n88Var, 5), (Integer) jtaVar.h.getValue());
                d4c.i0(e18Var2, new hta(n88Var, 6), Boolean.valueOf(jtaVar.b().a));
                jtaVar.b().getClass();
                d4c.i0(e18Var2, new hta(n88Var, 7), Boolean.TRUE);
                d4c.i0(e18Var2, new hta(n88Var, 8), Boolean.valueOf(jtaVar.b().b));
                d4c.i0(e18Var2, new hta(n88Var, 9), Boolean.valueOf(jtaVar.b().c));
                d4c.i0(e18Var2, new hta(n88Var, 10), Boolean.valueOf(jtaVar.b().d));
                d4c.i0(e18Var2, new hta(n88Var, 11), Boolean.valueOf(jtaVar.b().e));
                d4c.i0(e18Var2, new hta(n88Var, 12), Boolean.valueOf(jtaVar.b().f));
                d4c.i0(e18Var2, new hta(n88Var, 13), Boolean.valueOf(jtaVar.b().g));
                d4c.i0(e18Var2, new hta(n88Var, 14), Boolean.valueOf(jtaVar.b().h));
                d4c.i0(e18Var2, new hta(n88Var, 15), Boolean.valueOf(jtaVar.b().i));
                d4c.q0(e18Var2, bw9.P, (ka2) lscVar.getValue());
                e18Var2.p(true);
                e18Var2.p(false);
                rkk.c(0, e18Var2);
                j8.c(la2.a.a((ka2) lscVar.getValue()), (pz7) obj3, e18Var2, 8);
                return ieiVar;
        }
    }
}
