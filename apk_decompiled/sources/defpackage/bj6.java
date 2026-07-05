package defpackage;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.anthropic.claude.mainactivity.MainActivity;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class bj6 {
    public static cj6 a;

    static {
        Color.argb(230, 255, 255, 255);
        Color.argb(FreeTypeConstants.FT_LOAD_PEDANTIC, 27, 27, 27);
    }

    public static final void a(ba4 ba4Var, e1h e1hVar, e1h e1hVar2) throws Throwable {
        View decorView = ba4Var.getWindow().getDecorView();
        decorView.getClass();
        cj6 gj6Var = a;
        if (gj6Var == null) {
            int i = Build.VERSION.SDK_INT;
            gj6Var = i >= 35 ? new gj6() : i >= 30 ? new fj6() : i >= 29 ? new ej6() : i >= 28 ? new dj6() : new cj6();
            a = gj6Var;
        }
        cj6 cj6Var = gj6Var;
        lg1 lg1Var = new lg1(cj6Var, e1hVar, e1hVar2, ba4Var, decorView, 2);
        ViewGroup viewGroup = (ViewGroup) decorView;
        int i2 = 0;
        while (true) {
            if (!(i2 < viewGroup.getChildCount())) {
                aj6 aj6Var = new aj6(lg1Var, viewGroup.getContext());
                aj6Var.setTag(cj6Var);
                aj6Var.setVisibility(8);
                aj6Var.setWillNotDraw(true);
                viewGroup.addView(aj6Var);
                break;
            }
            int i3 = i2 + 1;
            View childAt = viewGroup.getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.getTag() instanceof cj6) {
                break;
            } else {
                i2 = i3;
            }
        }
        lg1Var.run();
        Window window = ba4Var.getWindow();
        window.getClass();
        cj6Var.a(window);
    }

    public static void b(MainActivity mainActivity, e1h e1hVar) {
        a(mainActivity, new e1h(0, 0, 0, new yeg(7)), e1hVar);
    }
}
