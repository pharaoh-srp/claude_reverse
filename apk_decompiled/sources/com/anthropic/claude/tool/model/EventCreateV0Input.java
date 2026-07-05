package com.anthropic.claude.tool.model;

import defpackage.ay6;
import defpackage.bw6;
import defpackage.cw6;
import defpackage.dw6;
import defpackage.gvj;
import defpackage.ij0;
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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@AB{\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u001f\b\u0002\u0010\u000b\u001a\u0019\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0019\u0010\u000f\u001a\u00150\u0006j\u0002`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012Ba\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010$J'\u0010%\u001a\u0019\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010$J\u0012\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b(\u0010)J#\u0010*\u001a\u00150\u0006j\u0002`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003¢\u0006\u0004\b*\u0010&J\u0010\u0010+\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b+\u0010$J\u0088\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u001f\b\u0002\u0010\u000b\u001a\u0019\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u001b\b\u0002\u0010\u000f\u001a\u00150\u0006j\u0002`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\b\b\u0002\u0010\u0010\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b.\u0010$J\u0010\u0010/\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u00020\u00022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010$R.\u0010\u000b\u001a\u0019\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b:\u0010$R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\b<\u0010)R*\u0010\u000f\u001a\u00150\u0006j\u0002`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\b=\u0010&R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u00106\u001a\u0004\b>\u0010$¨\u0006B"}, d2 = {"Lcom/anthropic/claude/tool/model/EventCreateV0Input;", "", "", "all_day", "", "description", "Ljava/time/OffsetDateTime;", "Lcom/anthropic/claude/tool/model/EventDateTime;", "Lonf;", "with", "Lay6;", "end_time", "location", "Lcom/anthropic/claude/tool/model/EventCreateV0InputRecurrence;", "recurrence", "start_time", "title", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/String;Lcom/anthropic/claude/tool/model/EventCreateV0InputRecurrence;Ljava/time/OffsetDateTime;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/String;Lcom/anthropic/claude/tool/model/EventCreateV0InputRecurrence;Ljava/time/OffsetDateTime;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/EventCreateV0Input;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/time/OffsetDateTime;", "component4", "component5", "()Lcom/anthropic/claude/tool/model/EventCreateV0InputRecurrence;", "component6", "component7", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/String;Lcom/anthropic/claude/tool/model/EventCreateV0InputRecurrence;Ljava/time/OffsetDateTime;Ljava/lang/String;)Lcom/anthropic/claude/tool/model/EventCreateV0Input;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getAll_day", "Ljava/lang/String;", "getDescription", "Ljava/time/OffsetDateTime;", "getEnd_time", "getLocation", "Lcom/anthropic/claude/tool/model/EventCreateV0InputRecurrence;", "getRecurrence", "getStart_time", "getTitle", "Companion", "bw6", "cw6", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class EventCreateV0Input {
    public static final cw6 Companion = new cw6();
    private final Boolean all_day;
    private final String description;
    private final OffsetDateTime end_time;
    private final String location;
    private final EventCreateV0InputRecurrence recurrence;
    private final OffsetDateTime start_time;
    private final String title;

    public /* synthetic */ EventCreateV0Input(int i, Boolean bool, String str, OffsetDateTime offsetDateTime, String str2, EventCreateV0InputRecurrence eventCreateV0InputRecurrence, OffsetDateTime offsetDateTime2, String str3, vnf vnfVar) {
        if (96 != (i & 96)) {
            gvj.f(i, 96, bw6.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.all_day = null;
        } else {
            this.all_day = bool;
        }
        if ((i & 2) == 0) {
            this.description = null;
        } else {
            this.description = str;
        }
        if ((i & 4) == 0) {
            this.end_time = null;
        } else {
            this.end_time = offsetDateTime;
        }
        if ((i & 8) == 0) {
            this.location = null;
        } else {
            this.location = str2;
        }
        if ((i & 16) == 0) {
            this.recurrence = null;
        } else {
            this.recurrence = eventCreateV0InputRecurrence;
        }
        this.start_time = offsetDateTime2;
        this.title = str3;
    }

    public static /* synthetic */ EventCreateV0Input copy$default(EventCreateV0Input eventCreateV0Input, Boolean bool, String str, OffsetDateTime offsetDateTime, String str2, EventCreateV0InputRecurrence eventCreateV0InputRecurrence, OffsetDateTime offsetDateTime2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = eventCreateV0Input.all_day;
        }
        if ((i & 2) != 0) {
            str = eventCreateV0Input.description;
        }
        if ((i & 4) != 0) {
            offsetDateTime = eventCreateV0Input.end_time;
        }
        if ((i & 8) != 0) {
            str2 = eventCreateV0Input.location;
        }
        if ((i & 16) != 0) {
            eventCreateV0InputRecurrence = eventCreateV0Input.recurrence;
        }
        if ((i & 32) != 0) {
            offsetDateTime2 = eventCreateV0Input.start_time;
        }
        if ((i & 64) != 0) {
            str3 = eventCreateV0Input.title;
        }
        OffsetDateTime offsetDateTime3 = offsetDateTime2;
        String str4 = str3;
        EventCreateV0InputRecurrence eventCreateV0InputRecurrence2 = eventCreateV0InputRecurrence;
        OffsetDateTime offsetDateTime4 = offsetDateTime;
        return eventCreateV0Input.copy(bool, str, offsetDateTime4, str2, eventCreateV0InputRecurrence2, offsetDateTime3, str4);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(EventCreateV0Input self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.all_day != null) {
            output.B(serialDesc, 0, zt1.a, self.all_day);
        }
        if (output.E(serialDesc) || self.description != null) {
            output.B(serialDesc, 1, srg.a, self.description);
        }
        if (output.E(serialDesc) || self.end_time != null) {
            output.B(serialDesc, 2, ay6.a, self.end_time);
        }
        if (output.E(serialDesc) || self.location != null) {
            output.B(serialDesc, 3, srg.a, self.location);
        }
        if (output.E(serialDesc) || self.recurrence != null) {
            output.B(serialDesc, 4, dw6.a, self.recurrence);
        }
        output.r(serialDesc, 5, ay6.a, self.start_time);
        output.q(serialDesc, 6, self.title);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getAll_day() {
        return this.all_day;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OffsetDateTime getEnd_time() {
        return this.end_time;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final EventCreateV0InputRecurrence getRecurrence() {
        return this.recurrence;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final OffsetDateTime getStart_time() {
        return this.start_time;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final EventCreateV0Input copy(Boolean all_day, String description, OffsetDateTime end_time, String location, EventCreateV0InputRecurrence recurrence, OffsetDateTime start_time, String title) {
        start_time.getClass();
        title.getClass();
        return new EventCreateV0Input(all_day, description, end_time, location, recurrence, start_time, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventCreateV0Input)) {
            return false;
        }
        EventCreateV0Input eventCreateV0Input = (EventCreateV0Input) other;
        return x44.r(this.all_day, eventCreateV0Input.all_day) && x44.r(this.description, eventCreateV0Input.description) && x44.r(this.end_time, eventCreateV0Input.end_time) && x44.r(this.location, eventCreateV0Input.location) && x44.r(this.recurrence, eventCreateV0Input.recurrence) && x44.r(this.start_time, eventCreateV0Input.start_time) && x44.r(this.title, eventCreateV0Input.title);
    }

    public final Boolean getAll_day() {
        return this.all_day;
    }

    public final String getDescription() {
        return this.description;
    }

    public final OffsetDateTime getEnd_time() {
        return this.end_time;
    }

    public final String getLocation() {
        return this.location;
    }

    public final EventCreateV0InputRecurrence getRecurrence() {
        return this.recurrence;
    }

    public final OffsetDateTime getStart_time() {
        return this.start_time;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Boolean bool = this.all_day;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        OffsetDateTime offsetDateTime = this.end_time;
        int iHashCode3 = (iHashCode2 + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        String str2 = this.location;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        EventCreateV0InputRecurrence eventCreateV0InputRecurrence = this.recurrence;
        return this.title.hashCode() + ((this.start_time.hashCode() + ((iHashCode4 + (eventCreateV0InputRecurrence != null ? eventCreateV0InputRecurrence.hashCode() : 0)) * 31)) * 31);
    }

    public String toString() {
        Boolean bool = this.all_day;
        String str = this.description;
        OffsetDateTime offsetDateTime = this.end_time;
        String str2 = this.location;
        EventCreateV0InputRecurrence eventCreateV0InputRecurrence = this.recurrence;
        OffsetDateTime offsetDateTime2 = this.start_time;
        String str3 = this.title;
        StringBuilder sb = new StringBuilder("EventCreateV0Input(all_day=");
        sb.append(bool);
        sb.append(", description=");
        sb.append(str);
        sb.append(", end_time=");
        sb.append(offsetDateTime);
        sb.append(", location=");
        sb.append(str2);
        sb.append(", recurrence=");
        sb.append(eventCreateV0InputRecurrence);
        sb.append(", start_time=");
        sb.append(offsetDateTime2);
        sb.append(", title=");
        return ij0.m(sb, str3, ")");
    }

    public EventCreateV0Input(Boolean bool, String str, OffsetDateTime offsetDateTime, String str2, EventCreateV0InputRecurrence eventCreateV0InputRecurrence, OffsetDateTime offsetDateTime2, String str3) {
        offsetDateTime2.getClass();
        str3.getClass();
        this.all_day = bool;
        this.description = str;
        this.end_time = offsetDateTime;
        this.location = str2;
        this.recurrence = eventCreateV0InputRecurrence;
        this.start_time = offsetDateTime2;
        this.title = str3;
    }

    public /* synthetic */ EventCreateV0Input(Boolean bool, String str, OffsetDateTime offsetDateTime, String str2, EventCreateV0InputRecurrence eventCreateV0InputRecurrence, OffsetDateTime offsetDateTime2, String str3, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : offsetDateTime, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : eventCreateV0InputRecurrence, offsetDateTime2, str3);
    }
}
