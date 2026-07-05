package defpackage;

import android.graphics.drawable.Icon;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zu8 {
    public static Icon a(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static void b(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING);
        window.setDecorFitsSystemWindows(z);
    }
}
