package com.anthropic.claude.analytics.events;

import defpackage.fsh;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.iw3;
import defpackage.jw3;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.xka;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=>BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rB_\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0012\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJ^\u0010'\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001eJ\u0010\u0010*\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\u00042\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b4\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b5\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b6\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b9\u0010\u001eR\u0014\u0010;\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u001e¨\u0006?"}, d2 = {"com/anthropic/claude/analytics/events/CodeEvents$SessionReattestResult", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "", "success", "outcome", "kid", "challenge_id", "", "os_error_code", "application_state", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/CodeEvents$SessionReattestResult;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/CodeEvents$SessionReattestResult;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "component5", "component6", "()Ljava/lang/Long;", "component7", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/CodeEvents$SessionReattestResult;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "Z", "getSuccess", "getOutcome", "getKid", "getChallenge_id", "Ljava/lang/Long;", "getOs_error_code", "getApplication_state", "getEventName", "eventName", "Companion", "iw3", "jw3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CodeEvents$SessionReattestResult implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final jw3 Companion = new jw3();
    private final String application_state;
    private final String challenge_id;
    private final String kid;
    private final String organization_uuid;
    private final Long os_error_code;
    private final String outcome;
    private final boolean success;

    public /* synthetic */ CodeEvents$SessionReattestResult(int i, String str, boolean z, String str2, String str3, String str4, Long l, String str5, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, iw3.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.success = z;
        this.outcome = str2;
        if ((i & 8) == 0) {
            this.kid = null;
        } else {
            this.kid = str3;
        }
        if ((i & 16) == 0) {
            this.challenge_id = null;
        } else {
            this.challenge_id = str4;
        }
        if ((i & 32) == 0) {
            this.os_error_code = null;
        } else {
            this.os_error_code = l;
        }
        if ((i & 64) == 0) {
            this.application_state = null;
        } else {
            this.application_state = str5;
        }
    }

    public static /* synthetic */ CodeEvents$SessionReattestResult copy$default(CodeEvents$SessionReattestResult codeEvents$SessionReattestResult, String str, boolean z, String str2, String str3, String str4, Long l, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = codeEvents$SessionReattestResult.organization_uuid;
        }
        if ((i & 2) != 0) {
            z = codeEvents$SessionReattestResult.success;
        }
        if ((i & 4) != 0) {
            str2 = codeEvents$SessionReattestResult.outcome;
        }
        if ((i & 8) != 0) {
            str3 = codeEvents$SessionReattestResult.kid;
        }
        if ((i & 16) != 0) {
            str4 = codeEvents$SessionReattestResult.challenge_id;
        }
        if ((i & 32) != 0) {
            l = codeEvents$SessionReattestResult.os_error_code;
        }
        if ((i & 64) != 0) {
            str5 = codeEvents$SessionReattestResult.application_state;
        }
        Long l2 = l;
        String str6 = str5;
        String str7 = str4;
        String str8 = str2;
        return codeEvents$SessionReattestResult.copy(str, z, str8, str3, str7, l2, str6);
    }

    public static final /* synthetic */ void write$Self$analytics(CodeEvents$SessionReattestResult self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        output.p(serialDesc, 1, self.success);
        output.q(serialDesc, 2, self.outcome);
        if (output.E(serialDesc) || self.kid != null) {
            output.B(serialDesc, 3, srg.a, self.kid);
        }
        if (output.E(serialDesc) || self.challenge_id != null) {
            output.B(serialDesc, 4, srg.a, self.challenge_id);
        }
        if (output.E(serialDesc) || self.os_error_code != null) {
            output.B(serialDesc, 5, xka.a, self.os_error_code);
        }
        if (!output.E(serialDesc) && self.application_state == null) {
            return;
        }
        output.B(serialDesc, 6, srg.a, self.application_state);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOutcome() {
        return this.outcome;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getKid() {
        return this.kid;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getChallenge_id() {
        return this.challenge_id;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getOs_error_code() {
        return this.os_error_code;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getApplication_state() {
        return this.application_state;
    }

    public final CodeEvents$SessionReattestResult copy(String organization_uuid, boolean success, String outcome, String kid, String challenge_id, Long os_error_code, String application_state) {
        organization_uuid.getClass();
        outcome.getClass();
        return new CodeEvents$SessionReattestResult(organization_uuid, success, outcome, kid, challenge_id, os_error_code, application_state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeEvents$SessionReattestResult)) {
            return false;
        }
        CodeEvents$SessionReattestResult codeEvents$SessionReattestResult = (CodeEvents$SessionReattestResult) other;
        return x44.r(this.organization_uuid, codeEvents$SessionReattestResult.organization_uuid) && this.success == codeEvents$SessionReattestResult.success && x44.r(this.outcome, codeEvents$SessionReattestResult.outcome) && x44.r(this.kid, codeEvents$SessionReattestResult.kid) && x44.r(this.challenge_id, codeEvents$SessionReattestResult.challenge_id) && x44.r(this.os_error_code, codeEvents$SessionReattestResult.os_error_code) && x44.r(this.application_state, codeEvents$SessionReattestResult.application_state);
    }

    public final String getApplication_state() {
        return this.application_state;
    }

    public final String getChallenge_id() {
        return this.challenge_id;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_code_session_reattest_result";
    }

    public final String getKid() {
        return this.kid;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final Long getOs_error_code() {
        return this.os_error_code;
    }

    public final String getOutcome() {
        return this.outcome;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int iL = kgh.l(fsh.p(this.organization_uuid.hashCode() * 31, 31, this.success), 31, this.outcome);
        String str = this.kid;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.challenge_id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.os_error_code;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.application_state;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.organization_uuid;
        boolean z = this.success;
        String str2 = this.outcome;
        String str3 = this.kid;
        String str4 = this.challenge_id;
        Long l = this.os_error_code;
        String str5 = this.application_state;
        StringBuilder sb = new StringBuilder("SessionReattestResult(organization_uuid=");
        sb.append(str);
        sb.append(", success=");
        sb.append(z);
        sb.append(", outcome=");
        kgh.u(sb, str2, ", kid=", str3, ", challenge_id=");
        sb.append(str4);
        sb.append(", os_error_code=");
        sb.append(l);
        sb.append(", application_state=");
        return ij0.m(sb, str5, ")");
    }

    public CodeEvents$SessionReattestResult(String str, boolean z, String str2, String str3, String str4, Long l, String str5) {
        str.getClass();
        str2.getClass();
        this.organization_uuid = str;
        this.success = z;
        this.outcome = str2;
        this.kid = str3;
        this.challenge_id = str4;
        this.os_error_code = l;
        this.application_state = str5;
    }

    public /* synthetic */ CodeEvents$SessionReattestResult(String str, boolean z, String str2, String str3, String str4, Long l, String str5, int i, mq5 mq5Var) {
        this(str, z, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : str5);
    }
}
