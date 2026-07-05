package defpackage;

import android.view.Surface;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import io.sentry.e0;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class wv5 implements xui {
    public final lui a;
    public final mui b;
    public final rui c;
    public final ArrayDeque d;
    public Surface e;
    public jw7 f;
    public long g;
    public wui h;
    public Executor i;
    public jui j;

    public wv5(lui luiVar, mui muiVar, g1h g1hVar) {
        this.a = luiVar;
        this.b = muiVar;
        luiVar.l = g1hVar;
        qb5 qb5Var = new qb5();
        qb5Var.F = this;
        this.c = new rui(qb5Var, luiVar, muiVar);
        this.d = new ArrayDeque();
        this.f = new jw7(new iw7());
        this.g = -9223372036854775807L;
        this.h = wui.a;
        this.i = new tv5();
        this.j = new uv5();
    }

    @Override // defpackage.xui
    public final void a() {
    }

    @Override // defpackage.xui
    public final boolean b() {
        return true;
    }

    @Override // defpackage.xui
    public final Surface c() {
        Surface surface = this.e;
        surface.getClass();
        return surface;
    }

    @Override // defpackage.xui
    public final boolean d() {
        rui ruiVar = this.c;
        long j = ruiVar.j;
        return j != -9223372036854775807L && ruiVar.i == j;
    }

    @Override // defpackage.xui
    public final void e() {
        this.b.b();
        lui luiVar = this.a;
        luiVar.d = false;
        luiVar.i = -9223372036854775807L;
        qui quiVar = luiVar.b;
        quiVar.d = false;
        nui nuiVar = quiVar.c;
        if (nuiVar != null) {
            nuiVar.b();
        }
        quiVar.a();
    }

    @Override // defpackage.xui
    public final void f() {
        this.b.b();
        this.a.d();
    }

    @Override // defpackage.xui
    public final void g(jw7 jw7Var, long j, int i, List list) {
        fd9.M(list.isEmpty());
        int i2 = jw7Var.v;
        int i3 = jw7Var.w;
        jw7 jw7Var2 = this.f;
        int i4 = jw7Var2.v;
        rui ruiVar = this.c;
        if (i2 != i4 || i3 != jw7Var2.w) {
            bi0 bi0Var = ruiVar.d;
            long j2 = ruiVar.h;
            bi0Var.f(j2 == -9223372036854775807L ? 0L : j2 + 1, new yui(i2, i3));
        }
        float f = jw7Var.z;
        if (f != this.f.z) {
            this.a.f(f);
        }
        this.f = jw7Var;
        if (j != this.g) {
            if (ruiVar.f.G == 0) {
                ruiVar.b.e(i);
                ruiVar.l = j;
            } else {
                bi0 bi0Var2 = ruiVar.e;
                long j3 = ruiVar.h;
                bi0Var2.f(j3 == -9223372036854775807L ? -4611686018427387904L : j3 + 1, Long.valueOf(j));
            }
            this.g = j;
        }
    }

    @Override // defpackage.xui
    public final void h(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.xui
    public final void i() {
        rui ruiVar = this.c;
        if (ruiVar.h == -9223372036854775807L) {
            ruiVar.h = Long.MIN_VALUE;
            ruiVar.i = Long.MIN_VALUE;
        }
        ruiVar.j = ruiVar.h;
    }

    @Override // defpackage.xui
    public final void j(int i) {
        qui quiVar = this.a.b;
        if (quiVar.j == i) {
            return;
        }
        quiVar.j = i;
        quiVar.d(true);
    }

    @Override // defpackage.xui
    public final void k(float f) {
        this.a.h(f);
    }

    @Override // defpackage.xui
    public final void l() {
        this.e = null;
        this.a.g(null);
    }

    @Override // defpackage.xui
    public final void m(t6b t6bVar) {
        this.h = t6bVar;
        this.i = y46.E;
    }

    @Override // defpackage.xui
    public final boolean n(long j, u6b u6bVar) {
        this.d.add(u6bVar);
        rui ruiVar = this.c;
        jw1 jw1Var = ruiVar.f;
        int i = jw1Var.G;
        long[] jArr = (long[]) jw1Var.I;
        if (i == jArr.length) {
            int length = jArr.length << 1;
            if (length < 0) {
                e0.b();
                return false;
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i2 = jw1Var.E;
            int i3 = length2 - i2;
            System.arraycopy(jArr, i2, jArr2, 0, i3);
            System.arraycopy((long[]) jw1Var.I, 0, jArr2, i3, i2);
            jw1Var.E = 0;
            jw1Var.F = jw1Var.G - 1;
            jw1Var.I = jArr2;
            jw1Var.H = length - 1;
        }
        int i4 = (jw1Var.F + 1) & jw1Var.H;
        jw1Var.F = i4;
        ((long[]) jw1Var.I)[i4] = j;
        jw1Var.G++;
        ruiVar.h = j;
        ruiVar.j = -9223372036854775807L;
        this.i.execute(new fc(17, this));
        return true;
    }

    @Override // defpackage.xui
    public final boolean o(jw7 jw7Var) {
        return true;
    }

    @Override // defpackage.xui
    public final void p(boolean z) {
        if (z) {
            lui luiVar = this.a;
            luiVar.b.b();
            luiVar.h = -9223372036854775807L;
            luiVar.f = -9223372036854775807L;
            luiVar.e = Math.min(luiVar.e, 1);
            luiVar.i = -9223372036854775807L;
            luiVar.n = false;
        }
        this.b.b();
        rui ruiVar = this.c;
        bi0 bi0Var = ruiVar.d;
        jw1 jw1Var = ruiVar.f;
        jw1Var.E = 0;
        jw1Var.F = -1;
        jw1Var.G = 0;
        ruiVar.h = -9223372036854775807L;
        ruiVar.i = -9223372036854775807L;
        ruiVar.j = -9223372036854775807L;
        bi0 bi0Var2 = ruiVar.e;
        if (bi0Var2.Q() > 0) {
            fd9.E(bi0Var2.Q() > 0);
            while (bi0Var2.Q() > 1) {
                bi0Var2.J();
            }
            Object objJ = bi0Var2.J();
            objJ.getClass();
            ruiVar.l = ((Long) objJ).longValue();
        }
        if (bi0Var.Q() > 0) {
            fd9.E(bi0Var.Q() > 0);
            while (bi0Var.Q() > 1) {
                bi0Var.J();
            }
            Object objJ2 = bi0Var.J();
            objJ2.getClass();
            bi0Var.f(0L, (yui) objJ2);
        }
        this.d.clear();
    }

    @Override // defpackage.xui
    public final void q(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.xui
    public final void r(long j, long j2) throws VideoSink$VideoSinkException {
        try {
            this.c.a(j, j2);
        } catch (ExoPlaybackException e) {
            throw new VideoSink$VideoSinkException(e, this.f);
        }
    }

    @Override // defpackage.xui
    public final void s(boolean z) {
        this.a.c(z);
    }

    @Override // defpackage.xui
    public final boolean t(boolean z) {
        return this.a.b(z);
    }

    @Override // defpackage.xui
    public final void u(jui juiVar) {
        this.j = juiVar;
    }

    @Override // defpackage.xui
    public final void v() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.xui
    public final void w(Surface surface, h8g h8gVar) {
        this.e = surface;
        this.a.g(surface);
    }

    @Override // defpackage.xui
    public final void x() {
        lui luiVar = this.a;
        if (luiVar.e == 0) {
            luiVar.e = 1;
        }
    }
}
