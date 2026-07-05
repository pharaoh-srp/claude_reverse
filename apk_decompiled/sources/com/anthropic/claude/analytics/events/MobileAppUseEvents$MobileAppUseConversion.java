package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.olb;
import defpackage.onf;
import defpackage.plb;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0014\u0010$\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0016¨\u0006("}, d2 = {"com/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUseConversion", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "tool_name", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUseConversion;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUseConversion;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUseConversion;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTool_name", "getEventName", "eventName", "Companion", "olb", "plb", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MobileAppUseEvents$MobileAppUseConversion implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final plb Companion = new plb();
    private final String tool_name;

    public /* synthetic */ MobileAppUseEvents$MobileAppUseConversion(int i, String str, vnf vnfVar) {
        if (1 == (i & 1)) {
            this.tool_name = str;
        } else {
            gvj.f(i, 1, olb.a.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ MobileAppUseEvents$MobileAppUseConversion copy$default(MobileAppUseEvents$MobileAppUseConversion mobileAppUseEvents$MobileAppUseConversion, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mobileAppUseEvents$MobileAppUseConversion.tool_name;
        }
        return mobileAppUseEvents$MobileAppUseConversion.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTool_name() {
        return this.tool_name;
    }

    public final MobileAppUseEvents$MobileAppUseConversion copy(String tool_name) {
        tool_name.getClass();
        return new MobileAppUseEvents$MobileAppUseConversion(tool_name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MobileAppUseEvents$MobileAppUseConversion) && x44.r(this.tool_name, ((MobileAppUseEvents$MobileAppUseConversion) other).tool_name);
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_app_use_conversion";
    }

    public final String getTool_name() {
        return this.tool_name;
    }

    public int hashCode() {
        return this.tool_name.hashCode();
    }

    public String toString() {
        return ij0.j("MobileAppUseConversion(tool_name=", this.tool_name, ")");
    }

    public MobileAppUseEvents$MobileAppUseConversion(String str) {
        str.getClass();
        this.tool_name = str;
    }
}
