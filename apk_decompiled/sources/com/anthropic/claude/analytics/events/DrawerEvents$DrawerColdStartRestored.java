package com.anthropic.claude.analytics.events;

import defpackage.fc6;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.se6;
import defpackage.te6;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.yb5;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0014\u0010&\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001b¨\u0006*"}, d2 = {"com/anthropic/claude/analytics/events/DrawerEvents$DrawerColdStartRestored", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "Lcom/anthropic/claude/analytics/events/DrawerEvents$DrawerItem;", "item", "<init>", "(Lcom/anthropic/claude/analytics/events/DrawerEvents$DrawerItem;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/analytics/events/DrawerEvents$DrawerItem;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/DrawerEvents$DrawerColdStartRestored;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/DrawerEvents$DrawerColdStartRestored;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/analytics/events/DrawerEvents$DrawerItem;", "copy", "(Lcom/anthropic/claude/analytics/events/DrawerEvents$DrawerItem;)Lcom/anthropic/claude/analytics/events/DrawerEvents$DrawerColdStartRestored;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/analytics/events/DrawerEvents$DrawerItem;", "getItem", "getEventName", "eventName", "Companion", "se6", "te6", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class DrawerEvents$DrawerColdStartRestored implements AnalyticsEvent {
    public static final int $stable = 0;
    private final DrawerEvents$DrawerItem item;
    public static final te6 Companion = new te6();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new fc6(8))};

    public /* synthetic */ DrawerEvents$DrawerColdStartRestored(int i, DrawerEvents$DrawerItem drawerEvents$DrawerItem, vnf vnfVar) {
        if (1 == (i & 1)) {
            this.item = drawerEvents$DrawerItem;
        } else {
            gvj.f(i, 1, se6.a.getDescriptor());
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return DrawerEvents$DrawerItem.Companion.serializer();
    }

    public static /* synthetic */ DrawerEvents$DrawerColdStartRestored copy$default(DrawerEvents$DrawerColdStartRestored drawerEvents$DrawerColdStartRestored, DrawerEvents$DrawerItem drawerEvents$DrawerItem, int i, Object obj) {
        if ((i & 1) != 0) {
            drawerEvents$DrawerItem = drawerEvents$DrawerColdStartRestored.item;
        }
        return drawerEvents$DrawerColdStartRestored.copy(drawerEvents$DrawerItem);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DrawerEvents$DrawerItem getItem() {
        return this.item;
    }

    public final DrawerEvents$DrawerColdStartRestored copy(DrawerEvents$DrawerItem item) {
        item.getClass();
        return new DrawerEvents$DrawerColdStartRestored(item);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DrawerEvents$DrawerColdStartRestored) && this.item == ((DrawerEvents$DrawerColdStartRestored) other).item;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_drawer_cold_start_restored";
    }

    public final DrawerEvents$DrawerItem getItem() {
        return this.item;
    }

    public int hashCode() {
        return this.item.hashCode();
    }

    public String toString() {
        return "DrawerColdStartRestored(item=" + this.item + ")";
    }

    public DrawerEvents$DrawerColdStartRestored(DrawerEvents$DrawerItem drawerEvents$DrawerItem) {
        drawerEvents$DrawerItem.getClass();
        this.item = drawerEvents$DrawerItem;
    }
}
