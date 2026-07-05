package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.e79;
import defpackage.ebh;
import defpackage.f7a;
import defpackage.fsh;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.lr2;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.mr2;
import defpackage.onf;
import defpackage.qy1;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.xq2;
import defpackage.yb5;
import defpackage.znf;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\b\u0087\b\u0018\u0000 r2\u00020\u0001:\u0002stBÿ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u001a\u0012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u001a\u0012\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u001a¢\u0006\u0004\b\u001e\u0010\u001fB\u0091\u0002\b\u0010\u0012\u0006\u0010 \u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u001a\u0012\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u001a\u0012\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u001a\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010%J\u0010\u0010(\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b.\u0010+J\u0012\u0010/\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b1\u0010+J\u0010\u00102\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b2\u0010+J\u0010\u00103\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b3\u0010+J\u0010\u00104\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b4\u0010+J\u0010\u00105\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b5\u0010+J\u0010\u00106\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b6\u0010+J\u0010\u00107\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b7\u0010+J\u0012\u00108\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b8\u00100J\u0012\u00109\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b9\u00100J\u0012\u0010:\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b:\u00100J\u0012\u0010;\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b;\u00100J\u0012\u0010<\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b<\u00100J\u001c\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u001aHÆ\u0003¢\u0006\u0004\b=\u0010>J\u001c\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u001aHÆ\u0003¢\u0006\u0004\b?\u0010>J\u001c\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u001aHÆ\u0003¢\u0006\u0004\b@\u0010>J¨\u0002\u0010B\u001a\u00020A2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u001a2\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u001a2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u001aHÆ\u0001¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bD\u0010%J\u0010\u0010E\u001a\u00020\bHÖ\u0001¢\u0006\u0004\bE\u0010+J\u001a\u0010H\u001a\u00020\n2\b\u0010G\u001a\u0004\u0018\u00010FHÖ\u0003¢\u0006\u0004\bH\u0010IJ'\u0010R\u001a\u00020O2\u0006\u0010J\u001a\u00020A2\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020MH\u0001¢\u0006\u0004\bP\u0010QR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010S\u001a\u0004\bT\u0010%R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010S\u001a\u0004\bU\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010S\u001a\u0004\bV\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010W\u001a\u0004\bX\u0010)R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010Y\u001a\u0004\bZ\u0010+R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010[\u001a\u0004\b\\\u0010-R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010Y\u001a\u0004\b]\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\r\u0010^\u001a\u0004\b_\u00100R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010Y\u001a\u0004\b`\u0010+R\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010Y\u001a\u0004\ba\u0010+R\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010Y\u001a\u0004\bb\u0010+R\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010Y\u001a\u0004\bc\u0010+R\u0017\u0010\u0012\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010Y\u001a\u0004\bd\u0010+R\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010Y\u001a\u0004\be\u0010+R\u0017\u0010\u0014\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010Y\u001a\u0004\bf\u0010+R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010^\u001a\u0004\bg\u00100R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010^\u001a\u0004\bh\u00100R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010^\u001a\u0004\bi\u00100R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010^\u001a\u0004\bj\u00100R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010^\u001a\u0004\bk\u00100R#\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010l\u001a\u0004\bm\u0010>R#\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u001a8\u0006¢\u0006\f\n\u0004\b\u001c\u0010l\u001a\u0004\bn\u0010>R#\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u001a8\u0006¢\u0006\f\n\u0004\b\u001d\u0010l\u001a\u0004\bo\u0010>R\u0014\u0010q\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010%¨\u0006u"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$StreamingMessageJank", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "conversation_uuid", "message_uuid", "model", "Lcom/anthropic/claude/analytics/events/ChatEvents$StreamingMessageCompletionStatus;", "completion_status", "", "total_time_ms", "", "was_in_background", "time_in_background_ms", "conversation_message_count", "total_frames", "total_ui_ms", "max_ui_ms", "over_16ms", "over_25ms", "over_700ms", "overrun_frames", "display_refresh_hz", "total_hitch_time_ms", "hitch_minor", "hitch_major", "hitch_severe", "", "block_count_by_kind", "block_char_length_by_kind", "markdown_node_count_by_kind", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$StreamingMessageCompletionStatus;IZILjava/lang/Integer;IIIIIIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$StreamingMessageCompletionStatus;IZILjava/lang/Integer;IIIIIIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/anthropic/claude/analytics/events/ChatEvents$StreamingMessageCompletionStatus;", "component5", "()I", "component6", "()Z", "component7", "component8", "()Ljava/lang/Integer;", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "()Ljava/util/Map;", "component22", "component23", "Lcom/anthropic/claude/analytics/events/ChatEvents$StreamingMessageJank;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$StreamingMessageCompletionStatus;IZILjava/lang/Integer;IIIIIIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/anthropic/claude/analytics/events/ChatEvents$StreamingMessageJank;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatEvents$StreamingMessageJank;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getConversation_uuid", "getMessage_uuid", "getModel", "Lcom/anthropic/claude/analytics/events/ChatEvents$StreamingMessageCompletionStatus;", "getCompletion_status", "I", "getTotal_time_ms", "Z", "getWas_in_background", "getTime_in_background_ms", "Ljava/lang/Integer;", "getConversation_message_count", "getTotal_frames", "getTotal_ui_ms", "getMax_ui_ms", "getOver_16ms", "getOver_25ms", "getOver_700ms", "getOverrun_frames", "getDisplay_refresh_hz", "getTotal_hitch_time_ms", "getHitch_minor", "getHitch_major", "getHitch_severe", "Ljava/util/Map;", "getBlock_count_by_kind", "getBlock_char_length_by_kind", "getMarkdown_node_count_by_kind", "getEventName", "eventName", "Companion", "lr2", "mr2", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatEvents$StreamingMessageJank implements AnalyticsEvent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final mr2 Companion = new mr2();
    private final Map<String, Integer> block_char_length_by_kind;
    private final Map<String, Integer> block_count_by_kind;
    private final ChatEvents$StreamingMessageCompletionStatus completion_status;
    private final Integer conversation_message_count;
    private final String conversation_uuid;
    private final Integer display_refresh_hz;
    private final Integer hitch_major;
    private final Integer hitch_minor;
    private final Integer hitch_severe;
    private final Map<String, Integer> markdown_node_count_by_kind;
    private final int max_ui_ms;
    private final String message_uuid;
    private final String model;
    private final int over_16ms;
    private final int over_25ms;
    private final int over_700ms;
    private final int overrun_frames;
    private final int time_in_background_ms;
    private final int total_frames;
    private final Integer total_hitch_time_ms;
    private final int total_time_ms;
    private final int total_ui_ms;
    private final boolean was_in_background;

    static {
        xq2 xq2Var = new xq2(8);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, yb5.w(w1aVar, xq2Var), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, yb5.w(w1aVar, new xq2(9)), yb5.w(w1aVar, new xq2(10)), yb5.w(w1aVar, new xq2(11))};
    }

    public /* synthetic */ ChatEvents$StreamingMessageJank(int i, String str, String str2, String str3, ChatEvents$StreamingMessageCompletionStatus chatEvents$StreamingMessageCompletionStatus, int i2, boolean z, int i3, Integer num, int i4, int i5, int i6, int i7, int i8, int i9, int i10, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Map map, Map map2, Map map3, vnf vnfVar) {
        if (7372667 != (i & 7372667)) {
            gvj.f(i, 7372667, lr2.a.getDescriptor());
            throw null;
        }
        this.conversation_uuid = str;
        this.message_uuid = str2;
        if ((i & 4) == 0) {
            this.model = null;
        } else {
            this.model = str3;
        }
        this.completion_status = chatEvents$StreamingMessageCompletionStatus;
        this.total_time_ms = i2;
        this.was_in_background = z;
        this.time_in_background_ms = i3;
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.conversation_message_count = null;
        } else {
            this.conversation_message_count = num;
        }
        this.total_frames = i4;
        this.total_ui_ms = i5;
        this.max_ui_ms = i6;
        this.over_16ms = i7;
        this.over_25ms = i8;
        this.over_700ms = i9;
        this.overrun_frames = i10;
        if ((32768 & i) == 0) {
            this.display_refresh_hz = null;
        } else {
            this.display_refresh_hz = num2;
        }
        if ((65536 & i) == 0) {
            this.total_hitch_time_ms = null;
        } else {
            this.total_hitch_time_ms = num3;
        }
        if ((131072 & i) == 0) {
            this.hitch_minor = null;
        } else {
            this.hitch_minor = num4;
        }
        if ((262144 & i) == 0) {
            this.hitch_major = null;
        } else {
            this.hitch_major = num5;
        }
        if ((i & 524288) == 0) {
            this.hitch_severe = null;
        } else {
            this.hitch_severe = num6;
        }
        this.block_count_by_kind = map;
        this.block_char_length_by_kind = map2;
        this.markdown_node_count_by_kind = map3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ChatEvents$StreamingMessageCompletionStatus.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new f7a(srg.a, e79.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new f7a(srg.a, e79.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new f7a(srg.a, e79.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatEvents$StreamingMessageJank copy$default(ChatEvents$StreamingMessageJank chatEvents$StreamingMessageJank, String str, String str2, String str3, ChatEvents$StreamingMessageCompletionStatus chatEvents$StreamingMessageCompletionStatus, int i, boolean z, int i2, Integer num, int i3, int i4, int i5, int i6, int i7, int i8, int i9, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Map map, Map map2, Map map3, int i10, Object obj) {
        Map map4;
        Map map5;
        String str4 = (i10 & 1) != 0 ? chatEvents$StreamingMessageJank.conversation_uuid : str;
        String str5 = (i10 & 2) != 0 ? chatEvents$StreamingMessageJank.message_uuid : str2;
        String str6 = (i10 & 4) != 0 ? chatEvents$StreamingMessageJank.model : str3;
        ChatEvents$StreamingMessageCompletionStatus chatEvents$StreamingMessageCompletionStatus2 = (i10 & 8) != 0 ? chatEvents$StreamingMessageJank.completion_status : chatEvents$StreamingMessageCompletionStatus;
        int i11 = (i10 & 16) != 0 ? chatEvents$StreamingMessageJank.total_time_ms : i;
        boolean z2 = (i10 & 32) != 0 ? chatEvents$StreamingMessageJank.was_in_background : z;
        int i12 = (i10 & 64) != 0 ? chatEvents$StreamingMessageJank.time_in_background_ms : i2;
        Integer num7 = (i10 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? chatEvents$StreamingMessageJank.conversation_message_count : num;
        int i13 = (i10 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? chatEvents$StreamingMessageJank.total_frames : i3;
        int i14 = (i10 & 512) != 0 ? chatEvents$StreamingMessageJank.total_ui_ms : i4;
        int i15 = (i10 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? chatEvents$StreamingMessageJank.max_ui_ms : i5;
        int i16 = (i10 & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? chatEvents$StreamingMessageJank.over_16ms : i6;
        int i17 = (i10 & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? chatEvents$StreamingMessageJank.over_25ms : i7;
        int i18 = (i10 & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? chatEvents$StreamingMessageJank.over_700ms : i8;
        String str7 = str4;
        int i19 = (i10 & 16384) != 0 ? chatEvents$StreamingMessageJank.overrun_frames : i9;
        Integer num8 = (i10 & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0 ? chatEvents$StreamingMessageJank.display_refresh_hz : num2;
        Integer num9 = (i10 & 65536) != 0 ? chatEvents$StreamingMessageJank.total_hitch_time_ms : num3;
        Integer num10 = (i10 & 131072) != 0 ? chatEvents$StreamingMessageJank.hitch_minor : num4;
        Integer num11 = (i10 & 262144) != 0 ? chatEvents$StreamingMessageJank.hitch_major : num5;
        Integer num12 = (i10 & 524288) != 0 ? chatEvents$StreamingMessageJank.hitch_severe : num6;
        Map map6 = (i10 & FreeTypeConstants.FT_LOAD_COLOR) != 0 ? chatEvents$StreamingMessageJank.block_count_by_kind : map;
        Map map7 = (i10 & FreeTypeConstants.FT_LOAD_COMPUTE_METRICS) != 0 ? chatEvents$StreamingMessageJank.block_char_length_by_kind : map2;
        if ((i10 & 4194304) != 0) {
            map5 = map7;
            map4 = chatEvents$StreamingMessageJank.markdown_node_count_by_kind;
        } else {
            map4 = map3;
            map5 = map7;
        }
        return chatEvents$StreamingMessageJank.copy(str7, str5, str6, chatEvents$StreamingMessageCompletionStatus2, i11, z2, i12, num7, i13, i14, i15, i16, i17, i18, i19, num8, num9, num10, num11, num12, map6, map5, map4);
    }

    public static final /* synthetic */ void write$Self$analytics(ChatEvents$StreamingMessageJank self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.conversation_uuid);
        output.q(serialDesc, 1, self.message_uuid);
        if (output.E(serialDesc) || self.model != null) {
            output.B(serialDesc, 2, srg.a, self.model);
        }
        output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.completion_status);
        output.l(4, self.total_time_ms, serialDesc);
        output.p(serialDesc, 5, self.was_in_background);
        output.l(6, self.time_in_background_ms, serialDesc);
        if (output.E(serialDesc) || self.conversation_message_count != null) {
            output.B(serialDesc, 7, e79.a, self.conversation_message_count);
        }
        output.l(8, self.total_frames, serialDesc);
        output.l(9, self.total_ui_ms, serialDesc);
        output.l(10, self.max_ui_ms, serialDesc);
        output.l(11, self.over_16ms, serialDesc);
        output.l(12, self.over_25ms, serialDesc);
        output.l(13, self.over_700ms, serialDesc);
        output.l(14, self.overrun_frames, serialDesc);
        if (output.E(serialDesc) || self.display_refresh_hz != null) {
            output.B(serialDesc, 15, e79.a, self.display_refresh_hz);
        }
        if (output.E(serialDesc) || self.total_hitch_time_ms != null) {
            output.B(serialDesc, 16, e79.a, self.total_hitch_time_ms);
        }
        if (output.E(serialDesc) || self.hitch_minor != null) {
            output.B(serialDesc, 17, e79.a, self.hitch_minor);
        }
        if (output.E(serialDesc) || self.hitch_major != null) {
            output.B(serialDesc, 18, e79.a, self.hitch_major);
        }
        if (output.E(serialDesc) || self.hitch_severe != null) {
            output.B(serialDesc, 19, e79.a, self.hitch_severe);
        }
        output.r(serialDesc, 20, (znf) kw9VarArr[20].getValue(), self.block_count_by_kind);
        output.r(serialDesc, 21, (znf) kw9VarArr[21].getValue(), self.block_char_length_by_kind);
        output.r(serialDesc, 22, (znf) kw9VarArr[22].getValue(), self.markdown_node_count_by_kind);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getTotal_ui_ms() {
        return this.total_ui_ms;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getMax_ui_ms() {
        return this.max_ui_ms;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getOver_16ms() {
        return this.over_16ms;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getOver_25ms() {
        return this.over_25ms;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getOver_700ms() {
        return this.over_700ms;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getOverrun_frames() {
        return this.overrun_frames;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Integer getDisplay_refresh_hz() {
        return this.display_refresh_hz;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Integer getTotal_hitch_time_ms() {
        return this.total_hitch_time_ms;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Integer getHitch_minor() {
        return this.hitch_minor;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Integer getHitch_major() {
        return this.hitch_major;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage_uuid() {
        return this.message_uuid;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Integer getHitch_severe() {
        return this.hitch_severe;
    }

    public final Map<String, Integer> component21() {
        return this.block_count_by_kind;
    }

    public final Map<String, Integer> component22() {
        return this.block_char_length_by_kind;
    }

    public final Map<String, Integer> component23() {
        return this.markdown_node_count_by_kind;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ChatEvents$StreamingMessageCompletionStatus getCompletion_status() {
        return this.completion_status;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTotal_time_ms() {
        return this.total_time_ms;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getWas_in_background() {
        return this.was_in_background;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getTime_in_background_ms() {
        return this.time_in_background_ms;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getConversation_message_count() {
        return this.conversation_message_count;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getTotal_frames() {
        return this.total_frames;
    }

    public final ChatEvents$StreamingMessageJank copy(String conversation_uuid, String message_uuid, String model, ChatEvents$StreamingMessageCompletionStatus completion_status, int total_time_ms, boolean was_in_background, int time_in_background_ms, Integer conversation_message_count, int total_frames, int total_ui_ms, int max_ui_ms, int over_16ms, int over_25ms, int over_700ms, int overrun_frames, Integer display_refresh_hz, Integer total_hitch_time_ms, Integer hitch_minor, Integer hitch_major, Integer hitch_severe, Map<String, Integer> block_count_by_kind, Map<String, Integer> block_char_length_by_kind, Map<String, Integer> markdown_node_count_by_kind) {
        conversation_uuid.getClass();
        message_uuid.getClass();
        completion_status.getClass();
        block_count_by_kind.getClass();
        block_char_length_by_kind.getClass();
        markdown_node_count_by_kind.getClass();
        return new ChatEvents$StreamingMessageJank(conversation_uuid, message_uuid, model, completion_status, total_time_ms, was_in_background, time_in_background_ms, conversation_message_count, total_frames, total_ui_ms, max_ui_ms, over_16ms, over_25ms, over_700ms, overrun_frames, display_refresh_hz, total_hitch_time_ms, hitch_minor, hitch_major, hitch_severe, block_count_by_kind, block_char_length_by_kind, markdown_node_count_by_kind);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatEvents$StreamingMessageJank)) {
            return false;
        }
        ChatEvents$StreamingMessageJank chatEvents$StreamingMessageJank = (ChatEvents$StreamingMessageJank) other;
        return x44.r(this.conversation_uuid, chatEvents$StreamingMessageJank.conversation_uuid) && x44.r(this.message_uuid, chatEvents$StreamingMessageJank.message_uuid) && x44.r(this.model, chatEvents$StreamingMessageJank.model) && this.completion_status == chatEvents$StreamingMessageJank.completion_status && this.total_time_ms == chatEvents$StreamingMessageJank.total_time_ms && this.was_in_background == chatEvents$StreamingMessageJank.was_in_background && this.time_in_background_ms == chatEvents$StreamingMessageJank.time_in_background_ms && x44.r(this.conversation_message_count, chatEvents$StreamingMessageJank.conversation_message_count) && this.total_frames == chatEvents$StreamingMessageJank.total_frames && this.total_ui_ms == chatEvents$StreamingMessageJank.total_ui_ms && this.max_ui_ms == chatEvents$StreamingMessageJank.max_ui_ms && this.over_16ms == chatEvents$StreamingMessageJank.over_16ms && this.over_25ms == chatEvents$StreamingMessageJank.over_25ms && this.over_700ms == chatEvents$StreamingMessageJank.over_700ms && this.overrun_frames == chatEvents$StreamingMessageJank.overrun_frames && x44.r(this.display_refresh_hz, chatEvents$StreamingMessageJank.display_refresh_hz) && x44.r(this.total_hitch_time_ms, chatEvents$StreamingMessageJank.total_hitch_time_ms) && x44.r(this.hitch_minor, chatEvents$StreamingMessageJank.hitch_minor) && x44.r(this.hitch_major, chatEvents$StreamingMessageJank.hitch_major) && x44.r(this.hitch_severe, chatEvents$StreamingMessageJank.hitch_severe) && x44.r(this.block_count_by_kind, chatEvents$StreamingMessageJank.block_count_by_kind) && x44.r(this.block_char_length_by_kind, chatEvents$StreamingMessageJank.block_char_length_by_kind) && x44.r(this.markdown_node_count_by_kind, chatEvents$StreamingMessageJank.markdown_node_count_by_kind);
    }

    public final Map<String, Integer> getBlock_char_length_by_kind() {
        return this.block_char_length_by_kind;
    }

    public final Map<String, Integer> getBlock_count_by_kind() {
        return this.block_count_by_kind;
    }

    public final ChatEvents$StreamingMessageCompletionStatus getCompletion_status() {
        return this.completion_status;
    }

    public final Integer getConversation_message_count() {
        return this.conversation_message_count;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    public final Integer getDisplay_refresh_hz() {
        return this.display_refresh_hz;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_streaming_message_jank";
    }

    public final Integer getHitch_major() {
        return this.hitch_major;
    }

    public final Integer getHitch_minor() {
        return this.hitch_minor;
    }

    public final Integer getHitch_severe() {
        return this.hitch_severe;
    }

    public final Map<String, Integer> getMarkdown_node_count_by_kind() {
        return this.markdown_node_count_by_kind;
    }

    public final int getMax_ui_ms() {
        return this.max_ui_ms;
    }

    public final String getMessage_uuid() {
        return this.message_uuid;
    }

    public final String getModel() {
        return this.model;
    }

    public final int getOver_16ms() {
        return this.over_16ms;
    }

    public final int getOver_25ms() {
        return this.over_25ms;
    }

    public final int getOver_700ms() {
        return this.over_700ms;
    }

    public final int getOverrun_frames() {
        return this.overrun_frames;
    }

    public final int getTime_in_background_ms() {
        return this.time_in_background_ms;
    }

    public final int getTotal_frames() {
        return this.total_frames;
    }

    public final Integer getTotal_hitch_time_ms() {
        return this.total_hitch_time_ms;
    }

    public final int getTotal_time_ms() {
        return this.total_time_ms;
    }

    public final int getTotal_ui_ms() {
        return this.total_ui_ms;
    }

    public final boolean getWas_in_background() {
        return this.was_in_background;
    }

    public int hashCode() {
        int iL = kgh.l(this.conversation_uuid.hashCode() * 31, 31, this.message_uuid);
        String str = this.model;
        int iC = vb7.c(this.time_in_background_ms, fsh.p(vb7.c(this.total_time_ms, (this.completion_status.hashCode() + ((iL + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31), 31, this.was_in_background), 31);
        Integer num = this.conversation_message_count;
        int iC2 = vb7.c(this.overrun_frames, vb7.c(this.over_700ms, vb7.c(this.over_25ms, vb7.c(this.over_16ms, vb7.c(this.max_ui_ms, vb7.c(this.total_ui_ms, vb7.c(this.total_frames, (iC + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31);
        Integer num2 = this.display_refresh_hz;
        int iHashCode = (iC2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.total_hitch_time_ms;
        int iHashCode2 = (iHashCode + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.hitch_minor;
        int iHashCode3 = (iHashCode2 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.hitch_major;
        int iHashCode4 = (iHashCode3 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.hitch_severe;
        return this.markdown_node_count_by_kind.hashCode() + ebh.g(ebh.g((iHashCode4 + (num6 != null ? num6.hashCode() : 0)) * 31, 31, this.block_count_by_kind), 31, this.block_char_length_by_kind);
    }

    public String toString() {
        String str = this.conversation_uuid;
        String str2 = this.message_uuid;
        String str3 = this.model;
        ChatEvents$StreamingMessageCompletionStatus chatEvents$StreamingMessageCompletionStatus = this.completion_status;
        int i = this.total_time_ms;
        boolean z = this.was_in_background;
        int i2 = this.time_in_background_ms;
        Integer num = this.conversation_message_count;
        int i3 = this.total_frames;
        int i4 = this.total_ui_ms;
        int i5 = this.max_ui_ms;
        int i6 = this.over_16ms;
        int i7 = this.over_25ms;
        int i8 = this.over_700ms;
        int i9 = this.overrun_frames;
        Integer num2 = this.display_refresh_hz;
        Integer num3 = this.total_hitch_time_ms;
        Integer num4 = this.hitch_minor;
        Integer num5 = this.hitch_major;
        Integer num6 = this.hitch_severe;
        Map<String, Integer> map = this.block_count_by_kind;
        Map<String, Integer> map2 = this.block_char_length_by_kind;
        Map<String, Integer> map3 = this.markdown_node_count_by_kind;
        StringBuilder sbR = kgh.r("StreamingMessageJank(conversation_uuid=", str, ", message_uuid=", str2, ", model=");
        sbR.append(str3);
        sbR.append(", completion_status=");
        sbR.append(chatEvents$StreamingMessageCompletionStatus);
        sbR.append(", total_time_ms=");
        sbR.append(i);
        sbR.append(", was_in_background=");
        sbR.append(z);
        sbR.append(", time_in_background_ms=");
        sbR.append(i2);
        sbR.append(", conversation_message_count=");
        sbR.append(num);
        sbR.append(", total_frames=");
        qy1.k(i3, i4, ", total_ui_ms=", ", max_ui_ms=", sbR);
        qy1.k(i5, i6, ", over_16ms=", ", over_25ms=", sbR);
        qy1.k(i7, i8, ", over_700ms=", ", overrun_frames=", sbR);
        sbR.append(i9);
        sbR.append(", display_refresh_hz=");
        sbR.append(num2);
        sbR.append(", total_hitch_time_ms=");
        sbR.append(num3);
        sbR.append(", hitch_minor=");
        sbR.append(num4);
        sbR.append(", hitch_major=");
        sbR.append(num5);
        sbR.append(", hitch_severe=");
        sbR.append(num6);
        sbR.append(", block_count_by_kind=");
        sbR.append(map);
        sbR.append(", block_char_length_by_kind=");
        sbR.append(map2);
        sbR.append(", markdown_node_count_by_kind=");
        return qy1.i(sbR, map3, ")");
    }

    public ChatEvents$StreamingMessageJank(String str, String str2, String str3, ChatEvents$StreamingMessageCompletionStatus chatEvents$StreamingMessageCompletionStatus, int i, boolean z, int i2, Integer num, int i3, int i4, int i5, int i6, int i7, int i8, int i9, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Map<String, Integer> map, Map<String, Integer> map2, Map<String, Integer> map3) {
        str.getClass();
        str2.getClass();
        chatEvents$StreamingMessageCompletionStatus.getClass();
        map.getClass();
        map2.getClass();
        map3.getClass();
        this.conversation_uuid = str;
        this.message_uuid = str2;
        this.model = str3;
        this.completion_status = chatEvents$StreamingMessageCompletionStatus;
        this.total_time_ms = i;
        this.was_in_background = z;
        this.time_in_background_ms = i2;
        this.conversation_message_count = num;
        this.total_frames = i3;
        this.total_ui_ms = i4;
        this.max_ui_ms = i5;
        this.over_16ms = i6;
        this.over_25ms = i7;
        this.over_700ms = i8;
        this.overrun_frames = i9;
        this.display_refresh_hz = num2;
        this.total_hitch_time_ms = num3;
        this.hitch_minor = num4;
        this.hitch_major = num5;
        this.hitch_severe = num6;
        this.block_count_by_kind = map;
        this.block_char_length_by_kind = map2;
        this.markdown_node_count_by_kind = map3;
    }

    public /* synthetic */ ChatEvents$StreamingMessageJank(String str, String str2, String str3, ChatEvents$StreamingMessageCompletionStatus chatEvents$StreamingMessageCompletionStatus, int i, boolean z, int i2, Integer num, int i3, int i4, int i5, int i6, int i7, int i8, int i9, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Map map, Map map2, Map map3, int i10, mq5 mq5Var) {
        this(str, str2, (i10 & 4) != 0 ? null : str3, chatEvents$StreamingMessageCompletionStatus, i, z, i2, (i10 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : num, i3, i4, i5, i6, i7, i8, i9, (32768 & i10) != 0 ? null : num2, (65536 & i10) != 0 ? null : num3, (131072 & i10) != 0 ? null : num4, (262144 & i10) != 0 ? null : num5, (i10 & 524288) != 0 ? null : num6, map, map2, map3);
    }
}
