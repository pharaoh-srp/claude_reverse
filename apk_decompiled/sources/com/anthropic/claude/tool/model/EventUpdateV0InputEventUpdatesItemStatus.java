package com.anthropic.claude.tool.model;

import defpackage.fq6;
import defpackage.k37;
import defpackage.kw9;
import defpackage.l37;
import defpackage.m17;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemStatus;", "", "", "loggingName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getLoggingName", "()Ljava/lang/String;", "Companion", "k37", "CONFIRMED", "TENTATIVE", "CANCELLED", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = l37.class)
public final class EventUpdateV0InputEventUpdatesItemStatus {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ EventUpdateV0InputEventUpdatesItemStatus[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final k37 Companion;
    private final String loggingName;
    public static final EventUpdateV0InputEventUpdatesItemStatus CONFIRMED = new EventUpdateV0InputEventUpdatesItemStatus("CONFIRMED", 0, "confirmed");
    public static final EventUpdateV0InputEventUpdatesItemStatus TENTATIVE = new EventUpdateV0InputEventUpdatesItemStatus("TENTATIVE", 1, "tentative");
    public static final EventUpdateV0InputEventUpdatesItemStatus CANCELLED = new EventUpdateV0InputEventUpdatesItemStatus("CANCELLED", 2, "cancelled");

    private static final /* synthetic */ EventUpdateV0InputEventUpdatesItemStatus[] $values() {
        return new EventUpdateV0InputEventUpdatesItemStatus[]{CONFIRMED, TENTATIVE, CANCELLED};
    }

    static {
        EventUpdateV0InputEventUpdatesItemStatus[] eventUpdateV0InputEventUpdatesItemStatusArr$values = $values();
        $VALUES = eventUpdateV0InputEventUpdatesItemStatusArr$values;
        $ENTRIES = wd6.n0(eventUpdateV0InputEventUpdatesItemStatusArr$values);
        Companion = new k37();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new m17(12));
    }

    private EventUpdateV0InputEventUpdatesItemStatus(String str, int i, String str2) {
        this.loggingName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemStatus", values(), new String[]{"confirmed", "tentative", "cancelled"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static EventUpdateV0InputEventUpdatesItemStatus valueOf(String str) {
        return (EventUpdateV0InputEventUpdatesItemStatus) Enum.valueOf(EventUpdateV0InputEventUpdatesItemStatus.class, str);
    }

    public static EventUpdateV0InputEventUpdatesItemStatus[] values() {
        return (EventUpdateV0InputEventUpdatesItemStatus[]) $VALUES.clone();
    }

    public final String getLoggingName() {
        return this.loggingName;
    }
}
