package com.anthropic.claude.analytics.events;

import defpackage.ajf;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zif;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J&\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0017R\u0014\u0010'\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0017¨\u0006+"}, d2 = {"com/anthropic/claude/analytics/events/SelfHarmBannerEvents$SelfHarmBannerBrowseResources", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "message_id", "surface", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/SelfHarmBannerEvents$SelfHarmBannerBrowseResources;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/SelfHarmBannerEvents$SelfHarmBannerBrowseResources;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/SelfHarmBannerEvents$SelfHarmBannerBrowseResources;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage_id", "getSurface", "getEventName", "eventName", "Companion", "zif", "ajf", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SelfHarmBannerEvents$SelfHarmBannerBrowseResources implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final ajf Companion = new ajf();
    private final String message_id;
    private final String surface;

    public /* synthetic */ SelfHarmBannerEvents$SelfHarmBannerBrowseResources(int i, String str, String str2, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, zif.a.getDescriptor());
            throw null;
        }
        this.message_id = str;
        if ((i & 2) == 0) {
            this.surface = null;
        } else {
            this.surface = str2;
        }
    }

    public static /* synthetic */ SelfHarmBannerEvents$SelfHarmBannerBrowseResources copy$default(SelfHarmBannerEvents$SelfHarmBannerBrowseResources selfHarmBannerEvents$SelfHarmBannerBrowseResources, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selfHarmBannerEvents$SelfHarmBannerBrowseResources.message_id;
        }
        if ((i & 2) != 0) {
            str2 = selfHarmBannerEvents$SelfHarmBannerBrowseResources.surface;
        }
        return selfHarmBannerEvents$SelfHarmBannerBrowseResources.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$analytics(SelfHarmBannerEvents$SelfHarmBannerBrowseResources self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.message_id);
        if (!output.E(serialDesc) && self.surface == null) {
            return;
        }
        output.B(serialDesc, 1, srg.a, self.surface);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage_id() {
        return this.message_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSurface() {
        return this.surface;
    }

    public final SelfHarmBannerEvents$SelfHarmBannerBrowseResources copy(String message_id, String surface) {
        message_id.getClass();
        return new SelfHarmBannerEvents$SelfHarmBannerBrowseResources(message_id, surface);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelfHarmBannerEvents$SelfHarmBannerBrowseResources)) {
            return false;
        }
        SelfHarmBannerEvents$SelfHarmBannerBrowseResources selfHarmBannerEvents$SelfHarmBannerBrowseResources = (SelfHarmBannerEvents$SelfHarmBannerBrowseResources) other;
        return x44.r(this.message_id, selfHarmBannerEvents$SelfHarmBannerBrowseResources.message_id) && x44.r(this.surface, selfHarmBannerEvents$SelfHarmBannerBrowseResources.surface);
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "self_harm_banner_browse_resources";
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final String getSurface() {
        return this.surface;
    }

    public int hashCode() {
        int iHashCode = this.message_id.hashCode() * 31;
        String str = this.surface;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return ij0.l("SelfHarmBannerBrowseResources(message_id=", this.message_id, ", surface=", this.surface, ")");
    }

    public SelfHarmBannerEvents$SelfHarmBannerBrowseResources(String str, String str2) {
        str.getClass();
        this.message_id = str;
        this.surface = str2;
    }

    public /* synthetic */ SelfHarmBannerEvents$SelfHarmBannerBrowseResources(String str, String str2, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
