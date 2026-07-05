package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class w90 implements Drawable.Callback {
    public final /* synthetic */ z90 E;

    public w90(z90 z90Var) {
        this.E = z90Var;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.E.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.E.scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.E.unscheduleSelf(runnable);
    }
}
