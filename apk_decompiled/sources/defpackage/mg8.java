package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class mg8 extends hqb implements oe4, r78, yt9, vd6, p6i, lbc {
    public final bg8 S;
    public ng8 T;
    public fkg U;

    public mg8(ng8 ng8Var) {
        ng8Var.getClass();
        bg8 bg8Var = new bg8();
        this.S = bg8Var;
        bg8Var.c.i(MTTypesetterKt.kLineSkipLimitMultiplier);
        this.T = ng8Var;
    }

    @Override // defpackage.lbc
    public final void F0() {
        d4c.a0(this, new dg8(1, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:3:0x0004, B:7:0x0010, B:9:0x0020, B:11:0x002e, B:20:0x0042, B:19:0x0039, B:21:0x004e), top: B:25:0x0004 }] */
    @Override // defpackage.vd6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I0(defpackage.cv9 r6) {
        /*
            r5 = this;
            bg8 r0 = r5.S
            r1 = 1
            r2 = 0
            r0.g = r1     // Catch: java.lang.Throwable -> L37
            boolean r3 = r5.R     // Catch: java.lang.Throwable -> L37
            if (r3 != 0) goto L10
        La:
            r0.g = r2
            r5.p1()
            return
        L10:
            ib2 r3 = r6.E     // Catch: java.lang.Throwable -> L37
            long r3 = r3.g()     // Catch: java.lang.Throwable -> L37
            float r3 = defpackage.k8g.d(r3)     // Catch: java.lang.Throwable -> L37
            int r3 = defpackage.mwa.L(r3)     // Catch: java.lang.Throwable -> L37
            if (r3 < r1) goto L4e
            umg r1 = defpackage.ve4.g     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = defpackage.yb5.o(r5, r1)     // Catch: java.lang.Throwable -> L37
            ga8 r1 = (defpackage.ga8) r1     // Catch: java.lang.Throwable -> L37
            ja8 r3 = r0.a()     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L39
            boolean r4 = r3.s     // Catch: java.lang.Throwable -> L37
            if (r4 != 0) goto L33
            goto L34
        L33:
            r3 = 0
        L34:
            if (r3 == 0) goto L39
            goto L42
        L37:
            r6 = move-exception
            goto L52
        L39:
            ja8 r3 = r1.c()     // Catch: java.lang.Throwable -> L37
            lsc r1 = r0.f     // Catch: java.lang.Throwable -> L37
            r1.setValue(r3)     // Catch: java.lang.Throwable -> L37
        L42:
            a2 r1 = new a2     // Catch: java.lang.Throwable -> L37
            r1.<init>(r6, r3)     // Catch: java.lang.Throwable -> L37
            defpackage.xd6.Q0(r6, r3, r1)     // Catch: java.lang.Throwable -> L37
            defpackage.csg.t(r6, r3)     // Catch: java.lang.Throwable -> L37
            goto La
        L4e:
            defpackage.u00.n(r6)     // Catch: java.lang.Throwable -> L37
            goto La
        L52:
            r0.g = r2
            r5.p1()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mg8.I0(cv9):void");
    }

    @Override // defpackage.hqb
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.hqb
    public final void h1() {
        tp4 tp4Var;
        ba4 ba4Var;
        ng8 ng8Var = this.T;
        ng8Var.getClass();
        bg8 bg8Var = this.S;
        bg8Var.getClass();
        ng8Var.a.add(bg8Var);
        Context baseContext = (Context) yb5.o(this, w00.b);
        while (true) {
            tp4Var = null;
            if (!(baseContext instanceof ba4)) {
                if (!(baseContext instanceof ContextWrapper)) {
                    ba4Var = null;
                    break;
                } else {
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    baseContext.getClass();
                }
            } else {
                ba4Var = (ba4) baseContext;
                break;
            }
        }
        if (ba4Var != null) {
            gb9.D(d1(), null, null, new dx(ba4Var, this, tp4Var, 28), 3);
        }
        F0();
    }

    @Override // defpackage.hqb
    public final void i1() {
        bg8 bg8Var = this.S;
        grc.x(9205357640488583168L, bg8Var.a);
        bg8Var.b.setValue(new k8g(9205357640488583168L));
        bg8Var.g = false;
        ja8 ja8VarA = bg8Var.a();
        if (ja8VarA != null) {
            ((ga8) yb5.o(this, ve4.g)).a(ja8VarA);
        }
        bg8Var.f.setValue(null);
        ng8 ng8Var = this.T;
        ng8Var.getClass();
        ng8Var.a.remove(bg8Var);
    }

    @Override // defpackage.hqb
    public final void j1() {
        bg8 bg8Var = this.S;
        grc.x(9205357640488583168L, bg8Var.a);
        bg8Var.b.setValue(new k8g(9205357640488583168L));
        bg8Var.g = false;
    }

    @Override // defpackage.yt9
    public final void n(cu9 cu9Var) {
        bg8 bg8Var = this.S;
        cu9Var.getClass();
        rcg rcgVarZ = fd9.Z();
        bz7 bz7VarE = rcgVarZ != null ? rcgVarZ.e() : null;
        rcg rcgVarK0 = fd9.k0(rcgVarZ);
        try {
            if ((bg8Var.b() & 9223372034707292159L) == 9205357640488583168L && this.R) {
                bg8Var.a.setValue(new fcc(cu9Var.q(0L)));
                bg8Var.b.setValue(new k8g(csg.T(cu9Var.k())));
                bg8Var.d = ((View) yb5.o(this, w00.f)).getWindowId();
            }
        } finally {
            fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
        }
    }

    @Override // defpackage.p6i
    public final Object o() {
        return rg8.F;
    }

    @Override // defpackage.r78
    public final void o0(m5c m5cVar) {
        if (this.R) {
            long jQ = m5cVar.q(0L);
            bg8 bg8Var = this.S;
            bg8Var.a.setValue(new fcc(jQ));
            bg8Var.b.setValue(new k8g(csg.T(m5cVar.k())));
            bg8Var.d = ((View) yb5.o(this, w00.f)).getWindowId();
        }
    }

    public final fkg p1() {
        return gb9.D(d1(), null, null, new fj(this, null, 13), 3);
    }
}
