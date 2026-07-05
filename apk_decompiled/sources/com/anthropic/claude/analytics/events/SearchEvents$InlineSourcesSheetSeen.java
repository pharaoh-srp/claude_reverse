package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.ucf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.xdf;
import defpackage.yb5;
import defpackage.ydf;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b!\u0010\u001dJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001dR\u0014\u0010.\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0019¨\u00062"}, d2 = {"com/anthropic/claude/analytics/events/SearchEvents$InlineSourcesSheetSeen", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "Lcom/anthropic/claude/analytics/events/SearchEvents$SearchType;", "search_type", "", "sources_count", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/analytics/events/SearchEvents$SearchType;I)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/analytics/events/SearchEvents$SearchType;ILvnf;)V", "Lcom/anthropic/claude/analytics/events/SearchEvents$InlineSourcesSheetSeen;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/SearchEvents$InlineSourcesSheetSeen;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/analytics/events/SearchEvents$SearchType;", "component3", "()I", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/analytics/events/SearchEvents$SearchType;I)Lcom/anthropic/claude/analytics/events/SearchEvents$InlineSourcesSheetSeen;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "Lcom/anthropic/claude/analytics/events/SearchEvents$SearchType;", "getSearch_type", "I", "getSources_count", "getEventName", "eventName", "Companion", "xdf", "ydf", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SearchEvents$InlineSourcesSheetSeen implements AnalyticsEvent {
    public static final int $stable = 0;
    private final String organization_uuid;
    private final SearchEvents$SearchType search_type;
    private final int sources_count;
    public static final ydf Companion = new ydf();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new ucf(2)), null};

    public /* synthetic */ SearchEvents$InlineSourcesSheetSeen(int i, String str, SearchEvents$SearchType searchEvents$SearchType, int i2, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, xdf.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.search_type = searchEvents$SearchType;
        this.sources_count = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return SearchEvents$SearchType.Companion.serializer();
    }

    public static /* synthetic */ SearchEvents$InlineSourcesSheetSeen copy$default(SearchEvents$InlineSourcesSheetSeen searchEvents$InlineSourcesSheetSeen, String str, SearchEvents$SearchType searchEvents$SearchType, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = searchEvents$InlineSourcesSheetSeen.organization_uuid;
        }
        if ((i2 & 2) != 0) {
            searchEvents$SearchType = searchEvents$InlineSourcesSheetSeen.search_type;
        }
        if ((i2 & 4) != 0) {
            i = searchEvents$InlineSourcesSheetSeen.sources_count;
        }
        return searchEvents$InlineSourcesSheetSeen.copy(str, searchEvents$SearchType, i);
    }

    public static final /* synthetic */ void write$Self$analytics(SearchEvents$InlineSourcesSheetSeen self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.search_type);
        output.l(2, self.sources_count, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SearchEvents$SearchType getSearch_type() {
        return this.search_type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSources_count() {
        return this.sources_count;
    }

    public final SearchEvents$InlineSourcesSheetSeen copy(String organization_uuid, SearchEvents$SearchType search_type, int sources_count) {
        organization_uuid.getClass();
        search_type.getClass();
        return new SearchEvents$InlineSourcesSheetSeen(organization_uuid, search_type, sources_count);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchEvents$InlineSourcesSheetSeen)) {
            return false;
        }
        SearchEvents$InlineSourcesSheetSeen searchEvents$InlineSourcesSheetSeen = (SearchEvents$InlineSourcesSheetSeen) other;
        return x44.r(this.organization_uuid, searchEvents$InlineSourcesSheetSeen.organization_uuid) && this.search_type == searchEvents$InlineSourcesSheetSeen.search_type && this.sources_count == searchEvents$InlineSourcesSheetSeen.sources_count;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_inline_sources_sheet_viewed";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final SearchEvents$SearchType getSearch_type() {
        return this.search_type;
    }

    public final int getSources_count() {
        return this.sources_count;
    }

    public int hashCode() {
        return Integer.hashCode(this.sources_count) + ((this.search_type.hashCode() + (this.organization_uuid.hashCode() * 31)) * 31);
    }

    public String toString() {
        String str = this.organization_uuid;
        SearchEvents$SearchType searchEvents$SearchType = this.search_type;
        int i = this.sources_count;
        StringBuilder sb = new StringBuilder("InlineSourcesSheetSeen(organization_uuid=");
        sb.append(str);
        sb.append(", search_type=");
        sb.append(searchEvents$SearchType);
        sb.append(", sources_count=");
        return vb7.l(i, ")", sb);
    }

    public SearchEvents$InlineSourcesSheetSeen(String str, SearchEvents$SearchType searchEvents$SearchType, int i) {
        str.getClass();
        searchEvents$SearchType.getClass();
        this.organization_uuid = str;
        this.search_type = searchEvents$SearchType;
        this.sources_count = i;
    }
}
