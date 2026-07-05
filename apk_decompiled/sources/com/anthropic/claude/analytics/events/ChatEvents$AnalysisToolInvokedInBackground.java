package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qy1;
import defpackage.un2;
import defpackage.vd4;
import defpackage.vn2;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ0\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b\u0006\u0010\u001cR\u0014\u0010+\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0019¨\u0006/"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$AnalysisToolInvokedInBackground", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "", "is_temporary_chat", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ChatEvents$AnalysisToolInvokedInBackground;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatEvents$AnalysisToolInvokedInBackground;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/anthropic/claude/analytics/events/ChatEvents$AnalysisToolInvokedInBackground;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "Ljava/lang/Boolean;", "getEventName", "eventName", "Companion", "un2", "vn2", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatEvents$AnalysisToolInvokedInBackground implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final vn2 Companion = new vn2();
    private final String conversation_uuid;
    private final Boolean is_temporary_chat;
    private final String organization_uuid;

    public /* synthetic */ ChatEvents$AnalysisToolInvokedInBackground(int i, String str, String str2, Boolean bool, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, un2.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        if ((i & 4) == 0) {
            this.is_temporary_chat = null;
        } else {
            this.is_temporary_chat = bool;
        }
    }

    public static /* synthetic */ ChatEvents$AnalysisToolInvokedInBackground copy$default(ChatEvents$AnalysisToolInvokedInBackground chatEvents$AnalysisToolInvokedInBackground, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatEvents$AnalysisToolInvokedInBackground.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = chatEvents$AnalysisToolInvokedInBackground.conversation_uuid;
        }
        if ((i & 4) != 0) {
            bool = chatEvents$AnalysisToolInvokedInBackground.is_temporary_chat;
        }
        return chatEvents$AnalysisToolInvokedInBackground.copy(str, str2, bool);
    }

    public static final /* synthetic */ void write$Self$analytics(ChatEvents$AnalysisToolInvokedInBackground self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        if (!output.E(serialDesc) && self.is_temporary_chat == null) {
            return;
        }
        output.B(serialDesc, 2, zt1.a, self.is_temporary_chat);
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
    public final Boolean getIs_temporary_chat() {
        return this.is_temporary_chat;
    }

    public final ChatEvents$AnalysisToolInvokedInBackground copy(String organization_uuid, String conversation_uuid, Boolean is_temporary_chat) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        return new ChatEvents$AnalysisToolInvokedInBackground(organization_uuid, conversation_uuid, is_temporary_chat);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatEvents$AnalysisToolInvokedInBackground)) {
            return false;
        }
        ChatEvents$AnalysisToolInvokedInBackground chatEvents$AnalysisToolInvokedInBackground = (ChatEvents$AnalysisToolInvokedInBackground) other;
        return x44.r(this.organization_uuid, chatEvents$AnalysisToolInvokedInBackground.organization_uuid) && x44.r(this.conversation_uuid, chatEvents$AnalysisToolInvokedInBackground.conversation_uuid) && x44.r(this.is_temporary_chat, chatEvents$AnalysisToolInvokedInBackground.is_temporary_chat);
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_conversation_analysis_tool_invoked_in_background";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public int hashCode() {
        int iL = kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid);
        Boolean bool = this.is_temporary_chat;
        return iL + (bool == null ? 0 : bool.hashCode());
    }

    public final Boolean is_temporary_chat() {
        return this.is_temporary_chat;
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        return qy1.h(kgh.r("AnalysisToolInvokedInBackground(organization_uuid=", str, ", conversation_uuid=", str2, ", is_temporary_chat="), this.is_temporary_chat, ")");
    }

    public ChatEvents$AnalysisToolInvokedInBackground(String str, String str2, Boolean bool) {
        str.getClass();
        str2.getClass();
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.is_temporary_chat = bool;
    }

    public /* synthetic */ ChatEvents$AnalysisToolInvokedInBackground(String str, String str2, Boolean bool, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : bool);
    }
}
