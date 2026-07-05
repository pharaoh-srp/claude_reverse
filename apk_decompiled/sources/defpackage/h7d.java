package defpackage;

import android.view.SurfaceHolder;
import android.view.SurfaceView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h7d extends m08 implements pz7 {
    public static final h7d E = new h7d(2, v77.class, "clearVideoSurfaceView", "clearVideoSurfaceView(Landroid/view/SurfaceView;)V", 0);

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        v77 v77Var = (v77) obj;
        SurfaceView surfaceView = (SurfaceView) obj2;
        v77Var.getClass();
        v77Var.F();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        v77Var.F();
        if (holder != null && holder == v77Var.Q) {
            v77Var.b();
        }
        return iei.a;
    }
}
