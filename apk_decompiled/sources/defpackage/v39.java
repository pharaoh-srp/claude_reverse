package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v39 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ pl3 G;
    public final /* synthetic */ zy7 H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ String J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    public /* synthetic */ v39(fn1 fn1Var, boolean z, pl3 pl3Var, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar, boolean z2, String str, zy7 zy7Var3, int i) {
        this.K = fn1Var;
        this.F = z;
        this.G = pl3Var;
        this.H = zy7Var;
        this.L = zy7Var2;
        this.N = iqbVar;
        this.I = z2;
        this.J = str;
        this.M = zy7Var3;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.N;
        Object obj4 = this.M;
        Object obj5 = this.L;
        Object obj6 = this.K;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                rvk.g((fn1) obj6, this.F, this.G, this.H, (zy7) obj5, (iqb) obj3, this.I, this.J, (zy7) obj4, (ld4) obj, x44.p0(1));
                break;
            default:
                String str = (String) obj6;
                iid iidVar = (iid) obj5;
                String str2 = (String) obj4;
                pz7 pz7Var = (pz7) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                wo1 wo1Var = lja.Q;
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    gf8 gf8Var = (gf8) e18Var.j(ve4.l);
                    pl3 pl3Var = this.G;
                    boolean zH = e18Var.h(pl3Var) | e18Var.h(gf8Var);
                    zy7 zy7Var = this.H;
                    boolean zF = zH | e18Var.f(zy7Var);
                    Object objN = e18Var.N();
                    if (zF || objN == jd4.a) {
                        objN = new hya(pl3Var, gf8Var, zy7Var, 12);
                        e18Var.k0(objN);
                    }
                    fqb fqbVar = fqb.E;
                    boolean z3 = this.F;
                    iqb iqbVarE0 = j8.e0(fqbVar, z3, false, null, (zy7) objN, 14);
                    boolean z4 = this.I;
                    String str3 = this.J;
                    fo0 fo0Var = ko0.a;
                    if (!z4) {
                        e18Var.a0(-72761243);
                        iqb iqbVarN = gb9.N(gb9.J(iqbVarE0, 16.0f), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 4.0f, 7);
                        q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
                        int iHashCode = Long.hashCode(e18Var.T);
                        hyc hycVarL = e18Var.l();
                        iqb iqbVarE = kxk.E(e18Var, iqbVarN);
                        dd4.e.getClass();
                        re4 re4Var = cd4.b;
                        e18Var.e0();
                        if (e18Var.S) {
                            e18Var.k(re4Var);
                        } else {
                            e18Var.n0();
                        }
                        z80 z80Var = cd4.f;
                        d4c.i0(e18Var, z80Var, q64VarA);
                        z80 z80Var2 = cd4.e;
                        d4c.i0(e18Var, z80Var2, hycVarL);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        z80 z80Var3 = cd4.g;
                        d4c.i0(e18Var, z80Var3, numValueOf);
                        bx bxVar = cd4.h;
                        d4c.h0(e18Var, bxVar);
                        z80 z80Var4 = cd4.d;
                        d4c.i0(e18Var, z80Var4, iqbVarE);
                        cxe cxeVarA = axe.a(fo0Var, wo1Var, e18Var, 48);
                        int iHashCode2 = Long.hashCode(e18Var.T);
                        hyc hycVarL2 = e18Var.l();
                        iqb iqbVarE2 = kxk.E(e18Var, fqbVar);
                        e18Var.e0();
                        if (e18Var.S) {
                            e18Var.k(re4Var);
                        } else {
                            e18Var.n0();
                        }
                        d4c.i0(e18Var, z80Var, cxeVarA);
                        d4c.i0(e18Var, z80Var2, hycVarL2);
                        ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
                        d4c.i0(e18Var, z80Var4, iqbVarE2);
                        ywj.c(0, e18Var, null, z3);
                        if (pz7Var != null) {
                            e18Var.a0(-1491480757);
                            z = true;
                            kxk.g(e18Var, new hw9(1.0f, true));
                            pz7Var.invoke(e18Var, 0);
                            e18Var.p(false);
                        } else {
                            z = true;
                            e18Var.a0(-1491377930);
                            e18Var.p(false);
                        }
                        e18Var.p(z);
                        kxk.g(e18Var, b.e(fqbVar, 8.0f));
                        ywj.d(str3, str, iidVar, null, str2, true, e18Var, 196608, 8);
                        e18Var.p(z);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(-73423279);
                        iqb iqbVarJ = gb9.J(iqbVarE0, 16.0f);
                        cxe cxeVarA2 = axe.a(fo0Var, wo1Var, e18Var, 48);
                        int iHashCode3 = Long.hashCode(e18Var.T);
                        hyc hycVarL3 = e18Var.l();
                        iqb iqbVarE3 = kxk.E(e18Var, iqbVarJ);
                        dd4.e.getClass();
                        re4 re4Var2 = cd4.b;
                        e18Var.e0();
                        if (e18Var.S) {
                            e18Var.k(re4Var2);
                        } else {
                            e18Var.n0();
                        }
                        d4c.i0(e18Var, cd4.f, cxeVarA2);
                        d4c.i0(e18Var, cd4.e, hycVarL3);
                        d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode3));
                        d4c.h0(e18Var, cd4.h);
                        d4c.i0(e18Var, cd4.d, iqbVarE3);
                        ywj.c(0, e18Var, null, z3);
                        kxk.g(e18Var, b.t(fqbVar, 12.0f));
                        ywj.d(str3, str, iidVar, new hw9(1.0f, true), str2, false, e18Var, 0, 32);
                        if (pz7Var != null) {
                            e18Var.a0(407645062);
                            pz7Var.invoke(e18Var, 0);
                            z2 = false;
                            e18Var.p(false);
                        } else {
                            z2 = false;
                            e18Var.a0(407690229);
                            e18Var.p(false);
                        }
                        e18Var.p(true);
                        e18Var.p(z2);
                    }
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ v39(boolean z, pl3 pl3Var, zy7 zy7Var, boolean z2, String str, String str2, iid iidVar, String str3, pz7 pz7Var) {
        this.F = z;
        this.G = pl3Var;
        this.H = zy7Var;
        this.I = z2;
        this.J = str;
        this.K = str2;
        this.L = iidVar;
        this.M = str3;
        this.N = pz7Var;
    }
}
