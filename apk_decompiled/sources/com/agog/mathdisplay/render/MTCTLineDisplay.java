package com.agog.mathdisplay.render;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.agog.mathdisplay.parse.MTMathAtom;
import com.agog.mathdisplay.parse.MissingGlyphException;
import com.agog.mathdisplay.parse.NSRange;
import defpackage.mdj;
import defpackage.w44;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/agog/mathdisplay/render/MTCTLineDisplay;", "Lcom/agog/mathdisplay/render/MTDisplay;", "", "str", "Lcom/agog/mathdisplay/parse/NSRange;", "range", "Lcom/agog/mathdisplay/render/MTFont;", "font", "", "Lcom/agog/mathdisplay/parse/MTMathAtom;", "atoms", "<init>", "(Ljava/lang/String;Lcom/agog/mathdisplay/parse/NSRange;Lcom/agog/mathdisplay/render/MTFont;Ljava/util/List;)V", "Liei;", "computeDimensions", "()V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "Ljava/lang/String;", "getStr", "()Ljava/lang/String;", "Lcom/agog/mathdisplay/render/MTFont;", "getFont", "()Lcom/agog/mathdisplay/render/MTFont;", "Ljava/util/List;", "getAtoms", "()Ljava/util/List;", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTCTLineDisplay extends MTDisplay {
    private final List<MTMathAtom> atoms;
    private final MTFont font;
    private final String str;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MTCTLineDisplay(String str, NSRange nSRange, MTFont mTFont, List<? extends MTMathAtom> list) {
        super(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, nSRange, false, 23, null);
        str.getClass();
        nSRange.getClass();
        mTFont.getClass();
        list.getClass();
        this.str = str;
        this.font = mTFont;
        this.atoms = list;
        computeDimensions();
    }

    public final void computeDimensions() {
        List<Integer> gidListForString = this.font.getGidListForString(this.str);
        int size = gidListForString.size();
        BoundingBox[] boundingBoxArr = new BoundingBox[size];
        Float[] fArr = new Float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = Float.valueOf(MTTypesetterKt.kLineSkipLimitMultiplier);
        }
        List<Integer> list = gidListForString;
        this.font.getMathTable().getBoundingRectsForGlyphs(w44.p1(list), boundingBoxArr, size);
        this.font.getMathTable().getAdvancesForGlyphs(w44.p1(list), fArr, size);
        setWidth(MTTypesetterKt.kLineSkipLimitMultiplier);
        for (int i2 = 0; i2 < size; i2++) {
            BoundingBox boundingBox = boundingBoxArr[i2];
            if (boundingBox != null) {
                float fMax = Math.max(MTTypesetterKt.kLineSkipLimitMultiplier, boundingBox.getUpperRightY() - MTTypesetterKt.kLineSkipLimitMultiplier);
                float fMax2 = Math.max(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier - boundingBox.getLowerLeftY());
                if (fMax > getAscent()) {
                    setAscent(fMax);
                }
                if (fMax2 > getDescent()) {
                    setDescent(fMax2);
                }
                setWidth(fArr[i2].floatValue() + getWidth());
            }
        }
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public void draw(Canvas canvas) throws MissingGlyphException {
        float fFloatValue;
        canvas.getClass();
        super.draw(canvas);
        Paint paint = new Paint(193);
        paint.setColor(getTextColor());
        MTDrawFreeType mTDrawFreeType = new MTDrawFreeType(this.font.getMathTable());
        List<Integer> gidListForString = this.font.getGidListForString(this.str);
        int size = gidListForString.size();
        Float[] fArr = new Float[size];
        int i = 0;
        while (true) {
            fFloatValue = MTTypesetterKt.kLineSkipLimitMultiplier;
            if (i >= size) {
                break;
            }
            fArr[i] = Float.valueOf(MTTypesetterKt.kLineSkipLimitMultiplier);
            i++;
        }
        this.font.getMathTable().getAdvancesForGlyphs(gidListForString, fArr, size);
        canvas.save();
        canvas.translate(getPosition().getX(), getPosition().getY());
        canvas.scale(1.0f, -1.0f);
        int i2 = 0;
        while (i2 < size) {
            Canvas canvas2 = canvas;
            mTDrawFreeType.drawGlyph(canvas2, paint, gidListForString.get(i2).intValue(), fFloatValue, MTTypesetterKt.kLineSkipLimitMultiplier);
            fFloatValue += fArr[i2].floatValue();
            i2++;
            canvas = canvas2;
        }
        paint.setColor(-65536);
        canvas.restore();
    }

    public final List<MTMathAtom> getAtoms() {
        return this.atoms;
    }

    public final MTFont getFont() {
        return this.font;
    }

    public final String getStr() {
        return this.str;
    }
}
