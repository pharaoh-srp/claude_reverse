package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.m1b;
import defpackage.mdj;
import defpackage.n1b;
import defpackage.onf;
import defpackage.qy1;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000267B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJL\u0010\"\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010\u001dJ\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b0\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b1\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b2\u0010\u001dR\u0014\u00104\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u001b¨\u00068"}, d2 = {"com/anthropic/claude/analytics/events/McpEvents$McpPromptsUsed", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "", "argument_count", "assistant_messages", "user_messages", "text_messages", "image_messages", "<init>", "(Ljava/lang/String;IIIII)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;IIIIILvnf;)V", "Lcom/anthropic/claude/analytics/events/McpEvents$McpPromptsUsed;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/McpEvents$McpPromptsUsed;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;IIIII)Lcom/anthropic/claude/analytics/events/McpEvents$McpPromptsUsed;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "I", "getArgument_count", "getAssistant_messages", "getUser_messages", "getText_messages", "getImage_messages", "getEventName", "eventName", "Companion", "m1b", "n1b", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class McpEvents$McpPromptsUsed implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final n1b Companion = new n1b();
    private final int argument_count;
    private final int assistant_messages;
    private final int image_messages;
    private final String organization_uuid;
    private final int text_messages;
    private final int user_messages;

    public /* synthetic */ McpEvents$McpPromptsUsed(int i, String str, int i2, int i3, int i4, int i5, int i6, vnf vnfVar) {
        if (63 != (i & 63)) {
            gvj.f(i, 63, m1b.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.argument_count = i2;
        this.assistant_messages = i3;
        this.user_messages = i4;
        this.text_messages = i5;
        this.image_messages = i6;
    }

    public static /* synthetic */ McpEvents$McpPromptsUsed copy$default(McpEvents$McpPromptsUsed mcpEvents$McpPromptsUsed, String str, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = mcpEvents$McpPromptsUsed.organization_uuid;
        }
        if ((i6 & 2) != 0) {
            i = mcpEvents$McpPromptsUsed.argument_count;
        }
        if ((i6 & 4) != 0) {
            i2 = mcpEvents$McpPromptsUsed.assistant_messages;
        }
        if ((i6 & 8) != 0) {
            i3 = mcpEvents$McpPromptsUsed.user_messages;
        }
        if ((i6 & 16) != 0) {
            i4 = mcpEvents$McpPromptsUsed.text_messages;
        }
        if ((i6 & 32) != 0) {
            i5 = mcpEvents$McpPromptsUsed.image_messages;
        }
        int i7 = i4;
        int i8 = i5;
        return mcpEvents$McpPromptsUsed.copy(str, i, i2, i3, i7, i8);
    }

    public static final /* synthetic */ void write$Self$analytics(McpEvents$McpPromptsUsed self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        output.l(1, self.argument_count, serialDesc);
        output.l(2, self.assistant_messages, serialDesc);
        output.l(3, self.user_messages, serialDesc);
        output.l(4, self.text_messages, serialDesc);
        output.l(5, self.image_messages, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getArgument_count() {
        return this.argument_count;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAssistant_messages() {
        return this.assistant_messages;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getUser_messages() {
        return this.user_messages;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getText_messages() {
        return this.text_messages;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getImage_messages() {
        return this.image_messages;
    }

    public final McpEvents$McpPromptsUsed copy(String organization_uuid, int argument_count, int assistant_messages, int user_messages, int text_messages, int image_messages) {
        organization_uuid.getClass();
        return new McpEvents$McpPromptsUsed(organization_uuid, argument_count, assistant_messages, user_messages, text_messages, image_messages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof McpEvents$McpPromptsUsed)) {
            return false;
        }
        McpEvents$McpPromptsUsed mcpEvents$McpPromptsUsed = (McpEvents$McpPromptsUsed) other;
        return x44.r(this.organization_uuid, mcpEvents$McpPromptsUsed.organization_uuid) && this.argument_count == mcpEvents$McpPromptsUsed.argument_count && this.assistant_messages == mcpEvents$McpPromptsUsed.assistant_messages && this.user_messages == mcpEvents$McpPromptsUsed.user_messages && this.text_messages == mcpEvents$McpPromptsUsed.text_messages && this.image_messages == mcpEvents$McpPromptsUsed.image_messages;
    }

    public final int getArgument_count() {
        return this.argument_count;
    }

    public final int getAssistant_messages() {
        return this.assistant_messages;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mcp.prompts.used";
    }

    public final int getImage_messages() {
        return this.image_messages;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final int getText_messages() {
        return this.text_messages;
    }

    public final int getUser_messages() {
        return this.user_messages;
    }

    public int hashCode() {
        return Integer.hashCode(this.image_messages) + vb7.c(this.text_messages, vb7.c(this.user_messages, vb7.c(this.assistant_messages, vb7.c(this.argument_count, this.organization_uuid.hashCode() * 31, 31), 31), 31), 31);
    }

    public String toString() {
        String str = this.organization_uuid;
        int i = this.argument_count;
        int i2 = this.assistant_messages;
        int i3 = this.user_messages;
        int i4 = this.text_messages;
        int i5 = this.image_messages;
        StringBuilder sbP = ij0.p("McpPromptsUsed(organization_uuid=", str, i, ", argument_count=", ", assistant_messages=");
        qy1.k(i2, i3, ", user_messages=", ", text_messages=", sbP);
        sbP.append(i4);
        sbP.append(", image_messages=");
        sbP.append(i5);
        sbP.append(")");
        return sbP.toString();
    }

    public McpEvents$McpPromptsUsed(String str, int i, int i2, int i3, int i4, int i5) {
        str.getClass();
        this.organization_uuid = str;
        this.argument_count = i;
        this.assistant_messages = i2;
        this.user_messages = i3;
        this.text_messages = i4;
        this.image_messages = i5;
    }
}
