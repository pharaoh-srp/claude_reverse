package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.window.SplashScreenView;
import com.anthropic.claude.mainactivity.MainActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class mig extends ire {
    public SplashScreenView H;

    @Override // defpackage.ire
    public final void f() {
    }

    @Override // defpackage.ire
    public final ViewGroup i() {
        SplashScreenView splashScreenView = this.H;
        if (splashScreenView != null) {
            return splashScreenView;
        }
        x44.o0("platformView");
        throw null;
    }

    @Override // defpackage.ire
    public final void m() {
        MainActivity mainActivity = (MainActivity) this.F;
        SplashScreenView splashScreenView = this.H;
        if (splashScreenView == null) {
            x44.o0("platformView");
            throw null;
        }
        splashScreenView.remove();
        if (Build.VERSION.SDK_INT < 33) {
            Resources.Theme theme = mainActivity.getTheme();
            theme.getClass();
            View decorView = mainActivity.getWindow().getDecorView();
            decorView.getClass();
            rrk.h(theme, decorView, new TypedValue());
        }
    }
}
