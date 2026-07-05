package com.anthropic.claude.analytics.events;

import defpackage.gi3;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.ms3;
import defpackage.ns3;
import defpackage.onf;
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
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J8\u0010!\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010 R\u0014\u00103\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u001b¨\u00067"}, d2 = {"com/anthropic/claude/analytics/events/CodeEvents$CodePromptSuggestionOutcome", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "session_id", "Lcom/anthropic/claude/analytics/events/CodeEvents$CodePromptSuggestionOutcomeType;", "outcome", "", "time_to_outcome_ms", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/CodeEvents$CodePromptSuggestionOutcomeType;J)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/CodeEvents$CodePromptSuggestionOutcomeType;JLvnf;)V", "Lcom/anthropic/claude/analytics/events/CodeEvents$CodePromptSuggestionOutcome;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/CodeEvents$CodePromptSuggestionOutcome;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/anthropic/claude/analytics/events/CodeEvents$CodePromptSuggestionOutcomeType;", "component4", "()J", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/CodeEvents$CodePromptSuggestionOutcomeType;J)Lcom/anthropic/claude/analytics/events/CodeEvents$CodePromptSuggestionOutcome;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getSession_id", "Lcom/anthropic/claude/analytics/events/CodeEvents$CodePromptSuggestionOutcomeType;", "getOutcome", "J", "getTime_to_outcome_ms", "getEventName", "eventName", "Companion", "ms3", "ns3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CodeEvents$CodePromptSuggestionOutcome implements AnalyticsEvent {
    public static final int $stable = 0;
    private final String organization_uuid;
    private final CodeEvents$CodePromptSuggestionOutcomeType outcome;
    private final String session_id;
    private final long time_to_outcome_ms;
    public static final ns3 Companion = new ns3();
    private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new gi3(25)), null};

    public /* synthetic */ CodeEvents$CodePromptSuggestionOutcome(int i, String str, String str2, CodeEvents$CodePromptSuggestionOutcomeType codeEvents$CodePromptSuggestionOutcomeType, long j, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, ms3.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.session_id = str2;
        this.outcome = codeEvents$CodePromptSuggestionOutcomeType;
        this.time_to_outcome_ms = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return CodeEvents$CodePromptSuggestionOutcomeType.Companion.serializer();
    }

    public static /* synthetic */ CodeEvents$CodePromptSuggestionOutcome copy$default(CodeEvents$CodePromptSuggestionOutcome codeEvents$CodePromptSuggestionOutcome, String str, String str2, CodeEvents$CodePromptSuggestionOutcomeType codeEvents$CodePromptSuggestionOutcomeType, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = codeEvents$CodePromptSuggestionOutcome.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = codeEvents$CodePromptSuggestionOutcome.session_id;
        }
        if ((i & 4) != 0) {
            codeEvents$CodePromptSuggestionOutcomeType = codeEvents$CodePromptSuggestionOutcome.outcome;
        }
        if ((i & 8) != 0) {
            j = codeEvents$CodePromptSuggestionOutcome.time_to_outcome_ms;
        }
        CodeEvents$CodePromptSuggestionOutcomeType codeEvents$CodePromptSuggestionOutcomeType2 = codeEvents$CodePromptSuggestionOutcomeType;
        return codeEvents$CodePromptSuggestionOutcome.copy(str, str2, codeEvents$CodePromptSuggestionOutcomeType2, j);
    }

    public static final /* synthetic */ void write$Self$analytics(CodeEvents$CodePromptSuggestionOutcome self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.session_id);
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.outcome);
        output.D(serialDesc, 3, self.time_to_outcome_ms);
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
    public final CodeEvents$CodePromptSuggestionOutcomeType getOutcome() {
        return this.outcome;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTime_to_outcome_ms() {
        return this.time_to_outcome_ms;
    }

    public final CodeEvents$CodePromptSuggestionOutcome copy(String organization_uuid, String session_id, CodeEvents$CodePromptSuggestionOutcomeType outcome, long time_to_outcome_ms) {
        organization_uuid.getClass();
        session_id.getClass();
        outcome.getClass();
        return new CodeEvents$CodePromptSuggestionOutcome(organization_uuid, session_id, outcome, time_to_outcome_ms);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeEvents$CodePromptSuggestionOutcome)) {
            return false;
        }
        CodeEvents$CodePromptSuggestionOutcome codeEvents$CodePromptSuggestionOutcome = (CodeEvents$CodePromptSuggestionOutcome) other;
        return x44.r(this.organization_uuid, codeEvents$CodePromptSuggestionOutcome.organization_uuid) && x44.r(this.session_id, codeEvents$CodePromptSuggestionOutcome.session_id) && this.outcome == codeEvents$CodePromptSuggestionOutcome.outcome && this.time_to_outcome_ms == codeEvents$CodePromptSuggestionOutcome.time_to_outcome_ms;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.code.prompt_suggestion.outcome";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final CodeEvents$CodePromptSuggestionOutcomeType getOutcome() {
        return this.outcome;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final long getTime_to_outcome_ms() {
        return this.time_to_outcome_ms;
    }

    public int hashCode() {
        return Long.hashCode(this.time_to_outcome_ms) + ((this.outcome.hashCode() + kgh.l(this.organization_uuid.hashCode() * 31, 31, this.session_id)) * 31);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.session_id;
        CodeEvents$CodePromptSuggestionOutcomeType codeEvents$CodePromptSuggestionOutcomeType = this.outcome;
        long j = this.time_to_outcome_ms;
        StringBuilder sbR = kgh.r("CodePromptSuggestionOutcome(organization_uuid=", str, ", session_id=", str2, ", outcome=");
        sbR.append(codeEvents$CodePromptSuggestionOutcomeType);
        sbR.append(", time_to_outcome_ms=");
        sbR.append(j);
        sbR.append(")");
        return sbR.toString();
    }

    public CodeEvents$CodePromptSuggestionOutcome(String str, String str2, CodeEvents$CodePromptSuggestionOutcomeType codeEvents$CodePromptSuggestionOutcomeType, long j) {
        str.getClass();
        str2.getClass();
        codeEvents$CodePromptSuggestionOutcomeType.getClass();
        this.organization_uuid = str;
        this.session_id = str2;
        this.outcome = codeEvents$CodePromptSuggestionOutcomeType;
        this.time_to_outcome_ms = j;
    }
}
