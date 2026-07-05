package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.SurfaceView;
import android.window.SurfaceSyncGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class i7d extends SurfaceView {
    public final /* synthetic */ nwb E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7d(Context context, nwb nwbVar) {
        super(context);
        this.E = nwbVar;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        super.dispatchDraw(canvas);
        if (Build.VERSION.SDK_INT == 34) {
            nwb nwbVar = this.E;
            SurfaceSyncGroup surfaceSyncGroupM = ljb.m(nwbVar.getValue());
            if (surfaceSyncGroupM != null) {
                surfaceSyncGroupM.markSyncReady();
            }
            nwbVar.setValue(null);
        }
    }
}
