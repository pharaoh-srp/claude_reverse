package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p6b extends pe1 {
    public static final byte[] k1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public long D0;
    public boolean E0;
    public long F0;
    public int G0;
    public int H0;
    public ByteBuffer I0;
    public boolean J0;
    public boolean K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public int O0;
    public int P0;
    public int Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public long U0;
    public boolean V0;
    public final Context W;
    public boolean W0;
    public final c6b X;
    public boolean X0;
    public final wg6 Y;
    public boolean Y0;
    public final float Z;
    public ExoPlaybackException Z0;
    public final ro5 a0;
    public qo5 a1;
    public final ro5 b0;
    public o6b b1;
    public final ro5 c0;
    public long c1;
    public final wg1 d0;
    public boolean d1;
    public final MediaCodec.BufferInfo e0;
    public boolean e1;
    public final ArrayDeque f0;
    public boolean f1;
    public final ucc g0;
    public long g1;
    public final AtomicInteger h0;
    public p34 h1;
    public jw7 i0;
    public p34 i1;
    public jw7 j0;
    public qz8 j1;
    public ax5 k0;
    public ax5 l0;
    public y77 m0;
    public MediaCrypto n0;
    public final long o0;
    public float p0;
    public float q0;
    public d6b r0;
    public jw7 s0;
    public MediaFormat t0;
    public boolean u0;
    public float v0;
    public ArrayDeque w0;
    public MediaCodecRenderer$DecoderInitializationException x0;
    public g6b y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6b(Context context, int i, c6b c6bVar, float f) {
        super(i);
        wg6 wg6Var = wg6.H;
        this.W = context.getApplicationContext();
        this.X = c6bVar;
        this.Y = wg6Var;
        this.Z = f;
        this.h0 = new AtomicInteger();
        this.a0 = new ro5(0);
        this.b0 = new ro5(0);
        this.c0 = new ro5(2);
        wg1 wg1Var = new wg1(2);
        wg1Var.P = 32;
        this.d0 = wg1Var;
        this.e0 = new MediaCodec.BufferInfo();
        this.p0 = 1.0f;
        this.q0 = 1.0f;
        this.o0 = -9223372036854775807L;
        this.f0 = new ArrayDeque();
        this.b1 = o6b.g;
        wg1Var.h(0);
        wg1Var.I.order(ByteOrder.nativeOrder());
        ucc uccVar = new ucc();
        uccVar.G = m51.a;
        uccVar.F = 0;
        uccVar.E = 2;
        this.g0 = uccVar;
        this.v0 = -1.0f;
        this.O0 = 0;
        this.G0 = -1;
        this.H0 = -1;
        this.F0 = -9223372036854775807L;
        this.U0 = -9223372036854775807L;
        this.c1 = -9223372036854775807L;
        this.D0 = -9223372036854775807L;
        this.P0 = 0;
        this.Q0 = 0;
        this.a1 = new qo5();
        this.f1 = false;
        this.g1 = 0L;
        int i2 = qz8.G;
        this.j1 = cee.N;
        p34 p34Var = p34.b;
        this.h1 = p34Var;
        this.i1 = p34Var;
    }

    public abstract int A0(wg6 wg6Var, jw7 jw7Var);

    public final boolean B0(jw7 jw7Var) throws ExoPlaybackException {
        if (this.r0 != null && this.Q0 != 3 && this.L != 0) {
            float f = this.q0;
            jw7Var.getClass();
            jw7[] jw7VarArr = this.N;
            jw7VarArr.getClass();
            float fQ = Q(f, jw7Var, jw7VarArr);
            float f2 = this.v0;
            if (f2 != fQ) {
                if (fQ == -1.0f) {
                    if (this.R0) {
                        this.P0 = 1;
                        this.Q0 = 3;
                        return false;
                    }
                    o0();
                    Y();
                    return false;
                }
                if (f2 != -1.0f || fQ > this.Z) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fQ);
                    d6b d6bVar = this.r0;
                    d6bVar.getClass();
                    d6bVar.b(bundle);
                    this.v0 = fQ;
                }
            }
        }
        return true;
    }

    @Override // defpackage.pe1
    public void C(float f, float f2) throws ExoPlaybackException {
        this.p0 = f;
        this.q0 = f2;
        B0(this.s0);
    }

    public final void C0() {
        ax5 ax5Var = this.l0;
        ax5Var.getClass();
        ax5Var.r();
        t0(this.l0);
        this.P0 = 0;
        this.Q0 = 0;
    }

    @Override // defpackage.pe1
    public final int D(jw7 jw7Var) throws ExoPlaybackException {
        try {
            return A0(this.Y, jw7Var);
        } catch (MediaCodecUtil$DecoderQueryException e) {
            throw this.g(e, jw7Var, false, 4002);
        }
    }

    public final void D0(long j) {
        jw7 jw7Var = (jw7) this.b1.d.K(j);
        if (jw7Var == null && this.d1 && this.t0 != null) {
            jw7Var = (jw7) this.b1.d.J();
        }
        if (jw7Var != null) {
            this.j0 = jw7Var;
        } else if (!this.u0 || this.j0 == null) {
            return;
        }
        jw7 jw7Var2 = this.j0;
        jw7Var2.getClass();
        g0(jw7Var2, this.t0);
        this.u0 = false;
        this.d1 = false;
    }

    @Override // defpackage.pe1
    public final int E() {
        return 8;
    }

    public final void G(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            for (Map.Entry entry : this.h1.a.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    mediaFormat.setString(str, null);
                } else if (value instanceof Integer) {
                    mediaFormat.setInteger(str, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    mediaFormat.setLong(str, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    mediaFormat.setFloat(str, ((Float) value).floatValue());
                } else if (value instanceof String) {
                    mediaFormat.setString(str, (String) value);
                } else if (value instanceof ByteBuffer) {
                    mediaFormat.setByteBuffer(str, (ByteBuffer) value);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean H(long r25, long r27) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instruction units count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p6b.H(long, long):boolean");
    }

    public abstract to5 I(g6b g6bVar, jw7 jw7Var, jw7 jw7Var2, boolean z);

    public MediaCodecDecoderException J(IllegalStateException illegalStateException, g6b g6bVar) {
        return new MediaCodecDecoderException(illegalStateException, g6bVar);
    }

    public final boolean K() {
        if (!this.R0) {
            C0();
            return true;
        }
        this.P0 = 1;
        this.Q0 = 2;
        return true;
    }

    public final boolean L(long j, long j2) throws ExoPlaybackException {
        d6b d6bVar = this.r0;
        d6bVar.getClass();
        int i = this.H0;
        MediaCodec.BufferInfo bufferInfo = this.e0;
        if (i < 0) {
            int iM = d6bVar.m(bufferInfo);
            if (iM < 0) {
                if (iM != -2) {
                    if (this.C0 && (this.V0 || this.P0 == 2)) {
                        l0();
                    }
                    long j3 = this.D0;
                    if (j3 != -9223372036854775807L) {
                        long j4 = j3 + 100;
                        this.K.getClass();
                        if (j4 < System.currentTimeMillis()) {
                            l0();
                            return false;
                        }
                    }
                    return false;
                }
                this.T0 = true;
                d6b d6bVar2 = this.r0;
                d6bVar2.getClass();
                MediaFormat mediaFormatF = d6bVar2.f();
                if (Build.VERSION.SDK_INT >= 29 && !this.j1.isEmpty()) {
                    qz8<String> qz8Var = this.j1;
                    p34 p34Var = p34.b;
                    HashMap map = new HashMap();
                    for (String str : qz8Var) {
                        if (mediaFormatF.containsKey(str)) {
                            int valueTypeForKey = mediaFormatF.getValueTypeForKey(str);
                            if (valueTypeForKey == 1) {
                                map.put(str, Integer.valueOf(mediaFormatF.getInteger(str)));
                            } else if (valueTypeForKey == 2) {
                                map.put(str, Long.valueOf(mediaFormatF.getLong(str)));
                            } else if (valueTypeForKey == 3) {
                                map.put(str, Float.valueOf(mediaFormatF.getFloat(str)));
                            } else if (valueTypeForKey == 4) {
                                map.put(str, mediaFormatF.getString(str));
                            } else if (valueTypeForKey == 5) {
                                ByteBuffer byteBuffer = mediaFormatF.getByteBuffer(str);
                                if (byteBuffer == null) {
                                    map.put(str, null);
                                } else {
                                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
                                    byteBufferAllocate.put(byteBuffer.duplicate());
                                    byteBufferAllocate.flip();
                                    map.put(str, byteBufferAllocate);
                                }
                            }
                        }
                    }
                    p34 p34Var2 = new p34(map);
                    if (!p34Var2.equals(this.i1)) {
                        this.i1 = p34Var2;
                        d0(p34Var2);
                    }
                }
                this.t0 = mediaFormatF;
                this.u0 = true;
                return true;
            }
            bufferInfo.presentationTimeUs -= this.g1;
            if (this.B0) {
                this.B0 = false;
                d6bVar.e(iM);
                return true;
            }
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                l0();
                return false;
            }
            this.H0 = iM;
            ByteBuffer byteBufferT = d6bVar.t(iM);
            this.I0 = byteBufferT;
            if (byteBufferT != null) {
                byteBufferT.position(bufferInfo.offset);
                this.I0.limit(bufferInfo.offset + bufferInfo.size);
            }
            D0(bufferInfo.presentationTimeUs);
        }
        boolean z = this.f1 || bufferInfo.presentationTimeUs < this.P;
        long j5 = this.b1.f;
        boolean z2 = j5 != -9223372036854775807L && j5 <= bufferInfo.presentationTimeUs;
        this.J0 = z2;
        ByteBuffer byteBuffer2 = this.I0;
        int i2 = this.H0;
        int i3 = bufferInfo.flags;
        long j6 = bufferInfo.presentationTimeUs;
        jw7 jw7Var = this.j0;
        jw7Var.getClass();
        if (!m0(j, j2, d6bVar, byteBuffer2, i2, i3, 1, j6, z, z2, jw7Var)) {
            return false;
        }
        i0(bufferInfo.presentationTimeUs);
        boolean z3 = (bufferInfo.flags & 4) != 0;
        if (!z3 && this.S0 && this.J0) {
            this.K.getClass();
            this.D0 = System.currentTimeMillis();
        }
        this.H0 = -1;
        this.I0 = null;
        if (!z3) {
            return true;
        }
        l0();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean M() throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p6b.M():boolean");
    }

    public final void N() {
        try {
            d6b d6bVar = this.r0;
            d6bVar.getClass();
            d6bVar.flush();
        } finally {
            r0();
        }
    }

    public final List O(boolean z) {
        jw7 jw7Var = this.i0;
        jw7Var.getClass();
        wg6 wg6Var = this.Y;
        ArrayList arrayListR = R(wg6Var, jw7Var, z);
        if (!arrayListR.isEmpty() || !z) {
            return arrayListR;
        }
        ArrayList arrayListR2 = R(wg6Var, jw7Var, false);
        if (!arrayListR2.isEmpty()) {
            ysj.u("MediaCodecRenderer", "Drm session requires secure decoder for " + jw7Var.o + ", but no secure decoder available. Trying to proceed with " + arrayListR2 + ".");
        }
        return arrayListR2;
    }

    public int P(ro5 ro5Var) {
        return 0;
    }

    public abstract float Q(float f, jw7 jw7Var, jw7[] jw7VarArr);

    public abstract ArrayList R(wg6 wg6Var, jw7 jw7Var, boolean z);

    public long S(long j, long j2, boolean z) {
        return super.i(j, j2);
    }

    public final o6b T() {
        ArrayDeque arrayDeque = this.f0;
        return !arrayDeque.isEmpty() ? (o6b) arrayDeque.getLast() : this.b1;
    }

    public abstract h2f U(g6b g6bVar, jw7 jw7Var, MediaCrypto mediaCrypto, float f);

    public abstract void V(ro5 ro5Var);

    public final void W(g6b g6bVar, MediaCrypto mediaCrypto) {
        this.y0 = g6bVar;
        jw7 jw7Var = this.i0;
        jw7Var.getClass();
        String str = g6bVar.a;
        float f = this.q0;
        jw7[] jw7VarArr = this.N;
        jw7VarArr.getClass();
        float fQ = Q(f, jw7Var, jw7VarArr);
        if (fQ <= this.Z) {
            fQ = -1.0f;
        }
        this.K.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        h2f h2fVarU = U(g6bVar, jw7Var, mediaCrypto, fQ);
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            z6d z6dVar = this.J;
            z6dVar.getClass();
            LogSessionId logSessionIdA = z6dVar.a();
            LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
            if (!logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                ((MediaFormat) h2fVarU.c).setString("log-session-id", logSessionIdA.getStringId());
            }
        }
        try {
            Trace.beginSection("createCodec:" + str);
            d6b d6bVarJ = this.X.j(h2fVarU);
            this.r0 = d6bVarJ;
            this.E0 = d6bVarJ.n(new ro6(13, this));
            Trace.endSection();
            this.K.getClass();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!g6bVar.e(this.W, jw7Var)) {
                String strC = jw7.c(jw7Var);
                Locale locale = Locale.US;
                ysj.u("MediaCodecRenderer", ij0.l("Format exceeds selected codec's capabilities [", strC, ", ", str, "]"));
            }
            this.v0 = fQ;
            this.s0 = jw7Var;
            boolean z = false;
            this.z0 = i == 29 && "c2.android.aac.decoder".equals(str);
            String str2 = g6bVar.a;
            if ((i <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str2) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str2) || "OMX.bcm.vdec.avc.tunnel".equals(str2) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str2) || "OMX.bcm.vdec.hevc.tunnel".equals(str2) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str2))) || ("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && g6bVar.f)) {
                z = true;
            }
            this.C0 = z;
            this.r0.getClass();
            if (this.L == 2) {
                this.K.getClass();
                this.F0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.a1.a++;
            long j = jElapsedRealtime2 - jElapsedRealtime;
            if (i >= 31 && !this.j1.isEmpty()) {
                d6b d6bVar = this.r0;
                d6bVar.getClass();
                d6bVar.v(new ArrayList(this.j1));
            }
            c0(jElapsedRealtime2, j, str);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final boolean X(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        jw7 jw7Var = this.j0;
        return jw7Var == null || !Objects.equals(jw7Var.o, "audio/opus") || j - j2 > 80000;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y() throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            r5 = this;
            d6b r0 = r5.r0
            if (r0 != 0) goto La4
            boolean r0 = r5.K0
            if (r0 != 0) goto La4
            jw7 r0 = r5.i0
            if (r0 != 0) goto Le
            goto La4
        Le:
            java.lang.String r1 = r0.o
            ax5 r2 = r5.l0
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L4b
            boolean r2 = r5.z0(r0)
            if (r2 == 0) goto L4b
            r5.K0 = r3
            r5.q0()
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r1)
            wg1 r2 = r5.d0
            if (r0 != 0) goto L41
            java.lang.String r0 = "audio/mpeg"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L41
            java.lang.String r0 = "audio/opus"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L41
            r2.getClass()
            r2.P = r4
            goto L48
        L41:
            r2.getClass()
            r0 = 32
            r2.P = r0
        L48:
            r5.K0 = r4
            return
        L4b:
            ax5 r2 = r5.l0
            r5.t0(r2)
            ax5 r2 = r5.k0
            if (r2 == 0) goto L6a
            android.media.MediaCrypto r2 = r5.n0
            if (r2 != 0) goto L59
            goto L5a
        L59:
            r4 = r3
        L5a:
            defpackage.fd9.M(r4)
            ax5 r2 = r5.k0
            r2.getClass()
            boolean r4 = defpackage.my7.a
            androidx.media3.exoplayer.drm.DrmSession$DrmSessionException r2 = r2.t()
            if (r2 == 0) goto L8e
        L6a:
            ax5 r2 = r5.k0     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException -> L7f
            if (r2 == 0) goto L89
            int r2 = r2.z()     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException -> L7f
            r4 = 3
            if (r2 == r4) goto L81
            ax5 r2 = r5.k0     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException -> L7f
            int r2 = r2.z()     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException -> L7f
            r4 = 4
            if (r2 != r4) goto L89
            goto L81
        L7f:
            r1 = move-exception
            goto L9d
        L81:
            ax5 r2 = r5.k0     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException -> L7f
            r1.getClass()     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException -> L7f
            r2.getClass()     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException -> L7f
        L89:
            android.media.MediaCrypto r1 = r5.n0     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException -> L7f
            r5.Z(r1, r3)     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException -> L7f
        L8e:
            android.media.MediaCrypto r0 = r5.n0
            if (r0 == 0) goto La4
            d6b r1 = r5.r0
            if (r1 != 0) goto La4
            r0.release()
            r0 = 0
            r5.n0 = r0
            return
        L9d:
            r2 = 4001(0xfa1, float:5.607E-42)
            androidx.media3.exoplayer.ExoPlaybackException r5 = r5.g(r1, r0, r3, r2)
            throw r5
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p6b.Y():void");
    }

    public final void Z(MediaCrypto mediaCrypto, boolean z) throws MediaCodecRenderer$DecoderInitializationException {
        jw7 jw7Var = this.i0;
        jw7Var.getClass();
        if (this.w0 == null) {
            try {
                List listO = O(z);
                this.w0 = new ArrayDeque();
                ArrayList arrayList = (ArrayList) listO;
                if (!arrayList.isEmpty()) {
                    this.w0.add((g6b) arrayList.get(0));
                }
                this.x0 = null;
            } catch (MediaCodecUtil$DecoderQueryException e) {
                throw new MediaCodecRenderer$DecoderInitializationException(jw7Var, e, z, -49998);
            }
        }
        if (this.w0.isEmpty()) {
            throw new MediaCodecRenderer$DecoderInitializationException(jw7Var, null, z, -49999);
        }
        ArrayDeque arrayDeque = this.w0;
        arrayDeque.getClass();
        while (this.r0 == null) {
            g6b g6bVar = (g6b) arrayDeque.peekFirst();
            g6bVar.getClass();
            if (!a0(jw7Var) || !x0(g6bVar)) {
                return;
            }
            try {
                W(g6bVar, mediaCrypto);
            } catch (Exception e2) {
                ysj.v("MediaCodecRenderer", "Failed to initialize decoder: " + g6bVar, e2);
                arrayDeque.removeFirst();
                MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException = new MediaCodecRenderer$DecoderInitializationException("Decoder init failed: " + g6bVar.a + ", " + jw7Var, e2, jw7Var.o, z, g6bVar, e2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e2).getDiagnosticInfo() : null);
                b0(mediaCodecRenderer$DecoderInitializationException);
                MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException2 = this.x0;
                if (mediaCodecRenderer$DecoderInitializationException2 == null) {
                    this.x0 = mediaCodecRenderer$DecoderInitializationException;
                } else {
                    this.x0 = new MediaCodecRenderer$DecoderInitializationException(mediaCodecRenderer$DecoderInitializationException2.getMessage(), mediaCodecRenderer$DecoderInitializationException2.getCause(), mediaCodecRenderer$DecoderInitializationException2.E, mediaCodecRenderer$DecoderInitializationException2.F, mediaCodecRenderer$DecoderInitializationException2.G, mediaCodecRenderer$DecoderInitializationException2.H);
                }
                if (arrayDeque.isEmpty()) {
                    throw this.x0;
                }
            }
        }
        this.w0 = null;
    }

    public boolean a0(jw7 jw7Var) {
        return true;
    }

    public abstract void b0(Exception exc);

    public abstract void c0(long j, long j2, String str);

    @Override // defpackage.pe1, defpackage.b7d
    public void d(int i, Object obj) {
        int i2;
        if (i == 11) {
            y77 y77Var = (y77) obj;
            y77Var.getClass();
            this.m0 = y77Var;
            return;
        }
        if (i != 21) {
            if (i == 22 && (i2 = Build.VERSION.SDK_INT) >= 29) {
                obj.getClass();
                qz8 qz8Var = (qz8) obj;
                if (this.j1.equals(qz8Var)) {
                    return;
                }
                if (i2 >= 31) {
                    HashSet hashSet = new HashSet(qz8Var);
                    HashSet hashSet2 = new HashSet();
                    efi it = this.j1.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (!hashSet.remove(str)) {
                            hashSet2.add(str);
                        }
                    }
                    d6b d6bVar = this.r0;
                    if (d6bVar != null) {
                        if (!hashSet2.isEmpty()) {
                            d6bVar.x(new ArrayList(hashSet2));
                        }
                        if (!hashSet.isEmpty()) {
                            d6bVar.v(new ArrayList(hashSet));
                        }
                    }
                }
                this.j1 = qz8Var;
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            obj.getClass();
            p34 p34Var = (p34) obj;
            this.h1 = p34Var;
            d6b d6bVar2 = this.r0;
            if (d6bVar2 != null) {
                Bundle bundle = new Bundle();
                for (Map.Entry entry : p34Var.a.entrySet()) {
                    String str2 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        if (value instanceof Integer) {
                            bundle.putInt(str2, ((Integer) value).intValue());
                        } else if (value instanceof Long) {
                            bundle.putLong(str2, ((Long) value).longValue());
                        } else if (value instanceof Float) {
                            bundle.putFloat(str2, ((Float) value).floatValue());
                        } else if (value instanceof String) {
                            bundle.putString(str2, (String) value);
                        } else if (value instanceof ByteBuffer) {
                            ByteBuffer byteBuffer = (ByteBuffer) value;
                            byte[] bArr = new byte[byteBuffer.remaining()];
                            byteBuffer.duplicate().get(bArr);
                            bundle.putByteArray(str2, bArr);
                        }
                    }
                }
                d6bVar2.b(bundle);
            }
        }
    }

    public abstract void d0(p34 p34Var);

    public abstract void e0(String str);

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.to5 f0(defpackage.qb5 r15) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p6b.f0(qb5):to5");
    }

    public abstract void g0(jw7 jw7Var, MediaFormat mediaFormat);

    public void h0() {
    }

    @Override // defpackage.pe1
    public final long i(long j, long j2) {
        return S(j, j2, this.E0);
    }

    public void i0(long j) {
        this.c1 = j;
        while (true) {
            ArrayDeque arrayDeque = this.f0;
            if (arrayDeque.isEmpty() || j < ((o6b) arrayDeque.peek()).a) {
                return;
            }
            o6b o6bVar = (o6b) arrayDeque.poll();
            o6bVar.getClass();
            u0(o6bVar);
            j0();
        }
    }

    public abstract void j0();

    public void k0(ro5 ro5Var) {
    }

    public final void l0() throws ExoPlaybackException {
        int i = this.Q0;
        if (i == 1) {
            N();
            return;
        }
        if (i == 2) {
            N();
            C0();
        } else if (i != 3) {
            this.W0 = true;
            p0();
        } else {
            o0();
            Y();
        }
    }

    public abstract boolean m0(long j, long j2, d6b d6bVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, jw7 jw7Var);

    public final boolean n0(int i) throws ExoPlaybackException {
        qb5 qb5Var = this.G;
        qb5Var.i();
        ro5 ro5Var = this.a0;
        ro5Var.e();
        int iY = y(qb5Var, ro5Var, i | 4);
        if (iY == -5) {
            f0(qb5Var);
            return true;
        }
        if (iY != -4 || !ro5Var.c(4)) {
            return false;
        }
        this.V0 = true;
        l0();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o0() {
        try {
            d6b d6bVar = this.r0;
            if (d6bVar != null) {
                d6bVar.a();
                this.a1.b++;
                g6b g6bVar = this.y0;
                g6bVar.getClass();
                e0(g6bVar.a);
            }
            this.r0 = null;
            try {
                MediaCrypto mediaCrypto = this.n0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.r0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.n0;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    @Override // defpackage.pe1
    public void p() {
        this.i0 = null;
        u0(o6b.g);
        this.f0.clear();
        if (this.K0) {
            this.K0 = false;
            q0();
        } else {
            if (this.r0 == null) {
                return;
            }
            if (y0()) {
                o0();
            } else if (w0()) {
                N();
            } else {
                this.f1 = true;
            }
        }
    }

    public abstract void p0();

    public final void q0() {
        this.U0 = -9223372036854775807L;
        T().f = -9223372036854775807L;
        this.c1 = -9223372036854775807L;
        this.M0 = false;
        this.d0.e();
        this.c0.e();
        this.L0 = false;
        ucc uccVar = this.g0;
        uccVar.getClass();
        uccVar.G = m51.a;
        uccVar.F = 0;
        uccVar.E = 2;
    }

    @Override // defpackage.pe1
    public void r(long j, boolean z, boolean z2) throws ExoPlaybackException {
        ArrayDeque arrayDeque = this.f0;
        if (!arrayDeque.isEmpty()) {
            this.b1 = (o6b) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z2) {
            this.V0 = false;
            this.W0 = false;
            this.Y0 = false;
            if (this.K0) {
                q0();
            } else if (this.r0 != null) {
                if (y0()) {
                    o0();
                    Y();
                } else if (w0()) {
                    N();
                } else {
                    this.f1 = true;
                }
            }
            if (this.b1.d.Q() > 0) {
                this.X0 = true;
            }
            bi0 bi0Var = this.b1.d;
            synchronized (bi0Var) {
                bi0Var.b = 0;
                bi0Var.c = 0;
                Arrays.fill((Object[]) bi0Var.e, (Object) null);
            }
            this.b1.e = false;
        }
    }

    public void r0() {
        this.G0 = -1;
        this.b0.I = null;
        this.H0 = -1;
        this.I0 = null;
        this.U0 = -9223372036854775807L;
        T().f = -9223372036854775807L;
        this.c1 = -9223372036854775807L;
        this.F0 = -9223372036854775807L;
        this.S0 = false;
        this.D0 = -9223372036854775807L;
        this.R0 = false;
        this.A0 = false;
        this.B0 = false;
        this.J0 = false;
        this.P0 = 0;
        this.Q0 = 0;
        this.O0 = this.N0 ? 1 : 0;
        this.f1 = false;
        this.g1 = 0L;
    }

    public final void s0() {
        r0();
        this.Z0 = null;
        this.w0 = null;
        this.y0 = null;
        this.s0 = null;
        this.t0 = null;
        this.u0 = false;
        this.T0 = false;
        this.v0 = -1.0f;
        this.z0 = false;
        this.C0 = false;
        this.E0 = false;
        this.N0 = false;
        this.O0 = 0;
    }

    public final void t0(ax5 ax5Var) {
        ax5 ax5Var2 = this.k0;
        this.k0 = ax5Var;
    }

    public final void u0(o6b o6bVar) {
        this.b1 = o6bVar;
        if (o6bVar.c != -9223372036854775807L) {
            this.d1 = true;
            h0();
        }
    }

    public boolean v0(ro5 ro5Var) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // defpackage.pe1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w(defpackage.jw7[] r12, long r13, long r15, defpackage.z7b r17) {
        /*
            r11 = this;
            o6b r12 = r11.b1
            long r0 = r12.c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            o6b r4 = new o6b
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.u0(r4)
            boolean r12 = r11.e1
            if (r12 == 0) goto L56
            r11.j0()
            return
        L24:
            java.util.ArrayDeque r12 = r11.f0
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.U0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.c1
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
        L3c:
            o6b r4 = new o6b
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.u0(r4)
            o6b r12 = r11.b1
            long r12 = r12.c
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.j0()
        L56:
            return
        L57:
            o6b r0 = new o6b
            long r1 = r11.U0
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p6b.w(jw7[], long, long, z7b):void");
    }

    public boolean w0() {
        return true;
    }

    public boolean x0(g6b g6bVar) {
        return true;
    }

    public boolean y0() {
        int i = this.Q0;
        if (i == 3 || (this.z0 && !this.T0)) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        try {
            C0();
            return false;
        } catch (ExoPlaybackException e) {
            ysj.v("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0078 A[LOOP:1: B:31:0x0053->B:41:0x0078, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099 A[LOOP:2: B:42:0x0079->B:52:0x0099, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0079 A[EDGE_INSN: B:87:0x0079->B:90:? BREAK  A[LOOP:1: B:31:0x0053->B:41:0x0078], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009a A[EDGE_INSN: B:88:0x009a->B:53:0x009a BREAK  A[LOOP:2: B:42:0x0079->B:52:0x0099], SYNTHETIC] */
    @Override // defpackage.pe1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z(long r12, long r14) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p6b.z(long, long):void");
    }

    public boolean z0(jw7 jw7Var) {
        return false;
    }
}
