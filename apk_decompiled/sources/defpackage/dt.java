package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.tasks.ui.q;
import com.anthropic.claude.tool.model.KnowledgeSource;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dt implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ pz7 F;

    public /* synthetic */ dt(int i, pz7 pz7Var) {
        this.E = 14;
        this.F = pz7Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        fqb fqbVar = fqb.E;
        pz7 pz7Var = this.F;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    if (1.0f <= 0.0d) {
                        z29.a("invalid weight; must be greater than zero");
                    }
                    iqb iqbVarB = gb9.I(new hw9(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), nt.d).B(new ko8(lja.S));
                    o5b o5bVarD = dw1.d(lja.G, false);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarB);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    d4c.i0(e18Var, cd4.f, o5bVarD);
                    d4c.i0(e18Var, cd4.e, hycVarL);
                    d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var, cd4.h);
                    d4c.i0(e18Var, cd4.d, iqbVarE);
                    sq6.B(0, pz7Var, e18Var, true);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    iqb iqbVarB2 = gb9.I(fqbVar, nt.b).B(new ko8(lja.T));
                    o5b o5bVarD2 = dw1.d(lja.G, false);
                    int iHashCode2 = Long.hashCode(e18Var2.T);
                    hyc hycVarL2 = e18Var2.l();
                    iqb iqbVarE2 = kxk.E(e18Var2, iqbVarB2);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var2.e0();
                    if (e18Var2.S) {
                        e18Var2.k(re4Var2);
                    } else {
                        e18Var2.n0();
                    }
                    d4c.i0(e18Var2, cd4.f, o5bVarD2);
                    d4c.i0(e18Var2, cd4.e, hycVarL2);
                    d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode2));
                    d4c.h0(e18Var2, cd4.h);
                    d4c.i0(e18Var2, cd4.d, iqbVarE2);
                    sq6.B(0, pz7Var, e18Var2, true);
                }
                break;
            case 2:
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    pz7Var.invoke(e18Var3, 0);
                }
                break;
            case 3:
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e18Var4.T();
                } else {
                    pz7Var.invoke(e18Var4, 0);
                }
                break;
            case 4:
                ld4 ld4Var5 = (ld4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    e18Var5.T();
                } else {
                    pz7Var.invoke(e18Var5, 0);
                }
                break;
            case 5:
                ld4 ld4Var6 = (ld4) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                e18 e18Var6 = (e18) ld4Var6;
                if (!e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    e18Var6.T();
                } else {
                    pz7Var.invoke(e18Var6, 0);
                }
                break;
            case 6:
                ld4 ld4Var7 = (ld4) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                e18 e18Var7 = (e18) ld4Var7;
                if (!e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    e18Var7.T();
                } else {
                    iqb iqbVarL = zni.L(fqbVar, "leadingIcon");
                    o5b o5bVarD3 = dw1.d(lja.K, false);
                    int iHashCode3 = Long.hashCode(e18Var7.T);
                    hyc hycVarL3 = e18Var7.l();
                    iqb iqbVarE3 = kxk.E(e18Var7, iqbVarL);
                    dd4.e.getClass();
                    re4 re4Var3 = cd4.b;
                    e18Var7.e0();
                    if (e18Var7.S) {
                        e18Var7.k(re4Var3);
                    } else {
                        e18Var7.n0();
                    }
                    d4c.i0(e18Var7, cd4.f, o5bVarD3);
                    d4c.i0(e18Var7, cd4.e, hycVarL3);
                    d4c.i0(e18Var7, cd4.g, Integer.valueOf(iHashCode3));
                    d4c.h0(e18Var7, cd4.h);
                    d4c.i0(e18Var7, cd4.d, iqbVarE3);
                    e18Var7.a0(-1774797190);
                    ldb.e(fd9.q0(-358394575, new ck1(8, pz7Var), e18Var7), e18Var7, 6);
                    e18Var7.p(false);
                    e18Var7.p(true);
                }
                break;
            case 7:
                ld4 ld4Var8 = (ld4) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                e18 e18Var8 = (e18) ld4Var8;
                if (!e18Var8.Q(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    e18Var8.T();
                } else {
                    iqb iqbVarB3 = b.b(zni.L(fqbVar, "trailingIcon"), yb5.V, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                    o5b o5bVarD4 = dw1.d(lja.K, false);
                    int iHashCode4 = Long.hashCode(e18Var8.T);
                    hyc hycVarL4 = e18Var8.l();
                    iqb iqbVarE4 = kxk.E(e18Var8, iqbVarB3);
                    dd4.e.getClass();
                    re4 re4Var4 = cd4.b;
                    e18Var8.e0();
                    if (e18Var8.S) {
                        e18Var8.k(re4Var4);
                    } else {
                        e18Var8.n0();
                    }
                    d4c.i0(e18Var8, cd4.f, o5bVarD4);
                    d4c.i0(e18Var8, cd4.e, hycVarL4);
                    d4c.i0(e18Var8, cd4.g, Integer.valueOf(iHashCode4));
                    d4c.h0(e18Var8, cd4.h);
                    d4c.i0(e18Var8, cd4.d, iqbVarE4);
                    sq6.B(0, pz7Var, e18Var8, true);
                }
                break;
            case 8:
                ld4 ld4Var9 = (ld4) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                e18 e18Var9 = (e18) ld4Var9;
                if (!e18Var9.Q(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    e18Var9.T();
                } else {
                    iqb iqbVarB4 = b.b(fqbVar, vsj.j, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                    o5b o5bVarD5 = dw1.d(lja.G, false);
                    int iHashCode5 = Long.hashCode(e18Var9.T);
                    hyc hycVarL5 = e18Var9.l();
                    iqb iqbVarE5 = kxk.E(e18Var9, iqbVarB4);
                    dd4.e.getClass();
                    re4 re4Var5 = cd4.b;
                    e18Var9.e0();
                    if (e18Var9.S) {
                        e18Var9.k(re4Var5);
                    } else {
                        e18Var9.n0();
                    }
                    d4c.i0(e18Var9, cd4.f, o5bVarD5);
                    d4c.i0(e18Var9, cd4.e, hycVarL5);
                    d4c.i0(e18Var9, cd4.g, Integer.valueOf(iHashCode5));
                    d4c.h0(e18Var9, cd4.h);
                    d4c.i0(e18Var9, cd4.d, iqbVarE5);
                    sq6.B(0, pz7Var, e18Var9, true);
                }
                break;
            case 9:
                ld4 ld4Var10 = (ld4) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                e18 e18Var10 = (e18) ld4Var10;
                if (!e18Var10.Q(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    e18Var10.T();
                } else {
                    iqb iqbVarB5 = b.b(fqbVar, vsj.l, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                    o5b o5bVarD6 = dw1.d(lja.G, false);
                    int iHashCode6 = Long.hashCode(e18Var10.T);
                    hyc hycVarL6 = e18Var10.l();
                    iqb iqbVarE6 = kxk.E(e18Var10, iqbVarB5);
                    dd4.e.getClass();
                    re4 re4Var6 = cd4.b;
                    e18Var10.e0();
                    if (e18Var10.S) {
                        e18Var10.k(re4Var6);
                    } else {
                        e18Var10.n0();
                    }
                    d4c.i0(e18Var10, cd4.f, o5bVarD6);
                    d4c.i0(e18Var10, cd4.e, hycVarL6);
                    d4c.i0(e18Var10, cd4.g, Integer.valueOf(iHashCode6));
                    d4c.h0(e18Var10, cd4.h);
                    d4c.i0(e18Var10, cd4.d, iqbVarE6);
                    sq6.B(0, pz7Var, e18Var10, true);
                }
                break;
            case 10:
                ld4 ld4Var11 = (ld4) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                e18 e18Var11 = (e18) ld4Var11;
                if (!e18Var11.Q(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    e18Var11.T();
                } else {
                    cxe cxeVarA = axe.a(ko0.a, lja.P, e18Var11, 0);
                    int iHashCode7 = Long.hashCode(e18Var11.T);
                    hyc hycVarL7 = e18Var11.l();
                    iqb iqbVarE7 = kxk.E(e18Var11, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var7 = cd4.b;
                    e18Var11.e0();
                    if (e18Var11.S) {
                        e18Var11.k(re4Var7);
                    } else {
                        e18Var11.n0();
                    }
                    d4c.i0(e18Var11, cd4.f, cxeVarA);
                    d4c.i0(e18Var11, cd4.e, hycVarL7);
                    d4c.i0(e18Var11, cd4.g, Integer.valueOf(iHashCode7));
                    d4c.h0(e18Var11, cd4.h);
                    d4c.i0(e18Var11, cd4.d, iqbVarE7);
                    pz7Var.invoke(e18Var11, 0);
                    kxk.g(e18Var11, b.t(fqbVar, 6.0f));
                    e18Var11.p(true);
                }
                break;
            case 11:
                KnowledgeSource knowledgeSource = (KnowledgeSource) obj;
                ((Boolean) obj2).booleanValue();
                knowledgeSource.getClass();
                pz7Var.invoke(knowledgeSource.getUrl(), Boolean.valueOf(knowledgeSource.isTrusted()));
                break;
            case 12:
                ld4 ld4Var12 = (ld4) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                e18 e18Var12 = (e18) ld4Var12;
                if (!e18Var12.Q(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    e18Var12.T();
                } else {
                    pz7Var.invoke(e18Var12, 0);
                }
                break;
            case 13:
                ld4 ld4Var13 = (ld4) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                e18 e18Var13 = (e18) ld4Var13;
                if (!e18Var13.Q(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    e18Var13.T();
                } else {
                    pz7Var.invoke(e18Var13, 0);
                }
                break;
            case 14:
                ((Integer) obj2).getClass();
                q.f(pz7Var, (ld4) obj, x44.p0(1));
                break;
            default:
                ld4 ld4Var14 = (ld4) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                e18 e18Var14 = (e18) ld4Var14;
                if (!e18Var14.Q(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    e18Var14.T();
                } else {
                    olh.a(false, null, null, this.F, e18Var14, 0, 7);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ dt(pz7 pz7Var, int i, byte b) {
        this.E = i;
        this.F = pz7Var;
    }

    public /* synthetic */ dt(pz7 pz7Var, yig yigVar, yig yigVar2) {
        this.E = 6;
        this.F = pz7Var;
    }
}
