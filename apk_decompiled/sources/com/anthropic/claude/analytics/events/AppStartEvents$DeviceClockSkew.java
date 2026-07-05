package com.anthropic.claude.analytics.events;

import defpackage.el0;
import defpackage.fl0;
import defpackage.grc;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J$\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0017R\u0014\u0010)\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u001d¨\u0006-"}, d2 = {"com/anthropic/claude/analytics/events/AppStartEvents$DeviceClockSkew", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "offset_ms", "round_trip_ms", "<init>", "(JJ)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IJJLvnf;)V", "Lcom/anthropic/claude/analytics/events/AppStartEvents$DeviceClockSkew;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/AppStartEvents$DeviceClockSkew;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "copy", "(JJ)Lcom/anthropic/claude/analytics/events/AppStartEvents$DeviceClockSkew;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getOffset_ms", "getRound_trip_ms", "getEventName", "eventName", "Companion", "el0", "fl0", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class AppStartEvents$DeviceClockSkew implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final fl0 Companion = new fl0();
    private final long offset_ms;
    private final long round_trip_ms;

    public /* synthetic */ AppStartEvents$DeviceClockSkew(int i, long j, long j2, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, el0.a.getDescriptor());
            throw null;
        }
        this.offset_ms = j;
        this.round_trip_ms = j2;
    }

    public static /* synthetic */ AppStartEvents$DeviceClockSkew copy$default(AppStartEvents$DeviceClockSkew appStartEvents$DeviceClockSkew, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = appStartEvents$DeviceClockSkew.offset_ms;
        }
        if ((i & 2) != 0) {
            j2 = appStartEvents$DeviceClockSkew.round_trip_ms;
        }
        return appStartEvents$DeviceClockSkew.copy(j, j2);
    }

    public static final /* synthetic */ void write$Self$analytics(AppStartEvents$DeviceClockSkew self, vd4 output, SerialDescriptor serialDesc) {
        output.D(serialDesc, 0, self.offset_ms);
        output.D(serialDesc, 1, self.round_trip_ms);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getOffset_ms() {
        return this.offset_ms;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getRound_trip_ms() {
        return this.round_trip_ms;
    }

    public final AppStartEvents$DeviceClockSkew copy(long offset_ms, long round_trip_ms) {
        return new AppStartEvents$DeviceClockSkew(offset_ms, round_trip_ms);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppStartEvents$DeviceClockSkew)) {
            return false;
        }
        AppStartEvents$DeviceClockSkew appStartEvents$DeviceClockSkew = (AppStartEvents$DeviceClockSkew) other;
        return this.offset_ms == appStartEvents$DeviceClockSkew.offset_ms && this.round_trip_ms == appStartEvents$DeviceClockSkew.round_trip_ms;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile.app_start.device_clock_skew";
    }

    public final long getOffset_ms() {
        return this.offset_ms;
    }

    public final long getRound_trip_ms() {
        return this.round_trip_ms;
    }

    public int hashCode() {
        return Long.hashCode(this.round_trip_ms) + (Long.hashCode(this.offset_ms) * 31);
    }

    public String toString() {
        return grc.r(this.round_trip_ms, ")", grc.w(this.offset_ms, "DeviceClockSkew(offset_ms=", ", round_trip_ms="));
    }

    public AppStartEvents$DeviceClockSkew(long j, long j2) {
        this.offset_ms = j;
        this.round_trip_ms = j2;
    }
}
