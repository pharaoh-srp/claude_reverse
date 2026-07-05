package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class acj extends dcj {
    public static final PathInterpolator e = new PathInterpolator(MTTypesetterKt.kLineSkipLimitMultiplier, 1.1f, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f);
    public static final ve7 f = new ve7();
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public acj(int i, Interpolator interpolator, long j) {
        super(i, interpolator, j);
    }

    public static void f(ecj ecjVar, View view) {
        s34 s34VarJ = j(view);
        if (s34VarJ != null) {
            s34VarJ.a(ecjVar);
            if (s34VarJ.E == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(ecjVar, viewGroup.getChildAt(i));
            }
        }
    }

    public static void g(View view, ecj ecjVar, bdj bdjVar, boolean z) {
        s34 s34VarJ = j(view);
        if (s34VarJ != null) {
            s34VarJ.F = bdjVar;
            if (!z) {
                s34VarJ.b(ecjVar);
                z = s34VarJ.E == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), ecjVar, bdjVar, z);
            }
        }
    }

    public static void h(View view, bdj bdjVar, List list) {
        s34 s34VarJ = j(view);
        if (s34VarJ != null) {
            bdjVar = s34VarJ.c(bdjVar, list);
            if (s34VarJ.E == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), bdjVar, list);
            }
        }
    }

    public static void i(View view, ecj ecjVar, cbf cbfVar) {
        s34 s34VarJ = j(view);
        if (s34VarJ != null) {
            s34VarJ.d(ecjVar, cbfVar);
            if (s34VarJ.E == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), ecjVar, cbfVar);
            }
        }
    }

    public static s34 j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof zbj) {
            return ((zbj) tag).a;
        }
        return null;
    }

    public static void k(View view, s34 s34Var) {
        View.OnApplyWindowInsetsListener zbjVar = s34Var != null ? new zbj(view, s34Var) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, zbjVar);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(zbjVar);
        }
    }
}
