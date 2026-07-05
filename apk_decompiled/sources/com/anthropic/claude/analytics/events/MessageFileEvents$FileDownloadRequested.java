package com.anthropic.claude.analytics.events;

import defpackage.g9b;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.ogb;
import defpackage.onf;
import defpackage.pgb;
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
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001aR\u0014\u0010*\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u001a¨\u0006."}, d2 = {"com/anthropic/claude/analytics/events/MessageFileEvents$FileDownloadRequested", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "Lcom/anthropic/claude/analytics/events/MessageFileEvents$DownloadSource;", "source", "", "file_extension", "<init>", "(Lcom/anthropic/claude/analytics/events/MessageFileEvents$DownloadSource;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/analytics/events/MessageFileEvents$DownloadSource;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/MessageFileEvents$FileDownloadRequested;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/MessageFileEvents$FileDownloadRequested;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/analytics/events/MessageFileEvents$DownloadSource;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/anthropic/claude/analytics/events/MessageFileEvents$DownloadSource;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/MessageFileEvents$FileDownloadRequested;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/analytics/events/MessageFileEvents$DownloadSource;", "getSource", "Ljava/lang/String;", "getFile_extension", "getEventName", "eventName", "Companion", "ogb", "pgb", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MessageFileEvents$FileDownloadRequested implements AnalyticsEvent {
    public static final int $stable = 0;
    private final String file_extension;
    private final MessageFileEvents$DownloadSource source;
    public static final pgb Companion = new pgb();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new g9b(11)), null};

    public /* synthetic */ MessageFileEvents$FileDownloadRequested(int i, MessageFileEvents$DownloadSource messageFileEvents$DownloadSource, String str, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, ogb.a.getDescriptor());
            throw null;
        }
        this.source = messageFileEvents$DownloadSource;
        this.file_extension = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return MessageFileEvents$DownloadSource.Companion.serializer();
    }

    public static /* synthetic */ MessageFileEvents$FileDownloadRequested copy$default(MessageFileEvents$FileDownloadRequested messageFileEvents$FileDownloadRequested, MessageFileEvents$DownloadSource messageFileEvents$DownloadSource, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            messageFileEvents$DownloadSource = messageFileEvents$FileDownloadRequested.source;
        }
        if ((i & 2) != 0) {
            str = messageFileEvents$FileDownloadRequested.file_extension;
        }
        return messageFileEvents$FileDownloadRequested.copy(messageFileEvents$DownloadSource, str);
    }

    public static final /* synthetic */ void write$Self$analytics(MessageFileEvents$FileDownloadRequested self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.source);
        output.q(serialDesc, 1, self.file_extension);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MessageFileEvents$DownloadSource getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFile_extension() {
        return this.file_extension;
    }

    public final MessageFileEvents$FileDownloadRequested copy(MessageFileEvents$DownloadSource source, String file_extension) {
        source.getClass();
        file_extension.getClass();
        return new MessageFileEvents$FileDownloadRequested(source, file_extension);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageFileEvents$FileDownloadRequested)) {
            return false;
        }
        MessageFileEvents$FileDownloadRequested messageFileEvents$FileDownloadRequested = (MessageFileEvents$FileDownloadRequested) other;
        return this.source == messageFileEvents$FileDownloadRequested.source && x44.r(this.file_extension, messageFileEvents$FileDownloadRequested.file_extension);
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "message_file.download.requested";
    }

    public final String getFile_extension() {
        return this.file_extension;
    }

    public final MessageFileEvents$DownloadSource getSource() {
        return this.source;
    }

    public int hashCode() {
        return this.file_extension.hashCode() + (this.source.hashCode() * 31);
    }

    public String toString() {
        return "FileDownloadRequested(source=" + this.source + ", file_extension=" + this.file_extension + ")";
    }

    public MessageFileEvents$FileDownloadRequested(MessageFileEvents$DownloadSource messageFileEvents$DownloadSource, String str) {
        messageFileEvents$DownloadSource.getClass();
        str.getClass();
        this.source = messageFileEvents$DownloadSource;
        this.file_extension = str;
    }
}
