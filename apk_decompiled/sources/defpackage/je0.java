package defpackage;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.view.DisplayCutout;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class je0 {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler b(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static List c(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    public static String d() {
        String processName = Application.getProcessName();
        processName.getClass();
        return processName;
    }

    public static int e(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int f(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int g(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int h(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }
}
