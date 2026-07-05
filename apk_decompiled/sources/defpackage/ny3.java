package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.tooling.PreviewActivity;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ny3 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ String G;

    public /* synthetic */ ny3(int i, int i2, String str, String str2) {
        this.E = i2;
        this.F = str;
        this.G = str2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws Exception {
        int i = this.E;
        eo0 eo0Var = ko0.c;
        fqb fqbVar = fqb.E;
        String strC = this.G;
        String str = this.F;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    k4g k4gVar = k4g.a;
                    if (str != null) {
                        strC = ij0.C(str, " · ", strC);
                    }
                    k4gVar.b(strC, null, e18Var, 384);
                } else {
                    e18Var.T();
                }
                return ieiVar;
            case 1:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    q64 q64VarA = p64.a(eo0Var, lja.S, e18Var2, 0);
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
                    d4c.i0(e18Var2, cd4.f, q64VarA);
                    d4c.i0(e18Var2, cd4.e, hycVarL);
                    d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var2, cd4.h);
                    d4c.i0(e18Var2, cd4.d, iqbVarE);
                    tjh.b(this.F, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).g, e18Var2, 0, 0, 131070);
                    String str2 = this.G;
                    if (str2 == null) {
                        e18Var2.a0(1681478514);
                        e18Var2.p(false);
                    } else {
                        e18Var2.a0(1681478515);
                        tjh.b(str2, null, gm3.a(e18Var2).O, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, 0, 24960, 110586);
                        e18Var2.p(false);
                    }
                    e18Var2.p(true);
                } else {
                    e18Var2.T();
                }
                return ieiVar;
            case 2:
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    String str3 = this.F;
                    boolean zF = e18Var3.f(str3) | e18Var3.f(strC);
                    Object objN = e18Var3.N();
                    if (zF || objN == jd4.a) {
                        objN = new pl5(str3, strC, 0);
                        e18Var3.k0(objN);
                    }
                    tjh.b(str3, tjf.b(fqbVar, false, (bz7) objN), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var3, 0, 0, 262140);
                } else {
                    e18Var3.T();
                }
                return ieiVar;
            case 3:
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    tjh.c(zrk.j(R.string.election_banner_content, x44.W(str), new ekh(new egg(gm3.a(e18Var4).M, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), null, null, null), new CharSequence[]{strC}, e18Var4, 0, 0), null, gm3.a(e18Var4).M, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, ((jm3) gm3.c(e18Var4).e.E).i, e18Var4, 0, 0, 262138);
                } else {
                    e18Var4.T();
                }
                return ieiVar;
            case 4:
                ld4 ld4Var5 = (ld4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                e18 e18Var5 = (e18) ld4Var5;
                if (e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    wtk.d(this.F, this.G, null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var5, 0, 60);
                } else {
                    e18Var5.T();
                }
                return ieiVar;
            case 5:
                ld4 ld4Var6 = (ld4) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                int i2 = PreviewActivity.Z;
                e18 e18Var6 = (e18) ld4Var6;
                if (e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    gpk.i(str, strC, e18Var6, new Object[0]);
                } else {
                    e18Var6.T();
                }
                return ieiVar;
            case 6:
                ld4 ld4Var7 = (ld4) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                e18 e18Var7 = (e18) ld4Var7;
                if (e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    uuj.b(this.F, this.G, b.c, gb9.b(MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 1), null, e18Var7, 3456);
                } else {
                    e18Var7.T();
                }
                return ieiVar;
            case 7:
                ld4 ld4Var8 = (ld4) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                e18 e18Var8 = (e18) ld4Var8;
                if (e18Var8.Q(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    long j = gm3.a(e18Var8).O;
                    xb0 xb0Var = new xb0();
                    xb0Var.h(str);
                    int iM = xb0Var.m(new egg(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                    try {
                        xb0Var.h(" #" + strC);
                        xb0Var.j(iM);
                        tjh.c(xb0Var.n(), null, gm3.a(e18Var8).M, 0L, 0L, null, 0L, 2, false, 1, 0, null, null, ((jm3) gm3.c(e18Var8).e.E).g, e18Var8, 0, 24960, 241658);
                    } catch (Throwable th) {
                        xb0Var.j(iM);
                        throw th;
                    }
                } else {
                    e18Var8.T();
                }
                return ieiVar;
            case 8:
                ((Integer) obj2).getClass();
                p5h.d(str, strC, (ld4) obj, x44.p0(7));
                return ieiVar;
            case 9:
                ((Integer) obj2).getClass();
                pwh.a(str, strC, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 10:
                ld4 ld4Var9 = (ld4) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                e18 e18Var9 = (e18) ld4Var9;
                if (e18Var9.Q(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    if (str == null) {
                        str = "plaintext";
                    }
                    uuj.b(this.G, str, b.c, new qnc(16.0f, 8.0f, 16.0f, 8.0f), null, e18Var9, 3456);
                } else {
                    e18Var9.T();
                }
                return ieiVar;
            default:
                ld4 ld4Var10 = (ld4) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                e18 e18Var10 = (e18) ld4Var10;
                if (e18Var10.Q(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    q64 q64VarA2 = p64.a(eo0Var, lja.S, e18Var10, 0);
                    int iHashCode2 = Long.hashCode(e18Var10.T);
                    hyc hycVarL2 = e18Var10.l();
                    iqb iqbVarE2 = kxk.E(e18Var10, fqbVar);
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
                    tjh.b(this.F, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var10).e.E).g, e18Var10, 0, 0, 131070);
                    tjh.b(this.G, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var10).e.E).i, e18Var10, 0, 0, 131070);
                    e18Var10.p(true);
                } else {
                    e18Var10.T();
                }
                return ieiVar;
        }
    }

    public /* synthetic */ ny3(String str, String str2, int i) {
        this.E = i;
        this.F = str;
        this.G = str2;
    }
}
