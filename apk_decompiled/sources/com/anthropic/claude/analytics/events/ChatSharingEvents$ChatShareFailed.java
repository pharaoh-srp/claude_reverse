package com.anthropic.claude.analytics.events;

import defpackage.e79;
import defpackage.fb3;
import defpackage.gb3;
import defpackage.grc;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J:\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b-\u0010\u0019R\u0014\u0010/\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0019¨\u00063"}, d2 = {"com/anthropic/claude/analytics/events/ChatSharingEvents$ChatShareFailed", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "", "message_count", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ChatSharingEvents$ChatShareFailed;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatSharingEvents$ChatShareFailed;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/ChatSharingEvents$ChatShareFailed;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "Ljava/lang/Integer;", "getMessage_count", "getCause", "getEventName", "eventName", "Companion", "fb3", "gb3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatSharingEvents$ChatShareFailed implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final gb3 Companion = new gb3();
    private final String cause;
    private final String conversation_uuid;
    private final Integer message_count;
    private final String organization_uuid;

    public /* synthetic */ ChatSharingEvents$ChatShareFailed(int i, String str, String str2, Integer num, String str3, vnf vnfVar) {
        if (11 != (i & 11)) {
            gvj.f(i, 11, fb3.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        if ((i & 4) == 0) {
            this.message_count = null;
        } else {
            this.message_count = num;
        }
        this.cause = str3;
    }

    public static /* synthetic */ ChatSharingEvents$ChatShareFailed copy$default(ChatSharingEvents$ChatShareFailed chatSharingEvents$ChatShareFailed, String str, String str2, Integer num, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatSharingEvents$ChatShareFailed.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = chatSharingEvents$ChatShareFailed.conversation_uuid;
        }
        if ((i & 4) != 0) {
            num = chatSharingEvents$ChatShareFailed.message_count;
        }
        if ((i & 8) != 0) {
            str3 = chatSharingEvents$ChatShareFailed.cause;
        }
        return chatSharingEvents$ChatShareFailed.copy(str, str2, num, str3);
    }

    public static final /* synthetic */ void write$Self$analytics(ChatSharingEvents$ChatShareFailed self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        if (output.E(serialDesc) || self.message_count != null) {
            output.B(serialDesc, 2, e79.a, self.message_count);
        }
        output.q(serialDesc, 3, self.cause);
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
    public final Integer getMessage_count() {
        return this.message_count;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCause() {
        return this.cause;
    }

    public final ChatSharingEvents$ChatShareFailed copy(String organization_uuid, String conversation_uuid, Integer message_count, String cause) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        cause.getClass();
        return new ChatSharingEvents$ChatShareFailed(organization_uuid, conversation_uuid, message_count, cause);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatSharingEvents$ChatShareFailed)) {
            return false;
        }
        ChatSharingEvents$ChatShareFailed chatSharingEvents$ChatShareFailed = (ChatSharingEvents$ChatShareFailed) other;
        return x44.r(this.organization_uuid, chatSharingEvents$ChatShareFailed.organization_uuid) && x44.r(this.conversation_uuid, chatSharingEvents$ChatShareFailed.conversation_uuid) && x44.r(this.message_count, chatSharingEvents$ChatShareFailed.message_count) && x44.r(this.cause, chatSharingEvents$ChatShareFailed.cause);
    }

    public final String getCause() {
        return this.cause;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_chat_share_failed";
    }

    public final Integer getMessage_count() {
        return this.message_count;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public int hashCode() {
        int iL = kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid);
        Integer num = this.message_count;
        return this.cause.hashCode() + ((iL + (num == null ? 0 : num.hashCode())) * 31);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        Integer num = this.message_count;
        String str3 = this.cause;
        StringBuilder sbR = kgh.r("ChatShareFailed(organization_uuid=", str, ", conversation_uuid=", str2, ", message_count=");
        sbR.append(num);
        sbR.append(", cause=");
        sbR.append(str3);
        sbR.append(")");
        return sbR.toString();
    }

    public ChatSharingEvents$ChatShareFailed(String str, String str2, Integer num, String str3) {
        grc.B(str, str2, str3);
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.message_count = num;
        this.cause = str3;
    }

    public /* synthetic */ ChatSharingEvents$ChatShareFailed(String str, String str2, Integer num, String str3, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : num, str3);
    }
}
