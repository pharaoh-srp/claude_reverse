package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.onf;
import defpackage.qfc;
import defpackage.rfc;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tB=\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ8\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b,\u0010\u001bR\u0014\u0010.\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0019¨\u00062"}, d2 = {"com/anthropic/claude/analytics/events/OnboardingEvents$PhoneVerificationErrorSendingCode", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "surface", "", "version", "country_code", "number_length", "<init>", "(Ljava/lang/String;III)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;IIILvnf;)V", "Lcom/anthropic/claude/analytics/events/OnboardingEvents$PhoneVerificationErrorSendingCode;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/OnboardingEvents$PhoneVerificationErrorSendingCode;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "copy", "(Ljava/lang/String;III)Lcom/anthropic/claude/analytics/events/OnboardingEvents$PhoneVerificationErrorSendingCode;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSurface", "I", "getVersion", "getCountry_code", "getNumber_length", "getEventName", "eventName", "Companion", "qfc", "rfc", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class OnboardingEvents$PhoneVerificationErrorSendingCode implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final rfc Companion = new rfc();
    private final int country_code;
    private final int number_length;
    private final String surface;
    private final int version;

    public /* synthetic */ OnboardingEvents$PhoneVerificationErrorSendingCode(int i, String str, int i2, int i3, int i4, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, qfc.a.getDescriptor());
            throw null;
        }
        this.surface = str;
        this.version = i2;
        this.country_code = i3;
        this.number_length = i4;
    }

    public static /* synthetic */ OnboardingEvents$PhoneVerificationErrorSendingCode copy$default(OnboardingEvents$PhoneVerificationErrorSendingCode onboardingEvents$PhoneVerificationErrorSendingCode, String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = onboardingEvents$PhoneVerificationErrorSendingCode.surface;
        }
        if ((i4 & 2) != 0) {
            i = onboardingEvents$PhoneVerificationErrorSendingCode.version;
        }
        if ((i4 & 4) != 0) {
            i2 = onboardingEvents$PhoneVerificationErrorSendingCode.country_code;
        }
        if ((i4 & 8) != 0) {
            i3 = onboardingEvents$PhoneVerificationErrorSendingCode.number_length;
        }
        return onboardingEvents$PhoneVerificationErrorSendingCode.copy(str, i, i2, i3);
    }

    public static final /* synthetic */ void write$Self$analytics(OnboardingEvents$PhoneVerificationErrorSendingCode self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.surface);
        output.l(1, self.version, serialDesc);
        output.l(2, self.country_code, serialDesc);
        output.l(3, self.number_length, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSurface() {
        return this.surface;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCountry_code() {
        return this.country_code;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getNumber_length() {
        return this.number_length;
    }

    public final OnboardingEvents$PhoneVerificationErrorSendingCode copy(String surface, int version, int country_code, int number_length) {
        surface.getClass();
        return new OnboardingEvents$PhoneVerificationErrorSendingCode(surface, version, country_code, number_length);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnboardingEvents$PhoneVerificationErrorSendingCode)) {
            return false;
        }
        OnboardingEvents$PhoneVerificationErrorSendingCode onboardingEvents$PhoneVerificationErrorSendingCode = (OnboardingEvents$PhoneVerificationErrorSendingCode) other;
        return x44.r(this.surface, onboardingEvents$PhoneVerificationErrorSendingCode.surface) && this.version == onboardingEvents$PhoneVerificationErrorSendingCode.version && this.country_code == onboardingEvents$PhoneVerificationErrorSendingCode.country_code && this.number_length == onboardingEvents$PhoneVerificationErrorSendingCode.number_length;
    }

    public final int getCountry_code() {
        return this.country_code;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "onboarding.phone_verification.error_sending_code";
    }

    public final int getNumber_length() {
        return this.number_length;
    }

    public final String getSurface() {
        return this.surface;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Integer.hashCode(this.number_length) + vb7.c(this.country_code, vb7.c(this.version, this.surface.hashCode() * 31, 31), 31);
    }

    public String toString() {
        String str = this.surface;
        int i = this.version;
        int i2 = this.country_code;
        int i3 = this.number_length;
        StringBuilder sbP = ij0.p("PhoneVerificationErrorSendingCode(surface=", str, i, ", version=", ", country_code=");
        sbP.append(i2);
        sbP.append(", number_length=");
        sbP.append(i3);
        sbP.append(")");
        return sbP.toString();
    }

    public OnboardingEvents$PhoneVerificationErrorSendingCode(String str, int i, int i2, int i3) {
        str.getClass();
        this.surface = str;
        this.version = i;
        this.country_code = i2;
        this.number_length = i3;
    }
}
