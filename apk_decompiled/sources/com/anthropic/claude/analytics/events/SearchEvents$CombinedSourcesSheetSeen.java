package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.onf;
import defpackage.rdf;
import defpackage.sdf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ.\u0010\u001c\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b)\u0010\u001aR\u0014\u0010+\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0018¨\u0006/"}, d2 = {"com/anthropic/claude/analytics/events/SearchEvents$CombinedSourcesSheetSeen", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "", "citations_count", "more_count", "<init>", "(Ljava/lang/String;II)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;IILvnf;)V", "Lcom/anthropic/claude/analytics/events/SearchEvents$CombinedSourcesSheetSeen;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/SearchEvents$CombinedSourcesSheetSeen;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "copy", "(Ljava/lang/String;II)Lcom/anthropic/claude/analytics/events/SearchEvents$CombinedSourcesSheetSeen;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "I", "getCitations_count", "getMore_count", "getEventName", "eventName", "Companion", "rdf", "sdf", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SearchEvents$CombinedSourcesSheetSeen implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final sdf Companion = new sdf();
    private final int citations_count;
    private final int more_count;
    private final String organization_uuid;

    public /* synthetic */ SearchEvents$CombinedSourcesSheetSeen(int i, String str, int i2, int i3, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, rdf.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.citations_count = i2;
        this.more_count = i3;
    }

    public static /* synthetic */ SearchEvents$CombinedSourcesSheetSeen copy$default(SearchEvents$CombinedSourcesSheetSeen searchEvents$CombinedSourcesSheetSeen, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = searchEvents$CombinedSourcesSheetSeen.organization_uuid;
        }
        if ((i3 & 2) != 0) {
            i = searchEvents$CombinedSourcesSheetSeen.citations_count;
        }
        if ((i3 & 4) != 0) {
            i2 = searchEvents$CombinedSourcesSheetSeen.more_count;
        }
        return searchEvents$CombinedSourcesSheetSeen.copy(str, i, i2);
    }

    public static final /* synthetic */ void write$Self$analytics(SearchEvents$CombinedSourcesSheetSeen self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        output.l(1, self.citations_count, serialDesc);
        output.l(2, self.more_count, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCitations_count() {
        return this.citations_count;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMore_count() {
        return this.more_count;
    }

    public final SearchEvents$CombinedSourcesSheetSeen copy(String organization_uuid, int citations_count, int more_count) {
        organization_uuid.getClass();
        return new SearchEvents$CombinedSourcesSheetSeen(organization_uuid, citations_count, more_count);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchEvents$CombinedSourcesSheetSeen)) {
            return false;
        }
        SearchEvents$CombinedSourcesSheetSeen searchEvents$CombinedSourcesSheetSeen = (SearchEvents$CombinedSourcesSheetSeen) other;
        return x44.r(this.organization_uuid, searchEvents$CombinedSourcesSheetSeen.organization_uuid) && this.citations_count == searchEvents$CombinedSourcesSheetSeen.citations_count && this.more_count == searchEvents$CombinedSourcesSheetSeen.more_count;
    }

    public final int getCitations_count() {
        return this.citations_count;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_combined_sources_sheet_viewed";
    }

    public final int getMore_count() {
        return this.more_count;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public int hashCode() {
        return Integer.hashCode(this.more_count) + vb7.c(this.citations_count, this.organization_uuid.hashCode() * 31, 31);
    }

    public String toString() {
        return vb7.l(this.more_count, ")", ij0.p("CombinedSourcesSheetSeen(organization_uuid=", this.organization_uuid, this.citations_count, ", citations_count=", ", more_count="));
    }

    public SearchEvents$CombinedSourcesSheetSeen(String str, int i, int i2) {
        str.getClass();
        this.organization_uuid = str;
        this.citations_count = i;
        this.more_count = i2;
    }
}
