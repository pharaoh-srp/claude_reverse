package com.anthropic.claude.analytics.events;

import defpackage.g9b;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qgb;
import defpackage.rgb;
import defpackage.srg;
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
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ:\u0010!\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b1\u0010\u001dR\u0014\u00103\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u001d¨\u00067"}, d2 = {"com/anthropic/claude/analytics/events/MessageFileEvents$FileDownloadResult", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "Lcom/anthropic/claude/analytics/events/MessageFileEvents$DownloadSource;", "source", "", "file_extension", "Lcom/anthropic/claude/analytics/events/MessageFileEvents$DownloadOutcome;", "outcome", "reason", "<init>", "(Lcom/anthropic/claude/analytics/events/MessageFileEvents$DownloadSource;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/MessageFileEvents$DownloadOutcome;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/analytics/events/MessageFileEvents$DownloadSource;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/MessageFileEvents$DownloadOutcome;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/MessageFileEvents$FileDownloadResult;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/MessageFileEvents$FileDownloadResult;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/analytics/events/MessageFileEvents$DownloadSource;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/anthropic/claude/analytics/events/MessageFileEvents$DownloadOutcome;", "component4", "copy", "(Lcom/anthropic/claude/analytics/events/MessageFileEvents$DownloadSource;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/MessageFileEvents$DownloadOutcome;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/MessageFileEvents$FileDownloadResult;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/analytics/events/MessageFileEvents$DownloadSource;", "getSource", "Ljava/lang/String;", "getFile_extension", "Lcom/anthropic/claude/analytics/events/MessageFileEvents$DownloadOutcome;", "getOutcome", "getReason", "getEventName", "eventName", "Companion", "qgb", "rgb", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MessageFileEvents$FileDownloadResult implements AnalyticsEvent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final rgb Companion = new rgb();
    private final String file_extension;
    private final MessageFileEvents$DownloadOutcome outcome;
    private final String reason;
    private final MessageFileEvents$DownloadSource source;

    static {
        g9b g9bVar = new g9b(12);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{yb5.w(w1aVar, g9bVar), null, yb5.w(w1aVar, new g9b(13)), null};
    }

    public /* synthetic */ MessageFileEvents$FileDownloadResult(int i, MessageFileEvents$DownloadSource messageFileEvents$DownloadSource, String str, MessageFileEvents$DownloadOutcome messageFileEvents$DownloadOutcome, String str2, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, qgb.a.getDescriptor());
            throw null;
        }
        this.source = messageFileEvents$DownloadSource;
        this.file_extension = str;
        this.outcome = messageFileEvents$DownloadOutcome;
        if ((i & 8) == 0) {
            this.reason = null;
        } else {
            this.reason = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return MessageFileEvents$DownloadSource.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return MessageFileEvents$DownloadOutcome.Companion.serializer();
    }

    public static /* synthetic */ MessageFileEvents$FileDownloadResult copy$default(MessageFileEvents$FileDownloadResult messageFileEvents$FileDownloadResult, MessageFileEvents$DownloadSource messageFileEvents$DownloadSource, String str, MessageFileEvents$DownloadOutcome messageFileEvents$DownloadOutcome, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            messageFileEvents$DownloadSource = messageFileEvents$FileDownloadResult.source;
        }
        if ((i & 2) != 0) {
            str = messageFileEvents$FileDownloadResult.file_extension;
        }
        if ((i & 4) != 0) {
            messageFileEvents$DownloadOutcome = messageFileEvents$FileDownloadResult.outcome;
        }
        if ((i & 8) != 0) {
            str2 = messageFileEvents$FileDownloadResult.reason;
        }
        return messageFileEvents$FileDownloadResult.copy(messageFileEvents$DownloadSource, str, messageFileEvents$DownloadOutcome, str2);
    }

    public static final /* synthetic */ void write$Self$analytics(MessageFileEvents$FileDownloadResult self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.source);
        output.q(serialDesc, 1, self.file_extension);
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.outcome);
        if (!output.E(serialDesc) && self.reason == null) {
            return;
        }
        output.B(serialDesc, 3, srg.a, self.reason);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MessageFileEvents$DownloadSource getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFile_extension() {
        return this.file_extension;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MessageFileEvents$DownloadOutcome getOutcome() {
        return this.outcome;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    public final MessageFileEvents$FileDownloadResult copy(MessageFileEvents$DownloadSource source, String file_extension, MessageFileEvents$DownloadOutcome outcome, String reason) {
        source.getClass();
        file_extension.getClass();
        outcome.getClass();
        return new MessageFileEvents$FileDownloadResult(source, file_extension, outcome, reason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageFileEvents$FileDownloadResult)) {
            return false;
        }
        MessageFileEvents$FileDownloadResult messageFileEvents$FileDownloadResult = (MessageFileEvents$FileDownloadResult) other;
        return this.source == messageFileEvents$FileDownloadResult.source && x44.r(this.file_extension, messageFileEvents$FileDownloadResult.file_extension) && this.outcome == messageFileEvents$FileDownloadResult.outcome && x44.r(this.reason, messageFileEvents$FileDownloadResult.reason);
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "message_file.download.result";
    }

    public final String getFile_extension() {
        return this.file_extension;
    }

    public final MessageFileEvents$DownloadOutcome getOutcome() {
        return this.outcome;
    }

    public final String getReason() {
        return this.reason;
    }

    public final MessageFileEvents$DownloadSource getSource() {
        return this.source;
    }

    public int hashCode() {
        int iHashCode = (this.outcome.hashCode() + kgh.l(this.source.hashCode() * 31, 31, this.file_extension)) * 31;
        String str = this.reason;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FileDownloadResult(source=" + this.source + ", file_extension=" + this.file_extension + ", outcome=" + this.outcome + ", reason=" + this.reason + ")";
    }

    public MessageFileEvents$FileDownloadResult(MessageFileEvents$DownloadSource messageFileEvents$DownloadSource, String str, MessageFileEvents$DownloadOutcome messageFileEvents$DownloadOutcome, String str2) {
        messageFileEvents$DownloadSource.getClass();
        str.getClass();
        messageFileEvents$DownloadOutcome.getClass();
        this.source = messageFileEvents$DownloadSource;
        this.file_extension = str;
        this.outcome = messageFileEvents$DownloadOutcome;
        this.reason = str2;
    }

    public /* synthetic */ MessageFileEvents$FileDownloadResult(MessageFileEvents$DownloadSource messageFileEvents$DownloadSource, String str, MessageFileEvents$DownloadOutcome messageFileEvents$DownloadOutcome, String str2, int i, mq5 mq5Var) {
        this(messageFileEvents$DownloadSource, str, messageFileEvents$DownloadOutcome, (i & 8) != 0 ? null : str2);
    }
}
