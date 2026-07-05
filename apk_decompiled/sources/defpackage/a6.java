package defpackage;

import android.app.ApplicationExitInfo;
import android.graphics.Insets;
import android.util.CloseGuard;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a6 {
    public static /* bridge */ /* synthetic */ ApplicationExitInfo g(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    public static /* synthetic */ CloseGuard j() {
        return new CloseGuard();
    }

    public static /* synthetic */ WindowInsetsAnimation.Bounds l(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static /* synthetic */ WindowInsetsAnimation m(int i, Interpolator interpolator, long j) {
        return new WindowInsetsAnimation(i, interpolator, j);
    }

    public static /* bridge */ /* synthetic */ WindowInsetsAnimation n(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    public static /* synthetic */ void s() {
    }
}
