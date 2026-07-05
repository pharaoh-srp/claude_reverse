package com.anthropic.claude.analytics.events;

import defpackage.grc;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.s0b;
import defpackage.srg;
import defpackage.t0b;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBa\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ^\u0010#\u001a\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b1\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b2\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b3\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b4\u0010\u001cR\u0014\u00106\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u001c¨\u0006:"}, d2 = {"com/anthropic/claude/analytics/events/McpEvents$McpAppBridgeEvent", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "server_uuid", "tool_name", "tool_use_id", "event_type", "server_name", "redacted_url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/McpEvents$McpAppBridgeEvent;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/McpEvents$McpAppBridgeEvent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/McpEvents$McpAppBridgeEvent;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getServer_uuid", "getTool_name", "getTool_use_id", "getEvent_type", "getServer_name", "getRedacted_url", "getEventName", "eventName", "Companion", "s0b", "t0b", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class McpEvents$McpAppBridgeEvent implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final t0b Companion = new t0b();
    private final String event_type;
    private final String organization_uuid;
    private final String redacted_url;
    private final String server_name;
    private final String server_uuid;
    private final String tool_name;
    private final String tool_use_id;

    public /* synthetic */ McpEvents$McpAppBridgeEvent(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, vnf vnfVar) {
        if (21 != (i & 21)) {
            gvj.f(i, 21, s0b.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        if ((i & 2) == 0) {
            this.server_uuid = null;
        } else {
            this.server_uuid = str2;
        }
        this.tool_name = str3;
        if ((i & 8) == 0) {
            this.tool_use_id = null;
        } else {
            this.tool_use_id = str4;
        }
        this.event_type = str5;
        if ((i & 32) == 0) {
            this.server_name = null;
        } else {
            this.server_name = str6;
        }
        if ((i & 64) == 0) {
            this.redacted_url = null;
        } else {
            this.redacted_url = str7;
        }
    }

    public static /* synthetic */ McpEvents$McpAppBridgeEvent copy$default(McpEvents$McpAppBridgeEvent mcpEvents$McpAppBridgeEvent, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mcpEvents$McpAppBridgeEvent.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = mcpEvents$McpAppBridgeEvent.server_uuid;
        }
        if ((i & 4) != 0) {
            str3 = mcpEvents$McpAppBridgeEvent.tool_name;
        }
        if ((i & 8) != 0) {
            str4 = mcpEvents$McpAppBridgeEvent.tool_use_id;
        }
        if ((i & 16) != 0) {
            str5 = mcpEvents$McpAppBridgeEvent.event_type;
        }
        if ((i & 32) != 0) {
            str6 = mcpEvents$McpAppBridgeEvent.server_name;
        }
        if ((i & 64) != 0) {
            str7 = mcpEvents$McpAppBridgeEvent.redacted_url;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return mcpEvents$McpAppBridgeEvent.copy(str, str2, str11, str4, str10, str8, str9);
    }

    public static final /* synthetic */ void write$Self$analytics(McpEvents$McpAppBridgeEvent self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        if (output.E(serialDesc) || self.server_uuid != null) {
            output.B(serialDesc, 1, srg.a, self.server_uuid);
        }
        output.q(serialDesc, 2, self.tool_name);
        if (output.E(serialDesc) || self.tool_use_id != null) {
            output.B(serialDesc, 3, srg.a, self.tool_use_id);
        }
        output.q(serialDesc, 4, self.event_type);
        if (output.E(serialDesc) || self.server_name != null) {
            output.B(serialDesc, 5, srg.a, self.server_name);
        }
        if (!output.E(serialDesc) && self.redacted_url == null) {
            return;
        }
        output.B(serialDesc, 6, srg.a, self.redacted_url);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getServer_uuid() {
        return this.server_uuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTool_name() {
        return this.tool_name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTool_use_id() {
        return this.tool_use_id;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEvent_type() {
        return this.event_type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getServer_name() {
        return this.server_name;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRedacted_url() {
        return this.redacted_url;
    }

    public final McpEvents$McpAppBridgeEvent copy(String organization_uuid, String server_uuid, String tool_name, String tool_use_id, String event_type, String server_name, String redacted_url) {
        organization_uuid.getClass();
        tool_name.getClass();
        event_type.getClass();
        return new McpEvents$McpAppBridgeEvent(organization_uuid, server_uuid, tool_name, tool_use_id, event_type, server_name, redacted_url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof McpEvents$McpAppBridgeEvent)) {
            return false;
        }
        McpEvents$McpAppBridgeEvent mcpEvents$McpAppBridgeEvent = (McpEvents$McpAppBridgeEvent) other;
        return x44.r(this.organization_uuid, mcpEvents$McpAppBridgeEvent.organization_uuid) && x44.r(this.server_uuid, mcpEvents$McpAppBridgeEvent.server_uuid) && x44.r(this.tool_name, mcpEvents$McpAppBridgeEvent.tool_name) && x44.r(this.tool_use_id, mcpEvents$McpAppBridgeEvent.tool_use_id) && x44.r(this.event_type, mcpEvents$McpAppBridgeEvent.event_type) && x44.r(this.server_name, mcpEvents$McpAppBridgeEvent.server_name) && x44.r(this.redacted_url, mcpEvents$McpAppBridgeEvent.redacted_url);
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mcp_app.bridge_event";
    }

    public final String getEvent_type() {
        return this.event_type;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getRedacted_url() {
        return this.redacted_url;
    }

    public final String getServer_name() {
        return this.server_name;
    }

    public final String getServer_uuid() {
        return this.server_uuid;
    }

    public final String getTool_name() {
        return this.tool_name;
    }

    public final String getTool_use_id() {
        return this.tool_use_id;
    }

    public int hashCode() {
        int iHashCode = this.organization_uuid.hashCode() * 31;
        String str = this.server_uuid;
        int iL = kgh.l((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.tool_name);
        String str2 = this.tool_use_id;
        int iL2 = kgh.l((iL + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.event_type);
        String str3 = this.server_name;
        int iHashCode2 = (iL2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.redacted_url;
        return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.server_uuid;
        String str3 = this.tool_name;
        String str4 = this.tool_use_id;
        String str5 = this.event_type;
        String str6 = this.server_name;
        String str7 = this.redacted_url;
        StringBuilder sbR = kgh.r("McpAppBridgeEvent(organization_uuid=", str, ", server_uuid=", str2, ", tool_name=");
        kgh.u(sbR, str3, ", tool_use_id=", str4, ", event_type=");
        kgh.u(sbR, str5, ", server_name=", str6, ", redacted_url=");
        return ij0.m(sbR, str7, ")");
    }

    public McpEvents$McpAppBridgeEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        grc.B(str, str3, str5);
        this.organization_uuid = str;
        this.server_uuid = str2;
        this.tool_name = str3;
        this.tool_use_id = str4;
        this.event_type = str5;
        this.server_name = str6;
        this.redacted_url = str7;
    }

    public /* synthetic */ McpEvents$McpAppBridgeEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4, str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }
}
