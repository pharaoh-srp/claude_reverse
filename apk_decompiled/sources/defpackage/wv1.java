package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes3.dex */
public final class wv1 implements vv1, vdj {
    public static final wv1 E = new wv1();
    public static final wv1 F = new wv1();

    @Override // defpackage.vdj
    public rdj I(Context context, dz5 dz5Var) {
        dz5Var.getClass();
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        float f = context.getResources().getDisplayMetrics().density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new rdj(bounds, f);
    }

    @Override // defpackage.vdj
    public rdj c(Activity activity, dz5 dz5Var) {
        dz5Var.getClass();
        vv1.b.getClass();
        int i = Build.VERSION.SDK_INT;
        return new rdj(new pv1((i >= 30 ? E : i >= 29 ? pyk.H : i >= 28 ? lyk.H : tqh.G).m(activity)), dz5Var.p(activity));
    }

    @Override // defpackage.vv1
    public Rect m(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }
}
