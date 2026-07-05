package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class gr1 implements wv8 {
    public final Bitmap a;

    public gr1(Bitmap bitmap) {
        this.a = bitmap;
    }

    @Override // defpackage.wv8
    public final int a() {
        return this.a.getHeight();
    }

    @Override // defpackage.wv8
    public final int b() {
        return this.a.getWidth();
    }

    @Override // defpackage.wv8
    public final long c() {
        int allocationByteCount;
        Bitmap bitmap = this.a;
        if (!bitmap.isRecycled()) {
            try {
                allocationByteCount = bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                allocationByteCount = (config == Bitmap.Config.ALPHA_8 ? 1 : (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) ? 2 : config == Bitmap.Config.RGBA_F16 ? 8 : 4) * height;
            }
            return allocationByteCount;
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    @Override // defpackage.wv8
    public final boolean d() {
        return true;
    }

    @Override // defpackage.wv8
    public final void e(Canvas canvas) {
        canvas.drawBitmap(this.a, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, (Paint) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gr1) && x44.r(this.a, ((gr1) obj).a);
    }

    public final Bitmap f() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BitmapImage(bitmap=" + this.a + ", shareable=true)";
    }
}
