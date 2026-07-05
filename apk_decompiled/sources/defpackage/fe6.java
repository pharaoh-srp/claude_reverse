package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.google.accompanist.drawablepainter.DrawablePainter;

/* JADX INFO: loaded from: classes.dex */
public final class fe6 implements Drawable.Callback {
    public final /* synthetic */ DrawablePainter E;

    public fe6(DrawablePainter drawablePainter) {
        this.E = drawablePainter;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        drawable.getClass();
        DrawablePainter drawablePainter = this.E;
        lsc lscVar = drawablePainter.K;
        lscVar.setValue(Integer.valueOf(((Number) lscVar.getValue()).intValue() + 1));
        Drawable drawable2 = drawablePainter.J;
        kw9 kw9Var = ge6.a;
        drawablePainter.L.setValue(new k8g((drawable2.getIntrinsicWidth() < 0 || drawable2.getIntrinsicHeight() < 0) ? 9205357640488583168L : eve.i(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight())));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        drawable.getClass();
        runnable.getClass();
        ((Handler) ge6.a.getValue()).postAtTime(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        drawable.getClass();
        runnable.getClass();
        ((Handler) ge6.a.getValue()).removeCallbacks(runnable);
    }
}
