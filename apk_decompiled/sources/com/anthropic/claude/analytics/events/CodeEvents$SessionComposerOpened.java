package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.mv3;
import defpackage.nv3;
import defpackage.onf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB=\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ8\u0010 \u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u001cJ\u001a\u0010&\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b,\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b\b\u0010\u001fR\u0014\u0010/\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u001a¨\u00063"}, d2 = {"com/anthropic/claude/analytics/events/CodeEvents$SessionComposerOpened", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "", "repository_count", "environment_count", "", "is_github_connected", "<init>", "(Ljava/lang/String;IIZ)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;IIZLvnf;)V", "Lcom/anthropic/claude/analytics/events/CodeEvents$SessionComposerOpened;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/CodeEvents$SessionComposerOpened;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "()Z", "copy", "(Ljava/lang/String;IIZ)Lcom/anthropic/claude/analytics/events/CodeEvents$SessionComposerOpened;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "I", "getRepository_count", "getEnvironment_count", "Z", "getEventName", "eventName", "Companion", "mv3", "nv3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CodeEvents$SessionComposerOpened implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final nv3 Companion = new nv3();
    private final int environment_count;
    private final boolean is_github_connected;
    private final String organization_uuid;
    private final int repository_count;

    public /* synthetic */ CodeEvents$SessionComposerOpened(int i, String str, int i2, int i3, boolean z, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, mv3.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.repository_count = i2;
        this.environment_count = i3;
        this.is_github_connected = z;
    }

    public static /* synthetic */ CodeEvents$SessionComposerOpened copy$default(CodeEvents$SessionComposerOpened codeEvents$SessionComposerOpened, String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = codeEvents$SessionComposerOpened.organization_uuid;
        }
        if ((i3 & 2) != 0) {
            i = codeEvents$SessionComposerOpened.repository_count;
        }
        if ((i3 & 4) != 0) {
            i2 = codeEvents$SessionComposerOpened.environment_count;
        }
        if ((i3 & 8) != 0) {
            z = codeEvents$SessionComposerOpened.is_github_connected;
        }
        return codeEvents$SessionComposerOpened.copy(str, i, i2, z);
    }

    public static final /* synthetic */ void write$Self$analytics(CodeEvents$SessionComposerOpened self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        output.l(1, self.repository_count, serialDesc);
        output.l(2, self.environment_count, serialDesc);
        output.p(serialDesc, 3, self.is_github_connected);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRepository_count() {
        return this.repository_count;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getEnvironment_count() {
        return this.environment_count;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIs_github_connected() {
        return this.is_github_connected;
    }

    public final CodeEvents$SessionComposerOpened copy(String organization_uuid, int repository_count, int environment_count, boolean is_github_connected) {
        organization_uuid.getClass();
        return new CodeEvents$SessionComposerOpened(organization_uuid, repository_count, environment_count, is_github_connected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeEvents$SessionComposerOpened)) {
            return false;
        }
        CodeEvents$SessionComposerOpened codeEvents$SessionComposerOpened = (CodeEvents$SessionComposerOpened) other;
        return x44.r(this.organization_uuid, codeEvents$SessionComposerOpened.organization_uuid) && this.repository_count == codeEvents$SessionComposerOpened.repository_count && this.environment_count == codeEvents$SessionComposerOpened.environment_count && this.is_github_connected == codeEvents$SessionComposerOpened.is_github_connected;
    }

    public final int getEnvironment_count() {
        return this.environment_count;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_code_session_composer_opened";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final int getRepository_count() {
        return this.repository_count;
    }

    public int hashCode() {
        return Boolean.hashCode(this.is_github_connected) + vb7.c(this.environment_count, vb7.c(this.repository_count, this.organization_uuid.hashCode() * 31, 31), 31);
    }

    public final boolean is_github_connected() {
        return this.is_github_connected;
    }

    public String toString() {
        String str = this.organization_uuid;
        int i = this.repository_count;
        int i2 = this.environment_count;
        boolean z = this.is_github_connected;
        StringBuilder sbP = ij0.p("SessionComposerOpened(organization_uuid=", str, i, ", repository_count=", ", environment_count=");
        sbP.append(i2);
        sbP.append(", is_github_connected=");
        sbP.append(z);
        sbP.append(")");
        return sbP.toString();
    }

    public CodeEvents$SessionComposerOpened(String str, int i, int i2, boolean z) {
        str.getClass();
        this.organization_uuid = str;
        this.repository_count = i;
        this.environment_count = i2;
        this.is_github_connected = z;
    }
}
