package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wy2;
import defpackage.x44;
import defpackage.yb5;
import defpackage.yy2;
import defpackage.znf;
import defpackage.zy2;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;<B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJN\u0010%\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b7\u0010\u001dR\u0014\u00109\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u001d¨\u0006="}, d2 = {"com/anthropic/claude/analytics/events/ChatMessageActionEvents$ChatMessageActionClicked", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "chat_uuid", "message_uuid", "Lcom/anthropic/claude/analytics/events/ChatMessageActionEvents$ActionSource;", "action_source", "Lcom/anthropic/claude/analytics/events/ChatMessageActionEvents$ChatMessageAction;", "action", "input_mode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatMessageActionEvents$ActionSource;Lcom/anthropic/claude/analytics/events/ChatMessageActionEvents$ChatMessageAction;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatMessageActionEvents$ActionSource;Lcom/anthropic/claude/analytics/events/ChatMessageActionEvents$ChatMessageAction;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ChatMessageActionEvents$ChatMessageActionClicked;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatMessageActionEvents$ChatMessageActionClicked;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/anthropic/claude/analytics/events/ChatMessageActionEvents$ActionSource;", "component5", "()Lcom/anthropic/claude/analytics/events/ChatMessageActionEvents$ChatMessageAction;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatMessageActionEvents$ActionSource;Lcom/anthropic/claude/analytics/events/ChatMessageActionEvents$ChatMessageAction;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/ChatMessageActionEvents$ChatMessageActionClicked;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getChat_uuid", "getMessage_uuid", "Lcom/anthropic/claude/analytics/events/ChatMessageActionEvents$ActionSource;", "getAction_source", "Lcom/anthropic/claude/analytics/events/ChatMessageActionEvents$ChatMessageAction;", "getAction", "getInput_mode", "getEventName", "eventName", "Companion", "yy2", "zy2", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatMessageActionEvents$ChatMessageActionClicked implements AnalyticsEvent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final zy2 Companion = new zy2();
    private final ChatMessageActionEvents$ChatMessageAction action;
    private final ChatMessageActionEvents$ActionSource action_source;
    private final String chat_uuid;
    private final String input_mode;
    private final String message_uuid;
    private final String organization_uuid;

    static {
        wy2 wy2Var = new wy2(1);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, yb5.w(w1aVar, wy2Var), yb5.w(w1aVar, new wy2(2)), null};
    }

    public /* synthetic */ ChatMessageActionEvents$ChatMessageActionClicked(int i, String str, String str2, String str3, ChatMessageActionEvents$ActionSource chatMessageActionEvents$ActionSource, ChatMessageActionEvents$ChatMessageAction chatMessageActionEvents$ChatMessageAction, String str4, vnf vnfVar) {
        if (31 != (i & 31)) {
            gvj.f(i, 31, yy2.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.chat_uuid = str2;
        this.message_uuid = str3;
        this.action_source = chatMessageActionEvents$ActionSource;
        this.action = chatMessageActionEvents$ChatMessageAction;
        if ((i & 32) == 0) {
            this.input_mode = null;
        } else {
            this.input_mode = str4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ChatMessageActionEvents$ActionSource.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return ChatMessageActionEvents$ChatMessageAction.Companion.serializer();
    }

    public static /* synthetic */ ChatMessageActionEvents$ChatMessageActionClicked copy$default(ChatMessageActionEvents$ChatMessageActionClicked chatMessageActionEvents$ChatMessageActionClicked, String str, String str2, String str3, ChatMessageActionEvents$ActionSource chatMessageActionEvents$ActionSource, ChatMessageActionEvents$ChatMessageAction chatMessageActionEvents$ChatMessageAction, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatMessageActionEvents$ChatMessageActionClicked.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = chatMessageActionEvents$ChatMessageActionClicked.chat_uuid;
        }
        if ((i & 4) != 0) {
            str3 = chatMessageActionEvents$ChatMessageActionClicked.message_uuid;
        }
        if ((i & 8) != 0) {
            chatMessageActionEvents$ActionSource = chatMessageActionEvents$ChatMessageActionClicked.action_source;
        }
        if ((i & 16) != 0) {
            chatMessageActionEvents$ChatMessageAction = chatMessageActionEvents$ChatMessageActionClicked.action;
        }
        if ((i & 32) != 0) {
            str4 = chatMessageActionEvents$ChatMessageActionClicked.input_mode;
        }
        ChatMessageActionEvents$ChatMessageAction chatMessageActionEvents$ChatMessageAction2 = chatMessageActionEvents$ChatMessageAction;
        String str5 = str4;
        return chatMessageActionEvents$ChatMessageActionClicked.copy(str, str2, str3, chatMessageActionEvents$ActionSource, chatMessageActionEvents$ChatMessageAction2, str5);
    }

    public static final /* synthetic */ void write$Self$analytics(ChatMessageActionEvents$ChatMessageActionClicked self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.chat_uuid);
        output.q(serialDesc, 2, self.message_uuid);
        output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.action_source);
        output.r(serialDesc, 4, (znf) kw9VarArr[4].getValue(), self.action);
        if (!output.E(serialDesc) && self.input_mode == null) {
            return;
        }
        output.B(serialDesc, 5, srg.a, self.input_mode);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChat_uuid() {
        return this.chat_uuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage_uuid() {
        return this.message_uuid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ChatMessageActionEvents$ActionSource getAction_source() {
        return this.action_source;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ChatMessageActionEvents$ChatMessageAction getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getInput_mode() {
        return this.input_mode;
    }

    public final ChatMessageActionEvents$ChatMessageActionClicked copy(String organization_uuid, String chat_uuid, String message_uuid, ChatMessageActionEvents$ActionSource action_source, ChatMessageActionEvents$ChatMessageAction action, String input_mode) {
        organization_uuid.getClass();
        chat_uuid.getClass();
        message_uuid.getClass();
        action_source.getClass();
        action.getClass();
        return new ChatMessageActionEvents$ChatMessageActionClicked(organization_uuid, chat_uuid, message_uuid, action_source, action, input_mode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatMessageActionEvents$ChatMessageActionClicked)) {
            return false;
        }
        ChatMessageActionEvents$ChatMessageActionClicked chatMessageActionEvents$ChatMessageActionClicked = (ChatMessageActionEvents$ChatMessageActionClicked) other;
        return x44.r(this.organization_uuid, chatMessageActionEvents$ChatMessageActionClicked.organization_uuid) && x44.r(this.chat_uuid, chatMessageActionEvents$ChatMessageActionClicked.chat_uuid) && x44.r(this.message_uuid, chatMessageActionEvents$ChatMessageActionClicked.message_uuid) && this.action_source == chatMessageActionEvents$ChatMessageActionClicked.action_source && this.action == chatMessageActionEvents$ChatMessageActionClicked.action && x44.r(this.input_mode, chatMessageActionEvents$ChatMessageActionClicked.input_mode);
    }

    public final ChatMessageActionEvents$ChatMessageAction getAction() {
        return this.action;
    }

    public final ChatMessageActionEvents$ActionSource getAction_source() {
        return this.action_source;
    }

    public final String getChat_uuid() {
        return this.chat_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "chat_message_action_clicked";
    }

    public final String getInput_mode() {
        return this.input_mode;
    }

    public final String getMessage_uuid() {
        return this.message_uuid;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public int hashCode() {
        int iHashCode = (this.action.hashCode() + ((this.action_source.hashCode() + kgh.l(kgh.l(this.organization_uuid.hashCode() * 31, 31, this.chat_uuid), 31, this.message_uuid)) * 31)) * 31;
        String str = this.input_mode;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.chat_uuid;
        String str3 = this.message_uuid;
        ChatMessageActionEvents$ActionSource chatMessageActionEvents$ActionSource = this.action_source;
        ChatMessageActionEvents$ChatMessageAction chatMessageActionEvents$ChatMessageAction = this.action;
        String str4 = this.input_mode;
        StringBuilder sbR = kgh.r("ChatMessageActionClicked(organization_uuid=", str, ", chat_uuid=", str2, ", message_uuid=");
        sbR.append(str3);
        sbR.append(", action_source=");
        sbR.append(chatMessageActionEvents$ActionSource);
        sbR.append(", action=");
        sbR.append(chatMessageActionEvents$ChatMessageAction);
        sbR.append(", input_mode=");
        sbR.append(str4);
        sbR.append(")");
        return sbR.toString();
    }

    public ChatMessageActionEvents$ChatMessageActionClicked(String str, String str2, String str3, ChatMessageActionEvents$ActionSource chatMessageActionEvents$ActionSource, ChatMessageActionEvents$ChatMessageAction chatMessageActionEvents$ChatMessageAction, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        chatMessageActionEvents$ActionSource.getClass();
        chatMessageActionEvents$ChatMessageAction.getClass();
        this.organization_uuid = str;
        this.chat_uuid = str2;
        this.message_uuid = str3;
        this.action_source = chatMessageActionEvents$ActionSource;
        this.action = chatMessageActionEvents$ChatMessageAction;
        this.input_mode = str4;
    }

    public /* synthetic */ ChatMessageActionEvents$ChatMessageActionClicked(String str, String str2, String str3, ChatMessageActionEvents$ActionSource chatMessageActionEvents$ActionSource, ChatMessageActionEvents$ChatMessageAction chatMessageActionEvents$ChatMessageAction, String str4, int i, mq5 mq5Var) {
        this(str, str2, str3, chatMessageActionEvents$ActionSource, chatMessageActionEvents$ChatMessageAction, (i & 32) != 0 ? null : str4);
    }
}
