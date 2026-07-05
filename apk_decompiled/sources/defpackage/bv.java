package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.conway.h;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bv implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    public /* synthetic */ bv(pz7 pz7Var, ycb ycbVar, boolean z, pz7 pz7Var2, pz7 pz7Var3) {
        this.E = 8;
        this.H = pz7Var;
        this.I = ycbVar;
        this.F = z;
        this.G = pz7Var2;
        this.J = pz7Var3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v8, types: [int] */
    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        z80 z80Var;
        iei ieiVar;
        boolean z;
        ?? r5;
        int iG;
        int iG2;
        int i = this.E;
        int i2 = 9;
        boolean z2 = this.F;
        iei ieiVar2 = iei.a;
        Object obj3 = this.J;
        Object obj4 = this.I;
        Object obj5 = this.G;
        Object obj6 = this.H;
        switch (i) {
            case 0:
                lu luVar = (lu) obj6;
                qi3 qi3Var = (qi3) obj4;
                zy7 zy7Var = (zy7) obj5;
                x0a x0aVar = (x0a) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    boolean z3 = z2 && !((Boolean) luVar.o.getValue()).booleanValue();
                    boolean zH = e18Var.h(qi3Var) | e18Var.f(luVar) | e18Var.f(zy7Var);
                    Object objN = e18Var.N();
                    if (zH || objN == jd4.a) {
                        objN = new ei(qi3Var, luVar, zy7Var, 4);
                        e18Var.k0(objN);
                    }
                    ytk.d(z3, (zy7) objN, x0aVar, null, e18Var, 0);
                }
                break;
            case 1:
                ud0 ud0Var = (ud0) obj6;
                vt6 vt6Var = (vt6) obj4;
                pz7 pz7Var = (pz7) obj3;
                zy7 zy7Var2 = (zy7) obj5;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    wo1 wo1Var = lja.Q;
                    fqb fqbVar = fqb.E;
                    iqb iqbVarM = gb9.M(b.g(fqbVar, 55.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), 14.0f, 12.0f, 4.0f, 12.0f);
                    cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var2, 48);
                    int iHashCode = Long.hashCode(e18Var2.T);
                    hyc hycVarL = e18Var2.l();
                    iqb iqbVarE = kxk.E(e18Var2, iqbVarM);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var2.e0();
                    if (e18Var2.S) {
                        e18Var2.k(re4Var);
                    } else {
                        e18Var2.n0();
                    }
                    z80 z80Var2 = cd4.f;
                    d4c.i0(e18Var2, z80Var2, cxeVarA);
                    z80 z80Var3 = cd4.e;
                    d4c.i0(e18Var2, z80Var3, hycVarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    z80 z80Var4 = cd4.g;
                    d4c.i0(e18Var2, z80Var4, numValueOf);
                    bx bxVar = cd4.h;
                    d4c.h0(e18Var2, bxVar);
                    z80 z80Var5 = cd4.d;
                    d4c.i0(e18Var2, z80Var5, iqbVarE);
                    if (ud0Var != null) {
                        e18Var2.a0(-2004090039);
                        z80Var = z80Var5;
                        long j = gm3.a(e18Var2).N;
                        ud0 ud0Var2 = ud0.d;
                        iv1.b(ud0Var, null, null, null, j, e18Var2, 48, 12);
                        vb7.A(fqbVar, 10.0f, e18Var2, false);
                    } else {
                        z80Var = z80Var5;
                        e18Var2.a0(-2003807505);
                        e18Var2.p(false);
                    }
                    fqb fqbVar2 = fqbVar;
                    Integer numB = vt6Var.b();
                    if (z2 || pz7Var == null) {
                        ieiVar = ieiVar2;
                        e18Var2.a0(-2003690077);
                        zb0 zb0VarA = vt6Var.a(e18Var2);
                        if (1.0f <= 0.0d) {
                            z29.a("invalid weight; must be greater than zero");
                        }
                        zhk.d(numB, zb0VarA, new hw9(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), e18Var2, 0, 0);
                        if (pz7Var != null) {
                            ij0.r(24.0f, -2003448339, e18Var2, e18Var2, fqbVar2);
                            pz7Var.invoke(e18Var2, 0);
                            z = false;
                            e18Var2.p(false);
                        } else {
                            z = false;
                            e18Var2.a0(-2003354161);
                            e18Var2.p(false);
                        }
                        e18Var2.p(z);
                        r5 = z;
                    } else {
                        e18Var2.a0(-2003304871);
                        ho0 ho0Var = new ho0(8.0f, true, new sz6(1));
                        if (1.0f <= 0.0d) {
                            z29.a("invalid weight; must be greater than zero");
                        }
                        hw9 hw9Var = new hw9(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                        q64 q64VarA = p64.a(ho0Var, lja.S, e18Var2, 6);
                        ieiVar = ieiVar2;
                        int iHashCode2 = Long.hashCode(e18Var2.T);
                        hyc hycVarL2 = e18Var2.l();
                        iqb iqbVarE2 = kxk.E(e18Var2, hw9Var);
                        e18Var2.e0();
                        if (e18Var2.S) {
                            e18Var2.k(re4Var);
                        } else {
                            e18Var2.n0();
                        }
                        d4c.i0(e18Var2, z80Var2, q64VarA);
                        d4c.i0(e18Var2, z80Var3, hycVarL2);
                        ij0.t(iHashCode2, e18Var2, z80Var4, e18Var2, bxVar);
                        d4c.i0(e18Var2, z80Var, iqbVarE2);
                        fqbVar2 = fqbVar2;
                        zhk.d(numB, vt6Var.a(e18Var2), null, e18Var2, 0, 4);
                        pz7Var.invoke(e18Var2, 0);
                        e18Var2.p(true);
                        r5 = 0;
                        e18Var2.p(false);
                    }
                    kxk.g(e18Var2, b.t(fqbVar2, 8.0f));
                    zhk.c(zy7Var2, null, e18Var2, r5);
                    e18Var2.p(true);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                jlk.c((zy7) obj5, (sn3) obj6, (zy7) obj4, this.F, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                sqk.a((String) obj6, (String) obj4, this.F, (iqb) obj5, (h86) obj3, (ld4) obj, x44.p0(49));
                break;
            case 4:
                ((Integer) obj2).getClass();
                aw4.a((dw4) obj6, (zv4) obj4, this.F, (zy7) obj5, (iqb) obj3, (ld4) obj, x44.p0(24577));
                break;
            case 5:
                ((Integer) obj2).getClass();
                h.b((String) obj6, this.F, (zy7) obj5, (zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
            case 6:
                zy7 zy7Var3 = (zy7) obj5;
                iqb iqbVar = (iqb) obj6;
                py8 py8Var = (py8) obj4;
                String str = (String) obj3;
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    ez1.e(zy7Var3, iqbVar, this.F, null, null, fd9.q0(-1301085432, new t04(py8Var, 28, str), e18Var3), e18Var3, 1572864, 56);
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                dgj.i((pf6) obj6, (String) obj4, this.F, (pz7) obj5, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
            case 8:
                pz7 pz7Var2 = (pz7) obj6;
                ycb ycbVar = (ycb) obj4;
                pz7 pz7Var3 = (pz7) obj5;
                pz7 pz7Var4 = (pz7) obj3;
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e18Var4.T();
                } else {
                    if (pz7Var2 != null) {
                        e18Var4.a0(-864613344);
                        j8.c(sq6.m(ycbVar.c(z2), on4.a), fd9.q0(1241781204, new dt(pz7Var2, 8, (byte) (false ? 1 : 0)), e18Var4), e18Var4, 56);
                        e18Var4.p(false);
                    } else {
                        e18Var4.a0(-864297175);
                        e18Var4.p(false);
                    }
                    xe4 xe4Var = on4.a;
                    j8.c(sq6.m(ycbVar.d(z2), xe4Var), fd9.q0(-893579015, new ra7(pz7Var2, pz7Var3, pz7Var4, 16), e18Var4), e18Var4, 56);
                    if (pz7Var3 == null) {
                        e18Var4.a0(-863079991);
                        e18Var4.p(false);
                    } else {
                        e18Var4.a0(-863399043);
                        j8.c(sq6.m(ycbVar.e(z2), xe4Var), fd9.q0(-782441013, new dt(pz7Var3, i2, (byte) (false ? 1 : 0)), e18Var4), e18Var4, 56);
                        e18Var4.p(false);
                    }
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                dxj.d((List) obj6, (gwg) obj4, (bz7) obj5, (iqb) obj3, this.F, (ld4) obj, x44.p0(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                ((vz8) obj6).x(this.F, (w79) obj4, (ffh) obj5, (e0g) obj3, (ld4) obj, x44.p0(114822145));
                break;
            case 11:
                cae caeVar = (cae) obj6;
                sih sihVar = (sih) obj4;
                te8 te8Var = (te8) obj5;
                cae caeVar2 = (cae) obj3;
                caeVar.E = fcc.i(caeVar.E, ((fcc) obj2).a);
                akh akhVar = sihVar.b;
                i5i i5iVar = sihVar.a;
                yjh yjhVarC = akhVar.c();
                if (yjhVarC != null) {
                    qtb qtbVar = yjhVarC.b;
                    sihVar.H(te8Var, fcc.i(caeVar2.E, caeVar.E));
                    boolean z4 = this.F;
                    if (z4) {
                        iG = qtbVar.g(sihVar.s());
                    } else {
                        long j2 = i5iVar.d().H;
                        int i3 = kkh.c;
                        iG = (int) (j2 >> 32);
                    }
                    int i4 = iG;
                    if (z4) {
                        long j3 = i5iVar.d().H;
                        int i5 = kkh.c;
                        iG2 = (int) (j3 & 4294967295L);
                    } else {
                        iG2 = qtbVar.g(sihVar.s());
                    }
                    int i6 = iG2;
                    long j4 = i5iVar.d().H;
                    long jI = sihVar.I(i5iVar.d(), i4, i6, z4, unb.Q, false, false, new hf8(9));
                    if (kkh.d(j4) || !kkh.d(jI)) {
                        i5iVar.j(jI);
                    }
                }
                break;
            default:
                ((Integer) obj2).getClass();
                b5j.b((dhg) obj6, this.F, (zy7) obj5, (zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
        }
        return ieiVar2;
    }

    public /* synthetic */ bv(ud0 ud0Var, vt6 vt6Var, boolean z, ta4 ta4Var, zy7 zy7Var) {
        this.E = 1;
        this.H = ud0Var;
        this.I = vt6Var;
        this.F = z;
        this.J = ta4Var;
        this.G = zy7Var;
    }

    public /* synthetic */ bv(zy7 zy7Var, sn3 sn3Var, zy7 zy7Var2, boolean z, iqb iqbVar, int i) {
        this.E = 2;
        this.G = zy7Var;
        this.H = sn3Var;
        this.I = zy7Var2;
        this.F = z;
        this.J = iqbVar;
    }

    public /* synthetic */ bv(zy7 zy7Var, iqb iqbVar, boolean z, py8 py8Var, String str) {
        this.E = 6;
        this.G = zy7Var;
        this.H = iqbVar;
        this.F = z;
        this.I = py8Var;
        this.J = str;
    }

    public /* synthetic */ bv(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.E = i2;
        this.H = obj;
        this.I = obj2;
        this.F = z;
        this.G = obj3;
        this.J = obj4;
    }

    public /* synthetic */ bv(vz8 vz8Var, boolean z, w79 w79Var, ffh ffhVar, e0g e0gVar, int i) {
        this.E = 10;
        this.H = vz8Var;
        this.F = z;
        this.I = w79Var;
        this.G = ffhVar;
        this.J = e0gVar;
    }

    public /* synthetic */ bv(cae caeVar, sih sihVar, te8 te8Var, cae caeVar2, boolean z) {
        this.E = 11;
        this.H = caeVar;
        this.I = sihVar;
        this.G = te8Var;
        this.J = caeVar2;
        this.F = z;
    }

    public /* synthetic */ bv(Object obj, boolean z, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar, int i, int i2) {
        this.E = i2;
        this.H = obj;
        this.F = z;
        this.G = zy7Var;
        this.I = zy7Var2;
        this.J = iqbVar;
    }

    public /* synthetic */ bv(List list, gwg gwgVar, bz7 bz7Var, iqb iqbVar, boolean z, int i) {
        this.E = 9;
        this.H = list;
        this.I = gwgVar;
        this.G = bz7Var;
        this.J = iqbVar;
        this.F = z;
    }

    public /* synthetic */ bv(boolean z, lu luVar, qi3 qi3Var, zy7 zy7Var, x0a x0aVar) {
        this.E = 0;
        this.F = z;
        this.H = luVar;
        this.I = qi3Var;
        this.G = zy7Var;
        this.J = x0aVar;
    }
}
