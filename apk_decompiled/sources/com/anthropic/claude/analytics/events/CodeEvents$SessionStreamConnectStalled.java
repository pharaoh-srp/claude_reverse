package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.ow3;
import defpackage.pw3;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ:\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001eR\u0014\u00100\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u001a¨\u00064"}, d2 = {"com/anthropic/claude/analytics/events/CodeEvents$SessionStreamConnectStalled", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "session_id", "phase", "", "elapsed_ms", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLvnf;)V", "Lcom/anthropic/claude/analytics/events/CodeEvents$SessionStreamConnectStalled;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/CodeEvents$SessionStreamConnectStalled;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()J", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lcom/anthropic/claude/analytics/events/CodeEvents$SessionStreamConnectStalled;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getSession_id", "getPhase", "J", "getElapsed_ms", "getEventName", "eventName", "Companion", "ow3", "pw3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CodeEvents$SessionStreamConnectStalled implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final pw3 Companion = new pw3();
    private final long elapsed_ms;
    private final String organization_uuid;
    private final String phase;
    private final String session_id;

    public /* synthetic */ CodeEvents$SessionStreamConnectStalled(int i, String str, String str2, String str3, long j, vnf vnfVar) {
        if (13 != (i & 13)) {
            gvj.f(i, 13, ow3.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        if ((i & 2) == 0) {
            this.session_id = null;
        } else {
            this.session_id = str2;
        }
        this.phase = str3;
        this.elapsed_ms = j;
    }

    public static /* synthetic */ CodeEvents$SessionStreamConnectStalled copy$default(CodeEvents$SessionStreamConnectStalled codeEvents$SessionStreamConnectStalled, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = codeEvents$SessionStreamConnectStalled.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = codeEvents$SessionStreamConnectStalled.session_id;
        }
        if ((i & 4) != 0) {
            str3 = codeEvents$SessionStreamConnectStalled.phase;
        }
        if ((i & 8) != 0) {
            j = codeEvents$SessionStreamConnectStalled.elapsed_ms;
        }
        String str4 = str3;
        return codeEvents$SessionStreamConnectStalled.copy(str, str2, str4, j);
    }

    public static final /* synthetic */ void write$Self$analytics(CodeEvents$SessionStreamConnectStalled self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        if (output.E(serialDesc) || self.session_id != null) {
            output.B(serialDesc, 1, srg.a, self.session_id);
        }
        output.q(serialDesc, 2, self.phase);
        output.D(serialDesc, 3, self.elapsed_ms);
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
    public final String getPhase() {
        return this.phase;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getElapsed_ms() {
        return this.elapsed_ms;
    }

    public final CodeEvents$SessionStreamConnectStalled copy(String organization_uuid, String session_id, String phase, long elapsed_ms) {
        organization_uuid.getClass();
        phase.getClass();
        return new CodeEvents$SessionStreamConnectStalled(organization_uuid, session_id, phase, elapsed_ms);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeEvents$SessionStreamConnectStalled)) {
            return false;
        }
        CodeEvents$SessionStreamConnectStalled codeEvents$SessionStreamConnectStalled = (CodeEvents$SessionStreamConnectStalled) other;
        return x44.r(this.organization_uuid, codeEvents$SessionStreamConnectStalled.organization_uuid) && x44.r(this.session_id, codeEvents$SessionStreamConnectStalled.session_id) && x44.r(this.phase, codeEvents$SessionStreamConnectStalled.phase) && this.elapsed_ms == codeEvents$SessionStreamConnectStalled.elapsed_ms;
    }

    public final long getElapsed_ms() {
        return this.elapsed_ms;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.code.session_stream.connect_stalled";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getPhase() {
        return this.phase;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public int hashCode() {
        int iHashCode = this.organization_uuid.hashCode() * 31;
        String str = this.session_id;
        return Long.hashCode(this.elapsed_ms) + kgh.l((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.phase);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.session_id;
        String str3 = this.phase;
        long j = this.elapsed_ms;
        StringBuilder sbR = kgh.r("SessionStreamConnectStalled(organization_uuid=", str, ", session_id=", str2, ", phase=");
        sbR.append(str3);
        sbR.append(", elapsed_ms=");
        sbR.append(j);
        sbR.append(")");
        return sbR.toString();
    }

    public CodeEvents$SessionStreamConnectStalled(String str, String str2, String str3, long j) {
        str.getClass();
        str3.getClass();
        this.organization_uuid = str;
        this.session_id = str2;
        this.phase = str3;
        this.elapsed_ms = j;
    }

    public /* synthetic */ CodeEvents$SessionStreamConnectStalled(String str, String str2, String str3, long j, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, str3, j);
    }
}
