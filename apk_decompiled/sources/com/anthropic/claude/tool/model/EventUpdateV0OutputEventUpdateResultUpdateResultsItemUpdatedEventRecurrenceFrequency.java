package com.anthropic.claude.tool.model;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.m17;
import defpackage.mdj;
import defpackage.n47;
import defpackage.o47;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/anthropic/claude/tool/model/EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceFrequency;", "", "", "loggingName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getLoggingName", "()Ljava/lang/String;", "Companion", "n47", "DAILY", "WEEKLY", "MONTHLY", "YEARLY", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = o47.class)
public final class EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceFrequency {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceFrequency[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final n47 Companion;
    private final String loggingName;
    public static final EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceFrequency DAILY = new EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceFrequency("DAILY", 0, "daily");
    public static final EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceFrequency WEEKLY = new EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceFrequency("WEEKLY", 1, "weekly");
    public static final EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceFrequency MONTHLY = new EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceFrequency("MONTHLY", 2, "monthly");
    public static final EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceFrequency YEARLY = new EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceFrequency("YEARLY", 3, "yearly");

    private static final /* synthetic */ EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceFrequency[] $values() {
        return new EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceFrequency[]{DAILY, WEEKLY, MONTHLY, YEARLY};
    }

    static {
        EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceFrequency[] eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceFrequencyArr$values = $values();
        $VALUES = eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceFrequencyArr$values;
        $ENTRIES = wd6.n0(eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceFrequencyArr$values);
        Companion = new n47();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new m17(23));
    }

    private EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceFrequency(String str, int i, String str2) {
        this.loggingName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceFrequency", values(), new String[]{"daily", "weekly", "monthly", "yearly"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceFrequency valueOf(String str) {
        return (EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceFrequency) Enum.valueOf(EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceFrequency.class, str);
    }

    public static EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceFrequency[] values() {
        return (EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceFrequency[]) $VALUES.clone();
    }

    public final String getLoggingName() {
        return this.loggingName;
    }
}
