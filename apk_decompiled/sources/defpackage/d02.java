package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.BulletSpan;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class d02 extends BulletSpan {
    public static final Parcelable.Creator<d02> CREATOR = new dpj(7);
    public final int E;
    public final float F;
    public final float G;
    public final int H;

    public d02(Parcel parcel) {
        int i = parcel.readInt();
        float f = parcel.readFloat();
        float f2 = parcel.readFloat();
        int i2 = parcel.readInt();
        this.E = i;
        this.F = f;
        this.G = f2;
        this.H = i2;
    }

    @Override // android.text.style.BulletSpan, android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int color;
        float strokeWidth;
        float f;
        canvas.getClass();
        paint.getClass();
        charSequence.getClass();
        if (((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint.Style style = paint.getStyle();
            int i8 = this.E;
            if (i8 != 0) {
                color = paint.getColor();
                paint.setColor(i8);
            } else {
                color = 0;
            }
            float f2 = this.G;
            boolean zIsNaN = Float.isNaN(f2);
            float f3 = this.F;
            if (zIsNaN) {
                paint.setStyle(Paint.Style.FILL);
                strokeWidth = MTTypesetterKt.kLineSkipLimitMultiplier;
                f = f3;
            } else {
                strokeWidth = paint.getStrokeWidth();
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(f2);
                f = f3 - (f2 / 2.0f);
            }
            canvas.drawCircle((i2 * f3) + i, (i3 + i5) / 2.0f, f, paint);
            if (i8 != 0) {
                paint.setColor(color);
            }
            if (!Float.isNaN(f2)) {
                paint.setStrokeWidth(strokeWidth);
            }
            paint.setStyle(style);
        }
    }

    @Override // android.text.style.BulletSpan
    public final int getBulletRadius() {
        return (int) this.F;
    }

    @Override // android.text.style.BulletSpan
    public final int getColor() {
        return this.E;
    }

    @Override // android.text.style.BulletSpan
    public final int getGapWidth() {
        return this.H;
    }

    @Override // android.text.style.BulletSpan, android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return (int) Math.ceil((2.0f * this.F) + this.H);
    }

    @Override // android.text.style.BulletSpan, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.E);
        parcel.writeFloat(this.F);
        parcel.writeFloat(this.G);
        parcel.writeInt(this.H);
    }
}
