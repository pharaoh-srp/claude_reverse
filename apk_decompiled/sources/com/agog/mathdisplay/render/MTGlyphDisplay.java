package com.agog.mathdisplay.render;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.agog.mathdisplay.parse.MissingGlyphException;
import com.agog.mathdisplay.parse.NSRange;
import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00158V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR$\u0010\"\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00158V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001b¨\u0006#"}, d2 = {"Lcom/agog/mathdisplay/render/MTGlyphDisplay;", "Lcom/agog/mathdisplay/render/MTDisplay;", "Lcom/agog/mathdisplay/render/CGGlyph;", "glyph", "Lcom/agog/mathdisplay/parse/NSRange;", "range", "Lcom/agog/mathdisplay/render/MTFont;", "myfont", "<init>", "(Lcom/agog/mathdisplay/render/CGGlyph;Lcom/agog/mathdisplay/parse/NSRange;Lcom/agog/mathdisplay/render/MTFont;)V", "Landroid/graphics/Canvas;", "canvas", "Liei;", "draw", "(Landroid/graphics/Canvas;)V", "Lcom/agog/mathdisplay/render/CGGlyph;", "getGlyph", "()Lcom/agog/mathdisplay/render/CGGlyph;", "Lcom/agog/mathdisplay/render/MTFont;", "getMyfont", "()Lcom/agog/mathdisplay/render/MTFont;", "", "scaleX", "F", "getScaleX", "()F", "setScaleX", "(F)V", ExperienceToggle.DEFAULT_PARAM_KEY, "getAscent", "setAscent", "ascent", "getDescent", "setDescent", "descent", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTGlyphDisplay extends MTDisplay {
    private final CGGlyph glyph;
    private final MTFont myfont;
    private float scaleX;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTGlyphDisplay(CGGlyph cGGlyph, NSRange nSRange, MTFont mTFont) {
        super(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, nSRange, false, 23, null);
        cGGlyph.getClass();
        nSRange.getClass();
        mTFont.getClass();
        this.glyph = cGGlyph;
        this.myfont = mTFont;
        this.scaleX = 1.0f;
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public void draw(Canvas canvas) throws MissingGlyphException {
        canvas.getClass();
        super.draw(canvas);
        Paint paint = new Paint(193);
        paint.setColor(getTextColor());
        MTDrawFreeType mTDrawFreeType = new MTDrawFreeType(this.myfont.getMathTable());
        canvas.save();
        canvas.translate(getPosition().getX(), getPosition().getY() - getShiftDown());
        canvas.scale(this.scaleX, -1.0f);
        mTDrawFreeType.drawGlyph(canvas, paint, this.glyph.getGid(), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
        canvas.restore();
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public float getAscent() {
        return super.getAscent() - getShiftDown();
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public float getDescent() {
        return getShiftDown() + super.getDescent();
    }

    public final CGGlyph getGlyph() {
        return this.glyph;
    }

    public final MTFont getMyfont() {
        return this.myfont;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public void setAscent(float f) {
        super.setAscent(f);
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public void setDescent(float f) {
        super.setDescent(f);
    }

    public final void setScaleX(float f) {
        this.scaleX = f;
    }
}
