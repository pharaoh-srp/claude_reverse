package com.agog.mathdisplay.parse;

import defpackage.fq6;
import defpackage.mdj;
import defpackage.wd6;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/agog/mathdisplay/parse/MTParseErrors;", "", "<init>", "(Ljava/lang/String;I)V", "ErrorNone", "MismatchBraces", "InvalidCommand", "CharacterNotFound", "MissingDelimiter", "InvalidDelimiter", "MissingRight", "MissingLeft", "InvalidEnv", "MissingEnv", "MissingBegin", "MissingEnd", "InvalidNumColumns", "InternalError", "InvalidLimits", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTParseErrors {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ MTParseErrors[] $VALUES;
    public static final MTParseErrors ErrorNone = new MTParseErrors("ErrorNone", 0);
    public static final MTParseErrors MismatchBraces = new MTParseErrors("MismatchBraces", 1);
    public static final MTParseErrors InvalidCommand = new MTParseErrors("InvalidCommand", 2);
    public static final MTParseErrors CharacterNotFound = new MTParseErrors("CharacterNotFound", 3);
    public static final MTParseErrors MissingDelimiter = new MTParseErrors("MissingDelimiter", 4);
    public static final MTParseErrors InvalidDelimiter = new MTParseErrors("InvalidDelimiter", 5);
    public static final MTParseErrors MissingRight = new MTParseErrors("MissingRight", 6);
    public static final MTParseErrors MissingLeft = new MTParseErrors("MissingLeft", 7);
    public static final MTParseErrors InvalidEnv = new MTParseErrors("InvalidEnv", 8);
    public static final MTParseErrors MissingEnv = new MTParseErrors("MissingEnv", 9);
    public static final MTParseErrors MissingBegin = new MTParseErrors("MissingBegin", 10);
    public static final MTParseErrors MissingEnd = new MTParseErrors("MissingEnd", 11);
    public static final MTParseErrors InvalidNumColumns = new MTParseErrors("InvalidNumColumns", 12);
    public static final MTParseErrors InternalError = new MTParseErrors("InternalError", 13);
    public static final MTParseErrors InvalidLimits = new MTParseErrors("InvalidLimits", 14);

    private static final /* synthetic */ MTParseErrors[] $values() {
        return new MTParseErrors[]{ErrorNone, MismatchBraces, InvalidCommand, CharacterNotFound, MissingDelimiter, InvalidDelimiter, MissingRight, MissingLeft, InvalidEnv, MissingEnv, MissingBegin, MissingEnd, InvalidNumColumns, InternalError, InvalidLimits};
    }

    static {
        MTParseErrors[] mTParseErrorsArr$values = $values();
        $VALUES = mTParseErrorsArr$values;
        $ENTRIES = wd6.n0(mTParseErrorsArr$values);
    }

    private MTParseErrors(String str, int i) {
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static MTParseErrors valueOf(String str) {
        return (MTParseErrors) Enum.valueOf(MTParseErrors.class, str);
    }

    public static MTParseErrors[] values() {
        return (MTParseErrors[]) $VALUES.clone();
    }
}
