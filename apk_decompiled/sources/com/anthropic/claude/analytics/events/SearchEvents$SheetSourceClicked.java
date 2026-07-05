package com.anthropic.claude.analytics.events;

import defpackage.aef;
import defpackage.bef;
import defpackage.fsh;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.ucf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000267B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBA\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J8\u0010#\u001a\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b\u0007\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010\"R\u0014\u00104\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u001c¨\u00068"}, d2 = {"com/anthropic/claude/analytics/events/SearchEvents$SheetSourceClicked", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "Lcom/anthropic/claude/analytics/events/SearchEvents$SourceType;", "source_type", "", "is_citation", "Lcom/anthropic/claude/analytics/events/ScreenSource;", "screen_source", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/analytics/events/SearchEvents$SourceType;ZLcom/anthropic/claude/analytics/events/ScreenSource;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/analytics/events/SearchEvents$SourceType;ZLcom/anthropic/claude/analytics/events/ScreenSource;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/SearchEvents$SheetSourceClicked;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/SearchEvents$SheetSourceClicked;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/analytics/events/SearchEvents$SourceType;", "component3", "()Z", "component4", "()Lcom/anthropic/claude/analytics/events/ScreenSource;", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/analytics/events/SearchEvents$SourceType;ZLcom/anthropic/claude/analytics/events/ScreenSource;)Lcom/anthropic/claude/analytics/events/SearchEvents$SheetSourceClicked;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "Lcom/anthropic/claude/analytics/events/SearchEvents$SourceType;", "getSource_type", "Z", "Lcom/anthropic/claude/analytics/events/ScreenSource;", "getScreen_source", "getEventName", "eventName", "Companion", "aef", "bef", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SearchEvents$SheetSourceClicked implements AnalyticsEvent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final bef Companion = new bef();
    private final boolean is_citation;
    private final String organization_uuid;
    private final ScreenSource screen_source;
    private final SearchEvents$SourceType source_type;

    static {
        ucf ucfVar = new ucf(4);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, yb5.w(w1aVar, ucfVar), null, yb5.w(w1aVar, new ucf(5))};
    }

    public /* synthetic */ SearchEvents$SheetSourceClicked(int i, String str, SearchEvents$SourceType searchEvents$SourceType, boolean z, ScreenSource screenSource, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, aef.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.source_type = searchEvents$SourceType;
        this.is_citation = z;
        this.screen_source = screenSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return SearchEvents$SourceType.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return ScreenSource.Companion.serializer();
    }

    public static /* synthetic */ SearchEvents$SheetSourceClicked copy$default(SearchEvents$SheetSourceClicked searchEvents$SheetSourceClicked, String str, SearchEvents$SourceType searchEvents$SourceType, boolean z, ScreenSource screenSource, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchEvents$SheetSourceClicked.organization_uuid;
        }
        if ((i & 2) != 0) {
            searchEvents$SourceType = searchEvents$SheetSourceClicked.source_type;
        }
        if ((i & 4) != 0) {
            z = searchEvents$SheetSourceClicked.is_citation;
        }
        if ((i & 8) != 0) {
            screenSource = searchEvents$SheetSourceClicked.screen_source;
        }
        return searchEvents$SheetSourceClicked.copy(str, searchEvents$SourceType, z, screenSource);
    }

    public static final /* synthetic */ void write$Self$analytics(SearchEvents$SheetSourceClicked self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.source_type);
        output.p(serialDesc, 2, self.is_citation);
        output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.screen_source);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SearchEvents$SourceType getSource_type() {
        return this.source_type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIs_citation() {
        return this.is_citation;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ScreenSource getScreen_source() {
        return this.screen_source;
    }

    public final SearchEvents$SheetSourceClicked copy(String organization_uuid, SearchEvents$SourceType source_type, boolean is_citation, ScreenSource screen_source) {
        organization_uuid.getClass();
        source_type.getClass();
        screen_source.getClass();
        return new SearchEvents$SheetSourceClicked(organization_uuid, source_type, is_citation, screen_source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchEvents$SheetSourceClicked)) {
            return false;
        }
        SearchEvents$SheetSourceClicked searchEvents$SheetSourceClicked = (SearchEvents$SheetSourceClicked) other;
        return x44.r(this.organization_uuid, searchEvents$SheetSourceClicked.organization_uuid) && this.source_type == searchEvents$SheetSourceClicked.source_type && this.is_citation == searchEvents$SheetSourceClicked.is_citation && this.screen_source == searchEvents$SheetSourceClicked.screen_source;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_sheet_source_clicked";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final ScreenSource getScreen_source() {
        return this.screen_source;
    }

    public final SearchEvents$SourceType getSource_type() {
        return this.source_type;
    }

    public int hashCode() {
        return this.screen_source.hashCode() + fsh.p((this.source_type.hashCode() + (this.organization_uuid.hashCode() * 31)) * 31, 31, this.is_citation);
    }

    public final boolean is_citation() {
        return this.is_citation;
    }

    public String toString() {
        return "SheetSourceClicked(organization_uuid=" + this.organization_uuid + ", source_type=" + this.source_type + ", is_citation=" + this.is_citation + ", screen_source=" + this.screen_source + ")";
    }

    public SearchEvents$SheetSourceClicked(String str, SearchEvents$SourceType searchEvents$SourceType, boolean z, ScreenSource screenSource) {
        str.getClass();
        searchEvents$SourceType.getClass();
        screenSource.getClass();
        this.organization_uuid = str;
        this.source_type = searchEvents$SourceType;
        this.is_citation = z;
        this.screen_source = screenSource;
    }
}
