package com.anthropic.claude.tool.model;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.m17;
import defpackage.mdj;
import defpackage.n17;
import defpackage.o17;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceFrequency;", "", "", "loggingName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getLoggingName", "()Ljava/lang/String;", "Companion", "n17", "DAILY", "WEEKLY", "MONTHLY", "YEARLY", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = o17.class)
public final class EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceFrequency {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceFrequency[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final n17 Companion;
    private final String loggingName;
    public static final EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceFrequency DAILY = new EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceFrequency("DAILY", 0, "daily");
    public static final EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceFrequency WEEKLY = new EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceFrequency("WEEKLY", 1, "weekly");
    public static final EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceFrequency MONTHLY = new EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceFrequency("MONTHLY", 2, "monthly");
    public static final EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceFrequency YEARLY = new EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceFrequency("YEARLY", 3, "yearly");

    private static final /* synthetic */ EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceFrequency[] $values() {
        return new EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceFrequency[]{DAILY, WEEKLY, MONTHLY, YEARLY};
    }

    static {
        EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceFrequency[] eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceFrequencyArr$values = $values();
        $VALUES = eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceFrequencyArr$values;
        $ENTRIES = wd6.n0(eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceFrequencyArr$values);
        Companion = new n17();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new m17(0));
    }

    private EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceFrequency(String str, int i, String str2) {
        this.loggingName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceFrequency", values(), new String[]{"daily", "weekly", "monthly", "yearly"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceFrequency valueOf(String str) {
        return (EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceFrequency) Enum.valueOf(EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceFrequency.class, str);
    }

    public static EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceFrequency[] values() {
        return (EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceFrequency[]) $VALUES.clone();
    }

    public final String getLoggingName() {
        return this.loggingName;
    }
}
