package com.anthropic.claude.analytics.events;

import defpackage.acc;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.zbc;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB;\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ8\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0019J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001dR\u0014\u00100\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\"¨\u00064"}, d2 = {"com/anthropic/claude/analytics/events/OfflineEvents$PrefetchCompleted", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "conversations_synced", "conversations_needing_sync", "recent_count", "", "duration_ms", "<init>", "(IIIJ)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IIIIJLvnf;)V", "Lcom/anthropic/claude/analytics/events/OfflineEvents$PrefetchCompleted;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/OfflineEvents$PrefetchCompleted;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "component3", "component4", "()J", "copy", "(IIIJ)Lcom/anthropic/claude/analytics/events/OfflineEvents$PrefetchCompleted;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getConversations_synced", "getConversations_needing_sync", "getRecent_count", "J", "getDuration_ms", "getEventName", "eventName", "Companion", "zbc", "acc", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class OfflineEvents$PrefetchCompleted implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final acc Companion = new acc();
    private final int conversations_needing_sync;
    private final int conversations_synced;
    private final long duration_ms;
    private final int recent_count;

    public /* synthetic */ OfflineEvents$PrefetchCompleted(int i, int i2, int i3, int i4, long j, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, zbc.a.getDescriptor());
            throw null;
        }
        this.conversations_synced = i2;
        this.conversations_needing_sync = i3;
        this.recent_count = i4;
        this.duration_ms = j;
    }

    public static /* synthetic */ OfflineEvents$PrefetchCompleted copy$default(OfflineEvents$PrefetchCompleted offlineEvents$PrefetchCompleted, int i, int i2, int i3, long j, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = offlineEvents$PrefetchCompleted.conversations_synced;
        }
        if ((i4 & 2) != 0) {
            i2 = offlineEvents$PrefetchCompleted.conversations_needing_sync;
        }
        if ((i4 & 4) != 0) {
            i3 = offlineEvents$PrefetchCompleted.recent_count;
        }
        if ((i4 & 8) != 0) {
            j = offlineEvents$PrefetchCompleted.duration_ms;
        }
        int i5 = i3;
        return offlineEvents$PrefetchCompleted.copy(i, i2, i5, j);
    }

    public static final /* synthetic */ void write$Self$analytics(OfflineEvents$PrefetchCompleted self, vd4 output, SerialDescriptor serialDesc) {
        output.l(0, self.conversations_synced, serialDesc);
        output.l(1, self.conversations_needing_sync, serialDesc);
        output.l(2, self.recent_count, serialDesc);
        output.D(serialDesc, 3, self.duration_ms);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getConversations_synced() {
        return this.conversations_synced;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getConversations_needing_sync() {
        return this.conversations_needing_sync;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRecent_count() {
        return this.recent_count;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getDuration_ms() {
        return this.duration_ms;
    }

    public final OfflineEvents$PrefetchCompleted copy(int conversations_synced, int conversations_needing_sync, int recent_count, long duration_ms) {
        return new OfflineEvents$PrefetchCompleted(conversations_synced, conversations_needing_sync, recent_count, duration_ms);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfflineEvents$PrefetchCompleted)) {
            return false;
        }
        OfflineEvents$PrefetchCompleted offlineEvents$PrefetchCompleted = (OfflineEvents$PrefetchCompleted) other;
        return this.conversations_synced == offlineEvents$PrefetchCompleted.conversations_synced && this.conversations_needing_sync == offlineEvents$PrefetchCompleted.conversations_needing_sync && this.recent_count == offlineEvents$PrefetchCompleted.recent_count && this.duration_ms == offlineEvents$PrefetchCompleted.duration_ms;
    }

    public final int getConversations_needing_sync() {
        return this.conversations_needing_sync;
    }

    public final int getConversations_synced() {
        return this.conversations_synced;
    }

    public final long getDuration_ms() {
        return this.duration_ms;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.offline.prefetch.completed";
    }

    public final int getRecent_count() {
        return this.recent_count;
    }

    public int hashCode() {
        return Long.hashCode(this.duration_ms) + vb7.c(this.recent_count, vb7.c(this.conversations_needing_sync, Integer.hashCode(this.conversations_synced) * 31, 31), 31);
    }

    public String toString() {
        int i = this.conversations_synced;
        int i2 = this.conversations_needing_sync;
        int i3 = this.recent_count;
        long j = this.duration_ms;
        StringBuilder sbV = vb7.v("PrefetchCompleted(conversations_synced=", ", conversations_needing_sync=", i, i2, ", recent_count=");
        sbV.append(i3);
        sbV.append(", duration_ms=");
        sbV.append(j);
        sbV.append(")");
        return sbV.toString();
    }

    public OfflineEvents$PrefetchCompleted(int i, int i2, int i3, long j) {
        this.conversations_synced = i;
        this.conversations_needing_sync = i2;
        this.recent_count = i3;
        this.duration_ms = j;
    }
}
