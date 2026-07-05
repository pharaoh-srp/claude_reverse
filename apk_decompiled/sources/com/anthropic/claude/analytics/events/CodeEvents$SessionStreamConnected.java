package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qw3;
import defpackage.rw3;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J0\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0018R\u0014\u0010*\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0018¨\u0006."}, d2 = {"com/anthropic/claude/analytics/events/CodeEvents$SessionStreamConnected", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "session_id", "environment_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/CodeEvents$SessionStreamConnected;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/CodeEvents$SessionStreamConnected;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/CodeEvents$SessionStreamConnected;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getSession_id", "getEnvironment_id", "getEventName", "eventName", "Companion", "qw3", "rw3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CodeEvents$SessionStreamConnected implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final rw3 Companion = new rw3();
    private final String environment_id;
    private final String organization_uuid;
    private final String session_id;

    public /* synthetic */ CodeEvents$SessionStreamConnected(int i, String str, String str2, String str3, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, qw3.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.session_id = str2;
        if ((i & 4) == 0) {
            this.environment_id = null;
        } else {
            this.environment_id = str3;
        }
    }

    public static /* synthetic */ CodeEvents$SessionStreamConnected copy$default(CodeEvents$SessionStreamConnected codeEvents$SessionStreamConnected, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = codeEvents$SessionStreamConnected.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = codeEvents$SessionStreamConnected.session_id;
        }
        if ((i & 4) != 0) {
            str3 = codeEvents$SessionStreamConnected.environment_id;
        }
        return codeEvents$SessionStreamConnected.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$analytics(CodeEvents$SessionStreamConnected self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.session_id);
        if (!output.E(serialDesc) && self.environment_id == null) {
            return;
        }
        output.B(serialDesc, 2, srg.a, self.environment_id);
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
    public final String getEnvironment_id() {
        return this.environment_id;
    }

    public final CodeEvents$SessionStreamConnected copy(String organization_uuid, String session_id, String environment_id) {
        organization_uuid.getClass();
        session_id.getClass();
        return new CodeEvents$SessionStreamConnected(organization_uuid, session_id, environment_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeEvents$SessionStreamConnected)) {
            return false;
        }
        CodeEvents$SessionStreamConnected codeEvents$SessionStreamConnected = (CodeEvents$SessionStreamConnected) other;
        return x44.r(this.organization_uuid, codeEvents$SessionStreamConnected.organization_uuid) && x44.r(this.session_id, codeEvents$SessionStreamConnected.session_id) && x44.r(this.environment_id, codeEvents$SessionStreamConnected.environment_id);
    }

    public final String getEnvironment_id() {
        return this.environment_id;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_code_session_stream_connected";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public int hashCode() {
        int iL = kgh.l(this.organization_uuid.hashCode() * 31, 31, this.session_id);
        String str = this.environment_id;
        return iL + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.session_id;
        return ij0.m(kgh.r("SessionStreamConnected(organization_uuid=", str, ", session_id=", str2, ", environment_id="), this.environment_id, ")");
    }

    public CodeEvents$SessionStreamConnected(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.organization_uuid = str;
        this.session_id = str2;
        this.environment_id = str3;
    }

    public /* synthetic */ CodeEvents$SessionStreamConnected(String str, String str2, String str3, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
