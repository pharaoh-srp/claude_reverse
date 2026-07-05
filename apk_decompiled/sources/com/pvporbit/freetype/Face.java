package com.pvporbit.freetype;

import com.pvporbit.freetype.Utils;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class Face extends Utils.Pointer {
    private ByteBuffer data;

    public Face(long j, ByteBuffer byteBuffer) {
        super(j);
        this.data = byteBuffer;
    }

    public boolean checkTrueTypePatents() {
        return FreeType.FT_Face_CheckTrueTypePatents(this.pointer);
    }

    public boolean delete() {
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            Utils.deleteBuffer(byteBuffer);
        }
        return FreeType.FT_Done_Face(this.pointer);
    }

    public int getAscender() {
        return FreeType.FT_Face_Get_ascender(this.pointer);
    }

    public int getCharIndex(int i) {
        return FreeType.FT_Get_Char_Index(this.pointer, i);
    }

    public int getDescender() {
        return FreeType.FT_Face_Get_descender(this.pointer);
    }

    public short getFSTypeFlags() {
        return FreeType.FT_Get_FSType_Flags(this.pointer);
    }

    public long getFaceFlags() {
        return FreeType.FT_Face_Get_face_flags(this.pointer);
    }

    public int getFaceIndex() {
        return FreeType.FT_Face_Get_face_index(this.pointer);
    }

    public String getFamilyName() {
        return FreeType.FT_Face_Get_family_name(this.pointer);
    }

    public int[] getFirstChar() {
        return FreeType.FT_Get_First_Char(this.pointer);
    }

    public int getFirstCharAsCharcode() {
        return getFirstChar()[0];
    }

    public int getFirstCharAsGlyphIndex() {
        return getFirstChar()[1];
    }

    public int getGlyphIndexByName(String str) {
        return FreeType.FT_Get_Name_Index(this.pointer, str);
    }

    public String getGlyphName(int i) {
        return FreeType.FT_Get_Glyph_Name(this.pointer, i);
    }

    public GlyphSlot getGlyphSlot() {
        long jFT_Face_Get_glyph = FreeType.FT_Face_Get_glyph(this.pointer);
        if (jFT_Face_Get_glyph == 0) {
            return null;
        }
        return new GlyphSlot(jFT_Face_Get_glyph);
    }

    public int getHeight() {
        return FreeType.FT_Face_Get_heigth(this.pointer);
    }

    public Kerning getKerning(char c, char c2, int i) {
        return FreeType.FT_Face_Get_Kerning(this.pointer, c, c2, i);
    }

    public int getMaxAdvanceHeight() {
        return FreeType.FT_Face_Get_max_advance_height(this.pointer);
    }

    public int getMaxAdvanceWidth() {
        return FreeType.FT_Face_Get_max_advance_width(this.pointer);
    }

    public int getNextChar(long j) {
        return FreeType.FT_Get_Next_Char(this.pointer, j);
    }

    public int getNumFaces() {
        return FreeType.FT_Face_Get_num_faces(this.pointer);
    }

    public int getNumGlyphs() {
        return FreeType.FT_Face_Get_num_glyphs(this.pointer);
    }

    public String getPostscriptName() {
        return FreeType.FT_Get_Postscript_Name(this.pointer);
    }

    public Size getSize() {
        long jFT_Face_Get_size = FreeType.FT_Face_Get_size(this.pointer);
        if (jFT_Face_Get_size == 0) {
            return null;
        }
        return new Size(jFT_Face_Get_size);
    }

    public long getStyleFlags() {
        return FreeType.FT_Face_Get_style_flags(this.pointer);
    }

    public String getStyleName() {
        return FreeType.FT_Face_Get_style_name(this.pointer);
    }

    public long getTrackKerning(int i, int i2) {
        return FreeType.FT_Get_Track_Kerning(this.pointer, i, i2);
    }

    public int getUnderlinePosition() {
        return FreeType.FT_Face_Get_underline_position(this.pointer);
    }

    public int getUnderlineThickness() {
        return FreeType.FT_Face_Get_underline_thickness(this.pointer);
    }

    public int getUnitsPerEM() {
        return FreeType.FT_Face_Get_units_per_EM(this.pointer);
    }

    public boolean hasKerning() {
        return FreeType.FT_HAS_KERNING(this.pointer);
    }

    public boolean loadChar(char c, int i) {
        return FreeType.FT_Load_Char(this.pointer, c, i);
    }

    public boolean loadGlyph(int i, int i2) {
        return FreeType.FT_Load_Glyph(this.pointer, i, i2);
    }

    public MTFreeTypeMathTable loadMathTable() {
        ByteBuffer byteBufferNewBuffer = Utils.newBuffer(this.data.remaining());
        MTFreeTypeMathTable mTFreeTypeMathTable = new MTFreeTypeMathTable(this.pointer, byteBufferNewBuffer);
        Utils.deleteBuffer(byteBufferNewBuffer);
        return mTFreeTypeMathTable;
    }

    public boolean referenceFace() {
        return FreeType.FT_Reference_Face(this.pointer);
    }

    public boolean requestSize(SizeRequest sizeRequest) {
        return FreeType.FT_Request_Size(this.pointer, sizeRequest);
    }

    public boolean selectCharmap(int i) {
        return FreeType.FT_Select_Charmap(this.pointer, i);
    }

    public boolean selectSize(int i) {
        return FreeType.FT_Select_Size(this.pointer, i);
    }

    public boolean setCharSize(int i, int i2, int i3, int i4) {
        return FreeType.FT_Set_Char_Size(this.pointer, i, i2, i3, i4);
    }

    public boolean setCharmap(CharMap charMap) {
        return FreeType.FT_Set_Charmap(this.pointer, charMap.getPointer());
    }

    public boolean setPixelSizes(float f, float f2) {
        return FreeType.FT_Set_Pixel_Sizes(this.pointer, f, f2);
    }

    public boolean setUnpatentedHinting(boolean z) {
        return FreeType.FT_Face_SetUnpatentedHinting(this.pointer, z);
    }

    public Face(long j) {
        super(j);
    }

    public Kerning getKerning(char c, char c2) {
        return getKerning(c, c2, 0);
    }
}
