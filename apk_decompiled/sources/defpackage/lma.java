package defpackage;

import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class lma extends c3d implements h5b, au, yrb {
    public final ev9 J;
    public boolean K;
    public boolean O;
    public boolean P;
    public boolean Q;
    public rl4 R;
    public bz7 T;
    public ja8 U;
    public boolean Z;
    public Object c0;
    public boolean g0;
    public int L = Integer.MAX_VALUE;
    public int M = Integer.MAX_VALUE;
    public xu9 N = xu9.G;
    public long S = 0;
    public jma V = jma.G;
    public final bv9 W = new bv9(this, 1);
    public final wwb X = new wwb(0, new lma[16]);
    public boolean Y = true;
    public final kma a0 = new kma(this, 0);
    public boolean b0 = true;
    public long d0 = sl4.b(0, 0, 0, 0, 15);
    public final kma e0 = new kma(this, 2);
    public final kma f0 = new kma(this, 1);

    public lma(ev9 ev9Var) {
        this.J = ev9Var;
        this.c0 = ev9Var.p.W;
    }

    @Override // defpackage.yrb
    public final void B(boolean z) {
        hma hmaVarF1;
        ev9 ev9Var = this.J;
        hma hmaVarF12 = ev9Var.a().f1();
        if (Boolean.valueOf(z).equals(hmaVarF12 != null ? Boolean.valueOf(hmaVarF12.M) : null) || (hmaVarF1 = ev9Var.a().f1()) == null) {
            return;
        }
        hmaVarF1.M = z;
    }

    @Override // defpackage.au
    public final void C() {
        this.Z = true;
        bv9 bv9Var = this.W;
        bv9Var.h();
        ev9 ev9Var = this.J;
        boolean z = ev9Var.f;
        av9 av9Var = ev9Var.a;
        if (z) {
            wwb wwbVarM = av9Var.M();
            Object[] objArr = wwbVarM.E;
            int i = wwbVarM.G;
            for (int i2 = 0; i2 < i; i2++) {
                av9 av9Var2 = (av9) objArr[i2];
                if (av9Var2.y() && av9Var2.D() == xu9.E) {
                    lma lmaVar = av9Var2.t().q;
                    lmaVar.getClass();
                    lma lmaVar2 = av9Var2.t().q;
                    rl4 rl4Var = lmaVar2 != null ? lmaVar2.R : null;
                    rl4Var.getClass();
                    if (lmaVar.v0(rl4Var.a)) {
                        av9.t0(av9Var, false, 7);
                    }
                }
            }
        }
        y39 y39Var = d().z0;
        y39Var.getClass();
        if (ev9Var.g || (!this.O && !y39Var.O && ev9Var.f)) {
            ev9Var.f = false;
            vu9 vu9Var = ev9Var.d;
            ev9Var.d = vu9.H;
            ev9Var.i(false);
            omc snapshotObserver = dv9.a(av9Var).getSnapshotObserver();
            snapshotObserver.a.d(av9Var, snapshotObserver.h, this.a0);
            ev9Var.d = vu9Var;
            if (ev9Var.m && y39Var.O) {
                requestLayout();
            }
            ev9Var.g = false;
        }
        if (bv9Var.d) {
            bv9Var.e = true;
        }
        if (bv9Var.b && bv9Var.e()) {
            bv9Var.g();
        }
        this.Z = false;
    }

    @Override // defpackage.au
    public final void F(e0 e0Var) throws IOException {
        wwb wwbVarM = this.J.a.M();
        Object[] objArr = wwbVarM.E;
        int i = wwbVarM.G;
        for (int i2 = 0; i2 < i; i2++) {
            lma lmaVar = ((av9) objArr[i2]).t().q;
            lmaVar.getClass();
            e0Var.invoke(lmaVar);
        }
    }

    @Override // defpackage.au
    public final void N() {
        av9.t0(this.J.a, false, 7);
    }

    @Override // defpackage.h5b
    public final int Q(int i) {
        o0();
        hma hmaVarF1 = this.J.a().f1();
        hmaVarF1.getClass();
        return hmaVarF1.Q(i);
    }

    @Override // defpackage.c3d
    public final int R(ut utVar) {
        ev9 ev9Var = this.J;
        av9 av9VarG = ev9Var.a.G();
        vu9 vu9VarW = av9VarG != null ? av9VarG.w() : null;
        vu9 vu9Var = vu9.F;
        bv9 bv9Var = this.W;
        if (vu9VarW == vu9Var) {
            bv9Var.c = true;
        } else {
            av9 av9VarG2 = ev9Var.a.G();
            if ((av9VarG2 != null ? av9VarG2.w() : null) == vu9.H) {
                bv9Var.d = true;
            }
        }
        this.O = true;
        hma hmaVarF1 = ev9Var.a().f1();
        hmaVarF1.getClass();
        int iR = hmaVarF1.R(utVar);
        this.O = false;
        return iR;
    }

    @Override // defpackage.c3d
    public final int S() {
        hma hmaVarF1 = this.J.a().f1();
        hmaVarF1.getClass();
        return hmaVarF1.S();
    }

    @Override // defpackage.c3d
    public final int X() {
        hma hmaVarF1 = this.J.a().f1();
        hmaVarF1.getClass();
        return hmaVarF1.X();
    }

    @Override // defpackage.c3d
    public final void Z(long j, float f, bz7 bz7Var) throws Throwable {
        u0(j, bz7Var, null);
    }

    @Override // defpackage.h5b
    public final int a(int i) {
        o0();
        hma hmaVarF1 = this.J.a().f1();
        hmaVarF1.getClass();
        return hmaVarF1.a(i);
    }

    @Override // defpackage.c3d
    public final void a0(long j, float f, ja8 ja8Var) throws Throwable {
        u0(j, null, ja8Var);
    }

    @Override // defpackage.au
    public final bv9 c() {
        return this.W;
    }

    @Override // defpackage.au
    public final z39 d() {
        return (z39) this.J.a.k0.H;
    }

    @Override // defpackage.au
    public final au f() {
        ev9 ev9VarT;
        av9 av9VarG = this.J.a.G();
        if (av9VarG == null || (ev9VarT = av9VarG.t()) == null) {
            return null;
        }
        return ev9VarT.q;
    }

    public final boolean f0() {
        ev9 ev9Var = this.J;
        return fd9.g0(ev9Var.a) || ev9Var.c;
    }

    public final void i0(boolean z) {
        if (z && f0()) {
            return;
        }
        if (z || f0()) {
            this.V = jma.G;
            wwb wwbVarM = this.J.a.M();
            Object[] objArr = wwbVarM.E;
            int i = wwbVarM.G;
            for (int i2 = 0; i2 < i; i2++) {
                lma lmaVar = ((av9) objArr[i2]).t().q;
                lmaVar.getClass();
                lmaVar.i0(true);
            }
        }
    }

    public final void j0() {
        jma jmaVar = this.V;
        ev9 ev9Var = this.J;
        boolean z = ev9Var.c;
        av9 av9Var = ev9Var.a;
        jma jmaVar2 = jma.E;
        if (z) {
            this.V = jma.F;
        } else {
            this.V = jmaVar2;
        }
        if (jmaVar != jmaVar2 && ev9Var.e) {
            av9.t0(av9Var, true, 6);
        }
        wwb wwbVarM = av9Var.M();
        Object[] objArr = wwbVarM.E;
        int i = wwbVarM.G;
        for (int i2 = 0; i2 < i; i2++) {
            av9 av9Var2 = (av9) objArr[i2];
            lma lmaVarZ = av9Var2.z();
            if (lmaVarZ == null) {
                sz6.p("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (lmaVarZ.M != Integer.MAX_VALUE) {
                lmaVarZ.j0();
                av9.w0(av9Var2);
            }
        }
    }

    @Override // defpackage.h5b
    public final int l(int i) {
        o0();
        hma hmaVarF1 = this.J.a().f1();
        hmaVarF1.getClass();
        return hmaVarF1.l(i);
    }

    public final void l0() {
        ev9 ev9Var = this.J;
        if (ev9Var.o > 0) {
            wwb wwbVarM = ev9Var.a.M();
            Object[] objArr = wwbVarM.E;
            int i = wwbVarM.G;
            for (int i2 = 0; i2 < i; i2++) {
                av9 av9Var = (av9) objArr[i2];
                ev9 ev9VarT = av9Var.t();
                if ((ev9VarT.m || ev9VarT.n) && !ev9VarT.f) {
                    av9Var.s0(false);
                }
                lma lmaVar = ev9VarT.q;
                if (lmaVar != null) {
                    lmaVar.l0();
                }
            }
        }
    }

    @Override // defpackage.au
    public final int m() {
        return this.M;
    }

    @Override // defpackage.h5b
    public final int o(int i) {
        o0();
        hma hmaVarF1 = this.J.a().f1();
        hmaVarF1.getClass();
        return hmaVarF1.o(i);
    }

    public final void o0() {
        ev9 ev9Var = this.J;
        av9.t0(ev9Var.a, false, 7);
        av9 av9Var = ev9Var.a;
        av9 av9VarG = av9Var.G();
        if (av9VarG == null || av9Var.h0 != xu9.G) {
            return;
        }
        int iOrdinal = av9VarG.w().ordinal();
        av9Var.h0 = iOrdinal != 0 ? iOrdinal != 2 ? av9VarG.h0 : xu9.F : xu9.E;
    }

    @Override // defpackage.au
    public final void requestLayout() {
        this.J.a.s0(false);
    }

    public final void s0() {
        this.g0 = true;
        ev9 ev9Var = this.J;
        av9 av9VarG = ev9Var.a.G();
        jma jmaVar = this.V;
        if ((jmaVar != jma.E && !ev9Var.c) || (jmaVar != jma.F && ev9Var.c)) {
            j0();
            if (this.K && av9VarG != null) {
                av9VarG.s0(false);
            }
        }
        if (av9VarG == null) {
            this.M = 0;
        } else if (!this.K && (av9VarG.w() == vu9.G || av9VarG.w() == vu9.H)) {
            if (this.M != Integer.MAX_VALUE) {
                b39.c("Place was called on a node which was placed already");
            }
            this.M = av9VarG.t().h;
            av9VarG.t().h++;
        }
        C();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    @Override // defpackage.h5b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.c3d u(long r7) {
        /*
            r6 = this;
            ev9 r0 = r6.J
            av9 r1 = r0.a
            av9 r2 = r0.a
            av9 r1 = r1.G()
            r3 = 0
            if (r1 == 0) goto L12
            vu9 r1 = r1.w()
            goto L13
        L12:
            r1 = r3
        L13:
            vu9 r4 = defpackage.vu9.F
            if (r1 == r4) goto L27
            av9 r1 = r2.G()
            if (r1 == 0) goto L22
            vu9 r1 = r1.w()
            goto L23
        L22:
            r1 = r3
        L23:
            vu9 r4 = defpackage.vu9.H
            if (r1 != r4) goto L2a
        L27:
            r1 = 0
            r0.b = r1
        L2a:
            av9 r0 = r2.G()
            xu9 r1 = defpackage.xu9.G
            if (r0 == 0) goto L66
            xu9 r4 = r6.N
            if (r4 == r1) goto L40
            boolean r4 = r2.j0
            if (r4 == 0) goto L3b
            goto L40
        L3b:
            java.lang.String r4 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            defpackage.b39.c(r4)
        L40:
            vu9 r4 = r0.w()
            int r4 = r4.ordinal()
            if (r4 == 0) goto L61
            r5 = 1
            if (r4 == r5) goto L61
            r5 = 2
            if (r4 == r5) goto L5e
            r5 = 3
            if (r4 != r5) goto L54
            goto L5e
        L54:
            java.lang.String r6 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            vu9 r7 = r0.w()
            defpackage.xh6.n(r6, r7)
            return r3
        L5e:
            xu9 r0 = defpackage.xu9.F
            goto L63
        L61:
            xu9 r0 = defpackage.xu9.E
        L63:
            r6.N = r0
            goto L68
        L66:
            r6.N = r1
        L68:
            xu9 r0 = r2.h0
            if (r0 != r1) goto L6f
            r2.e()
        L6f:
            r6.v0(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lma.u(long):c3d");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006e A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:3:0x0007, B:5:0x000d, B:9:0x0016, B:11:0x001b, B:12:0x001d, B:14:0x0021, B:15:0x0026, B:17:0x0035, B:19:0x0039, B:22:0x003f, B:21:0x003d, B:23:0x0042, B:25:0x004c, B:30:0x0056, B:32:0x0082, B:31:0x006e), top: B:36:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u0(long r10, defpackage.bz7 r12, defpackage.ja8 r13) throws java.lang.Throwable {
        /*
            r9 = this;
            ev9 r0 = r9.J
            av9 r1 = r0.a
            av9 r2 = r0.a
            r3 = 0
            av9 r4 = r1.G()     // Catch: java.lang.Throwable -> L12
            if (r4 == 0) goto L15
            vu9 r4 = r4.w()     // Catch: java.lang.Throwable -> L12
            goto L16
        L12:
            r9 = move-exception
            goto L8b
        L15:
            r4 = r3
        L16:
            vu9 r5 = defpackage.vu9.H     // Catch: java.lang.Throwable -> L12
            r6 = 0
            if (r4 != r5) goto L1d
            r0.c = r6     // Catch: java.lang.Throwable -> L12
        L1d:
            boolean r4 = r2.u0     // Catch: java.lang.Throwable -> L12
            if (r4 == 0) goto L26
            java.lang.String r4 = "place is called on a deactivated node"
            defpackage.b39.a(r4)     // Catch: java.lang.Throwable -> L12
        L26:
            r0.d = r5     // Catch: java.lang.Throwable -> L12
            r4 = 1
            r9.P = r4     // Catch: java.lang.Throwable -> L12
            r9.g0 = r6     // Catch: java.lang.Throwable -> L12
            long r7 = r9.S     // Catch: java.lang.Throwable -> L12
            boolean r5 = defpackage.y69.b(r10, r7)     // Catch: java.lang.Throwable -> L12
            if (r5 != 0) goto L42
            boolean r5 = r0.n     // Catch: java.lang.Throwable -> L12
            if (r5 != 0) goto L3d
            boolean r5 = r0.m     // Catch: java.lang.Throwable -> L12
            if (r5 == 0) goto L3f
        L3d:
            r0.f = r4     // Catch: java.lang.Throwable -> L12
        L3f:
            r9.l0()     // Catch: java.lang.Throwable -> L12
        L42:
            androidx.compose.ui.node.Owner r5 = defpackage.dv9.a(r2)     // Catch: java.lang.Throwable -> L12
            r9.S = r10     // Catch: java.lang.Throwable -> L12
            boolean r7 = r0.f     // Catch: java.lang.Throwable -> L12
            if (r7 != 0) goto L6e
            jma r7 = r9.V     // Catch: java.lang.Throwable -> L12
            jma r8 = defpackage.jma.G     // Catch: java.lang.Throwable -> L12
            if (r7 == r8) goto L53
            goto L54
        L53:
            r4 = r6
        L54:
            if (r4 == 0) goto L6e
            m5c r2 = r0.a()     // Catch: java.lang.Throwable -> L12
            hma r2 = r2.f1()     // Catch: java.lang.Throwable -> L12
            r2.getClass()     // Catch: java.lang.Throwable -> L12
            long r4 = r2.I     // Catch: java.lang.Throwable -> L12
            long r10 = defpackage.y69.d(r10, r4)     // Catch: java.lang.Throwable -> L12
            r2.V0(r10)     // Catch: java.lang.Throwable -> L12
            r9.s0()     // Catch: java.lang.Throwable -> L12
            goto L82
        L6e:
            r0.h(r6)     // Catch: java.lang.Throwable -> L12
            bv9 r10 = r9.W     // Catch: java.lang.Throwable -> L12
            r10.g = r6     // Catch: java.lang.Throwable -> L12
            omc r10 = r5.getSnapshotObserver()     // Catch: java.lang.Throwable -> L12
            kma r11 = r9.f0     // Catch: java.lang.Throwable -> L12
            j06 r4 = r10.g     // Catch: java.lang.Throwable -> L12
            odg r10 = r10.a     // Catch: java.lang.Throwable -> L12
            r10.d(r2, r4, r11)     // Catch: java.lang.Throwable -> L12
        L82:
            r9.T = r12     // Catch: java.lang.Throwable -> L12
            r9.U = r13     // Catch: java.lang.Throwable -> L12
            vu9 r9 = defpackage.vu9.I     // Catch: java.lang.Throwable -> L12
            r0.d = r9     // Catch: java.lang.Throwable -> L12
            return
        L8b:
            r1.y0(r9)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lma.u0(long, bz7, ja8):void");
    }

    public final boolean v0(long j) throws Throwable {
        ev9 ev9Var = this.J;
        av9 av9Var = ev9Var.a;
        av9 av9Var2 = ev9Var.a;
        try {
            if (av9Var.u0) {
                b39.a("measure is called on a deactivated node");
            }
            av9 av9VarG = av9Var2.G();
            av9Var2.j0 = av9Var2.j0 || (av9VarG != null && av9VarG.j0);
            if (!av9Var2.y()) {
                rl4 rl4Var = this.R;
                if (rl4Var == null ? false : rl4.b(rl4Var.a, j)) {
                    Owner owner = av9Var2.S;
                    if (owner != null) {
                        ((AndroidComposeView) owner).k(av9Var2, true);
                    }
                    av9Var2.x0();
                    return false;
                }
            }
            this.R = new rl4(j);
            d0(j);
            this.W.f = false;
            wwb wwbVarM = av9Var2.M();
            Object[] objArr = wwbVarM.E;
            int i = wwbVarM.G;
            for (int i2 = 0; i2 < i; i2++) {
                lma lmaVar = ((av9) objArr[i2]).t().q;
                lmaVar.getClass();
                lmaVar.W.c = false;
            }
            long j2 = this.Q ? this.G : -9223372034707292160L;
            this.Q = true;
            hma hmaVarF1 = ev9Var.a().f1();
            if (hmaVarF1 == null) {
                b39.c("Lookahead result from lookaheadRemeasure cannot be null");
            }
            ev9Var.c(j);
            b0((((long) hmaVarF1.E) << 32) | (((long) hmaVarF1.F) & 4294967295L));
            return (((int) (j2 >> 32)) == hmaVarF1.E && ((int) (j2 & 4294967295L)) == hmaVarF1.F) ? false : true;
        } catch (Throwable th) {
            av9Var.y0(th);
            throw null;
        }
    }

    @Override // defpackage.c3d, defpackage.h5b
    public final Object z() {
        return this.c0;
    }
}
