package com.agog.mathdisplay.render;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.agog.mathdisplay.parse.NSRange;
import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/agog/mathdisplay/render/MTBoxedDisplay;", "Lcom/agog/mathdisplay/render/MTDisplay;", "Lcom/agog/mathdisplay/render/MTMathListDisplay;", "inner", "Lcom/agog/mathdisplay/parse/NSRange;", "range", "<init>", "(Lcom/agog/mathdisplay/render/MTMathListDisplay;Lcom/agog/mathdisplay/parse/NSRange;)V", "Liei;", "positionChanged", "()V", "colorChanged", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "Lcom/agog/mathdisplay/render/MTMathListDisplay;", "getInner", "()Lcom/agog/mathdisplay/render/MTMathListDisplay;", "", "lineThickness", "F", "getLineThickness", "()F", "setLineThickness", "(F)V", "padding", "getPadding", "setPadding", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTBoxedDisplay extends MTDisplay {
    private final MTMathListDisplay inner;
    private float lineThickness;
    private float padding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTBoxedDisplay(MTMathListDisplay mTMathListDisplay, NSRange nSRange) {
        super(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, nSRange, false, 23, null);
        mTMathListDisplay.getClass();
        nSRange.getClass();
        this.inner = mTMathListDisplay;
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public void colorChanged() {
        this.inner.setTextColor(getTextColor());
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public void draw(Canvas canvas) {
        canvas.getClass();
        this.inner.draw(canvas);
        if (this.lineThickness == MTTypesetterKt.kLineSkipLimitMultiplier) {
            return;
        }
        Paint paint = new Paint(1);
        paint.setColor(getTextColor());
        paint.setStrokeWidth(this.lineThickness);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(this.inner.getPosition().getX() - this.padding, (this.inner.getPosition().getY() - this.inner.getDescent()) - this.padding, this.inner.getWidth() + this.inner.getPosition().getX() + this.padding, this.inner.getAscent() + this.inner.getPosition().getY() + this.padding, paint);
    }

    public final MTMathListDisplay getInner() {
        return this.inner;
    }

    public final float getLineThickness() {
        return this.lineThickness;
    }

    public final float getPadding() {
        return this.padding;
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public void positionChanged() {
        this.inner.setPosition(new CGPoint(getPosition().getX() + this.padding, getPosition().getY()));
    }

    public final void setLineThickness(float f) {
        this.lineThickness = f;
    }

    public final void setPadding(float f) {
        this.padding = f;
    }
}
