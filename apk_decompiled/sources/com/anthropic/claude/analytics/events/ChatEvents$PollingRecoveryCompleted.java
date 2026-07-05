package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.ao2;
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
import defpackage.xp2;
import defpackage.yb5;
import defpackage.yp2;
import defpackage.znf;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 f2\u00020\u0001:\u0002ghB»\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u001bBÁ\u0001\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001a\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b/\u0010.J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010!J\u0012\u00101\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b3\u0010.J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010!J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010!J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010!J\u0012\u00107\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b7\u0010,J\u0012\u00108\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u0010!JÐ\u0001\u0010:\u001a\u0002092\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b<\u0010!J\u0010\u0010=\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b=\u0010(J\u001a\u0010@\u001a\u00020\u000e2\b\u0010?\u001a\u0004\u0018\u00010>HÖ\u0003¢\u0006\u0004\b@\u0010AJ'\u0010J\u001a\u00020G2\u0006\u0010B\u001a\u0002092\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020EH\u0001¢\u0006\u0004\bH\u0010IR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010K\u001a\u0004\bL\u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010K\u001a\u0004\bM\u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010N\u001a\u0004\bO\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010P\u001a\u0004\bQ\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010R\u001a\u0004\bS\u0010(R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010T\u001a\u0004\bU\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010V\u001a\u0004\bW\u0010,R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010X\u001a\u0004\bY\u0010.R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010X\u001a\u0004\bZ\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010K\u001a\u0004\b[\u0010!R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\\\u001a\u0004\b]\u00102R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010X\u001a\u0004\b^\u0010.R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010K\u001a\u0004\b_\u0010!R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010K\u001a\u0004\b`\u0010!R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010K\u001a\u0004\ba\u0010!R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010V\u001a\u0004\bb\u0010,R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010K\u001a\u0004\bc\u0010!R\u0014\u0010e\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010!¨\u0006i"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$PollingRecoveryCompleted", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "Lcom/anthropic/claude/analytics/events/ChatEvents$PollingRecoveryOutcome;", "outcome", "Lcom/anthropic/claude/analytics/events/ChatEvents$PollingRecoveryTriggerReason;", "trigger_reason", "", "poll_attempt_count", "", "total_duration_ms", "message_age_ms", "", "discovered_in_foreground", "resolved_in_foreground", "message_uuid", "Lcom/anthropic/claude/analytics/events/ChatEvents$PollingRecoveryCancellationCause;", "cancellation_cause", "had_pending_tool_approval", "last_content_block_type", "recovered_stop_reason", "human_message_uuid", "time_in_foreground_ms", "model", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$PollingRecoveryOutcome;Lcom/anthropic/claude/analytics/events/ChatEvents$PollingRecoveryTriggerReason;IJLjava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$PollingRecoveryCancellationCause;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$PollingRecoveryOutcome;Lcom/anthropic/claude/analytics/events/ChatEvents$PollingRecoveryTriggerReason;IJLjava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$PollingRecoveryCancellationCause;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/anthropic/claude/analytics/events/ChatEvents$PollingRecoveryOutcome;", "component4", "()Lcom/anthropic/claude/analytics/events/ChatEvents$PollingRecoveryTriggerReason;", "component5", "()I", "component6", "()J", "component7", "()Ljava/lang/Long;", "component8", "()Ljava/lang/Boolean;", "component9", "component10", "component11", "()Lcom/anthropic/claude/analytics/events/ChatEvents$PollingRecoveryCancellationCause;", "component12", "component13", "component14", "component15", "component16", "component17", "Lcom/anthropic/claude/analytics/events/ChatEvents$PollingRecoveryCompleted;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$PollingRecoveryOutcome;Lcom/anthropic/claude/analytics/events/ChatEvents$PollingRecoveryTriggerReason;IJLjava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$PollingRecoveryCancellationCause;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/ChatEvents$PollingRecoveryCompleted;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatEvents$PollingRecoveryCompleted;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "Lcom/anthropic/claude/analytics/events/ChatEvents$PollingRecoveryOutcome;", "getOutcome", "Lcom/anthropic/claude/analytics/events/ChatEvents$PollingRecoveryTriggerReason;", "getTrigger_reason", "I", "getPoll_attempt_count", "J", "getTotal_duration_ms", "Ljava/lang/Long;", "getMessage_age_ms", "Ljava/lang/Boolean;", "getDiscovered_in_foreground", "getResolved_in_foreground", "getMessage_uuid", "Lcom/anthropic/claude/analytics/events/ChatEvents$PollingRecoveryCancellationCause;", "getCancellation_cause", "getHad_pending_tool_approval", "getLast_content_block_type", "getRecovered_stop_reason", "getHuman_message_uuid", "getTime_in_foreground_ms", "getModel", "getEventName", "eventName", "Companion", "xp2", "yp2", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatEvents$PollingRecoveryCompleted implements AnalyticsEvent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final yp2 Companion = new yp2();
    private final ChatEvents$PollingRecoveryCancellationCause cancellation_cause;
    private final String conversation_uuid;
    private final Boolean discovered_in_foreground;
    private final Boolean had_pending_tool_approval;
    private final String human_message_uuid;
    private final String last_content_block_type;
    private final Long message_age_ms;
    private final String message_uuid;
    private final String model;
    private final String organization_uuid;
    private final ChatEvents$PollingRecoveryOutcome outcome;
    private final int poll_attempt_count;
    private final String recovered_stop_reason;
    private final Boolean resolved_in_foreground;
    private final Long time_in_foreground_ms;
    private final long total_duration_ms;
    private final ChatEvents$PollingRecoveryTriggerReason trigger_reason;

    static {
        ao2 ao2Var = new ao2(18);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, yb5.w(w1aVar, ao2Var), yb5.w(w1aVar, new ao2(19)), null, null, null, null, null, null, yb5.w(w1aVar, new ao2(20)), null, null, null, null, null, null};
    }

    public /* synthetic */ ChatEvents$PollingRecoveryCompleted(int i, String str, String str2, ChatEvents$PollingRecoveryOutcome chatEvents$PollingRecoveryOutcome, ChatEvents$PollingRecoveryTriggerReason chatEvents$PollingRecoveryTriggerReason, int i2, long j, Long l, Boolean bool, Boolean bool2, String str3, ChatEvents$PollingRecoveryCancellationCause chatEvents$PollingRecoveryCancellationCause, Boolean bool3, String str4, String str5, String str6, Long l2, String str7, vnf vnfVar) {
        if (63 != (i & 63)) {
            gvj.f(i, 63, xp2.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.outcome = chatEvents$PollingRecoveryOutcome;
        this.trigger_reason = chatEvents$PollingRecoveryTriggerReason;
        this.poll_attempt_count = i2;
        this.total_duration_ms = j;
        if ((i & 64) == 0) {
            this.message_age_ms = null;
        } else {
            this.message_age_ms = l;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.discovered_in_foreground = null;
        } else {
            this.discovered_in_foreground = bool;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.resolved_in_foreground = null;
        } else {
            this.resolved_in_foreground = bool2;
        }
        if ((i & 512) == 0) {
            this.message_uuid = null;
        } else {
            this.message_uuid = str3;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
            this.cancellation_cause = null;
        } else {
            this.cancellation_cause = chatEvents$PollingRecoveryCancellationCause;
        }
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 0) {
            this.had_pending_tool_approval = null;
        } else {
            this.had_pending_tool_approval = bool3;
        }
        if ((i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0) {
            this.last_content_block_type = null;
        } else {
            this.last_content_block_type = str4;
        }
        if ((i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) == 0) {
            this.recovered_stop_reason = null;
        } else {
            this.recovered_stop_reason = str5;
        }
        if ((i & 16384) == 0) {
            this.human_message_uuid = null;
        } else {
            this.human_message_uuid = str6;
        }
        if ((32768 & i) == 0) {
            this.time_in_foreground_ms = null;
        } else {
            this.time_in_foreground_ms = l2;
        }
        if ((i & 65536) == 0) {
            this.model = null;
        } else {
            this.model = str7;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ChatEvents$PollingRecoveryOutcome.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return ChatEvents$PollingRecoveryTriggerReason.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return ChatEvents$PollingRecoveryCancellationCause.Companion.serializer();
    }

    public static /* synthetic */ ChatEvents$PollingRecoveryCompleted copy$default(ChatEvents$PollingRecoveryCompleted chatEvents$PollingRecoveryCompleted, String str, String str2, ChatEvents$PollingRecoveryOutcome chatEvents$PollingRecoveryOutcome, ChatEvents$PollingRecoveryTriggerReason chatEvents$PollingRecoveryTriggerReason, int i, long j, Long l, Boolean bool, Boolean bool2, String str3, ChatEvents$PollingRecoveryCancellationCause chatEvents$PollingRecoveryCancellationCause, Boolean bool3, String str4, String str5, String str6, Long l2, String str7, int i2, Object obj) {
        String str8;
        Long l3;
        String str9 = (i2 & 1) != 0 ? chatEvents$PollingRecoveryCompleted.organization_uuid : str;
        String str10 = (i2 & 2) != 0 ? chatEvents$PollingRecoveryCompleted.conversation_uuid : str2;
        ChatEvents$PollingRecoveryOutcome chatEvents$PollingRecoveryOutcome2 = (i2 & 4) != 0 ? chatEvents$PollingRecoveryCompleted.outcome : chatEvents$PollingRecoveryOutcome;
        ChatEvents$PollingRecoveryTriggerReason chatEvents$PollingRecoveryTriggerReason2 = (i2 & 8) != 0 ? chatEvents$PollingRecoveryCompleted.trigger_reason : chatEvents$PollingRecoveryTriggerReason;
        int i3 = (i2 & 16) != 0 ? chatEvents$PollingRecoveryCompleted.poll_attempt_count : i;
        long j2 = (i2 & 32) != 0 ? chatEvents$PollingRecoveryCompleted.total_duration_ms : j;
        Long l4 = (i2 & 64) != 0 ? chatEvents$PollingRecoveryCompleted.message_age_ms : l;
        Boolean bool4 = (i2 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? chatEvents$PollingRecoveryCompleted.discovered_in_foreground : bool;
        Boolean bool5 = (i2 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? chatEvents$PollingRecoveryCompleted.resolved_in_foreground : bool2;
        String str11 = (i2 & 512) != 0 ? chatEvents$PollingRecoveryCompleted.message_uuid : str3;
        ChatEvents$PollingRecoveryCancellationCause chatEvents$PollingRecoveryCancellationCause2 = (i2 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? chatEvents$PollingRecoveryCompleted.cancellation_cause : chatEvents$PollingRecoveryCancellationCause;
        Boolean bool6 = (i2 & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? chatEvents$PollingRecoveryCompleted.had_pending_tool_approval : bool3;
        String str12 = (i2 & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? chatEvents$PollingRecoveryCompleted.last_content_block_type : str4;
        String str13 = str9;
        String str14 = (i2 & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? chatEvents$PollingRecoveryCompleted.recovered_stop_reason : str5;
        String str15 = (i2 & 16384) != 0 ? chatEvents$PollingRecoveryCompleted.human_message_uuid : str6;
        Long l5 = (i2 & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0 ? chatEvents$PollingRecoveryCompleted.time_in_foreground_ms : l2;
        if ((i2 & 65536) != 0) {
            l3 = l5;
            str8 = chatEvents$PollingRecoveryCompleted.model;
        } else {
            str8 = str7;
            l3 = l5;
        }
        return chatEvents$PollingRecoveryCompleted.copy(str13, str10, chatEvents$PollingRecoveryOutcome2, chatEvents$PollingRecoveryTriggerReason2, i3, j2, l4, bool4, bool5, str11, chatEvents$PollingRecoveryCancellationCause2, bool6, str12, str14, str15, l3, str8);
    }

    public static final /* synthetic */ void write$Self$analytics(ChatEvents$PollingRecoveryCompleted self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.outcome);
        output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.trigger_reason);
        output.l(4, self.poll_attempt_count, serialDesc);
        output.D(serialDesc, 5, self.total_duration_ms);
        if (output.E(serialDesc) || self.message_age_ms != null) {
            output.B(serialDesc, 6, xka.a, self.message_age_ms);
        }
        if (output.E(serialDesc) || self.discovered_in_foreground != null) {
            output.B(serialDesc, 7, zt1.a, self.discovered_in_foreground);
        }
        if (output.E(serialDesc) || self.resolved_in_foreground != null) {
            output.B(serialDesc, 8, zt1.a, self.resolved_in_foreground);
        }
        if (output.E(serialDesc) || self.message_uuid != null) {
            output.B(serialDesc, 9, srg.a, self.message_uuid);
        }
        if (output.E(serialDesc) || self.cancellation_cause != null) {
            output.B(serialDesc, 10, (znf) kw9VarArr[10].getValue(), self.cancellation_cause);
        }
        if (output.E(serialDesc) || self.had_pending_tool_approval != null) {
            output.B(serialDesc, 11, zt1.a, self.had_pending_tool_approval);
        }
        if (output.E(serialDesc) || self.last_content_block_type != null) {
            output.B(serialDesc, 12, srg.a, self.last_content_block_type);
        }
        if (output.E(serialDesc) || self.recovered_stop_reason != null) {
            output.B(serialDesc, 13, srg.a, self.recovered_stop_reason);
        }
        if (output.E(serialDesc) || self.human_message_uuid != null) {
            output.B(serialDesc, 14, srg.a, self.human_message_uuid);
        }
        if (output.E(serialDesc) || self.time_in_foreground_ms != null) {
            output.B(serialDesc, 15, xka.a, self.time_in_foreground_ms);
        }
        if (!output.E(serialDesc) && self.model == null) {
            return;
        }
        output.B(serialDesc, 16, srg.a, self.model);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getMessage_uuid() {
        return this.message_uuid;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final ChatEvents$PollingRecoveryCancellationCause getCancellation_cause() {
        return this.cancellation_cause;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getHad_pending_tool_approval() {
        return this.had_pending_tool_approval;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getLast_content_block_type() {
        return this.last_content_block_type;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getRecovered_stop_reason() {
        return this.recovered_stop_reason;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getHuman_message_uuid() {
        return this.human_message_uuid;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Long getTime_in_foreground_ms() {
        return this.time_in_foreground_ms;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ChatEvents$PollingRecoveryOutcome getOutcome() {
        return this.outcome;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ChatEvents$PollingRecoveryTriggerReason getTrigger_reason() {
        return this.trigger_reason;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPoll_attempt_count() {
        return this.poll_attempt_count;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getTotal_duration_ms() {
        return this.total_duration_ms;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getMessage_age_ms() {
        return this.message_age_ms;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getDiscovered_in_foreground() {
        return this.discovered_in_foreground;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getResolved_in_foreground() {
        return this.resolved_in_foreground;
    }

    public final ChatEvents$PollingRecoveryCompleted copy(String organization_uuid, String conversation_uuid, ChatEvents$PollingRecoveryOutcome outcome, ChatEvents$PollingRecoveryTriggerReason trigger_reason, int poll_attempt_count, long total_duration_ms, Long message_age_ms, Boolean discovered_in_foreground, Boolean resolved_in_foreground, String message_uuid, ChatEvents$PollingRecoveryCancellationCause cancellation_cause, Boolean had_pending_tool_approval, String last_content_block_type, String recovered_stop_reason, String human_message_uuid, Long time_in_foreground_ms, String model) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        outcome.getClass();
        trigger_reason.getClass();
        return new ChatEvents$PollingRecoveryCompleted(organization_uuid, conversation_uuid, outcome, trigger_reason, poll_attempt_count, total_duration_ms, message_age_ms, discovered_in_foreground, resolved_in_foreground, message_uuid, cancellation_cause, had_pending_tool_approval, last_content_block_type, recovered_stop_reason, human_message_uuid, time_in_foreground_ms, model);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatEvents$PollingRecoveryCompleted)) {
            return false;
        }
        ChatEvents$PollingRecoveryCompleted chatEvents$PollingRecoveryCompleted = (ChatEvents$PollingRecoveryCompleted) other;
        return x44.r(this.organization_uuid, chatEvents$PollingRecoveryCompleted.organization_uuid) && x44.r(this.conversation_uuid, chatEvents$PollingRecoveryCompleted.conversation_uuid) && this.outcome == chatEvents$PollingRecoveryCompleted.outcome && this.trigger_reason == chatEvents$PollingRecoveryCompleted.trigger_reason && this.poll_attempt_count == chatEvents$PollingRecoveryCompleted.poll_attempt_count && this.total_duration_ms == chatEvents$PollingRecoveryCompleted.total_duration_ms && x44.r(this.message_age_ms, chatEvents$PollingRecoveryCompleted.message_age_ms) && x44.r(this.discovered_in_foreground, chatEvents$PollingRecoveryCompleted.discovered_in_foreground) && x44.r(this.resolved_in_foreground, chatEvents$PollingRecoveryCompleted.resolved_in_foreground) && x44.r(this.message_uuid, chatEvents$PollingRecoveryCompleted.message_uuid) && this.cancellation_cause == chatEvents$PollingRecoveryCompleted.cancellation_cause && x44.r(this.had_pending_tool_approval, chatEvents$PollingRecoveryCompleted.had_pending_tool_approval) && x44.r(this.last_content_block_type, chatEvents$PollingRecoveryCompleted.last_content_block_type) && x44.r(this.recovered_stop_reason, chatEvents$PollingRecoveryCompleted.recovered_stop_reason) && x44.r(this.human_message_uuid, chatEvents$PollingRecoveryCompleted.human_message_uuid) && x44.r(this.time_in_foreground_ms, chatEvents$PollingRecoveryCompleted.time_in_foreground_ms) && x44.r(this.model, chatEvents$PollingRecoveryCompleted.model);
    }

    public final ChatEvents$PollingRecoveryCancellationCause getCancellation_cause() {
        return this.cancellation_cause;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    public final Boolean getDiscovered_in_foreground() {
        return this.discovered_in_foreground;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_polling_recovery_completed";
    }

    public final Boolean getHad_pending_tool_approval() {
        return this.had_pending_tool_approval;
    }

    public final String getHuman_message_uuid() {
        return this.human_message_uuid;
    }

    public final String getLast_content_block_type() {
        return this.last_content_block_type;
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

    public final ChatEvents$PollingRecoveryOutcome getOutcome() {
        return this.outcome;
    }

    public final int getPoll_attempt_count() {
        return this.poll_attempt_count;
    }

    public final String getRecovered_stop_reason() {
        return this.recovered_stop_reason;
    }

    public final Boolean getResolved_in_foreground() {
        return this.resolved_in_foreground;
    }

    public final Long getTime_in_foreground_ms() {
        return this.time_in_foreground_ms;
    }

    public final long getTotal_duration_ms() {
        return this.total_duration_ms;
    }

    public final ChatEvents$PollingRecoveryTriggerReason getTrigger_reason() {
        return this.trigger_reason;
    }

    public int hashCode() {
        int iE = vb7.e(vb7.c(this.poll_attempt_count, (this.trigger_reason.hashCode() + ((this.outcome.hashCode() + kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid)) * 31)) * 31, 31), 31, this.total_duration_ms);
        Long l = this.message_age_ms;
        int iHashCode = (iE + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.discovered_in_foreground;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.resolved_in_foreground;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.message_uuid;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        ChatEvents$PollingRecoveryCancellationCause chatEvents$PollingRecoveryCancellationCause = this.cancellation_cause;
        int iHashCode5 = (iHashCode4 + (chatEvents$PollingRecoveryCancellationCause == null ? 0 : chatEvents$PollingRecoveryCancellationCause.hashCode())) * 31;
        Boolean bool3 = this.had_pending_tool_approval;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.last_content_block_type;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.recovered_stop_reason;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.human_message_uuid;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.time_in_foreground_ms;
        int iHashCode10 = (iHashCode9 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str5 = this.model;
        return iHashCode10 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        ChatEvents$PollingRecoveryOutcome chatEvents$PollingRecoveryOutcome = this.outcome;
        ChatEvents$PollingRecoveryTriggerReason chatEvents$PollingRecoveryTriggerReason = this.trigger_reason;
        int i = this.poll_attempt_count;
        long j = this.total_duration_ms;
        Long l = this.message_age_ms;
        Boolean bool = this.discovered_in_foreground;
        Boolean bool2 = this.resolved_in_foreground;
        String str3 = this.message_uuid;
        ChatEvents$PollingRecoveryCancellationCause chatEvents$PollingRecoveryCancellationCause = this.cancellation_cause;
        Boolean bool3 = this.had_pending_tool_approval;
        String str4 = this.last_content_block_type;
        String str5 = this.recovered_stop_reason;
        String str6 = this.human_message_uuid;
        Long l2 = this.time_in_foreground_ms;
        String str7 = this.model;
        StringBuilder sbR = kgh.r("PollingRecoveryCompleted(organization_uuid=", str, ", conversation_uuid=", str2, ", outcome=");
        sbR.append(chatEvents$PollingRecoveryOutcome);
        sbR.append(", trigger_reason=");
        sbR.append(chatEvents$PollingRecoveryTriggerReason);
        sbR.append(", poll_attempt_count=");
        sbR.append(i);
        sbR.append(", total_duration_ms=");
        sbR.append(j);
        sbR.append(", message_age_ms=");
        sbR.append(l);
        sbR.append(", discovered_in_foreground=");
        sbR.append(bool);
        sbR.append(", resolved_in_foreground=");
        sbR.append(bool2);
        sbR.append(", message_uuid=");
        sbR.append(str3);
        sbR.append(", cancellation_cause=");
        sbR.append(chatEvents$PollingRecoveryCancellationCause);
        sbR.append(", had_pending_tool_approval=");
        sbR.append(bool3);
        kgh.u(sbR, ", last_content_block_type=", str4, ", recovered_stop_reason=", str5);
        sbR.append(", human_message_uuid=");
        sbR.append(str6);
        sbR.append(", time_in_foreground_ms=");
        sbR.append(l2);
        return kgh.q(sbR, ", model=", str7, ")");
    }

    public ChatEvents$PollingRecoveryCompleted(String str, String str2, ChatEvents$PollingRecoveryOutcome chatEvents$PollingRecoveryOutcome, ChatEvents$PollingRecoveryTriggerReason chatEvents$PollingRecoveryTriggerReason, int i, long j, Long l, Boolean bool, Boolean bool2, String str3, ChatEvents$PollingRecoveryCancellationCause chatEvents$PollingRecoveryCancellationCause, Boolean bool3, String str4, String str5, String str6, Long l2, String str7) {
        str.getClass();
        str2.getClass();
        chatEvents$PollingRecoveryOutcome.getClass();
        chatEvents$PollingRecoveryTriggerReason.getClass();
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.outcome = chatEvents$PollingRecoveryOutcome;
        this.trigger_reason = chatEvents$PollingRecoveryTriggerReason;
        this.poll_attempt_count = i;
        this.total_duration_ms = j;
        this.message_age_ms = l;
        this.discovered_in_foreground = bool;
        this.resolved_in_foreground = bool2;
        this.message_uuid = str3;
        this.cancellation_cause = chatEvents$PollingRecoveryCancellationCause;
        this.had_pending_tool_approval = bool3;
        this.last_content_block_type = str4;
        this.recovered_stop_reason = str5;
        this.human_message_uuid = str6;
        this.time_in_foreground_ms = l2;
        this.model = str7;
    }

    public /* synthetic */ ChatEvents$PollingRecoveryCompleted(String str, String str2, ChatEvents$PollingRecoveryOutcome chatEvents$PollingRecoveryOutcome, ChatEvents$PollingRecoveryTriggerReason chatEvents$PollingRecoveryTriggerReason, int i, long j, Long l, Boolean bool, Boolean bool2, String str3, ChatEvents$PollingRecoveryCancellationCause chatEvents$PollingRecoveryCancellationCause, Boolean bool3, String str4, String str5, String str6, Long l2, String str7, int i2, mq5 mq5Var) {
        this(str, str2, chatEvents$PollingRecoveryOutcome, chatEvents$PollingRecoveryTriggerReason, i, j, (i2 & 64) != 0 ? null : l, (i2 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : bool, (i2 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : bool2, (i2 & 512) != 0 ? null : str3, (i2 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? null : chatEvents$PollingRecoveryCancellationCause, (i2 & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? null : bool3, (i2 & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? null : str4, (i2 & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? null : str5, (i2 & 16384) != 0 ? null : str6, (32768 & i2) != 0 ? null : l2, (i2 & 65536) != 0 ? null : str7);
    }
}
