package com.anthropic.claude.models.organization.configtypes;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.onf;
import defpackage.pk8;
import defpackage.qk8;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006&"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/HealthConsentConfig;", "", "Lcom/anthropic/claude/models/organization/configtypes/ConsentConfigAndroid;", "consent_config_android", "<init>", "(Lcom/anthropic/claude/models/organization/configtypes/ConsentConfigAndroid;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/models/organization/configtypes/ConsentConfigAndroid;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/HealthConsentConfig;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/models/organization/configtypes/ConsentConfigAndroid;", "copy", "(Lcom/anthropic/claude/models/organization/configtypes/ConsentConfigAndroid;)Lcom/anthropic/claude/models/organization/configtypes/HealthConsentConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/models/organization/configtypes/ConsentConfigAndroid;", "getConsent_config_android", "Companion", "pk8", "qk8", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class HealthConsentConfig {
    public static final int $stable = 0;
    public static final qk8 Companion = new qk8();
    private final ConsentConfigAndroid consent_config_android;

    public /* synthetic */ HealthConsentConfig(int i, ConsentConfigAndroid consentConfigAndroid, vnf vnfVar) {
        if (1 == (i & 1)) {
            this.consent_config_android = consentConfigAndroid;
        } else {
            gvj.f(i, 1, pk8.a.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ HealthConsentConfig copy$default(HealthConsentConfig healthConsentConfig, ConsentConfigAndroid consentConfigAndroid, int i, Object obj) {
        if ((i & 1) != 0) {
            consentConfigAndroid = healthConsentConfig.consent_config_android;
        }
        return healthConsentConfig.copy(consentConfigAndroid);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ConsentConfigAndroid getConsent_config_android() {
        return this.consent_config_android;
    }

    public final HealthConsentConfig copy(ConsentConfigAndroid consent_config_android) {
        consent_config_android.getClass();
        return new HealthConsentConfig(consent_config_android);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HealthConsentConfig) && x44.r(this.consent_config_android, ((HealthConsentConfig) other).consent_config_android);
    }

    public final ConsentConfigAndroid getConsent_config_android() {
        return this.consent_config_android;
    }

    public int hashCode() {
        return this.consent_config_android.hashCode();
    }

    public String toString() {
        return "HealthConsentConfig(consent_config_android=" + this.consent_config_android + ")";
    }

    public HealthConsentConfig(ConsentConfigAndroid consentConfigAndroid) {
        consentConfigAndroid.getClass();
        this.consent_config_android = consentConfigAndroid;
    }
}
