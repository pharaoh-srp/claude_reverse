package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.rod;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.vyd;
import defpackage.w1a;
import defpackage.wyd;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000267B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!JB\u0010\"\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b%\u0010!J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010!R\u0014\u00104\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u001b¨\u00068"}, d2 = {"com/anthropic/claude/analytics/events/PushEvents$SessionReplyActionResult", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "account_uuid", "session_id", "Lcom/anthropic/claude/analytics/events/PushEvents$SessionReplyOutcome;", "outcome", "", "http_code", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/PushEvents$SessionReplyOutcome;I)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/PushEvents$SessionReplyOutcome;ILvnf;)V", "Lcom/anthropic/claude/analytics/events/PushEvents$SessionReplyActionResult;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/PushEvents$SessionReplyActionResult;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/anthropic/claude/analytics/events/PushEvents$SessionReplyOutcome;", "component5", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/PushEvents$SessionReplyOutcome;I)Lcom/anthropic/claude/analytics/events/PushEvents$SessionReplyActionResult;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getAccount_uuid", "getSession_id", "Lcom/anthropic/claude/analytics/events/PushEvents$SessionReplyOutcome;", "getOutcome", "I", "getHttp_code", "getEventName", "eventName", "Companion", "vyd", "wyd", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class PushEvents$SessionReplyActionResult implements AnalyticsEvent {
    public static final int $stable = 0;
    private final String account_uuid;
    private final int http_code;
    private final String organization_uuid;
    private final PushEvents$SessionReplyOutcome outcome;
    private final String session_id;
    public static final wyd Companion = new wyd();
    private static final kw9[] $childSerializers = {null, null, null, yb5.w(w1a.F, new rod(12)), null};

    public /* synthetic */ PushEvents$SessionReplyActionResult(int i, String str, String str2, String str3, PushEvents$SessionReplyOutcome pushEvents$SessionReplyOutcome, int i2, vnf vnfVar) {
        if (31 != (i & 31)) {
            gvj.f(i, 31, vyd.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.account_uuid = str2;
        this.session_id = str3;
        this.outcome = pushEvents$SessionReplyOutcome;
        this.http_code = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return PushEvents$SessionReplyOutcome.Companion.serializer();
    }

    public static /* synthetic */ PushEvents$SessionReplyActionResult copy$default(PushEvents$SessionReplyActionResult pushEvents$SessionReplyActionResult, String str, String str2, String str3, PushEvents$SessionReplyOutcome pushEvents$SessionReplyOutcome, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = pushEvents$SessionReplyActionResult.organization_uuid;
        }
        if ((i2 & 2) != 0) {
            str2 = pushEvents$SessionReplyActionResult.account_uuid;
        }
        if ((i2 & 4) != 0) {
            str3 = pushEvents$SessionReplyActionResult.session_id;
        }
        if ((i2 & 8) != 0) {
            pushEvents$SessionReplyOutcome = pushEvents$SessionReplyActionResult.outcome;
        }
        if ((i2 & 16) != 0) {
            i = pushEvents$SessionReplyActionResult.http_code;
        }
        int i3 = i;
        String str4 = str3;
        return pushEvents$SessionReplyActionResult.copy(str, str2, str4, pushEvents$SessionReplyOutcome, i3);
    }

    public static final /* synthetic */ void write$Self$analytics(PushEvents$SessionReplyActionResult self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.account_uuid);
        output.q(serialDesc, 2, self.session_id);
        output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.outcome);
        output.l(4, self.http_code, serialDesc);
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
    public final PushEvents$SessionReplyOutcome getOutcome() {
        return this.outcome;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getHttp_code() {
        return this.http_code;
    }

    public final PushEvents$SessionReplyActionResult copy(String organization_uuid, String account_uuid, String session_id, PushEvents$SessionReplyOutcome outcome, int http_code) {
        organization_uuid.getClass();
        account_uuid.getClass();
        session_id.getClass();
        outcome.getClass();
        return new PushEvents$SessionReplyActionResult(organization_uuid, account_uuid, session_id, outcome, http_code);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushEvents$SessionReplyActionResult)) {
            return false;
        }
        PushEvents$SessionReplyActionResult pushEvents$SessionReplyActionResult = (PushEvents$SessionReplyActionResult) other;
        return x44.r(this.organization_uuid, pushEvents$SessionReplyActionResult.organization_uuid) && x44.r(this.account_uuid, pushEvents$SessionReplyActionResult.account_uuid) && x44.r(this.session_id, pushEvents$SessionReplyActionResult.session_id) && this.outcome == pushEvents$SessionReplyActionResult.outcome && this.http_code == pushEvents$SessionReplyActionResult.http_code;
    }

    public final String getAccount_uuid() {
        return this.account_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile.push.session_reply_action_result";
    }

    public final int getHttp_code() {
        return this.http_code;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final PushEvents$SessionReplyOutcome getOutcome() {
        return this.outcome;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public int hashCode() {
        return Integer.hashCode(this.http_code) + ((this.outcome.hashCode() + kgh.l(kgh.l(this.organization_uuid.hashCode() * 31, 31, this.account_uuid), 31, this.session_id)) * 31);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.account_uuid;
        String str3 = this.session_id;
        PushEvents$SessionReplyOutcome pushEvents$SessionReplyOutcome = this.outcome;
        int i = this.http_code;
        StringBuilder sbR = kgh.r("SessionReplyActionResult(organization_uuid=", str, ", account_uuid=", str2, ", session_id=");
        sbR.append(str3);
        sbR.append(", outcome=");
        sbR.append(pushEvents$SessionReplyOutcome);
        sbR.append(", http_code=");
        return vb7.l(i, ")", sbR);
    }

    public PushEvents$SessionReplyActionResult(String str, String str2, String str3, PushEvents$SessionReplyOutcome pushEvents$SessionReplyOutcome, int i) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        pushEvents$SessionReplyOutcome.getClass();
        this.organization_uuid = str;
        this.account_uuid = str2;
        this.session_id = str3;
        this.outcome = pushEvents$SessionReplyOutcome;
        this.http_code = i;
    }
}
