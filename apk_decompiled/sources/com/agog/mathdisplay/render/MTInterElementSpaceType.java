package com.agog.mathdisplay.render;

import defpackage.fq6;
import defpackage.mdj;
import defpackage.wd6;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/agog/mathdisplay/render/MTInterElementSpaceType;", "", "<init>", "(Ljava/lang/String;I)V", "KMTSpaceInvalid", "KMTSpaceNone", "KMTSpaceThin", "KMTSpaceNSThin", "KMTSpaceNSMedium", "KMTSpaceNSThick", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTInterElementSpaceType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ MTInterElementSpaceType[] $VALUES;
    public static final MTInterElementSpaceType KMTSpaceInvalid = new MTInterElementSpaceType("KMTSpaceInvalid", 0);
    public static final MTInterElementSpaceType KMTSpaceNone = new MTInterElementSpaceType("KMTSpaceNone", 1);
    public static final MTInterElementSpaceType KMTSpaceThin = new MTInterElementSpaceType("KMTSpaceThin", 2);
    public static final MTInterElementSpaceType KMTSpaceNSThin = new MTInterElementSpaceType("KMTSpaceNSThin", 3);
    public static final MTInterElementSpaceType KMTSpaceNSMedium = new MTInterElementSpaceType("KMTSpaceNSMedium", 4);
    public static final MTInterElementSpaceType KMTSpaceNSThick = new MTInterElementSpaceType("KMTSpaceNSThick", 5);

    private static final /* synthetic */ MTInterElementSpaceType[] $values() {
        return new MTInterElementSpaceType[]{KMTSpaceInvalid, KMTSpaceNone, KMTSpaceThin, KMTSpaceNSThin, KMTSpaceNSMedium, KMTSpaceNSThick};
    }

    static {
        MTInterElementSpaceType[] mTInterElementSpaceTypeArr$values = $values();
        $VALUES = mTInterElementSpaceTypeArr$values;
        $ENTRIES = wd6.n0(mTInterElementSpaceTypeArr$values);
    }

    private MTInterElementSpaceType(String str, int i) {
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static MTInterElementSpaceType valueOf(String str) {
        return (MTInterElementSpaceType) Enum.valueOf(MTInterElementSpaceType.class, str);
    }

    public static MTInterElementSpaceType[] values() {
        return (MTInterElementSpaceType[]) $VALUES.clone();
    }
}
