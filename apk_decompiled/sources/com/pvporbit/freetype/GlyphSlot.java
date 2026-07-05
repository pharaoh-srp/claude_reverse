package com.pvporbit.freetype;

import com.pvporbit.freetype.Utils;
import defpackage.grc;

/* JADX INFO: loaded from: classes3.dex */
public class GlyphSlot extends Utils.Pointer {

    /* JADX INFO: loaded from: classes2.dex */
    public static class Advance {
        private final long x;
        private final long y;

        public Advance(long j, long j2) {
            this.x = j;
            this.y = j2;
        }

        public long getX() {
            return this.x;
        }

        public long getY() {
            return this.y;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("(");
            sb.append(this.x);
            sb.append(",");
            return grc.r(this.y, ")", sb);
        }
    }

    public GlyphSlot(long j) {
        super(j);
    }

    public Advance getAdvance() {
        return FreeType.FT_GlyphSlot_Get_advance(this.pointer);
    }

    public Bitmap getBitmap() {
        long jFT_GlyphSlot_Get_bitmap = FreeType.FT_GlyphSlot_Get_bitmap(this.pointer);
        if (jFT_GlyphSlot_Get_bitmap == 0) {
            return null;
        }
        return new Bitmap(jFT_GlyphSlot_Get_bitmap);
    }

    public int getBitmapLeft() {
        return FreeType.FT_GlyphSlot_Get_bitmap_left(this.pointer);
    }

    public int getBitmapTop() {
        return FreeType.FT_GlyphSlot_Get_bitmap_top(this.pointer);
    }

    public int getFormat() {
        return FreeType.FT_GlyphSlot_Get_format(this.pointer);
    }

    public long getLinearHoriAdvance() {
        return FreeType.FT_GlyphSlot_Get_linearHoriAdvance(this.pointer);
    }

    public long getLinearVertAdvance() {
        return FreeType.FT_GlyphSlot_Get_linearVertAdvance(this.pointer);
    }

    public GlyphMetrics getMetrics() {
        long jFT_GlyphSlot_Get_metrics = FreeType.FT_GlyphSlot_Get_metrics(this.pointer);
        if (jFT_GlyphSlot_Get_metrics == 0) {
            return null;
        }
        return new GlyphMetrics(jFT_GlyphSlot_Get_metrics);
    }

    public boolean renderGlyph(int i) {
        return FreeType.FT_Render_Glyph(this.pointer, i);
    }

    public boolean renderGlyphLight() {
        return renderGlyph(1);
    }

    public boolean renderGlyphMono() {
        return renderGlyph(2);
    }

    public boolean renderGlyphNormal() {
        return renderGlyph(0);
    }
}
