package defpackage;

import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g7d extends m08 implements pz7 {
    public static final g7d E = new g7d(2, v77.class, "setVideoSurfaceView", "setVideoSurfaceView(Landroid/view/SurfaceView;)V", 0);

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        v77 v77Var = (v77) obj;
        SurfaceView surfaceView = (SurfaceView) obj2;
        v77Var.getClass();
        v77Var.F();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        v77Var.F();
        if (holder == null) {
            v77Var.b();
        } else {
            v77Var.y();
            v77Var.R = true;
            v77Var.Q = holder;
            holder.addCallback(v77Var.w);
            Surface surface = holder.getSurface();
            if (surface == null || !surface.isValid()) {
                v77Var.A(null);
                v77Var.v(0, 0);
            } else {
                v77Var.A(surface);
                Rect surfaceFrame = holder.getSurfaceFrame();
                v77Var.v(surfaceFrame.width(), surfaceFrame.height());
            }
        }
        return iei.a;
    }
}
