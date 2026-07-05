package com.anthropic.claude.analytics.events;

import defpackage.gvj;
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
import defpackage.yu3;
import defpackage.znf;
import defpackage.zu3;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 JB\u0010!\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010 R\u0014\u00103\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u001b¨\u00067"}, d2 = {"com/anthropic/claude/analytics/events/CodeEvents$RefusalFallbackPromptShown", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "session_id", "original_model", "fallback_model", "Lcom/anthropic/claude/analytics/events/CodeEvents$RefusalFallbackPromptTrigger;", "trigger", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/CodeEvents$RefusalFallbackPromptTrigger;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/CodeEvents$RefusalFallbackPromptTrigger;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/CodeEvents$RefusalFallbackPromptShown;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/CodeEvents$RefusalFallbackPromptShown;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/anthropic/claude/analytics/events/CodeEvents$RefusalFallbackPromptTrigger;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/CodeEvents$RefusalFallbackPromptTrigger;)Lcom/anthropic/claude/analytics/events/CodeEvents$RefusalFallbackPromptShown;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getSession_id", "getOriginal_model", "getFallback_model", "Lcom/anthropic/claude/analytics/events/CodeEvents$RefusalFallbackPromptTrigger;", "getTrigger", "getEventName", "eventName", "Companion", "yu3", "zu3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CodeEvents$RefusalFallbackPromptShown implements AnalyticsEvent {
    public static final int $stable = 0;
    private final String fallback_model;
    private final String organization_uuid;
    private final String original_model;
    private final String session_id;
    private final CodeEvents$RefusalFallbackPromptTrigger trigger;
    public static final zu3 Companion = new zu3();
    private static final kw9[] $childSerializers = {null, null, null, null, yb5.w(w1a.F, new wt3(9))};

    public /* synthetic */ CodeEvents$RefusalFallbackPromptShown(int i, String str, String str2, String str3, String str4, CodeEvents$RefusalFallbackPromptTrigger codeEvents$RefusalFallbackPromptTrigger, vnf vnfVar) {
        if (31 != (i & 31)) {
            gvj.f(i, 31, yu3.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.session_id = str2;
        this.original_model = str3;
        this.fallback_model = str4;
        this.trigger = codeEvents$RefusalFallbackPromptTrigger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return CodeEvents$RefusalFallbackPromptTrigger.Companion.serializer();
    }

    public static /* synthetic */ CodeEvents$RefusalFallbackPromptShown copy$default(CodeEvents$RefusalFallbackPromptShown codeEvents$RefusalFallbackPromptShown, String str, String str2, String str3, String str4, CodeEvents$RefusalFallbackPromptTrigger codeEvents$RefusalFallbackPromptTrigger, int i, Object obj) {
        if ((i & 1) != 0) {
            str = codeEvents$RefusalFallbackPromptShown.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = codeEvents$RefusalFallbackPromptShown.session_id;
        }
        if ((i & 4) != 0) {
            str3 = codeEvents$RefusalFallbackPromptShown.original_model;
        }
        if ((i & 8) != 0) {
            str4 = codeEvents$RefusalFallbackPromptShown.fallback_model;
        }
        if ((i & 16) != 0) {
            codeEvents$RefusalFallbackPromptTrigger = codeEvents$RefusalFallbackPromptShown.trigger;
        }
        CodeEvents$RefusalFallbackPromptTrigger codeEvents$RefusalFallbackPromptTrigger2 = codeEvents$RefusalFallbackPromptTrigger;
        String str5 = str3;
        return codeEvents$RefusalFallbackPromptShown.copy(str, str2, str5, str4, codeEvents$RefusalFallbackPromptTrigger2);
    }

    public static final /* synthetic */ void write$Self$analytics(CodeEvents$RefusalFallbackPromptShown self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.session_id);
        output.q(serialDesc, 2, self.original_model);
        output.q(serialDesc, 3, self.fallback_model);
        output.r(serialDesc, 4, (znf) kw9VarArr[4].getValue(), self.trigger);
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
    public final String getOriginal_model() {
        return this.original_model;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFallback_model() {
        return this.fallback_model;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CodeEvents$RefusalFallbackPromptTrigger getTrigger() {
        return this.trigger;
    }

    public final CodeEvents$RefusalFallbackPromptShown copy(String organization_uuid, String session_id, String original_model, String fallback_model, CodeEvents$RefusalFallbackPromptTrigger trigger) {
        organization_uuid.getClass();
        session_id.getClass();
        original_model.getClass();
        fallback_model.getClass();
        trigger.getClass();
        return new CodeEvents$RefusalFallbackPromptShown(organization_uuid, session_id, original_model, fallback_model, trigger);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeEvents$RefusalFallbackPromptShown)) {
            return false;
        }
        CodeEvents$RefusalFallbackPromptShown codeEvents$RefusalFallbackPromptShown = (CodeEvents$RefusalFallbackPromptShown) other;
        return x44.r(this.organization_uuid, codeEvents$RefusalFallbackPromptShown.organization_uuid) && x44.r(this.session_id, codeEvents$RefusalFallbackPromptShown.session_id) && x44.r(this.original_model, codeEvents$RefusalFallbackPromptShown.original_model) && x44.r(this.fallback_model, codeEvents$RefusalFallbackPromptShown.fallback_model) && this.trigger == codeEvents$RefusalFallbackPromptShown.trigger;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.code.refusal_fallback_prompt.shown";
    }

    public final String getFallback_model() {
        return this.fallback_model;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getOriginal_model() {
        return this.original_model;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final CodeEvents$RefusalFallbackPromptTrigger getTrigger() {
        return this.trigger;
    }

    public int hashCode() {
        return this.trigger.hashCode() + kgh.l(kgh.l(kgh.l(this.organization_uuid.hashCode() * 31, 31, this.session_id), 31, this.original_model), 31, this.fallback_model);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.session_id;
        String str3 = this.original_model;
        String str4 = this.fallback_model;
        CodeEvents$RefusalFallbackPromptTrigger codeEvents$RefusalFallbackPromptTrigger = this.trigger;
        StringBuilder sbR = kgh.r("RefusalFallbackPromptShown(organization_uuid=", str, ", session_id=", str2, ", original_model=");
        kgh.u(sbR, str3, ", fallback_model=", str4, ", trigger=");
        sbR.append(codeEvents$RefusalFallbackPromptTrigger);
        sbR.append(")");
        return sbR.toString();
    }

    public CodeEvents$RefusalFallbackPromptShown(String str, String str2, String str3, String str4, CodeEvents$RefusalFallbackPromptTrigger codeEvents$RefusalFallbackPromptTrigger) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        codeEvents$RefusalFallbackPromptTrigger.getClass();
        this.organization_uuid = str;
        this.session_id = str2;
        this.original_model = str3;
        this.fallback_model = str4;
        this.trigger = codeEvents$RefusalFallbackPromptTrigger;
    }
}
