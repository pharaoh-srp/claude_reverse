package com.anthropic.claude.analytics.events;

import defpackage.c2c;
import defpackage.d2c;
import defpackage.e79;
import defpackage.gvj;
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
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=>BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%JT\u0010&\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b6\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b7\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010%R\u0014\u0010;\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u001d¨\u0006?"}, d2 = {"com/anthropic/claude/analytics/events/NetworkingEvents$RequestFailed", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "endpoint", "Lcom/anthropic/claude/analytics/events/NetworkingEvents$RequestFailureReason;", "reason", "", "error_code", "error_type", "error_message", "", "duration_ms", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/analytics/events/NetworkingEvents$RequestFailureReason;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/analytics/events/NetworkingEvents$RequestFailureReason;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/NetworkingEvents$RequestFailed;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/NetworkingEvents$RequestFailed;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/analytics/events/NetworkingEvents$RequestFailureReason;", "component3", "()Ljava/lang/Integer;", "component4", "component5", "component6", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/analytics/events/NetworkingEvents$RequestFailureReason;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/anthropic/claude/analytics/events/NetworkingEvents$RequestFailed;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEndpoint", "Lcom/anthropic/claude/analytics/events/NetworkingEvents$RequestFailureReason;", "getReason", "Ljava/lang/Integer;", "getError_code", "getError_type", "getError_message", "Ljava/lang/Long;", "getDuration_ms", "getEventName", "eventName", "Companion", "c2c", "d2c", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class NetworkingEvents$RequestFailed implements AnalyticsEvent {
    public static final int $stable = 0;
    private final Long duration_ms;
    private final String endpoint;
    private final Integer error_code;
    private final String error_message;
    private final String error_type;
    private final NetworkingEvents$RequestFailureReason reason;
    public static final d2c Companion = new d2c();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new ulb(29)), null, null, null, null};

    public /* synthetic */ NetworkingEvents$RequestFailed(int i, String str, NetworkingEvents$RequestFailureReason networkingEvents$RequestFailureReason, Integer num, String str2, String str3, Long l, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, c2c.a.getDescriptor());
            throw null;
        }
        this.endpoint = str;
        this.reason = networkingEvents$RequestFailureReason;
        if ((i & 4) == 0) {
            this.error_code = null;
        } else {
            this.error_code = num;
        }
        if ((i & 8) == 0) {
            this.error_type = null;
        } else {
            this.error_type = str2;
        }
        if ((i & 16) == 0) {
            this.error_message = null;
        } else {
            this.error_message = str3;
        }
        if ((i & 32) == 0) {
            this.duration_ms = null;
        } else {
            this.duration_ms = l;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return NetworkingEvents$RequestFailureReason.Companion.serializer();
    }

    public static /* synthetic */ NetworkingEvents$RequestFailed copy$default(NetworkingEvents$RequestFailed networkingEvents$RequestFailed, String str, NetworkingEvents$RequestFailureReason networkingEvents$RequestFailureReason, Integer num, String str2, String str3, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkingEvents$RequestFailed.endpoint;
        }
        if ((i & 2) != 0) {
            networkingEvents$RequestFailureReason = networkingEvents$RequestFailed.reason;
        }
        if ((i & 4) != 0) {
            num = networkingEvents$RequestFailed.error_code;
        }
        if ((i & 8) != 0) {
            str2 = networkingEvents$RequestFailed.error_type;
        }
        if ((i & 16) != 0) {
            str3 = networkingEvents$RequestFailed.error_message;
        }
        if ((i & 32) != 0) {
            l = networkingEvents$RequestFailed.duration_ms;
        }
        String str4 = str3;
        Long l2 = l;
        return networkingEvents$RequestFailed.copy(str, networkingEvents$RequestFailureReason, num, str2, str4, l2);
    }

    public static final /* synthetic */ void write$Self$analytics(NetworkingEvents$RequestFailed self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.endpoint);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.reason);
        if (output.E(serialDesc) || self.error_code != null) {
            output.B(serialDesc, 2, e79.a, self.error_code);
        }
        if (output.E(serialDesc) || self.error_type != null) {
            output.B(serialDesc, 3, srg.a, self.error_type);
        }
        if (output.E(serialDesc) || self.error_message != null) {
            output.B(serialDesc, 4, srg.a, self.error_message);
        }
        if (!output.E(serialDesc) && self.duration_ms == null) {
            return;
        }
        output.B(serialDesc, 5, xka.a, self.duration_ms);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEndpoint() {
        return this.endpoint;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NetworkingEvents$RequestFailureReason getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getError_code() {
        return this.error_code;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getError_type() {
        return this.error_type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getError_message() {
        return this.error_message;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getDuration_ms() {
        return this.duration_ms;
    }

    public final NetworkingEvents$RequestFailed copy(String endpoint, NetworkingEvents$RequestFailureReason reason, Integer error_code, String error_type, String error_message, Long duration_ms) {
        endpoint.getClass();
        reason.getClass();
        return new NetworkingEvents$RequestFailed(endpoint, reason, error_code, error_type, error_message, duration_ms);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkingEvents$RequestFailed)) {
            return false;
        }
        NetworkingEvents$RequestFailed networkingEvents$RequestFailed = (NetworkingEvents$RequestFailed) other;
        return x44.r(this.endpoint, networkingEvents$RequestFailed.endpoint) && this.reason == networkingEvents$RequestFailed.reason && x44.r(this.error_code, networkingEvents$RequestFailed.error_code) && x44.r(this.error_type, networkingEvents$RequestFailed.error_type) && x44.r(this.error_message, networkingEvents$RequestFailed.error_message) && x44.r(this.duration_ms, networkingEvents$RequestFailed.duration_ms);
    }

    public final Long getDuration_ms() {
        return this.duration_ms;
    }

    public final String getEndpoint() {
        return this.endpoint;
    }

    public final Integer getError_code() {
        return this.error_code;
    }

    public final String getError_message() {
        return this.error_message;
    }

    public final String getError_type() {
        return this.error_type;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile.networking.request_failed";
    }

    public final NetworkingEvents$RequestFailureReason getReason() {
        return this.reason;
    }

    public int hashCode() {
        int iHashCode = (this.reason.hashCode() + (this.endpoint.hashCode() * 31)) * 31;
        Integer num = this.error_code;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.error_type;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.error_message;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.duration_ms;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        return "RequestFailed(endpoint=" + this.endpoint + ", reason=" + this.reason + ", error_code=" + this.error_code + ", error_type=" + this.error_type + ", error_message=" + this.error_message + ", duration_ms=" + this.duration_ms + ")";
    }

    public NetworkingEvents$RequestFailed(String str, NetworkingEvents$RequestFailureReason networkingEvents$RequestFailureReason, Integer num, String str2, String str3, Long l) {
        str.getClass();
        networkingEvents$RequestFailureReason.getClass();
        this.endpoint = str;
        this.reason = networkingEvents$RequestFailureReason;
        this.error_code = num;
        this.error_type = str2;
        this.error_message = str3;
        this.duration_ms = l;
    }

    public /* synthetic */ NetworkingEvents$RequestFailed(String str, NetworkingEvents$RequestFailureReason networkingEvents$RequestFailureReason, Integer num, String str2, String str3, Long l, int i, mq5 mq5Var) {
        this(str, networkingEvents$RequestFailureReason, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : l);
    }
}
