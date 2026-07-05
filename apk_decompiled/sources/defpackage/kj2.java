package defpackage;

import androidx.compose.foundation.layout.b;
import coil3.compose.AsyncImagePainter;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.chat.tool.ImageGalleryItem;
import com.anthropic.claude.api.chat.tool.ImageGalleryItemId;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kj2 implements rz7 {
    public final /* synthetic */ int E = 3;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    public /* synthetic */ kj2(zy7 zy7Var, zy7 zy7Var2, boolean z, nwb nwbVar, nwb nwbVar2) {
        this.G = zy7Var;
        this.H = zy7Var2;
        this.F = z;
        this.I = nwbVar;
        this.J = nwbVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v26 */
    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        ?? r2;
        zy7 zy7Var;
        int i2;
        int i3 = this.E;
        fqb fqbVar = fqb.E;
        Object obj4 = jd4.a;
        boolean z = this.F;
        iei ieiVar = iei.a;
        Object obj5 = this.J;
        Object obj6 = this.I;
        Object obj7 = this.H;
        Object obj8 = this.G;
        switch (i3) {
            case 0:
                zy7 zy7Var2 = (zy7) obj8;
                zy7 zy7Var3 = (zy7) obj7;
                nwb nwbVar = (nwb) obj6;
                nwb nwbVar2 = (nwb) obj5;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean zF = e18Var.f(zy7Var2);
                    Object objN = e18Var.N();
                    if (zF || objN == obj4) {
                        objN = new pn(zy7Var2, nwbVar, 4);
                        e18Var.k0(objN);
                    }
                    t30.b(rwj.c, (zy7) objN, null, null, null, false, null, null, e18Var, 6, 508);
                    boolean zF2 = e18Var.f(zy7Var3);
                    Object objN2 = e18Var.N();
                    if (zF2 || objN2 == obj4) {
                        objN2 = new pn(zy7Var3, nwbVar, 5);
                        e18Var.k0(objN2);
                    }
                    t30.b(rwj.d, (zy7) objN2, null, null, null, false, null, null, e18Var, 6, 508);
                    if (z) {
                        e18Var.a0(434616570);
                        Object objN3 = e18Var.N();
                        if (objN3 == obj4) {
                            objN3 = new ej2(nwbVar, nwbVar2, 0);
                            e18Var.k0(objN3);
                        }
                        t30.b(rwj.e, (zy7) objN3, null, null, null, false, null, null, e18Var, 54, 508);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(434907753);
                        e18Var.p(false);
                    }
                } else {
                    e18Var.T();
                }
                return ieiVar;
            case 1:
                mnc mncVar = (mnc) obj7;
                ta4 ta4Var = (ta4) obj6;
                zy7 zy7Var4 = (zy7) obj8;
                ybg ybgVar = (ybg) obj5;
                i4g i4gVar = (i4g) obj;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                xo1 xo1Var = lja.N;
                i4gVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    i = 6;
                    iIntValue2 |= ((e18) ld4Var2).f(i4gVar) ? 4 : 2;
                } else {
                    i = 6;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    cz5 cz5Var = (cz5) e18Var2.j(ve4.h);
                    Object objN4 = e18Var2.N();
                    if (objN4 == obj4) {
                        objN4 = vb7.g(0, e18Var2);
                    }
                    isc iscVar = (isc) objN4;
                    float fC0 = (!z || iscVar.h() <= 0) ? Float.NaN : cz5Var.c0(iscVar.h()) + 16.0f;
                    iqb iqbVarN = gb9.N(gb9.I(b.c, mncVar), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, i4gVar.b, 7);
                    o5b o5bVarD = dw1.d(lja.G, false);
                    int iHashCode = Long.hashCode(e18Var2.T);
                    hyc hycVarL = e18Var2.l();
                    iqb iqbVarE = kxk.E(e18Var2, iqbVarN);
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
                    Object va6Var = new va6(fC0);
                    Object objValueOf = Integer.valueOf(i);
                    nw1 nw1Var = nw1.a;
                    ta4Var.i(nw1Var, va6Var, e18Var2, objValueOf);
                    if (z) {
                        e18Var2.a0(-704334950);
                        zy7 zy7VarE = tvj.e(zy7Var4, e18Var2);
                        long j = gm3.a(e18Var2).r;
                        long j2 = gm3.a(e18Var2).M;
                        iqb iqbVarN2 = gb9.N(nw1Var.a(fqbVar, xo1Var), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 7);
                        Object objN5 = e18Var2.N();
                        if (objN5 == obj4) {
                            objN5 = new tn(iscVar, 4);
                            e18Var2.k0(objN5);
                        }
                        zmk.b(zy7VarE, wd6.v0(iqbVarN2, (bz7) objN5), null, j, j2, null, ykk.a, e18Var2, 12582912, 100);
                        r2 = 0;
                        e18Var2.p(false);
                    } else {
                        r2 = 0;
                        e18Var2.a0(-703445591);
                        e18Var2.p(false);
                    }
                    if (ybgVar != null) {
                        e18Var2.a0(-703393046);
                        iv1.c(ybgVar, nw1Var.a(b.c(fqbVar, 1.0f), xo1Var), e18Var2, r2, r2);
                        e18Var2.p(r2);
                    } else {
                        e18Var2.a0(-703147991);
                        e18Var2.p(r2);
                    }
                    e18Var2.p(true);
                } else {
                    e18Var2.T();
                }
                return ieiVar;
            case 2:
                List list = (List) obj8;
                ArrayList arrayList = (ArrayList) obj7;
                String str = (String) obj6;
                pz7 pz7Var = (pz7) obj5;
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var3 = (e18) ld4Var3;
                if (e18Var3.Q(1 & iIntValue3, (iIntValue3 & 17) != 16)) {
                    int i4 = 0;
                    for (Object obj9 : list) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            x44.n0();
                            throw null;
                        }
                        ImageGalleryItem imageGalleryItem = (ImageGalleryItem) obj9;
                        AsyncImagePainter asyncImagePainter = (AsyncImagePainter) arrayList.get(i4);
                        boolean zM307equalsimpl0 = str == null ? false : ImageGalleryItemId.m307equalsimpl0(imageGalleryItem.m303getIdivCCbqw(), str);
                        if (pz7Var == null) {
                            e18Var3.a0(-781946573);
                            e18Var3.p(false);
                            zy7Var = null;
                        } else {
                            e18Var3.a0(-781946572);
                            boolean zF3 = e18Var3.f(pz7Var) | e18Var3.h(list) | e18Var3.f(imageGalleryItem);
                            Object objN6 = e18Var3.N();
                            if (zF3 || objN6 == obj4) {
                                objN6 = new yg4(pz7Var, list, imageGalleryItem, 23);
                                e18Var3.k0(objN6);
                            }
                            e18Var3.p(false);
                            zy7Var = (zy7) objN6;
                        }
                        fuk.h(imageGalleryItem, asyncImagePainter, zM307equalsimpl0, this.F, null, zy7Var, e18Var3, 0);
                        i4 = i5;
                    }
                } else {
                    e18Var3.T();
                }
                return ieiVar;
            default:
                buf bufVar = (buf) obj8;
                ta4 ta4Var2 = (ta4) obj7;
                String str2 = (String) obj6;
                String str3 = (String) obj5;
                dxe dxeVar = (dxe) obj;
                ld4 ld4Var4 = (ld4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                dxeVar.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((e18) ld4Var4).f(dxeVar) ? 4 : 2;
                }
                e18 e18Var4 = (e18) ld4Var4;
                if (e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    npf.f(bufVar, z, null, e18Var4, 0);
                    ho0 ho0Var = new ho0(2.0f, true, new sz6(1));
                    iqb iqbVarA = dxeVar.a(fqbVar, 1.0f, true);
                    q64 q64VarA = p64.a(ho0Var, lja.S, e18Var4, 6);
                    int iHashCode2 = Long.hashCode(e18Var4.T);
                    hyc hycVarL2 = e18Var4.l();
                    iqb iqbVarE2 = kxk.E(e18Var4, iqbVarA);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var4.e0();
                    if (e18Var4.S) {
                        e18Var4.k(re4Var2);
                    } else {
                        e18Var4.n0();
                    }
                    z80 z80Var = cd4.f;
                    d4c.i0(e18Var4, z80Var, q64VarA);
                    z80 z80Var2 = cd4.e;
                    d4c.i0(e18Var4, z80Var2, hycVarL2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    z80 z80Var3 = cd4.g;
                    d4c.i0(e18Var4, z80Var3, numValueOf);
                    bx bxVar = cd4.h;
                    d4c.h0(e18Var4, bxVar);
                    z80 z80Var4 = cd4.d;
                    d4c.i0(e18Var4, z80Var4, iqbVarE2);
                    cxe cxeVarA = axe.a(new ho0(8.0f, true, new sz6(1)), lja.Q, e18Var4, 54);
                    int iHashCode3 = Long.hashCode(e18Var4.T);
                    hyc hycVarL3 = e18Var4.l();
                    iqb iqbVarE3 = kxk.E(e18Var4, fqbVar);
                    e18Var4.e0();
                    if (e18Var4.S) {
                        e18Var4.k(re4Var2);
                    } else {
                        e18Var4.n0();
                    }
                    d4c.i0(e18Var4, z80Var, cxeVarA);
                    d4c.i0(e18Var4, z80Var2, hycVarL3);
                    ij0.t(iHashCode3, e18Var4, z80Var3, e18Var4, bxVar);
                    d4c.i0(e18Var4, z80Var4, iqbVarE3);
                    tjh.b(str2, new hw9(1.0f, true), gm3.a(e18Var4).M, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var4).e.E).g, e18Var4, 0, 24960, 110584);
                    if (str3 != null) {
                        e18Var4.a0(479801475);
                        tjh.b(str3, null, gm3.a(e18Var4).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((jm3) gm3.c(e18Var4).e.E).i, e18Var4, 0, 24576, 114682);
                        i2 = 0;
                        e18Var4.p(false);
                    } else {
                        i2 = 0;
                        e18Var4.a0(480047088);
                        e18Var4.p(false);
                    }
                    e18Var4.p(true);
                    ta4Var2.invoke(e18Var4, Integer.valueOf(i2));
                    e18Var4.p(true);
                } else {
                    e18Var4.T();
                }
                return ieiVar;
        }
    }

    public /* synthetic */ kj2(buf bufVar, boolean z, ta4 ta4Var, String str, String str2) {
        this.G = bufVar;
        this.F = z;
        this.H = ta4Var;
        this.I = str;
        this.J = str2;
    }

    public /* synthetic */ kj2(List list, ArrayList arrayList, String str, boolean z, pz7 pz7Var) {
        this.G = list;
        this.H = arrayList;
        this.I = str;
        this.F = z;
        this.J = pz7Var;
    }

    public /* synthetic */ kj2(boolean z, mnc mncVar, ta4 ta4Var, zy7 zy7Var, ybg ybgVar) {
        this.F = z;
        this.H = mncVar;
        this.I = ta4Var;
        this.G = zy7Var;
        this.J = ybgVar;
    }
}
