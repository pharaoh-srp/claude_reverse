package com.anthropic.claude.tool.model;

import defpackage.fw6;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.ny6;
import defpackage.onf;
import defpackage.oy6;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001b¨\u0006-"}, d2 = {"Lcom/anthropic/claude/tool/model/EventDeleteV0InputRemovedEventsItem;", "", "", "calendar_id", "event_id", "Lcom/anthropic/claude/tool/model/EventDeleteV0InputRemovedEventsItemRecurrenceSpan;", "recurrence_span", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/tool/model/EventDeleteV0InputRemovedEventsItemRecurrenceSpan;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/tool/model/EventDeleteV0InputRemovedEventsItemRecurrenceSpan;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/EventDeleteV0InputRemovedEventsItem;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/anthropic/claude/tool/model/EventDeleteV0InputRemovedEventsItemRecurrenceSpan;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/tool/model/EventDeleteV0InputRemovedEventsItemRecurrenceSpan;)Lcom/anthropic/claude/tool/model/EventDeleteV0InputRemovedEventsItem;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCalendar_id", "getEvent_id", "Lcom/anthropic/claude/tool/model/EventDeleteV0InputRemovedEventsItemRecurrenceSpan;", "getRecurrence_span", "Companion", "ny6", "oy6", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class EventDeleteV0InputRemovedEventsItem {
    private final String calendar_id;
    private final String event_id;
    private final EventDeleteV0InputRemovedEventsItemRecurrenceSpan recurrence_span;
    public static final oy6 Companion = new oy6();
    private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new fw6(15))};

    public /* synthetic */ EventDeleteV0InputRemovedEventsItem(int i, String str, String str2, EventDeleteV0InputRemovedEventsItemRecurrenceSpan eventDeleteV0InputRemovedEventsItemRecurrenceSpan, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, ny6.a.getDescriptor());
            throw null;
        }
        this.calendar_id = str;
        this.event_id = str2;
        if ((i & 4) == 0) {
            this.recurrence_span = null;
        } else {
            this.recurrence_span = eventDeleteV0InputRemovedEventsItemRecurrenceSpan;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return EventDeleteV0InputRemovedEventsItemRecurrenceSpan.Companion.serializer();
    }

    public static /* synthetic */ EventDeleteV0InputRemovedEventsItem copy$default(EventDeleteV0InputRemovedEventsItem eventDeleteV0InputRemovedEventsItem, String str, String str2, EventDeleteV0InputRemovedEventsItemRecurrenceSpan eventDeleteV0InputRemovedEventsItemRecurrenceSpan, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventDeleteV0InputRemovedEventsItem.calendar_id;
        }
        if ((i & 2) != 0) {
            str2 = eventDeleteV0InputRemovedEventsItem.event_id;
        }
        if ((i & 4) != 0) {
            eventDeleteV0InputRemovedEventsItemRecurrenceSpan = eventDeleteV0InputRemovedEventsItem.recurrence_span;
        }
        return eventDeleteV0InputRemovedEventsItem.copy(str, str2, eventDeleteV0InputRemovedEventsItemRecurrenceSpan);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(EventDeleteV0InputRemovedEventsItem self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.calendar_id);
        output.q(serialDesc, 1, self.event_id);
        if (!output.E(serialDesc) && self.recurrence_span == null) {
            return;
        }
        output.B(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.recurrence_span);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCalendar_id() {
        return this.calendar_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEvent_id() {
        return this.event_id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EventDeleteV0InputRemovedEventsItemRecurrenceSpan getRecurrence_span() {
        return this.recurrence_span;
    }

    public final EventDeleteV0InputRemovedEventsItem copy(String calendar_id, String event_id, EventDeleteV0InputRemovedEventsItemRecurrenceSpan recurrence_span) {
        calendar_id.getClass();
        event_id.getClass();
        return new EventDeleteV0InputRemovedEventsItem(calendar_id, event_id, recurrence_span);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventDeleteV0InputRemovedEventsItem)) {
            return false;
        }
        EventDeleteV0InputRemovedEventsItem eventDeleteV0InputRemovedEventsItem = (EventDeleteV0InputRemovedEventsItem) other;
        return x44.r(this.calendar_id, eventDeleteV0InputRemovedEventsItem.calendar_id) && x44.r(this.event_id, eventDeleteV0InputRemovedEventsItem.event_id) && x44.r(this.recurrence_span, eventDeleteV0InputRemovedEventsItem.recurrence_span);
    }

    public final String getCalendar_id() {
        return this.calendar_id;
    }

    public final String getEvent_id() {
        return this.event_id;
    }

    public final EventDeleteV0InputRemovedEventsItemRecurrenceSpan getRecurrence_span() {
        return this.recurrence_span;
    }

    public int hashCode() {
        int iL = kgh.l(this.calendar_id.hashCode() * 31, 31, this.event_id);
        EventDeleteV0InputRemovedEventsItemRecurrenceSpan eventDeleteV0InputRemovedEventsItemRecurrenceSpan = this.recurrence_span;
        return iL + (eventDeleteV0InputRemovedEventsItemRecurrenceSpan == null ? 0 : eventDeleteV0InputRemovedEventsItemRecurrenceSpan.hashCode());
    }

    public String toString() {
        String str = this.calendar_id;
        String str2 = this.event_id;
        EventDeleteV0InputRemovedEventsItemRecurrenceSpan eventDeleteV0InputRemovedEventsItemRecurrenceSpan = this.recurrence_span;
        StringBuilder sbR = kgh.r("EventDeleteV0InputRemovedEventsItem(calendar_id=", str, ", event_id=", str2, ", recurrence_span=");
        sbR.append(eventDeleteV0InputRemovedEventsItemRecurrenceSpan);
        sbR.append(")");
        return sbR.toString();
    }

    public EventDeleteV0InputRemovedEventsItem(String str, String str2, EventDeleteV0InputRemovedEventsItemRecurrenceSpan eventDeleteV0InputRemovedEventsItemRecurrenceSpan) {
        str.getClass();
        str2.getClass();
        this.calendar_id = str;
        this.event_id = str2;
        this.recurrence_span = eventDeleteV0InputRemovedEventsItemRecurrenceSpan;
    }

    public /* synthetic */ EventDeleteV0InputRemovedEventsItem(String str, String str2, EventDeleteV0InputRemovedEventsItemRecurrenceSpan eventDeleteV0InputRemovedEventsItemRecurrenceSpan, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : eventDeleteV0InputRemovedEventsItemRecurrenceSpan);
    }
}
