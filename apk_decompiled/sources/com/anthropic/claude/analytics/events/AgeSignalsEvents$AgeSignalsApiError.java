package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.j7;
import defpackage.ki;
import defpackage.kw9;
import defpackage.li;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J.\u0010\u001c\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0018J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0018R\u0014\u0010-\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010 ¨\u00061"}, d2 = {"com/anthropic/claude/analytics/events/AgeSignalsEvents$AgeSignalsApiError", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "error_code", "Lcom/anthropic/claude/analytics/events/AgeSignalsEvents$AgeSignalsErrorType;", "error_type", "attempt_number", "<init>", "(ILcom/anthropic/claude/analytics/events/AgeSignalsEvents$AgeSignalsErrorType;I)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IILcom/anthropic/claude/analytics/events/AgeSignalsEvents$AgeSignalsErrorType;ILvnf;)V", "Lcom/anthropic/claude/analytics/events/AgeSignalsEvents$AgeSignalsApiError;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/AgeSignalsEvents$AgeSignalsApiError;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Lcom/anthropic/claude/analytics/events/AgeSignalsEvents$AgeSignalsErrorType;", "component3", "copy", "(ILcom/anthropic/claude/analytics/events/AgeSignalsEvents$AgeSignalsErrorType;I)Lcom/anthropic/claude/analytics/events/AgeSignalsEvents$AgeSignalsApiError;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getError_code", "Lcom/anthropic/claude/analytics/events/AgeSignalsEvents$AgeSignalsErrorType;", "getError_type", "getAttempt_number", "getEventName", "eventName", "Companion", "ki", "li", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class AgeSignalsEvents$AgeSignalsApiError implements AnalyticsEvent {
    public static final int $stable = 0;
    private final int attempt_number;
    private final int error_code;
    private final AgeSignalsEvents$AgeSignalsErrorType error_type;
    public static final li Companion = new li();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new j7(6)), null};

    public /* synthetic */ AgeSignalsEvents$AgeSignalsApiError(int i, int i2, AgeSignalsEvents$AgeSignalsErrorType ageSignalsEvents$AgeSignalsErrorType, int i3, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, ki.a.getDescriptor());
            throw null;
        }
        this.error_code = i2;
        this.error_type = ageSignalsEvents$AgeSignalsErrorType;
        this.attempt_number = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return AgeSignalsEvents$AgeSignalsErrorType.Companion.serializer();
    }

    public static /* synthetic */ AgeSignalsEvents$AgeSignalsApiError copy$default(AgeSignalsEvents$AgeSignalsApiError ageSignalsEvents$AgeSignalsApiError, int i, AgeSignalsEvents$AgeSignalsErrorType ageSignalsEvents$AgeSignalsErrorType, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = ageSignalsEvents$AgeSignalsApiError.error_code;
        }
        if ((i3 & 2) != 0) {
            ageSignalsEvents$AgeSignalsErrorType = ageSignalsEvents$AgeSignalsApiError.error_type;
        }
        if ((i3 & 4) != 0) {
            i2 = ageSignalsEvents$AgeSignalsApiError.attempt_number;
        }
        return ageSignalsEvents$AgeSignalsApiError.copy(i, ageSignalsEvents$AgeSignalsErrorType, i2);
    }

    public static final /* synthetic */ void write$Self$analytics(AgeSignalsEvents$AgeSignalsApiError self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.l(0, self.error_code, serialDesc);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.error_type);
        output.l(2, self.attempt_number, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getError_code() {
        return this.error_code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AgeSignalsEvents$AgeSignalsErrorType getError_type() {
        return this.error_type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAttempt_number() {
        return this.attempt_number;
    }

    public final AgeSignalsEvents$AgeSignalsApiError copy(int error_code, AgeSignalsEvents$AgeSignalsErrorType error_type, int attempt_number) {
        error_type.getClass();
        return new AgeSignalsEvents$AgeSignalsApiError(error_code, error_type, attempt_number);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgeSignalsEvents$AgeSignalsApiError)) {
            return false;
        }
        AgeSignalsEvents$AgeSignalsApiError ageSignalsEvents$AgeSignalsApiError = (AgeSignalsEvents$AgeSignalsApiError) other;
        return this.error_code == ageSignalsEvents$AgeSignalsApiError.error_code && this.error_type == ageSignalsEvents$AgeSignalsApiError.error_type && this.attempt_number == ageSignalsEvents$AgeSignalsApiError.attempt_number;
    }

    public final int getAttempt_number() {
        return this.attempt_number;
    }

    public final int getError_code() {
        return this.error_code;
    }

    public final AgeSignalsEvents$AgeSignalsErrorType getError_type() {
        return this.error_type;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile.age_signals.api_error";
    }

    public int hashCode() {
        return Integer.hashCode(this.attempt_number) + ((this.error_type.hashCode() + (Integer.hashCode(this.error_code) * 31)) * 31);
    }

    public String toString() {
        int i = this.error_code;
        AgeSignalsEvents$AgeSignalsErrorType ageSignalsEvents$AgeSignalsErrorType = this.error_type;
        int i2 = this.attempt_number;
        StringBuilder sb = new StringBuilder("AgeSignalsApiError(error_code=");
        sb.append(i);
        sb.append(", error_type=");
        sb.append(ageSignalsEvents$AgeSignalsErrorType);
        sb.append(", attempt_number=");
        return vb7.l(i2, ")", sb);
    }

    public AgeSignalsEvents$AgeSignalsApiError(int i, AgeSignalsEvents$AgeSignalsErrorType ageSignalsEvents$AgeSignalsErrorType, int i2) {
        ageSignalsEvents$AgeSignalsErrorType.getClass();
        this.error_code = i;
        this.error_type = ageSignalsEvents$AgeSignalsErrorType;
        this.attempt_number = i2;
    }
}
