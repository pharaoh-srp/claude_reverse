package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.ucf;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import defpackage.zdf;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/anthropic/claude/analytics/events/SearchEvents$SearchType", "", "Lcom/anthropic/claude/analytics/events/SearchEvents$SearchType;", "<init>", "(Ljava/lang/String;I)V", "Companion", "zdf", "UNSPECIFIED", "WEB", "DRIVE", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class SearchEvents$SearchType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ SearchEvents$SearchType[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final zdf Companion;
    public static final SearchEvents$SearchType UNSPECIFIED = new SearchEvents$SearchType("UNSPECIFIED", 0);
    public static final SearchEvents$SearchType WEB = new SearchEvents$SearchType("WEB", 1);
    public static final SearchEvents$SearchType DRIVE = new SearchEvents$SearchType("DRIVE", 2);

    private static final /* synthetic */ SearchEvents$SearchType[] $values() {
        return new SearchEvents$SearchType[]{UNSPECIFIED, WEB, DRIVE};
    }

    static {
        SearchEvents$SearchType[] searchEvents$SearchTypeArr$values = $values();
        $VALUES = searchEvents$SearchTypeArr$values;
        $ENTRIES = wd6.n0(searchEvents$SearchTypeArr$values);
        Companion = new zdf();
        $cachedSerializer$delegate = yb5.w(w1a.F, new ucf(3));
    }

    private SearchEvents$SearchType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.SearchEvents.SearchType", values(), new String[]{"unknown", "web", "drive"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static SearchEvents$SearchType valueOf(String str) {
        return (SearchEvents$SearchType) Enum.valueOf(SearchEvents$SearchType.class, str);
    }

    public static SearchEvents$SearchType[] values() {
        return (SearchEvents$SearchType[]) $VALUES.clone();
    }
}
