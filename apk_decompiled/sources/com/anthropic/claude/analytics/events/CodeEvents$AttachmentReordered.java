package com.anthropic.claude.analytics.events;

import defpackage.gi3;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.lr3;
import defpackage.mdj;
import defpackage.mr3;
import defpackage.onf;
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
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b!\u0010\u001dJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001dR\u0014\u0010.\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0019¨\u00062"}, d2 = {"com/anthropic/claude/analytics/events/CodeEvents$AttachmentReordered", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "Lcom/anthropic/claude/analytics/events/CodeEvents$AttachmentReorderSurface;", "surface", "", "attachment_count", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/analytics/events/CodeEvents$AttachmentReorderSurface;I)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/analytics/events/CodeEvents$AttachmentReorderSurface;ILvnf;)V", "Lcom/anthropic/claude/analytics/events/CodeEvents$AttachmentReordered;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/CodeEvents$AttachmentReordered;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/analytics/events/CodeEvents$AttachmentReorderSurface;", "component3", "()I", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/analytics/events/CodeEvents$AttachmentReorderSurface;I)Lcom/anthropic/claude/analytics/events/CodeEvents$AttachmentReordered;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "Lcom/anthropic/claude/analytics/events/CodeEvents$AttachmentReorderSurface;", "getSurface", "I", "getAttachment_count", "getEventName", "eventName", "Companion", "lr3", "mr3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CodeEvents$AttachmentReordered implements AnalyticsEvent {
    public static final int $stable = 0;
    private final int attachment_count;
    private final String organization_uuid;
    private final CodeEvents$AttachmentReorderSurface surface;
    public static final mr3 Companion = new mr3();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new gi3(17)), null};

    public /* synthetic */ CodeEvents$AttachmentReordered(int i, String str, CodeEvents$AttachmentReorderSurface codeEvents$AttachmentReorderSurface, int i2, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, lr3.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.surface = codeEvents$AttachmentReorderSurface;
        this.attachment_count = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return CodeEvents$AttachmentReorderSurface.Companion.serializer();
    }

    public static /* synthetic */ CodeEvents$AttachmentReordered copy$default(CodeEvents$AttachmentReordered codeEvents$AttachmentReordered, String str, CodeEvents$AttachmentReorderSurface codeEvents$AttachmentReorderSurface, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = codeEvents$AttachmentReordered.organization_uuid;
        }
        if ((i2 & 2) != 0) {
            codeEvents$AttachmentReorderSurface = codeEvents$AttachmentReordered.surface;
        }
        if ((i2 & 4) != 0) {
            i = codeEvents$AttachmentReordered.attachment_count;
        }
        return codeEvents$AttachmentReordered.copy(str, codeEvents$AttachmentReorderSurface, i);
    }

    public static final /* synthetic */ void write$Self$analytics(CodeEvents$AttachmentReordered self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.surface);
        output.l(2, self.attachment_count, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CodeEvents$AttachmentReorderSurface getSurface() {
        return this.surface;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAttachment_count() {
        return this.attachment_count;
    }

    public final CodeEvents$AttachmentReordered copy(String organization_uuid, CodeEvents$AttachmentReorderSurface surface, int attachment_count) {
        organization_uuid.getClass();
        surface.getClass();
        return new CodeEvents$AttachmentReordered(organization_uuid, surface, attachment_count);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeEvents$AttachmentReordered)) {
            return false;
        }
        CodeEvents$AttachmentReordered codeEvents$AttachmentReordered = (CodeEvents$AttachmentReordered) other;
        return x44.r(this.organization_uuid, codeEvents$AttachmentReordered.organization_uuid) && this.surface == codeEvents$AttachmentReordered.surface && this.attachment_count == codeEvents$AttachmentReordered.attachment_count;
    }

    public final int getAttachment_count() {
        return this.attachment_count;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.code.attachment.reordered";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final CodeEvents$AttachmentReorderSurface getSurface() {
        return this.surface;
    }

    public int hashCode() {
        return Integer.hashCode(this.attachment_count) + ((this.surface.hashCode() + (this.organization_uuid.hashCode() * 31)) * 31);
    }

    public String toString() {
        String str = this.organization_uuid;
        CodeEvents$AttachmentReorderSurface codeEvents$AttachmentReorderSurface = this.surface;
        int i = this.attachment_count;
        StringBuilder sb = new StringBuilder("AttachmentReordered(organization_uuid=");
        sb.append(str);
        sb.append(", surface=");
        sb.append(codeEvents$AttachmentReorderSurface);
        sb.append(", attachment_count=");
        return vb7.l(i, ")", sb);
    }

    public CodeEvents$AttachmentReordered(String str, CodeEvents$AttachmentReorderSurface codeEvents$AttachmentReorderSurface, int i) {
        str.getClass();
        codeEvents$AttachmentReorderSurface.getClass();
        this.organization_uuid = str;
        this.surface = codeEvents$AttachmentReorderSurface;
        this.attachment_count = i;
    }
}
