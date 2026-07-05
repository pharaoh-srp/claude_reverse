package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x0b;
import defpackage.x44;
import defpackage.xka;
import defpackage.y0b;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EFBc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fBq\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010 J\u0012\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b*\u0010+Jt\u0010,\u001a\u00020\u00152\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010 J\u0010\u0010/\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u00020\f2\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010 R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b7\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b8\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b9\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b:\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b;\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\b=\u0010'R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\b?\u0010)R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\bA\u0010+R\u0014\u0010C\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010 ¨\u0006G"}, d2 = {"com/anthropic/claude/analytics/events/McpEvents$McpAppHeightFirstUpdated", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "server_uuid", "tool_name", "tool_use_id", "server_name", "redacted_url", "", "height", "time_to_height_ms", "", "has_tool_result", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;JZ)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;JZLvnf;)V", "Lcom/anthropic/claude/analytics/events/McpEvents$McpAppHeightFirstUpdated;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/McpEvents$McpAppHeightFirstUpdated;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Ljava/lang/Long;", "component8", "()J", "component9", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;JZ)Lcom/anthropic/claude/analytics/events/McpEvents$McpAppHeightFirstUpdated;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getServer_uuid", "getTool_name", "getTool_use_id", "getServer_name", "getRedacted_url", "Ljava/lang/Long;", "getHeight", "J", "getTime_to_height_ms", "Z", "getHas_tool_result", "getEventName", "eventName", "Companion", "x0b", "y0b", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class McpEvents$McpAppHeightFirstUpdated implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final y0b Companion = new y0b();
    private final boolean has_tool_result;
    private final Long height;
    private final String organization_uuid;
    private final String redacted_url;
    private final String server_name;
    private final String server_uuid;
    private final long time_to_height_ms;
    private final String tool_name;
    private final String tool_use_id;

    public /* synthetic */ McpEvents$McpAppHeightFirstUpdated(int i, String str, String str2, String str3, String str4, String str5, String str6, Long l, long j, boolean z, vnf vnfVar) {
        if (389 != (i & 389)) {
            gvj.f(i, 389, x0b.a.getDescriptor());
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
        if ((i & 16) == 0) {
            this.server_name = null;
        } else {
            this.server_name = str5;
        }
        if ((i & 32) == 0) {
            this.redacted_url = null;
        } else {
            this.redacted_url = str6;
        }
        if ((i & 64) == 0) {
            this.height = null;
        } else {
            this.height = l;
        }
        this.time_to_height_ms = j;
        this.has_tool_result = z;
    }

    public static /* synthetic */ McpEvents$McpAppHeightFirstUpdated copy$default(McpEvents$McpAppHeightFirstUpdated mcpEvents$McpAppHeightFirstUpdated, String str, String str2, String str3, String str4, String str5, String str6, Long l, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mcpEvents$McpAppHeightFirstUpdated.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = mcpEvents$McpAppHeightFirstUpdated.server_uuid;
        }
        if ((i & 4) != 0) {
            str3 = mcpEvents$McpAppHeightFirstUpdated.tool_name;
        }
        if ((i & 8) != 0) {
            str4 = mcpEvents$McpAppHeightFirstUpdated.tool_use_id;
        }
        if ((i & 16) != 0) {
            str5 = mcpEvents$McpAppHeightFirstUpdated.server_name;
        }
        if ((i & 32) != 0) {
            str6 = mcpEvents$McpAppHeightFirstUpdated.redacted_url;
        }
        if ((i & 64) != 0) {
            l = mcpEvents$McpAppHeightFirstUpdated.height;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            j = mcpEvents$McpAppHeightFirstUpdated.time_to_height_ms;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            z = mcpEvents$McpAppHeightFirstUpdated.has_tool_result;
        }
        boolean z2 = z;
        long j2 = j;
        String str7 = str6;
        Long l2 = l;
        String str8 = str5;
        String str9 = str3;
        return mcpEvents$McpAppHeightFirstUpdated.copy(str, str2, str9, str4, str8, str7, l2, j2, z2);
    }

    public static final /* synthetic */ void write$Self$analytics(McpEvents$McpAppHeightFirstUpdated self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        if (output.E(serialDesc) || self.server_uuid != null) {
            output.B(serialDesc, 1, srg.a, self.server_uuid);
        }
        output.q(serialDesc, 2, self.tool_name);
        if (output.E(serialDesc) || self.tool_use_id != null) {
            output.B(serialDesc, 3, srg.a, self.tool_use_id);
        }
        if (output.E(serialDesc) || self.server_name != null) {
            output.B(serialDesc, 4, srg.a, self.server_name);
        }
        if (output.E(serialDesc) || self.redacted_url != null) {
            output.B(serialDesc, 5, srg.a, self.redacted_url);
        }
        if (output.E(serialDesc) || self.height != null) {
            output.B(serialDesc, 6, xka.a, self.height);
        }
        output.D(serialDesc, 7, self.time_to_height_ms);
        output.p(serialDesc, 8, self.has_tool_result);
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
    public final String getServer_name() {
        return this.server_name;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRedacted_url() {
        return this.redacted_url;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getTime_to_height_ms() {
        return this.time_to_height_ms;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getHas_tool_result() {
        return this.has_tool_result;
    }

    public final McpEvents$McpAppHeightFirstUpdated copy(String organization_uuid, String server_uuid, String tool_name, String tool_use_id, String server_name, String redacted_url, Long height, long time_to_height_ms, boolean has_tool_result) {
        organization_uuid.getClass();
        tool_name.getClass();
        return new McpEvents$McpAppHeightFirstUpdated(organization_uuid, server_uuid, tool_name, tool_use_id, server_name, redacted_url, height, time_to_height_ms, has_tool_result);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof McpEvents$McpAppHeightFirstUpdated)) {
            return false;
        }
        McpEvents$McpAppHeightFirstUpdated mcpEvents$McpAppHeightFirstUpdated = (McpEvents$McpAppHeightFirstUpdated) other;
        return x44.r(this.organization_uuid, mcpEvents$McpAppHeightFirstUpdated.organization_uuid) && x44.r(this.server_uuid, mcpEvents$McpAppHeightFirstUpdated.server_uuid) && x44.r(this.tool_name, mcpEvents$McpAppHeightFirstUpdated.tool_name) && x44.r(this.tool_use_id, mcpEvents$McpAppHeightFirstUpdated.tool_use_id) && x44.r(this.server_name, mcpEvents$McpAppHeightFirstUpdated.server_name) && x44.r(this.redacted_url, mcpEvents$McpAppHeightFirstUpdated.redacted_url) && x44.r(this.height, mcpEvents$McpAppHeightFirstUpdated.height) && this.time_to_height_ms == mcpEvents$McpAppHeightFirstUpdated.time_to_height_ms && this.has_tool_result == mcpEvents$McpAppHeightFirstUpdated.has_tool_result;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mcp_app.height_first_updated";
    }

    public final boolean getHas_tool_result() {
        return this.has_tool_result;
    }

    public final Long getHeight() {
        return this.height;
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

    public final long getTime_to_height_ms() {
        return this.time_to_height_ms;
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
        int iHashCode2 = (iL + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.server_name;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.redacted_url;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.height;
        return Boolean.hashCode(this.has_tool_result) + vb7.e((iHashCode4 + (l != null ? l.hashCode() : 0)) * 31, 31, this.time_to_height_ms);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.server_uuid;
        String str3 = this.tool_name;
        String str4 = this.tool_use_id;
        String str5 = this.server_name;
        String str6 = this.redacted_url;
        Long l = this.height;
        long j = this.time_to_height_ms;
        boolean z = this.has_tool_result;
        StringBuilder sbR = kgh.r("McpAppHeightFirstUpdated(organization_uuid=", str, ", server_uuid=", str2, ", tool_name=");
        kgh.u(sbR, str3, ", tool_use_id=", str4, ", server_name=");
        kgh.u(sbR, str5, ", redacted_url=", str6, ", height=");
        sbR.append(l);
        sbR.append(", time_to_height_ms=");
        sbR.append(j);
        sbR.append(", has_tool_result=");
        sbR.append(z);
        sbR.append(")");
        return sbR.toString();
    }

    public McpEvents$McpAppHeightFirstUpdated(String str, String str2, String str3, String str4, String str5, String str6, Long l, long j, boolean z) {
        str.getClass();
        str3.getClass();
        this.organization_uuid = str;
        this.server_uuid = str2;
        this.tool_name = str3;
        this.tool_use_id = str4;
        this.server_name = str5;
        this.redacted_url = str6;
        this.height = l;
        this.time_to_height_ms = j;
        this.has_tool_result = z;
    }

    public /* synthetic */ McpEvents$McpAppHeightFirstUpdated(String str, String str2, String str3, String str4, String str5, String str6, Long l, long j, boolean z, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : l, j, z);
    }
}
