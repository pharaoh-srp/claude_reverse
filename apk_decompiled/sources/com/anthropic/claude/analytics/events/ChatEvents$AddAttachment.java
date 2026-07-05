package com.anthropic.claude.analytics.events;

import defpackage.en2;
import defpackage.fn2;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.pk2;
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
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<=B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBW\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b%\u0010&JN\u0010'\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001eJ\u0010\u0010*\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\n2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b3\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b\u000b\u0010&R\u0014\u0010:\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u001e¨\u0006>"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$AddAttachment", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "uti", "Lcom/anthropic/claude/analytics/events/ChatEvents$AttachmentSource;", "source", "Lcom/anthropic/claude/analytics/events/ScreenSource;", "screen_source", "", "is_wiggle_upload", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$AttachmentSource;Lcom/anthropic/claude/analytics/events/ScreenSource;Ljava/lang/Boolean;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$AttachmentSource;Lcom/anthropic/claude/analytics/events/ScreenSource;Ljava/lang/Boolean;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ChatEvents$AddAttachment;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatEvents$AddAttachment;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/anthropic/claude/analytics/events/ChatEvents$AttachmentSource;", "component5", "()Lcom/anthropic/claude/analytics/events/ScreenSource;", "component6", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$AttachmentSource;Lcom/anthropic/claude/analytics/events/ScreenSource;Ljava/lang/Boolean;)Lcom/anthropic/claude/analytics/events/ChatEvents$AddAttachment;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "getUti", "Lcom/anthropic/claude/analytics/events/ChatEvents$AttachmentSource;", "getSource", "Lcom/anthropic/claude/analytics/events/ScreenSource;", "getScreen_source", "Ljava/lang/Boolean;", "getEventName", "eventName", "Companion", "en2", "fn2", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatEvents$AddAttachment implements AnalyticsEvent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final fn2 Companion = new fn2();
    private final String conversation_uuid;
    private final Boolean is_wiggle_upload;
    private final String organization_uuid;
    private final ScreenSource screen_source;
    private final ChatEvents$AttachmentSource source;
    private final String uti;

    static {
        pk2 pk2Var = new pk2(7);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, yb5.w(w1aVar, pk2Var), yb5.w(w1aVar, new pk2(8)), null};
    }

    public /* synthetic */ ChatEvents$AddAttachment(int i, String str, String str2, String str3, ChatEvents$AttachmentSource chatEvents$AttachmentSource, ScreenSource screenSource, Boolean bool, vnf vnfVar) {
        if (31 != (i & 31)) {
            gvj.f(i, 31, en2.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.uti = str3;
        this.source = chatEvents$AttachmentSource;
        this.screen_source = screenSource;
        if ((i & 32) == 0) {
            this.is_wiggle_upload = null;
        } else {
            this.is_wiggle_upload = bool;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ChatEvents$AttachmentSource.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return ScreenSource.Companion.serializer();
    }

    public static /* synthetic */ ChatEvents$AddAttachment copy$default(ChatEvents$AddAttachment chatEvents$AddAttachment, String str, String str2, String str3, ChatEvents$AttachmentSource chatEvents$AttachmentSource, ScreenSource screenSource, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatEvents$AddAttachment.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = chatEvents$AddAttachment.conversation_uuid;
        }
        if ((i & 4) != 0) {
            str3 = chatEvents$AddAttachment.uti;
        }
        if ((i & 8) != 0) {
            chatEvents$AttachmentSource = chatEvents$AddAttachment.source;
        }
        if ((i & 16) != 0) {
            screenSource = chatEvents$AddAttachment.screen_source;
        }
        if ((i & 32) != 0) {
            bool = chatEvents$AddAttachment.is_wiggle_upload;
        }
        ScreenSource screenSource2 = screenSource;
        Boolean bool2 = bool;
        return chatEvents$AddAttachment.copy(str, str2, str3, chatEvents$AttachmentSource, screenSource2, bool2);
    }

    public static final /* synthetic */ void write$Self$analytics(ChatEvents$AddAttachment self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.q(serialDesc, 2, self.uti);
        output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.source);
        output.r(serialDesc, 4, (znf) kw9VarArr[4].getValue(), self.screen_source);
        if (!output.E(serialDesc) && self.is_wiggle_upload == null) {
            return;
        }
        output.B(serialDesc, 5, zt1.a, self.is_wiggle_upload);
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
    public final String getUti() {
        return this.uti;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ChatEvents$AttachmentSource getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ScreenSource getScreen_source() {
        return this.screen_source;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIs_wiggle_upload() {
        return this.is_wiggle_upload;
    }

    public final ChatEvents$AddAttachment copy(String organization_uuid, String conversation_uuid, String uti, ChatEvents$AttachmentSource source, ScreenSource screen_source, Boolean is_wiggle_upload) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        uti.getClass();
        source.getClass();
        screen_source.getClass();
        return new ChatEvents$AddAttachment(organization_uuid, conversation_uuid, uti, source, screen_source, is_wiggle_upload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatEvents$AddAttachment)) {
            return false;
        }
        ChatEvents$AddAttachment chatEvents$AddAttachment = (ChatEvents$AddAttachment) other;
        return x44.r(this.organization_uuid, chatEvents$AddAttachment.organization_uuid) && x44.r(this.conversation_uuid, chatEvents$AddAttachment.conversation_uuid) && x44.r(this.uti, chatEvents$AddAttachment.uti) && this.source == chatEvents$AddAttachment.source && this.screen_source == chatEvents$AddAttachment.screen_source && x44.r(this.is_wiggle_upload, chatEvents$AddAttachment.is_wiggle_upload);
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_add_attachment_to_conversation";
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

    public final String getUti() {
        return this.uti;
    }

    public int hashCode() {
        int iHashCode = (this.screen_source.hashCode() + ((this.source.hashCode() + kgh.l(kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid), 31, this.uti)) * 31)) * 31;
        Boolean bool = this.is_wiggle_upload;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final Boolean is_wiggle_upload() {
        return this.is_wiggle_upload;
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        String str3 = this.uti;
        ChatEvents$AttachmentSource chatEvents$AttachmentSource = this.source;
        ScreenSource screenSource = this.screen_source;
        Boolean bool = this.is_wiggle_upload;
        StringBuilder sbR = kgh.r("AddAttachment(organization_uuid=", str, ", conversation_uuid=", str2, ", uti=");
        sbR.append(str3);
        sbR.append(", source=");
        sbR.append(chatEvents$AttachmentSource);
        sbR.append(", screen_source=");
        sbR.append(screenSource);
        sbR.append(", is_wiggle_upload=");
        sbR.append(bool);
        sbR.append(")");
        return sbR.toString();
    }

    public ChatEvents$AddAttachment(String str, String str2, String str3, ChatEvents$AttachmentSource chatEvents$AttachmentSource, ScreenSource screenSource, Boolean bool) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        chatEvents$AttachmentSource.getClass();
        screenSource.getClass();
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.uti = str3;
        this.source = chatEvents$AttachmentSource;
        this.screen_source = screenSource;
        this.is_wiggle_upload = bool;
    }

    public /* synthetic */ ChatEvents$AddAttachment(String str, String str2, String str3, ChatEvents$AttachmentSource chatEvents$AttachmentSource, ScreenSource screenSource, Boolean bool, int i, mq5 mq5Var) {
        this(str, str2, str3, chatEvents$AttachmentSource, screenSource, (i & 32) != 0 ? null : bool);
    }
}
