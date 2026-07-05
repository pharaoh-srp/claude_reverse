package defpackage;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class el7 {
    public static void a(Drawable drawable) {
        if (drawable instanceof AnimatedVectorDrawable) {
            ((AnimatedVectorDrawable) drawable).start();
        }
    }
}
