package com.anthropic.claude.analytics.events;

import defpackage.ao2;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mp2;
import defpackage.mq5;
import defpackage.np2;
import defpackage.onf;
import defpackage.qy1;
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
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ0\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b\u0007\u0010\u001eR\u0014\u0010.\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u001a¨\u00062"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$ModelSelectorSheetSeen", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "Lcom/anthropic/claude/analytics/events/ChatEvents$ModelSelectorSheetSource;", "source", "", "is_temporary_chat", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$ModelSelectorSheetSource;Ljava/lang/Boolean;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$ModelSelectorSheetSource;Ljava/lang/Boolean;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ChatEvents$ModelSelectorSheetSeen;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatEvents$ModelSelectorSheetSeen;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/analytics/events/ChatEvents$ModelSelectorSheetSource;", "component3", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$ModelSelectorSheetSource;Ljava/lang/Boolean;)Lcom/anthropic/claude/analytics/events/ChatEvents$ModelSelectorSheetSeen;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "Lcom/anthropic/claude/analytics/events/ChatEvents$ModelSelectorSheetSource;", "getSource", "Ljava/lang/Boolean;", "getEventName", "eventName", "Companion", "mp2", "np2", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatEvents$ModelSelectorSheetSeen implements AnalyticsEvent {
    public static final int $stable = 0;
    private final Boolean is_temporary_chat;
    private final String organization_uuid;
    private final ChatEvents$ModelSelectorSheetSource source;
    public static final np2 Companion = new np2();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new ao2(13)), null};

    public /* synthetic */ ChatEvents$ModelSelectorSheetSeen(int i, String str, ChatEvents$ModelSelectorSheetSource chatEvents$ModelSelectorSheetSource, Boolean bool, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, mp2.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.source = chatEvents$ModelSelectorSheetSource;
        if ((i & 4) == 0) {
            this.is_temporary_chat = null;
        } else {
            this.is_temporary_chat = bool;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ChatEvents$ModelSelectorSheetSource.Companion.serializer();
    }

    public static /* synthetic */ ChatEvents$ModelSelectorSheetSeen copy$default(ChatEvents$ModelSelectorSheetSeen chatEvents$ModelSelectorSheetSeen, String str, ChatEvents$ModelSelectorSheetSource chatEvents$ModelSelectorSheetSource, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatEvents$ModelSelectorSheetSeen.organization_uuid;
        }
        if ((i & 2) != 0) {
            chatEvents$ModelSelectorSheetSource = chatEvents$ModelSelectorSheetSeen.source;
        }
        if ((i & 4) != 0) {
            bool = chatEvents$ModelSelectorSheetSeen.is_temporary_chat;
        }
        return chatEvents$ModelSelectorSheetSeen.copy(str, chatEvents$ModelSelectorSheetSource, bool);
    }

    public static final /* synthetic */ void write$Self$analytics(ChatEvents$ModelSelectorSheetSeen self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.source);
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
    public final ChatEvents$ModelSelectorSheetSource getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getIs_temporary_chat() {
        return this.is_temporary_chat;
    }

    public final ChatEvents$ModelSelectorSheetSeen copy(String organization_uuid, ChatEvents$ModelSelectorSheetSource source, Boolean is_temporary_chat) {
        organization_uuid.getClass();
        source.getClass();
        return new ChatEvents$ModelSelectorSheetSeen(organization_uuid, source, is_temporary_chat);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatEvents$ModelSelectorSheetSeen)) {
            return false;
        }
        ChatEvents$ModelSelectorSheetSeen chatEvents$ModelSelectorSheetSeen = (ChatEvents$ModelSelectorSheetSeen) other;
        return x44.r(this.organization_uuid, chatEvents$ModelSelectorSheetSeen.organization_uuid) && this.source == chatEvents$ModelSelectorSheetSeen.source && x44.r(this.is_temporary_chat, chatEvents$ModelSelectorSheetSeen.is_temporary_chat);
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.chat.model_selector_sheet.viewed";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final ChatEvents$ModelSelectorSheetSource getSource() {
        return this.source;
    }

    public int hashCode() {
        int iHashCode = (this.source.hashCode() + (this.organization_uuid.hashCode() * 31)) * 31;
        Boolean bool = this.is_temporary_chat;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final Boolean is_temporary_chat() {
        return this.is_temporary_chat;
    }

    public String toString() {
        String str = this.organization_uuid;
        ChatEvents$ModelSelectorSheetSource chatEvents$ModelSelectorSheetSource = this.source;
        Boolean bool = this.is_temporary_chat;
        StringBuilder sb = new StringBuilder("ModelSelectorSheetSeen(organization_uuid=");
        sb.append(str);
        sb.append(", source=");
        sb.append(chatEvents$ModelSelectorSheetSource);
        sb.append(", is_temporary_chat=");
        return qy1.h(sb, bool, ")");
    }

    public ChatEvents$ModelSelectorSheetSeen(String str, ChatEvents$ModelSelectorSheetSource chatEvents$ModelSelectorSheetSource, Boolean bool) {
        str.getClass();
        chatEvents$ModelSelectorSheetSource.getClass();
        this.organization_uuid = str;
        this.source = chatEvents$ModelSelectorSheetSource;
        this.is_temporary_chat = bool;
    }

    public /* synthetic */ ChatEvents$ModelSelectorSheetSeen(String str, ChatEvents$ModelSelectorSheetSource chatEvents$ModelSelectorSheetSource, Boolean bool, int i, mq5 mq5Var) {
        this(str, chatEvents$ModelSelectorSheetSource, (i & 4) != 0 ? null : bool);
    }
}
