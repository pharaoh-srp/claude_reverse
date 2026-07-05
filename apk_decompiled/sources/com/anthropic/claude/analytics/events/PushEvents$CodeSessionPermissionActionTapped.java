package com.anthropic.claude.analytics.events;

import defpackage.fsh;
import defpackage.gid;
import defpackage.grc;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.iyd;
import defpackage.jyd;
import defpackage.kgh;
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
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJD\u0010!\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\u00062\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b0\u0010\u001bR\u0014\u00102\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u001b¨\u00066"}, d2 = {"com/anthropic/claude/analytics/events/PushEvents$CodeSessionPermissionActionTapped", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "account_uuid", "session_id", "", "allow", "tool_name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/PushEvents$CodeSessionPermissionActionTapped;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/PushEvents$CodeSessionPermissionActionTapped;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lcom/anthropic/claude/analytics/events/PushEvents$CodeSessionPermissionActionTapped;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getAccount_uuid", "getSession_id", "Z", "getAllow", "getTool_name", "getEventName", "eventName", "Companion", "iyd", "jyd", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class PushEvents$CodeSessionPermissionActionTapped implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final jyd Companion = new jyd();
    private final String account_uuid;
    private final boolean allow;
    private final String organization_uuid;
    private final String session_id;
    private final String tool_name;

    public /* synthetic */ PushEvents$CodeSessionPermissionActionTapped(int i, String str, String str2, String str3, boolean z, String str4, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, iyd.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.account_uuid = str2;
        this.session_id = str3;
        this.allow = z;
        if ((i & 16) == 0) {
            this.tool_name = null;
        } else {
            this.tool_name = str4;
        }
    }

    public static /* synthetic */ PushEvents$CodeSessionPermissionActionTapped copy$default(PushEvents$CodeSessionPermissionActionTapped pushEvents$CodeSessionPermissionActionTapped, String str, String str2, String str3, boolean z, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pushEvents$CodeSessionPermissionActionTapped.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = pushEvents$CodeSessionPermissionActionTapped.account_uuid;
        }
        if ((i & 4) != 0) {
            str3 = pushEvents$CodeSessionPermissionActionTapped.session_id;
        }
        if ((i & 8) != 0) {
            z = pushEvents$CodeSessionPermissionActionTapped.allow;
        }
        if ((i & 16) != 0) {
            str4 = pushEvents$CodeSessionPermissionActionTapped.tool_name;
        }
        String str5 = str4;
        String str6 = str3;
        return pushEvents$CodeSessionPermissionActionTapped.copy(str, str2, str6, z, str5);
    }

    public static final /* synthetic */ void write$Self$analytics(PushEvents$CodeSessionPermissionActionTapped self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.account_uuid);
        output.q(serialDesc, 2, self.session_id);
        output.p(serialDesc, 3, self.allow);
        if (!output.E(serialDesc) && self.tool_name == null) {
            return;
        }
        output.B(serialDesc, 4, srg.a, self.tool_name);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAccount_uuid() {
        return this.account_uuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSession_id() {
        return this.session_id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getAllow() {
        return this.allow;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTool_name() {
        return this.tool_name;
    }

    public final PushEvents$CodeSessionPermissionActionTapped copy(String organization_uuid, String account_uuid, String session_id, boolean allow, String tool_name) {
        organization_uuid.getClass();
        account_uuid.getClass();
        session_id.getClass();
        return new PushEvents$CodeSessionPermissionActionTapped(organization_uuid, account_uuid, session_id, allow, tool_name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushEvents$CodeSessionPermissionActionTapped)) {
            return false;
        }
        PushEvents$CodeSessionPermissionActionTapped pushEvents$CodeSessionPermissionActionTapped = (PushEvents$CodeSessionPermissionActionTapped) other;
        return x44.r(this.organization_uuid, pushEvents$CodeSessionPermissionActionTapped.organization_uuid) && x44.r(this.account_uuid, pushEvents$CodeSessionPermissionActionTapped.account_uuid) && x44.r(this.session_id, pushEvents$CodeSessionPermissionActionTapped.session_id) && this.allow == pushEvents$CodeSessionPermissionActionTapped.allow && x44.r(this.tool_name, pushEvents$CodeSessionPermissionActionTapped.tool_name);
    }

    public final String getAccount_uuid() {
        return this.account_uuid;
    }

    public final boolean getAllow() {
        return this.allow;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile.push.code_session_permission_action_tapped";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final String getTool_name() {
        return this.tool_name;
    }

    public int hashCode() {
        int iP = fsh.p(kgh.l(kgh.l(this.organization_uuid.hashCode() * 31, 31, this.account_uuid), 31, this.session_id), 31, this.allow);
        String str = this.tool_name;
        return iP + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.account_uuid;
        String str3 = this.session_id;
        boolean z = this.allow;
        String str4 = this.tool_name;
        StringBuilder sbR = kgh.r("CodeSessionPermissionActionTapped(organization_uuid=", str, ", account_uuid=", str2, ", session_id=");
        gid.t(sbR, str3, ", allow=", z, ", tool_name=");
        return ij0.m(sbR, str4, ")");
    }

    public PushEvents$CodeSessionPermissionActionTapped(String str, String str2, String str3, boolean z, String str4) {
        grc.B(str, str2, str3);
        this.organization_uuid = str;
        this.account_uuid = str2;
        this.session_id = str3;
        this.allow = z;
        this.tool_name = str4;
    }

    public /* synthetic */ PushEvents$CodeSessionPermissionActionTapped(String str, String str2, String str3, boolean z, String str4, int i, mq5 mq5Var) {
        this(str, str2, str3, z, (i & 16) != 0 ? null : str4);
    }
}
