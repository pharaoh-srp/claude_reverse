package com.anthropic.claude.analytics.events;

import defpackage.e79;
import defpackage.gvj;
import defpackage.kb3;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.lb3;
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
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000278B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010 JD\u0010\"\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010 R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b3\u0010 R\u0014\u00105\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u001b¨\u00069"}, d2 = {"com/anthropic/claude/analytics/events/ChatSharingEvents$ChatVisibilityChanged", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "", "message_count", "Lcom/anthropic/claude/analytics/events/ChatSharingEvents$ChatShareVisibility;", "from_visibility", "to_visibility", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/anthropic/claude/analytics/events/ChatSharingEvents$ChatShareVisibility;Lcom/anthropic/claude/analytics/events/ChatSharingEvents$ChatShareVisibility;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/anthropic/claude/analytics/events/ChatSharingEvents$ChatShareVisibility;Lcom/anthropic/claude/analytics/events/ChatSharingEvents$ChatShareVisibility;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ChatSharingEvents$ChatVisibilityChanged;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatSharingEvents$ChatVisibilityChanged;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "()Lcom/anthropic/claude/analytics/events/ChatSharingEvents$ChatShareVisibility;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/anthropic/claude/analytics/events/ChatSharingEvents$ChatShareVisibility;Lcom/anthropic/claude/analytics/events/ChatSharingEvents$ChatShareVisibility;)Lcom/anthropic/claude/analytics/events/ChatSharingEvents$ChatVisibilityChanged;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "Ljava/lang/Integer;", "getMessage_count", "Lcom/anthropic/claude/analytics/events/ChatSharingEvents$ChatShareVisibility;", "getFrom_visibility", "getTo_visibility", "getEventName", "eventName", "Companion", "kb3", "lb3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatSharingEvents$ChatVisibilityChanged implements AnalyticsEvent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final lb3 Companion = new lb3();
    private final String conversation_uuid;
    private final ChatSharingEvents$ChatShareVisibility from_visibility;
    private final Integer message_count;
    private final String organization_uuid;
    private final ChatSharingEvents$ChatShareVisibility to_visibility;

    static {
        wy2 wy2Var = new wy2(14);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, yb5.w(w1aVar, wy2Var), yb5.w(w1aVar, new wy2(15))};
    }

    public /* synthetic */ ChatSharingEvents$ChatVisibilityChanged(int i, String str, String str2, Integer num, ChatSharingEvents$ChatShareVisibility chatSharingEvents$ChatShareVisibility, ChatSharingEvents$ChatShareVisibility chatSharingEvents$ChatShareVisibility2, vnf vnfVar) {
        if (27 != (i & 27)) {
            gvj.f(i, 27, kb3.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        if ((i & 4) == 0) {
            this.message_count = null;
        } else {
            this.message_count = num;
        }
        this.from_visibility = chatSharingEvents$ChatShareVisibility;
        this.to_visibility = chatSharingEvents$ChatShareVisibility2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ChatSharingEvents$ChatShareVisibility.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return ChatSharingEvents$ChatShareVisibility.Companion.serializer();
    }

    public static /* synthetic */ ChatSharingEvents$ChatVisibilityChanged copy$default(ChatSharingEvents$ChatVisibilityChanged chatSharingEvents$ChatVisibilityChanged, String str, String str2, Integer num, ChatSharingEvents$ChatShareVisibility chatSharingEvents$ChatShareVisibility, ChatSharingEvents$ChatShareVisibility chatSharingEvents$ChatShareVisibility2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatSharingEvents$ChatVisibilityChanged.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = chatSharingEvents$ChatVisibilityChanged.conversation_uuid;
        }
        if ((i & 4) != 0) {
            num = chatSharingEvents$ChatVisibilityChanged.message_count;
        }
        if ((i & 8) != 0) {
            chatSharingEvents$ChatShareVisibility = chatSharingEvents$ChatVisibilityChanged.from_visibility;
        }
        if ((i & 16) != 0) {
            chatSharingEvents$ChatShareVisibility2 = chatSharingEvents$ChatVisibilityChanged.to_visibility;
        }
        ChatSharingEvents$ChatShareVisibility chatSharingEvents$ChatShareVisibility3 = chatSharingEvents$ChatShareVisibility2;
        Integer num2 = num;
        return chatSharingEvents$ChatVisibilityChanged.copy(str, str2, num2, chatSharingEvents$ChatShareVisibility, chatSharingEvents$ChatShareVisibility3);
    }

    public static final /* synthetic */ void write$Self$analytics(ChatSharingEvents$ChatVisibilityChanged self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        if (output.E(serialDesc) || self.message_count != null) {
            output.B(serialDesc, 2, e79.a, self.message_count);
        }
        output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.from_visibility);
        output.r(serialDesc, 4, (znf) kw9VarArr[4].getValue(), self.to_visibility);
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
    public final ChatSharingEvents$ChatShareVisibility getFrom_visibility() {
        return this.from_visibility;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ChatSharingEvents$ChatShareVisibility getTo_visibility() {
        return this.to_visibility;
    }

    public final ChatSharingEvents$ChatVisibilityChanged copy(String organization_uuid, String conversation_uuid, Integer message_count, ChatSharingEvents$ChatShareVisibility from_visibility, ChatSharingEvents$ChatShareVisibility to_visibility) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        from_visibility.getClass();
        to_visibility.getClass();
        return new ChatSharingEvents$ChatVisibilityChanged(organization_uuid, conversation_uuid, message_count, from_visibility, to_visibility);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatSharingEvents$ChatVisibilityChanged)) {
            return false;
        }
        ChatSharingEvents$ChatVisibilityChanged chatSharingEvents$ChatVisibilityChanged = (ChatSharingEvents$ChatVisibilityChanged) other;
        return x44.r(this.organization_uuid, chatSharingEvents$ChatVisibilityChanged.organization_uuid) && x44.r(this.conversation_uuid, chatSharingEvents$ChatVisibilityChanged.conversation_uuid) && x44.r(this.message_count, chatSharingEvents$ChatVisibilityChanged.message_count) && this.from_visibility == chatSharingEvents$ChatVisibilityChanged.from_visibility && this.to_visibility == chatSharingEvents$ChatVisibilityChanged.to_visibility;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_chat_visibility_changed";
    }

    public final ChatSharingEvents$ChatShareVisibility getFrom_visibility() {
        return this.from_visibility;
    }

    public final Integer getMessage_count() {
        return this.message_count;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final ChatSharingEvents$ChatShareVisibility getTo_visibility() {
        return this.to_visibility;
    }

    public int hashCode() {
        int iL = kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid);
        Integer num = this.message_count;
        return this.to_visibility.hashCode() + ((this.from_visibility.hashCode() + ((iL + (num == null ? 0 : num.hashCode())) * 31)) * 31);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        Integer num = this.message_count;
        ChatSharingEvents$ChatShareVisibility chatSharingEvents$ChatShareVisibility = this.from_visibility;
        ChatSharingEvents$ChatShareVisibility chatSharingEvents$ChatShareVisibility2 = this.to_visibility;
        StringBuilder sbR = kgh.r("ChatVisibilityChanged(organization_uuid=", str, ", conversation_uuid=", str2, ", message_count=");
        sbR.append(num);
        sbR.append(", from_visibility=");
        sbR.append(chatSharingEvents$ChatShareVisibility);
        sbR.append(", to_visibility=");
        sbR.append(chatSharingEvents$ChatShareVisibility2);
        sbR.append(")");
        return sbR.toString();
    }

    public ChatSharingEvents$ChatVisibilityChanged(String str, String str2, Integer num, ChatSharingEvents$ChatShareVisibility chatSharingEvents$ChatShareVisibility, ChatSharingEvents$ChatShareVisibility chatSharingEvents$ChatShareVisibility2) {
        str.getClass();
        str2.getClass();
        chatSharingEvents$ChatShareVisibility.getClass();
        chatSharingEvents$ChatShareVisibility2.getClass();
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.message_count = num;
        this.from_visibility = chatSharingEvents$ChatShareVisibility;
        this.to_visibility = chatSharingEvents$ChatShareVisibility2;
    }

    public /* synthetic */ ChatSharingEvents$ChatVisibilityChanged(String str, String str2, Integer num, ChatSharingEvents$ChatShareVisibility chatSharingEvents$ChatShareVisibility, ChatSharingEvents$ChatShareVisibility chatSharingEvents$ChatShareVisibility2, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : num, chatSharingEvents$ChatShareVisibility, chatSharingEvents$ChatShareVisibility2);
    }
}
