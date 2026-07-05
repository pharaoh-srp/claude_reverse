package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class tn0 implements rn0, q5b, mma {
    public final su9 E;
    public qn0 F;
    public boolean G;

    public tn0(su9 su9Var, qn0 qn0Var) {
        this.E = su9Var;
        this.F = qn0Var;
    }

    @Override // defpackage.cz5
    public final float D(long j) {
        return this.E.D(j);
    }

    @Override // defpackage.cz5
    public final int E0(long j) {
        return this.E.E0(j);
    }

    @Override // defpackage.q5b
    public final p5b J0(int i, int i2, Map map, bz7 bz7Var, bz7 bz7Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            b39.c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new sn0(i, i2, map, bz7Var, bz7Var2, this);
    }

    @Override // defpackage.cz5
    public final int M0(float f) {
        return this.E.M0(f);
    }

    @Override // defpackage.cz5
    public final long T(int i) {
        return this.E.T(i);
    }

    @Override // defpackage.q5b
    public final p5b U(int i, int i2, Map map, bz7 bz7Var) {
        return this.E.J0(i, i2, map, null, bz7Var);
    }

    @Override // defpackage.cz5
    public final long U0(long j) {
        return this.E.U0(j);
    }

    @Override // defpackage.cz5
    public final long W(float f) {
        return this.E.W(f);
    }

    @Override // defpackage.cz5
    public final float W0(long j) {
        return this.E.W0(j);
    }

    @Override // defpackage.cz5
    public final float c0(int i) {
        return this.E.c0(i);
    }

    @Override // defpackage.mma
    public final cu9 d(cu9 cu9Var) {
        ima imaVar;
        if (cu9Var instanceof ima) {
            return cu9Var;
        }
        if (cu9Var instanceof m5c) {
            hma hmaVarF1 = ((m5c) cu9Var).f1();
            return (hmaVarF1 == null || (imaVar = hmaVarF1.V) == null) ? cu9Var : imaVar;
        }
        b39.b("Unsupported LayoutCoordinates");
        sz6.r();
        return null;
    }

    @Override // defpackage.cz5
    public final float g0(float f) {
        return f / this.E.getDensity();
    }

    @Override // defpackage.cz5
    public final float getDensity() {
        return this.E.getDensity();
    }

    @Override // defpackage.xa9
    public final fu9 getLayoutDirection() {
        return this.E.S.e0;
    }

    @Override // defpackage.mma
    public final cu9 j(b3d b3dVar) {
        z39 z39Var;
        av9 av9Var = this.E.S.M;
        if (av9Var == null) {
            b39.b("Error: Requesting LookaheadScopeCoordinates is not permitted from outside of a LookaheadScope.");
            sz6.r();
            return null;
        }
        if (!av9Var.L) {
            return (m5c) av9Var.k0.I;
        }
        av9 av9VarG = av9Var.G();
        return (av9VarG == null || (z39Var = (z39) av9VarG.k0.H) == null) ? (m5c) ((av9) ((vwb) av9Var.q()).get(0)).k0.I : z39Var;
    }

    @Override // defpackage.cz5
    public final float k0() {
        return this.E.k0();
    }

    @Override // defpackage.xa9
    public final boolean n0() {
        return false;
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
}
