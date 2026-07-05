package com.anthropic.claude.analytics.events;

import defpackage.grc;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.onf;
import defpackage.q2e;
import defpackage.r2e;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001dR\u0014\u0010.\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0019¨\u00062"}, d2 = {"com/anthropic/claude/analytics/events/ReadAloudEvents$MobileReadAloudStallAbandoned", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "message_id", "", "attempt", "", "stall_duration_ms", "<init>", "(Ljava/lang/String;IJ)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;IJLvnf;)V", "Lcom/anthropic/claude/analytics/events/ReadAloudEvents$MobileReadAloudStallAbandoned;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ReadAloudEvents$MobileReadAloudStallAbandoned;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()J", "copy", "(Ljava/lang/String;IJ)Lcom/anthropic/claude/analytics/events/ReadAloudEvents$MobileReadAloudStallAbandoned;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage_id", "I", "getAttempt", "J", "getStall_duration_ms", "getEventName", "eventName", "Companion", "q2e", "r2e", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ReadAloudEvents$MobileReadAloudStallAbandoned implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final r2e Companion = new r2e();
    private final int attempt;
    private final String message_id;
    private final long stall_duration_ms;

    public /* synthetic */ ReadAloudEvents$MobileReadAloudStallAbandoned(int i, String str, int i2, long j, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, q2e.a.getDescriptor());
            throw null;
        }
        this.message_id = str;
        this.attempt = i2;
        this.stall_duration_ms = j;
    }

    public static /* synthetic */ ReadAloudEvents$MobileReadAloudStallAbandoned copy$default(ReadAloudEvents$MobileReadAloudStallAbandoned readAloudEvents$MobileReadAloudStallAbandoned, String str, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = readAloudEvents$MobileReadAloudStallAbandoned.message_id;
        }
        if ((i2 & 2) != 0) {
            i = readAloudEvents$MobileReadAloudStallAbandoned.attempt;
        }
        if ((i2 & 4) != 0) {
            j = readAloudEvents$MobileReadAloudStallAbandoned.stall_duration_ms;
        }
        return readAloudEvents$MobileReadAloudStallAbandoned.copy(str, i, j);
    }

    public static final /* synthetic */ void write$Self$analytics(ReadAloudEvents$MobileReadAloudStallAbandoned self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.message_id);
        output.l(1, self.attempt, serialDesc);
        output.D(serialDesc, 2, self.stall_duration_ms);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage_id() {
        return this.message_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAttempt() {
        return this.attempt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getStall_duration_ms() {
        return this.stall_duration_ms;
    }

    public final ReadAloudEvents$MobileReadAloudStallAbandoned copy(String message_id, int attempt, long stall_duration_ms) {
        message_id.getClass();
        return new ReadAloudEvents$MobileReadAloudStallAbandoned(message_id, attempt, stall_duration_ms);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadAloudEvents$MobileReadAloudStallAbandoned)) {
            return false;
        }
        ReadAloudEvents$MobileReadAloudStallAbandoned readAloudEvents$MobileReadAloudStallAbandoned = (ReadAloudEvents$MobileReadAloudStallAbandoned) other;
        return x44.r(this.message_id, readAloudEvents$MobileReadAloudStallAbandoned.message_id) && this.attempt == readAloudEvents$MobileReadAloudStallAbandoned.attempt && this.stall_duration_ms == readAloudEvents$MobileReadAloudStallAbandoned.stall_duration_ms;
    }

    public final int getAttempt() {
        return this.attempt;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_read_aloud_stall_abandoned";
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final long getStall_duration_ms() {
        return this.stall_duration_ms;
    }

    public int hashCode() {
        return Long.hashCode(this.stall_duration_ms) + vb7.c(this.attempt, this.message_id.hashCode() * 31, 31);
    }

    public String toString() {
        return grc.r(this.stall_duration_ms, ")", ij0.p("MobileReadAloudStallAbandoned(message_id=", this.message_id, this.attempt, ", attempt=", ", stall_duration_ms="));
    }

    public ReadAloudEvents$MobileReadAloudStallAbandoned(String str, int i, long j) {
        str.getClass();
        this.message_id = str;
        this.attempt = i;
        this.stall_duration_ms = j;
    }
}
