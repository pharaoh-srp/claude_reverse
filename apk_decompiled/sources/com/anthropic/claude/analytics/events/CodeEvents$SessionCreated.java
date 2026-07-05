package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.ov3;
import defpackage.pv3;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.xka;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ0\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u0014\u0010-\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0019¨\u00061"}, d2 = {"com/anthropic/claude/analytics/events/CodeEvents$SessionCreated", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "session_id", "", "latency_ms", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/CodeEvents$SessionCreated;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/CodeEvents$SessionCreated;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/anthropic/claude/analytics/events/CodeEvents$SessionCreated;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getSession_id", "Ljava/lang/Long;", "getLatency_ms", "getEventName", "eventName", "Companion", "ov3", "pv3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CodeEvents$SessionCreated implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final pv3 Companion = new pv3();
    private final Long latency_ms;
    private final String organization_uuid;
    private final String session_id;

    public /* synthetic */ CodeEvents$SessionCreated(int i, String str, String str2, Long l, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, ov3.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.session_id = str2;
        if ((i & 4) == 0) {
            this.latency_ms = null;
        } else {
            this.latency_ms = l;
        }
    }

    public static /* synthetic */ CodeEvents$SessionCreated copy$default(CodeEvents$SessionCreated codeEvents$SessionCreated, String str, String str2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = codeEvents$SessionCreated.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = codeEvents$SessionCreated.session_id;
        }
        if ((i & 4) != 0) {
            l = codeEvents$SessionCreated.latency_ms;
        }
        return codeEvents$SessionCreated.copy(str, str2, l);
    }

    public static final /* synthetic */ void write$Self$analytics(CodeEvents$SessionCreated self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.session_id);
        if (!output.E(serialDesc) && self.latency_ms == null) {
            return;
        }
        output.B(serialDesc, 2, xka.a, self.latency_ms);
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
    public final Long getLatency_ms() {
        return this.latency_ms;
    }

    public final CodeEvents$SessionCreated copy(String organization_uuid, String session_id, Long latency_ms) {
        organization_uuid.getClass();
        session_id.getClass();
        return new CodeEvents$SessionCreated(organization_uuid, session_id, latency_ms);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeEvents$SessionCreated)) {
            return false;
        }
        CodeEvents$SessionCreated codeEvents$SessionCreated = (CodeEvents$SessionCreated) other;
        return x44.r(this.organization_uuid, codeEvents$SessionCreated.organization_uuid) && x44.r(this.session_id, codeEvents$SessionCreated.session_id) && x44.r(this.latency_ms, codeEvents$SessionCreated.latency_ms);
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_code_session_created";
    }

    public final Long getLatency_ms() {
        return this.latency_ms;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public int hashCode() {
        int iL = kgh.l(this.organization_uuid.hashCode() * 31, 31, this.session_id);
        Long l = this.latency_ms;
        return iL + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.session_id;
        Long l = this.latency_ms;
        StringBuilder sbR = kgh.r("SessionCreated(organization_uuid=", str, ", session_id=", str2, ", latency_ms=");
        sbR.append(l);
        sbR.append(")");
        return sbR.toString();
    }

    public CodeEvents$SessionCreated(String str, String str2, Long l) {
        str.getClass();
        str2.getClass();
        this.organization_uuid = str;
        this.session_id = str2;
        this.latency_ms = l;
    }

    public /* synthetic */ CodeEvents$SessionCreated(String str, String str2, Long l, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : l);
    }
}
