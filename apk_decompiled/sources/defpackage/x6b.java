package defpackage;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.SparseArray;
import android.view.Surface;
import androidx.health.platform.client.proto.g;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.video.MediaCodecVideoDecoderException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;
import io.sentry.e0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class x6b extends p6b {
    public static final int[] e2 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean f2;
    public static boolean g2;
    public boolean A1;
    public int B1;
    public List C1;
    public Surface D1;
    public i3d E1;
    public h8g F1;
    public boolean G1;
    public int H1;
    public int I1;
    public long J1;
    public int K1;
    public int L1;
    public int M1;
    public taf N1;
    public long O1;
    public boolean P1;
    public long Q1;
    public int R1;
    public long S1;
    public yui T1;
    public yui U1;
    public int V1;
    public boolean W1;
    public int X1;
    public w6b Y1;
    public jui Z1;
    public long a2;
    public long b2;
    public boolean c2;
    public int d2;
    public final Context l1;
    public final boolean m1;
    public final dke n1;
    public final int o1;
    public final boolean p1;
    public final lui q1;
    public final rv1 r1;
    public final qb5 s1;
    public final long t1;
    public final mui u1;
    public final PriorityQueue v1;
    public z4 w1;
    public boolean x1;
    public boolean y1;
    public xui z1;

    /* JADX WARN: Illegal instructions before constructor call */
    public x6b(v6b v6bVar) {
        Context context = v6bVar.a;
        super(context.getApplicationContext(), 2, v6bVar.c, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.l1 = applicationContext;
        this.o1 = v6bVar.g;
        this.z1 = null;
        Handler handler = v6bVar.e;
        r77 r77Var = v6bVar.f;
        dke dkeVar = new dke();
        if (r77Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        dkeVar.E = handler;
        dkeVar.F = r77Var;
        this.n1 = dkeVar;
        this.m1 = this.z1 == null;
        this.q1 = new lui(applicationContext, this, v6bVar.d);
        this.r1 = new rv1(3);
        this.p1 = "NVIDIA".equals(Build.MANUFACTURER);
        this.F1 = h8g.c;
        this.H1 = 1;
        this.I1 = 0;
        this.T1 = yui.d;
        this.X1 = 0;
        this.U1 = null;
        this.V1 = -1000;
        this.a2 = -9223372036854775807L;
        this.b2 = -9223372036854775807L;
        this.s1 = new qb5(7);
        this.v1 = new PriorityQueue();
        this.t1 = -15000L;
        this.u1 = new mui();
        this.N1 = null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean E0(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 3206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x6b.E0(java.lang.String):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int F0(defpackage.g6b r11, defpackage.jw7 r12) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x6b.F0(g6b, jw7):int");
    }

    public static List G0(Context context, wg6 wg6Var, jw7 jw7Var, boolean z, boolean z2) {
        String str = jw7Var.o;
        if (str == null) {
            return vde.I;
        }
        if ("video/dolby-vision".equals(str) && !tpk.c(context)) {
            String strC = s6b.c(jw7Var);
            List listE = strC == null ? vde.I : wg6Var.e(strC, z, z2);
            if (!listE.isEmpty()) {
                return listE;
            }
        }
        return s6b.g(wg6Var, jw7Var, z, z2);
    }

    public static int H0(g6b g6bVar, jw7 jw7Var) {
        int i = jw7Var.p;
        List list = jw7Var.r;
        if (i == -1) {
            return F0(g6bVar, jw7Var);
        }
        int size = list.size();
        int length = 0;
        for (int i2 = 0; i2 < size; i2++) {
            length += ((byte[]) list.get(i2)).length;
        }
        return jw7Var.p + length;
    }

    @Override // defpackage.p6b
    public final int A0(wg6 wg6Var, jw7 jw7Var) {
        boolean z;
        int i = 0;
        if (!gkb.j(jw7Var.o)) {
            return pe1.f(0, 0, 0, 0);
        }
        int i2 = 1;
        boolean z2 = jw7Var.s != null;
        Context context = this.l1;
        List listG0 = G0(context, wg6Var, jw7Var, z2, false);
        if (z2 && listG0.isEmpty()) {
            listG0 = G0(context, wg6Var, jw7Var, false, false);
        }
        if (listG0.isEmpty()) {
            return pe1.f(1, 0, 0, 0);
        }
        int i3 = jw7Var.P;
        if (i3 != 0 && i3 != 2) {
            return pe1.f(2, 0, 0, 0);
        }
        g6b g6bVar = (g6b) listG0.get(0);
        boolean zE = g6bVar.e(context, jw7Var);
        if (zE) {
            z = true;
        } else {
            for (int i4 = 1; i4 < listG0.size(); i4++) {
                g6b g6bVar2 = (g6b) listG0.get(i4);
                if (g6bVar2.e(context, jw7Var)) {
                    z = false;
                    zE = true;
                    g6bVar = g6bVar2;
                    break;
                }
            }
            z = true;
        }
        int i5 = zE ? 4 : 3;
        int i6 = 8;
        int i7 = g6bVar.f(jw7Var) ? 16 : 8;
        int i8 = g6bVar.g ? 64 : 0;
        int i9 = z ? FreeTypeConstants.FT_LOAD_PEDANTIC : 0;
        if ("video/dolby-vision".equals(jw7Var.o) && !tpk.c(context)) {
            i9 = FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
        }
        if (zE) {
            List listG02 = G0(context, wg6Var, jw7Var, z2, true);
            if (!listG02.isEmpty()) {
                HashMap map = s6b.a;
                ArrayList arrayList = new ArrayList(listG02);
                Collections.sort(arrayList, new u84(i2, new u95(context, i6, jw7Var)));
                g6b g6bVar3 = (g6b) arrayList.get(0);
                if (g6bVar3.e(context, jw7Var) && g6bVar3.f(jw7Var)) {
                    i = 32;
                }
            }
        }
        return i5 | i7 | i | i8 | i9;
    }

    @Override // defpackage.p6b, defpackage.pe1
    public final void C(float f, float f3) throws ExoPlaybackException {
        super.C(f, f3);
        xui xuiVar = this.z1;
        if (xuiVar != null) {
            xuiVar.k(f);
        } else {
            this.q1.h(f);
        }
        mui muiVar = this.u1;
        if (muiVar != null) {
            muiVar.c(f);
        }
    }

    @Override // defpackage.pe1
    public final boolean F(long j) {
        if (this.U0 == -9223372036854775807L || j < this.O1) {
            return false;
        }
        long j2 = this.c1;
        return j2 == -9223372036854775807L || j > j2;
    }

    @Override // defpackage.p6b
    public final to5 I(g6b g6bVar, jw7 jw7Var, jw7 jw7Var2, boolean z) {
        int i;
        to5 to5VarB = g6bVar.b(jw7Var, jw7Var2);
        float f = jw7Var.z;
        float f3 = jw7Var2.z;
        int i2 = to5VarB.e;
        z4 z4Var = this.w1;
        z4Var.getClass();
        if (jw7Var2.v > z4Var.a || jw7Var2.w > z4Var.b) {
            i2 |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
        }
        if (H0(g6bVar, jw7Var2) > z4Var.c) {
            i2 |= 64;
        }
        if (this.I1 != Integer.MIN_VALUE && (i = Build.VERSION.SDK_INT) < 31 && ((i != 30 || Build.MODEL.startsWith("MiTV")) && f != -1.0f && f3 != -1.0f && (!g6bVar.f || !z))) {
            if (Math.abs((Math.max(f3, f) / Math.min(f3, f)) - Math.round(r10)) > 0.01f) {
                i2 |= 65536;
            }
        }
        int i3 = i2;
        return new to5(g6bVar.a, jw7Var, jw7Var2, i3 != 0 ? 0 : to5VarB.d, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.Surface I0(defpackage.g6b r6) {
        /*
            r5 = this;
            xui r0 = r5.z1
            if (r0 == 0) goto L9
            android.view.Surface r5 = r0.c()
            return r5
        L9:
            android.view.Surface r0 = r5.D1
            if (r0 == 0) goto Le
            return r0
        Le:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            r2 = 0
            if (r0 < r1) goto L1a
            boolean r0 = r6.h
            if (r0 == 0) goto L1a
            return r2
        L1a:
            boolean r0 = r5.Q0(r6)
            defpackage.fd9.M(r0)
            i3d r0 = r5.E1
            if (r0 == 0) goto L32
            boolean r1 = r0.E
            boolean r3 = r6.f
            if (r1 == r3) goto L32
            if (r0 == 0) goto L32
            r0.release()
            r5.E1 = r2
        L32:
            i3d r0 = r5.E1
            if (r0 != 0) goto La9
            boolean r6 = r6.f
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L45
            boolean r2 = defpackage.i3d.a()
            if (r2 == 0) goto L43
            goto L47
        L43:
            r2 = r1
            goto L48
        L45:
            int r2 = defpackage.i3d.H
        L47:
            r2 = r0
        L48:
            defpackage.fd9.M(r2)
            h3d r2 = new h3d
            java.lang.String r3 = "ExoPlayer:PlaceholderSurface"
            r2.<init>(r3)
            if (r6 == 0) goto L57
            int r6 = defpackage.i3d.H
            goto L58
        L57:
            r6 = r1
        L58:
            r2.start()
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r4 = r2.getLooper()
            r3.<init>(r4, r2)
            r2.F = r3
            ui6 r4 = new ui6
            r4.<init>(r3)
            r2.E = r4
            monitor-enter(r2)
            android.os.Handler r3 = r2.F     // Catch: java.lang.Throwable -> L87
            android.os.Message r6 = r3.obtainMessage(r0, r6, r1)     // Catch: java.lang.Throwable -> L87
            r6.sendToTarget()     // Catch: java.lang.Throwable -> L87
        L77:
            i3d r6 = r2.I     // Catch: java.lang.Throwable -> L87
            if (r6 != 0) goto L8b
            java.lang.RuntimeException r6 = r2.H     // Catch: java.lang.Throwable -> L87
            if (r6 != 0) goto L8b
            java.lang.Error r6 = r2.G     // Catch: java.lang.Throwable -> L87
            if (r6 != 0) goto L8b
            r2.wait()     // Catch: java.lang.Throwable -> L87 java.lang.InterruptedException -> L89
            goto L77
        L87:
            r5 = move-exception
            goto La7
        L89:
            r1 = r0
            goto L77
        L8b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L87
            if (r1 == 0) goto L95
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r6.interrupt()
        L95:
            java.lang.RuntimeException r6 = r2.H
            if (r6 != 0) goto La6
            java.lang.Error r6 = r2.G
            if (r6 != 0) goto La5
            i3d r6 = r2.I
            r6.getClass()
            r5.E1 = r6
            goto La9
        La5:
            throw r6
        La6:
            throw r6
        La7:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L87
            throw r5
        La9:
            i3d r5 = r5.E1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x6b.I0(g6b):android.view.Surface");
    }

    @Override // defpackage.p6b
    public final MediaCodecDecoderException J(IllegalStateException illegalStateException, g6b g6bVar) {
        Surface surface = this.D1;
        MediaCodecVideoDecoderException mediaCodecVideoDecoderException = new MediaCodecVideoDecoderException(illegalStateException, g6bVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return mediaCodecVideoDecoderException;
    }

    public final boolean J0(g6b g6bVar) {
        if (this.z1 != null) {
            return true;
        }
        Surface surface = this.D1;
        if (surface == null || !surface.isValid()) {
            return (Build.VERSION.SDK_INT >= 35 && g6bVar.h) || Q0(g6bVar);
        }
        return true;
    }

    public final boolean K0(ro5 ro5Var) {
        if (l() || ro5Var.c(536870912)) {
            return true;
        }
        long j = this.b2;
        return j == -9223372036854775807L || j - (ro5Var.K - this.b1.c) <= 100000;
    }

    public final void L0() {
        if (this.K1 > 0) {
            this.K.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.J1;
            int i = this.K1;
            dke dkeVar = this.n1;
            Handler handler = (Handler) dkeVar.E;
            if (handler != null) {
                handler.post(new sui(dkeVar, i, j));
            }
            this.K1 = 0;
            this.J1 = jElapsedRealtime;
        }
    }

    public final void M0() {
        d6b d6bVar;
        if (this.W1 && (d6bVar = this.r0) != null) {
            this.Y1 = new w6b(this, d6bVar);
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                d6bVar.b(bundle);
            }
        }
    }

    public final void N0(d6b d6bVar, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        d6bVar.h(i, j);
        Trace.endSection();
        this.a1.e++;
        this.L1 = 0;
        if (this.z1 == null) {
            yui yuiVar = this.T1;
            boolean zEquals = yuiVar.equals(yui.d);
            dke dkeVar = this.n1;
            if (!zEquals && !yuiVar.equals(this.U1)) {
                this.U1 = yuiVar;
                dkeVar.E(yuiVar);
            }
            lui luiVar = this.q1;
            boolean z = luiVar.e != 3;
            luiVar.e = 3;
            luiVar.l.getClass();
            luiVar.g = tpi.C(SystemClock.elapsedRealtime());
            if (!z || (surface = this.D1) == null) {
                return;
            }
            Handler handler = (Handler) dkeVar.E;
            if (handler != null) {
                handler.post(new uui(dkeVar, surface, SystemClock.elapsedRealtime(), 0));
            }
            this.G1 = true;
        }
    }

    public final void O0(Object obj) throws ExoPlaybackException {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.D1;
        dke dkeVar = this.n1;
        if (surface2 == surface) {
            if (surface != null) {
                yui yuiVar = this.U1;
                if (yuiVar != null) {
                    dkeVar.E(yuiVar);
                }
                Surface surface3 = this.D1;
                if (surface3 == null || !this.G1 || (handler = (Handler) dkeVar.E) == null) {
                    return;
                }
                handler.post(new uui(dkeVar, surface3, SystemClock.elapsedRealtime(), 0));
                return;
            }
            return;
        }
        this.D1 = surface;
        xui xuiVar = this.z1;
        lui luiVar = this.q1;
        if (xuiVar == null) {
            luiVar.g(surface);
        }
        this.G1 = false;
        int i = this.L;
        d6b d6bVar = this.r0;
        if (d6bVar != null && this.z1 == null) {
            g6b g6bVar = this.y0;
            g6bVar.getClass();
            if (!J0(g6bVar) || this.x1) {
                o0();
                Y();
            } else {
                Surface surfaceI0 = I0(g6bVar);
                if (surfaceI0 != null) {
                    d6bVar.s(surfaceI0);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        e0.b();
                        return;
                    }
                    d6bVar.g();
                }
            }
        }
        if (surface != null) {
            yui yuiVar2 = this.U1;
            if (yuiVar2 != null) {
                dkeVar.E(yuiVar2);
            }
        } else {
            this.U1 = null;
            xui xuiVar2 = this.z1;
            if (xuiVar2 != null) {
                xuiVar2.l();
            }
        }
        if (i == 2) {
            xui xuiVar3 = this.z1;
            if (xuiVar3 != null) {
                xuiVar3.s(true);
            } else {
                luiVar.c(true);
            }
        }
        M0();
    }

    @Override // defpackage.p6b
    public final int P(ro5 ro5Var) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.N1 == null && !this.W1) || ro5Var.K >= this.P || K0(ro5Var)) ? 0 : 32;
        }
        return 0;
    }

    public final boolean P0(long j, long j2, boolean z, boolean z2) throws ExoPlaybackException {
        if (this.z1 != null && this.m1) {
            j2 -= -this.a2;
        }
        if (j < -500000 && !z) {
            b4f b4fVar = this.M;
            b4fVar.getClass();
            int iH = b4fVar.h(j2 - this.O);
            if (iH != 0) {
                this.O1 = j2;
                qo5 qo5Var = this.a1;
                PriorityQueue priorityQueue = this.v1;
                if (z2) {
                    int i = qo5Var.d + iH;
                    qo5Var.d = i;
                    qo5Var.f += this.M1;
                    qo5Var.d = priorityQueue.size() + i;
                } else {
                    qo5Var.j++;
                    S0(priorityQueue.size() + iH, this.M1);
                }
                if (this.r0 != null) {
                    if (y0()) {
                        o0();
                        Y();
                    } else if (w0()) {
                        N();
                    } else {
                        this.f1 = true;
                    }
                }
                xui xuiVar = this.z1;
                if (xuiVar != null) {
                    xuiVar.p(false);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.p6b
    public final float Q(float f, jw7 jw7Var, jw7[] jw7VarArr) {
        g6b g6bVar;
        float fMax = -1.0f;
        for (jw7 jw7Var2 : jw7VarArr) {
            float f3 = jw7Var2.z;
            if (f3 != -1.0f) {
                fMax = Math.max(fMax, f3);
            }
        }
        float f4 = fMax == -1.0f ? -1.0f : fMax * f;
        if (this.N1 == null || (g6bVar = this.y0) == null) {
            return f4;
        }
        int i = jw7Var.v;
        int i2 = jw7Var.w;
        float f5 = -3.4028235E38f;
        if (g6bVar.i) {
            float f6 = g6bVar.l;
            if (f6 != -3.4028235E38f && g6bVar.j == i && g6bVar.k == i2) {
                f5 = f6;
            } else {
                f5 = 1024.0f;
                if (!g6bVar.g(1024.0d, i, i2)) {
                    float f7 = MTTypesetterKt.kLineSkipLimitMultiplier;
                    while (true) {
                        float f8 = f5 - f7;
                        if (Math.abs(f8) <= 5.0f) {
                            break;
                        }
                        float f9 = (f8 / 2.0f) + f7;
                        if (g6bVar.g(f9, i, i2)) {
                            f7 = f9;
                        } else {
                            f5 = f9;
                        }
                    }
                    f5 = f7;
                }
                g6bVar.l = f5;
                g6bVar.j = i;
                g6bVar.k = i2;
            }
        }
        return f4 != -1.0f ? Math.max(f4, f5) : f5;
    }

    public final boolean Q0(g6b g6bVar) {
        if (this.W1 || E0(g6bVar.a)) {
            return false;
        }
        return !g6bVar.f || i3d.a();
    }

    @Override // defpackage.p6b
    public final ArrayList R(wg6 wg6Var, jw7 jw7Var, boolean z) {
        boolean z2 = this.W1;
        Context context = this.l1;
        List listG0 = G0(context, wg6Var, jw7Var, z, z2);
        HashMap map = s6b.a;
        ArrayList arrayList = new ArrayList(listG0);
        Collections.sort(arrayList, new u84(1, new u95(context, 8, jw7Var)));
        return arrayList;
    }

    public final void R0(d6b d6bVar, int i) {
        Trace.beginSection("skipVideoBuffer");
        d6bVar.e(i);
        Trace.endSection();
        this.a1.f++;
    }

    public final void S0(int i, int i2) {
        qo5 qo5Var = this.a1;
        qo5Var.h += i;
        int i3 = i + i2;
        qo5Var.g += i3;
        this.K1 += i3;
        int i4 = this.L1 + i3;
        this.L1 = i4;
        qo5Var.i = Math.max(i4, qo5Var.i);
        int i5 = this.o1;
        if (i5 <= 0 || this.K1 < i5) {
            return;
        }
        L0();
    }

    public final void T0(z7b z7bVar) {
        mqh mqhVar = this.T;
        if (mqhVar.p()) {
            this.b2 = -9223372036854775807L;
            return;
        }
        int iB = mqhVar.b(z7bVar.a);
        if (iB == -1) {
            this.b2 = -9223372036854775807L;
        } else {
            this.b2 = mqhVar.f(iB, new jqh(), false).d;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0131, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0134, code lost:
    
        r15 = r9;
     */
    @Override // defpackage.p6b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.h2f U(defpackage.g6b r25, defpackage.jw7 r26, android.media.MediaCrypto r27, float r28) {
        /*
            Method dump skipped, instruction units count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x6b.U(g6b, jw7, android.media.MediaCrypto, float):h2f");
    }

    public final void U0(long j) {
        qo5 qo5Var = this.a1;
        qo5Var.k += j;
        qo5Var.l++;
        this.Q1 += j;
        this.R1++;
    }

    @Override // defpackage.p6b
    public final void V(ro5 ro5Var) {
        if (this.y1) {
            ByteBuffer byteBuffer = ro5Var.L;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        d6b d6bVar = this.r0;
                        d6bVar.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        d6bVar.b(bundle);
                    }
                }
            }
        }
    }

    @Override // defpackage.p6b
    public final boolean a0(jw7 jw7Var) throws ExoPlaybackException {
        xui xuiVar = this.z1;
        if (xuiVar == null || xuiVar.b()) {
            return true;
        }
        try {
            return this.z1.o(jw7Var);
        } catch (VideoSink$VideoSinkException e) {
            throw this.g(e, jw7Var, false, 7000);
        }
    }

    @Override // defpackage.p6b
    public final void b0(Exception exc) {
        ysj.k("MediaCodecVideoRenderer", "Video codec error", exc);
        dke dkeVar = this.n1;
        Handler handler = (Handler) dkeVar.E;
        if (handler != null) {
            handler.post(new sui(dkeVar, exc, 1));
        }
    }

    @Override // defpackage.p6b
    public final void c0(long j, long j2, String str) {
        String str2;
        dke dkeVar = this.n1;
        Handler handler = (Handler) dkeVar.E;
        if (handler != null) {
            str2 = str;
            handler.post(new sui(dkeVar, str2, j, j2));
        } else {
            str2 = str;
        }
        this.x1 = E0(str2);
        g6b g6bVar = this.y0;
        g6bVar.getClass();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(g6bVar.b)) {
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = g6bVar.d.profileLevels;
            if (codecProfileLevelArr == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (codecProfileLevelArr[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.y1 = z;
        M0();
    }

    @Override // defpackage.p6b, defpackage.pe1, defpackage.b7d
    public final void d(int i, Object obj) throws ExoPlaybackException {
        if (i == 1) {
            O0(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            jui juiVar = (jui) obj;
            this.Z1 = juiVar;
            xui xuiVar = this.z1;
            if (xuiVar != null) {
                xuiVar.u(juiVar);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.X1 != iIntValue) {
                this.X1 = iIntValue;
                if (this.W1) {
                    o0();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.H1 = iIntValue2;
            d6b d6bVar = this.r0;
            if (d6bVar != null) {
                d6bVar.o(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.I1 = iIntValue3;
            xui xuiVar2 = this.z1;
            if (xuiVar2 != null) {
                xuiVar2.j(iIntValue3);
                return;
            }
            qui quiVar = this.q1.b;
            if (quiVar.j == iIntValue3) {
                return;
            }
            quiVar.j = iIntValue3;
            quiVar.d(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(kui.a)) {
                xui xuiVar3 = this.z1;
                if (xuiVar3 == null || !xuiVar3.b()) {
                    return;
                }
                this.z1.v();
                return;
            }
            this.C1 = list;
            xui xuiVar4 = this.z1;
            if (xuiVar4 != null) {
                xuiVar4.q(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            h8g h8gVar = (h8g) obj;
            if (h8gVar.a == 0 || h8gVar.b == 0) {
                return;
            }
            this.F1 = h8gVar;
            xui xuiVar5 = this.z1;
            if (xuiVar5 != null) {
                Surface surface = this.D1;
                surface.getClass();
                xuiVar5.w(surface, h8gVar);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.V1 = ((Integer) obj).intValue();
                d6b d6bVar2 = this.r0;
                if (d6bVar2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.V1));
                    d6bVar2.b(bundle);
                }
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                Surface surface2 = this.D1;
                O0(null);
                obj.getClass();
                ((x6b) obj).d(1, surface2);
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                boolean z = this.N1 != null;
                taf tafVar = (taf) obj;
                this.N1 = tafVar;
                if (z != (tafVar != null)) {
                    B0(this.s0);
                }
                break;
            default:
                super.d(i, obj);
                break;
        }
    }

    @Override // defpackage.p6b
    public final void d0(p34 p34Var) {
        dke dkeVar = this.n1;
        Handler handler = (Handler) dkeVar.E;
        if (handler != null) {
            handler.post(new yw5(dkeVar, 29, p34Var));
        }
    }

    @Override // defpackage.p6b
    public final void e0(String str) {
        dke dkeVar = this.n1;
        Handler handler = (Handler) dkeVar.E;
        if (handler != null) {
            handler.post(new sui(dkeVar, str, 2));
        }
    }

    @Override // defpackage.p6b
    public final to5 f0(qb5 qb5Var) throws ExoPlaybackException {
        to5 to5VarF0 = super.f0(qb5Var);
        jw7 jw7Var = (jw7) qb5Var.F;
        jw7Var.getClass();
        dke dkeVar = this.n1;
        Handler handler = (Handler) dkeVar.E;
        if (handler != null) {
            handler.post(new sui(dkeVar, jw7Var, to5VarF0));
        }
        mui muiVar = this.u1;
        if (muiVar != null) {
            muiVar.b();
        }
        return to5VarF0;
    }

    @Override // defpackage.p6b
    public final void g0(jw7 jw7Var, MediaFormat mediaFormat) {
        int integer;
        int i;
        d6b d6bVar = this.r0;
        if (d6bVar != null) {
            d6bVar.o(this.H1);
        }
        if (this.W1) {
            i = jw7Var.v;
            integer = jw7Var.w;
        } else {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i = integer2;
        }
        float f = jw7Var.B;
        int i2 = jw7Var.A;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer;
            integer = i;
            i = i3;
        }
        this.T1 = new yui(f, i, integer);
        xui xuiVar = this.z1;
        if (xuiVar == null || !this.c2) {
            this.q1.f(jw7Var.z);
        } else {
            iw7 iw7VarA = jw7Var.a();
            iw7VarA.u = i;
            iw7VarA.v = integer;
            iw7VarA.A = f;
            jw7 jw7Var2 = new jw7(iw7VarA);
            int i4 = this.B1;
            List list = this.C1;
            if (list == null) {
                iz8 iz8Var = nz8.F;
                list = vde.I;
            }
            xuiVar.g(jw7Var2, this.b1.b, i4, list);
            this.B1 = 2;
        }
        this.c2 = false;
    }

    @Override // defpackage.pe1
    public final void h() {
        xui xuiVar = this.z1;
        if (xuiVar == null) {
            lui luiVar = this.q1;
            if (luiVar.e == 0) {
                luiVar.e = 1;
                return;
            }
            return;
        }
        int i = this.B1;
        if (i == 0 || i == 1) {
            this.B1 = 0;
        } else {
            xuiVar.x();
        }
    }

    @Override // defpackage.p6b
    public final void i0(long j) {
        super.i0(j);
        if (this.W1) {
            return;
        }
        this.M1--;
    }

    @Override // defpackage.p6b
    public final void j0() {
        xui xuiVar = this.z1;
        if (xuiVar != null) {
            xuiVar.i();
            if (this.a2 == -9223372036854775807L) {
                this.a2 = this.b1.b;
            }
            this.z1.h(-this.a2);
        } else {
            this.q1.e(2);
        }
        this.c2 = true;
        M0();
    }

    @Override // defpackage.pe1
    public final String k() {
        return "MediaCodecVideoRenderer";
    }

    @Override // defpackage.p6b
    public final void k0(ro5 ro5Var) {
        ByteBuffer byteBuffer;
        qb5 qb5Var = this.s1;
        if (qb5Var != null) {
            g6b g6bVar = this.y0;
            g6bVar.getClass();
            if (g6bVar.b.equals("video/av01") && ro5Var.c(1) && (byteBuffer = ro5Var.I) != null) {
                int iPosition = byteBuffer.position();
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, iPosition + 500));
                ByteBuffer byteBuffer2 = (ByteBuffer) qb5Var.E;
                byteBuffer2.clear();
                byteBuffer2.put(byteBuffer);
                byteBuffer2.flip();
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
            }
        }
        this.d2 = 0;
        int iP = P(ro5Var);
        if ((Build.VERSION.SDK_INT < 34 || (iP & 32) == 0) && !this.W1) {
            this.M1++;
        }
    }

    @Override // defpackage.pe1
    public final boolean m() {
        if (!this.W0) {
            return false;
        }
        xui xuiVar = this.z1;
        return xuiVar == null || xuiVar.d();
    }

    @Override // defpackage.p6b
    public final boolean m0(long j, long j2, d6b d6bVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, jw7 jw7Var) {
        int i4;
        d6bVar.getClass();
        long j4 = j3 - this.b1.c;
        int i5 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.v1;
            Long l = (Long) priorityQueue.peek();
            if (l == null || l.longValue() >= j3) {
                break;
            }
            i5++;
            priorityQueue.poll();
        }
        S0(i5, 0);
        xui xuiVar = this.z1;
        if (xuiVar != null) {
            if (!z || z2) {
                return xuiVar.n(j3, new u6b(this, d6bVar, i, j4));
            }
            R0(d6bVar, i);
            return true;
        }
        int iA = this.q1.a(j3, j, j2, this.b1.b, z, z2, this.r1);
        rv1 rv1Var = this.r1;
        mui muiVar = this.u1;
        if (muiVar != null && iA != 5 && iA != 4) {
            muiVar.a(j3, rv1Var.a);
        }
        if (iA == 0) {
            this.K.getClass();
            long jNanoTime = System.nanoTime();
            jui juiVar = this.Z1;
            if (juiVar != null) {
                juiVar.b(j4, jNanoTime, jw7Var, this.t0);
            }
            N0(d6bVar, i, jNanoTime);
            U0(rv1Var.a);
            return true;
        }
        if (iA == 1) {
            long j5 = rv1Var.b;
            long j6 = rv1Var.a;
            if (j5 == this.S1) {
                R0(d6bVar, i);
            } else {
                jui juiVar2 = this.Z1;
                if (juiVar2 != null) {
                    i4 = i;
                    juiVar2.b(j4, j5, jw7Var, this.t0);
                } else {
                    i4 = i;
                }
                N0(d6bVar, i4, j5);
            }
            U0(j6);
            this.S1 = j5;
            return true;
        }
        if (iA == 2) {
            Trace.beginSection("dropVideoBuffer");
            d6bVar.e(i);
            Trace.endSection();
            S0(0, 1);
            U0(rv1Var.a);
            return true;
        }
        if (iA == 3) {
            R0(d6bVar, i);
            U0(rv1Var.a);
            return true;
        }
        if (iA != 4 && iA != 5) {
            sz6.j(String.valueOf(iA));
        }
        return false;
    }

    @Override // defpackage.pe1
    public final boolean o() {
        boolean z;
        boolean zA;
        if (this.i0 == null) {
            z = false;
        } else {
            if (l()) {
                zA = this.R;
            } else {
                b4f b4fVar = this.M;
                b4fVar.getClass();
                zA = b4fVar.a();
            }
            if (!zA && this.H0 < 0) {
                if (this.F0 != -9223372036854775807L) {
                    this.K.getClass();
                    if (SystemClock.elapsedRealtime() < this.F0) {
                    }
                }
                z = false;
            }
            z = true;
        }
        xui xuiVar = this.z1;
        if (xuiVar != null) {
            return xuiVar.t(z);
        }
        if (z && (this.r0 == null || this.W1)) {
            return true;
        }
        return this.q1.b(z);
    }

    @Override // defpackage.p6b, defpackage.pe1
    public final void p() {
        dke dkeVar = this.n1;
        this.U1 = null;
        this.b2 = -9223372036854775807L;
        M0();
        this.G1 = false;
        this.Y1 = null;
        int i = 1;
        this.P1 = true;
        try {
            super.p();
            qo5 qo5Var = this.a1;
            dkeVar.getClass();
            synchronized (qo5Var) {
            }
            Handler handler = (Handler) dkeVar.E;
            if (handler != null) {
                handler.post(new tui(dkeVar, i, qo5Var));
            }
            dkeVar.E(yui.d);
        } catch (Throwable th) {
            qo5 qo5Var2 = this.a1;
            dkeVar.getClass();
            synchronized (qo5Var2) {
                Handler handler2 = (Handler) dkeVar.E;
                if (handler2 != null) {
                    handler2.post(new tui(dkeVar, i, qo5Var2));
                }
                dkeVar.E(yui.d);
                throw th;
            }
        }
    }

    @Override // defpackage.p6b
    public final void p0() {
        xui xuiVar = this.z1;
        if (xuiVar != null) {
            xuiVar.i();
        } else {
            long j = this.b1.f;
        }
    }

    @Override // defpackage.pe1
    public final void q(boolean z, boolean z2) {
        xui xuiVar;
        this.a1 = new qo5();
        hge hgeVar = this.H;
        hgeVar.getClass();
        boolean z3 = hgeVar.b;
        fd9.M((z3 && this.X1 == 0) ? false : true);
        if (this.W1 != z3) {
            this.W1 = z3;
            o0();
        }
        qo5 qo5Var = this.a1;
        dke dkeVar = this.n1;
        Handler handler = (Handler) dkeVar.E;
        if (handler != null) {
            handler.post(new sui(dkeVar, qo5Var, 5));
        }
        boolean z4 = this.A1;
        lui luiVar = this.q1;
        if (!z4) {
            if (this.C1 != null && this.z1 == null) {
                m6d m6dVar = new m6d(this.l1, luiVar);
                m6dVar.d = true;
                long j = this.t1;
                m6dVar.g = j != -9223372036854775807L ? -j : -9223372036854775807L;
                g1h g1hVar = this.K;
                g1hVar.getClass();
                m6dVar.e = g1hVar;
                fd9.M(!m6dVar.f);
                if (m6dVar.c == null) {
                    m6dVar.c = new p6d();
                }
                r6d r6dVar = new r6d(m6dVar);
                m6dVar.f = true;
                if (1 >= r6dVar.p) {
                    r6dVar.p = 1;
                }
                SparseArray sparseArray = r6dVar.c;
                if (tpi.i(sparseArray, 0)) {
                    xuiVar = (xui) sparseArray.get(0);
                } else {
                    n6d n6dVar = new n6d(r6dVar, r6dVar.a);
                    r6dVar.g.add(n6dVar);
                    sparseArray.put(0, n6dVar);
                    xuiVar = n6dVar;
                }
                this.z1 = xuiVar;
            }
            this.A1 = true;
        }
        xui xuiVar2 = this.z1;
        if (xuiVar2 == null) {
            g1h g1hVar2 = this.K;
            g1hVar2.getClass();
            luiVar.l = g1hVar2;
            luiVar.e(!z2 ? 1 : 0);
            return;
        }
        xuiVar2.m(new t6b(this));
        jui juiVar = this.Z1;
        if (juiVar != null) {
            this.z1.u(juiVar);
        }
        if (this.D1 != null && !this.F1.equals(h8g.c)) {
            this.z1.w(this.D1, this.F1);
        }
        this.z1.j(this.I1);
        this.z1.k(this.p0);
        List list = this.C1;
        if (list != null) {
            this.z1.q(list);
        }
        this.B1 = !z2 ? 1 : 0;
        this.e1 = true;
    }

    @Override // defpackage.p6b, defpackage.pe1
    public final void r(long j, boolean z, boolean z2) throws ExoPlaybackException {
        xui xuiVar = this.z1;
        if (xuiVar != null && !z) {
            xuiVar.p(true);
        }
        if (z2) {
            this.O1 = j;
        }
        super.r(j, z, z2);
        xui xuiVar2 = this.z1;
        lui luiVar = this.q1;
        if (xuiVar2 == null) {
            luiVar.b.b();
            luiVar.h = -9223372036854775807L;
            luiVar.f = -9223372036854775807L;
            luiVar.e = Math.min(luiVar.e, 1);
            luiVar.i = -9223372036854775807L;
            luiVar.n = false;
        }
        mui muiVar = this.u1;
        if (muiVar != null) {
            muiVar.b();
        }
        if (z) {
            xui xuiVar3 = this.z1;
            if (xuiVar3 != null) {
                xuiVar3.s(false);
            } else {
                luiVar.c(false);
            }
        }
        M0();
        this.L1 = 0;
    }

    @Override // defpackage.p6b
    public final void r0() {
        super.r0();
        this.v1.clear();
        this.M1 = 0;
        this.d2 = 0;
        this.P1 = false;
        qb5 qb5Var = this.s1;
        if (qb5Var != null) {
            qb5Var.F = null;
            ByteBuffer byteBuffer = (ByteBuffer) qb5Var.E;
            byteBuffer.position(byteBuffer.limit());
        }
    }

    @Override // defpackage.pe1
    public final void s() {
        xui xuiVar = this.z1;
        if (xuiVar == null || !this.m1) {
            return;
        }
        xuiVar.a();
    }

    @Override // defpackage.pe1
    public final void t() {
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
            this.A1 = false;
            this.a2 = -9223372036854775807L;
            i3d i3dVar = this.E1;
            if (i3dVar != null) {
                i3dVar.release();
                this.E1 = null;
            }
        }
    }

    @Override // defpackage.pe1
    public final void u() {
        this.K1 = 0;
        this.K.getClass();
        this.J1 = SystemClock.elapsedRealtime();
        this.Q1 = 0L;
        this.R1 = 0;
        xui xuiVar = this.z1;
        if (xuiVar != null) {
            xuiVar.f();
        } else {
            this.q1.d();
        }
    }

    @Override // defpackage.pe1
    public final void v() {
        L0();
        int i = this.R1;
        if (i != 0) {
            long j = this.Q1;
            dke dkeVar = this.n1;
            Handler handler = (Handler) dkeVar.E;
            if (handler != null) {
                handler.post(new sui(dkeVar, j, i));
            }
            this.Q1 = 0L;
            this.R1 = 0;
        }
        xui xuiVar = this.z1;
        if (xuiVar != null) {
            xuiVar.e();
        } else {
            lui luiVar = this.q1;
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
        mui muiVar = this.u1;
        if (muiVar != null) {
            muiVar.b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013e  */
    @Override // defpackage.p6b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v0(defpackage.ro5 r15) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x6b.v0(ro5):boolean");
    }

    @Override // defpackage.p6b, defpackage.pe1
    public final void w(jw7[] jw7VarArr, long j, long j2, z7b z7bVar) {
        super.w(jw7VarArr, j, j2, z7bVar);
        T0(z7bVar);
        mui muiVar = this.u1;
        if (muiVar != null) {
            muiVar.b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.p6b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean w0() {
        /*
            r12 = this;
            jw7 r0 = r12.s0
            long r1 = r12.b2
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L27
            r8 = 1
            long r8 = r8 + r1
            o6b r5 = r12.b1
            long r10 = r5.c
            long r10 = r10 + r1
            long r1 = r12.g1
            long r1 = r1 + r8
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r8 = r8 - r10
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 <= 0) goto L25
            goto L27
        L25:
            r1 = r6
            goto L28
        L27:
            r1 = r7
        L28:
            taf r2 = r12.N1
            if (r2 != 0) goto L2d
            goto L47
        L2d:
            boolean r2 = r12.P1
            if (r2 != 0) goto L47
            boolean r2 = r12.W1
            if (r2 != 0) goto L47
            if (r0 == 0) goto L3b
            int r0 = r0.q
            if (r0 > 0) goto L47
        L3b:
            if (r1 != 0) goto L47
            o6b r12 = r12.b1
            long r0 = r12.f
            int r12 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r12 == 0) goto L46
            goto L47
        L46:
            return r6
        L47:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x6b.w0():boolean");
    }

    @Override // defpackage.pe1
    public final void x() {
        z7b z7bVar = this.U;
        if (z7bVar != null) {
            T0(z7bVar);
        }
    }

    @Override // defpackage.p6b
    public final boolean x0(g6b g6bVar) {
        return J0(g6bVar);
    }

    @Override // defpackage.p6b
    public final boolean y0() {
        g6b g6bVar = this.y0;
        if (this.z1 != null && g6bVar != null) {
            String str = g6bVar.a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.y0();
    }

    @Override // defpackage.p6b, defpackage.pe1
    public final void z(long j, long j2) throws ExoPlaybackException {
        xui xuiVar = this.z1;
        if (xuiVar != null) {
            try {
                xuiVar.r(j, j2);
            } catch (VideoSink$VideoSinkException e) {
                throw g(e, e.E, false, 7001);
            }
        }
        super.z(j, j2);
    }
}
