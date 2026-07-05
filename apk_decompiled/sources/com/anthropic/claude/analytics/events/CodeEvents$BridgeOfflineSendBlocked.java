package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.vr3;
import defpackage.wr3;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J0\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0018R\u0014\u0010*\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0018¨\u0006."}, d2 = {"com/anthropic/claude/analytics/events/CodeEvents$BridgeOfflineSendBlocked", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "session_id", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/CodeEvents$BridgeOfflineSendBlocked;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/CodeEvents$BridgeOfflineSendBlocked;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/CodeEvents$BridgeOfflineSendBlocked;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getSession_id", "getSource", "getEventName", "eventName", "Companion", "vr3", "wr3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CodeEvents$BridgeOfflineSendBlocked implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final wr3 Companion = new wr3();
    private final String organization_uuid;
    private final String session_id;
    private final String source;

    public /* synthetic */ CodeEvents$BridgeOfflineSendBlocked(int i, String str, String str2, String str3, vnf vnfVar) {
        if (5 != (i & 5)) {
            gvj.f(i, 5, vr3.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        if ((i & 2) == 0) {
            this.session_id = null;
        } else {
            this.session_id = str2;
        }
        this.source = str3;
    }

    public static /* synthetic */ CodeEvents$BridgeOfflineSendBlocked copy$default(CodeEvents$BridgeOfflineSendBlocked codeEvents$BridgeOfflineSendBlocked, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = codeEvents$BridgeOfflineSendBlocked.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = codeEvents$BridgeOfflineSendBlocked.session_id;
        }
        if ((i & 4) != 0) {
            str3 = codeEvents$BridgeOfflineSendBlocked.source;
        }
        return codeEvents$BridgeOfflineSendBlocked.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$analytics(CodeEvents$BridgeOfflineSendBlocked self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        if (output.E(serialDesc) || self.session_id != null) {
            output.B(serialDesc, 1, srg.a, self.session_id);
        }
        output.q(serialDesc, 2, self.source);
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
    public final String getSource() {
        return this.source;
    }

    public final CodeEvents$BridgeOfflineSendBlocked copy(String organization_uuid, String session_id, String source) {
        organization_uuid.getClass();
        source.getClass();
        return new CodeEvents$BridgeOfflineSendBlocked(organization_uuid, session_id, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeEvents$BridgeOfflineSendBlocked)) {
            return false;
        }
        CodeEvents$BridgeOfflineSendBlocked codeEvents$BridgeOfflineSendBlocked = (CodeEvents$BridgeOfflineSendBlocked) other;
        return x44.r(this.organization_uuid, codeEvents$BridgeOfflineSendBlocked.organization_uuid) && x44.r(this.session_id, codeEvents$BridgeOfflineSendBlocked.session_id) && x44.r(this.source, codeEvents$BridgeOfflineSendBlocked.source);
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.code.bridge_offline_send_blocked";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        int iHashCode = this.organization_uuid.hashCode() * 31;
        String str = this.session_id;
        return this.source.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.session_id;
        return ij0.m(kgh.r("BridgeOfflineSendBlocked(organization_uuid=", str, ", session_id=", str2, ", source="), this.source, ")");
    }

    public CodeEvents$BridgeOfflineSendBlocked(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.organization_uuid = str;
        this.session_id = str2;
        this.source = str3;
    }

    public /* synthetic */ CodeEvents$BridgeOfflineSendBlocked(String str, String str2, String str3, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, str3);
    }
}
