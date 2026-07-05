package com.anthropic.claude.analytics.events;

import defpackage.bf6;
import defpackage.cf6;
import defpackage.grc;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vnf;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\tJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015R\u0014\u0010$\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001a¨\u0006("}, d2 = {"com/anthropic/claude/analytics/events/DrawerEvents$DrawerMoreExpanded", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "hidden_count", "<init>", "(I)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IILvnf;)V", "Lcom/anthropic/claude/analytics/events/DrawerEvents$DrawerMoreExpanded;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/DrawerEvents$DrawerMoreExpanded;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "copy", "(I)Lcom/anthropic/claude/analytics/events/DrawerEvents$DrawerMoreExpanded;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getHidden_count", "getEventName", "eventName", "Companion", "bf6", "cf6", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class DrawerEvents$DrawerMoreExpanded implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final cf6 Companion = new cf6();
    private final int hidden_count;

    public /* synthetic */ DrawerEvents$DrawerMoreExpanded(int i, int i2, vnf vnfVar) {
        if (1 == (i & 1)) {
            this.hidden_count = i2;
        } else {
            gvj.f(i, 1, bf6.a.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ DrawerEvents$DrawerMoreExpanded copy$default(DrawerEvents$DrawerMoreExpanded drawerEvents$DrawerMoreExpanded, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = drawerEvents$DrawerMoreExpanded.hidden_count;
        }
        return drawerEvents$DrawerMoreExpanded.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getHidden_count() {
        return this.hidden_count;
    }

    public final DrawerEvents$DrawerMoreExpanded copy(int hidden_count) {
        return new DrawerEvents$DrawerMoreExpanded(hidden_count);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DrawerEvents$DrawerMoreExpanded) && this.hidden_count == ((DrawerEvents$DrawerMoreExpanded) other).hidden_count;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_drawer_more_expanded";
    }

    public final int getHidden_count() {
        return this.hidden_count;
    }

    public int hashCode() {
        return Integer.hashCode(this.hidden_count);
    }

    public String toString() {
        return grc.u("DrawerMoreExpanded(hidden_count=", this.hidden_count, ")");
    }

    public DrawerEvents$DrawerMoreExpanded(int i) {
        this.hidden_count = i;
    }
}
