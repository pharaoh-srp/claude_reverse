package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class su9 extends m5c {
    public static final v30 C0;
    public qu9 A0;
    public tn0 B0;
    public pu9 y0;
    public rl4 z0;

    static {
        v30 v30VarJ = dch.j();
        int i = d54.i;
        v30VarJ.e(d54.f);
        v30VarJ.l(1.0f);
        v30VarJ.m(1);
        C0 = v30VarJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public su9(av9 av9Var, pu9 pu9Var) {
        super(av9Var);
        this.y0 = pu9Var;
        this.A0 = av9Var.M != null ? new qu9(this) : null;
        this.B0 = (((hqb) pu9Var).E.G & 512) != 0 ? new tn0(this, (qn0) pu9Var) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J1() {
        /*
            r8 = this;
            boolean r0 = r8.N
            if (r0 == 0) goto L5
            return
        L5:
            r8.s1()
            m5c r0 = r8.V
            r0.getClass()
            tn0 r1 = r8.B0
            r2 = 0
            if (r1 == 0) goto L5c
            qn0 r3 = r1.F
            qu9 r4 = r8.A0
            r4.getClass()
            ima r4 = r4.V
            gma r5 = r8.P
            boolean r3 = r3.z(r5, r4)
            if (r3 != 0) goto L59
            boolean r1 = r1.G
            if (r1 != 0) goto L59
            long r3 = r8.G
            qu9 r1 = r8.A0
            r5 = 0
            if (r1 == 0) goto L38
            long r6 = r1.O0()
            g79 r1 = new g79
            r1.<init>(r6)
            goto L39
        L38:
            r1 = r5
        L39:
            boolean r1 = defpackage.g79.a(r3, r1)
            if (r1 == 0) goto L59
            long r3 = r0.G
            hma r1 = r0.f1()
            if (r1 == 0) goto L51
            long r5 = r1.O0()
            g79 r1 = new g79
            r1.<init>(r5)
            r5 = r1
        L51:
            boolean r1 = defpackage.g79.a(r3, r5)
            if (r1 == 0) goto L59
            r1 = 1
            goto L5a
        L59:
            r1 = r2
        L5a:
            r0.T = r1
        L5c:
            boolean r1 = r8.O
            r0.O = r1
            p5b r8 = r8.x0()
            r8.d()
            r0.O = r2
            r0.T = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.su9.J1():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K1(pu9 pu9Var) {
        if (!pu9Var.equals(this.y0)) {
            if ((((hqb) pu9Var).E.G & 512) != 0) {
                qn0 qn0Var = (qn0) pu9Var;
                tn0 tn0Var = this.B0;
                if (tn0Var != null) {
                    tn0Var.F = qn0Var;
                } else {
                    tn0Var = new tn0(this, qn0Var);
                }
                this.B0 = tn0Var;
            } else {
                this.B0 = null;
            }
        }
        this.y0 = pu9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.h5b
    public final int Q(int i) {
        tn0 tn0Var = this.B0;
        if (tn0Var == null) {
            pu9 pu9Var = this.y0;
            m5c m5cVar = this.V;
            m5cVar.getClass();
            return pu9Var.A0(this, m5cVar, i);
        }
        qn0 qn0Var = tn0Var.F;
        m5c m5cVar2 = this.V;
        m5cVar2.getClass();
        m5c m5cVar3 = ((hqb) qn0Var).E.L;
        m5cVar3.getClass();
        hma hmaVarF1 = m5cVar3.f1();
        hmaVarF1.getClass();
        if (!hmaVarF1.u0()) {
            return m5cVar2.Q(i);
        }
        return new on0(qn0Var, 1).a(new nn0(tn0Var, tn0Var.getLayoutDirection()), new ur5(m5cVar2, u5c.E, v5c.F, 1), sl4.b(0, i, 0, 0, 13)).a();
    }

    @Override // defpackage.c3d
    public final void Z(long j, float f, bz7 bz7Var) {
        if (this.T) {
            hma hmaVarF1 = f1();
            hmaVarF1.getClass();
            x1(hmaVarF1.T, f, bz7Var, null);
        } else {
            x1(j, f, bz7Var, null);
        }
        J1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.h5b
    public final int a(int i) {
        tn0 tn0Var = this.B0;
        if (tn0Var == null) {
            pu9 pu9Var = this.y0;
            m5c m5cVar = this.V;
            m5cVar.getClass();
            return pu9Var.l0(this, m5cVar, i);
        }
        qn0 qn0Var = tn0Var.F;
        m5c m5cVar2 = this.V;
        m5cVar2.getClass();
        m5c m5cVar3 = ((hqb) qn0Var).E.L;
        m5cVar3.getClass();
        hma hmaVarF1 = m5cVar3.f1();
        hmaVarF1.getClass();
        if (!hmaVarF1.u0()) {
            return m5cVar2.a(i);
        }
        return new on0(qn0Var, 0).a(new nn0(tn0Var, tn0Var.getLayoutDirection()), new ur5(m5cVar2, u5c.F, v5c.F, 1), sl4.b(0, i, 0, 0, 13)).a();
    }

    @Override // defpackage.m5c, defpackage.c3d
    public final void a0(long j, float f, ja8 ja8Var) {
        su9 su9Var;
        if (this.T) {
            hma hmaVarF1 = f1();
            hmaVarF1.getClass();
            su9Var = this;
            su9Var.x1(hmaVarF1.T, f, null, ja8Var);
        } else {
            su9Var = this;
            su9Var.x1(j, f, null, ja8Var);
        }
        su9Var.J1();
    }

    @Override // defpackage.m5c
    public final void a1() {
        if (this.A0 == null) {
            this.A0 = new qu9(this);
        }
    }

    @Override // defpackage.m5c
    public final hma f1() {
        return this.A0;
    }

    @Override // defpackage.m5c
    public final hqb h1() {
        return ((hqb) this.y0).E;
    }

    @Override // defpackage.fma
    public final int i0(ut utVar) {
        qu9 qu9Var = this.A0;
        if (qu9Var == null) {
            return zni.j(this, utVar);
        }
        mvb mvbVar = qu9Var.X;
        int iD = mvbVar.d(utVar);
        if (iD >= 0) {
            return mvbVar.c[iD];
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.h5b
    public final int l(int i) {
        tn0 tn0Var = this.B0;
        if (tn0Var == null) {
            pu9 pu9Var = this.y0;
            m5c m5cVar = this.V;
            m5cVar.getClass();
            return pu9Var.N0(this, m5cVar, i);
        }
        qn0 qn0Var = tn0Var.F;
        m5c m5cVar2 = this.V;
        m5cVar2.getClass();
        m5c m5cVar3 = ((hqb) qn0Var).E.L;
        m5cVar3.getClass();
        hma hmaVarF1 = m5cVar3.f1();
        hmaVarF1.getClass();
        if (!hmaVarF1.u0()) {
            return m5cVar2.l(i);
        }
        return new pn0(qn0Var, 1).a(new nn0(tn0Var, tn0Var.getLayoutDirection()), new ur5(m5cVar2, u5c.E, v5c.E, 1), sl4.b(0, 0, 0, i, 7)).b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.h5b
    public final int o(int i) {
        tn0 tn0Var = this.B0;
        if (tn0Var == null) {
            pu9 pu9Var = this.y0;
            m5c m5cVar = this.V;
            m5cVar.getClass();
            return pu9Var.h(this, m5cVar, i);
        }
        qn0 qn0Var = tn0Var.F;
        m5c m5cVar2 = this.V;
        m5cVar2.getClass();
        m5c m5cVar3 = ((hqb) qn0Var).E.L;
        m5cVar3.getClass();
        hma hmaVarF1 = m5cVar3.f1();
        hmaVarF1.getClass();
        if (!hmaVarF1.u0()) {
            return m5cVar2.o(i);
        }
        return new pn0(qn0Var, 0).a(new nn0(tn0Var, tn0Var.getLayoutDirection()), new ur5(m5cVar2, u5c.F, v5c.E, 1), sl4.b(0, 0, 0, i, 7)).b();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    @Override // defpackage.h5b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.c3d u(long r9) {
        /*
            r8 = this;
            boolean r0 = r8.U
            r1 = 0
            if (r0 == 0) goto L12
            rl4 r9 = r8.z0
            if (r9 == 0) goto Lc
            long r9 = r9.a
            goto L12
        Lc:
            java.lang.String r8 = "Lookahead constraints cannot be null in approach pass."
            defpackage.sz6.p(r8)
            return r1
        L12:
            r8.d0(r9)
            tn0 r0 = r8.B0
            if (r0 == 0) goto La9
            qn0 r2 = r0.F
            su9 r3 = r0.E
            qu9 r3 = r3.A0
            r3.getClass()
            p5b r3 = r3.x0()
            r3.b()
            r3.a()
            boolean r3 = r2.Q()
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L42
            rl4 r3 = r8.z0
            if (r3 != 0) goto L39
            goto L42
        L39:
            long r6 = r3.a
            int r3 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r3 == 0) goto L40
            goto L42
        L40:
            r3 = r5
            goto L43
        L42:
            r3 = r4
        L43:
            r0.G = r3
            if (r3 != 0) goto L4e
            m5c r3 = r8.V
            r3.getClass()
            r3.U = r4
        L4e:
            m5c r3 = r8.V
            r3.getClass()
            p5b r9 = r2.D0(r0, r3, r9)
            m5c r10 = r8.V
            r10.getClass()
            r10.U = r5
            int r10 = r9.b()
            qu9 r2 = r8.A0
            r2.getClass()
            int r2 = r2.E
            if (r10 != r2) goto L79
            int r10 = r9.a()
            qu9 r2 = r8.A0
            r2.getClass()
            int r2 = r2.F
            if (r10 != r2) goto L79
            goto L7a
        L79:
            r4 = r5
        L7a:
            boolean r10 = r0.G
            if (r10 != 0) goto Lb4
            m5c r10 = r8.V
            r10.getClass()
            long r2 = r10.G
            m5c r10 = r8.V
            r10.getClass()
            hma r10 = r10.f1()
            if (r10 == 0) goto L9a
            long r0 = r10.O0()
            g79 r10 = new g79
            r10.<init>(r0)
            r1 = r10
        L9a:
            boolean r10 = defpackage.g79.a(r2, r1)
            if (r10 == 0) goto Lb4
            if (r4 != 0) goto Lb4
            ru9 r10 = new ru9
            r10.<init>(r9, r8)
            r9 = r10
            goto Lb4
        La9:
            pu9 r0 = r8.y0
            m5c r1 = r8.V
            r1.getClass()
            p5b r9 = r0.b(r8, r1, r9)
        Lb4:
            r8.A1(r9)
            r8.r1()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.su9.u(long):c3d");
    }

    @Override // defpackage.m5c
    public final void w1(fb2 fb2Var, ja8 ja8Var) {
        m5c m5cVar;
        m5c m5cVar2 = this.V;
        m5cVar2.getClass();
        m5cVar2.X0(fb2Var, ja8Var);
        if (!dv9.a(this.S).getShowLayoutBounds() || (m5cVar = this.V) == null) {
            return;
        }
        if (g79.b(this.G, m5cVar.G) && y69.b(m5cVar.f0, 0L)) {
            return;
        }
        long j = this.G;
        fb2Var.j(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, C0);
    }
}
