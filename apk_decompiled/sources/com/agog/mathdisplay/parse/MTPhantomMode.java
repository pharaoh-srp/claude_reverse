package com.agog.mathdisplay.parse;

import defpackage.fq6;
import defpackage.mdj;
import defpackage.wd6;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/agog/mathdisplay/parse/MTPhantomMode;", "", "<init>", "(Ljava/lang/String;I)V", "Full", "Horizontal", "Vertical", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTPhantomMode {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ MTPhantomMode[] $VALUES;
    public static final MTPhantomMode Full = new MTPhantomMode("Full", 0);
    public static final MTPhantomMode Horizontal = new MTPhantomMode("Horizontal", 1);
    public static final MTPhantomMode Vertical = new MTPhantomMode("Vertical", 2);

    private static final /* synthetic */ MTPhantomMode[] $values() {
        return new MTPhantomMode[]{Full, Horizontal, Vertical};
    }

    static {
        MTPhantomMode[] mTPhantomModeArr$values = $values();
        $VALUES = mTPhantomModeArr$values;
        $ENTRIES = wd6.n0(mTPhantomModeArr$values);
    }

    private MTPhantomMode(String str, int i) {
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static MTPhantomMode valueOf(String str) {
        return (MTPhantomMode) Enum.valueOf(MTPhantomMode.class, str);
    }

    public static MTPhantomMode[] values() {
        return (MTPhantomMode[]) $VALUES.clone();
    }
}
