package defpackage;

import android.graphics.Path;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class puc extends oqi {
    public jy1 b;
    public float c = 1.0f;
    public List d;
    public float e;
    public float f;
    public jy1 g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public ksg q;
    public final c40 r;
    public c40 s;
    public c40 t;
    public final kw9 u;

    public puc() {
        int i = asi.a;
        this.d = lm6.E;
        this.e = 1.0f;
        this.h = 0;
        this.i = 0;
        this.j = 4.0f;
        this.l = 1.0f;
        this.n = true;
        this.o = true;
        c40 c40VarA = f40.a();
        this.r = c40VarA;
        this.s = c40VarA;
        this.u = yb5.w(w1a.G, re4.X);
    }

    @Override // defpackage.oqi
    public final void a(xd6 xd6Var) {
        ksg ksgVar;
        if (this.n) {
            sf5.j0(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        jy1 jy1Var = this.b;
        if (jy1Var != null) {
            xd6.Y0(xd6Var, this.s, jy1Var, this.c, null, null, 0, 56);
        }
        jy1 jy1Var2 = this.g;
        if (jy1Var2 != null) {
            ksg ksgVar2 = this.q;
            if (this.o || ksgVar2 == null) {
                ksg ksgVar3 = new ksg(this.f, this.j, this.h, this.i, null, 16);
                this.q = ksgVar3;
                this.o = false;
                ksgVar = ksgVar3;
            } else {
                ksgVar = ksgVar2;
            }
            xd6.Y0(xd6Var, this.s, jy1Var2, this.e, ksgVar, null, 0, 48);
        }
    }

    public final void e() {
        float f = this.k;
        c40 c40Var = this.r;
        if (f == MTTypesetterKt.kLineSkipLimitMultiplier && this.l == 1.0f) {
            this.s = c40Var;
            return;
        }
        if (x44.r(this.s, c40Var)) {
            this.s = f40.a();
        } else {
            int i = this.s.a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
            this.s.j();
            this.s.k(i);
        }
        kw9 kw9Var = this.u;
        ((e40) kw9Var.getValue()).c(c40Var);
        float fA = ((e40) kw9Var.getValue()).a();
        float f2 = this.k;
        float f3 = this.m;
        float f4 = ((f2 + f3) % 1.0f) * fA;
        float f5 = ((this.l + f3) % 1.0f) * fA;
        if (f4 <= f5) {
            ((e40) kw9Var.getValue()).b(f4, f5, this.s);
            return;
        }
        c40 c40VarA = this.t;
        if (c40VarA == null) {
            c40VarA = f40.a();
            this.t = c40VarA;
        }
        c40VarA.i();
        ((e40) kw9Var.getValue()).b(f4, fA, c40VarA);
        c40.a(this.s, c40VarA);
        c40VarA.i();
        ((e40) kw9Var.getValue()).b(MTTypesetterKt.kLineSkipLimitMultiplier, f5, c40VarA);
        c40.a(this.s, c40VarA);
    }

    public final String toString() {
        return this.r.toString();
    }
}
