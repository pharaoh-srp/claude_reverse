package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.pu3;
import defpackage.qu3;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wt3;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ0\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u0014\u0010-\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0019¨\u00061"}, d2 = {"com/anthropic/claude/analytics/events/CodeEvents$PullRequestOpened", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "session_id", "Lcom/anthropic/claude/analytics/events/CodeEvents$PullRequestOpenEntryPoint;", "entry_point", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/CodeEvents$PullRequestOpenEntryPoint;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/CodeEvents$PullRequestOpenEntryPoint;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/CodeEvents$PullRequestOpened;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/CodeEvents$PullRequestOpened;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/anthropic/claude/analytics/events/CodeEvents$PullRequestOpenEntryPoint;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/CodeEvents$PullRequestOpenEntryPoint;)Lcom/anthropic/claude/analytics/events/CodeEvents$PullRequestOpened;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getSession_id", "Lcom/anthropic/claude/analytics/events/CodeEvents$PullRequestOpenEntryPoint;", "getEntry_point", "getEventName", "eventName", "Companion", "pu3", "qu3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CodeEvents$PullRequestOpened implements AnalyticsEvent {
    public static final int $stable = 0;
    private final CodeEvents$PullRequestOpenEntryPoint entry_point;
    private final String organization_uuid;
    private final String session_id;
    public static final qu3 Companion = new qu3();
    private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new wt3(5))};

    public /* synthetic */ CodeEvents$PullRequestOpened(int i, String str, String str2, CodeEvents$PullRequestOpenEntryPoint codeEvents$PullRequestOpenEntryPoint, vnf vnfVar) {
        if (5 != (i & 5)) {
            gvj.f(i, 5, pu3.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        if ((i & 2) == 0) {
            this.session_id = null;
        } else {
            this.session_id = str2;
        }
        this.entry_point = codeEvents$PullRequestOpenEntryPoint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return CodeEvents$PullRequestOpenEntryPoint.Companion.serializer();
    }

    public static /* synthetic */ CodeEvents$PullRequestOpened copy$default(CodeEvents$PullRequestOpened codeEvents$PullRequestOpened, String str, String str2, CodeEvents$PullRequestOpenEntryPoint codeEvents$PullRequestOpenEntryPoint, int i, Object obj) {
        if ((i & 1) != 0) {
            str = codeEvents$PullRequestOpened.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = codeEvents$PullRequestOpened.session_id;
        }
        if ((i & 4) != 0) {
            codeEvents$PullRequestOpenEntryPoint = codeEvents$PullRequestOpened.entry_point;
        }
        return codeEvents$PullRequestOpened.copy(str, str2, codeEvents$PullRequestOpenEntryPoint);
    }

    public static final /* synthetic */ void write$Self$analytics(CodeEvents$PullRequestOpened self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        if (output.E(serialDesc) || self.session_id != null) {
            output.B(serialDesc, 1, srg.a, self.session_id);
        }
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.entry_point);
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
    public final CodeEvents$PullRequestOpenEntryPoint getEntry_point() {
        return this.entry_point;
    }

    public final CodeEvents$PullRequestOpened copy(String organization_uuid, String session_id, CodeEvents$PullRequestOpenEntryPoint entry_point) {
        organization_uuid.getClass();
        entry_point.getClass();
        return new CodeEvents$PullRequestOpened(organization_uuid, session_id, entry_point);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeEvents$PullRequestOpened)) {
            return false;
        }
        CodeEvents$PullRequestOpened codeEvents$PullRequestOpened = (CodeEvents$PullRequestOpened) other;
        return x44.r(this.organization_uuid, codeEvents$PullRequestOpened.organization_uuid) && x44.r(this.session_id, codeEvents$PullRequestOpened.session_id) && this.entry_point == codeEvents$PullRequestOpened.entry_point;
    }

    public final CodeEvents$PullRequestOpenEntryPoint getEntry_point() {
        return this.entry_point;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.code.pull_request.opened";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public int hashCode() {
        int iHashCode = this.organization_uuid.hashCode() * 31;
        String str = this.session_id;
        return this.entry_point.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.session_id;
        CodeEvents$PullRequestOpenEntryPoint codeEvents$PullRequestOpenEntryPoint = this.entry_point;
        StringBuilder sbR = kgh.r("PullRequestOpened(organization_uuid=", str, ", session_id=", str2, ", entry_point=");
        sbR.append(codeEvents$PullRequestOpenEntryPoint);
        sbR.append(")");
        return sbR.toString();
    }

    public CodeEvents$PullRequestOpened(String str, String str2, CodeEvents$PullRequestOpenEntryPoint codeEvents$PullRequestOpenEntryPoint) {
        str.getClass();
        codeEvents$PullRequestOpenEntryPoint.getClass();
        this.organization_uuid = str;
        this.session_id = str2;
        this.entry_point = codeEvents$PullRequestOpenEntryPoint;
    }

    public /* synthetic */ CodeEvents$PullRequestOpened(String str, String str2, CodeEvents$PullRequestOpenEntryPoint codeEvents$PullRequestOpenEntryPoint, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, codeEvents$PullRequestOpenEntryPoint);
    }
}
