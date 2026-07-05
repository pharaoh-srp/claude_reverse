package defpackage;

import android.media.AudioTrack;
import com.anthropic.claude.core.telemetry.SilentException;
import com.pvporbit.freetype.FreeTypeConstants;
import java.nio.ByteBuffer;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class x51 {
    public final int a;
    public final int b;
    public final isc c;
    public final AudioTrack d;
    public final ReentrantLock e;
    public volatile boolean f;
    public volatile int g;
    public volatile int h;
    public volatile gn1 i;
    public volatile fp j;
    public final r09 k;
    public final ByteBuffer l;
    public volatile zy1 m;

    /* JADX WARN: Multi-variable type inference failed */
    public x51(int i, int i2) {
        ozf ozfVar = ozf.F;
        this.a = i;
        this.b = i2;
        Object[] objArr = 0;
        isc iscVar = new isc(0);
        this.c = iscVar;
        int minBufferSize = AudioTrack.getMinBufferSize(i, 4, 2);
        if (minBufferSize <= 0) {
            SilentException.a(new SilentException(vb7.q("AudioTrack.getMinBufferSize returned ", " for ", minBufferSize, i, "Hz; using fallback")), ozfVar, false, 2);
        }
        Object objH = lvk.h(new t51(this, lvk.f(minBufferSize, i), objArr == true ? 1 : 0));
        Throwable thA = jre.a(objH);
        if (thA != null) {
            SilentException.a(new SilentException(grc.u("AudioTrack.Builder.build() threw for ", i, "Hz; voice output unavailable"), thA), ozfVar, false, 2);
        }
        AudioTrack audioTrack = null;
        AudioTrack audioTrack2 = (AudioTrack) (objH instanceof hre ? null : objH);
        if (audioTrack2 != null) {
            if (audioTrack2.getState() != 1) {
                SilentException.a(new SilentException(vb7.q("AudioTrack.Builder.build() returned state ", " for ", audioTrack2.getState(), i, "Hz; voice output unavailable")), ozfVar, false, 2);
                audioTrack2.release();
            } else {
                iscVar.i(audioTrack2.getAudioSessionId());
                audioTrack = audioTrack2;
            }
        }
        this.d = audioTrack;
        this.e = new ReentrantLock();
        this.f = audioTrack == null;
        this.k = new r09();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        byteBufferAllocateDirect.getClass();
        this.l = byteBufferAllocateDirect;
        this.m = wd6.P(Integer.MAX_VALUE, 4, py1.F);
    }

    public final void a() {
        int underrunCount;
        int underrunCount2;
        boolean z;
        fp fpVar;
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            AudioTrack audioTrack = this.d;
            if (this.f || audioTrack == null) {
                underrunCount = 0;
                underrunCount2 = 0;
                z = false;
            } else {
                underrunCount2 = audioTrack.getUnderrunCount();
                this.m.d(null);
                this.m = wd6.P(Integer.MAX_VALUE, 4, py1.F);
                if (audioTrack.getPlayState() == 3) {
                    audioTrack.pause();
                    audioTrack.flush();
                }
                audioTrack.setNotificationMarkerPosition(0);
                audioTrack.setPlaybackPositionUpdateListener(null);
                underrunCount = audioTrack.getUnderrunCount();
                this.h = underrunCount;
                z = true;
            }
            this.g = 0;
            this.k.a();
            reentrantLock.unlock();
            if (!z || (fpVar = this.j) == null) {
                return;
            }
            fpVar.invoke(Integer.valueOf(underrunCount2), Integer.valueOf(underrunCount));
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.vp4 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.u51
            if (r0 == 0) goto L13
            r0 = r6
            u51 r0 = (defpackage.u51) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            u51 r0 = new u51
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.E
            m45 r1 = defpackage.m45.E
            int r2 = r0.G
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.sf5.h0(r6)     // Catch: java.util.concurrent.CancellationException -> L46
            goto L46
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            r5 = 0
            return r5
        L2e:
            defpackage.sf5.h0(r6)
            zy1 r6 = r5.m     // Catch: java.util.concurrent.CancellationException -> L46
            ih2 r6 = defpackage.j8.b0(r6)     // Catch: java.util.concurrent.CancellationException -> L46
            i7 r2 = new i7     // Catch: java.util.concurrent.CancellationException -> L46
            r4 = 4
            r2.<init>(r4, r5)     // Catch: java.util.concurrent.CancellationException -> L46
            r0.G = r3     // Catch: java.util.concurrent.CancellationException -> L46
            java.lang.Object r5 = r6.a(r2, r0)     // Catch: java.util.concurrent.CancellationException -> L46
            if (r5 != r1) goto L46
            return r1
        L46:
            iei r5 = defpackage.iei.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x51.b(vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.vp4 r6) {
        /*
            r5 = this;
            iei r0 = defpackage.iei.a
            boolean r1 = r6 instanceof defpackage.v51
            if (r1 == 0) goto L15
            r1 = r6
            v51 r1 = (defpackage.v51) r1
            int r2 = r1.G
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.G = r2
            goto L1a
        L15:
            v51 r1 = new v51
            r1.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r1.E
            m45 r2 = defpackage.m45.E
            int r3 = r1.G
            r4 = 1
            if (r3 == 0) goto L30
            if (r3 != r4) goto L29
            defpackage.sf5.h0(r6)
            return r0
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            r5 = 0
            return r5
        L30:
            defpackage.sf5.h0(r6)
            r1.G = r4
            ua2 r6 = new ua2
            tp4 r1 = defpackage.zni.I(r1)
            r6.<init>(r4, r1)
            r6.t()
            android.media.AudioTrack r1 = r5.d
            int r5 = r5.g
            int r5 = r5 / 2
            if (r1 == 0) goto L5c
            int r3 = r1.getPlaybackHeadPosition()
            if (r3 < r5) goto L50
            goto L5c
        L50:
            w51 r3 = new w51
            r3.<init>(r1, r6)
            r1.setPlaybackPositionUpdateListener(r3)
            r1.setNotificationMarkerPosition(r5)
            goto L5f
        L5c:
            r6.resumeWith(r0)
        L5f:
            java.lang.Object r5 = r6.r()
            if (r5 != r2) goto L66
            return r2
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x51.c(vp4):java.lang.Object");
    }
}
