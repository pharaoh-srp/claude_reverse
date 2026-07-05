package com.anthropic.claude.analytics.events;

import defpackage.ao2;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.jo2;
import defpackage.kgh;
import defpackage.ko2;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.xka;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJF\u0010#\u001a\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b4\u0010\u001cR\u0014\u00106\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u001c¨\u0006:"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$CompactionCompleted", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "Lcom/anthropic/claude/analytics/events/ChatEvents$CompactionOutcome;", "outcome", "", "duration_ms", "failure_reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$CompactionOutcome;Ljava/lang/Long;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$CompactionOutcome;Ljava/lang/Long;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ChatEvents$CompactionCompleted;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatEvents$CompactionCompleted;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/anthropic/claude/analytics/events/ChatEvents$CompactionOutcome;", "component4", "()Ljava/lang/Long;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$CompactionOutcome;Ljava/lang/Long;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/ChatEvents$CompactionCompleted;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "Lcom/anthropic/claude/analytics/events/ChatEvents$CompactionOutcome;", "getOutcome", "Ljava/lang/Long;", "getDuration_ms", "getFailure_reason", "getEventName", "eventName", "Companion", "jo2", "ko2", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatEvents$CompactionCompleted implements AnalyticsEvent {
    public static final int $stable = 0;
    private final String conversation_uuid;
    private final Long duration_ms;
    private final String failure_reason;
    private final String organization_uuid;
    private final ChatEvents$CompactionOutcome outcome;
    public static final ko2 Companion = new ko2();
    private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new ao2(3)), null, null};

    public /* synthetic */ ChatEvents$CompactionCompleted(int i, String str, String str2, ChatEvents$CompactionOutcome chatEvents$CompactionOutcome, Long l, String str3, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, jo2.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.outcome = chatEvents$CompactionOutcome;
        if ((i & 8) == 0) {
            this.duration_ms = null;
        } else {
            this.duration_ms = l;
        }
        if ((i & 16) == 0) {
            this.failure_reason = null;
        } else {
            this.failure_reason = str3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ChatEvents$CompactionOutcome.Companion.serializer();
    }

    public static /* synthetic */ ChatEvents$CompactionCompleted copy$default(ChatEvents$CompactionCompleted chatEvents$CompactionCompleted, String str, String str2, ChatEvents$CompactionOutcome chatEvents$CompactionOutcome, Long l, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatEvents$CompactionCompleted.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = chatEvents$CompactionCompleted.conversation_uuid;
        }
        if ((i & 4) != 0) {
            chatEvents$CompactionOutcome = chatEvents$CompactionCompleted.outcome;
        }
        if ((i & 8) != 0) {
            l = chatEvents$CompactionCompleted.duration_ms;
        }
        if ((i & 16) != 0) {
            str3 = chatEvents$CompactionCompleted.failure_reason;
        }
        String str4 = str3;
        ChatEvents$CompactionOutcome chatEvents$CompactionOutcome2 = chatEvents$CompactionOutcome;
        return chatEvents$CompactionCompleted.copy(str, str2, chatEvents$CompactionOutcome2, l, str4);
    }

    public static final /* synthetic */ void write$Self$analytics(ChatEvents$CompactionCompleted self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.outcome);
        if (output.E(serialDesc) || self.duration_ms != null) {
            output.B(serialDesc, 3, xka.a, self.duration_ms);
        }
        if (!output.E(serialDesc) && self.failure_reason == null) {
            return;
        }
        output.B(serialDesc, 4, srg.a, self.failure_reason);
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
    public final ChatEvents$CompactionOutcome getOutcome() {
        return this.outcome;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getDuration_ms() {
        return this.duration_ms;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFailure_reason() {
        return this.failure_reason;
    }

    public final ChatEvents$CompactionCompleted copy(String organization_uuid, String conversation_uuid, ChatEvents$CompactionOutcome outcome, Long duration_ms, String failure_reason) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        outcome.getClass();
        return new ChatEvents$CompactionCompleted(organization_uuid, conversation_uuid, outcome, duration_ms, failure_reason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatEvents$CompactionCompleted)) {
            return false;
        }
        ChatEvents$CompactionCompleted chatEvents$CompactionCompleted = (ChatEvents$CompactionCompleted) other;
        return x44.r(this.organization_uuid, chatEvents$CompactionCompleted.organization_uuid) && x44.r(this.conversation_uuid, chatEvents$CompactionCompleted.conversation_uuid) && this.outcome == chatEvents$CompactionCompleted.outcome && x44.r(this.duration_ms, chatEvents$CompactionCompleted.duration_ms) && x44.r(this.failure_reason, chatEvents$CompactionCompleted.failure_reason);
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    public final Long getDuration_ms() {
        return this.duration_ms;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_compaction_completed";
    }

    public final String getFailure_reason() {
        return this.failure_reason;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final ChatEvents$CompactionOutcome getOutcome() {
        return this.outcome;
    }

    public int hashCode() {
        int iHashCode = (this.outcome.hashCode() + kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid)) * 31;
        Long l = this.duration_ms;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.failure_reason;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        ChatEvents$CompactionOutcome chatEvents$CompactionOutcome = this.outcome;
        Long l = this.duration_ms;
        String str3 = this.failure_reason;
        StringBuilder sbR = kgh.r("CompactionCompleted(organization_uuid=", str, ", conversation_uuid=", str2, ", outcome=");
        sbR.append(chatEvents$CompactionOutcome);
        sbR.append(", duration_ms=");
        sbR.append(l);
        sbR.append(", failure_reason=");
        return ij0.m(sbR, str3, ")");
    }

    public ChatEvents$CompactionCompleted(String str, String str2, ChatEvents$CompactionOutcome chatEvents$CompactionOutcome, Long l, String str3) {
        str.getClass();
        str2.getClass();
        chatEvents$CompactionOutcome.getClass();
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.outcome = chatEvents$CompactionOutcome;
        this.duration_ms = l;
        this.failure_reason = str3;
    }

    public /* synthetic */ ChatEvents$CompactionCompleted(String str, String str2, ChatEvents$CompactionOutcome chatEvents$CompactionOutcome, Long l, String str3, int i, mq5 mq5Var) {
        this(str, str2, chatEvents$CompactionOutcome, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : str3);
    }
}
