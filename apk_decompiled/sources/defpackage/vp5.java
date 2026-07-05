package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import androidx.media3.exoplayer.audio.AudioOutput$WriteException;
import androidx.media3.exoplayer.audio.AudioOutputProvider$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioOutputProvider$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class vp5 {
    public static final AtomicInteger c0 = new AtomicInteger();
    public long A;
    public long B;
    public long C;
    public int D;
    public boolean E;
    public boolean F;
    public long G;
    public float H;
    public ByteBuffer I;
    public int J;
    public ByteBuffer K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public boolean R;
    public s91 S;
    public AudioDeviceInfo T;
    public int U;
    public boolean V;
    public long W;
    public boolean X;
    public boolean Y;
    public long Z;
    public final Context a;
    public long a0;
    public final xv8 b;
    public Handler b0;
    public final vh2 c;
    public final q7i d;
    public final qrh e;
    public final prh f;
    public final vde g;
    public final ArrayDeque h;
    public int i;
    public sp5 j;
    public final u15 k;
    public final u15 l;
    public z6d m;
    public ax5 n;
    public wtc o;
    public wtc p;
    public h51 q;
    public i61 r;
    public rp5 s;
    public g61 t;
    public p31 u;
    public up5 v;
    public up5 w;
    public l6d x;
    public boolean y;
    public long z;

    public vp5(tp5 tp5Var) {
        int deviceId;
        Context context = tp5Var.a;
        this.a = context == null ? null : context.getApplicationContext();
        this.u = p31.b;
        this.b = tp5Var.c;
        this.i = 0;
        this.r = tp5Var.f;
        vh2 vh2Var = new vh2();
        this.c = vh2Var;
        q7i q7iVar = new q7i();
        q7iVar.m = tpi.b;
        this.d = q7iVar;
        this.e = new qrh();
        this.f = new prh();
        this.g = nz8.v(q7iVar, vh2Var);
        this.H = 1.0f;
        this.Q = 0;
        this.S = new s91();
        l6d l6dVar = l6d.d;
        this.w = new up5(l6dVar, 0L, 0L);
        this.x = l6dVar;
        this.y = false;
        this.h = new ArrayDeque();
        this.k = new u15(1);
        this.l = new u15(1);
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i = deviceId;
        }
        this.U = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int i(java.nio.ByteBuffer r10, int r11) {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vp5.i(java.nio.ByteBuffer, int):int");
    }

    public final void a(long j) {
        l6d l6dVar;
        boolean zV = v();
        boolean z = false;
        xv8 xv8Var = this.b;
        if (zV) {
            l6dVar = l6d.d;
        } else {
            if (this.V || !wtc.a(this.p)) {
                l6dVar = l6d.d;
            } else {
                int i = ((jw7) this.p.c).I;
                l6dVar = this.x;
                jeg jegVar = (jeg) xv8Var.H;
                float f = l6dVar.a;
                jegVar.getClass();
                fd9.E(f > MTTypesetterKt.kLineSkipLimitMultiplier);
                if (jegVar.c != f) {
                    jegVar.c = f;
                    jegVar.i = true;
                }
                float f2 = l6dVar.b;
                fd9.E(f2 > MTTypesetterKt.kLineSkipLimitMultiplier);
                if (jegVar.d != f2) {
                    jegVar.d = f2;
                    jegVar.i = true;
                }
            }
            this.x = l6dVar;
        }
        l6d l6dVar2 = l6dVar;
        if (!this.V && wtc.a(this.p)) {
            int i2 = ((jw7) this.p.c).I;
            z = this.y;
            ((v6g) xv8Var.G).o = z;
        }
        this.y = z;
        this.h.add(new up5(l6dVar2, Math.max(0L, j), tpi.G(((f51) this.p.e).b, j())));
        h51 h51Var = (h51) this.p.f;
        this.q = h51Var;
        h51Var.a();
        ax5 ax5Var = this.n;
        if (ax5Var != null) {
            final boolean z2 = this.y;
            final i49 i49Var = ((e6b) ax5Var.F).m1;
            Handler handler = (Handler) i49Var.F;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o51
                    @Override // java.lang.Runnable
                    public final void run() {
                        r77 r77Var = (r77) i49Var.G;
                        String str = tpi.a;
                        v77 v77Var = r77Var.E;
                        boolean z3 = v77Var.W;
                        final boolean z4 = z2;
                        if (z3 == z4) {
                            return;
                        }
                        v77Var.W = z4;
                        v77Var.m.e(23, new hba() { // from class: q77
                            @Override // defpackage.hba
                            public final void invoke(Object obj) {
                                ((u6d) obj).q(z4);
                            }
                        });
                    }
                });
            }
        }
    }

    public final g61 b(f51 f51Var) throws AudioSink$InitializationException {
        try {
            return this.r.a(f51Var);
        } catch (AudioOutputProvider$InitializationException e) {
            AudioSink$InitializationException audioSink$InitializationException = new AudioSink$InitializationException(f51Var.b, f51Var.c, f51Var.a, f51Var.f, (jw7) this.p.c, f51Var.e, e);
            ax5 ax5Var = this.n;
            if (ax5Var == null) {
                throw audioSink$InitializationException;
            }
            ax5Var.C(audioSink$InitializationException);
            throw audioSink$InitializationException;
        }
    }

    public final void c(jw7 jw7Var, int[] iArr) {
        h51 h51Var;
        jw7 jw7Var2;
        int i;
        int iN;
        if (this.s == null && this.a != null) {
            rp5 rp5Var = new rp5(this);
            this.s = rp5Var;
            i61 i61Var = this.r;
            i61Var.f();
            if (i61Var.f == null) {
                i61Var.f = new kba(Thread.currentThread());
            }
            i61Var.f.a(rp5Var);
        }
        String str = jw7Var.o;
        int i2 = jw7Var.G;
        int i3 = jw7Var.I;
        if ("audio/raw".equals(str)) {
            fd9.E(tpi.y(i3));
            int iN2 = tpi.n(i3) * i2;
            hz8 hz8Var = new hz8(4);
            hz8Var.c(this.g);
            hz8Var.b(this.e);
            hz8Var.f((m51[]) this.b.F);
            h51Var = new h51(hz8Var.g());
            if (h51Var.equals(this.q)) {
                h51Var = this.q;
            }
            int i4 = jw7Var.J;
            int i5 = jw7Var.K;
            q7i q7iVar = this.d;
            q7iVar.i = i4;
            q7iVar.j = i5;
            this.c.i = iArr;
            i51 i51Var = new i51(jw7Var.H, i2, i3);
            try {
                nz8 nz8Var = h51Var.a;
                if (i51Var.equals(i51.e)) {
                    throw new AudioProcessor$UnhandledAudioFormatException(i51Var);
                }
                for (int i6 = 0; i6 < nz8Var.size(); i6++) {
                    m51 m51Var = (m51) nz8Var.get(i6);
                    i51 i51VarH = m51Var.h(i51Var);
                    if (m51Var.c()) {
                        fd9.M(!i51VarH.equals(i51.e));
                        i51Var = i51VarH;
                    }
                }
                int i7 = i51Var.b;
                int i8 = i51Var.c;
                iw7 iw7VarA = jw7Var.a();
                iw7VarA.H = i8;
                iw7VarA.G = i51Var.a;
                iw7VarA.F = i7;
                jw7Var2 = new jw7(iw7VarA);
                i = iN2;
                iN = tpi.n(i8) * i7;
            } catch (AudioProcessor$UnhandledAudioFormatException e) {
                throw new AudioSink$ConfigurationException(e, jw7Var);
            }
        } else {
            h51Var = new h51(vde.I);
            jw7Var2 = jw7Var;
            i = -1;
            iN = -1;
        }
        h51 h51Var2 = h51Var;
        b51 b51VarG = g(jw7Var2);
        jw7 jw7Var3 = b51VarG.a;
        try {
            f51 f51VarC = this.r.c(b51VarG);
            boolean z = f51VarC.e;
            if (f51VarC.a == 0) {
                throw new AudioSink$ConfigurationException(qy1.g("Invalid output encoding (isOffload=", ")", z), jw7Var3);
            }
            if (f51VarC.c == 0) {
                throw new AudioSink$ConfigurationException(qy1.g("Invalid output channel config (isOffload=", ")", z), jw7Var3);
            }
            this.X = false;
            wtc wtcVar = new wtc(jw7Var, jw7Var2, i, iN, f51VarC, h51Var2);
            if (n()) {
                this.o = wtcVar;
            } else {
                this.p = wtcVar;
            }
        } catch (AudioOutputProvider$ConfigurationException e2) {
            throw new AudioSink$ConfigurationException(e2, jw7Var);
        }
    }

    public final void d(long j) throws Exception {
        ax5 ax5Var;
        y77 y77Var;
        if (this.K == null) {
            return;
        }
        u15 u15Var = this.l;
        if (((Exception) u15Var.G) != null && (c0.get() > 0 || SystemClock.elapsedRealtime() < u15Var.F)) {
            return;
        }
        int iRemaining = this.K.remaining();
        try {
            boolean zD = this.t.d(j, this.K, this.J);
            this.W = SystemClock.elapsedRealtime();
            u15Var.G = null;
            u15Var.E = -9223372036854775807L;
            u15Var.F = -9223372036854775807L;
            if (this.t.c()) {
                if (this.C > 0) {
                    this.Y = false;
                }
                if (this.O && (ax5Var = this.n) != null && !zD && !this.Y && (y77Var = ((e6b) ax5Var.F).m0) != null) {
                    y77Var.a.w0 = true;
                }
            }
            if (wtc.a(this.p)) {
                this.B += (long) (iRemaining - this.K.remaining());
            }
            if (zD) {
                if (!wtc.a(this.p)) {
                    fd9.M(this.K == this.I);
                    this.C = (((long) this.D) * ((long) this.J)) + this.C;
                }
                this.K = null;
            }
        } catch (AudioOutput$WriteException e) {
            boolean z = e.F;
            if (z) {
                if (j() > 0) {
                    z = true;
                } else if (this.t.c()) {
                    if (((f51) this.p.e).e) {
                        this.X = true;
                    }
                    z = true;
                }
            }
            AudioSink$WriteException audioSink$WriteException = new AudioSink$WriteException(e.E, (jw7) this.p.c, z);
            ax5 ax5Var2 = this.n;
            if (ax5Var2 != null) {
                ax5Var2.C(audioSink$WriteException);
            }
            if (z) {
                throw audioSink$WriteException;
            }
            u15Var.c(audioSink$WriteException);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e() throws java.lang.Exception {
        /*
            r6 = this;
            h51 r0 = r6.q
            boolean r0 = r0.d()
            r1 = -9223372036854775808
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L14
            r6.d(r1)
            java.nio.ByteBuffer r6 = r6.K
            if (r6 != 0) goto L44
            goto L43
        L14:
            h51 r0 = r6.q
            boolean r5 = r0.d()
            if (r5 == 0) goto L2e
            boolean r5 = r0.d
            if (r5 == 0) goto L21
            goto L2e
        L21:
            r0.d = r4
            java.util.ArrayList r0 = r0.b
            java.lang.Object r0 = r0.get(r3)
            m51 r0 = (defpackage.m51) r0
            r0.i()
        L2e:
            r6.q(r1)
            h51 r0 = r6.q
            boolean r0 = r0.c()
            if (r0 == 0) goto L44
            java.nio.ByteBuffer r6 = r6.K
            if (r6 == 0) goto L43
            boolean r6 = r6.hasRemaining()
            if (r6 != 0) goto L44
        L43:
            return r4
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vp5.e():boolean");
    }

    public final void f() {
        if (n()) {
            this.z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.Y = false;
            this.D = 0;
            this.w = new up5(this.x, 0L, 0L);
            this.G = 0L;
            this.v = null;
            this.h.clear();
            this.I = null;
            this.J = 0;
            this.K = null;
            this.M = false;
            this.L = false;
            this.N = false;
            this.d.o = 0L;
            h51 h51Var = (h51) this.p.f;
            this.q = h51Var;
            h51Var.a();
            this.j = null;
            wtc wtcVar = this.o;
            if (wtcVar != null) {
                this.p = wtcVar;
                this.o = null;
            }
            c0.incrementAndGet();
            g61 g61Var = this.t;
            if (g61Var.f.d.getPlayState() == 3) {
                g61Var.a.pause();
            }
            if (Build.VERSION.SDK_INT >= 29 && g61Var.c()) {
                xv8 xv8Var = g61Var.i;
                xv8Var.getClass();
                ((g61) xv8Var.H).a.unregisterStreamEventCallback((f61) xv8Var.G);
                ((Handler) xv8Var.F).removeCallbacksAndMessages(null);
            }
            c61 c61Var = g61Var.e;
            if (c61Var != null) {
                AudioTrack audioTrack = (AudioTrack) c61Var.F;
                b61 b61Var = (b61) c61Var.I;
                b61Var.getClass();
                audioTrack.removeOnRoutingChangedListener(b61Var);
                c61Var.I = null;
                g61Var.e = null;
            }
            AudioTrack audioTrack2 = g61Var.a;
            kba kbaVar = g61Var.j;
            Handler handlerK = tpi.k(null);
            synchronized (g61.q) {
                try {
                    if (g61.r == null) {
                        g61.r = Executors.newSingleThreadScheduledExecutor(new mpi());
                    }
                    g61.s++;
                    g61.r.schedule(new f60(audioTrack2, handlerK, kbaVar, 1), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.t = null;
        }
        u15 u15Var = this.l;
        u15Var.G = null;
        u15Var.E = -9223372036854775807L;
        u15Var.F = -9223372036854775807L;
        u15 u15Var2 = this.k;
        u15Var2.G = null;
        u15Var2.E = -9223372036854775807L;
        u15Var2.F = -9223372036854775807L;
        this.Z = 0L;
        this.a0 = 0L;
        Handler handler = this.b0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final b51 g(jw7 jw7Var) {
        b51 b51Var = new b51(jw7Var);
        b51Var.b = this.u;
        b51Var.d = this.i != 0;
        b51Var.c = this.T;
        b51Var.e = this.Q;
        b51Var.g = this.V;
        b51Var.h = -1;
        b51Var.f = this.U;
        return new b51(b51Var);
    }

    public final int h(jw7 jw7Var) {
        boolean z;
        if (!tpi.y(jw7Var.I) || jw7Var.I == 2) {
            z = false;
        } else {
            iw7 iw7VarA = jw7Var.a();
            iw7VarA.H = 2;
            jw7Var = new jw7(iw7VarA);
            z = true;
        }
        int i = this.r.b(g(jw7Var)).d;
        if (i != 1) {
            if (i != 2) {
                return 0;
            }
            if (!z) {
                return 2;
            }
        }
        return 1;
    }

    public final long j() {
        if (!wtc.a(this.p)) {
            return this.C;
        }
        long j = this.B;
        long j2 = this.p.b;
        return ((j + j2) - 1) / j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0123, code lost:
    
        if (r5 == 0) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(long r21, java.nio.ByteBuffer r23, int r24) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vp5.k(long, java.nio.ByteBuffer, int):boolean");
    }

    public final boolean l() {
        if (!n()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.t.c() && this.N) {
            return false;
        }
        long j = j();
        long jA = this.t.a();
        g61 g61Var = this.t;
        g61Var.getClass();
        return j > tpi.I(jA, (long) g61Var.a.getSampleRate(), 1000000L, RoundingMode.UP);
    }

    public final boolean m() throws AudioSink$InitializationException {
        g61 g61VarB;
        xv8 xv8Var;
        u15 u15Var = this.k;
        if (((Exception) u15Var.G) != null && (c0.get() > 0 || SystemClock.elapsedRealtime() < u15Var.F)) {
            return false;
        }
        try {
            g61VarB = b((f51) this.p.e);
        } catch (AudioSink$InitializationException e) {
            int i = ((f51) this.p.e).f;
            while (true) {
                wtc wtcVar = this.p;
                if (i <= 1000000) {
                    if (!((f51) wtcVar.e).e) {
                        throw e;
                    }
                    this.X = true;
                    throw e;
                }
                int i2 = i / 2;
                int i3 = wtcVar.b;
                if (i3 == -1) {
                    i3 = 1;
                }
                int i4 = i2 % i3;
                int i5 = i4 != 0 ? (i3 - i4) + i2 : i2;
                e51 e51VarA = ((f51) wtcVar.e).a();
                e51VarA.f = i5;
                f51 f51Var = new f51(e51VarA);
                try {
                    g61VarB = b(f51Var);
                    wtc wtcVar2 = this.p;
                    this.p = new wtc((jw7) wtcVar2.c, (jw7) wtcVar2.d, wtcVar2.a, wtcVar2.b, f51Var, (h51) wtcVar2.f);
                    break;
                } catch (AudioSink$InitializationException e2) {
                    e.addSuppressed(e2);
                    i = i5;
                }
            }
        }
        this.t = g61VarB;
        sp5 sp5Var = new sp5(this, (f51) this.p.e);
        this.j = sp5Var;
        g61VarB.j.a(sp5Var);
        if (this.t.c()) {
            wtc wtcVar3 = this.p;
            if (((f51) wtcVar3.e).k) {
                g61 g61Var = this.t;
                jw7 jw7Var = (jw7) wtcVar3.c;
                int i6 = jw7Var.J;
                int i7 = jw7Var.K;
                if (Build.VERSION.SDK_INT < 29) {
                    g61Var.getClass();
                } else {
                    g61Var.a.setOffloadDelayPadding(i6, i7);
                }
            }
        }
        z6d z6dVar = this.m;
        if (z6dVar != null) {
            g61 g61Var2 = this.t;
            g61Var2.getClass();
            if (Build.VERSION.SDK_INT >= 31) {
                LogSessionId logSessionIdA = z6dVar.a();
                LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
                if (!logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                    g61Var2.a.setLogSessionId(logSessionIdA);
                }
            }
        }
        if (n()) {
            this.t.a.setVolume(this.H);
        }
        this.S.getClass();
        AudioDeviceInfo audioDeviceInfo = this.T;
        if (audioDeviceInfo != null) {
            this.t.a.setPreferredDevice(audioDeviceInfo);
        }
        this.F = true;
        int audioSessionId = this.t.a.getAudioSessionId();
        boolean z = audioSessionId != this.Q;
        this.Q = audioSessionId;
        ax5 ax5Var = this.n;
        if (ax5Var != null) {
            int i8 = ((f51) this.p.e).a;
            c0l c0lVar = new c0l(23);
            i49 i49Var = ((e6b) ax5Var.F).m1;
            Handler handler = (Handler) i49Var.F;
            if (handler != null) {
                handler.post(new n51(i49Var, c0lVar, 7));
            }
            if (z) {
                this.R = true;
                wtc wtcVar4 = this.p;
                e51 e51VarA2 = ((f51) wtcVar4.e).a();
                e51VarA2.h = this.Q;
                this.p = new wtc((jw7) wtcVar4.c, (jw7) wtcVar4.d, wtcVar4.a, wtcVar4.b, new f51(e51VarA2), (h51) wtcVar4.f);
                wtc wtcVar5 = this.o;
                if (wtcVar5 != null) {
                    e51 e51VarA3 = ((f51) wtcVar5.e).a();
                    e51VarA3.h = this.Q;
                    this.o = new wtc((jw7) wtcVar5.c, (jw7) wtcVar5.d, wtcVar5.a, wtcVar5.b, new f51(e51VarA3), (h51) wtcVar5.f);
                }
                ax5 ax5Var2 = this.n;
                int i9 = this.Q;
                e6b e6bVar = (e6b) ax5Var2.F;
                if (Build.VERSION.SDK_INT >= 35 && (xv8Var = e6bVar.o1) != null) {
                    xv8Var.A(i9);
                }
                i49 i49Var2 = e6bVar.m1;
                Handler handler2 = (Handler) i49Var2.F;
                if (handler2 != null) {
                    handler2.post(new p51(i49Var2, i9));
                }
            }
        }
        return true;
    }

    public final boolean n() {
        return this.t != null;
    }

    public final void o() {
        this.O = true;
        if (n()) {
            g61 g61Var = this.t;
            j61 j61Var = g61Var.f;
            if (j61Var.u != -9223372036854775807L) {
                j61Var.b.getClass();
                j61Var.u = tpi.C(SystemClock.elapsedRealtime());
            }
            j61Var.j = tpi.G(j61Var.e, j61Var.a());
            j61Var.h.a(0);
            if (!g61Var.k || g61Var.c()) {
                g61Var.a.play();
            }
        }
    }

    public final void p() {
        if (this.M) {
            return;
        }
        this.M = true;
        if (this.t.c()) {
            this.N = false;
        }
        g61 g61Var = this.t;
        if (g61Var.k) {
            return;
        }
        g61Var.k = true;
        j61 j61Var = g61Var.f;
        long jB = g61Var.b();
        j61Var.w = j61Var.a();
        j61Var.b.getClass();
        j61Var.u = tpi.C(SystemClock.elapsedRealtime());
        j61Var.x = jB;
        g61Var.a.stop();
    }

    public final void q(long j) throws Exception {
        ByteBuffer byteBuffer;
        d(j);
        if (this.K != null) {
            return;
        }
        if (!this.q.d()) {
            ByteBuffer byteBuffer2 = this.I;
            if (byteBuffer2 != null) {
                u(byteBuffer2);
                d(j);
                return;
            }
            return;
        }
        while (!this.q.c()) {
            do {
                h51 h51Var = this.q;
                if (h51Var.d()) {
                    ByteBuffer byteBuffer3 = h51Var.c[h51Var.b()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        h51Var.e(m51.a);
                        byteBuffer = h51Var.c[h51Var.b()];
                    }
                } else {
                    byteBuffer = m51.a;
                }
                if (byteBuffer.hasRemaining()) {
                    u(byteBuffer);
                    d(j);
                } else {
                    ByteBuffer byteBuffer4 = this.I;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    h51 h51Var2 = this.q;
                    ByteBuffer byteBuffer5 = this.I;
                    if (h51Var2.d() && !h51Var2.d) {
                        h51Var2.e(byteBuffer5);
                    }
                }
            } while (this.K == null);
            return;
        }
    }

    public final void r() {
        if (this.p != null) {
            wtc wtcVar = this.o;
            if (wtcVar != null) {
                this.p = wtcVar;
                this.o = null;
            }
            try {
                f51 f51VarC = this.r.c(g((jw7) this.p.d));
                wtc wtcVar2 = this.p;
                this.p = new wtc((jw7) wtcVar2.c, (jw7) wtcVar2.d, wtcVar2.a, wtcVar2.b, f51VarC, (h51) wtcVar2.f);
            } catch (AudioOutputProvider$ConfigurationException e) {
                pmf.m(new AudioSink$ConfigurationException(e, (jw7) this.p.c));
                return;
            }
        }
        f();
    }

    public final void s() {
        f();
        iz8 iz8VarListIterator = this.g.listIterator(0);
        while (iz8VarListIterator.hasNext()) {
            ((m51) iz8VarListIterator.next()).reset();
        }
        this.e.reset();
        this.f.reset();
        h51 h51Var = this.q;
        if (h51Var != null) {
            nz8 nz8Var = h51Var.a;
            for (int i = 0; i < nz8Var.size(); i++) {
                m51 m51Var = (m51) nz8Var.get(i);
                m51Var.f(j51.b);
                m51Var.reset();
            }
            h51Var.b.clear();
            h51Var.c = new ByteBuffer[0];
            i51 i51Var = i51.e;
            h51Var.d = false;
        }
        this.O = false;
        this.X = false;
    }

    public final void t() {
        if (n()) {
            g61 g61Var = this.t;
            l6d l6dVar = this.x;
            AudioTrack audioTrack = g61Var.a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(tpi.f(l6dVar.a, 0.1f, g61Var.c)).setPitch(tpi.f(l6dVar.b, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                ysj.v("AudioTrackAudioOutput", "Failed to set playback params", e);
            }
            j61 j61Var = g61Var.f;
            j61Var.i = audioTrack.getPlaybackParams().getSpeed();
            j61Var.h.a(0);
            j61Var.k = 0L;
            j61Var.t = 0;
            j61Var.s = 0;
            j61Var.l = 0L;
            j61Var.y = -9223372036854775807L;
            j61Var.z = -9223372036854775807L;
            PlaybackParams playbackParams = this.t.a.getPlaybackParams();
            this.x = new l6d(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(java.nio.ByteBuffer r23) {
        /*
            Method dump skipped, instruction units count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vp5.u(java.nio.ByteBuffer):void");
    }

    public final boolean v() {
        wtc wtcVar = this.p;
        return wtcVar != null && ((f51) wtcVar.e).j;
    }
}
