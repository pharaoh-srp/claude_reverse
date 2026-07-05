package com.anthropic.claude.analytics.events;

import defpackage.ed0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.xka;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u00020\u000b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0014\u0010&\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001b¨\u0006*"}, d2 = {"com/anthropic/claude/analytics/events/AnonymousEvents$AccountCreationSucceeded", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "elapsed_time_ms", "<init>", "(Ljava/lang/Long;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Long;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/AnonymousEvents$AccountCreationSucceeded;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/AnonymousEvents$AccountCreationSucceeded;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Long;", "copy", "(Ljava/lang/Long;)Lcom/anthropic/claude/analytics/events/AnonymousEvents$AccountCreationSucceeded;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getElapsed_time_ms", "getEventName", "eventName", "Companion", "dd0", "ed0", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class AnonymousEvents$AccountCreationSucceeded implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final ed0 Companion = new ed0();
    private final Long elapsed_time_ms;

    public /* synthetic */ AnonymousEvents$AccountCreationSucceeded(int i, Long l, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.elapsed_time_ms = null;
        } else {
            this.elapsed_time_ms = l;
        }
    }

    public static /* synthetic */ AnonymousEvents$AccountCreationSucceeded copy$default(AnonymousEvents$AccountCreationSucceeded anonymousEvents$AccountCreationSucceeded, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = anonymousEvents$AccountCreationSucceeded.elapsed_time_ms;
        }
        return anonymousEvents$AccountCreationSucceeded.copy(l);
    }

    public static final /* synthetic */ void write$Self$analytics(AnonymousEvents$AccountCreationSucceeded self, vd4 output, SerialDescriptor serialDesc) {
        if (!output.E(serialDesc) && self.elapsed_time_ms == null) {
            return;
        }
        output.B(serialDesc, 0, xka.a, self.elapsed_time_ms);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getElapsed_time_ms() {
        return this.elapsed_time_ms;
    }

    public final AnonymousEvents$AccountCreationSucceeded copy(Long elapsed_time_ms) {
        return new AnonymousEvents$AccountCreationSucceeded(elapsed_time_ms);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AnonymousEvents$AccountCreationSucceeded) && x44.r(this.elapsed_time_ms, ((AnonymousEvents$AccountCreationSucceeded) other).elapsed_time_ms);
    }

    public final Long getElapsed_time_ms() {
        return this.elapsed_time_ms;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile.anonymous.account_creation.succeeded";
    }

    public int hashCode() {
        Long l = this.elapsed_time_ms;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public String toString() {
        return "AccountCreationSucceeded(elapsed_time_ms=" + this.elapsed_time_ms + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnonymousEvents$AccountCreationSucceeded() {
        this((Long) null, 1, (mq5) (0 == true ? 1 : 0));
    }

    public AnonymousEvents$AccountCreationSucceeded(Long l) {
        this.elapsed_time_ms = l;
    }

    public /* synthetic */ AnonymousEvents$AccountCreationSucceeded(Long l, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : l);
    }
}
