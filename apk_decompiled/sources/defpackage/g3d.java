package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class g3d extends ReplacementSpan {
    public final float E;
    public final int F;
    public final float G;
    public final int H;
    public final float I;
    public final float J;
    public final int K;
    public Paint.FontMetricsInt L;
    public int M;
    public int N;
    public boolean O;

    public g3d(float f, int i, float f2, int i2, cz5 cz5Var, int i3) {
        float fW0 = MTTypesetterKt.kLineSkipLimitMultiplier;
        float fW02 = i == 0 ? cz5Var.W0(eve.L(f, 4294967296L)) : 0.0f;
        fW0 = i2 == 0 ? cz5Var.W0(eve.L(f2, 4294967296L)) : fW0;
        this.E = f;
        this.F = i;
        this.G = f2;
        this.H = i2;
        this.I = fW02;
        this.J = fW0;
        this.K = i3;
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.L;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        x44.o0("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.O) {
            c39.c("PlaceholderSpan is not laid out yet.");
        }
        return this.N;
    }

    public final int c() {
        return this.K;
    }

    public final int d() {
        if (!this.O) {
            c39.c("PlaceholderSpan is not laid out yet.");
        }
        return this.M;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float f;
        float f2;
        this.O = true;
        float textSize = paint.getTextSize();
        this.L = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            c39.a("Invalid fontMetrics: line height can not be negative.");
        }
        int i3 = this.F;
        if (i3 == 0) {
            f = this.I;
        } else {
            if (i3 != 1) {
                c39.b("Unsupported unit.");
                sz6.r();
                return 0;
            }
            f = this.E * textSize;
        }
        this.M = (int) Math.ceil(f);
        int i4 = this.H;
        if (i4 == 0) {
            f2 = this.J;
        } else {
            if (i4 != 1) {
                c39.b("Unsupported unit.");
                sz6.r();
                return 0;
            }
            f2 = this.G * textSize;
        }
        this.N = (int) Math.ceil(f2);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            switch (this.K) {
                case 0:
                    if (fontMetricsInt.ascent > (-b())) {
                        fontMetricsInt.ascent = -b();
                    }
                    break;
                case 1:
                case 4:
                    if (b() + fontMetricsInt.ascent > fontMetricsInt.descent) {
                        fontMetricsInt.descent = b() + fontMetricsInt.ascent;
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - b()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - b();
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < b()) {
                        int iB = fontMetricsInt.ascent - ((b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = iB;
                        fontMetricsInt.descent = b() + iB;
                    }
                    break;
                default:
                    c39.a("Unknown verticalAlign.");
                    break;
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        return d();
    }
}
