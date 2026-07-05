package com.anthropic.claude.tool.model;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.n27;
import defpackage.onf;
import defpackage.t17;
import defpackage.u17;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Lcom/anthropic/claude/tool/model/EventUpdateDetails;", "", "", "currentEventTitle", "Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItem;", "updateData", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItem;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItem;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$tool", "(Lcom/anthropic/claude/tool/model/EventUpdateDetails;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItem;", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItem;)Lcom/anthropic/claude/tool/model/EventUpdateDetails;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCurrentEventTitle", "Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItem;", "getUpdateData", "Companion", "t17", "u17", "tool"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class EventUpdateDetails {
    public static final int $stable = 0;
    public static final u17 Companion = new u17();
    private final String currentEventTitle;
    private final EventUpdateV0InputEventUpdatesItem updateData;

    public /* synthetic */ EventUpdateDetails(int i, String str, EventUpdateV0InputEventUpdatesItem eventUpdateV0InputEventUpdatesItem, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, t17.a.getDescriptor());
            throw null;
        }
        this.currentEventTitle = str;
        this.updateData = eventUpdateV0InputEventUpdatesItem;
    }

    public static /* synthetic */ EventUpdateDetails copy$default(EventUpdateDetails eventUpdateDetails, String str, EventUpdateV0InputEventUpdatesItem eventUpdateV0InputEventUpdatesItem, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventUpdateDetails.currentEventTitle;
        }
        if ((i & 2) != 0) {
            eventUpdateV0InputEventUpdatesItem = eventUpdateDetails.updateData;
        }
        return eventUpdateDetails.copy(str, eventUpdateV0InputEventUpdatesItem);
    }

    public static final /* synthetic */ void write$Self$tool(EventUpdateDetails self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.currentEventTitle);
        output.r(serialDesc, 1, n27.a, self.updateData);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrentEventTitle() {
        return this.currentEventTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EventUpdateV0InputEventUpdatesItem getUpdateData() {
        return this.updateData;
    }

    public final EventUpdateDetails copy(String currentEventTitle, EventUpdateV0InputEventUpdatesItem updateData) {
        currentEventTitle.getClass();
        updateData.getClass();
        return new EventUpdateDetails(currentEventTitle, updateData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventUpdateDetails)) {
            return false;
        }
        EventUpdateDetails eventUpdateDetails = (EventUpdateDetails) other;
        return x44.r(this.currentEventTitle, eventUpdateDetails.currentEventTitle) && x44.r(this.updateData, eventUpdateDetails.updateData);
    }

    public final String getCurrentEventTitle() {
        return this.currentEventTitle;
    }

    public final EventUpdateV0InputEventUpdatesItem getUpdateData() {
        return this.updateData;
    }

    public int hashCode() {
        return this.updateData.hashCode() + (this.currentEventTitle.hashCode() * 31);
    }

    public String toString() {
        return "EventUpdateDetails(currentEventTitle=" + this.currentEventTitle + ", updateData=" + this.updateData + ")";
    }

    public EventUpdateDetails(String str, EventUpdateV0InputEventUpdatesItem eventUpdateV0InputEventUpdatesItem) {
        str.getClass();
        eventUpdateV0InputEventUpdatesItem.getClass();
        this.currentEventTitle = str;
        this.updateData = eventUpdateV0InputEventUpdatesItem;
    }
}
