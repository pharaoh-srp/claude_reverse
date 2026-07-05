package com.anthropic.claude.analytics.events;

import defpackage.au3;
import defpackage.bu3;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.sq6;
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
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ.\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001eR\u0014\u0010/\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u001a¨\u00063"}, d2 = {"com/anthropic/claude/analytics/events/CodeEvents$ModelSelectorSelected", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "model_id", "Lcom/anthropic/claude/analytics/events/CodeEvents$CodeComposerSurface;", "surface", "", "has_session", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/analytics/events/CodeEvents$CodeComposerSurface;Z)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/analytics/events/CodeEvents$CodeComposerSurface;ZLvnf;)V", "Lcom/anthropic/claude/analytics/events/CodeEvents$ModelSelectorSelected;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/CodeEvents$ModelSelectorSelected;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/analytics/events/CodeEvents$CodeComposerSurface;", "component3", "()Z", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/analytics/events/CodeEvents$CodeComposerSurface;Z)Lcom/anthropic/claude/analytics/events/CodeEvents$ModelSelectorSelected;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getModel_id", "Lcom/anthropic/claude/analytics/events/CodeEvents$CodeComposerSurface;", "getSurface", "Z", "getHas_session", "getEventName", "eventName", "Companion", "au3", "bu3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CodeEvents$ModelSelectorSelected implements AnalyticsEvent {
    public static final int $stable = 0;
    private final boolean has_session;
    private final String model_id;
    private final CodeEvents$CodeComposerSurface surface;
    public static final bu3 Companion = new bu3();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new wt3(2)), null};

    public /* synthetic */ CodeEvents$ModelSelectorSelected(int i, String str, CodeEvents$CodeComposerSurface codeEvents$CodeComposerSurface, boolean z, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, au3.a.getDescriptor());
            throw null;
        }
        this.model_id = str;
        this.surface = codeEvents$CodeComposerSurface;
        this.has_session = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return CodeEvents$CodeComposerSurface.Companion.serializer();
    }

    public static /* synthetic */ CodeEvents$ModelSelectorSelected copy$default(CodeEvents$ModelSelectorSelected codeEvents$ModelSelectorSelected, String str, CodeEvents$CodeComposerSurface codeEvents$CodeComposerSurface, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = codeEvents$ModelSelectorSelected.model_id;
        }
        if ((i & 2) != 0) {
            codeEvents$CodeComposerSurface = codeEvents$ModelSelectorSelected.surface;
        }
        if ((i & 4) != 0) {
            z = codeEvents$ModelSelectorSelected.has_session;
        }
        return codeEvents$ModelSelectorSelected.copy(str, codeEvents$CodeComposerSurface, z);
    }

    public static final /* synthetic */ void write$Self$analytics(CodeEvents$ModelSelectorSelected self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.model_id);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.surface);
        output.p(serialDesc, 2, self.has_session);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getModel_id() {
        return this.model_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CodeEvents$CodeComposerSurface getSurface() {
        return this.surface;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getHas_session() {
        return this.has_session;
    }

    public final CodeEvents$ModelSelectorSelected copy(String model_id, CodeEvents$CodeComposerSurface surface, boolean has_session) {
        model_id.getClass();
        surface.getClass();
        return new CodeEvents$ModelSelectorSelected(model_id, surface, has_session);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeEvents$ModelSelectorSelected)) {
            return false;
        }
        CodeEvents$ModelSelectorSelected codeEvents$ModelSelectorSelected = (CodeEvents$ModelSelectorSelected) other;
        return x44.r(this.model_id, codeEvents$ModelSelectorSelected.model_id) && this.surface == codeEvents$ModelSelectorSelected.surface && this.has_session == codeEvents$ModelSelectorSelected.has_session;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.code.model_selector.selected";
    }

    public final boolean getHas_session() {
        return this.has_session;
    }

    public final String getModel_id() {
        return this.model_id;
    }

    public final CodeEvents$CodeComposerSurface getSurface() {
        return this.surface;
    }

    public int hashCode() {
        return Boolean.hashCode(this.has_session) + ((this.surface.hashCode() + (this.model_id.hashCode() * 31)) * 31);
    }

    public String toString() {
        String str = this.model_id;
        CodeEvents$CodeComposerSurface codeEvents$CodeComposerSurface = this.surface;
        boolean z = this.has_session;
        StringBuilder sb = new StringBuilder("ModelSelectorSelected(model_id=");
        sb.append(str);
        sb.append(", surface=");
        sb.append(codeEvents$CodeComposerSurface);
        sb.append(", has_session=");
        return sq6.v(")", sb, z);
    }

    public CodeEvents$ModelSelectorSelected(String str, CodeEvents$CodeComposerSurface codeEvents$CodeComposerSurface, boolean z) {
        str.getClass();
        codeEvents$CodeComposerSurface.getClass();
        this.model_id = str;
        this.surface = codeEvents$CodeComposerSurface;
        this.has_session = z;
    }
}
