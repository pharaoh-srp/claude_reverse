package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.fsh;
import defpackage.gi3;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.li3;
import defpackage.mdj;
import defpackage.mi3;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u0000 c2\u00020\u0001:\u0002deB·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001b\u0010\u001cBÉ\u0001\b\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u000b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001b\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b'\u0010&J\u0012\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b(\u0010&J\u0012\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b)\u0010&J\u0010\u0010*\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b,\u0010+J\u0010\u0010-\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b-\u0010$J\u0010\u0010.\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b.\u0010$J\u0010\u0010/\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b/\u0010$J\u0010\u00100\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b0\u0010$J\u0012\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b1\u0010&J\u0010\u00102\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b4\u0010+J\u0010\u00105\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b5\u0010+J\u0010\u00106\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b6\u0010+J\u0010\u00107\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b7\u0010\"J\u0010\u00108\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b8\u0010$J\u0012\u00109\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b9\u0010&Jà\u0001\u0010;\u001a\u00020:2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b=\u0010&J\u0010\u0010>\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b>\u0010+J\u001a\u0010A\u001a\u00020\u00042\b\u0010@\u001a\u0004\u0018\u00010?HÖ\u0003¢\u0006\u0004\bA\u0010BJ'\u0010K\u001a\u00020H2\u0006\u0010C\u001a\u00020:2\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020FH\u0001¢\u0006\u0004\bI\u0010JR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010L\u001a\u0004\bM\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010N\u001a\u0004\bO\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010P\u001a\u0004\bQ\u0010&R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010P\u001a\u0004\bR\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010P\u001a\u0004\bS\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010P\u001a\u0004\bT\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010U\u001a\u0004\bV\u0010+R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010U\u001a\u0004\bW\u0010+R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010N\u001a\u0004\b\u000e\u0010$R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010N\u001a\u0004\b\u000f\u0010$R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010N\u001a\u0004\b\u0010\u0010$R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010N\u001a\u0004\b\u0011\u0010$R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010P\u001a\u0004\bX\u0010&R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010Y\u001a\u0004\bZ\u00103R\u0017\u0010\u0015\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010U\u001a\u0004\b[\u0010+R\u0017\u0010\u0016\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010U\u001a\u0004\b\\\u0010+R\u0017\u0010\u0017\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010U\u001a\u0004\b]\u0010+R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010L\u001a\u0004\b^\u0010\"R\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010N\u001a\u0004\b_\u0010$R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010P\u001a\u0004\b`\u0010&R\u0014\u0010b\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010&¨\u0006f"}, d2 = {"com/anthropic/claude/analytics/events/ClaudeAiMessageEvents$MessageStreamingAbandoned", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "time_to_abandonment_ms", "", "had_first_token", "", "conversation_uuid", "human_message_uuid", "assistant_message_uuid", "model", "", "message_index", "message_length", "is_new_conversation", "is_retry", "is_incognito", "is_yukon_gold", "thinking_mode", "Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$ResearchMode;", "research_mode", "document_attachment_count", "image_attachment_count", "tool_count", "time_in_background_ms", "used_inline_conversation_create", "project_id", "<init>", "(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZZZLjava/lang/String;Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$ResearchMode;IIIJZLjava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZZZLjava/lang/String;Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$ResearchMode;IIIJZLjava/lang/String;Lvnf;)V", "component1", "()J", "component2", "()Z", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "()I", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "()Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$ResearchMode;", "component15", "component16", "component17", "component18", "component19", "component20", "Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$MessageStreamingAbandoned;", "copy", "(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZZZLjava/lang/String;Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$ResearchMode;IIIJZLjava/lang/String;)Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$MessageStreamingAbandoned;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$MessageStreamingAbandoned;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "J", "getTime_to_abandonment_ms", "Z", "getHad_first_token", "Ljava/lang/String;", "getConversation_uuid", "getHuman_message_uuid", "getAssistant_message_uuid", "getModel", "I", "getMessage_index", "getMessage_length", "getThinking_mode", "Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$ResearchMode;", "getResearch_mode", "getDocument_attachment_count", "getImage_attachment_count", "getTool_count", "getTime_in_background_ms", "getUsed_inline_conversation_create", "getProject_id", "getEventName", "eventName", "Companion", "li3", "mi3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ClaudeAiMessageEvents$MessageStreamingAbandoned implements AnalyticsEvent {
    public static final int $stable = 0;
    private final String assistant_message_uuid;
    private final String conversation_uuid;
    private final int document_attachment_count;
    private final boolean had_first_token;
    private final String human_message_uuid;
    private final int image_attachment_count;
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
    private final long time_to_abandonment_ms;
    private final int tool_count;
    private final boolean used_inline_conversation_create;
    public static final mi3 Companion = new mi3();
    private static final kw9[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, yb5.w(w1a.F, new gi3(3)), null, null, null, null, null, null};

    public /* synthetic */ ClaudeAiMessageEvents$MessageStreamingAbandoned(int i, long j, boolean z, String str, String str2, String str3, String str4, int i2, int i3, boolean z2, boolean z3, boolean z4, boolean z5, String str5, ClaudeAiMessageEvents$ResearchMode claudeAiMessageEvents$ResearchMode, int i4, int i5, int i6, long j2, boolean z6, String str6, vnf vnfVar) {
        if (520143 != (i & 520143)) {
            gvj.f(i, 520143, li3.a.getDescriptor());
            throw null;
        }
        this.time_to_abandonment_ms = j;
        this.had_first_token = z;
        this.conversation_uuid = str;
        this.human_message_uuid = str2;
        if ((i & 16) == 0) {
            this.assistant_message_uuid = null;
        } else {
            this.assistant_message_uuid = str3;
        }
        if ((i & 32) == 0) {
            this.model = null;
        } else {
            this.model = str4;
        }
        this.message_index = i2;
        this.message_length = i3;
        this.is_new_conversation = z2;
        this.is_retry = z3;
        this.is_incognito = z4;
        this.is_yukon_gold = z5;
        if ((i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0) {
            this.thinking_mode = null;
        } else {
            this.thinking_mode = str5;
        }
        this.research_mode = claudeAiMessageEvents$ResearchMode;
        this.document_attachment_count = i4;
        this.image_attachment_count = i5;
        this.tool_count = i6;
        this.time_in_background_ms = j2;
        this.used_inline_conversation_create = z6;
        if ((i & 524288) == 0) {
            this.project_id = null;
        } else {
            this.project_id = str6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ClaudeAiMessageEvents$ResearchMode.Companion.serializer();
    }

    public static /* synthetic */ ClaudeAiMessageEvents$MessageStreamingAbandoned copy$default(ClaudeAiMessageEvents$MessageStreamingAbandoned claudeAiMessageEvents$MessageStreamingAbandoned, long j, boolean z, String str, String str2, String str3, String str4, int i, int i2, boolean z2, boolean z3, boolean z4, boolean z5, String str5, ClaudeAiMessageEvents$ResearchMode claudeAiMessageEvents$ResearchMode, int i3, int i4, int i5, long j2, boolean z6, String str6, int i6, Object obj) {
        long j3 = (i6 & 1) != 0 ? claudeAiMessageEvents$MessageStreamingAbandoned.time_to_abandonment_ms : j;
        return claudeAiMessageEvents$MessageStreamingAbandoned.copy(j3, (i6 & 2) != 0 ? claudeAiMessageEvents$MessageStreamingAbandoned.had_first_token : z, (i6 & 4) != 0 ? claudeAiMessageEvents$MessageStreamingAbandoned.conversation_uuid : str, (i6 & 8) != 0 ? claudeAiMessageEvents$MessageStreamingAbandoned.human_message_uuid : str2, (i6 & 16) != 0 ? claudeAiMessageEvents$MessageStreamingAbandoned.assistant_message_uuid : str3, (i6 & 32) != 0 ? claudeAiMessageEvents$MessageStreamingAbandoned.model : str4, (i6 & 64) != 0 ? claudeAiMessageEvents$MessageStreamingAbandoned.message_index : i, (i6 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? claudeAiMessageEvents$MessageStreamingAbandoned.message_length : i2, (i6 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? claudeAiMessageEvents$MessageStreamingAbandoned.is_new_conversation : z2, (i6 & 512) != 0 ? claudeAiMessageEvents$MessageStreamingAbandoned.is_retry : z3, (i6 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? claudeAiMessageEvents$MessageStreamingAbandoned.is_incognito : z4, (i6 & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? claudeAiMessageEvents$MessageStreamingAbandoned.is_yukon_gold : z5, (i6 & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? claudeAiMessageEvents$MessageStreamingAbandoned.thinking_mode : str5, (i6 & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? claudeAiMessageEvents$MessageStreamingAbandoned.research_mode : claudeAiMessageEvents$ResearchMode, (i6 & 16384) != 0 ? claudeAiMessageEvents$MessageStreamingAbandoned.document_attachment_count : i3, (i6 & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0 ? claudeAiMessageEvents$MessageStreamingAbandoned.image_attachment_count : i4, (i6 & 65536) != 0 ? claudeAiMessageEvents$MessageStreamingAbandoned.tool_count : i5, (i6 & 131072) != 0 ? claudeAiMessageEvents$MessageStreamingAbandoned.time_in_background_ms : j2, (i6 & 262144) != 0 ? claudeAiMessageEvents$MessageStreamingAbandoned.used_inline_conversation_create : z6, (i6 & 524288) != 0 ? claudeAiMessageEvents$MessageStreamingAbandoned.project_id : str6);
    }

    public static final /* synthetic */ void write$Self$analytics(ClaudeAiMessageEvents$MessageStreamingAbandoned self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.D(serialDesc, 0, self.time_to_abandonment_ms);
        output.p(serialDesc, 1, self.had_first_token);
        output.q(serialDesc, 2, self.conversation_uuid);
        output.q(serialDesc, 3, self.human_message_uuid);
        if (output.E(serialDesc) || self.assistant_message_uuid != null) {
            output.B(serialDesc, 4, srg.a, self.assistant_message_uuid);
        }
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
        output.D(serialDesc, 17, self.time_in_background_ms);
        output.p(serialDesc, 18, self.used_inline_conversation_create);
        if (!output.E(serialDesc) && self.project_id == null) {
            return;
        }
        output.B(serialDesc, 19, srg.a, self.project_id);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime_to_abandonment_ms() {
        return this.time_to_abandonment_ms;
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
    public final long getTime_in_background_ms() {
        return this.time_in_background_ms;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final boolean getUsed_inline_conversation_create() {
        return this.used_inline_conversation_create;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHad_first_token() {
        return this.had_first_token;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
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

    public final ClaudeAiMessageEvents$MessageStreamingAbandoned copy(long time_to_abandonment_ms, boolean had_first_token, String conversation_uuid, String human_message_uuid, String assistant_message_uuid, String model, int message_index, int message_length, boolean is_new_conversation, boolean is_retry, boolean is_incognito, boolean is_yukon_gold, String thinking_mode, ClaudeAiMessageEvents$ResearchMode research_mode, int document_attachment_count, int image_attachment_count, int tool_count, long time_in_background_ms, boolean used_inline_conversation_create, String project_id) {
        conversation_uuid.getClass();
        human_message_uuid.getClass();
        research_mode.getClass();
        return new ClaudeAiMessageEvents$MessageStreamingAbandoned(time_to_abandonment_ms, had_first_token, conversation_uuid, human_message_uuid, assistant_message_uuid, model, message_index, message_length, is_new_conversation, is_retry, is_incognito, is_yukon_gold, thinking_mode, research_mode, document_attachment_count, image_attachment_count, tool_count, time_in_background_ms, used_inline_conversation_create, project_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClaudeAiMessageEvents$MessageStreamingAbandoned)) {
            return false;
        }
        ClaudeAiMessageEvents$MessageStreamingAbandoned claudeAiMessageEvents$MessageStreamingAbandoned = (ClaudeAiMessageEvents$MessageStreamingAbandoned) other;
        return this.time_to_abandonment_ms == claudeAiMessageEvents$MessageStreamingAbandoned.time_to_abandonment_ms && this.had_first_token == claudeAiMessageEvents$MessageStreamingAbandoned.had_first_token && x44.r(this.conversation_uuid, claudeAiMessageEvents$MessageStreamingAbandoned.conversation_uuid) && x44.r(this.human_message_uuid, claudeAiMessageEvents$MessageStreamingAbandoned.human_message_uuid) && x44.r(this.assistant_message_uuid, claudeAiMessageEvents$MessageStreamingAbandoned.assistant_message_uuid) && x44.r(this.model, claudeAiMessageEvents$MessageStreamingAbandoned.model) && this.message_index == claudeAiMessageEvents$MessageStreamingAbandoned.message_index && this.message_length == claudeAiMessageEvents$MessageStreamingAbandoned.message_length && this.is_new_conversation == claudeAiMessageEvents$MessageStreamingAbandoned.is_new_conversation && this.is_retry == claudeAiMessageEvents$MessageStreamingAbandoned.is_retry && this.is_incognito == claudeAiMessageEvents$MessageStreamingAbandoned.is_incognito && this.is_yukon_gold == claudeAiMessageEvents$MessageStreamingAbandoned.is_yukon_gold && x44.r(this.thinking_mode, claudeAiMessageEvents$MessageStreamingAbandoned.thinking_mode) && this.research_mode == claudeAiMessageEvents$MessageStreamingAbandoned.research_mode && this.document_attachment_count == claudeAiMessageEvents$MessageStreamingAbandoned.document_attachment_count && this.image_attachment_count == claudeAiMessageEvents$MessageStreamingAbandoned.image_attachment_count && this.tool_count == claudeAiMessageEvents$MessageStreamingAbandoned.tool_count && this.time_in_background_ms == claudeAiMessageEvents$MessageStreamingAbandoned.time_in_background_ms && this.used_inline_conversation_create == claudeAiMessageEvents$MessageStreamingAbandoned.used_inline_conversation_create && x44.r(this.project_id, claudeAiMessageEvents$MessageStreamingAbandoned.project_id);
    }

    public final String getAssistant_message_uuid() {
        return this.assistant_message_uuid;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    public final int getDocument_attachment_count() {
        return this.document_attachment_count;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.message.streaming_abandoned";
    }

    public final boolean getHad_first_token() {
        return this.had_first_token;
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

    public final long getTime_to_abandonment_ms() {
        return this.time_to_abandonment_ms;
    }

    public final int getTool_count() {
        return this.tool_count;
    }

    public final boolean getUsed_inline_conversation_create() {
        return this.used_inline_conversation_create;
    }

    public int hashCode() {
        int iL = kgh.l(kgh.l(fsh.p(Long.hashCode(this.time_to_abandonment_ms) * 31, 31, this.had_first_token), 31, this.conversation_uuid), 31, this.human_message_uuid);
        String str = this.assistant_message_uuid;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.model;
        int iP = fsh.p(fsh.p(fsh.p(fsh.p(vb7.c(this.message_length, vb7.c(this.message_index, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31, this.is_new_conversation), 31, this.is_retry), 31, this.is_incognito), 31, this.is_yukon_gold);
        String str3 = this.thinking_mode;
        int iP2 = fsh.p(vb7.e(vb7.c(this.tool_count, vb7.c(this.image_attachment_count, vb7.c(this.document_attachment_count, (this.research_mode.hashCode() + ((iP + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, 31), 31), 31), 31, this.time_in_background_ms), 31, this.used_inline_conversation_create);
        String str4 = this.project_id;
        return iP2 + (str4 != null ? str4.hashCode() : 0);
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
        long j = this.time_to_abandonment_ms;
        boolean z = this.had_first_token;
        String str = this.conversation_uuid;
        String str2 = this.human_message_uuid;
        String str3 = this.assistant_message_uuid;
        String str4 = this.model;
        int i = this.message_index;
        int i2 = this.message_length;
        boolean z2 = this.is_new_conversation;
        boolean z3 = this.is_retry;
        boolean z4 = this.is_incognito;
        boolean z5 = this.is_yukon_gold;
        String str5 = this.thinking_mode;
        ClaudeAiMessageEvents$ResearchMode claudeAiMessageEvents$ResearchMode = this.research_mode;
        int i3 = this.document_attachment_count;
        int i4 = this.image_attachment_count;
        int i5 = this.tool_count;
        long j2 = this.time_in_background_ms;
        boolean z6 = this.used_inline_conversation_create;
        String str6 = this.project_id;
        StringBuilder sb = new StringBuilder("MessageStreamingAbandoned(time_to_abandonment_ms=");
        sb.append(j);
        sb.append(", had_first_token=");
        sb.append(z);
        kgh.u(sb, ", conversation_uuid=", str, ", human_message_uuid=", str2);
        kgh.u(sb, ", assistant_message_uuid=", str3, ", model=", str4);
        ij0.s(i, i2, ", message_index=", ", message_length=", sb);
        sb.append(", is_new_conversation=");
        sb.append(z2);
        sb.append(", is_retry=");
        sb.append(z3);
        sb.append(", is_incognito=");
        sb.append(z4);
        sb.append(", is_yukon_gold=");
        sb.append(z5);
        sb.append(", thinking_mode=");
        sb.append(str5);
        sb.append(", research_mode=");
        sb.append(claudeAiMessageEvents$ResearchMode);
        ij0.s(i3, i4, ", document_attachment_count=", ", image_attachment_count=", sb);
        sb.append(", tool_count=");
        sb.append(i5);
        sb.append(", time_in_background_ms=");
        sb.append(j2);
        sb.append(", used_inline_conversation_create=");
        sb.append(z6);
        return kgh.q(sb, ", project_id=", str6, ")");
    }

    public ClaudeAiMessageEvents$MessageStreamingAbandoned(long j, boolean z, String str, String str2, String str3, String str4, int i, int i2, boolean z2, boolean z3, boolean z4, boolean z5, String str5, ClaudeAiMessageEvents$ResearchMode claudeAiMessageEvents$ResearchMode, int i3, int i4, int i5, long j2, boolean z6, String str6) {
        str.getClass();
        str2.getClass();
        claudeAiMessageEvents$ResearchMode.getClass();
        this.time_to_abandonment_ms = j;
        this.had_first_token = z;
        this.conversation_uuid = str;
        this.human_message_uuid = str2;
        this.assistant_message_uuid = str3;
        this.model = str4;
        this.message_index = i;
        this.message_length = i2;
        this.is_new_conversation = z2;
        this.is_retry = z3;
        this.is_incognito = z4;
        this.is_yukon_gold = z5;
        this.thinking_mode = str5;
        this.research_mode = claudeAiMessageEvents$ResearchMode;
        this.document_attachment_count = i3;
        this.image_attachment_count = i4;
        this.tool_count = i5;
        this.time_in_background_ms = j2;
        this.used_inline_conversation_create = z6;
        this.project_id = str6;
    }

    public /* synthetic */ ClaudeAiMessageEvents$MessageStreamingAbandoned(long j, boolean z, String str, String str2, String str3, String str4, int i, int i2, boolean z2, boolean z3, boolean z4, boolean z5, String str5, ClaudeAiMessageEvents$ResearchMode claudeAiMessageEvents$ResearchMode, int i3, int i4, int i5, long j2, boolean z6, String str6, int i6, mq5 mq5Var) {
        this(j, z, str, str2, (i6 & 16) != 0 ? null : str3, (i6 & 32) != 0 ? null : str4, i, i2, z2, z3, z4, z5, (i6 & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? null : str5, claudeAiMessageEvents$ResearchMode, i3, i4, i5, j2, z6, (i6 & 524288) != 0 ? null : str6);
    }
}
