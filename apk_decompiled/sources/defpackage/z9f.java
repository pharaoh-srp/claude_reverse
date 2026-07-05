package defpackage;

import android.view.KeyEvent;
import android.widget.EdgeEffect;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z9f extends tc6 implements wo9, ujf {
    public b20 n0;
    public eo7 o0;
    public final b0c p0;
    public final ir5 q0;
    public final raf r0;
    public final t9f s0;
    public final jt7 t0;
    public final wn4 u0;
    public a21 v0;
    public y9f w0;
    public isb x0;
    public p4i y0;

    public z9f(b20 b20Var, xx1 xx1Var, eo7 eo7Var, zub zubVar, ukc ukcVar, aaf aafVar, boolean z, boolean z2) {
        super(r9f.a, z, zubVar, ukcVar);
        this.n0 = b20Var;
        this.o0 = eo7Var;
        b0c b0cVar = new b0c();
        this.p0 = b0cVar;
        ir5 ir5Var = new ir5(new zn5(new gmf(r9f.d)));
        this.q0 = ir5Var;
        b20 b20Var2 = this.n0;
        eo7 eo7Var2 = this.o0;
        raf rafVar = new raf(aafVar, b20Var2, eo7Var2 == null ? ir5Var : eo7Var2, ukcVar, z2, b0cVar, this, new u9f(this, 0));
        this.r0 = rafVar;
        t9f t9fVar = new t9f(rafVar, z);
        this.s0 = t9fVar;
        jt7 jt7Var = new jt7(2, 10, null);
        p1(jt7Var);
        this.t0 = jt7Var;
        wn4 wn4Var = new wn4(ukcVar, rafVar, z2, xx1Var, new u9f(this, 1));
        p1(wn4Var);
        this.u0 = wn4Var;
        p1(new f0c(t9fVar, b0cVar));
        ux1 ux1Var = new ux1();
        ux1Var.S = wn4Var;
        p1(ux1Var);
    }

    @Override // defpackage.tc6
    public final void B1(long j) {
    }

    @Override // defpackage.tc6, defpackage.d8d
    public final void C(t7d t7dVar, u7d u7dVar, long j) {
        int i;
        List list = t7dVar.a;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (((Boolean) this.V.invoke(j8d.a(((z7d) list.get(i2)).j()))).booleanValue()) {
                super.C(t7dVar, u7dVar, j);
                break;
            }
            i2++;
        }
        if (this.Y == null) {
            e38 e38VarF = npk.f(this);
            p1(e38VarF);
            this.Y = e38VarF;
        }
        if (this.W) {
            raf rafVar = this.r0;
            u7d u7dVar2 = u7d.E;
            if (u7dVar == u7dVar2 && t7dVar.f == 6) {
                if (this.x0 == null) {
                    this.x0 = new isb(rafVar, mqk.h(this), new v9f(this, 0), yfd.W(this).d0);
                }
                isb isbVar = this.x0;
                if (isbVar != null) {
                    isbVar.i(d1());
                }
            }
            isb isbVar2 = this.x0;
            if (isbVar2 != null) {
                isbVar2.h(t7dVar, u7dVar, j);
            }
            if (u7dVar == u7dVar2 && ((i = t7dVar.f) == 10 || i == 11 || i == 12)) {
                if (this.y0 == null) {
                    this.y0 = new p4i(rafVar, new v9f(this, 1), yfd.W(this).d0);
                }
                p4i p4iVar = this.y0;
                if (p4iVar != null) {
                    p4iVar.g(d1());
                }
            }
            p4i p4iVar2 = this.y0;
            if (p4iVar2 != null) {
                p4iVar2.f(t7dVar, u7dVar, j);
            }
        }
    }

    @Override // defpackage.tc6
    public final void C1(cc6 cc6Var) {
        gb9.D(this.p0.c(), null, null, new o6e(cc6Var, this, null, 9), 3);
    }

    @Override // defpackage.tc6
    public final boolean H1() {
        raf rafVar = this.r0;
        if (rafVar.a.a()) {
            return true;
        }
        b20 b20Var = rafVar.b;
        if (b20Var == null) {
            return false;
        }
        zi6 zi6Var = b20Var.c;
        EdgeEffect edgeEffect = zi6Var.d;
        if (edgeEffect != null && cvj.e(edgeEffect) != MTTypesetterKt.kLineSkipLimitMultiplier) {
            return true;
        }
        EdgeEffect edgeEffect2 = zi6Var.e;
        if (edgeEffect2 != null && cvj.e(edgeEffect2) != MTTypesetterKt.kLineSkipLimitMultiplier) {
            return true;
        }
        EdgeEffect edgeEffect3 = zi6Var.f;
        if (edgeEffect3 != null && cvj.e(edgeEffect3) != MTTypesetterKt.kLineSkipLimitMultiplier) {
            return true;
        }
        EdgeEffect edgeEffect4 = zi6Var.g;
        return (edgeEffect4 == null || cvj.e(edgeEffect4) == MTTypesetterKt.kLineSkipLimitMultiplier) ? false : true;
    }

    public final void K1(b20 b20Var, xx1 xx1Var, eo7 eo7Var, zub zubVar, ukc ukcVar, aaf aafVar, boolean z, boolean z2) {
        boolean z3;
        boolean z4 = true;
        boolean z5 = false;
        if (this.W != z) {
            this.s0.F = z;
            z3 = true;
        } else {
            z3 = false;
        }
        eo7 eo7Var2 = eo7Var == null ? this.q0 : eo7Var;
        raf rafVar = this.r0;
        if (!x44.r(rafVar.a, aafVar)) {
            rafVar.a = aafVar;
            z5 = true;
        }
        rafVar.b = b20Var;
        if (rafVar.d != ukcVar) {
            rafVar.d = ukcVar;
            z5 = true;
        }
        if (rafVar.e != z2) {
            rafVar.e = z2;
        } else {
            z4 = z5;
        }
        rafVar.c = eo7Var2;
        rafVar.f = this.p0;
        wn4 wn4Var = this.u0;
        wn4Var.S = ukcVar;
        wn4Var.U = z2;
        wn4Var.V = xx1Var;
        this.n0 = b20Var;
        this.o0 = eo7Var;
        a6f a6fVar = r9f.a;
        ukc ukcVar2 = rafVar.d;
        ukc ukcVar3 = ukc.E;
        if (ukcVar2 != ukcVar3) {
            ukcVar3 = ukc.F;
        }
        J1(a6fVar, z, zubVar, ukcVar3, z4);
        if (z3) {
            this.v0 = null;
            this.w0 = null;
            yfd.W(this).V();
        }
    }

    @Override // defpackage.wo9
    public final boolean L(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        if (this.W) {
            long jI = ssj.i(keyEvent);
            int i = no9.O;
            if ((no9.a(jI, t9e.n()) || no9.a(ssj.i(keyEvent), t9e.o())) && rkj.g(ssj.j(keyEvent), 2) && !ssj.l(keyEvent)) {
                boolean z = this.r0.d == ukc.E;
                wn4 wn4Var = this.u0;
                if (z) {
                    int iQ1 = (int) (wn4Var.q1() & 4294967295L);
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(no9.a(ssj.i(keyEvent), t9e.o()) ? iQ1 : -iQ1)));
                } else {
                    int iQ12 = (int) (wn4Var.q1() >> 32);
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) & 4294967295L) | (((long) Float.floatToRawIntBits(no9.a(ssj.i(keyEvent), t9e.o()) ? iQ12 : -iQ12)) << 32);
                }
                gb9.D(d1(), null, null, new w9f(this, jFloatToRawIntBits, null, 0), 3);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ujf
    public final void X0(ekf ekfVar) {
        if (this.W && (this.v0 == null || this.w0 == null)) {
            this.v0 = new a21(21, this);
            this.w0 = new y9f(this, null);
        }
        a21 a21Var = this.v0;
        if (a21Var != null) {
            wn9[] wn9VarArr = ckf.a;
            ekfVar.a(ojf.d, new e5(null, a21Var));
        }
        y9f y9fVar = this.w0;
        if (y9fVar != null) {
            wn9[] wn9VarArr2 = ckf.a;
            ekfVar.a(ojf.e, y9fVar);
        }
    }

    @Override // defpackage.hqb
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.nw5
    public final void f() {
        R();
        if (this.R) {
            cz5 cz5Var = yfd.W(this).d0;
            ir5 ir5Var = this.q0;
            ir5Var.getClass();
            ir5Var.a = new zn5(new gmf(cz5Var));
        }
        isb isbVar = this.x0;
        if (isbVar != null) {
            isbVar.b(yfd.W(this).d0);
        }
        p4i p4iVar = this.y0;
        if (p4iVar != null) {
            p4iVar.b(yfd.W(this).d0);
        }
    }

    @Override // defpackage.hqb
    public final void h1() {
        if (this.R) {
            cz5 cz5Var = yfd.W(this).d0;
            ir5 ir5Var = this.q0;
            ir5Var.getClass();
            ir5Var.a = new zn5(new gmf(cz5Var));
        }
        isb isbVar = this.x0;
        if (isbVar != null) {
            isbVar.b(yfd.W(this).d0);
        }
        p4i p4iVar = this.y0;
        if (p4iVar != null) {
            p4iVar.b(yfd.W(this).d0);
        }
    }

    @Override // defpackage.wo9
    public final boolean l(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.tc6
    public final Object w1(sc6 sc6Var, sc6 sc6Var2) {
        raf rafVar = this.r0;
        Object objF = rafVar.f(zwb.F, new ba9(sc6Var, rafVar, null, 17), sc6Var2);
        return objF == m45.E ? objF : iei.a;
    }
}
