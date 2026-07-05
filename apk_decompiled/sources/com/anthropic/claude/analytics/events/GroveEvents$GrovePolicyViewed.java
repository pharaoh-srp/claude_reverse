package com.anthropic.claude.analytics.events;

import defpackage.c97;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.rb8;
import defpackage.sb8;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001aR\u0014\u0010+\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u001f¨\u0006/"}, d2 = {"com/anthropic/claude/analytics/events/GroveEvents$GrovePolicyViewed", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "Lcom/anthropic/claude/analytics/events/GroveEvents$GroveLocation;", "location", "", "dismissable", "<init>", "(Lcom/anthropic/claude/analytics/events/GroveEvents$GroveLocation;Z)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/analytics/events/GroveEvents$GroveLocation;ZLvnf;)V", "Lcom/anthropic/claude/analytics/events/GroveEvents$GrovePolicyViewed;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/GroveEvents$GrovePolicyViewed;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/analytics/events/GroveEvents$GroveLocation;", "component2", "()Z", "copy", "(Lcom/anthropic/claude/analytics/events/GroveEvents$GroveLocation;Z)Lcom/anthropic/claude/analytics/events/GroveEvents$GrovePolicyViewed;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/analytics/events/GroveEvents$GroveLocation;", "getLocation", "Z", "getDismissable", "getEventName", "eventName", "Companion", "rb8", "sb8", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class GroveEvents$GrovePolicyViewed implements AnalyticsEvent {
    public static final int $stable = 0;
    private final boolean dismissable;
    private final GroveEvents$GroveLocation location;
    public static final sb8 Companion = new sb8();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new c97(24)), null};

    public /* synthetic */ GroveEvents$GrovePolicyViewed(int i, GroveEvents$GroveLocation groveEvents$GroveLocation, boolean z, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, rb8.a.getDescriptor());
            throw null;
        }
        this.location = groveEvents$GroveLocation;
        this.dismissable = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return GroveEvents$GroveLocation.Companion.serializer();
    }

    public static /* synthetic */ GroveEvents$GrovePolicyViewed copy$default(GroveEvents$GrovePolicyViewed groveEvents$GrovePolicyViewed, GroveEvents$GroveLocation groveEvents$GroveLocation, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            groveEvents$GroveLocation = groveEvents$GrovePolicyViewed.location;
        }
        if ((i & 2) != 0) {
            z = groveEvents$GrovePolicyViewed.dismissable;
        }
        return groveEvents$GrovePolicyViewed.copy(groveEvents$GroveLocation, z);
    }

    public static final /* synthetic */ void write$Self$analytics(GroveEvents$GrovePolicyViewed self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.location);
        output.p(serialDesc, 1, self.dismissable);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GroveEvents$GroveLocation getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getDismissable() {
        return this.dismissable;
    }

    public final GroveEvents$GrovePolicyViewed copy(GroveEvents$GroveLocation location, boolean dismissable) {
        location.getClass();
        return new GroveEvents$GrovePolicyViewed(location, dismissable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroveEvents$GrovePolicyViewed)) {
            return false;
        }
        GroveEvents$GrovePolicyViewed groveEvents$GrovePolicyViewed = (GroveEvents$GrovePolicyViewed) other;
        return this.location == groveEvents$GrovePolicyViewed.location && this.dismissable == groveEvents$GrovePolicyViewed.dismissable;
    }

    public final boolean getDismissable() {
        return this.dismissable;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "grove_policy_viewed";
    }

    public final GroveEvents$GroveLocation getLocation() {
        return this.location;
    }

    public int hashCode() {
        return Boolean.hashCode(this.dismissable) + (this.location.hashCode() * 31);
    }

    public String toString() {
        return "GrovePolicyViewed(location=" + this.location + ", dismissable=" + this.dismissable + ")";
    }

    public GroveEvents$GrovePolicyViewed(GroveEvents$GroveLocation groveEvents$GroveLocation, boolean z) {
        groveEvents$GroveLocation.getClass();
        this.location = groveEvents$GroveLocation;
        this.dismissable = z;
    }
}
