package com.anthropic.claude.api.consent;

import defpackage.gvj;
import defpackage.kdi;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.omi;
import defpackage.onf;
import defpackage.pmi;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ8\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b/\u0010\u001c¨\u00063"}, d2 = {"Lcom/anthropic/claude/api/consent/UserConsentRequest;", "", "Lcom/anthropic/claude/api/consent/ConsentType;", "consent_type", "", "consent_hash", "Lcom/anthropic/claude/api/consent/EntityType;", "entity_type", "entity_id", "<init>", "(Lcom/anthropic/claude/api/consent/ConsentType;Ljava/lang/String;Lcom/anthropic/claude/api/consent/EntityType;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/consent/ConsentType;Ljava/lang/String;Lcom/anthropic/claude/api/consent/EntityType;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/consent/UserConsentRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/consent/ConsentType;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/anthropic/claude/api/consent/EntityType;", "component4", "copy", "(Lcom/anthropic/claude/api/consent/ConsentType;Ljava/lang/String;Lcom/anthropic/claude/api/consent/EntityType;Ljava/lang/String;)Lcom/anthropic/claude/api/consent/UserConsentRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/consent/ConsentType;", "getConsent_type", "Ljava/lang/String;", "getConsent_hash", "Lcom/anthropic/claude/api/consent/EntityType;", "getEntity_type", "getEntity_id", "Companion", "omi", "pmi", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class UserConsentRequest {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final pmi Companion = new pmi();
    private final String consent_hash;
    private final ConsentType consent_type;
    private final String entity_id;
    private final EntityType entity_type;

    static {
        kdi kdiVar = new kdi(12);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{yb5.w(w1aVar, kdiVar), null, yb5.w(w1aVar, new kdi(13)), null};
    }

    public /* synthetic */ UserConsentRequest(int i, ConsentType consentType, String str, EntityType entityType, String str2, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, omi.a.getDescriptor());
            throw null;
        }
        this.consent_type = consentType;
        this.consent_hash = str;
        this.entity_type = entityType;
        this.entity_id = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ConsentType.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return EntityType.Companion.serializer();
    }

    public static /* synthetic */ UserConsentRequest copy$default(UserConsentRequest userConsentRequest, ConsentType consentType, String str, EntityType entityType, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            consentType = userConsentRequest.consent_type;
        }
        if ((i & 2) != 0) {
            str = userConsentRequest.consent_hash;
        }
        if ((i & 4) != 0) {
            entityType = userConsentRequest.entity_type;
        }
        if ((i & 8) != 0) {
            str2 = userConsentRequest.entity_id;
        }
        return userConsentRequest.copy(consentType, str, entityType, str2);
    }

    public static final /* synthetic */ void write$Self$api(UserConsentRequest self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.consent_type);
        output.q(serialDesc, 1, self.consent_hash);
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.entity_type);
        output.q(serialDesc, 3, self.entity_id);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ConsentType getConsent_type() {
        return this.consent_type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConsent_hash() {
        return this.consent_hash;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EntityType getEntity_type() {
        return this.entity_type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEntity_id() {
        return this.entity_id;
    }

    public final UserConsentRequest copy(ConsentType consent_type, String consent_hash, EntityType entity_type, String entity_id) {
        consent_type.getClass();
        consent_hash.getClass();
        entity_type.getClass();
        entity_id.getClass();
        return new UserConsentRequest(consent_type, consent_hash, entity_type, entity_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserConsentRequest)) {
            return false;
        }
        UserConsentRequest userConsentRequest = (UserConsentRequest) other;
        return this.consent_type == userConsentRequest.consent_type && x44.r(this.consent_hash, userConsentRequest.consent_hash) && this.entity_type == userConsentRequest.entity_type && x44.r(this.entity_id, userConsentRequest.entity_id);
    }

    public final String getConsent_hash() {
        return this.consent_hash;
    }

    public final ConsentType getConsent_type() {
        return this.consent_type;
    }

    public final String getEntity_id() {
        return this.entity_id;
    }

    public final EntityType getEntity_type() {
        return this.entity_type;
    }

    public int hashCode() {
        return this.entity_id.hashCode() + ((this.entity_type.hashCode() + kgh.l(this.consent_type.hashCode() * 31, 31, this.consent_hash)) * 31);
    }

    public String toString() {
        return "UserConsentRequest(consent_type=" + this.consent_type + ", consent_hash=" + this.consent_hash + ", entity_type=" + this.entity_type + ", entity_id=" + this.entity_id + ")";
    }

    public UserConsentRequest(ConsentType consentType, String str, EntityType entityType, String str2) {
        consentType.getClass();
        str.getClass();
        entityType.getClass();
        str2.getClass();
        this.consent_type = consentType;
        this.consent_hash = str;
        this.entity_type = entityType;
        this.entity_id = str2;
    }
}
