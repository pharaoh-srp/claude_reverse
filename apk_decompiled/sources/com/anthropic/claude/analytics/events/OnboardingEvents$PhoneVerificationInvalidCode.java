package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.onf;
import defpackage.sfc;
import defpackage.sq6;
import defpackage.tfc;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0019J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019R\u0014\u0010(\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0017¨\u0006,"}, d2 = {"com/anthropic/claude/analytics/events/OnboardingEvents$PhoneVerificationInvalidCode", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "surface", "", "version", "<init>", "(Ljava/lang/String;I)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;ILvnf;)V", "Lcom/anthropic/claude/analytics/events/OnboardingEvents$PhoneVerificationInvalidCode;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/OnboardingEvents$PhoneVerificationInvalidCode;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/anthropic/claude/analytics/events/OnboardingEvents$PhoneVerificationInvalidCode;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSurface", "I", "getVersion", "getEventName", "eventName", "Companion", "sfc", "tfc", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class OnboardingEvents$PhoneVerificationInvalidCode implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final tfc Companion = new tfc();
    private final String surface;
    private final int version;

    public /* synthetic */ OnboardingEvents$PhoneVerificationInvalidCode(int i, String str, int i2, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, sfc.a.getDescriptor());
            throw null;
        }
        this.surface = str;
        this.version = i2;
    }

    public static /* synthetic */ OnboardingEvents$PhoneVerificationInvalidCode copy$default(OnboardingEvents$PhoneVerificationInvalidCode onboardingEvents$PhoneVerificationInvalidCode, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = onboardingEvents$PhoneVerificationInvalidCode.surface;
        }
        if ((i2 & 2) != 0) {
            i = onboardingEvents$PhoneVerificationInvalidCode.version;
        }
        return onboardingEvents$PhoneVerificationInvalidCode.copy(str, i);
    }

    public static final /* synthetic */ void write$Self$analytics(OnboardingEvents$PhoneVerificationInvalidCode self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.surface);
        output.l(1, self.version, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSurface() {
        return this.surface;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    public final OnboardingEvents$PhoneVerificationInvalidCode copy(String surface, int version) {
        surface.getClass();
        return new OnboardingEvents$PhoneVerificationInvalidCode(surface, version);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnboardingEvents$PhoneVerificationInvalidCode)) {
            return false;
        }
        OnboardingEvents$PhoneVerificationInvalidCode onboardingEvents$PhoneVerificationInvalidCode = (OnboardingEvents$PhoneVerificationInvalidCode) other;
        return x44.r(this.surface, onboardingEvents$PhoneVerificationInvalidCode.surface) && this.version == onboardingEvents$PhoneVerificationInvalidCode.version;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "onboarding.phone_verification.invalid_code";
    }

    public final String getSurface() {
        return this.surface;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Integer.hashCode(this.version) + (this.surface.hashCode() * 31);
    }

    public String toString() {
        return sq6.u("PhoneVerificationInvalidCode(surface=", this.surface, this.version, ", version=", ")");
    }

    public OnboardingEvents$PhoneVerificationInvalidCode(String str, int i) {
        str.getClass();
        this.surface = str;
        this.version = i;
    }
}
