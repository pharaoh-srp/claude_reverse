package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.gw3;
import defpackage.hw3;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.xka;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=>BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJb\u0010'\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001eJ\u0010\u0010*\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b3\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b4\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b9\u0010\u001eR\u0014\u0010;\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u001e¨\u0006?"}, d2 = {"com/anthropic/claude/analytics/events/CodeEvents$SessionReattestPrompted", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "kid", "challenge_id", "application_state", "", "biometry_available", "", "biometry_error_code", "trigger", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/CodeEvents$SessionReattestPrompted;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/CodeEvents$SessionReattestPrompted;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/lang/Boolean;", "component6", "()Ljava/lang/Long;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/CodeEvents$SessionReattestPrompted;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getKid", "getChallenge_id", "getApplication_state", "Ljava/lang/Boolean;", "getBiometry_available", "Ljava/lang/Long;", "getBiometry_error_code", "getTrigger", "getEventName", "eventName", "Companion", "gw3", "hw3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CodeEvents$SessionReattestPrompted implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final hw3 Companion = new hw3();
    private final String application_state;
    private final Boolean biometry_available;
    private final Long biometry_error_code;
    private final String challenge_id;
    private final String kid;
    private final String organization_uuid;
    private final String trigger;

    public /* synthetic */ CodeEvents$SessionReattestPrompted(int i, String str, String str2, String str3, String str4, Boolean bool, Long l, String str5, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, gw3.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        if ((i & 2) == 0) {
            this.kid = null;
        } else {
            this.kid = str2;
        }
        if ((i & 4) == 0) {
            this.challenge_id = null;
        } else {
            this.challenge_id = str3;
        }
        if ((i & 8) == 0) {
            this.application_state = null;
        } else {
            this.application_state = str4;
        }
        if ((i & 16) == 0) {
            this.biometry_available = null;
        } else {
            this.biometry_available = bool;
        }
        if ((i & 32) == 0) {
            this.biometry_error_code = null;
        } else {
            this.biometry_error_code = l;
        }
        if ((i & 64) == 0) {
            this.trigger = null;
        } else {
            this.trigger = str5;
        }
    }

    public static /* synthetic */ CodeEvents$SessionReattestPrompted copy$default(CodeEvents$SessionReattestPrompted codeEvents$SessionReattestPrompted, String str, String str2, String str3, String str4, Boolean bool, Long l, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = codeEvents$SessionReattestPrompted.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = codeEvents$SessionReattestPrompted.kid;
        }
        if ((i & 4) != 0) {
            str3 = codeEvents$SessionReattestPrompted.challenge_id;
        }
        if ((i & 8) != 0) {
            str4 = codeEvents$SessionReattestPrompted.application_state;
        }
        if ((i & 16) != 0) {
            bool = codeEvents$SessionReattestPrompted.biometry_available;
        }
        if ((i & 32) != 0) {
            l = codeEvents$SessionReattestPrompted.biometry_error_code;
        }
        if ((i & 64) != 0) {
            str5 = codeEvents$SessionReattestPrompted.trigger;
        }
        Long l2 = l;
        String str6 = str5;
        Boolean bool2 = bool;
        String str7 = str3;
        return codeEvents$SessionReattestPrompted.copy(str, str2, str7, str4, bool2, l2, str6);
    }

    public static final /* synthetic */ void write$Self$analytics(CodeEvents$SessionReattestPrompted self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        if (output.E(serialDesc) || self.kid != null) {
            output.B(serialDesc, 1, srg.a, self.kid);
        }
        if (output.E(serialDesc) || self.challenge_id != null) {
            output.B(serialDesc, 2, srg.a, self.challenge_id);
        }
        if (output.E(serialDesc) || self.application_state != null) {
            output.B(serialDesc, 3, srg.a, self.application_state);
        }
        if (output.E(serialDesc) || self.biometry_available != null) {
            output.B(serialDesc, 4, zt1.a, self.biometry_available);
        }
        if (output.E(serialDesc) || self.biometry_error_code != null) {
            output.B(serialDesc, 5, xka.a, self.biometry_error_code);
        }
        if (!output.E(serialDesc) && self.trigger == null) {
            return;
        }
        output.B(serialDesc, 6, srg.a, self.trigger);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKid() {
        return this.kid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChallenge_id() {
        return this.challenge_id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getApplication_state() {
        return this.application_state;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getBiometry_available() {
        return this.biometry_available;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getBiometry_error_code() {
        return this.biometry_error_code;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTrigger() {
        return this.trigger;
    }

    public final CodeEvents$SessionReattestPrompted copy(String organization_uuid, String kid, String challenge_id, String application_state, Boolean biometry_available, Long biometry_error_code, String trigger) {
        organization_uuid.getClass();
        return new CodeEvents$SessionReattestPrompted(organization_uuid, kid, challenge_id, application_state, biometry_available, biometry_error_code, trigger);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeEvents$SessionReattestPrompted)) {
            return false;
        }
        CodeEvents$SessionReattestPrompted codeEvents$SessionReattestPrompted = (CodeEvents$SessionReattestPrompted) other;
        return x44.r(this.organization_uuid, codeEvents$SessionReattestPrompted.organization_uuid) && x44.r(this.kid, codeEvents$SessionReattestPrompted.kid) && x44.r(this.challenge_id, codeEvents$SessionReattestPrompted.challenge_id) && x44.r(this.application_state, codeEvents$SessionReattestPrompted.application_state) && x44.r(this.biometry_available, codeEvents$SessionReattestPrompted.biometry_available) && x44.r(this.biometry_error_code, codeEvents$SessionReattestPrompted.biometry_error_code) && x44.r(this.trigger, codeEvents$SessionReattestPrompted.trigger);
    }

    public final String getApplication_state() {
        return this.application_state;
    }

    public final Boolean getBiometry_available() {
        return this.biometry_available;
    }

    public final Long getBiometry_error_code() {
        return this.biometry_error_code;
    }

    public final String getChallenge_id() {
        return this.challenge_id;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_code_session_reattest_prompted";
    }

    public final String getKid() {
        return this.kid;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getTrigger() {
        return this.trigger;
    }

    public int hashCode() {
        int iHashCode = this.organization_uuid.hashCode() * 31;
        String str = this.kid;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.challenge_id;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.application_state;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.biometry_available;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.biometry_error_code;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        String str4 = this.trigger;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.kid;
        String str3 = this.challenge_id;
        String str4 = this.application_state;
        Boolean bool = this.biometry_available;
        Long l = this.biometry_error_code;
        String str5 = this.trigger;
        StringBuilder sbR = kgh.r("SessionReattestPrompted(organization_uuid=", str, ", kid=", str2, ", challenge_id=");
        kgh.u(sbR, str3, ", application_state=", str4, ", biometry_available=");
        sbR.append(bool);
        sbR.append(", biometry_error_code=");
        sbR.append(l);
        sbR.append(", trigger=");
        return ij0.m(sbR, str5, ")");
    }

    public CodeEvents$SessionReattestPrompted(String str, String str2, String str3, String str4, Boolean bool, Long l, String str5) {
        str.getClass();
        this.organization_uuid = str;
        this.kid = str2;
        this.challenge_id = str3;
        this.application_state = str4;
        this.biometry_available = bool;
        this.biometry_error_code = l;
        this.trigger = str5;
    }

    public /* synthetic */ CodeEvents$SessionReattestPrompted(String str, String str2, String str3, String str4, Boolean bool, Long l, String str5, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : str5);
    }
}
