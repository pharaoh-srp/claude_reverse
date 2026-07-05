package com.anthropic.claude.analytics.events;

import defpackage.fsh;
import defpackage.grc;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.onf;
import defpackage.rs3;
import defpackage.ss3;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB5\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ.\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001eR\u0014\u0010/\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u001a¨\u00063"}, d2 = {"com/anthropic/claude/analytics/events/CodeEvents$CodePromptSuggestionSent", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "session_id", "", "edited", "", "time_to_send_ms", "<init>", "(Ljava/lang/String;ZJ)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;ZJLvnf;)V", "Lcom/anthropic/claude/analytics/events/CodeEvents$CodePromptSuggestionSent;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/CodeEvents$CodePromptSuggestionSent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()J", "copy", "(Ljava/lang/String;ZJ)Lcom/anthropic/claude/analytics/events/CodeEvents$CodePromptSuggestionSent;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSession_id", "Z", "getEdited", "J", "getTime_to_send_ms", "getEventName", "eventName", "Companion", "rs3", "ss3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CodeEvents$CodePromptSuggestionSent implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final ss3 Companion = new ss3();
    private final boolean edited;
    private final String session_id;
    private final long time_to_send_ms;

    public /* synthetic */ CodeEvents$CodePromptSuggestionSent(int i, String str, boolean z, long j, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, rs3.a.getDescriptor());
            throw null;
        }
        this.session_id = str;
        this.edited = z;
        this.time_to_send_ms = j;
    }

    public static /* synthetic */ CodeEvents$CodePromptSuggestionSent copy$default(CodeEvents$CodePromptSuggestionSent codeEvents$CodePromptSuggestionSent, String str, boolean z, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = codeEvents$CodePromptSuggestionSent.session_id;
        }
        if ((i & 2) != 0) {
            z = codeEvents$CodePromptSuggestionSent.edited;
        }
        if ((i & 4) != 0) {
            j = codeEvents$CodePromptSuggestionSent.time_to_send_ms;
        }
        return codeEvents$CodePromptSuggestionSent.copy(str, z, j);
    }

    public static final /* synthetic */ void write$Self$analytics(CodeEvents$CodePromptSuggestionSent self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.session_id);
        output.p(serialDesc, 1, self.edited);
        output.D(serialDesc, 2, self.time_to_send_ms);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSession_id() {
        return this.session_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getEdited() {
        return this.edited;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTime_to_send_ms() {
        return this.time_to_send_ms;
    }

    public final CodeEvents$CodePromptSuggestionSent copy(String session_id, boolean edited, long time_to_send_ms) {
        session_id.getClass();
        return new CodeEvents$CodePromptSuggestionSent(session_id, edited, time_to_send_ms);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeEvents$CodePromptSuggestionSent)) {
            return false;
        }
        CodeEvents$CodePromptSuggestionSent codeEvents$CodePromptSuggestionSent = (CodeEvents$CodePromptSuggestionSent) other;
        return x44.r(this.session_id, codeEvents$CodePromptSuggestionSent.session_id) && this.edited == codeEvents$CodePromptSuggestionSent.edited && this.time_to_send_ms == codeEvents$CodePromptSuggestionSent.time_to_send_ms;
    }

    public final boolean getEdited() {
        return this.edited;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.code.prompt_suggestion.sent";
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final long getTime_to_send_ms() {
        return this.time_to_send_ms;
    }

    public int hashCode() {
        return Long.hashCode(this.time_to_send_ms) + fsh.p(this.session_id.hashCode() * 31, 31, this.edited);
    }

    public String toString() {
        String str = this.session_id;
        boolean z = this.edited;
        long j = this.time_to_send_ms;
        StringBuilder sb = new StringBuilder("CodePromptSuggestionSent(session_id=");
        sb.append(str);
        sb.append(", edited=");
        sb.append(z);
        sb.append(", time_to_send_ms=");
        return grc.r(j, ")", sb);
    }

    public CodeEvents$CodePromptSuggestionSent(String str, boolean z, long j) {
        str.getClass();
        this.session_id = str;
        this.edited = z;
        this.time_to_send_ms = j;
    }
}
