package com.anthropic.claude.analytics.events;

import defpackage.grc;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.knh;
import defpackage.lnh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J.\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0018R\u0014\u0010*\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0018¨\u0006."}, d2 = {"com/anthropic/claude/analytics/events/ThirdPartyToolEvents$ThirdPartyToolExecutionFailed", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "provider_package", "tool_name", "failure_type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ThirdPartyToolEvents$ThirdPartyToolExecutionFailed;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ThirdPartyToolEvents$ThirdPartyToolExecutionFailed;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/ThirdPartyToolEvents$ThirdPartyToolExecutionFailed;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProvider_package", "getTool_name", "getFailure_type", "getEventName", "eventName", "Companion", "knh", "lnh", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ThirdPartyToolEvents$ThirdPartyToolExecutionFailed implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final lnh Companion = new lnh();
    private final String failure_type;
    private final String provider_package;
    private final String tool_name;

    public /* synthetic */ ThirdPartyToolEvents$ThirdPartyToolExecutionFailed(int i, String str, String str2, String str3, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, knh.a.getDescriptor());
            throw null;
        }
        this.provider_package = str;
        this.tool_name = str2;
        this.failure_type = str3;
    }

    public static /* synthetic */ ThirdPartyToolEvents$ThirdPartyToolExecutionFailed copy$default(ThirdPartyToolEvents$ThirdPartyToolExecutionFailed thirdPartyToolEvents$ThirdPartyToolExecutionFailed, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = thirdPartyToolEvents$ThirdPartyToolExecutionFailed.provider_package;
        }
        if ((i & 2) != 0) {
            str2 = thirdPartyToolEvents$ThirdPartyToolExecutionFailed.tool_name;
        }
        if ((i & 4) != 0) {
            str3 = thirdPartyToolEvents$ThirdPartyToolExecutionFailed.failure_type;
        }
        return thirdPartyToolEvents$ThirdPartyToolExecutionFailed.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$analytics(ThirdPartyToolEvents$ThirdPartyToolExecutionFailed self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.provider_package);
        output.q(serialDesc, 1, self.tool_name);
        output.q(serialDesc, 2, self.failure_type);
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
    public final String getFailure_type() {
        return this.failure_type;
    }

    public final ThirdPartyToolEvents$ThirdPartyToolExecutionFailed copy(String provider_package, String tool_name, String failure_type) {
        provider_package.getClass();
        tool_name.getClass();
        failure_type.getClass();
        return new ThirdPartyToolEvents$ThirdPartyToolExecutionFailed(provider_package, tool_name, failure_type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThirdPartyToolEvents$ThirdPartyToolExecutionFailed)) {
            return false;
        }
        ThirdPartyToolEvents$ThirdPartyToolExecutionFailed thirdPartyToolEvents$ThirdPartyToolExecutionFailed = (ThirdPartyToolEvents$ThirdPartyToolExecutionFailed) other;
        return x44.r(this.provider_package, thirdPartyToolEvents$ThirdPartyToolExecutionFailed.provider_package) && x44.r(this.tool_name, thirdPartyToolEvents$ThirdPartyToolExecutionFailed.tool_name) && x44.r(this.failure_type, thirdPartyToolEvents$ThirdPartyToolExecutionFailed.failure_type);
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.tool.thirdparty.execution_failed";
    }

    public final String getFailure_type() {
        return this.failure_type;
    }

    public final String getProvider_package() {
        return this.provider_package;
    }

    public final String getTool_name() {
        return this.tool_name;
    }

    public int hashCode() {
        return this.failure_type.hashCode() + kgh.l(this.provider_package.hashCode() * 31, 31, this.tool_name);
    }

    public String toString() {
        String str = this.provider_package;
        String str2 = this.tool_name;
        return ij0.m(kgh.r("ThirdPartyToolExecutionFailed(provider_package=", str, ", tool_name=", str2, ", failure_type="), this.failure_type, ")");
    }

    public ThirdPartyToolEvents$ThirdPartyToolExecutionFailed(String str, String str2, String str3) {
        grc.B(str, str2, str3);
        this.provider_package = str;
        this.tool_name = str2;
        this.failure_type = str3;
    }
}
