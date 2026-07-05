package com.anthropic.claude.analytics.events;

import defpackage.e79;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.y2e;
import defpackage.z2e;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ<\u0010\u001f\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u001bJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b.\u0010\u001dR\u0014\u00100\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0019¨\u00064"}, d2 = {"com/anthropic/claude/analytics/events/ReadAloudEvents$MobileReadAloudWsReconnected", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "message_id", "", "attempt", "resume_chunk_index", "reconnect_latency_ms", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ReadAloudEvents$MobileReadAloudWsReconnected;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ReadAloudEvents$MobileReadAloudWsReconnected;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Ljava/lang/Integer;", "component4", "copy", "(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;)Lcom/anthropic/claude/analytics/events/ReadAloudEvents$MobileReadAloudWsReconnected;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage_id", "I", "getAttempt", "Ljava/lang/Integer;", "getResume_chunk_index", "getReconnect_latency_ms", "getEventName", "eventName", "Companion", "y2e", "z2e", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ReadAloudEvents$MobileReadAloudWsReconnected implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final z2e Companion = new z2e();
    private final int attempt;
    private final String message_id;
    private final Integer reconnect_latency_ms;
    private final Integer resume_chunk_index;

    public /* synthetic */ ReadAloudEvents$MobileReadAloudWsReconnected(int i, String str, int i2, Integer num, Integer num2, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, y2e.a.getDescriptor());
            throw null;
        }
        this.message_id = str;
        this.attempt = i2;
        if ((i & 4) == 0) {
            this.resume_chunk_index = null;
        } else {
            this.resume_chunk_index = num;
        }
        if ((i & 8) == 0) {
            this.reconnect_latency_ms = null;
        } else {
            this.reconnect_latency_ms = num2;
        }
    }

    public static /* synthetic */ ReadAloudEvents$MobileReadAloudWsReconnected copy$default(ReadAloudEvents$MobileReadAloudWsReconnected readAloudEvents$MobileReadAloudWsReconnected, String str, int i, Integer num, Integer num2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = readAloudEvents$MobileReadAloudWsReconnected.message_id;
        }
        if ((i2 & 2) != 0) {
            i = readAloudEvents$MobileReadAloudWsReconnected.attempt;
        }
        if ((i2 & 4) != 0) {
            num = readAloudEvents$MobileReadAloudWsReconnected.resume_chunk_index;
        }
        if ((i2 & 8) != 0) {
            num2 = readAloudEvents$MobileReadAloudWsReconnected.reconnect_latency_ms;
        }
        return readAloudEvents$MobileReadAloudWsReconnected.copy(str, i, num, num2);
    }

    public static final /* synthetic */ void write$Self$analytics(ReadAloudEvents$MobileReadAloudWsReconnected self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.message_id);
        output.l(1, self.attempt, serialDesc);
        if (output.E(serialDesc) || self.resume_chunk_index != null) {
            output.B(serialDesc, 2, e79.a, self.resume_chunk_index);
        }
        if (!output.E(serialDesc) && self.reconnect_latency_ms == null) {
            return;
        }
        output.B(serialDesc, 3, e79.a, self.reconnect_latency_ms);
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
    public final Integer getResume_chunk_index() {
        return this.resume_chunk_index;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getReconnect_latency_ms() {
        return this.reconnect_latency_ms;
    }

    public final ReadAloudEvents$MobileReadAloudWsReconnected copy(String message_id, int attempt, Integer resume_chunk_index, Integer reconnect_latency_ms) {
        message_id.getClass();
        return new ReadAloudEvents$MobileReadAloudWsReconnected(message_id, attempt, resume_chunk_index, reconnect_latency_ms);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadAloudEvents$MobileReadAloudWsReconnected)) {
            return false;
        }
        ReadAloudEvents$MobileReadAloudWsReconnected readAloudEvents$MobileReadAloudWsReconnected = (ReadAloudEvents$MobileReadAloudWsReconnected) other;
        return x44.r(this.message_id, readAloudEvents$MobileReadAloudWsReconnected.message_id) && this.attempt == readAloudEvents$MobileReadAloudWsReconnected.attempt && x44.r(this.resume_chunk_index, readAloudEvents$MobileReadAloudWsReconnected.resume_chunk_index) && x44.r(this.reconnect_latency_ms, readAloudEvents$MobileReadAloudWsReconnected.reconnect_latency_ms);
    }

    public final int getAttempt() {
        return this.attempt;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_read_aloud_ws_reconnected";
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final Integer getReconnect_latency_ms() {
        return this.reconnect_latency_ms;
    }

    public final Integer getResume_chunk_index() {
        return this.resume_chunk_index;
    }

    public int hashCode() {
        int iC = vb7.c(this.attempt, this.message_id.hashCode() * 31, 31);
        Integer num = this.resume_chunk_index;
        int iHashCode = (iC + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.reconnect_latency_ms;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        String str = this.message_id;
        int i = this.attempt;
        Integer num = this.resume_chunk_index;
        Integer num2 = this.reconnect_latency_ms;
        StringBuilder sbP = ij0.p("MobileReadAloudWsReconnected(message_id=", str, i, ", attempt=", ", resume_chunk_index=");
        sbP.append(num);
        sbP.append(", reconnect_latency_ms=");
        sbP.append(num2);
        sbP.append(")");
        return sbP.toString();
    }

    public ReadAloudEvents$MobileReadAloudWsReconnected(String str, int i, Integer num, Integer num2) {
        str.getClass();
        this.message_id = str;
        this.attempt = i;
        this.resume_chunk_index = num;
        this.reconnect_latency_ms = num2;
    }

    public /* synthetic */ ReadAloudEvents$MobileReadAloudWsReconnected(String str, int i, Integer num, Integer num2, int i2, mq5 mq5Var) {
        this(str, i, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : num2);
    }
}
