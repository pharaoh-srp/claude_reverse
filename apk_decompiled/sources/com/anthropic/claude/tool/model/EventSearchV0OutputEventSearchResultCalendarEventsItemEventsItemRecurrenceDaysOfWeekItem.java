package com.anthropic.claude.tool.model;

import defpackage.fq6;
import defpackage.fw6;
import defpackage.g17;
import defpackage.h17;
import defpackage.kw9;
import defpackage.mdj;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceDaysOfWeekItem;", "", "", "loggingName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getLoggingName", "()Ljava/lang/String;", "Companion", "g17", "SU", "MO", "TU", "WE", "TH", "FR", "SA", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = h17.class)
public final class EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceDaysOfWeekItem {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceDaysOfWeekItem[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final g17 Companion;
    private final String loggingName;
    public static final EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceDaysOfWeekItem SU = new EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceDaysOfWeekItem("SU", 0, "SU");
    public static final EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceDaysOfWeekItem MO = new EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceDaysOfWeekItem("MO", 1, "MO");
    public static final EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceDaysOfWeekItem TU = new EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceDaysOfWeekItem("TU", 2, "TU");
    public static final EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceDaysOfWeekItem WE = new EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceDaysOfWeekItem("WE", 3, "WE");
    public static final EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceDaysOfWeekItem TH = new EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceDaysOfWeekItem("TH", 4, "TH");
    public static final EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceDaysOfWeekItem FR = new EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceDaysOfWeekItem("FR", 5, "FR");
    public static final EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceDaysOfWeekItem SA = new EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceDaysOfWeekItem("SA", 6, "SA");

    private static final /* synthetic */ EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceDaysOfWeekItem[] $values() {
        return new EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceDaysOfWeekItem[]{SU, MO, TU, WE, TH, FR, SA};
    }

    static {
        EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceDaysOfWeekItem[] eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceDaysOfWeekItemArr$values = $values();
        $VALUES = eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceDaysOfWeekItemArr$values;
        $ENTRIES = wd6.n0(eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceDaysOfWeekItemArr$values);
        Companion = new g17();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new fw6(28));
    }

    private EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceDaysOfWeekItem(String str, int i, String str2) {
        this.loggingName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceDaysOfWeekItem", values(), new String[]{"SU", "MO", "TU", "WE", "TH", "FR", "SA"}, new Annotation[][]{null, null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceDaysOfWeekItem valueOf(String str) {
        return (EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceDaysOfWeekItem) Enum.valueOf(EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceDaysOfWeekItem.class, str);
    }

    public static EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceDaysOfWeekItem[] values() {
        return (EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceDaysOfWeekItem[]) $VALUES.clone();
    }

    public final String getLoggingName() {
        return this.loggingName;
    }
}
