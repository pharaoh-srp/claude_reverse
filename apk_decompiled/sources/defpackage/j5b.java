package defpackage;

import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public final class j5b {
    public final av9 a;
    public boolean c;
    public boolean d;
    public rl4 i;
    public final fj0 b = new fj0(18);
    public final q28 e = new q28(19);
    public final wwb f = new wwb(0, new av9[16]);
    public final long g = 1;
    public final wwb h = new wwb(0, new i5b[16]);

    public j5b(av9 av9Var) {
        this.a = av9Var;
    }

    public static final boolean a(j5b j5bVar, av9 av9Var, boolean z) {
        rl4 rl4Var;
        av9 av9VarG;
        av9 av9Var2 = j5bVar.a;
        if (!av9Var.u0 && l(av9Var)) {
            if (av9Var == av9Var2) {
                rl4Var = j5bVar.i;
                rl4Var.getClass();
            } else {
                rl4Var = null;
            }
            if (z) {
                zE = av9Var.y() ? d(av9Var, rl4Var) : false;
                if ((zE || av9Var.x()) && x44.r(av9Var.a0(), Boolean.TRUE)) {
                    av9Var.d0();
                }
            } else {
                zE = av9Var.B() ? e(av9Var, rl4Var) : false;
                if (av9Var.u() && (av9Var == av9Var2 || ((av9VarG = av9Var.G()) != null && av9VarG.Y() && av9Var.Z()))) {
                    if (av9Var == av9Var2) {
                        av9Var.m0();
                    } else {
                        av9Var.r0();
                    }
                    q28 q28Var = j5bVar.e;
                    q28Var.getClass();
                    if (av9Var.t0 > 0) {
                        ((wwb) q28Var.F).b(av9Var);
                        av9Var.s0 = true;
                    }
                }
            }
            j5bVar.f();
        }
        return zE;
    }

    public static boolean d(av9 av9Var, rl4 rl4Var) {
        if (av9Var.M == null) {
            return false;
        }
        boolean zB0 = rl4Var != null ? av9Var.b0(rl4Var) : av9.c0(av9Var);
        av9 av9VarG = av9Var.G();
        if (zB0 && av9VarG != null) {
            if (av9VarG.M == null) {
                av9.v0(av9VarG, false, 3);
                return zB0;
            }
            if (av9Var.D() == xu9.E) {
                av9.t0(av9VarG, false, 3);
                return zB0;
            }
            if (av9Var.D() == xu9.F) {
                av9VarG.s0(false);
            }
        }
        return zB0;
    }

    public static boolean e(av9 av9Var, rl4 rl4Var) {
        boolean zN0 = rl4Var != null ? av9Var.n0(rl4Var) : av9.o0(av9Var);
        av9 av9VarG = av9Var.G();
        if (zN0 && av9VarG != null) {
            if (av9Var.C() == xu9.E) {
                av9.v0(av9VarG, false, 3);
                return zN0;
            }
            if (av9Var.C() == xu9.F) {
                av9VarG.u0(false);
            }
        }
        return zN0;
    }

    public static boolean j(av9 av9Var) {
        lma lmaVar;
        bv9 bv9Var;
        if (av9Var.y()) {
            return (av9Var.D() == xu9.G && ((lmaVar = av9Var.t().q) == null || (bv9Var = lmaVar.W) == null || !bv9Var.e())) ? false : true;
        }
        return false;
    }

    public static boolean k(av9 av9Var) {
        if (!av9Var.B()) {
            return false;
        }
        do {
            if (av9Var.C() == xu9.G && !av9Var.t().p.c0.e()) {
                av9 av9VarG = av9Var.G();
                if ((av9VarG != null ? av9VarG.w() : null) != vu9.E) {
                    return false;
                }
            }
            av9Var = av9Var.G();
            if (av9Var == null) {
                return false;
            }
        } while (!av9Var.Y());
        return true;
    }

    public static boolean l(av9 av9Var) {
        return av9Var.Y() || av9Var.Z() || k(av9Var) || x44.r(av9Var.a0(), Boolean.TRUE) || j(av9Var) || av9Var.n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [wwb] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [wwb] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v2, types: [hqb] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [hqb] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final void b() {
        hqb hqbVar;
        wwb wwbVar = this.f;
        Object[] objArr = wwbVar.E;
        int i = wwbVar.G;
        for (int i2 = 0; i2 < i; i2++) {
            g5c g5cVar = ((av9) objArr[i2]).k0;
            z39 z39Var = (z39) g5cVar.H;
            boolean zG = s5c.g(4194304);
            if (zG) {
                hqbVar = z39Var.y0;
            } else {
                hqbVar = z39Var.y0.I;
                if (hqbVar == null) {
                }
            }
            xre xreVar = m5c.t0;
            for (hqb hqbVarJ1 = z39Var.j1(zG); hqbVarJ1 != null && (hqbVarJ1.H & 4194304) != 0; hqbVarJ1 = hqbVarJ1.J) {
                if ((hqbVarJ1.G & 4194304) != 0) {
                    ?? J = hqbVarJ1;
                    ?? wwbVar2 = 0;
                    while (J != 0) {
                        if (J instanceof yt9) {
                            ((yt9) J).n((z39) g5cVar.H);
                        } else if ((J.G & 4194304) != 0 && (J instanceof qw5)) {
                            hqb hqbVar2 = ((qw5) J).T;
                            int i3 = 0;
                            J = J;
                            wwbVar2 = wwbVar2;
                            while (hqbVar2 != null) {
                                if ((hqbVar2.G & 4194304) != 0) {
                                    i3++;
                                    wwbVar2 = wwbVar2;
                                    if (i3 == 1) {
                                        J = hqbVar2;
                                    } else {
                                        if (wwbVar2 == 0) {
                                            wwbVar2 = new wwb(0, new hqb[16]);
                                        }
                                        if (J != 0) {
                                            wwbVar2.b(J);
                                            J = 0;
                                        }
                                        wwbVar2.b(hqbVar2);
                                    }
                                }
                                hqbVar2 = hqbVar2.J;
                                J = J;
                                wwbVar2 = wwbVar2;
                            }
                            if (i3 == 1) {
                            }
                        }
                        J = yfd.j(wwbVar2);
                    }
                }
                if (hqbVarJ1 != hqbVar) {
                }
            }
        }
        wwbVar.h();
    }

    public final void c(boolean z) {
        q28 q28Var = this.e;
        if (z) {
            wwb wwbVar = (wwb) q28Var.F;
            av9 av9Var = this.a;
            if (av9Var.t0 > 0) {
                wwbVar.h();
                wwbVar.b(av9Var);
                av9Var.s0 = true;
            }
        }
        if (((wwb) q28Var.F).G != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                q28Var.k();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void f() {
        wwb wwbVar = this.h;
        int i = wwbVar.G;
        if (i != 0) {
            Object[] objArr = wwbVar.E;
            for (int i2 = 0; i2 < i; i2++) {
                i5b i5bVar = (i5b) objArr[i2];
                if (i5bVar.a.X()) {
                    boolean z = i5bVar.b;
                    av9 av9Var = i5bVar.a;
                    boolean z2 = i5bVar.c;
                    if (z) {
                        av9.t0(av9Var, z2, 2);
                    } else {
                        av9.v0(av9Var, z2, 2);
                    }
                }
            }
            wwbVar.h();
        }
    }

    public final void g(av9 av9Var) {
        wwb wwbVarM = av9Var.M();
        Object[] objArr = wwbVarM.E;
        int i = wwbVarM.G;
        for (int i2 = 0; i2 < i; i2++) {
            av9 av9Var2 = (av9) objArr[i2];
            if (x44.r(av9Var2.a0(), Boolean.TRUE) && !av9Var2.u0) {
                if (this.b.k(av9Var2)) {
                    av9Var2.d0();
                }
                g(av9Var2);
            }
        }
    }

    public final void h(av9 av9Var, boolean z) {
        if (!this.c) {
            b39.c("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? av9Var.y() : av9Var.B()) {
            b39.a("node not yet measured");
        }
        i(av9Var, z);
    }

    public final void i(av9 av9Var, boolean z) {
        lma lmaVar;
        bv9 bv9Var;
        wwb wwbVarM = av9Var.M();
        Object[] objArr = wwbVarM.E;
        int i = wwbVarM.G;
        for (int i2 = 0; i2 < i; i2++) {
            av9 av9Var2 = (av9) objArr[i2];
            xu9 xu9Var = xu9.E;
            if ((!z && (av9Var2.C() == xu9Var || av9Var2.t().p.c0.e())) || (z && (av9Var2.D() == xu9Var || ((lmaVar = av9Var2.t().q) != null && (bv9Var = lmaVar.W) != null && bv9Var.e())))) {
                if (fd9.g0(av9Var2) && !z) {
                    if (av9Var2.y() && this.b.k(av9Var2)) {
                        p(av9Var2, true);
                    } else {
                        h(av9Var2, true);
                    }
                }
                if (z ? av9Var2.y() : av9Var2.B()) {
                    p(av9Var2, z);
                }
                if (!(z ? av9Var2.y() : av9Var2.B())) {
                    i(av9Var2, z);
                }
            }
        }
        if (z ? av9Var.y() : av9Var.B()) {
            p(av9Var, z);
        }
    }

    public final boolean m(wz wzVar) {
        boolean z;
        boolean z2;
        av9 av9Var;
        boolean z3;
        boolean zP;
        fj0 fj0Var = this.b;
        av9 av9Var2 = this.a;
        if (!av9Var2.X()) {
            b39.a("performMeasureAndLayout called with unattached root");
        }
        if (!av9Var2.Y()) {
            b39.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            b39.a("performMeasureAndLayout called during measure layout");
        }
        boolean z4 = false;
        if (this.i != null) {
            this.c = true;
            this.d = true;
            try {
                boolean z5 = fj0Var.z();
                tk5 tk5Var = (tk5) fj0Var.E;
                if (z5) {
                    z = false;
                    while (true) {
                        tk5 tk5Var2 = (tk5) fj0Var.G;
                        tk5 tk5Var3 = (tk5) fj0Var.F;
                        if (!((keg) tk5Var.F).isEmpty()) {
                            av9Var = (av9) ((keg) tk5Var.F).first();
                            tk5Var.p(av9Var);
                            z3 = av9Var.M != null;
                            z2 = false;
                        } else if (!((keg) tk5Var3.F).isEmpty()) {
                            av9Var = (av9) ((keg) tk5Var3.F).first();
                            tk5Var3.p(av9Var);
                            z3 = av9Var.M != null;
                            z2 = true;
                        } else {
                            if (((keg) tk5Var2.F).isEmpty()) {
                                break;
                            }
                            av9 av9Var3 = (av9) ((keg) tk5Var2.F).first();
                            tk5Var2.p(av9Var3);
                            z2 = true;
                            av9Var = av9Var3;
                            z3 = false;
                        }
                        if (z2) {
                            zP = a(this, av9Var, z3);
                        } else {
                            zP = p(av9Var, z3);
                            if (av9Var.x()) {
                                fj0Var.b(av9Var, sb9.F);
                            }
                            if (av9Var.u()) {
                                fj0Var.b(av9Var, sb9.H);
                            }
                        }
                        if (av9Var == av9Var2 && zP) {
                            z = true;
                        }
                    }
                    if (wzVar != null) {
                        wzVar.a();
                    }
                } else {
                    z = false;
                }
                this.c = false;
                this.d = false;
                z4 = z;
            } finally {
            }
        }
        b();
        return z4;
    }

    public final void n(av9 av9Var, long j) {
        if (av9Var.u0) {
            return;
        }
        av9 av9Var2 = this.a;
        if (av9Var == av9Var2) {
            b39.a("measureAndLayout called on root");
        }
        if (!av9Var2.X()) {
            b39.a("performMeasureAndLayout called with unattached root");
        }
        if (!av9Var2.Y()) {
            b39.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            b39.a("performMeasureAndLayout called during measure layout");
        }
        if (this.i != null) {
            this.c = true;
            this.d = false;
            try {
                fj0 fj0Var = this.b;
                ((tk5) fj0Var.E).p(av9Var);
                ((tk5) fj0Var.F).p(av9Var);
                ((tk5) fj0Var.G).p(av9Var);
                if (d(av9Var, new rl4(j)) || av9Var.x()) {
                    if (x44.r(av9Var.a0(), Boolean.TRUE)) {
                        av9Var.d0();
                    }
                }
                g(av9Var);
                e(av9Var, new rl4(j));
                if (av9Var.u() && av9Var.Y()) {
                    av9Var.r0();
                    q28 q28Var = this.e;
                    q28Var.getClass();
                    if (av9Var.t0 > 0) {
                        ((wwb) q28Var.F).b(av9Var);
                        av9Var.s0 = true;
                    }
                }
                f();
            } finally {
            }
        }
        b();
    }

    public final void o() {
        fj0 fj0Var = this.b;
        if (fj0Var.z()) {
            av9 av9Var = this.a;
            if (!av9Var.X()) {
                b39.a("performMeasureAndLayout called with unattached root");
            }
            if (!av9Var.Y()) {
                b39.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.c) {
                b39.a("performMeasureAndLayout called during measure layout");
            }
            if (this.i != null) {
                this.c = true;
                this.d = false;
                try {
                    if ((((keg) ((tk5) fj0Var.G).F).isEmpty() || ((keg) ((tk5) fj0Var.E).F).isEmpty()) ? false : true) {
                        if (av9Var.M != null) {
                            r(av9Var, true);
                        } else {
                            q(av9Var);
                        }
                    }
                    r(av9Var, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.c = false;
                        this.d = false;
                    }
                }
            }
        }
    }

    public final boolean p(av9 av9Var, boolean z) {
        rl4 rl4Var;
        boolean zE = false;
        if (!av9Var.u0 && l(av9Var)) {
            if (av9Var == this.a) {
                rl4Var = this.i;
                rl4Var.getClass();
            } else {
                rl4Var = null;
            }
            if (z) {
                if (av9Var.y()) {
                    zE = d(av9Var, rl4Var);
                }
            } else if (av9Var.B()) {
                zE = e(av9Var, rl4Var);
            }
            f();
        }
        return zE;
    }

    public final void q(av9 av9Var) {
        wwb wwbVarM = av9Var.M();
        Object[] objArr = wwbVarM.E;
        int i = wwbVarM.G;
        for (int i2 = 0; i2 < i; i2++) {
            av9 av9Var2 = (av9) objArr[i2];
            if (av9Var2.C() == xu9.E || av9Var2.t().p.c0.e()) {
                if (fd9.g0(av9Var2)) {
                    r(av9Var2, true);
                } else {
                    q(av9Var2);
                }
            }
        }
    }

    public final void r(av9 av9Var, boolean z) {
        rl4 rl4Var;
        if (av9Var.u0) {
            return;
        }
        if (av9Var == this.a) {
            rl4Var = this.i;
            rl4Var.getClass();
        } else {
            rl4Var = null;
        }
        if (z) {
            d(av9Var, rl4Var);
        } else {
            e(av9Var, rl4Var);
        }
    }

    public final boolean s(av9 av9Var, boolean z) {
        int iOrdinal = av9Var.w().ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                this.h.b(new i5b(av9Var, false, z));
            } else {
                if (iOrdinal != 4) {
                    mr9.b();
                    return false;
                }
                if (!av9Var.B() || z) {
                    av9Var.h0();
                    if (!av9Var.u0 && (av9Var.Y() || k(av9Var))) {
                        av9 av9VarG = av9Var.G();
                        if (av9VarG == null || !av9VarG.B()) {
                            this.b.b(av9Var, sb9.G);
                        }
                        if (!this.d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void t(long j) {
        rl4 rl4Var = this.i;
        if (rl4Var == null ? false : rl4.b(rl4Var.a, j)) {
            return;
        }
        if (this.c) {
            b39.a("updateRootConstraints called while measuring");
        }
        this.i = new rl4(j);
        av9 av9Var = this.a;
        if (av9Var.M != null) {
            av9Var.g0();
        }
        av9Var.h0();
        this.b.b(av9Var, av9Var.M != null ? sb9.E : sb9.G);
    }
}
