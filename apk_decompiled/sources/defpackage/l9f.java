package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l9f extends qw5 implements oe4, lbc {
    public aaf U;
    public ukc V;
    public boolean W;
    public boolean X;
    public eo7 Y;
    public zub Z;
    public xx1 a0;
    public boolean b0;
    public b20 c0;
    public z9f d0;
    public nw5 e0;
    public c20 f0;
    public b20 g0;
    public boolean h0;

    @Override // defpackage.lbc
    public final void F0() {
        c20 c20Var = (c20) yb5.o(this, jmc.a);
        if (x44.r(c20Var, this.f0)) {
            return;
        }
        this.f0 = c20Var;
        this.g0 = null;
        nw5 nw5Var = this.e0;
        if (nw5Var != null) {
            q1(nw5Var);
        }
        this.e0 = null;
        s1();
        z9f z9fVar = this.d0;
        if (z9fVar != null) {
            aaf aafVar = this.U;
            ukc ukcVar = this.V;
            b20 b20Var = this.b0 ? this.g0 : this.c0;
            z9fVar.K1(b20Var, this.a0, this.Y, this.Z, ukcVar, aafVar, this.W, this.h0);
        }
    }

    @Override // defpackage.hqb
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.nw5
    public final void f0() {
        boolean zT1 = t1();
        if (this.h0 != zT1) {
            this.h0 = zT1;
            aaf aafVar = this.U;
            ukc ukcVar = this.V;
            boolean z = this.b0;
            b20 b20Var = z ? this.g0 : this.c0;
            u1(b20Var, this.a0, this.Y, this.Z, ukcVar, aafVar, z, this.W, this.X);
        }
    }

    @Override // defpackage.hqb
    public final void h1() {
        this.h0 = t1();
        s1();
        if (this.d0 == null) {
            aaf aafVar = this.U;
            b20 b20Var = this.b0 ? this.g0 : this.c0;
            z9f z9fVar = new z9f(b20Var, this.a0, this.Y, this.Z, this.V, aafVar, this.W, this.h0);
            p1(z9fVar);
            this.d0 = z9fVar;
        }
    }

    @Override // defpackage.hqb
    public final void i1() {
        nw5 nw5Var = this.e0;
        if (nw5Var != null) {
            q1(nw5Var);
        }
    }

    public final void s1() {
        nw5 nw5Var = this.e0;
        if (nw5Var != null) {
            if (nw5Var.x0().R) {
                return;
            }
            p1(nw5Var);
            return;
        }
        if (this.b0) {
            d4c.a0(this, new p3f(6, this));
        }
        b20 b20Var = this.b0 ? this.g0 : this.c0;
        if (b20Var != null) {
            qw5 qw5Var = b20Var.i;
            if (qw5Var.E.R) {
                return;
            }
            p1(qw5Var);
            this.e0 = qw5Var;
        }
    }

    public final boolean t1() {
        fu9 fu9Var = this.R ? yfd.W(this).e0 : fu9.E;
        ukc ukcVar = this.V;
        boolean z = this.X;
        return (fu9Var != fu9.F || ukcVar == ukc.E) ? !z : z;
    }

    public final void u1(b20 b20Var, xx1 xx1Var, eo7 eo7Var, zub zubVar, ukc ukcVar, aaf aafVar, boolean z, boolean z2, boolean z3) {
        boolean z4;
        this.U = aafVar;
        this.V = ukcVar;
        boolean z5 = true;
        if (this.b0 != z) {
            this.b0 = z;
            z4 = true;
        } else {
            z4 = false;
        }
        if (x44.r(this.c0, b20Var)) {
            z5 = false;
        } else {
            this.c0 = b20Var;
        }
        if (z4 || (z5 && !z)) {
            nw5 nw5Var = this.e0;
            if (nw5Var != null) {
                q1(nw5Var);
            }
            this.e0 = null;
            s1();
        }
        this.W = z2;
        this.X = z3;
        this.Y = eo7Var;
        this.Z = zubVar;
        this.a0 = xx1Var;
        boolean zT1 = t1();
        this.h0 = zT1;
        z9f z9fVar = this.d0;
        if (z9fVar != null) {
            z9fVar.K1(this.b0 ? this.g0 : this.c0, xx1Var, eo7Var, zubVar, ukcVar, aafVar, z2, zT1);
        }
    }
}
