package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class e6a implements LineHeightSpan {
    public final float E;
    public final int F;
    public final boolean G;
    public final boolean H;
    public final float I;
    public final int J;
    public int K = Integer.MIN_VALUE;
    public int L = Integer.MIN_VALUE;
    public int M = Integer.MIN_VALUE;
    public int N = Integer.MIN_VALUE;
    public int O;
    public int P;

    public e6a(float f, int i, boolean z, boolean z2, float f2, int i2) {
        this.E = f;
        this.F = i;
        this.G = z;
        this.H = z2;
        this.I = f2;
        this.J = i2;
        if ((MTTypesetterKt.kLineSkipLimitMultiplier > f2 || f2 > 1.0f) && f2 != -1.0f) {
            c39.c("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 <= 0) {
            return;
        }
        boolean z = i == 0;
        boolean z2 = i2 == this.F;
        int i7 = this.J;
        boolean z3 = this.H;
        boolean z4 = this.G;
        if (z && z2 && z4 && z3 && i7 != 2) {
            return;
        }
        if (this.K == Integer.MIN_VALUE) {
            int i8 = i5 - i6;
            int iCeil = (int) Math.ceil(this.E);
            int i9 = iCeil - i8;
            if (i7 != 1 || i9 > 0) {
                float fAbs = this.I;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int iCeil2 = (int) (i9 <= 0 ? Math.ceil(i9 * fAbs) : Math.ceil((1.0f - fAbs) * i9));
                int i10 = fontMetricsInt.descent;
                int i11 = iCeil2 + i10;
                this.M = i11;
                int i12 = i11 - iCeil;
                this.L = i12;
                if (i7 == 0 || i9 >= 0) {
                    if (z4) {
                        i12 = fontMetricsInt.ascent;
                    }
                    this.K = i12;
                    if (z3) {
                        i11 = i10;
                    }
                    this.N = i11;
                    this.O = fontMetricsInt.ascent - i12;
                    this.P = i11 - i10;
                } else if (i7 == 2) {
                    int i13 = fontMetricsInt.ascent;
                    this.K = z4 ? Math.max(i13, i12) : Math.min(i13, i12);
                    int i14 = fontMetricsInt.descent;
                    int i15 = this.M;
                    this.N = z3 ? Math.min(i14, i15) : Math.max(i14, i15);
                    this.O = 0;
                    this.P = 0;
                }
            } else {
                int i16 = fontMetricsInt.ascent;
                this.L = i16;
                int i17 = fontMetricsInt.descent;
                this.M = i17;
                this.K = i16;
                this.N = i17;
                this.O = 0;
                this.P = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.K : this.L;
        fontMetricsInt.descent = z2 ? this.N : this.M;
    }
}
