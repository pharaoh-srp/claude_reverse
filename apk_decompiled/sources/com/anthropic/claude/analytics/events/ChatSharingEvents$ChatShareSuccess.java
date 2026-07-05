package com.anthropic.claude.analytics.events;

import defpackage.e79;
import defpackage.gvj;
import defpackage.hb3;
import defpackage.ib3;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wy2;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ:\u0010 \u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001fR\u0014\u00102\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u001a¨\u00066"}, d2 = {"com/anthropic/claude/analytics/events/ChatSharingEvents$ChatShareSuccess", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "", "message_count", "Lcom/anthropic/claude/analytics/events/ChatSharingEvents$ChatShareVisibility;", "visibility", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/anthropic/claude/analytics/events/ChatSharingEvents$ChatShareVisibility;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/anthropic/claude/analytics/events/ChatSharingEvents$ChatShareVisibility;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ChatSharingEvents$ChatShareSuccess;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatSharingEvents$ChatShareSuccess;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "()Lcom/anthropic/claude/analytics/events/ChatSharingEvents$ChatShareVisibility;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/anthropic/claude/analytics/events/ChatSharingEvents$ChatShareVisibility;)Lcom/anthropic/claude/analytics/events/ChatSharingEvents$ChatShareSuccess;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "Ljava/lang/Integer;", "getMessage_count", "Lcom/anthropic/claude/analytics/events/ChatSharingEvents$ChatShareVisibility;", "getVisibility", "getEventName", "eventName", "Companion", "hb3", "ib3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatSharingEvents$ChatShareSuccess implements AnalyticsEvent {
    public static final int $stable = 0;
    private final String conversation_uuid;
    private final Integer message_count;
    private final String organization_uuid;
    private final ChatSharingEvents$ChatShareVisibility visibility;
    public static final ib3 Companion = new ib3();
    private static final kw9[] $childSerializers = {null, null, null, yb5.w(w1a.F, new wy2(12))};

    public /* synthetic */ ChatSharingEvents$ChatShareSuccess(int i, String str, String str2, Integer num, ChatSharingEvents$ChatShareVisibility chatSharingEvents$ChatShareVisibility, vnf vnfVar) {
        if (11 != (i & 11)) {
            gvj.f(i, 11, hb3.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        if ((i & 4) == 0) {
            this.message_count = null;
        } else {
            this.message_count = num;
        }
        this.visibility = chatSharingEvents$ChatShareVisibility;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ChatSharingEvents$ChatShareVisibility.Companion.serializer();
    }

    public static /* synthetic */ ChatSharingEvents$ChatShareSuccess copy$default(ChatSharingEvents$ChatShareSuccess chatSharingEvents$ChatShareSuccess, String str, String str2, Integer num, ChatSharingEvents$ChatShareVisibility chatSharingEvents$ChatShareVisibility, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatSharingEvents$ChatShareSuccess.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = chatSharingEvents$ChatShareSuccess.conversation_uuid;
        }
        if ((i & 4) != 0) {
            num = chatSharingEvents$ChatShareSuccess.message_count;
        }
        if ((i & 8) != 0) {
            chatSharingEvents$ChatShareVisibility = chatSharingEvents$ChatShareSuccess.visibility;
        }
        return chatSharingEvents$ChatShareSuccess.copy(str, str2, num, chatSharingEvents$ChatShareVisibility);
    }

    public static final /* synthetic */ void write$Self$analytics(ChatSharingEvents$ChatShareSuccess self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        if (output.E(serialDesc) || self.message_count != null) {
            output.B(serialDesc, 2, e79.a, self.message_count);
        }
        output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.visibility);
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
    public final ChatSharingEvents$ChatShareVisibility getVisibility() {
        return this.visibility;
    }

    public final ChatSharingEvents$ChatShareSuccess copy(String organization_uuid, String conversation_uuid, Integer message_count, ChatSharingEvents$ChatShareVisibility visibility) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        visibility.getClass();
        return new ChatSharingEvents$ChatShareSuccess(organization_uuid, conversation_uuid, message_count, visibility);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatSharingEvents$ChatShareSuccess)) {
            return false;
        }
        ChatSharingEvents$ChatShareSuccess chatSharingEvents$ChatShareSuccess = (ChatSharingEvents$ChatShareSuccess) other;
        return x44.r(this.organization_uuid, chatSharingEvents$ChatShareSuccess.organization_uuid) && x44.r(this.conversation_uuid, chatSharingEvents$ChatShareSuccess.conversation_uuid) && x44.r(this.message_count, chatSharingEvents$ChatShareSuccess.message_count) && this.visibility == chatSharingEvents$ChatShareSuccess.visibility;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_chat_share_success";
    }

    public final Integer getMessage_count() {
        return this.message_count;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final ChatSharingEvents$ChatShareVisibility getVisibility() {
        return this.visibility;
    }

    public int hashCode() {
        int iL = kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid);
        Integer num = this.message_count;
        return this.visibility.hashCode() + ((iL + (num == null ? 0 : num.hashCode())) * 31);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        Integer num = this.message_count;
        ChatSharingEvents$ChatShareVisibility chatSharingEvents$ChatShareVisibility = this.visibility;
        StringBuilder sbR = kgh.r("ChatShareSuccess(organization_uuid=", str, ", conversation_uuid=", str2, ", message_count=");
        sbR.append(num);
        sbR.append(", visibility=");
        sbR.append(chatSharingEvents$ChatShareVisibility);
        sbR.append(")");
        return sbR.toString();
    }

    public ChatSharingEvents$ChatShareSuccess(String str, String str2, Integer num, ChatSharingEvents$ChatShareVisibility chatSharingEvents$ChatShareVisibility) {
        str.getClass();
        str2.getClass();
        chatSharingEvents$ChatShareVisibility.getClass();
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.message_count = num;
        this.visibility = chatSharingEvents$ChatShareVisibility;
    }

    public /* synthetic */ ChatSharingEvents$ChatShareSuccess(String str, String str2, Integer num, ChatSharingEvents$ChatShareVisibility chatSharingEvents$ChatShareVisibility, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : num, chatSharingEvents$ChatShareVisibility);
    }
}
