package defpackage;

import android.graphics.Paint;

/* JADX INFO: loaded from: classes3.dex */
public final class k5a {
    public final Paint.Cap a;

    public k5a(Paint.Cap cap) {
        cap.getClass();
        this.a = cap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k5a) {
            return Float.compare(2.0f, 2.0f) == 0 && this.a == ((k5a) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (Float.hashCode(2.0f) * 31);
    }

    public final String toString() {
        return "Continuous(thicknessDp=2.0, cap=" + this.a + ")";
    }
}
