package defpackage;

import android.content.Context;
import android.media.LoudnessCodecController;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import com.pvporbit.freetype.FreeTypeConstants;
import com.squareup.wire.internal.MathMethodsKt;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class e6b extends p6b implements b6b {
    public long A1;
    public final Context l1;
    public final i49 m1;
    public final vp5 n1;
    public final xv8 o1;
    public int p1;
    public boolean q1;
    public jw7 r1;
    public jw7 s1;
    public long t1;
    public boolean u1;
    public boolean v1;
    public boolean w1;
    public boolean x1;
    public int y1;
    public boolean z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6b(Context context, c6b c6bVar, Handler handler, r77 r77Var, vp5 vp5Var) {
        super(context.getApplicationContext(), 1, c6bVar, 44100.0f);
        xv8 xv8Var = Build.VERSION.SDK_INT >= 35 ? new xv8() : null;
        this.l1 = context.getApplicationContext();
        this.n1 = vp5Var;
        this.o1 = xv8Var;
        this.y1 = -1000;
        this.m1 = new i49(handler, 5, r77Var);
        this.A1 = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ad  */
    @Override // defpackage.p6b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A0(defpackage.wg6 r19, defpackage.jw7 r20) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e6b.A0(wg6, jw7):int");
    }

    public final int E0(jw7 jw7Var) {
        a51 a51VarA;
        vp5 vp5Var = this.n1;
        if (vp5Var.X) {
            a51VarA = a51.d;
        } else {
            d51 d51VarB = vp5Var.r.b(vp5Var.g(jw7Var));
            z41 z41Var = new z41();
            z41Var.a = d51VarB.a;
            z41Var.b = d51VarB.b;
            z41Var.c = d51VarB.c;
            a51VarA = z41Var.a();
        }
        if (!a51VarA.a) {
            return 0;
        }
        int i = a51VarA.b ? 1536 : 512;
        return a51VarA.c ? i | FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : i;
    }

    public final void F0() {
        long j;
        long jMax;
        long j2;
        m();
        vp5 vp5Var = this.n1;
        xv8 xv8Var = vp5Var.b;
        if (!vp5Var.n() || vp5Var.F) {
            j = Long.MIN_VALUE;
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(vp5Var.t.a(), tpi.G(((f51) vp5Var.p.e).b, vp5Var.j()));
            ArrayDeque arrayDeque = vp5Var.h;
            while (!arrayDeque.isEmpty() && jMin >= ((up5) arrayDeque.getFirst()).c) {
                vp5Var.w = (up5) arrayDeque.remove();
            }
            up5 up5Var = vp5Var.w;
            long jI = jMin - up5Var.c;
            long jR = tpi.r(up5Var.a.a, jI);
            if (arrayDeque.isEmpty()) {
                jeg jegVar = (jeg) xv8Var.H;
                if (!jegVar.c()) {
                    j = Long.MIN_VALUE;
                } else if (jegVar.n >= 1024) {
                    long j3 = jegVar.m;
                    ieg iegVar = jegVar.j;
                    iegVar.getClass();
                    long jN = j3 - ((long) (iegVar.i.n() * (iegVar.j * iegVar.b)));
                    int i = jegVar.h.a;
                    int i2 = jegVar.g.a;
                    j = Long.MIN_VALUE;
                    long j4 = jegVar.n;
                    jI = i == i2 ? tpi.I(jI, jN, j4, RoundingMode.DOWN) : tpi.I(jI, jN * ((long) i), j4 * ((long) i2), RoundingMode.DOWN);
                } else {
                    j = Long.MIN_VALUE;
                    jI = (long) (((double) jegVar.c) * jI);
                }
                up5 up5Var2 = vp5Var.w;
                j2 = up5Var2.b + jI;
                up5Var2.d = jI - jR;
            } else {
                j = Long.MIN_VALUE;
                up5 up5Var3 = vp5Var.w;
                j2 = up5Var3.b + jR + up5Var3.d;
            }
            long j5 = ((v6g) xv8Var.G).q;
            jMax = tpi.G(((f51) vp5Var.p.e).b, j5) + j2;
            long j6 = vp5Var.Z;
            if (j5 > j6) {
                long jG = tpi.G(((f51) vp5Var.p.e).b, j5 - j6);
                vp5Var.Z = j5;
                vp5Var.a0 += jG;
                if (vp5Var.b0 == null) {
                    vp5Var.b0 = new Handler(Looper.myLooper());
                }
                vp5Var.b0.removeCallbacksAndMessages(null);
                vp5Var.b0.postDelayed(new fc(14, vp5Var), 100L);
            }
        }
        if (jMax != j) {
            if (!this.u1) {
                jMax = Math.max(this.t1, jMax);
            }
            this.t1 = jMax;
            this.u1 = false;
        }
    }

    @Override // defpackage.p6b
    public final to5 I(g6b g6bVar, jw7 jw7Var, jw7 jw7Var2, boolean z) {
        to5 to5VarB = g6bVar.b(jw7Var, jw7Var2);
        int i = to5VarB.e;
        if (this.l0 == null && z0(jw7Var2)) {
            i |= FreeTypeConstants.FT_LOAD_NO_AUTOHINT;
        }
        "OMX.google.raw.decoder".equals(g6bVar.a);
        if (jw7Var2.p > this.p1) {
            i |= 64;
        }
        int i2 = i;
        return new to5(g6bVar.a, jw7Var, jw7Var2, i2 != 0 ? 0 : to5VarB.d, i2);
    }

    @Override // defpackage.p6b
    public final float Q(float f, jw7 jw7Var, jw7[] jw7VarArr) {
        int iMax = -1;
        for (jw7 jw7Var2 : jw7VarArr) {
            int i = jw7Var2.H;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    @Override // defpackage.p6b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList R(defpackage.wg6 r4, defpackage.jw7 r5, boolean r6) {
        /*
            r3 = this;
            java.lang.String r0 = r5.o
            if (r0 != 0) goto L7
            vde r4 = defpackage.vde.I
            goto L2f
        L7:
            vp5 r0 = r3.n1
            int r0 = r0.h(r5)
            r1 = 0
            if (r0 == 0) goto L2b
            java.lang.String r0 = "audio/raw"
            java.util.List r0 = defpackage.s6b.e(r0, r1, r1)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L1e
            r0 = 0
            goto L24
        L1e:
            java.lang.Object r0 = r0.get(r1)
            g6b r0 = (defpackage.g6b) r0
        L24:
            if (r0 == 0) goto L2b
            vde r4 = defpackage.nz8.u(r0)
            goto L2f
        L2b:
            vde r4 = defpackage.s6b.g(r4, r5, r6, r1)
        L2f:
            java.util.HashMap r6 = defpackage.s6b.a
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r4)
            u95 r4 = new u95
            r0 = 8
            android.content.Context r3 = r3.l1
            r4.<init>(r3, r0, r5)
            u84 r3 = new u84
            r5 = 1
            r3.<init>(r5, r4)
            java.util.Collections.sort(r6, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e6b.R(wg6, jw7, boolean):java.util.ArrayList");
    }

    @Override // defpackage.p6b
    public final long S(long j, long j2, boolean z) {
        long jI;
        vp5 vp5Var = this.n1;
        boolean z2 = vp5Var.l() && this.A1 != -9223372036854775807L;
        if (this.z1) {
            if (!vp5Var.n()) {
                jI = -9223372036854775807L;
            } else if (wtc.a(vp5Var.p)) {
                jI = tpi.G(((f51) vp5Var.p.e).b, vp5Var.t.a.getBufferSizeInFrames());
            } else {
                long bufferSizeInFrames = vp5Var.t.a.getBufferSizeInFrames();
                int iG = xkk.g(((f51) vp5Var.p.e).a);
                fd9.M(iG != -2147483647);
                jI = tpi.I(bufferSizeInFrames, 1000000L, iG, RoundingMode.DOWN);
            }
            if (this.x1 && z2 && jI != -9223372036854775807L) {
                float fMin = Math.min(jI, this.A1 - j);
                l6d l6dVar = vp5Var.x;
                return Math.max(10000L, (long) ((fMin / (l6dVar != null ? l6dVar.a : 1.0f)) / 2.0f));
            }
        } else if (z2 || this.W0) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // defpackage.p6b
    public final h2f U(g6b g6bVar, jw7 jw7Var, MediaCrypto mediaCrypto, float f) {
        int iIntValue;
        jw7[] jw7VarArr = this.N;
        jw7VarArr.getClass();
        String str = g6bVar.a;
        "OMX.google.raw.decoder".equals(str);
        int iMax = jw7Var.p;
        String str2 = jw7Var.o;
        int i = jw7Var.G;
        int i2 = 0;
        if (jw7VarArr.length != 1) {
            for (jw7 jw7Var2 : jw7VarArr) {
                if (g6bVar.b(jw7Var, jw7Var2).d != 0) {
                    "OMX.google.raw.decoder".equals(str);
                    iMax = Math.max(iMax, jw7Var2.p);
                }
            }
        }
        this.p1 = iMax;
        this.q1 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str3 = g6bVar.c;
        int i3 = this.p1;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        mediaFormat.setInteger("channel-count", i);
        int i4 = jw7Var.H;
        mediaFormat.setInteger("sample-rate", i4);
        wpk.l(mediaFormat, jw7Var.r);
        wpk.k(mediaFormat, "max-input-size", i3);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if ("audio/ac4".equals(str2)) {
            Pair pairB = q34.b(jw7Var);
            if (pairB != null) {
                wpk.k(mediaFormat, "profile", ((Integer) pairB.first).intValue());
                wpk.k(mediaFormat, "level", ((Integer) pairB.second).intValue());
            }
            if (Build.VERSION.SDK_INT <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        iw7 iw7Var = new iw7();
        iw7Var.n = gkb.k("audio/raw");
        iw7Var.F = i;
        iw7Var.G = i4;
        iw7Var.H = 4;
        jw7 jw7Var3 = new jw7(iw7Var);
        vp5 vp5Var = this.n1;
        if (vp5Var.h(jw7Var3) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i5 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.y1));
        }
        jw7 jw7Var4 = null;
        if (Objects.equals(str2, "audio/iamf")) {
            i61 i61Var = vp5Var.r;
            u31 u31Var = i61Var != null ? i61Var.h : null;
            int i6 = 12;
            if (u31Var == null) {
                ysj.u("MediaCodecAudioRenderer", "AudioCapabilities from the AudioSink are null, using default stereo output layout.");
                mediaFormat.setInteger("channel-mask", 12);
                mediaFormat.setInteger("max-output-channel-count", 2);
            } else {
                qz8 qz8Var = vu8.a;
                Iterator it = u31Var.d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        iIntValue = 0;
                        break;
                    }
                    Integer num = (Integer) it.next();
                    iIntValue = num.intValue();
                    if (vu8.a.contains(num)) {
                        break;
                    }
                }
                if (iIntValue != 0) {
                    i6 = iIntValue;
                } else {
                    Iterator it2 = u31Var.c.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Integer num2 = (Integer) it2.next();
                        int iIntValue2 = num2.intValue();
                        if (vu8.a.contains(num2)) {
                            i2 = iIntValue2;
                            break;
                        }
                    }
                    if (i2 != 0) {
                        i6 = i2;
                    }
                }
                int iBitCount = Integer.bitCount(i6);
                mediaFormat.setInteger("channel-mask", i6);
                mediaFormat.setInteger("max-output-channel-count", iBitCount);
            }
        }
        G(mediaFormat);
        if ("audio/raw".equals(g6bVar.b) && !"audio/raw".equals(str2)) {
            jw7Var4 = jw7Var;
        }
        this.s1 = jw7Var4;
        return new h2f(g6bVar, mediaFormat, jw7Var, null, mediaCrypto, this.o1);
    }

    @Override // defpackage.p6b
    public final void V(ro5 ro5Var) {
        jw7 jw7Var;
        wtc wtcVar;
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || (jw7Var = ro5Var.G) == null || !Objects.equals(jw7Var.o, "audio/opus") || !this.K0) {
            return;
        }
        ByteBuffer byteBuffer = ro5Var.L;
        byteBuffer.getClass();
        jw7 jw7Var2 = ro5Var.G;
        jw7Var2.getClass();
        int i2 = jw7Var2.J;
        if (byteBuffer.remaining() == 8) {
            int i3 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / MathMethodsKt.NANOS_PER_SECOND);
            vp5 vp5Var = this.n1;
            g61 g61Var = vp5Var.t;
            if (g61Var == null || !g61Var.c() || (wtcVar = vp5Var.p) == null || !((f51) wtcVar.e).k) {
                return;
            }
            g61 g61Var2 = vp5Var.t;
            if (i < 29) {
                g61Var2.getClass();
            } else {
                g61Var2.a.setOffloadDelayPadding(i2, i3);
            }
        }
    }

    @Override // defpackage.b6b
    public final void a(l6d l6dVar) {
        vp5 vp5Var = this.n1;
        if (vp5Var.v()) {
            vp5Var.x = l6dVar;
            vp5Var.t();
            return;
        }
        l6d l6dVar2 = new l6d(tpi.f(l6dVar.a, 0.1f, 8.0f), tpi.f(l6dVar.b, 0.1f, 8.0f));
        vp5Var.x = l6dVar2;
        up5 up5Var = new up5(l6dVar2, -9223372036854775807L, -9223372036854775807L);
        if (vp5Var.n()) {
            vp5Var.v = up5Var;
        } else {
            vp5Var.w = up5Var;
        }
    }

    @Override // defpackage.b6b
    public final long b() {
        if (this.L == 2) {
            F0();
        }
        return this.t1;
    }

    @Override // defpackage.p6b
    public final void b0(Exception exc) {
        ysj.k("MediaCodecAudioRenderer", "Audio codec error", exc);
        i49 i49Var = this.m1;
        Handler handler = (Handler) i49Var.F;
        if (handler != null) {
            handler.post(new n51(i49Var, exc, 0));
        }
    }

    @Override // defpackage.b6b
    public final boolean c() {
        boolean z = this.w1;
        this.w1 = false;
        return z;
    }

    @Override // defpackage.p6b
    public final void c0(long j, long j2, String str) {
        i49 i49Var = this.m1;
        Handler handler = (Handler) i49Var.F;
        if (handler != null) {
            handler.post(new n51(i49Var, str, j, j2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    @Override // defpackage.p6b, defpackage.pe1, defpackage.b7d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r9, java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e6b.d(int, java.lang.Object):void");
    }

    @Override // defpackage.p6b
    public final void d0(p34 p34Var) {
        i49 i49Var = this.m1;
        Handler handler = (Handler) i49Var.F;
        if (handler != null) {
            handler.post(new fd(i49Var, 5, p34Var));
        }
    }

    @Override // defpackage.b6b
    public final l6d e() {
        return this.n1.x;
    }

    @Override // defpackage.p6b
    public final void e0(String str) {
        i49 i49Var = this.m1;
        Handler handler = (Handler) i49Var.F;
        if (handler != null) {
            handler.post(new n51(i49Var, str, 5));
        }
    }

    @Override // defpackage.p6b
    public final to5 f0(qb5 qb5Var) throws ExoPlaybackException {
        jw7 jw7Var = (jw7) qb5Var.F;
        jw7Var.getClass();
        this.r1 = jw7Var;
        to5 to5VarF0 = super.f0(qb5Var);
        i49 i49Var = this.m1;
        Handler handler = (Handler) i49Var.F;
        if (handler != null) {
            handler.post(new n51(i49Var, jw7Var, to5VarF0));
        }
        return to5VarF0;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ea A[Catch: AudioSink$ConfigurationException -> 0x00e8, TryCatch #0 {AudioSink$ConfigurationException -> 0x00e8, blocks: (B:36:0x00bf, B:39:0x00c7, B:41:0x00cb, B:43:0x00d4, B:47:0x00e2, B:50:0x00ea, B:54:0x00f1, B:55:0x00f6), top: B:59:0x00bf }] */
    @Override // defpackage.p6b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g0(defpackage.jw7 r8, android.media.MediaFormat r9) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e6b.g0(jw7, android.media.MediaFormat):void");
    }

    @Override // defpackage.p6b
    public final void h0() {
        this.n1.getClass();
    }

    @Override // defpackage.pe1
    public final b6b j() {
        return this;
    }

    @Override // defpackage.p6b
    public final void j0() {
        this.n1.E = true;
    }

    @Override // defpackage.pe1
    public final String k() {
        return "MediaCodecAudioRenderer";
    }

    @Override // defpackage.pe1
    public final boolean m() {
        if (!this.W0) {
            return false;
        }
        vp5 vp5Var = this.n1;
        if (vp5Var.n()) {
            return vp5Var.L && !vp5Var.l();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    @Override // defpackage.p6b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m0(long r1, long r3, defpackage.d6b r5, java.nio.ByteBuffer r6, int r7, int r8, int r9, long r10, boolean r12, boolean r13, defpackage.jw7 r14) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            r0 = this;
            r6.getClass()
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.A1 = r1
            jw7 r1 = r0.s1
            r2 = 1
            if (r1 == 0) goto L1a
            r1 = r8 & 2
            if (r1 == 0) goto L1a
            r5.getClass()
            r5.e(r7)
            return r2
        L1a:
            vp5 r1 = r0.n1
            if (r12 == 0) goto L2d
            if (r5 == 0) goto L23
            r5.e(r7)
        L23:
            qo5 r0 = r0.a1
            int r3 = r0.f
            int r3 = r3 + r9
            r0.f = r3
            r1.E = r2
            return r2
        L2d:
            boolean r1 = r1.k(r10, r6, r9)     // Catch: androidx.media3.exoplayer.audio.AudioSink$WriteException -> L44 androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L5e
            if (r1 == 0) goto L40
            if (r5 == 0) goto L38
            r5.e(r7)
        L38:
            qo5 r0 = r0.a1
            int r1 = r0.e
            int r1 = r1 + r9
            r0.e = r1
            return r2
        L40:
            r0.A1 = r10
            r0 = 0
            return r0
        L44:
            r1 = move-exception
            boolean r2 = r0.K0
            if (r2 == 0) goto L55
            hge r2 = r0.H
            r2.getClass()
            int r2 = r2.a
            if (r2 == 0) goto L55
            r2 = 5003(0x138b, float:7.01E-42)
            goto L57
        L55:
            r2 = 5002(0x138a, float:7.009E-42)
        L57:
            boolean r3 = r1.F
            androidx.media3.exoplayer.ExoPlaybackException r0 = r0.g(r1, r14, r3, r2)
            throw r0
        L5e:
            r1 = move-exception
            jw7 r2 = r0.r1
            boolean r3 = r0.K0
            if (r3 == 0) goto L71
            hge r3 = r0.H
            r3.getClass()
            int r3 = r3.a
            if (r3 == 0) goto L71
            r3 = 5004(0x138c, float:7.012E-42)
            goto L73
        L71:
            r3 = 5001(0x1389, float:7.008E-42)
        L73:
            boolean r4 = r1.E
            androidx.media3.exoplayer.ExoPlaybackException r0 = r0.g(r1, r2, r4, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e6b.m0(long, long, d6b, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, jw7):boolean");
    }

    @Override // defpackage.pe1
    public final boolean o() {
        return this.n1.l();
    }

    @Override // defpackage.p6b, defpackage.pe1
    public final void p() {
        i49 i49Var = this.m1;
        this.v1 = true;
        this.r1 = null;
        this.A1 = -9223372036854775807L;
        this.x1 = false;
        try {
            this.n1.f();
            try {
                super.p();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.p();
                throw th;
            } finally {
            }
        }
    }

    @Override // defpackage.p6b
    public final void p0() throws ExoPlaybackException {
        try {
            vp5 vp5Var = this.n1;
            if (!vp5Var.L && vp5Var.n() && vp5Var.e()) {
                vp5Var.p();
                vp5Var.L = true;
            }
            long j = this.b1.f;
            if (j != -9223372036854775807L) {
                this.A1 = j;
            }
        } catch (AudioSink$WriteException e) {
            throw g(e, e.G, e.F, this.K0 ? 5003 : 5002);
        }
    }

    @Override // defpackage.pe1
    public final void q(boolean z, boolean z2) {
        qo5 qo5Var = new qo5();
        this.a1 = qo5Var;
        i49 i49Var = this.m1;
        Handler handler = (Handler) i49Var.F;
        if (handler != null) {
            handler.post(new n51(i49Var, qo5Var, 6));
        }
        hge hgeVar = this.H;
        hgeVar.getClass();
        boolean z3 = hgeVar.b;
        vp5 vp5Var = this.n1;
        if (z3) {
            fd9.M(vp5Var.P);
            if (!vp5Var.V) {
                vp5Var.V = true;
                vp5Var.r();
            }
        } else if (vp5Var.V) {
            vp5Var.V = false;
            vp5Var.r();
        }
        z6d z6dVar = this.J;
        z6dVar.getClass();
        vp5Var.m = z6dVar;
        g1h g1hVar = this.K;
        g1hVar.getClass();
        vp5Var.r.g = g1hVar;
        vp5Var.n = new ax5(22, this);
    }

    @Override // defpackage.p6b, defpackage.pe1
    public final void r(long j, boolean z, boolean z2) throws ExoPlaybackException {
        super.r(j, z, z2);
        this.n1.f();
        this.t1 = j;
        this.A1 = -9223372036854775807L;
        this.w1 = false;
        this.x1 = false;
        this.u1 = true;
    }

    @Override // defpackage.pe1
    public final void s() {
        xv8 xv8Var;
        this.n1.r.d();
        if (Build.VERSION.SDK_INT < 35 || (xv8Var = this.o1) == null) {
            return;
        }
        ((HashSet) xv8Var.F).clear();
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) xv8Var.H;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    @Override // defpackage.pe1
    public final void t() {
        vp5 vp5Var = this.n1;
        this.w1 = false;
        this.x1 = false;
        this.A1 = -9223372036854775807L;
        try {
            try {
                this.K0 = false;
                q0();
                o0();
                ax5 ax5Var = this.l0;
                if (ax5Var != null) {
                    ax5Var.D(null);
                }
                this.l0 = null;
            } catch (Throwable th) {
                ax5 ax5Var2 = this.l0;
                if (ax5Var2 != null) {
                    ax5Var2.D(null);
                }
                this.l0 = null;
                throw th;
            }
        } finally {
            if (this.v1) {
                this.v1 = false;
                vp5Var.s();
            }
        }
    }

    @Override // defpackage.pe1
    public final void u() {
        this.n1.o();
        this.z1 = true;
    }

    @Override // defpackage.pe1
    public final void v() {
        F0();
        this.z1 = false;
        vp5 vp5Var = this.n1;
        vp5Var.O = false;
        if (vp5Var.n()) {
            g61 g61Var = vp5Var.t;
            j61 j61Var = g61Var.f;
            j61Var.k = 0L;
            j61Var.t = 0;
            j61Var.s = 0;
            j61Var.l = 0L;
            j61Var.y = -9223372036854775807L;
            j61Var.z = -9223372036854775807L;
            if (j61Var.u == -9223372036854775807L) {
                j61Var.h.a(0);
            }
            j61Var.w = j61Var.a();
            if (!g61Var.k || g61Var.c()) {
                g61Var.a.pause();
            }
        }
        this.x1 = false;
    }

    @Override // defpackage.p6b
    public final boolean z0(jw7 jw7Var) {
        hge hgeVar = this.H;
        hgeVar.getClass();
        if (hgeVar.a != 0) {
            int iE0 = E0(jw7Var);
            if ((iE0 & 512) != 0) {
                hge hgeVar2 = this.H;
                hgeVar2.getClass();
                if (hgeVar2.a == 2 || (iE0 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 || (jw7Var.J == 0 && jw7Var.K == 0)) {
                    return true;
                }
            }
        }
        return this.n1.h(jw7Var) != 0;
    }
}
