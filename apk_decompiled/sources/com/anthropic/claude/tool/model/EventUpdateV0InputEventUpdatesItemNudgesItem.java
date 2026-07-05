package com.anthropic.claude.tool.model;

import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.r27;
import defpackage.s27;
import defpackage.u27;
import defpackage.vd4;
import defpackage.vnf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0018¨\u0006*"}, d2 = {"Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemNudgesItem;", "", "Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemNudgesItemMethod;", VerifyMagicLinkRequest.Credentials.DISCRIMINATOR, "", "minutes_before", "<init>", "(Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemNudgesItemMethod;I)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemNudgesItemMethod;ILvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemNudgesItem;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemNudgesItemMethod;", "component2", "()I", "copy", "(Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemNudgesItemMethod;I)Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemNudgesItem;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemNudgesItemMethod;", "getMethod", "I", "getMinutes_before", "Companion", "r27", "s27", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class EventUpdateV0InputEventUpdatesItemNudgesItem {
    public static final s27 Companion = new s27();
    private final EventUpdateV0InputEventUpdatesItemNudgesItemMethod method;
    private final int minutes_before;

    public /* synthetic */ EventUpdateV0InputEventUpdatesItemNudgesItem(int i, EventUpdateV0InputEventUpdatesItemNudgesItemMethod eventUpdateV0InputEventUpdatesItemNudgesItemMethod, int i2, vnf vnfVar) {
        if (2 != (i & 2)) {
            gvj.f(i, 2, r27.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.method = null;
        } else {
            this.method = eventUpdateV0InputEventUpdatesItemNudgesItemMethod;
        }
        this.minutes_before = i2;
    }

    public static /* synthetic */ EventUpdateV0InputEventUpdatesItemNudgesItem copy$default(EventUpdateV0InputEventUpdatesItemNudgesItem eventUpdateV0InputEventUpdatesItemNudgesItem, EventUpdateV0InputEventUpdatesItemNudgesItemMethod eventUpdateV0InputEventUpdatesItemNudgesItemMethod, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            eventUpdateV0InputEventUpdatesItemNudgesItemMethod = eventUpdateV0InputEventUpdatesItemNudgesItem.method;
        }
        if ((i2 & 2) != 0) {
            i = eventUpdateV0InputEventUpdatesItemNudgesItem.minutes_before;
        }
        return eventUpdateV0InputEventUpdatesItemNudgesItem.copy(eventUpdateV0InputEventUpdatesItemNudgesItemMethod, i);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(EventUpdateV0InputEventUpdatesItemNudgesItem self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.method != null) {
            output.B(serialDesc, 0, u27.d, self.method);
        }
        output.l(1, self.minutes_before, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EventUpdateV0InputEventUpdatesItemNudgesItemMethod getMethod() {
        return this.method;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMinutes_before() {
        return this.minutes_before;
    }

    public final EventUpdateV0InputEventUpdatesItemNudgesItem copy(EventUpdateV0InputEventUpdatesItemNudgesItemMethod method, int minutes_before) {
        return new EventUpdateV0InputEventUpdatesItemNudgesItem(method, minutes_before);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventUpdateV0InputEventUpdatesItemNudgesItem)) {
            return false;
        }
        EventUpdateV0InputEventUpdatesItemNudgesItem eventUpdateV0InputEventUpdatesItemNudgesItem = (EventUpdateV0InputEventUpdatesItemNudgesItem) other;
        return this.method == eventUpdateV0InputEventUpdatesItemNudgesItem.method && this.minutes_before == eventUpdateV0InputEventUpdatesItemNudgesItem.minutes_before;
    }

    public final EventUpdateV0InputEventUpdatesItemNudgesItemMethod getMethod() {
        return this.method;
    }

    public final int getMinutes_before() {
        return this.minutes_before;
    }

    public int hashCode() {
        EventUpdateV0InputEventUpdatesItemNudgesItemMethod eventUpdateV0InputEventUpdatesItemNudgesItemMethod = this.method;
        return Integer.hashCode(this.minutes_before) + ((eventUpdateV0InputEventUpdatesItemNudgesItemMethod == null ? 0 : eventUpdateV0InputEventUpdatesItemNudgesItemMethod.hashCode()) * 31);
    }

    public String toString() {
        return "EventUpdateV0InputEventUpdatesItemNudgesItem(method=" + this.method + ", minutes_before=" + this.minutes_before + ")";
    }

    public EventUpdateV0InputEventUpdatesItemNudgesItem(EventUpdateV0InputEventUpdatesItemNudgesItemMethod eventUpdateV0InputEventUpdatesItemNudgesItemMethod, int i) {
        this.method = eventUpdateV0InputEventUpdatesItemNudgesItemMethod;
        this.minutes_before = i;
    }

    public /* synthetic */ EventUpdateV0InputEventUpdatesItemNudgesItem(EventUpdateV0InputEventUpdatesItemNudgesItemMethod eventUpdateV0InputEventUpdatesItemNudgesItemMethod, int i, int i2, mq5 mq5Var) {
        this((i2 & 1) != 0 ? null : eventUpdateV0InputEventUpdatesItemNudgesItemMethod, i);
    }
}
