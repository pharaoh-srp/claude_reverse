package defpackage;

import android.graphics.RectF;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public interface w5b {
    float a(float f);

    default float b(float f) {
        return getDensity() * f;
    }

    uub e();

    boolean g();

    float getDensity();

    RectF h();

    default int j() {
        return g() ? 1 : -1;
    }

    i52 k();

    default int l(float f) {
        return (int) b(f);
    }

    default void reset() {
        i52 i52VarK = k();
        i52VarK.a = i52VarK.b;
        i52VarK.b = new LinkedHashMap();
    }
}
