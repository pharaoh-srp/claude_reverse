package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class fv9 implements gvg, q5b {
    public final /* synthetic */ iv9 E;
    public final /* synthetic */ nv9 F;

    public fv9(nv9 nv9Var) {
        this.F = nv9Var;
        this.E = nv9Var.L;
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
        return this.E.J0(i, i2, map, bz7Var, bz7Var2);
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

    @Override // defpackage.cz5
    public final float g0(float f) {
        return f / this.E.getDensity();
    }

    @Override // defpackage.cz5
    public final float getDensity() {
        return this.E.F;
    }

    @Override // defpackage.xa9
    public final fu9 getLayoutDirection() {
        return this.E.E;
    }

    @Override // defpackage.cz5
    public final float k0() {
        return this.E.G;
    }

    @Override // defpackage.xa9
    public final boolean n0() {
        return this.E.n0();
    }

    @Override // defpackage.gvg
    public final List p(pz7 pz7Var, Object obj) {
        nv9 nv9Var = this.F;
        av9 av9Var = nv9Var.E;
        ewb ewbVar = nv9Var.K;
        av9 av9Var2 = (av9) ewbVar.g(obj);
        if (av9Var2 != null && ((vwb) av9Var.r()).E.k(av9Var2) < nv9Var.H) {
            return av9Var2.p();
        }
        ewb ewbVar2 = nv9Var.P;
        ewb ewbVar3 = nv9Var.N;
        wwb wwbVar = nv9Var.Q;
        if (wwbVar.G < nv9Var.I) {
            b39.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        av9 av9Var3 = (av9) ewbVar.g(obj);
        int i = wwbVar.G;
        int i2 = nv9Var.I;
        if (i == i2) {
            wwbVar.b(obj);
        } else {
            Object[] objArr = wwbVar.E;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        nv9Var.I++;
        boolean zB = ewbVar3.b(obj);
        if (zB || av9Var3 != null) {
            if (!zB && av9Var3 != null) {
                nv9Var.k(((vwb) av9Var.r()).E.k(av9Var3), ((vwb) av9Var.r()).E.G);
                nv9Var.S++;
                ewbVar.k(obj);
                ewbVar3.m(obj, av9Var3);
                ewbVar2.m(obj, nv9Var.f(obj));
                if (av9Var.X()) {
                    nv9Var.h();
                }
            }
            av9 av9Var4 = (av9) ewbVar3.g(obj);
            gv9 gv9Var = av9Var4 != null ? (gv9) nv9Var.J.g(av9Var4) : null;
            if (gv9Var != null && gv9Var.d) {
                nv9Var.n(av9Var4, obj, false, pz7Var);
            }
            if ((gv9Var != null ? gv9Var.f : null) != null) {
                nv9Var.d(gv9Var, true);
            }
        } else {
            nv9Var.l(obj, pz7Var, false);
            ewbVar2.m(obj, nv9Var.f(obj));
        }
        av9 av9Var5 = (av9) ewbVar3.g(obj);
        if (av9Var5 == null) {
            return lm6.E;
        }
        List listF0 = av9Var5.A().f0();
        int size = listF0.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((n5b) ((vwb) listF0).get(i3)).J.b = true;
        }
        return listF0;
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
