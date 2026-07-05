package com.anthropic.claude.analytics.events;

import defpackage.b5;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wi;
import defpackage.xi;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b\u0005\u0010\u001aR\u0014\u0010*\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u001f¨\u0006."}, d2 = {"com/anthropic/claude/analytics/events/AgeSignalsEvents$AgeSignalsUserBlocked", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "Lcom/anthropic/claude/analytics/events/AgeSignalsEvents$AgeSignalsBlockingPoint;", "blocking_point", "", "is_debug_override", "<init>", "(Lcom/anthropic/claude/analytics/events/AgeSignalsEvents$AgeSignalsBlockingPoint;Z)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/analytics/events/AgeSignalsEvents$AgeSignalsBlockingPoint;ZLvnf;)V", "Lcom/anthropic/claude/analytics/events/AgeSignalsEvents$AgeSignalsUserBlocked;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/AgeSignalsEvents$AgeSignalsUserBlocked;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/analytics/events/AgeSignalsEvents$AgeSignalsBlockingPoint;", "component2", "()Z", "copy", "(Lcom/anthropic/claude/analytics/events/AgeSignalsEvents$AgeSignalsBlockingPoint;Z)Lcom/anthropic/claude/analytics/events/AgeSignalsEvents$AgeSignalsUserBlocked;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/analytics/events/AgeSignalsEvents$AgeSignalsBlockingPoint;", "getBlocking_point", "Z", "getEventName", "eventName", "Companion", "wi", "xi", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class AgeSignalsEvents$AgeSignalsUserBlocked implements AnalyticsEvent {
    public static final int $stable = 0;
    private final AgeSignalsEvents$AgeSignalsBlockingPoint blocking_point;
    private final boolean is_debug_override;
    public static final xi Companion = new xi();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new b5(3)), null};

    public /* synthetic */ AgeSignalsEvents$AgeSignalsUserBlocked(int i, AgeSignalsEvents$AgeSignalsBlockingPoint ageSignalsEvents$AgeSignalsBlockingPoint, boolean z, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, wi.a.getDescriptor());
            throw null;
        }
        this.blocking_point = ageSignalsEvents$AgeSignalsBlockingPoint;
        this.is_debug_override = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return AgeSignalsEvents$AgeSignalsBlockingPoint.Companion.serializer();
    }

    public static /* synthetic */ AgeSignalsEvents$AgeSignalsUserBlocked copy$default(AgeSignalsEvents$AgeSignalsUserBlocked ageSignalsEvents$AgeSignalsUserBlocked, AgeSignalsEvents$AgeSignalsBlockingPoint ageSignalsEvents$AgeSignalsBlockingPoint, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            ageSignalsEvents$AgeSignalsBlockingPoint = ageSignalsEvents$AgeSignalsUserBlocked.blocking_point;
        }
        if ((i & 2) != 0) {
            z = ageSignalsEvents$AgeSignalsUserBlocked.is_debug_override;
        }
        return ageSignalsEvents$AgeSignalsUserBlocked.copy(ageSignalsEvents$AgeSignalsBlockingPoint, z);
    }

    public static final /* synthetic */ void write$Self$analytics(AgeSignalsEvents$AgeSignalsUserBlocked self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.blocking_point);
        output.p(serialDesc, 1, self.is_debug_override);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AgeSignalsEvents$AgeSignalsBlockingPoint getBlocking_point() {
        return this.blocking_point;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIs_debug_override() {
        return this.is_debug_override;
    }

    public final AgeSignalsEvents$AgeSignalsUserBlocked copy(AgeSignalsEvents$AgeSignalsBlockingPoint blocking_point, boolean is_debug_override) {
        blocking_point.getClass();
        return new AgeSignalsEvents$AgeSignalsUserBlocked(blocking_point, is_debug_override);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgeSignalsEvents$AgeSignalsUserBlocked)) {
            return false;
        }
        AgeSignalsEvents$AgeSignalsUserBlocked ageSignalsEvents$AgeSignalsUserBlocked = (AgeSignalsEvents$AgeSignalsUserBlocked) other;
        return this.blocking_point == ageSignalsEvents$AgeSignalsUserBlocked.blocking_point && this.is_debug_override == ageSignalsEvents$AgeSignalsUserBlocked.is_debug_override;
    }

    public final AgeSignalsEvents$AgeSignalsBlockingPoint getBlocking_point() {
        return this.blocking_point;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile.age_signals.user_blocked";
    }

    public int hashCode() {
        return Boolean.hashCode(this.is_debug_override) + (this.blocking_point.hashCode() * 31);
    }

    public final boolean is_debug_override() {
        return this.is_debug_override;
    }

    public String toString() {
        return "AgeSignalsUserBlocked(blocking_point=" + this.blocking_point + ", is_debug_override=" + this.is_debug_override + ")";
    }

    public AgeSignalsEvents$AgeSignalsUserBlocked(AgeSignalsEvents$AgeSignalsBlockingPoint ageSignalsEvents$AgeSignalsBlockingPoint, boolean z) {
        ageSignalsEvents$AgeSignalsBlockingPoint.getClass();
        this.blocking_point = ageSignalsEvents$AgeSignalsBlockingPoint;
        this.is_debug_override = z;
    }
}
