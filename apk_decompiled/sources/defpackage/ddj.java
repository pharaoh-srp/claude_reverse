package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public class ddj extends fdj {
    public final WindowInsetsController a;
    public final Window b;

    public ddj(Window window) {
        this.a = window.getInsetsController();
        this.b = window;
    }

    @Override // defpackage.fdj
    public boolean b() {
        Window window = this.b;
        if (window != null) {
            return (window.getDecorView().getSystemUiVisibility() & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0;
        }
        this.a.setSystemBarsAppearance(0, 0);
        return (this.a.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // defpackage.fdj
    public void c(boolean z) {
        e(16, 16, z);
    }

    @Override // defpackage.fdj
    public void d(boolean z) {
        e(FreeTypeConstants.FT_LOAD_LINEAR_DESIGN, 8, z);
    }

    public final void e(int i, int i2, boolean z) {
        Window window = this.b;
        if (window == null) {
            WindowInsetsController windowInsetsController = this.a;
            if (z) {
                windowInsetsController.setSystemBarsAppearance(i2, i2);
                return;
            } else {
                windowInsetsController.setSystemBarsAppearance(0, i2);
                return;
            }
        }
        if (z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility((~i) & decorView2.getSystemUiVisibility());
        }
    }
}
