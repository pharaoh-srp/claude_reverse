package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public final class ez5 implements dz5, vdj {
    public static final ez5 E = new ez5();
    public static final ez5 F = new ez5();

    @Override // defpackage.vdj
    public rdj I(Context context, dz5 dz5Var) {
        dz5Var.getClass();
        WindowManager windowManager = context.isUiContext() ? (WindowManager) context.getSystemService(WindowManager.class) : (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new rdj(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }

    @Override // defpackage.vdj
    public rdj c(Activity activity, dz5 dz5Var) {
        dz5Var.getClass();
        return wv1.F.c(activity, dz5Var);
    }

    @Override // defpackage.dz5
    public float p(Context context) {
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }
}
