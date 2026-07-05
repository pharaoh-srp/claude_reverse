package com.agog.mathdisplay.render;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.agog.mathdisplay.parse.NSRange;
import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.mdj;
import defpackage.x44;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\"\u0010%\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R*\u0010,\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001c\u001a\u0004\b-\u0010\u001e\"\u0004\b.\u0010 R*\u0010/\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001c\u001a\u0004\b0\u0010\u001e\"\u0004\b1\u0010 R$\u00104\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001a8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b2\u0010\u001e\"\u0004\b3\u0010 R$\u00107\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001a8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b5\u0010\u001e\"\u0004\b6\u0010 R$\u0010:\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001a8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b8\u0010\u001e\"\u0004\b9\u0010 ¨\u0006;"}, d2 = {"Lcom/agog/mathdisplay/render/MTFractionDisplay;", "Lcom/agog/mathdisplay/render/MTDisplay;", "Lcom/agog/mathdisplay/render/MTMathListDisplay;", "numerator", "denominator", "Lcom/agog/mathdisplay/parse/NSRange;", "range", "<init>", "(Lcom/agog/mathdisplay/render/MTMathListDisplay;Lcom/agog/mathdisplay/render/MTMathListDisplay;Lcom/agog/mathdisplay/parse/NSRange;)V", "Liei;", "updateDenominatorPosition", "()V", "updateNumeratorPosition", "positionChanged", "colorChanged", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "Lcom/agog/mathdisplay/render/MTMathListDisplay;", "getNumerator", "()Lcom/agog/mathdisplay/render/MTMathListDisplay;", "setNumerator", "(Lcom/agog/mathdisplay/render/MTMathListDisplay;)V", "getDenominator", "setDenominator", "", "linePosition", "F", "getLinePosition", "()F", "setLinePosition", "(F)V", "lineThickness", "getLineThickness", "setLineThickness", "", "numeratorAlignment", "Ljava/lang/String;", "getNumeratorAlignment", "()Ljava/lang/String;", "setNumeratorAlignment", "(Ljava/lang/String;)V", ExperienceToggle.DEFAULT_PARAM_KEY, "numeratorUp", "getNumeratorUp", "setNumeratorUp", "denominatorDown", "getDenominatorDown", "setDenominatorDown", "getAscent", "setAscent", "ascent", "getDescent", "setDescent", "descent", "getWidth", "setWidth", "width", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTFractionDisplay extends MTDisplay {
    private MTMathListDisplay denominator;
    private float denominatorDown;
    private float linePosition;
    private float lineThickness;
    private MTMathListDisplay numerator;
    private String numeratorAlignment;
    private float numeratorUp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTFractionDisplay(MTMathListDisplay mTMathListDisplay, MTMathListDisplay mTMathListDisplay2, NSRange nSRange) {
        super(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, nSRange, false, 23, null);
        mTMathListDisplay.getClass();
        mTMathListDisplay2.getClass();
        nSRange.getClass();
        this.numerator = mTMathListDisplay;
        this.denominator = mTMathListDisplay2;
        this.numeratorAlignment = "c";
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public void colorChanged() {
        this.numerator.setTextColor(getTextColor());
        this.denominator.setTextColor(getTextColor());
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public void draw(Canvas canvas) {
        canvas.getClass();
        this.numerator.draw(canvas);
        this.denominator.draw(canvas);
        if (this.lineThickness == MTTypesetterKt.kLineSkipLimitMultiplier) {
            return;
        }
        Paint paint = new Paint(193);
        paint.setColor(getTextColor());
        paint.setStrokeWidth(this.lineThickness);
        canvas.drawLine(getPosition().getX(), getPosition().getY() + this.linePosition, getWidth() + getPosition().getX(), getPosition().getY() + this.linePosition, paint);
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public float getAscent() {
        return this.numerator.getAscent() + this.numeratorUp;
    }

    public final MTMathListDisplay getDenominator() {
        return this.denominator;
    }

    public final float getDenominatorDown() {
        return this.denominatorDown;
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public float getDescent() {
        return this.denominator.getDescent() + this.denominatorDown;
    }

    public final float getLinePosition() {
        return this.linePosition;
    }

    public final float getLineThickness() {
        return this.lineThickness;
    }

    public final MTMathListDisplay getNumerator() {
        return this.numerator;
    }

    public final String getNumeratorAlignment() {
        return this.numeratorAlignment;
    }

    public final float getNumeratorUp() {
        return this.numeratorUp;
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public float getWidth() {
        return Math.max(this.numerator.getWidth(), this.denominator.getWidth());
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public void positionChanged() {
        updateDenominatorPosition();
        updateNumeratorPosition();
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public void setAscent(float f) {
    }

    public final void setDenominator(MTMathListDisplay mTMathListDisplay) {
        mTMathListDisplay.getClass();
        this.denominator = mTMathListDisplay;
    }

    public final void setDenominatorDown(float f) {
        this.denominatorDown = f;
        updateDenominatorPosition();
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public void setDescent(float f) {
    }

    public final void setLinePosition(float f) {
        this.linePosition = f;
    }

    public final void setLineThickness(float f) {
        this.lineThickness = f;
    }

    public final void setNumerator(MTMathListDisplay mTMathListDisplay) {
        mTMathListDisplay.getClass();
        this.numerator = mTMathListDisplay;
    }

    public final void setNumeratorAlignment(String str) {
        str.getClass();
        this.numeratorAlignment = str;
    }

    public final void setNumeratorUp(float f) {
        this.numeratorUp = f;
        updateNumeratorPosition();
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public void setWidth(float f) {
    }

    public final void updateDenominatorPosition() {
        this.denominator.setPosition(new CGPoint(((getWidth() - this.denominator.getWidth()) / 2.0f) + getPosition().getX(), getPosition().getY() - this.denominatorDown));
    }

    public final void updateNumeratorPosition() {
        float width = getWidth() - this.numerator.getWidth();
        String str = this.numeratorAlignment;
        if (x44.r(str, "l")) {
            width = MTTypesetterKt.kLineSkipLimitMultiplier;
        } else if (!x44.r(str, "r")) {
            width /= 2.0f;
        }
        this.numerator.setPosition(new CGPoint(getPosition().getX() + width, getPosition().getY() + this.numeratorUp));
    }
}
