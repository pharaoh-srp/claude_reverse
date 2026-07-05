package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.wt4;
import defpackage.x44;
import defpackage.xt4;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u001aR\u0014\u0010)\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0018¨\u0006-"}, d2 = {"com/anthropic/claude/analytics/events/ConwayEvents$ConwayExtensionToggled", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "extension_name", "", "enabled", "<init>", "(Ljava/lang/String;Z)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;ZLvnf;)V", "Lcom/anthropic/claude/analytics/events/ConwayEvents$ConwayExtensionToggled;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ConwayEvents$ConwayExtensionToggled;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/anthropic/claude/analytics/events/ConwayEvents$ConwayExtensionToggled;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getExtension_name", "Z", "getEnabled", "getEventName", "eventName", "Companion", "wt4", "xt4", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ConwayEvents$ConwayExtensionToggled implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final xt4 Companion = new xt4();
    private final boolean enabled;
    private final String extension_name;

    public /* synthetic */ ConwayEvents$ConwayExtensionToggled(int i, String str, boolean z, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, wt4.a.getDescriptor());
            throw null;
        }
        this.extension_name = str;
        this.enabled = z;
    }

    public static /* synthetic */ ConwayEvents$ConwayExtensionToggled copy$default(ConwayEvents$ConwayExtensionToggled conwayEvents$ConwayExtensionToggled, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conwayEvents$ConwayExtensionToggled.extension_name;
        }
        if ((i & 2) != 0) {
            z = conwayEvents$ConwayExtensionToggled.enabled;
        }
        return conwayEvents$ConwayExtensionToggled.copy(str, z);
    }

    public static final /* synthetic */ void write$Self$analytics(ConwayEvents$ConwayExtensionToggled self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.extension_name);
        output.p(serialDesc, 1, self.enabled);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getExtension_name() {
        return this.extension_name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final ConwayEvents$ConwayExtensionToggled copy(String extension_name, boolean enabled) {
        extension_name.getClass();
        return new ConwayEvents$ConwayExtensionToggled(extension_name, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConwayEvents$ConwayExtensionToggled)) {
            return false;
        }
        ConwayEvents$ConwayExtensionToggled conwayEvents$ConwayExtensionToggled = (ConwayEvents$ConwayExtensionToggled) other;
        return x44.r(this.extension_name, conwayEvents$ConwayExtensionToggled.extension_name) && this.enabled == conwayEvents$ConwayExtensionToggled.enabled;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "conway_extension_toggled";
    }

    public final String getExtension_name() {
        return this.extension_name;
    }

    public int hashCode() {
        return Boolean.hashCode(this.enabled) + (this.extension_name.hashCode() * 31);
    }

    public String toString() {
        return "ConwayExtensionToggled(extension_name=" + this.extension_name + ", enabled=" + this.enabled + ")";
    }

    public ConwayEvents$ConwayExtensionToggled(String str, boolean z) {
        str.getClass();
        this.extension_name = str;
        this.enabled = z;
    }
}
