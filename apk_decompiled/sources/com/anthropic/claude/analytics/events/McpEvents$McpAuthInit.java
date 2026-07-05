package com.anthropic.claude.analytics.events;

import defpackage.e1b;
import defpackage.f1b;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJT\u0010!\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b0\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b1\u0010\u001bR\u0014\u00103\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u001b¨\u00067"}, d2 = {"com/anthropic/claude/analytics/events/McpEvents$McpAuthInit", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "uuid", "url", "source", "redacted_url", "prior_auth_status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/McpEvents$McpAuthInit;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/McpEvents$McpAuthInit;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/McpEvents$McpAuthInit;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getUuid", "getUrl", "getSource", "getRedacted_url", "getPrior_auth_status", "getEventName", "eventName", "Companion", "e1b", "f1b", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class McpEvents$McpAuthInit implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final f1b Companion = new f1b();
    private final String organization_uuid;
    private final String prior_auth_status;
    private final String redacted_url;
    private final String source;
    private final String url;
    private final String uuid;

    public /* synthetic */ McpEvents$McpAuthInit(int i, String str, String str2, String str3, String str4, String str5, String str6, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, e1b.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.uuid = str2;
        if ((i & 4) == 0) {
            this.url = null;
        } else {
            this.url = str3;
        }
        if ((i & 8) == 0) {
            this.source = null;
        } else {
            this.source = str4;
        }
        if ((i & 16) == 0) {
            this.redacted_url = null;
        } else {
            this.redacted_url = str5;
        }
        if ((i & 32) == 0) {
            this.prior_auth_status = null;
        } else {
            this.prior_auth_status = str6;
        }
    }

    public static /* synthetic */ McpEvents$McpAuthInit copy$default(McpEvents$McpAuthInit mcpEvents$McpAuthInit, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mcpEvents$McpAuthInit.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = mcpEvents$McpAuthInit.uuid;
        }
        if ((i & 4) != 0) {
            str3 = mcpEvents$McpAuthInit.url;
        }
        if ((i & 8) != 0) {
            str4 = mcpEvents$McpAuthInit.source;
        }
        if ((i & 16) != 0) {
            str5 = mcpEvents$McpAuthInit.redacted_url;
        }
        if ((i & 32) != 0) {
            str6 = mcpEvents$McpAuthInit.prior_auth_status;
        }
        String str7 = str5;
        String str8 = str6;
        return mcpEvents$McpAuthInit.copy(str, str2, str3, str4, str7, str8);
    }

    public static final /* synthetic */ void write$Self$analytics(McpEvents$McpAuthInit self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.uuid);
        if (output.E(serialDesc) || self.url != null) {
            output.B(serialDesc, 2, srg.a, self.url);
        }
        if (output.E(serialDesc) || self.source != null) {
            output.B(serialDesc, 3, srg.a, self.source);
        }
        if (output.E(serialDesc) || self.redacted_url != null) {
            output.B(serialDesc, 4, srg.a, self.redacted_url);
        }
        if (!output.E(serialDesc) && self.prior_auth_status == null) {
            return;
        }
        output.B(serialDesc, 5, srg.a, self.prior_auth_status);
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
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRedacted_url() {
        return this.redacted_url;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPrior_auth_status() {
        return this.prior_auth_status;
    }

    public final McpEvents$McpAuthInit copy(String organization_uuid, String uuid, String url, String source, String redacted_url, String prior_auth_status) {
        organization_uuid.getClass();
        uuid.getClass();
        return new McpEvents$McpAuthInit(organization_uuid, uuid, url, source, redacted_url, prior_auth_status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof McpEvents$McpAuthInit)) {
            return false;
        }
        McpEvents$McpAuthInit mcpEvents$McpAuthInit = (McpEvents$McpAuthInit) other;
        return x44.r(this.organization_uuid, mcpEvents$McpAuthInit.organization_uuid) && x44.r(this.uuid, mcpEvents$McpAuthInit.uuid) && x44.r(this.url, mcpEvents$McpAuthInit.url) && x44.r(this.source, mcpEvents$McpAuthInit.source) && x44.r(this.redacted_url, mcpEvents$McpAuthInit.redacted_url) && x44.r(this.prior_auth_status, mcpEvents$McpAuthInit.prior_auth_status);
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.mcp.auth.init";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getPrior_auth_status() {
        return this.prior_auth_status;
    }

    public final String getRedacted_url() {
        return this.redacted_url;
    }

    public final String getSource() {
        return this.source;
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
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.source;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.redacted_url;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.prior_auth_status;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.uuid;
        String str3 = this.url;
        String str4 = this.source;
        String str5 = this.redacted_url;
        String str6 = this.prior_auth_status;
        StringBuilder sbR = kgh.r("McpAuthInit(organization_uuid=", str, ", uuid=", str2, ", url=");
        kgh.u(sbR, str3, ", source=", str4, ", redacted_url=");
        return vb7.t(sbR, str5, ", prior_auth_status=", str6, ")");
    }

    public McpEvents$McpAuthInit(String str, String str2, String str3, String str4, String str5, String str6) {
        str.getClass();
        str2.getClass();
        this.organization_uuid = str;
        this.uuid = str2;
        this.url = str3;
        this.source = str4;
        this.redacted_url = str5;
        this.prior_auth_status = str6;
    }

    public /* synthetic */ McpEvents$McpAuthInit(String str, String str2, String str3, String str4, String str5, String str6, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
