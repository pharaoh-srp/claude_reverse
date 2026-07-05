package com.anthropic.claude.tool.model;

import defpackage.ay6;
import defpackage.e79;
import defpackage.m07;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zt1;
import java.time.OffsetDateTime;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 82\u00020\u0001:\u00029:Bm\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u001f\b\u0002\u0010\t\u001a\u0019\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u001f\b\u0002\u0010\u000e\u001a\u0019\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\u0004\b\u000f\u0010\u0010BM\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u0019\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b$\u0010%J'\u0010&\u001a\u0019\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b&\u0010!Jv\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u001f\b\u0002\u0010\t\u001a\u0019\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u001f\b\u0002\u0010\u000e\u001a\u0019\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001fJ\u0010\u0010*\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001fR.\u0010\t\u001a\u0019\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u0010#R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b6\u0010%R.\u0010\u000e\u001a\u0019\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b7\u0010!¨\u0006;"}, d2 = {"Lcom/anthropic/claude/tool/model/EventSearchV0Input;", "", "", "calendar_id", "Ljava/time/OffsetDateTime;", "Lcom/anthropic/claude/tool/model/EventDateTime;", "Lonf;", "with", "Lay6;", "end_time", "", "include_all_day", "", "limit", "start_time", "<init>", "(Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/time/OffsetDateTime;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/time/OffsetDateTime;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/EventSearchV0Input;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/time/OffsetDateTime;", "component3", "()Ljava/lang/Boolean;", "component4", "()Ljava/lang/Integer;", "component5", "copy", "(Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/time/OffsetDateTime;)Lcom/anthropic/claude/tool/model/EventSearchV0Input;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCalendar_id", "Ljava/time/OffsetDateTime;", "getEnd_time", "Ljava/lang/Boolean;", "getInclude_all_day", "Ljava/lang/Integer;", "getLimit", "getStart_time", "Companion", "l07", "m07", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class EventSearchV0Input {
    public static final m07 Companion = new m07();
    private final String calendar_id;
    private final OffsetDateTime end_time;
    private final Boolean include_all_day;
    private final Integer limit;
    private final OffsetDateTime start_time;

    public /* synthetic */ EventSearchV0Input(int i, String str, OffsetDateTime offsetDateTime, Boolean bool, Integer num, OffsetDateTime offsetDateTime2, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.calendar_id = null;
        } else {
            this.calendar_id = str;
        }
        if ((i & 2) == 0) {
            this.end_time = null;
        } else {
            this.end_time = offsetDateTime;
        }
        if ((i & 4) == 0) {
            this.include_all_day = null;
        } else {
            this.include_all_day = bool;
        }
        if ((i & 8) == 0) {
            this.limit = null;
        } else {
            this.limit = num;
        }
        if ((i & 16) == 0) {
            this.start_time = null;
        } else {
            this.start_time = offsetDateTime2;
        }
    }

    public static /* synthetic */ EventSearchV0Input copy$default(EventSearchV0Input eventSearchV0Input, String str, OffsetDateTime offsetDateTime, Boolean bool, Integer num, OffsetDateTime offsetDateTime2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventSearchV0Input.calendar_id;
        }
        if ((i & 2) != 0) {
            offsetDateTime = eventSearchV0Input.end_time;
        }
        if ((i & 4) != 0) {
            bool = eventSearchV0Input.include_all_day;
        }
        if ((i & 8) != 0) {
            num = eventSearchV0Input.limit;
        }
        if ((i & 16) != 0) {
            offsetDateTime2 = eventSearchV0Input.start_time;
        }
        OffsetDateTime offsetDateTime3 = offsetDateTime2;
        Boolean bool2 = bool;
        return eventSearchV0Input.copy(str, offsetDateTime, bool2, num, offsetDateTime3);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(EventSearchV0Input self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.calendar_id != null) {
            output.B(serialDesc, 0, srg.a, self.calendar_id);
        }
        if (output.E(serialDesc) || self.end_time != null) {
            output.B(serialDesc, 1, ay6.a, self.end_time);
        }
        if (output.E(serialDesc) || self.include_all_day != null) {
            output.B(serialDesc, 2, zt1.a, self.include_all_day);
        }
        if (output.E(serialDesc) || self.limit != null) {
            output.B(serialDesc, 3, e79.a, self.limit);
        }
        if (!output.E(serialDesc) && self.start_time == null) {
            return;
        }
        output.B(serialDesc, 4, ay6.a, self.start_time);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCalendar_id() {
        return this.calendar_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OffsetDateTime getEnd_time() {
        return this.end_time;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getInclude_all_day() {
        return this.include_all_day;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OffsetDateTime getStart_time() {
        return this.start_time;
    }

    public final EventSearchV0Input copy(String calendar_id, OffsetDateTime end_time, Boolean include_all_day, Integer limit, OffsetDateTime start_time) {
        return new EventSearchV0Input(calendar_id, end_time, include_all_day, limit, start_time);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventSearchV0Input)) {
            return false;
        }
        EventSearchV0Input eventSearchV0Input = (EventSearchV0Input) other;
        return x44.r(this.calendar_id, eventSearchV0Input.calendar_id) && x44.r(this.end_time, eventSearchV0Input.end_time) && x44.r(this.include_all_day, eventSearchV0Input.include_all_day) && x44.r(this.limit, eventSearchV0Input.limit) && x44.r(this.start_time, eventSearchV0Input.start_time);
    }

    public final String getCalendar_id() {
        return this.calendar_id;
    }

    public final OffsetDateTime getEnd_time() {
        return this.end_time;
    }

    public final Boolean getInclude_all_day() {
        return this.include_all_day;
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public final OffsetDateTime getStart_time() {
        return this.start_time;
    }

    public int hashCode() {
        String str = this.calendar_id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        OffsetDateTime offsetDateTime = this.end_time;
        int iHashCode2 = (iHashCode + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        Boolean bool = this.include_all_day;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.limit;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        OffsetDateTime offsetDateTime2 = this.start_time;
        return iHashCode4 + (offsetDateTime2 != null ? offsetDateTime2.hashCode() : 0);
    }

    public String toString() {
        return "EventSearchV0Input(calendar_id=" + this.calendar_id + ", end_time=" + this.end_time + ", include_all_day=" + this.include_all_day + ", limit=" + this.limit + ", start_time=" + this.start_time + ")";
    }

    public EventSearchV0Input() {
        this((String) null, (OffsetDateTime) null, (Boolean) null, (Integer) null, (OffsetDateTime) null, 31, (mq5) null);
    }

    public EventSearchV0Input(String str, OffsetDateTime offsetDateTime, Boolean bool, Integer num, OffsetDateTime offsetDateTime2) {
        this.calendar_id = str;
        this.end_time = offsetDateTime;
        this.include_all_day = bool;
        this.limit = num;
        this.start_time = offsetDateTime2;
    }

    public /* synthetic */ EventSearchV0Input(String str, OffsetDateTime offsetDateTime, Boolean bool, Integer num, OffsetDateTime offsetDateTime2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : offsetDateTime, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : offsetDateTime2);
    }
}
