package com.agog.mathdisplay.render;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.agog.mathdisplay.parse.MissingGlyphException;
import com.pvporbit.freetype.Bitmap;
import com.pvporbit.freetype.Face;
import com.pvporbit.freetype.GlyphMetrics;
import com.pvporbit.freetype.GlyphSlot;
import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/agog/mathdisplay/render/MTDrawFreeType;", "", "Lcom/agog/mathdisplay/render/MTFontMathTable;", "mathfont", "<init>", "(Lcom/agog/mathdisplay/render/MTFontMathTable;)V", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Paint;", "p", "", "gid", "", "x", "y", "Liei;", "drawGlyph", "(Landroid/graphics/Canvas;Landroid/graphics/Paint;IFF)V", "Lcom/agog/mathdisplay/render/MTFontMathTable;", "getMathfont", "()Lcom/agog/mathdisplay/render/MTFontMathTable;", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTDrawFreeType {
    private final MTFontMathTable mathfont;

    public MTDrawFreeType(MTFontMathTable mTFontMathTable) {
        mTFontMathTable.getClass();
        this.mathfont = mTFontMathTable;
    }

    public final void drawGlyph(Canvas canvas, Paint p, int gid, float x, float y) throws MissingGlyphException {
        GlyphSlot glyphSlot;
        Bitmap bitmap;
        canvas.getClass();
        p.getClass();
        Face faceCheckFontSize = this.mathfont.checkFontSize();
        if (gid == 0 || faceCheckFontSize.loadGlyph(gid, 4) || (bitmap = (glyphSlot = faceCheckFontSize.getGlyphSlot()).getBitmap()) == null) {
            return;
        }
        if (bitmap.getWidth() == 0 || bitmap.getRows() == 0) {
            if (gid != 1 && gid != 33) {
                throw new MissingGlyphException(gid);
            }
        } else {
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmap.getWidth(), bitmap.getRows(), Bitmap.Config.ALPHA_8);
            bitmapCreateBitmap.getClass();
            bitmapCreateBitmap.copyPixelsFromBuffer(bitmap.getBuffer());
            GlyphMetrics metrics = glyphSlot.getMetrics();
            canvas.drawBitmap(bitmapCreateBitmap, x + (metrics.getHoriBearingX() / 64.0f), y - (metrics.getHoriBearingY() / 64.0f), p);
        }
    }

    public final MTFontMathTable getMathfont() {
        return this.mathfont;
    }
}
