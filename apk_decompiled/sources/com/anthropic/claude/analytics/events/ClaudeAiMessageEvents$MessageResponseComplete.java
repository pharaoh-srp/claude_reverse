package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.ei3;
import defpackage.fi3;
import defpackage.fsh;
import defpackage.grc;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qy1;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wy2;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 l2\u00020\u0001:\u0002mnBË\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\u0006\u0010\u0017\u001a\u00020\n\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\n\u0012\u0006\u0010\u001a\u001a\u00020\n\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\r\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001e\u0010\u001fBã\u0001\b\u0010\u0012\u0006\u0010 \u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\u0006\u0010\u0017\u001a\u00020\n\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0019\u001a\u00020\n\u0012\u0006\u0010\u001a\u001a\u00020\n\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\r\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b)\u0010(J\u0010\u0010*\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b*\u0010(J\u0012\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b+\u0010(J\u0010\u0010,\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b.\u0010-J\u0010\u0010/\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b1\u00100J\u0010\u00102\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b2\u00100J\u0010\u00103\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b3\u00100J\u0012\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b4\u0010(J\u0010\u00105\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b7\u0010-J\u0010\u00108\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b8\u0010-J\u0010\u00109\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b9\u0010-J\u0010\u0010:\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b:\u0010(J\u0010\u0010;\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b;\u0010-J\u0010\u0010<\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b<\u0010-J\u0010\u0010=\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b=\u0010%J\u0010\u0010>\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b>\u00100J\u0012\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b?\u0010(Jü\u0001\u0010A\u001a\u00020@2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\bC\u0010(J\u0010\u0010D\u001a\u00020\nHÖ\u0001¢\u0006\u0004\bD\u0010-J\u001a\u0010G\u001a\u00020\r2\b\u0010F\u001a\u0004\u0018\u00010EHÖ\u0003¢\u0006\u0004\bG\u0010HJ'\u0010Q\u001a\u00020N2\u0006\u0010I\u001a\u00020@2\u0006\u0010K\u001a\u00020J2\u0006\u0010M\u001a\u00020LH\u0001¢\u0006\u0004\bO\u0010PR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010R\u001a\u0004\bS\u0010%R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010R\u001a\u0004\bT\u0010%R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010U\u001a\u0004\bV\u0010(R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010U\u001a\u0004\bW\u0010(R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010U\u001a\u0004\bX\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010U\u001a\u0004\bY\u0010(R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010Z\u001a\u0004\b[\u0010-R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010Z\u001a\u0004\b\\\u0010-R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010]\u001a\u0004\b\u000e\u00100R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010]\u001a\u0004\b\u000f\u00100R\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0010\u0010]\u001a\u0004\b\u0010\u00100R\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0011\u0010]\u001a\u0004\b\u0011\u00100R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010U\u001a\u0004\b^\u0010(R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010_\u001a\u0004\b`\u00106R\u0017\u0010\u0015\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0015\u0010Z\u001a\u0004\ba\u0010-R\u0017\u0010\u0016\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010Z\u001a\u0004\bb\u0010-R\u0017\u0010\u0017\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0017\u0010Z\u001a\u0004\bc\u0010-R\u0017\u0010\u0018\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010U\u001a\u0004\bd\u0010(R\u0017\u0010\u0019\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010Z\u001a\u0004\be\u0010-R\u0017\u0010\u001a\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010Z\u001a\u0004\bf\u0010-R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010R\u001a\u0004\bg\u0010%R\u0017\u0010\u001c\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001c\u0010]\u001a\u0004\bh\u00100R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010U\u001a\u0004\bi\u0010(R\u0014\u0010k\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bj\u0010(¨\u0006o"}, d2 = {"com/anthropic/claude/analytics/events/ClaudeAiMessageEvents$MessageResponseComplete", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "perceived_ttft_ms", "total_time_ms", "", "conversation_uuid", "human_message_uuid", "assistant_message_uuid", "model", "", "message_index", "message_length", "", "is_new_conversation", "is_retry", "is_incognito", "is_yukon_gold", "thinking_mode", "Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$ResearchMode;", "research_mode", "document_attachment_count", "image_attachment_count", "tool_count", "stop_reason", "response_length", "content_block_count", "time_in_background_ms", "used_inline_conversation_create", "project_id", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZZZLjava/lang/String;Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$ResearchMode;IIILjava/lang/String;IIJZLjava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZZZLjava/lang/String;Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$ResearchMode;IIILjava/lang/String;IIJZLjava/lang/String;Lvnf;)V", "component1", "()J", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "()I", "component8", "component9", "()Z", "component10", "component11", "component12", "component13", "component14", "()Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$ResearchMode;", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$MessageResponseComplete;", "copy", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZZZLjava/lang/String;Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$ResearchMode;IIILjava/lang/String;IIJZLjava/lang/String;)Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$MessageResponseComplete;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$MessageResponseComplete;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "J", "getPerceived_ttft_ms", "getTotal_time_ms", "Ljava/lang/String;", "getConversation_uuid", "getHuman_message_uuid", "getAssistant_message_uuid", "getModel", "I", "getMessage_index", "getMessage_length", "Z", "getThinking_mode", "Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$ResearchMode;", "getResearch_mode", "getDocument_attachment_count", "getImage_attachment_count", "getTool_count", "getStop_reason", "getResponse_length", "getContent_block_count", "getTime_in_background_ms", "getUsed_inline_conversation_create", "getProject_id", "getEventName", "eventName", "Companion", "ei3", "fi3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ClaudeAiMessageEvents$MessageResponseComplete implements AnalyticsEvent {
    public static final int $stable = 0;
    private final String assistant_message_uuid;
    private final int content_block_count;
    private final String conversation_uuid;
    private final int document_attachment_count;
    private final String human_message_uuid;
    private final int image_attachment_count;
    private final boolean is_incognito;
    private final boolean is_new_conversation;
    private final boolean is_retry;
    private final boolean is_yukon_gold;
    private final int message_index;
    private final int message_length;
    private final String model;
    private final long perceived_ttft_ms;
    private final String project_id;
    private final ClaudeAiMessageEvents$ResearchMode research_mode;
    private final int response_length;
    private final String stop_reason;
    private final String thinking_mode;
    private final long time_in_background_ms;
    private final int tool_count;
    private final long total_time_ms;
    private final boolean used_inline_conversation_create;
    public static final fi3 Companion = new fi3();
    private static final kw9[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, yb5.w(w1a.F, new wy2(28)), null, null, null, null, null, null, null, null, null};

    public /* synthetic */ ClaudeAiMessageEvents$MessageResponseComplete(int i, long j, long j2, String str, String str2, String str3, String str4, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, String str5, ClaudeAiMessageEvents$ResearchMode claudeAiMessageEvents$ResearchMode, int i4, int i5, int i6, String str6, int i7, int i8, long j3, boolean z5, String str7, vnf vnfVar) {
        if (4190175 != (i & 4190175)) {
            gvj.f(i, 4190175, ei3.a.getDescriptor());
            throw null;
        }
        this.perceived_ttft_ms = j;
        this.total_time_ms = j2;
        this.conversation_uuid = str;
        this.human_message_uuid = str2;
        this.assistant_message_uuid = str3;
        if ((i & 32) == 0) {
            this.model = null;
        } else {
            this.model = str4;
        }
        this.message_index = i2;
        this.message_length = i3;
        this.is_new_conversation = z;
        this.is_retry = z2;
        this.is_incognito = z3;
        this.is_yukon_gold = z4;
        if ((i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0) {
            this.thinking_mode = null;
        } else {
            this.thinking_mode = str5;
        }
        this.research_mode = claudeAiMessageEvents$ResearchMode;
        this.document_attachment_count = i4;
        this.image_attachment_count = i5;
        this.tool_count = i6;
        this.stop_reason = str6;
        this.response_length = i7;
        this.content_block_count = i8;
        this.time_in_background_ms = j3;
        this.used_inline_conversation_create = z5;
        if ((i & 4194304) == 0) {
            this.project_id = null;
        } else {
            this.project_id = str7;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ClaudeAiMessageEvents$ResearchMode.Companion.serializer();
    }

    public static /* synthetic */ ClaudeAiMessageEvents$MessageResponseComplete copy$default(ClaudeAiMessageEvents$MessageResponseComplete claudeAiMessageEvents$MessageResponseComplete, long j, long j2, String str, String str2, String str3, String str4, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, String str5, ClaudeAiMessageEvents$ResearchMode claudeAiMessageEvents$ResearchMode, int i3, int i4, int i5, String str6, int i6, int i7, long j3, boolean z5, String str7, int i8, Object obj) {
        long j4 = (i8 & 1) != 0 ? claudeAiMessageEvents$MessageResponseComplete.perceived_ttft_ms : j;
        long j5 = (i8 & 2) != 0 ? claudeAiMessageEvents$MessageResponseComplete.total_time_ms : j2;
        String str8 = (i8 & 4) != 0 ? claudeAiMessageEvents$MessageResponseComplete.conversation_uuid : str;
        String str9 = (i8 & 8) != 0 ? claudeAiMessageEvents$MessageResponseComplete.human_message_uuid : str2;
        String str10 = (i8 & 16) != 0 ? claudeAiMessageEvents$MessageResponseComplete.assistant_message_uuid : str3;
        String str11 = (i8 & 32) != 0 ? claudeAiMessageEvents$MessageResponseComplete.model : str4;
        int i9 = (i8 & 64) != 0 ? claudeAiMessageEvents$MessageResponseComplete.message_index : i;
        int i10 = (i8 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? claudeAiMessageEvents$MessageResponseComplete.message_length : i2;
        boolean z6 = (i8 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? claudeAiMessageEvents$MessageResponseComplete.is_new_conversation : z;
        boolean z7 = (i8 & 512) != 0 ? claudeAiMessageEvents$MessageResponseComplete.is_retry : z2;
        boolean z8 = (i8 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? claudeAiMessageEvents$MessageResponseComplete.is_incognito : z3;
        boolean z9 = (i8 & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? claudeAiMessageEvents$MessageResponseComplete.is_yukon_gold : z4;
        long j6 = j4;
        String str12 = (i8 & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? claudeAiMessageEvents$MessageResponseComplete.thinking_mode : str5;
        return claudeAiMessageEvents$MessageResponseComplete.copy(j6, j5, str8, str9, str10, str11, i9, i10, z6, z7, z8, z9, str12, (i8 & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? claudeAiMessageEvents$MessageResponseComplete.research_mode : claudeAiMessageEvents$ResearchMode, (i8 & 16384) != 0 ? claudeAiMessageEvents$MessageResponseComplete.document_attachment_count : i3, (i8 & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0 ? claudeAiMessageEvents$MessageResponseComplete.image_attachment_count : i4, (i8 & 65536) != 0 ? claudeAiMessageEvents$MessageResponseComplete.tool_count : i5, (i8 & 131072) != 0 ? claudeAiMessageEvents$MessageResponseComplete.stop_reason : str6, (i8 & 262144) != 0 ? claudeAiMessageEvents$MessageResponseComplete.response_length : i6, (i8 & 524288) != 0 ? claudeAiMessageEvents$MessageResponseComplete.content_block_count : i7, (i8 & FreeTypeConstants.FT_LOAD_COLOR) != 0 ? claudeAiMessageEvents$MessageResponseComplete.time_in_background_ms : j3, (i8 & FreeTypeConstants.FT_LOAD_COMPUTE_METRICS) != 0 ? claudeAiMessageEvents$MessageResponseComplete.used_inline_conversation_create : z5, (i8 & 4194304) != 0 ? claudeAiMessageEvents$MessageResponseComplete.project_id : str7);
    }

    public static final /* synthetic */ void write$Self$analytics(ClaudeAiMessageEvents$MessageResponseComplete self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.D(serialDesc, 0, self.perceived_ttft_ms);
        output.D(serialDesc, 1, self.total_time_ms);
        output.q(serialDesc, 2, self.conversation_uuid);
        output.q(serialDesc, 3, self.human_message_uuid);
        output.q(serialDesc, 4, self.assistant_message_uuid);
        if (output.E(serialDesc) || self.model != null) {
            output.B(serialDesc, 5, srg.a, self.model);
        }
        output.l(6, self.message_index, serialDesc);
        output.l(7, self.message_length, serialDesc);
        output.p(serialDesc, 8, self.is_new_conversation);
        output.p(serialDesc, 9, self.is_retry);
        output.p(serialDesc, 10, self.is_incognito);
        output.p(serialDesc, 11, self.is_yukon_gold);
        if (output.E(serialDesc) || self.thinking_mode != null) {
            output.B(serialDesc, 12, srg.a, self.thinking_mode);
        }
        output.r(serialDesc, 13, (znf) kw9VarArr[13].getValue(), self.research_mode);
        output.l(14, self.document_attachment_count, serialDesc);
        output.l(15, self.image_attachment_count, serialDesc);
        output.l(16, self.tool_count, serialDesc);
        output.q(serialDesc, 17, self.stop_reason);
        output.l(18, self.response_length, serialDesc);
        output.l(19, self.content_block_count, serialDesc);
        output.D(serialDesc, 20, self.time_in_background_ms);
        output.p(serialDesc, 21, self.used_inline_conversation_create);
        if (!output.E(serialDesc) && self.project_id == null) {
            return;
        }
        output.B(serialDesc, 22, srg.a, self.project_id);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getPerceived_ttft_ms() {
        return this.perceived_ttft_ms;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIs_retry() {
        return this.is_retry;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getIs_incognito() {
        return this.is_incognito;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getIs_yukon_gold() {
        return this.is_yukon_gold;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getThinking_mode() {
        return this.thinking_mode;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final ClaudeAiMessageEvents$ResearchMode getResearch_mode() {
        return this.research_mode;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getDocument_attachment_count() {
        return this.document_attachment_count;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getImage_attachment_count() {
        return this.image_attachment_count;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getTool_count() {
        return this.tool_count;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getStop_reason() {
        return this.stop_reason;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getResponse_length() {
        return this.response_length;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTotal_time_ms() {
        return this.total_time_ms;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final int getContent_block_count() {
        return this.content_block_count;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final long getTime_in_background_ms() {
        return this.time_in_background_ms;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final boolean getUsed_inline_conversation_create() {
        return this.used_inline_conversation_create;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getProject_id() {
        return this.project_id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHuman_message_uuid() {
        return this.human_message_uuid;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAssistant_message_uuid() {
        return this.assistant_message_uuid;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getMessage_index() {
        return this.message_index;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getMessage_length() {
        return this.message_length;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIs_new_conversation() {
        return this.is_new_conversation;
    }

    public final ClaudeAiMessageEvents$MessageResponseComplete copy(long perceived_ttft_ms, long total_time_ms, String conversation_uuid, String human_message_uuid, String assistant_message_uuid, String model, int message_index, int message_length, boolean is_new_conversation, boolean is_retry, boolean is_incognito, boolean is_yukon_gold, String thinking_mode, ClaudeAiMessageEvents$ResearchMode research_mode, int document_attachment_count, int image_attachment_count, int tool_count, String stop_reason, int response_length, int content_block_count, long time_in_background_ms, boolean used_inline_conversation_create, String project_id) {
        conversation_uuid.getClass();
        human_message_uuid.getClass();
        assistant_message_uuid.getClass();
        research_mode.getClass();
        stop_reason.getClass();
        return new ClaudeAiMessageEvents$MessageResponseComplete(perceived_ttft_ms, total_time_ms, conversation_uuid, human_message_uuid, assistant_message_uuid, model, message_index, message_length, is_new_conversation, is_retry, is_incognito, is_yukon_gold, thinking_mode, research_mode, document_attachment_count, image_attachment_count, tool_count, stop_reason, response_length, content_block_count, time_in_background_ms, used_inline_conversation_create, project_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClaudeAiMessageEvents$MessageResponseComplete)) {
            return false;
        }
        ClaudeAiMessageEvents$MessageResponseComplete claudeAiMessageEvents$MessageResponseComplete = (ClaudeAiMessageEvents$MessageResponseComplete) other;
        return this.perceived_ttft_ms == claudeAiMessageEvents$MessageResponseComplete.perceived_ttft_ms && this.total_time_ms == claudeAiMessageEvents$MessageResponseComplete.total_time_ms && x44.r(this.conversation_uuid, claudeAiMessageEvents$MessageResponseComplete.conversation_uuid) && x44.r(this.human_message_uuid, claudeAiMessageEvents$MessageResponseComplete.human_message_uuid) && x44.r(this.assistant_message_uuid, claudeAiMessageEvents$MessageResponseComplete.assistant_message_uuid) && x44.r(this.model, claudeAiMessageEvents$MessageResponseComplete.model) && this.message_index == claudeAiMessageEvents$MessageResponseComplete.message_index && this.message_length == claudeAiMessageEvents$MessageResponseComplete.message_length && this.is_new_conversation == claudeAiMessageEvents$MessageResponseComplete.is_new_conversation && this.is_retry == claudeAiMessageEvents$MessageResponseComplete.is_retry && this.is_incognito == claudeAiMessageEvents$MessageResponseComplete.is_incognito && this.is_yukon_gold == claudeAiMessageEvents$MessageResponseComplete.is_yukon_gold && x44.r(this.thinking_mode, claudeAiMessageEvents$MessageResponseComplete.thinking_mode) && this.research_mode == claudeAiMessageEvents$MessageResponseComplete.research_mode && this.document_attachment_count == claudeAiMessageEvents$MessageResponseComplete.document_attachment_count && this.image_attachment_count == claudeAiMessageEvents$MessageResponseComplete.image_attachment_count && this.tool_count == claudeAiMessageEvents$MessageResponseComplete.tool_count && x44.r(this.stop_reason, claudeAiMessageEvents$MessageResponseComplete.stop_reason) && this.response_length == claudeAiMessageEvents$MessageResponseComplete.response_length && this.content_block_count == claudeAiMessageEvents$MessageResponseComplete.content_block_count && this.time_in_background_ms == claudeAiMessageEvents$MessageResponseComplete.time_in_background_ms && this.used_inline_conversation_create == claudeAiMessageEvents$MessageResponseComplete.used_inline_conversation_create && x44.r(this.project_id, claudeAiMessageEvents$MessageResponseComplete.project_id);
    }

    public final String getAssistant_message_uuid() {
        return this.assistant_message_uuid;
    }

    public final int getContent_block_count() {
        return this.content_block_count;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    public final int getDocument_attachment_count() {
        return this.document_attachment_count;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.message.response_complete";
    }

    public final String getHuman_message_uuid() {
        return this.human_message_uuid;
    }

    public final int getImage_attachment_count() {
        return this.image_attachment_count;
    }

    public final int getMessage_index() {
        return this.message_index;
    }

    public final int getMessage_length() {
        return this.message_length;
    }

    public final String getModel() {
        return this.model;
    }

    public final long getPerceived_ttft_ms() {
        return this.perceived_ttft_ms;
    }

    public final String getProject_id() {
        return this.project_id;
    }

    public final ClaudeAiMessageEvents$ResearchMode getResearch_mode() {
        return this.research_mode;
    }

    public final int getResponse_length() {
        return this.response_length;
    }

    public final String getStop_reason() {
        return this.stop_reason;
    }

    public final String getThinking_mode() {
        return this.thinking_mode;
    }

    public final long getTime_in_background_ms() {
        return this.time_in_background_ms;
    }

    public final int getTool_count() {
        return this.tool_count;
    }

    public final long getTotal_time_ms() {
        return this.total_time_ms;
    }

    public final boolean getUsed_inline_conversation_create() {
        return this.used_inline_conversation_create;
    }

    public int hashCode() {
        int iL = kgh.l(kgh.l(kgh.l(vb7.e(Long.hashCode(this.perceived_ttft_ms) * 31, 31, this.total_time_ms), 31, this.conversation_uuid), 31, this.human_message_uuid), 31, this.assistant_message_uuid);
        String str = this.model;
        int iP = fsh.p(fsh.p(fsh.p(fsh.p(vb7.c(this.message_length, vb7.c(this.message_index, (iL + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.is_new_conversation), 31, this.is_retry), 31, this.is_incognito), 31, this.is_yukon_gold);
        String str2 = this.thinking_mode;
        int iP2 = fsh.p(vb7.e(vb7.c(this.content_block_count, vb7.c(this.response_length, kgh.l(vb7.c(this.tool_count, vb7.c(this.image_attachment_count, vb7.c(this.document_attachment_count, (this.research_mode.hashCode() + ((iP + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31), 31), 31), 31, this.stop_reason), 31), 31), 31, this.time_in_background_ms), 31, this.used_inline_conversation_create);
        String str3 = this.project_id;
        return iP2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean is_incognito() {
        return this.is_incognito;
    }

    public final boolean is_new_conversation() {
        return this.is_new_conversation;
    }

    public final boolean is_retry() {
        return this.is_retry;
    }

    public final boolean is_yukon_gold() {
        return this.is_yukon_gold;
    }

    public String toString() {
        long j = this.perceived_ttft_ms;
        long j2 = this.total_time_ms;
        String str = this.conversation_uuid;
        String str2 = this.human_message_uuid;
        String str3 = this.assistant_message_uuid;
        String str4 = this.model;
        int i = this.message_index;
        int i2 = this.message_length;
        boolean z = this.is_new_conversation;
        boolean z2 = this.is_retry;
        boolean z3 = this.is_incognito;
        boolean z4 = this.is_yukon_gold;
        String str5 = this.thinking_mode;
        ClaudeAiMessageEvents$ResearchMode claudeAiMessageEvents$ResearchMode = this.research_mode;
        int i3 = this.document_attachment_count;
        int i4 = this.image_attachment_count;
        int i5 = this.tool_count;
        String str6 = this.stop_reason;
        int i6 = this.response_length;
        int i7 = this.content_block_count;
        long j3 = this.time_in_background_ms;
        boolean z5 = this.used_inline_conversation_create;
        String str7 = this.project_id;
        StringBuilder sbW = grc.w(j, "MessageResponseComplete(perceived_ttft_ms=", ", total_time_ms=");
        qy1.m(j2, ", conversation_uuid=", str, sbW);
        kgh.u(sbW, ", human_message_uuid=", str2, ", assistant_message_uuid=", str3);
        sbW.append(", model=");
        sbW.append(str4);
        sbW.append(", message_index=");
        sbW.append(i);
        sbW.append(", message_length=");
        sbW.append(i2);
        sbW.append(", is_new_conversation=");
        sbW.append(z);
        sbW.append(", is_retry=");
        sbW.append(z2);
        sbW.append(", is_incognito=");
        sbW.append(z3);
        sbW.append(", is_yukon_gold=");
        sbW.append(z4);
        sbW.append(", thinking_mode=");
        sbW.append(str5);
        sbW.append(", research_mode=");
        sbW.append(claudeAiMessageEvents$ResearchMode);
        sbW.append(", document_attachment_count=");
        sbW.append(i3);
        ij0.s(i4, i5, ", image_attachment_count=", ", tool_count=", sbW);
        sbW.append(", stop_reason=");
        sbW.append(str6);
        sbW.append(", response_length=");
        sbW.append(i6);
        sbW.append(", content_block_count=");
        sbW.append(i7);
        sbW.append(", time_in_background_ms=");
        sbW.append(j3);
        sbW.append(", used_inline_conversation_create=");
        sbW.append(z5);
        return kgh.q(sbW, ", project_id=", str7, ")");
    }

    public ClaudeAiMessageEvents$MessageResponseComplete(long j, long j2, String str, String str2, String str3, String str4, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, String str5, ClaudeAiMessageEvents$ResearchMode claudeAiMessageEvents$ResearchMode, int i3, int i4, int i5, String str6, int i6, int i7, long j3, boolean z5, String str7) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        claudeAiMessageEvents$ResearchMode.getClass();
        str6.getClass();
        this.perceived_ttft_ms = j;
        this.total_time_ms = j2;
        this.conversation_uuid = str;
        this.human_message_uuid = str2;
        this.assistant_message_uuid = str3;
        this.model = str4;
        this.message_index = i;
        this.message_length = i2;
        this.is_new_conversation = z;
        this.is_retry = z2;
        this.is_incognito = z3;
        this.is_yukon_gold = z4;
        this.thinking_mode = str5;
        this.research_mode = claudeAiMessageEvents$ResearchMode;
        this.document_attachment_count = i3;
        this.image_attachment_count = i4;
        this.tool_count = i5;
        this.stop_reason = str6;
        this.response_length = i6;
        this.content_block_count = i7;
        this.time_in_background_ms = j3;
        this.used_inline_conversation_create = z5;
        this.project_id = str7;
    }

    public /* synthetic */ ClaudeAiMessageEvents$MessageResponseComplete(long j, long j2, String str, String str2, String str3, String str4, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, String str5, ClaudeAiMessageEvents$ResearchMode claudeAiMessageEvents$ResearchMode, int i3, int i4, int i5, String str6, int i6, int i7, long j3, boolean z5, String str7, int i8, mq5 mq5Var) {
        this(j, j2, str, str2, str3, (i8 & 32) != 0 ? null : str4, i, i2, z, z2, z3, z4, (i8 & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? null : str5, claudeAiMessageEvents$ResearchMode, i3, i4, i5, str6, i6, i7, j3, z5, (i8 & 4194304) != 0 ? null : str7);
    }
}
