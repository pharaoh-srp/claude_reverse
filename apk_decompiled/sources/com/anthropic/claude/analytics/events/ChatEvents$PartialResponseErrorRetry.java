package com.anthropic.claude.analytics.events;

import defpackage.fsh;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.up2;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.vp2;
import defpackage.x44;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ:\u0010 \u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b\u0007\u0010\u001fR\u0014\u00100\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u001a¨\u00064"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$PartialResponseErrorRetry", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "", "chat_refresh_successful", "is_temporary_chat", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ChatEvents$PartialResponseErrorRetry;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatEvents$PartialResponseErrorRetry;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;)Lcom/anthropic/claude/analytics/events/ChatEvents$PartialResponseErrorRetry;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "Z", "getChat_refresh_successful", "Ljava/lang/Boolean;", "getEventName", "eventName", "Companion", "up2", "vp2", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatEvents$PartialResponseErrorRetry implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final vp2 Companion = new vp2();
    private final boolean chat_refresh_successful;
    private final String conversation_uuid;
    private final Boolean is_temporary_chat;
    private final String organization_uuid;

    public /* synthetic */ ChatEvents$PartialResponseErrorRetry(int i, String str, String str2, boolean z, Boolean bool, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, up2.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.chat_refresh_successful = z;
        if ((i & 8) == 0) {
            this.is_temporary_chat = null;
        } else {
            this.is_temporary_chat = bool;
        }
    }

    public static /* synthetic */ ChatEvents$PartialResponseErrorRetry copy$default(ChatEvents$PartialResponseErrorRetry chatEvents$PartialResponseErrorRetry, String str, String str2, boolean z, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatEvents$PartialResponseErrorRetry.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = chatEvents$PartialResponseErrorRetry.conversation_uuid;
        }
        if ((i & 4) != 0) {
            z = chatEvents$PartialResponseErrorRetry.chat_refresh_successful;
        }
        if ((i & 8) != 0) {
            bool = chatEvents$PartialResponseErrorRetry.is_temporary_chat;
        }
        return chatEvents$PartialResponseErrorRetry.copy(str, str2, z, bool);
    }

    public static final /* synthetic */ void write$Self$analytics(ChatEvents$PartialResponseErrorRetry self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.p(serialDesc, 2, self.chat_refresh_successful);
        if (!output.E(serialDesc) && self.is_temporary_chat == null) {
            return;
        }
        output.B(serialDesc, 3, zt1.a, self.is_temporary_chat);
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
    public final boolean getChat_refresh_successful() {
        return this.chat_refresh_successful;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIs_temporary_chat() {
        return this.is_temporary_chat;
    }

    public final ChatEvents$PartialResponseErrorRetry copy(String organization_uuid, String conversation_uuid, boolean chat_refresh_successful, Boolean is_temporary_chat) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        return new ChatEvents$PartialResponseErrorRetry(organization_uuid, conversation_uuid, chat_refresh_successful, is_temporary_chat);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatEvents$PartialResponseErrorRetry)) {
            return false;
        }
        ChatEvents$PartialResponseErrorRetry chatEvents$PartialResponseErrorRetry = (ChatEvents$PartialResponseErrorRetry) other;
        return x44.r(this.organization_uuid, chatEvents$PartialResponseErrorRetry.organization_uuid) && x44.r(this.conversation_uuid, chatEvents$PartialResponseErrorRetry.conversation_uuid) && this.chat_refresh_successful == chatEvents$PartialResponseErrorRetry.chat_refresh_successful && x44.r(this.is_temporary_chat, chatEvents$PartialResponseErrorRetry.is_temporary_chat);
    }

    public final boolean getChat_refresh_successful() {
        return this.chat_refresh_successful;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_conversation_partial_response_error_retry";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public int hashCode() {
        int iP = fsh.p(kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid), 31, this.chat_refresh_successful);
        Boolean bool = this.is_temporary_chat;
        return iP + (bool == null ? 0 : bool.hashCode());
    }

    public final Boolean is_temporary_chat() {
        return this.is_temporary_chat;
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        boolean z = this.chat_refresh_successful;
        Boolean bool = this.is_temporary_chat;
        StringBuilder sbR = kgh.r("PartialResponseErrorRetry(organization_uuid=", str, ", conversation_uuid=", str2, ", chat_refresh_successful=");
        sbR.append(z);
        sbR.append(", is_temporary_chat=");
        sbR.append(bool);
        sbR.append(")");
        return sbR.toString();
    }

    public ChatEvents$PartialResponseErrorRetry(String str, String str2, boolean z, Boolean bool) {
        str.getClass();
        str2.getClass();
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.chat_refresh_successful = z;
        this.is_temporary_chat = bool;
    }

    public /* synthetic */ ChatEvents$PartialResponseErrorRetry(String str, String str2, boolean z, Boolean bool, int i, mq5 mq5Var) {
        this(str, str2, z, (i & 8) != 0 ? null : bool);
    }
}
