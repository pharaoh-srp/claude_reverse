package com.anthropic.claude.analytics.events;

import defpackage.gn2;
import defpackage.gvj;
import defpackage.hn2;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b\u0005\u0010\u001aR\u0014\u0010(\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0018¨\u0006,"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$AddContextButtonPressed", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "", "is_temporary_chat", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Boolean;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ChatEvents$AddContextButtonPressed;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatEvents$AddContextButtonPressed;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/anthropic/claude/analytics/events/ChatEvents$AddContextButtonPressed;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "Ljava/lang/Boolean;", "getEventName", "eventName", "Companion", "gn2", "hn2", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatEvents$AddContextButtonPressed implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final hn2 Companion = new hn2();
    private final Boolean is_temporary_chat;
    private final String organization_uuid;

    public /* synthetic */ ChatEvents$AddContextButtonPressed(int i, String str, Boolean bool, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, gn2.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        if ((i & 2) == 0) {
            this.is_temporary_chat = null;
        } else {
            this.is_temporary_chat = bool;
        }
    }

    public static /* synthetic */ ChatEvents$AddContextButtonPressed copy$default(ChatEvents$AddContextButtonPressed chatEvents$AddContextButtonPressed, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatEvents$AddContextButtonPressed.organization_uuid;
        }
        if ((i & 2) != 0) {
            bool = chatEvents$AddContextButtonPressed.is_temporary_chat;
        }
        return chatEvents$AddContextButtonPressed.copy(str, bool);
    }

    public static final /* synthetic */ void write$Self$analytics(ChatEvents$AddContextButtonPressed self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        if (!output.E(serialDesc) && self.is_temporary_chat == null) {
            return;
        }
        output.B(serialDesc, 1, zt1.a, self.is_temporary_chat);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIs_temporary_chat() {
        return this.is_temporary_chat;
    }

    public final ChatEvents$AddContextButtonPressed copy(String organization_uuid, Boolean is_temporary_chat) {
        organization_uuid.getClass();
        return new ChatEvents$AddContextButtonPressed(organization_uuid, is_temporary_chat);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatEvents$AddContextButtonPressed)) {
            return false;
        }
        ChatEvents$AddContextButtonPressed chatEvents$AddContextButtonPressed = (ChatEvents$AddContextButtonPressed) other;
        return x44.r(this.organization_uuid, chatEvents$AddContextButtonPressed.organization_uuid) && x44.r(this.is_temporary_chat, chatEvents$AddContextButtonPressed.is_temporary_chat);
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_add_context_button_pressed";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public int hashCode() {
        int iHashCode = this.organization_uuid.hashCode() * 31;
        Boolean bool = this.is_temporary_chat;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final Boolean is_temporary_chat() {
        return this.is_temporary_chat;
    }

    public String toString() {
        return "AddContextButtonPressed(organization_uuid=" + this.organization_uuid + ", is_temporary_chat=" + this.is_temporary_chat + ")";
    }

    public ChatEvents$AddContextButtonPressed(String str, Boolean bool) {
        str.getClass();
        this.organization_uuid = str;
        this.is_temporary_chat = bool;
    }

    public /* synthetic */ ChatEvents$AddContextButtonPressed(String str, Boolean bool, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : bool);
    }
}
