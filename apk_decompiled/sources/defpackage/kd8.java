package defpackage;

import com.anthropic.claude.settings.internal.growthbook.GateKind;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kd8 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ long F;
    public final /* synthetic */ long G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ qz7 J;

    public /* synthetic */ kd8(pz7 pz7Var, ta4 ta4Var, pz7 pz7Var2, long j, long j2) {
        this.H = pz7Var;
        this.I = ta4Var;
        this.J = pz7Var2;
        this.F = j;
        this.G = j2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        long j;
        int i = this.E;
        iei ieiVar = iei.a;
        qz7 qz7Var = this.J;
        Object obj3 = this.I;
        Object obj4 = this.H;
        switch (i) {
            case 0:
                n18 n18Var = (n18) obj4;
                String str = (String) obj3;
                zy7 zy7Var = (zy7) qz7Var;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    q64 q64VarA = p64.a(new ho0(2.0f, true, new sz6(1)), lja.S, e18Var, 0);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, fqb.E);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    d4c.i0(e18Var, cd4.f, q64VarA);
                    d4c.i0(e18Var, cd4.e, hycVarL);
                    d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var, cd4.h);
                    d4c.i0(e18Var, cd4.d, iqbVarE);
                    GateKind gateKindA = n18Var.a();
                    boolean z = n18Var.c;
                    String lowerCase = gateKindA.name().toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    String str2 = lowerCase + ": " + str;
                    tkh tkhVarB = tkh.b(((jm3) gm3.c(e18Var).e.E).g, 0L, 0L, null, null, xt7.H, 0L, null, 0, 0L, null, 0, 16777183);
                    long j2 = this.F;
                    if (z) {
                        e18Var.a0(-2030852515);
                        e18Var.p(false);
                        j = j2;
                    } else {
                        e18Var.a0(-2030851305);
                        long j3 = gm3.a(e18Var).O;
                        e18Var.p(false);
                        j = j3;
                    }
                    tjh.b(str2, null, j, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, tkhVarB, e18Var, 0, 24960, 110586);
                    if (z) {
                        e18Var.a0(1468275878);
                        pd8.h(j2, this.G, zy7Var, e18Var, 0);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(1468379666);
                        e18Var.p(false);
                    }
                    e18Var.p(true);
                }
                break;
            default:
                pz7 pz7Var = (pz7) obj4;
                ta4 ta4Var = (ta4) obj3;
                pz7 pz7Var2 = (pz7) qz7Var;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    j8.c(tjh.a.a(bci.a(fwj.i, e18Var2)), fd9.q0(969655473, new zbg(pz7Var, ta4Var, pz7Var2, bci.a(fwj.c, e18Var2), this.F, this.G), e18Var2), e18Var2, 56);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ kd8(n18 n18Var, String str, long j, long j2, zy7 zy7Var) {
        this.H = n18Var;
        this.I = str;
        this.F = j;
        this.G = j2;
        this.J = zy7Var;
    }
}
