package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class fvi {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static bdj b(View view, bdj bdjVar, Rect rect) {
        WindowInsets windowInsetsB = bdjVar.b();
        if (windowInsetsB != null) {
            return bdj.c(view.computeSystemWindowInsets(windowInsetsB, rect), view);
        }
        rect.setEmpty();
        return bdjVar;
    }

    public static void c(View view, ldc ldcVar) {
        evi eviVar = ldcVar != null ? new evi(view, ldcVar) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, eviVar);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (eviVar != null) {
            view.setOnApplyWindowInsetsListener(eviVar);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }
}
