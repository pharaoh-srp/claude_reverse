package com.agog.mathdisplay.render;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.agog.mathdisplay.parse.NSRange;
import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\fJ\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001f¨\u0006#"}, d2 = {"Lcom/agog/mathdisplay/render/MTArrowLineDisplay;", "Lcom/agog/mathdisplay/render/MTDisplay;", "Lcom/agog/mathdisplay/render/MTMathListDisplay;", "inner", "Lcom/agog/mathdisplay/parse/NSRange;", "range", "Lcom/agog/mathdisplay/render/MTArrowDirection;", "direction", "<init>", "(Lcom/agog/mathdisplay/render/MTMathListDisplay;Lcom/agog/mathdisplay/parse/NSRange;Lcom/agog/mathdisplay/render/MTArrowDirection;)V", "Liei;", "colorChanged", "()V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "positionChanged", "updateInnerPosition", "Lcom/agog/mathdisplay/render/MTMathListDisplay;", "getInner", "()Lcom/agog/mathdisplay/render/MTMathListDisplay;", "Lcom/agog/mathdisplay/render/MTArrowDirection;", "getDirection", "()Lcom/agog/mathdisplay/render/MTArrowDirection;", "", "lineShiftUp", "F", "getLineShiftUp", "()F", "setLineShiftUp", "(F)V", "lineThickness", "getLineThickness", "setLineThickness", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTArrowLineDisplay extends MTDisplay {
    private final MTArrowDirection direction;
    private final MTMathListDisplay inner;
    private float lineShiftUp;
    private float lineThickness;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTArrowLineDisplay(MTMathListDisplay mTMathListDisplay, NSRange nSRange, MTArrowDirection mTArrowDirection) {
        super(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, nSRange, false, 23, null);
        mTMathListDisplay.getClass();
        nSRange.getClass();
        mTArrowDirection.getClass();
        this.inner = mTMathListDisplay;
        this.direction = mTArrowDirection;
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
        Paint paint = new Paint(193);
        paint.setColor(getTextColor());
        paint.setStrokeWidth(this.lineThickness);
        canvas.drawLine(getPosition().getX(), getPosition().getY() + this.lineShiftUp, getWidth() + getPosition().getX(), getPosition().getY() + this.lineShiftUp, paint);
        float f = this.lineThickness * 3.0f;
        float y = getPosition().getY() + this.lineShiftUp;
        MTArrowDirection mTArrowDirection = this.direction;
        if (mTArrowDirection == MTArrowDirection.LEFT || mTArrowDirection == MTArrowDirection.BOTH) {
            canvas.drawLine(getPosition().getX() + f, y - f, getPosition().getX(), y, paint);
            float f2 = y + f;
            y = y;
            canvas.drawLine(getPosition().getX(), y, getPosition().getX() + f, f2, paint);
        }
        float f3 = y;
        MTArrowDirection mTArrowDirection2 = this.direction;
        if (mTArrowDirection2 == MTArrowDirection.RIGHT || mTArrowDirection2 == MTArrowDirection.BOTH) {
            canvas.drawLine((getWidth() + getPosition().getX()) - f, f3 - f, getWidth() + getPosition().getX(), f3, paint);
            canvas.drawLine(getWidth() + getPosition().getX(), f3, (getWidth() + getPosition().getX()) - f, f3 + f, paint);
        }
    }

    public final MTArrowDirection getDirection() {
        return this.direction;
    }

    public final MTMathListDisplay getInner() {
        return this.inner;
    }

    public final float getLineShiftUp() {
        return this.lineShiftUp;
    }

    public final float getLineThickness() {
        return this.lineThickness;
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public void positionChanged() {
        updateInnerPosition();
    }

    public final void setLineShiftUp(float f) {
        this.lineShiftUp = f;
    }

    public final void setLineThickness(float f) {
        this.lineThickness = f;
    }

    public final void updateInnerPosition() {
        this.inner.setPosition(new CGPoint(getPosition().getX(), getPosition().getY()));
    }
}
