package com.anthropic.claude.analytics.events;

import defpackage.ao2;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.pq2;
import defpackage.qq2;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u0000 82\u00020\u0001:\u00029:BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJT\u0010%\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\u00052\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b\u0006\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b4\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b5\u0010\u001dR\u0014\u00107\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u001d¨\u0006;"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$RetryCompletion", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "", "is_temporary_chat", "Lcom/anthropic/claude/analytics/events/ChatEvents$RetryCompletionReason;", "reason", "project_id", "retried_from_message_uuid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/anthropic/claude/analytics/events/ChatEvents$RetryCompletionReason;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/anthropic/claude/analytics/events/ChatEvents$RetryCompletionReason;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ChatEvents$RetryCompletion;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatEvents$RetryCompletion;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "component4", "()Lcom/anthropic/claude/analytics/events/ChatEvents$RetryCompletionReason;", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/anthropic/claude/analytics/events/ChatEvents$RetryCompletionReason;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/ChatEvents$RetryCompletion;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "Ljava/lang/Boolean;", "Lcom/anthropic/claude/analytics/events/ChatEvents$RetryCompletionReason;", "getReason", "getProject_id", "getRetried_from_message_uuid", "getEventName", "eventName", "Companion", "pq2", "qq2", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatEvents$RetryCompletion implements AnalyticsEvent {
    public static final int $stable = 0;
    private final String conversation_uuid;
    private final Boolean is_temporary_chat;
    private final String organization_uuid;
    private final String project_id;
    private final ChatEvents$RetryCompletionReason reason;
    private final String retried_from_message_uuid;
    public static final qq2 Companion = new qq2();
    private static final kw9[] $childSerializers = {null, null, null, yb5.w(w1a.F, new ao2(25)), null, null};

    public /* synthetic */ ChatEvents$RetryCompletion(int i, String str, String str2, Boolean bool, ChatEvents$RetryCompletionReason chatEvents$RetryCompletionReason, String str3, String str4, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, pq2.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        if ((i & 4) == 0) {
            this.is_temporary_chat = null;
        } else {
            this.is_temporary_chat = bool;
        }
        if ((i & 8) == 0) {
            this.reason = null;
        } else {
            this.reason = chatEvents$RetryCompletionReason;
        }
        if ((i & 16) == 0) {
            this.project_id = null;
        } else {
            this.project_id = str3;
        }
        if ((i & 32) == 0) {
            this.retried_from_message_uuid = null;
        } else {
            this.retried_from_message_uuid = str4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ChatEvents$RetryCompletionReason.Companion.serializer();
    }

    public static /* synthetic */ ChatEvents$RetryCompletion copy$default(ChatEvents$RetryCompletion chatEvents$RetryCompletion, String str, String str2, Boolean bool, ChatEvents$RetryCompletionReason chatEvents$RetryCompletionReason, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatEvents$RetryCompletion.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = chatEvents$RetryCompletion.conversation_uuid;
        }
        if ((i & 4) != 0) {
            bool = chatEvents$RetryCompletion.is_temporary_chat;
        }
        if ((i & 8) != 0) {
            chatEvents$RetryCompletionReason = chatEvents$RetryCompletion.reason;
        }
        if ((i & 16) != 0) {
            str3 = chatEvents$RetryCompletion.project_id;
        }
        if ((i & 32) != 0) {
            str4 = chatEvents$RetryCompletion.retried_from_message_uuid;
        }
        String str5 = str3;
        String str6 = str4;
        return chatEvents$RetryCompletion.copy(str, str2, bool, chatEvents$RetryCompletionReason, str5, str6);
    }

    public static final /* synthetic */ void write$Self$analytics(ChatEvents$RetryCompletion self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        if (output.E(serialDesc) || self.is_temporary_chat != null) {
            output.B(serialDesc, 2, zt1.a, self.is_temporary_chat);
        }
        if (output.E(serialDesc) || self.reason != null) {
            output.B(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.reason);
        }
        if (output.E(serialDesc) || self.project_id != null) {
            output.B(serialDesc, 4, srg.a, self.project_id);
        }
        if (!output.E(serialDesc) && self.retried_from_message_uuid == null) {
            return;
        }
        output.B(serialDesc, 5, srg.a, self.retried_from_message_uuid);
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

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ChatEvents$RetryCompletionReason getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getProject_id() {
        return this.project_id;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRetried_from_message_uuid() {
        return this.retried_from_message_uuid;
    }

    public final ChatEvents$RetryCompletion copy(String organization_uuid, String conversation_uuid, Boolean is_temporary_chat, ChatEvents$RetryCompletionReason reason, String project_id, String retried_from_message_uuid) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        return new ChatEvents$RetryCompletion(organization_uuid, conversation_uuid, is_temporary_chat, reason, project_id, retried_from_message_uuid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatEvents$RetryCompletion)) {
            return false;
        }
        ChatEvents$RetryCompletion chatEvents$RetryCompletion = (ChatEvents$RetryCompletion) other;
        return x44.r(this.organization_uuid, chatEvents$RetryCompletion.organization_uuid) && x44.r(this.conversation_uuid, chatEvents$RetryCompletion.conversation_uuid) && x44.r(this.is_temporary_chat, chatEvents$RetryCompletion.is_temporary_chat) && this.reason == chatEvents$RetryCompletion.reason && x44.r(this.project_id, chatEvents$RetryCompletion.project_id) && x44.r(this.retried_from_message_uuid, chatEvents$RetryCompletion.retried_from_message_uuid);
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_conversation_retry_completion";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getProject_id() {
        return this.project_id;
    }

    public final ChatEvents$RetryCompletionReason getReason() {
        return this.reason;
    }

    public final String getRetried_from_message_uuid() {
        return this.retried_from_message_uuid;
    }

    public int hashCode() {
        int iL = kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid);
        Boolean bool = this.is_temporary_chat;
        int iHashCode = (iL + (bool == null ? 0 : bool.hashCode())) * 31;
        ChatEvents$RetryCompletionReason chatEvents$RetryCompletionReason = this.reason;
        int iHashCode2 = (iHashCode + (chatEvents$RetryCompletionReason == null ? 0 : chatEvents$RetryCompletionReason.hashCode())) * 31;
        String str = this.project_id;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.retried_from_message_uuid;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final Boolean is_temporary_chat() {
        return this.is_temporary_chat;
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        Boolean bool = this.is_temporary_chat;
        ChatEvents$RetryCompletionReason chatEvents$RetryCompletionReason = this.reason;
        String str3 = this.project_id;
        String str4 = this.retried_from_message_uuid;
        StringBuilder sbR = kgh.r("RetryCompletion(organization_uuid=", str, ", conversation_uuid=", str2, ", is_temporary_chat=");
        sbR.append(bool);
        sbR.append(", reason=");
        sbR.append(chatEvents$RetryCompletionReason);
        sbR.append(", project_id=");
        return vb7.t(sbR, str3, ", retried_from_message_uuid=", str4, ")");
    }

    public ChatEvents$RetryCompletion(String str, String str2, Boolean bool, ChatEvents$RetryCompletionReason chatEvents$RetryCompletionReason, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.is_temporary_chat = bool;
        this.reason = chatEvents$RetryCompletionReason;
        this.project_id = str3;
        this.retried_from_message_uuid = str4;
    }

    public /* synthetic */ ChatEvents$RetryCompletion(String str, String str2, Boolean bool, ChatEvents$RetryCompletionReason chatEvents$RetryCompletionReason, String str3, String str4, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : chatEvents$RetryCompletionReason, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
    }
}
