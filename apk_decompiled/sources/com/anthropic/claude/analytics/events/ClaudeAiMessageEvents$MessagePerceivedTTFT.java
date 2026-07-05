package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.ci3;
import defpackage.di3;
import defpackage.fsh;
import defpackage.gvj;
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
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 `2\u00020\u0001:\u0002abB«\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001a\u0010\u001bBÁ\u0001\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\f\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001a\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010#J\u0010\u0010'\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b)\u0010(J\u0010\u0010*\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b,\u0010+J\u0010\u0010-\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b-\u0010+J\u0010\u0010.\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b.\u0010+J\u0012\u0010/\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b/\u0010#J\u0010\u00100\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b2\u0010(J\u0010\u00103\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b3\u0010(J\u0010\u00104\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b4\u0010(J\u0010\u00105\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b5\u0010!J\u0010\u00106\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b6\u0010+J\u0012\u00107\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b7\u0010#JÔ\u0001\u00109\u001a\u0002082\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b;\u0010#J\u0010\u0010<\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b<\u0010(J\u001a\u0010?\u001a\u00020\f2\b\u0010>\u001a\u0004\u0018\u00010=HÖ\u0003¢\u0006\u0004\b?\u0010@J'\u0010I\u001a\u00020F2\u0006\u0010A\u001a\u0002082\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020DH\u0001¢\u0006\u0004\bG\u0010HR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010J\u001a\u0004\bK\u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010L\u001a\u0004\bM\u0010#R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010L\u001a\u0004\bN\u0010#R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010L\u001a\u0004\bO\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010L\u001a\u0004\bP\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010Q\u001a\u0004\bR\u0010(R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010Q\u001a\u0004\bS\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010T\u001a\u0004\b\r\u0010+R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010T\u001a\u0004\b\u000e\u0010+R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010T\u001a\u0004\b\u000f\u0010+R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010T\u001a\u0004\b\u0010\u0010+R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010L\u001a\u0004\bU\u0010#R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010V\u001a\u0004\bW\u00101R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010Q\u001a\u0004\bX\u0010(R\u0017\u0010\u0015\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010Q\u001a\u0004\bY\u0010(R\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010Q\u001a\u0004\bZ\u0010(R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010J\u001a\u0004\b[\u0010!R\u0017\u0010\u0018\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010T\u001a\u0004\b\\\u0010+R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010L\u001a\u0004\b]\u0010#R\u0014\u0010_\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010#¨\u0006c"}, d2 = {"com/anthropic/claude/analytics/events/ClaudeAiMessageEvents$MessagePerceivedTTFT", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "perceived_ttft_ms", "", "conversation_uuid", "human_message_uuid", "assistant_message_uuid", "model", "", "message_index", "message_length", "", "is_new_conversation", "is_retry", "is_incognito", "is_yukon_gold", "thinking_mode", "Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$ResearchMode;", "research_mode", "document_attachment_count", "image_attachment_count", "tool_count", "time_in_background_ms", "used_inline_conversation_create", "project_id", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZZZLjava/lang/String;Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$ResearchMode;IIIJZLjava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZZZLjava/lang/String;Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$ResearchMode;IIIJZLjava/lang/String;Lvnf;)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()I", "component7", "component8", "()Z", "component9", "component10", "component11", "component12", "component13", "()Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$ResearchMode;", "component14", "component15", "component16", "component17", "component18", "component19", "Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$MessagePerceivedTTFT;", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZZZLjava/lang/String;Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$ResearchMode;IIIJZLjava/lang/String;)Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$MessagePerceivedTTFT;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$MessagePerceivedTTFT;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "J", "getPerceived_ttft_ms", "Ljava/lang/String;", "getConversation_uuid", "getHuman_message_uuid", "getAssistant_message_uuid", "getModel", "I", "getMessage_index", "getMessage_length", "Z", "getThinking_mode", "Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$ResearchMode;", "getResearch_mode", "getDocument_attachment_count", "getImage_attachment_count", "getTool_count", "getTime_in_background_ms", "getUsed_inline_conversation_create", "getProject_id", "getEventName", "eventName", "Companion", "ci3", "di3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ClaudeAiMessageEvents$MessagePerceivedTTFT implements AnalyticsEvent {
    public static final int $stable = 0;
    private final String assistant_message_uuid;
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
    private final String thinking_mode;
    private final long time_in_background_ms;
    private final int tool_count;
    private final boolean used_inline_conversation_create;
    public static final di3 Companion = new di3();
    private static final kw9[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, yb5.w(w1a.F, new wy2(27)), null, null, null, null, null, null};

    public /* synthetic */ ClaudeAiMessageEvents$MessagePerceivedTTFT(int i, long j, String str, String str2, String str3, String str4, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, String str5, ClaudeAiMessageEvents$ResearchMode claudeAiMessageEvents$ResearchMode, int i4, int i5, int i6, long j2, boolean z5, String str6, vnf vnfVar) {
        if (260079 != (i & 260079)) {
            gvj.f(i, 260079, ci3.a.getDescriptor());
            throw null;
        }
        this.perceived_ttft_ms = j;
        this.conversation_uuid = str;
        this.human_message_uuid = str2;
        this.assistant_message_uuid = str3;
        if ((i & 16) == 0) {
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
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 0) {
            this.thinking_mode = null;
        } else {
            this.thinking_mode = str5;
        }
        this.research_mode = claudeAiMessageEvents$ResearchMode;
        this.document_attachment_count = i4;
        this.image_attachment_count = i5;
        this.tool_count = i6;
        this.time_in_background_ms = j2;
        this.used_inline_conversation_create = z5;
        if ((i & 262144) == 0) {
            this.project_id = null;
        } else {
            this.project_id = str6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ClaudeAiMessageEvents$ResearchMode.Companion.serializer();
    }

    public static /* synthetic */ ClaudeAiMessageEvents$MessagePerceivedTTFT copy$default(ClaudeAiMessageEvents$MessagePerceivedTTFT claudeAiMessageEvents$MessagePerceivedTTFT, long j, String str, String str2, String str3, String str4, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, String str5, ClaudeAiMessageEvents$ResearchMode claudeAiMessageEvents$ResearchMode, int i3, int i4, int i5, long j2, boolean z5, String str6, int i6, Object obj) {
        long j3 = (i6 & 1) != 0 ? claudeAiMessageEvents$MessagePerceivedTTFT.perceived_ttft_ms : j;
        return claudeAiMessageEvents$MessagePerceivedTTFT.copy(j3, (i6 & 2) != 0 ? claudeAiMessageEvents$MessagePerceivedTTFT.conversation_uuid : str, (i6 & 4) != 0 ? claudeAiMessageEvents$MessagePerceivedTTFT.human_message_uuid : str2, (i6 & 8) != 0 ? claudeAiMessageEvents$MessagePerceivedTTFT.assistant_message_uuid : str3, (i6 & 16) != 0 ? claudeAiMessageEvents$MessagePerceivedTTFT.model : str4, (i6 & 32) != 0 ? claudeAiMessageEvents$MessagePerceivedTTFT.message_index : i, (i6 & 64) != 0 ? claudeAiMessageEvents$MessagePerceivedTTFT.message_length : i2, (i6 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? claudeAiMessageEvents$MessagePerceivedTTFT.is_new_conversation : z, (i6 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? claudeAiMessageEvents$MessagePerceivedTTFT.is_retry : z2, (i6 & 512) != 0 ? claudeAiMessageEvents$MessagePerceivedTTFT.is_incognito : z3, (i6 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? claudeAiMessageEvents$MessagePerceivedTTFT.is_yukon_gold : z4, (i6 & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? claudeAiMessageEvents$MessagePerceivedTTFT.thinking_mode : str5, (i6 & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? claudeAiMessageEvents$MessagePerceivedTTFT.research_mode : claudeAiMessageEvents$ResearchMode, (i6 & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? claudeAiMessageEvents$MessagePerceivedTTFT.document_attachment_count : i3, (i6 & 16384) != 0 ? claudeAiMessageEvents$MessagePerceivedTTFT.image_attachment_count : i4, (i6 & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0 ? claudeAiMessageEvents$MessagePerceivedTTFT.tool_count : i5, (i6 & 65536) != 0 ? claudeAiMessageEvents$MessagePerceivedTTFT.time_in_background_ms : j2, (i6 & 131072) != 0 ? claudeAiMessageEvents$MessagePerceivedTTFT.used_inline_conversation_create : z5, (i6 & 262144) != 0 ? claudeAiMessageEvents$MessagePerceivedTTFT.project_id : str6);
    }

    public static final /* synthetic */ void write$Self$analytics(ClaudeAiMessageEvents$MessagePerceivedTTFT self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.D(serialDesc, 0, self.perceived_ttft_ms);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.q(serialDesc, 2, self.human_message_uuid);
        output.q(serialDesc, 3, self.assistant_message_uuid);
        if (output.E(serialDesc) || self.model != null) {
            output.B(serialDesc, 4, srg.a, self.model);
        }
        output.l(5, self.message_index, serialDesc);
        output.l(6, self.message_length, serialDesc);
        output.p(serialDesc, 7, self.is_new_conversation);
        output.p(serialDesc, 8, self.is_retry);
        output.p(serialDesc, 9, self.is_incognito);
        output.p(serialDesc, 10, self.is_yukon_gold);
        if (output.E(serialDesc) || self.thinking_mode != null) {
            output.B(serialDesc, 11, srg.a, self.thinking_mode);
        }
        output.r(serialDesc, 12, (znf) kw9VarArr[12].getValue(), self.research_mode);
        output.l(13, self.document_attachment_count, serialDesc);
        output.l(14, self.image_attachment_count, serialDesc);
        output.l(15, self.tool_count, serialDesc);
        output.D(serialDesc, 16, self.time_in_background_ms);
        output.p(serialDesc, 17, self.used_inline_conversation_create);
        if (!output.E(serialDesc) && self.project_id == null) {
            return;
        }
        output.B(serialDesc, 18, srg.a, self.project_id);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getPerceived_ttft_ms() {
        return this.perceived_ttft_ms;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIs_incognito() {
        return this.is_incognito;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getIs_yukon_gold() {
        return this.is_yukon_gold;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getThinking_mode() {
        return this.thinking_mode;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final ClaudeAiMessageEvents$ResearchMode getResearch_mode() {
        return this.research_mode;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getDocument_attachment_count() {
        return this.document_attachment_count;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getImage_attachment_count() {
        return this.image_attachment_count;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getTool_count() {
        return this.tool_count;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final long getTime_in_background_ms() {
        return this.time_in_background_ms;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getUsed_inline_conversation_create() {
        return this.used_inline_conversation_create;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getProject_id() {
        return this.project_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHuman_message_uuid() {
        return this.human_message_uuid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAssistant_message_uuid() {
        return this.assistant_message_uuid;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getMessage_index() {
        return this.message_index;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getMessage_length() {
        return this.message_length;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIs_new_conversation() {
        return this.is_new_conversation;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIs_retry() {
        return this.is_retry;
    }

    public final ClaudeAiMessageEvents$MessagePerceivedTTFT copy(long perceived_ttft_ms, String conversation_uuid, String human_message_uuid, String assistant_message_uuid, String model, int message_index, int message_length, boolean is_new_conversation, boolean is_retry, boolean is_incognito, boolean is_yukon_gold, String thinking_mode, ClaudeAiMessageEvents$ResearchMode research_mode, int document_attachment_count, int image_attachment_count, int tool_count, long time_in_background_ms, boolean used_inline_conversation_create, String project_id) {
        conversation_uuid.getClass();
        human_message_uuid.getClass();
        assistant_message_uuid.getClass();
        research_mode.getClass();
        return new ClaudeAiMessageEvents$MessagePerceivedTTFT(perceived_ttft_ms, conversation_uuid, human_message_uuid, assistant_message_uuid, model, message_index, message_length, is_new_conversation, is_retry, is_incognito, is_yukon_gold, thinking_mode, research_mode, document_attachment_count, image_attachment_count, tool_count, time_in_background_ms, used_inline_conversation_create, project_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClaudeAiMessageEvents$MessagePerceivedTTFT)) {
            return false;
        }
        ClaudeAiMessageEvents$MessagePerceivedTTFT claudeAiMessageEvents$MessagePerceivedTTFT = (ClaudeAiMessageEvents$MessagePerceivedTTFT) other;
        return this.perceived_ttft_ms == claudeAiMessageEvents$MessagePerceivedTTFT.perceived_ttft_ms && x44.r(this.conversation_uuid, claudeAiMessageEvents$MessagePerceivedTTFT.conversation_uuid) && x44.r(this.human_message_uuid, claudeAiMessageEvents$MessagePerceivedTTFT.human_message_uuid) && x44.r(this.assistant_message_uuid, claudeAiMessageEvents$MessagePerceivedTTFT.assistant_message_uuid) && x44.r(this.model, claudeAiMessageEvents$MessagePerceivedTTFT.model) && this.message_index == claudeAiMessageEvents$MessagePerceivedTTFT.message_index && this.message_length == claudeAiMessageEvents$MessagePerceivedTTFT.message_length && this.is_new_conversation == claudeAiMessageEvents$MessagePerceivedTTFT.is_new_conversation && this.is_retry == claudeAiMessageEvents$MessagePerceivedTTFT.is_retry && this.is_incognito == claudeAiMessageEvents$MessagePerceivedTTFT.is_incognito && this.is_yukon_gold == claudeAiMessageEvents$MessagePerceivedTTFT.is_yukon_gold && x44.r(this.thinking_mode, claudeAiMessageEvents$MessagePerceivedTTFT.thinking_mode) && this.research_mode == claudeAiMessageEvents$MessagePerceivedTTFT.research_mode && this.document_attachment_count == claudeAiMessageEvents$MessagePerceivedTTFT.document_attachment_count && this.image_attachment_count == claudeAiMessageEvents$MessagePerceivedTTFT.image_attachment_count && this.tool_count == claudeAiMessageEvents$MessagePerceivedTTFT.tool_count && this.time_in_background_ms == claudeAiMessageEvents$MessagePerceivedTTFT.time_in_background_ms && this.used_inline_conversation_create == claudeAiMessageEvents$MessagePerceivedTTFT.used_inline_conversation_create && x44.r(this.project_id, claudeAiMessageEvents$MessagePerceivedTTFT.project_id);
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
        return "claudeai.message.perceived_ttft";
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

    public final String getThinking_mode() {
        return this.thinking_mode;
    }

    public final long getTime_in_background_ms() {
        return this.time_in_background_ms;
    }

    public final int getTool_count() {
        return this.tool_count;
    }

    public final boolean getUsed_inline_conversation_create() {
        return this.used_inline_conversation_create;
    }

    public int hashCode() {
        int iL = kgh.l(kgh.l(kgh.l(Long.hashCode(this.perceived_ttft_ms) * 31, 31, this.conversation_uuid), 31, this.human_message_uuid), 31, this.assistant_message_uuid);
        String str = this.model;
        int iP = fsh.p(fsh.p(fsh.p(fsh.p(vb7.c(this.message_length, vb7.c(this.message_index, (iL + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.is_new_conversation), 31, this.is_retry), 31, this.is_incognito), 31, this.is_yukon_gold);
        String str2 = this.thinking_mode;
        int iP2 = fsh.p(vb7.e(vb7.c(this.tool_count, vb7.c(this.image_attachment_count, vb7.c(this.document_attachment_count, (this.research_mode.hashCode() + ((iP + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31), 31), 31), 31, this.time_in_background_ms), 31, this.used_inline_conversation_create);
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
        long j2 = this.time_in_background_ms;
        boolean z5 = this.used_inline_conversation_create;
        String str6 = this.project_id;
        StringBuilder sb = new StringBuilder("MessagePerceivedTTFT(perceived_ttft_ms=");
        sb.append(j);
        sb.append(", conversation_uuid=");
        sb.append(str);
        kgh.u(sb, ", human_message_uuid=", str2, ", assistant_message_uuid=", str3);
        sb.append(", model=");
        sb.append(str4);
        sb.append(", message_index=");
        sb.append(i);
        sb.append(", message_length=");
        sb.append(i2);
        sb.append(", is_new_conversation=");
        sb.append(z);
        sb.append(", is_retry=");
        sb.append(z2);
        sb.append(", is_incognito=");
        sb.append(z3);
        sb.append(", is_yukon_gold=");
        sb.append(z4);
        sb.append(", thinking_mode=");
        sb.append(str5);
        sb.append(", research_mode=");
        sb.append(claudeAiMessageEvents$ResearchMode);
        sb.append(", document_attachment_count=");
        sb.append(i3);
        ij0.s(i4, i5, ", image_attachment_count=", ", tool_count=", sb);
        ij0.u(j2, ", time_in_background_ms=", ", used_inline_conversation_create=", sb);
        sb.append(z5);
        sb.append(", project_id=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }

    public ClaudeAiMessageEvents$MessagePerceivedTTFT(long j, String str, String str2, String str3, String str4, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, String str5, ClaudeAiMessageEvents$ResearchMode claudeAiMessageEvents$ResearchMode, int i3, int i4, int i5, long j2, boolean z5, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        claudeAiMessageEvents$ResearchMode.getClass();
        this.perceived_ttft_ms = j;
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
        this.time_in_background_ms = j2;
        this.used_inline_conversation_create = z5;
        this.project_id = str6;
    }

    public /* synthetic */ ClaudeAiMessageEvents$MessagePerceivedTTFT(long j, String str, String str2, String str3, String str4, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, String str5, ClaudeAiMessageEvents$ResearchMode claudeAiMessageEvents$ResearchMode, int i3, int i4, int i5, long j2, boolean z5, String str6, int i6, mq5 mq5Var) {
        this(j, str, str2, str3, (i6 & 16) != 0 ? null : str4, i, i2, z, z2, z3, z4, (i6 & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? null : str5, claudeAiMessageEvents$ResearchMode, i3, i4, i5, j2, z5, (i6 & 262144) != 0 ? null : str6);
    }
}
