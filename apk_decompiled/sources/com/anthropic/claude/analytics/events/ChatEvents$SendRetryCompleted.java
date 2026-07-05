package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.br2;
import defpackage.cr2;
import defpackage.e79;
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
import defpackage.xq2;
import defpackage.yb5;
import defpackage.znf;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0002KLBk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012B{\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0018J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0018J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0018J~\u0010(\u001a\u00020'2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0018J\u0010\u0010+\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b+\u0010\u001dJ\u001a\u0010.\u001a\u00020\u000b2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/J'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020'2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b;\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b=\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\b?\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010@\u001a\u0004\bA\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\b\f\u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010C\u001a\u0004\bD\u0010#R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\bE\u0010\u0018R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\bF\u0010\u0018R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\bG\u0010\u0018R\u0014\u0010I\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\u0018¨\u0006M"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$SendRetryCompleted", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "Lcom/anthropic/claude/analytics/events/ChatEvents$SendRetryOutcome;", "outcome", "", "retry_attempt_count", "", "total_duration_ms", "", "is_temporary_chat", "last_error_http_status", "last_error_type", "human_message_uuid", "model", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$SendRetryOutcome;IJLjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$SendRetryOutcome;IJLjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/anthropic/claude/analytics/events/ChatEvents$SendRetryOutcome;", "component4", "()I", "component5", "()J", "component6", "()Ljava/lang/Boolean;", "component7", "()Ljava/lang/Integer;", "component8", "component9", "component10", "Lcom/anthropic/claude/analytics/events/ChatEvents$SendRetryCompleted;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$SendRetryOutcome;IJLjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/ChatEvents$SendRetryCompleted;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatEvents$SendRetryCompleted;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "Lcom/anthropic/claude/analytics/events/ChatEvents$SendRetryOutcome;", "getOutcome", "I", "getRetry_attempt_count", "J", "getTotal_duration_ms", "Ljava/lang/Boolean;", "Ljava/lang/Integer;", "getLast_error_http_status", "getLast_error_type", "getHuman_message_uuid", "getModel", "getEventName", "eventName", "Companion", "br2", "cr2", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatEvents$SendRetryCompleted implements AnalyticsEvent {
    public static final int $stable = 0;
    private final String conversation_uuid;
    private final String human_message_uuid;
    private final Boolean is_temporary_chat;
    private final Integer last_error_http_status;
    private final String last_error_type;
    private final String model;
    private final String organization_uuid;
    private final ChatEvents$SendRetryOutcome outcome;
    private final int retry_attempt_count;
    private final long total_duration_ms;
    public static final cr2 Companion = new cr2();
    private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new xq2(3)), null, null, null, null, null, null, null};

    public /* synthetic */ ChatEvents$SendRetryCompleted(int i, String str, String str2, ChatEvents$SendRetryOutcome chatEvents$SendRetryOutcome, int i2, long j, Boolean bool, Integer num, String str3, String str4, String str5, vnf vnfVar) {
        if (31 != (i & 31)) {
            gvj.f(i, 31, br2.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.outcome = chatEvents$SendRetryOutcome;
        this.retry_attempt_count = i2;
        this.total_duration_ms = j;
        if ((i & 32) == 0) {
            this.is_temporary_chat = null;
        } else {
            this.is_temporary_chat = bool;
        }
        if ((i & 64) == 0) {
            this.last_error_http_status = null;
        } else {
            this.last_error_http_status = num;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.last_error_type = null;
        } else {
            this.last_error_type = str3;
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
        return ChatEvents$SendRetryOutcome.Companion.serializer();
    }

    public static /* synthetic */ ChatEvents$SendRetryCompleted copy$default(ChatEvents$SendRetryCompleted chatEvents$SendRetryCompleted, String str, String str2, ChatEvents$SendRetryOutcome chatEvents$SendRetryOutcome, int i, long j, Boolean bool, Integer num, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = chatEvents$SendRetryCompleted.organization_uuid;
        }
        if ((i2 & 2) != 0) {
            str2 = chatEvents$SendRetryCompleted.conversation_uuid;
        }
        if ((i2 & 4) != 0) {
            chatEvents$SendRetryOutcome = chatEvents$SendRetryCompleted.outcome;
        }
        if ((i2 & 8) != 0) {
            i = chatEvents$SendRetryCompleted.retry_attempt_count;
        }
        if ((i2 & 16) != 0) {
            j = chatEvents$SendRetryCompleted.total_duration_ms;
        }
        if ((i2 & 32) != 0) {
            bool = chatEvents$SendRetryCompleted.is_temporary_chat;
        }
        if ((i2 & 64) != 0) {
            num = chatEvents$SendRetryCompleted.last_error_http_status;
        }
        if ((i2 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            str3 = chatEvents$SendRetryCompleted.last_error_type;
        }
        if ((i2 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            str4 = chatEvents$SendRetryCompleted.human_message_uuid;
        }
        if ((i2 & 512) != 0) {
            str5 = chatEvents$SendRetryCompleted.model;
        }
        String str6 = str5;
        String str7 = str3;
        Boolean bool2 = bool;
        long j2 = j;
        ChatEvents$SendRetryOutcome chatEvents$SendRetryOutcome2 = chatEvents$SendRetryOutcome;
        int i3 = i;
        return chatEvents$SendRetryCompleted.copy(str, str2, chatEvents$SendRetryOutcome2, i3, j2, bool2, num, str7, str4, str6);
    }

    public static final /* synthetic */ void write$Self$analytics(ChatEvents$SendRetryCompleted self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.outcome);
        output.l(3, self.retry_attempt_count, serialDesc);
        output.D(serialDesc, 4, self.total_duration_ms);
        if (output.E(serialDesc) || self.is_temporary_chat != null) {
            output.B(serialDesc, 5, zt1.a, self.is_temporary_chat);
        }
        if (output.E(serialDesc) || self.last_error_http_status != null) {
            output.B(serialDesc, 6, e79.a, self.last_error_http_status);
        }
        if (output.E(serialDesc) || self.last_error_type != null) {
            output.B(serialDesc, 7, srg.a, self.last_error_type);
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
    public final ChatEvents$SendRetryOutcome getOutcome() {
        return this.outcome;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getRetry_attempt_count() {
        return this.retry_attempt_count;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getTotal_duration_ms() {
        return this.total_duration_ms;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIs_temporary_chat() {
        return this.is_temporary_chat;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getLast_error_http_status() {
        return this.last_error_http_status;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLast_error_type() {
        return this.last_error_type;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getHuman_message_uuid() {
        return this.human_message_uuid;
    }

    public final ChatEvents$SendRetryCompleted copy(String organization_uuid, String conversation_uuid, ChatEvents$SendRetryOutcome outcome, int retry_attempt_count, long total_duration_ms, Boolean is_temporary_chat, Integer last_error_http_status, String last_error_type, String human_message_uuid, String model) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        outcome.getClass();
        return new ChatEvents$SendRetryCompleted(organization_uuid, conversation_uuid, outcome, retry_attempt_count, total_duration_ms, is_temporary_chat, last_error_http_status, last_error_type, human_message_uuid, model);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatEvents$SendRetryCompleted)) {
            return false;
        }
        ChatEvents$SendRetryCompleted chatEvents$SendRetryCompleted = (ChatEvents$SendRetryCompleted) other;
        return x44.r(this.organization_uuid, chatEvents$SendRetryCompleted.organization_uuid) && x44.r(this.conversation_uuid, chatEvents$SendRetryCompleted.conversation_uuid) && this.outcome == chatEvents$SendRetryCompleted.outcome && this.retry_attempt_count == chatEvents$SendRetryCompleted.retry_attempt_count && this.total_duration_ms == chatEvents$SendRetryCompleted.total_duration_ms && x44.r(this.is_temporary_chat, chatEvents$SendRetryCompleted.is_temporary_chat) && x44.r(this.last_error_http_status, chatEvents$SendRetryCompleted.last_error_http_status) && x44.r(this.last_error_type, chatEvents$SendRetryCompleted.last_error_type) && x44.r(this.human_message_uuid, chatEvents$SendRetryCompleted.human_message_uuid) && x44.r(this.model, chatEvents$SendRetryCompleted.model);
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_send_retry_completed";
    }

    public final String getHuman_message_uuid() {
        return this.human_message_uuid;
    }

    public final Integer getLast_error_http_status() {
        return this.last_error_http_status;
    }

    public final String getLast_error_type() {
        return this.last_error_type;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final ChatEvents$SendRetryOutcome getOutcome() {
        return this.outcome;
    }

    public final int getRetry_attempt_count() {
        return this.retry_attempt_count;
    }

    public final long getTotal_duration_ms() {
        return this.total_duration_ms;
    }

    public int hashCode() {
        int iE = vb7.e(vb7.c(this.retry_attempt_count, (this.outcome.hashCode() + kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid)) * 31, 31), 31, this.total_duration_ms);
        Boolean bool = this.is_temporary_chat;
        int iHashCode = (iE + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.last_error_http_status;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.last_error_type;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.human_message_uuid;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.model;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final Boolean is_temporary_chat() {
        return this.is_temporary_chat;
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        ChatEvents$SendRetryOutcome chatEvents$SendRetryOutcome = this.outcome;
        int i = this.retry_attempt_count;
        long j = this.total_duration_ms;
        Boolean bool = this.is_temporary_chat;
        Integer num = this.last_error_http_status;
        String str3 = this.last_error_type;
        String str4 = this.human_message_uuid;
        String str5 = this.model;
        StringBuilder sbR = kgh.r("SendRetryCompleted(organization_uuid=", str, ", conversation_uuid=", str2, ", outcome=");
        sbR.append(chatEvents$SendRetryOutcome);
        sbR.append(", retry_attempt_count=");
        sbR.append(i);
        sbR.append(", total_duration_ms=");
        sbR.append(j);
        sbR.append(", is_temporary_chat=");
        sbR.append(bool);
        sbR.append(", last_error_http_status=");
        sbR.append(num);
        sbR.append(", last_error_type=");
        sbR.append(str3);
        kgh.u(sbR, ", human_message_uuid=", str4, ", model=", str5);
        sbR.append(")");
        return sbR.toString();
    }

    public ChatEvents$SendRetryCompleted(String str, String str2, ChatEvents$SendRetryOutcome chatEvents$SendRetryOutcome, int i, long j, Boolean bool, Integer num, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        chatEvents$SendRetryOutcome.getClass();
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.outcome = chatEvents$SendRetryOutcome;
        this.retry_attempt_count = i;
        this.total_duration_ms = j;
        this.is_temporary_chat = bool;
        this.last_error_http_status = num;
        this.last_error_type = str3;
        this.human_message_uuid = str4;
        this.model = str5;
    }

    public /* synthetic */ ChatEvents$SendRetryCompleted(String str, String str2, ChatEvents$SendRetryOutcome chatEvents$SendRetryOutcome, int i, long j, Boolean bool, Integer num, String str3, String str4, String str5, int i2, mq5 mq5Var) {
        this(str, str2, chatEvents$SendRetryOutcome, i, j, (i2 & 32) != 0 ? null : bool, (i2 & 64) != 0 ? null : num, (i2 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : str3, (i2 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : str4, (i2 & 512) != 0 ? null : str5);
    }
}
