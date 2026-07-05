package defpackage;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public final class j61 {
    public boolean A;
    public long B;
    public final ive a;
    public final g1h b;
    public final long[] c;
    public final AudioTrack d;
    public final int e;
    public final long f;
    public final boolean g;
    public final a61 h;
    public float i;
    public long j;
    public long k;
    public long l;
    public Method m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public int s;
    public int t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;

    public j61(ive iveVar, g1h g1hVar, AudioTrack audioTrack, int i, int i2, int i3) {
        this.a = iveVar;
        this.b = g1hVar;
        this.d = audioTrack;
        try {
            this.m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.c = new long[10];
        this.z = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.h = new a61(audioTrack, iveVar);
        int sampleRate = audioTrack.getSampleRate();
        this.e = sampleRate;
        boolean zY = tpi.y(i);
        this.g = zY;
        this.f = zY ? tpi.G(sampleRate, i3 / i2) : -9223372036854775807L;
        this.q = 0L;
        this.r = 0L;
        this.A = false;
        this.B = 0L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.o = 0L;
        this.n = 0L;
        this.i = 1.0f;
        this.j = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a() {
        /*
            r12 = this;
            long r0 = r12.u
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L16
            long r0 = r12.c()
            long r2 = r12.x
            long r0 = java.lang.Math.min(r2, r0)
            return r0
        L16:
            g1h r0 = r12.b
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r4 = r12.p
            long r4 = r0 - r4
            r6 = 5
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L7c
            android.media.AudioTrack r4 = r12.d
            int r5 = r4.getPlayState()
            r6 = 1
            if (r5 != r6) goto L33
            goto L7a
        L33:
            int r4 = r4.getPlaybackHeadPosition()
            long r6 = (long) r4
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r8
            int r4 = android.os.Build.VERSION.SDK_INT
            r8 = 29
            if (r4 > r8) goto L5e
            r8 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L5c
            long r10 = r12.q
            int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r4 <= 0) goto L5c
            r4 = 3
            if (r5 != r4) goto L5c
            long r4 = r12.v
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L7a
            r12.v = r0
            goto L7a
        L5c:
            r12.v = r2
        L5e:
            long r2 = r12.q
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 <= 0) goto L78
            boolean r4 = r12.A
            if (r4 == 0) goto L71
            long r4 = r12.B
            long r4 = r4 + r2
            r12.B = r4
            r2 = 0
            r12.A = r2
            goto L78
        L71:
            long r2 = r12.r
            r4 = 1
            long r2 = r2 + r4
            r12.r = r2
        L78:
            r12.q = r6
        L7a:
            r12.p = r0
        L7c:
            long r0 = r12.q
            long r2 = r12.B
            long r0 = r0 + r2
            long r2 = r12.r
            r12 = 32
            long r2 = r2 << r12
            long r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j61.a():long");
    }

    public final long b(long j) {
        int i = this.t;
        int i2 = this.e;
        long jMax = Math.max(0L, (i == 0 ? this.u != -9223372036854775807L ? tpi.G(i2, c()) : tpi.G(i2, a()) : tpi.r(this.i, j + this.k)) - this.n);
        return this.u != -9223372036854775807L ? Math.min(tpi.G(i2, this.x), jMax) : jMax;
    }

    public final long c() {
        if (this.d.getPlayState() == 2) {
            return this.w;
        }
        this.b.getClass();
        return this.w + tpi.I(tpi.r(this.i, tpi.C(SystemClock.elapsedRealtime()) - this.u), this.e, 1000000L, RoundingMode.UP);
    }

    public final void d(long j) {
        long j2 = this.j;
        if (j2 == -9223372036854775807L || j < j2) {
            return;
        }
        long jRound = j - j2;
        float f = this.i;
        String str = tpi.a;
        if (f != 1.0f) {
            jRound = Math.round(jRound / ((double) f));
        }
        this.b.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - tpi.M(jRound);
        this.j = -9223372036854775807L;
        kba kbaVar = ((g61) this.a.F).j;
        kbaVar.getClass();
        if (Thread.currentThread() == kbaVar.a) {
            kbaVar.e(-1, new d61(jCurrentTimeMillis));
        }
    }
}
