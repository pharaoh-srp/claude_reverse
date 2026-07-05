package com.agog.mathdisplay.render;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.agog.mathdisplay.parse.MTCancelStyle;
import com.agog.mathdisplay.parse.NSRange;
import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010!\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0015\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019¨\u0006$"}, d2 = {"Lcom/agog/mathdisplay/render/MTCancelDisplay;", "Lcom/agog/mathdisplay/render/MTDisplay;", "Lcom/agog/mathdisplay/render/MTMathListDisplay;", "inner", "Lcom/agog/mathdisplay/parse/NSRange;", "range", "<init>", "(Lcom/agog/mathdisplay/render/MTMathListDisplay;Lcom/agog/mathdisplay/parse/NSRange;)V", "Liei;", "positionChanged", "()V", "colorChanged", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "Lcom/agog/mathdisplay/render/MTMathListDisplay;", "getInner", "()Lcom/agog/mathdisplay/render/MTMathListDisplay;", "", "lineThickness", "F", "getLineThickness", "()F", "setLineThickness", "(F)V", "Lcom/agog/mathdisplay/parse/MTCancelStyle;", "cancelStyle", "Lcom/agog/mathdisplay/parse/MTCancelStyle;", "getCancelStyle", "()Lcom/agog/mathdisplay/parse/MTCancelStyle;", "setCancelStyle", "(Lcom/agog/mathdisplay/parse/MTCancelStyle;)V", "overhang", "getOverhang", "setOverhang", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTCancelDisplay extends MTDisplay {
    private MTCancelStyle cancelStyle;
    private final MTMathListDisplay inner;
    private float lineThickness;
    private float overhang;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTCancelDisplay(MTMathListDisplay mTMathListDisplay, NSRange nSRange) {
        super(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, nSRange, false, 23, null);
        mTMathListDisplay.getClass();
        nSRange.getClass();
        this.inner = mTMathListDisplay;
        this.cancelStyle = MTCancelStyle.Diagonal;
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public void colorChanged() {
        this.inner.setTextColor(getTextColor());
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.getClass();
        this.inner.draw(canvas);
        if (this.lineThickness == MTTypesetterKt.kLineSkipLimitMultiplier) {
            return;
        }
        Paint paint = new Paint(1);
        paint.setColor(getTextColor());
        paint.setStrokeWidth(this.lineThickness);
        float x = this.inner.getPosition().getX() - this.overhang;
        float width = this.inner.getWidth() + this.inner.getPosition().getX() + this.overhang;
        float ascent = this.inner.getAscent() + this.inner.getPosition().getY();
        float y = this.inner.getPosition().getY() - this.inner.getDescent();
        MTCancelStyle mTCancelStyle = this.cancelStyle;
        if (mTCancelStyle == MTCancelStyle.Diagonal || mTCancelStyle == MTCancelStyle.Cross) {
            canvas2 = canvas;
            canvas2.drawLine(x, y, width, ascent, paint);
            y = y;
            ascent = ascent;
        } else {
            canvas2 = canvas;
        }
        MTCancelStyle mTCancelStyle2 = this.cancelStyle;
        if (mTCancelStyle2 == MTCancelStyle.BackDiagonal || mTCancelStyle2 == MTCancelStyle.Cross) {
            canvas2.drawLine(x, ascent, width, y, paint);
        }
    }

    public final MTCancelStyle getCancelStyle() {
        return this.cancelStyle;
    }

    public final MTMathListDisplay getInner() {
        return this.inner;
    }

    public final float getLineThickness() {
        return this.lineThickness;
    }

    public final float getOverhang() {
        return this.overhang;
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public void positionChanged() {
        this.inner.setPosition(new CGPoint(getPosition().getX() + this.overhang, getPosition().getY()));
    }

    public final void setCancelStyle(MTCancelStyle mTCancelStyle) {
        mTCancelStyle.getClass();
        this.cancelStyle = mTCancelStyle;
    }

    public final void setLineThickness(float f) {
        this.lineThickness = f;
    }

    public final void setOverhang(float f) {
        this.overhang = f;
    }
}
