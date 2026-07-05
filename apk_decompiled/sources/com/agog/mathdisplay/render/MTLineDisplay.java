package com.agog.mathdisplay.render;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.agog.mathdisplay.parse.NSRange;
import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\nJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/agog/mathdisplay/render/MTLineDisplay;", "Lcom/agog/mathdisplay/render/MTDisplay;", "Lcom/agog/mathdisplay/render/MTMathListDisplay;", "inner", "Lcom/agog/mathdisplay/parse/NSRange;", "range", "<init>", "(Lcom/agog/mathdisplay/render/MTMathListDisplay;Lcom/agog/mathdisplay/parse/NSRange;)V", "Liei;", "colorChanged", "()V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "positionChanged", "updateInnerPosition", "Lcom/agog/mathdisplay/render/MTMathListDisplay;", "getInner", "()Lcom/agog/mathdisplay/render/MTMathListDisplay;", "", "lineShiftUp", "F", "getLineShiftUp", "()F", "setLineShiftUp", "(F)V", "lineThickness", "getLineThickness", "setLineThickness", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTLineDisplay extends MTDisplay {
    private final MTMathListDisplay inner;
    private float lineShiftUp;
    private float lineThickness;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTLineDisplay(MTMathListDisplay mTMathListDisplay, NSRange nSRange) {
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
        Paint paint = new Paint(193);
        paint.setColor(getTextColor());
        paint.setStrokeWidth(this.lineThickness);
        canvas.drawLine(getPosition().getX(), getPosition().getY() + this.lineShiftUp, getWidth() + getPosition().getX(), getPosition().getY() + this.lineShiftUp, paint);
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
