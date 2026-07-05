package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* JADX INFO: loaded from: classes2.dex */
public final class ch0 {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static ch0 c;
    public upe a;

    public static synchronized ch0 a() {
        try {
            if (c == null) {
                c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public static synchronized void c() {
        if (c == null) {
            ch0 ch0Var = new ch0();
            c = ch0Var;
            ch0Var.a = upe.c();
            upe upeVar = c.a;
            jud judVar = new jud(1);
            synchronized (upeVar) {
                upeVar.e = judVar;
            }
        }
    }

    public static void d(Drawable drawable, krh krhVar, int[] iArr) {
        PorterDuff.Mode mode = upe.f;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = krhVar.d;
            if (!z && !krhVar.c) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilterF = null;
            ColorStateList colorStateList = z ? krhVar.a : null;
            PorterDuff.Mode mode2 = krhVar.c ? krhVar.b : upe.f;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterF = upe.f(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterF);
        }
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.e(context, i);
    }
}
