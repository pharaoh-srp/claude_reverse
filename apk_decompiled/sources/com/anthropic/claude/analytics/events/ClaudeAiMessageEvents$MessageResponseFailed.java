package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.e79;
import defpackage.fsh;
import defpackage.gi3;
import defpackage.gvj;
import defpackage.hi3;
import defpackage.ii3;
import defpackage.ij0;
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
import defpackage.wy2;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u0000 y2\u00020\u0001:\u0002z{Bï\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u000b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010!\u001a\u00020\u000b¢\u0006\u0004\b\"\u0010#Bû\u0001\b\u0010\u0012\u0006\u0010$\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u000b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010!\u001a\u00020\u000b\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b\"\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b,\u0010+J\u0012\u0010-\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b-\u0010+J\u0010\u0010.\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b0\u0010/J\u0010\u00101\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b3\u00102J\u0010\u00104\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b4\u00102J\u0010\u00105\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b5\u00102J\u0012\u00106\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b6\u0010+J\u0010\u00107\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b9\u0010/J\u0010\u0010:\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b:\u0010/J\u0010\u0010;\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b;\u0010/J\u0010\u0010<\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0018HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bB\u0010+J\u0012\u0010C\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bC\u0010+J\u0012\u0010D\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bD\u0010+J\u0010\u0010E\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bE\u0010)J\u0010\u0010F\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bF\u00102J\u0012\u0010G\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bG\u0010+J\u0010\u0010H\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bH\u00102J\u009a\u0002\u0010J\u001a\u00020I2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010!\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bL\u0010+J\u0010\u0010M\u001a\u00020\bHÖ\u0001¢\u0006\u0004\bM\u0010/J\u001a\u0010P\u001a\u00020\u000b2\b\u0010O\u001a\u0004\u0018\u00010NHÖ\u0003¢\u0006\u0004\bP\u0010QJ'\u0010Z\u001a\u00020W2\u0006\u0010R\u001a\u00020I2\u0006\u0010T\u001a\u00020S2\u0006\u0010V\u001a\u00020UH\u0001¢\u0006\u0004\bX\u0010YR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010[\u001a\u0004\b\\\u0010)R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010]\u001a\u0004\b^\u0010+R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010]\u001a\u0004\b_\u0010+R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010]\u001a\u0004\b`\u0010+R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010a\u001a\u0004\bb\u0010/R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010a\u001a\u0004\bc\u0010/R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010d\u001a\u0004\b\f\u00102R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010d\u001a\u0004\b\r\u00102R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010d\u001a\u0004\b\u000e\u00102R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010d\u001a\u0004\b\u000f\u00102R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010]\u001a\u0004\be\u0010+R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010f\u001a\u0004\bg\u00108R\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010a\u001a\u0004\bh\u0010/R\u0017\u0010\u0014\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010a\u001a\u0004\bi\u0010/R\u0017\u0010\u0015\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010a\u001a\u0004\bj\u0010/R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010k\u001a\u0004\bl\u0010=R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010m\u001a\u0004\bn\u0010?R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010o\u001a\u0004\bp\u0010AR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010]\u001a\u0004\bq\u0010+R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010]\u001a\u0004\br\u0010+R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010]\u001a\u0004\bs\u0010+R\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010[\u001a\u0004\bt\u0010)R\u0017\u0010\u001f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010d\u001a\u0004\bu\u00102R\u0019\u0010 \u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010]\u001a\u0004\bv\u0010+R\u0017\u0010!\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010d\u001a\u0004\b!\u00102R\u0014\u0010x\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bw\u0010+¨\u0006|"}, d2 = {"com/anthropic/claude/analytics/events/ClaudeAiMessageEvents$MessageResponseFailed", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "time_to_failure_ms", "", "conversation_uuid", "human_message_uuid", "model", "", "message_index", "message_length", "", "is_new_conversation", "is_retry", "is_incognito", "is_yukon_gold", "thinking_mode", "Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$ResearchMode;", "research_mode", "document_attachment_count", "image_attachment_count", "tool_count", "Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$FailureStage;", "failure_stage", "Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$FailureType;", "failure_type", "http_status_code", "error_code", "error_type", "error_message", "time_in_background_ms", "used_inline_conversation_create", "project_id", "is_foreground_at_failure", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZZZLjava/lang/String;Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$ResearchMode;IIILcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$FailureStage;Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$FailureType;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;Z)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZZZLjava/lang/String;Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$ResearchMode;IIILcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$FailureStage;Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$FailureType;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;ZLvnf;)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()I", "component6", "component7", "()Z", "component8", "component9", "component10", "component11", "component12", "()Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$ResearchMode;", "component13", "component14", "component15", "component16", "()Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$FailureStage;", "component17", "()Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$FailureType;", "component18", "()Ljava/lang/Integer;", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$MessageResponseFailed;", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZZZLjava/lang/String;Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$ResearchMode;IIILcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$FailureStage;Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$FailureType;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;Z)Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$MessageResponseFailed;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$MessageResponseFailed;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "J", "getTime_to_failure_ms", "Ljava/lang/String;", "getConversation_uuid", "getHuman_message_uuid", "getModel", "I", "getMessage_index", "getMessage_length", "Z", "getThinking_mode", "Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$ResearchMode;", "getResearch_mode", "getDocument_attachment_count", "getImage_attachment_count", "getTool_count", "Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$FailureStage;", "getFailure_stage", "Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$FailureType;", "getFailure_type", "Ljava/lang/Integer;", "getHttp_status_code", "getError_code", "getError_type", "getError_message", "getTime_in_background_ms", "getUsed_inline_conversation_create", "getProject_id", "getEventName", "eventName", "Companion", "hi3", "ii3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ClaudeAiMessageEvents$MessageResponseFailed implements AnalyticsEvent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final ii3 Companion = new ii3();
    private final String conversation_uuid;
    private final int document_attachment_count;
    private final String error_code;
    private final String error_message;
    private final String error_type;
    private final ClaudeAiMessageEvents$FailureStage failure_stage;
    private final ClaudeAiMessageEvents$FailureType failure_type;
    private final Integer http_status_code;
    private final String human_message_uuid;
    private final int image_attachment_count;
    private final boolean is_foreground_at_failure;
    private final boolean is_incognito;
    private final boolean is_new_conversation;
    private final boolean is_retry;
    private final boolean is_yukon_gold;
    private final int message_index;
    private final int message_length;
    private final String model;
    private final String project_id;
    private final ClaudeAiMessageEvents$ResearchMode research_mode;
    private final String thinking_mode;
    private final long time_in_background_ms;
    private final long time_to_failure_ms;
    private final int tool_count;
    private final boolean used_inline_conversation_create;

    static {
        wy2 wy2Var = new wy2(29);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, null, null, null, null, null, null, null, null, yb5.w(w1aVar, wy2Var), null, null, null, yb5.w(w1aVar, new gi3(0)), yb5.w(w1aVar, new gi3(1)), null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ ClaudeAiMessageEvents$MessageResponseFailed(int i, long j, String str, String str2, String str3, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, String str4, ClaudeAiMessageEvents$ResearchMode claudeAiMessageEvents$ResearchMode, int i4, int i5, int i6, ClaudeAiMessageEvents$FailureStage claudeAiMessageEvents$FailureStage, ClaudeAiMessageEvents$FailureType claudeAiMessageEvents$FailureType, Integer num, String str5, String str6, String str7, long j2, boolean z5, String str8, boolean z6, vnf vnfVar) {
        if (23198709 != (i & 23198709)) {
            gvj.f(i, 23198709, hi3.a.getDescriptor());
            throw null;
        }
        this.time_to_failure_ms = j;
        if ((i & 2) == 0) {
            this.conversation_uuid = null;
        } else {
            this.conversation_uuid = str;
        }
        this.human_message_uuid = str2;
        if ((i & 8) == 0) {
            this.model = null;
        } else {
            this.model = str3;
        }
        this.message_index = i2;
        this.message_length = i3;
        this.is_new_conversation = z;
        this.is_retry = z2;
        this.is_incognito = z3;
        this.is_yukon_gold = z4;
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
            this.thinking_mode = null;
        } else {
            this.thinking_mode = str4;
        }
        this.research_mode = claudeAiMessageEvents$ResearchMode;
        this.document_attachment_count = i4;
        this.image_attachment_count = i5;
        this.tool_count = i6;
        this.failure_stage = claudeAiMessageEvents$FailureStage;
        this.failure_type = claudeAiMessageEvents$FailureType;
        if ((131072 & i) == 0) {
            this.http_status_code = null;
        } else {
            this.http_status_code = num;
        }
        if ((262144 & i) == 0) {
            this.error_code = null;
        } else {
            this.error_code = str5;
        }
        if ((524288 & i) == 0) {
            this.error_type = null;
        } else {
            this.error_type = str6;
        }
        if ((1048576 & i) == 0) {
            this.error_message = null;
        } else {
            this.error_message = str7;
        }
        this.time_in_background_ms = j2;
        this.used_inline_conversation_create = z5;
        if ((i & 8388608) == 0) {
            this.project_id = null;
        } else {
            this.project_id = str8;
        }
        this.is_foreground_at_failure = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ClaudeAiMessageEvents$ResearchMode.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return ClaudeAiMessageEvents$FailureStage.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return ClaudeAiMessageEvents$FailureType.Companion.serializer();
    }

    public static /* synthetic */ ClaudeAiMessageEvents$MessageResponseFailed copy$default(ClaudeAiMessageEvents$MessageResponseFailed claudeAiMessageEvents$MessageResponseFailed, long j, String str, String str2, String str3, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, String str4, ClaudeAiMessageEvents$ResearchMode claudeAiMessageEvents$ResearchMode, int i3, int i4, int i5, ClaudeAiMessageEvents$FailureStage claudeAiMessageEvents$FailureStage, ClaudeAiMessageEvents$FailureType claudeAiMessageEvents$FailureType, Integer num, String str5, String str6, String str7, long j2, boolean z5, String str8, boolean z6, int i6, Object obj) {
        boolean z7;
        boolean z8;
        long j3 = (i6 & 1) != 0 ? claudeAiMessageEvents$MessageResponseFailed.time_to_failure_ms : j;
        String str9 = (i6 & 2) != 0 ? claudeAiMessageEvents$MessageResponseFailed.conversation_uuid : str;
        String str10 = (i6 & 4) != 0 ? claudeAiMessageEvents$MessageResponseFailed.human_message_uuid : str2;
        String str11 = (i6 & 8) != 0 ? claudeAiMessageEvents$MessageResponseFailed.model : str3;
        int i7 = (i6 & 16) != 0 ? claudeAiMessageEvents$MessageResponseFailed.message_index : i;
        int i8 = (i6 & 32) != 0 ? claudeAiMessageEvents$MessageResponseFailed.message_length : i2;
        boolean z9 = (i6 & 64) != 0 ? claudeAiMessageEvents$MessageResponseFailed.is_new_conversation : z;
        boolean z10 = (i6 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? claudeAiMessageEvents$MessageResponseFailed.is_retry : z2;
        boolean z11 = (i6 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? claudeAiMessageEvents$MessageResponseFailed.is_incognito : z3;
        boolean z12 = (i6 & 512) != 0 ? claudeAiMessageEvents$MessageResponseFailed.is_yukon_gold : z4;
        String str12 = (i6 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? claudeAiMessageEvents$MessageResponseFailed.thinking_mode : str4;
        ClaudeAiMessageEvents$ResearchMode claudeAiMessageEvents$ResearchMode2 = (i6 & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? claudeAiMessageEvents$MessageResponseFailed.research_mode : claudeAiMessageEvents$ResearchMode;
        int i9 = (i6 & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? claudeAiMessageEvents$MessageResponseFailed.document_attachment_count : i3;
        long j4 = j3;
        int i10 = (i6 & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? claudeAiMessageEvents$MessageResponseFailed.image_attachment_count : i4;
        int i11 = (i6 & 16384) != 0 ? claudeAiMessageEvents$MessageResponseFailed.tool_count : i5;
        ClaudeAiMessageEvents$FailureStage claudeAiMessageEvents$FailureStage2 = (i6 & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0 ? claudeAiMessageEvents$MessageResponseFailed.failure_stage : claudeAiMessageEvents$FailureStage;
        ClaudeAiMessageEvents$FailureType claudeAiMessageEvents$FailureType2 = (i6 & 65536) != 0 ? claudeAiMessageEvents$MessageResponseFailed.failure_type : claudeAiMessageEvents$FailureType;
        Integer num2 = (i6 & 131072) != 0 ? claudeAiMessageEvents$MessageResponseFailed.http_status_code : num;
        String str13 = (i6 & 262144) != 0 ? claudeAiMessageEvents$MessageResponseFailed.error_code : str5;
        String str14 = (i6 & 524288) != 0 ? claudeAiMessageEvents$MessageResponseFailed.error_type : str6;
        String str15 = (i6 & FreeTypeConstants.FT_LOAD_COLOR) != 0 ? claudeAiMessageEvents$MessageResponseFailed.error_message : str7;
        int i12 = i10;
        long j5 = (i6 & FreeTypeConstants.FT_LOAD_COMPUTE_METRICS) != 0 ? claudeAiMessageEvents$MessageResponseFailed.time_in_background_ms : j2;
        boolean z13 = (i6 & 4194304) != 0 ? claudeAiMessageEvents$MessageResponseFailed.used_inline_conversation_create : z5;
        String str16 = (i6 & 8388608) != 0 ? claudeAiMessageEvents$MessageResponseFailed.project_id : str8;
        if ((i6 & 16777216) != 0) {
            z8 = z13;
            z7 = claudeAiMessageEvents$MessageResponseFailed.is_foreground_at_failure;
        } else {
            z7 = z6;
            z8 = z13;
        }
        return claudeAiMessageEvents$MessageResponseFailed.copy(j4, str9, str10, str11, i7, i8, z9, z10, z11, z12, str12, claudeAiMessageEvents$ResearchMode2, i9, i12, i11, claudeAiMessageEvents$FailureStage2, claudeAiMessageEvents$FailureType2, num2, str13, str14, str15, j5, z8, str16, z7);
    }

    public static final /* synthetic */ void write$Self$analytics(ClaudeAiMessageEvents$MessageResponseFailed self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.D(serialDesc, 0, self.time_to_failure_ms);
        if (output.E(serialDesc) || self.conversation_uuid != null) {
            output.B(serialDesc, 1, srg.a, self.conversation_uuid);
        }
        output.q(serialDesc, 2, self.human_message_uuid);
        if (output.E(serialDesc) || self.model != null) {
            output.B(serialDesc, 3, srg.a, self.model);
        }
        output.l(4, self.message_index, serialDesc);
        output.l(5, self.message_length, serialDesc);
        output.p(serialDesc, 6, self.is_new_conversation);
        output.p(serialDesc, 7, self.is_retry);
        output.p(serialDesc, 8, self.is_incognito);
        output.p(serialDesc, 9, self.is_yukon_gold);
        if (output.E(serialDesc) || self.thinking_mode != null) {
            output.B(serialDesc, 10, srg.a, self.thinking_mode);
        }
        output.r(serialDesc, 11, (znf) kw9VarArr[11].getValue(), self.research_mode);
        output.l(12, self.document_attachment_count, serialDesc);
        output.l(13, self.image_attachment_count, serialDesc);
        output.l(14, self.tool_count, serialDesc);
        output.r(serialDesc, 15, (znf) kw9VarArr[15].getValue(), self.failure_stage);
        output.r(serialDesc, 16, (znf) kw9VarArr[16].getValue(), self.failure_type);
        if (output.E(serialDesc) || self.http_status_code != null) {
            output.B(serialDesc, 17, e79.a, self.http_status_code);
        }
        if (output.E(serialDesc) || self.error_code != null) {
            output.B(serialDesc, 18, srg.a, self.error_code);
        }
        if (output.E(serialDesc) || self.error_type != null) {
            output.B(serialDesc, 19, srg.a, self.error_type);
        }
        if (output.E(serialDesc) || self.error_message != null) {
            output.B(serialDesc, 20, srg.a, self.error_message);
        }
        output.D(serialDesc, 21, self.time_in_background_ms);
        output.p(serialDesc, 22, self.used_inline_conversation_create);
        if (output.E(serialDesc) || self.project_id != null) {
            output.B(serialDesc, 23, srg.a, self.project_id);
        }
        output.p(serialDesc, 24, self.is_foreground_at_failure);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime_to_failure_ms() {
        return this.time_to_failure_ms;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIs_yukon_gold() {
        return this.is_yukon_gold;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getThinking_mode() {
        return this.thinking_mode;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final ClaudeAiMessageEvents$ResearchMode getResearch_mode() {
        return this.research_mode;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getDocument_attachment_count() {
        return this.document_attachment_count;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getImage_attachment_count() {
        return this.image_attachment_count;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getTool_count() {
        return this.tool_count;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final ClaudeAiMessageEvents$FailureStage getFailure_stage() {
        return this.failure_stage;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final ClaudeAiMessageEvents$FailureType getFailure_type() {
        return this.failure_type;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Integer getHttp_status_code() {
        return this.http_status_code;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getError_code() {
        return this.error_code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getError_type() {
        return this.error_type;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getError_message() {
        return this.error_message;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final long getTime_in_background_ms() {
        return this.time_in_background_ms;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final boolean getUsed_inline_conversation_create() {
        return this.used_inline_conversation_create;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getProject_id() {
        return this.project_id;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final boolean getIs_foreground_at_failure() {
        return this.is_foreground_at_failure;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHuman_message_uuid() {
        return this.human_message_uuid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMessage_index() {
        return this.message_index;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getMessage_length() {
        return this.message_length;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIs_new_conversation() {
        return this.is_new_conversation;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIs_retry() {
        return this.is_retry;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIs_incognito() {
        return this.is_incognito;
    }

    public final ClaudeAiMessageEvents$MessageResponseFailed copy(long time_to_failure_ms, String conversation_uuid, String human_message_uuid, String model, int message_index, int message_length, boolean is_new_conversation, boolean is_retry, boolean is_incognito, boolean is_yukon_gold, String thinking_mode, ClaudeAiMessageEvents$ResearchMode research_mode, int document_attachment_count, int image_attachment_count, int tool_count, ClaudeAiMessageEvents$FailureStage failure_stage, ClaudeAiMessageEvents$FailureType failure_type, Integer http_status_code, String error_code, String error_type, String error_message, long time_in_background_ms, boolean used_inline_conversation_create, String project_id, boolean is_foreground_at_failure) {
        human_message_uuid.getClass();
        research_mode.getClass();
        failure_stage.getClass();
        failure_type.getClass();
        return new ClaudeAiMessageEvents$MessageResponseFailed(time_to_failure_ms, conversation_uuid, human_message_uuid, model, message_index, message_length, is_new_conversation, is_retry, is_incognito, is_yukon_gold, thinking_mode, research_mode, document_attachment_count, image_attachment_count, tool_count, failure_stage, failure_type, http_status_code, error_code, error_type, error_message, time_in_background_ms, used_inline_conversation_create, project_id, is_foreground_at_failure);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClaudeAiMessageEvents$MessageResponseFailed)) {
            return false;
        }
        ClaudeAiMessageEvents$MessageResponseFailed claudeAiMessageEvents$MessageResponseFailed = (ClaudeAiMessageEvents$MessageResponseFailed) other;
        return this.time_to_failure_ms == claudeAiMessageEvents$MessageResponseFailed.time_to_failure_ms && x44.r(this.conversation_uuid, claudeAiMessageEvents$MessageResponseFailed.conversation_uuid) && x44.r(this.human_message_uuid, claudeAiMessageEvents$MessageResponseFailed.human_message_uuid) && x44.r(this.model, claudeAiMessageEvents$MessageResponseFailed.model) && this.message_index == claudeAiMessageEvents$MessageResponseFailed.message_index && this.message_length == claudeAiMessageEvents$MessageResponseFailed.message_length && this.is_new_conversation == claudeAiMessageEvents$MessageResponseFailed.is_new_conversation && this.is_retry == claudeAiMessageEvents$MessageResponseFailed.is_retry && this.is_incognito == claudeAiMessageEvents$MessageResponseFailed.is_incognito && this.is_yukon_gold == claudeAiMessageEvents$MessageResponseFailed.is_yukon_gold && x44.r(this.thinking_mode, claudeAiMessageEvents$MessageResponseFailed.thinking_mode) && this.research_mode == claudeAiMessageEvents$MessageResponseFailed.research_mode && this.document_attachment_count == claudeAiMessageEvents$MessageResponseFailed.document_attachment_count && this.image_attachment_count == claudeAiMessageEvents$MessageResponseFailed.image_attachment_count && this.tool_count == claudeAiMessageEvents$MessageResponseFailed.tool_count && this.failure_stage == claudeAiMessageEvents$MessageResponseFailed.failure_stage && this.failure_type == claudeAiMessageEvents$MessageResponseFailed.failure_type && x44.r(this.http_status_code, claudeAiMessageEvents$MessageResponseFailed.http_status_code) && x44.r(this.error_code, claudeAiMessageEvents$MessageResponseFailed.error_code) && x44.r(this.error_type, claudeAiMessageEvents$MessageResponseFailed.error_type) && x44.r(this.error_message, claudeAiMessageEvents$MessageResponseFailed.error_message) && this.time_in_background_ms == claudeAiMessageEvents$MessageResponseFailed.time_in_background_ms && this.used_inline_conversation_create == claudeAiMessageEvents$MessageResponseFailed.used_inline_conversation_create && x44.r(this.project_id, claudeAiMessageEvents$MessageResponseFailed.project_id) && this.is_foreground_at_failure == claudeAiMessageEvents$MessageResponseFailed.is_foreground_at_failure;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    public final int getDocument_attachment_count() {
        return this.document_attachment_count;
    }

    public final String getError_code() {
        return this.error_code;
    }

    public final String getError_message() {
        return this.error_message;
    }

    public final String getError_type() {
        return this.error_type;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.message.response_failed";
    }

    public final ClaudeAiMessageEvents$FailureStage getFailure_stage() {
        return this.failure_stage;
    }

    public final ClaudeAiMessageEvents$FailureType getFailure_type() {
        return this.failure_type;
    }

    public final Integer getHttp_status_code() {
        return this.http_status_code;
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

    public final String getProject_id() {
        return this.project_id;
    }

    public final ClaudeAiMessageEvents$ResearchMode getResearch_mode() {
        return this.research_mode;
    }

    public final String getThinking_mode() {
        return this.thinking_mode;
    }

    public final long getTime_in_background_ms() {
        return this.time_in_background_ms;
    }

    public final long getTime_to_failure_ms() {
        return this.time_to_failure_ms;
    }

    public final int getTool_count() {
        return this.tool_count;
    }

    public final boolean getUsed_inline_conversation_create() {
        return this.used_inline_conversation_create;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.time_to_failure_ms) * 31;
        String str = this.conversation_uuid;
        int iL = kgh.l((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.human_message_uuid);
        String str2 = this.model;
        int iP = fsh.p(fsh.p(fsh.p(fsh.p(vb7.c(this.message_length, vb7.c(this.message_index, (iL + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31, this.is_new_conversation), 31, this.is_retry), 31, this.is_incognito), 31, this.is_yukon_gold);
        String str3 = this.thinking_mode;
        int iHashCode2 = (this.failure_type.hashCode() + ((this.failure_stage.hashCode() + vb7.c(this.tool_count, vb7.c(this.image_attachment_count, vb7.c(this.document_attachment_count, (this.research_mode.hashCode() + ((iP + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, 31), 31), 31)) * 31)) * 31;
        Integer num = this.http_status_code;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.error_code;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.error_type;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.error_message;
        int iP2 = fsh.p(vb7.e((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.time_in_background_ms), 31, this.used_inline_conversation_create);
        String str7 = this.project_id;
        return Boolean.hashCode(this.is_foreground_at_failure) + ((iP2 + (str7 != null ? str7.hashCode() : 0)) * 31);
    }

    public final boolean is_foreground_at_failure() {
        return this.is_foreground_at_failure;
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
        long j = this.time_to_failure_ms;
        String str = this.conversation_uuid;
        String str2 = this.human_message_uuid;
        String str3 = this.model;
        int i = this.message_index;
        int i2 = this.message_length;
        boolean z = this.is_new_conversation;
        boolean z2 = this.is_retry;
        boolean z3 = this.is_incognito;
        boolean z4 = this.is_yukon_gold;
        String str4 = this.thinking_mode;
        ClaudeAiMessageEvents$ResearchMode claudeAiMessageEvents$ResearchMode = this.research_mode;
        int i3 = this.document_attachment_count;
        int i4 = this.image_attachment_count;
        int i5 = this.tool_count;
        ClaudeAiMessageEvents$FailureStage claudeAiMessageEvents$FailureStage = this.failure_stage;
        ClaudeAiMessageEvents$FailureType claudeAiMessageEvents$FailureType = this.failure_type;
        Integer num = this.http_status_code;
        String str5 = this.error_code;
        String str6 = this.error_type;
        String str7 = this.error_message;
        long j2 = this.time_in_background_ms;
        boolean z5 = this.used_inline_conversation_create;
        String str8 = this.project_id;
        boolean z6 = this.is_foreground_at_failure;
        StringBuilder sb = new StringBuilder("MessageResponseFailed(time_to_failure_ms=");
        sb.append(j);
        sb.append(", conversation_uuid=");
        sb.append(str);
        kgh.u(sb, ", human_message_uuid=", str2, ", model=", str3);
        ij0.s(i, i2, ", message_index=", ", message_length=", sb);
        sb.append(", is_new_conversation=");
        sb.append(z);
        sb.append(", is_retry=");
        sb.append(z2);
        sb.append(", is_incognito=");
        sb.append(z3);
        sb.append(", is_yukon_gold=");
        sb.append(z4);
        sb.append(", thinking_mode=");
        sb.append(str4);
        sb.append(", research_mode=");
        sb.append(claudeAiMessageEvents$ResearchMode);
        ij0.s(i3, i4, ", document_attachment_count=", ", image_attachment_count=", sb);
        sb.append(", tool_count=");
        sb.append(i5);
        sb.append(", failure_stage=");
        sb.append(claudeAiMessageEvents$FailureStage);
        sb.append(", failure_type=");
        sb.append(claudeAiMessageEvents$FailureType);
        sb.append(", http_status_code=");
        sb.append(num);
        kgh.u(sb, ", error_code=", str5, ", error_type=", str6);
        sb.append(", error_message=");
        sb.append(str7);
        sb.append(", time_in_background_ms=");
        sb.append(j2);
        sb.append(", used_inline_conversation_create=");
        sb.append(z5);
        sb.append(", project_id=");
        sb.append(str8);
        sb.append(", is_foreground_at_failure=");
        sb.append(z6);
        sb.append(")");
        return sb.toString();
    }

    public ClaudeAiMessageEvents$MessageResponseFailed(long j, String str, String str2, String str3, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, String str4, ClaudeAiMessageEvents$ResearchMode claudeAiMessageEvents$ResearchMode, int i3, int i4, int i5, ClaudeAiMessageEvents$FailureStage claudeAiMessageEvents$FailureStage, ClaudeAiMessageEvents$FailureType claudeAiMessageEvents$FailureType, Integer num, String str5, String str6, String str7, long j2, boolean z5, String str8, boolean z6) {
        str2.getClass();
        claudeAiMessageEvents$ResearchMode.getClass();
        claudeAiMessageEvents$FailureStage.getClass();
        claudeAiMessageEvents$FailureType.getClass();
        this.time_to_failure_ms = j;
        this.conversation_uuid = str;
        this.human_message_uuid = str2;
        this.model = str3;
        this.message_index = i;
        this.message_length = i2;
        this.is_new_conversation = z;
        this.is_retry = z2;
        this.is_incognito = z3;
        this.is_yukon_gold = z4;
        this.thinking_mode = str4;
        this.research_mode = claudeAiMessageEvents$ResearchMode;
        this.document_attachment_count = i3;
        this.image_attachment_count = i4;
        this.tool_count = i5;
        this.failure_stage = claudeAiMessageEvents$FailureStage;
        this.failure_type = claudeAiMessageEvents$FailureType;
        this.http_status_code = num;
        this.error_code = str5;
        this.error_type = str6;
        this.error_message = str7;
        this.time_in_background_ms = j2;
        this.used_inline_conversation_create = z5;
        this.project_id = str8;
        this.is_foreground_at_failure = z6;
    }

    public /* synthetic */ ClaudeAiMessageEvents$MessageResponseFailed(long j, String str, String str2, String str3, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, String str4, ClaudeAiMessageEvents$ResearchMode claudeAiMessageEvents$ResearchMode, int i3, int i4, int i5, ClaudeAiMessageEvents$FailureStage claudeAiMessageEvents$FailureStage, ClaudeAiMessageEvents$FailureType claudeAiMessageEvents$FailureType, Integer num, String str5, String str6, String str7, long j2, boolean z5, String str8, boolean z6, int i6, mq5 mq5Var) {
        this(j, (i6 & 2) != 0 ? null : str, str2, (i6 & 8) != 0 ? null : str3, i, i2, z, z2, z3, z4, (i6 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? null : str4, claudeAiMessageEvents$ResearchMode, i3, i4, i5, claudeAiMessageEvents$FailureStage, claudeAiMessageEvents$FailureType, (131072 & i6) != 0 ? null : num, (262144 & i6) != 0 ? null : str5, (524288 & i6) != 0 ? null : str6, (1048576 & i6) != 0 ? null : str7, j2, z5, (i6 & 8388608) != 0 ? null : str8, z6);
    }
}
