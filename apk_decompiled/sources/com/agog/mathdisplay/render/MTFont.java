package com.agog.mathdisplay.render;

import android.content.res.AssetManager;
import com.agog.mathdisplay.parse.MathDisplayException;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0005J\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u001c2\u0006\u0010\u001a\u001a\u00020\u0005J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0007J\u000e\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0019J\u000e\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/agog/mathdisplay/render/MTFont;", "", "assets", "Landroid/content/res/AssetManager;", "name", "", "fontSize", "", "isCopy", "", "<init>", "(Landroid/content/res/AssetManager;Ljava/lang/String;FZ)V", "getName", "()Ljava/lang/String;", "getFontSize", "()F", "mathTable", "Lcom/agog/mathdisplay/render/MTFontMathTable;", "getMathTable", "()Lcom/agog/mathdisplay/render/MTFontMathTable;", "setMathTable", "(Lcom/agog/mathdisplay/render/MTFontMathTable;)V", "findGlyphForCharacterAtIndex", "Lcom/agog/mathdisplay/render/CGGlyph;", "index", "", "str", "getGidListForString", "", "copyFontWithSize", "size", "getGlyphName", "gid", "getGlyphWithName", "glyphName", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTFont {
    private final AssetManager assets;
    private final float fontSize;
    private MTFontMathTable mathTable;
    private final String name;

    public MTFont(AssetManager assetManager, String str, float f, boolean z) throws MathDisplayException, IOException {
        assetManager.getClass();
        str.getClass();
        this.assets = assetManager;
        this.name = str;
        this.fontSize = f;
        this.mathTable = new MTFontMathTable(this, null);
        String strJ = ij0.j("fonts/", str, ".otf");
        if (z) {
            return;
        }
        InputStream inputStreamOpen = assetManager.open(strJ);
        if (inputStreamOpen == null) {
            throw new MathDisplayException(ij0.i("Missing font asset for ", str));
        }
        this.mathTable = new MTFontMathTable(this, inputStreamOpen);
        inputStreamOpen.close();
    }

    public final MTFont copyFontWithSize(float size) {
        MTFont mTFont = new MTFont(this.assets, this.name, size, true);
        mTFont.mathTable = this.mathTable.copyFontTableWithSize(size);
        return mTFont;
    }

    public final CGGlyph findGlyphForCharacterAtIndex(int index, String str) {
        str.getClass();
        char[] charArray = str.toCharArray();
        charArray.getClass();
        int iCodePointAt = Character.codePointAt(charArray, index);
        return new CGGlyph(this.mathTable.getGlyphForCodepoint(iCodePointAt), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 14, null);
    }

    public final float getFontSize() {
        return this.fontSize;
    }

    public final List<Integer> getGidListForString(String str) {
        str.getClass();
        char[] charArray = str.toCharArray();
        charArray.getClass();
        int iCharCount = 0;
        ArrayList arrayList = new ArrayList(0);
        while (iCharCount < charArray.length) {
            int iCodePointAt = Character.codePointAt(charArray, iCharCount);
            iCharCount += Character.charCount(iCodePointAt);
            int glyphForCodepoint = this.mathTable.getGlyphForCodepoint(iCodePointAt);
            if (glyphForCodepoint == 0) {
                MTFontKt.PackageWarning("getGidListForString codepoint " + iCodePointAt + " mapped to missing glyph");
            }
            arrayList.add(Integer.valueOf(glyphForCodepoint));
        }
        return arrayList;
    }

    public final String getGlyphName(int gid) {
        return this.mathTable.getGlyphName(gid);
    }

    public final int getGlyphWithName(String glyphName) {
        glyphName.getClass();
        return this.mathTable.getGlyphWithName(glyphName);
    }

    public final MTFontMathTable getMathTable() {
        return this.mathTable;
    }

    public final String getName() {
        return this.name;
    }

    public final void setMathTable(MTFontMathTable mTFontMathTable) {
        mTFontMathTable.getClass();
        this.mathTable = mTFontMathTable;
    }

    public /* synthetic */ MTFont(AssetManager assetManager, String str, float f, boolean z, int i, mq5 mq5Var) {
        this(assetManager, str, f, (i & 8) != 0 ? false : z);
    }
}
