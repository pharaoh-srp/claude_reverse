package com.anthropic.claude.analytics.events;

import defpackage.fc6;
import defpackage.gvj;
import defpackage.if6;
import defpackage.jf6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b\u0005\u0010\u001aR\u0014\u0010*\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u001f¨\u0006."}, d2 = {"com/anthropic/claude/analytics/events/DrawerEvents$DrawerTabVisibilityToggled", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "Lcom/anthropic/claude/analytics/events/DrawerEvents$DrawerItem;", "item", "", "is_visible", "<init>", "(Lcom/anthropic/claude/analytics/events/DrawerEvents$DrawerItem;Z)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/analytics/events/DrawerEvents$DrawerItem;ZLvnf;)V", "Lcom/anthropic/claude/analytics/events/DrawerEvents$DrawerTabVisibilityToggled;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/DrawerEvents$DrawerTabVisibilityToggled;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/analytics/events/DrawerEvents$DrawerItem;", "component2", "()Z", "copy", "(Lcom/anthropic/claude/analytics/events/DrawerEvents$DrawerItem;Z)Lcom/anthropic/claude/analytics/events/DrawerEvents$DrawerTabVisibilityToggled;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/analytics/events/DrawerEvents$DrawerItem;", "getItem", "Z", "getEventName", "eventName", "Companion", "if6", "jf6", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class DrawerEvents$DrawerTabVisibilityToggled implements AnalyticsEvent {
    public static final int $stable = 0;
    private final boolean is_visible;
    private final DrawerEvents$DrawerItem item;
    public static final jf6 Companion = new jf6();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new fc6(13)), null};

    public /* synthetic */ DrawerEvents$DrawerTabVisibilityToggled(int i, DrawerEvents$DrawerItem drawerEvents$DrawerItem, boolean z, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, if6.a.getDescriptor());
            throw null;
        }
        this.item = drawerEvents$DrawerItem;
        this.is_visible = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return DrawerEvents$DrawerItem.Companion.serializer();
    }

    public static /* synthetic */ DrawerEvents$DrawerTabVisibilityToggled copy$default(DrawerEvents$DrawerTabVisibilityToggled drawerEvents$DrawerTabVisibilityToggled, DrawerEvents$DrawerItem drawerEvents$DrawerItem, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            drawerEvents$DrawerItem = drawerEvents$DrawerTabVisibilityToggled.item;
        }
        if ((i & 2) != 0) {
            z = drawerEvents$DrawerTabVisibilityToggled.is_visible;
        }
        return drawerEvents$DrawerTabVisibilityToggled.copy(drawerEvents$DrawerItem, z);
    }

    public static final /* synthetic */ void write$Self$analytics(DrawerEvents$DrawerTabVisibilityToggled self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.item);
        output.p(serialDesc, 1, self.is_visible);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DrawerEvents$DrawerItem getItem() {
        return this.item;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIs_visible() {
        return this.is_visible;
    }

    public final DrawerEvents$DrawerTabVisibilityToggled copy(DrawerEvents$DrawerItem item, boolean is_visible) {
        item.getClass();
        return new DrawerEvents$DrawerTabVisibilityToggled(item, is_visible);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrawerEvents$DrawerTabVisibilityToggled)) {
            return false;
        }
        DrawerEvents$DrawerTabVisibilityToggled drawerEvents$DrawerTabVisibilityToggled = (DrawerEvents$DrawerTabVisibilityToggled) other;
        return this.item == drawerEvents$DrawerTabVisibilityToggled.item && this.is_visible == drawerEvents$DrawerTabVisibilityToggled.is_visible;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_drawer_tab_visibility_toggled";
    }

    public final DrawerEvents$DrawerItem getItem() {
        return this.item;
    }

    public int hashCode() {
        return Boolean.hashCode(this.is_visible) + (this.item.hashCode() * 31);
    }

    public final boolean is_visible() {
        return this.is_visible;
    }

    public String toString() {
        return "DrawerTabVisibilityToggled(item=" + this.item + ", is_visible=" + this.is_visible + ")";
    }

    public DrawerEvents$DrawerTabVisibilityToggled(DrawerEvents$DrawerItem drawerEvents$DrawerItem, boolean z) {
        drawerEvents$DrawerItem.getClass();
        this.item = drawerEvents$DrawerItem;
        this.is_visible = z;
    }
}
