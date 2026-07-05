package com.anthropic.claude.analytics.events;

import defpackage.gi3;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wt3;
import defpackage.xt3;
import defpackage.yb5;
import defpackage.yt3;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001aR\u0014\u0010,\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u001f¨\u00060"}, d2 = {"com/anthropic/claude/analytics/events/CodeEvents$ModelSelectorPersistFailed", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "Lcom/anthropic/claude/analytics/events/CodeEvents$CodeComposerSurface;", "surface", "Lcom/anthropic/claude/analytics/events/CodeEvents$ModelSelectorPersistTrigger;", "trigger", "<init>", "(Lcom/anthropic/claude/analytics/events/CodeEvents$CodeComposerSurface;Lcom/anthropic/claude/analytics/events/CodeEvents$ModelSelectorPersistTrigger;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/analytics/events/CodeEvents$CodeComposerSurface;Lcom/anthropic/claude/analytics/events/CodeEvents$ModelSelectorPersistTrigger;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/CodeEvents$ModelSelectorPersistFailed;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/CodeEvents$ModelSelectorPersistFailed;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/analytics/events/CodeEvents$CodeComposerSurface;", "component2", "()Lcom/anthropic/claude/analytics/events/CodeEvents$ModelSelectorPersistTrigger;", "copy", "(Lcom/anthropic/claude/analytics/events/CodeEvents$CodeComposerSurface;Lcom/anthropic/claude/analytics/events/CodeEvents$ModelSelectorPersistTrigger;)Lcom/anthropic/claude/analytics/events/CodeEvents$ModelSelectorPersistFailed;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/analytics/events/CodeEvents$CodeComposerSurface;", "getSurface", "Lcom/anthropic/claude/analytics/events/CodeEvents$ModelSelectorPersistTrigger;", "getTrigger", "getEventName", "eventName", "Companion", "xt3", "yt3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CodeEvents$ModelSelectorPersistFailed implements AnalyticsEvent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final yt3 Companion = new yt3();
    private final CodeEvents$CodeComposerSurface surface;
    private final CodeEvents$ModelSelectorPersistTrigger trigger;

    static {
        gi3 gi3Var = new gi3(29);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{yb5.w(w1aVar, gi3Var), yb5.w(w1aVar, new wt3(0))};
    }

    public /* synthetic */ CodeEvents$ModelSelectorPersistFailed(int i, CodeEvents$CodeComposerSurface codeEvents$CodeComposerSurface, CodeEvents$ModelSelectorPersistTrigger codeEvents$ModelSelectorPersistTrigger, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, xt3.a.getDescriptor());
            throw null;
        }
        this.surface = codeEvents$CodeComposerSurface;
        this.trigger = codeEvents$ModelSelectorPersistTrigger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return CodeEvents$CodeComposerSurface.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return CodeEvents$ModelSelectorPersistTrigger.Companion.serializer();
    }

    public static /* synthetic */ CodeEvents$ModelSelectorPersistFailed copy$default(CodeEvents$ModelSelectorPersistFailed codeEvents$ModelSelectorPersistFailed, CodeEvents$CodeComposerSurface codeEvents$CodeComposerSurface, CodeEvents$ModelSelectorPersistTrigger codeEvents$ModelSelectorPersistTrigger, int i, Object obj) {
        if ((i & 1) != 0) {
            codeEvents$CodeComposerSurface = codeEvents$ModelSelectorPersistFailed.surface;
        }
        if ((i & 2) != 0) {
            codeEvents$ModelSelectorPersistTrigger = codeEvents$ModelSelectorPersistFailed.trigger;
        }
        return codeEvents$ModelSelectorPersistFailed.copy(codeEvents$CodeComposerSurface, codeEvents$ModelSelectorPersistTrigger);
    }

    public static final /* synthetic */ void write$Self$analytics(CodeEvents$ModelSelectorPersistFailed self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.surface);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.trigger);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CodeEvents$CodeComposerSurface getSurface() {
        return this.surface;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CodeEvents$ModelSelectorPersistTrigger getTrigger() {
        return this.trigger;
    }

    public final CodeEvents$ModelSelectorPersistFailed copy(CodeEvents$CodeComposerSurface surface, CodeEvents$ModelSelectorPersistTrigger trigger) {
        surface.getClass();
        trigger.getClass();
        return new CodeEvents$ModelSelectorPersistFailed(surface, trigger);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeEvents$ModelSelectorPersistFailed)) {
            return false;
        }
        CodeEvents$ModelSelectorPersistFailed codeEvents$ModelSelectorPersistFailed = (CodeEvents$ModelSelectorPersistFailed) other;
        return this.surface == codeEvents$ModelSelectorPersistFailed.surface && this.trigger == codeEvents$ModelSelectorPersistFailed.trigger;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.code.model_selector.persist_failed";
    }

    public final CodeEvents$CodeComposerSurface getSurface() {
        return this.surface;
    }

    public final CodeEvents$ModelSelectorPersistTrigger getTrigger() {
        return this.trigger;
    }

    public int hashCode() {
        return this.trigger.hashCode() + (this.surface.hashCode() * 31);
    }

    public String toString() {
        return "ModelSelectorPersistFailed(surface=" + this.surface + ", trigger=" + this.trigger + ")";
    }

    public CodeEvents$ModelSelectorPersistFailed(CodeEvents$CodeComposerSurface codeEvents$CodeComposerSurface, CodeEvents$ModelSelectorPersistTrigger codeEvents$ModelSelectorPersistTrigger) {
        codeEvents$CodeComposerSurface.getClass();
        codeEvents$ModelSelectorPersistTrigger.getClass();
        this.surface = codeEvents$CodeComposerSurface;
        this.trigger = codeEvents$ModelSelectorPersistTrigger;
    }
}
