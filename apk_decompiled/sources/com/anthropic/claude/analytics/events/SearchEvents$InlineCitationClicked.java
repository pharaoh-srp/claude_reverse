package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.ucf;
import defpackage.vd4;
import defpackage.vdf;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wdf;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001aR\u0014\u0010*\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0018¨\u0006."}, d2 = {"com/anthropic/claude/analytics/events/SearchEvents$InlineCitationClicked", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "Lcom/anthropic/claude/analytics/events/SearchEvents$SourceType;", "source_type", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/analytics/events/SearchEvents$SourceType;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/analytics/events/SearchEvents$SourceType;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/SearchEvents$InlineCitationClicked;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/SearchEvents$InlineCitationClicked;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/analytics/events/SearchEvents$SourceType;", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/analytics/events/SearchEvents$SourceType;)Lcom/anthropic/claude/analytics/events/SearchEvents$InlineCitationClicked;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "Lcom/anthropic/claude/analytics/events/SearchEvents$SourceType;", "getSource_type", "getEventName", "eventName", "Companion", "vdf", "wdf", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SearchEvents$InlineCitationClicked implements AnalyticsEvent {
    public static final int $stable = 0;
    private final String organization_uuid;
    private final SearchEvents$SourceType source_type;
    public static final wdf Companion = new wdf();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new ucf(1))};

    public /* synthetic */ SearchEvents$InlineCitationClicked(int i, String str, SearchEvents$SourceType searchEvents$SourceType, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, vdf.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.source_type = searchEvents$SourceType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return SearchEvents$SourceType.Companion.serializer();
    }

    public static /* synthetic */ SearchEvents$InlineCitationClicked copy$default(SearchEvents$InlineCitationClicked searchEvents$InlineCitationClicked, String str, SearchEvents$SourceType searchEvents$SourceType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchEvents$InlineCitationClicked.organization_uuid;
        }
        if ((i & 2) != 0) {
            searchEvents$SourceType = searchEvents$InlineCitationClicked.source_type;
        }
        return searchEvents$InlineCitationClicked.copy(str, searchEvents$SourceType);
    }

    public static final /* synthetic */ void write$Self$analytics(SearchEvents$InlineCitationClicked self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.source_type);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SearchEvents$SourceType getSource_type() {
        return this.source_type;
    }

    public final SearchEvents$InlineCitationClicked copy(String organization_uuid, SearchEvents$SourceType source_type) {
        organization_uuid.getClass();
        source_type.getClass();
        return new SearchEvents$InlineCitationClicked(organization_uuid, source_type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchEvents$InlineCitationClicked)) {
            return false;
        }
        SearchEvents$InlineCitationClicked searchEvents$InlineCitationClicked = (SearchEvents$InlineCitationClicked) other;
        return x44.r(this.organization_uuid, searchEvents$InlineCitationClicked.organization_uuid) && this.source_type == searchEvents$InlineCitationClicked.source_type;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_inline_citation_clicked";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final SearchEvents$SourceType getSource_type() {
        return this.source_type;
    }

    public int hashCode() {
        return this.source_type.hashCode() + (this.organization_uuid.hashCode() * 31);
    }

    public String toString() {
        return "InlineCitationClicked(organization_uuid=" + this.organization_uuid + ", source_type=" + this.source_type + ")";
    }

    public SearchEvents$InlineCitationClicked(String str, SearchEvents$SourceType searchEvents$SourceType) {
        str.getClass();
        searchEvents$SourceType.getClass();
        this.organization_uuid = str;
        this.source_type = searchEvents$SourceType;
    }
}
