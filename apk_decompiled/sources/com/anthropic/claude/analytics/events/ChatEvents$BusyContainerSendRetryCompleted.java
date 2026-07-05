package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.pk2;
import defpackage.qy1;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.yn2;
import defpackage.zn2;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<=B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b%\u0010#JL\u0010&\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b(\u0010#J\u0010\u0010)\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b)\u0010\u001fJ\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010#R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b7\u0010#R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b8\u0010#R\u0014\u0010:\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010#¨\u0006>"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$BusyContainerSendRetryCompleted", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "Lcom/anthropic/claude/analytics/events/ChatEvents$BusyContainerSendRetryOutcome;", "outcome", "", "attempts", "", "duration_ms", "", "conversation_uuid", "organization_uuid", "human_message_uuid", "<init>", "(Lcom/anthropic/claude/analytics/events/ChatEvents$BusyContainerSendRetryOutcome;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/analytics/events/ChatEvents$BusyContainerSendRetryOutcome;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ChatEvents$BusyContainerSendRetryCompleted;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatEvents$BusyContainerSendRetryCompleted;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/analytics/events/ChatEvents$BusyContainerSendRetryOutcome;", "component2", "()I", "component3", "()J", "component4", "()Ljava/lang/String;", "component5", "component6", "copy", "(Lcom/anthropic/claude/analytics/events/ChatEvents$BusyContainerSendRetryOutcome;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/ChatEvents$BusyContainerSendRetryCompleted;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/analytics/events/ChatEvents$BusyContainerSendRetryOutcome;", "getOutcome", "I", "getAttempts", "J", "getDuration_ms", "Ljava/lang/String;", "getConversation_uuid", "getOrganization_uuid", "getHuman_message_uuid", "getEventName", "eventName", "Companion", "yn2", "zn2", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatEvents$BusyContainerSendRetryCompleted implements AnalyticsEvent {
    public static final int $stable = 0;
    private final int attempts;
    private final String conversation_uuid;
    private final long duration_ms;
    private final String human_message_uuid;
    private final String organization_uuid;
    private final ChatEvents$BusyContainerSendRetryOutcome outcome;
    public static final zn2 Companion = new zn2();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new pk2(29)), null, null, null, null, null};

    public /* synthetic */ ChatEvents$BusyContainerSendRetryCompleted(int i, ChatEvents$BusyContainerSendRetryOutcome chatEvents$BusyContainerSendRetryOutcome, int i2, long j, String str, String str2, String str3, vnf vnfVar) {
        if (63 != (i & 63)) {
            gvj.f(i, 63, yn2.a.getDescriptor());
            throw null;
        }
        this.outcome = chatEvents$BusyContainerSendRetryOutcome;
        this.attempts = i2;
        this.duration_ms = j;
        this.conversation_uuid = str;
        this.organization_uuid = str2;
        this.human_message_uuid = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ChatEvents$BusyContainerSendRetryOutcome.Companion.serializer();
    }

    public static /* synthetic */ ChatEvents$BusyContainerSendRetryCompleted copy$default(ChatEvents$BusyContainerSendRetryCompleted chatEvents$BusyContainerSendRetryCompleted, ChatEvents$BusyContainerSendRetryOutcome chatEvents$BusyContainerSendRetryOutcome, int i, long j, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            chatEvents$BusyContainerSendRetryOutcome = chatEvents$BusyContainerSendRetryCompleted.outcome;
        }
        if ((i2 & 2) != 0) {
            i = chatEvents$BusyContainerSendRetryCompleted.attempts;
        }
        if ((i2 & 4) != 0) {
            j = chatEvents$BusyContainerSendRetryCompleted.duration_ms;
        }
        if ((i2 & 8) != 0) {
            str = chatEvents$BusyContainerSendRetryCompleted.conversation_uuid;
        }
        if ((i2 & 16) != 0) {
            str2 = chatEvents$BusyContainerSendRetryCompleted.organization_uuid;
        }
        if ((i2 & 32) != 0) {
            str3 = chatEvents$BusyContainerSendRetryCompleted.human_message_uuid;
        }
        String str4 = str3;
        String str5 = str;
        long j2 = j;
        return chatEvents$BusyContainerSendRetryCompleted.copy(chatEvents$BusyContainerSendRetryOutcome, i, j2, str5, str2, str4);
    }

    public static final /* synthetic */ void write$Self$analytics(ChatEvents$BusyContainerSendRetryCompleted self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.outcome);
        output.l(1, self.attempts, serialDesc);
        output.D(serialDesc, 2, self.duration_ms);
        output.q(serialDesc, 3, self.conversation_uuid);
        output.q(serialDesc, 4, self.organization_uuid);
        output.q(serialDesc, 5, self.human_message_uuid);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ChatEvents$BusyContainerSendRetryOutcome getOutcome() {
        return this.outcome;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAttempts() {
        return this.attempts;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getDuration_ms() {
        return this.duration_ms;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getHuman_message_uuid() {
        return this.human_message_uuid;
    }

    public final ChatEvents$BusyContainerSendRetryCompleted copy(ChatEvents$BusyContainerSendRetryOutcome outcome, int attempts, long duration_ms, String conversation_uuid, String organization_uuid, String human_message_uuid) {
        outcome.getClass();
        conversation_uuid.getClass();
        organization_uuid.getClass();
        human_message_uuid.getClass();
        return new ChatEvents$BusyContainerSendRetryCompleted(outcome, attempts, duration_ms, conversation_uuid, organization_uuid, human_message_uuid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatEvents$BusyContainerSendRetryCompleted)) {
            return false;
        }
        ChatEvents$BusyContainerSendRetryCompleted chatEvents$BusyContainerSendRetryCompleted = (ChatEvents$BusyContainerSendRetryCompleted) other;
        return this.outcome == chatEvents$BusyContainerSendRetryCompleted.outcome && this.attempts == chatEvents$BusyContainerSendRetryCompleted.attempts && this.duration_ms == chatEvents$BusyContainerSendRetryCompleted.duration_ms && x44.r(this.conversation_uuid, chatEvents$BusyContainerSendRetryCompleted.conversation_uuid) && x44.r(this.organization_uuid, chatEvents$BusyContainerSendRetryCompleted.organization_uuid) && x44.r(this.human_message_uuid, chatEvents$BusyContainerSendRetryCompleted.human_message_uuid);
    }

    public final int getAttempts() {
        return this.attempts;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    public final long getDuration_ms() {
        return this.duration_ms;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.chat.busy_container_send_retry.completed";
    }

    public final String getHuman_message_uuid() {
        return this.human_message_uuid;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final ChatEvents$BusyContainerSendRetryOutcome getOutcome() {
        return this.outcome;
    }

    public int hashCode() {
        return this.human_message_uuid.hashCode() + kgh.l(kgh.l(vb7.e(vb7.c(this.attempts, this.outcome.hashCode() * 31, 31), 31, this.duration_ms), 31, this.conversation_uuid), 31, this.organization_uuid);
    }

    public String toString() {
        ChatEvents$BusyContainerSendRetryOutcome chatEvents$BusyContainerSendRetryOutcome = this.outcome;
        int i = this.attempts;
        long j = this.duration_ms;
        String str = this.conversation_uuid;
        String str2 = this.organization_uuid;
        String str3 = this.human_message_uuid;
        StringBuilder sb = new StringBuilder("BusyContainerSendRetryCompleted(outcome=");
        sb.append(chatEvents$BusyContainerSendRetryOutcome);
        sb.append(", attempts=");
        sb.append(i);
        sb.append(", duration_ms=");
        qy1.m(j, ", conversation_uuid=", str, sb);
        kgh.u(sb, ", organization_uuid=", str2, ", human_message_uuid=", str3);
        sb.append(")");
        return sb.toString();
    }

    public ChatEvents$BusyContainerSendRetryCompleted(ChatEvents$BusyContainerSendRetryOutcome chatEvents$BusyContainerSendRetryOutcome, int i, long j, String str, String str2, String str3) {
        chatEvents$BusyContainerSendRetryOutcome.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.outcome = chatEvents$BusyContainerSendRetryOutcome;
        this.attempts = i;
        this.duration_ms = j;
        this.conversation_uuid = str;
        this.organization_uuid = str2;
        this.human_message_uuid = str3;
    }
}
