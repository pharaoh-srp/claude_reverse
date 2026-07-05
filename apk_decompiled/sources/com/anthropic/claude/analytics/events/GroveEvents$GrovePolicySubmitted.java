package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.nb8;
import defpackage.ob8;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J$\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0017R\u0014\u0010(\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u001d¨\u0006,"}, d2 = {"com/anthropic/claude/analytics/events/GroveEvents$GrovePolicySubmitted", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "state", "dismissable", "<init>", "(ZZ)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IZZLvnf;)V", "Lcom/anthropic/claude/analytics/events/GroveEvents$GrovePolicySubmitted;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/GroveEvents$GrovePolicySubmitted;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/anthropic/claude/analytics/events/GroveEvents$GrovePolicySubmitted;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getState", "getDismissable", "getEventName", "eventName", "Companion", "nb8", "ob8", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class GroveEvents$GrovePolicySubmitted implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final ob8 Companion = new ob8();
    private final boolean dismissable;
    private final boolean state;

    public /* synthetic */ GroveEvents$GrovePolicySubmitted(int i, boolean z, boolean z2, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, nb8.a.getDescriptor());
            throw null;
        }
        this.state = z;
        this.dismissable = z2;
    }

    public static /* synthetic */ GroveEvents$GrovePolicySubmitted copy$default(GroveEvents$GrovePolicySubmitted groveEvents$GrovePolicySubmitted, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = groveEvents$GrovePolicySubmitted.state;
        }
        if ((i & 2) != 0) {
            z2 = groveEvents$GrovePolicySubmitted.dismissable;
        }
        return groveEvents$GrovePolicySubmitted.copy(z, z2);
    }

    public static final /* synthetic */ void write$Self$analytics(GroveEvents$GrovePolicySubmitted self, vd4 output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.state);
        output.p(serialDesc, 1, self.dismissable);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getDismissable() {
        return this.dismissable;
    }

    public final GroveEvents$GrovePolicySubmitted copy(boolean state, boolean dismissable) {
        return new GroveEvents$GrovePolicySubmitted(state, dismissable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroveEvents$GrovePolicySubmitted)) {
            return false;
        }
        GroveEvents$GrovePolicySubmitted groveEvents$GrovePolicySubmitted = (GroveEvents$GrovePolicySubmitted) other;
        return this.state == groveEvents$GrovePolicySubmitted.state && this.dismissable == groveEvents$GrovePolicySubmitted.dismissable;
    }

    public final boolean getDismissable() {
        return this.dismissable;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "grove_policy_submitted";
    }

    public final boolean getState() {
        return this.state;
    }

    public int hashCode() {
        return Boolean.hashCode(this.dismissable) + (Boolean.hashCode(this.state) * 31);
    }

    public String toString() {
        return "GrovePolicySubmitted(state=" + this.state + ", dismissable=" + this.dismissable + ")";
    }

    public GroveEvents$GrovePolicySubmitted(boolean z, boolean z2) {
        this.state = z;
        this.dismissable = z2;
    }
}
