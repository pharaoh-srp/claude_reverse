package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.yv3;
import defpackage.zv3;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J8\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0019R\u0014\u0010-\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0019¨\u00061"}, d2 = {"com/anthropic/claude/analytics/events/CodeEvents$SessionListPeeked", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "session_id", "filter_bucket", "active_filter", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/CodeEvents$SessionListPeeked;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/CodeEvents$SessionListPeeked;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/CodeEvents$SessionListPeeked;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getSession_id", "getFilter_bucket", "getActive_filter", "getEventName", "eventName", "Companion", "yv3", "zv3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CodeEvents$SessionListPeeked implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final zv3 Companion = new zv3();
    private final String active_filter;
    private final String filter_bucket;
    private final String organization_uuid;
    private final String session_id;

    public /* synthetic */ CodeEvents$SessionListPeeked(int i, String str, String str2, String str3, String str4, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, yv3.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.session_id = str2;
        this.filter_bucket = str3;
        this.active_filter = str4;
    }

    public static /* synthetic */ CodeEvents$SessionListPeeked copy$default(CodeEvents$SessionListPeeked codeEvents$SessionListPeeked, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = codeEvents$SessionListPeeked.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = codeEvents$SessionListPeeked.session_id;
        }
        if ((i & 4) != 0) {
            str3 = codeEvents$SessionListPeeked.filter_bucket;
        }
        if ((i & 8) != 0) {
            str4 = codeEvents$SessionListPeeked.active_filter;
        }
        return codeEvents$SessionListPeeked.copy(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$analytics(CodeEvents$SessionListPeeked self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.session_id);
        output.q(serialDesc, 2, self.filter_bucket);
        output.q(serialDesc, 3, self.active_filter);
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
    public final String getFilter_bucket() {
        return this.filter_bucket;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getActive_filter() {
        return this.active_filter;
    }

    public final CodeEvents$SessionListPeeked copy(String organization_uuid, String session_id, String filter_bucket, String active_filter) {
        organization_uuid.getClass();
        session_id.getClass();
        filter_bucket.getClass();
        active_filter.getClass();
        return new CodeEvents$SessionListPeeked(organization_uuid, session_id, filter_bucket, active_filter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeEvents$SessionListPeeked)) {
            return false;
        }
        CodeEvents$SessionListPeeked codeEvents$SessionListPeeked = (CodeEvents$SessionListPeeked) other;
        return x44.r(this.organization_uuid, codeEvents$SessionListPeeked.organization_uuid) && x44.r(this.session_id, codeEvents$SessionListPeeked.session_id) && x44.r(this.filter_bucket, codeEvents$SessionListPeeked.filter_bucket) && x44.r(this.active_filter, codeEvents$SessionListPeeked.active_filter);
    }

    public final String getActive_filter() {
        return this.active_filter;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.code.session_list.peeked";
    }

    public final String getFilter_bucket() {
        return this.filter_bucket;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public int hashCode() {
        return this.active_filter.hashCode() + kgh.l(kgh.l(this.organization_uuid.hashCode() * 31, 31, this.session_id), 31, this.filter_bucket);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.session_id;
        return vb7.t(kgh.r("SessionListPeeked(organization_uuid=", str, ", session_id=", str2, ", filter_bucket="), this.filter_bucket, ", active_filter=", this.active_filter, ")");
    }

    public CodeEvents$SessionListPeeked(String str, String str2, String str3, String str4) {
        ij0.z(str, str2, str3, str4);
        this.organization_uuid = str;
        this.session_id = str2;
        this.filter_bucket = str3;
        this.active_filter = str4;
    }
}
