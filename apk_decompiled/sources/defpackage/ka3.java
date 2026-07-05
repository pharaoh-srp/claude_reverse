package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ka3 implements sz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ zy7 G;
    public final /* synthetic */ zy7 H;
    public final /* synthetic */ zy7 I;
    public final /* synthetic */ zy7 J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ boolean M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ Object P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ ka3(String str, boolean z, boolean z2, boolean z3, boolean z4, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, zy7 zy7Var4, zy7 zy7Var5, zy7 zy7Var6, zy7 zy7Var7) {
        this.N = str;
        this.F = z;
        this.K = z2;
        this.L = z3;
        this.M = z4;
        this.G = zy7Var;
        this.H = zy7Var2;
        this.I = zy7Var3;
        this.J = zy7Var4;
        this.O = zy7Var5;
        this.P = zy7Var6;
        this.Q = zy7Var7;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        s64 s64Var;
        zy7 zy7Var;
        iei ieiVar;
        zy7 zy7Var2;
        zy7 ck4Var;
        int i = this.E;
        iei ieiVar2 = iei.a;
        Object obj5 = this.Q;
        Object obj6 = this.P;
        Object obj7 = this.O;
        Object obj8 = this.N;
        zy7 zy7Var3 = this.J;
        zy7 zy7Var4 = this.I;
        zy7 zy7Var5 = this.H;
        switch (i) {
            case 0:
                String str = (String) obj8;
                zy7 zy7Var6 = (zy7) obj7;
                zy7 zy7Var7 = (zy7) obj6;
                zy7 zy7Var8 = (zy7) obj5;
                s64 s64Var2 = (s64) obj;
                zy7 zy7Var9 = (zy7) obj2;
                ld4 ld4Var = (ld4) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                s64Var2.getClass();
                zy7Var9.getClass();
                int i2 = (iIntValue & 6) == 0 ? iIntValue | (((e18) ld4Var).f(s64Var2) ? 4 : 2) : iIntValue;
                if ((iIntValue & 48) == 0) {
                    i2 |= ((e18) ld4Var).h(zy7Var9) ? 32 : 16;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
                    e18Var.T();
                } else {
                    zy7 zy7Var10 = this.G;
                    lz1 lz1Var = jd4.a;
                    if (zy7Var10 == null) {
                        e18Var.a0(-1322977542);
                        e18Var.p(false);
                        zy7Var = null;
                        s64Var = s64Var2;
                    } else {
                        e18Var.a0(-1322977541);
                        s64Var = s64Var2;
                        boolean zF = ((i2 & 112) == 32) | e18Var.f(zy7Var10);
                        Object objN = e18Var.N();
                        if (zF || objN == lz1Var) {
                            objN = new kt0(zy7Var9, zy7Var10, 14);
                            e18Var.k0(objN);
                        }
                        zy7Var = (zy7) objN;
                        e18Var.p(false);
                    }
                    int i3 = i2 & 112;
                    boolean zF2 = (i3 == 32) | e18Var.f(zy7Var5);
                    Object objN2 = e18Var.N();
                    if (zF2 || objN2 == lz1Var) {
                        ieiVar = ieiVar2;
                        objN2 = new kt0(zy7Var9, zy7Var5, 15);
                        e18Var.k0(objN2);
                    } else {
                        ieiVar = ieiVar2;
                    }
                    zy7 zy7Var11 = (zy7) objN2;
                    boolean zF3 = (i3 == 32) | e18Var.f(zy7Var4);
                    Object objN3 = e18Var.N();
                    if (zF3 || objN3 == lz1Var) {
                        objN3 = new kt0(zy7Var9, zy7Var4, 16);
                        e18Var.k0(objN3);
                    }
                    zy7 zy7Var12 = (zy7) objN3;
                    boolean zF4 = (i3 == 32) | e18Var.f(zy7Var3);
                    Object objN4 = e18Var.N();
                    if (zF4 || objN4 == lz1Var) {
                        objN4 = new kt0(zy7Var9, zy7Var3, 10);
                        e18Var.k0(objN4);
                    }
                    zy7 zy7Var13 = (zy7) objN4;
                    boolean zF5 = (i3 == 32) | e18Var.f(zy7Var6);
                    Object objN5 = e18Var.N();
                    if (zF5 || objN5 == lz1Var) {
                        objN5 = new kt0(zy7Var9, zy7Var6, 11);
                        e18Var.k0(objN5);
                    }
                    zy7 zy7Var14 = (zy7) objN5;
                    boolean zF6 = (i3 == 32) | e18Var.f(zy7Var7);
                    Object objN6 = e18Var.N();
                    if (zF6 || objN6 == lz1Var) {
                        objN6 = new kt0(zy7Var9, zy7Var7, 12);
                        e18Var.k0(objN6);
                    }
                    zy7 zy7Var15 = (zy7) objN6;
                    boolean zF7 = (i3 == 32) | e18Var.f(zy7Var8);
                    Object objN7 = e18Var.N();
                    if (zF7 || objN7 == lz1Var) {
                        objN7 = new kt0(zy7Var9, zy7Var8, 13);
                        e18Var.k0(objN7);
                    }
                    fd9.p(s64Var, str, this.F, this.K, this.L, this.M, zy7Var, zy7Var11, zy7Var12, zy7Var13, zy7Var14, zy7Var15, (zy7) objN7, e18Var, i2 & 14);
                }
                break;
            default:
                l45 l45Var = (l45) obj8;
                mc mcVar = (mc) obj7;
                t4g t4gVar = (t4g) obj6;
                nwb nwbVar = (nwb) obj5;
                mnc mncVar = (mnc) obj2;
                ld4 ld4Var2 = (ld4) obj3;
                int iH = ebh.h((Integer) obj4, (s64) obj, mncVar);
                if ((iH & 48) == 0) {
                    iH |= ((e18) ld4Var2).f(mncVar) ? 32 : 16;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iH & 1, (iH & 145) != 144)) {
                    e18Var2.T();
                } else {
                    boolean z = this.F;
                    zy7 zy7Var16 = this.G;
                    zy7 zy7Var17 = z ? zy7Var16 : zy7Var5;
                    boolean z2 = this.L;
                    boolean z3 = this.M;
                    if (!z2 || z3) {
                        zy7Var2 = zy7Var16;
                        ck4Var = zy7Var4;
                    } else {
                        zy7Var2 = zy7Var16;
                        ck4Var = new ck4(l45Var, mcVar, zvc.E, t4gVar, zy7Var2, nwbVar);
                    }
                    zy7 ck4Var2 = (!z2 || z3) ? zy7Var3 : new ck4(l45Var, mcVar, zvc.F, t4gVar, zy7Var2, nwbVar);
                    int i4 = z ? R.string.tool_approval_deny : R.string.tool_approval_cancel;
                    fqb fqbVar = fqb.E;
                    gtk.d(ck4Var, zy7Var17, gb9.N(gb9.I(b.c(fqbVar, 1.0f), mncVar), MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), ck4Var2, null, this.K, i4, e18Var2, 0, 16);
                    tjh.b(gid.p(8.0f, R.string.tool_approval_disclaimer_title, e18Var2, e18Var2, fqbVar), gb9.I(b.c(fqbVar, 1.0f), mncVar), 0L, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, 0, 0, 130044);
                    tjh.b(gid.p(2.0f, R.string.tool_permissions_edit_anytime, e18Var2, e18Var2, fqbVar), gb9.I(b.c(fqbVar, 1.0f), mncVar), 0L, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, 0, 0, 130044);
                    kxk.g(e18Var2, b.e(fqbVar, 16.0f));
                }
                break;
        }
        return ieiVar2;
    }

    public /* synthetic */ ka3(boolean z, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, zy7 zy7Var4, boolean z2, boolean z3, boolean z4, l45 l45Var, mc mcVar, t4g t4gVar, nwb nwbVar) {
        this.F = z;
        this.G = zy7Var;
        this.H = zy7Var2;
        this.I = zy7Var3;
        this.J = zy7Var4;
        this.K = z2;
        this.L = z3;
        this.M = z4;
        this.N = l45Var;
        this.O = mcVar;
        this.P = t4gVar;
        this.Q = nwbVar;
    }
}
