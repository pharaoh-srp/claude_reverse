package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.code.remote.bottomsheet.a;
import java.io.IOException;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class db4 implements rz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ db4(int i) {
        this.E = i;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((dxe) obj).getClass();
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            tjh.b(d4c.j0(R.string.generic_button_okay, e18Var), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var, 0, 0, 262142);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) throws IOException {
        int i = this.E;
        eo0 eo0Var = ko0.c;
        lz1 lz1Var = jd4.a;
        fqb fqbVar = fqb.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(1 & iIntValue, (iIntValue & 17) != 16)) {
                    dw1.a(yfd.p(b.o(fqbVar, 36.0f), gm3.a(e18Var).k, xve.a), e18Var, 0);
                } else {
                    e18Var.T();
                }
                return ieiVar;
            case 1:
                zy7 zy7Var = (zy7) obj;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                zy7Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((e18) ld4Var2).h(zy7Var) ? 4 : 2;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    ez1.e(zy7Var, null, false, null, null, ywj.b, e18Var2, (iIntValue2 & 14) | 1572864, 62);
                } else {
                    e18Var2.T();
                }
                return ieiVar;
            case 2:
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var3 = (e18) ld4Var3;
                if (e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    tjh.b(d4c.j0(R.string.media_player_retry, e18Var3), null, tm3.b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var3, 384, 0, 262138);
                } else {
                    e18Var3.T();
                }
                return ieiVar;
            case 3:
                ld4 ld4Var4 = (ld4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var4 = (e18) ld4Var4;
                if (e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    eli eliVar = (eli) e18Var4.j(ve4.t);
                    boolean zH = e18Var4.h(eliVar);
                    Object objN = e18Var4.N();
                    if (zH || objN == lz1Var) {
                        objN = new mp1(eliVar, 1);
                        e18Var4.k0(objN);
                    }
                    a.p((zy7) objN, null, e18Var4, 0);
                } else {
                    e18Var4.T();
                }
                return ieiVar;
            case 4:
                ld4 ld4Var5 = (ld4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var5 = (e18) ld4Var5;
                if (e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    tjh.b(d4c.j0(R.string.ccr_paired_environments, e18Var5), gb9.N(fqb.E, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 7), gm3.a(e18Var5).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var5).e.E).i, e18Var5, 48, 0, 131064);
                } else {
                    e18Var5.T();
                }
                return ieiVar;
            case 5:
                ld4 ld4Var6 = (ld4) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var6 = (e18) ld4Var6;
                if (e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    kxk.g(e18Var6, b.e(fqbVar, 16.0f));
                } else {
                    e18Var6.T();
                }
                return ieiVar;
            case 6:
                ld4 ld4Var7 = (ld4) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var7 = (e18) ld4Var7;
                if (e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    tjh.b(d4c.j0(R.string.ccr_self_hosted_pools, e18Var7), gb9.N(fqb.E, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 7), gm3.a(e18Var7).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var7).e.E).i, e18Var7, 48, 0, 131064);
                } else {
                    e18Var7.T();
                }
                return ieiVar;
            case 7:
                ld4 ld4Var8 = (ld4) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var8 = (e18) ld4Var8;
                if (e18Var8.Q(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    tjh.b(d4c.j0(R.string.ccr_cloud_environments, e18Var8), gb9.N(fqb.E, MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 5), gm3.a(e18Var8).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var8).e.E).i, e18Var8, 48, 0, 131064);
                } else {
                    e18Var8.T();
                }
                return ieiVar;
            case 8:
                ld4 ld4Var9 = (ld4) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var9 = (e18) ld4Var9;
                if (e18Var9.Q(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    iqb iqbVarL = gb9.L(b.c(fqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 1);
                    q64 q64VarA = p64.a(eo0Var, lja.T, e18Var9, 48);
                    int iHashCode = Long.hashCode(e18Var9.T);
                    hyc hycVarL = e18Var9.l();
                    iqb iqbVarE = kxk.E(e18Var9, iqbVarL);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var9.e0();
                    if (e18Var9.S) {
                        e18Var9.k(re4Var);
                    } else {
                        e18Var9.n0();
                    }
                    d4c.i0(e18Var9, cd4.f, q64VarA);
                    d4c.i0(e18Var9, cd4.e, hycVarL);
                    d4c.i0(e18Var9, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var9, cd4.h);
                    d4c.i0(e18Var9, cd4.d, iqbVarE);
                    ez1.a(null, vf2.H, 0L, e18Var9, 48, 5);
                    e18Var9.p(true);
                } else {
                    e18Var9.T();
                }
                return ieiVar;
            case 9:
                ld4 ld4Var10 = (ld4) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var10 = (e18) ld4Var10;
                if (e18Var10.Q(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    iqb iqbVarL2 = gb9.L(b.c(fqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 1);
                    q64 q64VarA2 = p64.a(eo0Var, lja.T, e18Var10, 48);
                    int iHashCode2 = Long.hashCode(e18Var10.T);
                    hyc hycVarL2 = e18Var10.l();
                    iqb iqbVarE2 = kxk.E(e18Var10, iqbVarL2);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var10.e0();
                    if (e18Var10.S) {
                        e18Var10.k(re4Var2);
                    } else {
                        e18Var10.n0();
                    }
                    d4c.i0(e18Var10, cd4.f, q64VarA2);
                    d4c.i0(e18Var10, cd4.e, hycVarL2);
                    d4c.i0(e18Var10, cd4.g, Integer.valueOf(iHashCode2));
                    d4c.h0(e18Var10, cd4.h);
                    d4c.i0(e18Var10, cd4.d, iqbVarE2);
                    ez1.a(null, vf2.H, 0L, e18Var10, 48, 5);
                    e18Var10.p(true);
                } else {
                    e18Var10.T();
                }
                return ieiVar;
            case 10:
                ld4 ld4Var11 = (ld4) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var11 = (e18) ld4Var11;
                if (e18Var11.Q(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    tjh.b(d4c.j0(R.string.ccr_no_repositories_found, e18Var11), gb9.L(b.c(fqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 32.0f, 1), gm3.a(e18Var11).N, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var11).e.E).g, e18Var11, 48, 0, 130040);
                } else {
                    e18Var11.T();
                }
                return ieiVar;
            case 11:
                ld4 ld4Var12 = (ld4) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var12 = (e18) ld4Var12;
                if (e18Var12.Q(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    ez1.a(b.y(gb9.L(b.c(fqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 1), lja.K, 2), vf2.H, 0L, e18Var12, 54, 4);
                } else {
                    e18Var12.T();
                }
                return ieiVar;
            case 12:
                ld4 ld4Var13 = (ld4) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var13 = (e18) ld4Var13;
                if (!e18Var13.Q(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    e18Var13.T();
                }
                return ieiVar;
            case 13:
                ld4 ld4Var14 = (ld4) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var14 = (e18) ld4Var14;
                if (e18Var14.Q(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    String strJ0 = d4c.j0(R.string.new_session, e18Var14);
                    tkh tkhVar = ((jm3) gm3.c(e18Var14).e.E).h;
                    Object objN2 = e18Var14.N();
                    if (objN2 == lz1Var) {
                        objN2 = new i04(25);
                        e18Var14.k0(objN2);
                    }
                    tjh.b(strJ0, gb9.N(b.v(tjf.a(fqbVar, (bz7) objN2), 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 14), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 3, 0, null, tkhVar, e18Var14, 0, 24576, 114684);
                } else {
                    e18Var14.T();
                }
                return ieiVar;
            case 14:
                ld4 ld4Var15 = (ld4) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var15 = (e18) ld4Var15;
                if (e18Var15.Q(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    tjh.b(d4c.j0(R.string.ccr_github_app_install_button, e18Var15), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var15, 0, 0, 262142);
                } else {
                    e18Var15.T();
                }
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ld4 ld4Var16 = (ld4) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var16 = (e18) ld4Var16;
                if (e18Var16.Q(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    tjh.b(d4c.j0(R.string.generic_cancel, e18Var16), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var16, 0, 0, 262142);
                } else {
                    e18Var16.T();
                }
                return ieiVar;
            case 16:
                ld4 ld4Var17 = (ld4) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var17 = (e18) ld4Var17;
                if (e18Var17.Q(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    xo1 xo1Var = lja.K;
                    iqb iqbVarJ = gb9.J(b.c(fqbVar, 1.0f), 16.0f);
                    o5b o5bVarD = dw1.d(xo1Var, false);
                    int iHashCode3 = Long.hashCode(e18Var17.T);
                    hyc hycVarL3 = e18Var17.l();
                    iqb iqbVarE3 = kxk.E(e18Var17, iqbVarJ);
                    dd4.e.getClass();
                    re4 re4Var3 = cd4.b;
                    e18Var17.e0();
                    if (e18Var17.S) {
                        e18Var17.k(re4Var3);
                    } else {
                        e18Var17.n0();
                    }
                    d4c.i0(e18Var17, cd4.f, o5bVarD);
                    d4c.i0(e18Var17, cd4.e, hycVarL3);
                    d4c.i0(e18Var17, cd4.g, Integer.valueOf(iHashCode3));
                    d4c.h0(e18Var17, cd4.h);
                    d4c.i0(e18Var17, cd4.d, iqbVarE3);
                    tjd.a(b.o(fqbVar, 20.0f), gm3.a(e18Var17).O, 2.0f, 0L, 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var17, 390, 56);
                    e18Var17.p(true);
                } else {
                    e18Var17.T();
                }
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ld4 ld4Var18 = (ld4) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var18 = (e18) ld4Var18;
                if (!e18Var18.Q(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    e18Var18.T();
                }
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                mnc mncVar = (mnc) obj;
                ld4 ld4Var19 = (ld4) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                mncVar.getClass();
                if ((iIntValue19 & 6) == 0) {
                    iIntValue19 |= ((e18) ld4Var19).f(mncVar) ? 4 : 2;
                }
                e18 e18Var19 = (e18) ld4Var19;
                if (e18Var19.Q(iIntValue19 & 1, (iIntValue19 & 19) != 18)) {
                    iqb iqbVarL3 = gb9.L(gb9.I(mpk.b0(fqbVar, mpk.Y(e18Var19), true), mncVar), MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 1);
                    q64 q64VarA3 = p64.a(eo0Var, lja.S, e18Var19, 0);
                    int iHashCode4 = Long.hashCode(e18Var19.T);
                    hyc hycVarL4 = e18Var19.l();
                    iqb iqbVarE4 = kxk.E(e18Var19, iqbVarL3);
                    dd4.e.getClass();
                    re4 re4Var4 = cd4.b;
                    e18Var19.e0();
                    if (e18Var19.S) {
                        e18Var19.k(re4Var4);
                    } else {
                        e18Var19.n0();
                    }
                    d4c.i0(e18Var19, cd4.f, q64VarA3);
                    d4c.i0(e18Var19, cd4.e, hycVarL4);
                    d4c.i0(e18Var19, cd4.g, Integer.valueOf(iHashCode4));
                    d4c.h0(e18Var19, cd4.h);
                    d4c.i0(e18Var19, cd4.d, iqbVarE4);
                    owj.b("Custom Text Buttons", null, 0L, null, null, e18Var19, 6, 30);
                    vok.h(gb9.J(fqbVar, 8.0f), e18Var19, 6);
                    owj.b("CDS · Loading", null, 0L, null, null, e18Var19, 6, 30);
                    vok.d(gb9.J(fqbVar, 8.0f), e18Var19, 6);
                    owj.b("CDS · Icon", null, 0L, null, null, e18Var19, 6, 30);
                    vok.c(gb9.J(fqbVar, 8.0f), e18Var19, 6);
                    owj.b("CDS · Section card", null, 0L, null, null, e18Var19, 6, 30);
                    vok.g(null, e18Var19, 0);
                    owj.b("CDS · Card", null, 0L, null, null, e18Var19, 6, 30);
                    vok.a(gb9.K(fqbVar, 16.0f, 8.0f), e18Var19, 6);
                    owj.b("CDS · Overlay pill", null, 0L, null, null, e18Var19, 6, 30);
                    vok.f(gb9.J(fqbVar, 8.0f), e18Var19, 6);
                    owj.b("CDS · Tooltip", null, 0L, null, null, e18Var19, 6, 30);
                    vok.i(gb9.J(fqbVar, 8.0f), e18Var19, 6);
                    owj.b("CDS · Numeric text", null, 0L, null, null, e18Var19, 6, 30);
                    vok.e(gb9.J(fqbVar, 8.0f), e18Var19, 6);
                    e18Var19.p(true);
                } else {
                    e18Var19.T();
                }
                return ieiVar;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ld4 ld4Var20 = (ld4) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var20 = (e18) ld4Var20;
                if (e18Var20.Q(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    Object objN3 = e18Var20.N();
                    if (objN3 == lz1Var) {
                        objN3 = new oob(19);
                        e18Var20.k0(objN3);
                    }
                    yhk.c(null, "Single-row card", (zy7) objN3, b.c(fqbVar, 1.0f), null, null, null, null, 0L, e18Var20, 3510, 496);
                } else {
                    e18Var20.T();
                }
                return ieiVar;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ld4 ld4Var21 = (ld4) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var21 = (e18) ld4Var21;
                if (e18Var21.Q(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    tjh.b("Basic card", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var21).e.E).g, e18Var21, 6, 0, 131070);
                } else {
                    e18Var21.T();
                }
                return ieiVar;
            case 21:
                ld4 ld4Var22 = (ld4) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var22 = (e18) ld4Var22;
                if (e18Var22.Q(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    tjh.b("Card with extra", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var22).e.E).g, e18Var22, 6, 0, 131070);
                } else {
                    e18Var22.T();
                }
                return ieiVar;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ld4 ld4Var23 = (ld4) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var23 = (e18) ld4Var23;
                if (e18Var23.Q(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    tjh.b("Submit", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var23, 6, 0, 262142);
                } else {
                    e18Var23.T();
                }
                return ieiVar;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ld4 ld4Var24 = (ld4) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var24 = (e18) ld4Var24;
                if (e18Var24.Q(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    tjh.b("Big Button", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var24, 6, 0, 262142);
                } else {
                    e18Var24.T();
                }
                return ieiVar;
            case 24:
                ld4 ld4Var25 = (ld4) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var25 = (e18) ld4Var25;
                if (e18Var25.Q(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    tjh.b("Disabled option", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var25, 6, 0, 262142);
                } else {
                    e18Var25.T();
                }
                return ieiVar;
            case BuildConfig.VERSION_CODE /* 25 */:
                ld4 ld4Var26 = (ld4) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var26 = (e18) ld4Var26;
                if (e18Var26.Q(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    tjh.b("LoadingTextButton", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var26, 6, 0, 262142);
                } else {
                    e18Var26.T();
                }
                return ieiVar;
            case 26:
                ld4 ld4Var27 = (ld4) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var27 = (e18) ld4Var27;
                if (e18Var27.Q(iIntValue27 & 1, (iIntValue27 & 17) != 16)) {
                    tjh.b("x", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var27).e.E).g, e18Var27, 6, 0, 131070);
                } else {
                    e18Var27.T();
                }
                return ieiVar;
            case 27:
                ld4 ld4Var28 = (ld4) obj2;
                int iIntValue28 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var28 = (e18) ld4Var28;
                if (e18Var28.Q(iIntValue28 & 1, (iIntValue28 & 17) != 16)) {
                    iqb iqbVarC = b.c(fqbVar, 1.0f);
                    Object objN4 = e18Var28.N();
                    if (objN4 == lz1Var) {
                        objN4 = new oob(19);
                        e18Var28.k0(objN4);
                    }
                    yhk.c(null, "Clickable row", (zy7) objN4, iqbVarC, null, "With a subtitle", null, null, 0L, e18Var28, 200118, 464);
                    Object objN5 = e18Var28.N();
                    if (objN5 == lz1Var) {
                        objN5 = new oob(19);
                        e18Var28.k0(objN5);
                    }
                    yhk.c(null, "Another row", (zy7) objN5, b.c(fqbVar, 1.0f), null, null, null, null, 0L, e18Var28, 3510, 496);
                } else {
                    e18Var28.T();
                }
                return ieiVar;
            case 28:
                return d(obj, obj2, obj3);
            default:
                ld4 ld4Var29 = (ld4) obj2;
                int iIntValue29 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var29 = (e18) ld4Var29;
                if (e18Var29.Q(iIntValue29 & 1, (iIntValue29 & 17) != 16)) {
                    tjh.b(d4c.j0(R.string.generic_button_cancel, e18Var29), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var29, 0, 0, 262142);
                } else {
                    e18Var29.T();
                }
                return ieiVar;
        }
    }
}
