package com.anthropic.claude.analytics.events;

import defpackage.ew3;
import defpackage.fw3;
import defpackage.grc;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qy1;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.xka;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000278B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"JF\u0010#\u001a\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010\"R\u0014\u00105\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u001c¨\u00069"}, d2 = {"com/anthropic/claude/analytics/events/CodeEvents$SessionPrimerOutcome", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "session_id", "outcome", "", "head_start_ms", "", "model_reconciled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/CodeEvents$SessionPrimerOutcome;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/CodeEvents$SessionPrimerOutcome;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Long;", "component5", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/anthropic/claude/analytics/events/CodeEvents$SessionPrimerOutcome;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getSession_id", "getOutcome", "Ljava/lang/Long;", "getHead_start_ms", "Ljava/lang/Boolean;", "getModel_reconciled", "getEventName", "eventName", "Companion", "ew3", "fw3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CodeEvents$SessionPrimerOutcome implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final fw3 Companion = new fw3();
    private final Long head_start_ms;
    private final Boolean model_reconciled;
    private final String organization_uuid;
    private final String outcome;
    private final String session_id;

    public /* synthetic */ CodeEvents$SessionPrimerOutcome(int i, String str, String str2, String str3, Long l, Boolean bool, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, ew3.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.session_id = str2;
        this.outcome = str3;
        if ((i & 8) == 0) {
            this.head_start_ms = null;
        } else {
            this.head_start_ms = l;
        }
        if ((i & 16) == 0) {
            this.model_reconciled = null;
        } else {
            this.model_reconciled = bool;
        }
    }

    public static /* synthetic */ CodeEvents$SessionPrimerOutcome copy$default(CodeEvents$SessionPrimerOutcome codeEvents$SessionPrimerOutcome, String str, String str2, String str3, Long l, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = codeEvents$SessionPrimerOutcome.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = codeEvents$SessionPrimerOutcome.session_id;
        }
        if ((i & 4) != 0) {
            str3 = codeEvents$SessionPrimerOutcome.outcome;
        }
        if ((i & 8) != 0) {
            l = codeEvents$SessionPrimerOutcome.head_start_ms;
        }
        if ((i & 16) != 0) {
            bool = codeEvents$SessionPrimerOutcome.model_reconciled;
        }
        Boolean bool2 = bool;
        String str4 = str3;
        return codeEvents$SessionPrimerOutcome.copy(str, str2, str4, l, bool2);
    }

    public static final /* synthetic */ void write$Self$analytics(CodeEvents$SessionPrimerOutcome self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.session_id);
        output.q(serialDesc, 2, self.outcome);
        if (output.E(serialDesc) || self.head_start_ms != null) {
            output.B(serialDesc, 3, xka.a, self.head_start_ms);
        }
        if (!output.E(serialDesc) && self.model_reconciled == null) {
            return;
        }
        output.B(serialDesc, 4, zt1.a, self.model_reconciled);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSession_id() {
        return this.session_id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOutcome() {
        return this.outcome;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getHead_start_ms() {
        return this.head_start_ms;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getModel_reconciled() {
        return this.model_reconciled;
    }

    public final CodeEvents$SessionPrimerOutcome copy(String organization_uuid, String session_id, String outcome, Long head_start_ms, Boolean model_reconciled) {
        organization_uuid.getClass();
        session_id.getClass();
        outcome.getClass();
        return new CodeEvents$SessionPrimerOutcome(organization_uuid, session_id, outcome, head_start_ms, model_reconciled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeEvents$SessionPrimerOutcome)) {
            return false;
        }
        CodeEvents$SessionPrimerOutcome codeEvents$SessionPrimerOutcome = (CodeEvents$SessionPrimerOutcome) other;
        return x44.r(this.organization_uuid, codeEvents$SessionPrimerOutcome.organization_uuid) && x44.r(this.session_id, codeEvents$SessionPrimerOutcome.session_id) && x44.r(this.outcome, codeEvents$SessionPrimerOutcome.outcome) && x44.r(this.head_start_ms, codeEvents$SessionPrimerOutcome.head_start_ms) && x44.r(this.model_reconciled, codeEvents$SessionPrimerOutcome.model_reconciled);
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_code_session_primer_outcome";
    }

    public final Long getHead_start_ms() {
        return this.head_start_ms;
    }

    public final Boolean getModel_reconciled() {
        return this.model_reconciled;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getOutcome() {
        return this.outcome;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public int hashCode() {
        int iL = kgh.l(kgh.l(this.organization_uuid.hashCode() * 31, 31, this.session_id), 31, this.outcome);
        Long l = this.head_start_ms;
        int iHashCode = (iL + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.model_reconciled;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.session_id;
        String str3 = this.outcome;
        Long l = this.head_start_ms;
        Boolean bool = this.model_reconciled;
        StringBuilder sbR = kgh.r("SessionPrimerOutcome(organization_uuid=", str, ", session_id=", str2, ", outcome=");
        sbR.append(str3);
        sbR.append(", head_start_ms=");
        sbR.append(l);
        sbR.append(", model_reconciled=");
        return qy1.h(sbR, bool, ")");
    }

    public CodeEvents$SessionPrimerOutcome(String str, String str2, String str3, Long l, Boolean bool) {
        grc.B(str, str2, str3);
        this.organization_uuid = str;
        this.session_id = str2;
        this.outcome = str3;
        this.head_start_ms = l;
        this.model_reconciled = bool;
    }

    public /* synthetic */ CodeEvents$SessionPrimerOutcome(String str, String str2, String str3, Long l, Boolean bool, int i, mq5 mq5Var) {
        this(str, str2, str3, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : bool);
    }
}
