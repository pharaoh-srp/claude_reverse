package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import defpackage.k2c;
import defpackage.kw9;
import defpackage.pya;
import defpackage.w1a;
import defpackage.yb5;
import io.sentry.android.core.internal.util.l;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.h0;
import io.sentry.android.replay.y;
import io.sentry.t5;
import io.sentry.w6;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements i {
    public final ReplayIntegration a;
    public final w6 b;
    public final y c;
    public final k2c d;
    public final ScheduledExecutorService e;
    public final io.sentry.d f;
    public final Bitmap g;
    public final kw9 h;
    public final AtomicBoolean i;
    public final io.sentry.android.replay.util.c j;
    public final AtomicBoolean k;
    public final AtomicInteger l;
    public final AtomicBoolean m;
    public final kw9 n;
    public final kw9 o;
    public final Rect p;
    public final RectF q;
    public final int[] r;
    public final int[] s;

    public h(h0 h0Var, ReplayIntegration replayIntegration, w6 w6Var, y yVar, io.sentry.android.replay.util.a aVar, k2c k2cVar) {
        this.a = replayIntegration;
        this.b = w6Var;
        this.c = yVar;
        this.d = k2cVar;
        this.e = h0Var.I;
        this.f = h0Var.H;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(yVar.a, yVar.b, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        this.g = bitmapCreateBitmap;
        g gVar = new g(this, 0);
        w1a w1aVar = w1a.G;
        this.h = yb5.w(w1aVar, gVar);
        this.i = new AtomicBoolean(false);
        this.j = new io.sentry.android.replay.util.c();
        this.k = new AtomicBoolean(false);
        this.l = new AtomicInteger(0);
        this.m = new AtomicBoolean(false);
        this.n = yb5.w(w1aVar, f.F);
        this.o = yb5.w(w1aVar, new g(this, 1));
        this.p = new Rect();
        this.q = new RectF();
        this.r = new int[2];
        this.s = new int[2];
    }

    public static final void e(AtomicInteger atomicInteger, final h hVar, final View view, final io.sentry.android.core.internal.threaddump.b[] bVarArr, final io.sentry.android.replay.viewhierarchy.g gVar, final int i, final int i2, final boolean z) {
        if (atomicInteger.decrementAndGet() == 0) {
            hVar.e.submit(new io.sentry.android.replay.util.e(new Runnable() { // from class: io.sentry.android.replay.screenshot.e
                /* JADX WARN: Removed duplicated region for block: B:14:0x0084  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        r17 = this;
                        r0 = r17
                        io.sentry.android.replay.screenshot.h r1 = r0.E
                        java.util.concurrent.atomic.AtomicBoolean r2 = r1.m
                        boolean r2 = r2.get()
                        io.sentry.android.core.internal.threaddump.b[] r3 = r2
                        r4 = 0
                        if (r2 != 0) goto L95
                        android.graphics.Bitmap r2 = r1.g
                        boolean r2 = r2.isRecycled()
                        if (r2 == 0) goto L19
                        goto L95
                    L19:
                        int r2 = r3.length
                        r5 = r4
                    L1b:
                        if (r5 >= r2) goto L8b
                        r6 = r3[r5]
                        if (r6 == 0) goto L84
                        java.lang.Object r7 = r6.c
                        android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
                        boolean r8 = r7.isRecycled()
                        if (r8 != 0) goto L84
                        kw9 r8 = r1.o
                        java.lang.Object r8 = r8.getValue()
                        android.graphics.Canvas r8 = (android.graphics.Canvas) r8
                        kw9 r9 = r1.n
                        java.lang.Object r9 = r9.getValue()
                        android.graphics.Paint r9 = (android.graphics.Paint) r9
                        android.graphics.Rect r10 = r1.p
                        android.graphics.RectF r11 = r1.q
                        int r12 = r6.a
                        int r6 = r6.b
                        io.sentry.android.replay.y r13 = r1.c
                        float r14 = r13.c
                        float r13 = r13.d
                        r8.getClass()
                        r9.getClass()
                        r10.getClass()
                        r11.getClass()
                        int r15 = r3
                        int r12 = r12 - r15
                        float r12 = (float) r12
                        float r12 = r12 * r14
                        int r15 = r4
                        int r6 = r6 - r15
                        float r6 = (float) r6
                        float r6 = r6 * r13
                        int r15 = r7.getWidth()
                        r16 = r2
                        int r2 = r7.getHeight()
                        r10.set(r4, r4, r15, r2)
                        int r2 = r7.getWidth()
                        float r2 = (float) r2
                        float r2 = r2 * r14
                        float r2 = r2 + r12
                        int r14 = r7.getHeight()
                        float r14 = (float) r14
                        float r14 = r14 * r13
                        float r14 = r14 + r6
                        r11.set(r12, r6, r2, r14)
                        r8.drawBitmap(r7, r10, r11, r9)
                        r7.recycle()
                        goto L86
                    L84:
                        r16 = r2
                    L86:
                        int r5 = r5 + 1
                        r2 = r16
                        goto L1b
                    L8b:
                        android.view.View r2 = r5
                        io.sentry.android.replay.viewhierarchy.g r3 = r6
                        boolean r0 = r7
                        r1.d(r2, r3, r0)
                        return
                    L95:
                        io.sentry.w6 r0 = r1.b
                        io.sentry.a1 r0 = r0.getLogger()
                        io.sentry.t5 r1 = io.sentry.t5.DEBUG
                        java.lang.String r2 = "PixelCopyStrategy is closed, skipping compositing"
                        java.lang.Object[] r5 = new java.lang.Object[r4]
                        r0.h(r1, r2, r5)
                        int r0 = r3.length
                    La5:
                        if (r4 >= r0) goto Lbb
                        r1 = r3[r4]
                        if (r1 == 0) goto Lb8
                        java.lang.Object r1 = r1.c
                        android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
                        boolean r2 = r1.isRecycled()
                        if (r2 != 0) goto Lb8
                        r1.recycle()
                    Lb8:
                        int r4 = r4 + 1
                        goto La5
                    Lbb:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.screenshot.e.run():void");
                }
            }, "screenshot_recorder.composite"));
        }
    }

    @Override // io.sentry.android.replay.screenshot.i
    public final boolean a() {
        return this.i.get();
    }

    @Override // io.sentry.android.replay.screenshot.i
    public final void b(View view) throws IllegalAccessException {
        Window windowS = io.sentry.config.a.s(view);
        w6 w6Var = this.b;
        if (windowS == null) {
            w6Var.getLogger().h(t5.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        if (this.m.get()) {
            w6Var.getLogger().h(t5.DEBUG, "PixelCopyStrategy is closed, not capturing screenshot", new Object[0]);
            return;
        }
        try {
            this.k.set(false);
            PixelCopy.request(windowS, this.g, new l(this, 1, view), (Handler) this.f.E);
        } catch (Throwable th) {
            w6Var.getLogger().d(t5.WARNING, "Failed to capture replay recording", th);
            this.l.set(0);
            this.i.set(false);
        }
    }

    @Override // io.sentry.android.replay.screenshot.i
    public final void c() throws Exception {
        if (this.i.get()) {
            Bitmap bitmap = this.g;
            if (bitmap.isRecycled()) {
                return;
            }
            this.a.T(bitmap);
        }
    }

    @Override // io.sentry.android.replay.screenshot.i
    public final void close() {
        this.m.set(true);
        this.l.set(0);
        this.e.submit(new io.sentry.android.replay.util.e(new pya(26, this), "PixelCopyStrategy.close"));
    }

    public final void d(View view, io.sentry.android.replay.viewhierarchy.g gVar, boolean z) {
        boolean z2 = this.m.get();
        w6 w6Var = this.b;
        if (!z2) {
            Bitmap bitmap = this.g;
            if (!bitmap.isRecycled()) {
                this.j.c(bitmap, gVar, (Matrix) this.h.getValue());
                w6Var.getReplayController().getClass();
                this.a.T(bitmap);
                this.i.set(true);
                this.k.set(false);
                if (z) {
                    this.l.set(0);
                    return;
                }
                return;
            }
        }
        w6Var.getLogger().h(t5.DEBUG, "PixelCopyStrategy is closed, skipping masking", new Object[0]);
    }

    @Override // io.sentry.android.replay.screenshot.i
    public final void onContentChanged() {
        this.k.set(true);
    }
}
