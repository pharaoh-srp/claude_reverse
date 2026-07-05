package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class hpa extends hqb implements r78, vd6, ujf, lbc {
    public bz7 S;
    public bz7 T;
    public d5d a0;
    public View b0;
    public cz5 c0;
    public c5d d0;
    public wz5 f0;
    public g79 h0;
    public zy1 i0;
    public float U = Float.NaN;
    public boolean V = true;
    public long W = 9205357640488583168L;
    public float X = Float.NaN;
    public float Y = Float.NaN;
    public boolean Z = true;
    public final lsc e0 = new lsc(null, ql8.J);
    public long g0 = 9205357640488583168L;

    public hpa(bz7 bz7Var, bz7 bz7Var2, d5d d5dVar) {
        this.S = bz7Var;
        this.T = bz7Var2;
        this.a0 = d5dVar;
    }

    @Override // defpackage.lbc
    public final void F0() {
        d4c.a0(this, new gpa(this, 0));
    }

    @Override // defpackage.vd6
    public final void I0(cv9 cv9Var) {
        cv9Var.a();
        zy1 zy1Var = this.i0;
        if (zy1Var != null) {
            zy1Var.r(iei.a);
        }
    }

    @Override // defpackage.ujf
    public final void X0(ekf ekfVar) {
        ekfVar.a(ipa.a, new gpa(this, 1));
    }

    @Override // defpackage.hqb
    public final void h1() {
        F0();
        this.i0 = wd6.P(0, 7, null);
        gb9.D(d1(), null, o45.H, new fj(this, null, 20), 1);
    }

    @Override // defpackage.hqb
    public final void i1() {
        c5d c5dVar = this.d0;
        if (c5dVar != null) {
            ((e5d) c5dVar).b();
        }
        this.d0 = null;
    }

    @Override // defpackage.r78
    public final void o0(m5c m5cVar) {
        this.e0.setValue(m5cVar);
    }

    public final long p1() {
        if (this.f0 == null) {
            this.f0 = mpk.w(new xi4(28, this));
        }
        wz5 wz5Var = this.f0;
        if (wz5Var != null) {
            return ((fcc) wz5Var.getValue()).a;
        }
        return 9205357640488583168L;
    }

    public final void q1() {
        c5d c5dVar = this.d0;
        if (c5dVar != null) {
            ((e5d) c5dVar).b();
        }
        View viewQ = this.b0;
        if (viewQ == null) {
            viewQ = eve.Q(this);
        }
        View view = viewQ;
        this.b0 = view;
        cz5 cz5Var = this.c0;
        if (cz5Var == null) {
            cz5Var = yfd.W(this).d0;
        }
        cz5 cz5Var2 = cz5Var;
        this.c0 = cz5Var2;
        this.d0 = this.a0.b(view, this.V, this.W, this.X, this.Y, this.Z, cz5Var2, this.U);
        s1();
    }

    public final void r1() {
        cz5 cz5Var = this.c0;
        if (cz5Var == null) {
            cz5Var = yfd.W(this).d0;
            this.c0 = cz5Var;
        }
        long j = ((fcc) this.S.invoke(cz5Var)).a;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & p1()) == 9205357640488583168L) {
            this.g0 = 9205357640488583168L;
            c5d c5dVar = this.d0;
            if (c5dVar != null) {
                ((e5d) c5dVar).b();
                return;
            }
            return;
        }
        this.g0 = fcc.i(p1(), j);
        if (this.d0 == null) {
            q1();
        }
        c5d c5dVar2 = this.d0;
        if (c5dVar2 != null) {
            c5dVar2.a(this.U, this.g0, 9205357640488583168L);
        }
        s1();
    }

    public final void s1() {
        cz5 cz5Var;
        c5d c5dVar = this.d0;
        if (c5dVar == null || (cz5Var = this.c0) == null) {
            return;
        }
        e5d e5dVar = (e5d) c5dVar;
        if (g79.a(e5dVar.c(), this.h0)) {
            return;
        }
        bz7 bz7Var = this.T;
        if (bz7Var != null) {
            bz7Var.invoke(new za6(cz5Var.s(csg.T(e5dVar.c()))));
        }
        this.h0 = new g79(e5dVar.c());
    }
}
