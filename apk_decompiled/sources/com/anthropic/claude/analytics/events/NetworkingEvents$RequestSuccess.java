package com.anthropic.claude.analytics.events;

import defpackage.g2c;
import defpackage.gvj;
import defpackage.h2c;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b!\u0010\u001dJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001dR\u0014\u0010.\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0019¨\u00062"}, d2 = {"com/anthropic/claude/analytics/events/NetworkingEvents$RequestSuccess", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "endpoint", "", "duration_ms", "", "status_code", "<init>", "(Ljava/lang/String;JI)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;JILvnf;)V", "Lcom/anthropic/claude/analytics/events/NetworkingEvents$RequestSuccess;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/NetworkingEvents$RequestSuccess;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "()I", "copy", "(Ljava/lang/String;JI)Lcom/anthropic/claude/analytics/events/NetworkingEvents$RequestSuccess;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEndpoint", "J", "getDuration_ms", "I", "getStatus_code", "getEventName", "eventName", "Companion", "g2c", "h2c", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class NetworkingEvents$RequestSuccess implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final h2c Companion = new h2c();
    private final long duration_ms;
    private final String endpoint;
    private final int status_code;

    public /* synthetic */ NetworkingEvents$RequestSuccess(int i, String str, long j, int i2, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, g2c.a.getDescriptor());
            throw null;
        }
        this.endpoint = str;
        this.duration_ms = j;
        this.status_code = i2;
    }

    public static /* synthetic */ NetworkingEvents$RequestSuccess copy$default(NetworkingEvents$RequestSuccess networkingEvents$RequestSuccess, String str, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = networkingEvents$RequestSuccess.endpoint;
        }
        if ((i2 & 2) != 0) {
            j = networkingEvents$RequestSuccess.duration_ms;
        }
        if ((i2 & 4) != 0) {
            i = networkingEvents$RequestSuccess.status_code;
        }
        return networkingEvents$RequestSuccess.copy(str, j, i);
    }

    public static final /* synthetic */ void write$Self$analytics(NetworkingEvents$RequestSuccess self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.endpoint);
        output.D(serialDesc, 1, self.duration_ms);
        output.l(2, self.status_code, serialDesc);
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

    public final NetworkingEvents$RequestSuccess copy(String endpoint, long duration_ms, int status_code) {
        endpoint.getClass();
        return new NetworkingEvents$RequestSuccess(endpoint, duration_ms, status_code);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkingEvents$RequestSuccess)) {
            return false;
        }
        NetworkingEvents$RequestSuccess networkingEvents$RequestSuccess = (NetworkingEvents$RequestSuccess) other;
        return x44.r(this.endpoint, networkingEvents$RequestSuccess.endpoint) && this.duration_ms == networkingEvents$RequestSuccess.duration_ms && this.status_code == networkingEvents$RequestSuccess.status_code;
    }

    public final long getDuration_ms() {
        return this.duration_ms;
    }

    public final String getEndpoint() {
        return this.endpoint;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile.networking.request_success";
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public int hashCode() {
        return Integer.hashCode(this.status_code) + vb7.e(this.endpoint.hashCode() * 31, 31, this.duration_ms);
    }

    public String toString() {
        String str = this.endpoint;
        long j = this.duration_ms;
        int i = this.status_code;
        StringBuilder sbW = vb7.w("RequestSuccess(endpoint=", str, ", duration_ms=", j);
        sbW.append(", status_code=");
        sbW.append(i);
        sbW.append(")");
        return sbW.toString();
    }

    public NetworkingEvents$RequestSuccess(String str, long j, int i) {
        str.getClass();
        this.endpoint = str;
        this.duration_ms = j;
        this.status_code = i;
    }
}
