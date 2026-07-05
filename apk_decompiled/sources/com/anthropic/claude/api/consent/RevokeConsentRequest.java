package com.anthropic.claude.api.consent;

import defpackage.afe;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.mse;
import defpackage.onf;
import defpackage.srg;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ@\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u001a¨\u00063"}, d2 = {"Lcom/anthropic/claude/api/consent/RevokeConsentRequest;", "", "", "consent_uuid", "Lcom/anthropic/claude/api/consent/ConsentType;", "consent_type", "Lcom/anthropic/claude/api/consent/EntityType;", "entity_type", "entity_id", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/api/consent/ConsentType;Lcom/anthropic/claude/api/consent/EntityType;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/api/consent/ConsentType;Lcom/anthropic/claude/api/consent/EntityType;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/consent/RevokeConsentRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/api/consent/ConsentType;", "component3", "()Lcom/anthropic/claude/api/consent/EntityType;", "component4", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/api/consent/ConsentType;Lcom/anthropic/claude/api/consent/EntityType;Ljava/lang/String;)Lcom/anthropic/claude/api/consent/RevokeConsentRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getConsent_uuid", "Lcom/anthropic/claude/api/consent/ConsentType;", "getConsent_type", "Lcom/anthropic/claude/api/consent/EntityType;", "getEntity_type", "getEntity_id", "Companion", "lse", "mse", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class RevokeConsentRequest {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final mse Companion = new mse();
    private final ConsentType consent_type;
    private final String consent_uuid;
    private final String entity_id;
    private final EntityType entity_type;

    static {
        afe afeVar = new afe(11);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, yb5.w(w1aVar, afeVar), yb5.w(w1aVar, new afe(12)), null};
    }

    public /* synthetic */ RevokeConsentRequest(int i, String str, ConsentType consentType, EntityType entityType, String str2, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.consent_uuid = null;
        } else {
            this.consent_uuid = str;
        }
        if ((i & 2) == 0) {
            this.consent_type = null;
        } else {
            this.consent_type = consentType;
        }
        if ((i & 4) == 0) {
            this.entity_type = null;
        } else {
            this.entity_type = entityType;
        }
        if ((i & 8) == 0) {
            this.entity_id = null;
        } else {
            this.entity_id = str2;
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

    public static /* synthetic */ RevokeConsentRequest copy$default(RevokeConsentRequest revokeConsentRequest, String str, ConsentType consentType, EntityType entityType, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = revokeConsentRequest.consent_uuid;
        }
        if ((i & 2) != 0) {
            consentType = revokeConsentRequest.consent_type;
        }
        if ((i & 4) != 0) {
            entityType = revokeConsentRequest.entity_type;
        }
        if ((i & 8) != 0) {
            str2 = revokeConsentRequest.entity_id;
        }
        return revokeConsentRequest.copy(str, consentType, entityType, str2);
    }

    public static final /* synthetic */ void write$Self$api(RevokeConsentRequest self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.consent_uuid != null) {
            output.B(serialDesc, 0, srg.a, self.consent_uuid);
        }
        if (output.E(serialDesc) || self.consent_type != null) {
            output.B(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.consent_type);
        }
        if (output.E(serialDesc) || self.entity_type != null) {
            output.B(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.entity_type);
        }
        if (!output.E(serialDesc) && self.entity_id == null) {
            return;
        }
        output.B(serialDesc, 3, srg.a, self.entity_id);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getConsent_uuid() {
        return this.consent_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ConsentType getConsent_type() {
        return this.consent_type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EntityType getEntity_type() {
        return this.entity_type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEntity_id() {
        return this.entity_id;
    }

    public final RevokeConsentRequest copy(String consent_uuid, ConsentType consent_type, EntityType entity_type, String entity_id) {
        return new RevokeConsentRequest(consent_uuid, consent_type, entity_type, entity_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RevokeConsentRequest)) {
            return false;
        }
        RevokeConsentRequest revokeConsentRequest = (RevokeConsentRequest) other;
        return x44.r(this.consent_uuid, revokeConsentRequest.consent_uuid) && this.consent_type == revokeConsentRequest.consent_type && this.entity_type == revokeConsentRequest.entity_type && x44.r(this.entity_id, revokeConsentRequest.entity_id);
    }

    public final ConsentType getConsent_type() {
        return this.consent_type;
    }

    public final String getConsent_uuid() {
        return this.consent_uuid;
    }

    public final String getEntity_id() {
        return this.entity_id;
    }

    public final EntityType getEntity_type() {
        return this.entity_type;
    }

    public int hashCode() {
        String str = this.consent_uuid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ConsentType consentType = this.consent_type;
        int iHashCode2 = (iHashCode + (consentType == null ? 0 : consentType.hashCode())) * 31;
        EntityType entityType = this.entity_type;
        int iHashCode3 = (iHashCode2 + (entityType == null ? 0 : entityType.hashCode())) * 31;
        String str2 = this.entity_id;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "RevokeConsentRequest(consent_uuid=" + this.consent_uuid + ", consent_type=" + this.consent_type + ", entity_type=" + this.entity_type + ", entity_id=" + this.entity_id + ")";
    }

    public RevokeConsentRequest() {
        this((String) null, (ConsentType) null, (EntityType) null, (String) null, 15, (mq5) null);
    }

    public RevokeConsentRequest(String str, ConsentType consentType, EntityType entityType, String str2) {
        this.consent_uuid = str;
        this.consent_type = consentType;
        this.entity_type = entityType;
        this.entity_id = str2;
    }

    public /* synthetic */ RevokeConsentRequest(String str, ConsentType consentType, EntityType entityType, String str2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : consentType, (i & 4) != 0 ? null : entityType, (i & 8) != 0 ? null : str2);
    }
}
