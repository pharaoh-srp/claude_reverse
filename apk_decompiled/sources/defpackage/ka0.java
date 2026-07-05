package defpackage;

import com.anthropic.claude.app.main.loggedin.i;
import com.anthropic.claude.app.n0;
import com.anthropic.claude.chat.bottomsheet.x0;
import com.anthropic.claude.login.WelcomeNotice;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ka0 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ ka0(jj jjVar, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar, koi koiVar, is5 is5Var, int i) {
        this.E = 5;
        this.F = jjVar;
        this.J = zy7Var;
        this.G = zy7Var2;
        this.K = iqbVar;
        this.H = koiVar;
        this.I = is5Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        ua9 ua9Var;
        iqb iqbVarA;
        ua9 ua9Var2;
        int i = this.E;
        lz1 lz1Var = jd4.a;
        iei ieiVar = iei.a;
        Object obj3 = this.K;
        Object obj4 = this.J;
        Object obj5 = this.I;
        Object obj6 = this.H;
        Object obj7 = this.G;
        Object obj8 = this.F;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                iuj.i((m9j) obj8, (kja) obj7, (WelcomeNotice) obj6, (mnc) obj5, (zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                x0.a((t53) obj8, (hw2) obj7, (rwe) obj6, (rwe) obj5, (bz7) obj4, (ze0) obj3, (ld4) obj, x44.p0(65));
                break;
            case 2:
                ((Integer) obj2).getClass();
                n0.i((jhc) obj8, (qi3) obj7, (koi) obj6, (q7) obj5, (dkc) obj4, (bz7) obj3, (ld4) obj, x44.p0(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                n0.g((ghc) obj8, (koi) obj7, (q7) obj6, (dkc) obj5, (sc8) obj3, (zy7) obj4, (ld4) obj, x44.p0(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                n0.e((dhc) obj8, (qi3) obj7, (koi) obj6, (q7) obj5, (dkc) obj4, (bz7) obj3, (ld4) obj, x44.p0(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                i.d((jj) obj8, (zy7) obj4, (zy7) obj7, (iqb) obj3, (koi) obj6, (is5) obj5, (ld4) obj, x44.p0(1));
                break;
            case 6:
                w1i w1iVar = (w1i) obj8;
                String str = (String) obj7;
                nwb nwbVar = (nwb) obj6;
                zy7 zy7Var = (zy7) obj4;
                bz7 bz7Var = (bz7) obj5;
                bz7 bz7Var2 = (bz7) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    String strB = w1iVar.b();
                    boolean zF = e18Var.f(nwbVar) | e18Var.f(w1iVar) | e18Var.f(zy7Var) | e18Var.f(bz7Var) | e18Var.f(bz7Var2);
                    Object objN = e18Var.N();
                    if (zF || objN == lz1Var) {
                        dn dnVar = new dn((Object) w1iVar, (Object) zy7Var, (Object) bz7Var, (Object) bz7Var2, nwbVar, 11);
                        e18Var.k0(dnVar);
                        objN = dnVar;
                    }
                    knk.l(strB, str, (zy7) objN, null, e18Var, 0);
                }
                break;
            default:
                gh2 gh2Var = (gh2) obj8;
                ybg ybgVar = (ybg) obj7;
                t4g t4gVar = (t4g) obj6;
                rz7 rz7Var = (rz7) obj5;
                nwb nwbVar2 = (nwb) obj4;
                z3g z3gVar = (z3g) obj3;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    if (gh2Var == null || ybgVar == null) {
                        e18Var2.a0(975663790);
                        e18Var2.p(false);
                    } else {
                        e18Var2.a0(975580183);
                        zni.g(gh2Var, ybgVar, e18Var2, 0);
                        e18Var2.p(false);
                    }
                    if (t4gVar.b.b == u4g.H) {
                        e18Var2.a0(-1492545082);
                        boolean z2 = !x44.V(e18Var2);
                        e18Var2.p(false);
                        z = z2;
                    } else {
                        e18Var2.a0(975743951);
                        e18Var2.p(false);
                        z = false;
                    }
                    tp4 tp4Var = null;
                    if (z) {
                        e18Var2.a0(975815318);
                        v4g v4gVar = t4gVar.b.a;
                        Object objN2 = e18Var2.N();
                        if (objN2 == lz1Var) {
                            objN2 = new a80(-1, dgj.g, null, 12);
                            e18Var2.k0(objN2);
                        }
                        a80 a80Var = (a80) objN2;
                        Object objN3 = e18Var2.N();
                        if (objN3 == lz1Var) {
                            objN3 = new ua9(a80Var);
                            e18Var2.k0(objN3);
                        }
                        ua9 ua9Var3 = (ua9) objN3;
                        boolean zH = e18Var2.h(ua9Var3) | e18Var2.f(v4gVar) | e18Var2.h(a80Var);
                        Object objN4 = e18Var2.N();
                        if (zH || objN4 == lz1Var) {
                            objN4 = new ba9(ua9Var3, v4gVar, a80Var, tp4Var, 15);
                            ua9Var2 = ua9Var3;
                            e18Var2.k0(objN4);
                        } else {
                            ua9Var2 = ua9Var3;
                        }
                        fd9.i(e18Var2, (pz7) objN4, ua9Var2);
                        e18Var2.p(false);
                        ua9Var = ua9Var2;
                    } else {
                        e18Var2.a0(975906706);
                        e18Var2.p(false);
                        ua9Var = null;
                    }
                    xo1 xo1Var = lja.G;
                    o5b o5bVarD = dw1.d(xo1Var, false);
                    int iHashCode = Long.hashCode(e18Var2.T);
                    hyc hycVarL = e18Var2.l();
                    fqb fqbVar = fqb.E;
                    iqb iqbVarE = kxk.E(e18Var2, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var2.e0();
                    if (e18Var2.S) {
                        e18Var2.k(re4Var);
                    } else {
                        e18Var2.n0();
                    }
                    z80 z80Var = cd4.f;
                    d4c.i0(e18Var2, z80Var, o5bVarD);
                    z80 z80Var2 = cd4.e;
                    d4c.i0(e18Var2, z80Var2, hycVarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    z80 z80Var3 = cd4.g;
                    d4c.i0(e18Var2, z80Var3, numValueOf);
                    bx bxVar = cd4.h;
                    d4c.h0(e18Var2, bxVar);
                    z80 z80Var4 = cd4.d;
                    d4c.i0(e18Var2, z80Var4, iqbVarE);
                    if (ua9Var == null || (iqbVarA = ua9Var.a()) == null) {
                        iqbVarA = fqbVar;
                    }
                    o5b o5bVarD2 = dw1.d(xo1Var, false);
                    int iHashCode2 = Long.hashCode(e18Var2.T);
                    hyc hycVarL2 = e18Var2.l();
                    iqb iqbVarE2 = kxk.E(e18Var2, iqbVarA);
                    e18Var2.e0();
                    if (e18Var2.S) {
                        e18Var2.k(re4Var);
                    } else {
                        e18Var2.n0();
                    }
                    d4c.i0(e18Var2, z80Var, o5bVarD2);
                    d4c.i0(e18Var2, z80Var2, hycVarL2);
                    ij0.t(iHashCode2, e18Var2, z80Var3, e18Var2, bxVar);
                    d4c.i0(e18Var2, z80Var4, iqbVarE2);
                    mwa.l(t4gVar.a, null, iv1.P(dch.Q(3), null, 6), fd9.q0(-1805633010, new mwe(rz7Var, t4gVar, ua9Var, nwbVar2, z3gVar, z, 0), e18Var2), e18Var2, 3072, 2);
                    e18Var2.p(true);
                    if (ybgVar != null) {
                        e18Var2.a0(892927915);
                        iv1.c(ybgVar, nw1.a.a(fqbVar, lja.M), e18Var2, 0, 0);
                        e18Var2.p(false);
                    } else {
                        e18Var2.a0(893109544);
                        e18Var2.p(false);
                    }
                    e18Var2.p(true);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ka0(gh2 gh2Var, ybg ybgVar, t4g t4gVar, rz7 rz7Var, nwb nwbVar, z3g z3gVar) {
        this.E = 7;
        this.F = gh2Var;
        this.G = ybgVar;
        this.H = t4gVar;
        this.I = rz7Var;
        this.J = nwbVar;
        this.K = z3gVar;
    }

    public /* synthetic */ ka0(ghc ghcVar, koi koiVar, q7 q7Var, dkc dkcVar, sc8 sc8Var, zy7 zy7Var, int i) {
        this.E = 3;
        this.F = ghcVar;
        this.G = koiVar;
        this.H = q7Var;
        this.I = dkcVar;
        this.K = sc8Var;
        this.J = zy7Var;
    }

    public /* synthetic */ ka0(w1i w1iVar, String str, nwb nwbVar, zy7 zy7Var, bz7 bz7Var, bz7 bz7Var2) {
        this.E = 6;
        this.F = w1iVar;
        this.G = str;
        this.H = nwbVar;
        this.J = zy7Var;
        this.I = bz7Var;
        this.K = bz7Var2;
    }

    public /* synthetic */ ka0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2) {
        this.E = i2;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
        this.J = obj5;
        this.K = obj6;
    }
}
