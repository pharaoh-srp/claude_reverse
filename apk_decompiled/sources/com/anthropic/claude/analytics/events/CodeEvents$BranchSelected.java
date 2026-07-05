package com.anthropic.claude.analytics.events;

import defpackage.e79;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.tr3;
import defpackage.ur3;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019R\u0014\u0010)\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0017¨\u0006-"}, d2 = {"com/anthropic/claude/analytics/events/CodeEvents$BranchSelected", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "", "available_count", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/CodeEvents$BranchSelected;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/CodeEvents$BranchSelected;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/anthropic/claude/analytics/events/CodeEvents$BranchSelected;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "Ljava/lang/Integer;", "getAvailable_count", "getEventName", "eventName", "Companion", "tr3", "ur3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CodeEvents$BranchSelected implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final ur3 Companion = new ur3();
    private final Integer available_count;
    private final String organization_uuid;

    public /* synthetic */ CodeEvents$BranchSelected(int i, String str, Integer num, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, tr3.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        if ((i & 2) == 0) {
            this.available_count = null;
        } else {
            this.available_count = num;
        }
    }

    public static /* synthetic */ CodeEvents$BranchSelected copy$default(CodeEvents$BranchSelected codeEvents$BranchSelected, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = codeEvents$BranchSelected.organization_uuid;
        }
        if ((i & 2) != 0) {
            num = codeEvents$BranchSelected.available_count;
        }
        return codeEvents$BranchSelected.copy(str, num);
    }

    public static final /* synthetic */ void write$Self$analytics(CodeEvents$BranchSelected self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        if (!output.E(serialDesc) && self.available_count == null) {
            return;
        }
        output.B(serialDesc, 1, e79.a, self.available_count);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getAvailable_count() {
        return this.available_count;
    }

    public final CodeEvents$BranchSelected copy(String organization_uuid, Integer available_count) {
        organization_uuid.getClass();
        return new CodeEvents$BranchSelected(organization_uuid, available_count);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeEvents$BranchSelected)) {
            return false;
        }
        CodeEvents$BranchSelected codeEvents$BranchSelected = (CodeEvents$BranchSelected) other;
        return x44.r(this.organization_uuid, codeEvents$BranchSelected.organization_uuid) && x44.r(this.available_count, codeEvents$BranchSelected.available_count);
    }

    public final Integer getAvailable_count() {
        return this.available_count;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_code_branch_selected";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public int hashCode() {
        int iHashCode = this.organization_uuid.hashCode() * 31;
        Integer num = this.available_count;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "BranchSelected(organization_uuid=" + this.organization_uuid + ", available_count=" + this.available_count + ")";
    }

    public CodeEvents$BranchSelected(String str, Integer num) {
        str.getClass();
        this.organization_uuid = str;
        this.available_count = num;
    }

    public /* synthetic */ CodeEvents$BranchSelected(String str, Integer num, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : num);
    }
}
