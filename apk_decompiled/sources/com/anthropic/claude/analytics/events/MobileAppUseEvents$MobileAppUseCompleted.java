package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mlb;
import defpackage.nlb;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.y6a;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJB\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u001aR\u0014\u00100\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u001a¨\u00064"}, d2 = {"com/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUseCompleted", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "tool_name", "message_id", "conversation_id", "organization_id", "tool_use_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUseCompleted;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUseCompleted;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUseCompleted;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTool_name", "getMessage_id", "getConversation_id", "getOrganization_id", "getTool_use_id", "getEventName", "eventName", "Companion", "mlb", "nlb", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MobileAppUseEvents$MobileAppUseCompleted implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final nlb Companion = new nlb();
    private final String conversation_id;
    private final String message_id;
    private final String organization_id;
    private final String tool_name;
    private final String tool_use_id;

    public /* synthetic */ MobileAppUseEvents$MobileAppUseCompleted(int i, String str, String str2, String str3, String str4, String str5, vnf vnfVar) {
        if (31 != (i & 31)) {
            gvj.f(i, 31, mlb.a.getDescriptor());
            throw null;
        }
        this.tool_name = str;
        this.message_id = str2;
        this.conversation_id = str3;
        this.organization_id = str4;
        this.tool_use_id = str5;
    }

    public static /* synthetic */ MobileAppUseEvents$MobileAppUseCompleted copy$default(MobileAppUseEvents$MobileAppUseCompleted mobileAppUseEvents$MobileAppUseCompleted, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mobileAppUseEvents$MobileAppUseCompleted.tool_name;
        }
        if ((i & 2) != 0) {
            str2 = mobileAppUseEvents$MobileAppUseCompleted.message_id;
        }
        if ((i & 4) != 0) {
            str3 = mobileAppUseEvents$MobileAppUseCompleted.conversation_id;
        }
        if ((i & 8) != 0) {
            str4 = mobileAppUseEvents$MobileAppUseCompleted.organization_id;
        }
        if ((i & 16) != 0) {
            str5 = mobileAppUseEvents$MobileAppUseCompleted.tool_use_id;
        }
        String str6 = str5;
        String str7 = str3;
        return mobileAppUseEvents$MobileAppUseCompleted.copy(str, str2, str7, str4, str6);
    }

    public static final /* synthetic */ void write$Self$analytics(MobileAppUseEvents$MobileAppUseCompleted self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.tool_name);
        output.q(serialDesc, 1, self.message_id);
        output.q(serialDesc, 2, self.conversation_id);
        output.q(serialDesc, 3, self.organization_id);
        output.q(serialDesc, 4, self.tool_use_id);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTool_name() {
        return this.tool_name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage_id() {
        return this.message_id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getConversation_id() {
        return this.conversation_id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOrganization_id() {
        return this.organization_id;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTool_use_id() {
        return this.tool_use_id;
    }

    public final MobileAppUseEvents$MobileAppUseCompleted copy(String tool_name, String message_id, String conversation_id, String organization_id, String tool_use_id) {
        tool_name.getClass();
        message_id.getClass();
        conversation_id.getClass();
        organization_id.getClass();
        tool_use_id.getClass();
        return new MobileAppUseEvents$MobileAppUseCompleted(tool_name, message_id, conversation_id, organization_id, tool_use_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileAppUseEvents$MobileAppUseCompleted)) {
            return false;
        }
        MobileAppUseEvents$MobileAppUseCompleted mobileAppUseEvents$MobileAppUseCompleted = (MobileAppUseEvents$MobileAppUseCompleted) other;
        return x44.r(this.tool_name, mobileAppUseEvents$MobileAppUseCompleted.tool_name) && x44.r(this.message_id, mobileAppUseEvents$MobileAppUseCompleted.message_id) && x44.r(this.conversation_id, mobileAppUseEvents$MobileAppUseCompleted.conversation_id) && x44.r(this.organization_id, mobileAppUseEvents$MobileAppUseCompleted.organization_id) && x44.r(this.tool_use_id, mobileAppUseEvents$MobileAppUseCompleted.tool_use_id);
    }

    public final String getConversation_id() {
        return this.conversation_id;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_app_use_completed";
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
        return this.tool_use_id.hashCode() + kgh.l(kgh.l(kgh.l(this.tool_name.hashCode() * 31, 31, this.message_id), 31, this.conversation_id), 31, this.organization_id);
    }

    public String toString() {
        String str = this.tool_name;
        String str2 = this.message_id;
        String str3 = this.conversation_id;
        String str4 = this.organization_id;
        String str5 = this.tool_use_id;
        StringBuilder sbR = kgh.r("MobileAppUseCompleted(tool_name=", str, ", message_id=", str2, ", conversation_id=");
        kgh.u(sbR, str3, ", organization_id=", str4, ", tool_use_id=");
        return ij0.m(sbR, str5, ")");
    }

    public MobileAppUseEvents$MobileAppUseCompleted(String str, String str2, String str3, String str4, String str5) {
        y6a.s(str, str2, str3, str4, str5);
        this.tool_name = str;
        this.message_id = str2;
        this.conversation_id = str3;
        this.organization_id = str4;
        this.tool_use_id = str5;
    }
}
