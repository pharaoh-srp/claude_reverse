package com.anthropic.claude.models.organization.configtypes;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.nv6;
import defpackage.onf;
import defpackage.ov6;
import defpackage.pv6;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/EventCreateNewEventsItemNudgesArrayDescription;", "", "", "description", "Lcom/anthropic/claude/models/organization/configtypes/EventCreateNewEventsItemNudgesItemDescription;", "items", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/models/organization/configtypes/EventCreateNewEventsItemNudgesItemDescription;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/models/organization/configtypes/EventCreateNewEventsItemNudgesItemDescription;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/EventCreateNewEventsItemNudgesArrayDescription;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/models/organization/configtypes/EventCreateNewEventsItemNudgesItemDescription;", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/models/organization/configtypes/EventCreateNewEventsItemNudgesItemDescription;)Lcom/anthropic/claude/models/organization/configtypes/EventCreateNewEventsItemNudgesArrayDescription;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDescription", "Lcom/anthropic/claude/models/organization/configtypes/EventCreateNewEventsItemNudgesItemDescription;", "getItems", "Companion", "nv6", "ov6", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class EventCreateNewEventsItemNudgesArrayDescription {
    public static final int $stable = 0;
    public static final ov6 Companion = new ov6();
    private final String description;
    private final EventCreateNewEventsItemNudgesItemDescription items;

    public /* synthetic */ EventCreateNewEventsItemNudgesArrayDescription(int i, String str, EventCreateNewEventsItemNudgesItemDescription eventCreateNewEventsItemNudgesItemDescription, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, nv6.a.getDescriptor());
            throw null;
        }
        this.description = str;
        this.items = eventCreateNewEventsItemNudgesItemDescription;
    }

    public static /* synthetic */ EventCreateNewEventsItemNudgesArrayDescription copy$default(EventCreateNewEventsItemNudgesArrayDescription eventCreateNewEventsItemNudgesArrayDescription, String str, EventCreateNewEventsItemNudgesItemDescription eventCreateNewEventsItemNudgesItemDescription, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventCreateNewEventsItemNudgesArrayDescription.description;
        }
        if ((i & 2) != 0) {
            eventCreateNewEventsItemNudgesItemDescription = eventCreateNewEventsItemNudgesArrayDescription.items;
        }
        return eventCreateNewEventsItemNudgesArrayDescription.copy(str, eventCreateNewEventsItemNudgesItemDescription);
    }

    public static final /* synthetic */ void write$Self$models(EventCreateNewEventsItemNudgesArrayDescription self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.description);
        output.r(serialDesc, 1, pv6.a, self.items);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EventCreateNewEventsItemNudgesItemDescription getItems() {
        return this.items;
    }

    public final EventCreateNewEventsItemNudgesArrayDescription copy(String description, EventCreateNewEventsItemNudgesItemDescription items) {
        description.getClass();
        items.getClass();
        return new EventCreateNewEventsItemNudgesArrayDescription(description, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventCreateNewEventsItemNudgesArrayDescription)) {
            return false;
        }
        EventCreateNewEventsItemNudgesArrayDescription eventCreateNewEventsItemNudgesArrayDescription = (EventCreateNewEventsItemNudgesArrayDescription) other;
        return x44.r(this.description, eventCreateNewEventsItemNudgesArrayDescription.description) && x44.r(this.items, eventCreateNewEventsItemNudgesArrayDescription.items);
    }

    public final String getDescription() {
        return this.description;
    }

    public final EventCreateNewEventsItemNudgesItemDescription getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode() + (this.description.hashCode() * 31);
    }

    public String toString() {
        return "EventCreateNewEventsItemNudgesArrayDescription(description=" + this.description + ", items=" + this.items + ")";
    }

    public EventCreateNewEventsItemNudgesArrayDescription(String str, EventCreateNewEventsItemNudgesItemDescription eventCreateNewEventsItemNudgesItemDescription) {
        str.getClass();
        eventCreateNewEventsItemNudgesItemDescription.getClass();
        this.description = str;
        this.items = eventCreateNewEventsItemNudgesItemDescription;
    }
}
