package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.ao2;
import defpackage.aq2;
import defpackage.bq2;
import defpackage.fsh;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.xka;
import defpackage.yb5;
import defpackage.znf;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0002KLBo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011B}\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0018J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0018J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0018J\u0080\u0001\u0010'\u001a\u00020&2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0018J\u0010\u0010*\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/J'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020&2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b;\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b=\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\b?\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010@\u001a\u0004\bA\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010B\u001a\u0004\bC\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\bD\u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\bE\u0010\u0018R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\bF\u0010\u0018R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\bG\u0010\u0018R\u0014\u0010I\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\u0018¨\u0006M"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$PollingRecoveryStarted", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "Lcom/anthropic/claude/analytics/events/ChatEvents$PollingRecoveryTriggerReason;", "trigger_reason", "", "has_partial_content", "", "message_age_ms", "skipped", "discovered_in_foreground", "message_uuid", "human_message_uuid", "model", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$PollingRecoveryTriggerReason;ZLjava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$PollingRecoveryTriggerReason;ZLjava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/anthropic/claude/analytics/events/ChatEvents$PollingRecoveryTriggerReason;", "component4", "()Z", "component5", "()Ljava/lang/Long;", "component6", "()Ljava/lang/Boolean;", "component7", "component8", "component9", "component10", "Lcom/anthropic/claude/analytics/events/ChatEvents$PollingRecoveryStarted;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$PollingRecoveryTriggerReason;ZLjava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/ChatEvents$PollingRecoveryStarted;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatEvents$PollingRecoveryStarted;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "Lcom/anthropic/claude/analytics/events/ChatEvents$PollingRecoveryTriggerReason;", "getTrigger_reason", "Z", "getHas_partial_content", "Ljava/lang/Long;", "getMessage_age_ms", "Ljava/lang/Boolean;", "getSkipped", "getDiscovered_in_foreground", "getMessage_uuid", "getHuman_message_uuid", "getModel", "getEventName", "eventName", "Companion", "aq2", "bq2", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatEvents$PollingRecoveryStarted implements AnalyticsEvent {
    public static final int $stable = 0;
    private final String conversation_uuid;
    private final Boolean discovered_in_foreground;
    private final boolean has_partial_content;
    private final String human_message_uuid;
    private final Long message_age_ms;
    private final String message_uuid;
    private final String model;
    private final String organization_uuid;
    private final Boolean skipped;
    private final ChatEvents$PollingRecoveryTriggerReason trigger_reason;
    public static final bq2 Companion = new bq2();
    private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new ao2(22)), null, null, null, null, null, null, null};

    public /* synthetic */ ChatEvents$PollingRecoveryStarted(int i, String str, String str2, ChatEvents$PollingRecoveryTriggerReason chatEvents$PollingRecoveryTriggerReason, boolean z, Long l, Boolean bool, Boolean bool2, String str3, String str4, String str5, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, aq2.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.trigger_reason = chatEvents$PollingRecoveryTriggerReason;
        this.has_partial_content = z;
        if ((i & 16) == 0) {
            this.message_age_ms = null;
        } else {
            this.message_age_ms = l;
        }
        if ((i & 32) == 0) {
            this.skipped = null;
        } else {
            this.skipped = bool;
        }
        if ((i & 64) == 0) {
            this.discovered_in_foreground = null;
        } else {
            this.discovered_in_foreground = bool2;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.message_uuid = null;
        } else {
            this.message_uuid = str3;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.human_message_uuid = null;
        } else {
            this.human_message_uuid = str4;
        }
        if ((i & 512) == 0) {
            this.model = null;
        } else {
            this.model = str5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ChatEvents$PollingRecoveryTriggerReason.Companion.serializer();
    }

    public static /* synthetic */ ChatEvents$PollingRecoveryStarted copy$default(ChatEvents$PollingRecoveryStarted chatEvents$PollingRecoveryStarted, String str, String str2, ChatEvents$PollingRecoveryTriggerReason chatEvents$PollingRecoveryTriggerReason, boolean z, Long l, Boolean bool, Boolean bool2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatEvents$PollingRecoveryStarted.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = chatEvents$PollingRecoveryStarted.conversation_uuid;
        }
        if ((i & 4) != 0) {
            chatEvents$PollingRecoveryTriggerReason = chatEvents$PollingRecoveryStarted.trigger_reason;
        }
        if ((i & 8) != 0) {
            z = chatEvents$PollingRecoveryStarted.has_partial_content;
        }
        if ((i & 16) != 0) {
            l = chatEvents$PollingRecoveryStarted.message_age_ms;
        }
        if ((i & 32) != 0) {
            bool = chatEvents$PollingRecoveryStarted.skipped;
        }
        if ((i & 64) != 0) {
            bool2 = chatEvents$PollingRecoveryStarted.discovered_in_foreground;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            str3 = chatEvents$PollingRecoveryStarted.message_uuid;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            str4 = chatEvents$PollingRecoveryStarted.human_message_uuid;
        }
        if ((i & 512) != 0) {
            str5 = chatEvents$PollingRecoveryStarted.model;
        }
        String str6 = str4;
        String str7 = str5;
        Boolean bool3 = bool2;
        String str8 = str3;
        Long l2 = l;
        Boolean bool4 = bool;
        return chatEvents$PollingRecoveryStarted.copy(str, str2, chatEvents$PollingRecoveryTriggerReason, z, l2, bool4, bool3, str8, str6, str7);
    }

    public static final /* synthetic */ void write$Self$analytics(ChatEvents$PollingRecoveryStarted self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.trigger_reason);
        output.p(serialDesc, 3, self.has_partial_content);
        if (output.E(serialDesc) || self.message_age_ms != null) {
            output.B(serialDesc, 4, xka.a, self.message_age_ms);
        }
        if (output.E(serialDesc) || self.skipped != null) {
            output.B(serialDesc, 5, zt1.a, self.skipped);
        }
        if (output.E(serialDesc) || self.discovered_in_foreground != null) {
            output.B(serialDesc, 6, zt1.a, self.discovered_in_foreground);
        }
        if (output.E(serialDesc) || self.message_uuid != null) {
            output.B(serialDesc, 7, srg.a, self.message_uuid);
        }
        if (output.E(serialDesc) || self.human_message_uuid != null) {
            output.B(serialDesc, 8, srg.a, self.human_message_uuid);
        }
        if (!output.E(serialDesc) && self.model == null) {
            return;
        }
        output.B(serialDesc, 9, srg.a, self.model);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ChatEvents$PollingRecoveryTriggerReason getTrigger_reason() {
        return this.trigger_reason;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getHas_partial_content() {
        return this.has_partial_content;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getMessage_age_ms() {
        return this.message_age_ms;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getSkipped() {
        return this.skipped;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getDiscovered_in_foreground() {
        return this.discovered_in_foreground;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMessage_uuid() {
        return this.message_uuid;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getHuman_message_uuid() {
        return this.human_message_uuid;
    }

    public final ChatEvents$PollingRecoveryStarted copy(String organization_uuid, String conversation_uuid, ChatEvents$PollingRecoveryTriggerReason trigger_reason, boolean has_partial_content, Long message_age_ms, Boolean skipped, Boolean discovered_in_foreground, String message_uuid, String human_message_uuid, String model) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        trigger_reason.getClass();
        return new ChatEvents$PollingRecoveryStarted(organization_uuid, conversation_uuid, trigger_reason, has_partial_content, message_age_ms, skipped, discovered_in_foreground, message_uuid, human_message_uuid, model);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatEvents$PollingRecoveryStarted)) {
            return false;
        }
        ChatEvents$PollingRecoveryStarted chatEvents$PollingRecoveryStarted = (ChatEvents$PollingRecoveryStarted) other;
        return x44.r(this.organization_uuid, chatEvents$PollingRecoveryStarted.organization_uuid) && x44.r(this.conversation_uuid, chatEvents$PollingRecoveryStarted.conversation_uuid) && this.trigger_reason == chatEvents$PollingRecoveryStarted.trigger_reason && this.has_partial_content == chatEvents$PollingRecoveryStarted.has_partial_content && x44.r(this.message_age_ms, chatEvents$PollingRecoveryStarted.message_age_ms) && x44.r(this.skipped, chatEvents$PollingRecoveryStarted.skipped) && x44.r(this.discovered_in_foreground, chatEvents$PollingRecoveryStarted.discovered_in_foreground) && x44.r(this.message_uuid, chatEvents$PollingRecoveryStarted.message_uuid) && x44.r(this.human_message_uuid, chatEvents$PollingRecoveryStarted.human_message_uuid) && x44.r(this.model, chatEvents$PollingRecoveryStarted.model);
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    public final Boolean getDiscovered_in_foreground() {
        return this.discovered_in_foreground;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_polling_recovery_started";
    }

    public final boolean getHas_partial_content() {
        return this.has_partial_content;
    }

    public final String getHuman_message_uuid() {
        return this.human_message_uuid;
    }

    public final Long getMessage_age_ms() {
        return this.message_age_ms;
    }

    public final String getMessage_uuid() {
        return this.message_uuid;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final Boolean getSkipped() {
        return this.skipped;
    }

    public final ChatEvents$PollingRecoveryTriggerReason getTrigger_reason() {
        return this.trigger_reason;
    }

    public int hashCode() {
        int iP = fsh.p((this.trigger_reason.hashCode() + kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid)) * 31, 31, this.has_partial_content);
        Long l = this.message_age_ms;
        int iHashCode = (iP + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.skipped;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.discovered_in_foreground;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.message_uuid;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.human_message_uuid;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.model;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        ChatEvents$PollingRecoveryTriggerReason chatEvents$PollingRecoveryTriggerReason = this.trigger_reason;
        boolean z = this.has_partial_content;
        Long l = this.message_age_ms;
        Boolean bool = this.skipped;
        Boolean bool2 = this.discovered_in_foreground;
        String str3 = this.message_uuid;
        String str4 = this.human_message_uuid;
        String str5 = this.model;
        StringBuilder sbR = kgh.r("PollingRecoveryStarted(organization_uuid=", str, ", conversation_uuid=", str2, ", trigger_reason=");
        sbR.append(chatEvents$PollingRecoveryTriggerReason);
        sbR.append(", has_partial_content=");
        sbR.append(z);
        sbR.append(", message_age_ms=");
        sbR.append(l);
        sbR.append(", skipped=");
        sbR.append(bool);
        sbR.append(", discovered_in_foreground=");
        sbR.append(bool2);
        sbR.append(", message_uuid=");
        sbR.append(str3);
        sbR.append(", human_message_uuid=");
        return vb7.t(sbR, str4, ", model=", str5, ")");
    }

    public ChatEvents$PollingRecoveryStarted(String str, String str2, ChatEvents$PollingRecoveryTriggerReason chatEvents$PollingRecoveryTriggerReason, boolean z, Long l, Boolean bool, Boolean bool2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        chatEvents$PollingRecoveryTriggerReason.getClass();
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.trigger_reason = chatEvents$PollingRecoveryTriggerReason;
        this.has_partial_content = z;
        this.message_age_ms = l;
        this.skipped = bool;
        this.discovered_in_foreground = bool2;
        this.message_uuid = str3;
        this.human_message_uuid = str4;
        this.model = str5;
    }

    public /* synthetic */ ChatEvents$PollingRecoveryStarted(String str, String str2, ChatEvents$PollingRecoveryTriggerReason chatEvents$PollingRecoveryTriggerReason, boolean z, Long l, Boolean bool, Boolean bool2, String str3, String str4, String str5, int i, mq5 mq5Var) {
        this(str, str2, chatEvents$PollingRecoveryTriggerReason, z, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : bool2, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : str3, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : str4, (i & 512) != 0 ? null : str5);
    }
}
