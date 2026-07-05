package com.anthropic.claude.tool.model;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.t37;
import defpackage.u37;
import defpackage.v37;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x37;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ<\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001f¨\u00063"}, d2 = {"Lcom/anthropic/claude/tool/model/EventUpdateV0OutputEventUpdateResultUpdateResultsItem;", "", "", "calendar_id", "Lcom/anthropic/claude/tool/model/EventUpdateV0OutputEventUpdateResultUpdateResultsItemError;", "error", "event_id", "Lcom/anthropic/claude/tool/model/EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent;", "updated_event", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/tool/model/EventUpdateV0OutputEventUpdateResultUpdateResultsItemError;Ljava/lang/String;Lcom/anthropic/claude/tool/model/EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/tool/model/EventUpdateV0OutputEventUpdateResultUpdateResultsItemError;Ljava/lang/String;Lcom/anthropic/claude/tool/model/EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/EventUpdateV0OutputEventUpdateResultUpdateResultsItem;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/tool/model/EventUpdateV0OutputEventUpdateResultUpdateResultsItemError;", "component3", "component4", "()Lcom/anthropic/claude/tool/model/EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent;", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/tool/model/EventUpdateV0OutputEventUpdateResultUpdateResultsItemError;Ljava/lang/String;Lcom/anthropic/claude/tool/model/EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent;)Lcom/anthropic/claude/tool/model/EventUpdateV0OutputEventUpdateResultUpdateResultsItem;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCalendar_id", "Lcom/anthropic/claude/tool/model/EventUpdateV0OutputEventUpdateResultUpdateResultsItemError;", "getError", "getEvent_id", "Lcom/anthropic/claude/tool/model/EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent;", "getUpdated_event", "Companion", "t37", "u37", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class EventUpdateV0OutputEventUpdateResultUpdateResultsItem {
    public static final u37 Companion = new u37();
    private final String calendar_id;
    private final EventUpdateV0OutputEventUpdateResultUpdateResultsItemError error;
    private final String event_id;
    private final EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent updated_event;

    public /* synthetic */ EventUpdateV0OutputEventUpdateResultUpdateResultsItem(int i, String str, EventUpdateV0OutputEventUpdateResultUpdateResultsItemError eventUpdateV0OutputEventUpdateResultUpdateResultsItemError, String str2, EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent, vnf vnfVar) {
        if (5 != (i & 5)) {
            gvj.f(i, 5, t37.a.getDescriptor());
            throw null;
        }
        this.calendar_id = str;
        if ((i & 2) == 0) {
            this.error = null;
        } else {
            this.error = eventUpdateV0OutputEventUpdateResultUpdateResultsItemError;
        }
        this.event_id = str2;
        if ((i & 8) == 0) {
            this.updated_event = null;
        } else {
            this.updated_event = eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent;
        }
    }

    public static /* synthetic */ EventUpdateV0OutputEventUpdateResultUpdateResultsItem copy$default(EventUpdateV0OutputEventUpdateResultUpdateResultsItem eventUpdateV0OutputEventUpdateResultUpdateResultsItem, String str, EventUpdateV0OutputEventUpdateResultUpdateResultsItemError eventUpdateV0OutputEventUpdateResultUpdateResultsItemError, String str2, EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventUpdateV0OutputEventUpdateResultUpdateResultsItem.calendar_id;
        }
        if ((i & 2) != 0) {
            eventUpdateV0OutputEventUpdateResultUpdateResultsItemError = eventUpdateV0OutputEventUpdateResultUpdateResultsItem.error;
        }
        if ((i & 4) != 0) {
            str2 = eventUpdateV0OutputEventUpdateResultUpdateResultsItem.event_id;
        }
        if ((i & 8) != 0) {
            eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent = eventUpdateV0OutputEventUpdateResultUpdateResultsItem.updated_event;
        }
        return eventUpdateV0OutputEventUpdateResultUpdateResultsItem.copy(str, eventUpdateV0OutputEventUpdateResultUpdateResultsItemError, str2, eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(EventUpdateV0OutputEventUpdateResultUpdateResultsItem self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.calendar_id);
        if (output.E(serialDesc) || self.error != null) {
            output.B(serialDesc, 1, v37.a, self.error);
        }
        output.q(serialDesc, 2, self.event_id);
        if (!output.E(serialDesc) && self.updated_event == null) {
            return;
        }
        output.B(serialDesc, 3, x37.a, self.updated_event);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCalendar_id() {
        return this.calendar_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EventUpdateV0OutputEventUpdateResultUpdateResultsItemError getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEvent_id() {
        return this.event_id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent getUpdated_event() {
        return this.updated_event;
    }

    public final EventUpdateV0OutputEventUpdateResultUpdateResultsItem copy(String calendar_id, EventUpdateV0OutputEventUpdateResultUpdateResultsItemError error, String event_id, EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent updated_event) {
        calendar_id.getClass();
        event_id.getClass();
        return new EventUpdateV0OutputEventUpdateResultUpdateResultsItem(calendar_id, error, event_id, updated_event);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventUpdateV0OutputEventUpdateResultUpdateResultsItem)) {
            return false;
        }
        EventUpdateV0OutputEventUpdateResultUpdateResultsItem eventUpdateV0OutputEventUpdateResultUpdateResultsItem = (EventUpdateV0OutputEventUpdateResultUpdateResultsItem) other;
        return x44.r(this.calendar_id, eventUpdateV0OutputEventUpdateResultUpdateResultsItem.calendar_id) && x44.r(this.error, eventUpdateV0OutputEventUpdateResultUpdateResultsItem.error) && x44.r(this.event_id, eventUpdateV0OutputEventUpdateResultUpdateResultsItem.event_id) && x44.r(this.updated_event, eventUpdateV0OutputEventUpdateResultUpdateResultsItem.updated_event);
    }

    public final String getCalendar_id() {
        return this.calendar_id;
    }

    public final EventUpdateV0OutputEventUpdateResultUpdateResultsItemError getError() {
        return this.error;
    }

    public final String getEvent_id() {
        return this.event_id;
    }

    public final EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent getUpdated_event() {
        return this.updated_event;
    }

    public int hashCode() {
        int iHashCode = this.calendar_id.hashCode() * 31;
        EventUpdateV0OutputEventUpdateResultUpdateResultsItemError eventUpdateV0OutputEventUpdateResultUpdateResultsItemError = this.error;
        int iL = kgh.l((iHashCode + (eventUpdateV0OutputEventUpdateResultUpdateResultsItemError == null ? 0 : eventUpdateV0OutputEventUpdateResultUpdateResultsItemError.hashCode())) * 31, 31, this.event_id);
        EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent = this.updated_event;
        return iL + (eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent != null ? eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent.hashCode() : 0);
    }

    public String toString() {
        return "EventUpdateV0OutputEventUpdateResultUpdateResultsItem(calendar_id=" + this.calendar_id + ", error=" + this.error + ", event_id=" + this.event_id + ", updated_event=" + this.updated_event + ")";
    }

    public EventUpdateV0OutputEventUpdateResultUpdateResultsItem(String str, EventUpdateV0OutputEventUpdateResultUpdateResultsItemError eventUpdateV0OutputEventUpdateResultUpdateResultsItemError, String str2, EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent) {
        str.getClass();
        str2.getClass();
        this.calendar_id = str;
        this.error = eventUpdateV0OutputEventUpdateResultUpdateResultsItemError;
        this.event_id = str2;
        this.updated_event = eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent;
    }

    public /* synthetic */ EventUpdateV0OutputEventUpdateResultUpdateResultsItem(String str, EventUpdateV0OutputEventUpdateResultUpdateResultsItemError eventUpdateV0OutputEventUpdateResultUpdateResultsItemError, String str2, EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : eventUpdateV0OutputEventUpdateResultUpdateResultsItemError, str2, (i & 8) != 0 ? null : eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent);
    }
}
