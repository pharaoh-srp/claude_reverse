package defpackage;

import android.content.Context;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class n6d implements xui {
    public nz8 a;
    public jw7 b;
    public long c;
    public long d;
    public int e;
    public Executor f;
    public final /* synthetic */ r6d g;

    public n6d(r6d r6dVar, Context context) {
        this.g = r6dVar;
        tpi.z(context);
        iz8 iz8Var = nz8.F;
        this.a = vde.I;
        this.d = -9223372036854775807L;
        this.f = r6d.q;
    }

    @Override // defpackage.xui
    public final void a() {
        r6d r6dVar = this.g;
        if (r6dVar.n == 2) {
            return;
        }
        k1h k1hVar = r6dVar.k;
        if (k1hVar != null) {
            k1hVar.a.removeCallbacksAndMessages(null);
        }
        r6dVar.l = null;
        r6dVar.n = 2;
    }

    @Override // defpackage.xui
    public final boolean b() {
        return false;
    }

    @Override // defpackage.xui
    public final Surface c() {
        fd9.M(false);
        throw null;
    }

    @Override // defpackage.xui
    public final boolean d() {
        return false;
    }

    @Override // defpackage.xui
    public final void e() {
        r6d r6dVar = this.g;
        if (r6dVar.d) {
            r6dVar.e.e();
        }
    }

    @Override // defpackage.xui
    public final void f() {
        r6d r6dVar = this.g;
        if (r6dVar.d) {
            r6dVar.e.f();
        }
    }

    @Override // defpackage.xui
    public final void g(jw7 jw7Var, long j, int i, List list) {
        fd9.M(false);
        this.a = nz8.q(list);
        this.b = jw7Var;
        iw7 iw7VarA = jw7Var.a();
        f54 f54Var = jw7Var.E;
        if (f54Var == null || !f54Var.d()) {
            f54Var = f54.h;
        }
        iw7VarA.D = f54Var;
        iw7VarA.a();
        throw null;
    }

    @Override // defpackage.xui
    public final void h(long j) {
        this.c = j;
    }

    @Override // defpackage.xui
    public final void i() {
        long j = this.d;
        r6d r6dVar = this.g;
        if (r6dVar.o >= j) {
            r6dVar.e.i();
        }
    }

    @Override // defpackage.xui
    public final void j(int i) {
        this.g.e.j(i);
    }

    @Override // defpackage.xui
    public final void k(float f) {
        r6d r6dVar = this.g;
        r6dVar.i.c(f);
        r6dVar.e.k(f);
    }

    @Override // defpackage.xui
    public final void l() {
        int i = h8g.c.a;
        this.g.l = null;
    }

    @Override // defpackage.xui
    public final void m(t6b t6bVar) {
        this.f = y46.E;
    }

    @Override // defpackage.xui
    public final boolean n(long j, u6b u6bVar) {
        int i;
        fd9.M(false);
        long j2 = j + this.c;
        r6d r6dVar = this.g;
        mui muiVar = r6dVar.i;
        long j3 = muiVar.a == -9223372036854775807L ? -9223372036854775807L : (long) (((j2 - r3) * muiVar.c) + muiVar.b);
        if (j3 != -9223372036854775807L) {
            long j4 = r6dVar.h;
            if (j4 != -9223372036854775807L && j3 < j4 && (i = this.e) < 2) {
                this.e = i + 1;
                x6b x6bVar = u6bVar.c;
                d6b d6bVar = u6bVar.a;
                int i2 = u6bVar.b;
                Trace.beginSection("dropVideoBuffer");
                d6bVar.e(i2);
                Trace.endSection();
                x6bVar.S0(0, 1);
                return true;
            }
        }
        int i3 = r6dVar.p;
        if (i3 == -1 || i3 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0043 A[Catch: GlUtil$GlException -> 0x0036, TryCatch #0 {GlUtil$GlException -> 0x0036, blocks: (B:14:0x0026, B:17:0x002e, B:25:0x003d, B:28:0x0043, B:30:0x0047, B:37:0x005a, B:40:0x0061, B:45:0x0083, B:35:0x0052), top: B:54:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083 A[Catch: GlUtil$GlException -> 0x0036, TRY_LEAVE, TryCatch #0 {GlUtil$GlException -> 0x0036, blocks: (B:14:0x0026, B:17:0x002e, B:25:0x003d, B:28:0x0043, B:30:0x0047, B:37:0x005a, B:40:0x0061, B:45:0x0083, B:35:0x0052), top: B:54:0x0026 }] */
    @Override // defpackage.xui
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o(defpackage.jw7 r10) throws androidx.media3.exoplayer.video.VideoSink$VideoSinkException {
        /*
            r9 = this;
            java.lang.String r0 = "Color transfer "
            r6d r9 = r9.g
            int r1 = r9.n
            r2 = 1
            r3 = 0
            if (r1 != 0) goto Lc
            r1 = r2
            goto Ld
        Lc:
            r1 = r3
        Ld:
            defpackage.fd9.M(r1)
            f54 r1 = r10.E
            if (r1 == 0) goto L1b
            boolean r4 = r1.d()
            if (r4 == 0) goto L1b
            goto L1d
        L1b:
            f54 r1 = defpackage.f54.h
        L1d:
            int r1 = r1.c
            java.lang.String r4 = "EGL_EXT_gl_colorspace_bt2020_pq"
            r5 = 33
            r6 = 7
            if (r1 != r6) goto L40
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch: androidx.media3.common.util.GlUtil$GlException -> L36
            r8 = 34
            if (r7 >= r8) goto L40
            if (r7 < r5) goto L39
            boolean r7 = defpackage.wpk.i(r4)     // Catch: androidx.media3.common.util.GlUtil$GlException -> L36
            if (r7 == 0) goto L39
            r7 = r2
            goto L3a
        L36:
            r9 = move-exception
            goto La2
        L39:
            r7 = r3
        L3a:
            if (r7 != 0) goto L3d
            goto L40
        L3d:
            f54 r0 = new f54     // Catch: androidx.media3.common.util.GlUtil$GlException -> L36
            goto L85
        L40:
            r7 = 6
            if (r1 != r7) goto L50
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: androidx.media3.common.util.GlUtil$GlException -> L36
            if (r6 < r5) goto L4e
            boolean r4 = defpackage.wpk.i(r4)     // Catch: androidx.media3.common.util.GlUtil$GlException -> L36
            if (r4 == 0) goto L4e
            goto L58
        L4e:
            r2 = r3
            goto L58
        L50:
            if (r1 != r6) goto L58
            java.lang.String r2 = "EGL_EXT_gl_colorspace_bt2020_hlg"
            boolean r2 = defpackage.wpk.i(r2)     // Catch: androidx.media3.common.util.GlUtil$GlException -> L36
        L58:
            if (r2 != 0) goto L7c
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: androidx.media3.common.util.GlUtil$GlException -> L36
            r3 = 29
            if (r2 >= r3) goto L61
            goto L7c
        L61:
            java.lang.String r2 = "PlaybackVidGraphWrapper"
            java.util.Locale r3 = java.util.Locale.US     // Catch: androidx.media3.common.util.GlUtil$GlException -> L36
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: androidx.media3.common.util.GlUtil$GlException -> L36
            r3.<init>(r0)     // Catch: androidx.media3.common.util.GlUtil$GlException -> L36
            r3.append(r1)     // Catch: androidx.media3.common.util.GlUtil$GlException -> L36
            java.lang.String r0 = " is not supported. Falling back to OpenGl tone mapping."
            r3.append(r0)     // Catch: androidx.media3.common.util.GlUtil$GlException -> L36
            java.lang.String r0 = r3.toString()     // Catch: androidx.media3.common.util.GlUtil$GlException -> L36
            defpackage.ysj.u(r2, r0)     // Catch: androidx.media3.common.util.GlUtil$GlException -> L36
            f54 r0 = defpackage.f54.h     // Catch: androidx.media3.common.util.GlUtil$GlException -> L36
            goto L85
        L7c:
            r0 = 2
            if (r1 == r0) goto L83
            r0 = 10
            if (r1 != r0) goto L85
        L83:
            f54 r0 = defpackage.f54.h     // Catch: androidx.media3.common.util.GlUtil$GlException -> L36
        L85:
            g1h r0 = r9.f
            android.os.Looper r1 = android.os.Looper.myLooper()
            r1.getClass()
            r2 = 0
            k1h r0 = r0.a(r1, r2)
            r9.k = r0
            p6d r9 = r9.b     // Catch: androidx.media3.common.VideoFrameProcessingException -> L9b
            r9.a()     // Catch: androidx.media3.common.VideoFrameProcessingException -> L9b
            throw r2
        L9b:
            r9 = move-exception
            androidx.media3.exoplayer.video.VideoSink$VideoSinkException r0 = new androidx.media3.exoplayer.video.VideoSink$VideoSinkException
            r0.<init>(r9, r10)
            throw r0
        La2:
            androidx.media3.exoplayer.video.VideoSink$VideoSinkException r0 = new androidx.media3.exoplayer.video.VideoSink$VideoSinkException
            r0.<init>(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n6d.o(jw7):boolean");
    }

    @Override // defpackage.xui
    public final void p(boolean z) {
        bi0 bi0Var;
        this.d = -9223372036854775807L;
        r6d r6dVar = this.g;
        wv5 wv5Var = r6dVar.e;
        if (r6dVar.n == 1) {
            r6dVar.m++;
            wv5Var.p(z);
            while (true) {
                int iQ = r6dVar.j.Q();
                bi0Var = r6dVar.j;
                if (iQ <= 1) {
                    break;
                } else {
                    bi0Var.J();
                }
            }
            if (bi0Var.Q() == 1) {
                ((q6d) r6dVar.j.J()).getClass();
                throw null;
            }
            r6dVar.o = -9223372036854775807L;
            k1h k1hVar = r6dVar.k;
            k1hVar.getClass();
            k1hVar.d(new pya(3, r6dVar));
        }
    }

    @Override // defpackage.xui
    public final void q(List list) {
        if (this.a.equals(list)) {
            return;
        }
        this.a = nz8.q(list);
        jw7 jw7Var = this.b;
        if (jw7Var == null) {
            return;
        }
        iw7 iw7VarA = jw7Var.a();
        f54 f54Var = jw7Var.E;
        if (f54Var == null || !f54Var.d()) {
            f54Var = f54.h;
        }
        iw7VarA.D = f54Var;
        iw7VarA.a();
        throw null;
    }

    @Override // defpackage.xui
    public final void r(long j, long j2) throws VideoSink$VideoSinkException {
        this.g.e.r(j + this.c, j2);
    }

    @Override // defpackage.xui
    public final void s(boolean z) {
        r6d r6dVar = this.g;
        if (r6dVar.d) {
            r6dVar.e.s(z);
        }
    }

    @Override // defpackage.xui
    public final boolean t(boolean z) {
        return this.g.e.a.b(false);
    }

    @Override // defpackage.xui
    public final void u(jui juiVar) {
        this.g.e.j = juiVar;
    }

    @Override // defpackage.xui
    public final void v() {
    }

    @Override // defpackage.xui
    public final void w(Surface surface, h8g h8gVar) {
        r6d r6dVar = this.g;
        Pair pair = r6dVar.l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((h8g) r6dVar.l.second).equals(h8gVar)) {
            return;
        }
        r6dVar.l = Pair.create(surface, h8gVar);
        int i = h8gVar.a;
    }

    @Override // defpackage.xui
    public final void x() {
        r6d r6dVar = this.g;
        if (r6dVar.j.Q() == 0) {
            r6dVar.e.x();
            return;
        }
        bi0 bi0Var = new bi0();
        if (r6dVar.j.Q() <= 0) {
            r6dVar.j = bi0Var;
        } else {
            ((q6d) r6dVar.j.J()).getClass();
            throw null;
        }
    }
}
