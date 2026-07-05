package com.anthropic.claude.analytics.events;

import defpackage.grc;
import defpackage.gvj;
import defpackage.inh;
import defpackage.jnh;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ.\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u0014\u0010-\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0019¨\u00061"}, d2 = {"com/anthropic/claude/analytics/events/ThirdPartyToolEvents$ThirdPartyToolExecuted", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "provider_package", "tool_name", "", "duration_ms", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;JLvnf;)V", "Lcom/anthropic/claude/analytics/events/ThirdPartyToolEvents$ThirdPartyToolExecuted;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ThirdPartyToolEvents$ThirdPartyToolExecuted;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()J", "copy", "(Ljava/lang/String;Ljava/lang/String;J)Lcom/anthropic/claude/analytics/events/ThirdPartyToolEvents$ThirdPartyToolExecuted;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProvider_package", "getTool_name", "J", "getDuration_ms", "getEventName", "eventName", "Companion", "inh", "jnh", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ThirdPartyToolEvents$ThirdPartyToolExecuted implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final jnh Companion = new jnh();
    private final long duration_ms;
    private final String provider_package;
    private final String tool_name;

    public /* synthetic */ ThirdPartyToolEvents$ThirdPartyToolExecuted(int i, String str, String str2, long j, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, inh.a.getDescriptor());
            throw null;
        }
        this.provider_package = str;
        this.tool_name = str2;
        this.duration_ms = j;
    }

    public static /* synthetic */ ThirdPartyToolEvents$ThirdPartyToolExecuted copy$default(ThirdPartyToolEvents$ThirdPartyToolExecuted thirdPartyToolEvents$ThirdPartyToolExecuted, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = thirdPartyToolEvents$ThirdPartyToolExecuted.provider_package;
        }
        if ((i & 2) != 0) {
            str2 = thirdPartyToolEvents$ThirdPartyToolExecuted.tool_name;
        }
        if ((i & 4) != 0) {
            j = thirdPartyToolEvents$ThirdPartyToolExecuted.duration_ms;
        }
        return thirdPartyToolEvents$ThirdPartyToolExecuted.copy(str, str2, j);
    }

    public static final /* synthetic */ void write$Self$analytics(ThirdPartyToolEvents$ThirdPartyToolExecuted self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.provider_package);
        output.q(serialDesc, 1, self.tool_name);
        output.D(serialDesc, 2, self.duration_ms);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProvider_package() {
        return this.provider_package;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTool_name() {
        return this.tool_name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getDuration_ms() {
        return this.duration_ms;
    }

    public final ThirdPartyToolEvents$ThirdPartyToolExecuted copy(String provider_package, String tool_name, long duration_ms) {
        provider_package.getClass();
        tool_name.getClass();
        return new ThirdPartyToolEvents$ThirdPartyToolExecuted(provider_package, tool_name, duration_ms);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThirdPartyToolEvents$ThirdPartyToolExecuted)) {
            return false;
        }
        ThirdPartyToolEvents$ThirdPartyToolExecuted thirdPartyToolEvents$ThirdPartyToolExecuted = (ThirdPartyToolEvents$ThirdPartyToolExecuted) other;
        return x44.r(this.provider_package, thirdPartyToolEvents$ThirdPartyToolExecuted.provider_package) && x44.r(this.tool_name, thirdPartyToolEvents$ThirdPartyToolExecuted.tool_name) && this.duration_ms == thirdPartyToolEvents$ThirdPartyToolExecuted.duration_ms;
    }

    public final long getDuration_ms() {
        return this.duration_ms;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.tool.thirdparty.executed";
    }

    public final String getProvider_package() {
        return this.provider_package;
    }

    public final String getTool_name() {
        return this.tool_name;
    }

    public int hashCode() {
        return Long.hashCode(this.duration_ms) + kgh.l(this.provider_package.hashCode() * 31, 31, this.tool_name);
    }

    public String toString() {
        return grc.r(this.duration_ms, ")", kgh.r("ThirdPartyToolExecuted(provider_package=", this.provider_package, ", tool_name=", this.tool_name, ", duration_ms="));
    }

    public ThirdPartyToolEvents$ThirdPartyToolExecuted(String str, String str2, long j) {
        str.getClass();
        str2.getClass();
        this.provider_package = str;
        this.tool_name = str2;
        this.duration_ms = j;
    }
}
