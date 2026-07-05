package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qlb;
import defpackage.rlb;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.y6a;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bBa\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJZ\u0010#\u001a\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b1\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b2\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b3\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b4\u0010\u001cR\u0014\u00106\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u001c¨\u0006:"}, d2 = {"com/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUseFailed", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "tool_name", "error_type", "error_message", "message_id", "conversation_id", "organization_id", "tool_use_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUseFailed;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUseFailed;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUseFailed;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTool_name", "getError_type", "getError_message", "getMessage_id", "getConversation_id", "getOrganization_id", "getTool_use_id", "getEventName", "eventName", "Companion", "qlb", "rlb", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MobileAppUseEvents$MobileAppUseFailed implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final rlb Companion = new rlb();
    private final String conversation_id;
    private final String error_message;
    private final String error_type;
    private final String message_id;
    private final String organization_id;
    private final String tool_name;
    private final String tool_use_id;

    public /* synthetic */ MobileAppUseEvents$MobileAppUseFailed(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, vnf vnfVar) {
        if (121 != (i & 121)) {
            gvj.f(i, 121, qlb.a.getDescriptor());
            throw null;
        }
        this.tool_name = str;
        if ((i & 2) == 0) {
            this.error_type = null;
        } else {
            this.error_type = str2;
        }
        if ((i & 4) == 0) {
            this.error_message = null;
        } else {
            this.error_message = str3;
        }
        this.message_id = str4;
        this.conversation_id = str5;
        this.organization_id = str6;
        this.tool_use_id = str7;
    }

    public static /* synthetic */ MobileAppUseEvents$MobileAppUseFailed copy$default(MobileAppUseEvents$MobileAppUseFailed mobileAppUseEvents$MobileAppUseFailed, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mobileAppUseEvents$MobileAppUseFailed.tool_name;
        }
        if ((i & 2) != 0) {
            str2 = mobileAppUseEvents$MobileAppUseFailed.error_type;
        }
        if ((i & 4) != 0) {
            str3 = mobileAppUseEvents$MobileAppUseFailed.error_message;
        }
        if ((i & 8) != 0) {
            str4 = mobileAppUseEvents$MobileAppUseFailed.message_id;
        }
        if ((i & 16) != 0) {
            str5 = mobileAppUseEvents$MobileAppUseFailed.conversation_id;
        }
        if ((i & 32) != 0) {
            str6 = mobileAppUseEvents$MobileAppUseFailed.organization_id;
        }
        if ((i & 64) != 0) {
            str7 = mobileAppUseEvents$MobileAppUseFailed.tool_use_id;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return mobileAppUseEvents$MobileAppUseFailed.copy(str, str2, str11, str4, str10, str8, str9);
    }

    public static final /* synthetic */ void write$Self$analytics(MobileAppUseEvents$MobileAppUseFailed self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.tool_name);
        if (output.E(serialDesc) || self.error_type != null) {
            output.B(serialDesc, 1, srg.a, self.error_type);
        }
        if (output.E(serialDesc) || self.error_message != null) {
            output.B(serialDesc, 2, srg.a, self.error_message);
        }
        output.q(serialDesc, 3, self.message_id);
        output.q(serialDesc, 4, self.conversation_id);
        output.q(serialDesc, 5, self.organization_id);
        output.q(serialDesc, 6, self.tool_use_id);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTool_name() {
        return this.tool_name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getError_type() {
        return this.error_type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getError_message() {
        return this.error_message;
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
    public final String getOrganization_id() {
        return this.organization_id;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTool_use_id() {
        return this.tool_use_id;
    }

    public final MobileAppUseEvents$MobileAppUseFailed copy(String tool_name, String error_type, String error_message, String message_id, String conversation_id, String organization_id, String tool_use_id) {
        tool_name.getClass();
        message_id.getClass();
        conversation_id.getClass();
        organization_id.getClass();
        tool_use_id.getClass();
        return new MobileAppUseEvents$MobileAppUseFailed(tool_name, error_type, error_message, message_id, conversation_id, organization_id, tool_use_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileAppUseEvents$MobileAppUseFailed)) {
            return false;
        }
        MobileAppUseEvents$MobileAppUseFailed mobileAppUseEvents$MobileAppUseFailed = (MobileAppUseEvents$MobileAppUseFailed) other;
        return x44.r(this.tool_name, mobileAppUseEvents$MobileAppUseFailed.tool_name) && x44.r(this.error_type, mobileAppUseEvents$MobileAppUseFailed.error_type) && x44.r(this.error_message, mobileAppUseEvents$MobileAppUseFailed.error_message) && x44.r(this.message_id, mobileAppUseEvents$MobileAppUseFailed.message_id) && x44.r(this.conversation_id, mobileAppUseEvents$MobileAppUseFailed.conversation_id) && x44.r(this.organization_id, mobileAppUseEvents$MobileAppUseFailed.organization_id) && x44.r(this.tool_use_id, mobileAppUseEvents$MobileAppUseFailed.tool_use_id);
    }

    public final String getConversation_id() {
        return this.conversation_id;
    }

    public final String getError_message() {
        return this.error_message;
    }

    public final String getError_type() {
        return this.error_type;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_app_use_failed";
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final String getOrganization_id() {
        return this.organization_id;
    }

    public final String getTool_name() {
        return this.tool_name;
    }

    public final String getTool_use_id() {
        return this.tool_use_id;
    }

    public int hashCode() {
        int iHashCode = this.tool_name.hashCode() * 31;
        String str = this.error_type;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.error_message;
        return this.tool_use_id.hashCode() + kgh.l(kgh.l(kgh.l((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.message_id), 31, this.conversation_id), 31, this.organization_id);
    }

    public String toString() {
        String str = this.tool_name;
        String str2 = this.error_type;
        String str3 = this.error_message;
        String str4 = this.message_id;
        String str5 = this.conversation_id;
        String str6 = this.organization_id;
        String str7 = this.tool_use_id;
        StringBuilder sbR = kgh.r("MobileAppUseFailed(tool_name=", str, ", error_type=", str2, ", error_message=");
        kgh.u(sbR, str3, ", message_id=", str4, ", conversation_id=");
        kgh.u(sbR, str5, ", organization_id=", str6, ", tool_use_id=");
        return ij0.m(sbR, str7, ")");
    }

    public MobileAppUseEvents$MobileAppUseFailed(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        y6a.s(str, str4, str5, str6, str7);
        this.tool_name = str;
        this.error_type = str2;
        this.error_message = str3;
        this.message_id = str4;
        this.conversation_id = str5;
        this.organization_id = str6;
        this.tool_use_id = str7;
    }

    public /* synthetic */ MobileAppUseEvents$MobileAppUseFailed(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, str4, str5, str6, str7);
    }
}
