package com.anthropic.claude.tool.model;

import defpackage.ay6;
import defpackage.by6;
import defpackage.cy6;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import java.time.OffsetDateTime;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0019\u0010\t\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u001d\u0010\n\u001a\u0019\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\u0004\b\u000b\u0010\fB9\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001d\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001f\u001a\u0019\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJX\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001b\b\u0002\u0010\t\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\u001f\b\u0002\u0010\n\u001a\u0019\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001cR*\u0010\t\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u001eR.\u0010\n\u001a\u0019\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b-\u0010\u001e¨\u00061"}, d2 = {"Lcom/anthropic/claude/tool/model/EventDeleteDetails;", "", "", "title", "Ljava/time/OffsetDateTime;", "Lcom/anthropic/claude/tool/model/EventDateTime;", "Lonf;", "with", "Lpl9;", "startTime", "endTime", "<init>", "(Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$tool", "(Lcom/anthropic/claude/tool/model/EventDeleteDetails;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/time/OffsetDateTime;", "component3", "copy", "(Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;)Lcom/anthropic/claude/tool/model/EventDeleteDetails;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/time/OffsetDateTime;", "getStartTime", "getEndTime", "Companion", "by6", "cy6", "tool"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class EventDeleteDetails {
    public static final int $stable = 0;
    public static final cy6 Companion = new cy6();
    private final OffsetDateTime endTime;
    private final OffsetDateTime startTime;
    private final String title;

    public /* synthetic */ EventDeleteDetails(int i, String str, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, by6.a.getDescriptor());
            throw null;
        }
        this.title = str;
        this.startTime = offsetDateTime;
        this.endTime = offsetDateTime2;
    }

    public static /* synthetic */ EventDeleteDetails copy$default(EventDeleteDetails eventDeleteDetails, String str, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventDeleteDetails.title;
        }
        if ((i & 2) != 0) {
            offsetDateTime = eventDeleteDetails.startTime;
        }
        if ((i & 4) != 0) {
            offsetDateTime2 = eventDeleteDetails.endTime;
        }
        return eventDeleteDetails.copy(str, offsetDateTime, offsetDateTime2);
    }

    public static final /* synthetic */ void write$Self$tool(EventDeleteDetails self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.title);
        ay6 ay6Var = ay6.a;
        output.r(serialDesc, 1, ay6Var, self.startTime);
        output.B(serialDesc, 2, ay6Var, self.endTime);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OffsetDateTime getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OffsetDateTime getEndTime() {
        return this.endTime;
    }

    public final EventDeleteDetails copy(String title, OffsetDateTime startTime, OffsetDateTime endTime) {
        title.getClass();
        startTime.getClass();
        return new EventDeleteDetails(title, startTime, endTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventDeleteDetails)) {
            return false;
        }
        EventDeleteDetails eventDeleteDetails = (EventDeleteDetails) other;
        return x44.r(this.title, eventDeleteDetails.title) && x44.r(this.startTime, eventDeleteDetails.startTime) && x44.r(this.endTime, eventDeleteDetails.endTime);
    }

    public final OffsetDateTime getEndTime() {
        return this.endTime;
    }

    public final OffsetDateTime getStartTime() {
        return this.startTime;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = (this.startTime.hashCode() + (this.title.hashCode() * 31)) * 31;
        OffsetDateTime offsetDateTime = this.endTime;
        return iHashCode + (offsetDateTime == null ? 0 : offsetDateTime.hashCode());
    }

    public String toString() {
        return "EventDeleteDetails(title=" + this.title + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ")";
    }

    public EventDeleteDetails(String str, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2) {
        str.getClass();
        offsetDateTime.getClass();
        this.title = str;
        this.startTime = offsetDateTime;
        this.endTime = offsetDateTime2;
    }
}
