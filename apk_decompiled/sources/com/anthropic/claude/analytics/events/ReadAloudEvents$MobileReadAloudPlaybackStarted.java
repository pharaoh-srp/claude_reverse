package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.o2e;
import defpackage.onf;
import defpackage.p2e;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001aR\u0014\u0010*\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0018¨\u0006."}, d2 = {"com/anthropic/claude/analytics/events/ReadAloudEvents$MobileReadAloudPlaybackStarted", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "message_id", "", "ttfa_ms", "<init>", "(Ljava/lang/String;J)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;JLvnf;)V", "Lcom/anthropic/claude/analytics/events/ReadAloudEvents$MobileReadAloudPlaybackStarted;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ReadAloudEvents$MobileReadAloudPlaybackStarted;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()J", "copy", "(Ljava/lang/String;J)Lcom/anthropic/claude/analytics/events/ReadAloudEvents$MobileReadAloudPlaybackStarted;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage_id", "J", "getTtfa_ms", "getEventName", "eventName", "Companion", "o2e", "p2e", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ReadAloudEvents$MobileReadAloudPlaybackStarted implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final p2e Companion = new p2e();
    private final String message_id;
    private final long ttfa_ms;

    public /* synthetic */ ReadAloudEvents$MobileReadAloudPlaybackStarted(int i, String str, long j, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, o2e.a.getDescriptor());
            throw null;
        }
        this.message_id = str;
        this.ttfa_ms = j;
    }

    public static /* synthetic */ ReadAloudEvents$MobileReadAloudPlaybackStarted copy$default(ReadAloudEvents$MobileReadAloudPlaybackStarted readAloudEvents$MobileReadAloudPlaybackStarted, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = readAloudEvents$MobileReadAloudPlaybackStarted.message_id;
        }
        if ((i & 2) != 0) {
            j = readAloudEvents$MobileReadAloudPlaybackStarted.ttfa_ms;
        }
        return readAloudEvents$MobileReadAloudPlaybackStarted.copy(str, j);
    }

    public static final /* synthetic */ void write$Self$analytics(ReadAloudEvents$MobileReadAloudPlaybackStarted self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.message_id);
        output.D(serialDesc, 1, self.ttfa_ms);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage_id() {
        return this.message_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTtfa_ms() {
        return this.ttfa_ms;
    }

    public final ReadAloudEvents$MobileReadAloudPlaybackStarted copy(String message_id, long ttfa_ms) {
        message_id.getClass();
        return new ReadAloudEvents$MobileReadAloudPlaybackStarted(message_id, ttfa_ms);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadAloudEvents$MobileReadAloudPlaybackStarted)) {
            return false;
        }
        ReadAloudEvents$MobileReadAloudPlaybackStarted readAloudEvents$MobileReadAloudPlaybackStarted = (ReadAloudEvents$MobileReadAloudPlaybackStarted) other;
        return x44.r(this.message_id, readAloudEvents$MobileReadAloudPlaybackStarted.message_id) && this.ttfa_ms == readAloudEvents$MobileReadAloudPlaybackStarted.ttfa_ms;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_read_aloud_playback_started";
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final long getTtfa_ms() {
        return this.ttfa_ms;
    }

    public int hashCode() {
        return Long.hashCode(this.ttfa_ms) + (this.message_id.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sbW = vb7.w("MobileReadAloudPlaybackStarted(message_id=", this.message_id, ", ttfa_ms=", this.ttfa_ms);
        sbW.append(")");
        return sbW.toString();
    }

    public ReadAloudEvents$MobileReadAloudPlaybackStarted(String str, long j) {
        str.getClass();
        this.message_id = str;
        this.ttfa_ms = j;
    }
}
