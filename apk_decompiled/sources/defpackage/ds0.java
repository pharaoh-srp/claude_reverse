package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.code.remote.bottomsheet.a;
import com.anthropic.claude.project.knowledge.f;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ds0 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ ds0(int i, bz7 bz7Var, boolean z, rc8 rc8Var, int i2) {
        this.E = 5;
        this.G = i;
        this.H = bz7Var;
        this.F = z;
        this.I = rc8Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        iqb iqbVarB0;
        tkh tkhVar;
        tkh tkhVar2;
        int i = this.E;
        int i2 = this.G;
        boolean z = this.F;
        iei ieiVar = iei.a;
        Object obj3 = this.I;
        Object obj4 = this.H;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ltk.e((t4f) obj4, z, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                return ieiVar;
            case 1:
                qnc qncVar = (qnc) obj4;
                List<c31> list = (List) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ho0 ho0Var = new ho0(8.0f, true, new sz6(1));
                    fqb fqbVar = fqb.E;
                    iqb iqbVarC = b.c(fqbVar, 1.0f);
                    if (z) {
                        e18Var.a0(-130439540);
                        iqbVarB0 = mpk.b0(fqbVar, mpk.Y(e18Var), false);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(-130438131);
                        e18Var.p(false);
                        iqbVarB0 = fqbVar;
                    }
                    iqb iqbVarI = gb9.I(iqbVarC.B(iqbVarB0), qncVar);
                    cxe cxeVarA = axe.a(ho0Var, lja.P, e18Var, 6);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarI);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    d4c.i0(e18Var, cd4.f, cxeVarA);
                    d4c.i0(e18Var, cd4.e, hycVarL);
                    d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var, cd4.h);
                    d4c.i0(e18Var, cd4.d, iqbVarE);
                    e18Var.a0(-751929257);
                    for (c31 c31Var : list) {
                        e18Var.X(1645988656, c31Var.getKey());
                        iqb iqbVarT = z ? b.t(fqbVar, 104.0f) : new hw9(1.0f, true);
                        if (c31Var instanceof y21) {
                            e18Var.a0(1646008353);
                            x21.a(((y21) c31Var).b, b.g(iqbVarT, 104.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), e18Var, 0);
                            e18Var.p(false);
                        } else if (c31Var instanceof a31) {
                            e18Var.a0(1646015974);
                            x21.c(b.o(iqbVarT, 104.0f), e18Var, 0);
                            e18Var.p(false);
                        } else {
                            if (!(c31Var instanceof z21)) {
                                throw ebh.u(e18Var, 1646006618, false);
                            }
                            e18Var.a0(1646021817);
                            x21.d((z21) c31Var, i2, b.o(iqbVarT, 104.0f), e18Var, 0);
                            e18Var.p(false);
                        }
                        e18Var.p(false);
                    }
                    e18Var.p(false);
                    e18Var.p(true);
                } else {
                    e18Var.T();
                }
                return ieiVar;
            case 2:
                ((Integer) obj2).getClass();
                com.anthropic.claude.bell.b.o(z, (String) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                return ieiVar;
            case 3:
                ((Integer) obj2).getClass();
                vd2.a((UUID) obj4, z, (zy7) obj3, (ld4) obj, x44.p0(i2 | 1));
                return ieiVar;
            case 4:
                ((Integer) obj2).getClass();
                vlk.a((cte) obj4, z, (ta4) obj3, (ld4) obj, x44.p0(i2 | 1));
                return ieiVar;
            case 5:
                ((Integer) obj2).getClass();
                a.a(this.G, (bz7) obj4, this.F, (rc8) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 6:
                ((Integer) obj2).getClass();
                ((js5) obj4).c(x44.p0(i2 | 1), (ld4) obj, (String) obj3, z);
                return ieiVar;
            case 7:
                ((Integer) obj2).intValue();
                yok.a(z, (zy7) obj4, (mnc) obj3, (ld4) obj, x44.p0(i2 | 1));
                return ieiVar;
            case 8:
                ((Integer) obj2).intValue();
                f.b(z, (zy7) obj4, (fnd) obj3, (ld4) obj, x44.p0(i2 | 1));
                return ieiVar;
            case 9:
                ((Integer) obj2).intValue();
                int iP0 = x44.p0(i2 | 1);
                ykk.c(iP0, (ld4) obj, (zy7) obj3, (String) obj4, z);
                return ieiVar;
            case 10:
                ((Integer) obj2).getClass();
                xnk.b(z, (jme) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                return ieiVar;
            case 11:
                ((Integer) obj2).intValue();
                ime.b((jme) obj4, z, (zy7) obj3, (ld4) obj, x44.p0(i2 | 1));
                return ieiVar;
            case 12:
                pz7 pz7Var = (pz7) obj4;
                String str = (String) obj3;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    int i3 = this.G;
                    if (pz7Var != null) {
                        e18Var2.a0(262229097);
                        if (z) {
                            e18Var2.a0(262374735);
                            tkhVar2 = ((jm3) gm3.c(e18Var2).e.E).f;
                            e18Var2.p(false);
                        } else {
                            e18Var2.a0(262467859);
                            tkhVar2 = ((jm3) gm3.c(e18Var2).e.E).e;
                            e18Var2.p(false);
                        }
                        pqi.d(str, pz7Var, null, null, 0L, tkhVar2, i3, e18Var2, 0, 28);
                        e18Var2.p(false);
                    } else {
                        e18Var2.a0(262662508);
                        if (z) {
                            e18Var2.a0(262734831);
                            tkhVar = ((jm3) gm3.c(e18Var2).e.E).f;
                            e18Var2.p(false);
                        } else {
                            e18Var2.a0(262827955);
                            tkhVar = ((jm3) gm3.c(e18Var2).e.E).e;
                            e18Var2.p(false);
                        }
                        tjh.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, i3, 0, null, tkhVar, e18Var2, 0, 384, 110590);
                        e18Var2.p(false);
                    }
                } else {
                    e18Var2.T();
                }
                return ieiVar;
            default:
                ((Integer) obj2).getClass();
                uok.f(z, (lne) obj4, (zhh) obj3, (ld4) obj, x44.p0(i2 | 1));
                return ieiVar;
        }
    }

    public /* synthetic */ ds0(Object obj, String str, boolean z, int i, int i2) {
        this.E = i2;
        this.H = obj;
        this.I = str;
        this.F = z;
        this.G = i;
    }

    public /* synthetic */ ds0(Object obj, boolean z, Object obj2, int i, int i2) {
        this.E = i2;
        this.H = obj;
        this.F = z;
        this.I = obj2;
        this.G = i;
    }

    public /* synthetic */ ds0(boolean z, qnc qncVar, List list, int i) {
        this.E = 1;
        this.F = z;
        this.H = qncVar;
        this.I = list;
        this.G = i;
    }

    public /* synthetic */ ds0(boolean z, Object obj, Object obj2, int i, int i2) {
        this.E = i2;
        this.F = z;
        this.H = obj;
        this.I = obj2;
        this.G = i;
    }
}
