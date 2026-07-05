package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class mb9 implements q5b, xa9 {
    public final /* synthetic */ xa9 E;
    public final fu9 F;

    public mb9(xa9 xa9Var, fu9 fu9Var) {
        this.E = xa9Var;
        this.F = fu9Var;
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
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            b39.c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new lb9(i, i2, map, bz7Var);
    }

    @Override // defpackage.cz5
    public final int M0(float f) {
        return this.E.M0(f);
    }

    @Override // defpackage.cz5
    public final long T(int i) {
        return this.E.T(i);
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

    @Override // defpackage.cz5
    public final float g0(float f) {
        return this.E.g0(f);
    }

    @Override // defpackage.cz5
    public final float getDensity() {
        return this.E.getDensity();
    }

    @Override // defpackage.xa9
    public final fu9 getLayoutDirection() {
        return this.F;
    }

    @Override // defpackage.cz5
    public final float k0() {
        return this.E.k0();
    }

    @Override // defpackage.xa9
    public final boolean n0() {
        return this.E.n0();
    }

    @Override // defpackage.cz5
    public final float q0(float f) {
        return this.E.q0(f);
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
