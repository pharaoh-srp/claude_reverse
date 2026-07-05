package com.anthropic.claude.analytics.events;

import defpackage.e79;
import defpackage.g9b;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.ygb;
import defpackage.zgb;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000278B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!J:\u0010\"\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b\t\u0010!R\u0014\u00105\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010&¨\u00069"}, d2 = {"com/anthropic/claude/analytics/events/MessageFileEvents$PdfPreviewRendered", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "Lcom/anthropic/claude/analytics/events/MessageFileEvents$PdfPreviewResult;", "result", "", "duration_ms", "", "page_count", "", "is_retry", "<init>", "(Lcom/anthropic/claude/analytics/events/MessageFileEvents$PdfPreviewResult;JLjava/lang/Integer;Z)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/analytics/events/MessageFileEvents$PdfPreviewResult;JLjava/lang/Integer;ZLvnf;)V", "Lcom/anthropic/claude/analytics/events/MessageFileEvents$PdfPreviewRendered;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/MessageFileEvents$PdfPreviewRendered;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/analytics/events/MessageFileEvents$PdfPreviewResult;", "component2", "()J", "component3", "()Ljava/lang/Integer;", "component4", "()Z", "copy", "(Lcom/anthropic/claude/analytics/events/MessageFileEvents$PdfPreviewResult;JLjava/lang/Integer;Z)Lcom/anthropic/claude/analytics/events/MessageFileEvents$PdfPreviewRendered;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/analytics/events/MessageFileEvents$PdfPreviewResult;", "getResult", "J", "getDuration_ms", "Ljava/lang/Integer;", "getPage_count", "Z", "getEventName", "eventName", "Companion", "ygb", "zgb", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MessageFileEvents$PdfPreviewRendered implements AnalyticsEvent {
    public static final int $stable = 0;
    private final long duration_ms;
    private final boolean is_retry;
    private final Integer page_count;
    private final MessageFileEvents$PdfPreviewResult result;
    public static final zgb Companion = new zgb();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new g9b(18)), null, null, null};

    public /* synthetic */ MessageFileEvents$PdfPreviewRendered(int i, MessageFileEvents$PdfPreviewResult messageFileEvents$PdfPreviewResult, long j, Integer num, boolean z, vnf vnfVar) {
        if (11 != (i & 11)) {
            gvj.f(i, 11, ygb.a.getDescriptor());
            throw null;
        }
        this.result = messageFileEvents$PdfPreviewResult;
        this.duration_ms = j;
        if ((i & 4) == 0) {
            this.page_count = null;
        } else {
            this.page_count = num;
        }
        this.is_retry = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return MessageFileEvents$PdfPreviewResult.Companion.serializer();
    }

    public static /* synthetic */ MessageFileEvents$PdfPreviewRendered copy$default(MessageFileEvents$PdfPreviewRendered messageFileEvents$PdfPreviewRendered, MessageFileEvents$PdfPreviewResult messageFileEvents$PdfPreviewResult, long j, Integer num, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            messageFileEvents$PdfPreviewResult = messageFileEvents$PdfPreviewRendered.result;
        }
        if ((i & 2) != 0) {
            j = messageFileEvents$PdfPreviewRendered.duration_ms;
        }
        if ((i & 4) != 0) {
            num = messageFileEvents$PdfPreviewRendered.page_count;
        }
        if ((i & 8) != 0) {
            z = messageFileEvents$PdfPreviewRendered.is_retry;
        }
        return messageFileEvents$PdfPreviewRendered.copy(messageFileEvents$PdfPreviewResult, j, num, z);
    }

    public static final /* synthetic */ void write$Self$analytics(MessageFileEvents$PdfPreviewRendered self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.result);
        output.D(serialDesc, 1, self.duration_ms);
        if (output.E(serialDesc) || self.page_count != null) {
            output.B(serialDesc, 2, e79.a, self.page_count);
        }
        output.p(serialDesc, 3, self.is_retry);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MessageFileEvents$PdfPreviewResult getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getDuration_ms() {
        return this.duration_ms;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getPage_count() {
        return this.page_count;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIs_retry() {
        return this.is_retry;
    }

    public final MessageFileEvents$PdfPreviewRendered copy(MessageFileEvents$PdfPreviewResult result, long duration_ms, Integer page_count, boolean is_retry) {
        result.getClass();
        return new MessageFileEvents$PdfPreviewRendered(result, duration_ms, page_count, is_retry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageFileEvents$PdfPreviewRendered)) {
            return false;
        }
        MessageFileEvents$PdfPreviewRendered messageFileEvents$PdfPreviewRendered = (MessageFileEvents$PdfPreviewRendered) other;
        return this.result == messageFileEvents$PdfPreviewRendered.result && this.duration_ms == messageFileEvents$PdfPreviewRendered.duration_ms && x44.r(this.page_count, messageFileEvents$PdfPreviewRendered.page_count) && this.is_retry == messageFileEvents$PdfPreviewRendered.is_retry;
    }

    public final long getDuration_ms() {
        return this.duration_ms;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_pdf_preview_rendered";
    }

    public final Integer getPage_count() {
        return this.page_count;
    }

    public final MessageFileEvents$PdfPreviewResult getResult() {
        return this.result;
    }

    public int hashCode() {
        int iE = vb7.e(this.result.hashCode() * 31, 31, this.duration_ms);
        Integer num = this.page_count;
        return Boolean.hashCode(this.is_retry) + ((iE + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final boolean is_retry() {
        return this.is_retry;
    }

    public String toString() {
        return "PdfPreviewRendered(result=" + this.result + ", duration_ms=" + this.duration_ms + ", page_count=" + this.page_count + ", is_retry=" + this.is_retry + ")";
    }

    public MessageFileEvents$PdfPreviewRendered(MessageFileEvents$PdfPreviewResult messageFileEvents$PdfPreviewResult, long j, Integer num, boolean z) {
        messageFileEvents$PdfPreviewResult.getClass();
        this.result = messageFileEvents$PdfPreviewResult;
        this.duration_ms = j;
        this.page_count = num;
        this.is_retry = z;
    }

    public /* synthetic */ MessageFileEvents$PdfPreviewRendered(MessageFileEvents$PdfPreviewResult messageFileEvents$PdfPreviewResult, long j, Integer num, boolean z, int i, mq5 mq5Var) {
        this(messageFileEvents$PdfPreviewResult, j, (i & 4) != 0 ? null : num, z);
    }
}
