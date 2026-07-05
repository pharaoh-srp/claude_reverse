package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class j3a extends MetricAffectingSpan {
    public final float E;

    public j3a(float f) {
        this.E = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == MTTypesetterKt.kLineSkipLimitMultiplier) {
            return;
        }
        textPaint.setLetterSpacing(this.E / textScaleX);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == MTTypesetterKt.kLineSkipLimitMultiplier) {
            return;
        }
        textPaint.setLetterSpacing(this.E / textScaleX);
    }
}
