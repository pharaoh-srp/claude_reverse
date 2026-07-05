package com.anthropic.claude.analytics.events;

import defpackage.ao2;
import defpackage.e79;
import defpackage.fq2;
import defpackage.gq2;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019R\u0014\u0010*\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u001e¨\u0006."}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$RecentPhotosStripAttached", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "count", "", "positions", "<init>", "(ILjava/util/List;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IILjava/util/List;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ChatEvents$RecentPhotosStripAttached;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatEvents$RecentPhotosStripAttached;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/util/List;", "copy", "(ILjava/util/List;)Lcom/anthropic/claude/analytics/events/ChatEvents$RecentPhotosStripAttached;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCount", "Ljava/util/List;", "getPositions", "getEventName", "eventName", "Companion", "fq2", "gq2", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatEvents$RecentPhotosStripAttached implements AnalyticsEvent {
    public static final int $stable = 8;
    private final int count;
    private final List<Integer> positions;
    public static final gq2 Companion = new gq2();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new ao2(24))};

    public /* synthetic */ ChatEvents$RecentPhotosStripAttached(int i, int i2, List list, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, fq2.a.getDescriptor());
            throw null;
        }
        this.count = i2;
        this.positions = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(e79.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatEvents$RecentPhotosStripAttached copy$default(ChatEvents$RecentPhotosStripAttached chatEvents$RecentPhotosStripAttached, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = chatEvents$RecentPhotosStripAttached.count;
        }
        if ((i2 & 2) != 0) {
            list = chatEvents$RecentPhotosStripAttached.positions;
        }
        return chatEvents$RecentPhotosStripAttached.copy(i, list);
    }

    public static final /* synthetic */ void write$Self$analytics(ChatEvents$RecentPhotosStripAttached self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.l(0, self.count, serialDesc);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.positions);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    public final List<Integer> component2() {
        return this.positions;
    }

    public final ChatEvents$RecentPhotosStripAttached copy(int count, List<Integer> positions) {
        positions.getClass();
        return new ChatEvents$RecentPhotosStripAttached(count, positions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatEvents$RecentPhotosStripAttached)) {
            return false;
        }
        ChatEvents$RecentPhotosStripAttached chatEvents$RecentPhotosStripAttached = (ChatEvents$RecentPhotosStripAttached) other;
        return this.count == chatEvents$RecentPhotosStripAttached.count && x44.r(this.positions, chatEvents$RecentPhotosStripAttached.positions);
    }

    public final int getCount() {
        return this.count;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_recent_photos_strip_attached";
    }

    public final List<Integer> getPositions() {
        return this.positions;
    }

    public int hashCode() {
        return this.positions.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public String toString() {
        return "RecentPhotosStripAttached(count=" + this.count + ", positions=" + this.positions + ")";
    }

    public ChatEvents$RecentPhotosStripAttached(int i, List<Integer> list) {
        list.getClass();
        this.count = i;
        this.positions = list;
    }
}
