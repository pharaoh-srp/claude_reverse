package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.ao2;
import defpackage.e79;
import defpackage.ebh;
import defpackage.f7a;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qy1;
import defpackage.ro2;
import defpackage.so2;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 R2\u00020\u0001:\u0002STB£\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\t\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0013\u0010\u0014B±\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0013\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u001c\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\tHÆ\u0003¢\u0006\u0004\b \u0010!J\u001c\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\tHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b&\u0010$J\u0012\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b'\u0010$J\u0012\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b(\u0010$J\u0012\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b)\u0010$J\u0012\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b*\u0010$J¸\u0001\u0010,\u001a\u00020+2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\t2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u001aJ\u0010\u0010/\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b/\u0010\u001eJ\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b3\u00104J'\u0010=\u001a\u00020:2\u0006\u00105\u001a\u00020+2\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0001¢\u0006\u0004\b;\u0010<R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010>\u001a\u0004\b?\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010@\u001a\u0004\bA\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010B\u001a\u0004\bC\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010B\u001a\u0004\bD\u0010\u001eR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b\n\u0010E\u001a\u0004\bF\u0010!R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010E\u001a\u0004\bG\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010H\u001a\u0004\bI\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010H\u001a\u0004\bJ\u0010$R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010H\u001a\u0004\bK\u0010$R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010H\u001a\u0004\bL\u0010$R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010H\u001a\u0004\bM\u0010$R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010H\u001a\u0004\bN\u0010$R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010H\u001a\u0004\bO\u0010$R\u0014\u0010Q\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010\u001a¨\u0006U"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$ConversationLoadJank", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "conversation_uuid", "Lcom/anthropic/claude/analytics/events/ChatEvents$ConversationLoadSource;", "source", "", "message_count", "total_time_ms", "", "block_count_by_kind", "markdown_node_count_by_kind", "total_frames", "total_ui_ms", "max_ui_ms", "over_16ms", "over_25ms", "over_700ms", "overrun_frames", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$ConversationLoadSource;IILjava/util/Map;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$ConversationLoadSource;IILjava/util/Map;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/analytics/events/ChatEvents$ConversationLoadSource;", "component3", "()I", "component4", "component5", "()Ljava/util/Map;", "component6", "component7", "()Ljava/lang/Integer;", "component8", "component9", "component10", "component11", "component12", "component13", "Lcom/anthropic/claude/analytics/events/ChatEvents$ConversationLoadJank;", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$ConversationLoadSource;IILjava/util/Map;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/anthropic/claude/analytics/events/ChatEvents$ConversationLoadJank;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatEvents$ConversationLoadJank;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getConversation_uuid", "Lcom/anthropic/claude/analytics/events/ChatEvents$ConversationLoadSource;", "getSource", "I", "getMessage_count", "getTotal_time_ms", "Ljava/util/Map;", "getBlock_count_by_kind", "getMarkdown_node_count_by_kind", "Ljava/lang/Integer;", "getTotal_frames", "getTotal_ui_ms", "getMax_ui_ms", "getOver_16ms", "getOver_25ms", "getOver_700ms", "getOverrun_frames", "getEventName", "eventName", "Companion", "ro2", "so2", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatEvents$ConversationLoadJank implements AnalyticsEvent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final so2 Companion = new so2();
    private final Map<String, Integer> block_count_by_kind;
    private final String conversation_uuid;
    private final Map<String, Integer> markdown_node_count_by_kind;
    private final Integer max_ui_ms;
    private final int message_count;
    private final Integer over_16ms;
    private final Integer over_25ms;
    private final Integer over_700ms;
    private final Integer overrun_frames;
    private final ChatEvents$ConversationLoadSource source;
    private final Integer total_frames;
    private final int total_time_ms;
    private final Integer total_ui_ms;

    static {
        ao2 ao2Var = new ao2(7);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, yb5.w(w1aVar, ao2Var), null, null, yb5.w(w1aVar, new ao2(8)), yb5.w(w1aVar, new ao2(9)), null, null, null, null, null, null, null};
    }

    public /* synthetic */ ChatEvents$ConversationLoadJank(int i, String str, ChatEvents$ConversationLoadSource chatEvents$ConversationLoadSource, int i2, int i3, Map map, Map map2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, vnf vnfVar) {
        if (63 != (i & 63)) {
            gvj.f(i, 63, ro2.a.getDescriptor());
            throw null;
        }
        this.conversation_uuid = str;
        this.source = chatEvents$ConversationLoadSource;
        this.message_count = i2;
        this.total_time_ms = i3;
        this.block_count_by_kind = map;
        this.markdown_node_count_by_kind = map2;
        if ((i & 64) == 0) {
            this.total_frames = null;
        } else {
            this.total_frames = num;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.total_ui_ms = null;
        } else {
            this.total_ui_ms = num2;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.max_ui_ms = null;
        } else {
            this.max_ui_ms = num3;
        }
        if ((i & 512) == 0) {
            this.over_16ms = null;
        } else {
            this.over_16ms = num4;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
            this.over_25ms = null;
        } else {
            this.over_25ms = num5;
        }
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 0) {
            this.over_700ms = null;
        } else {
            this.over_700ms = num6;
        }
        if ((i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0) {
            this.overrun_frames = null;
        } else {
            this.overrun_frames = num7;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ChatEvents$ConversationLoadSource.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new f7a(srg.a, e79.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new f7a(srg.a, e79.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatEvents$ConversationLoadJank copy$default(ChatEvents$ConversationLoadJank chatEvents$ConversationLoadJank, String str, ChatEvents$ConversationLoadSource chatEvents$ConversationLoadSource, int i, int i2, Map map, Map map2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = chatEvents$ConversationLoadJank.conversation_uuid;
        }
        return chatEvents$ConversationLoadJank.copy(str, (i3 & 2) != 0 ? chatEvents$ConversationLoadJank.source : chatEvents$ConversationLoadSource, (i3 & 4) != 0 ? chatEvents$ConversationLoadJank.message_count : i, (i3 & 8) != 0 ? chatEvents$ConversationLoadJank.total_time_ms : i2, (i3 & 16) != 0 ? chatEvents$ConversationLoadJank.block_count_by_kind : map, (i3 & 32) != 0 ? chatEvents$ConversationLoadJank.markdown_node_count_by_kind : map2, (i3 & 64) != 0 ? chatEvents$ConversationLoadJank.total_frames : num, (i3 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? chatEvents$ConversationLoadJank.total_ui_ms : num2, (i3 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? chatEvents$ConversationLoadJank.max_ui_ms : num3, (i3 & 512) != 0 ? chatEvents$ConversationLoadJank.over_16ms : num4, (i3 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? chatEvents$ConversationLoadJank.over_25ms : num5, (i3 & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? chatEvents$ConversationLoadJank.over_700ms : num6, (i3 & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? chatEvents$ConversationLoadJank.overrun_frames : num7);
    }

    public static final /* synthetic */ void write$Self$analytics(ChatEvents$ConversationLoadJank self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.conversation_uuid);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.source);
        output.l(2, self.message_count, serialDesc);
        output.l(3, self.total_time_ms, serialDesc);
        output.r(serialDesc, 4, (znf) kw9VarArr[4].getValue(), self.block_count_by_kind);
        output.r(serialDesc, 5, (znf) kw9VarArr[5].getValue(), self.markdown_node_count_by_kind);
        if (output.E(serialDesc) || self.total_frames != null) {
            output.B(serialDesc, 6, e79.a, self.total_frames);
        }
        if (output.E(serialDesc) || self.total_ui_ms != null) {
            output.B(serialDesc, 7, e79.a, self.total_ui_ms);
        }
        if (output.E(serialDesc) || self.max_ui_ms != null) {
            output.B(serialDesc, 8, e79.a, self.max_ui_ms);
        }
        if (output.E(serialDesc) || self.over_16ms != null) {
            output.B(serialDesc, 9, e79.a, self.over_16ms);
        }
        if (output.E(serialDesc) || self.over_25ms != null) {
            output.B(serialDesc, 10, e79.a, self.over_25ms);
        }
        if (output.E(serialDesc) || self.over_700ms != null) {
            output.B(serialDesc, 11, e79.a, self.over_700ms);
        }
        if (!output.E(serialDesc) && self.overrun_frames == null) {
            return;
        }
        output.B(serialDesc, 12, e79.a, self.overrun_frames);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getOver_16ms() {
        return this.over_16ms;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getOver_25ms() {
        return this.over_25ms;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getOver_700ms() {
        return this.over_700ms;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getOverrun_frames() {
        return this.overrun_frames;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ChatEvents$ConversationLoadSource getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMessage_count() {
        return this.message_count;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTotal_time_ms() {
        return this.total_time_ms;
    }

    public final Map<String, Integer> component5() {
        return this.block_count_by_kind;
    }

    public final Map<String, Integer> component6() {
        return this.markdown_node_count_by_kind;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getTotal_frames() {
        return this.total_frames;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getTotal_ui_ms() {
        return this.total_ui_ms;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getMax_ui_ms() {
        return this.max_ui_ms;
    }

    public final ChatEvents$ConversationLoadJank copy(String conversation_uuid, ChatEvents$ConversationLoadSource source, int message_count, int total_time_ms, Map<String, Integer> block_count_by_kind, Map<String, Integer> markdown_node_count_by_kind, Integer total_frames, Integer total_ui_ms, Integer max_ui_ms, Integer over_16ms, Integer over_25ms, Integer over_700ms, Integer overrun_frames) {
        conversation_uuid.getClass();
        source.getClass();
        block_count_by_kind.getClass();
        markdown_node_count_by_kind.getClass();
        return new ChatEvents$ConversationLoadJank(conversation_uuid, source, message_count, total_time_ms, block_count_by_kind, markdown_node_count_by_kind, total_frames, total_ui_ms, max_ui_ms, over_16ms, over_25ms, over_700ms, overrun_frames);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatEvents$ConversationLoadJank)) {
            return false;
        }
        ChatEvents$ConversationLoadJank chatEvents$ConversationLoadJank = (ChatEvents$ConversationLoadJank) other;
        return x44.r(this.conversation_uuid, chatEvents$ConversationLoadJank.conversation_uuid) && this.source == chatEvents$ConversationLoadJank.source && this.message_count == chatEvents$ConversationLoadJank.message_count && this.total_time_ms == chatEvents$ConversationLoadJank.total_time_ms && x44.r(this.block_count_by_kind, chatEvents$ConversationLoadJank.block_count_by_kind) && x44.r(this.markdown_node_count_by_kind, chatEvents$ConversationLoadJank.markdown_node_count_by_kind) && x44.r(this.total_frames, chatEvents$ConversationLoadJank.total_frames) && x44.r(this.total_ui_ms, chatEvents$ConversationLoadJank.total_ui_ms) && x44.r(this.max_ui_ms, chatEvents$ConversationLoadJank.max_ui_ms) && x44.r(this.over_16ms, chatEvents$ConversationLoadJank.over_16ms) && x44.r(this.over_25ms, chatEvents$ConversationLoadJank.over_25ms) && x44.r(this.over_700ms, chatEvents$ConversationLoadJank.over_700ms) && x44.r(this.overrun_frames, chatEvents$ConversationLoadJank.overrun_frames);
    }

    public final Map<String, Integer> getBlock_count_by_kind() {
        return this.block_count_by_kind;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_conversation_load_jank";
    }

    public final Map<String, Integer> getMarkdown_node_count_by_kind() {
        return this.markdown_node_count_by_kind;
    }

    public final Integer getMax_ui_ms() {
        return this.max_ui_ms;
    }

    public final int getMessage_count() {
        return this.message_count;
    }

    public final Integer getOver_16ms() {
        return this.over_16ms;
    }

    public final Integer getOver_25ms() {
        return this.over_25ms;
    }

    public final Integer getOver_700ms() {
        return this.over_700ms;
    }

    public final Integer getOverrun_frames() {
        return this.overrun_frames;
    }

    public final ChatEvents$ConversationLoadSource getSource() {
        return this.source;
    }

    public final Integer getTotal_frames() {
        return this.total_frames;
    }

    public final int getTotal_time_ms() {
        return this.total_time_ms;
    }

    public final Integer getTotal_ui_ms() {
        return this.total_ui_ms;
    }

    public int hashCode() {
        int iG = ebh.g(ebh.g(vb7.c(this.total_time_ms, vb7.c(this.message_count, (this.source.hashCode() + (this.conversation_uuid.hashCode() * 31)) * 31, 31), 31), 31, this.block_count_by_kind), 31, this.markdown_node_count_by_kind);
        Integer num = this.total_frames;
        int iHashCode = (iG + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.total_ui_ms;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.max_ui_ms;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.over_16ms;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.over_25ms;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.over_700ms;
        int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.overrun_frames;
        return iHashCode6 + (num7 != null ? num7.hashCode() : 0);
    }

    public String toString() {
        String str = this.conversation_uuid;
        ChatEvents$ConversationLoadSource chatEvents$ConversationLoadSource = this.source;
        int i = this.message_count;
        int i2 = this.total_time_ms;
        Map<String, Integer> map = this.block_count_by_kind;
        Map<String, Integer> map2 = this.markdown_node_count_by_kind;
        Integer num = this.total_frames;
        Integer num2 = this.total_ui_ms;
        Integer num3 = this.max_ui_ms;
        Integer num4 = this.over_16ms;
        Integer num5 = this.over_25ms;
        Integer num6 = this.over_700ms;
        Integer num7 = this.overrun_frames;
        StringBuilder sb = new StringBuilder("ConversationLoadJank(conversation_uuid=");
        sb.append(str);
        sb.append(", source=");
        sb.append(chatEvents$ConversationLoadSource);
        sb.append(", message_count=");
        qy1.k(i, i2, ", total_time_ms=", ", block_count_by_kind=", sb);
        sb.append(map);
        sb.append(", markdown_node_count_by_kind=");
        sb.append(map2);
        sb.append(", total_frames=");
        sb.append(num);
        sb.append(", total_ui_ms=");
        sb.append(num2);
        sb.append(", max_ui_ms=");
        sb.append(num3);
        sb.append(", over_16ms=");
        sb.append(num4);
        sb.append(", over_25ms=");
        sb.append(num5);
        sb.append(", over_700ms=");
        sb.append(num6);
        sb.append(", overrun_frames=");
        sb.append(num7);
        sb.append(")");
        return sb.toString();
    }

    public ChatEvents$ConversationLoadJank(String str, ChatEvents$ConversationLoadSource chatEvents$ConversationLoadSource, int i, int i2, Map<String, Integer> map, Map<String, Integer> map2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
        str.getClass();
        chatEvents$ConversationLoadSource.getClass();
        map.getClass();
        map2.getClass();
        this.conversation_uuid = str;
        this.source = chatEvents$ConversationLoadSource;
        this.message_count = i;
        this.total_time_ms = i2;
        this.block_count_by_kind = map;
        this.markdown_node_count_by_kind = map2;
        this.total_frames = num;
        this.total_ui_ms = num2;
        this.max_ui_ms = num3;
        this.over_16ms = num4;
        this.over_25ms = num5;
        this.over_700ms = num6;
        this.overrun_frames = num7;
    }

    public /* synthetic */ ChatEvents$ConversationLoadJank(String str, ChatEvents$ConversationLoadSource chatEvents$ConversationLoadSource, int i, int i2, Map map, Map map2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, int i3, mq5 mq5Var) {
        this(str, chatEvents$ConversationLoadSource, i, i2, map, map2, (i3 & 64) != 0 ? null : num, (i3 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : num2, (i3 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : num3, (i3 & 512) != 0 ? null : num4, (i3 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? null : num5, (i3 & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? null : num6, (i3 & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? null : num7);
    }
}
