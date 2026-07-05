package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.pk2;
import defpackage.sn2;
import defpackage.tn2;
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
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J8\u0010!\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010 R\u0014\u00103\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u001b¨\u00067"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$AddPrepopulatedText", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "Lcom/anthropic/claude/analytics/events/ChatEvents$AttachmentSource;", "source", "Lcom/anthropic/claude/analytics/events/ScreenSource;", "screen_source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$AttachmentSource;Lcom/anthropic/claude/analytics/events/ScreenSource;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$AttachmentSource;Lcom/anthropic/claude/analytics/events/ScreenSource;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ChatEvents$AddPrepopulatedText;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatEvents$AddPrepopulatedText;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/anthropic/claude/analytics/events/ChatEvents$AttachmentSource;", "component4", "()Lcom/anthropic/claude/analytics/events/ScreenSource;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$AttachmentSource;Lcom/anthropic/claude/analytics/events/ScreenSource;)Lcom/anthropic/claude/analytics/events/ChatEvents$AddPrepopulatedText;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "Lcom/anthropic/claude/analytics/events/ChatEvents$AttachmentSource;", "getSource", "Lcom/anthropic/claude/analytics/events/ScreenSource;", "getScreen_source", "getEventName", "eventName", "Companion", "sn2", "tn2", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatEvents$AddPrepopulatedText implements AnalyticsEvent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final tn2 Companion = new tn2();
    private final String conversation_uuid;
    private final String organization_uuid;
    private final ScreenSource screen_source;
    private final ChatEvents$AttachmentSource source;

    static {
        pk2 pk2Var = new pk2(25);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, yb5.w(w1aVar, pk2Var), yb5.w(w1aVar, new pk2(26))};
    }

    public /* synthetic */ ChatEvents$AddPrepopulatedText(int i, String str, String str2, ChatEvents$AttachmentSource chatEvents$AttachmentSource, ScreenSource screenSource, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, sn2.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.source = chatEvents$AttachmentSource;
        this.screen_source = screenSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ChatEvents$AttachmentSource.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return ScreenSource.Companion.serializer();
    }

    public static /* synthetic */ ChatEvents$AddPrepopulatedText copy$default(ChatEvents$AddPrepopulatedText chatEvents$AddPrepopulatedText, String str, String str2, ChatEvents$AttachmentSource chatEvents$AttachmentSource, ScreenSource screenSource, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatEvents$AddPrepopulatedText.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = chatEvents$AddPrepopulatedText.conversation_uuid;
        }
        if ((i & 4) != 0) {
            chatEvents$AttachmentSource = chatEvents$AddPrepopulatedText.source;
        }
        if ((i & 8) != 0) {
            screenSource = chatEvents$AddPrepopulatedText.screen_source;
        }
        return chatEvents$AddPrepopulatedText.copy(str, str2, chatEvents$AttachmentSource, screenSource);
    }

    public static final /* synthetic */ void write$Self$analytics(ChatEvents$AddPrepopulatedText self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.source);
        output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.screen_source);
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
    public final ChatEvents$AttachmentSource getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ScreenSource getScreen_source() {
        return this.screen_source;
    }

    public final ChatEvents$AddPrepopulatedText copy(String organization_uuid, String conversation_uuid, ChatEvents$AttachmentSource source, ScreenSource screen_source) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        source.getClass();
        screen_source.getClass();
        return new ChatEvents$AddPrepopulatedText(organization_uuid, conversation_uuid, source, screen_source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatEvents$AddPrepopulatedText)) {
            return false;
        }
        ChatEvents$AddPrepopulatedText chatEvents$AddPrepopulatedText = (ChatEvents$AddPrepopulatedText) other;
        return x44.r(this.organization_uuid, chatEvents$AddPrepopulatedText.organization_uuid) && x44.r(this.conversation_uuid, chatEvents$AddPrepopulatedText.conversation_uuid) && this.source == chatEvents$AddPrepopulatedText.source && this.screen_source == chatEvents$AddPrepopulatedText.screen_source;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_add_prepopulated_text";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final ScreenSource getScreen_source() {
        return this.screen_source;
    }

    public final ChatEvents$AttachmentSource getSource() {
        return this.source;
    }

    public int hashCode() {
        return this.screen_source.hashCode() + ((this.source.hashCode() + kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid)) * 31);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        ChatEvents$AttachmentSource chatEvents$AttachmentSource = this.source;
        ScreenSource screenSource = this.screen_source;
        StringBuilder sbR = kgh.r("AddPrepopulatedText(organization_uuid=", str, ", conversation_uuid=", str2, ", source=");
        sbR.append(chatEvents$AttachmentSource);
        sbR.append(", screen_source=");
        sbR.append(screenSource);
        sbR.append(")");
        return sbR.toString();
    }

    public ChatEvents$AddPrepopulatedText(String str, String str2, ChatEvents$AttachmentSource chatEvents$AttachmentSource, ScreenSource screenSource) {
        str.getClass();
        str2.getClass();
        chatEvents$AttachmentSource.getClass();
        screenSource.getClass();
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.source = chatEvents$AttachmentSource;
        this.screen_source = screenSource;
    }
}
