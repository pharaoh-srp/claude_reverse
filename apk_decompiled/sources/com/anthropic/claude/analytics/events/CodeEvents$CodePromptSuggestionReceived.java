package com.anthropic.claude.analytics.events;

import defpackage.gi3;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.ps3;
import defpackage.qs3;
import defpackage.vb7;
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
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b!\u0010\u001dJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001dR\u0014\u0010.\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0019¨\u00062"}, d2 = {"com/anthropic/claude/analytics/events/CodeEvents$CodePromptSuggestionReceived", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "session_id", "Lcom/anthropic/claude/analytics/events/CodeEvents$CodePromptSuggestionSuppressReason;", "suppress_reason", "", "suggestion_length", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/analytics/events/CodeEvents$CodePromptSuggestionSuppressReason;I)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/analytics/events/CodeEvents$CodePromptSuggestionSuppressReason;ILvnf;)V", "Lcom/anthropic/claude/analytics/events/CodeEvents$CodePromptSuggestionReceived;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/CodeEvents$CodePromptSuggestionReceived;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/analytics/events/CodeEvents$CodePromptSuggestionSuppressReason;", "component3", "()I", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/analytics/events/CodeEvents$CodePromptSuggestionSuppressReason;I)Lcom/anthropic/claude/analytics/events/CodeEvents$CodePromptSuggestionReceived;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSession_id", "Lcom/anthropic/claude/analytics/events/CodeEvents$CodePromptSuggestionSuppressReason;", "getSuppress_reason", "I", "getSuggestion_length", "getEventName", "eventName", "Companion", "ps3", "qs3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CodeEvents$CodePromptSuggestionReceived implements AnalyticsEvent {
    public static final int $stable = 0;
    private final String session_id;
    private final int suggestion_length;
    private final CodeEvents$CodePromptSuggestionSuppressReason suppress_reason;
    public static final qs3 Companion = new qs3();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new gi3(27)), null};

    public /* synthetic */ CodeEvents$CodePromptSuggestionReceived(int i, String str, CodeEvents$CodePromptSuggestionSuppressReason codeEvents$CodePromptSuggestionSuppressReason, int i2, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, ps3.a.getDescriptor());
            throw null;
        }
        this.session_id = str;
        this.suppress_reason = codeEvents$CodePromptSuggestionSuppressReason;
        this.suggestion_length = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return CodeEvents$CodePromptSuggestionSuppressReason.Companion.serializer();
    }

    public static /* synthetic */ CodeEvents$CodePromptSuggestionReceived copy$default(CodeEvents$CodePromptSuggestionReceived codeEvents$CodePromptSuggestionReceived, String str, CodeEvents$CodePromptSuggestionSuppressReason codeEvents$CodePromptSuggestionSuppressReason, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = codeEvents$CodePromptSuggestionReceived.session_id;
        }
        if ((i2 & 2) != 0) {
            codeEvents$CodePromptSuggestionSuppressReason = codeEvents$CodePromptSuggestionReceived.suppress_reason;
        }
        if ((i2 & 4) != 0) {
            i = codeEvents$CodePromptSuggestionReceived.suggestion_length;
        }
        return codeEvents$CodePromptSuggestionReceived.copy(str, codeEvents$CodePromptSuggestionSuppressReason, i);
    }

    public static final /* synthetic */ void write$Self$analytics(CodeEvents$CodePromptSuggestionReceived self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.session_id);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.suppress_reason);
        output.l(2, self.suggestion_length, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSession_id() {
        return this.session_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CodeEvents$CodePromptSuggestionSuppressReason getSuppress_reason() {
        return this.suppress_reason;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSuggestion_length() {
        return this.suggestion_length;
    }

    public final CodeEvents$CodePromptSuggestionReceived copy(String session_id, CodeEvents$CodePromptSuggestionSuppressReason suppress_reason, int suggestion_length) {
        session_id.getClass();
        suppress_reason.getClass();
        return new CodeEvents$CodePromptSuggestionReceived(session_id, suppress_reason, suggestion_length);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeEvents$CodePromptSuggestionReceived)) {
            return false;
        }
        CodeEvents$CodePromptSuggestionReceived codeEvents$CodePromptSuggestionReceived = (CodeEvents$CodePromptSuggestionReceived) other;
        return x44.r(this.session_id, codeEvents$CodePromptSuggestionReceived.session_id) && this.suppress_reason == codeEvents$CodePromptSuggestionReceived.suppress_reason && this.suggestion_length == codeEvents$CodePromptSuggestionReceived.suggestion_length;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.code.prompt_suggestion.received";
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final int getSuggestion_length() {
        return this.suggestion_length;
    }

    public final CodeEvents$CodePromptSuggestionSuppressReason getSuppress_reason() {
        return this.suppress_reason;
    }

    public int hashCode() {
        return Integer.hashCode(this.suggestion_length) + ((this.suppress_reason.hashCode() + (this.session_id.hashCode() * 31)) * 31);
    }

    public String toString() {
        String str = this.session_id;
        CodeEvents$CodePromptSuggestionSuppressReason codeEvents$CodePromptSuggestionSuppressReason = this.suppress_reason;
        int i = this.suggestion_length;
        StringBuilder sb = new StringBuilder("CodePromptSuggestionReceived(session_id=");
        sb.append(str);
        sb.append(", suppress_reason=");
        sb.append(codeEvents$CodePromptSuggestionSuppressReason);
        sb.append(", suggestion_length=");
        return vb7.l(i, ")", sb);
    }

    public CodeEvents$CodePromptSuggestionReceived(String str, CodeEvents$CodePromptSuggestionSuppressReason codeEvents$CodePromptSuggestionSuppressReason, int i) {
        str.getClass();
        codeEvents$CodePromptSuggestionSuppressReason.getClass();
        this.session_id = str;
        this.suppress_reason = codeEvents$CodePromptSuggestionSuppressReason;
        this.suggestion_length = i;
    }
}
