package com.agog.mathdisplay.render;

import android.graphics.Canvas;
import com.agog.mathdisplay.parse.MissingGlyphException;
import com.agog.mathdisplay.parse.NSRange;
import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/agog/mathdisplay/render/MTUnderOverBraceDisplay;", "Lcom/agog/mathdisplay/render/MTDisplay;", "Lcom/agog/mathdisplay/parse/NSRange;", "range", "<init>", "(Lcom/agog/mathdisplay/parse/NSRange;)V", "Liei;", "positionChanged", "()V", "colorChanged", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "Lcom/agog/mathdisplay/render/MTMathListDisplay;", "inner", "Lcom/agog/mathdisplay/render/MTMathListDisplay;", "getInner", "()Lcom/agog/mathdisplay/render/MTMathListDisplay;", "setInner", "(Lcom/agog/mathdisplay/render/MTMathListDisplay;)V", "Lcom/agog/mathdisplay/render/MTGlyphDisplay;", "brace", "Lcom/agog/mathdisplay/render/MTGlyphDisplay;", "getBrace", "()Lcom/agog/mathdisplay/render/MTGlyphDisplay;", "setBrace", "(Lcom/agog/mathdisplay/render/MTGlyphDisplay;)V", "label", "getLabel", "setLabel", "Lcom/agog/mathdisplay/render/CGPoint;", "lastPosition", "Lcom/agog/mathdisplay/render/CGPoint;", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTUnderOverBraceDisplay extends MTDisplay {
    private MTGlyphDisplay brace;
    private MTMathListDisplay inner;
    private MTMathListDisplay label;
    private CGPoint lastPosition;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTUnderOverBraceDisplay(NSRange nSRange) {
        super(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, nSRange, false, 23, null);
        nSRange.getClass();
        this.lastPosition = new CGPoint(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 3, null);
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public void colorChanged() {
        MTMathListDisplay mTMathListDisplay = this.inner;
        if (mTMathListDisplay != null) {
            mTMathListDisplay.setTextColor(getTextColor());
        }
        MTGlyphDisplay mTGlyphDisplay = this.brace;
        if (mTGlyphDisplay != null) {
            mTGlyphDisplay.setTextColor(getTextColor());
        }
        MTMathListDisplay mTMathListDisplay2 = this.label;
        if (mTMathListDisplay2 != null) {
            mTMathListDisplay2.setTextColor(getTextColor());
        }
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public void draw(Canvas canvas) throws MissingGlyphException {
        canvas.getClass();
        MTMathListDisplay mTMathListDisplay = this.inner;
        if (mTMathListDisplay != null) {
            mTMathListDisplay.draw(canvas);
        }
        MTGlyphDisplay mTGlyphDisplay = this.brace;
        if (mTGlyphDisplay != null) {
            mTGlyphDisplay.draw(canvas);
        }
        MTMathListDisplay mTMathListDisplay2 = this.label;
        if (mTMathListDisplay2 != null) {
            mTMathListDisplay2.draw(canvas);
        }
    }

    public final MTGlyphDisplay getBrace() {
        return this.brace;
    }

    public final MTMathListDisplay getInner() {
        return this.inner;
    }

    public final MTMathListDisplay getLabel() {
        return this.label;
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public void positionChanged() {
        float x = getPosition().getX() - this.lastPosition.getX();
        float y = getPosition().getY() - this.lastPosition.getY();
        this.lastPosition = CGPoint.copy$default(getPosition(), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 3, null);
        MTMathListDisplay mTMathListDisplay = this.inner;
        if (mTMathListDisplay != null) {
            mTMathListDisplay.setPosition(new CGPoint(mTMathListDisplay.getPosition().getX() + x, mTMathListDisplay.getPosition().getY() + y));
        }
        MTGlyphDisplay mTGlyphDisplay = this.brace;
        if (mTGlyphDisplay != null) {
            mTGlyphDisplay.setPosition(new CGPoint(mTGlyphDisplay.getPosition().getX() + x, mTGlyphDisplay.getPosition().getY() + y));
        }
        MTMathListDisplay mTMathListDisplay2 = this.label;
        if (mTMathListDisplay2 != null) {
            mTMathListDisplay2.setPosition(new CGPoint(mTMathListDisplay2.getPosition().getX() + x, mTMathListDisplay2.getPosition().getY() + y));
        }
    }

    public final void setBrace(MTGlyphDisplay mTGlyphDisplay) {
        this.brace = mTGlyphDisplay;
    }

    public final void setInner(MTMathListDisplay mTMathListDisplay) {
        this.inner = mTMathListDisplay;
    }

    public final void setLabel(MTMathListDisplay mTMathListDisplay) {
        this.label = mTMathListDisplay;
    }
}
