package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.provider.Settings;
import android.view.Choreographer;
import android.view.View;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class pna extends Drawable implements Drawable.Callback, Animatable {
    public static final List k0 = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
    public static final ThreadPoolExecutor l0 = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new wna());
    public bna E;
    public final xna F;
    public final boolean G;
    public final ArrayList H;
    public xv8 I;
    public h80 J;
    public final if5 K;
    public boolean L;
    public me4 M;
    public int N;
    public boolean O;
    public boolean P;
    public final Matrix Q;
    public Bitmap R;
    public Canvas S;
    public Rect T;
    public RectF U;
    public ps9 V;
    public Rect W;
    public Rect X;
    public RectF Y;
    public RectF Z;
    public Matrix a0;
    public final float[] b0;
    public Matrix c0;
    public boolean d0;
    public final Semaphore e0;
    public final fc f0;
    public float g0;
    public int h0;
    public int i0;
    public int j0;

    public pna() {
        xna xnaVar = new xna();
        this.F = xnaVar;
        this.G = true;
        this.h0 = 1;
        this.H = new ArrayList();
        this.K = new if5(1);
        this.L = true;
        this.N = 255;
        this.i0 = 1;
        this.P = false;
        this.Q = new Matrix();
        this.b0 = new float[9];
        this.d0 = false;
        lna lnaVar = new lna(this);
        this.e0 = new Semaphore(1);
        this.f0 = new fc(28, this);
        this.g0 = -3.4028235E38f;
        xnaVar.addUpdateListener(lnaVar);
    }

    public static void d(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public static boolean h(float f) {
        return (Float.isNaN(f) || Float.isInfinite(f)) ? false : true;
    }

    public final boolean a(Context context) {
        if (!this.G) {
            return false;
        }
        if (context == null) {
            return true;
        }
        Matrix matrix = zpi.a;
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    public final void b() {
        bna bnaVar = this.E;
        if (bnaVar == null) {
            return;
        }
        epk epkVar = st9.a;
        Rect rect = bnaVar.k;
        List list = Collections.EMPTY_LIST;
        me4 me4Var = new me4(this, new rt9(list, bnaVar, "__container", -1L, 1, -1L, null, list, new i80(), 0, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, rect.width(), rect.height(), null, null, list, 1, null, false, null, null, 1), bnaVar.j, bnaVar);
        this.M = me4Var;
        me4Var.J = this.L;
    }

    public final void c() {
        bna bnaVar = this.E;
        if (bnaVar == null) {
            return;
        }
        int i = this.i0;
        int i2 = Build.VERSION.SDK_INT;
        boolean z = bnaVar.o;
        int i3 = bnaVar.p;
        int iF = sq6.F(i);
        boolean z2 = false;
        if (iF != 1 && (iF == 2 || ((z && i2 < 28) || i3 > 4))) {
            z2 = true;
        }
        this.P = z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        me4 me4Var = this.M;
        if (me4Var == null) {
            return;
        }
        int i = this.j0;
        if (i == 0) {
            i = 1;
        }
        boolean z = i == 2;
        fc fcVar = this.f0;
        ThreadPoolExecutor threadPoolExecutor = l0;
        xna xnaVar = this.F;
        Semaphore semaphore = this.e0;
        if (z) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                if (z) {
                    semaphore.release();
                    if (me4Var.I != xnaVar.a()) {
                        threadPoolExecutor.execute(fcVar);
                        return;
                    }
                    return;
                }
                return;
            } catch (Throwable th) {
                if (z) {
                    semaphore.release();
                    if (me4Var.I != xnaVar.a()) {
                        threadPoolExecutor.execute(fcVar);
                    }
                }
                throw th;
            }
        }
        if (z && n()) {
            m(xnaVar.a());
        }
        if (this.P) {
            j(canvas, me4Var);
        } else {
            e(canvas);
        }
        this.d0 = false;
        if (z) {
            semaphore.release();
            if (me4Var.I != xnaVar.a()) {
                threadPoolExecutor.execute(fcVar);
            }
        }
    }

    public final void e(Canvas canvas) {
        me4 me4Var = this.M;
        bna bnaVar = this.E;
        if (me4Var == null || bnaVar == null) {
            return;
        }
        Matrix matrix = this.Q;
        matrix.reset();
        if (!getBounds().isEmpty()) {
            matrix.preTranslate(r3.left, r3.top);
            matrix.preScale(r3.width() / bnaVar.k.width(), r3.height() / bnaVar.k.height());
        }
        me4Var.f(canvas, matrix, this.N, null);
    }

    public final Context f() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    public final gua g() {
        gua guaVar = null;
        for (String str : k0) {
            bna bnaVar = this.E;
            int size = bnaVar.g.size();
            for (int i = 0; i < size; i++) {
                gua guaVar2 = (gua) bnaVar.g.get(i);
                String str2 = guaVar2.a;
                if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                    guaVar = guaVar2;
                    break;
                }
            }
            guaVar = null;
            if (guaVar != null) {
                break;
            }
        }
        return guaVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.N;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        bna bnaVar = this.E;
        if (bnaVar == null) {
            return -1;
        }
        return bnaVar.k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        bna bnaVar = this.E;
        if (bnaVar == null) {
            return -1;
        }
        return bnaVar.k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void i() {
        if (this.M == null) {
            this.H.add(new kna(this, 1));
            return;
        }
        c();
        boolean zA = a(f());
        xna xnaVar = this.F;
        if (zA || xnaVar.getRepeatCount() == 0) {
            if (isVisible()) {
                xnaVar.Q = true;
                boolean zD = xnaVar.d();
                Iterator it = xnaVar.F.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationStart(xnaVar, zD);
                }
                xnaVar.i((int) (xnaVar.d() ? xnaVar.b() : xnaVar.c()));
                xnaVar.J = 0L;
                xnaVar.M = 0;
                if (xnaVar.Q) {
                    xnaVar.h(false);
                    Choreographer.getInstance().postFrameCallback(xnaVar);
                }
                this.h0 = 1;
            } else {
                this.h0 = 2;
            }
        }
        if (a(f())) {
            return;
        }
        gua guaVarG = g();
        if (guaVarG != null) {
            l((int) guaVarG.b);
        } else {
            l((int) (xnaVar.H < MTTypesetterKt.kLineSkipLimitMultiplier ? xnaVar.c() : xnaVar.b()));
        }
        xnaVar.h(true);
        xnaVar.f(xnaVar.d());
        if (isVisible()) {
            return;
        }
        this.h0 = 1;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.d0) {
            return;
        }
        this.d0 = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        xna xnaVar = this.F;
        if (xnaVar == null) {
            return false;
        }
        return xnaVar.Q;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(android.graphics.Canvas r12, defpackage.me4 r13) {
        /*
            Method dump skipped, instruction units count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pna.j(android.graphics.Canvas, me4):void");
    }

    public final void k() {
        if (this.M == null) {
            this.H.add(new kna(this, 0));
            return;
        }
        c();
        boolean zA = a(f());
        xna xnaVar = this.F;
        if (zA || xnaVar.getRepeatCount() == 0) {
            if (isVisible()) {
                xnaVar.Q = true;
                xnaVar.h(false);
                Choreographer.getInstance().postFrameCallback(xnaVar);
                xnaVar.J = 0L;
                if (xnaVar.d() && xnaVar.L == xnaVar.c()) {
                    xnaVar.i(xnaVar.b());
                } else if (!xnaVar.d() && xnaVar.L == xnaVar.b()) {
                    xnaVar.i(xnaVar.c());
                }
                Iterator it = xnaVar.G.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(xnaVar);
                }
                this.h0 = 1;
            } else {
                this.h0 = 3;
            }
        }
        if (a(f())) {
            return;
        }
        l((int) (xnaVar.H < MTTypesetterKt.kLineSkipLimitMultiplier ? xnaVar.c() : xnaVar.b()));
        xnaVar.h(true);
        xnaVar.f(xnaVar.d());
        if (isVisible()) {
            return;
        }
        this.h0 = 1;
    }

    public final void l(final int i) {
        if (this.E != null) {
            this.F.i(i);
        } else {
            this.H.add(new ona() { // from class: nna
                @Override // defpackage.ona
                public final void run() {
                    this.a.l(i);
                }
            });
        }
    }

    public final void m(final float f) {
        bna bnaVar = this.E;
        if (bnaVar == null) {
            this.H.add(new ona() { // from class: mna
                @Override // defpackage.ona
                public final void run() {
                    this.a.m(f);
                }
            });
        } else {
            this.F.i(vkb.e(bnaVar.l, bnaVar.m, f));
        }
    }

    public final boolean n() {
        bna bnaVar = this.E;
        if (bnaVar == null) {
            return false;
        }
        float f = this.g0;
        float fA = this.F.a();
        this.g0 = fA;
        return Math.abs(fA - f) * bnaVar.b() >= 50.0f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.N = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        oga.a("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            int i = this.h0;
            if (i == 2) {
                i();
                return visible;
            }
            if (i == 3) {
                k();
                return visible;
            }
        } else {
            xna xnaVar = this.F;
            if (xnaVar.Q) {
                this.H.clear();
                xnaVar.h(true);
                Iterator it = xnaVar.G.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(xnaVar);
                }
                if (!isVisible()) {
                    this.h0 = 1;
                }
                this.h0 = 3;
                return visible;
            }
            if (zIsVisible) {
                this.h0 = 1;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        i();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.H.clear();
        xna xnaVar = this.F;
        xnaVar.h(true);
        xnaVar.f(xnaVar.d());
        if (isVisible()) {
            return;
        }
        this.h0 = 1;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
