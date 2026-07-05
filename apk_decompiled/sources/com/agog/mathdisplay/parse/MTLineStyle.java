package com.agog.mathdisplay.parse;

import defpackage.fq6;
import defpackage.mdj;
import defpackage.wd6;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/agog/mathdisplay/parse/MTLineStyle;", "", "<init>", "(Ljava/lang/String;I)V", "KMTLineStyleDisplay", "KMTLineStyleText", "KMTLineStyleScript", "KMTLineStyleScriptScript", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTLineStyle {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ MTLineStyle[] $VALUES;
    public static final MTLineStyle KMTLineStyleDisplay = new MTLineStyle("KMTLineStyleDisplay", 0);
    public static final MTLineStyle KMTLineStyleText = new MTLineStyle("KMTLineStyleText", 1);
    public static final MTLineStyle KMTLineStyleScript = new MTLineStyle("KMTLineStyleScript", 2);
    public static final MTLineStyle KMTLineStyleScriptScript = new MTLineStyle("KMTLineStyleScriptScript", 3);

    private static final /* synthetic */ MTLineStyle[] $values() {
        return new MTLineStyle[]{KMTLineStyleDisplay, KMTLineStyleText, KMTLineStyleScript, KMTLineStyleScriptScript};
    }

    static {
        MTLineStyle[] mTLineStyleArr$values = $values();
        $VALUES = mTLineStyleArr$values;
        $ENTRIES = wd6.n0(mTLineStyleArr$values);
    }

    private MTLineStyle(String str, int i) {
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static MTLineStyle valueOf(String str) {
        return (MTLineStyle) Enum.valueOf(MTLineStyle.class, str);
    }

    public static MTLineStyle[] values() {
        return (MTLineStyle[]) $VALUES.clone();
    }
}
