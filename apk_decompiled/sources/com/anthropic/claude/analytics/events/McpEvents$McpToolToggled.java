package com.anthropic.claude.analytics.events;

import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.c2b;
import defpackage.d2b;
import defpackage.fsh;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mia;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:;BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fB[\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJX\u0010%\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\u00072\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b5\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b6\u0010\u001dR\u0014\u00108\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u001d¨\u0006<"}, d2 = {"com/anthropic/claude/analytics/events/McpEvents$McpToolToggled", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "", "setting", "", ExperienceToggle.DEFAULT_PARAM_KEY, "url", "redacted_url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/McpEvents$McpToolToggled;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/McpEvents$McpToolToggled;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Z", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/McpEvents$McpToolToggled;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "Ljava/util/List;", "getSetting", "Z", "getValue", "getUrl", "getRedacted_url", "getEventName", "eventName", "Companion", "c2b", "d2b", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class McpEvents$McpToolToggled implements AnalyticsEvent {
    public static final int $stable = 8;
    private final String conversation_uuid;
    private final String organization_uuid;
    private final String redacted_url;
    private final List<String> setting;
    private final String url;
    private final boolean value;
    public static final d2b Companion = new d2b();
    private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new mia(20)), null, null, null};

    public /* synthetic */ McpEvents$McpToolToggled(int i, String str, String str2, List list, boolean z, String str3, String str4, vnf vnfVar) {
        if (13 != (i & 13)) {
            gvj.f(i, 13, c2b.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        if ((i & 2) == 0) {
            this.conversation_uuid = null;
        } else {
            this.conversation_uuid = str2;
        }
        this.setting = list;
        this.value = z;
        if ((i & 16) == 0) {
            this.url = null;
        } else {
            this.url = str3;
        }
        if ((i & 32) == 0) {
            this.redacted_url = null;
        } else {
            this.redacted_url = str4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ McpEvents$McpToolToggled copy$default(McpEvents$McpToolToggled mcpEvents$McpToolToggled, String str, String str2, List list, boolean z, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mcpEvents$McpToolToggled.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = mcpEvents$McpToolToggled.conversation_uuid;
        }
        if ((i & 4) != 0) {
            list = mcpEvents$McpToolToggled.setting;
        }
        if ((i & 8) != 0) {
            z = mcpEvents$McpToolToggled.value;
        }
        if ((i & 16) != 0) {
            str3 = mcpEvents$McpToolToggled.url;
        }
        if ((i & 32) != 0) {
            str4 = mcpEvents$McpToolToggled.redacted_url;
        }
        String str5 = str3;
        String str6 = str4;
        return mcpEvents$McpToolToggled.copy(str, str2, list, z, str5, str6);
    }

    public static final /* synthetic */ void write$Self$analytics(McpEvents$McpToolToggled self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        if (output.E(serialDesc) || self.conversation_uuid != null) {
            output.B(serialDesc, 1, srg.a, self.conversation_uuid);
        }
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.setting);
        output.p(serialDesc, 3, self.value);
        if (output.E(serialDesc) || self.url != null) {
            output.B(serialDesc, 4, srg.a, self.url);
        }
        if (!output.E(serialDesc) && self.redacted_url == null) {
            return;
        }
        output.B(serialDesc, 5, srg.a, self.redacted_url);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    public final List<String> component3() {
        return this.setting;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRedacted_url() {
        return this.redacted_url;
    }

    public final McpEvents$McpToolToggled copy(String organization_uuid, String conversation_uuid, List<String> setting, boolean value, String url, String redacted_url) {
        organization_uuid.getClass();
        setting.getClass();
        return new McpEvents$McpToolToggled(organization_uuid, conversation_uuid, setting, value, url, redacted_url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof McpEvents$McpToolToggled)) {
            return false;
        }
        McpEvents$McpToolToggled mcpEvents$McpToolToggled = (McpEvents$McpToolToggled) other;
        return x44.r(this.organization_uuid, mcpEvents$McpToolToggled.organization_uuid) && x44.r(this.conversation_uuid, mcpEvents$McpToolToggled.conversation_uuid) && x44.r(this.setting, mcpEvents$McpToolToggled.setting) && this.value == mcpEvents$McpToolToggled.value && x44.r(this.url, mcpEvents$McpToolToggled.url) && x44.r(this.redacted_url, mcpEvents$McpToolToggled.redacted_url);
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.mcp.tool.toggled";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getRedacted_url() {
        return this.redacted_url;
    }

    public final List<String> getSetting() {
        return this.setting;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.organization_uuid.hashCode() * 31;
        String str = this.conversation_uuid;
        int iP = fsh.p(kgh.m((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.setting), 31, this.value);
        String str2 = this.url;
        int iHashCode2 = (iP + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.redacted_url;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        List<String> list = this.setting;
        boolean z = this.value;
        String str3 = this.url;
        String str4 = this.redacted_url;
        StringBuilder sbR = kgh.r("McpToolToggled(organization_uuid=", str, ", conversation_uuid=", str2, ", setting=");
        sbR.append(list);
        sbR.append(", value=");
        sbR.append(z);
        sbR.append(", url=");
        return vb7.t(sbR, str3, ", redacted_url=", str4, ")");
    }

    public McpEvents$McpToolToggled(String str, String str2, List<String> list, boolean z, String str3, String str4) {
        str.getClass();
        list.getClass();
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.setting = list;
        this.value = z;
        this.url = str3;
        this.redacted_url = str4;
    }

    public /* synthetic */ McpEvents$McpToolToggled(String str, String str2, List list, boolean z, String str3, String str4, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, list, z, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
    }
}
