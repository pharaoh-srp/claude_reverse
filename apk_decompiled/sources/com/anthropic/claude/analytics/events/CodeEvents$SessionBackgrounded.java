package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.kv3;
import defpackage.lv3;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ:\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001eR\u0014\u0010/\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u001a¨\u00063"}, d2 = {"com/anthropic/claude/analytics/events/CodeEvents$SessionBackgrounded", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "session_id", "environment_id", "", "turn_in_progress", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLvnf;)V", "Lcom/anthropic/claude/analytics/events/CodeEvents$SessionBackgrounded;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/CodeEvents$SessionBackgrounded;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/anthropic/claude/analytics/events/CodeEvents$SessionBackgrounded;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getSession_id", "getEnvironment_id", "Z", "getTurn_in_progress", "getEventName", "eventName", "Companion", "kv3", "lv3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CodeEvents$SessionBackgrounded implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final lv3 Companion = new lv3();
    private final String environment_id;
    private final String organization_uuid;
    private final String session_id;
    private final boolean turn_in_progress;

    public /* synthetic */ CodeEvents$SessionBackgrounded(int i, String str, String str2, String str3, boolean z, vnf vnfVar) {
        if (11 != (i & 11)) {
            gvj.f(i, 11, kv3.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.session_id = str2;
        if ((i & 4) == 0) {
            this.environment_id = null;
        } else {
            this.environment_id = str3;
        }
        this.turn_in_progress = z;
    }

    public static /* synthetic */ CodeEvents$SessionBackgrounded copy$default(CodeEvents$SessionBackgrounded codeEvents$SessionBackgrounded, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = codeEvents$SessionBackgrounded.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = codeEvents$SessionBackgrounded.session_id;
        }
        if ((i & 4) != 0) {
            str3 = codeEvents$SessionBackgrounded.environment_id;
        }
        if ((i & 8) != 0) {
            z = codeEvents$SessionBackgrounded.turn_in_progress;
        }
        return codeEvents$SessionBackgrounded.copy(str, str2, str3, z);
    }

    public static final /* synthetic */ void write$Self$analytics(CodeEvents$SessionBackgrounded self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.session_id);
        if (output.E(serialDesc) || self.environment_id != null) {
            output.B(serialDesc, 2, srg.a, self.environment_id);
        }
        output.p(serialDesc, 3, self.turn_in_progress);
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

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getTurn_in_progress() {
        return this.turn_in_progress;
    }

    public final CodeEvents$SessionBackgrounded copy(String organization_uuid, String session_id, String environment_id, boolean turn_in_progress) {
        organization_uuid.getClass();
        session_id.getClass();
        return new CodeEvents$SessionBackgrounded(organization_uuid, session_id, environment_id, turn_in_progress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeEvents$SessionBackgrounded)) {
            return false;
        }
        CodeEvents$SessionBackgrounded codeEvents$SessionBackgrounded = (CodeEvents$SessionBackgrounded) other;
        return x44.r(this.organization_uuid, codeEvents$SessionBackgrounded.organization_uuid) && x44.r(this.session_id, codeEvents$SessionBackgrounded.session_id) && x44.r(this.environment_id, codeEvents$SessionBackgrounded.environment_id) && this.turn_in_progress == codeEvents$SessionBackgrounded.turn_in_progress;
    }

    public final String getEnvironment_id() {
        return this.environment_id;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_code_session_backgrounded";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final boolean getTurn_in_progress() {
        return this.turn_in_progress;
    }

    public int hashCode() {
        int iL = kgh.l(this.organization_uuid.hashCode() * 31, 31, this.session_id);
        String str = this.environment_id;
        return Boolean.hashCode(this.turn_in_progress) + ((iL + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.session_id;
        String str3 = this.environment_id;
        boolean z = this.turn_in_progress;
        StringBuilder sbR = kgh.r("SessionBackgrounded(organization_uuid=", str, ", session_id=", str2, ", environment_id=");
        sbR.append(str3);
        sbR.append(", turn_in_progress=");
        sbR.append(z);
        sbR.append(")");
        return sbR.toString();
    }

    public CodeEvents$SessionBackgrounded(String str, String str2, String str3, boolean z) {
        str.getClass();
        str2.getClass();
        this.organization_uuid = str;
        this.session_id = str2;
        this.environment_id = str3;
        this.turn_in_progress = z;
    }

    public /* synthetic */ CodeEvents$SessionBackgrounded(String str, String str2, String str3, boolean z, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : str3, z);
    }
}
