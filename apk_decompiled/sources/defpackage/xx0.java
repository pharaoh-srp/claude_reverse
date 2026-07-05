package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.mainactivity.AssistantOverlayActivity;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xx0 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ AssistantOverlayActivity F;
    public final /* synthetic */ String G;

    public /* synthetic */ xx0(AssistantOverlayActivity assistantOverlayActivity, String str, int i) {
        this.E = i;
        this.F = assistantOverlayActivity;
        this.G = str;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2 = this.E;
        fo0 fo0Var = ko0.a;
        lz1 lz1Var = jd4.a;
        fqb fqbVar = fqb.E;
        final String str = this.G;
        final AssistantOverlayActivity assistantOverlayActivity = this.F;
        iei ieiVar = iei.a;
        int i3 = 2;
        final int i4 = 1;
        switch (i2) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i5 = AssistantOverlayActivity.d0;
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    wo1 wo1Var = lja.Q;
                    iqb iqbVarK = gb9.K(b.c(fqbVar, 1.0f), 8.0f, 4.0f);
                    cxe cxeVarA = axe.a(fo0Var, wo1Var, e18Var, 48);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarK);
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
                    if (1.0f <= 0.0d) {
                        z29.a("invalid weight; must be greater than zero");
                    }
                    kxk.g(e18Var, new hw9(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                    uu1.a.a(null, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, 0L, e18Var, 196608);
                    if (1.0f <= 0.0d) {
                        z29.a("invalid weight; must be greater than zero");
                    }
                    kxk.g(e18Var, new hw9(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                    boolean zH = e18Var.h(assistantOverlayActivity) | e18Var.f(str);
                    Object objN = e18Var.N();
                    if (zH || objN == lz1Var) {
                        objN = new zy7() { // from class: yx0
                            @Override // defpackage.zy7
                            public final Object a() {
                                int i6 = i4;
                                iei ieiVar2 = iei.a;
                                String str2 = str;
                                AssistantOverlayActivity assistantOverlayActivity2 = assistantOverlayActivity;
                                switch (i6) {
                                    case 0:
                                        int i7 = AssistantOverlayActivity.d0;
                                        assistantOverlayActivity2.p(str2);
                                        break;
                                    default:
                                        int i8 = AssistantOverlayActivity.d0;
                                        assistantOverlayActivity2.p(str2);
                                        break;
                                }
                                return ieiVar2;
                            }
                        };
                        e18Var.k0(objN);
                    }
                    ez1.e((zy7) objN, null, false, null, null, lvj.b, e18Var, 1572864, 62);
                    e18Var.p(true);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i6 = AssistantOverlayActivity.d0;
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    olh.a(true, af2.a, oai.a(false, e18Var2, 1), fd9.q0(-19481249, new xx0(assistantOverlayActivity, str, i3), e18Var2), e18Var2, 3126, 0);
                }
                break;
            case 2:
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i7 = AssistantOverlayActivity.d0;
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    v4g v4gVarG = iuj.G(true, null, e18Var3, 6, 2);
                    Object objN2 = e18Var3.N();
                    if (objN2 == lz1Var) {
                        objN2 = fd9.O(im6.E, e18Var3);
                        e18Var3.k0(objN2);
                    }
                    l45 l45Var = (l45) objN2;
                    vve vveVarD = xve.d(28.0f, 28.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 12);
                    long j = gm3.a(e18Var3).p;
                    long j2 = gm3.a(e18Var3).M;
                    long jB = d54.b(0.5f, d54.b);
                    WeakHashMap weakHashMap = gdj.x;
                    iqb iqbVarM = knk.M(fqbVar, new a5a(s4i.d(e18Var3).m, 16));
                    AssistantOverlayActivity assistantOverlayActivity2 = this.F;
                    boolean zH2 = e18Var3.h(assistantOverlayActivity2);
                    Object objN3 = e18Var3.N();
                    if (zH2 || objN3 == lz1Var) {
                        i = 0;
                        objN3 = new wx0(assistantOverlayActivity2, 0);
                        e18Var3.k0(objN3);
                    } else {
                        i = 0;
                    }
                    String str2 = this.G;
                    iuj.f((zy7) objN3, iqbVarM, v4gVarG, MTTypesetterKt.kLineSkipLimitMultiplier, false, vveVarD, j, j2, jB, fd9.q0(-1111550006, new xx0(assistantOverlayActivity2, str2, i), e18Var3), new te(6), null, fd9.q0(-1727777603, new bn(str2, l45Var, v4gVarG, assistantOverlayActivity2, 3), e18Var3), e18Var3, 805306368, 3078, 4376);
                }
                break;
            default:
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i8 = AssistantOverlayActivity.d0;
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e18Var4.T();
                } else {
                    wo1 wo1Var2 = lja.Q;
                    iqb iqbVarK2 = gb9.K(b.c(fqbVar, 1.0f), 8.0f, 4.0f);
                    cxe cxeVarA2 = axe.a(fo0Var, wo1Var2, e18Var4, 48);
                    int iHashCode2 = Long.hashCode(e18Var4.T);
                    hyc hycVarL2 = e18Var4.l();
                    iqb iqbVarE2 = kxk.E(e18Var4, iqbVarK2);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var4.e0();
                    if (e18Var4.S) {
                        e18Var4.k(re4Var2);
                    } else {
                        e18Var4.n0();
                    }
                    d4c.i0(e18Var4, cd4.f, cxeVarA2);
                    d4c.i0(e18Var4, cd4.e, hycVarL2);
                    d4c.i0(e18Var4, cd4.g, Integer.valueOf(iHashCode2));
                    d4c.h0(e18Var4, cd4.h);
                    d4c.i0(e18Var4, cd4.d, iqbVarE2);
                    if (1.0f <= 0.0d) {
                        z29.a("invalid weight; must be greater than zero");
                    }
                    kxk.g(e18Var4, new hw9(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                    uu1.a.a(null, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, 0L, e18Var4, 196608);
                    if (1.0f <= 0.0d) {
                        z29.a("invalid weight; must be greater than zero");
                    }
                    kxk.g(e18Var4, new hw9(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                    boolean zH3 = e18Var4.h(assistantOverlayActivity) | e18Var4.f(str);
                    Object objN4 = e18Var4.N();
                    if (zH3 || objN4 == lz1Var) {
                        final int i9 = 0;
                        objN4 = new zy7() { // from class: yx0
                            @Override // defpackage.zy7
                            public final Object a() {
                                int i62 = i9;
                                iei ieiVar2 = iei.a;
                                String str22 = str;
                                AssistantOverlayActivity assistantOverlayActivity22 = assistantOverlayActivity;
                                switch (i62) {
                                    case 0:
                                        int i72 = AssistantOverlayActivity.d0;
                                        assistantOverlayActivity22.p(str22);
                                        break;
                                    default:
                                        int i82 = AssistantOverlayActivity.d0;
                                        assistantOverlayActivity22.p(str22);
                                        break;
                                }
                                return ieiVar2;
                            }
                        };
                        e18Var4.k0(objN4);
                    }
                    ez1.e((zy7) objN4, null, false, null, null, lvj.a, e18Var4, 1572864, 62);
                    e18Var4.p(true);
                }
                break;
        }
        return ieiVar;
    }
}
