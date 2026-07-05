package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hp5 implements u6d, f8b, ug6 {
    public final g1h a;
    public final jqh b;
    public final kqh c;
    public final jud d;
    public final SparseArray e;
    public kba f;
    public v77 g;
    public k1h h;
    public boolean i;

    public hp5(g1h g1hVar) {
        g1hVar.getClass();
        this.a = g1hVar;
        String str = tpi.a;
        Looper looperMyLooper = Looper.myLooper();
        this.f = new kba((looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper).getThread());
        jqh jqhVar = new jqh();
        this.b = jqhVar;
        this.c = new kqh();
        this.d = new jud(jqhVar);
        this.e = new SparseArray();
    }

    @Override // defpackage.f8b
    public final void A(int i, z7b z7bVar, uba ubaVar, l7b l7bVar, int i2) {
        H(F(i, z7bVar), 1000, new ed5(24));
    }

    @Override // defpackage.u6d
    public final void B(boolean z) {
        H(C(), 7, new ed5(8));
    }

    public final kx C() {
        return D((z7b) this.d.e);
    }

    public final kx D(z7b z7bVar) {
        this.g.getClass();
        mqh mqhVar = z7bVar == null ? null : (mqh) ((aee) this.d.d).get(z7bVar);
        if (z7bVar != null && mqhVar != null) {
            return E(mqhVar, mqhVar.g(z7bVar.a, this.b).c, z7bVar);
        }
        int iF = this.g.f();
        mqh mqhVarJ = this.g.j();
        if (iF >= mqhVarJ.o()) {
            mqhVarJ = mqh.a;
        }
        return E(mqhVarJ, iF, null);
    }

    public final kx E(mqh mqhVar, int i, z7b z7bVar) {
        z7b z7bVar2 = mqhVar.p() ? null : z7bVar;
        this.a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = mqhVar.equals(this.g.j()) && i == this.g.f();
        long jM = 0;
        if (z7bVar2 == null || !z7bVar2.b()) {
            if (z) {
                v77 v77Var = this.g;
                v77Var.F();
                jM = v77Var.c(v77Var.d0);
            } else if (!mqhVar.p()) {
                jM = tpi.M(mqhVar.m(i, this.c, 0L).j);
            }
        } else if (z && this.g.d() == z7bVar2.b && this.g.e() == z7bVar2.c) {
            jM = this.g.h();
        }
        long j = jM;
        z7b z7bVar3 = (z7b) this.d.e;
        mqh mqhVarJ = this.g.j();
        int iF = this.g.f();
        long jH = this.g.h();
        v77 v77Var2 = this.g;
        v77Var2.F();
        return new kx(jElapsedRealtime, mqhVar, i, z7bVar2, j, mqhVarJ, iF, z7bVar3, jH, tpi.M(v77Var2.d0.r));
    }

    public final kx F(int i, z7b z7bVar) {
        this.g.getClass();
        if (z7bVar != null) {
            return ((mqh) ((aee) this.d.d).get(z7bVar)) != null ? D(z7bVar) : E(mqh.a, i, z7bVar);
        }
        mqh mqhVarJ = this.g.j();
        if (i >= mqhVarJ.o()) {
            mqhVarJ = mqh.a;
        }
        return E(mqhVarJ, i, null);
    }

    public final kx G() {
        return D((z7b) this.d.g);
    }

    public final void H(kx kxVar, int i, hba hbaVar) {
        this.e.put(i, kxVar);
        this.f.e(i, hbaVar);
    }

    public final void I(v77 v77Var, Looper looper) {
        fd9.M(this.g == null || ((nz8) this.d.c).isEmpty());
        v77Var.getClass();
        this.g = v77Var;
        this.h = this.a.a(looper, null);
        kba kbaVar = this.f;
        u95 u95Var = new u95(this, 2, v77Var);
        kbaVar.getClass();
        g1h g1hVar = this.a;
        fd9.M(g1hVar != null);
        this.f = new kba(kbaVar.d, looper, looper.getThread(), g1hVar, u95Var, kbaVar.i);
    }

    @Override // defpackage.u6d
    public final void a(yui yuiVar) {
        kx kxVarG = G();
        H(kxVarG, 25, new fp5(kxVarG, yuiVar));
    }

    @Override // defpackage.u6d
    public final void b(int i) {
        H(C(), 6, new ed5(10));
    }

    @Override // defpackage.f8b
    public final void c(int i, z7b z7bVar, l7b l7bVar) {
        kx kxVarF = F(i, z7bVar);
        H(kxVarF, 1004, new u95(kxVarF, 3, l7bVar));
    }

    @Override // defpackage.u6d
    public final void d(boolean z) {
        H(C(), 3, new ep5(10));
    }

    @Override // defpackage.u6d
    public final void e(gjb gjbVar) {
        H(C(), 28, new ed5(7));
    }

    @Override // defpackage.u6d
    public final void f(int i, boolean z) {
        H(C(), 5, new ed5(13));
    }

    @Override // defpackage.f8b
    public final void g(int i, z7b z7bVar, uba ubaVar, l7b l7bVar) {
        H(F(i, z7bVar), 1002, new ep5(0));
    }

    @Override // defpackage.u6d
    public final void h(int i) {
        H(G(), 21, new ep5(6));
    }

    @Override // defpackage.u6d
    public final void i(int i) {
        H(C(), 4, new ed5(18));
    }

    @Override // defpackage.f8b
    public final void j(int i, z7b z7bVar, uba ubaVar, l7b l7bVar) {
        H(F(i, z7bVar), 1001, new ep5(3));
    }

    @Override // defpackage.f8b
    public final void k(int i, z7b z7bVar, uba ubaVar, l7b l7bVar, IOException iOException, boolean z) {
        kx kxVarF = F(i, z7bVar);
        H(kxVarF, 1003, new ed5(kxVarF, ubaVar, l7bVar, iOException, z));
    }

    @Override // defpackage.u6d
    public final void l(fd5 fd5Var) {
        H(C(), 27, new ed5(23));
    }

    @Override // defpackage.u6d
    public final void m(r4i r4iVar) {
        H(C(), 2, new ed5(15));
    }

    @Override // defpackage.u6d
    public final void n(int i, v6d v6dVar, v6d v6dVar2) {
        if (i == 1) {
            this.i = false;
        }
        v77 v77Var = this.g;
        v77Var.getClass();
        jud judVar = this.d;
        judVar.e = jud.h(v77Var, (nz8) judVar.c, (z7b) judVar.f, (jqh) judVar.b);
        kx kxVarC = C();
        H(kxVarC, 11, new dp5(kxVarC, i, v6dVar, v6dVar2));
    }

    @Override // defpackage.u6d
    public final void o(int i) {
        v77 v77Var = this.g;
        v77Var.getClass();
        jud judVar = this.d;
        judVar.e = jud.h(v77Var, (nz8) judVar.c, (z7b) judVar.f, (jqh) judVar.b);
        judVar.p(v77Var.j());
        H(C(), 0, new ep5(17));
    }

    @Override // defpackage.u6d
    public final void p(n7b n7bVar) {
        H(C(), 14, new ep5(2));
    }

    @Override // defpackage.u6d
    public final void q(boolean z) {
        H(G(), 23, new ep5(11));
    }

    @Override // defpackage.u6d
    public final void r(List list) {
        H(C(), 27, new ed5(16));
    }

    @Override // defpackage.u6d
    public final void s(v77 v77Var, t6d t6dVar) {
    }

    @Override // defpackage.u6d
    public final void t(int i, boolean z) {
        H(C(), -1, new ed5(6));
    }

    @Override // defpackage.u6d
    public final void u(l6d l6dVar) {
        H(C(), 12, new ed5(5));
    }

    @Override // defpackage.u6d
    public final void v(s6d s6dVar) {
        H(C(), 13, new ep5(16));
    }

    @Override // defpackage.u6d
    public final void w(PlaybackException playbackException) {
        z7b z7bVar;
        H((!(playbackException instanceof ExoPlaybackException) || (z7bVar = ((ExoPlaybackException) playbackException).L) == null) ? C() : D(z7bVar), 10, new ed5(12));
    }

    @Override // defpackage.u6d
    public final void x(j7b j7bVar, int i) {
        H(C(), 1, new ep5(18));
    }

    @Override // defpackage.u6d
    public final void y(PlaybackException playbackException) {
        z7b z7bVar;
        kx kxVarC = (!(playbackException instanceof ExoPlaybackException) || (z7bVar = ((ExoPlaybackException) playbackException).L) == null) ? C() : D(z7bVar);
        H(kxVarC, 10, new do0(kxVarC, (Object) playbackException, 13));
    }

    @Override // defpackage.u6d
    public final void z(int i, int i2) {
        H(G(), 24, new ed5(22));
    }
}
