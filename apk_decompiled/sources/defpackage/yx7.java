package defpackage;

import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import androidx.fragment.app.strictmode.Violation;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yx7 {
    public static final xx7 a = xx7.a;

    public static xx7 a(cx7 cx7Var) {
        while (cx7Var != null) {
            if (cx7Var.p()) {
                cx7Var.l();
            }
            cx7Var = cx7Var.a0;
        }
        return a;
    }

    public static void b(Violation violation) {
        if (rx7.J(3)) {
            violation.E.getClass();
        }
    }

    public static final void c(cx7 cx7Var, String str) {
        str.getClass();
        b(new FragmentReuseViolation(cx7Var, "Attempting to reuse fragment " + cx7Var + " with previous ID " + str));
        a(cx7Var).getClass();
    }

    public static final void d(cx7 cx7Var, ViewGroup viewGroup) {
        b(new FragmentTagUsageViolation(cx7Var, "Attempting to use <fragment> tag to add fragment " + cx7Var + " to container " + viewGroup));
        a(cx7Var).getClass();
    }
}
