package com.anthropic.claude.analytics.events;

import defpackage.grc;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.mfc;
import defpackage.nfc;
import defpackage.onf;
import defpackage.vnf;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\tJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015R\u0014\u0010$\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001a¨\u0006("}, d2 = {"com/anthropic/claude/analytics/events/OnboardingEvents$PhoneVerificationCountryCodeDialogFinished", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "country_code", "<init>", "(I)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IILvnf;)V", "Lcom/anthropic/claude/analytics/events/OnboardingEvents$PhoneVerificationCountryCodeDialogFinished;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/OnboardingEvents$PhoneVerificationCountryCodeDialogFinished;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "copy", "(I)Lcom/anthropic/claude/analytics/events/OnboardingEvents$PhoneVerificationCountryCodeDialogFinished;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCountry_code", "getEventName", "eventName", "Companion", "mfc", "nfc", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class OnboardingEvents$PhoneVerificationCountryCodeDialogFinished implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final nfc Companion = new nfc();
    private final int country_code;

    public /* synthetic */ OnboardingEvents$PhoneVerificationCountryCodeDialogFinished(int i, int i2, vnf vnfVar) {
        if (1 == (i & 1)) {
            this.country_code = i2;
        } else {
            gvj.f(i, 1, mfc.a.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ OnboardingEvents$PhoneVerificationCountryCodeDialogFinished copy$default(OnboardingEvents$PhoneVerificationCountryCodeDialogFinished onboardingEvents$PhoneVerificationCountryCodeDialogFinished, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = onboardingEvents$PhoneVerificationCountryCodeDialogFinished.country_code;
        }
        return onboardingEvents$PhoneVerificationCountryCodeDialogFinished.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCountry_code() {
        return this.country_code;
    }

    public final OnboardingEvents$PhoneVerificationCountryCodeDialogFinished copy(int country_code) {
        return new OnboardingEvents$PhoneVerificationCountryCodeDialogFinished(country_code);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OnboardingEvents$PhoneVerificationCountryCodeDialogFinished) && this.country_code == ((OnboardingEvents$PhoneVerificationCountryCodeDialogFinished) other).country_code;
    }

    public final int getCountry_code() {
        return this.country_code;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "onboarding.phone_verification.country_code_dialog.finished";
    }

    public int hashCode() {
        return Integer.hashCode(this.country_code);
    }

    public String toString() {
        return grc.u("PhoneVerificationCountryCodeDialogFinished(country_code=", this.country_code, ")");
    }

    public OnboardingEvents$PhoneVerificationCountryCodeDialogFinished(int i) {
        this.country_code = i;
    }
}
