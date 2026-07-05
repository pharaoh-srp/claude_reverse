package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mia;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.u1b;
import defpackage.v1b;
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
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ:\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u001aR\u0014\u00100\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u001a¨\u00064"}, d2 = {"com/anthropic/claude/analytics/events/McpEvents$McpSuggestionActioned", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "Lcom/anthropic/claude/analytics/events/McpEvents$SuggestionAction;", "action", "directory_uuid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/McpEvents$SuggestionAction;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/McpEvents$SuggestionAction;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/McpEvents$McpSuggestionActioned;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/McpEvents$McpSuggestionActioned;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/anthropic/claude/analytics/events/McpEvents$SuggestionAction;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/McpEvents$SuggestionAction;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/McpEvents$McpSuggestionActioned;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "Lcom/anthropic/claude/analytics/events/McpEvents$SuggestionAction;", "getAction", "getDirectory_uuid", "getEventName", "eventName", "Companion", "u1b", "v1b", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class McpEvents$McpSuggestionActioned implements AnalyticsEvent {
    public static final int $stable = 0;
    private final McpEvents$SuggestionAction action;
    private final String conversation_uuid;
    private final String directory_uuid;
    private final String organization_uuid;
    public static final v1b Companion = new v1b();
    private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new mia(18)), null};

    public /* synthetic */ McpEvents$McpSuggestionActioned(int i, String str, String str2, McpEvents$SuggestionAction mcpEvents$SuggestionAction, String str3, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, u1b.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.action = mcpEvents$SuggestionAction;
        if ((i & 8) == 0) {
            this.directory_uuid = null;
        } else {
            this.directory_uuid = str3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return McpEvents$SuggestionAction.Companion.serializer();
    }

    public static /* synthetic */ McpEvents$McpSuggestionActioned copy$default(McpEvents$McpSuggestionActioned mcpEvents$McpSuggestionActioned, String str, String str2, McpEvents$SuggestionAction mcpEvents$SuggestionAction, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mcpEvents$McpSuggestionActioned.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = mcpEvents$McpSuggestionActioned.conversation_uuid;
        }
        if ((i & 4) != 0) {
            mcpEvents$SuggestionAction = mcpEvents$McpSuggestionActioned.action;
        }
        if ((i & 8) != 0) {
            str3 = mcpEvents$McpSuggestionActioned.directory_uuid;
        }
        return mcpEvents$McpSuggestionActioned.copy(str, str2, mcpEvents$SuggestionAction, str3);
    }

    public static final /* synthetic */ void write$Self$analytics(McpEvents$McpSuggestionActioned self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.action);
        if (!output.E(serialDesc) && self.directory_uuid == null) {
            return;
        }
        output.B(serialDesc, 3, srg.a, self.directory_uuid);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final McpEvents$SuggestionAction getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDirectory_uuid() {
        return this.directory_uuid;
    }

    public final McpEvents$McpSuggestionActioned copy(String organization_uuid, String conversation_uuid, McpEvents$SuggestionAction action, String directory_uuid) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        action.getClass();
        return new McpEvents$McpSuggestionActioned(organization_uuid, conversation_uuid, action, directory_uuid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof McpEvents$McpSuggestionActioned)) {
            return false;
        }
        McpEvents$McpSuggestionActioned mcpEvents$McpSuggestionActioned = (McpEvents$McpSuggestionActioned) other;
        return x44.r(this.organization_uuid, mcpEvents$McpSuggestionActioned.organization_uuid) && x44.r(this.conversation_uuid, mcpEvents$McpSuggestionActioned.conversation_uuid) && this.action == mcpEvents$McpSuggestionActioned.action && x44.r(this.directory_uuid, mcpEvents$McpSuggestionActioned.directory_uuid);
    }

    public final McpEvents$SuggestionAction getAction() {
        return this.action;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    public final String getDirectory_uuid() {
        return this.directory_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.mcp.suggestion.actioned";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public int hashCode() {
        int iHashCode = (this.action.hashCode() + kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid)) * 31;
        String str = this.directory_uuid;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        McpEvents$SuggestionAction mcpEvents$SuggestionAction = this.action;
        String str3 = this.directory_uuid;
        StringBuilder sbR = kgh.r("McpSuggestionActioned(organization_uuid=", str, ", conversation_uuid=", str2, ", action=");
        sbR.append(mcpEvents$SuggestionAction);
        sbR.append(", directory_uuid=");
        sbR.append(str3);
        sbR.append(")");
        return sbR.toString();
    }

    public McpEvents$McpSuggestionActioned(String str, String str2, McpEvents$SuggestionAction mcpEvents$SuggestionAction, String str3) {
        str.getClass();
        str2.getClass();
        mcpEvents$SuggestionAction.getClass();
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.action = mcpEvents$SuggestionAction;
        this.directory_uuid = str3;
    }

    public /* synthetic */ McpEvents$McpSuggestionActioned(String str, String str2, McpEvents$SuggestionAction mcpEvents$SuggestionAction, String str3, int i, mq5 mq5Var) {
        this(str, str2, mcpEvents$SuggestionAction, (i & 8) != 0 ? null : str3);
    }
}
