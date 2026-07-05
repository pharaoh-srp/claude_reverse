package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.artifact.model.ArtifactMetadata;
import com.anthropic.claude.tool.model.MobileAppToolPreviewInfo;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lca implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ lca(jxb jxbVar, ixb ixbVar) {
        this.E = 8;
        this.F = jxbVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = this.E;
        int i3 = 7;
        fqb fqbVar = fqb.E;
        int i4 = 18;
        lz1 lz1Var = jd4.a;
        int i5 = 2;
        final int i6 = 1;
        iei ieiVar = iei.a;
        Object obj4 = this.F;
        switch (i2) {
            case 0:
                z02 z02Var = (z02) obj4;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else {
                    zsj.a(z02Var, null, fok.a, e18Var, 384);
                }
                break;
            case 1:
                vt6 vt6Var = (vt6) obj4;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else if (vt6Var == null) {
                    e18Var2.a0(-1263105157);
                    e18Var2.p(false);
                } else {
                    e18Var2.a0(-1263191647);
                    uik.c(vt6Var, null, null, null, null, e18Var2, 0, 30);
                    e18Var2.p(false);
                }
                break;
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Integer num = (Integer) obj2;
                num.getClass();
                String str = (String) obj3;
                str.getClass();
                rz7 rz7Var = ((qya) obj4).getCallbacks().m;
                if (rz7Var != null) {
                    rz7Var.invoke(zBooleanValue ? "WebViewHttpError" : "WebViewError", num, str);
                }
                break;
            case 3:
                rbb rbbVar = (rbb) obj4;
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(1 & iIntValue3, (iIntValue3 & 17) != 16)) {
                    e18Var3.T();
                } else {
                    yhk.b(0, 2, e18Var3, null, rbbVar.a);
                }
                break;
            case 4:
                seb sebVar = (seb) obj4;
                ld4 ld4Var4 = (ld4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var4 = (e18) ld4Var4;
                if (e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    int iOrdinal = sebVar.c.ordinal();
                    if (iOrdinal == 0) {
                        i = R.string.text_create_tool_send_email;
                    } else if (iOrdinal == 1 || iOrdinal == 2) {
                        i = R.string.text_create_tool_send_message;
                    } else {
                        wg6.i();
                    }
                    tjh.b(d4c.j0(i, e18Var4), gb9.J(b.c(fqbVar, 1.0f), 6.0f), gm3.a(e18Var4).M, 0L, null, dv7.M, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, null, e18Var4, 1572912, 0, 261048);
                } else {
                    e18Var4.T();
                }
                break;
            case 5:
                break;
            case 6:
                MobileAppToolPreviewInfo mobileAppToolPreviewInfo = (MobileAppToolPreviewInfo) obj4;
                ld4 ld4Var5 = (ld4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    e18Var5.T();
                } else {
                    kmb.b(mobileAppToolPreviewInfo, 24.0f, e18Var5, 48);
                }
                break;
            case 7:
                eed eedVar = (eed) obj4;
                i4g i4gVar = (i4g) obj;
                ld4 ld4Var6 = (ld4) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                i4gVar.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= ((e18) ld4Var6).f(i4gVar) ? 4 : 2;
                }
                e18 e18Var6 = (e18) ld4Var6;
                if (!e18Var6.Q(1 & iIntValue6, (iIntValue6 & 19) != 18)) {
                    e18Var6.T();
                } else {
                    o82 o82Var = eedVar.c;
                    o82Var.getClass();
                    pvj.a(o82Var, knk.s(gb9.N(b.c, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, i4gVar.b, 7), gb9.d(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, i4gVar.b, 7)), e18Var6, 8);
                }
                break;
            case 8:
                jxb jxbVar = (jxb) obj4;
                jxb.N.set(jxbVar, null);
                jxbVar.d(null);
                break;
            case 9:
                final pmd pmdVar = (pmd) obj4;
                i4g i4gVar2 = (i4g) obj;
                ld4 ld4Var7 = (ld4) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                i4gVar2.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= ((e18) ld4Var7).f(i4gVar2) ? 4 : 2;
                }
                e18 e18Var7 = (e18) ld4Var7;
                if (!e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    e18Var7.T();
                } else {
                    String str2 = (String) pmdVar.g.getValue();
                    boolean zF = e18Var7.f(pmdVar);
                    Object objN = e18Var7.N();
                    if (zF || objN == lz1Var) {
                        final int i7 = z ? 1 : 0;
                        objN = new bz7() { // from class: rmd
                            @Override // defpackage.bz7
                            public final Object invoke(Object obj5) {
                                int i8 = i7;
                                iei ieiVar2 = iei.a;
                                pmd pmdVar2 = pmdVar;
                                String str3 = (String) obj5;
                                switch (i8) {
                                    case 0:
                                        str3.getClass();
                                        pmdVar2.getClass();
                                        pmdVar2.g.setValue(str3);
                                        break;
                                    default:
                                        str3.getClass();
                                        pmdVar2.getClass();
                                        pmdVar2.h.setValue(str3);
                                        break;
                                }
                                return ieiVar2;
                            }
                        };
                        e18Var7.k0(objN);
                    }
                    bz7 bz7Var = (bz7) objN;
                    String str3 = (String) pmdVar.h.getValue();
                    boolean zF2 = e18Var7.f(pmdVar);
                    Object objN2 = e18Var7.N();
                    if (zF2 || objN2 == lz1Var) {
                        objN2 = new bz7() { // from class: rmd
                            @Override // defpackage.bz7
                            public final Object invoke(Object obj5) {
                                int i8 = i6;
                                iei ieiVar2 = iei.a;
                                pmd pmdVar2 = pmdVar;
                                String str32 = (String) obj5;
                                switch (i8) {
                                    case 0:
                                        str32.getClass();
                                        pmdVar2.getClass();
                                        pmdVar2.g.setValue(str32);
                                        break;
                                    default:
                                        str32.getClass();
                                        pmdVar2.getClass();
                                        pmdVar2.h.setValue(str32);
                                        break;
                                }
                                return ieiVar2;
                            }
                        };
                        e18Var7.k0(objN2);
                    }
                    vuk.b(str2, bz7Var, str3, (bz7) objN2, !((Boolean) pmdVar.i.getValue()).booleanValue(), i4gVar2, e18Var7, (iIntValue7 << 15) & 458752);
                }
                break;
            case 10:
                t tVar = (t) obj4;
                ld4 ld4Var8 = (ld4) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var8 = (e18) ld4Var8;
                if (!e18Var8.Q(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    e18Var8.T();
                } else {
                    boolean z = tVar.b;
                    iv1.b(z ? ud0.t1 : ud0.Y0, d4c.j0(z ? R.string.recipe_stop_timer : R.string.recipe_start_timer, e18Var8), null, ef2.F, 0L, e18Var8, 3072, 20);
                    kxk.g(e18Var8, b.t(fqbVar, 6.0f));
                    tjh.b(k7e.d(tVar.a), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var8).e.E).h, e18Var8, 0, 0, 131070);
                }
                break;
            case 11:
                ar arVar = (ar) obj4;
                ld4 ld4Var9 = (ld4) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var9 = (e18) ld4Var9;
                if (!e18Var9.Q(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    e18Var9.T();
                } else {
                    iqb iqbVarL = gb9.L(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, 1);
                    q64 q64VarA = p64.a(ko0.c, lja.S, e18Var9, 0);
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
                    xke.b(arVar, e18Var9, 8);
                    e18Var9.p(true);
                }
                break;
            case 12:
                jme jmeVar = (jme) obj4;
                ld4 ld4Var10 = (ld4) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var10 = (e18) ld4Var10;
                if (!e18Var10.Q(1 & iIntValue10, (iIntValue10 & 17) != 16)) {
                    e18Var10.T();
                } else {
                    kxk.g(e18Var10, b.e(fqbVar, 10.0f));
                    xke.f(jmeVar, e18Var10, 0);
                    kxk.g(e18Var10, b.e(fqbVar, 12.0f));
                }
                break;
            case 13:
                mif mifVar = (mif) obj4;
                iqb iqbVar = (iqb) obj;
                ((Integer) obj3).getClass();
                e18 e18Var11 = (e18) ((ld4) obj2);
                e18Var11.a0(-1914520728);
                cz5 cz5Var = (cz5) e18Var11.j(ve4.h);
                Object objN3 = e18Var11.N();
                Object obj5 = objN3;
                if (objN3 == lz1Var) {
                    lsc lscVarP = mpk.P(new g79(0L));
                    e18Var11.k0(lscVarP);
                    obj5 = lscVarP;
                }
                nwb nwbVar = (nwb) obj5;
                boolean zH = e18Var11.h(mifVar);
                Object objN4 = e18Var11.N();
                Object obj6 = objN4;
                if (zH || objN4 == lz1Var) {
                    aac aacVar = new aac(mifVar, 27, nwbVar);
                    e18Var11.k0(aacVar);
                    obj6 = aacVar;
                }
                zy7 zy7Var = (zy7) obj6;
                boolean zF3 = e18Var11.f(cz5Var);
                Object objN5 = e18Var11.N();
                Object obj7 = objN5;
                if (zF3 || objN5 == lz1Var) {
                    qif qifVar = new qif(cz5Var, nwbVar, z ? 1 : 0);
                    e18Var11.k0(qifVar);
                    obj7 = qifVar;
                }
                pb0 pb0Var = kif.a;
                iqb iqbVarP = kxk.p(iqbVar, new u3e(zy7Var, i3, (bz7) obj7));
                e18Var11.p(false);
                break;
            case 14:
                ucg ucgVar = (ucg) obj4;
                ld4 ld4Var11 = (ld4) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var12 = (e18) ld4Var11;
                if (!e18Var12.Q(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    e18Var12.T();
                } else {
                    owj.b(d4c.j0(ucgVar.a.E, e18Var12), null, 0L, null, null, e18Var12, 0, 30);
                }
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ArtifactMetadata artifactMetadata = (ArtifactMetadata) obj4;
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                ld4 ld4Var12 = (ld4) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= ((e18) ld4Var12).g(zBooleanValue2) ? 4 : 2;
                }
                e18 e18Var13 = (e18) ld4Var12;
                if (!e18Var13.Q(1 & iIntValue12, (iIntValue12 & 19) != 18)) {
                    e18Var13.T();
                } else if (!zBooleanValue2) {
                    e18Var13.a0(1849256207);
                    cv8.b(u00.D(artifactMetadata.getIcon(), 0, e18Var13), d4c.j0(artifactMetadata.getIconLabel(), e18Var13), b.c, 0L, e18Var13, 392, 8);
                    e18Var13.p(false);
                } else {
                    e18Var13.a0(1849063573);
                    tjd.a(b.c, 0L, 2.0f, 0L, 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var13, 390, 58);
                    e18Var13.p(false);
                }
                break;
            case 16:
                mag magVar = (mag) obj4;
                q5b q5bVar = (q5b) obj;
                c3d c3dVarU = ((h5b) obj2).u(((rl4) obj3).a);
                int iM0 = va6.b(Float.NaN, Float.NaN) ? magVar.m == ukc.E ? c3dVarU.E / 2 : c3dVarU.F / 2 : q5bVar.M0(Float.NaN);
                int i8 = c3dVarU.E;
                int i9 = c3dVarU.F;
                Map mapSingletonMap = Collections.singletonMap(lag.f, Integer.valueOf(iM0));
                mapSingletonMap.getClass();
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                zhh zhhVar = (zhh) obj4;
                iqb iqbVar2 = (iqb) obj;
                ((Integer) obj3).getClass();
                e18 e18Var14 = (e18) ((ld4) obj2);
                e18Var14.a0(1980580247);
                cz5 cz5Var2 = (cz5) e18Var14.j(ve4.h);
                Object objN6 = e18Var14.N();
                Object obj8 = objN6;
                if (objN6 == lz1Var) {
                    lsc lscVarP2 = mpk.P(new g79(0L));
                    e18Var14.k0(lscVarP2);
                    obj8 = lscVarP2;
                }
                nwb nwbVar2 = (nwb) obj8;
                boolean zH2 = e18Var14.h(zhhVar);
                Object objN7 = e18Var14.N();
                Object obj9 = objN7;
                if (zH2 || objN7 == lz1Var) {
                    ytf ytfVar = new ytf(zhhVar, i4, nwbVar2);
                    e18Var14.k0(ytfVar);
                    obj9 = ytfVar;
                }
                zy7 zy7Var2 = (zy7) obj9;
                boolean zF4 = e18Var14.f(cz5Var2);
                Object objN8 = e18Var14.N();
                Object obj10 = objN8;
                if (zF4 || objN8 == lz1Var) {
                    qif qifVar2 = new qif(cz5Var2, nwbVar2, i5);
                    e18Var14.k0(qifVar2);
                    obj10 = qifVar2;
                }
                pb0 pb0Var2 = kif.a;
                iqb iqbVarP2 = kxk.p(iqbVar2, new u3e(zy7Var2, i3, (bz7) obj10));
                e18Var14.p(false);
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                zli zliVar = (zli) obj4;
                mnc mncVar = (mnc) obj;
                ld4 ld4Var13 = (ld4) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                mncVar.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= ((e18) ld4Var13).f(mncVar) ? 4 : 2;
                }
                e18 e18Var15 = (e18) ld4Var13;
                if (!e18Var15.Q(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    e18Var15.T();
                } else {
                    mxd mxdVarD = fxd.d(e18Var15);
                    boolean zBooleanValue3 = ((Boolean) zliVar.g.getValue()).booleanValue();
                    boolean zF5 = e18Var15.f(zliVar);
                    Object objN9 = e18Var15.N();
                    if (zF5 || objN9 == lz1Var) {
                        ogf ogfVar = new ogf(0, zliVar, zli.class, "refresh", "refresh()V", 0, 9);
                        e18Var15.k0(ogfVar);
                        objN9 = ogfVar;
                    }
                    iuj.c(zBooleanValue3, (zy7) ((jm9) objN9), b.c, mxdVarD, fd9.q0(-824402843, new zee(zliVar, mncVar, mxdVarD, 5), e18Var15), null, fd9.q0(262556707, new u3e(mncVar, 17, zliVar), e18Var15), e18Var15, 1597824, 32);
                }
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                uli uliVar = (uli) obj4;
                ld4 ld4Var14 = (ld4) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var16 = (e18) ld4Var14;
                if (!e18Var16.Q(1 & iIntValue14, (iIntValue14 & 17) != 16)) {
                    e18Var16.T();
                } else {
                    pqi.f(uliVar, null, e18Var16, 0);
                }
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ud7 ud7Var = (ud7) obj4;
                ld4 ld4Var15 = (ld4) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var17 = (e18) ld4Var15;
                if (!e18Var17.Q(1 & iIntValue15, (iIntValue15 & 17) != 16)) {
                    e18Var17.T();
                } else {
                    String str4 = ud7Var.c;
                    String str5 = ud7Var.b;
                    if (str4 == null) {
                        e18Var17.a0(-424966530);
                        pqi.g(d4c.j0(R.string.usage_spend_this_month, e18Var17), null, null, null, d4c.k0(R.string.usage_spend_used_no_limit, new Object[]{str5}, e18Var17), e18Var17, 48, 12);
                        e18Var17.p(false);
                    } else {
                        e18Var17.a0(-425453757);
                        pqi.g(d4c.j0(R.string.usage_spend_this_month, e18Var17), ud7Var.a, null, d4c.k0(R.string.usage_spend_used_of_limit, new Object[]{str5, ud7Var.c}, e18Var17), null, e18Var17, 0, 20);
                        e18Var17.p(false);
                    }
                }
                break;
            default:
                u1j u1jVar = (u1j) obj4;
                ld4 ld4Var16 = (ld4) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var18 = (e18) ld4Var16;
                if (!e18Var18.Q(1 & iIntValue16, (iIntValue16 & 17) != 16)) {
                    e18Var18.T();
                } else {
                    Object objN10 = e18Var18.N();
                    if (objN10 == lz1Var) {
                        objN10 = mpk.P(u1jVar);
                        e18Var18.k0(objN10);
                    }
                    nwb nwbVar3 = (nwb) objN10;
                    if (u1jVar != null) {
                        nwbVar3.setValue(u1jVar);
                    }
                    u1j u1jVar2 = (u1j) nwbVar3.getValue();
                    if (u1jVar2 == null) {
                        e18Var18.a0(103445867);
                    } else {
                        e18Var18.a0(103445868);
                        yjk.j(u1jVar2, null, e18Var18, 0);
                    }
                    e18Var18.p(false);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ lca(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }
}
