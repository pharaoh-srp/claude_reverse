package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.window.SplashScreenView;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class n5d {
    public static /* synthetic */ ScrollCaptureTarget n(AndroidComposeView androidComposeView, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(androidComposeView, rect, point, scrollCaptureCallback);
    }

    public static /* bridge */ /* synthetic */ SplashScreenView q(View view) {
        return (SplashScreenView) view;
    }

    public static /* bridge */ /* synthetic */ boolean z(View view) {
        return view instanceof SplashScreenView;
    }
}
