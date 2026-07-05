package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.e79;
import defpackage.ebh;
import defpackage.f7a;
import defpackage.g9b;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.slb;
import defpackage.srg;
import defpackage.tlb;
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
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?@BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eBs\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010 J\u001c\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJ\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001eJl\u0010(\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b+\u0010 J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b5\u0010 R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00078\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b7\u0010#R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b8\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b9\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b:\u0010\u001eR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b;\u0010\u001eR\u0014\u0010=\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u001e¨\u0006A"}, d2 = {"com/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePartiallyCompleted", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "tool_name", "", "success_count", "failure_count", "", "error_type_counts", "message_id", "conversation_id", "organization_id", "tool_use_id", "<init>", "(Ljava/lang/String;IILjava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;IILjava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePartiallyCompleted;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePartiallyCompleted;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "()Ljava/util/Map;", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;IILjava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePartiallyCompleted;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTool_name", "I", "getSuccess_count", "getFailure_count", "Ljava/util/Map;", "getError_type_counts", "getMessage_id", "getConversation_id", "getOrganization_id", "getTool_use_id", "getEventName", "eventName", "Companion", "slb", "tlb", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MobileAppUseEvents$MobileAppUsePartiallyCompleted implements AnalyticsEvent {
    public static final int $stable = 8;
    private final String conversation_id;
    private final Map<String, Integer> error_type_counts;
    private final int failure_count;
    private final String message_id;
    private final String organization_id;
    private final int success_count;
    private final String tool_name;
    private final String tool_use_id;
    public static final tlb Companion = new tlb();
    private static final kw9[] $childSerializers = {null, null, null, yb5.w(w1a.F, new g9b(29)), null, null, null, null};

    public MobileAppUseEvents$MobileAppUsePartiallyCompleted(String str, int i, int i2, Map<String, Integer> map, String str2, String str3, String str4, String str5) {
        str.getClass();
        map.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.tool_name = str;
        this.success_count = i;
        this.failure_count = i2;
        this.error_type_counts = map;
        this.message_id = str2;
        this.conversation_id = str3;
        this.organization_id = str4;
        this.tool_use_id = str5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new f7a(srg.a, e79.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MobileAppUseEvents$MobileAppUsePartiallyCompleted copy$default(MobileAppUseEvents$MobileAppUsePartiallyCompleted mobileAppUseEvents$MobileAppUsePartiallyCompleted, String str, int i, int i2, Map map, String str2, String str3, String str4, String str5, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = mobileAppUseEvents$MobileAppUsePartiallyCompleted.tool_name;
        }
        if ((i3 & 2) != 0) {
            i = mobileAppUseEvents$MobileAppUsePartiallyCompleted.success_count;
        }
        if ((i3 & 4) != 0) {
            i2 = mobileAppUseEvents$MobileAppUsePartiallyCompleted.failure_count;
        }
        if ((i3 & 8) != 0) {
            map = mobileAppUseEvents$MobileAppUsePartiallyCompleted.error_type_counts;
        }
        if ((i3 & 16) != 0) {
            str2 = mobileAppUseEvents$MobileAppUsePartiallyCompleted.message_id;
        }
        if ((i3 & 32) != 0) {
            str3 = mobileAppUseEvents$MobileAppUsePartiallyCompleted.conversation_id;
        }
        if ((i3 & 64) != 0) {
            str4 = mobileAppUseEvents$MobileAppUsePartiallyCompleted.organization_id;
        }
        if ((i3 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            str5 = mobileAppUseEvents$MobileAppUsePartiallyCompleted.tool_use_id;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str2;
        String str9 = str3;
        return mobileAppUseEvents$MobileAppUsePartiallyCompleted.copy(str, i, i2, map, str8, str9, str6, str7);
    }

    public static final /* synthetic */ void write$Self$analytics(MobileAppUseEvents$MobileAppUsePartiallyCompleted self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.tool_name);
        output.l(1, self.success_count, serialDesc);
        output.l(2, self.failure_count, serialDesc);
        output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.error_type_counts);
        output.q(serialDesc, 4, self.message_id);
        output.q(serialDesc, 5, self.conversation_id);
        output.q(serialDesc, 6, self.organization_id);
        output.q(serialDesc, 7, self.tool_use_id);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTool_name() {
        return this.tool_name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSuccess_count() {
        return this.success_count;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getFailure_count() {
        return this.failure_count;
    }

    public final Map<String, Integer> component4() {
        return this.error_type_counts;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMessage_id() {
        return this.message_id;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getConversation_id() {
        return this.conversation_id;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOrganization_id() {
        return this.organization_id;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTool_use_id() {
        return this.tool_use_id;
    }

    public final MobileAppUseEvents$MobileAppUsePartiallyCompleted copy(String tool_name, int success_count, int failure_count, Map<String, Integer> error_type_counts, String message_id, String conversation_id, String organization_id, String tool_use_id) {
        tool_name.getClass();
        error_type_counts.getClass();
        message_id.getClass();
        conversation_id.getClass();
        organization_id.getClass();
        tool_use_id.getClass();
        return new MobileAppUseEvents$MobileAppUsePartiallyCompleted(tool_name, success_count, failure_count, error_type_counts, message_id, conversation_id, organization_id, tool_use_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileAppUseEvents$MobileAppUsePartiallyCompleted)) {
            return false;
        }
        MobileAppUseEvents$MobileAppUsePartiallyCompleted mobileAppUseEvents$MobileAppUsePartiallyCompleted = (MobileAppUseEvents$MobileAppUsePartiallyCompleted) other;
        return x44.r(this.tool_name, mobileAppUseEvents$MobileAppUsePartiallyCompleted.tool_name) && this.success_count == mobileAppUseEvents$MobileAppUsePartiallyCompleted.success_count && this.failure_count == mobileAppUseEvents$MobileAppUsePartiallyCompleted.failure_count && x44.r(this.error_type_counts, mobileAppUseEvents$MobileAppUsePartiallyCompleted.error_type_counts) && x44.r(this.message_id, mobileAppUseEvents$MobileAppUsePartiallyCompleted.message_id) && x44.r(this.conversation_id, mobileAppUseEvents$MobileAppUsePartiallyCompleted.conversation_id) && x44.r(this.organization_id, mobileAppUseEvents$MobileAppUsePartiallyCompleted.organization_id) && x44.r(this.tool_use_id, mobileAppUseEvents$MobileAppUsePartiallyCompleted.tool_use_id);
    }

    public final String getConversation_id() {
        return this.conversation_id;
    }

    public final Map<String, Integer> getError_type_counts() {
        return this.error_type_counts;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_app_use_partially_completed";
    }

    public final int getFailure_count() {
        return this.failure_count;
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final String getOrganization_id() {
        return this.organization_id;
    }

    public final int getSuccess_count() {
        return this.success_count;
    }

    public final String getTool_name() {
        return this.tool_name;
    }

    public final String getTool_use_id() {
        return this.tool_use_id;
    }

    public int hashCode() {
        return this.tool_use_id.hashCode() + kgh.l(kgh.l(kgh.l(ebh.g(vb7.c(this.failure_count, vb7.c(this.success_count, this.tool_name.hashCode() * 31, 31), 31), 31, this.error_type_counts), 31, this.message_id), 31, this.conversation_id), 31, this.organization_id);
    }

    public String toString() {
        String str = this.tool_name;
        int i = this.success_count;
        int i2 = this.failure_count;
        Map<String, Integer> map = this.error_type_counts;
        String str2 = this.message_id;
        String str3 = this.conversation_id;
        String str4 = this.organization_id;
        String str5 = this.tool_use_id;
        StringBuilder sbP = ij0.p("MobileAppUsePartiallyCompleted(tool_name=", str, i, ", success_count=", ", failure_count=");
        sbP.append(i2);
        sbP.append(", error_type_counts=");
        sbP.append(map);
        sbP.append(", message_id=");
        kgh.u(sbP, str2, ", conversation_id=", str3, ", organization_id=");
        return vb7.t(sbP, str4, ", tool_use_id=", str5, ")");
    }

    public /* synthetic */ MobileAppUseEvents$MobileAppUsePartiallyCompleted(int i, String str, int i2, int i3, Map map, String str2, String str3, String str4, String str5, vnf vnfVar) {
        if (255 != (i & 255)) {
            gvj.f(i, 255, slb.a.getDescriptor());
            throw null;
        }
        this.tool_name = str;
        this.success_count = i2;
        this.failure_count = i3;
        this.error_type_counts = map;
        this.message_id = str2;
        this.conversation_id = str3;
        this.organization_id = str4;
        this.tool_use_id = str5;
    }
}
