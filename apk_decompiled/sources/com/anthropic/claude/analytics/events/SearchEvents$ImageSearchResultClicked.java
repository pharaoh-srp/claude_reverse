package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.tdf;
import defpackage.udf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010\u001c\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001bR\u0014\u0010+\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u001b¨\u0006/"}, d2 = {"com/anthropic/claude/analytics/events/SearchEvents$ImageSearchResultClicked", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "image_index", "images_count", "", "telemetry", "<init>", "(IILjava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IIILjava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/SearchEvents$ImageSearchResultClicked;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/SearchEvents$ImageSearchResultClicked;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "component3", "()Ljava/lang/String;", "copy", "(IILjava/lang/String;)Lcom/anthropic/claude/analytics/events/SearchEvents$ImageSearchResultClicked;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getImage_index", "getImages_count", "Ljava/lang/String;", "getTelemetry", "getEventName", "eventName", "Companion", "tdf", "udf", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SearchEvents$ImageSearchResultClicked implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final udf Companion = new udf();
    private final int image_index;
    private final int images_count;
    private final String telemetry;

    public /* synthetic */ SearchEvents$ImageSearchResultClicked(int i, int i2, int i3, String str, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, tdf.a.getDescriptor());
            throw null;
        }
        this.image_index = i2;
        this.images_count = i3;
        if ((i & 4) == 0) {
            this.telemetry = null;
        } else {
            this.telemetry = str;
        }
    }

    public static /* synthetic */ SearchEvents$ImageSearchResultClicked copy$default(SearchEvents$ImageSearchResultClicked searchEvents$ImageSearchResultClicked, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = searchEvents$ImageSearchResultClicked.image_index;
        }
        if ((i3 & 2) != 0) {
            i2 = searchEvents$ImageSearchResultClicked.images_count;
        }
        if ((i3 & 4) != 0) {
            str = searchEvents$ImageSearchResultClicked.telemetry;
        }
        return searchEvents$ImageSearchResultClicked.copy(i, i2, str);
    }

    public static final /* synthetic */ void write$Self$analytics(SearchEvents$ImageSearchResultClicked self, vd4 output, SerialDescriptor serialDesc) {
        output.l(0, self.image_index, serialDesc);
        output.l(1, self.images_count, serialDesc);
        if (!output.E(serialDesc) && self.telemetry == null) {
            return;
        }
        output.B(serialDesc, 2, srg.a, self.telemetry);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getImage_index() {
        return this.image_index;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getImages_count() {
        return this.images_count;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTelemetry() {
        return this.telemetry;
    }

    public final SearchEvents$ImageSearchResultClicked copy(int image_index, int images_count, String telemetry) {
        return new SearchEvents$ImageSearchResultClicked(image_index, images_count, telemetry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchEvents$ImageSearchResultClicked)) {
            return false;
        }
        SearchEvents$ImageSearchResultClicked searchEvents$ImageSearchResultClicked = (SearchEvents$ImageSearchResultClicked) other;
        return this.image_index == searchEvents$ImageSearchResultClicked.image_index && this.images_count == searchEvents$ImageSearchResultClicked.images_count && x44.r(this.telemetry, searchEvents$ImageSearchResultClicked.telemetry);
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.image_search.result.clicked";
    }

    public final int getImage_index() {
        return this.image_index;
    }

    public final int getImages_count() {
        return this.images_count;
    }

    public final String getTelemetry() {
        return this.telemetry;
    }

    public int hashCode() {
        int iC = vb7.c(this.images_count, Integer.hashCode(this.image_index) * 31, 31);
        String str = this.telemetry;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        int i = this.image_index;
        int i2 = this.images_count;
        return ij0.m(vb7.v("ImageSearchResultClicked(image_index=", ", images_count=", i, i2, ", telemetry="), this.telemetry, ")");
    }

    public SearchEvents$ImageSearchResultClicked(int i, int i2, String str) {
        this.image_index = i;
        this.images_count = i2;
        this.telemetry = str;
    }

    public /* synthetic */ SearchEvents$ImageSearchResultClicked(int i, int i2, String str, int i3, mq5 mq5Var) {
        this(i, i2, (i3 & 4) != 0 ? null : str);
    }
}
