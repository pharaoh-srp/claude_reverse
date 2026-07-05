package com.anthropic.claude.analytics.events;

import defpackage.b5;
import defpackage.bd0;
import defpackage.cd0;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.xka;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001aR\u0014\u0010,\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u001f¨\u00060"}, d2 = {"com/anthropic/claude/analytics/events/AnonymousEvents$AccountCreationFailed", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "Lcom/anthropic/claude/analytics/events/AnonymousEvents$AccountCreationErrorSource;", "error_source", "", "elapsed_time_ms", "<init>", "(Lcom/anthropic/claude/analytics/events/AnonymousEvents$AccountCreationErrorSource;Ljava/lang/Long;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/analytics/events/AnonymousEvents$AccountCreationErrorSource;Ljava/lang/Long;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/AnonymousEvents$AccountCreationFailed;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/AnonymousEvents$AccountCreationFailed;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/analytics/events/AnonymousEvents$AccountCreationErrorSource;", "component2", "()Ljava/lang/Long;", "copy", "(Lcom/anthropic/claude/analytics/events/AnonymousEvents$AccountCreationErrorSource;Ljava/lang/Long;)Lcom/anthropic/claude/analytics/events/AnonymousEvents$AccountCreationFailed;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/analytics/events/AnonymousEvents$AccountCreationErrorSource;", "getError_source", "Ljava/lang/Long;", "getElapsed_time_ms", "getEventName", "eventName", "Companion", "bd0", "cd0", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class AnonymousEvents$AccountCreationFailed implements AnalyticsEvent {
    public static final int $stable = 0;
    private final Long elapsed_time_ms;
    private final AnonymousEvents$AccountCreationErrorSource error_source;
    public static final cd0 Companion = new cd0();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new b5(20)), null};

    public /* synthetic */ AnonymousEvents$AccountCreationFailed(int i, AnonymousEvents$AccountCreationErrorSource anonymousEvents$AccountCreationErrorSource, Long l, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, bd0.a.getDescriptor());
            throw null;
        }
        this.error_source = anonymousEvents$AccountCreationErrorSource;
        if ((i & 2) == 0) {
            this.elapsed_time_ms = null;
        } else {
            this.elapsed_time_ms = l;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return AnonymousEvents$AccountCreationErrorSource.Companion.serializer();
    }

    public static /* synthetic */ AnonymousEvents$AccountCreationFailed copy$default(AnonymousEvents$AccountCreationFailed anonymousEvents$AccountCreationFailed, AnonymousEvents$AccountCreationErrorSource anonymousEvents$AccountCreationErrorSource, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            anonymousEvents$AccountCreationErrorSource = anonymousEvents$AccountCreationFailed.error_source;
        }
        if ((i & 2) != 0) {
            l = anonymousEvents$AccountCreationFailed.elapsed_time_ms;
        }
        return anonymousEvents$AccountCreationFailed.copy(anonymousEvents$AccountCreationErrorSource, l);
    }

    public static final /* synthetic */ void write$Self$analytics(AnonymousEvents$AccountCreationFailed self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.error_source);
        if (!output.E(serialDesc) && self.elapsed_time_ms == null) {
            return;
        }
        output.B(serialDesc, 1, xka.a, self.elapsed_time_ms);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AnonymousEvents$AccountCreationErrorSource getError_source() {
        return this.error_source;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getElapsed_time_ms() {
        return this.elapsed_time_ms;
    }

    public final AnonymousEvents$AccountCreationFailed copy(AnonymousEvents$AccountCreationErrorSource error_source, Long elapsed_time_ms) {
        error_source.getClass();
        return new AnonymousEvents$AccountCreationFailed(error_source, elapsed_time_ms);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnonymousEvents$AccountCreationFailed)) {
            return false;
        }
        AnonymousEvents$AccountCreationFailed anonymousEvents$AccountCreationFailed = (AnonymousEvents$AccountCreationFailed) other;
        return this.error_source == anonymousEvents$AccountCreationFailed.error_source && x44.r(this.elapsed_time_ms, anonymousEvents$AccountCreationFailed.elapsed_time_ms);
    }

    public final Long getElapsed_time_ms() {
        return this.elapsed_time_ms;
    }

    public final AnonymousEvents$AccountCreationErrorSource getError_source() {
        return this.error_source;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile.anonymous.account_creation.failed";
    }

    public int hashCode() {
        int iHashCode = this.error_source.hashCode() * 31;
        Long l = this.elapsed_time_ms;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        return "AccountCreationFailed(error_source=" + this.error_source + ", elapsed_time_ms=" + this.elapsed_time_ms + ")";
    }

    public AnonymousEvents$AccountCreationFailed(AnonymousEvents$AccountCreationErrorSource anonymousEvents$AccountCreationErrorSource, Long l) {
        anonymousEvents$AccountCreationErrorSource.getClass();
        this.error_source = anonymousEvents$AccountCreationErrorSource;
        this.elapsed_time_ms = l;
    }

    public /* synthetic */ AnonymousEvents$AccountCreationFailed(AnonymousEvents$AccountCreationErrorSource anonymousEvents$AccountCreationErrorSource, Long l, int i, mq5 mq5Var) {
        this(anonymousEvents$AccountCreationErrorSource, (i & 2) != 0 ? null : l);
    }
}
