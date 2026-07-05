package com.anthropic.claude.analytics.events;

import defpackage.bcc;
import defpackage.ccc;
import defpackage.e2c;
import defpackage.fsh;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kw9;
import defpackage.mdj;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 O2\u00020\u0001:\u0002PQBW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014Bs\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0013\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJ\u0010\u0010'\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b)\u0010\"Jt\u0010+\u001a\u00020*2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b0\u0010 J\u001a\u00103\u001a\u00020\u00062\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b3\u00104J'\u0010=\u001a\u00020:2\u0006\u00105\u001a\u00020*2\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0001¢\u0006\u0004\b;\u0010<R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010>\u001a\u0004\b?\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010@\u001a\u0004\bA\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010B\u001a\u0004\b\u0007\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010C\u001a\u0004\bD\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010E\u001a\u0004\bF\u0010\"R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010E\u001a\u0004\bG\u0010\"R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010H\u001a\u0004\bI\u0010%R\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010B\u001a\u0004\b\u000f\u0010\u001eR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010J\u001a\u0004\bK\u0010(R\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010E\u001a\u0004\bL\u0010\"R\u0014\u0010N\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010/¨\u0006R"}, d2 = {"com/anthropic/claude/analytics/events/OfflineEvents$ScreenResolved", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "Lcom/anthropic/claude/analytics/events/OfflineEvents$OfflineScreen;", "screen", "Lcom/anthropic/claude/analytics/events/OfflineEvents$ScreenResolvedOutcome;", "outcome", "", "is_first_load", "", "cached_count", "", "cached_at_ms", "cache_age_ms", "Lcom/anthropic/claude/analytics/events/OfflineEvents$CacheAgeBucket;", "cache_age_bucket", "is_connectivity_failure", "Lcom/anthropic/claude/analytics/events/OfflineEvents$OfflineErrorKind;", "error_kind", "sync_duration_ms", "<init>", "(Lcom/anthropic/claude/analytics/events/OfflineEvents$OfflineScreen;Lcom/anthropic/claude/analytics/events/OfflineEvents$ScreenResolvedOutcome;ZIJJLcom/anthropic/claude/analytics/events/OfflineEvents$CacheAgeBucket;ZLcom/anthropic/claude/analytics/events/OfflineEvents$OfflineErrorKind;J)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/analytics/events/OfflineEvents$OfflineScreen;Lcom/anthropic/claude/analytics/events/OfflineEvents$ScreenResolvedOutcome;ZIJJLcom/anthropic/claude/analytics/events/OfflineEvents$CacheAgeBucket;ZLcom/anthropic/claude/analytics/events/OfflineEvents$OfflineErrorKind;JLvnf;)V", "component1", "()Lcom/anthropic/claude/analytics/events/OfflineEvents$OfflineScreen;", "component2", "()Lcom/anthropic/claude/analytics/events/OfflineEvents$ScreenResolvedOutcome;", "component3", "()Z", "component4", "()I", "component5", "()J", "component6", "component7", "()Lcom/anthropic/claude/analytics/events/OfflineEvents$CacheAgeBucket;", "component8", "component9", "()Lcom/anthropic/claude/analytics/events/OfflineEvents$OfflineErrorKind;", "component10", "Lcom/anthropic/claude/analytics/events/OfflineEvents$ScreenResolved;", "copy", "(Lcom/anthropic/claude/analytics/events/OfflineEvents$OfflineScreen;Lcom/anthropic/claude/analytics/events/OfflineEvents$ScreenResolvedOutcome;ZIJJLcom/anthropic/claude/analytics/events/OfflineEvents$CacheAgeBucket;ZLcom/anthropic/claude/analytics/events/OfflineEvents$OfflineErrorKind;J)Lcom/anthropic/claude/analytics/events/OfflineEvents$ScreenResolved;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/OfflineEvents$ScreenResolved;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/anthropic/claude/analytics/events/OfflineEvents$OfflineScreen;", "getScreen", "Lcom/anthropic/claude/analytics/events/OfflineEvents$ScreenResolvedOutcome;", "getOutcome", "Z", "I", "getCached_count", "J", "getCached_at_ms", "getCache_age_ms", "Lcom/anthropic/claude/analytics/events/OfflineEvents$CacheAgeBucket;", "getCache_age_bucket", "Lcom/anthropic/claude/analytics/events/OfflineEvents$OfflineErrorKind;", "getError_kind", "getSync_duration_ms", "getEventName", "eventName", "Companion", "bcc", "ccc", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class OfflineEvents$ScreenResolved implements AnalyticsEvent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final ccc Companion = new ccc();
    private final OfflineEvents$CacheAgeBucket cache_age_bucket;
    private final long cache_age_ms;
    private final long cached_at_ms;
    private final int cached_count;
    private final OfflineEvents$OfflineErrorKind error_kind;
    private final boolean is_connectivity_failure;
    private final boolean is_first_load;
    private final OfflineEvents$ScreenResolvedOutcome outcome;
    private final OfflineEvents$OfflineScreen screen;
    private final long sync_duration_ms;

    static {
        e2c e2cVar = new e2c(15);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{yb5.w(w1aVar, e2cVar), yb5.w(w1aVar, new e2c(16)), null, null, null, null, yb5.w(w1aVar, new e2c(17)), null, yb5.w(w1aVar, new e2c(18)), null};
    }

    public /* synthetic */ OfflineEvents$ScreenResolved(int i, OfflineEvents$OfflineScreen offlineEvents$OfflineScreen, OfflineEvents$ScreenResolvedOutcome offlineEvents$ScreenResolvedOutcome, boolean z, int i2, long j, long j2, OfflineEvents$CacheAgeBucket offlineEvents$CacheAgeBucket, boolean z2, OfflineEvents$OfflineErrorKind offlineEvents$OfflineErrorKind, long j3, vnf vnfVar) {
        if (1023 != (i & 1023)) {
            gvj.f(i, 1023, bcc.a.getDescriptor());
            throw null;
        }
        this.screen = offlineEvents$OfflineScreen;
        this.outcome = offlineEvents$ScreenResolvedOutcome;
        this.is_first_load = z;
        this.cached_count = i2;
        this.cached_at_ms = j;
        this.cache_age_ms = j2;
        this.cache_age_bucket = offlineEvents$CacheAgeBucket;
        this.is_connectivity_failure = z2;
        this.error_kind = offlineEvents$OfflineErrorKind;
        this.sync_duration_ms = j3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return OfflineEvents$OfflineScreen.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return OfflineEvents$ScreenResolvedOutcome.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return OfflineEvents$CacheAgeBucket.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return OfflineEvents$OfflineErrorKind.Companion.serializer();
    }

    public static final /* synthetic */ void write$Self$analytics(OfflineEvents$ScreenResolved self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.screen);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.outcome);
        output.p(serialDesc, 2, self.is_first_load);
        output.l(3, self.cached_count, serialDesc);
        output.D(serialDesc, 4, self.cached_at_ms);
        output.D(serialDesc, 5, self.cache_age_ms);
        output.r(serialDesc, 6, (znf) kw9VarArr[6].getValue(), self.cache_age_bucket);
        output.p(serialDesc, 7, self.is_connectivity_failure);
        output.r(serialDesc, 8, (znf) kw9VarArr[8].getValue(), self.error_kind);
        output.D(serialDesc, 9, self.sync_duration_ms);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OfflineEvents$OfflineScreen getScreen() {
        return this.screen;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getSync_duration_ms() {
        return this.sync_duration_ms;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OfflineEvents$ScreenResolvedOutcome getOutcome() {
        return this.outcome;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIs_first_load() {
        return this.is_first_load;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCached_count() {
        return this.cached_count;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getCached_at_ms() {
        return this.cached_at_ms;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getCache_age_ms() {
        return this.cache_age_ms;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final OfflineEvents$CacheAgeBucket getCache_age_bucket() {
        return this.cache_age_bucket;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIs_connectivity_failure() {
        return this.is_connectivity_failure;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final OfflineEvents$OfflineErrorKind getError_kind() {
        return this.error_kind;
    }

    public final OfflineEvents$ScreenResolved copy(OfflineEvents$OfflineScreen screen, OfflineEvents$ScreenResolvedOutcome outcome, boolean is_first_load, int cached_count, long cached_at_ms, long cache_age_ms, OfflineEvents$CacheAgeBucket cache_age_bucket, boolean is_connectivity_failure, OfflineEvents$OfflineErrorKind error_kind, long sync_duration_ms) {
        screen.getClass();
        outcome.getClass();
        cache_age_bucket.getClass();
        error_kind.getClass();
        return new OfflineEvents$ScreenResolved(screen, outcome, is_first_load, cached_count, cached_at_ms, cache_age_ms, cache_age_bucket, is_connectivity_failure, error_kind, sync_duration_ms);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfflineEvents$ScreenResolved)) {
            return false;
        }
        OfflineEvents$ScreenResolved offlineEvents$ScreenResolved = (OfflineEvents$ScreenResolved) other;
        return this.screen == offlineEvents$ScreenResolved.screen && this.outcome == offlineEvents$ScreenResolved.outcome && this.is_first_load == offlineEvents$ScreenResolved.is_first_load && this.cached_count == offlineEvents$ScreenResolved.cached_count && this.cached_at_ms == offlineEvents$ScreenResolved.cached_at_ms && this.cache_age_ms == offlineEvents$ScreenResolved.cache_age_ms && this.cache_age_bucket == offlineEvents$ScreenResolved.cache_age_bucket && this.is_connectivity_failure == offlineEvents$ScreenResolved.is_connectivity_failure && this.error_kind == offlineEvents$ScreenResolved.error_kind && this.sync_duration_ms == offlineEvents$ScreenResolved.sync_duration_ms;
    }

    public final OfflineEvents$CacheAgeBucket getCache_age_bucket() {
        return this.cache_age_bucket;
    }

    public final long getCache_age_ms() {
        return this.cache_age_ms;
    }

    public final long getCached_at_ms() {
        return this.cached_at_ms;
    }

    public final int getCached_count() {
        return this.cached_count;
    }

    public final OfflineEvents$OfflineErrorKind getError_kind() {
        return this.error_kind;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.offline.screen.resolved";
    }

    public final OfflineEvents$ScreenResolvedOutcome getOutcome() {
        return this.outcome;
    }

    public final OfflineEvents$OfflineScreen getScreen() {
        return this.screen;
    }

    public final long getSync_duration_ms() {
        return this.sync_duration_ms;
    }

    public int hashCode() {
        return Long.hashCode(this.sync_duration_ms) + ((this.error_kind.hashCode() + fsh.p((this.cache_age_bucket.hashCode() + vb7.e(vb7.e(vb7.c(this.cached_count, fsh.p((this.outcome.hashCode() + (this.screen.hashCode() * 31)) * 31, 31, this.is_first_load), 31), 31, this.cached_at_ms), 31, this.cache_age_ms)) * 31, 31, this.is_connectivity_failure)) * 31);
    }

    public final boolean is_connectivity_failure() {
        return this.is_connectivity_failure;
    }

    public final boolean is_first_load() {
        return this.is_first_load;
    }

    public String toString() {
        OfflineEvents$OfflineScreen offlineEvents$OfflineScreen = this.screen;
        OfflineEvents$ScreenResolvedOutcome offlineEvents$ScreenResolvedOutcome = this.outcome;
        boolean z = this.is_first_load;
        int i = this.cached_count;
        long j = this.cached_at_ms;
        long j2 = this.cache_age_ms;
        OfflineEvents$CacheAgeBucket offlineEvents$CacheAgeBucket = this.cache_age_bucket;
        boolean z2 = this.is_connectivity_failure;
        OfflineEvents$OfflineErrorKind offlineEvents$OfflineErrorKind = this.error_kind;
        long j3 = this.sync_duration_ms;
        StringBuilder sb = new StringBuilder("ScreenResolved(screen=");
        sb.append(offlineEvents$OfflineScreen);
        sb.append(", outcome=");
        sb.append(offlineEvents$ScreenResolvedOutcome);
        sb.append(", is_first_load=");
        sb.append(z);
        sb.append(", cached_count=");
        sb.append(i);
        sb.append(", cached_at_ms=");
        sb.append(j);
        ij0.u(j2, ", cache_age_ms=", ", cache_age_bucket=", sb);
        sb.append(offlineEvents$CacheAgeBucket);
        sb.append(", is_connectivity_failure=");
        sb.append(z2);
        sb.append(", error_kind=");
        sb.append(offlineEvents$OfflineErrorKind);
        sb.append(", sync_duration_ms=");
        sb.append(j3);
        sb.append(")");
        return sb.toString();
    }

    public OfflineEvents$ScreenResolved(OfflineEvents$OfflineScreen offlineEvents$OfflineScreen, OfflineEvents$ScreenResolvedOutcome offlineEvents$ScreenResolvedOutcome, boolean z, int i, long j, long j2, OfflineEvents$CacheAgeBucket offlineEvents$CacheAgeBucket, boolean z2, OfflineEvents$OfflineErrorKind offlineEvents$OfflineErrorKind, long j3) {
        offlineEvents$OfflineScreen.getClass();
        offlineEvents$ScreenResolvedOutcome.getClass();
        offlineEvents$CacheAgeBucket.getClass();
        offlineEvents$OfflineErrorKind.getClass();
        this.screen = offlineEvents$OfflineScreen;
        this.outcome = offlineEvents$ScreenResolvedOutcome;
        this.is_first_load = z;
        this.cached_count = i;
        this.cached_at_ms = j;
        this.cache_age_ms = j2;
        this.cache_age_bucket = offlineEvents$CacheAgeBucket;
        this.is_connectivity_failure = z2;
        this.error_kind = offlineEvents$OfflineErrorKind;
        this.sync_duration_ms = j3;
    }
}
