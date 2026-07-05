package com.anthropic.claude.tool.model;

import defpackage.e79;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.iw6;
import defpackage.jw6;
import defpackage.lw6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ2\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u001c¨\u0006/"}, d2 = {"Lcom/anthropic/claude/tool/model/EventCreateV0InputRecurrenceEnd;", "", "", "count", "Lcom/anthropic/claude/tool/model/EventCreateV0InputRecurrenceEndType;", "type", "", "until", "<init>", "(Ljava/lang/Integer;Lcom/anthropic/claude/tool/model/EventCreateV0InputRecurrenceEndType;Ljava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Integer;Lcom/anthropic/claude/tool/model/EventCreateV0InputRecurrenceEndType;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/EventCreateV0InputRecurrenceEnd;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "()Lcom/anthropic/claude/tool/model/EventCreateV0InputRecurrenceEndType;", "component3", "()Ljava/lang/String;", "copy", "(Ljava/lang/Integer;Lcom/anthropic/claude/tool/model/EventCreateV0InputRecurrenceEndType;Ljava/lang/String;)Lcom/anthropic/claude/tool/model/EventCreateV0InputRecurrenceEnd;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getCount", "Lcom/anthropic/claude/tool/model/EventCreateV0InputRecurrenceEndType;", "getType", "Ljava/lang/String;", "getUntil", "Companion", "iw6", "jw6", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class EventCreateV0InputRecurrenceEnd {
    public static final jw6 Companion = new jw6();
    private final Integer count;
    private final EventCreateV0InputRecurrenceEndType type;
    private final String until;

    public /* synthetic */ EventCreateV0InputRecurrenceEnd(int i, Integer num, EventCreateV0InputRecurrenceEndType eventCreateV0InputRecurrenceEndType, String str, vnf vnfVar) {
        if (2 != (i & 2)) {
            gvj.f(i, 2, iw6.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.count = null;
        } else {
            this.count = num;
        }
        this.type = eventCreateV0InputRecurrenceEndType;
        if ((i & 4) == 0) {
            this.until = null;
        } else {
            this.until = str;
        }
    }

    public static /* synthetic */ EventCreateV0InputRecurrenceEnd copy$default(EventCreateV0InputRecurrenceEnd eventCreateV0InputRecurrenceEnd, Integer num, EventCreateV0InputRecurrenceEndType eventCreateV0InputRecurrenceEndType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = eventCreateV0InputRecurrenceEnd.count;
        }
        if ((i & 2) != 0) {
            eventCreateV0InputRecurrenceEndType = eventCreateV0InputRecurrenceEnd.type;
        }
        if ((i & 4) != 0) {
            str = eventCreateV0InputRecurrenceEnd.until;
        }
        return eventCreateV0InputRecurrenceEnd.copy(num, eventCreateV0InputRecurrenceEndType, str);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(EventCreateV0InputRecurrenceEnd self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.count != null) {
            output.B(serialDesc, 0, e79.a, self.count);
        }
        output.r(serialDesc, 1, lw6.d, self.type);
        if (!output.E(serialDesc) && self.until == null) {
            return;
        }
        output.B(serialDesc, 2, srg.a, self.until);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EventCreateV0InputRecurrenceEndType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUntil() {
        return this.until;
    }

    public final EventCreateV0InputRecurrenceEnd copy(Integer count, EventCreateV0InputRecurrenceEndType type, String until) {
        type.getClass();
        return new EventCreateV0InputRecurrenceEnd(count, type, until);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventCreateV0InputRecurrenceEnd)) {
            return false;
        }
        EventCreateV0InputRecurrenceEnd eventCreateV0InputRecurrenceEnd = (EventCreateV0InputRecurrenceEnd) other;
        return x44.r(this.count, eventCreateV0InputRecurrenceEnd.count) && this.type == eventCreateV0InputRecurrenceEnd.type && x44.r(this.until, eventCreateV0InputRecurrenceEnd.until);
    }

    public final Integer getCount() {
        return this.count;
    }

    public final EventCreateV0InputRecurrenceEndType getType() {
        return this.type;
    }

    public final String getUntil() {
        return this.until;
    }

    public int hashCode() {
        Integer num = this.count;
        int iHashCode = (this.type.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31;
        String str = this.until;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.count;
        EventCreateV0InputRecurrenceEndType eventCreateV0InputRecurrenceEndType = this.type;
        String str = this.until;
        StringBuilder sb = new StringBuilder("EventCreateV0InputRecurrenceEnd(count=");
        sb.append(num);
        sb.append(", type=");
        sb.append(eventCreateV0InputRecurrenceEndType);
        sb.append(", until=");
        return ij0.m(sb, str, ")");
    }

    public EventCreateV0InputRecurrenceEnd(Integer num, EventCreateV0InputRecurrenceEndType eventCreateV0InputRecurrenceEndType, String str) {
        eventCreateV0InputRecurrenceEndType.getClass();
        this.count = num;
        this.type = eventCreateV0InputRecurrenceEndType;
        this.until = str;
    }

    public /* synthetic */ EventCreateV0InputRecurrenceEnd(Integer num, EventCreateV0InputRecurrenceEndType eventCreateV0InputRecurrenceEndType, String str, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : num, eventCreateV0InputRecurrenceEndType, (i & 4) != 0 ? null : str);
    }
}
