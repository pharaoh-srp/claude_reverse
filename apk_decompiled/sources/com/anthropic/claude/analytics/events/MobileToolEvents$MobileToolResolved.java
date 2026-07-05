package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.ulb;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.xka;
import defpackage.yb5;
import defpackage.ymb;
import defpackage.zmb;
import defpackage.znf;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0002NOBw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010\u001cJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b'\u0010(J\u008a\u0001\u0010*\u001a\u00020)2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b,\u0010\u001cJ\u0010\u0010-\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u00020\r2\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b1\u00102J'\u0010;\u001a\u0002082\u0006\u00103\u001a\u00020)2\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0001¢\u0006\u0004\b9\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\b?\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010>\u001a\u0004\b@\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010>\u001a\u0004\bA\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\bB\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\bC\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\bD\u0010\u001cR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010E\u001a\u0004\bF\u0010#R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010G\u001a\u0004\b\u000e\u0010%R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\bH\u0010\u001cR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010I\u001a\u0004\bJ\u0010(R\u0014\u0010L\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\u001c¨\u0006P"}, d2 = {"com/anthropic/claude/analytics/events/MobileToolEvents$MobileToolResolved", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "Lcom/anthropic/claude/analytics/events/MobileToolEvents$MobileToolKind;", "tool_kind", "", "tool_name", "tool_use_id", "message_id", "conversation_id", "server_name", "server_uuid", "Lcom/anthropic/claude/analytics/events/MobileToolEvents$MobileToolOutcome;", "outcome", "", "is_error", "error_detail", "", "perceived_latency_ms", "<init>", "(Lcom/anthropic/claude/analytics/events/MobileToolEvents$MobileToolKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/MobileToolEvents$MobileToolOutcome;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/analytics/events/MobileToolEvents$MobileToolKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/MobileToolEvents$MobileToolOutcome;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Lvnf;)V", "component1", "()Lcom/anthropic/claude/analytics/events/MobileToolEvents$MobileToolKind;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "()Lcom/anthropic/claude/analytics/events/MobileToolEvents$MobileToolOutcome;", "component9", "()Ljava/lang/Boolean;", "component10", "component11", "()Ljava/lang/Long;", "Lcom/anthropic/claude/analytics/events/MobileToolEvents$MobileToolResolved;", "copy", "(Lcom/anthropic/claude/analytics/events/MobileToolEvents$MobileToolKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/MobileToolEvents$MobileToolOutcome;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;)Lcom/anthropic/claude/analytics/events/MobileToolEvents$MobileToolResolved;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/MobileToolEvents$MobileToolResolved;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/anthropic/claude/analytics/events/MobileToolEvents$MobileToolKind;", "getTool_kind", "Ljava/lang/String;", "getTool_name", "getTool_use_id", "getMessage_id", "getConversation_id", "getServer_name", "getServer_uuid", "Lcom/anthropic/claude/analytics/events/MobileToolEvents$MobileToolOutcome;", "getOutcome", "Ljava/lang/Boolean;", "getError_detail", "Ljava/lang/Long;", "getPerceived_latency_ms", "getEventName", "eventName", "Companion", "ymb", "zmb", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MobileToolEvents$MobileToolResolved implements AnalyticsEvent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final zmb Companion = new zmb();
    private final String conversation_id;
    private final String error_detail;
    private final Boolean is_error;
    private final String message_id;
    private final MobileToolEvents$MobileToolOutcome outcome;
    private final Long perceived_latency_ms;
    private final String server_name;
    private final String server_uuid;
    private final MobileToolEvents$MobileToolKind tool_kind;
    private final String tool_name;
    private final String tool_use_id;

    static {
        ulb ulbVar = new ulb(14);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{yb5.w(w1aVar, ulbVar), null, null, null, null, null, null, yb5.w(w1aVar, new ulb(15)), null, null, null};
    }

    public /* synthetic */ MobileToolEvents$MobileToolResolved(int i, MobileToolEvents$MobileToolKind mobileToolEvents$MobileToolKind, String str, String str2, String str3, String str4, String str5, String str6, MobileToolEvents$MobileToolOutcome mobileToolEvents$MobileToolOutcome, Boolean bool, String str7, Long l, vnf vnfVar) {
        if (155 != (i & 155)) {
            gvj.f(i, 155, ymb.a.getDescriptor());
            throw null;
        }
        this.tool_kind = mobileToolEvents$MobileToolKind;
        this.tool_name = str;
        if ((i & 4) == 0) {
            this.tool_use_id = null;
        } else {
            this.tool_use_id = str2;
        }
        this.message_id = str3;
        this.conversation_id = str4;
        if ((i & 32) == 0) {
            this.server_name = null;
        } else {
            this.server_name = str5;
        }
        if ((i & 64) == 0) {
            this.server_uuid = null;
        } else {
            this.server_uuid = str6;
        }
        this.outcome = mobileToolEvents$MobileToolOutcome;
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.is_error = null;
        } else {
            this.is_error = bool;
        }
        if ((i & 512) == 0) {
            this.error_detail = null;
        } else {
            this.error_detail = str7;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
            this.perceived_latency_ms = null;
        } else {
            this.perceived_latency_ms = l;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return MobileToolEvents$MobileToolKind.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return MobileToolEvents$MobileToolOutcome.Companion.serializer();
    }

    public static /* synthetic */ MobileToolEvents$MobileToolResolved copy$default(MobileToolEvents$MobileToolResolved mobileToolEvents$MobileToolResolved, MobileToolEvents$MobileToolKind mobileToolEvents$MobileToolKind, String str, String str2, String str3, String str4, String str5, String str6, MobileToolEvents$MobileToolOutcome mobileToolEvents$MobileToolOutcome, Boolean bool, String str7, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            mobileToolEvents$MobileToolKind = mobileToolEvents$MobileToolResolved.tool_kind;
        }
        if ((i & 2) != 0) {
            str = mobileToolEvents$MobileToolResolved.tool_name;
        }
        if ((i & 4) != 0) {
            str2 = mobileToolEvents$MobileToolResolved.tool_use_id;
        }
        if ((i & 8) != 0) {
            str3 = mobileToolEvents$MobileToolResolved.message_id;
        }
        if ((i & 16) != 0) {
            str4 = mobileToolEvents$MobileToolResolved.conversation_id;
        }
        if ((i & 32) != 0) {
            str5 = mobileToolEvents$MobileToolResolved.server_name;
        }
        if ((i & 64) != 0) {
            str6 = mobileToolEvents$MobileToolResolved.server_uuid;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            mobileToolEvents$MobileToolOutcome = mobileToolEvents$MobileToolResolved.outcome;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            bool = mobileToolEvents$MobileToolResolved.is_error;
        }
        if ((i & 512) != 0) {
            str7 = mobileToolEvents$MobileToolResolved.error_detail;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
            l = mobileToolEvents$MobileToolResolved.perceived_latency_ms;
        }
        String str8 = str7;
        Long l2 = l;
        MobileToolEvents$MobileToolOutcome mobileToolEvents$MobileToolOutcome2 = mobileToolEvents$MobileToolOutcome;
        Boolean bool2 = bool;
        String str9 = str5;
        String str10 = str6;
        String str11 = str4;
        String str12 = str2;
        return mobileToolEvents$MobileToolResolved.copy(mobileToolEvents$MobileToolKind, str, str12, str3, str11, str9, str10, mobileToolEvents$MobileToolOutcome2, bool2, str8, l2);
    }

    public static final /* synthetic */ void write$Self$analytics(MobileToolEvents$MobileToolResolved self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.tool_kind);
        output.q(serialDesc, 1, self.tool_name);
        if (output.E(serialDesc) || self.tool_use_id != null) {
            output.B(serialDesc, 2, srg.a, self.tool_use_id);
        }
        output.q(serialDesc, 3, self.message_id);
        output.q(serialDesc, 4, self.conversation_id);
        if (output.E(serialDesc) || self.server_name != null) {
            output.B(serialDesc, 5, srg.a, self.server_name);
        }
        if (output.E(serialDesc) || self.server_uuid != null) {
            output.B(serialDesc, 6, srg.a, self.server_uuid);
        }
        output.r(serialDesc, 7, (znf) kw9VarArr[7].getValue(), self.outcome);
        if (output.E(serialDesc) || self.is_error != null) {
            output.B(serialDesc, 8, zt1.a, self.is_error);
        }
        if (output.E(serialDesc) || self.error_detail != null) {
            output.B(serialDesc, 9, srg.a, self.error_detail);
        }
        if (!output.E(serialDesc) && self.perceived_latency_ms == null) {
            return;
        }
        output.B(serialDesc, 10, xka.a, self.perceived_latency_ms);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MobileToolEvents$MobileToolKind getTool_kind() {
        return this.tool_kind;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getError_detail() {
        return this.error_detail;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Long getPerceived_latency_ms() {
        return this.perceived_latency_ms;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTool_name() {
        return this.tool_name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTool_use_id() {
        return this.tool_use_id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMessage_id() {
        return this.message_id;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getConversation_id() {
        return this.conversation_id;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getServer_name() {
        return this.server_name;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getServer_uuid() {
        return this.server_uuid;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final MobileToolEvents$MobileToolOutcome getOutcome() {
        return this.outcome;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getIs_error() {
        return this.is_error;
    }

    public final MobileToolEvents$MobileToolResolved copy(MobileToolEvents$MobileToolKind tool_kind, String tool_name, String tool_use_id, String message_id, String conversation_id, String server_name, String server_uuid, MobileToolEvents$MobileToolOutcome outcome, Boolean is_error, String error_detail, Long perceived_latency_ms) {
        tool_kind.getClass();
        tool_name.getClass();
        message_id.getClass();
        conversation_id.getClass();
        outcome.getClass();
        return new MobileToolEvents$MobileToolResolved(tool_kind, tool_name, tool_use_id, message_id, conversation_id, server_name, server_uuid, outcome, is_error, error_detail, perceived_latency_ms);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileToolEvents$MobileToolResolved)) {
            return false;
        }
        MobileToolEvents$MobileToolResolved mobileToolEvents$MobileToolResolved = (MobileToolEvents$MobileToolResolved) other;
        return this.tool_kind == mobileToolEvents$MobileToolResolved.tool_kind && x44.r(this.tool_name, mobileToolEvents$MobileToolResolved.tool_name) && x44.r(this.tool_use_id, mobileToolEvents$MobileToolResolved.tool_use_id) && x44.r(this.message_id, mobileToolEvents$MobileToolResolved.message_id) && x44.r(this.conversation_id, mobileToolEvents$MobileToolResolved.conversation_id) && x44.r(this.server_name, mobileToolEvents$MobileToolResolved.server_name) && x44.r(this.server_uuid, mobileToolEvents$MobileToolResolved.server_uuid) && this.outcome == mobileToolEvents$MobileToolResolved.outcome && x44.r(this.is_error, mobileToolEvents$MobileToolResolved.is_error) && x44.r(this.error_detail, mobileToolEvents$MobileToolResolved.error_detail) && x44.r(this.perceived_latency_ms, mobileToolEvents$MobileToolResolved.perceived_latency_ms);
    }

    public final String getConversation_id() {
        return this.conversation_id;
    }

    public final String getError_detail() {
        return this.error_detail;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_tool_resolved";
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final MobileToolEvents$MobileToolOutcome getOutcome() {
        return this.outcome;
    }

    public final Long getPerceived_latency_ms() {
        return this.perceived_latency_ms;
    }

    public final String getServer_name() {
        return this.server_name;
    }

    public final String getServer_uuid() {
        return this.server_uuid;
    }

    public final MobileToolEvents$MobileToolKind getTool_kind() {
        return this.tool_kind;
    }

    public final String getTool_name() {
        return this.tool_name;
    }

    public final String getTool_use_id() {
        return this.tool_use_id;
    }

    public int hashCode() {
        int iL = kgh.l(this.tool_kind.hashCode() * 31, 31, this.tool_name);
        String str = this.tool_use_id;
        int iL2 = kgh.l(kgh.l((iL + (str == null ? 0 : str.hashCode())) * 31, 31, this.message_id), 31, this.conversation_id);
        String str2 = this.server_name;
        int iHashCode = (iL2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.server_uuid;
        int iHashCode2 = (this.outcome.hashCode() + ((iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        Boolean bool = this.is_error;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.error_detail;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.perceived_latency_ms;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final Boolean is_error() {
        return this.is_error;
    }

    public String toString() {
        MobileToolEvents$MobileToolKind mobileToolEvents$MobileToolKind = this.tool_kind;
        String str = this.tool_name;
        String str2 = this.tool_use_id;
        String str3 = this.message_id;
        String str4 = this.conversation_id;
        String str5 = this.server_name;
        String str6 = this.server_uuid;
        MobileToolEvents$MobileToolOutcome mobileToolEvents$MobileToolOutcome = this.outcome;
        Boolean bool = this.is_error;
        String str7 = this.error_detail;
        Long l = this.perceived_latency_ms;
        StringBuilder sb = new StringBuilder("MobileToolResolved(tool_kind=");
        sb.append(mobileToolEvents$MobileToolKind);
        sb.append(", tool_name=");
        sb.append(str);
        sb.append(", tool_use_id=");
        kgh.u(sb, str2, ", message_id=", str3, ", conversation_id=");
        kgh.u(sb, str4, ", server_name=", str5, ", server_uuid=");
        sb.append(str6);
        sb.append(", outcome=");
        sb.append(mobileToolEvents$MobileToolOutcome);
        sb.append(", is_error=");
        sb.append(bool);
        sb.append(", error_detail=");
        sb.append(str7);
        sb.append(", perceived_latency_ms=");
        sb.append(l);
        sb.append(")");
        return sb.toString();
    }

    public MobileToolEvents$MobileToolResolved(MobileToolEvents$MobileToolKind mobileToolEvents$MobileToolKind, String str, String str2, String str3, String str4, String str5, String str6, MobileToolEvents$MobileToolOutcome mobileToolEvents$MobileToolOutcome, Boolean bool, String str7, Long l) {
        mobileToolEvents$MobileToolKind.getClass();
        str.getClass();
        str3.getClass();
        str4.getClass();
        mobileToolEvents$MobileToolOutcome.getClass();
        this.tool_kind = mobileToolEvents$MobileToolKind;
        this.tool_name = str;
        this.tool_use_id = str2;
        this.message_id = str3;
        this.conversation_id = str4;
        this.server_name = str5;
        this.server_uuid = str6;
        this.outcome = mobileToolEvents$MobileToolOutcome;
        this.is_error = bool;
        this.error_detail = str7;
        this.perceived_latency_ms = l;
    }

    public /* synthetic */ MobileToolEvents$MobileToolResolved(MobileToolEvents$MobileToolKind mobileToolEvents$MobileToolKind, String str, String str2, String str3, String str4, String str5, String str6, MobileToolEvents$MobileToolOutcome mobileToolEvents$MobileToolOutcome, Boolean bool, String str7, Long l, int i, mq5 mq5Var) {
        this(mobileToolEvents$MobileToolKind, str, (i & 4) != 0 ? null : str2, str3, str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, mobileToolEvents$MobileToolOutcome, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : bool, (i & 512) != 0 ? null : str7, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? null : l);
    }
}
