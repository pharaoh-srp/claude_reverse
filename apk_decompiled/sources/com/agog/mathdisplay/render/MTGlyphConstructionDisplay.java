package com.agog.mathdisplay.render;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.agog.mathdisplay.parse.MissingGlyphException;
import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.mdj;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00058V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00058V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001b¨\u0006 "}, d2 = {"Lcom/agog/mathdisplay/render/MTGlyphConstructionDisplay;", "Lcom/agog/mathdisplay/render/MTDisplay;", "", "", "glyphs", "", "offsets", "Lcom/agog/mathdisplay/render/MTFont;", "myfont", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/agog/mathdisplay/render/MTFont;)V", "Landroid/graphics/Canvas;", "canvas", "Liei;", "draw", "(Landroid/graphics/Canvas;)V", "Ljava/util/List;", "getGlyphs", "()Ljava/util/List;", "getOffsets", "Lcom/agog/mathdisplay/render/MTFont;", "getMyfont", "()Lcom/agog/mathdisplay/render/MTFont;", ExperienceToggle.DEFAULT_PARAM_KEY, "getAscent", "()F", "setAscent", "(F)V", "ascent", "getDescent", "setDescent", "descent", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTGlyphConstructionDisplay extends MTDisplay {
    private final List<Integer> glyphs;
    private final MTFont myfont;
    private final List<Float> offsets;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTGlyphConstructionDisplay(List<Integer> list, List<Float> list2, MTFont mTFont) {
        super(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, false, 31, null);
        list.getClass();
        list2.getClass();
        mTFont.getClass();
        this.glyphs = list;
        this.offsets = list2;
        this.myfont = mTFont;
        list.size();
        list2.size();
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public void draw(Canvas canvas) throws MissingGlyphException {
        canvas.getClass();
        MTDrawFreeType mTDrawFreeType = new MTDrawFreeType(this.myfont.getMathTable());
        canvas.save();
        canvas.translate(getPosition().getX(), getPosition().getY() - getShiftDown());
        Paint paint = new Paint(193);
        paint.setColor(getTextColor());
        int size = this.glyphs.size();
        for (int i = 0; i < size; i++) {
            canvas.save();
            canvas.translate(MTTypesetterKt.kLineSkipLimitMultiplier, this.offsets.get(i).floatValue());
            canvas.scale(1.0f, -1.0f);
            mTDrawFreeType.drawGlyph(canvas, paint, this.glyphs.get(i).intValue(), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
            canvas.restore();
        }
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

    public final List<Integer> getGlyphs() {
        return this.glyphs;
    }

    public final MTFont getMyfont() {
        return this.myfont;
    }

    public final List<Float> getOffsets() {
        return this.offsets;
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public void setAscent(float f) {
        super.setAscent(f);
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public void setDescent(float f) {
        super.setDescent(f);
    }
}
