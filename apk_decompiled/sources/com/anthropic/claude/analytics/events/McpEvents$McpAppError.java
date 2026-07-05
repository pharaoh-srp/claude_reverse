package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.grc;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mia;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.u0b;
import defpackage.v0b;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.xka;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0002GHBs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B\u007f\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0017J\u0012\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0082\u0001\u0010$\u001a\u00020#2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0017J\u0010\u0010'\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-J'\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020#2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00107\u001a\u0004\b9\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b:\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b;\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b<\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b=\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b>\u0010\u0017R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\b@\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\bA\u0010\u0017R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010B\u001a\u0004\bC\u0010\"R\u0014\u0010E\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u0017¨\u0006I"}, d2 = {"com/anthropic/claude/analytics/events/McpEvents$McpAppError", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "server_uuid", "tool_name", "tool_use_id", "error_message", "server_name", "error_type", "Lcom/anthropic/claude/analytics/events/McpEvents$McpAppErrorPhase;", "error_phase", "redacted_url", "", "error_code", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/McpEvents$McpAppErrorPhase;Ljava/lang/String;Ljava/lang/Long;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/McpEvents$McpAppErrorPhase;Ljava/lang/String;Ljava/lang/Long;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Lcom/anthropic/claude/analytics/events/McpEvents$McpAppErrorPhase;", "component9", "component10", "()Ljava/lang/Long;", "Lcom/anthropic/claude/analytics/events/McpEvents$McpAppError;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/McpEvents$McpAppErrorPhase;Ljava/lang/String;Ljava/lang/Long;)Lcom/anthropic/claude/analytics/events/McpEvents$McpAppError;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/McpEvents$McpAppError;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getOrganization_uuid", "getServer_uuid", "getTool_name", "getTool_use_id", "getError_message", "getServer_name", "getError_type", "Lcom/anthropic/claude/analytics/events/McpEvents$McpAppErrorPhase;", "getError_phase", "getRedacted_url", "Ljava/lang/Long;", "getError_code", "getEventName", "eventName", "Companion", "u0b", "v0b", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class McpEvents$McpAppError implements AnalyticsEvent {
    public static final int $stable = 0;
    private final Long error_code;
    private final String error_message;
    private final McpEvents$McpAppErrorPhase error_phase;
    private final String error_type;
    private final String organization_uuid;
    private final String redacted_url;
    private final String server_name;
    private final String server_uuid;
    private final String tool_name;
    private final String tool_use_id;
    public static final v0b Companion = new v0b();
    private static final kw9[] $childSerializers = {null, null, null, null, null, null, null, yb5.w(w1a.F, new mia(14)), null, null};

    public /* synthetic */ McpEvents$McpAppError(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, McpEvents$McpAppErrorPhase mcpEvents$McpAppErrorPhase, String str8, Long l, vnf vnfVar) {
        if (21 != (i & 21)) {
            gvj.f(i, 21, u0b.a.getDescriptor());
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
        this.error_message = str5;
        if ((i & 32) == 0) {
            this.server_name = null;
        } else {
            this.server_name = str6;
        }
        if ((i & 64) == 0) {
            this.error_type = null;
        } else {
            this.error_type = str7;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.error_phase = null;
        } else {
            this.error_phase = mcpEvents$McpAppErrorPhase;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.redacted_url = null;
        } else {
            this.redacted_url = str8;
        }
        if ((i & 512) == 0) {
            this.error_code = null;
        } else {
            this.error_code = l;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return McpEvents$McpAppErrorPhase.Companion.serializer();
    }

    public static /* synthetic */ McpEvents$McpAppError copy$default(McpEvents$McpAppError mcpEvents$McpAppError, String str, String str2, String str3, String str4, String str5, String str6, String str7, McpEvents$McpAppErrorPhase mcpEvents$McpAppErrorPhase, String str8, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mcpEvents$McpAppError.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = mcpEvents$McpAppError.server_uuid;
        }
        if ((i & 4) != 0) {
            str3 = mcpEvents$McpAppError.tool_name;
        }
        if ((i & 8) != 0) {
            str4 = mcpEvents$McpAppError.tool_use_id;
        }
        if ((i & 16) != 0) {
            str5 = mcpEvents$McpAppError.error_message;
        }
        if ((i & 32) != 0) {
            str6 = mcpEvents$McpAppError.server_name;
        }
        if ((i & 64) != 0) {
            str7 = mcpEvents$McpAppError.error_type;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            mcpEvents$McpAppErrorPhase = mcpEvents$McpAppError.error_phase;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            str8 = mcpEvents$McpAppError.redacted_url;
        }
        if ((i & 512) != 0) {
            l = mcpEvents$McpAppError.error_code;
        }
        String str9 = str8;
        Long l2 = l;
        String str10 = str7;
        McpEvents$McpAppErrorPhase mcpEvents$McpAppErrorPhase2 = mcpEvents$McpAppErrorPhase;
        String str11 = str5;
        String str12 = str6;
        return mcpEvents$McpAppError.copy(str, str2, str3, str4, str11, str12, str10, mcpEvents$McpAppErrorPhase2, str9, l2);
    }

    public static final /* synthetic */ void write$Self$analytics(McpEvents$McpAppError self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        if (output.E(serialDesc) || self.server_uuid != null) {
            output.B(serialDesc, 1, srg.a, self.server_uuid);
        }
        output.q(serialDesc, 2, self.tool_name);
        if (output.E(serialDesc) || self.tool_use_id != null) {
            output.B(serialDesc, 3, srg.a, self.tool_use_id);
        }
        output.q(serialDesc, 4, self.error_message);
        if (output.E(serialDesc) || self.server_name != null) {
            output.B(serialDesc, 5, srg.a, self.server_name);
        }
        if (output.E(serialDesc) || self.error_type != null) {
            output.B(serialDesc, 6, srg.a, self.error_type);
        }
        if (output.E(serialDesc) || self.error_phase != null) {
            output.B(serialDesc, 7, (znf) kw9VarArr[7].getValue(), self.error_phase);
        }
        if (output.E(serialDesc) || self.redacted_url != null) {
            output.B(serialDesc, 8, srg.a, self.redacted_url);
        }
        if (!output.E(serialDesc) && self.error_code == null) {
            return;
        }
        output.B(serialDesc, 9, xka.a, self.error_code);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getError_code() {
        return this.error_code;
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
    public final String getError_message() {
        return this.error_message;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getServer_name() {
        return this.server_name;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getError_type() {
        return this.error_type;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final McpEvents$McpAppErrorPhase getError_phase() {
        return this.error_phase;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRedacted_url() {
        return this.redacted_url;
    }

    public final McpEvents$McpAppError copy(String organization_uuid, String server_uuid, String tool_name, String tool_use_id, String error_message, String server_name, String error_type, McpEvents$McpAppErrorPhase error_phase, String redacted_url, Long error_code) {
        organization_uuid.getClass();
        tool_name.getClass();
        error_message.getClass();
        return new McpEvents$McpAppError(organization_uuid, server_uuid, tool_name, tool_use_id, error_message, server_name, error_type, error_phase, redacted_url, error_code);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof McpEvents$McpAppError)) {
            return false;
        }
        McpEvents$McpAppError mcpEvents$McpAppError = (McpEvents$McpAppError) other;
        return x44.r(this.organization_uuid, mcpEvents$McpAppError.organization_uuid) && x44.r(this.server_uuid, mcpEvents$McpAppError.server_uuid) && x44.r(this.tool_name, mcpEvents$McpAppError.tool_name) && x44.r(this.tool_use_id, mcpEvents$McpAppError.tool_use_id) && x44.r(this.error_message, mcpEvents$McpAppError.error_message) && x44.r(this.server_name, mcpEvents$McpAppError.server_name) && x44.r(this.error_type, mcpEvents$McpAppError.error_type) && this.error_phase == mcpEvents$McpAppError.error_phase && x44.r(this.redacted_url, mcpEvents$McpAppError.redacted_url) && x44.r(this.error_code, mcpEvents$McpAppError.error_code);
    }

    public final Long getError_code() {
        return this.error_code;
    }

    public final String getError_message() {
        return this.error_message;
    }

    public final McpEvents$McpAppErrorPhase getError_phase() {
        return this.error_phase;
    }

    public final String getError_type() {
        return this.error_type;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mcp_app.error";
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
        int iL2 = kgh.l((iL + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.error_message);
        String str3 = this.server_name;
        int iHashCode2 = (iL2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.error_type;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        McpEvents$McpAppErrorPhase mcpEvents$McpAppErrorPhase = this.error_phase;
        int iHashCode4 = (iHashCode3 + (mcpEvents$McpAppErrorPhase == null ? 0 : mcpEvents$McpAppErrorPhase.hashCode())) * 31;
        String str5 = this.redacted_url;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.error_code;
        return iHashCode5 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.server_uuid;
        String str3 = this.tool_name;
        String str4 = this.tool_use_id;
        String str5 = this.error_message;
        String str6 = this.server_name;
        String str7 = this.error_type;
        McpEvents$McpAppErrorPhase mcpEvents$McpAppErrorPhase = this.error_phase;
        String str8 = this.redacted_url;
        Long l = this.error_code;
        StringBuilder sbR = kgh.r("McpAppError(organization_uuid=", str, ", server_uuid=", str2, ", tool_name=");
        kgh.u(sbR, str3, ", tool_use_id=", str4, ", error_message=");
        kgh.u(sbR, str5, ", server_name=", str6, ", error_type=");
        sbR.append(str7);
        sbR.append(", error_phase=");
        sbR.append(mcpEvents$McpAppErrorPhase);
        sbR.append(", redacted_url=");
        sbR.append(str8);
        sbR.append(", error_code=");
        sbR.append(l);
        sbR.append(")");
        return sbR.toString();
    }

    public McpEvents$McpAppError(String str, String str2, String str3, String str4, String str5, String str6, String str7, McpEvents$McpAppErrorPhase mcpEvents$McpAppErrorPhase, String str8, Long l) {
        grc.B(str, str3, str5);
        this.organization_uuid = str;
        this.server_uuid = str2;
        this.tool_name = str3;
        this.tool_use_id = str4;
        this.error_message = str5;
        this.server_name = str6;
        this.error_type = str7;
        this.error_phase = mcpEvents$McpAppErrorPhase;
        this.redacted_url = str8;
        this.error_code = l;
    }

    public /* synthetic */ McpEvents$McpAppError(String str, String str2, String str3, String str4, String str5, String str6, String str7, McpEvents$McpAppErrorPhase mcpEvents$McpAppErrorPhase, String str8, Long l, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4, str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : mcpEvents$McpAppErrorPhase, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : str8, (i & 512) != 0 ? null : l);
    }
}
