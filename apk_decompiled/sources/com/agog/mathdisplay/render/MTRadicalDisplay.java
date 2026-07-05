package com.agog.mathdisplay.render;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.agog.mathdisplay.parse.NSRange;
import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0017\u001a\u0004\b$\u0010\u0019\"\u0004\b\r\u0010%R\"\u0010&\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!\"\u0004\b(\u0010#R\"\u0010)\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010!\"\u0004\b+\u0010#¨\u0006,"}, d2 = {"Lcom/agog/mathdisplay/render/MTRadicalDisplay;", "Lcom/agog/mathdisplay/render/MTDisplay;", "Lcom/agog/mathdisplay/render/MTMathListDisplay;", "radicand", "radicalGlyph", "Lcom/agog/mathdisplay/parse/NSRange;", "range", "<init>", "(Lcom/agog/mathdisplay/render/MTMathListDisplay;Lcom/agog/mathdisplay/render/MTDisplay;Lcom/agog/mathdisplay/parse/NSRange;)V", "degree", "Lcom/agog/mathdisplay/render/MTFontMathTable;", "fontMetrics", "Liei;", "setDegree", "(Lcom/agog/mathdisplay/render/MTMathListDisplay;Lcom/agog/mathdisplay/render/MTFontMathTable;)V", "positionChanged", "()V", "updateRadicandPosition", "colorChanged", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "Lcom/agog/mathdisplay/render/MTMathListDisplay;", "getRadicand", "()Lcom/agog/mathdisplay/render/MTMathListDisplay;", "Lcom/agog/mathdisplay/render/MTDisplay;", "getRadicalGlyph", "()Lcom/agog/mathdisplay/render/MTDisplay;", "", "radicalShift", "F", "getRadicalShift", "()F", "setRadicalShift", "(F)V", "getDegree", "(Lcom/agog/mathdisplay/render/MTMathListDisplay;)V", "topKern", "getTopKern", "setTopKern", "lineThickness", "getLineThickness", "setLineThickness", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTRadicalDisplay extends MTDisplay {
    private MTMathListDisplay degree;
    private float lineThickness;
    private final MTDisplay radicalGlyph;
    private float radicalShift;
    private final MTMathListDisplay radicand;
    private float topKern;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTRadicalDisplay(MTMathListDisplay mTMathListDisplay, MTDisplay mTDisplay, NSRange nSRange) {
        super(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, nSRange, false, 23, null);
        mTMathListDisplay.getClass();
        mTDisplay.getClass();
        nSRange.getClass();
        this.radicand = mTMathListDisplay;
        this.radicalGlyph = mTDisplay;
        updateRadicandPosition();
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public void colorChanged() {
        this.radicand.setTextColor(getTextColor());
        this.radicalGlyph.setTextColor(getTextColor());
        MTMathListDisplay mTMathListDisplay = this.degree;
        if (mTMathListDisplay != null) {
            mTMathListDisplay.setTextColor(getTextColor());
        }
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public void draw(Canvas canvas) {
        canvas.getClass();
        this.radicand.draw(canvas);
        MTMathListDisplay mTMathListDisplay = this.degree;
        if (mTMathListDisplay != null) {
            mTMathListDisplay.draw(canvas);
        }
        canvas.save();
        canvas.translate(getPosition().getX() + this.radicalShift, getPosition().getY());
        this.radicalGlyph.draw(canvas);
        float f = this.topKern;
        Paint paint = new Paint(193);
        paint.setColor(getTextColor());
        paint.setStrokeWidth(this.lineThickness);
        paint.setStrokeCap(Paint.Cap.ROUND);
        float width = this.radicalGlyph.getWidth();
        float ascent = (getAscent() - f) - (this.lineThickness / 2.0f);
        canvas.drawLine(width, ascent, this.radicand.getWidth() + width, ascent, paint);
        canvas.restore();
    }

    public final MTMathListDisplay getDegree() {
        return this.degree;
    }

    public final float getLineThickness() {
        return this.lineThickness;
    }

    public final MTDisplay getRadicalGlyph() {
        return this.radicalGlyph;
    }

    public final float getRadicalShift() {
        return this.radicalShift;
    }

    public final MTMathListDisplay getRadicand() {
        return this.radicand;
    }

    public final float getTopKern() {
        return this.topKern;
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public void positionChanged() {
        updateRadicandPosition();
    }

    public final void setDegree(MTMathListDisplay degree, MTFontMathTable fontMetrics) {
        degree.getClass();
        fontMetrics.getClass();
        float radicalKernBeforeDegree = fontMetrics.getRadicalKernBeforeDegree();
        float radicalKernAfterDegree = fontMetrics.getRadicalKernAfterDegree();
        float ascent = (getAscent() - getDescent()) * fontMetrics.getRadicalDegreeBottomRaisePercent();
        this.degree = degree;
        float width = degree.getWidth() + radicalKernBeforeDegree + radicalKernAfterDegree;
        this.radicalShift = width;
        if (width < MTTypesetterKt.kLineSkipLimitMultiplier) {
            radicalKernBeforeDegree -= width;
            this.radicalShift = MTTypesetterKt.kLineSkipLimitMultiplier;
        }
        MTMathListDisplay mTMathListDisplay = this.degree;
        if (mTMathListDisplay != null) {
            mTMathListDisplay.setPosition(new CGPoint(getPosition().getX() + radicalKernBeforeDegree, getPosition().getY() + ascent));
            setWidth(this.radicand.getWidth() + this.radicalGlyph.getWidth() + this.radicalShift);
        }
        updateRadicandPosition();
    }

    public final void setLineThickness(float f) {
        this.lineThickness = f;
    }

    public final void setRadicalShift(float f) {
        this.radicalShift = f;
    }

    public final void setTopKern(float f) {
        this.topKern = f;
    }

    public final void updateRadicandPosition() {
        this.radicand.setPosition(new CGPoint(this.radicalGlyph.getWidth() + getPosition().getX() + this.radicalShift, getPosition().getY()));
    }

    public final void setDegree(MTMathListDisplay mTMathListDisplay) {
        this.degree = mTMathListDisplay;
    }
}
