package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s1g extends hqb implements qn0, vd6, mqb, lbc, oe4 {
    public l9e S;
    public boolean T;
    public h2g U;
    public ja8 V;
    public final v7g W;

    public s1g(h2g h2gVar) {
        this.U = h2gVar;
        this.V = (ja8) h2gVar.Q.getValue();
        tk5 tk5Var = e2g.a;
        v7g v7gVar = new v7g(tk5Var);
        v7gVar.Q(tk5Var, h2gVar);
        this.W = v7gVar;
    }

    @Override // defpackage.qn0
    public final p5b D0(rn0 rn0Var, h5b h5bVar, long j) {
        long jK;
        l9e l9eVarC = this.U.c().c();
        if (l9eVarC == null) {
            s3g s3gVar = this.U.d().c;
            s3gVar.c();
            l9eVarC = s3gVar.a().f(s3gVar.a);
        }
        if (l9eVarC != null) {
            long jL = csg.L(l9eVarC.g());
            int i = (int) (jL >> 32);
            int i2 = (int) (jL & 4294967295L);
            if (i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE) {
                StringBuilder sb = new StringBuilder("Error: Infinite width/height is invalid. animated bounds: ");
                sb.append(this.U.c().c());
                pmf.l(sb, ", current bounds: ", this.U.d().c.a().c());
                return null;
            }
            if (i < 0) {
                i = 0;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            if (!((i2 >= 0) & (i >= 0))) {
                d39.a("width and height must be >= 0");
            }
            j = sl4.h(i, i, i2, i2);
        }
        c3d c3dVarU = h5bVar.u(j);
        if (this.U.d().c.a().d()) {
            g3g g3gVar = (g3g) this.U.J.getValue();
            jK = this.U.d().b.E.d(yfd.V(this)).k();
            int i3 = c3dVarU.E;
            int i4 = c3dVarU.F;
            g3gVar.getClass();
        } else {
            jK = (((long) c3dVarU.E) << 32) | (((long) c3dVarU.F) & 4294967295L);
        }
        return rn0Var.U((int) (jK >> 32), (int) (jK & 4294967295L), nm6.E, new q1g(this, c3dVarU));
    }

    @Override // defpackage.lbc
    public final void F0() {
        this.U.d().e();
        d4c.a0(this, this.U.d().i);
    }

    @Override // defpackage.vd6
    public final void I0(cv9 cv9Var) {
        g2g g2gVarD = this.U.d();
        l9e l9eVarC = g2gVarD.c.a().c();
        h2g h2gVar = this.U;
        c40 c40Var = null;
        if (h2gVar.f() && l9eVarC != null) {
            l3g l3gVar = (l3g) this.U.L.getValue();
            h3g h3gVar = (h3g) this.U.M.getValue();
            cv9Var.getLayoutDirection();
            cz5 cz5Var = yfd.W(this).d0;
            l3gVar.getClass();
            h2g h2gVar2 = (h2g) h3gVar.c.getValue();
            if (h2gVar2 == null) {
                sz6.p("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not been initialized.");
                return;
            }
            h2g h2gVar3 = h2gVar2.O;
            h3g h3gVar2 = h2gVar3 != null ? (h3g) h2gVar3.M.getValue() : null;
            if (h3gVar2 != null) {
                h2g h2gVar4 = (h2g) h3gVar2.c.getValue();
                if (h2gVar4 == null) {
                    sz6.p("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not been initialized.");
                    return;
                }
                c40Var = h2gVar4.N;
            }
        }
        h2gVar.N = c40Var;
        ja8 ja8Var = (ja8) this.U.Q.getValue();
        if (ja8Var != null) {
            xd6.Q0(cv9Var, ja8Var, new r1g(cv9Var, l9eVarC, g2gVarD));
            h2g h2gVar5 = this.U;
            if (!h2gVar5.d().c.a().d() || (!h2gVar5.f() && h2gVar5.e())) {
                csg.t(cv9Var, ja8Var);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Error: Layer is null when accessed for shared bounds/element : ");
        sb.append(g2gVarD.a);
        boolean zB = this.U.c().b();
        boolean z = this.R;
        sb.append(",target: ");
        sb.append(zB);
        sb.append(", is attached: ");
        sb.append(z);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    @Override // defpackage.qn0
    public final boolean Q() {
        return this.U.h() && this.U.d().a() && this.U.d().b.a();
    }

    @Override // defpackage.qn0, defpackage.pu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        c3d c3dVarU = h5bVar.u(j);
        return q5bVar.U(c3dVarU.E, c3dVarU.F, nm6.E, new q1g(c3dVarU, this));
    }

    @Override // defpackage.hqb
    public final void h1() {
        d4c.a0(this, this.U.d().i);
        r1();
        this.U.E.setValue(Boolean.TRUE);
    }

    @Override // defpackage.hqb
    public final void i1() {
        cu9 cu9Var = this.U.d().b.I;
        if (cu9Var != null) {
            this.S = (cu9Var.n() && this.T) ? d4c.x(fcc.h(yfd.V(this).K(0L), cu9Var.K(0L)), csg.T(yfd.V(this).G)) : null;
        }
        q1(null);
        h2g h2gVar = this.U;
        h2gVar.O = null;
        h2gVar.P = null;
        h2gVar.E.setValue(Boolean.FALSE);
        this.T = false;
    }

    @Override // defpackage.mqb
    public final kxk j0() {
        return this.W;
    }

    @Override // defpackage.hqb
    public final void j1() {
        this.S = null;
        ja8 ja8Var = this.V;
        if (ja8Var != null) {
            yfd.X(this).getGraphicsContext().a(ja8Var);
        }
        q1(yfd.X(this).getGraphicsContext().c());
    }

    public final cu9 p1() {
        cu9 cu9Var = this.U.d().b.I;
        if (cu9Var != null) {
            return cu9Var;
        }
        sz6.p("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
        return null;
    }

    public final void q1(ja8 ja8Var) {
        if (ja8Var == null) {
            ja8 ja8Var2 = this.V;
            if (ja8Var2 != null) {
                yfd.X(this).getGraphicsContext().a(ja8Var2);
            }
        } else {
            this.U.Q.setValue(ja8Var);
        }
        this.V = ja8Var;
    }

    public final void r1() {
        tk5 tk5Var = e2g.a;
        h2g h2gVar = this.U;
        om6 om6Var = om6.l;
        v7g v7gVar = this.W;
        if (v7gVar == om6Var) {
            b39.a("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        if (!v7gVar.q(tk5Var)) {
            b39.a("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + tk5Var + " was not found.");
        }
        v7gVar.Q(tk5Var, h2gVar);
        this.U.O = (h2g) b0(tk5Var);
        q1(yfd.X(this).getGraphicsContext().c());
        this.T = false;
        this.U.P = this;
    }
}
