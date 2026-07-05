package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jm8 extends hqb implements oe4, pu9, lbc {
    public tkh S;
    public int T;
    public int U;
    public boolean V;
    public int W;
    public int X;
    public tkh Y;
    public ubi Z;

    @Override // defpackage.lbc
    public final void F0() {
        if (this.Z != null) {
            d4c.a0(this, new xi4(19, this));
        }
        this.V = true;
        yfd.W(this).T();
    }

    @Override // defpackage.pu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        if (this.V) {
            tkh tkhVarP1 = p1();
            wt7 wt7Var = (wt7) yb5.o(this, ve4.k);
            String str = agh.a;
            int iA = (int) (agh.a(tkhVarP1, q5bVar, wt7Var, str, 1) & 4294967295L);
            int iA2 = ((int) (agh.a(tkhVarP1, q5bVar, wt7Var, str + '\n' + str, 2) & 4294967295L)) - iA;
            int i = this.T;
            this.W = i == 1 ? -1 : ((i - 1) * iA2) + iA;
            int i2 = this.U;
            this.X = i2 == Integer.MAX_VALUE ? -1 : ((i2 - 1) * iA2) + iA;
            this.V = false;
        }
        int i3 = this.W;
        int iE0 = i3 != -1 ? wd6.e0(i3, rl4.i(j), rl4.g(j)) : rl4.i(j);
        int i4 = this.X;
        c3d c3dVarU = h5bVar.u(rl4.a(0, 0, iE0, i4 != -1 ? wd6.e0(i4, rl4.i(j), rl4.g(j)) : rl4.g(j), 3, j));
        return q5bVar.U(c3dVarU.E, c3dVarU.F, nm6.E, new mf1(c3dVarU, 2));
    }

    @Override // defpackage.hqb
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.nw5
    public final void f() {
        this.V = true;
        yfd.W(this).T();
    }

    @Override // defpackage.nw5
    public final void f0() {
        this.Y = yfd.Y(this.S, yfd.W(this).e0);
        this.V = true;
        yfd.W(this).T();
    }

    @Override // defpackage.hqb
    public final void h1() {
        wt7 wt7Var = (wt7) yb5.o(this, ve4.k);
        this.Y = yfd.Y(this.S, yfd.W(this).e0);
        xt7 xt7Var = p1().a.f;
        dv7 dv7Var = p1().a.c;
        if (dv7Var == null) {
            dv7Var = dv7.J;
        }
        wu7 wu7Var = p1().a.d;
        int i = wu7Var != null ? wu7Var.a : 0;
        xu7 xu7Var = p1().a.e;
        this.Z = ((zt7) wt7Var).b(xt7Var, dv7Var, i, xu7Var != null ? xu7Var.a : 65535);
        d4c.a0(this, new dg8(3, this));
        this.V = true;
    }

    @Override // defpackage.hqb
    public final void i1() {
        this.Y = null;
        this.Z = null;
        this.V = false;
    }

    public final tkh p1() {
        tkh tkhVar = this.Y;
        if (tkhVar != null) {
            return tkhVar;
        }
        throw vb7.x("Resolved style is not set.");
    }
}
