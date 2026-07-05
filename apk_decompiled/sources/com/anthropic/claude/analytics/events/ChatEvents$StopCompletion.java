package com.anthropic.claude.analytics.events;

import defpackage.gr2;
import defpackage.gvj;
import defpackage.hr2;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ<\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b\u0006\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b,\u0010\u001aR\u0014\u0010.\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u001a¨\u00062"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$StopCompletion", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "", "is_temporary_chat", "project_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ChatEvents$StopCompletion;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatEvents$StopCompletion;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/ChatEvents$StopCompletion;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "Ljava/lang/Boolean;", "getProject_id", "getEventName", "eventName", "Companion", "gr2", "hr2", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatEvents$StopCompletion implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final hr2 Companion = new hr2();
    private final String conversation_uuid;
    private final Boolean is_temporary_chat;
    private final String organization_uuid;
    private final String project_id;

    public /* synthetic */ ChatEvents$StopCompletion(int i, String str, String str2, Boolean bool, String str3, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, gr2.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        if ((i & 4) == 0) {
            this.is_temporary_chat = null;
        } else {
            this.is_temporary_chat = bool;
        }
        if ((i & 8) == 0) {
            this.project_id = null;
        } else {
            this.project_id = str3;
        }
    }

    public static /* synthetic */ ChatEvents$StopCompletion copy$default(ChatEvents$StopCompletion chatEvents$StopCompletion, String str, String str2, Boolean bool, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatEvents$StopCompletion.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = chatEvents$StopCompletion.conversation_uuid;
        }
        if ((i & 4) != 0) {
            bool = chatEvents$StopCompletion.is_temporary_chat;
        }
        if ((i & 8) != 0) {
            str3 = chatEvents$StopCompletion.project_id;
        }
        return chatEvents$StopCompletion.copy(str, str2, bool, str3);
    }

    public static final /* synthetic */ void write$Self$analytics(ChatEvents$StopCompletion self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        if (output.E(serialDesc) || self.is_temporary_chat != null) {
            output.B(serialDesc, 2, zt1.a, self.is_temporary_chat);
        }
        if (!output.E(serialDesc) && self.project_id == null) {
            return;
        }
        output.B(serialDesc, 3, srg.a, self.project_id);
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
    public final Boolean getIs_temporary_chat() {
        return this.is_temporary_chat;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getProject_id() {
        return this.project_id;
    }

    public final ChatEvents$StopCompletion copy(String organization_uuid, String conversation_uuid, Boolean is_temporary_chat, String project_id) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        return new ChatEvents$StopCompletion(organization_uuid, conversation_uuid, is_temporary_chat, project_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatEvents$StopCompletion)) {
            return false;
        }
        ChatEvents$StopCompletion chatEvents$StopCompletion = (ChatEvents$StopCompletion) other;
        return x44.r(this.organization_uuid, chatEvents$StopCompletion.organization_uuid) && x44.r(this.conversation_uuid, chatEvents$StopCompletion.conversation_uuid) && x44.r(this.is_temporary_chat, chatEvents$StopCompletion.is_temporary_chat) && x44.r(this.project_id, chatEvents$StopCompletion.project_id);
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_conversation_stop_completion";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getProject_id() {
        return this.project_id;
    }

    public int hashCode() {
        int iL = kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid);
        Boolean bool = this.is_temporary_chat;
        int iHashCode = (iL + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.project_id;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final Boolean is_temporary_chat() {
        return this.is_temporary_chat;
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        Boolean bool = this.is_temporary_chat;
        String str3 = this.project_id;
        StringBuilder sbR = kgh.r("StopCompletion(organization_uuid=", str, ", conversation_uuid=", str2, ", is_temporary_chat=");
        sbR.append(bool);
        sbR.append(", project_id=");
        sbR.append(str3);
        sbR.append(")");
        return sbR.toString();
    }

    public ChatEvents$StopCompletion(String str, String str2, Boolean bool, String str3) {
        str.getClass();
        str2.getClass();
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.is_temporary_chat = bool;
        this.project_id = str3;
    }

    public /* synthetic */ ChatEvents$StopCompletion(String str, String str2, Boolean bool, String str3, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str3);
    }
}
