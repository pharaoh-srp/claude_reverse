package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.a1b;
import defpackage.fsh;
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
import defpackage.z0b;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@ABW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eBg\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJh\u0010)\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001fJ\u0010\u0010,\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\t2\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b5\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b6\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b;\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b<\u0010\u001fR\u0014\u0010>\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u001f¨\u0006B"}, d2 = {"com/anthropic/claude/analytics/events/McpEvents$McpAppInitialized", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "server_uuid", "tool_name", "tool_use_id", "", "time_to_initialized_ms", "", "was_reinitialized", "server_name", "redacted_url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/McpEvents$McpAppInitialized;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/McpEvents$McpAppInitialized;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()J", "component6", "()Z", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/McpEvents$McpAppInitialized;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getServer_uuid", "getTool_name", "getTool_use_id", "J", "getTime_to_initialized_ms", "Z", "getWas_reinitialized", "getServer_name", "getRedacted_url", "getEventName", "eventName", "Companion", "z0b", "a1b", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class McpEvents$McpAppInitialized implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final a1b Companion = new a1b();
    private final String organization_uuid;
    private final String redacted_url;
    private final String server_name;
    private final String server_uuid;
    private final long time_to_initialized_ms;
    private final String tool_name;
    private final String tool_use_id;
    private final boolean was_reinitialized;

    public /* synthetic */ McpEvents$McpAppInitialized(int i, String str, String str2, String str3, String str4, long j, boolean z, String str5, String str6, vnf vnfVar) {
        if (53 != (i & 53)) {
            gvj.f(i, 53, z0b.a.getDescriptor());
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
        this.time_to_initialized_ms = j;
        this.was_reinitialized = z;
        if ((i & 64) == 0) {
            this.server_name = null;
        } else {
            this.server_name = str5;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.redacted_url = null;
        } else {
            this.redacted_url = str6;
        }
    }

    public static /* synthetic */ McpEvents$McpAppInitialized copy$default(McpEvents$McpAppInitialized mcpEvents$McpAppInitialized, String str, String str2, String str3, String str4, long j, boolean z, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mcpEvents$McpAppInitialized.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = mcpEvents$McpAppInitialized.server_uuid;
        }
        if ((i & 4) != 0) {
            str3 = mcpEvents$McpAppInitialized.tool_name;
        }
        if ((i & 8) != 0) {
            str4 = mcpEvents$McpAppInitialized.tool_use_id;
        }
        if ((i & 16) != 0) {
            j = mcpEvents$McpAppInitialized.time_to_initialized_ms;
        }
        if ((i & 32) != 0) {
            z = mcpEvents$McpAppInitialized.was_reinitialized;
        }
        if ((i & 64) != 0) {
            str5 = mcpEvents$McpAppInitialized.server_name;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            str6 = mcpEvents$McpAppInitialized.redacted_url;
        }
        String str7 = str6;
        boolean z2 = z;
        long j2 = j;
        String str8 = str3;
        String str9 = str4;
        return mcpEvents$McpAppInitialized.copy(str, str2, str8, str9, j2, z2, str5, str7);
    }

    public static final /* synthetic */ void write$Self$analytics(McpEvents$McpAppInitialized self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        if (output.E(serialDesc) || self.server_uuid != null) {
            output.B(serialDesc, 1, srg.a, self.server_uuid);
        }
        output.q(serialDesc, 2, self.tool_name);
        if (output.E(serialDesc) || self.tool_use_id != null) {
            output.B(serialDesc, 3, srg.a, self.tool_use_id);
        }
        output.D(serialDesc, 4, self.time_to_initialized_ms);
        output.p(serialDesc, 5, self.was_reinitialized);
        if (output.E(serialDesc) || self.server_name != null) {
            output.B(serialDesc, 6, srg.a, self.server_name);
        }
        if (!output.E(serialDesc) && self.redacted_url == null) {
            return;
        }
        output.B(serialDesc, 7, srg.a, self.redacted_url);
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
    public final long getTime_to_initialized_ms() {
        return this.time_to_initialized_ms;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getWas_reinitialized() {
        return this.was_reinitialized;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getServer_name() {
        return this.server_name;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getRedacted_url() {
        return this.redacted_url;
    }

    public final McpEvents$McpAppInitialized copy(String organization_uuid, String server_uuid, String tool_name, String tool_use_id, long time_to_initialized_ms, boolean was_reinitialized, String server_name, String redacted_url) {
        organization_uuid.getClass();
        tool_name.getClass();
        return new McpEvents$McpAppInitialized(organization_uuid, server_uuid, tool_name, tool_use_id, time_to_initialized_ms, was_reinitialized, server_name, redacted_url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof McpEvents$McpAppInitialized)) {
            return false;
        }
        McpEvents$McpAppInitialized mcpEvents$McpAppInitialized = (McpEvents$McpAppInitialized) other;
        return x44.r(this.organization_uuid, mcpEvents$McpAppInitialized.organization_uuid) && x44.r(this.server_uuid, mcpEvents$McpAppInitialized.server_uuid) && x44.r(this.tool_name, mcpEvents$McpAppInitialized.tool_name) && x44.r(this.tool_use_id, mcpEvents$McpAppInitialized.tool_use_id) && this.time_to_initialized_ms == mcpEvents$McpAppInitialized.time_to_initialized_ms && this.was_reinitialized == mcpEvents$McpAppInitialized.was_reinitialized && x44.r(this.server_name, mcpEvents$McpAppInitialized.server_name) && x44.r(this.redacted_url, mcpEvents$McpAppInitialized.redacted_url);
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mcp_app.initialized";
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

    public final long getTime_to_initialized_ms() {
        return this.time_to_initialized_ms;
    }

    public final String getTool_name() {
        return this.tool_name;
    }

    public final String getTool_use_id() {
        return this.tool_use_id;
    }

    public final boolean getWas_reinitialized() {
        return this.was_reinitialized;
    }

    public int hashCode() {
        int iHashCode = this.organization_uuid.hashCode() * 31;
        String str = this.server_uuid;
        int iL = kgh.l((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.tool_name);
        String str2 = this.tool_use_id;
        int iP = fsh.p(vb7.e((iL + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.time_to_initialized_ms), 31, this.was_reinitialized);
        String str3 = this.server_name;
        int iHashCode2 = (iP + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.redacted_url;
        return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.server_uuid;
        String str3 = this.tool_name;
        String str4 = this.tool_use_id;
        long j = this.time_to_initialized_ms;
        boolean z = this.was_reinitialized;
        String str5 = this.server_name;
        String str6 = this.redacted_url;
        StringBuilder sbR = kgh.r("McpAppInitialized(organization_uuid=", str, ", server_uuid=", str2, ", tool_name=");
        kgh.u(sbR, str3, ", tool_use_id=", str4, ", time_to_initialized_ms=");
        sbR.append(j);
        sbR.append(", was_reinitialized=");
        sbR.append(z);
        kgh.u(sbR, ", server_name=", str5, ", redacted_url=", str6);
        sbR.append(")");
        return sbR.toString();
    }

    public McpEvents$McpAppInitialized(String str, String str2, String str3, String str4, long j, boolean z, String str5, String str6) {
        str.getClass();
        str3.getClass();
        this.organization_uuid = str;
        this.server_uuid = str2;
        this.tool_name = str3;
        this.tool_use_id = str4;
        this.time_to_initialized_ms = j;
        this.was_reinitialized = z;
        this.server_name = str5;
        this.redacted_url = str6;
    }

    public /* synthetic */ McpEvents$McpAppInitialized(String str, String str2, String str3, String str4, long j, boolean z, String str5, String str6, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4, j, z, (i & 64) != 0 ? null : str5, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : str6);
    }
}
