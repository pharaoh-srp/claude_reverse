package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.e79;
import defpackage.eb5;
import defpackage.fb5;
import defpackage.gvj;
import defpackage.h85;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.xka;
import defpackage.yb5;
import defpackage.znf;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EFBS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010Bk\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010 J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010 J\u0012\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010 J\u0012\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b*\u0010+Jl\u0010,\u001a\u00020\u00152\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010 J\u0010\u0010/\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u00020\r2\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b;\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b<\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b>\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b?\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bA\u0010+R\u0014\u0010C\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010 ¨\u0006G"}, d2 = {"com/anthropic/claude/analytics/events/CronetAnalyticsEvents$RequestFailed", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "endpoint", "Lcom/anthropic/claude/analytics/events/CronetAnalyticsEvents$RequestFailureReason;", "reason", "", "error_code", "error_type", "error_message", "", "duration_ms", "protocol", "", "experiment_enabled", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/analytics/events/CronetAnalyticsEvents$RequestFailureReason;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/analytics/events/CronetAnalyticsEvents$RequestFailureReason;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/CronetAnalyticsEvents$RequestFailed;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/CronetAnalyticsEvents$RequestFailed;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/analytics/events/CronetAnalyticsEvents$RequestFailureReason;", "component3", "()Ljava/lang/Integer;", "component4", "component5", "component6", "()Ljava/lang/Long;", "component7", "component8", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/analytics/events/CronetAnalyticsEvents$RequestFailureReason;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/anthropic/claude/analytics/events/CronetAnalyticsEvents$RequestFailed;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEndpoint", "Lcom/anthropic/claude/analytics/events/CronetAnalyticsEvents$RequestFailureReason;", "getReason", "Ljava/lang/Integer;", "getError_code", "getError_type", "getError_message", "Ljava/lang/Long;", "getDuration_ms", "getProtocol", "Ljava/lang/Boolean;", "getExperiment_enabled", "getEventName", "eventName", "Companion", "eb5", "fb5", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CronetAnalyticsEvents$RequestFailed implements AnalyticsEvent {
    public static final int $stable = 0;
    private final Long duration_ms;
    private final String endpoint;
    private final Integer error_code;
    private final String error_message;
    private final String error_type;
    private final Boolean experiment_enabled;
    private final String protocol;
    private final CronetAnalyticsEvents$RequestFailureReason reason;
    public static final fb5 Companion = new fb5();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new h85(1)), null, null, null, null, null, null};

    public /* synthetic */ CronetAnalyticsEvents$RequestFailed(int i, String str, CronetAnalyticsEvents$RequestFailureReason cronetAnalyticsEvents$RequestFailureReason, Integer num, String str2, String str3, Long l, String str4, Boolean bool, vnf vnfVar) {
        if (255 != (i & 255)) {
            gvj.f(i, 255, eb5.a.getDescriptor());
            throw null;
        }
        this.endpoint = str;
        this.reason = cronetAnalyticsEvents$RequestFailureReason;
        this.error_code = num;
        this.error_type = str2;
        this.error_message = str3;
        this.duration_ms = l;
        this.protocol = str4;
        this.experiment_enabled = bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return CronetAnalyticsEvents$RequestFailureReason.Companion.serializer();
    }

    public static /* synthetic */ CronetAnalyticsEvents$RequestFailed copy$default(CronetAnalyticsEvents$RequestFailed cronetAnalyticsEvents$RequestFailed, String str, CronetAnalyticsEvents$RequestFailureReason cronetAnalyticsEvents$RequestFailureReason, Integer num, String str2, String str3, Long l, String str4, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cronetAnalyticsEvents$RequestFailed.endpoint;
        }
        if ((i & 2) != 0) {
            cronetAnalyticsEvents$RequestFailureReason = cronetAnalyticsEvents$RequestFailed.reason;
        }
        if ((i & 4) != 0) {
            num = cronetAnalyticsEvents$RequestFailed.error_code;
        }
        if ((i & 8) != 0) {
            str2 = cronetAnalyticsEvents$RequestFailed.error_type;
        }
        if ((i & 16) != 0) {
            str3 = cronetAnalyticsEvents$RequestFailed.error_message;
        }
        if ((i & 32) != 0) {
            l = cronetAnalyticsEvents$RequestFailed.duration_ms;
        }
        if ((i & 64) != 0) {
            str4 = cronetAnalyticsEvents$RequestFailed.protocol;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            bool = cronetAnalyticsEvents$RequestFailed.experiment_enabled;
        }
        String str5 = str4;
        Boolean bool2 = bool;
        String str6 = str3;
        Long l2 = l;
        return cronetAnalyticsEvents$RequestFailed.copy(str, cronetAnalyticsEvents$RequestFailureReason, num, str2, str6, l2, str5, bool2);
    }

    public static final /* synthetic */ void write$Self$analytics(CronetAnalyticsEvents$RequestFailed self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.endpoint);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.reason);
        output.B(serialDesc, 2, e79.a, self.error_code);
        srg srgVar = srg.a;
        output.B(serialDesc, 3, srgVar, self.error_type);
        output.B(serialDesc, 4, srgVar, self.error_message);
        output.B(serialDesc, 5, xka.a, self.duration_ms);
        output.B(serialDesc, 6, srgVar, self.protocol);
        output.B(serialDesc, 7, zt1.a, self.experiment_enabled);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEndpoint() {
        return this.endpoint;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CronetAnalyticsEvents$RequestFailureReason getReason() {
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

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getProtocol() {
        return this.protocol;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getExperiment_enabled() {
        return this.experiment_enabled;
    }

    public final CronetAnalyticsEvents$RequestFailed copy(String endpoint, CronetAnalyticsEvents$RequestFailureReason reason, Integer error_code, String error_type, String error_message, Long duration_ms, String protocol, Boolean experiment_enabled) {
        endpoint.getClass();
        reason.getClass();
        return new CronetAnalyticsEvents$RequestFailed(endpoint, reason, error_code, error_type, error_message, duration_ms, protocol, experiment_enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CronetAnalyticsEvents$RequestFailed)) {
            return false;
        }
        CronetAnalyticsEvents$RequestFailed cronetAnalyticsEvents$RequestFailed = (CronetAnalyticsEvents$RequestFailed) other;
        return x44.r(this.endpoint, cronetAnalyticsEvents$RequestFailed.endpoint) && this.reason == cronetAnalyticsEvents$RequestFailed.reason && x44.r(this.error_code, cronetAnalyticsEvents$RequestFailed.error_code) && x44.r(this.error_type, cronetAnalyticsEvents$RequestFailed.error_type) && x44.r(this.error_message, cronetAnalyticsEvents$RequestFailed.error_message) && x44.r(this.duration_ms, cronetAnalyticsEvents$RequestFailed.duration_ms) && x44.r(this.protocol, cronetAnalyticsEvents$RequestFailed.protocol) && x44.r(this.experiment_enabled, cronetAnalyticsEvents$RequestFailed.experiment_enabled);
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
        return "claudeai.networking.cronet.request_failed";
    }

    public final Boolean getExperiment_enabled() {
        return this.experiment_enabled;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final CronetAnalyticsEvents$RequestFailureReason getReason() {
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
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.protocol;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.experiment_enabled;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "RequestFailed(endpoint=" + this.endpoint + ", reason=" + this.reason + ", error_code=" + this.error_code + ", error_type=" + this.error_type + ", error_message=" + this.error_message + ", duration_ms=" + this.duration_ms + ", protocol=" + this.protocol + ", experiment_enabled=" + this.experiment_enabled + ")";
    }

    public CronetAnalyticsEvents$RequestFailed(String str, CronetAnalyticsEvents$RequestFailureReason cronetAnalyticsEvents$RequestFailureReason, Integer num, String str2, String str3, Long l, String str4, Boolean bool) {
        str.getClass();
        cronetAnalyticsEvents$RequestFailureReason.getClass();
        this.endpoint = str;
        this.reason = cronetAnalyticsEvents$RequestFailureReason;
        this.error_code = num;
        this.error_type = str2;
        this.error_message = str3;
        this.duration_ms = l;
        this.protocol = str4;
        this.experiment_enabled = bool;
    }
}
