package com.anthropic.claude.analytics.events;

import defpackage.ao2;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.oo2;
import defpackage.po2;
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
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J:\u0010!\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b\b\u0010 R\u0014\u00101\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u001b¨\u00065"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$ContinueChatButtonPressed", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "Lcom/anthropic/claude/analytics/events/ChatEvents$ContinueChatButtonPressedSource;", "source", "", "is_temporary_chat", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$ContinueChatButtonPressedSource;Ljava/lang/Boolean;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$ContinueChatButtonPressedSource;Ljava/lang/Boolean;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ChatEvents$ContinueChatButtonPressed;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatEvents$ContinueChatButtonPressed;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/anthropic/claude/analytics/events/ChatEvents$ContinueChatButtonPressedSource;", "component4", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$ContinueChatButtonPressedSource;Ljava/lang/Boolean;)Lcom/anthropic/claude/analytics/events/ChatEvents$ContinueChatButtonPressed;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "Lcom/anthropic/claude/analytics/events/ChatEvents$ContinueChatButtonPressedSource;", "getSource", "Ljava/lang/Boolean;", "getEventName", "eventName", "Companion", "oo2", "po2", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatEvents$ContinueChatButtonPressed implements AnalyticsEvent {
    public static final int $stable = 0;
    private final String conversation_uuid;
    private final Boolean is_temporary_chat;
    private final String organization_uuid;
    private final ChatEvents$ContinueChatButtonPressedSource source;
    public static final po2 Companion = new po2();
    private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new ao2(5)), null};

    public /* synthetic */ ChatEvents$ContinueChatButtonPressed(int i, String str, String str2, ChatEvents$ContinueChatButtonPressedSource chatEvents$ContinueChatButtonPressedSource, Boolean bool, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, oo2.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.source = chatEvents$ContinueChatButtonPressedSource;
        if ((i & 8) == 0) {
            this.is_temporary_chat = null;
        } else {
            this.is_temporary_chat = bool;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ChatEvents$ContinueChatButtonPressedSource.Companion.serializer();
    }

    public static /* synthetic */ ChatEvents$ContinueChatButtonPressed copy$default(ChatEvents$ContinueChatButtonPressed chatEvents$ContinueChatButtonPressed, String str, String str2, ChatEvents$ContinueChatButtonPressedSource chatEvents$ContinueChatButtonPressedSource, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatEvents$ContinueChatButtonPressed.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = chatEvents$ContinueChatButtonPressed.conversation_uuid;
        }
        if ((i & 4) != 0) {
            chatEvents$ContinueChatButtonPressedSource = chatEvents$ContinueChatButtonPressed.source;
        }
        if ((i & 8) != 0) {
            bool = chatEvents$ContinueChatButtonPressed.is_temporary_chat;
        }
        return chatEvents$ContinueChatButtonPressed.copy(str, str2, chatEvents$ContinueChatButtonPressedSource, bool);
    }

    public static final /* synthetic */ void write$Self$analytics(ChatEvents$ContinueChatButtonPressed self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.source);
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
    public final ChatEvents$ContinueChatButtonPressedSource getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIs_temporary_chat() {
        return this.is_temporary_chat;
    }

    public final ChatEvents$ContinueChatButtonPressed copy(String organization_uuid, String conversation_uuid, ChatEvents$ContinueChatButtonPressedSource source, Boolean is_temporary_chat) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        source.getClass();
        return new ChatEvents$ContinueChatButtonPressed(organization_uuid, conversation_uuid, source, is_temporary_chat);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatEvents$ContinueChatButtonPressed)) {
            return false;
        }
        ChatEvents$ContinueChatButtonPressed chatEvents$ContinueChatButtonPressed = (ChatEvents$ContinueChatButtonPressed) other;
        return x44.r(this.organization_uuid, chatEvents$ContinueChatButtonPressed.organization_uuid) && x44.r(this.conversation_uuid, chatEvents$ContinueChatButtonPressed.conversation_uuid) && this.source == chatEvents$ContinueChatButtonPressed.source && x44.r(this.is_temporary_chat, chatEvents$ContinueChatButtonPressed.is_temporary_chat);
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_continue_chat_button_pressed";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final ChatEvents$ContinueChatButtonPressedSource getSource() {
        return this.source;
    }

    public int hashCode() {
        int iHashCode = (this.source.hashCode() + kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid)) * 31;
        Boolean bool = this.is_temporary_chat;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final Boolean is_temporary_chat() {
        return this.is_temporary_chat;
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        ChatEvents$ContinueChatButtonPressedSource chatEvents$ContinueChatButtonPressedSource = this.source;
        Boolean bool = this.is_temporary_chat;
        StringBuilder sbR = kgh.r("ContinueChatButtonPressed(organization_uuid=", str, ", conversation_uuid=", str2, ", source=");
        sbR.append(chatEvents$ContinueChatButtonPressedSource);
        sbR.append(", is_temporary_chat=");
        sbR.append(bool);
        sbR.append(")");
        return sbR.toString();
    }

    public ChatEvents$ContinueChatButtonPressed(String str, String str2, ChatEvents$ContinueChatButtonPressedSource chatEvents$ContinueChatButtonPressedSource, Boolean bool) {
        str.getClass();
        str2.getClass();
        chatEvents$ContinueChatButtonPressedSource.getClass();
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.source = chatEvents$ContinueChatButtonPressedSource;
        this.is_temporary_chat = bool;
    }

    public /* synthetic */ ChatEvents$ContinueChatButtonPressed(String str, String str2, ChatEvents$ContinueChatButtonPressedSource chatEvents$ContinueChatButtonPressedSource, Boolean bool, int i, mq5 mq5Var) {
        this(str, str2, chatEvents$ContinueChatButtonPressedSource, (i & 8) != 0 ? null : bool);
    }
}
