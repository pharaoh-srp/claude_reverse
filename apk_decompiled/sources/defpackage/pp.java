package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pp implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;

    public /* synthetic */ pp(String str, int i) {
        this.E = i;
        this.F = str;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        lz1 lz1Var = jd4.a;
        fqb fqbVar = fqb.E;
        int i2 = 14;
        int i3 = 4;
        String strN = this.F;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else {
                    wo1 wo1Var = lja.Q;
                    fqb fqbVar2 = fqb.E;
                    iqb iqbVarN = gb9.N(fqbVar2, MTTypesetterKt.kLineSkipLimitMultiplier, 4.0f, 2.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 9);
                    Object objN = e18Var.N();
                    if (objN == lz1Var) {
                        objN = new q6(19);
                        e18Var.k0(objN);
                    }
                    iqb iqbVarA = tjf.a(iqbVarN, (bz7) objN);
                    cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var, 48);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarA);
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
                    cv8.b(a.a(ud0.L, e18Var), null, b.o(fqbVar2, 12.0f), gm3.a(e18Var).O, e18Var, 440, 0);
                    kxk.g(e18Var, b.t(fqbVar2, 4.0f));
                    tjh.b(this.F, null, gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).k, e18Var, 0, 0, 131066);
                    e18Var.p(true);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else {
                    tkh tkhVar = ((jm3) gm3.c(e18Var2).e.E).k;
                    long j = gm3.a(e18Var2).O;
                    iqb iqbVarN2 = gb9.N(fqb.E, 2.0f, 4.0f, 2.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 8);
                    Object objN2 = e18Var2.N();
                    if (objN2 == lz1Var) {
                        objN2 = new q6(20);
                        e18Var2.k0(objN2);
                    }
                    tjh.b(this.F, tjf.a(iqbVarN2, (bz7) objN2), j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var2, 0, 0, 131064);
                }
                break;
            case 2:
                pz7 pz7Var = (pz7) obj;
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                pz7Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((e18) ld4Var3).h(pz7Var) ? 4 : 2;
                }
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    e18Var3.T();
                } else {
                    if (strN.length() == 0) {
                        e18Var3.a0(-1200936799);
                        tjh.b(gik.l((nrg) drg.n.getValue(), e18Var3), null, gm3.a(e18Var3).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var3).e.E).g, e18Var3, 0, 0, 131066);
                        e18Var3.p(false);
                    } else {
                        e18Var3.a0(-1200646732);
                        e18Var3.p(false);
                    }
                    pz7Var.invoke(e18Var3, Integer.valueOf(iIntValue3 & 14));
                }
                break;
            case 3:
                ld4 ld4Var4 = (ld4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    e18Var4.T();
                } else {
                    vo1 vo1Var = lja.T;
                    iqb iqbVarC = b.c(fqbVar, 1.0f);
                    q64 q64VarA = p64.a(ko0.c, vo1Var, e18Var4, 48);
                    int iHashCode2 = Long.hashCode(e18Var4.T);
                    hyc hycVarL2 = e18Var4.l();
                    iqb iqbVarE2 = kxk.E(e18Var4, iqbVarC);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var4.e0();
                    if (e18Var4.S) {
                        e18Var4.k(re4Var2);
                    } else {
                        e18Var4.n0();
                    }
                    d4c.i0(e18Var4, cd4.f, q64VarA);
                    d4c.i0(e18Var4, cd4.e, hycVarL2);
                    d4c.i0(e18Var4, cd4.g, Integer.valueOf(iHashCode2));
                    d4c.h0(e18Var4, cd4.h);
                    d4c.i0(e18Var4, cd4.d, iqbVarE2);
                    if (1.0f <= 0.0d) {
                        z29.a("invalid weight; must be greater than zero");
                    }
                    kxk.g(e18Var4, new hw9(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                    xb5.b(this.F, gb9.J(fqbVar, 16.0f), null, e18Var4, 48, 4);
                    if (2.0f <= 0.0d) {
                        z29.a("invalid weight; must be greater than zero");
                    }
                    kxk.g(e18Var4, new hw9(2.0f <= Float.MAX_VALUE ? 2.0f : Float.MAX_VALUE, true));
                    e18Var4.p(true);
                }
                break;
            case 4:
                ld4 ld4Var5 = (ld4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    e18Var5.T();
                } else {
                    tjh.b(this.F, null, gm3.a(e18Var5).y, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var5).e.E).i, e18Var5, 0, 0, 130042);
                }
                break;
            case 5:
                ld4 ld4Var6 = (ld4) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var6 = (e18) ld4Var6;
                if (!e18Var6.Q(1 & iIntValue6, (iIntValue6 & 17) != 16)) {
                    e18Var6.T();
                } else {
                    if (strN == null) {
                        strN = vb7.n(e18Var6, 784616228, R.string.calendar_account_unknown, e18Var6, false);
                    } else {
                        e18Var6.a0(784615763);
                        e18Var6.p(false);
                    }
                    tjh.b(d4c.k0(R.string.calendar_account_header, new Object[]{strN}, e18Var6), gb9.K(b.c(fqbVar, 1.0f), 8.0f, 12.0f), gm3.a(e18Var6).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var6).e.E).h, e18Var6, 48, 0, 131064);
                }
                break;
            case 6:
                cte cteVar = (cte) obj;
                ld4 ld4Var7 = (ld4) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                cteVar.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= ((e18) ld4Var7).f(cteVar) ? 4 : 2;
                }
                e18 e18Var7 = (e18) ld4Var7;
                if (!e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    e18Var7.T();
                } else {
                    bte.c(cteVar, this.F, null, null, 0, false, 0, e18Var7, iIntValue7 & 14);
                }
                break;
            case 7:
                ld4 ld4Var8 = (ld4) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var8 = (e18) ld4Var8;
                if (e18Var8.Q(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    boolean zF = e18Var8.f(strN);
                    Object objN3 = e18Var8.N();
                    if (zF || objN3 == lz1Var) {
                        strN.getClass();
                        j6a j6aVar = new j6a(strN);
                        if (!j6aVar.hasNext()) {
                            pmf.h("Sequence is empty.");
                        } else {
                            objN3 = (String) j6aVar.next();
                            e18Var8.k0(objN3);
                        }
                    }
                    tjh.b((String) objN3, null, gm3.a(e18Var8).M, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var8).e.E).g, e18Var8, 0, 24960, 110586);
                } else {
                    e18Var8.T();
                }
                break;
            case 8:
                ld4 ld4Var9 = (ld4) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var9 = (e18) ld4Var9;
                if (!e18Var9.Q(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    e18Var9.T();
                } else {
                    tjh.b(this.F, null, gm3.a(e18Var9).c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var9).e.E).j, e18Var9, 0, 0, 131066);
                }
                break;
            case 9:
                k2i k2iVar = (k2i) obj;
                ld4 ld4Var10 = (ld4) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= (iIntValue10 & 8) == 0 ? ((e18) ld4Var10).f(k2iVar) : ((e18) ld4Var10).h(k2iVar) ? 4 : 2;
                }
                e18 e18Var10 = (e18) ld4Var10;
                if (!e18Var10.Q(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    e18Var10.T();
                } else {
                    e2i.a(k2iVar, null, MTTypesetterKt.kLineSkipLimitMultiplier, null, 0L, 0L, fd9.q0(1905952188, new rq(strN, 26), e18Var10), e18Var10, (iIntValue10 & 14) | 805306368);
                }
                break;
            case 10:
                ld4 ld4Var11 = (ld4) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var11 = (e18) ld4Var11;
                if (!e18Var11.Q(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    e18Var11.T();
                } else {
                    tjh.b(this.F, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var11, 0, 0, 262142);
                }
                break;
            case 11:
                ld4 ld4Var12 = (ld4) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var12 = (e18) ld4Var12;
                if (!e18Var12.Q(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    e18Var12.T();
                } else {
                    tjh.b(this.F, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var12, 0, 0, 262142);
                }
                break;
            case 12:
                px9 px9Var = (px9) obj;
                ld4 ld4Var13 = (ld4) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                px9Var.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= ((e18) ld4Var13).f(px9Var) ? 4 : 2;
                }
                e18 e18Var13 = (e18) ld4Var13;
                if (!e18Var13.Q(1 & iIntValue13, (iIntValue13 & 19) != 18)) {
                    e18Var13.T();
                } else {
                    iqb iqbVarA2 = px9.a(px9Var, fqbVar, null, null, 7);
                    qnc qncVar = qf2.a;
                    yhk.b(0, 0, e18Var13, gb9.N(iqbVarA2, MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), strN);
                }
                break;
            case 13:
                ld4 ld4Var14 = (ld4) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var14 = (e18) ld4Var14;
                if (!e18Var14.Q(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    e18Var14.T();
                } else {
                    tjh.b(this.F, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var14, 0, 0, 262142);
                }
                break;
            case 14:
                ld4 ld4Var15 = (ld4) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var15 = (e18) ld4Var15;
                if (!e18Var15.Q(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    e18Var15.T();
                } else {
                    tkh tkhVar2 = ((jm3) gm3.c(e18Var15).e.E).h;
                    Object objN4 = e18Var15.N();
                    if (objN4 == lz1Var) {
                        objN4 = new e69(16);
                        e18Var15.k0(objN4);
                    }
                    tjh.b(this.F, gb9.N(b.v(tjf.a(fqbVar, (bz7) objN4), 4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), 4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 10), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 3, 0, null, tkhVar2, e18Var15, 0, 24576, 114684);
                }
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                k2i k2iVar2 = (k2i) obj;
                ld4 ld4Var16 = (ld4) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                if ((iIntValue16 & 6) == 0) {
                    iIntValue16 |= (iIntValue16 & 8) == 0 ? ((e18) ld4Var16).f(k2iVar2) : ((e18) ld4Var16).h(k2iVar2) ? 4 : 2;
                }
                e18 e18Var16 = (e18) ld4Var16;
                if (!e18Var16.Q(iIntValue16 & 1, (iIntValue16 & 19) != 18)) {
                    e18Var16.T();
                } else {
                    e2i.a(k2iVar2, null, MTTypesetterKt.kLineSkipLimitMultiplier, null, 0L, 0L, fd9.q0(435848468, new ngf(strN, i3), e18Var16), e18Var16, (iIntValue16 & 14) | 805306368);
                }
                break;
            case 16:
                k2i k2iVar3 = (k2i) obj;
                ld4 ld4Var17 = (ld4) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                if ((iIntValue17 & 6) == 0) {
                    iIntValue17 |= (iIntValue17 & 8) == 0 ? ((e18) ld4Var17).f(k2iVar3) : ((e18) ld4Var17).h(k2iVar3) ? 4 : 2;
                }
                e18 e18Var17 = (e18) ld4Var17;
                if (!e18Var17.Q(iIntValue17 & 1, (iIntValue17 & 19) != 18)) {
                    e18Var17.T();
                } else {
                    e2i.a(k2iVar3, null, MTTypesetterKt.kLineSkipLimitMultiplier, null, 0L, 0L, fd9.q0(-132223210, new ngf(strN, 6), e18Var17), e18Var17, (iIntValue17 & 14) | 805306368);
                }
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ld4 ld4Var18 = (ld4) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                e18 e18Var18 = (e18) ld4Var18;
                if (!e18Var18.Q(1 & iIntValue18, (iIntValue18 & 17) != 16)) {
                    e18Var18.T();
                } else {
                    tjh.b(this.F, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var18, 0, 0, 262142);
                }
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ld4 ld4Var19 = (ld4) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var19 = (e18) ld4Var19;
                if (!e18Var19.Q(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    e18Var19.T();
                } else {
                    tjh.b(this.F, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var19, 0, 0, 262142);
                }
                break;
            default:
                ld4 ld4Var20 = (ld4) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var20 = (e18) ld4Var20;
                if (!e18Var20.Q(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    e18Var20.T();
                } else {
                    j8.c(tjh.a.a(((jm3) gm3.c(e18Var20).e.E).h), fd9.q0(-458688786, new ngf(strN, i2), e18Var20), e18Var20, 56);
                }
                break;
        }
        return ieiVar;
    }
}
