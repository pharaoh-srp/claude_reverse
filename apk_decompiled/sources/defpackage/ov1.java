package defpackage;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes3.dex */
public interface ov1 {
    default void c(Float f, Float f2, Float f3, Float f4) {
        nkk.i(getBounds(), f, f2, f3, f4);
    }

    RectF getBounds();
}
