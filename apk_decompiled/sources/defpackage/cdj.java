package defpackage;

import android.view.View;
import android.view.Window;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class cdj extends fdj {
    public final Window a;

    public cdj(Window window) {
        this.a = window;
    }

    @Override // defpackage.fdj
    public final boolean b() {
        return (this.a.getDecorView().getSystemUiVisibility() & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0;
    }

    @Override // defpackage.fdj
    public final void c(boolean z) {
        Window window = this.a;
        if (!z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
        } else {
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 16);
        }
    }

    @Override // defpackage.fdj
    public final void d(boolean z) {
        Window window = this.a;
        if (!z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        }
    }
}
