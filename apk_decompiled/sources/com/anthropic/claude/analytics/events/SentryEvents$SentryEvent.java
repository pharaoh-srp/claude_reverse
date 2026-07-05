package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mmf;
import defpackage.mq5;
import defpackage.nmf;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ<\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b\u0007\u0010\u001eR\u0014\u0010.\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u001a¨\u00062"}, d2 = {"com/anthropic/claude/analytics/events/SentryEvents$SentryEvent", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "level", "type", "message", "", "is_main_thread_hang", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLvnf;)V", "Lcom/anthropic/claude/analytics/events/SentryEvents$SentryEvent;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/SentryEvents$SentryEvent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/anthropic/claude/analytics/events/SentryEvents$SentryEvent;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLevel", "getType", "getMessage", "Z", "getEventName", "eventName", "Companion", "mmf", "nmf", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SentryEvents$SentryEvent implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final nmf Companion = new nmf();
    private final boolean is_main_thread_hang;
    private final String level;
    private final String message;
    private final String type;

    public /* synthetic */ SentryEvents$SentryEvent(int i, String str, String str2, String str3, boolean z, vnf vnfVar) {
        if (9 != (i & 9)) {
            gvj.f(i, 9, mmf.a.getDescriptor());
            throw null;
        }
        this.level = str;
        if ((i & 2) == 0) {
            this.type = null;
        } else {
            this.type = str2;
        }
        if ((i & 4) == 0) {
            this.message = null;
        } else {
            this.message = str3;
        }
        this.is_main_thread_hang = z;
    }

    public static /* synthetic */ SentryEvents$SentryEvent copy$default(SentryEvents$SentryEvent sentryEvents$SentryEvent, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sentryEvents$SentryEvent.level;
        }
        if ((i & 2) != 0) {
            str2 = sentryEvents$SentryEvent.type;
        }
        if ((i & 4) != 0) {
            str3 = sentryEvents$SentryEvent.message;
        }
        if ((i & 8) != 0) {
            z = sentryEvents$SentryEvent.is_main_thread_hang;
        }
        return sentryEvents$SentryEvent.copy(str, str2, str3, z);
    }

    public static final /* synthetic */ void write$Self$analytics(SentryEvents$SentryEvent self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.level);
        if (output.E(serialDesc) || self.type != null) {
            output.B(serialDesc, 1, srg.a, self.type);
        }
        if (output.E(serialDesc) || self.message != null) {
            output.B(serialDesc, 2, srg.a, self.message);
        }
        output.p(serialDesc, 3, self.is_main_thread_hang);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIs_main_thread_hang() {
        return this.is_main_thread_hang;
    }

    public final SentryEvents$SentryEvent copy(String level, String type, String message, boolean is_main_thread_hang) {
        level.getClass();
        return new SentryEvents$SentryEvent(level, type, message, is_main_thread_hang);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SentryEvents$SentryEvent)) {
            return false;
        }
        SentryEvents$SentryEvent sentryEvents$SentryEvent = (SentryEvents$SentryEvent) other;
        return x44.r(this.level, sentryEvents$SentryEvent.level) && x44.r(this.type, sentryEvents$SentryEvent.type) && x44.r(this.message, sentryEvents$SentryEvent.message) && this.is_main_thread_hang == sentryEvents$SentryEvent.is_main_thread_hang;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile.sentry.event";
    }

    public final String getLevel() {
        return this.level;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.level.hashCode() * 31;
        String str = this.type;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        return Boolean.hashCode(this.is_main_thread_hang) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final boolean is_main_thread_hang() {
        return this.is_main_thread_hang;
    }

    public String toString() {
        String str = this.level;
        String str2 = this.type;
        String str3 = this.message;
        boolean z = this.is_main_thread_hang;
        StringBuilder sbR = kgh.r("SentryEvent(level=", str, ", type=", str2, ", message=");
        sbR.append(str3);
        sbR.append(", is_main_thread_hang=");
        sbR.append(z);
        sbR.append(")");
        return sbR.toString();
    }

    public SentryEvents$SentryEvent(String str, String str2, String str3, boolean z) {
        str.getClass();
        this.level = str;
        this.type = str2;
        this.message = str3;
        this.is_main_thread_hang = z;
    }

    public /* synthetic */ SentryEvents$SentryEvent(String str, String str2, String str3, boolean z, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, z);
    }
}
