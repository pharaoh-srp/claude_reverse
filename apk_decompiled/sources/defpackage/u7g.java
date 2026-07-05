package defpackage;

import android.graphics.Paint;

/* JADX INFO: loaded from: classes3.dex */
public final class u7g {
    public final pk7 a;
    public final Paint b;

    public u7g(pk7 pk7Var) {
        this.a = pk7Var;
        Paint paint = new Paint(1);
        paint.setColor(pk7Var.a);
        this.b = paint;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u7g) && this.a.equals(((u7g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SingleLineFill(fill=" + this.a + ")";
    }
}
