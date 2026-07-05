package com.agog.mathdisplay.render;

import android.graphics.Canvas;
import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\"\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\rJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010 \u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R*\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R*\u0010+\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010 \u001a\u0004\b,\u0010\"\"\u0004\b-\u0010$R$\u00100\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b.\u0010\"\"\u0004\b/\u0010$R$\u00103\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b1\u0010\"\"\u0004\b2\u0010$¨\u00064"}, d2 = {"Lcom/agog/mathdisplay/render/MTLargeOpLimitsDisplay;", "Lcom/agog/mathdisplay/render/MTDisplay;", "nucleus", "Lcom/agog/mathdisplay/render/MTMathListDisplay;", "upperLimit", "lowerLimit", "", "limitShift", "extraPadding", "<init>", "(Lcom/agog/mathdisplay/render/MTDisplay;Lcom/agog/mathdisplay/render/MTMathListDisplay;Lcom/agog/mathdisplay/render/MTMathListDisplay;FF)V", "Liei;", "positionChanged", "()V", "updateLowerLimitPosition", "updateUpperLimitPosition", "updateNucleusPosition", "colorChanged", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "Lcom/agog/mathdisplay/render/MTDisplay;", "getNucleus", "()Lcom/agog/mathdisplay/render/MTDisplay;", "Lcom/agog/mathdisplay/render/MTMathListDisplay;", "getUpperLimit", "()Lcom/agog/mathdisplay/render/MTMathListDisplay;", "setUpperLimit", "(Lcom/agog/mathdisplay/render/MTMathListDisplay;)V", "getLowerLimit", "setLowerLimit", "F", "getLimitShift", "()F", "setLimitShift", "(F)V", "getExtraPadding", "setExtraPadding", ExperienceToggle.DEFAULT_PARAM_KEY, "lowerLimitGap", "getLowerLimitGap", "setLowerLimitGap", "upperLimitGap", "getUpperLimitGap", "setUpperLimitGap", "getAscent", "setAscent", "ascent", "getDescent", "setDescent", "descent", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTLargeOpLimitsDisplay extends MTDisplay {
    private float extraPadding;
    private float limitShift;
    private MTMathListDisplay lowerLimit;
    private float lowerLimitGap;
    private final MTDisplay nucleus;
    private MTMathListDisplay upperLimit;
    private float upperLimitGap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTLargeOpLimitsDisplay(MTDisplay mTDisplay, MTMathListDisplay mTMathListDisplay, MTMathListDisplay mTMathListDisplay2, float f, float f2) {
        super(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, false, 31, null);
        mTDisplay.getClass();
        this.nucleus = mTDisplay;
        this.upperLimit = mTMathListDisplay;
        this.lowerLimit = mTMathListDisplay2;
        this.limitShift = f;
        this.extraPadding = f2;
        float width = mTDisplay.getWidth();
        MTMathListDisplay mTMathListDisplay3 = this.upperLimit;
        if (mTMathListDisplay3 != null) {
            mTMathListDisplay3.getClass();
            width = Math.max(width, mTMathListDisplay3.getWidth());
        }
        MTMathListDisplay mTMathListDisplay4 = this.lowerLimit;
        if (mTMathListDisplay4 != null) {
            mTMathListDisplay4.getClass();
            width = Math.max(width, mTMathListDisplay4.getWidth());
        }
        setWidth(width);
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public void colorChanged() {
        this.nucleus.setTextColor(getTextColor());
        MTMathListDisplay mTMathListDisplay = this.upperLimit;
        if (mTMathListDisplay != null) {
            mTMathListDisplay.setTextColor(getTextColor());
        }
        MTMathListDisplay mTMathListDisplay2 = this.lowerLimit;
        if (mTMathListDisplay2 != null) {
            mTMathListDisplay2.setTextColor(getTextColor());
        }
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public void draw(Canvas canvas) {
        canvas.getClass();
        MTMathListDisplay mTMathListDisplay = this.upperLimit;
        if (mTMathListDisplay != null) {
            mTMathListDisplay.draw(canvas);
        }
        MTMathListDisplay mTMathListDisplay2 = this.lowerLimit;
        if (mTMathListDisplay2 != null) {
            mTMathListDisplay2.draw(canvas);
        }
        this.nucleus.draw(canvas);
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public float getAscent() {
        MTMathListDisplay mTMathListDisplay = this.upperLimit;
        MTDisplay mTDisplay = this.nucleus;
        if (mTMathListDisplay == null) {
            return mTDisplay.getAscent();
        }
        float ascent = mTDisplay.getAscent() + this.extraPadding;
        MTMathListDisplay mTMathListDisplay2 = this.upperLimit;
        mTMathListDisplay2.getClass();
        float ascent2 = mTMathListDisplay2.getAscent() + ascent + this.upperLimitGap;
        MTMathListDisplay mTMathListDisplay3 = this.upperLimit;
        mTMathListDisplay3.getClass();
        return mTMathListDisplay3.getDescent() + ascent2;
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public float getDescent() {
        MTMathListDisplay mTMathListDisplay = this.lowerLimit;
        MTDisplay mTDisplay = this.nucleus;
        if (mTMathListDisplay == null) {
            return mTDisplay.getDescent();
        }
        float descent = mTDisplay.getDescent() + this.extraPadding + this.lowerLimitGap;
        MTMathListDisplay mTMathListDisplay2 = this.lowerLimit;
        mTMathListDisplay2.getClass();
        float descent2 = mTMathListDisplay2.getDescent() + descent;
        MTMathListDisplay mTMathListDisplay3 = this.lowerLimit;
        mTMathListDisplay3.getClass();
        return mTMathListDisplay3.getAscent() + descent2;
    }

    public final float getExtraPadding() {
        return this.extraPadding;
    }

    public final float getLimitShift() {
        return this.limitShift;
    }

    public final MTMathListDisplay getLowerLimit() {
        return this.lowerLimit;
    }

    public final float getLowerLimitGap() {
        return this.lowerLimitGap;
    }

    public final MTDisplay getNucleus() {
        return this.nucleus;
    }

    public final MTMathListDisplay getUpperLimit() {
        return this.upperLimit;
    }

    public final float getUpperLimitGap() {
        return this.upperLimitGap;
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public void positionChanged() {
        updateLowerLimitPosition();
        updateUpperLimitPosition();
        updateNucleusPosition();
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public void setAscent(float f) {
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public void setDescent(float f) {
    }

    public final void setExtraPadding(float f) {
        this.extraPadding = f;
    }

    public final void setLimitShift(float f) {
        this.limitShift = f;
    }

    public final void setLowerLimit(MTMathListDisplay mTMathListDisplay) {
        this.lowerLimit = mTMathListDisplay;
    }

    public final void setLowerLimitGap(float f) {
        this.lowerLimitGap = f;
        updateLowerLimitPosition();
    }

    public final void setUpperLimit(MTMathListDisplay mTMathListDisplay) {
        this.upperLimit = mTMathListDisplay;
    }

    public final void setUpperLimitGap(float f) {
        this.upperLimitGap = f;
        updateUpperLimitPosition();
    }

    public final void updateLowerLimitPosition() {
        MTMathListDisplay mTMathListDisplay = this.lowerLimit;
        if (mTMathListDisplay != null) {
            mTMathListDisplay.setPosition(new CGPoint(((getWidth() - mTMathListDisplay.getWidth()) / 2.0f) + (getPosition().getX() - this.limitShift), ((getPosition().getY() - this.nucleus.getDescent()) - this.lowerLimitGap) - mTMathListDisplay.getAscent()));
        }
    }

    public final void updateNucleusPosition() {
        this.nucleus.setPosition(new CGPoint(((getWidth() - this.nucleus.getWidth()) / 2.0f) + getPosition().getX(), getPosition().getY()));
    }

    public final void updateUpperLimitPosition() {
        MTMathListDisplay mTMathListDisplay = this.upperLimit;
        if (mTMathListDisplay != null) {
            mTMathListDisplay.setPosition(new CGPoint(((getWidth() - mTMathListDisplay.getWidth()) / 2.0f) + getPosition().getX() + this.limitShift, mTMathListDisplay.getDescent() + this.nucleus.getAscent() + getPosition().getY() + this.upperLimitGap));
        }
    }
}
