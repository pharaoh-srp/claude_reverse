package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.hb5;
import defpackage.ib5;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JD\u0010$\u001a\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b'\u0010 J\u001a\u0010*\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010 R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b2\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010#R\u0014\u00106\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u001c¨\u0006:"}, d2 = {"com/anthropic/claude/analytics/events/CronetAnalyticsEvents$RequestSuccess", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "endpoint", "", "duration_ms", "", "status_code", "protocol", "", "experiment_enabled", "<init>", "(Ljava/lang/String;JILjava/lang/String;Ljava/lang/Boolean;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;JILjava/lang/String;Ljava/lang/Boolean;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/CronetAnalyticsEvents$RequestSuccess;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/CronetAnalyticsEvents$RequestSuccess;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "()I", "component4", "component5", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;JILjava/lang/String;Ljava/lang/Boolean;)Lcom/anthropic/claude/analytics/events/CronetAnalyticsEvents$RequestSuccess;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEndpoint", "J", "getDuration_ms", "I", "getStatus_code", "getProtocol", "Ljava/lang/Boolean;", "getExperiment_enabled", "getEventName", "eventName", "Companion", "hb5", "ib5", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CronetAnalyticsEvents$RequestSuccess implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final ib5 Companion = new ib5();
    private final long duration_ms;
    private final String endpoint;
    private final Boolean experiment_enabled;
    private final String protocol;
    private final int status_code;

    public /* synthetic */ CronetAnalyticsEvents$RequestSuccess(int i, String str, long j, int i2, String str2, Boolean bool, vnf vnfVar) {
        if (31 != (i & 31)) {
            gvj.f(i, 31, hb5.a.getDescriptor());
            throw null;
        }
        this.endpoint = str;
        this.duration_ms = j;
        this.status_code = i2;
        this.protocol = str2;
        this.experiment_enabled = bool;
    }

    public static /* synthetic */ CronetAnalyticsEvents$RequestSuccess copy$default(CronetAnalyticsEvents$RequestSuccess cronetAnalyticsEvents$RequestSuccess, String str, long j, int i, String str2, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cronetAnalyticsEvents$RequestSuccess.endpoint;
        }
        if ((i2 & 2) != 0) {
            j = cronetAnalyticsEvents$RequestSuccess.duration_ms;
        }
        if ((i2 & 4) != 0) {
            i = cronetAnalyticsEvents$RequestSuccess.status_code;
        }
        if ((i2 & 8) != 0) {
            str2 = cronetAnalyticsEvents$RequestSuccess.protocol;
        }
        if ((i2 & 16) != 0) {
            bool = cronetAnalyticsEvents$RequestSuccess.experiment_enabled;
        }
        Boolean bool2 = bool;
        int i3 = i;
        return cronetAnalyticsEvents$RequestSuccess.copy(str, j, i3, str2, bool2);
    }

    public static final /* synthetic */ void write$Self$analytics(CronetAnalyticsEvents$RequestSuccess self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.endpoint);
        output.D(serialDesc, 1, self.duration_ms);
        output.l(2, self.status_code, serialDesc);
        output.q(serialDesc, 3, self.protocol);
        output.B(serialDesc, 4, zt1.a, self.experiment_enabled);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEndpoint() {
        return this.endpoint;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getDuration_ms() {
        return this.duration_ms;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStatus_code() {
        return this.status_code;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getProtocol() {
        return this.protocol;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getExperiment_enabled() {
        return this.experiment_enabled;
    }

    public final CronetAnalyticsEvents$RequestSuccess copy(String endpoint, long duration_ms, int status_code, String protocol, Boolean experiment_enabled) {
        endpoint.getClass();
        protocol.getClass();
        return new CronetAnalyticsEvents$RequestSuccess(endpoint, duration_ms, status_code, protocol, experiment_enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CronetAnalyticsEvents$RequestSuccess)) {
            return false;
        }
        CronetAnalyticsEvents$RequestSuccess cronetAnalyticsEvents$RequestSuccess = (CronetAnalyticsEvents$RequestSuccess) other;
        return x44.r(this.endpoint, cronetAnalyticsEvents$RequestSuccess.endpoint) && this.duration_ms == cronetAnalyticsEvents$RequestSuccess.duration_ms && this.status_code == cronetAnalyticsEvents$RequestSuccess.status_code && x44.r(this.protocol, cronetAnalyticsEvents$RequestSuccess.protocol) && x44.r(this.experiment_enabled, cronetAnalyticsEvents$RequestSuccess.experiment_enabled);
    }

    public final long getDuration_ms() {
        return this.duration_ms;
    }

    public final String getEndpoint() {
        return this.endpoint;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.networking.cronet.request_success";
    }

    public final Boolean getExperiment_enabled() {
        return this.experiment_enabled;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public int hashCode() {
        int iL = kgh.l(vb7.c(this.status_code, vb7.e(this.endpoint.hashCode() * 31, 31, this.duration_ms), 31), 31, this.protocol);
        Boolean bool = this.experiment_enabled;
        return iL + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        String str = this.endpoint;
        long j = this.duration_ms;
        int i = this.status_code;
        String str2 = this.protocol;
        Boolean bool = this.experiment_enabled;
        StringBuilder sbW = vb7.w("RequestSuccess(endpoint=", str, ", duration_ms=", j);
        sbW.append(", status_code=");
        sbW.append(i);
        sbW.append(", protocol=");
        sbW.append(str2);
        sbW.append(", experiment_enabled=");
        sbW.append(bool);
        sbW.append(")");
        return sbW.toString();
    }

    public CronetAnalyticsEvents$RequestSuccess(String str, long j, int i, String str2, Boolean bool) {
        str.getClass();
        str2.getClass();
        this.endpoint = str;
        this.duration_ms = j;
        this.status_code = i;
        this.protocol = str2;
        this.experiment_enabled = bool;
    }
}
