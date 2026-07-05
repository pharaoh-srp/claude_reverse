package com.agog.mathdisplay.render;

import defpackage.fq6;
import defpackage.mdj;
import defpackage.wd6;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/agog/mathdisplay/render/MTLinePosition;", "", "<init>", "(Ljava/lang/String;I)V", "KMTLinePositionRegular", "KMTLinePositionSubscript", "KMTLinePositionSuperscript", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTLinePosition {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ MTLinePosition[] $VALUES;
    public static final MTLinePosition KMTLinePositionRegular = new MTLinePosition("KMTLinePositionRegular", 0);
    public static final MTLinePosition KMTLinePositionSubscript = new MTLinePosition("KMTLinePositionSubscript", 1);
    public static final MTLinePosition KMTLinePositionSuperscript = new MTLinePosition("KMTLinePositionSuperscript", 2);

    private static final /* synthetic */ MTLinePosition[] $values() {
        return new MTLinePosition[]{KMTLinePositionRegular, KMTLinePositionSubscript, KMTLinePositionSuperscript};
    }

    static {
        MTLinePosition[] mTLinePositionArr$values = $values();
        $VALUES = mTLinePositionArr$values;
        $ENTRIES = wd6.n0(mTLinePositionArr$values);
    }

    private MTLinePosition(String str, int i) {
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static MTLinePosition valueOf(String str) {
        return (MTLinePosition) Enum.valueOf(MTLinePosition.class, str);
    }

    public static MTLinePosition[] values() {
        return (MTLinePosition[]) $VALUES.clone();
    }
}
