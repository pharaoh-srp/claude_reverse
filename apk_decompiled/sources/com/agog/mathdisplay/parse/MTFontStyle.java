package com.agog.mathdisplay.parse;

import defpackage.fq6;
import defpackage.mdj;
import defpackage.wd6;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/agog/mathdisplay/parse/MTFontStyle;", "", "<init>", "(Ljava/lang/String;I)V", "KMTFontStyleDefault", "KMTFontStyleRoman", "KMTFontStyleBold", "KMTFontStyleCaligraphic", "KMTFontStyleTypewriter", "KMTFontStyleItalic", "KMTFontStyleSansSerif", "KMTFontStyleFraktur", "KMTFontStyleBlackboard", "KMTFontStyleBoldItalic", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTFontStyle {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ MTFontStyle[] $VALUES;
    public static final MTFontStyle KMTFontStyleDefault = new MTFontStyle("KMTFontStyleDefault", 0);
    public static final MTFontStyle KMTFontStyleRoman = new MTFontStyle("KMTFontStyleRoman", 1);
    public static final MTFontStyle KMTFontStyleBold = new MTFontStyle("KMTFontStyleBold", 2);
    public static final MTFontStyle KMTFontStyleCaligraphic = new MTFontStyle("KMTFontStyleCaligraphic", 3);
    public static final MTFontStyle KMTFontStyleTypewriter = new MTFontStyle("KMTFontStyleTypewriter", 4);
    public static final MTFontStyle KMTFontStyleItalic = new MTFontStyle("KMTFontStyleItalic", 5);
    public static final MTFontStyle KMTFontStyleSansSerif = new MTFontStyle("KMTFontStyleSansSerif", 6);
    public static final MTFontStyle KMTFontStyleFraktur = new MTFontStyle("KMTFontStyleFraktur", 7);
    public static final MTFontStyle KMTFontStyleBlackboard = new MTFontStyle("KMTFontStyleBlackboard", 8);
    public static final MTFontStyle KMTFontStyleBoldItalic = new MTFontStyle("KMTFontStyleBoldItalic", 9);

    private static final /* synthetic */ MTFontStyle[] $values() {
        return new MTFontStyle[]{KMTFontStyleDefault, KMTFontStyleRoman, KMTFontStyleBold, KMTFontStyleCaligraphic, KMTFontStyleTypewriter, KMTFontStyleItalic, KMTFontStyleSansSerif, KMTFontStyleFraktur, KMTFontStyleBlackboard, KMTFontStyleBoldItalic};
    }

    static {
        MTFontStyle[] mTFontStyleArr$values = $values();
        $VALUES = mTFontStyleArr$values;
        $ENTRIES = wd6.n0(mTFontStyleArr$values);
    }

    private MTFontStyle(String str, int i) {
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static MTFontStyle valueOf(String str) {
        return (MTFontStyle) Enum.valueOf(MTFontStyle.class, str);
    }

    public static MTFontStyle[] values() {
        return (MTFontStyle[]) $VALUES.clone();
    }
}
