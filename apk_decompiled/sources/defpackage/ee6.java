package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public final class ee6 implements wv8 {
    public final Drawable a;

    public ee6(Drawable drawable) {
        this.a = drawable;
    }

    @Override // defpackage.wv8
    public final int a() {
        return jqi.a(this.a);
    }

    @Override // defpackage.wv8
    public final int b() {
        return jqi.d(this.a);
    }

    @Override // defpackage.wv8
    public final long c() {
        Drawable drawable = this.a;
        long jD = ((long) jqi.d(drawable)) * 4 * ((long) jqi.a(drawable));
        if (jD < 0) {
            return 0L;
        }
        return jD;
    }

    @Override // defpackage.wv8
    public final boolean d() {
        return false;
    }

    @Override // defpackage.wv8
    public final void e(Canvas canvas) {
        this.a.draw(canvas);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ee6) && x44.r(this.a, ((ee6) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DrawableImage(drawable=" + this.a + ", shareable=false)";
    }
}
