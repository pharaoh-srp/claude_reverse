package com.anthropic.claude.api.chat.messages;

import defpackage.bc9;
import defpackage.gvj;
import defpackage.jn4;
import defpackage.kn4;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import java.util.Date;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B*\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0019\u0010\t\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\u0004\b\n\u0010\u000bB-\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001b\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ7\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001b\b\u0002\u0010\t\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR*\u0010\t\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u001c¨\u0006/"}, d2 = {"Lcom/anthropic/claude/api/chat/messages/ContentBlockStopEvent;", "Lcom/anthropic/claude/api/chat/messages/StreamEvent;", "", "index", "Ljava/util/Date;", "Lcom/anthropic/claude/api/Iso8601Date;", "Lonf;", "with", "Lbc9;", "stop_timestamp", "<init>", "(ILjava/util/Date;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IILjava/util/Date;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/messages/ContentBlockStopEvent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/util/Date;", "copy", "(ILjava/util/Date;)Lcom/anthropic/claude/api/chat/messages/ContentBlockStopEvent;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getIndex", "Ljava/util/Date;", "getStop_timestamp", "Companion", "jn4", "kn4", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ContentBlockStopEvent implements StreamEvent {
    public static final int $stable = 0;
    public static final kn4 Companion = new kn4();
    private final int index;
    private final Date stop_timestamp;

    public /* synthetic */ ContentBlockStopEvent(int i, int i2, Date date, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, jn4.a.getDescriptor());
            throw null;
        }
        this.index = i2;
        this.stop_timestamp = date;
    }

    public static /* synthetic */ ContentBlockStopEvent copy$default(ContentBlockStopEvent contentBlockStopEvent, int i, Date date, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = contentBlockStopEvent.index;
        }
        if ((i2 & 2) != 0) {
            date = contentBlockStopEvent.stop_timestamp;
        }
        return contentBlockStopEvent.copy(i, date);
    }

    public static final /* synthetic */ void write$Self$api(ContentBlockStopEvent self, vd4 output, SerialDescriptor serialDesc) {
        output.l(0, self.index, serialDesc);
        output.r(serialDesc, 1, bc9.a, self.stop_timestamp);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getStop_timestamp() {
        return this.stop_timestamp;
    }

    public final ContentBlockStopEvent copy(int index, Date stop_timestamp) {
        stop_timestamp.getClass();
        return new ContentBlockStopEvent(index, stop_timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentBlockStopEvent)) {
            return false;
        }
        ContentBlockStopEvent contentBlockStopEvent = (ContentBlockStopEvent) other;
        return this.index == contentBlockStopEvent.index && x44.r(this.stop_timestamp, contentBlockStopEvent.stop_timestamp);
    }

    public final int getIndex() {
        return this.index;
    }

    public final Date getStop_timestamp() {
        return this.stop_timestamp;
    }

    public int hashCode() {
        return this.stop_timestamp.hashCode() + (Integer.hashCode(this.index) * 31);
    }

    public String toString() {
        return "ContentBlockStopEvent(index=" + this.index + ", stop_timestamp=" + this.stop_timestamp + ")";
    }

    public ContentBlockStopEvent(int i, Date date) {
        date.getClass();
        this.index = i;
        this.stop_timestamp = date;
    }
}
