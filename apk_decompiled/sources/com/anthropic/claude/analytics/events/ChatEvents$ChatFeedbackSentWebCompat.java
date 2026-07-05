package com.anthropic.claude.analytics.events;

import defpackage.co2;
import defpackage.do2;
import defpackage.fsh;
import defpackage.grc;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000278B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJN\u0010#\u001a\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b1\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b2\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b3\u0010\u001cR\u0014\u00105\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u001c¨\u00069"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$ChatFeedbackSentWebCompat", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "message_uuid", "conversation_uuid", "", "artifacts_enabled", "conversation_has_artifacts", "type", "input_mode", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ChatEvents$ChatFeedbackSentWebCompat;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatEvents$ChatFeedbackSentWebCompat;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/ChatEvents$ChatFeedbackSentWebCompat;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage_uuid", "getConversation_uuid", "Z", "getArtifacts_enabled", "getConversation_has_artifacts", "getType", "getInput_mode", "getEventName", "eventName", "Companion", "co2", "do2", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatEvents$ChatFeedbackSentWebCompat implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final do2 Companion = new do2();
    private final boolean artifacts_enabled;
    private final boolean conversation_has_artifacts;
    private final String conversation_uuid;
    private final String input_mode;
    private final String message_uuid;
    private final String type;

    public /* synthetic */ ChatEvents$ChatFeedbackSentWebCompat(int i, String str, String str2, boolean z, boolean z2, String str3, String str4, vnf vnfVar) {
        if (31 != (i & 31)) {
            gvj.f(i, 31, co2.a.getDescriptor());
            throw null;
        }
        this.message_uuid = str;
        this.conversation_uuid = str2;
        this.artifacts_enabled = z;
        this.conversation_has_artifacts = z2;
        this.type = str3;
        if ((i & 32) == 0) {
            this.input_mode = null;
        } else {
            this.input_mode = str4;
        }
    }

    public static /* synthetic */ ChatEvents$ChatFeedbackSentWebCompat copy$default(ChatEvents$ChatFeedbackSentWebCompat chatEvents$ChatFeedbackSentWebCompat, String str, String str2, boolean z, boolean z2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatEvents$ChatFeedbackSentWebCompat.message_uuid;
        }
        if ((i & 2) != 0) {
            str2 = chatEvents$ChatFeedbackSentWebCompat.conversation_uuid;
        }
        if ((i & 4) != 0) {
            z = chatEvents$ChatFeedbackSentWebCompat.artifacts_enabled;
        }
        if ((i & 8) != 0) {
            z2 = chatEvents$ChatFeedbackSentWebCompat.conversation_has_artifacts;
        }
        if ((i & 16) != 0) {
            str3 = chatEvents$ChatFeedbackSentWebCompat.type;
        }
        if ((i & 32) != 0) {
            str4 = chatEvents$ChatFeedbackSentWebCompat.input_mode;
        }
        String str5 = str3;
        String str6 = str4;
        return chatEvents$ChatFeedbackSentWebCompat.copy(str, str2, z, z2, str5, str6);
    }

    public static final /* synthetic */ void write$Self$analytics(ChatEvents$ChatFeedbackSentWebCompat self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.message_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.p(serialDesc, 2, self.artifacts_enabled);
        output.p(serialDesc, 3, self.conversation_has_artifacts);
        output.q(serialDesc, 4, self.type);
        if (!output.E(serialDesc) && self.input_mode == null) {
            return;
        }
        output.B(serialDesc, 5, srg.a, self.input_mode);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage_uuid() {
        return this.message_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getArtifacts_enabled() {
        return this.artifacts_enabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getConversation_has_artifacts() {
        return this.conversation_has_artifacts;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getInput_mode() {
        return this.input_mode;
    }

    public final ChatEvents$ChatFeedbackSentWebCompat copy(String message_uuid, String conversation_uuid, boolean artifacts_enabled, boolean conversation_has_artifacts, String type, String input_mode) {
        message_uuid.getClass();
        conversation_uuid.getClass();
        type.getClass();
        return new ChatEvents$ChatFeedbackSentWebCompat(message_uuid, conversation_uuid, artifacts_enabled, conversation_has_artifacts, type, input_mode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatEvents$ChatFeedbackSentWebCompat)) {
            return false;
        }
        ChatEvents$ChatFeedbackSentWebCompat chatEvents$ChatFeedbackSentWebCompat = (ChatEvents$ChatFeedbackSentWebCompat) other;
        return x44.r(this.message_uuid, chatEvents$ChatFeedbackSentWebCompat.message_uuid) && x44.r(this.conversation_uuid, chatEvents$ChatFeedbackSentWebCompat.conversation_uuid) && this.artifacts_enabled == chatEvents$ChatFeedbackSentWebCompat.artifacts_enabled && this.conversation_has_artifacts == chatEvents$ChatFeedbackSentWebCompat.conversation_has_artifacts && x44.r(this.type, chatEvents$ChatFeedbackSentWebCompat.type) && x44.r(this.input_mode, chatEvents$ChatFeedbackSentWebCompat.input_mode);
    }

    public final boolean getArtifacts_enabled() {
        return this.artifacts_enabled;
    }

    public final boolean getConversation_has_artifacts() {
        return this.conversation_has_artifacts;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.conversation.feedback.sent";
    }

    public final String getInput_mode() {
        return this.input_mode;
    }

    public final String getMessage_uuid() {
        return this.message_uuid;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iL = kgh.l(fsh.p(fsh.p(kgh.l(this.message_uuid.hashCode() * 31, 31, this.conversation_uuid), 31, this.artifacts_enabled), 31, this.conversation_has_artifacts), 31, this.type);
        String str = this.input_mode;
        return iL + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.message_uuid;
        String str2 = this.conversation_uuid;
        boolean z = this.artifacts_enabled;
        boolean z2 = this.conversation_has_artifacts;
        String str3 = this.type;
        String str4 = this.input_mode;
        StringBuilder sbR = kgh.r("ChatFeedbackSentWebCompat(message_uuid=", str, ", conversation_uuid=", str2, ", artifacts_enabled=");
        ij0.A(sbR, z, ", conversation_has_artifacts=", z2, ", type=");
        return vb7.t(sbR, str3, ", input_mode=", str4, ")");
    }

    public ChatEvents$ChatFeedbackSentWebCompat(String str, String str2, boolean z, boolean z2, String str3, String str4) {
        grc.B(str, str2, str3);
        this.message_uuid = str;
        this.conversation_uuid = str2;
        this.artifacts_enabled = z;
        this.conversation_has_artifacts = z2;
        this.type = str3;
        this.input_mode = str4;
    }

    public /* synthetic */ ChatEvents$ChatFeedbackSentWebCompat(String str, String str2, boolean z, boolean z2, String str3, String str4, int i, mq5 mq5Var) {
        this(str, str2, z, z2, str3, (i & 32) != 0 ? null : str4);
    }
}
