package defpackage;

import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class wdh {
    public static final hj6 n = new hj6(27);
    public final int a;
    public final Typeface b;
    public final float c;
    public final Layout.Alignment d;
    public final Float e;
    public final int f;
    public final TextUtils.TruncateAt g;
    public final e59 h;
    public final e59 i;
    public final udh j;
    public final TextPaint k;
    public StaticLayout l;
    public StaticLayout m;

    public wdh(int i, e59 e59Var) {
        Typeface typeface = Typeface.DEFAULT;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        udh udhVar = new udh();
        typeface.getClass();
        alignment.getClass();
        this.a = i;
        this.b = typeface;
        this.c = 12.0f;
        this.d = alignment;
        this.e = null;
        this.f = 1;
        this.g = truncateAt;
        this.h = e59.e;
        this.i = e59Var;
        this.j = udhVar;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(i);
        textPaint.setTypeface(typeface);
        textPaint.setTextSize(MTTypesetterKt.kLineSkipLimitMultiplier);
        this.k = textPaint;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(defpackage.wdh r19, defpackage.yd2 r20, java.lang.CharSequence r21, float r22, float r23, defpackage.x9d r24, defpackage.y9d r25, int r26, int r27, float r28, int r29) {
        /*
            Method dump skipped, instruction units count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wdh.a(wdh, yd2, java.lang.CharSequence, float, float, x9d, y9d, int, int, float, int):void");
    }

    public static float d(wdh wdhVar, w5b w5bVar, CharSequence charSequence, int i, float f, int i2) {
        if ((i2 & 4) != 0) {
            i = 100000;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            f = MTTypesetterKt.kLineSkipLimitMultiplier;
        }
        float f2 = f;
        boolean z = true;
        if ((i2 & 32) != 0 && charSequence != null) {
            z = false;
        }
        wdhVar.getClass();
        w5bVar.getClass();
        return wdhVar.c(w5bVar, charSequence, i3, 100000, f2, z).height();
    }

    public static float f(wdh wdhVar, w5b w5bVar, CharSequence charSequence, int i, int i2, float f, int i3) {
        if ((i3 & 4) != 0) {
            i = 100000;
        }
        if ((i3 & 8) != 0) {
            i2 = 100000;
        }
        if ((i3 & 16) != 0) {
            f = MTTypesetterKt.kLineSkipLimitMultiplier;
        }
        boolean z = true;
        if ((i3 & 32) != 0 && charSequence != null) {
            z = false;
        }
        wdhVar.getClass();
        w5bVar.getClass();
        return wdhVar.c(w5bVar, charSequence, i, i2, f, z).width();
    }

    public final float b(w5b w5bVar, StaticLayout staticLayout) {
        float f = fhk.f(staticLayout);
        this.j.getClass();
        w5bVar.getClass();
        float fB = w5bVar.b(MTTypesetterKt.kLineSkipLimitMultiplier) - w5bVar.b(this.i.a());
        if (f < fB) {
            f = fB;
        }
        float width = staticLayout.getWidth();
        return f > width ? width : f;
    }

    public final RectF c(w5b w5bVar, CharSequence charSequence, int i, int i2, float f, boolean z) {
        CharSequence charSequence2;
        w5bVar.getClass();
        if (charSequence == null) {
            charSequence = "";
        }
        if (z) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            int size = this.f - bsg.N0(spannableStringBuilder).size();
            if (size < 0) {
                size = 0;
            }
            for (int i3 = 0; i3 < size; i3++) {
                spannableStringBuilder.append('\n');
            }
            charSequence2 = spannableStringBuilder;
        } else {
            charSequence2 = charSequence;
        }
        StaticLayout staticLayoutE = e(w5bVar, charSequence2, i, i2, f);
        RectF rectF = new RectF(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, fhk.f(staticLayoutE), staticLayoutE.getSpacingAdd() + staticLayoutE.getHeight());
        float fB = b(w5bVar, staticLayoutE);
        e59 e59Var = this.i;
        rectF.right = w5bVar.b(e59Var.a()) + fB;
        rectF.bottom = w5bVar.b(e59Var.b + e59Var.d) + rectF.bottom;
        nkk.h(rectF, f);
        float f2 = rectF.right;
        e59 e59Var2 = this.h;
        rectF.right = w5bVar.b(e59Var2.a()) + f2;
        rectF.bottom = w5bVar.b(e59Var2.b + e59Var2.d) + rectF.bottom;
        return rectF;
    }

    public final StaticLayout e(w5b w5bVar, CharSequence charSequence, int i, int i2, float f) {
        float bottomPadding;
        TextPaint textPaint;
        float fA = w5bVar.a(this.c);
        TextPaint textPaint2 = this.k;
        textPaint2.setTextSize(fA);
        i52 i52VarK = w5bVar.k();
        Object[] objArr = {Integer.valueOf(textPaint2.getTypeface().hashCode()), Float.valueOf(textPaint2.getTextSize())};
        i52VarK.getClass();
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 2);
        hj6 hj6Var = n;
        Object objA = i52VarK.a(hj6Var, objArrCopyOf);
        if (objA == null) {
            objA = fhk.h("", textPaint2, 100000, 0, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, 4088);
            i52VarK.b(hj6Var, Arrays.copyOf(objArr, 2), objA);
        }
        this.m = (StaticLayout) objA;
        e59 e59Var = this.h;
        int iL = i - w5bVar.l(e59Var.a());
        int iL2 = i2 - w5bVar.l(e59Var.b + e59Var.d);
        Float f2 = this.e;
        if (f2 != null) {
            float fA2 = w5bVar.a(f2.floatValue());
            if (this.m == null) {
                x44.o0("measuringLayout");
                throw null;
            }
            float height = fA2 - r10.getHeight();
            if (this.m == null) {
                x44.o0("measuringLayout");
                throw null;
            }
            float topPadding = height - r10.getTopPadding();
            if (this.m == null) {
                x44.o0("measuringLayout");
                throw null;
            }
            bottomPadding = topPadding - r10.getBottomPadding();
        } else {
            bottomPadding = 0.0f;
        }
        float f3 = f % 180.0f;
        e59 e59Var2 = this.i;
        int i3 = this.f;
        if (f3 == MTTypesetterKt.kLineSkipLimitMultiplier) {
            textPaint = textPaint2;
        } else if (f % 90.0f == MTTypesetterKt.kLineSkipLimitMultiplier) {
            iL = iL2;
            textPaint = textPaint2;
        } else {
            float f4 = i3;
            if (this.m == null) {
                x44.o0("measuringLayout");
                throw null;
            }
            double radians = Math.toRadians(f);
            double dAbs = Math.abs(Math.sin(radians));
            double dAbs2 = Math.abs(Math.cos(radians));
            double d = iL;
            double height2 = ((r10.getHeight() + bottomPadding) * f4) + w5bVar.l(e59Var2.b + e59Var2.d);
            textPaint = textPaint2;
            iL = (int) Math.min((d - (height2 * dAbs)) / dAbs2, (((double) iL2) - (height2 * dAbs2)) / dAbs);
        }
        int iL3 = iL - w5bVar.l(e59Var2.a());
        if (iL3 < 0) {
            iL3 = 0;
        }
        int i4 = iL3;
        i52 i52VarK2 = w5bVar.k();
        Object[] objArr2 = {Integer.valueOf(charSequence.hashCode()), Integer.valueOf(textPaint.getColor()), Integer.valueOf(textPaint.getTypeface().hashCode()), Float.valueOf(textPaint.getTextSize()), Float.valueOf(bottomPadding), Integer.valueOf(i4), Integer.valueOf(i3), this.g, this.d};
        i52VarK2.getClass();
        Object objA2 = i52VarK2.a(hj6Var, Arrays.copyOf(objArr2, 9));
        if (objA2 == null) {
            objA2 = fhk.h(charSequence, textPaint, i4, this.f, bottomPadding, this.g, this.d, 1392);
            i52VarK2.b(hj6Var, Arrays.copyOf(objArr2, 9), objA2);
        }
        return (StaticLayout) objA2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wdh)) {
            return false;
        }
        wdh wdhVar = (wdh) obj;
        return this.a == wdhVar.a && x44.r(this.b, wdhVar.b) && this.c == wdhVar.c && x44.q(this.e, wdhVar.e) && this.d == wdhVar.d && this.f == wdhVar.f && this.g == wdhVar.g && x44.r(this.h, wdhVar.h) && x44.r(this.i, wdhVar.i) && x44.r(this.j, wdhVar.j);
    }

    public final int hashCode() {
        int iB = vb7.b(this.c, (this.b.hashCode() + (this.a * 31)) * 31, 31);
        Float f = this.e;
        int iHashCode = (((this.d.hashCode() + ((iB + (f != null ? f.hashCode() : 0)) * 31)) * 31) + this.f) * 31;
        TextUtils.TruncateAt truncateAt = this.g;
        int iHashCode2 = truncateAt != null ? truncateAt.hashCode() : 0;
        int iHashCode3 = this.h.hashCode();
        int iHashCode4 = this.i.hashCode();
        this.j.getClass();
        return Float.hashCode(MTTypesetterKt.kLineSkipLimitMultiplier) + ((iHashCode4 + ((iHashCode3 + ((iHashCode + iHashCode2) * 31)) * 31)) * 961);
    }
}
