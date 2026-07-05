package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.view.PixelCopy;
import android.view.Surface;
import defpackage.csg;
import defpackage.grc;
import io.sentry.android.replay.y;
import io.sentry.t5;
import io.sentry.v;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ c F;

    public /* synthetic */ a(c cVar, int i) {
        this.E = i;
        this.F = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        final c cVar = this.F;
        switch (i) {
            case 0:
                if (cVar.k.get()) {
                    cVar.c.getLogger().h(t5.DEBUG, "Canvas Strategy already closed, skipping picture render", new Object[0]);
                    return;
                }
                Picture picture = (Picture) cVar.f.getAndSet(null);
                if (picture == null) {
                    return;
                }
                try {
                    Canvas canvasLockHardwareCanvas = cVar.m.lockHardwareCanvas();
                    try {
                        canvasLockHardwareCanvas.drawColor(-16777216, PorterDuff.Mode.CLEAR);
                        picture.draw(canvasLockHardwareCanvas);
                        cVar.m.unlockCanvasAndPost(canvasLockHardwareCanvas);
                        if (cVar.e == null) {
                            v vVarA = cVar.g.a();
                            try {
                                if (cVar.e == null) {
                                    y yVar = cVar.d;
                                    cVar.e = Bitmap.createBitmap(yVar.a, yVar.b, Bitmap.Config.ARGB_8888);
                                }
                                csg.o(vVarA, null);
                            } finally {
                            }
                            break;
                        }
                        if (cVar.k.get()) {
                            cVar.c.getLogger().h(t5.DEBUG, "Canvas Strategy already closed, skipping pixel copy request", new Object[0]);
                            return;
                        }
                        Surface surface = cVar.m;
                        Bitmap bitmap = cVar.e;
                        bitmap.getClass();
                        PixelCopy.request(surface, bitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.screenshot.b
                            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                            public final void onPixelCopyFinished(int i2) throws Exception {
                                c cVar2 = cVar;
                                if (cVar2.k.get()) {
                                    cVar2.c.getLogger().h(t5.DEBUG, "CanvasStrategy is closed, ignoring capture result", new Object[0]);
                                    return;
                                }
                                if (i2 != 0) {
                                    cVar2.c.getLogger().h(t5.ERROR, grc.p(i2, "Canvas Strategy: PixelCopy failed with code "), new Object[0]);
                                    cVar2.i.set(false);
                                    return;
                                }
                                cVar2.i.set(true);
                                Bitmap bitmap2 = cVar2.e;
                                if (bitmap2 == null || bitmap2.isRecycled()) {
                                    return;
                                }
                                cVar2.b.T(bitmap2);
                            }
                        }, cVar.a.e());
                        return;
                    } catch (Throwable th) {
                        cVar.m.unlockCanvasAndPost(canvasLockHardwareCanvas);
                        throw th;
                    }
                } catch (Throwable th2) {
                    cVar.c.getLogger().d(t5.ERROR, "Canvas Strategy: picture render failed", th2);
                    cVar.i.set(false);
                    return;
                }
            default:
                Bitmap bitmap2 = cVar.e;
                if (bitmap2 != null) {
                    synchronized (bitmap2) {
                        if (!bitmap2.isRecycled()) {
                            bitmap2.recycle();
                        }
                        break;
                    }
                }
                cVar.m.release();
                cVar.l.release();
                return;
        }
    }
}
