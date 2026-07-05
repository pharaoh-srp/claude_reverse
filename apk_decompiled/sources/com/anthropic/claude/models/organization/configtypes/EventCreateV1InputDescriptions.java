package com.anthropic.claude.models.organization.configtypes;

import defpackage.gvj;
import defpackage.jv6;
import defpackage.mdj;
import defpackage.onf;
import defpackage.qw6;
import defpackage.rw6;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/EventCreateV1InputDescriptions;", "", "", "tool_description", "Lcom/anthropic/claude/models/organization/configtypes/EventCreateNewEventsArrayDescription;", "new_events", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/models/organization/configtypes/EventCreateNewEventsArrayDescription;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/models/organization/configtypes/EventCreateNewEventsArrayDescription;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/EventCreateV1InputDescriptions;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/models/organization/configtypes/EventCreateNewEventsArrayDescription;", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/models/organization/configtypes/EventCreateNewEventsArrayDescription;)Lcom/anthropic/claude/models/organization/configtypes/EventCreateV1InputDescriptions;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTool_description", "Lcom/anthropic/claude/models/organization/configtypes/EventCreateNewEventsArrayDescription;", "getNew_events", "Companion", "qw6", "rw6", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class EventCreateV1InputDescriptions {
    public static final int $stable = 0;
    public static final rw6 Companion = new rw6();
    private final EventCreateNewEventsArrayDescription new_events;
    private final String tool_description;

    public /* synthetic */ EventCreateV1InputDescriptions(int i, String str, EventCreateNewEventsArrayDescription eventCreateNewEventsArrayDescription, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, qw6.a.getDescriptor());
            throw null;
        }
        this.tool_description = str;
        this.new_events = eventCreateNewEventsArrayDescription;
    }

    public static /* synthetic */ EventCreateV1InputDescriptions copy$default(EventCreateV1InputDescriptions eventCreateV1InputDescriptions, String str, EventCreateNewEventsArrayDescription eventCreateNewEventsArrayDescription, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventCreateV1InputDescriptions.tool_description;
        }
        if ((i & 2) != 0) {
            eventCreateNewEventsArrayDescription = eventCreateV1InputDescriptions.new_events;
        }
        return eventCreateV1InputDescriptions.copy(str, eventCreateNewEventsArrayDescription);
    }

    public static final /* synthetic */ void write$Self$models(EventCreateV1InputDescriptions self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.tool_description);
        output.r(serialDesc, 1, jv6.a, self.new_events);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTool_description() {
        return this.tool_description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EventCreateNewEventsArrayDescription getNew_events() {
        return this.new_events;
    }

    public final EventCreateV1InputDescriptions copy(String tool_description, EventCreateNewEventsArrayDescription new_events) {
        tool_description.getClass();
        new_events.getClass();
        return new EventCreateV1InputDescriptions(tool_description, new_events);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventCreateV1InputDescriptions)) {
            return false;
        }
        EventCreateV1InputDescriptions eventCreateV1InputDescriptions = (EventCreateV1InputDescriptions) other;
        return x44.r(this.tool_description, eventCreateV1InputDescriptions.tool_description) && x44.r(this.new_events, eventCreateV1InputDescriptions.new_events);
    }

    public final EventCreateNewEventsArrayDescription getNew_events() {
        return this.new_events;
    }

    public final String getTool_description() {
        return this.tool_description;
    }

    public int hashCode() {
        return this.new_events.hashCode() + (this.tool_description.hashCode() * 31);
    }

    public String toString() {
        return "EventCreateV1InputDescriptions(tool_description=" + this.tool_description + ", new_events=" + this.new_events + ")";
    }

    public EventCreateV1InputDescriptions(String str, EventCreateNewEventsArrayDescription eventCreateNewEventsArrayDescription) {
        str.getClass();
        eventCreateNewEventsArrayDescription.getClass();
        this.tool_description = str;
        this.new_events = eventCreateNewEventsArrayDescription;
    }
}
