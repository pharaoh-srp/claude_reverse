package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.j7;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.ni;
import defpackage.oi;
import defpackage.onf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000267B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB=\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!J8\u0010\"\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u001a\u0010*\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b\t\u0010!R\u0014\u00104\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010&¨\u00068"}, d2 = {"com/anthropic/claude/analytics/events/AgeSignalsEvents$AgeSignalsCheckCompleted", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "Lcom/anthropic/claude/analytics/events/AgeSignalsEvents$AgeSignalsResult;", "result", "", "attempt_count", "", "duration_ms", "", "is_debug_override", "<init>", "(Lcom/anthropic/claude/analytics/events/AgeSignalsEvents$AgeSignalsResult;IJZ)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/analytics/events/AgeSignalsEvents$AgeSignalsResult;IJZLvnf;)V", "Lcom/anthropic/claude/analytics/events/AgeSignalsEvents$AgeSignalsCheckCompleted;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/AgeSignalsEvents$AgeSignalsCheckCompleted;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/analytics/events/AgeSignalsEvents$AgeSignalsResult;", "component2", "()I", "component3", "()J", "component4", "()Z", "copy", "(Lcom/anthropic/claude/analytics/events/AgeSignalsEvents$AgeSignalsResult;IJZ)Lcom/anthropic/claude/analytics/events/AgeSignalsEvents$AgeSignalsCheckCompleted;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/analytics/events/AgeSignalsEvents$AgeSignalsResult;", "getResult", "I", "getAttempt_count", "J", "getDuration_ms", "Z", "getEventName", "eventName", "Companion", "ni", "oi", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class AgeSignalsEvents$AgeSignalsCheckCompleted implements AnalyticsEvent {
    public static final int $stable = 0;
    private final int attempt_count;
    private final long duration_ms;
    private final boolean is_debug_override;
    private final AgeSignalsEvents$AgeSignalsResult result;
    public static final oi Companion = new oi();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new j7(7)), null, null, null};

    public /* synthetic */ AgeSignalsEvents$AgeSignalsCheckCompleted(int i, AgeSignalsEvents$AgeSignalsResult ageSignalsEvents$AgeSignalsResult, int i2, long j, boolean z, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, ni.a.getDescriptor());
            throw null;
        }
        this.result = ageSignalsEvents$AgeSignalsResult;
        this.attempt_count = i2;
        this.duration_ms = j;
        this.is_debug_override = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return AgeSignalsEvents$AgeSignalsResult.Companion.serializer();
    }

    public static /* synthetic */ AgeSignalsEvents$AgeSignalsCheckCompleted copy$default(AgeSignalsEvents$AgeSignalsCheckCompleted ageSignalsEvents$AgeSignalsCheckCompleted, AgeSignalsEvents$AgeSignalsResult ageSignalsEvents$AgeSignalsResult, int i, long j, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            ageSignalsEvents$AgeSignalsResult = ageSignalsEvents$AgeSignalsCheckCompleted.result;
        }
        if ((i2 & 2) != 0) {
            i = ageSignalsEvents$AgeSignalsCheckCompleted.attempt_count;
        }
        if ((i2 & 4) != 0) {
            j = ageSignalsEvents$AgeSignalsCheckCompleted.duration_ms;
        }
        if ((i2 & 8) != 0) {
            z = ageSignalsEvents$AgeSignalsCheckCompleted.is_debug_override;
        }
        boolean z2 = z;
        return ageSignalsEvents$AgeSignalsCheckCompleted.copy(ageSignalsEvents$AgeSignalsResult, i, j, z2);
    }

    public static final /* synthetic */ void write$Self$analytics(AgeSignalsEvents$AgeSignalsCheckCompleted self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.result);
        output.l(1, self.attempt_count, serialDesc);
        output.D(serialDesc, 2, self.duration_ms);
        output.p(serialDesc, 3, self.is_debug_override);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AgeSignalsEvents$AgeSignalsResult getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAttempt_count() {
        return this.attempt_count;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getDuration_ms() {
        return this.duration_ms;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIs_debug_override() {
        return this.is_debug_override;
    }

    public final AgeSignalsEvents$AgeSignalsCheckCompleted copy(AgeSignalsEvents$AgeSignalsResult result, int attempt_count, long duration_ms, boolean is_debug_override) {
        result.getClass();
        return new AgeSignalsEvents$AgeSignalsCheckCompleted(result, attempt_count, duration_ms, is_debug_override);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgeSignalsEvents$AgeSignalsCheckCompleted)) {
            return false;
        }
        AgeSignalsEvents$AgeSignalsCheckCompleted ageSignalsEvents$AgeSignalsCheckCompleted = (AgeSignalsEvents$AgeSignalsCheckCompleted) other;
        return this.result == ageSignalsEvents$AgeSignalsCheckCompleted.result && this.attempt_count == ageSignalsEvents$AgeSignalsCheckCompleted.attempt_count && this.duration_ms == ageSignalsEvents$AgeSignalsCheckCompleted.duration_ms && this.is_debug_override == ageSignalsEvents$AgeSignalsCheckCompleted.is_debug_override;
    }

    public final int getAttempt_count() {
        return this.attempt_count;
    }

    public final long getDuration_ms() {
        return this.duration_ms;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile.age_signals.check_completed";
    }

    public final AgeSignalsEvents$AgeSignalsResult getResult() {
        return this.result;
    }

    public int hashCode() {
        return Boolean.hashCode(this.is_debug_override) + vb7.e(vb7.c(this.attempt_count, this.result.hashCode() * 31, 31), 31, this.duration_ms);
    }

    public final boolean is_debug_override() {
        return this.is_debug_override;
    }

    public String toString() {
        return "AgeSignalsCheckCompleted(result=" + this.result + ", attempt_count=" + this.attempt_count + ", duration_ms=" + this.duration_ms + ", is_debug_override=" + this.is_debug_override + ")";
    }

    public AgeSignalsEvents$AgeSignalsCheckCompleted(AgeSignalsEvents$AgeSignalsResult ageSignalsEvents$AgeSignalsResult, int i, long j, boolean z) {
        ageSignalsEvents$AgeSignalsResult.getClass();
        this.result = ageSignalsEvents$AgeSignalsResult;
        this.attempt_count = i;
        this.duration_ms = j;
        this.is_debug_override = z;
    }
}
