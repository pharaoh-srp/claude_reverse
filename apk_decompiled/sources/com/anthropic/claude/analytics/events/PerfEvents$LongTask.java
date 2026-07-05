package com.anthropic.claude.analytics.events;

import defpackage.grc;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.onf;
import defpackage.qy1;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.ywc;
import defpackage.zwc;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ.\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u0014\u0010-\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u001c¨\u00061"}, d2 = {"com/anthropic/claude/analytics/events/PerfEvents$LongTask", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "duration_ms", "threshold_ms", "", "target", "<init>", "(JJLjava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IJJLjava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/PerfEvents$LongTask;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/PerfEvents$LongTask;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "component3", "()Ljava/lang/String;", "copy", "(JJLjava/lang/String;)Lcom/anthropic/claude/analytics/events/PerfEvents$LongTask;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getDuration_ms", "getThreshold_ms", "Ljava/lang/String;", "getTarget", "getEventName", "eventName", "Companion", "ywc", "zwc", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class PerfEvents$LongTask implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final zwc Companion = new zwc();
    private final long duration_ms;
    private final String target;
    private final long threshold_ms;

    public /* synthetic */ PerfEvents$LongTask(int i, long j, long j2, String str, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, ywc.a.getDescriptor());
            throw null;
        }
        this.duration_ms = j;
        this.threshold_ms = j2;
        this.target = str;
    }

    public static /* synthetic */ PerfEvents$LongTask copy$default(PerfEvents$LongTask perfEvents$LongTask, long j, long j2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = perfEvents$LongTask.duration_ms;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = perfEvents$LongTask.threshold_ms;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            str = perfEvents$LongTask.target;
        }
        return perfEvents$LongTask.copy(j3, j4, str);
    }

    public static final /* synthetic */ void write$Self$analytics(PerfEvents$LongTask self, vd4 output, SerialDescriptor serialDesc) {
        output.D(serialDesc, 0, self.duration_ms);
        output.D(serialDesc, 1, self.threshold_ms);
        output.q(serialDesc, 2, self.target);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getDuration_ms() {
        return this.duration_ms;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getThreshold_ms() {
        return this.threshold_ms;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTarget() {
        return this.target;
    }

    public final PerfEvents$LongTask copy(long duration_ms, long threshold_ms, String target) {
        target.getClass();
        return new PerfEvents$LongTask(duration_ms, threshold_ms, target);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PerfEvents$LongTask)) {
            return false;
        }
        PerfEvents$LongTask perfEvents$LongTask = (PerfEvents$LongTask) other;
        return this.duration_ms == perfEvents$LongTask.duration_ms && this.threshold_ms == perfEvents$LongTask.threshold_ms && x44.r(this.target, perfEvents$LongTask.target);
    }

    public final long getDuration_ms() {
        return this.duration_ms;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.perf.long_task";
    }

    public final String getTarget() {
        return this.target;
    }

    public final long getThreshold_ms() {
        return this.threshold_ms;
    }

    public int hashCode() {
        return this.target.hashCode() + vb7.e(Long.hashCode(this.duration_ms) * 31, 31, this.threshold_ms);
    }

    public String toString() {
        long j = this.duration_ms;
        long j2 = this.threshold_ms;
        String str = this.target;
        StringBuilder sbW = grc.w(j, "LongTask(duration_ms=", ", threshold_ms=");
        qy1.m(j2, ", target=", str, sbW);
        sbW.append(")");
        return sbW.toString();
    }

    public PerfEvents$LongTask(long j, long j2, String str) {
        str.getClass();
        this.duration_ms = j;
        this.threshold_ms = j2;
        this.target = str;
    }
}
