package defpackage;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jqi {
    public static final Bitmap.Config[] a = {Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};
    public static final Bitmap.Config b = Bitmap.Config.HARDWARE;

    public static final int a(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    public static final int b(Configuration configuration) {
        return configuration.uiMode & 48;
    }

    public static final Bitmap.Config[] c() {
        return a;
    }

    public static final int d(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }

    public static final boolean e(dli dliVar) {
        return x44.r(dliVar.c, "file") && x44.r(w44.N0(kud.m(dliVar)), "android_asset");
    }

    public static final void f(wv8 wv8Var) {
        if (wv8Var instanceof gr1) {
            ((gr1) wv8Var).a.prepareToDraw();
        }
    }
}
