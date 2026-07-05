package com.anthropic.claude.analytics.events;

import defpackage.gi3;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.nr3;
import defpackage.onf;
import defpackage.or3;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000278B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!J8\u0010\"\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u001a\u0010*\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010!R\u0014\u00105\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010&¨\u00069"}, d2 = {"com/anthropic/claude/analytics/events/CodeEvents$AttachmentsAdded", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "Lcom/anthropic/claude/analytics/events/ChatEvents$AttachmentSource;", "source", "", "count", "Lcom/anthropic/claude/analytics/events/CodeEvents$CodeComposerSurface;", "surface", "", "has_session", "<init>", "(Lcom/anthropic/claude/analytics/events/ChatEvents$AttachmentSource;ILcom/anthropic/claude/analytics/events/CodeEvents$CodeComposerSurface;Z)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/analytics/events/ChatEvents$AttachmentSource;ILcom/anthropic/claude/analytics/events/CodeEvents$CodeComposerSurface;ZLvnf;)V", "Lcom/anthropic/claude/analytics/events/CodeEvents$AttachmentsAdded;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/CodeEvents$AttachmentsAdded;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/analytics/events/ChatEvents$AttachmentSource;", "component2", "()I", "component3", "()Lcom/anthropic/claude/analytics/events/CodeEvents$CodeComposerSurface;", "component4", "()Z", "copy", "(Lcom/anthropic/claude/analytics/events/ChatEvents$AttachmentSource;ILcom/anthropic/claude/analytics/events/CodeEvents$CodeComposerSurface;Z)Lcom/anthropic/claude/analytics/events/CodeEvents$AttachmentsAdded;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/analytics/events/ChatEvents$AttachmentSource;", "getSource", "I", "getCount", "Lcom/anthropic/claude/analytics/events/CodeEvents$CodeComposerSurface;", "getSurface", "Z", "getHas_session", "getEventName", "eventName", "Companion", "nr3", "or3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CodeEvents$AttachmentsAdded implements AnalyticsEvent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final or3 Companion = new or3();
    private final int count;
    private final boolean has_session;
    private final ChatEvents$AttachmentSource source;
    private final CodeEvents$CodeComposerSurface surface;

    static {
        gi3 gi3Var = new gi3(18);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{yb5.w(w1aVar, gi3Var), null, yb5.w(w1aVar, new gi3(19)), null};
    }

    public /* synthetic */ CodeEvents$AttachmentsAdded(int i, ChatEvents$AttachmentSource chatEvents$AttachmentSource, int i2, CodeEvents$CodeComposerSurface codeEvents$CodeComposerSurface, boolean z, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, nr3.a.getDescriptor());
            throw null;
        }
        this.source = chatEvents$AttachmentSource;
        this.count = i2;
        this.surface = codeEvents$CodeComposerSurface;
        this.has_session = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ChatEvents$AttachmentSource.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return CodeEvents$CodeComposerSurface.Companion.serializer();
    }

    public static /* synthetic */ CodeEvents$AttachmentsAdded copy$default(CodeEvents$AttachmentsAdded codeEvents$AttachmentsAdded, ChatEvents$AttachmentSource chatEvents$AttachmentSource, int i, CodeEvents$CodeComposerSurface codeEvents$CodeComposerSurface, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            chatEvents$AttachmentSource = codeEvents$AttachmentsAdded.source;
        }
        if ((i2 & 2) != 0) {
            i = codeEvents$AttachmentsAdded.count;
        }
        if ((i2 & 4) != 0) {
            codeEvents$CodeComposerSurface = codeEvents$AttachmentsAdded.surface;
        }
        if ((i2 & 8) != 0) {
            z = codeEvents$AttachmentsAdded.has_session;
        }
        return codeEvents$AttachmentsAdded.copy(chatEvents$AttachmentSource, i, codeEvents$CodeComposerSurface, z);
    }

    public static final /* synthetic */ void write$Self$analytics(CodeEvents$AttachmentsAdded self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.source);
        output.l(1, self.count, serialDesc);
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.surface);
        output.p(serialDesc, 3, self.has_session);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ChatEvents$AttachmentSource getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CodeEvents$CodeComposerSurface getSurface() {
        return this.surface;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getHas_session() {
        return this.has_session;
    }

    public final CodeEvents$AttachmentsAdded copy(ChatEvents$AttachmentSource source, int count, CodeEvents$CodeComposerSurface surface, boolean has_session) {
        source.getClass();
        surface.getClass();
        return new CodeEvents$AttachmentsAdded(source, count, surface, has_session);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeEvents$AttachmentsAdded)) {
            return false;
        }
        CodeEvents$AttachmentsAdded codeEvents$AttachmentsAdded = (CodeEvents$AttachmentsAdded) other;
        return this.source == codeEvents$AttachmentsAdded.source && this.count == codeEvents$AttachmentsAdded.count && this.surface == codeEvents$AttachmentsAdded.surface && this.has_session == codeEvents$AttachmentsAdded.has_session;
    }

    public final int getCount() {
        return this.count;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.code.attachments.added";
    }

    public final boolean getHas_session() {
        return this.has_session;
    }

    public final ChatEvents$AttachmentSource getSource() {
        return this.source;
    }

    public final CodeEvents$CodeComposerSurface getSurface() {
        return this.surface;
    }

    public int hashCode() {
        return Boolean.hashCode(this.has_session) + ((this.surface.hashCode() + vb7.c(this.count, this.source.hashCode() * 31, 31)) * 31);
    }

    public String toString() {
        return "AttachmentsAdded(source=" + this.source + ", count=" + this.count + ", surface=" + this.surface + ", has_session=" + this.has_session + ")";
    }

    public CodeEvents$AttachmentsAdded(ChatEvents$AttachmentSource chatEvents$AttachmentSource, int i, CodeEvents$CodeComposerSurface codeEvents$CodeComposerSurface, boolean z) {
        chatEvents$AttachmentSource.getClass();
        codeEvents$CodeComposerSurface.getClass();
        this.source = chatEvents$AttachmentSource;
        this.count = i;
        this.surface = codeEvents$CodeComposerSurface;
        this.has_session = z;
    }
}
