package com.anthropic.claude.tool.model;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.onf;
import defpackage.qy6;
import defpackage.ry6;
import defpackage.vnf;
import defpackage.x44;
import java.time.OffsetDateTime;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\"\u0012\u0019\u0010\u0007\u001a\u00150\u0002j\u0002`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006¢\u0006\u0004\b\b\u0010\tB%\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0018\u001a\u00150\u0002j\u0002`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001a\u001a\u00020\u00002\u001b\b\u0002\u0010\u0007\u001a\u00150\u0002j\u0002`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R*\u0010\u0007\u001a\u00150\u0002j\u0002`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0019¨\u0006+"}, d2 = {"Lcom/anthropic/claude/tool/model/EventDeleteV0InputRemovedEventsItemRecurrenceSpanRecurrenceSpanInstance;", "Lcom/anthropic/claude/tool/model/EventDeleteV0InputRemovedEventsItemRecurrenceSpan;", "Ljava/time/OffsetDateTime;", "Lcom/anthropic/claude/tool/model/EventDateTime;", "Lonf;", "with", "Lay6;", "start_time", "<init>", "(Ljava/time/OffsetDateTime;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/time/OffsetDateTime;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/EventDeleteV0InputRemovedEventsItemRecurrenceSpanRecurrenceSpanInstance;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/time/OffsetDateTime;", "copy", "(Ljava/time/OffsetDateTime;)Lcom/anthropic/claude/tool/model/EventDeleteV0InputRemovedEventsItemRecurrenceSpanRecurrenceSpanInstance;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/time/OffsetDateTime;", "getStart_time", "Companion", "qy6", "ry6", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class EventDeleteV0InputRemovedEventsItemRecurrenceSpanRecurrenceSpanInstance implements EventDeleteV0InputRemovedEventsItemRecurrenceSpan {
    public static final ry6 Companion = new ry6();
    private final OffsetDateTime start_time;

    public /* synthetic */ EventDeleteV0InputRemovedEventsItemRecurrenceSpanRecurrenceSpanInstance(int i, OffsetDateTime offsetDateTime, vnf vnfVar) {
        if (1 == (i & 1)) {
            this.start_time = offsetDateTime;
        } else {
            gvj.f(i, 1, qy6.a.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ EventDeleteV0InputRemovedEventsItemRecurrenceSpanRecurrenceSpanInstance copy$default(EventDeleteV0InputRemovedEventsItemRecurrenceSpanRecurrenceSpanInstance eventDeleteV0InputRemovedEventsItemRecurrenceSpanRecurrenceSpanInstance, OffsetDateTime offsetDateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            offsetDateTime = eventDeleteV0InputRemovedEventsItemRecurrenceSpanRecurrenceSpanInstance.start_time;
        }
        return eventDeleteV0InputRemovedEventsItemRecurrenceSpanRecurrenceSpanInstance.copy(offsetDateTime);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OffsetDateTime getStart_time() {
        return this.start_time;
    }

    public final EventDeleteV0InputRemovedEventsItemRecurrenceSpanRecurrenceSpanInstance copy(OffsetDateTime start_time) {
        start_time.getClass();
        return new EventDeleteV0InputRemovedEventsItemRecurrenceSpanRecurrenceSpanInstance(start_time);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EventDeleteV0InputRemovedEventsItemRecurrenceSpanRecurrenceSpanInstance) && x44.r(this.start_time, ((EventDeleteV0InputRemovedEventsItemRecurrenceSpanRecurrenceSpanInstance) other).start_time);
    }

    public final OffsetDateTime getStart_time() {
        return this.start_time;
    }

    public int hashCode() {
        return this.start_time.hashCode();
    }

    public String toString() {
        return "EventDeleteV0InputRemovedEventsItemRecurrenceSpanRecurrenceSpanInstance(start_time=" + this.start_time + ")";
    }

    public EventDeleteV0InputRemovedEventsItemRecurrenceSpanRecurrenceSpanInstance(OffsetDateTime offsetDateTime) {
        offsetDateTime.getClass();
        this.start_time = offsetDateTime;
    }
}
