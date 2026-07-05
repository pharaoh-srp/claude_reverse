package com.anthropic.claude.analytics.events;

import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.tli;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u00020\u000b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0014\u0010$\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0016¨\u0006("}, d2 = {"com/anthropic/claude/analytics/events/UsageCreditsEvents$CreditsUpsellShown", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "surface", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/UsageCreditsEvents$CreditsUpsellShown;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/UsageCreditsEvents$CreditsUpsellShown;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/UsageCreditsEvents$CreditsUpsellShown;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSurface", "getEventName", "eventName", "Companion", "sli", "tli", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class UsageCreditsEvents$CreditsUpsellShown implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final tli Companion = new tli();
    private final String surface;

    public /* synthetic */ UsageCreditsEvents$CreditsUpsellShown(int i, String str, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.surface = null;
        } else {
            this.surface = str;
        }
    }

    public static /* synthetic */ UsageCreditsEvents$CreditsUpsellShown copy$default(UsageCreditsEvents$CreditsUpsellShown usageCreditsEvents$CreditsUpsellShown, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = usageCreditsEvents$CreditsUpsellShown.surface;
        }
        return usageCreditsEvents$CreditsUpsellShown.copy(str);
    }

    public static final /* synthetic */ void write$Self$analytics(UsageCreditsEvents$CreditsUpsellShown self, vd4 output, SerialDescriptor serialDesc) {
        if (!output.E(serialDesc) && self.surface == null) {
            return;
        }
        output.B(serialDesc, 0, srg.a, self.surface);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSurface() {
        return this.surface;
    }

    public final UsageCreditsEvents$CreditsUpsellShown copy(String surface) {
        return new UsageCreditsEvents$CreditsUpsellShown(surface);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UsageCreditsEvents$CreditsUpsellShown) && x44.r(this.surface, ((UsageCreditsEvents$CreditsUpsellShown) other).surface);
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "credits_upsell_shown";
    }

    public final String getSurface() {
        return this.surface;
    }

    public int hashCode() {
        String str = this.surface;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return ij0.j("CreditsUpsellShown(surface=", this.surface, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UsageCreditsEvents$CreditsUpsellShown() {
        this((String) null, 1, (mq5) (0 == true ? 1 : 0));
    }

    public UsageCreditsEvents$CreditsUpsellShown(String str) {
        this.surface = str;
    }

    public /* synthetic */ UsageCreditsEvents$CreditsUpsellShown(String str, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str);
    }
}
