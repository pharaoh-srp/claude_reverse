package com.anthropic.claude.analytics.events;

import defpackage.ds3;
import defpackage.es3;
import defpackage.gi3;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\"JB\u0010#\u001a\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\"R\u0014\u00106\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u001c¨\u0006:"}, d2 = {"com/anthropic/claude/analytics/events/CodeEvents$CodeMessageActionClicked", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "session_id", "message_id", "Lcom/anthropic/claude/analytics/events/CodeEvents$CodeMessageAction;", "action", "Lcom/anthropic/claude/analytics/events/CodeEvents$CodeMessageRole;", "message_role", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/CodeEvents$CodeMessageAction;Lcom/anthropic/claude/analytics/events/CodeEvents$CodeMessageRole;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/CodeEvents$CodeMessageAction;Lcom/anthropic/claude/analytics/events/CodeEvents$CodeMessageRole;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/CodeEvents$CodeMessageActionClicked;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/CodeEvents$CodeMessageActionClicked;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/anthropic/claude/analytics/events/CodeEvents$CodeMessageAction;", "component5", "()Lcom/anthropic/claude/analytics/events/CodeEvents$CodeMessageRole;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/CodeEvents$CodeMessageAction;Lcom/anthropic/claude/analytics/events/CodeEvents$CodeMessageRole;)Lcom/anthropic/claude/analytics/events/CodeEvents$CodeMessageActionClicked;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getSession_id", "getMessage_id", "Lcom/anthropic/claude/analytics/events/CodeEvents$CodeMessageAction;", "getAction", "Lcom/anthropic/claude/analytics/events/CodeEvents$CodeMessageRole;", "getMessage_role", "getEventName", "eventName", "Companion", "ds3", "es3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CodeEvents$CodeMessageActionClicked implements AnalyticsEvent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final es3 Companion = new es3();
    private final CodeEvents$CodeMessageAction action;
    private final String message_id;
    private final CodeEvents$CodeMessageRole message_role;
    private final String organization_uuid;
    private final String session_id;

    static {
        gi3 gi3Var = new gi3(22);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, yb5.w(w1aVar, gi3Var), yb5.w(w1aVar, new gi3(23))};
    }

    public /* synthetic */ CodeEvents$CodeMessageActionClicked(int i, String str, String str2, String str3, CodeEvents$CodeMessageAction codeEvents$CodeMessageAction, CodeEvents$CodeMessageRole codeEvents$CodeMessageRole, vnf vnfVar) {
        if (31 != (i & 31)) {
            gvj.f(i, 31, ds3.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.session_id = str2;
        this.message_id = str3;
        this.action = codeEvents$CodeMessageAction;
        this.message_role = codeEvents$CodeMessageRole;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return CodeEvents$CodeMessageAction.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return CodeEvents$CodeMessageRole.Companion.serializer();
    }

    public static /* synthetic */ CodeEvents$CodeMessageActionClicked copy$default(CodeEvents$CodeMessageActionClicked codeEvents$CodeMessageActionClicked, String str, String str2, String str3, CodeEvents$CodeMessageAction codeEvents$CodeMessageAction, CodeEvents$CodeMessageRole codeEvents$CodeMessageRole, int i, Object obj) {
        if ((i & 1) != 0) {
            str = codeEvents$CodeMessageActionClicked.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = codeEvents$CodeMessageActionClicked.session_id;
        }
        if ((i & 4) != 0) {
            str3 = codeEvents$CodeMessageActionClicked.message_id;
        }
        if ((i & 8) != 0) {
            codeEvents$CodeMessageAction = codeEvents$CodeMessageActionClicked.action;
        }
        if ((i & 16) != 0) {
            codeEvents$CodeMessageRole = codeEvents$CodeMessageActionClicked.message_role;
        }
        CodeEvents$CodeMessageRole codeEvents$CodeMessageRole2 = codeEvents$CodeMessageRole;
        String str4 = str3;
        return codeEvents$CodeMessageActionClicked.copy(str, str2, str4, codeEvents$CodeMessageAction, codeEvents$CodeMessageRole2);
    }

    public static final /* synthetic */ void write$Self$analytics(CodeEvents$CodeMessageActionClicked self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.session_id);
        output.q(serialDesc, 2, self.message_id);
        output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.action);
        output.r(serialDesc, 4, (znf) kw9VarArr[4].getValue(), self.message_role);
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
    public final String getMessage_id() {
        return this.message_id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CodeEvents$CodeMessageAction getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CodeEvents$CodeMessageRole getMessage_role() {
        return this.message_role;
    }

    public final CodeEvents$CodeMessageActionClicked copy(String organization_uuid, String session_id, String message_id, CodeEvents$CodeMessageAction action, CodeEvents$CodeMessageRole message_role) {
        organization_uuid.getClass();
        session_id.getClass();
        message_id.getClass();
        action.getClass();
        message_role.getClass();
        return new CodeEvents$CodeMessageActionClicked(organization_uuid, session_id, message_id, action, message_role);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeEvents$CodeMessageActionClicked)) {
            return false;
        }
        CodeEvents$CodeMessageActionClicked codeEvents$CodeMessageActionClicked = (CodeEvents$CodeMessageActionClicked) other;
        return x44.r(this.organization_uuid, codeEvents$CodeMessageActionClicked.organization_uuid) && x44.r(this.session_id, codeEvents$CodeMessageActionClicked.session_id) && x44.r(this.message_id, codeEvents$CodeMessageActionClicked.message_id) && this.action == codeEvents$CodeMessageActionClicked.action && this.message_role == codeEvents$CodeMessageActionClicked.message_role;
    }

    public final CodeEvents$CodeMessageAction getAction() {
        return this.action;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.code.message_action.clicked";
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final CodeEvents$CodeMessageRole getMessage_role() {
        return this.message_role;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public int hashCode() {
        return this.message_role.hashCode() + ((this.action.hashCode() + kgh.l(kgh.l(this.organization_uuid.hashCode() * 31, 31, this.session_id), 31, this.message_id)) * 31);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.session_id;
        String str3 = this.message_id;
        CodeEvents$CodeMessageAction codeEvents$CodeMessageAction = this.action;
        CodeEvents$CodeMessageRole codeEvents$CodeMessageRole = this.message_role;
        StringBuilder sbR = kgh.r("CodeMessageActionClicked(organization_uuid=", str, ", session_id=", str2, ", message_id=");
        sbR.append(str3);
        sbR.append(", action=");
        sbR.append(codeEvents$CodeMessageAction);
        sbR.append(", message_role=");
        sbR.append(codeEvents$CodeMessageRole);
        sbR.append(")");
        return sbR.toString();
    }

    public CodeEvents$CodeMessageActionClicked(String str, String str2, String str3, CodeEvents$CodeMessageAction codeEvents$CodeMessageAction, CodeEvents$CodeMessageRole codeEvents$CodeMessageRole) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        codeEvents$CodeMessageAction.getClass();
        codeEvents$CodeMessageRole.getClass();
        this.organization_uuid = str;
        this.session_id = str2;
        this.message_id = str3;
        this.action = codeEvents$CodeMessageAction;
        this.message_role = codeEvents$CodeMessageRole;
    }
}
