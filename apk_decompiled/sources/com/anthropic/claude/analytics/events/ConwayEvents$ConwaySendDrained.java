package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.onf;
import defpackage.qu4;
import defpackage.ru4;
import defpackage.vd4;
import defpackage.vnf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019R\u0014\u0010*\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u001e¨\u0006."}, d2 = {"com/anthropic/claude/analytics/events/ConwayEvents$ConwaySendDrained", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "count", "", "waited_ms", "<init>", "(IJ)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IIJLvnf;)V", "Lcom/anthropic/claude/analytics/events/ConwayEvents$ConwaySendDrained;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ConwayEvents$ConwaySendDrained;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()J", "copy", "(IJ)Lcom/anthropic/claude/analytics/events/ConwayEvents$ConwaySendDrained;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCount", "J", "getWaited_ms", "getEventName", "eventName", "Companion", "qu4", "ru4", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ConwayEvents$ConwaySendDrained implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final ru4 Companion = new ru4();
    private final int count;
    private final long waited_ms;

    public /* synthetic */ ConwayEvents$ConwaySendDrained(int i, int i2, long j, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, qu4.a.getDescriptor());
            throw null;
        }
        this.count = i2;
        this.waited_ms = j;
    }

    public static /* synthetic */ ConwayEvents$ConwaySendDrained copy$default(ConwayEvents$ConwaySendDrained conwayEvents$ConwaySendDrained, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = conwayEvents$ConwaySendDrained.count;
        }
        if ((i2 & 2) != 0) {
            j = conwayEvents$ConwaySendDrained.waited_ms;
        }
        return conwayEvents$ConwaySendDrained.copy(i, j);
    }

    public static final /* synthetic */ void write$Self$analytics(ConwayEvents$ConwaySendDrained self, vd4 output, SerialDescriptor serialDesc) {
        output.l(0, self.count, serialDesc);
        output.D(serialDesc, 1, self.waited_ms);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getWaited_ms() {
        return this.waited_ms;
    }

    public final ConwayEvents$ConwaySendDrained copy(int count, long waited_ms) {
        return new ConwayEvents$ConwaySendDrained(count, waited_ms);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConwayEvents$ConwaySendDrained)) {
            return false;
        }
        ConwayEvents$ConwaySendDrained conwayEvents$ConwaySendDrained = (ConwayEvents$ConwaySendDrained) other;
        return this.count == conwayEvents$ConwaySendDrained.count && this.waited_ms == conwayEvents$ConwaySendDrained.waited_ms;
    }

    public final int getCount() {
        return this.count;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "conway_send_drained";
    }

    public final long getWaited_ms() {
        return this.waited_ms;
    }

    public int hashCode() {
        return Long.hashCode(this.waited_ms) + (Integer.hashCode(this.count) * 31);
    }

    public String toString() {
        return "ConwaySendDrained(count=" + this.count + ", waited_ms=" + this.waited_ms + ")";
    }

    public ConwayEvents$ConwaySendDrained(int i, long j) {
        this.count = i;
        this.waited_ms = j;
    }
}
