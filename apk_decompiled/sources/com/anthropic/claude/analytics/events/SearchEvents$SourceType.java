package com.anthropic.claude.analytics.events;

import defpackage.cef;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.ucf;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/anthropic/claude/analytics/events/SearchEvents$SourceType", "", "Lcom/anthropic/claude/analytics/events/SearchEvents$SourceType;", "<init>", "(Ljava/lang/String;I)V", "Companion", "cef", "UNSPECIFIED", "WEBPAGE", "GOOGLE_DOC", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class SearchEvents$SourceType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ SearchEvents$SourceType[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final cef Companion;
    public static final SearchEvents$SourceType UNSPECIFIED = new SearchEvents$SourceType("UNSPECIFIED", 0);
    public static final SearchEvents$SourceType WEBPAGE = new SearchEvents$SourceType("WEBPAGE", 1);
    public static final SearchEvents$SourceType GOOGLE_DOC = new SearchEvents$SourceType("GOOGLE_DOC", 2);

    private static final /* synthetic */ SearchEvents$SourceType[] $values() {
        return new SearchEvents$SourceType[]{UNSPECIFIED, WEBPAGE, GOOGLE_DOC};
    }

    static {
        SearchEvents$SourceType[] searchEvents$SourceTypeArr$values = $values();
        $VALUES = searchEvents$SourceTypeArr$values;
        $ENTRIES = wd6.n0(searchEvents$SourceTypeArr$values);
        Companion = new cef();
        $cachedSerializer$delegate = yb5.w(w1a.F, new ucf(6));
    }

    private SearchEvents$SourceType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.SearchEvents.SourceType", values(), new String[]{"unknown", "webpage", "google_doc"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static SearchEvents$SourceType valueOf(String str) {
        return (SearchEvents$SourceType) Enum.valueOf(SearchEvents$SourceType.class, str);
    }

    public static SearchEvents$SourceType[] values() {
        return (SearchEvents$SourceType[]) $VALUES.clone();
    }
}
