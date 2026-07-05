package defpackage;

import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n5b extends c3d implements h5b, au, yrb {
    public final ev9 J;
    public boolean K;
    public boolean N;
    public boolean O;
    public boolean Q;
    public bz7 S;
    public ja8 T;
    public float U;
    public Object W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public boolean f0;
    public float j0;
    public boolean k0;
    public bz7 l0;
    public ja8 m0;
    public float o0;
    public boolean q0;
    public int L = Integer.MAX_VALUE;
    public int M = Integer.MAX_VALUE;
    public xu9 P = xu9.G;
    public long R = 0;
    public boolean V = true;
    public final bv9 c0 = new bv9(this, 0);
    public final wwb d0 = new wwb(0, new n5b[16]);
    public boolean e0 = true;
    public long g0 = sl4.b(0, 0, 0, 0, 15);
    public final m5b h0 = new m5b(this, 1);
    public final m5b i0 = new m5b(this, 0);
    public long n0 = 0;
    public final m5b p0 = new m5b(this, 2);

    public n5b(ev9 ev9Var) {
        this.J = ev9Var;
    }

    @Override // defpackage.yrb
    public final void B(boolean z) {
        ev9 ev9Var = this.J;
        if (z != ev9Var.a().M) {
            ev9Var.a().M = z;
            this.q0 = true;
        }
    }

    @Override // defpackage.au
    public final void C() {
        this.f0 = true;
        bv9 bv9Var = this.c0;
        bv9Var.h();
        boolean z = this.a0;
        ev9 ev9Var = this.J;
        if (z) {
            wwb wwbVarM = ev9Var.a.M();
            Object[] objArr = wwbVarM.E;
            int i = wwbVarM.G;
            for (int i2 = 0; i2 < i; i2++) {
                av9 av9Var = (av9) objArr[i2];
                if (av9Var.B() && av9Var.C() == xu9.E && av9.o0(av9Var)) {
                    av9.v0(ev9Var.a, false, 7);
                }
            }
        }
        if (this.b0 || (!this.Q && !d().O && this.a0)) {
            this.a0 = false;
            vu9 vu9Var = ev9Var.d;
            ev9Var.d = vu9.G;
            ev9Var.g(false);
            av9 av9Var2 = ev9Var.a;
            omc snapshotObserver = dv9.a(av9Var2).getSnapshotObserver();
            snapshotObserver.a.d(av9Var2, snapshotObserver.e, this.i0);
            ev9Var.d = vu9Var;
            this.b0 = false;
        }
        if (bv9Var.d) {
            bv9Var.e = true;
        }
        if (bv9Var.b && bv9Var.e()) {
            bv9Var.g();
        }
        this.f0 = false;
    }

    @Override // defpackage.au
    public final void F(e0 e0Var) throws IOException {
        wwb wwbVarM = this.J.a.M();
        Object[] objArr = wwbVarM.E;
        int i = wwbVarM.G;
        for (int i2 = 0; i2 < i; i2++) {
            e0Var.invoke(((av9) objArr[i2]).t().p);
        }
    }

    @Override // defpackage.au
    public final void N() {
        av9.v0(this.J.a, false, 7);
    }

    @Override // defpackage.h5b
    public final int Q(int i) {
        ev9 ev9Var = this.J;
        if (!fd9.g0(ev9Var.a)) {
            l0();
            return ev9Var.a().Q(i);
        }
        lma lmaVar = ev9Var.q;
        lmaVar.getClass();
        return lmaVar.Q(i);
    }

    @Override // defpackage.c3d
    public final int R(ut utVar) {
        ev9 ev9Var = this.J;
        av9 av9VarG = ev9Var.a.G();
        vu9 vu9VarW = av9VarG != null ? av9VarG.w() : null;
        vu9 vu9Var = vu9.E;
        bv9 bv9Var = this.c0;
        if (vu9VarW == vu9Var) {
            bv9Var.c = true;
        } else {
            av9 av9VarG2 = ev9Var.a.G();
            if ((av9VarG2 != null ? av9VarG2.w() : null) == vu9.G) {
                bv9Var.d = true;
            }
        }
        this.Q = true;
        int iR = ev9Var.a().R(utVar);
        this.Q = false;
        return iR;
    }

    @Override // defpackage.c3d
    public final int S() {
        return this.J.a().S();
    }

    @Override // defpackage.c3d
    public final int X() {
        return this.J.a().X();
    }

    @Override // defpackage.c3d
    public final void Z(long j, float f, bz7 bz7Var) throws Throwable {
        u0(j, f, bz7Var, null);
    }

    @Override // defpackage.h5b
    public final int a(int i) {
        ev9 ev9Var = this.J;
        if (!fd9.g0(ev9Var.a)) {
            l0();
            return ev9Var.a().a(i);
        }
        lma lmaVar = ev9Var.q;
        lmaVar.getClass();
        return lmaVar.a(i);
    }

    @Override // defpackage.c3d
    public final void a0(long j, float f, ja8 ja8Var) throws Throwable {
        u0(j, f, null, ja8Var);
    }

    @Override // defpackage.au
    public final bv9 c() {
        return this.c0;
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
        return ev9VarT.p;
    }

    public final List f0() {
        ev9 ev9Var = this.J;
        ev9Var.a.F0();
        boolean z = this.e0;
        wwb wwbVar = this.d0;
        if (!z) {
            return wwbVar.g();
        }
        av9 av9Var = ev9Var.a;
        wwb wwbVarM = av9Var.M();
        Object[] objArr = wwbVarM.E;
        int i = wwbVarM.G;
        for (int i2 = 0; i2 < i; i2++) {
            av9 av9Var2 = (av9) objArr[i2];
            if (wwbVar.G <= i2) {
                wwbVar.b(av9Var2.t().p);
            } else {
                n5b n5bVar = av9Var2.t().p;
                Object[] objArr2 = wwbVar.E;
                Object obj = objArr2[i2];
                objArr2[i2] = n5bVar;
            }
        }
        wwbVar.o(((vwb) av9Var.q()).E.G, wwbVar.G);
        this.e0 = false;
        return wwbVar.g();
    }

    public final void i0() {
        boolean z = this.X;
        this.X = true;
        ev9 ev9Var = this.J;
        av9 av9Var = ev9Var.a;
        g5c g5cVar = av9Var.k0;
        if (!z) {
            ((z39) g5cVar.H).s1();
            dv9.a(av9Var).getRectManager().f(ev9Var.a);
            if (av9Var.B()) {
                av9.v0(av9Var, true, 6);
            } else if (av9Var.y()) {
                av9.t0(av9Var, true, 6);
            }
        }
        m5c m5cVar = ((z39) g5cVar.H).V;
        for (m5c m5cVar2 = (m5c) g5cVar.I; !x44.r(m5cVar2, m5cVar) && m5cVar2 != null; m5cVar2 = m5cVar2.V) {
            if (m5cVar2.q0) {
                m5cVar2.o1();
            }
        }
        wwb wwbVarM = av9Var.M();
        Object[] objArr = wwbVarM.E;
        int i = wwbVarM.G;
        for (int i2 = 0; i2 < i; i2++) {
            av9 av9Var2 = (av9) objArr[i2];
            if (av9Var2.H() != Integer.MAX_VALUE) {
                av9Var2.A().i0();
                av9.w0(av9Var2);
            }
        }
    }

    public final void j0() {
        if (this.X) {
            this.X = false;
            ev9 ev9Var = this.J;
            av9 av9Var = ev9Var.a;
            av9 av9Var2 = ev9Var.a;
            dv9.a(av9Var).getRectManager().g(av9Var2);
            g5c g5cVar = av9Var2.k0;
            m5c m5cVar = ((z39) g5cVar.H).V;
            for (m5c m5cVar2 = (m5c) g5cVar.I; !x44.r(m5cVar2, m5cVar) && m5cVar2 != null; m5cVar2 = m5cVar2.V) {
                m5cVar2.u1();
                m5cVar2.z1();
            }
            wwb wwbVarM = av9Var2.M();
            Object[] objArr = wwbVarM.E;
            int i = wwbVarM.G;
            for (int i2 = 0; i2 < i; i2++) {
                ((av9) objArr[i2]).A().j0();
            }
        }
    }

    @Override // defpackage.h5b
    public final int l(int i) {
        ev9 ev9Var = this.J;
        if (!fd9.g0(ev9Var.a)) {
            l0();
            return ev9Var.a().l(i);
        }
        lma lmaVar = ev9Var.q;
        lmaVar.getClass();
        return lmaVar.l(i);
    }

    public final void l0() {
        ev9 ev9Var = this.J;
        av9.v0(ev9Var.a, false, 7);
        av9 av9Var = ev9Var.a;
        av9 av9VarG = av9Var.G();
        if (av9VarG == null || av9Var.h0 != xu9.G) {
            return;
        }
        int iOrdinal = av9VarG.w().ordinal();
        av9Var.h0 = iOrdinal != 0 ? iOrdinal != 2 ? av9VarG.h0 : xu9.F : xu9.E;
    }

    @Override // defpackage.au
    public final int m() {
        return this.M;
    }

    @Override // defpackage.h5b
    public final int o(int i) {
        ev9 ev9Var = this.J;
        if (!fd9.g0(ev9Var.a)) {
            l0();
            return ev9Var.a().o(i);
        }
        lma lmaVar = ev9Var.q;
        lmaVar.getClass();
        return lmaVar.o(i);
    }

    public final void o0() {
        this.k0 = true;
        ev9 ev9Var = this.J;
        av9 av9VarG = ev9Var.a.G();
        float f = d().g0;
        av9 av9Var = ev9Var.a;
        g5c g5cVar = av9Var.k0;
        m5c m5cVar = (m5c) g5cVar.I;
        z39 z39Var = (z39) g5cVar.H;
        while (m5cVar != z39Var) {
            m5cVar.getClass();
            su9 su9Var = (su9) m5cVar;
            f += su9Var.g0;
            m5cVar = su9Var.V;
        }
        if (f != this.j0) {
            this.j0 = f;
            if (av9VarG != null) {
                av9VarG.l0();
            }
            if (av9VarG != null) {
                av9VarG.Q();
            }
        }
        if (!d().O) {
            boolean z = this.X;
            if (!z || this.c0.d()) {
                i0();
            }
            if (z) {
                ((z39) av9Var.k0.H).s1();
            } else {
                if (av9VarG != null) {
                    av9VarG.Q();
                }
                if (this.K && av9VarG != null) {
                    av9VarG.u0(false);
                }
            }
        }
        if (av9VarG == null) {
            this.M = 0;
        } else if (!this.K && av9VarG.w() == vu9.G) {
            if (this.M != Integer.MAX_VALUE) {
                b39.c("Place was called on a node which was placed already");
            }
            this.M = av9VarG.t().i;
            av9VarG.t().i++;
        }
        C();
    }

    @Override // defpackage.au
    public final void requestLayout() {
        this.J.a.u0(false);
    }

    public final void s0(long j, float f, bz7 bz7Var, ja8 ja8Var) {
        ev9 ev9Var = this.J;
        av9 av9Var = ev9Var.a;
        av9 av9Var2 = ev9Var.a;
        if (av9Var.u0) {
            b39.a("place is called on a deactivated node");
        }
        ev9Var.d = vu9.G;
        this.R = j;
        this.U = f;
        this.S = bz7Var;
        this.T = ja8Var;
        this.k0 = false;
        Owner ownerA = dv9.a(av9Var2);
        if (this.a0 || !this.X) {
            this.c0.g = false;
            ev9Var.f(false);
            this.l0 = bz7Var;
            this.n0 = j;
            this.o0 = f;
            this.m0 = ja8Var;
            omc snapshotObserver = ownerA.getSnapshotObserver();
            snapshotObserver.a.d(av9Var2, snapshotObserver.f, this.p0);
        } else {
            m5c m5cVarA = ev9Var.a();
            m5cVarA.x1(y69.d(j, m5cVarA.I), f, bz7Var, ja8Var);
            o0();
        }
        ev9Var.d = vu9.I;
        if (ev9Var.a().O && (ev9Var.k || ev9Var.j)) {
            requestLayout();
        }
        this.O = true;
    }

    @Override // defpackage.h5b
    public final c3d u(long j) throws Throwable {
        xu9 xu9Var;
        ev9 ev9Var = this.J;
        av9 av9Var = ev9Var.a;
        av9 av9Var2 = ev9Var.a;
        xu9 xu9Var2 = av9Var.h0;
        xu9 xu9Var3 = xu9.G;
        if (xu9Var2 == xu9Var3) {
            av9Var.e();
        }
        if (fd9.g0(av9Var2)) {
            lma lmaVar = ev9Var.q;
            lmaVar.getClass();
            lmaVar.N = xu9Var3;
            lmaVar.u(j);
        }
        av9 av9VarG = av9Var2.G();
        if (av9VarG != null) {
            if (this.P != xu9Var3 && !av9Var2.j0) {
                b39.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = av9VarG.w().ordinal();
            if (iOrdinal == 0) {
                xu9Var = xu9.E;
            } else {
                if (iOrdinal != 2) {
                    xh6.n("Measurable could be only measured from the parent's measure or layout block. Parents state is ", av9VarG.w());
                    return null;
                }
                xu9Var = xu9.F;
            }
            this.P = xu9Var;
        } else {
            this.P = xu9Var3;
        }
        v0(j);
        return this;
    }

    public final void u0(long j, float f, bz7 bz7Var, ja8 ja8Var) throws Throwable {
        b3d placementScope;
        ev9 ev9Var = this.J;
        av9 av9Var = ev9Var.a;
        av9 av9Var2 = ev9Var.a;
        try {
            this.Y = true;
            if (!y69.b(j, this.R) || bz7Var != this.S || this.q0) {
                if (ev9Var.k || ev9Var.j || this.q0) {
                    this.a0 = true;
                    this.q0 = false;
                }
            }
            lma lmaVar = ev9Var.q;
            if (lmaVar != null) {
                ev9 ev9Var2 = lmaVar.J;
                if (lmaVar.V == jma.G && !fd9.g0(ev9Var2.a)) {
                    ev9Var2.c = true;
                }
            }
            lma lmaVar2 = ev9Var.q;
            if (lmaVar2 != null && lmaVar2.f0()) {
                m5c m5cVar = ev9Var.a().W;
                if (m5cVar == null || (placementScope = m5cVar.P) == null) {
                    placementScope = dv9.a(av9Var2).getPlacementScope();
                }
                lma lmaVar3 = ev9Var.q;
                lmaVar3.getClass();
                av9 av9VarG = av9Var2.G();
                if (av9VarG != null) {
                    av9VarG.t().h = 0;
                }
                lmaVar3.M = Integer.MAX_VALUE;
                placementScope.f(lmaVar3, (int) (j >> 32), (int) (4294967295L & j), MTTypesetterKt.kLineSkipLimitMultiplier);
            }
            lma lmaVar4 = ev9Var.q;
            if (lmaVar4 != null && !lmaVar4.P) {
                b39.c("Error: Placement happened before lookahead.");
            }
            s0(j, f, bz7Var, ja8Var);
        } catch (Throwable th) {
            av9Var.y0(th);
            throw null;
        }
    }

    public final boolean v0(long j) throws Throwable {
        ev9 ev9Var = this.J;
        av9 av9Var = ev9Var.a;
        av9 av9Var2 = ev9Var.a;
        try {
            if (av9Var.u0) {
                b39.a("measure is called on a deactivated node");
            }
            Owner ownerA = dv9.a(av9Var2);
            av9 av9VarG = av9Var2.G();
            boolean z = true;
            av9Var2.j0 = av9Var2.j0 || (av9VarG != null && av9VarG.j0);
            if (!av9Var2.B() && rl4.b(this.H, j)) {
                ((AndroidComposeView) ownerA).k(av9Var2, false);
                av9Var2.x0();
                return false;
            }
            this.c0.f = false;
            wwb wwbVarM = av9Var2.M();
            Object[] objArr = wwbVarM.E;
            int i = wwbVarM.G;
            for (int i2 = 0; i2 < i; i2++) {
                ((av9) objArr[i2]).t().p.c0.c = false;
            }
            this.N = true;
            long j2 = ev9Var.a().G;
            d0(j);
            vu9 vu9Var = ev9Var.d;
            vu9 vu9Var2 = vu9.I;
            if (vu9Var != vu9Var2) {
                b39.c("layout state is not idle before measure starts");
            }
            this.g0 = j;
            vu9 vu9Var3 = vu9.E;
            ev9Var.d = vu9Var3;
            this.Z = false;
            omc snapshotObserver = dv9.a(av9Var2).getSnapshotObserver();
            snapshotObserver.a.d(av9Var2, snapshotObserver.c, this.h0);
            if (ev9Var.d == vu9Var3) {
                this.a0 = true;
                this.b0 = true;
                ev9Var.d = vu9Var2;
            }
            if (g79.b(ev9Var.a().G, j2) && ev9Var.a().E == this.E && ev9Var.a().F == this.F) {
                z = false;
            }
            b0((((long) ev9Var.a().F) & 4294967295L) | (((long) ev9Var.a().E) << 32));
            return z;
        } catch (Throwable th) {
            av9Var.y0(th);
            throw null;
        }
    }

    public final void x0() {
        ev9 ev9Var = this.J;
        av9 av9Var = ev9Var.a;
        av9 av9Var2 = ev9Var.a;
        if (!av9Var.Y() || ev9Var.l <= 0) {
            return;
        }
        ev9 ev9VarT = av9Var2.t();
        if ((ev9VarT.j || ev9VarT.k) && !ev9VarT.p.a0) {
            av9Var2.u0(false);
        }
        wwb wwbVarM = av9Var2.M();
        Object[] objArr = wwbVarM.E;
        int i = wwbVarM.G;
        for (int i2 = 0; i2 < i; i2++) {
            ((av9) objArr[i2]).A().x0();
        }
    }

    @Override // defpackage.c3d, defpackage.h5b
    public final Object z() {
        return this.W;
    }
}
