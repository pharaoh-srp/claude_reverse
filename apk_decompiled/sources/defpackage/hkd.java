package defpackage;

import android.net.Uri;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class hkd extends me1 {
    public final qg5 h;
    public final do0 i;
    public final xg6 j;
    public final am4 k;
    public final int l;
    public final jw7 m;
    public boolean n = true;
    public long o = -9223372036854775807L;
    public boolean p;
    public boolean q;
    public boolean r;
    public yp5 s;
    public j7b t;

    public hkd(j7b j7bVar, qg5 qg5Var, do0 do0Var, xg6 xg6Var, am4 am4Var, int i, jw7 jw7Var) {
        this.t = j7bVar;
        this.h = qg5Var;
        this.i = do0Var;
        this.j = xg6Var;
        this.k = am4Var;
        this.l = i;
        this.m = jw7Var;
    }

    @Override // defpackage.me1
    public final s7b a(z7b z7bVar, xv8 xv8Var, long j) {
        tg5 tg5VarN = this.h.n();
        yp5 yp5Var = this.s;
        if (yp5Var != null) {
            tg5VarN.o(yp5Var);
        }
        g7b g7bVar = g().b;
        g7bVar.getClass();
        Uri uri = g7bVar.a;
        this.g.getClass();
        return new ekd(uri, tg5VarN, new xv8(12, (zd7) this.i.F), this.j, new tg6(this.d.c, 0, z7bVar), this.k, new tg6(this.c.c, 0, z7bVar), this, xv8Var, this.l, this.m, tpi.C(g7bVar.e), null);
    }

    @Override // defpackage.me1
    public final synchronized j7b g() {
        return this.t;
    }

    @Override // defpackage.me1
    public final void i() {
    }

    @Override // defpackage.me1
    public final void k(yp5 yp5Var) {
        this.s = yp5Var;
        Looper.myLooper().getClass();
        this.g.getClass();
        this.j.getClass();
        s();
    }

    @Override // defpackage.me1
    public final void m(s7b s7bVar) {
        ekd ekdVar = (ekd) s7bVar;
        if (ekdVar.b0) {
            for (a4f a4fVar : ekdVar.Y) {
                a4fVar.i();
                ax5 ax5Var = a4fVar.h;
                if (ax5Var != null) {
                    ax5Var.D(a4fVar.e);
                    a4fVar.h = null;
                    a4fVar.g = null;
                }
            }
        }
        xv8 xv8Var = ekdVar.P;
        hee heeVar = (hee) xv8Var.F;
        xba xbaVar = (xba) xv8Var.G;
        if (xbaVar != null) {
            xbaVar.a(true);
        }
        heeVar.execute(new k51(9, ekdVar));
        heeVar.F.accept(heeVar.E);
        ekdVar.U.removeCallbacksAndMessages(null);
        ekdVar.V = null;
        ekdVar.u0 = true;
    }

    @Override // defpackage.me1
    public final void o() {
        this.j.getClass();
    }

    @Override // defpackage.me1
    public final synchronized void r(j7b j7bVar) {
        this.t = j7bVar;
    }

    public final void s() {
        mqh w7gVar = new w7g(this.o, this.p, this.q, g());
        if (this.n) {
            w7gVar = new fkd(w7gVar);
        }
        l(w7gVar);
    }

    public final void t(long j, vef vefVar, boolean z) {
        if (this.r && vefVar.d()) {
            return;
        }
        this.r = !vefVar.d();
        if (j == -9223372036854775807L) {
            j = this.o;
        }
        boolean zB = vefVar.b();
        if (!this.n && this.o == j && this.p == zB && this.q == z) {
            return;
        }
        this.o = j;
        this.p = zB;
        this.q = z;
        this.n = false;
        s();
    }
}
