package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import coil.compose.AsyncImagePainter;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.design.icon.a;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zee implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ zee(Object obj, Object obj2, Object obj3, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        bpc bpcVarA;
        int i = this.E;
        fqb fqbVar = fqb.E;
        lz1 lz1Var = jd4.a;
        int i2 = 18;
        iei ieiVar = iei.a;
        Object obj4 = this.H;
        Object obj5 = this.G;
        Object obj6 = this.F;
        int i3 = 1;
        switch (i) {
            case 0:
                cz5 cz5Var = (cz5) obj6;
                AsyncImagePainter asyncImagePainter = (AsyncImagePainter) obj5;
                String str = (String) obj4;
                qw1 qw1Var = (qw1) obj;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                qw1Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((e18) ld4Var).f(qw1Var) ? 4 : 2;
                }
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    boolean zF = e18Var.f(cz5Var) | e18Var.f(asyncImagePainter);
                    Object objN = e18Var.N();
                    if (zF || objN == lz1Var) {
                        objN = mpk.w(new hya(asyncImagePainter, qw1Var, cz5Var, 17));
                        e18Var.k0(objN);
                    }
                    xn5.N(asyncImagePainter, str, (iqb) ((wlg) objN).getValue(), null, ho4.d, MTTypesetterKt.kLineSkipLimitMultiplier, null, e18Var, 0, 104);
                } else {
                    e18Var.T();
                }
                break;
            case 1:
                qnd qndVar = (qnd) obj6;
                bz7 bz7Var = (bz7) obj5;
                ybg ybgVar = (ybg) obj4;
                i4g i4gVar = (i4g) obj;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                i4gVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((e18) ld4Var2).f(i4gVar) ? 4 : 2;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    FillElement fillElement = b.c;
                    o5b o5bVarD = dw1.d(lja.G, false);
                    int iHashCode = Long.hashCode(e18Var2.T);
                    hyc hycVarL = e18Var2.l();
                    iqb iqbVarE = kxk.E(e18Var2, fillElement);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var2.e0();
                    if (e18Var2.S) {
                        e18Var2.k(re4Var);
                    } else {
                        e18Var2.n0();
                    }
                    d4c.i0(e18Var2, cd4.f, o5bVarD);
                    d4c.i0(e18Var2, cd4.e, hycVarL);
                    d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var2, cd4.h);
                    d4c.i0(e18Var2, cd4.d, iqbVarE);
                    boolean zF2 = e18Var2.f(bz7Var);
                    Object objN2 = e18Var2.N();
                    if (zF2 || objN2 == lz1Var) {
                        objN2 = new f7(i2, bz7Var);
                        e18Var2.k0(objN2);
                    }
                    nvk.e(qndVar, (bz7) objN2, i4gVar, e18Var2, ((iIntValue2 << 6) & 896) | 8);
                    if (ybgVar != null) {
                        e18Var2.a0(796657773);
                        iv1.c(ybgVar, mpk.k0(mpk.k0(nw1.a.a(fqbVar, lja.M), mpk.o), mpk.n), e18Var2, 0, 0);
                        e18Var2.p(false);
                    } else {
                        e18Var2.a0(796947034);
                        e18Var2.p(false);
                    }
                    e18Var2.p(true);
                } else {
                    e18Var2.T();
                }
                break;
            case 2:
                bz7 bz7Var2 = (bz7) obj6;
                List<r7i> list = (List) obj5;
                Set set = (Set) obj4;
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var3 = (e18) ld4Var3;
                if (e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    boolean zF3 = e18Var3.f(bz7Var2);
                    Object objN3 = e18Var3.N();
                    if (zF3 || objN3 == lz1Var) {
                        objN3 = new zb2(19, bz7Var2);
                        e18Var3.k0(objN3);
                    }
                    uuj.a("Show all", null, (zy7) objN3, null, null, false, null, null, null, null, 0, 0, e18Var3, 54, 4088);
                    boolean zF4 = e18Var3.f(bz7Var2) | e18Var3.h(list);
                    Object objN4 = e18Var3.N();
                    if (zF4 || objN4 == lz1Var) {
                        objN4 = new ytf(bz7Var2, 13, list);
                        e18Var3.k0(objN4);
                    }
                    uuj.a("Hide all", null, (zy7) objN4, null, null, false, null, null, null, null, 0, 0, e18Var3, 54, 4088);
                    iuj.e(null, MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var3).v, e18Var3, 0, 3);
                    for (r7i r7iVar : list) {
                        String str2 = (String) r7iVar.E;
                        int iIntValue4 = ((Number) r7iVar.F).intValue();
                        boolean zContains = set.contains(str2);
                        boolean z = !zContains;
                        String str3 = str2 + " (" + iIntValue4 + ")";
                        if (zContains) {
                            e18Var3.a0(1571754525);
                            e18Var3.p(false);
                            bpcVarA = null;
                        } else {
                            e18Var3.a0(1297627335);
                            bpcVarA = a.a(ud0.L, e18Var3);
                            e18Var3.p(false);
                        }
                        bpc bpcVar = bpcVarA;
                        boolean zF5 = e18Var3.f(bz7Var2) | e18Var3.g(z) | e18Var3.h(set) | e18Var3.f(str2);
                        Object objN5 = e18Var3.N();
                        if (zF5 || objN5 == lz1Var) {
                            gt0 gt0Var = new gt0(bz7Var2, z, set, str2, 6);
                            e18Var3.k0(gt0Var);
                            objN5 = gt0Var;
                        }
                        uuj.a(str3, null, (zy7) objN5, null, bpcVar, false, Boolean.valueOf(z), null, null, null, 0, 0, e18Var3, 32816, 4008);
                    }
                } else {
                    e18Var3.T();
                }
                break;
            case 3:
                aah aahVar = (aah) obj6;
                ybg ybgVar2 = (ybg) obj5;
                t4g t4gVar = (t4g) obj4;
                mnc mncVar = (mnc) obj;
                ld4 ld4Var4 = (ld4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                mncVar.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((e18) ld4Var4).f(mncVar) ? 4 : 2;
                }
                e18 e18Var4 = (e18) ld4Var4;
                if (e18Var4.Q(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    zni.g(aahVar.i, ybgVar2, e18Var4, 48);
                    boolean zBooleanValue = ((Boolean) aahVar.f.getValue()).booleanValue();
                    boolean zH = e18Var4.h(aahVar);
                    Object objN6 = e18Var4.N();
                    if (zH || objN6 == lz1Var) {
                        objN6 = new ogf(0, aahVar, aah.class, "refresh", "refresh()V", 0, 7);
                        e18Var4.k0(objN6);
                    }
                    iuj.c(zBooleanValue, (zy7) ((jm9) objN6), gb9.I(b.c, mncVar), null, null, null, fd9.q0(1602196073, new u3e(aahVar, 14, t4gVar), e18Var4), e18Var4, 1572864, 56);
                } else {
                    e18Var4.T();
                }
                break;
            case 4:
                List<iyh> list2 = (List) obj6;
                mnc mncVar2 = (mnc) obj5;
                nwb nwbVar = (nwb) obj4;
                ld4 ld4Var5 = (ld4) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var5 = (e18) ld4Var5;
                if (e18Var5.Q(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    q64 q64VarA = p64.a(ko0.c, lja.S, e18Var5, 0);
                    int iHashCode2 = Long.hashCode(e18Var5.T);
                    hyc hycVarL2 = e18Var5.l();
                    iqb iqbVarE2 = kxk.E(e18Var5, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var5.e0();
                    if (e18Var5.S) {
                        e18Var5.k(re4Var2);
                    } else {
                        e18Var5.n0();
                    }
                    d4c.i0(e18Var5, cd4.f, q64VarA);
                    d4c.i0(e18Var5, cd4.e, hycVarL2);
                    d4c.i0(e18Var5, cd4.g, Integer.valueOf(iHashCode2));
                    d4c.h0(e18Var5, cd4.h);
                    d4c.i0(e18Var5, cd4.d, iqbVarE2);
                    e18Var5.a0(-1855831564);
                    for (iyh iyhVar : list2) {
                        boolean zH2 = e18Var5.h(iyhVar);
                        Object objN7 = e18Var5.N();
                        if (zH2 || objN7 == lz1Var) {
                            objN7 = new ytf(iyhVar, 24, nwbVar);
                            e18Var5.k0(objN7);
                        }
                        t1i.a(iyhVar, (zy7) objN7, mncVar2, b.c(fqbVar, 1.0f), e18Var5, 3072);
                    }
                    e18Var5.p(false);
                    e18Var5.p(true);
                } else {
                    e18Var5.T();
                }
                break;
            case 5:
                zli zliVar = (zli) obj6;
                mnc mncVar3 = (mnc) obj5;
                mxd mxdVar = (mxd) obj4;
                mw1 mw1Var = (mw1) obj;
                ld4 ld4Var6 = (ld4) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                mw1Var.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= ((e18) ld4Var6).f(mw1Var) ? 4 : 2;
                }
                e18 e18Var6 = (e18) ld4Var6;
                if (e18Var6.Q(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    bxd.a.a(mxdVar, ((Boolean) zliVar.g.getValue()).booleanValue(), gb9.I(mw1Var.a(fqbVar, lja.H), mncVar3), 0L, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var6, 1572864);
                } else {
                    e18Var6.T();
                }
                break;
            default:
                g4j g4jVar = (g4j) obj6;
                nwb nwbVar2 = (nwb) obj5;
                bz7 bz7Var3 = (bz7) obj4;
                wb7 wb7Var = (wb7) obj;
                ld4 ld4Var7 = (ld4) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                wb7Var.getClass();
                if ((iIntValue8 & 6) == 0) {
                    e18 e18Var7 = (e18) ld4Var7;
                    iIntValue8 |= (iIntValue8 & 8) == 0 ? e18Var7.f(wb7Var) : e18Var7.h(wb7Var) ? 4 : 2;
                }
                e18 e18Var8 = (e18) ld4Var7;
                if (e18Var8.Q(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    wo1 wo1Var = lja.Q;
                    iqb iqbVarB = wb7Var.b(b.c(fqbVar, 1.0f), "PrimaryEditable", true);
                    cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var8, 48);
                    int iHashCode3 = Long.hashCode(e18Var8.T);
                    hyc hycVarL3 = e18Var8.l();
                    iqb iqbVarE3 = kxk.E(e18Var8, iqbVarB);
                    dd4.e.getClass();
                    re4 re4Var3 = cd4.b;
                    e18Var8.e0();
                    if (e18Var8.S) {
                        e18Var8.k(re4Var3);
                    } else {
                        e18Var8.n0();
                    }
                    d4c.i0(e18Var8, cd4.f, cxeVarA);
                    d4c.i0(e18Var8, cd4.e, hycVarL3);
                    d4c.i0(e18Var8, cd4.g, Integer.valueOf(iHashCode3));
                    d4c.h0(e18Var8, cd4.h);
                    d4c.i0(e18Var8, cd4.d, iqbVarE3);
                    tjh.b(d4c.j0(g4jVar.F, e18Var8), null, gm3.a(e18Var8).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var8).e.E).g, e18Var8, 0, 0, 131066);
                    kxk.g(e18Var8, new hw9(1.0f, true));
                    iv1.b(ud0.B, null, null, ef2.F, 0L, e18Var8, 3120, 20);
                    e18Var8.p(true);
                    boolean zBooleanValue2 = ((Boolean) nwbVar2.getValue()).booleanValue();
                    Object objN8 = e18Var8.N();
                    if (objN8 == lz1Var) {
                        objN8 = new h4j(0, nwbVar2);
                        e18Var8.k0(objN8);
                    }
                    j8.b(zBooleanValue2, (zy7) objN8, null, 0L, null, null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(230750656, new yg7(bz7Var3, nwbVar2, i3), e18Var8), e18Var8, 48, 2044);
                } else {
                    e18Var8.T();
                }
                break;
        }
        return ieiVar;
    }
}
