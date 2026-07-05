package com.anthropic.claude.analytics.events;

import defpackage.g1b;
import defpackage.grc;
import defpackage.gvj;
import defpackage.h1b;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJF\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u001aR\u0014\u00100\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u001a¨\u00064"}, d2 = {"com/anthropic/claude/analytics/events/McpEvents$McpCreateServer", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "source", "type", "url", "redacted_url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/McpEvents$McpCreateServer;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/McpEvents$McpCreateServer;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/McpEvents$McpCreateServer;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getSource", "getType", "getUrl", "getRedacted_url", "getEventName", "eventName", "Companion", "g1b", "h1b", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class McpEvents$McpCreateServer implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final h1b Companion = new h1b();
    private final String organization_uuid;
    private final String redacted_url;
    private final String source;
    private final String type;
    private final String url;

    public /* synthetic */ McpEvents$McpCreateServer(int i, String str, String str2, String str3, String str4, String str5, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, g1b.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.source = str2;
        this.type = str3;
        if ((i & 8) == 0) {
            this.url = null;
        } else {
            this.url = str4;
        }
        if ((i & 16) == 0) {
            this.redacted_url = null;
        } else {
            this.redacted_url = str5;
        }
    }

    public static /* synthetic */ McpEvents$McpCreateServer copy$default(McpEvents$McpCreateServer mcpEvents$McpCreateServer, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mcpEvents$McpCreateServer.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = mcpEvents$McpCreateServer.source;
        }
        if ((i & 4) != 0) {
            str3 = mcpEvents$McpCreateServer.type;
        }
        if ((i & 8) != 0) {
            str4 = mcpEvents$McpCreateServer.url;
        }
        if ((i & 16) != 0) {
            str5 = mcpEvents$McpCreateServer.redacted_url;
        }
        String str6 = str5;
        String str7 = str3;
        return mcpEvents$McpCreateServer.copy(str, str2, str7, str4, str6);
    }

    public static final /* synthetic */ void write$Self$analytics(McpEvents$McpCreateServer self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.source);
        output.q(serialDesc, 2, self.type);
        if (output.E(serialDesc) || self.url != null) {
            output.B(serialDesc, 3, srg.a, self.url);
        }
        if (!output.E(serialDesc) && self.redacted_url == null) {
            return;
        }
        output.B(serialDesc, 4, srg.a, self.redacted_url);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRedacted_url() {
        return this.redacted_url;
    }

    public final McpEvents$McpCreateServer copy(String organization_uuid, String source, String type, String url, String redacted_url) {
        organization_uuid.getClass();
        source.getClass();
        type.getClass();
        return new McpEvents$McpCreateServer(organization_uuid, source, type, url, redacted_url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof McpEvents$McpCreateServer)) {
            return false;
        }
        McpEvents$McpCreateServer mcpEvents$McpCreateServer = (McpEvents$McpCreateServer) other;
        return x44.r(this.organization_uuid, mcpEvents$McpCreateServer.organization_uuid) && x44.r(this.source, mcpEvents$McpCreateServer.source) && x44.r(this.type, mcpEvents$McpCreateServer.type) && x44.r(this.url, mcpEvents$McpCreateServer.url) && x44.r(this.redacted_url, mcpEvents$McpCreateServer.redacted_url);
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.mcp.create_server";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getRedacted_url() {
        return this.redacted_url;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iL = kgh.l(kgh.l(this.organization_uuid.hashCode() * 31, 31, this.source), 31, this.type);
        String str = this.url;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.redacted_url;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.source;
        String str3 = this.type;
        String str4 = this.url;
        String str5 = this.redacted_url;
        StringBuilder sbR = kgh.r("McpCreateServer(organization_uuid=", str, ", source=", str2, ", type=");
        kgh.u(sbR, str3, ", url=", str4, ", redacted_url=");
        return ij0.m(sbR, str5, ")");
    }

    public McpEvents$McpCreateServer(String str, String str2, String str3, String str4, String str5) {
        grc.B(str, str2, str3);
        this.organization_uuid = str;
        this.source = str2;
        this.type = str3;
        this.url = str4;
        this.redacted_url = str5;
    }

    public /* synthetic */ McpEvents$McpCreateServer(String str, String str2, String str3, String str4, String str5, int i, mq5 mq5Var) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
