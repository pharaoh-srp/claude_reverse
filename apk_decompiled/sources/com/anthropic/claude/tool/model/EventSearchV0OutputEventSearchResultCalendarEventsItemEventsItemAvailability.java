package com.anthropic.claude.tool.model;

import defpackage.fq6;
import defpackage.fw6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.y07;
import defpackage.yb5;
import defpackage.z07;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability;", "", "", "loggingName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getLoggingName", "()Ljava/lang/String;", "Companion", "y07", "BUSY", "FREE", "TENTATIVE", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = z07.class)
public final class EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final y07 Companion;
    private final String loggingName;
    public static final EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability BUSY = new EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability("BUSY", 0, "busy");
    public static final EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability FREE = new EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability("FREE", 1, "free");
    public static final EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability TENTATIVE = new EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability("TENTATIVE", 2, "tentative");

    private static final /* synthetic */ EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability[] $values() {
        return new EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability[]{BUSY, FREE, TENTATIVE};
    }

    static {
        EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability[] eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailabilityArr$values = $values();
        $VALUES = eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailabilityArr$values;
        $ENTRIES = wd6.n0(eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailabilityArr$values);
        Companion = new y07();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new fw6(24));
    }

    private EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability(String str, int i, String str2) {
        this.loggingName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability", values(), new String[]{"busy", "free", "tentative"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability valueOf(String str) {
        return (EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability) Enum.valueOf(EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability.class, str);
    }

    public static EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability[] values() {
        return (EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability[]) $VALUES.clone();
    }

    public final String getLoggingName() {
        return this.loggingName;
    }
}
