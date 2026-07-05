package com.anthropic.claude.tool.model;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.m17;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.p27;
import defpackage.q27;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemAvailability;", "", "", "loggingName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getLoggingName", "()Ljava/lang/String;", "Companion", "p27", "BUSY", "FREE", "TENTATIVE", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = q27.class)
public final class EventUpdateV0InputEventUpdatesItemAvailability {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ EventUpdateV0InputEventUpdatesItemAvailability[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final p27 Companion;
    private final String loggingName;
    public static final EventUpdateV0InputEventUpdatesItemAvailability BUSY = new EventUpdateV0InputEventUpdatesItemAvailability("BUSY", 0, "busy");
    public static final EventUpdateV0InputEventUpdatesItemAvailability FREE = new EventUpdateV0InputEventUpdatesItemAvailability("FREE", 1, "free");
    public static final EventUpdateV0InputEventUpdatesItemAvailability TENTATIVE = new EventUpdateV0InputEventUpdatesItemAvailability("TENTATIVE", 2, "tentative");

    private static final /* synthetic */ EventUpdateV0InputEventUpdatesItemAvailability[] $values() {
        return new EventUpdateV0InputEventUpdatesItemAvailability[]{BUSY, FREE, TENTATIVE};
    }

    static {
        EventUpdateV0InputEventUpdatesItemAvailability[] eventUpdateV0InputEventUpdatesItemAvailabilityArr$values = $values();
        $VALUES = eventUpdateV0InputEventUpdatesItemAvailabilityArr$values;
        $ENTRIES = wd6.n0(eventUpdateV0InputEventUpdatesItemAvailabilityArr$values);
        Companion = new p27();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new m17(5));
    }

    private EventUpdateV0InputEventUpdatesItemAvailability(String str, int i, String str2) {
        this.loggingName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemAvailability", values(), new String[]{"busy", "free", "tentative"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static EventUpdateV0InputEventUpdatesItemAvailability valueOf(String str) {
        return (EventUpdateV0InputEventUpdatesItemAvailability) Enum.valueOf(EventUpdateV0InputEventUpdatesItemAvailability.class, str);
    }

    public static EventUpdateV0InputEventUpdatesItemAvailability[] values() {
        return (EventUpdateV0InputEventUpdatesItemAvailability[]) $VALUES.clone();
    }

    public final String getLoggingName() {
        return this.loggingName;
    }
}
