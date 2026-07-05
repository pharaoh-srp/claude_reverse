package com.anthropic.claude.analytics.events;

import defpackage.e79;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.ryd;
import defpackage.srg;
import defpackage.syd;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.zcd;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ2\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001dR\u0014\u0010/\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u001d¨\u00063"}, d2 = {"com/anthropic/claude/analytics/events/PushEvents$PushRegistrationFailure", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "Lcom/anthropic/claude/analytics/events/PushEvents$FailureCause;", "failure_cause", "", "http_error_code", "", "error_message", "<init>", "(Lcom/anthropic/claude/analytics/events/PushEvents$FailureCause;Ljava/lang/Integer;Ljava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/analytics/events/PushEvents$FailureCause;Ljava/lang/Integer;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/PushEvents$PushRegistrationFailure;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/PushEvents$PushRegistrationFailure;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/analytics/events/PushEvents$FailureCause;", "component2", "()Ljava/lang/Integer;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/anthropic/claude/analytics/events/PushEvents$FailureCause;Ljava/lang/Integer;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/PushEvents$PushRegistrationFailure;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/analytics/events/PushEvents$FailureCause;", "getFailure_cause", "Ljava/lang/Integer;", "getHttp_error_code", "Ljava/lang/String;", "getError_message", "getEventName", "eventName", "Companion", "ryd", "syd", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class PushEvents$PushRegistrationFailure implements AnalyticsEvent {
    public static final int $stable = 0;
    private final String error_message;
    private final PushEvents$FailureCause failure_cause;
    private final Integer http_error_code;
    public static final syd Companion = new syd();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new zcd(3)), null, null};

    public /* synthetic */ PushEvents$PushRegistrationFailure(int i, PushEvents$FailureCause pushEvents$FailureCause, Integer num, String str, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, ryd.a.getDescriptor());
            throw null;
        }
        this.failure_cause = pushEvents$FailureCause;
        if ((i & 2) == 0) {
            this.http_error_code = null;
        } else {
            this.http_error_code = num;
        }
        if ((i & 4) == 0) {
            this.error_message = null;
        } else {
            this.error_message = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return PushEvents$FailureCause.Companion.serializer();
    }

    public static /* synthetic */ PushEvents$PushRegistrationFailure copy$default(PushEvents$PushRegistrationFailure pushEvents$PushRegistrationFailure, PushEvents$FailureCause pushEvents$FailureCause, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            pushEvents$FailureCause = pushEvents$PushRegistrationFailure.failure_cause;
        }
        if ((i & 2) != 0) {
            num = pushEvents$PushRegistrationFailure.http_error_code;
        }
        if ((i & 4) != 0) {
            str = pushEvents$PushRegistrationFailure.error_message;
        }
        return pushEvents$PushRegistrationFailure.copy(pushEvents$FailureCause, num, str);
    }

    public static final /* synthetic */ void write$Self$analytics(PushEvents$PushRegistrationFailure self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.failure_cause);
        if (output.E(serialDesc) || self.http_error_code != null) {
            output.B(serialDesc, 1, e79.a, self.http_error_code);
        }
        if (!output.E(serialDesc) && self.error_message == null) {
            return;
        }
        output.B(serialDesc, 2, srg.a, self.error_message);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PushEvents$FailureCause getFailure_cause() {
        return this.failure_cause;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getHttp_error_code() {
        return this.http_error_code;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getError_message() {
        return this.error_message;
    }

    public final PushEvents$PushRegistrationFailure copy(PushEvents$FailureCause failure_cause, Integer http_error_code, String error_message) {
        failure_cause.getClass();
        return new PushEvents$PushRegistrationFailure(failure_cause, http_error_code, error_message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushEvents$PushRegistrationFailure)) {
            return false;
        }
        PushEvents$PushRegistrationFailure pushEvents$PushRegistrationFailure = (PushEvents$PushRegistrationFailure) other;
        return this.failure_cause == pushEvents$PushRegistrationFailure.failure_cause && x44.r(this.http_error_code, pushEvents$PushRegistrationFailure.http_error_code) && x44.r(this.error_message, pushEvents$PushRegistrationFailure.error_message);
    }

    public final String getError_message() {
        return this.error_message;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile.push.registration_failure";
    }

    public final PushEvents$FailureCause getFailure_cause() {
        return this.failure_cause;
    }

    public final Integer getHttp_error_code() {
        return this.http_error_code;
    }

    public int hashCode() {
        int iHashCode = this.failure_cause.hashCode() * 31;
        Integer num = this.http_error_code;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.error_message;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        PushEvents$FailureCause pushEvents$FailureCause = this.failure_cause;
        Integer num = this.http_error_code;
        String str = this.error_message;
        StringBuilder sb = new StringBuilder("PushRegistrationFailure(failure_cause=");
        sb.append(pushEvents$FailureCause);
        sb.append(", http_error_code=");
        sb.append(num);
        sb.append(", error_message=");
        return ij0.m(sb, str, ")");
    }

    public PushEvents$PushRegistrationFailure(PushEvents$FailureCause pushEvents$FailureCause, Integer num, String str) {
        pushEvents$FailureCause.getClass();
        this.failure_cause = pushEvents$FailureCause;
        this.http_error_code = num;
        this.error_message = str;
    }

    public /* synthetic */ PushEvents$PushRegistrationFailure(PushEvents$FailureCause pushEvents$FailureCause, Integer num, String str, int i, mq5 mq5Var) {
        this(pushEvents$FailureCause, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str);
    }
}
