package com.anthropic.claude.analytics.events;

import defpackage.c97;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.pb8;
import defpackage.qb8;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001aR\u0014\u0010+\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u001f¨\u0006/"}, d2 = {"com/anthropic/claude/analytics/events/GroveEvents$GrovePolicyToggled", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "state", "Lcom/anthropic/claude/analytics/events/GroveEvents$GroveLocation;", "location", "<init>", "(ZLcom/anthropic/claude/analytics/events/GroveEvents$GroveLocation;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IZLcom/anthropic/claude/analytics/events/GroveEvents$GroveLocation;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/GroveEvents$GrovePolicyToggled;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/GroveEvents$GrovePolicyToggled;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "()Lcom/anthropic/claude/analytics/events/GroveEvents$GroveLocation;", "copy", "(ZLcom/anthropic/claude/analytics/events/GroveEvents$GroveLocation;)Lcom/anthropic/claude/analytics/events/GroveEvents$GrovePolicyToggled;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getState", "Lcom/anthropic/claude/analytics/events/GroveEvents$GroveLocation;", "getLocation", "getEventName", "eventName", "Companion", "pb8", "qb8", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class GroveEvents$GrovePolicyToggled implements AnalyticsEvent {
    public static final int $stable = 0;
    private final GroveEvents$GroveLocation location;
    private final boolean state;
    public static final qb8 Companion = new qb8();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new c97(23))};

    public /* synthetic */ GroveEvents$GrovePolicyToggled(int i, boolean z, GroveEvents$GroveLocation groveEvents$GroveLocation, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, pb8.a.getDescriptor());
            throw null;
        }
        this.state = z;
        this.location = groveEvents$GroveLocation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return GroveEvents$GroveLocation.Companion.serializer();
    }

    public static /* synthetic */ GroveEvents$GrovePolicyToggled copy$default(GroveEvents$GrovePolicyToggled groveEvents$GrovePolicyToggled, boolean z, GroveEvents$GroveLocation groveEvents$GroveLocation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = groveEvents$GrovePolicyToggled.state;
        }
        if ((i & 2) != 0) {
            groveEvents$GroveLocation = groveEvents$GrovePolicyToggled.location;
        }
        return groveEvents$GrovePolicyToggled.copy(z, groveEvents$GroveLocation);
    }

    public static final /* synthetic */ void write$Self$analytics(GroveEvents$GrovePolicyToggled self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.p(serialDesc, 0, self.state);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.location);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final GroveEvents$GroveLocation getLocation() {
        return this.location;
    }

    public final GroveEvents$GrovePolicyToggled copy(boolean state, GroveEvents$GroveLocation location) {
        location.getClass();
        return new GroveEvents$GrovePolicyToggled(state, location);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroveEvents$GrovePolicyToggled)) {
            return false;
        }
        GroveEvents$GrovePolicyToggled groveEvents$GrovePolicyToggled = (GroveEvents$GrovePolicyToggled) other;
        return this.state == groveEvents$GrovePolicyToggled.state && this.location == groveEvents$GrovePolicyToggled.location;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "grove_policy_toggled";
    }

    public final GroveEvents$GroveLocation getLocation() {
        return this.location;
    }

    public final boolean getState() {
        return this.state;
    }

    public int hashCode() {
        return this.location.hashCode() + (Boolean.hashCode(this.state) * 31);
    }

    public String toString() {
        return "GrovePolicyToggled(state=" + this.state + ", location=" + this.location + ")";
    }

    public GroveEvents$GrovePolicyToggled(boolean z, GroveEvents$GroveLocation groveEvents$GroveLocation) {
        groveEvents$GroveLocation.getClass();
        this.state = z;
        this.location = groveEvents$GroveLocation;
    }
}
