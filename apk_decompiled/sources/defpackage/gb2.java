package defpackage;

import android.content.ClipData;
import android.media.metrics.MediaMetricsManager;
import android.os.VibratorManager;
import android.view.ContentInfo;
import android.view.ScrollCaptureSession;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class gb2 {
    public static /* bridge */ /* synthetic */ MediaMetricsManager d(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static /* bridge */ /* synthetic */ VibratorManager f(Object obj) {
        return (VibratorManager) obj;
    }

    public static /* synthetic */ ContentInfo.Builder g(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* bridge */ /* synthetic */ ContentInfo i(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* bridge */ /* synthetic */ ScrollCaptureSession l(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    public static /* bridge */ /* synthetic */ boolean w(Object obj) {
        return obj instanceof VibratorManager;
    }

    public static /* bridge */ /* synthetic */ VibratorManager z(Object obj) {
        return (VibratorManager) obj;
    }
}
