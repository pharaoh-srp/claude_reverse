package com.agog.mathdisplay.render;

import android.graphics.Canvas;
import com.agog.mathdisplay.parse.MissingGlyphException;
import com.agog.mathdisplay.parse.NSRange;
import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/agog/mathdisplay/render/MTAccentDisplay;", "Lcom/agog/mathdisplay/render/MTDisplay;", "Lcom/agog/mathdisplay/render/MTGlyphDisplay;", "accent", "Lcom/agog/mathdisplay/render/MTMathListDisplay;", "accentee", "Lcom/agog/mathdisplay/parse/NSRange;", "range", "<init>", "(Lcom/agog/mathdisplay/render/MTGlyphDisplay;Lcom/agog/mathdisplay/render/MTMathListDisplay;Lcom/agog/mathdisplay/parse/NSRange;)V", "Liei;", "colorChanged", "()V", "positionChanged", "updateAccenteePosition", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "Lcom/agog/mathdisplay/render/MTGlyphDisplay;", "getAccent", "()Lcom/agog/mathdisplay/render/MTGlyphDisplay;", "Lcom/agog/mathdisplay/render/MTMathListDisplay;", "getAccentee", "()Lcom/agog/mathdisplay/render/MTMathListDisplay;", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTAccentDisplay extends MTDisplay {
    private final MTGlyphDisplay accent;
    private final MTMathListDisplay accentee;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTAccentDisplay(MTGlyphDisplay mTGlyphDisplay, MTMathListDisplay mTMathListDisplay, NSRange nSRange) {
        super(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, nSRange, false, 23, null);
        mTGlyphDisplay.getClass();
        mTMathListDisplay.getClass();
        nSRange.getClass();
        this.accent = mTGlyphDisplay;
        this.accentee = mTMathListDisplay;
        mTMathListDisplay.setPosition(new CGPoint(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 3, null));
        setRange(NSRange.copy$default(nSRange, 0, 0, 3, null));
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public void colorChanged() {
        this.accentee.setTextColor(getTextColor());
        this.accent.setTextColor(getTextColor());
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public void draw(Canvas canvas) throws MissingGlyphException {
        canvas.getClass();
        this.accentee.draw(canvas);
        canvas.save();
        canvas.translate(getPosition().getX(), getPosition().getY());
        this.accent.draw(canvas);
        canvas.restore();
    }

    public final MTGlyphDisplay getAccent() {
        return this.accent;
    }

    public final MTMathListDisplay getAccentee() {
        return this.accentee;
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public void positionChanged() {
        updateAccenteePosition();
    }

    public final void updateAccenteePosition() {
        this.accentee.setPosition(new CGPoint(getPosition().getX(), getPosition().getY()));
    }
}
