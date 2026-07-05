package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mw3;
import defpackage.nw3;
import defpackage.onf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 82\u00020\u0001:\u00029:B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJL\u0010$\u001a\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b'\u0010\"J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\"R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b5\u0010\u001cR\u0014\u00107\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u001c¨\u0006;"}, d2 = {"com/anthropic/claude/analytics/events/CodeEvents$SessionStreamConnectResult", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "session_id", "result", "", "duration_ms", "", "attempts", "phase", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/CodeEvents$SessionStreamConnectResult;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/CodeEvents$SessionStreamConnectResult;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()J", "component5", "()I", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;)Lcom/anthropic/claude/analytics/events/CodeEvents$SessionStreamConnectResult;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getSession_id", "getResult", "J", "getDuration_ms", "I", "getAttempts", "getPhase", "getEventName", "eventName", "Companion", "mw3", "nw3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CodeEvents$SessionStreamConnectResult implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final nw3 Companion = new nw3();
    private final int attempts;
    private final long duration_ms;
    private final String organization_uuid;
    private final String phase;
    private final String result;
    private final String session_id;

    public /* synthetic */ CodeEvents$SessionStreamConnectResult(int i, String str, String str2, String str3, long j, int i2, String str4, vnf vnfVar) {
        if (63 != (i & 63)) {
            gvj.f(i, 63, mw3.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.session_id = str2;
        this.result = str3;
        this.duration_ms = j;
        this.attempts = i2;
        this.phase = str4;
    }

    public static /* synthetic */ CodeEvents$SessionStreamConnectResult copy$default(CodeEvents$SessionStreamConnectResult codeEvents$SessionStreamConnectResult, String str, String str2, String str3, long j, int i, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = codeEvents$SessionStreamConnectResult.organization_uuid;
        }
        if ((i2 & 2) != 0) {
            str2 = codeEvents$SessionStreamConnectResult.session_id;
        }
        if ((i2 & 4) != 0) {
            str3 = codeEvents$SessionStreamConnectResult.result;
        }
        if ((i2 & 8) != 0) {
            j = codeEvents$SessionStreamConnectResult.duration_ms;
        }
        if ((i2 & 16) != 0) {
            i = codeEvents$SessionStreamConnectResult.attempts;
        }
        if ((i2 & 32) != 0) {
            str4 = codeEvents$SessionStreamConnectResult.phase;
        }
        long j2 = j;
        String str5 = str3;
        return codeEvents$SessionStreamConnectResult.copy(str, str2, str5, j2, i, str4);
    }

    public static final /* synthetic */ void write$Self$analytics(CodeEvents$SessionStreamConnectResult self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.session_id);
        output.q(serialDesc, 2, self.result);
        output.D(serialDesc, 3, self.duration_ms);
        output.l(4, self.attempts, serialDesc);
        output.q(serialDesc, 5, self.phase);
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
    public final String getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getDuration_ms() {
        return this.duration_ms;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getAttempts() {
        return this.attempts;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPhase() {
        return this.phase;
    }

    public final CodeEvents$SessionStreamConnectResult copy(String organization_uuid, String session_id, String result, long duration_ms, int attempts, String phase) {
        organization_uuid.getClass();
        session_id.getClass();
        result.getClass();
        phase.getClass();
        return new CodeEvents$SessionStreamConnectResult(organization_uuid, session_id, result, duration_ms, attempts, phase);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeEvents$SessionStreamConnectResult)) {
            return false;
        }
        CodeEvents$SessionStreamConnectResult codeEvents$SessionStreamConnectResult = (CodeEvents$SessionStreamConnectResult) other;
        return x44.r(this.organization_uuid, codeEvents$SessionStreamConnectResult.organization_uuid) && x44.r(this.session_id, codeEvents$SessionStreamConnectResult.session_id) && x44.r(this.result, codeEvents$SessionStreamConnectResult.result) && this.duration_ms == codeEvents$SessionStreamConnectResult.duration_ms && this.attempts == codeEvents$SessionStreamConnectResult.attempts && x44.r(this.phase, codeEvents$SessionStreamConnectResult.phase);
    }

    public final int getAttempts() {
        return this.attempts;
    }

    public final long getDuration_ms() {
        return this.duration_ms;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.code.session_stream.connect_result";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getPhase() {
        return this.phase;
    }

    public final String getResult() {
        return this.result;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public int hashCode() {
        return this.phase.hashCode() + vb7.c(this.attempts, vb7.e(kgh.l(kgh.l(this.organization_uuid.hashCode() * 31, 31, this.session_id), 31, this.result), 31, this.duration_ms), 31);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.session_id;
        String str3 = this.result;
        long j = this.duration_ms;
        int i = this.attempts;
        String str4 = this.phase;
        StringBuilder sbR = kgh.r("SessionStreamConnectResult(organization_uuid=", str, ", session_id=", str2, ", result=");
        sbR.append(str3);
        sbR.append(", duration_ms=");
        sbR.append(j);
        sbR.append(", attempts=");
        sbR.append(i);
        sbR.append(", phase=");
        sbR.append(str4);
        sbR.append(")");
        return sbR.toString();
    }

    public CodeEvents$SessionStreamConnectResult(String str, String str2, String str3, long j, int i, String str4) {
        ij0.z(str, str2, str3, str4);
        this.organization_uuid = str;
        this.session_id = str2;
        this.result = str3;
        this.duration_ms = j;
        this.attempts = i;
        this.phase = str4;
    }
}
