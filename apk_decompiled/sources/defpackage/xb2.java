package defpackage;

import android.app.Activity;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.artifact.model.ArtifactMetadata;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xb2 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;

    public /* synthetic */ xb2(int i, int i2, Object obj, boolean z) {
        this.E = i2;
        this.G = obj;
        this.F = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        int i3 = this.E;
        float f = MTTypesetterKt.kLineSkipLimitMultiplier;
        int i4 = 7;
        lz1 lz1Var = jd4.a;
        fqb fqbVar = fqb.E;
        boolean z = this.F;
        iei ieiVar = iei.a;
        Object obj3 = this.G;
        switch (i3) {
            case 0:
                nxf nxfVar = (nxf) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tjh.b(d4c.j0(R.string.melange_settings_title, e18Var), null, nxfVar.a(z), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 0, 131066);
                } else {
                    e18Var.T();
                }
                return ieiVar;
            case 1:
                by2 by2Var = (by2) obj3;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    o5b o5bVarD = dw1.d(lja.K, false);
                    int iHashCode = Long.hashCode(e18Var2.T);
                    hyc hycVarL = e18Var2.l();
                    iqb iqbVarE = kxk.E(e18Var2, fqbVar);
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
                    gm3.b.getClass();
                    wd6.M(this.F, null, ul3.c, ul3.d, null, uwj.a, e18Var2, 196608, 18);
                    Object objN = e18Var2.N();
                    if (objN == lz1Var) {
                        objN = new it2(4);
                        e18Var2.k0(objN);
                    }
                    xn5.G(by2Var, null, (bz7) objN, null, null, null, uwj.b, e18Var2, 1573248, 58);
                    e18Var2.p(true);
                } else {
                    e18Var2.T();
                }
                return ieiVar;
            case 2:
                j0a j0aVar = (j0a) obj;
                j0aVar.getClass();
                ((mnc) obj2).getClass();
                j0a.V(j0aVar, null, null, new ta4(-77774544, true, new nk4(false ? 1 : 0, (bz7) obj3, z)), 3);
                return ieiVar;
            case 3:
                y85 y85Var = (y85) obj3;
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else if (z) {
                    e18Var3.a0(1698718427);
                    e18Var3.p(false);
                } else {
                    e18Var3.a0(1698393609);
                    q64 q64VarA = p64.a(ko0.c, lja.S, e18Var3, 0);
                    int iHashCode2 = Long.hashCode(e18Var3.T);
                    hyc hycVarL2 = e18Var3.l();
                    iqb iqbVarE2 = kxk.E(e18Var3, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var3.e0();
                    if (e18Var3.S) {
                        e18Var3.k(re4Var2);
                    } else {
                        e18Var3.n0();
                    }
                    d4c.i0(e18Var3, cd4.f, q64VarA);
                    d4c.i0(e18Var3, cd4.e, hycVarL2);
                    d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode2));
                    d4c.h0(e18Var3, cd4.h);
                    d4c.i0(e18Var3, cd4.d, iqbVarE2);
                    cvk.g(y85Var, e18Var3, 0);
                    WeakHashMap weakHashMap = gdj.x;
                    kxk.g(e18Var3, b.g(fik.n(s4i.d(e18Var3).m), 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2));
                    e18Var3.p(true);
                    e18Var3.p(false);
                }
                return ieiVar;
            case 4:
                pz7 pz7Var = (pz7) obj3;
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e18Var4.T();
                } else if (z) {
                    e18Var4.a0(-1890769581);
                    dxj.b(0, e18Var4);
                    e18Var4.p(false);
                } else {
                    e18Var4.a0(-1890711270);
                    pz7Var.invoke(e18Var4, 0);
                    e18Var4.p(false);
                }
                return ieiVar;
            case 5:
                ta4 ta4Var = (ta4) obj3;
                ld4 ld4Var5 = (ld4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                e18 e18Var5 = (e18) ld4Var5;
                if (e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    iqb iqbVarL = zni.L(fqbVar, "text");
                    if (z) {
                        f = ldb.b;
                    }
                    iqb iqbVarN = gb9.N(iqbVarL, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, f, MTTypesetterKt.kLineSkipLimitMultiplier, 11);
                    o5b o5bVarD2 = dw1.d(lja.J, false);
                    int iHashCode3 = Long.hashCode(e18Var5.T);
                    hyc hycVarL3 = e18Var5.l();
                    iqb iqbVarE3 = kxk.E(e18Var5, iqbVarN);
                    dd4.e.getClass();
                    re4 re4Var3 = cd4.b;
                    e18Var5.e0();
                    if (e18Var5.S) {
                        e18Var5.k(re4Var3);
                    } else {
                        e18Var5.n0();
                    }
                    d4c.i0(e18Var5, cd4.f, o5bVarD2);
                    d4c.i0(e18Var5, cd4.e, hycVarL3);
                    d4c.i0(e18Var5, cd4.g, Integer.valueOf(iHashCode3));
                    d4c.h0(e18Var5, cd4.h);
                    d4c.i0(e18Var5, cd4.d, iqbVarE3);
                    e18Var5.a0(705551694);
                    ta4Var.invoke(e18Var5, 0);
                    e18Var5.p(false);
                    e18Var5.p(true);
                } else {
                    e18Var5.T();
                }
                return ieiVar;
            case 6:
                jgd jgdVar = (jgd) obj3;
                ld4 ld4Var6 = (ld4) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                e18 e18Var6 = (e18) ld4Var6;
                if (e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    zsk.d(((Boolean) jgdVar.j.getValue()).booleanValue(), gb9.N(fqb.E, 4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 14), this.F, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var6, 1572912, 56);
                } else {
                    e18Var6.T();
                }
                return ieiVar;
            case 7:
                gnd gndVar = (gnd) obj3;
                ld4 ld4Var7 = (ld4) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                e18 e18Var7 = (e18) ld4Var7;
                if (e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    o5b o5bVarD3 = dw1.d(lja.K, false);
                    int iHashCode4 = Long.hashCode(e18Var7.T);
                    hyc hycVarL4 = e18Var7.l();
                    iqb iqbVarE4 = kxk.E(e18Var7, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var4 = cd4.b;
                    e18Var7.e0();
                    if (e18Var7.S) {
                        e18Var7.k(re4Var4);
                    } else {
                        e18Var7.n0();
                    }
                    d4c.i0(e18Var7, cd4.f, o5bVarD3);
                    d4c.i0(e18Var7, cd4.e, hycVarL4);
                    d4c.i0(e18Var7, cd4.g, Integer.valueOf(iHashCode4));
                    d4c.h0(e18Var7, cd4.h);
                    d4c.i0(e18Var7, cd4.d, iqbVarE4);
                    gm3.b.getClass();
                    wd6.M(this.F, null, ul3.c, ul3.d, null, hsk.a, e18Var7, 196608, 18);
                    Object objN2 = e18Var7.N();
                    if (objN2 == lz1Var) {
                        objN2 = new f7d(14);
                        e18Var7.k0(objN2);
                    }
                    xn5.G(gndVar, null, (bz7) objN2, null, null, null, hsk.b, e18Var7, 1573248, 58);
                    e18Var7.p(true);
                } else {
                    e18Var7.T();
                }
                return ieiVar;
            case 8:
                lod lodVar = (lod) obj3;
                ld4 ld4Var8 = (ld4) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                e18 e18Var8 = (e18) ld4Var8;
                if (e18Var8.Q(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    tji tjiVarO = lodVar.O();
                    tji tjiVar = tji.E;
                    if (tjiVarO == tjiVar) {
                        i = 1465750395;
                        i2 = R.string.generic_button_continue;
                    } else {
                        i = 1465842527;
                        i2 = R.string.generic_button_done;
                    }
                    String strN = vb7.n(e18Var8, i, i2, e18Var8, false);
                    boolean z2 = lodVar.O() == tjiVar;
                    boolean zF = e18Var8.f(lodVar);
                    Object objN3 = e18Var8.N();
                    if (zF || objN3 == lz1Var) {
                        objN3 = new iod(lodVar, i4);
                        e18Var8.k0(objN3);
                    }
                    qik.h(lodVar, this.F, z2, (zy7) objN3, strN, e18Var8, 0);
                } else {
                    e18Var8.T();
                }
                return ieiVar;
            case 9:
                ((Integer) obj2).getClass();
                b1e.a((Activity) obj3, z, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 10:
                ArtifactMetadata artifactMetadata = (ArtifactMetadata) obj3;
                ld4 ld4Var9 = (ld4) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                e18 e18Var9 = (e18) ld4Var9;
                if (e18Var9.Q(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    xo1 xo1Var = lja.K;
                    iqb iqbVarO = b.o(gb9.N(fqb.E, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), 16.0f);
                    o5b o5bVarD4 = dw1.d(xo1Var, false);
                    int iHashCode5 = Long.hashCode(e18Var9.T);
                    hyc hycVarL5 = e18Var9.l();
                    iqb iqbVarE5 = kxk.E(e18Var9, iqbVarO);
                    dd4.e.getClass();
                    re4 re4Var5 = cd4.b;
                    e18Var9.e0();
                    if (e18Var9.S) {
                        e18Var9.k(re4Var5);
                    } else {
                        e18Var9.n0();
                    }
                    d4c.i0(e18Var9, cd4.f, o5bVarD4);
                    d4c.i0(e18Var9, cd4.e, hycVarL5);
                    d4c.i0(e18Var9, cd4.g, Integer.valueOf(iHashCode5));
                    d4c.h0(e18Var9, cd4.h);
                    d4c.i0(e18Var9, cd4.d, iqbVarE5);
                    knk.e(Boolean.valueOf(z), null, null, null, fd9.q0(-1710514517, new lca(15, artifactMetadata), e18Var9), e18Var9, 24576, 14);
                    e18Var9.p(true);
                } else {
                    e18Var9.T();
                }
                return ieiVar;
            case 11:
                xd6 xd6Var = (xd6) obj;
                aag aagVar = aag.a;
                xd6.C0(xd6Var, ((v9g) obj3).a(z, true), xd6Var.q0(aag.b) / 2.0f, ((fcc) obj2).a, null, 120);
                return ieiVar;
            case 12:
                m0h m0hVar = (m0h) obj3;
                vq5 vq5VarA = fy.a(new xu0((g79) obj, z, i4));
                q28 q28Var = m0hVar.a;
                q28 q28Var2 = m0hVar.a;
                Object[] objArr = ((ry) q28Var.F).c().c > 0 ? 1 : 0;
                n0h n0hVar = (n0h) ((ry) q28Var2.F).g.getValue();
                n0h n0hVar2 = (n0h) ((wz5) q28Var2.G).getValue();
                if (objArr != 0 || !vq5VarA.c(n0hVar)) {
                    n0hVar = vq5VarA.c(n0hVar2) ? n0hVar2 : n0h.G;
                }
                return new cpc(vq5VarA, n0hVar);
            default:
                ((Integer) obj2).getClass();
                bij.a((List) obj3, z, (ld4) obj, x44.p0(1));
                return ieiVar;
        }
    }

    public /* synthetic */ xb2(Object obj, boolean z, int i) {
        this.E = i;
        this.G = obj;
        this.F = z;
    }

    public /* synthetic */ xb2(boolean z, Object obj, int i) {
        this.E = i;
        this.F = z;
        this.G = obj;
    }
}
