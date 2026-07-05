package io.sentry.android.replay.video;

import android.media.MediaCodec;
import android.media.MediaMuxer;
import android.view.Surface;
import defpackage.k2c;
import defpackage.kw9;
import defpackage.w1a;
import defpackage.yb5;
import io.sentry.t5;
import io.sentry.w6;

/* JADX INFO: loaded from: classes3.dex */
public final class d {
    public final w6 a;
    public final a b;
    public final MediaCodec c;
    public final kw9 d;
    public final MediaCodec.BufferInfo e;
    public final b f;
    public Surface g;

    public d(w6 w6Var, a aVar) {
        w6Var.getClass();
        this.a = w6Var;
        this.b = aVar;
        c cVar = c.F;
        w1a w1aVar = w1a.G;
        MediaCodec mediaCodecCreateByCodecName = ((Boolean) yb5.w(w1aVar, cVar).getValue()).booleanValue() ? MediaCodec.createByCodecName("c2.android.avc.encoder") : MediaCodec.createEncoderByType(aVar.f);
        mediaCodecCreateByCodecName.getClass();
        this.c = mediaCodecCreateByCodecName;
        this.d = yb5.w(w1aVar, new k2c(17, this));
        this.e = new MediaCodec.BufferInfo();
        String absolutePath = aVar.a.getAbsolutePath();
        absolutePath.getClass();
        this.f = new b(absolutePath, aVar.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0172, code lost:
    
        defpackage.pmf.o(defpackage.grc.u("encoderOutputBuffer ", r4, " was null"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017d, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r13) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.video.d.a(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.graphics.Bitmap r5) {
        /*
            r4 = this;
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r0.getClass()
            java.lang.String r1 = "xiaomi"
            r2 = 1
            boolean r1 = defpackage.bsg.u0(r0, r1, r2)
            r3 = 0
            if (r1 != 0) goto L3d
            java.lang.String r1 = "motorola"
            boolean r0 = defpackage.bsg.u0(r0, r1, r2)
            if (r0 != 0) goto L3d
            io.sentry.android.replay.util.f r0 = io.sentry.android.replay.util.f.SOC_MANUFACTURER
            java.lang.String r1 = io.sentry.android.replay.util.h.a(r0)
            java.lang.String r2 = "spreadtrum"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 != 0) goto L3d
            java.lang.String r0 = io.sentry.android.replay.util.h.a(r0)
            java.lang.String r1 = "unisoc"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L32
            goto L3d
        L32:
            android.view.Surface r0 = r4.g
            if (r0 == 0) goto L3b
            android.graphics.Canvas r0 = r0.lockHardwareCanvas()
            goto L45
        L3b:
            r0 = r3
            goto L45
        L3d:
            android.view.Surface r0 = r4.g
            if (r0 == 0) goto L3b
            android.graphics.Canvas r0 = r0.lockCanvas(r3)
        L45:
            if (r0 == 0) goto L4b
            r1 = 0
            r0.drawBitmap(r5, r1, r1, r3)
        L4b:
            android.view.Surface r5 = r4.g
            if (r5 == 0) goto L52
            r5.unlockCanvasAndPost(r0)
        L52:
            r5 = 0
            r4.a(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.video.d.b(android.graphics.Bitmap):void");
    }

    public final void c() {
        MediaCodec mediaCodec = this.c;
        try {
            a(true);
            mediaCodec.stop();
            mediaCodec.release();
            Surface surface = this.g;
            if (surface != null) {
                surface.release();
            }
            MediaMuxer mediaMuxer = this.f.b;
            mediaMuxer.stop();
            mediaMuxer.release();
        } catch (Throwable th) {
            this.a.getLogger().d(t5.DEBUG, "Failed to properly release video encoder", th);
        }
    }
}
