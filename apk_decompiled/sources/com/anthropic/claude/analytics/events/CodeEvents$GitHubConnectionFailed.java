package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.kt3;
import defpackage.lt3;
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
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J&\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0017R\u0014\u0010'\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0017¨\u0006+"}, d2 = {"com/anthropic/claude/analytics/events/CodeEvents$GitHubConnectionFailed", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "error_message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/CodeEvents$GitHubConnectionFailed;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/CodeEvents$GitHubConnectionFailed;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/CodeEvents$GitHubConnectionFailed;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getError_message", "getEventName", "eventName", "Companion", "kt3", "lt3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CodeEvents$GitHubConnectionFailed implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final lt3 Companion = new lt3();
    private final String error_message;
    private final String organization_uuid;

    public /* synthetic */ CodeEvents$GitHubConnectionFailed(int i, String str, String str2, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, kt3.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        if ((i & 2) == 0) {
            this.error_message = null;
        } else {
            this.error_message = str2;
        }
    }

    public static /* synthetic */ CodeEvents$GitHubConnectionFailed copy$default(CodeEvents$GitHubConnectionFailed codeEvents$GitHubConnectionFailed, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = codeEvents$GitHubConnectionFailed.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = codeEvents$GitHubConnectionFailed.error_message;
        }
        return codeEvents$GitHubConnectionFailed.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$analytics(CodeEvents$GitHubConnectionFailed self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        if (!output.E(serialDesc) && self.error_message == null) {
            return;
        }
        output.B(serialDesc, 1, srg.a, self.error_message);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getError_message() {
        return this.error_message;
    }

    public final CodeEvents$GitHubConnectionFailed copy(String organization_uuid, String error_message) {
        organization_uuid.getClass();
        return new CodeEvents$GitHubConnectionFailed(organization_uuid, error_message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeEvents$GitHubConnectionFailed)) {
            return false;
        }
        CodeEvents$GitHubConnectionFailed codeEvents$GitHubConnectionFailed = (CodeEvents$GitHubConnectionFailed) other;
        return x44.r(this.organization_uuid, codeEvents$GitHubConnectionFailed.organization_uuid) && x44.r(this.error_message, codeEvents$GitHubConnectionFailed.error_message);
    }

    public final String getError_message() {
        return this.error_message;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_code_github_connection_failed";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public int hashCode() {
        int iHashCode = this.organization_uuid.hashCode() * 31;
        String str = this.error_message;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return ij0.l("GitHubConnectionFailed(organization_uuid=", this.organization_uuid, ", error_message=", this.error_message, ")");
    }

    public CodeEvents$GitHubConnectionFailed(String str, String str2) {
        str.getClass();
        this.organization_uuid = str;
        this.error_message = str2;
    }

    public /* synthetic */ CodeEvents$GitHubConnectionFailed(String str, String str2, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
