package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.e79;
import defpackage.fsh;
import defpackage.gi3;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.ji3;
import defpackage.kgh;
import defpackage.ki3;
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
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 f2\u00020\u0001:\u0002ghBË\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001b\u0010\u001cB×\u0001\b\u0010\u0012\u0006\u0010\u001d\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001b\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b'\u0010%J\u0010\u0010(\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b*\u0010%J\u0010\u0010+\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b+\u0010%J\u0010\u0010,\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b,\u0010%J\u0010\u0010-\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b-\u0010%J\u0010\u0010.\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b.\u0010%J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010\"J\u0010\u00100\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b0\u0010)J\u0010\u00101\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b1\u0010)J\u0012\u00102\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b4\u00103J\u0012\u00105\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b5\u00103J\u0012\u00106\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b6\u00103J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u0010\"J\u0010\u00108\u001a\u00020\u0018HÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u0010\"Jð\u0001\u0010<\u001a\u00020;2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b>\u0010\"J\u0010\u0010?\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b?\u0010)J\u001a\u0010B\u001a\u00020\u00052\b\u0010A\u001a\u0004\u0018\u00010@HÖ\u0003¢\u0006\u0004\bB\u0010CJ'\u0010L\u001a\u00020I2\u0006\u0010D\u001a\u00020;2\u0006\u0010F\u001a\u00020E2\u0006\u0010H\u001a\u00020GH\u0001¢\u0006\u0004\bJ\u0010KR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010M\u001a\u0004\bN\u0010\"R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010M\u001a\u0004\bO\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010P\u001a\u0004\bQ\u0010%R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010P\u001a\u0004\bR\u0010%R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010P\u001a\u0004\bS\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010T\u001a\u0004\bU\u0010)R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010P\u001a\u0004\b\u000b\u0010%R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010P\u001a\u0004\bV\u0010%R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010P\u001a\u0004\bW\u0010%R\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010P\u001a\u0004\b\u000e\u0010%R\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010P\u001a\u0004\b\u000f\u0010%R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010M\u001a\u0004\bX\u0010\"R\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010T\u001a\u0004\bY\u0010)R\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010T\u001a\u0004\bZ\u0010)R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010[\u001a\u0004\b\\\u00103R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010[\u001a\u0004\b]\u00103R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010[\u001a\u0004\b^\u00103R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010[\u001a\u0004\b_\u00103R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010M\u001a\u0004\b`\u0010\"R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010a\u001a\u0004\bb\u00109R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010M\u001a\u0004\bc\u0010\"R\u0014\u0010e\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010\"¨\u0006i"}, d2 = {"com/anthropic/claude/analytics/events/ClaudeAiMessageEvents$MessageSent", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "conversation_uuid", "model", "", "has_attachments", "has_files", "has_sync_sources", "", "message_length", "is_new_conversation", "has_personalized_style", "include_profile_preferences", "is_incognito", "is_yukon_gold", "text_formatting", "multiple_newline_count", "single_newline_count", "message_index", "document_attachment_count", "image_attachment_count", "tool_count", "thinking_mode", "Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$ResearchMode;", "research_mode", "project_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZIZZZZZLjava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$ResearchMode;Ljava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZZZIZZZZZLjava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$ResearchMode;Ljava/lang/String;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "component6", "()I", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "()Ljava/lang/Integer;", "component16", "component17", "component18", "component19", "component20", "()Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$ResearchMode;", "component21", "Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$MessageSent;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZZIZZZZZLjava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$ResearchMode;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$MessageSent;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$MessageSent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getConversation_uuid", "getModel", "Z", "getHas_attachments", "getHas_files", "getHas_sync_sources", "I", "getMessage_length", "getHas_personalized_style", "getInclude_profile_preferences", "getText_formatting", "getMultiple_newline_count", "getSingle_newline_count", "Ljava/lang/Integer;", "getMessage_index", "getDocument_attachment_count", "getImage_attachment_count", "getTool_count", "getThinking_mode", "Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$ResearchMode;", "getResearch_mode", "getProject_id", "getEventName", "eventName", "Companion", "ji3", "ki3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ClaudeAiMessageEvents$MessageSent implements AnalyticsEvent {
    public static final int $stable = 0;
    private final String conversation_uuid;
    private final Integer document_attachment_count;
    private final boolean has_attachments;
    private final boolean has_files;
    private final boolean has_personalized_style;
    private final boolean has_sync_sources;
    private final Integer image_attachment_count;
    private final boolean include_profile_preferences;
    private final boolean is_incognito;
    private final boolean is_new_conversation;
    private final boolean is_yukon_gold;
    private final Integer message_index;
    private final int message_length;
    private final String model;
    private final int multiple_newline_count;
    private final String project_id;
    private final ClaudeAiMessageEvents$ResearchMode research_mode;
    private final int single_newline_count;
    private final String text_formatting;
    private final String thinking_mode;
    private final Integer tool_count;
    public static final ki3 Companion = new ki3();
    private static final kw9[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, yb5.w(w1a.F, new gi3(2)), null};

    public /* synthetic */ ClaudeAiMessageEvents$MessageSent(int i, String str, String str2, boolean z, boolean z2, boolean z3, int i2, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str3, int i3, int i4, Integer num, Integer num2, Integer num3, Integer num4, String str4, ClaudeAiMessageEvents$ResearchMode claudeAiMessageEvents$ResearchMode, String str5, vnf vnfVar) {
        if (540669 != (i & 540669)) {
            gvj.f(i, 540669, ji3.a.getDescriptor());
            throw null;
        }
        this.conversation_uuid = str;
        if ((i & 2) == 0) {
            this.model = null;
        } else {
            this.model = str2;
        }
        this.has_attachments = z;
        this.has_files = z2;
        this.has_sync_sources = z3;
        this.message_length = i2;
        this.is_new_conversation = z4;
        this.has_personalized_style = z5;
        this.include_profile_preferences = z6;
        this.is_incognito = z7;
        this.is_yukon_gold = z8;
        this.text_formatting = str3;
        this.multiple_newline_count = i3;
        this.single_newline_count = i4;
        if ((i & 16384) == 0) {
            this.message_index = null;
        } else {
            this.message_index = num;
        }
        if ((32768 & i) == 0) {
            this.document_attachment_count = null;
        } else {
            this.document_attachment_count = num2;
        }
        if ((65536 & i) == 0) {
            this.image_attachment_count = null;
        } else {
            this.image_attachment_count = num3;
        }
        if ((131072 & i) == 0) {
            this.tool_count = null;
        } else {
            this.tool_count = num4;
        }
        if ((262144 & i) == 0) {
            this.thinking_mode = null;
        } else {
            this.thinking_mode = str4;
        }
        this.research_mode = claudeAiMessageEvents$ResearchMode;
        if ((i & FreeTypeConstants.FT_LOAD_COLOR) == 0) {
            this.project_id = null;
        } else {
            this.project_id = str5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ClaudeAiMessageEvents$ResearchMode.Companion.serializer();
    }

    public static /* synthetic */ ClaudeAiMessageEvents$MessageSent copy$default(ClaudeAiMessageEvents$MessageSent claudeAiMessageEvents$MessageSent, String str, String str2, boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str3, int i2, int i3, Integer num, Integer num2, Integer num3, Integer num4, String str4, ClaudeAiMessageEvents$ResearchMode claudeAiMessageEvents$ResearchMode, String str5, int i4, Object obj) {
        String str6;
        ClaudeAiMessageEvents$ResearchMode claudeAiMessageEvents$ResearchMode2;
        String str7 = (i4 & 1) != 0 ? claudeAiMessageEvents$MessageSent.conversation_uuid : str;
        String str8 = (i4 & 2) != 0 ? claudeAiMessageEvents$MessageSent.model : str2;
        boolean z9 = (i4 & 4) != 0 ? claudeAiMessageEvents$MessageSent.has_attachments : z;
        boolean z10 = (i4 & 8) != 0 ? claudeAiMessageEvents$MessageSent.has_files : z2;
        boolean z11 = (i4 & 16) != 0 ? claudeAiMessageEvents$MessageSent.has_sync_sources : z3;
        int i5 = (i4 & 32) != 0 ? claudeAiMessageEvents$MessageSent.message_length : i;
        boolean z12 = (i4 & 64) != 0 ? claudeAiMessageEvents$MessageSent.is_new_conversation : z4;
        boolean z13 = (i4 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? claudeAiMessageEvents$MessageSent.has_personalized_style : z5;
        boolean z14 = (i4 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? claudeAiMessageEvents$MessageSent.include_profile_preferences : z6;
        boolean z15 = (i4 & 512) != 0 ? claudeAiMessageEvents$MessageSent.is_incognito : z7;
        boolean z16 = (i4 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? claudeAiMessageEvents$MessageSent.is_yukon_gold : z8;
        String str9 = (i4 & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? claudeAiMessageEvents$MessageSent.text_formatting : str3;
        int i6 = (i4 & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? claudeAiMessageEvents$MessageSent.multiple_newline_count : i2;
        int i7 = (i4 & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? claudeAiMessageEvents$MessageSent.single_newline_count : i3;
        String str10 = str7;
        Integer num5 = (i4 & 16384) != 0 ? claudeAiMessageEvents$MessageSent.message_index : num;
        Integer num6 = (i4 & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0 ? claudeAiMessageEvents$MessageSent.document_attachment_count : num2;
        Integer num7 = (i4 & 65536) != 0 ? claudeAiMessageEvents$MessageSent.image_attachment_count : num3;
        Integer num8 = (i4 & 131072) != 0 ? claudeAiMessageEvents$MessageSent.tool_count : num4;
        String str11 = (i4 & 262144) != 0 ? claudeAiMessageEvents$MessageSent.thinking_mode : str4;
        ClaudeAiMessageEvents$ResearchMode claudeAiMessageEvents$ResearchMode3 = (i4 & 524288) != 0 ? claudeAiMessageEvents$MessageSent.research_mode : claudeAiMessageEvents$ResearchMode;
        if ((i4 & FreeTypeConstants.FT_LOAD_COLOR) != 0) {
            claudeAiMessageEvents$ResearchMode2 = claudeAiMessageEvents$ResearchMode3;
            str6 = claudeAiMessageEvents$MessageSent.project_id;
        } else {
            str6 = str5;
            claudeAiMessageEvents$ResearchMode2 = claudeAiMessageEvents$ResearchMode3;
        }
        return claudeAiMessageEvents$MessageSent.copy(str10, str8, z9, z10, z11, i5, z12, z13, z14, z15, z16, str9, i6, i7, num5, num6, num7, num8, str11, claudeAiMessageEvents$ResearchMode2, str6);
    }

    public static final /* synthetic */ void write$Self$analytics(ClaudeAiMessageEvents$MessageSent self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.conversation_uuid);
        if (output.E(serialDesc) || self.model != null) {
            output.B(serialDesc, 1, srg.a, self.model);
        }
        output.p(serialDesc, 2, self.has_attachments);
        output.p(serialDesc, 3, self.has_files);
        output.p(serialDesc, 4, self.has_sync_sources);
        output.l(5, self.message_length, serialDesc);
        output.p(serialDesc, 6, self.is_new_conversation);
        output.p(serialDesc, 7, self.has_personalized_style);
        output.p(serialDesc, 8, self.include_profile_preferences);
        output.p(serialDesc, 9, self.is_incognito);
        output.p(serialDesc, 10, self.is_yukon_gold);
        output.q(serialDesc, 11, self.text_formatting);
        output.l(12, self.multiple_newline_count, serialDesc);
        output.l(13, self.single_newline_count, serialDesc);
        if (output.E(serialDesc) || self.message_index != null) {
            output.B(serialDesc, 14, e79.a, self.message_index);
        }
        if (output.E(serialDesc) || self.document_attachment_count != null) {
            output.B(serialDesc, 15, e79.a, self.document_attachment_count);
        }
        if (output.E(serialDesc) || self.image_attachment_count != null) {
            output.B(serialDesc, 16, e79.a, self.image_attachment_count);
        }
        if (output.E(serialDesc) || self.tool_count != null) {
            output.B(serialDesc, 17, e79.a, self.tool_count);
        }
        if (output.E(serialDesc) || self.thinking_mode != null) {
            output.B(serialDesc, 18, srg.a, self.thinking_mode);
        }
        output.r(serialDesc, 19, (znf) kw9VarArr[19].getValue(), self.research_mode);
        if (!output.E(serialDesc) && self.project_id == null) {
            return;
        }
        output.B(serialDesc, 20, srg.a, self.project_id);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getConversation_uuid() {
        return this.conversation_uuid;
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
    public final String getText_formatting() {
        return this.text_formatting;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getMultiple_newline_count() {
        return this.multiple_newline_count;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getSingle_newline_count() {
        return this.single_newline_count;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getMessage_index() {
        return this.message_index;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Integer getDocument_attachment_count() {
        return this.document_attachment_count;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Integer getImage_attachment_count() {
        return this.image_attachment_count;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Integer getTool_count() {
        return this.tool_count;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getThinking_mode() {
        return this.thinking_mode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final ClaudeAiMessageEvents$ResearchMode getResearch_mode() {
        return this.research_mode;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getProject_id() {
        return this.project_id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getHas_attachments() {
        return this.has_attachments;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getHas_files() {
        return this.has_files;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getHas_sync_sources() {
        return this.has_sync_sources;
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
    public final boolean getHas_personalized_style() {
        return this.has_personalized_style;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getInclude_profile_preferences() {
        return this.include_profile_preferences;
    }

    public final ClaudeAiMessageEvents$MessageSent copy(String conversation_uuid, String model, boolean has_attachments, boolean has_files, boolean has_sync_sources, int message_length, boolean is_new_conversation, boolean has_personalized_style, boolean include_profile_preferences, boolean is_incognito, boolean is_yukon_gold, String text_formatting, int multiple_newline_count, int single_newline_count, Integer message_index, Integer document_attachment_count, Integer image_attachment_count, Integer tool_count, String thinking_mode, ClaudeAiMessageEvents$ResearchMode research_mode, String project_id) {
        conversation_uuid.getClass();
        text_formatting.getClass();
        research_mode.getClass();
        return new ClaudeAiMessageEvents$MessageSent(conversation_uuid, model, has_attachments, has_files, has_sync_sources, message_length, is_new_conversation, has_personalized_style, include_profile_preferences, is_incognito, is_yukon_gold, text_formatting, multiple_newline_count, single_newline_count, message_index, document_attachment_count, image_attachment_count, tool_count, thinking_mode, research_mode, project_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClaudeAiMessageEvents$MessageSent)) {
            return false;
        }
        ClaudeAiMessageEvents$MessageSent claudeAiMessageEvents$MessageSent = (ClaudeAiMessageEvents$MessageSent) other;
        return x44.r(this.conversation_uuid, claudeAiMessageEvents$MessageSent.conversation_uuid) && x44.r(this.model, claudeAiMessageEvents$MessageSent.model) && this.has_attachments == claudeAiMessageEvents$MessageSent.has_attachments && this.has_files == claudeAiMessageEvents$MessageSent.has_files && this.has_sync_sources == claudeAiMessageEvents$MessageSent.has_sync_sources && this.message_length == claudeAiMessageEvents$MessageSent.message_length && this.is_new_conversation == claudeAiMessageEvents$MessageSent.is_new_conversation && this.has_personalized_style == claudeAiMessageEvents$MessageSent.has_personalized_style && this.include_profile_preferences == claudeAiMessageEvents$MessageSent.include_profile_preferences && this.is_incognito == claudeAiMessageEvents$MessageSent.is_incognito && this.is_yukon_gold == claudeAiMessageEvents$MessageSent.is_yukon_gold && x44.r(this.text_formatting, claudeAiMessageEvents$MessageSent.text_formatting) && this.multiple_newline_count == claudeAiMessageEvents$MessageSent.multiple_newline_count && this.single_newline_count == claudeAiMessageEvents$MessageSent.single_newline_count && x44.r(this.message_index, claudeAiMessageEvents$MessageSent.message_index) && x44.r(this.document_attachment_count, claudeAiMessageEvents$MessageSent.document_attachment_count) && x44.r(this.image_attachment_count, claudeAiMessageEvents$MessageSent.image_attachment_count) && x44.r(this.tool_count, claudeAiMessageEvents$MessageSent.tool_count) && x44.r(this.thinking_mode, claudeAiMessageEvents$MessageSent.thinking_mode) && this.research_mode == claudeAiMessageEvents$MessageSent.research_mode && x44.r(this.project_id, claudeAiMessageEvents$MessageSent.project_id);
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    public final Integer getDocument_attachment_count() {
        return this.document_attachment_count;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.message.sent";
    }

    public final boolean getHas_attachments() {
        return this.has_attachments;
    }

    public final boolean getHas_files() {
        return this.has_files;
    }

    public final boolean getHas_personalized_style() {
        return this.has_personalized_style;
    }

    public final boolean getHas_sync_sources() {
        return this.has_sync_sources;
    }

    public final Integer getImage_attachment_count() {
        return this.image_attachment_count;
    }

    public final boolean getInclude_profile_preferences() {
        return this.include_profile_preferences;
    }

    public final Integer getMessage_index() {
        return this.message_index;
    }

    public final int getMessage_length() {
        return this.message_length;
    }

    public final String getModel() {
        return this.model;
    }

    public final int getMultiple_newline_count() {
        return this.multiple_newline_count;
    }

    public final String getProject_id() {
        return this.project_id;
    }

    public final ClaudeAiMessageEvents$ResearchMode getResearch_mode() {
        return this.research_mode;
    }

    public final int getSingle_newline_count() {
        return this.single_newline_count;
    }

    public final String getText_formatting() {
        return this.text_formatting;
    }

    public final String getThinking_mode() {
        return this.thinking_mode;
    }

    public final Integer getTool_count() {
        return this.tool_count;
    }

    public int hashCode() {
        int iHashCode = this.conversation_uuid.hashCode() * 31;
        String str = this.model;
        int iC = vb7.c(this.single_newline_count, vb7.c(this.multiple_newline_count, kgh.l(fsh.p(fsh.p(fsh.p(fsh.p(fsh.p(vb7.c(this.message_length, fsh.p(fsh.p(fsh.p((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.has_attachments), 31, this.has_files), 31, this.has_sync_sources), 31), 31, this.is_new_conversation), 31, this.has_personalized_style), 31, this.include_profile_preferences), 31, this.is_incognito), 31, this.is_yukon_gold), 31, this.text_formatting), 31), 31);
        Integer num = this.message_index;
        int iHashCode2 = (iC + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.document_attachment_count;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.image_attachment_count;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.tool_count;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.thinking_mode;
        int iHashCode6 = (this.research_mode.hashCode() + ((iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.project_id;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean is_incognito() {
        return this.is_incognito;
    }

    public final boolean is_new_conversation() {
        return this.is_new_conversation;
    }

    public final boolean is_yukon_gold() {
        return this.is_yukon_gold;
    }

    public String toString() {
        String str = this.conversation_uuid;
        String str2 = this.model;
        boolean z = this.has_attachments;
        boolean z2 = this.has_files;
        boolean z3 = this.has_sync_sources;
        int i = this.message_length;
        boolean z4 = this.is_new_conversation;
        boolean z5 = this.has_personalized_style;
        boolean z6 = this.include_profile_preferences;
        boolean z7 = this.is_incognito;
        boolean z8 = this.is_yukon_gold;
        String str3 = this.text_formatting;
        int i2 = this.multiple_newline_count;
        int i3 = this.single_newline_count;
        Integer num = this.message_index;
        Integer num2 = this.document_attachment_count;
        Integer num3 = this.image_attachment_count;
        Integer num4 = this.tool_count;
        String str4 = this.thinking_mode;
        ClaudeAiMessageEvents$ResearchMode claudeAiMessageEvents$ResearchMode = this.research_mode;
        String str5 = this.project_id;
        StringBuilder sbR = kgh.r("MessageSent(conversation_uuid=", str, ", model=", str2, ", has_attachments=");
        ij0.A(sbR, z, ", has_files=", z2, ", has_sync_sources=");
        sbR.append(z3);
        sbR.append(", message_length=");
        sbR.append(i);
        sbR.append(", is_new_conversation=");
        ij0.A(sbR, z4, ", has_personalized_style=", z5, ", include_profile_preferences=");
        ij0.A(sbR, z6, ", is_incognito=", z7, ", is_yukon_gold=");
        sbR.append(z8);
        sbR.append(", text_formatting=");
        sbR.append(str3);
        sbR.append(", multiple_newline_count=");
        qy1.k(i2, i3, ", single_newline_count=", ", message_index=", sbR);
        sbR.append(num);
        sbR.append(", document_attachment_count=");
        sbR.append(num2);
        sbR.append(", image_attachment_count=");
        sbR.append(num3);
        sbR.append(", tool_count=");
        sbR.append(num4);
        sbR.append(", thinking_mode=");
        sbR.append(str4);
        sbR.append(", research_mode=");
        sbR.append(claudeAiMessageEvents$ResearchMode);
        sbR.append(", project_id=");
        return ij0.m(sbR, str5, ")");
    }

    public ClaudeAiMessageEvents$MessageSent(String str, String str2, boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str3, int i2, int i3, Integer num, Integer num2, Integer num3, Integer num4, String str4, ClaudeAiMessageEvents$ResearchMode claudeAiMessageEvents$ResearchMode, String str5) {
        str.getClass();
        str3.getClass();
        claudeAiMessageEvents$ResearchMode.getClass();
        this.conversation_uuid = str;
        this.model = str2;
        this.has_attachments = z;
        this.has_files = z2;
        this.has_sync_sources = z3;
        this.message_length = i;
        this.is_new_conversation = z4;
        this.has_personalized_style = z5;
        this.include_profile_preferences = z6;
        this.is_incognito = z7;
        this.is_yukon_gold = z8;
        this.text_formatting = str3;
        this.multiple_newline_count = i2;
        this.single_newline_count = i3;
        this.message_index = num;
        this.document_attachment_count = num2;
        this.image_attachment_count = num3;
        this.tool_count = num4;
        this.thinking_mode = str4;
        this.research_mode = claudeAiMessageEvents$ResearchMode;
        this.project_id = str5;
    }

    public /* synthetic */ ClaudeAiMessageEvents$MessageSent(String str, String str2, boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str3, int i2, int i3, Integer num, Integer num2, Integer num3, Integer num4, String str4, ClaudeAiMessageEvents$ResearchMode claudeAiMessageEvents$ResearchMode, String str5, int i4, mq5 mq5Var) {
        this(str, (i4 & 2) != 0 ? null : str2, z, z2, z3, i, z4, z5, z6, z7, z8, str3, i2, i3, (i4 & 16384) != 0 ? null : num, (32768 & i4) != 0 ? null : num2, (65536 & i4) != 0 ? null : num3, (131072 & i4) != 0 ? null : num4, (262144 & i4) != 0 ? null : str4, claudeAiMessageEvents$ResearchMode, (i4 & FreeTypeConstants.FT_LOAD_COLOR) != 0 ? null : str5);
    }
}
