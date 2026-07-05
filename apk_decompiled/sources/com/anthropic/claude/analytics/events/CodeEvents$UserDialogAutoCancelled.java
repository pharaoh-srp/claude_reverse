package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.hx3;
import defpackage.ix3;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
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
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ8\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001eR\u0014\u00100\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u001a¨\u00064"}, d2 = {"com/anthropic/claude/analytics/events/CodeEvents$UserDialogAutoCancelled", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "session_id", "dialog_kind", "Lcom/anthropic/claude/analytics/events/CodeEvents$UserDialogAutoCancelReason;", "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/CodeEvents$UserDialogAutoCancelReason;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/CodeEvents$UserDialogAutoCancelReason;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/CodeEvents$UserDialogAutoCancelled;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/CodeEvents$UserDialogAutoCancelled;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/anthropic/claude/analytics/events/CodeEvents$UserDialogAutoCancelReason;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/CodeEvents$UserDialogAutoCancelReason;)Lcom/anthropic/claude/analytics/events/CodeEvents$UserDialogAutoCancelled;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getSession_id", "getDialog_kind", "Lcom/anthropic/claude/analytics/events/CodeEvents$UserDialogAutoCancelReason;", "getReason", "getEventName", "eventName", "Companion", "hx3", "ix3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CodeEvents$UserDialogAutoCancelled implements AnalyticsEvent {
    public static final int $stable = 0;
    private final String dialog_kind;
    private final String organization_uuid;
    private final CodeEvents$UserDialogAutoCancelReason reason;
    private final String session_id;
    public static final ix3 Companion = new ix3();
    private static final kw9[] $childSerializers = {null, null, null, yb5.w(w1a.F, new wt3(14))};

    public /* synthetic */ CodeEvents$UserDialogAutoCancelled(int i, String str, String str2, String str3, CodeEvents$UserDialogAutoCancelReason codeEvents$UserDialogAutoCancelReason, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, hx3.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.session_id = str2;
        this.dialog_kind = str3;
        this.reason = codeEvents$UserDialogAutoCancelReason;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return CodeEvents$UserDialogAutoCancelReason.Companion.serializer();
    }

    public static /* synthetic */ CodeEvents$UserDialogAutoCancelled copy$default(CodeEvents$UserDialogAutoCancelled codeEvents$UserDialogAutoCancelled, String str, String str2, String str3, CodeEvents$UserDialogAutoCancelReason codeEvents$UserDialogAutoCancelReason, int i, Object obj) {
        if ((i & 1) != 0) {
            str = codeEvents$UserDialogAutoCancelled.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = codeEvents$UserDialogAutoCancelled.session_id;
        }
        if ((i & 4) != 0) {
            str3 = codeEvents$UserDialogAutoCancelled.dialog_kind;
        }
        if ((i & 8) != 0) {
            codeEvents$UserDialogAutoCancelReason = codeEvents$UserDialogAutoCancelled.reason;
        }
        return codeEvents$UserDialogAutoCancelled.copy(str, str2, str3, codeEvents$UserDialogAutoCancelReason);
    }

    public static final /* synthetic */ void write$Self$analytics(CodeEvents$UserDialogAutoCancelled self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.session_id);
        output.q(serialDesc, 2, self.dialog_kind);
        output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.reason);
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
    public final String getDialog_kind() {
        return this.dialog_kind;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CodeEvents$UserDialogAutoCancelReason getReason() {
        return this.reason;
    }

    public final CodeEvents$UserDialogAutoCancelled copy(String organization_uuid, String session_id, String dialog_kind, CodeEvents$UserDialogAutoCancelReason reason) {
        organization_uuid.getClass();
        session_id.getClass();
        dialog_kind.getClass();
        reason.getClass();
        return new CodeEvents$UserDialogAutoCancelled(organization_uuid, session_id, dialog_kind, reason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeEvents$UserDialogAutoCancelled)) {
            return false;
        }
        CodeEvents$UserDialogAutoCancelled codeEvents$UserDialogAutoCancelled = (CodeEvents$UserDialogAutoCancelled) other;
        return x44.r(this.organization_uuid, codeEvents$UserDialogAutoCancelled.organization_uuid) && x44.r(this.session_id, codeEvents$UserDialogAutoCancelled.session_id) && x44.r(this.dialog_kind, codeEvents$UserDialogAutoCancelled.dialog_kind) && this.reason == codeEvents$UserDialogAutoCancelled.reason;
    }

    public final String getDialog_kind() {
        return this.dialog_kind;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.code.user_dialog.auto_cancelled";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final CodeEvents$UserDialogAutoCancelReason getReason() {
        return this.reason;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public int hashCode() {
        return this.reason.hashCode() + kgh.l(kgh.l(this.organization_uuid.hashCode() * 31, 31, this.session_id), 31, this.dialog_kind);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.session_id;
        String str3 = this.dialog_kind;
        CodeEvents$UserDialogAutoCancelReason codeEvents$UserDialogAutoCancelReason = this.reason;
        StringBuilder sbR = kgh.r("UserDialogAutoCancelled(organization_uuid=", str, ", session_id=", str2, ", dialog_kind=");
        sbR.append(str3);
        sbR.append(", reason=");
        sbR.append(codeEvents$UserDialogAutoCancelReason);
        sbR.append(")");
        return sbR.toString();
    }

    public CodeEvents$UserDialogAutoCancelled(String str, String str2, String str3, CodeEvents$UserDialogAutoCancelReason codeEvents$UserDialogAutoCancelReason) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        codeEvents$UserDialogAutoCancelReason.getClass();
        this.organization_uuid = str;
        this.session_id = str2;
        this.dialog_kind = str3;
        this.reason = codeEvents$UserDialogAutoCancelReason;
    }
}
