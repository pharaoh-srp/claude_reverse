package com.anthropic.claude.tool.model;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.m17;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.p17;
import defpackage.q17;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus;", "", "", "loggingName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getLoggingName", "()Ljava/lang/String;", "Companion", "p17", "CONFIRMED", "TENTATIVE", "CANCELLED", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = q17.class)
public final class EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final p17 Companion;
    private final String loggingName;
    public static final EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus CONFIRMED = new EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus("CONFIRMED", 0, "confirmed");
    public static final EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus TENTATIVE = new EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus("TENTATIVE", 1, "tentative");
    public static final EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus CANCELLED = new EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus("CANCELLED", 2, "cancelled");

    private static final /* synthetic */ EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus[] $values() {
        return new EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus[]{CONFIRMED, TENTATIVE, CANCELLED};
    }

    static {
        EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus[] eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatusArr$values = $values();
        $VALUES = eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatusArr$values;
        $ENTRIES = wd6.n0(eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatusArr$values);
        Companion = new p17();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new m17(1));
    }

    private EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus(String str, int i, String str2) {
        this.loggingName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus", values(), new String[]{"confirmed", "tentative", "cancelled"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus valueOf(String str) {
        return (EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus) Enum.valueOf(EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus.class, str);
    }

    public static EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus[] values() {
        return (EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus[]) $VALUES.clone();
    }

    public final String getLoggingName() {
        return this.loggingName;
    }
}
