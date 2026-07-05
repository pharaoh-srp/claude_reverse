package com.agog.mathdisplay.parse;

import defpackage.fq6;
import defpackage.mdj;
import defpackage.wd6;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b \b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, d2 = {"Lcom/agog/mathdisplay/parse/MTMathAtomType;", "", "<init>", "(Ljava/lang/String;I)V", "KMTMathAtomNone", "KMTMathAtomOrdinary", "KMTMathAtomNumber", "KMTMathAtomVariable", "KMTMathAtomLargeOperator", "KMTMathAtomBinaryOperator", "KMTMathAtomUnaryOperator", "KMTMathAtomRelation", "KMTMathAtomOpen", "KMTMathAtomClose", "KMTMathAtomFraction", "KMTMathAtomRadical", "KMTMathAtomPunctuation", "KMTMathAtomPlaceholder", "KMTMathAtomInner", "KMTMathAtomUnderline", "KMTMathAtomOverline", "KMTMathAtomAccent", "KMTMathAtomCancel", "KMTMathAtomBoxed", "KMTMathAtomPhantom", "KMTMathAtomUnderOverBrace", "KMTMathAtomBoundary", "KMTMathAtomSpace", "KMTMathAtomStyle", "KMTMathAtomColor", "KMTMathAtomColorbox", "KMTMathAtomTextColor", "KMTMathAtomTable", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTMathAtomType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ MTMathAtomType[] $VALUES;
    public static final MTMathAtomType KMTMathAtomNone = new MTMathAtomType("KMTMathAtomNone", 0);
    public static final MTMathAtomType KMTMathAtomOrdinary = new MTMathAtomType("KMTMathAtomOrdinary", 1);
    public static final MTMathAtomType KMTMathAtomNumber = new MTMathAtomType("KMTMathAtomNumber", 2);
    public static final MTMathAtomType KMTMathAtomVariable = new MTMathAtomType("KMTMathAtomVariable", 3);
    public static final MTMathAtomType KMTMathAtomLargeOperator = new MTMathAtomType("KMTMathAtomLargeOperator", 4);
    public static final MTMathAtomType KMTMathAtomBinaryOperator = new MTMathAtomType("KMTMathAtomBinaryOperator", 5);
    public static final MTMathAtomType KMTMathAtomUnaryOperator = new MTMathAtomType("KMTMathAtomUnaryOperator", 6);
    public static final MTMathAtomType KMTMathAtomRelation = new MTMathAtomType("KMTMathAtomRelation", 7);
    public static final MTMathAtomType KMTMathAtomOpen = new MTMathAtomType("KMTMathAtomOpen", 8);
    public static final MTMathAtomType KMTMathAtomClose = new MTMathAtomType("KMTMathAtomClose", 9);
    public static final MTMathAtomType KMTMathAtomFraction = new MTMathAtomType("KMTMathAtomFraction", 10);
    public static final MTMathAtomType KMTMathAtomRadical = new MTMathAtomType("KMTMathAtomRadical", 11);
    public static final MTMathAtomType KMTMathAtomPunctuation = new MTMathAtomType("KMTMathAtomPunctuation", 12);
    public static final MTMathAtomType KMTMathAtomPlaceholder = new MTMathAtomType("KMTMathAtomPlaceholder", 13);
    public static final MTMathAtomType KMTMathAtomInner = new MTMathAtomType("KMTMathAtomInner", 14);
    public static final MTMathAtomType KMTMathAtomUnderline = new MTMathAtomType("KMTMathAtomUnderline", 15);
    public static final MTMathAtomType KMTMathAtomOverline = new MTMathAtomType("KMTMathAtomOverline", 16);
    public static final MTMathAtomType KMTMathAtomAccent = new MTMathAtomType("KMTMathAtomAccent", 17);
    public static final MTMathAtomType KMTMathAtomCancel = new MTMathAtomType("KMTMathAtomCancel", 18);
    public static final MTMathAtomType KMTMathAtomBoxed = new MTMathAtomType("KMTMathAtomBoxed", 19);
    public static final MTMathAtomType KMTMathAtomPhantom = new MTMathAtomType("KMTMathAtomPhantom", 20);
    public static final MTMathAtomType KMTMathAtomUnderOverBrace = new MTMathAtomType("KMTMathAtomUnderOverBrace", 21);
    public static final MTMathAtomType KMTMathAtomBoundary = new MTMathAtomType("KMTMathAtomBoundary", 22);
    public static final MTMathAtomType KMTMathAtomSpace = new MTMathAtomType("KMTMathAtomSpace", 23);
    public static final MTMathAtomType KMTMathAtomStyle = new MTMathAtomType("KMTMathAtomStyle", 24);
    public static final MTMathAtomType KMTMathAtomColor = new MTMathAtomType("KMTMathAtomColor", 25);
    public static final MTMathAtomType KMTMathAtomColorbox = new MTMathAtomType("KMTMathAtomColorbox", 26);
    public static final MTMathAtomType KMTMathAtomTextColor = new MTMathAtomType("KMTMathAtomTextColor", 27);
    public static final MTMathAtomType KMTMathAtomTable = new MTMathAtomType("KMTMathAtomTable", 28);

    private static final /* synthetic */ MTMathAtomType[] $values() {
        return new MTMathAtomType[]{KMTMathAtomNone, KMTMathAtomOrdinary, KMTMathAtomNumber, KMTMathAtomVariable, KMTMathAtomLargeOperator, KMTMathAtomBinaryOperator, KMTMathAtomUnaryOperator, KMTMathAtomRelation, KMTMathAtomOpen, KMTMathAtomClose, KMTMathAtomFraction, KMTMathAtomRadical, KMTMathAtomPunctuation, KMTMathAtomPlaceholder, KMTMathAtomInner, KMTMathAtomUnderline, KMTMathAtomOverline, KMTMathAtomAccent, KMTMathAtomCancel, KMTMathAtomBoxed, KMTMathAtomPhantom, KMTMathAtomUnderOverBrace, KMTMathAtomBoundary, KMTMathAtomSpace, KMTMathAtomStyle, KMTMathAtomColor, KMTMathAtomColorbox, KMTMathAtomTextColor, KMTMathAtomTable};
    }

    static {
        MTMathAtomType[] mTMathAtomTypeArr$values = $values();
        $VALUES = mTMathAtomTypeArr$values;
        $ENTRIES = wd6.n0(mTMathAtomTypeArr$values);
    }

    private MTMathAtomType(String str, int i) {
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static MTMathAtomType valueOf(String str) {
        return (MTMathAtomType) Enum.valueOf(MTMathAtomType.class, str);
    }

    public static MTMathAtomType[] values() {
        return (MTMathAtomType[]) $VALUES.clone();
    }
}
