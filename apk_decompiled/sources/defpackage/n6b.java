package defpackage;

import android.graphics.RenderNode;
import android.media.MediaCodecInfo;
import android.view.SurfaceControl;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class n6b {
    public static /* synthetic */ RenderNode B() {
        return new RenderNode("AndroidEdgeEffectOverscrollEffect");
    }

    public static /* synthetic */ RenderNode g() {
        return new RenderNode("OffscreenLayer.main");
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint i(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* synthetic */ SurfaceControl.Transaction j() {
        return new SurfaceControl.Transaction();
    }

    public static /* synthetic */ RenderNode x() {
        return new RenderNode("OffscreenLayer.shadow");
    }
}
