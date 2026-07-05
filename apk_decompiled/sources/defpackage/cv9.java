package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cv9 implements xd6 {
    public final ib2 E = new ib2();
    public vd6 F;

    @Override // defpackage.xd6
    public final fj0 B0() {
        return this.E.F;
    }

    @Override // defpackage.cz5
    public final float D(long j) {
        return this.E.D(j);
    }

    @Override // defpackage.cz5
    public final int E0(long j) {
        return this.E.E0(j);
    }

    @Override // defpackage.xd6
    public final void L0(r20 r20Var, long j, long j2, long j3, float f, hr1 hr1Var, int i) {
        this.E.L0(r20Var, j, j2, j3, f, hr1Var, i);
    }

    @Override // defpackage.xd6
    public final void M(long j, long j2, long j3, float f, int i) {
        this.E.M(j, j2, j3, f, i);
    }

    @Override // defpackage.cz5
    public final int M0(float f) {
        return this.E.M0(f);
    }

    @Override // defpackage.xd6
    public final long P0() {
        return this.E.P0();
    }

    @Override // defpackage.cz5
    public final long T(int i) {
        return this.E.T(i);
    }

    @Override // defpackage.xd6
    public final void T0(long j, long j2, long j3, float f, yd6 yd6Var, hr1 hr1Var, int i) {
        this.E.T0(j, j2, j3, f, yd6Var, hr1Var, i);
    }

    @Override // defpackage.cz5
    public final long U0(long j) {
        return this.E.U0(j);
    }

    @Override // defpackage.xd6
    public final void V(long j, float f, long j2, yd6 yd6Var) {
        this.E.V(j, f, j2, yd6Var);
    }

    @Override // defpackage.cz5
    public final long W(float f) {
        return this.E.W(f);
    }

    @Override // defpackage.cz5
    public final float W0(long j) {
        return this.E.W0(j);
    }

    public final void a() {
        ib2 ib2Var = this.E;
        fb2 fb2VarP = ib2Var.F.p();
        nw5 nw5Var = this.F;
        if (nw5Var == null) {
            throw sq6.z("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        hqb hqbVar = (hqb) nw5Var;
        hqb hqbVarJ = hqbVar.E.J;
        if (hqbVarJ == null || (hqbVarJ.H & 4) == 0) {
            hqbVarJ = null;
        } else {
            while (hqbVarJ != null) {
                int i = hqbVarJ.G;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    hqbVarJ = hqbVarJ.J;
                }
            }
            hqbVarJ = null;
        }
        if (hqbVarJ == null) {
            m5c m5cVarU = yfd.U(nw5Var, 4);
            if (m5cVarU.h1() == hqbVar.E) {
                m5cVarU = m5cVarU.V;
                m5cVarU.getClass();
            }
            m5cVarU.w1(fb2VarP, (ja8) ib2Var.F.F);
            return;
        }
        wwb wwbVar = null;
        while (hqbVarJ != null) {
            if (hqbVarJ instanceof vd6) {
                vd6 vd6Var = (vd6) hqbVarJ;
                ja8 ja8Var = (ja8) ib2Var.F.F;
                m5c m5cVarU2 = yfd.U(vd6Var, 4);
                long jT = csg.T(m5cVarU2.G);
                av9 av9Var = m5cVarU2.S;
                av9Var.getClass();
                dv9.a(av9Var).getSharedDrawScope().b(fb2VarP, jT, m5cVarU2, vd6Var, ja8Var);
            } else if ((hqbVarJ.G & 4) != 0 && (hqbVarJ instanceof qw5)) {
                int i2 = 0;
                for (hqb hqbVar2 = ((qw5) hqbVarJ).T; hqbVar2 != null; hqbVar2 = hqbVar2.J) {
                    if ((hqbVar2.G & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            hqbVarJ = hqbVar2;
                        } else {
                            if (wwbVar == null) {
                                wwbVar = new wwb(0, new hqb[16]);
                            }
                            if (hqbVarJ != null) {
                                wwbVar.b(hqbVarJ);
                                hqbVarJ = null;
                            }
                            wwbVar.b(hqbVar2);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            hqbVarJ = yfd.j(wwbVar);
        }
    }

    public final void b(fb2 fb2Var, long j, m5c m5cVar, vd6 vd6Var, ja8 ja8Var) {
        vd6 vd6Var2 = this.F;
        this.F = vd6Var;
        fu9 fu9Var = m5cVar.S.e0;
        ib2 ib2Var = this.E;
        cz5 cz5VarS = ib2Var.F.s();
        fj0 fj0Var = ib2Var.F;
        fu9 fu9VarU = fj0Var.u();
        fb2 fb2VarP = fj0Var.p();
        long jW = fj0Var.w();
        ja8 ja8Var2 = (ja8) fj0Var.F;
        fj0Var.L(m5cVar);
        fj0Var.M(fu9Var);
        fj0Var.K(fb2Var);
        fj0Var.N(j);
        fj0Var.F = ja8Var;
        fb2Var.g();
        try {
            vd6Var.I0(this);
            fb2Var.p();
            fj0Var.L(cz5VarS);
            fj0Var.M(fu9VarU);
            fj0Var.K(fb2VarP);
            fj0Var.N(jW);
            fj0Var.F = ja8Var2;
            this.F = vd6Var2;
        } catch (Throwable th) {
            fb2Var.p();
            fj0Var.L(cz5VarS);
            fj0Var.M(fu9VarU);
            fj0Var.K(fb2VarP);
            fj0Var.N(jW);
            fj0Var.F = ja8Var2;
            throw th;
        }
    }

    @Override // defpackage.xd6
    public final void b1(jy1 jy1Var, long j, long j2, float f, yd6 yd6Var, hr1 hr1Var, int i) {
        this.E.b1(jy1Var, j, j2, f, yd6Var, hr1Var, i);
    }

    @Override // defpackage.cz5
    public final float c0(int i) {
        return this.E.c0(i);
    }

    @Override // defpackage.xd6
    public final long g() {
        return this.E.g();
    }

    @Override // defpackage.cz5
    public final float g0(float f) {
        return f / this.E.getDensity();
    }

    @Override // defpackage.cz5
    public final float getDensity() {
        return this.E.getDensity();
    }

    @Override // defpackage.xd6
    public final fu9 getLayoutDirection() {
        return this.E.E.b;
    }

    @Override // defpackage.xd6
    public final void i(c40 c40Var, long j, float f, yd6 yd6Var) {
        this.E.i(c40Var, j, f, yd6Var);
    }

    @Override // defpackage.cz5
    public final float k0() {
        return this.E.k0();
    }

    @Override // defpackage.xd6
    public final void p0(long j, long j2, long j3, long j4, yd6 yd6Var, float f) {
        this.E.p0(j, j2, j3, j4, yd6Var, f);
    }

    @Override // defpackage.cz5
    public final float q0(float f) {
        return this.E.getDensity() * f;
    }

    @Override // defpackage.cz5
    public final long r(float f) {
        return this.E.r(f);
    }

    @Override // defpackage.cz5
    public final long s(long j) {
        return this.E.s(j);
    }

    @Override // defpackage.xd6
    public final void t(long j, bz7 bz7Var, ja8 ja8Var) {
        ja8Var.f(this, getLayoutDirection(), j, new v80(this, this.F, bz7Var, 4));
    }

    @Override // defpackage.xd6
    public final void t0(c40 c40Var, jy1 jy1Var, float f, yd6 yd6Var, hr1 hr1Var, int i) {
        this.E.t0(c40Var, jy1Var, f, yd6Var, hr1Var, i);
    }

    @Override // defpackage.xd6
    public final void w0(jy1 jy1Var, long j, long j2, long j3, float f, yd6 yd6Var, hr1 hr1Var, int i) {
        this.E.w0(jy1Var, j, j2, j3, f, yd6Var, hr1Var, i);
    }

    @Override // defpackage.xd6
    public final void x(r20 r20Var, long j, float f, hr1 hr1Var, int i) {
        this.E.x(r20Var, j, f, hr1Var, i);
    }

    @Override // defpackage.xd6
    public final void y0(long j, float f, float f2, long j2, long j3, float f3, ksg ksgVar) {
        this.E.y0(j, f, f2, j2, j3, f3, ksgVar);
    }

    @Override // defpackage.xd6
    public final void z0(w0e w0eVar, float f, long j) {
        this.E.z0(w0eVar, f, j);
    }
}
