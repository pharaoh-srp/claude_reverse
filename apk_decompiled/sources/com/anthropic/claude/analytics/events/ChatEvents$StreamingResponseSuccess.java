package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.e79;
import defpackage.fsh;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nr2;
import defpackage.onf;
import defpackage.or2;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.xka;
import defpackage.xq2;
import defpackage.yb5;
import defpackage.znf;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 c2\u00020\u0001:\u0002deBÃ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aBÉ\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0019\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010 J\u0012\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b-\u0010,J\u0012\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b.\u0010,J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010 J\u0012\u00100\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b2\u00101J\u0012\u00103\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b5\u00101J\u0012\u00106\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b6\u00104J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u0010 JÚ\u0001\u00109\u001a\u0002082\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b;\u0010 J\u0010\u0010<\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b<\u0010(J\u001a\u0010?\u001a\u00020\b2\b\u0010>\u001a\u0004\u0018\u00010=HÖ\u0003¢\u0006\u0004\b?\u0010@J'\u0010I\u001a\u00020F2\u0006\u0010A\u001a\u0002082\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020DH\u0001¢\u0006\u0004\bG\u0010HR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010J\u001a\u0004\bK\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010J\u001a\u0004\bL\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010J\u001a\u0004\bM\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010N\u001a\u0004\bO\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010P\u001a\u0004\bQ\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010R\u001a\u0004\bS\u0010(R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010R\u001a\u0004\bT\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010J\u001a\u0004\bU\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010V\u001a\u0004\bW\u0010,R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010V\u001a\u0004\bX\u0010,R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010V\u001a\u0004\bY\u0010,R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010J\u001a\u0004\bZ\u0010 R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010[\u001a\u0004\b\\\u00101R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010[\u001a\u0004\b]\u00101R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010^\u001a\u0004\b\u0015\u00104R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0016\u0010[\u001a\u0004\b_\u00101R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010^\u001a\u0004\b\u0017\u00104R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010J\u001a\u0004\b`\u0010 R\u0014\u0010b\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010 ¨\u0006f"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$StreamingResponseSuccess", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "message_id", "Lcom/anthropic/claude/analytics/events/ChatEvents$StreamingEndpointType;", "endpoint_type", "", "was_in_background", "", "content_block_count", "total_content_length", "stop_reason", "document_attachment_count", "image_attachment_count", "mm_document_count", "model", "", "time_to_first_token_ms", "total_time_ms", "is_free_tier", "time_in_background_ms", "is_temporary_chat", "project_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$StreamingEndpointType;ZIILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$StreamingEndpointType;ZIILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/anthropic/claude/analytics/events/ChatEvents$StreamingEndpointType;", "component5", "()Z", "component6", "()I", "component7", "component8", "component9", "()Ljava/lang/Integer;", "component10", "component11", "component12", "component13", "()Ljava/lang/Long;", "component14", "component15", "()Ljava/lang/Boolean;", "component16", "component17", "component18", "Lcom/anthropic/claude/analytics/events/ChatEvents$StreamingResponseSuccess;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$StreamingEndpointType;ZIILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/ChatEvents$StreamingResponseSuccess;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatEvents$StreamingResponseSuccess;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "getMessage_id", "Lcom/anthropic/claude/analytics/events/ChatEvents$StreamingEndpointType;", "getEndpoint_type", "Z", "getWas_in_background", "I", "getContent_block_count", "getTotal_content_length", "getStop_reason", "Ljava/lang/Integer;", "getDocument_attachment_count", "getImage_attachment_count", "getMm_document_count", "getModel", "Ljava/lang/Long;", "getTime_to_first_token_ms", "getTotal_time_ms", "Ljava/lang/Boolean;", "getTime_in_background_ms", "getProject_id", "getEventName", "eventName", "Companion", "nr2", "or2", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatEvents$StreamingResponseSuccess implements AnalyticsEvent {
    public static final int $stable = 0;
    private final int content_block_count;
    private final String conversation_uuid;
    private final Integer document_attachment_count;
    private final ChatEvents$StreamingEndpointType endpoint_type;
    private final Integer image_attachment_count;
    private final Boolean is_free_tier;
    private final Boolean is_temporary_chat;
    private final String message_id;
    private final Integer mm_document_count;
    private final String model;
    private final String organization_uuid;
    private final String project_id;
    private final String stop_reason;
    private final Long time_in_background_ms;
    private final Long time_to_first_token_ms;
    private final int total_content_length;
    private final Long total_time_ms;
    private final boolean was_in_background;
    public static final or2 Companion = new or2();
    private static final kw9[] $childSerializers = {null, null, null, yb5.w(w1a.F, new xq2(12)), null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    public /* synthetic */ ChatEvents$StreamingResponseSuccess(int i, String str, String str2, String str3, ChatEvents$StreamingEndpointType chatEvents$StreamingEndpointType, boolean z, int i2, int i3, String str4, Integer num, Integer num2, Integer num3, String str5, Long l, Long l2, Boolean bool, Long l3, Boolean bool2, String str6, vnf vnfVar) {
        if (127 != (i & 127)) {
            gvj.f(i, 127, nr2.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.message_id = str3;
        this.endpoint_type = chatEvents$StreamingEndpointType;
        this.was_in_background = z;
        this.content_block_count = i2;
        this.total_content_length = i3;
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.stop_reason = null;
        } else {
            this.stop_reason = str4;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.document_attachment_count = null;
        } else {
            this.document_attachment_count = num;
        }
        if ((i & 512) == 0) {
            this.image_attachment_count = null;
        } else {
            this.image_attachment_count = num2;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
            this.mm_document_count = null;
        } else {
            this.mm_document_count = num3;
        }
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 0) {
            this.model = null;
        } else {
            this.model = str5;
        }
        if ((i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0) {
            this.time_to_first_token_ms = null;
        } else {
            this.time_to_first_token_ms = l;
        }
        if ((i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) == 0) {
            this.total_time_ms = null;
        } else {
            this.total_time_ms = l2;
        }
        if ((i & 16384) == 0) {
            this.is_free_tier = null;
        } else {
            this.is_free_tier = bool;
        }
        if ((32768 & i) == 0) {
            this.time_in_background_ms = null;
        } else {
            this.time_in_background_ms = l3;
        }
        if ((65536 & i) == 0) {
            this.is_temporary_chat = null;
        } else {
            this.is_temporary_chat = bool2;
        }
        if ((i & 131072) == 0) {
            this.project_id = null;
        } else {
            this.project_id = str6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ChatEvents$StreamingEndpointType.Companion.serializer();
    }

    public static /* synthetic */ ChatEvents$StreamingResponseSuccess copy$default(ChatEvents$StreamingResponseSuccess chatEvents$StreamingResponseSuccess, String str, String str2, String str3, ChatEvents$StreamingEndpointType chatEvents$StreamingEndpointType, boolean z, int i, int i2, String str4, Integer num, Integer num2, Integer num3, String str5, Long l, Long l2, Boolean bool, Long l3, Boolean bool2, String str6, int i3, Object obj) {
        String str7;
        Boolean bool3;
        String str8 = (i3 & 1) != 0 ? chatEvents$StreamingResponseSuccess.organization_uuid : str;
        String str9 = (i3 & 2) != 0 ? chatEvents$StreamingResponseSuccess.conversation_uuid : str2;
        String str10 = (i3 & 4) != 0 ? chatEvents$StreamingResponseSuccess.message_id : str3;
        ChatEvents$StreamingEndpointType chatEvents$StreamingEndpointType2 = (i3 & 8) != 0 ? chatEvents$StreamingResponseSuccess.endpoint_type : chatEvents$StreamingEndpointType;
        boolean z2 = (i3 & 16) != 0 ? chatEvents$StreamingResponseSuccess.was_in_background : z;
        int i4 = (i3 & 32) != 0 ? chatEvents$StreamingResponseSuccess.content_block_count : i;
        int i5 = (i3 & 64) != 0 ? chatEvents$StreamingResponseSuccess.total_content_length : i2;
        String str11 = (i3 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? chatEvents$StreamingResponseSuccess.stop_reason : str4;
        Integer num4 = (i3 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? chatEvents$StreamingResponseSuccess.document_attachment_count : num;
        Integer num5 = (i3 & 512) != 0 ? chatEvents$StreamingResponseSuccess.image_attachment_count : num2;
        Integer num6 = (i3 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? chatEvents$StreamingResponseSuccess.mm_document_count : num3;
        String str12 = (i3 & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? chatEvents$StreamingResponseSuccess.model : str5;
        Long l4 = (i3 & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? chatEvents$StreamingResponseSuccess.time_to_first_token_ms : l;
        Long l5 = (i3 & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? chatEvents$StreamingResponseSuccess.total_time_ms : l2;
        String str13 = str8;
        Boolean bool4 = (i3 & 16384) != 0 ? chatEvents$StreamingResponseSuccess.is_free_tier : bool;
        Long l6 = (i3 & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0 ? chatEvents$StreamingResponseSuccess.time_in_background_ms : l3;
        Boolean bool5 = (i3 & 65536) != 0 ? chatEvents$StreamingResponseSuccess.is_temporary_chat : bool2;
        if ((i3 & 131072) != 0) {
            bool3 = bool5;
            str7 = chatEvents$StreamingResponseSuccess.project_id;
        } else {
            str7 = str6;
            bool3 = bool5;
        }
        return chatEvents$StreamingResponseSuccess.copy(str13, str9, str10, chatEvents$StreamingEndpointType2, z2, i4, i5, str11, num4, num5, num6, str12, l4, l5, bool4, l6, bool3, str7);
    }

    public static final /* synthetic */ void write$Self$analytics(ChatEvents$StreamingResponseSuccess self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.q(serialDesc, 2, self.message_id);
        output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.endpoint_type);
        output.p(serialDesc, 4, self.was_in_background);
        output.l(5, self.content_block_count, serialDesc);
        output.l(6, self.total_content_length, serialDesc);
        if (output.E(serialDesc) || self.stop_reason != null) {
            output.B(serialDesc, 7, srg.a, self.stop_reason);
        }
        if (output.E(serialDesc) || self.document_attachment_count != null) {
            output.B(serialDesc, 8, e79.a, self.document_attachment_count);
        }
        if (output.E(serialDesc) || self.image_attachment_count != null) {
            output.B(serialDesc, 9, e79.a, self.image_attachment_count);
        }
        if (output.E(serialDesc) || self.mm_document_count != null) {
            output.B(serialDesc, 10, e79.a, self.mm_document_count);
        }
        if (output.E(serialDesc) || self.model != null) {
            output.B(serialDesc, 11, srg.a, self.model);
        }
        if (output.E(serialDesc) || self.time_to_first_token_ms != null) {
            output.B(serialDesc, 12, xka.a, self.time_to_first_token_ms);
        }
        if (output.E(serialDesc) || self.total_time_ms != null) {
            output.B(serialDesc, 13, xka.a, self.total_time_ms);
        }
        if (output.E(serialDesc) || self.is_free_tier != null) {
            output.B(serialDesc, 14, zt1.a, self.is_free_tier);
        }
        if (output.E(serialDesc) || self.time_in_background_ms != null) {
            output.B(serialDesc, 15, xka.a, self.time_in_background_ms);
        }
        if (output.E(serialDesc) || self.is_temporary_chat != null) {
            output.B(serialDesc, 16, zt1.a, self.is_temporary_chat);
        }
        if (!output.E(serialDesc) && self.project_id == null) {
            return;
        }
        output.B(serialDesc, 17, srg.a, self.project_id);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getImage_attachment_count() {
        return this.image_attachment_count;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getMm_document_count() {
        return this.mm_document_count;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Long getTime_to_first_token_ms() {
        return this.time_to_first_token_ms;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Long getTotal_time_ms() {
        return this.total_time_ms;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Boolean getIs_free_tier() {
        return this.is_free_tier;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Long getTime_in_background_ms() {
        return this.time_in_background_ms;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Boolean getIs_temporary_chat() {
        return this.is_temporary_chat;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getProject_id() {
        return this.project_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage_id() {
        return this.message_id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ChatEvents$StreamingEndpointType getEndpoint_type() {
        return this.endpoint_type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getWas_in_background() {
        return this.was_in_background;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getContent_block_count() {
        return this.content_block_count;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getTotal_content_length() {
        return this.total_content_length;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStop_reason() {
        return this.stop_reason;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getDocument_attachment_count() {
        return this.document_attachment_count;
    }

    public final ChatEvents$StreamingResponseSuccess copy(String organization_uuid, String conversation_uuid, String message_id, ChatEvents$StreamingEndpointType endpoint_type, boolean was_in_background, int content_block_count, int total_content_length, String stop_reason, Integer document_attachment_count, Integer image_attachment_count, Integer mm_document_count, String model, Long time_to_first_token_ms, Long total_time_ms, Boolean is_free_tier, Long time_in_background_ms, Boolean is_temporary_chat, String project_id) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        message_id.getClass();
        endpoint_type.getClass();
        return new ChatEvents$StreamingResponseSuccess(organization_uuid, conversation_uuid, message_id, endpoint_type, was_in_background, content_block_count, total_content_length, stop_reason, document_attachment_count, image_attachment_count, mm_document_count, model, time_to_first_token_ms, total_time_ms, is_free_tier, time_in_background_ms, is_temporary_chat, project_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatEvents$StreamingResponseSuccess)) {
            return false;
        }
        ChatEvents$StreamingResponseSuccess chatEvents$StreamingResponseSuccess = (ChatEvents$StreamingResponseSuccess) other;
        return x44.r(this.organization_uuid, chatEvents$StreamingResponseSuccess.organization_uuid) && x44.r(this.conversation_uuid, chatEvents$StreamingResponseSuccess.conversation_uuid) && x44.r(this.message_id, chatEvents$StreamingResponseSuccess.message_id) && this.endpoint_type == chatEvents$StreamingResponseSuccess.endpoint_type && this.was_in_background == chatEvents$StreamingResponseSuccess.was_in_background && this.content_block_count == chatEvents$StreamingResponseSuccess.content_block_count && this.total_content_length == chatEvents$StreamingResponseSuccess.total_content_length && x44.r(this.stop_reason, chatEvents$StreamingResponseSuccess.stop_reason) && x44.r(this.document_attachment_count, chatEvents$StreamingResponseSuccess.document_attachment_count) && x44.r(this.image_attachment_count, chatEvents$StreamingResponseSuccess.image_attachment_count) && x44.r(this.mm_document_count, chatEvents$StreamingResponseSuccess.mm_document_count) && x44.r(this.model, chatEvents$StreamingResponseSuccess.model) && x44.r(this.time_to_first_token_ms, chatEvents$StreamingResponseSuccess.time_to_first_token_ms) && x44.r(this.total_time_ms, chatEvents$StreamingResponseSuccess.total_time_ms) && x44.r(this.is_free_tier, chatEvents$StreamingResponseSuccess.is_free_tier) && x44.r(this.time_in_background_ms, chatEvents$StreamingResponseSuccess.time_in_background_ms) && x44.r(this.is_temporary_chat, chatEvents$StreamingResponseSuccess.is_temporary_chat) && x44.r(this.project_id, chatEvents$StreamingResponseSuccess.project_id);
    }

    public final int getContent_block_count() {
        return this.content_block_count;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    public final Integer getDocument_attachment_count() {
        return this.document_attachment_count;
    }

    public final ChatEvents$StreamingEndpointType getEndpoint_type() {
        return this.endpoint_type;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_streaming_response_success";
    }

    public final Integer getImage_attachment_count() {
        return this.image_attachment_count;
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final Integer getMm_document_count() {
        return this.mm_document_count;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getProject_id() {
        return this.project_id;
    }

    public final String getStop_reason() {
        return this.stop_reason;
    }

    public final Long getTime_in_background_ms() {
        return this.time_in_background_ms;
    }

    public final Long getTime_to_first_token_ms() {
        return this.time_to_first_token_ms;
    }

    public final int getTotal_content_length() {
        return this.total_content_length;
    }

    public final Long getTotal_time_ms() {
        return this.total_time_ms;
    }

    public final boolean getWas_in_background() {
        return this.was_in_background;
    }

    public int hashCode() {
        int iC = vb7.c(this.total_content_length, vb7.c(this.content_block_count, fsh.p((this.endpoint_type.hashCode() + kgh.l(kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid), 31, this.message_id)) * 31, 31, this.was_in_background), 31), 31);
        String str = this.stop_reason;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.document_attachment_count;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.image_attachment_count;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.mm_document_count;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.model;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.time_to_first_token_ms;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.total_time_ms;
        int iHashCode7 = (iHashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.is_free_tier;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l3 = this.time_in_background_ms;
        int iHashCode9 = (iHashCode8 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Boolean bool2 = this.is_temporary_chat;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.project_id;
        return iHashCode10 + (str3 != null ? str3.hashCode() : 0);
    }

    public final Boolean is_free_tier() {
        return this.is_free_tier;
    }

    public final Boolean is_temporary_chat() {
        return this.is_temporary_chat;
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        String str3 = this.message_id;
        ChatEvents$StreamingEndpointType chatEvents$StreamingEndpointType = this.endpoint_type;
        boolean z = this.was_in_background;
        int i = this.content_block_count;
        int i2 = this.total_content_length;
        String str4 = this.stop_reason;
        Integer num = this.document_attachment_count;
        Integer num2 = this.image_attachment_count;
        Integer num3 = this.mm_document_count;
        String str5 = this.model;
        Long l = this.time_to_first_token_ms;
        Long l2 = this.total_time_ms;
        Boolean bool = this.is_free_tier;
        Long l3 = this.time_in_background_ms;
        Boolean bool2 = this.is_temporary_chat;
        String str6 = this.project_id;
        StringBuilder sbR = kgh.r("StreamingResponseSuccess(organization_uuid=", str, ", conversation_uuid=", str2, ", message_id=");
        sbR.append(str3);
        sbR.append(", endpoint_type=");
        sbR.append(chatEvents$StreamingEndpointType);
        sbR.append(", was_in_background=");
        sbR.append(z);
        sbR.append(", content_block_count=");
        sbR.append(i);
        sbR.append(", total_content_length=");
        sbR.append(i2);
        sbR.append(", stop_reason=");
        sbR.append(str4);
        sbR.append(", document_attachment_count=");
        sbR.append(num);
        sbR.append(", image_attachment_count=");
        sbR.append(num2);
        sbR.append(", mm_document_count=");
        sbR.append(num3);
        sbR.append(", model=");
        sbR.append(str5);
        sbR.append(", time_to_first_token_ms=");
        sbR.append(l);
        sbR.append(", total_time_ms=");
        sbR.append(l2);
        sbR.append(", is_free_tier=");
        sbR.append(bool);
        sbR.append(", time_in_background_ms=");
        sbR.append(l3);
        sbR.append(", is_temporary_chat=");
        sbR.append(bool2);
        sbR.append(", project_id=");
        sbR.append(str6);
        sbR.append(")");
        return sbR.toString();
    }

    public ChatEvents$StreamingResponseSuccess(String str, String str2, String str3, ChatEvents$StreamingEndpointType chatEvents$StreamingEndpointType, boolean z, int i, int i2, String str4, Integer num, Integer num2, Integer num3, String str5, Long l, Long l2, Boolean bool, Long l3, Boolean bool2, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        chatEvents$StreamingEndpointType.getClass();
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.message_id = str3;
        this.endpoint_type = chatEvents$StreamingEndpointType;
        this.was_in_background = z;
        this.content_block_count = i;
        this.total_content_length = i2;
        this.stop_reason = str4;
        this.document_attachment_count = num;
        this.image_attachment_count = num2;
        this.mm_document_count = num3;
        this.model = str5;
        this.time_to_first_token_ms = l;
        this.total_time_ms = l2;
        this.is_free_tier = bool;
        this.time_in_background_ms = l3;
        this.is_temporary_chat = bool2;
        this.project_id = str6;
    }

    public /* synthetic */ ChatEvents$StreamingResponseSuccess(String str, String str2, String str3, ChatEvents$StreamingEndpointType chatEvents$StreamingEndpointType, boolean z, int i, int i2, String str4, Integer num, Integer num2, Integer num3, String str5, Long l, Long l2, Boolean bool, Long l3, Boolean bool2, String str6, int i3, mq5 mq5Var) {
        this(str, str2, str3, chatEvents$StreamingEndpointType, z, i, i2, (i3 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : str4, (i3 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : num, (i3 & 512) != 0 ? null : num2, (i3 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? null : num3, (i3 & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? null : str5, (i3 & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? null : l, (i3 & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? null : l2, (i3 & 16384) != 0 ? null : bool, (32768 & i3) != 0 ? null : l3, (65536 & i3) != 0 ? null : bool2, (i3 & 131072) != 0 ? null : str6);
    }
}
