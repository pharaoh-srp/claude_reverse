package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nv implements rz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ bz7 H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ nv(zy7 zy7Var, boolean z, zy7 zy7Var2, by2 by2Var, bz7 bz7Var, boolean z2, zy7 zy7Var3) {
        this.I = zy7Var;
        this.F = z;
        this.J = zy7Var2;
        this.L = by2Var;
        this.H = bz7Var;
        this.G = z2;
        this.K = zy7Var3;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strN;
        int i = this.E;
        iei ieiVar = iei.a;
        bz7 bz7Var = this.H;
        Object obj4 = this.L;
        Object obj5 = this.K;
        Object obj6 = this.J;
        Object obj7 = this.I;
        int i2 = 2;
        int i3 = 1;
        switch (i) {
            case 0:
                zy7 zy7Var = (zy7) obj7;
                zy7 zy7Var2 = (zy7) obj6;
                by2 by2Var = (by2) obj4;
                zy7 zy7Var3 = (zy7) obj5;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                wo1 wo1Var = lja.P;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((e18) ld4Var).g(zBooleanValue) ? 4 : 2;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    e18Var.T();
                } else {
                    fqb fqbVar = fqb.E;
                    fo0 fo0Var = ko0.a;
                    if (!zBooleanValue) {
                        e18Var.a0(-453086053);
                        cxe cxeVarA = axe.a(fo0Var, wo1Var, e18Var, 0);
                        int iHashCode = Long.hashCode(e18Var.T);
                        hyc hycVarL = e18Var.l();
                        iqb iqbVarE = kxk.E(e18Var, fqbVar);
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
                        xik.a(by2Var, bz7Var, null, e18Var, 0);
                        wd6.K(fxe.a, this.G, null, null, null, null, fd9.q0(-1087981524, new tu(i3, zy7Var3), e18Var), e18Var, 1572870, 30);
                        e18Var.p(true);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(-454395710);
                        cxe cxeVarA2 = axe.a(fo0Var, wo1Var, e18Var, 0);
                        int iHashCode2 = Long.hashCode(e18Var.T);
                        hyc hycVarL2 = e18Var.l();
                        iqb iqbVarE2 = kxk.E(e18Var, fqbVar);
                        dd4.e.getClass();
                        re4 re4Var2 = cd4.b;
                        e18Var.e0();
                        if (e18Var.S) {
                            e18Var.k(re4Var2);
                        } else {
                            e18Var.n0();
                        }
                        d4c.i0(e18Var, cd4.f, cxeVarA2);
                        d4c.i0(e18Var, cd4.e, hycVarL2);
                        d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode2));
                        d4c.h0(e18Var, cd4.h);
                        d4c.i0(e18Var, cd4.d, iqbVarE2);
                        boolean z = this.F;
                        ez1.e(zy7Var, null, z, null, null, fd9.q0(-2043487447, new tp(z, i3), e18Var), e18Var, 1572864, 58);
                        ez1.e(zy7Var2, null, z, null, null, fd9.q0(460527840, new tp(z, i2), e18Var), e18Var, 1572864, 58);
                        e18Var.p(true);
                        e18Var.p(false);
                    }
                }
                break;
            default:
                String str = (String) obj7;
                iqb iqbVar = (iqb) obj6;
                String str2 = (String) obj5;
                nwb nwbVar = (nwb) obj4;
                wb7 wb7Var = (wb7) obj;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                wb7Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? ((e18) ld4Var2).f(wb7Var) : ((e18) ld4Var2).h(wb7Var) ? 4 : 2;
                }
                int i4 = iIntValue2;
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(i4 & 1, (i4 & 19) != 18)) {
                    e18Var2.T();
                } else {
                    boolean z2 = this.F;
                    if (z2) {
                        strN = vb7.n(e18Var2, 1419248283, R.string.project_create_screen_project_visibility_private_label, e18Var2, false);
                    } else {
                        e18Var2.a0(1419362394);
                        e18Var2.p(false);
                        strN = str;
                    }
                    ub7 ub7Var = ub7.a;
                    long jD = p54.d(wb5.x, e18Var2);
                    long jD2 = p54.d(wb5.B, e18Var2);
                    long jB = d54.b(wb5.i, p54.d(wb5.h, e18Var2));
                    long jD3 = p54.d(wb5.s, e18Var2);
                    o54 o54Var = wb5.e;
                    long jD4 = p54.d(o54Var, e18Var2);
                    long jD5 = p54.d(o54Var, e18Var2);
                    long jD6 = p54.d(o54Var, e18Var2);
                    long jD7 = p54.d(o54Var, e18Var2);
                    long jD8 = p54.d(wb5.d, e18Var2);
                    long jD9 = p54.d(wb5.r, e18Var2);
                    nkh nkhVar = (nkh) e18Var2.j(okh.a);
                    long jD10 = p54.d(wb5.w, e18Var2);
                    long jD11 = p54.d(wb5.c, e18Var2);
                    long jB2 = d54.b(wb5.g, p54.d(wb5.f, e18Var2));
                    long jD12 = p54.d(wb5.q, e18Var2);
                    long jD13 = p54.d(wb5.z, e18Var2);
                    long jD14 = p54.d(wb5.D, e18Var2);
                    long jB3 = d54.b(wb5.l, p54.d(wb5.k, e18Var2));
                    long jD15 = p54.d(wb5.u, e18Var2);
                    long jD16 = p54.d(wb5.A, e18Var2);
                    long jD17 = p54.d(wb5.F, e18Var2);
                    long jB4 = d54.b(wb5.p, p54.d(wb5.o, e18Var2));
                    long jD18 = p54.d(wb5.v, e18Var2);
                    long jD19 = p54.d(wb5.y, e18Var2);
                    long jD20 = p54.d(wb5.C, e18Var2);
                    long jD21 = p54.d(wb5.j, e18Var2);
                    long jD22 = p54.d(wb5.t, e18Var2);
                    o54 o54Var2 = wb5.E;
                    long jD23 = p54.d(o54Var2, e18Var2);
                    long jD24 = p54.d(o54Var2, e18Var2);
                    o54 o54Var3 = wb5.m;
                    long jD25 = p54.d(o54Var3, e18Var2);
                    float f = wb5.n;
                    ffh ffhVarA = vz8.A(jD, jD2, jB, jD3, jD4, jD5, jD6, jD7, jD8, jD9, nkhVar, jD10, jD11, jB2, jD12, jD13, jD14, jB3, jD15, jD16, jD17, jB4, jD18, jD19, jD20, jD21, jD22, jD23, jD24, d54.b(f, jD25), p54.d(o54Var2, e18Var2), p54.d(o54Var2, e18Var2), p54.d(o54Var2, e18Var2), d54.b(f, p54.d(o54Var3, e18Var2)), p54.d(o54Var2, e18Var2), p54.d(o54Var2, e18Var2), p54.d(o54Var2, e18Var2), d54.b(f, p54.d(o54Var3, e18Var2)), p54.d(o54Var2, e18Var2), e18Var2, 0, 15);
                    iqb iqbVarB = wb7Var.b(iqbVar, "PrimaryNotEditable", true);
                    Object objN = e18Var2.N();
                    lz1 lz1Var = jd4.a;
                    if (objN == lz1Var) {
                        objN = new r2i(21);
                        e18Var2.k0(objN);
                    }
                    mwa.b(strN, (bz7) objN, str2, iqbVarB, false, true, null, null, null, fd9.q0(388374778, new tp(z2, 13), e18Var2), fd9.q0(-1798538296, new jj2(18, nwbVar), e18Var2), null, null, null, false, 0, 0, 0L, ffhVarA, e18Var2, 906166320, 6, 1046736);
                    boolean zBooleanValue2 = ((Boolean) nwbVar.getValue()).booleanValue();
                    Object objN2 = e18Var2.N();
                    if (objN2 == lz1Var) {
                        objN2 = new lxf(29, nwbVar);
                        e18Var2.k0(objN2);
                    }
                    wb7Var.a(zBooleanValue2, (zy7) objN2, null, null, false, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(-512997930, new vy3(this.G, str, bz7Var, nwbVar), e18Var2), e18Var2, 48, 6 | ((i4 << 3) & 112), 1020);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ nv(boolean z, String str, iqb iqbVar, String str2, nwb nwbVar, boolean z2, bz7 bz7Var) {
        this.F = z;
        this.I = str;
        this.J = iqbVar;
        this.K = str2;
        this.L = nwbVar;
        this.G = z2;
        this.H = bz7Var;
    }
}
