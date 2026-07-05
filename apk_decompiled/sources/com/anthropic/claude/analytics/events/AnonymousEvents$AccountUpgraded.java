package com.anthropic.claude.analytics.events;

import defpackage.fd0;
import defpackage.gd0;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J$\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0017R\u0014\u0010'\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0017¨\u0006+"}, d2 = {"com/anthropic/claude/analytics/events/AnonymousEvents$AccountUpgraded", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "source", "variant", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/AnonymousEvents$AccountUpgraded;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/AnonymousEvents$AccountUpgraded;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/AnonymousEvents$AccountUpgraded;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSource", "getVariant", "getEventName", "eventName", "Companion", "fd0", "gd0", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class AnonymousEvents$AccountUpgraded implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final gd0 Companion = new gd0();
    private final String source;
    private final String variant;

    public /* synthetic */ AnonymousEvents$AccountUpgraded(int i, String str, String str2, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, fd0.a.getDescriptor());
            throw null;
        }
        this.source = str;
        this.variant = str2;
    }

    public static /* synthetic */ AnonymousEvents$AccountUpgraded copy$default(AnonymousEvents$AccountUpgraded anonymousEvents$AccountUpgraded, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = anonymousEvents$AccountUpgraded.source;
        }
        if ((i & 2) != 0) {
            str2 = anonymousEvents$AccountUpgraded.variant;
        }
        return anonymousEvents$AccountUpgraded.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$analytics(AnonymousEvents$AccountUpgraded self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.source);
        output.q(serialDesc, 1, self.variant);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVariant() {
        return this.variant;
    }

    public final AnonymousEvents$AccountUpgraded copy(String source, String variant) {
        source.getClass();
        variant.getClass();
        return new AnonymousEvents$AccountUpgraded(source, variant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnonymousEvents$AccountUpgraded)) {
            return false;
        }
        AnonymousEvents$AccountUpgraded anonymousEvents$AccountUpgraded = (AnonymousEvents$AccountUpgraded) other;
        return x44.r(this.source, anonymousEvents$AccountUpgraded.source) && x44.r(this.variant, anonymousEvents$AccountUpgraded.variant);
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile.anonymous.upsell.converted";
    }

    public final String getSource() {
        return this.source;
    }

    public final String getVariant() {
        return this.variant;
    }

    public int hashCode() {
        return this.variant.hashCode() + (this.source.hashCode() * 31);
    }

    public String toString() {
        return ij0.l("AccountUpgraded(source=", this.source, ", variant=", this.variant, ")");
    }

    public AnonymousEvents$AccountUpgraded(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.source = str;
        this.variant = str2;
    }
}
