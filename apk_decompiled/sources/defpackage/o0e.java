package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.style.QuoteSpan;

/* JADX INFO: loaded from: classes2.dex */
public final class o0e extends QuoteSpan {
    public static final Parcelable.Creator<o0e> CREATOR = new s38(13);
    public final int E;
    public final int F;
    public final int G;

    public o0e(Parcel parcel) {
        int i = parcel.readInt();
        int i2 = parcel.readInt();
        int i3 = parcel.readInt();
        this.E = i;
        this.F = i2;
        this.G = i3;
    }

    @Override // android.text.style.QuoteSpan, android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        canvas.getClass();
        paint.getClass();
        charSequence.getClass();
        layout.getClass();
        Paint.Style style = paint.getStyle();
        int color = paint.getColor();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.E);
        canvas.drawRect(i, i3, (i2 * this.F) + i, i5, paint);
        paint.setStyle(style);
        paint.setColor(color);
    }

    @Override // android.text.style.QuoteSpan
    public final int getColor() {
        return this.E;
    }

    @Override // android.text.style.QuoteSpan
    public final int getGapWidth() {
        return this.G;
    }

    @Override // android.text.style.QuoteSpan, android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.F + this.G;
    }

    @Override // android.text.style.QuoteSpan
    public final int getStripeWidth() {
        return this.F;
    }

    @Override // android.text.style.QuoteSpan, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.E);
        parcel.writeInt(this.F);
        parcel.writeInt(this.G);
    }
}
