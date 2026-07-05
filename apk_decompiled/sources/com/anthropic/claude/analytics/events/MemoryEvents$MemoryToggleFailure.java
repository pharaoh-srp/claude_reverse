package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.hbb;
import defpackage.ibb;
import defpackage.mdj;
import defpackage.onf;
import defpackage.qy1;
import defpackage.vnf;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0014\u0010%\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001b¨\u0006)"}, d2 = {"com/anthropic/claude/analytics/events/MemoryEvents$MemoryToggleFailure", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "reset", "<init>", "(Z)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IZLvnf;)V", "Lcom/anthropic/claude/analytics/events/MemoryEvents$MemoryToggleFailure;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/MemoryEvents$MemoryToggleFailure;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "copy", "(Z)Lcom/anthropic/claude/analytics/events/MemoryEvents$MemoryToggleFailure;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getReset", "getEventName", "eventName", "Companion", "hbb", "ibb", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MemoryEvents$MemoryToggleFailure implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final ibb Companion = new ibb();
    private final boolean reset;

    public /* synthetic */ MemoryEvents$MemoryToggleFailure(int i, boolean z, vnf vnfVar) {
        if (1 == (i & 1)) {
            this.reset = z;
        } else {
            gvj.f(i, 1, hbb.a.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ MemoryEvents$MemoryToggleFailure copy$default(MemoryEvents$MemoryToggleFailure memoryEvents$MemoryToggleFailure, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = memoryEvents$MemoryToggleFailure.reset;
        }
        return memoryEvents$MemoryToggleFailure.copy(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getReset() {
        return this.reset;
    }

    public final MemoryEvents$MemoryToggleFailure copy(boolean reset) {
        return new MemoryEvents$MemoryToggleFailure(reset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MemoryEvents$MemoryToggleFailure) && this.reset == ((MemoryEvents$MemoryToggleFailure) other).reset;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "memory_toggle_failure";
    }

    public final boolean getReset() {
        return this.reset;
    }

    public int hashCode() {
        return Boolean.hashCode(this.reset);
    }

    public String toString() {
        return qy1.g("MemoryToggleFailure(reset=", ")", this.reset);
    }

    public MemoryEvents$MemoryToggleFailure(boolean z) {
        this.reset = z;
    }
}
