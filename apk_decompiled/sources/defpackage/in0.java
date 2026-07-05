package defpackage;

import android.os.Build;
import android.widget.RemoteViews;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class in0 {
    public static void a(RemoteViews remoteViews, int i, w46 w46Var) {
        if (Build.VERSION.SDK_INT < 31) {
            mr9.q("setClipToOutline is only available on SDK 31 and higher");
            return;
        }
        remoteViews.setBoolean(i, "setClipToOutline", true);
        if (w46Var instanceof n46) {
            remoteViews.setViewOutlinePreferredRadius(i, ((n46) w46Var).a, 1);
        } else {
            sz6.k("Rounded corners should not be ", w46Var.getClass().getCanonicalName());
        }
    }

    public static void b(RemoteViews remoteViews, int i, w46 w46Var) {
        if (w46Var instanceof u46) {
            remoteViews.setViewLayoutHeight(i, -2.0f, 0);
            return;
        }
        if (w46Var instanceof o46) {
            remoteViews.setViewLayoutHeight(i, MTTypesetterKt.kLineSkipLimitMultiplier, 0);
            return;
        }
        if (w46Var instanceof n46) {
            remoteViews.setViewLayoutHeight(i, ((n46) w46Var).a, 1);
        } else if (w46Var.equals(p46.a)) {
            remoteViews.setViewLayoutHeight(i, -1.0f, 0);
        } else {
            wg6.i();
        }
    }

    public static void c(RemoteViews remoteViews, int i, w46 w46Var) {
        if (w46Var instanceof u46) {
            remoteViews.setViewLayoutWidth(i, -2.0f, 0);
            return;
        }
        if (w46Var instanceof o46) {
            remoteViews.setViewLayoutWidth(i, MTTypesetterKt.kLineSkipLimitMultiplier, 0);
            return;
        }
        if (w46Var instanceof n46) {
            remoteViews.setViewLayoutWidth(i, ((n46) w46Var).a, 1);
        } else if (w46Var.equals(p46.a)) {
            remoteViews.setViewLayoutWidth(i, -1.0f, 0);
        } else {
            wg6.i();
        }
    }
}
