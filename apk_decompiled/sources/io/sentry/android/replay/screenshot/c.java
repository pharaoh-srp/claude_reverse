package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import android.view.View;
import defpackage.k2c;
import defpackage.kw9;
import defpackage.w1a;
import defpackage.yb5;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.h0;
import io.sentry.android.replay.y;
import io.sentry.p;
import io.sentry.t5;
import io.sentry.w6;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements i {
    public final h0 a;
    public final ReplayIntegration b;
    public final w6 c;
    public final y d;
    public volatile Bitmap e;
    public final AtomicReference f = new AtomicReference(null);
    public final io.sentry.util.a g = new io.sentry.util.a();
    public final kw9 h = yb5.w(w1a.G, new k2c(15, this));
    public final AtomicBoolean i = new AtomicBoolean(false);
    public final j j = new j();
    public final AtomicBoolean k = new AtomicBoolean(false);
    public final SurfaceTexture l;
    public final Surface m;
    public final a n;

    public c(w6 w6Var, ReplayIntegration replayIntegration, y yVar, h0 h0Var) {
        this.a = h0Var;
        this.b = replayIntegration;
        this.c = w6Var;
        this.d = yVar;
        SurfaceTexture surfaceTexture = new SurfaceTexture(false);
        surfaceTexture.setDefaultBufferSize(yVar.a, yVar.b);
        this.l = surfaceTexture;
        this.m = new Surface(surfaceTexture);
        p.a("ReplayCanvasStrategy");
        this.n = new a(this, 0);
    }

    @Override // io.sentry.android.replay.screenshot.i
    public final boolean a() {
        return this.i.get();
    }

    @Override // io.sentry.android.replay.screenshot.i
    public final void b(View view) {
        AtomicBoolean atomicBoolean = this.k;
        if (atomicBoolean.get()) {
            return;
        }
        Picture picture = new Picture();
        y yVar = this.d;
        Canvas canvasBeginRecording = picture.beginRecording(yVar.a, yVar.b);
        canvasBeginRecording.getClass();
        j jVar = this.j;
        jVar.getClass();
        jVar.a = canvasBeginRecording;
        jVar.setMatrix((Matrix) this.h.getValue());
        view.draw(jVar);
        picture.endRecording();
        if (atomicBoolean.get()) {
            return;
        }
        this.f.set(picture);
        d(this.a.e(), new io.sentry.android.replay.util.e(this.n, "screenshot_recorder.canvas"));
    }

    @Override // io.sentry.android.replay.screenshot.i
    public final void c() throws Exception {
        Bitmap bitmap;
        if (!this.i.get() || (bitmap = this.e) == null || bitmap.isRecycled()) {
            return;
        }
        this.b.T(bitmap);
    }

    @Override // io.sentry.android.replay.screenshot.i
    public final void close() {
        this.k.set(true);
        d(this.a.e(), new io.sentry.android.replay.util.e(new a(this, 1), "CanvasStrategy.close"));
        this.f.getAndSet(null);
    }

    public final void d(Handler handler, io.sentry.android.replay.util.e eVar) {
        try {
            handler.post(eVar);
        } catch (Throwable th) {
            this.c.getLogger().d(t5.ERROR, "Canvas Strategy: failed to post runnable ".concat(eVar.E), th);
        }
    }

    @Override // io.sentry.android.replay.screenshot.i
    public final void onContentChanged() {
    }
}
