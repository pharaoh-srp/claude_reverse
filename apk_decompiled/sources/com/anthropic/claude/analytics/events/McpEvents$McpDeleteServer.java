package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.i1b;
import defpackage.ij0;
import defpackage.j1b;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.y6a;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBa\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJZ\u0010#\u001a\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b1\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b2\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b3\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b4\u0010\u001cR\u0014\u00106\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u001c¨\u0006:"}, d2 = {"com/anthropic/claude/analytics/events/McpEvents$McpDeleteServer", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "uuid", "url", "name", "type", "source", "redacted_url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/McpEvents$McpDeleteServer;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/McpEvents$McpDeleteServer;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/McpEvents$McpDeleteServer;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getUuid", "getUrl", "getName", "getType", "getSource", "getRedacted_url", "getEventName", "eventName", "Companion", "i1b", "j1b", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class McpEvents$McpDeleteServer implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final j1b Companion = new j1b();
    private final String name;
    private final String organization_uuid;
    private final String redacted_url;
    private final String source;
    private final String type;
    private final String url;
    private final String uuid;

    public /* synthetic */ McpEvents$McpDeleteServer(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, vnf vnfVar) {
        if (59 != (i & 59)) {
            gvj.f(i, 59, i1b.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.uuid = str2;
        if ((i & 4) == 0) {
            this.url = null;
        } else {
            this.url = str3;
        }
        this.name = str4;
        this.type = str5;
        this.source = str6;
        if ((i & 64) == 0) {
            this.redacted_url = null;
        } else {
            this.redacted_url = str7;
        }
    }

    public static /* synthetic */ McpEvents$McpDeleteServer copy$default(McpEvents$McpDeleteServer mcpEvents$McpDeleteServer, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mcpEvents$McpDeleteServer.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = mcpEvents$McpDeleteServer.uuid;
        }
        if ((i & 4) != 0) {
            str3 = mcpEvents$McpDeleteServer.url;
        }
        if ((i & 8) != 0) {
            str4 = mcpEvents$McpDeleteServer.name;
        }
        if ((i & 16) != 0) {
            str5 = mcpEvents$McpDeleteServer.type;
        }
        if ((i & 32) != 0) {
            str6 = mcpEvents$McpDeleteServer.source;
        }
        if ((i & 64) != 0) {
            str7 = mcpEvents$McpDeleteServer.redacted_url;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return mcpEvents$McpDeleteServer.copy(str, str2, str11, str4, str10, str8, str9);
    }

    public static final /* synthetic */ void write$Self$analytics(McpEvents$McpDeleteServer self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.uuid);
        if (output.E(serialDesc) || self.url != null) {
            output.B(serialDesc, 2, srg.a, self.url);
        }
        output.q(serialDesc, 3, self.name);
        output.q(serialDesc, 4, self.type);
        output.q(serialDesc, 5, self.source);
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
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRedacted_url() {
        return this.redacted_url;
    }

    public final McpEvents$McpDeleteServer copy(String organization_uuid, String uuid, String url, String name, String type, String source, String redacted_url) {
        organization_uuid.getClass();
        uuid.getClass();
        name.getClass();
        type.getClass();
        source.getClass();
        return new McpEvents$McpDeleteServer(organization_uuid, uuid, url, name, type, source, redacted_url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof McpEvents$McpDeleteServer)) {
            return false;
        }
        McpEvents$McpDeleteServer mcpEvents$McpDeleteServer = (McpEvents$McpDeleteServer) other;
        return x44.r(this.organization_uuid, mcpEvents$McpDeleteServer.organization_uuid) && x44.r(this.uuid, mcpEvents$McpDeleteServer.uuid) && x44.r(this.url, mcpEvents$McpDeleteServer.url) && x44.r(this.name, mcpEvents$McpDeleteServer.name) && x44.r(this.type, mcpEvents$McpDeleteServer.type) && x44.r(this.source, mcpEvents$McpDeleteServer.source) && x44.r(this.redacted_url, mcpEvents$McpDeleteServer.redacted_url);
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.mcp.delete_server";
    }

    public final String getName() {
        return this.name;
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

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int iL = kgh.l(this.organization_uuid.hashCode() * 31, 31, this.uuid);
        String str = this.url;
        int iL2 = kgh.l(kgh.l(kgh.l((iL + (str == null ? 0 : str.hashCode())) * 31, 31, this.name), 31, this.type), 31, this.source);
        String str2 = this.redacted_url;
        return iL2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.uuid;
        String str3 = this.url;
        String str4 = this.name;
        String str5 = this.type;
        String str6 = this.source;
        String str7 = this.redacted_url;
        StringBuilder sbR = kgh.r("McpDeleteServer(organization_uuid=", str, ", uuid=", str2, ", url=");
        kgh.u(sbR, str3, ", name=", str4, ", type=");
        kgh.u(sbR, str5, ", source=", str6, ", redacted_url=");
        return ij0.m(sbR, str7, ")");
    }

    public McpEvents$McpDeleteServer(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        y6a.s(str, str2, str4, str5, str6);
        this.organization_uuid = str;
        this.uuid = str2;
        this.url = str3;
        this.name = str4;
        this.type = str5;
        this.source = str6;
        this.redacted_url = str7;
    }

    public /* synthetic */ McpEvents$McpDeleteServer(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : str3, str4, str5, str6, (i & 64) != 0 ? null : str7);
    }
}
