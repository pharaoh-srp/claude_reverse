package com.anthropic.claude.tool.calendar;

import defpackage.ay6;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.lz6;
import defpackage.mdj;
import defpackage.mz6;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import java.time.OffsetDateTime;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0019\u0010\n\u001a\u00150\u0005j\u0002`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u001d\u0010\u000b\u001a\u0019\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eBM\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ#\u0010 \u001a\u00150\u0005j\u0002`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003¢\u0006\u0004\b \u0010!J'\u0010\"\u001a\u0019\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJn\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u001b\b\u0002\u0010\n\u001a\u00150\u0005j\u0002`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\u001f\b\u0002\u0010\u000b\u001a\u0019\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001eJ\u0010\u0010'\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001eR*\u0010\n\u001a\u00150\u0005j\u0002`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u0010!R.\u0010\u000b\u001a\u0019\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b2\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b3\u0010\u001e¨\u00067"}, d2 = {"Lcom/anthropic/claude/tool/calendar/EventInfo;", "", "", "eventId", "title", "Ljava/time/OffsetDateTime;", "Lcom/anthropic/claude/tool/model/EventDateTime;", "Lonf;", "with", "Lpl9;", "startTime", "endTime", "syncId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$tool", "(Lcom/anthropic/claude/tool/calendar/EventInfo;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/time/OffsetDateTime;", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ljava/lang/String;)Lcom/anthropic/claude/tool/calendar/EventInfo;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEventId", "getTitle", "Ljava/time/OffsetDateTime;", "getStartTime", "getEndTime", "getSyncId", "Companion", "lz6", "mz6", "tool"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class EventInfo {
    public static final int $stable = 0;
    public static final mz6 Companion = new mz6();
    private final OffsetDateTime endTime;
    private final String eventId;
    private final OffsetDateTime startTime;
    private final String syncId;
    private final String title;

    public /* synthetic */ EventInfo(int i, String str, String str2, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, String str3, vnf vnfVar) {
        if (31 != (i & 31)) {
            gvj.f(i, 31, lz6.a.getDescriptor());
            throw null;
        }
        this.eventId = str;
        this.title = str2;
        this.startTime = offsetDateTime;
        this.endTime = offsetDateTime2;
        this.syncId = str3;
    }

    public static /* synthetic */ EventInfo copy$default(EventInfo eventInfo, String str, String str2, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventInfo.eventId;
        }
        if ((i & 2) != 0) {
            str2 = eventInfo.title;
        }
        if ((i & 4) != 0) {
            offsetDateTime = eventInfo.startTime;
        }
        if ((i & 8) != 0) {
            offsetDateTime2 = eventInfo.endTime;
        }
        if ((i & 16) != 0) {
            str3 = eventInfo.syncId;
        }
        String str4 = str3;
        OffsetDateTime offsetDateTime3 = offsetDateTime;
        return eventInfo.copy(str, str2, offsetDateTime3, offsetDateTime2, str4);
    }

    public static final /* synthetic */ void write$Self$tool(EventInfo self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.eventId);
        output.q(serialDesc, 1, self.title);
        ay6 ay6Var = ay6.a;
        output.r(serialDesc, 2, ay6Var, self.startTime);
        output.B(serialDesc, 3, ay6Var, self.endTime);
        output.B(serialDesc, 4, srg.a, self.syncId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OffsetDateTime getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final OffsetDateTime getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSyncId() {
        return this.syncId;
    }

    public final EventInfo copy(String eventId, String title, OffsetDateTime startTime, OffsetDateTime endTime, String syncId) {
        eventId.getClass();
        title.getClass();
        startTime.getClass();
        return new EventInfo(eventId, title, startTime, endTime, syncId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventInfo)) {
            return false;
        }
        EventInfo eventInfo = (EventInfo) other;
        return x44.r(this.eventId, eventInfo.eventId) && x44.r(this.title, eventInfo.title) && x44.r(this.startTime, eventInfo.startTime) && x44.r(this.endTime, eventInfo.endTime) && x44.r(this.syncId, eventInfo.syncId);
    }

    public final OffsetDateTime getEndTime() {
        return this.endTime;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final OffsetDateTime getStartTime() {
        return this.startTime;
    }

    public final String getSyncId() {
        return this.syncId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = (this.startTime.hashCode() + kgh.l(this.eventId.hashCode() * 31, 31, this.title)) * 31;
        OffsetDateTime offsetDateTime = this.endTime;
        int iHashCode2 = (iHashCode + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        String str = this.syncId;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.eventId;
        String str2 = this.title;
        OffsetDateTime offsetDateTime = this.startTime;
        OffsetDateTime offsetDateTime2 = this.endTime;
        String str3 = this.syncId;
        StringBuilder sbR = kgh.r("EventInfo(eventId=", str, ", title=", str2, ", startTime=");
        sbR.append(offsetDateTime);
        sbR.append(", endTime=");
        sbR.append(offsetDateTime2);
        sbR.append(", syncId=");
        return ij0.m(sbR, str3, ")");
    }

    public EventInfo(String str, String str2, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, String str3) {
        str.getClass();
        str2.getClass();
        offsetDateTime.getClass();
        this.eventId = str;
        this.title = str2;
        this.startTime = offsetDateTime;
        this.endTime = offsetDateTime2;
        this.syncId = str3;
    }
}
