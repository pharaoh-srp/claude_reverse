package com.anthropic.claude.api.consent;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.kdi;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qmi;
import defpackage.rmi;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:;BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001dJX\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b3\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u0010\"R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b6\u0010\u001dR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b7\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b8\u0010\u001d¨\u0006<"}, d2 = {"Lcom/anthropic/claude/api/consent/UserConsentResponse;", "", "", "uuid", "Lcom/anthropic/claude/api/consent/ConsentType;", "consent_type", "consent_hash", "Lcom/anthropic/claude/api/consent/EntityType;", "entity_type", "entity_id", "created_at", "revoked_at", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/api/consent/ConsentType;Ljava/lang/String;Lcom/anthropic/claude/api/consent/EntityType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/api/consent/ConsentType;Ljava/lang/String;Lcom/anthropic/claude/api/consent/EntityType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/consent/UserConsentResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/api/consent/ConsentType;", "component3", "component4", "()Lcom/anthropic/claude/api/consent/EntityType;", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/api/consent/ConsentType;Ljava/lang/String;Lcom/anthropic/claude/api/consent/EntityType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/consent/UserConsentResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid", "Lcom/anthropic/claude/api/consent/ConsentType;", "getConsent_type", "getConsent_hash", "Lcom/anthropic/claude/api/consent/EntityType;", "getEntity_type", "getEntity_id", "getCreated_at", "getRevoked_at", "Companion", "qmi", "rmi", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class UserConsentResponse {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final rmi Companion = new rmi();
    private final String consent_hash;
    private final ConsentType consent_type;
    private final String created_at;
    private final String entity_id;
    private final EntityType entity_type;
    private final String revoked_at;
    private final String uuid;

    static {
        kdi kdiVar = new kdi(14);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, yb5.w(w1aVar, kdiVar), null, yb5.w(w1aVar, new kdi(15)), null, null, null};
    }

    public /* synthetic */ UserConsentResponse(int i, String str, ConsentType consentType, String str2, EntityType entityType, String str3, String str4, String str5, vnf vnfVar) {
        if (63 != (i & 63)) {
            gvj.f(i, 63, qmi.a.getDescriptor());
            throw null;
        }
        this.uuid = str;
        this.consent_type = consentType;
        this.consent_hash = str2;
        this.entity_type = entityType;
        this.entity_id = str3;
        this.created_at = str4;
        if ((i & 64) == 0) {
            this.revoked_at = null;
        } else {
            this.revoked_at = str5;
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

    public static /* synthetic */ UserConsentResponse copy$default(UserConsentResponse userConsentResponse, String str, ConsentType consentType, String str2, EntityType entityType, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userConsentResponse.uuid;
        }
        if ((i & 2) != 0) {
            consentType = userConsentResponse.consent_type;
        }
        if ((i & 4) != 0) {
            str2 = userConsentResponse.consent_hash;
        }
        if ((i & 8) != 0) {
            entityType = userConsentResponse.entity_type;
        }
        if ((i & 16) != 0) {
            str3 = userConsentResponse.entity_id;
        }
        if ((i & 32) != 0) {
            str4 = userConsentResponse.created_at;
        }
        if ((i & 64) != 0) {
            str5 = userConsentResponse.revoked_at;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str3;
        String str9 = str2;
        return userConsentResponse.copy(str, consentType, str9, entityType, str8, str6, str7);
    }

    public static final /* synthetic */ void write$Self$api(UserConsentResponse self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.uuid);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.consent_type);
        output.q(serialDesc, 2, self.consent_hash);
        output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.entity_type);
        output.q(serialDesc, 4, self.entity_id);
        output.q(serialDesc, 5, self.created_at);
        if (!output.E(serialDesc) && self.revoked_at == null) {
            return;
        }
        output.B(serialDesc, 6, srg.a, self.revoked_at);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ConsentType getConsent_type() {
        return this.consent_type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getConsent_hash() {
        return this.consent_hash;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final EntityType getEntity_type() {
        return this.entity_type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEntity_id() {
        return this.entity_id;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRevoked_at() {
        return this.revoked_at;
    }

    public final UserConsentResponse copy(String uuid, ConsentType consent_type, String consent_hash, EntityType entity_type, String entity_id, String created_at, String revoked_at) {
        uuid.getClass();
        consent_type.getClass();
        consent_hash.getClass();
        entity_type.getClass();
        entity_id.getClass();
        created_at.getClass();
        return new UserConsentResponse(uuid, consent_type, consent_hash, entity_type, entity_id, created_at, revoked_at);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserConsentResponse)) {
            return false;
        }
        UserConsentResponse userConsentResponse = (UserConsentResponse) other;
        return x44.r(this.uuid, userConsentResponse.uuid) && this.consent_type == userConsentResponse.consent_type && x44.r(this.consent_hash, userConsentResponse.consent_hash) && this.entity_type == userConsentResponse.entity_type && x44.r(this.entity_id, userConsentResponse.entity_id) && x44.r(this.created_at, userConsentResponse.created_at) && x44.r(this.revoked_at, userConsentResponse.revoked_at);
    }

    public final String getConsent_hash() {
        return this.consent_hash;
    }

    public final ConsentType getConsent_type() {
        return this.consent_type;
    }

    public final String getCreated_at() {
        return this.created_at;
    }

    public final String getEntity_id() {
        return this.entity_id;
    }

    public final EntityType getEntity_type() {
        return this.entity_type;
    }

    public final String getRevoked_at() {
        return this.revoked_at;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int iL = kgh.l(kgh.l((this.entity_type.hashCode() + kgh.l((this.consent_type.hashCode() + (this.uuid.hashCode() * 31)) * 31, 31, this.consent_hash)) * 31, 31, this.entity_id), 31, this.created_at);
        String str = this.revoked_at;
        return iL + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.uuid;
        ConsentType consentType = this.consent_type;
        String str2 = this.consent_hash;
        EntityType entityType = this.entity_type;
        String str3 = this.entity_id;
        String str4 = this.created_at;
        String str5 = this.revoked_at;
        StringBuilder sb = new StringBuilder("UserConsentResponse(uuid=");
        sb.append(str);
        sb.append(", consent_type=");
        sb.append(consentType);
        sb.append(", consent_hash=");
        sb.append(str2);
        sb.append(", entity_type=");
        sb.append(entityType);
        sb.append(", entity_id=");
        kgh.u(sb, str3, ", created_at=", str4, ", revoked_at=");
        return ij0.m(sb, str5, ")");
    }

    public UserConsentResponse(String str, ConsentType consentType, String str2, EntityType entityType, String str3, String str4, String str5) {
        str.getClass();
        consentType.getClass();
        str2.getClass();
        entityType.getClass();
        str3.getClass();
        str4.getClass();
        this.uuid = str;
        this.consent_type = consentType;
        this.consent_hash = str2;
        this.entity_type = entityType;
        this.entity_id = str3;
        this.created_at = str4;
        this.revoked_at = str5;
    }

    public /* synthetic */ UserConsentResponse(String str, ConsentType consentType, String str2, EntityType entityType, String str3, String str4, String str5, int i, mq5 mq5Var) {
        this(str, consentType, str2, entityType, str3, str4, (i & 64) != 0 ? null : str5);
    }
}
