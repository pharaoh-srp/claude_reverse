package com.anthropic.claude.tool.model;

import defpackage.fq6;
import defpackage.fw6;
import defpackage.ix6;
import defpackage.jx6;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/anthropic/claude/tool/model/EventCreateV1InputNewEventsItemRecurrenceFrequency;", "", "", "loggingName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getLoggingName", "()Ljava/lang/String;", "Companion", "ix6", "DAILY", "WEEKLY", "MONTHLY", "YEARLY", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = jx6.class)
public final class EventCreateV1InputNewEventsItemRecurrenceFrequency {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ EventCreateV1InputNewEventsItemRecurrenceFrequency[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final ix6 Companion;
    private final String loggingName;
    public static final EventCreateV1InputNewEventsItemRecurrenceFrequency DAILY = new EventCreateV1InputNewEventsItemRecurrenceFrequency("DAILY", 0, "daily");
    public static final EventCreateV1InputNewEventsItemRecurrenceFrequency WEEKLY = new EventCreateV1InputNewEventsItemRecurrenceFrequency("WEEKLY", 1, "weekly");
    public static final EventCreateV1InputNewEventsItemRecurrenceFrequency MONTHLY = new EventCreateV1InputNewEventsItemRecurrenceFrequency("MONTHLY", 2, "monthly");
    public static final EventCreateV1InputNewEventsItemRecurrenceFrequency YEARLY = new EventCreateV1InputNewEventsItemRecurrenceFrequency("YEARLY", 3, "yearly");

    private static final /* synthetic */ EventCreateV1InputNewEventsItemRecurrenceFrequency[] $values() {
        return new EventCreateV1InputNewEventsItemRecurrenceFrequency[]{DAILY, WEEKLY, MONTHLY, YEARLY};
    }

    static {
        EventCreateV1InputNewEventsItemRecurrenceFrequency[] eventCreateV1InputNewEventsItemRecurrenceFrequencyArr$values = $values();
        $VALUES = eventCreateV1InputNewEventsItemRecurrenceFrequencyArr$values;
        $ENTRIES = wd6.n0(eventCreateV1InputNewEventsItemRecurrenceFrequencyArr$values);
        Companion = new ix6();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new fw6(11));
    }

    private EventCreateV1InputNewEventsItemRecurrenceFrequency(String str, int i, String str2) {
        this.loggingName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItemRecurrenceFrequency", values(), new String[]{"daily", "weekly", "monthly", "yearly"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static EventCreateV1InputNewEventsItemRecurrenceFrequency valueOf(String str) {
        return (EventCreateV1InputNewEventsItemRecurrenceFrequency) Enum.valueOf(EventCreateV1InputNewEventsItemRecurrenceFrequency.class, str);
    }

    public static EventCreateV1InputNewEventsItemRecurrenceFrequency[] values() {
        return (EventCreateV1InputNewEventsItemRecurrenceFrequency[]) $VALUES.clone();
    }

    public final String getLoggingName() {
        return this.loggingName;
    }
}
