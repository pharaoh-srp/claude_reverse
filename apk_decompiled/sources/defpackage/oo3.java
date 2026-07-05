package defpackage;

import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oo3 {
    public static final long a = ViewConfiguration.getTapTimeout();

    public static final boolean a(u0 u0Var) {
        ViewParent parent = eve.Q(u0Var).getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }
}
