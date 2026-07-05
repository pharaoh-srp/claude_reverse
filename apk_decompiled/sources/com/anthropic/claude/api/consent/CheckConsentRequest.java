package com.anthropic.claude.api.consent;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wy2;
import defpackage.x44;
import defpackage.xd3;
import defpackage.yb5;
import defpackage.yd3;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ:\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b/\u0010\u001e¨\u00063"}, d2 = {"Lcom/anthropic/claude/api/consent/CheckConsentRequest;", "", "Lcom/anthropic/claude/api/consent/ConsentType;", "consent_type", "Lcom/anthropic/claude/api/consent/EntityType;", "entity_type", "", "entity_id", "consent_hash", "<init>", "(Lcom/anthropic/claude/api/consent/ConsentType;Lcom/anthropic/claude/api/consent/EntityType;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/consent/ConsentType;Lcom/anthropic/claude/api/consent/EntityType;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/consent/CheckConsentRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/consent/ConsentType;", "component2", "()Lcom/anthropic/claude/api/consent/EntityType;", "component3", "()Ljava/lang/String;", "component4", "copy", "(Lcom/anthropic/claude/api/consent/ConsentType;Lcom/anthropic/claude/api/consent/EntityType;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/consent/CheckConsentRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/consent/ConsentType;", "getConsent_type", "Lcom/anthropic/claude/api/consent/EntityType;", "getEntity_type", "Ljava/lang/String;", "getEntity_id", "getConsent_hash", "Companion", "xd3", "yd3", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CheckConsentRequest {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final yd3 Companion = new yd3();
    private final String consent_hash;
    private final ConsentType consent_type;
    private final String entity_id;
    private final EntityType entity_type;

    static {
        wy2 wy2Var = new wy2(19);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{yb5.w(w1aVar, wy2Var), yb5.w(w1aVar, new wy2(20)), null, null};
    }

    public /* synthetic */ CheckConsentRequest(int i, ConsentType consentType, EntityType entityType, String str, String str2, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, xd3.a.getDescriptor());
            throw null;
        }
        this.consent_type = consentType;
        this.entity_type = entityType;
        this.entity_id = str;
        if ((i & 8) == 0) {
            this.consent_hash = null;
        } else {
            this.consent_hash = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ConsentType.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return EntityType.Companion.serializer();
    }

    public static /* synthetic */ CheckConsentRequest copy$default(CheckConsentRequest checkConsentRequest, ConsentType consentType, EntityType entityType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            consentType = checkConsentRequest.consent_type;
        }
        if ((i & 2) != 0) {
            entityType = checkConsentRequest.entity_type;
        }
        if ((i & 4) != 0) {
            str = checkConsentRequest.entity_id;
        }
        if ((i & 8) != 0) {
            str2 = checkConsentRequest.consent_hash;
        }
        return checkConsentRequest.copy(consentType, entityType, str, str2);
    }

    public static final /* synthetic */ void write$Self$api(CheckConsentRequest self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.consent_type);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.entity_type);
        output.q(serialDesc, 2, self.entity_id);
        if (!output.E(serialDesc) && self.consent_hash == null) {
            return;
        }
        output.B(serialDesc, 3, srg.a, self.consent_hash);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ConsentType getConsent_type() {
        return this.consent_type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EntityType getEntity_type() {
        return this.entity_type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEntity_id() {
        return this.entity_id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getConsent_hash() {
        return this.consent_hash;
    }

    public final CheckConsentRequest copy(ConsentType consent_type, EntityType entity_type, String entity_id, String consent_hash) {
        consent_type.getClass();
        entity_type.getClass();
        entity_id.getClass();
        return new CheckConsentRequest(consent_type, entity_type, entity_id, consent_hash);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckConsentRequest)) {
            return false;
        }
        CheckConsentRequest checkConsentRequest = (CheckConsentRequest) other;
        return this.consent_type == checkConsentRequest.consent_type && this.entity_type == checkConsentRequest.entity_type && x44.r(this.entity_id, checkConsentRequest.entity_id) && x44.r(this.consent_hash, checkConsentRequest.consent_hash);
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
        int iL = kgh.l((this.entity_type.hashCode() + (this.consent_type.hashCode() * 31)) * 31, 31, this.entity_id);
        String str = this.consent_hash;
        return iL + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        ConsentType consentType = this.consent_type;
        EntityType entityType = this.entity_type;
        String str = this.entity_id;
        String str2 = this.consent_hash;
        StringBuilder sb = new StringBuilder("CheckConsentRequest(consent_type=");
        sb.append(consentType);
        sb.append(", entity_type=");
        sb.append(entityType);
        sb.append(", entity_id=");
        return vb7.t(sb, str, ", consent_hash=", str2, ")");
    }

    public CheckConsentRequest(ConsentType consentType, EntityType entityType, String str, String str2) {
        consentType.getClass();
        entityType.getClass();
        str.getClass();
        this.consent_type = consentType;
        this.entity_type = entityType;
        this.entity_id = str;
        this.consent_hash = str2;
    }

    public /* synthetic */ CheckConsentRequest(ConsentType consentType, EntityType entityType, String str, String str2, int i, mq5 mq5Var) {
        this(consentType, entityType, str, (i & 8) != 0 ? null : str2);
    }
}
