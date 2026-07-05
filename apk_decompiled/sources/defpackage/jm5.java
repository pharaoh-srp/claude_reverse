package defpackage;

import androidx.compose.foundation.layout.b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jm5 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ String F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ Object J;

    public /* synthetic */ jm5(String str, wl5 wl5Var, boolean z, boolean z2, boolean z3) {
        this.F = str;
        this.J = wl5Var;
        this.G = z;
        this.H = z2;
        this.I = z3;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.J;
        switch (i) {
            case 0:
                wl5 wl5Var = (wl5) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    float f = gwk.g;
                    float f2 = gwk.e;
                    fqb fqbVar = fqb.E;
                    iqb iqbVarK = b.k(fqbVar, f, f2);
                    o5b o5bVarD = dw1.d(lja.K, false);
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
                    d4c.i0(e18Var, cd4.f, o5bVarD);
                    d4c.i0(e18Var, cd4.e, hycVarL);
                    d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var, cd4.h);
                    d4c.i0(e18Var, cd4.d, iqbVarE);
                    Object objN = e18Var.N();
                    if (objN == jd4.a) {
                        objN = new qy4(9);
                        e18Var.k0(objN);
                    }
                    iqb iqbVarA = tjf.a(fqbVar, (bz7) objN);
                    long j = wl5Var.o;
                    boolean z = this.H;
                    boolean z2 = this.I;
                    if (z && z2) {
                        j = wl5Var.p;
                    } else if (z && !z2) {
                        j = wl5Var.q;
                    } else if (this.G && z2) {
                        j = wl5Var.t;
                    } else if (z2) {
                        j = wl5Var.n;
                    }
                    long j2 = j;
                    e18Var.a0(-969442410);
                    wlg wlgVarA = f8g.a(j2, u00.P(asb.G, e18Var), null, e18Var, 0, 12);
                    e18Var.p(false);
                    tjh.b(this.F, iqbVarA, ((d54) wlgVarA.getValue()).a, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, null, e18Var, 0, 0, 261112);
                    e18Var.p(true);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                uwj.a(this.F, this.G, this.H, (bz7) obj3, this.I, (ld4) obj, x44.p0(1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ jm5(String str, boolean z, boolean z2, bz7 bz7Var, boolean z3, int i) {
        this.F = str;
        this.G = z;
        this.H = z2;
        this.J = bz7Var;
        this.I = z3;
    }
}
