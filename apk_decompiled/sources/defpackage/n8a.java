package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n8a implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ pz7 F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ int H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ qz7 M;

    public /* synthetic */ n8a(te3 te3Var, ue3 ue3Var, qbd qbdVar, Object obj, ta4 ta4Var, ta4 ta4Var2, ta4 ta4Var3, int i) {
        this.I = te3Var;
        this.J = ue3Var;
        this.K = qbdVar;
        this.L = obj;
        this.F = ta4Var;
        this.G = ta4Var2;
        this.M = ta4Var3;
        this.H = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        final c3d c3dVar;
        int iM0;
        int iM02;
        int i;
        de7 de7Var;
        final Integer numValueOf;
        int iIntValue;
        int iM03;
        int iC;
        int i2 = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.L;
        qz7 qz7Var = this.M;
        Object obj4 = this.G;
        pz7 pz7Var = this.F;
        int i3 = this.H;
        Object obj5 = this.K;
        Object obj6 = this.J;
        Object obj7 = this.I;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                dch.a((te3) obj7, (ue3) obj6, (qbd) obj5, this.L, (ta4) pz7Var, (ta4) obj4, (ta4) qz7Var, (ld4) obj, x44.p0(i3 | 1));
                return ieiVar;
            case 1:
                ((Integer) obj2).getClass();
                nai.f((kqc) obj7, (fj0) obj6, (ta4) pz7Var, (ta4) obj4, (iqb) obj5, (rz7) obj3, (sz7) qz7Var, (ld4) obj, x44.p0(i3 | 1));
                return ieiVar;
            default:
                final wbj wbjVar = (wbj) obj7;
                h6f h6fVar = (h6f) obj4;
                pz7 pz7Var2 = (pz7) qz7Var;
                final gvg gvgVar = (gvg) obj;
                rl4 rl4Var = (rl4) obj2;
                final int iH = rl4.h(rl4Var.a);
                final int iG = rl4.g(rl4Var.a);
                long jA = rl4.a(0, 0, 0, 0, 10, rl4Var.a);
                int iD = wbjVar.d(gvgVar, gvgVar.getLayoutDirection());
                int iB = wbjVar.b(gvgVar, gvgVar.getLayoutDirection());
                int iC2 = wbjVar.c(gvgVar);
                final c3d c3dVarU = ((h5b) w44.L0(gvgVar.p((pz7) obj6, i6f.E))).u(jA);
                int i4 = (-iD) - iB;
                int i5 = -iC2;
                final c3d c3dVarU2 = ((h5b) w44.L0(gvgVar.p((pz7) obj5, i6f.G))).u(sl4.i(i4, i5, jA));
                c3d c3dVarU3 = ((h5b) w44.L0(gvgVar.p((pz7) obj3, i6f.H))).u(sl4.i(i4, i5, jA));
                int i6 = c3dVarU3.E;
                if (i6 == 0 && c3dVarU3.F == 0) {
                    c3dVar = c3dVarU3;
                    de7Var = null;
                } else {
                    int i7 = c3dVarU3.F;
                    fu9 fu9Var = fu9.E;
                    if (i3 == 0) {
                        c3dVar = c3dVarU3;
                        if (gvgVar.getLayoutDirection() == fu9Var) {
                            iM0 = gvgVar.M0(16.0f);
                            i = iM0 + iD;
                        } else {
                            iM02 = gvgVar.M0(16.0f);
                            i = ((iH - iM02) - i6) - iB;
                        }
                    } else {
                        c3dVar = c3dVarU3;
                        if (i3 != 2 && i3 != 3) {
                            i = (((iH - i6) + iD) - iB) / 2;
                        } else if (gvgVar.getLayoutDirection() == fu9Var) {
                            iM02 = gvgVar.M0(16.0f);
                            i = ((iH - iM02) - i6) - iB;
                        } else {
                            iM0 = gvgVar.M0(16.0f);
                            i = iM0 + iD;
                        }
                    }
                    de7Var = new de7(i, i7);
                }
                final c3d c3dVarU4 = ((h5b) w44.L0(gvgVar.p(pz7Var, i6f.I))).u(jA);
                int i8 = 0;
                boolean z = c3dVarU4.E == 0 && c3dVarU4.F == 0;
                if (de7Var != null) {
                    int i9 = de7Var.b;
                    if (z || i3 == 3) {
                        iM03 = gvgVar.M0(16.0f) + i9;
                        iC = wbjVar.c(gvgVar);
                    } else {
                        iM03 = c3dVarU4.F + i9;
                        iC = gvgVar.M0(16.0f);
                    }
                    numValueOf = Integer.valueOf(iC + iM03);
                } else {
                    numValueOf = null;
                }
                int i10 = c3dVarU2.F;
                if (i10 != 0) {
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        Integer numValueOf2 = !z ? Integer.valueOf(c3dVarU4.F) : null;
                        iIntValue = numValueOf2 != null ? numValueOf2.intValue() : wbjVar.c(gvgVar);
                    }
                    i8 = i10 + iIntValue;
                }
                final int i11 = i8;
                n59 n59Var = new n59(wbjVar, gvgVar);
                h6fVar.b.setValue(new qnc(gb9.m(n59Var, gvgVar.getLayoutDirection()), (c3dVarU.E == 0 && c3dVarU.F == 0) ? n59Var.d() : gvgVar.c0(c3dVarU.F), gb9.l(n59Var, gvgVar.getLayoutDirection()), z ? n59Var.a() : gvgVar.c0(c3dVarU4.F)));
                final c3d c3dVarU5 = ((h5b) w44.L0(gvgVar.p(pz7Var2, i6f.F))).u(jA);
                final de7 de7Var2 = de7Var;
                return gvgVar.U(iH, iG, nm6.E, new bz7() { // from class: f6f
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj8) {
                        b3d b3dVar = (b3d) obj8;
                        b3dVar.f(c3dVarU5, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                        b3dVar.f(c3dVarU, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                        c3d c3dVar2 = c3dVarU2;
                        int i12 = iH - c3dVar2.E;
                        gvg gvgVar2 = gvgVar;
                        fu9 layoutDirection = gvgVar2.getLayoutDirection();
                        wbj wbjVar2 = wbjVar;
                        int iD2 = ((wbjVar2.d(gvgVar2, layoutDirection) + i12) - wbjVar2.b(gvgVar2, gvgVar2.getLayoutDirection())) / 2;
                        int i13 = iG;
                        b3dVar.f(c3dVar2, iD2, i13 - i11, MTTypesetterKt.kLineSkipLimitMultiplier);
                        c3d c3dVar3 = c3dVarU4;
                        b3dVar.f(c3dVar3, 0, i13 - c3dVar3.F, MTTypesetterKt.kLineSkipLimitMultiplier);
                        de7 de7Var3 = de7Var2;
                        if (de7Var3 != null) {
                            int i14 = de7Var3.a;
                            Integer num = numValueOf;
                            num.getClass();
                            b3dVar.f(c3dVar, i14, i13 - num.intValue(), MTTypesetterKt.kLineSkipLimitMultiplier);
                        }
                        return iei.a;
                    }
                });
        }
    }

    public /* synthetic */ n8a(kqc kqcVar, fj0 fj0Var, ta4 ta4Var, ta4 ta4Var2, iqb iqbVar, rz7 rz7Var, sz7 sz7Var, int i) {
        this.I = kqcVar;
        this.J = fj0Var;
        this.F = ta4Var;
        this.G = ta4Var2;
        this.K = iqbVar;
        this.L = rz7Var;
        this.M = sz7Var;
        this.H = i;
    }

    public /* synthetic */ n8a(wbj wbjVar, pz7 pz7Var, pz7 pz7Var2, pz7 pz7Var3, int i, pz7 pz7Var4, h6f h6fVar, pz7 pz7Var5) {
        this.I = wbjVar;
        this.J = pz7Var;
        this.K = pz7Var2;
        this.L = pz7Var3;
        this.H = i;
        this.F = pz7Var4;
        this.G = h6fVar;
        this.M = pz7Var5;
    }
}
