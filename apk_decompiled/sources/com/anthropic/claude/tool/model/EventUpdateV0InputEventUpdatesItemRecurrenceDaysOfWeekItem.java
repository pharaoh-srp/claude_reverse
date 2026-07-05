package com.anthropic.claude.tool.model;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.m17;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.x27;
import defpackage.y27;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItem;", "", "", "loggingName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getLoggingName", "()Ljava/lang/String;", "Companion", "x27", "SU", "MO", "TU", "WE", "TH", "FR", "SA", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = y27.class)
public final class EventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItem {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ EventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItem[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final x27 Companion;
    private final String loggingName;
    public static final EventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItem SU = new EventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItem("SU", 0, "SU");
    public static final EventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItem MO = new EventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItem("MO", 1, "MO");
    public static final EventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItem TU = new EventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItem("TU", 2, "TU");
    public static final EventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItem WE = new EventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItem("WE", 3, "WE");
    public static final EventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItem TH = new EventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItem("TH", 4, "TH");
    public static final EventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItem FR = new EventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItem("FR", 5, "FR");
    public static final EventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItem SA = new EventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItem("SA", 6, "SA");

    private static final /* synthetic */ EventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItem[] $values() {
        return new EventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItem[]{SU, MO, TU, WE, TH, FR, SA};
    }

    static {
        EventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItem[] eventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItemArr$values = $values();
        $VALUES = eventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItemArr$values;
        $ENTRIES = wd6.n0(eventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItemArr$values);
        Companion = new x27();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new m17(9));
    }

    private EventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItem(String str, int i, String str2) {
        this.loggingName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItem", values(), new String[]{"SU", "MO", "TU", "WE", "TH", "FR", "SA"}, new Annotation[][]{null, null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static EventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItem valueOf(String str) {
        return (EventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItem) Enum.valueOf(EventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItem.class, str);
    }

    public static EventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItem[] values() {
        return (EventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItem[]) $VALUES.clone();
    }

    public final String getLoggingName() {
        return this.loggingName;
    }
}
