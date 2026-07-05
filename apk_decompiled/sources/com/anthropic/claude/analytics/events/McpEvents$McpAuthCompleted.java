package com.anthropic.claude.analytics.events;

import defpackage.b1b;
import defpackage.c1b;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mia;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"JT\u0010#\u001a\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b1\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b2\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\"R\u0014\u00106\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u001c¨\u0006:"}, d2 = {"com/anthropic/claude/analytics/events/McpEvents$McpAuthCompleted", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "result", "uuid", "url", "redacted_url", "Lcom/anthropic/claude/analytics/events/McpEvents$McpAuthFailureType;", "failure_type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/McpEvents$McpAuthFailureType;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/McpEvents$McpAuthFailureType;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/McpEvents$McpAuthCompleted;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/McpEvents$McpAuthCompleted;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/anthropic/claude/analytics/events/McpEvents$McpAuthFailureType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/McpEvents$McpAuthFailureType;)Lcom/anthropic/claude/analytics/events/McpEvents$McpAuthCompleted;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getResult", "getUuid", "getUrl", "getRedacted_url", "Lcom/anthropic/claude/analytics/events/McpEvents$McpAuthFailureType;", "getFailure_type", "getEventName", "eventName", "Companion", "b1b", "c1b", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class McpEvents$McpAuthCompleted implements AnalyticsEvent {
    public static final int $stable = 0;
    private final McpEvents$McpAuthFailureType failure_type;
    private final String organization_uuid;
    private final String redacted_url;
    private final String result;
    private final String url;
    private final String uuid;
    public static final c1b Companion = new c1b();
    private static final kw9[] $childSerializers = {null, null, null, null, null, yb5.w(w1a.F, new mia(16))};

    public /* synthetic */ McpEvents$McpAuthCompleted(int i, String str, String str2, String str3, String str4, String str5, McpEvents$McpAuthFailureType mcpEvents$McpAuthFailureType, vnf vnfVar) {
        if (5 != (i & 5)) {
            gvj.f(i, 5, b1b.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        if ((i & 2) == 0) {
            this.result = null;
        } else {
            this.result = str2;
        }
        this.uuid = str3;
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
        if ((i & 32) == 0) {
            this.failure_type = null;
        } else {
            this.failure_type = mcpEvents$McpAuthFailureType;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return McpEvents$McpAuthFailureType.Companion.serializer();
    }

    public static /* synthetic */ McpEvents$McpAuthCompleted copy$default(McpEvents$McpAuthCompleted mcpEvents$McpAuthCompleted, String str, String str2, String str3, String str4, String str5, McpEvents$McpAuthFailureType mcpEvents$McpAuthFailureType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mcpEvents$McpAuthCompleted.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = mcpEvents$McpAuthCompleted.result;
        }
        if ((i & 4) != 0) {
            str3 = mcpEvents$McpAuthCompleted.uuid;
        }
        if ((i & 8) != 0) {
            str4 = mcpEvents$McpAuthCompleted.url;
        }
        if ((i & 16) != 0) {
            str5 = mcpEvents$McpAuthCompleted.redacted_url;
        }
        if ((i & 32) != 0) {
            mcpEvents$McpAuthFailureType = mcpEvents$McpAuthCompleted.failure_type;
        }
        String str6 = str5;
        McpEvents$McpAuthFailureType mcpEvents$McpAuthFailureType2 = mcpEvents$McpAuthFailureType;
        return mcpEvents$McpAuthCompleted.copy(str, str2, str3, str4, str6, mcpEvents$McpAuthFailureType2);
    }

    public static final /* synthetic */ void write$Self$analytics(McpEvents$McpAuthCompleted self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        if (output.E(serialDesc) || self.result != null) {
            output.B(serialDesc, 1, srg.a, self.result);
        }
        output.q(serialDesc, 2, self.uuid);
        if (output.E(serialDesc) || self.url != null) {
            output.B(serialDesc, 3, srg.a, self.url);
        }
        if (output.E(serialDesc) || self.redacted_url != null) {
            output.B(serialDesc, 4, srg.a, self.redacted_url);
        }
        if (!output.E(serialDesc) && self.failure_type == null) {
            return;
        }
        output.B(serialDesc, 5, (znf) kw9VarArr[5].getValue(), self.failure_type);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRedacted_url() {
        return this.redacted_url;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final McpEvents$McpAuthFailureType getFailure_type() {
        return this.failure_type;
    }

    public final McpEvents$McpAuthCompleted copy(String organization_uuid, String result, String uuid, String url, String redacted_url, McpEvents$McpAuthFailureType failure_type) {
        organization_uuid.getClass();
        uuid.getClass();
        return new McpEvents$McpAuthCompleted(organization_uuid, result, uuid, url, redacted_url, failure_type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof McpEvents$McpAuthCompleted)) {
            return false;
        }
        McpEvents$McpAuthCompleted mcpEvents$McpAuthCompleted = (McpEvents$McpAuthCompleted) other;
        return x44.r(this.organization_uuid, mcpEvents$McpAuthCompleted.organization_uuid) && x44.r(this.result, mcpEvents$McpAuthCompleted.result) && x44.r(this.uuid, mcpEvents$McpAuthCompleted.uuid) && x44.r(this.url, mcpEvents$McpAuthCompleted.url) && x44.r(this.redacted_url, mcpEvents$McpAuthCompleted.redacted_url) && this.failure_type == mcpEvents$McpAuthCompleted.failure_type;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.mcp.auth.completed";
    }

    public final McpEvents$McpAuthFailureType getFailure_type() {
        return this.failure_type;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getRedacted_url() {
        return this.redacted_url;
    }

    public final String getResult() {
        return this.result;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int iHashCode = this.organization_uuid.hashCode() * 31;
        String str = this.result;
        int iL = kgh.l((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.uuid);
        String str2 = this.url;
        int iHashCode2 = (iL + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.redacted_url;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        McpEvents$McpAuthFailureType mcpEvents$McpAuthFailureType = this.failure_type;
        return iHashCode3 + (mcpEvents$McpAuthFailureType != null ? mcpEvents$McpAuthFailureType.hashCode() : 0);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.result;
        String str3 = this.uuid;
        String str4 = this.url;
        String str5 = this.redacted_url;
        McpEvents$McpAuthFailureType mcpEvents$McpAuthFailureType = this.failure_type;
        StringBuilder sbR = kgh.r("McpAuthCompleted(organization_uuid=", str, ", result=", str2, ", uuid=");
        kgh.u(sbR, str3, ", url=", str4, ", redacted_url=");
        sbR.append(str5);
        sbR.append(", failure_type=");
        sbR.append(mcpEvents$McpAuthFailureType);
        sbR.append(")");
        return sbR.toString();
    }

    public McpEvents$McpAuthCompleted(String str, String str2, String str3, String str4, String str5, McpEvents$McpAuthFailureType mcpEvents$McpAuthFailureType) {
        str.getClass();
        str3.getClass();
        this.organization_uuid = str;
        this.result = str2;
        this.uuid = str3;
        this.url = str4;
        this.redacted_url = str5;
        this.failure_type = mcpEvents$McpAuthFailureType;
    }

    public /* synthetic */ McpEvents$McpAuthCompleted(String str, String str2, String str3, String str4, String str5, McpEvents$McpAuthFailureType mcpEvents$McpAuthFailureType, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : mcpEvents$McpAuthFailureType);
    }
}
