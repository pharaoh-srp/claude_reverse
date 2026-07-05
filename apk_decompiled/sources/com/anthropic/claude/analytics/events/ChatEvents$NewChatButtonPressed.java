package com.anthropic.claude.analytics.events;

import defpackage.ao2;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.pp2;
import defpackage.qp2;
import defpackage.srg;
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
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J0\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0019R\u0014\u0010-\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0019¨\u00061"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$NewChatButtonPressed", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "Lcom/anthropic/claude/analytics/events/ChatEvents$NewChatButtonPressedSource;", "source", "project_id", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$NewChatButtonPressedSource;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$NewChatButtonPressedSource;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ChatEvents$NewChatButtonPressed;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatEvents$NewChatButtonPressed;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/analytics/events/ChatEvents$NewChatButtonPressedSource;", "component3", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$NewChatButtonPressedSource;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/ChatEvents$NewChatButtonPressed;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "Lcom/anthropic/claude/analytics/events/ChatEvents$NewChatButtonPressedSource;", "getSource", "getProject_id", "getEventName", "eventName", "Companion", "pp2", "qp2", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatEvents$NewChatButtonPressed implements AnalyticsEvent {
    public static final int $stable = 0;
    private final String organization_uuid;
    private final String project_id;
    private final ChatEvents$NewChatButtonPressedSource source;
    public static final qp2 Companion = new qp2();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new ao2(15)), null};

    public /* synthetic */ ChatEvents$NewChatButtonPressed(int i, String str, ChatEvents$NewChatButtonPressedSource chatEvents$NewChatButtonPressedSource, String str2, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, pp2.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.source = chatEvents$NewChatButtonPressedSource;
        if ((i & 4) == 0) {
            this.project_id = null;
        } else {
            this.project_id = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ChatEvents$NewChatButtonPressedSource.Companion.serializer();
    }

    public static /* synthetic */ ChatEvents$NewChatButtonPressed copy$default(ChatEvents$NewChatButtonPressed chatEvents$NewChatButtonPressed, String str, ChatEvents$NewChatButtonPressedSource chatEvents$NewChatButtonPressedSource, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatEvents$NewChatButtonPressed.organization_uuid;
        }
        if ((i & 2) != 0) {
            chatEvents$NewChatButtonPressedSource = chatEvents$NewChatButtonPressed.source;
        }
        if ((i & 4) != 0) {
            str2 = chatEvents$NewChatButtonPressed.project_id;
        }
        return chatEvents$NewChatButtonPressed.copy(str, chatEvents$NewChatButtonPressedSource, str2);
    }

    public static final /* synthetic */ void write$Self$analytics(ChatEvents$NewChatButtonPressed self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.source);
        if (!output.E(serialDesc) && self.project_id == null) {
            return;
        }
        output.B(serialDesc, 2, srg.a, self.project_id);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ChatEvents$NewChatButtonPressedSource getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProject_id() {
        return this.project_id;
    }

    public final ChatEvents$NewChatButtonPressed copy(String organization_uuid, ChatEvents$NewChatButtonPressedSource source, String project_id) {
        organization_uuid.getClass();
        source.getClass();
        return new ChatEvents$NewChatButtonPressed(organization_uuid, source, project_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatEvents$NewChatButtonPressed)) {
            return false;
        }
        ChatEvents$NewChatButtonPressed chatEvents$NewChatButtonPressed = (ChatEvents$NewChatButtonPressed) other;
        return x44.r(this.organization_uuid, chatEvents$NewChatButtonPressed.organization_uuid) && this.source == chatEvents$NewChatButtonPressed.source && x44.r(this.project_id, chatEvents$NewChatButtonPressed.project_id);
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_new_chat_button_pressed";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getProject_id() {
        return this.project_id;
    }

    public final ChatEvents$NewChatButtonPressedSource getSource() {
        return this.source;
    }

    public int hashCode() {
        int iHashCode = (this.source.hashCode() + (this.organization_uuid.hashCode() * 31)) * 31;
        String str = this.project_id;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.organization_uuid;
        ChatEvents$NewChatButtonPressedSource chatEvents$NewChatButtonPressedSource = this.source;
        String str2 = this.project_id;
        StringBuilder sb = new StringBuilder("NewChatButtonPressed(organization_uuid=");
        sb.append(str);
        sb.append(", source=");
        sb.append(chatEvents$NewChatButtonPressedSource);
        sb.append(", project_id=");
        return ij0.m(sb, str2, ")");
    }

    public ChatEvents$NewChatButtonPressed(String str, ChatEvents$NewChatButtonPressedSource chatEvents$NewChatButtonPressedSource, String str2) {
        str.getClass();
        chatEvents$NewChatButtonPressedSource.getClass();
        this.organization_uuid = str;
        this.source = chatEvents$NewChatButtonPressedSource;
        this.project_id = str2;
    }

    public /* synthetic */ ChatEvents$NewChatButtonPressed(String str, ChatEvents$NewChatButtonPressedSource chatEvents$NewChatButtonPressedSource, String str2, int i, mq5 mq5Var) {
        this(str, chatEvents$NewChatButtonPressedSource, (i & 4) != 0 ? null : str2);
    }
}
