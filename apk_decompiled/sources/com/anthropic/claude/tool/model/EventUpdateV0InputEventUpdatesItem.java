package com.anthropic.claude.tool.model;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.ay6;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.l37;
import defpackage.m17;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.n27;
import defpackage.o27;
import defpackage.onf;
import defpackage.q27;
import defpackage.r27;
import defpackage.srg;
import defpackage.uo0;
import defpackage.v27;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import defpackage.zt1;
import java.time.OffsetDateTime;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 a2\u00020\u0001:\u0002bcBÝ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u001f\b\u0002\u0010\u000f\u001a\u0019\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u001f\b\u0002\u0010\u0019\u001a\u0019\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001d\u0010\u001eB³\u0001\b\u0010\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001d\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b*\u0010+J'\u0010,\u001a\u0019\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b.\u0010+J\u0010\u0010/\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b/\u0010+J\u0012\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b0\u0010+J\u0018\u00101\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b1\u0010'J\u0012\u00102\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b4\u00105J'\u00106\u001a\u0019\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003¢\u0006\u0004\b6\u0010-J\u0012\u00107\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b9\u0010+Jê\u0001\u0010:\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\u001f\b\u0002\u0010\u000f\u001a\u0019\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u001f\b\u0002\u0010\u0019\u001a\u0019\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b<\u0010+J\u0010\u0010=\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b=\u0010>J\u001a\u0010@\u001a\u00020\u00022\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b@\u0010AJ'\u0010J\u001a\u00020G2\u0006\u0010B\u001a\u00020\u00002\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020EH\u0001¢\u0006\u0004\bH\u0010IR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010K\u001a\u0004\bL\u0010%R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010M\u001a\u0004\bN\u0010'R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010O\u001a\u0004\bP\u0010)R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010Q\u001a\u0004\bR\u0010+R.\u0010\u000f\u001a\u0019\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010S\u001a\u0004\bT\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010Q\u001a\u0004\bU\u0010+R\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010Q\u001a\u0004\bV\u0010+R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010Q\u001a\u0004\bW\u0010+R\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010M\u001a\u0004\bX\u0010'R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010Y\u001a\u0004\bZ\u00103R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010[\u001a\u0004\b\\\u00105R.\u0010\u0019\u001a\u0019\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006¢\u0006\f\n\u0004\b\u0019\u0010S\u001a\u0004\b]\u0010-R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010^\u001a\u0004\b_\u00108R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010Q\u001a\u0004\b`\u0010+¨\u0006d"}, d2 = {"Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItem;", "", "", "all_day", "", "", "attendees", "Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemAvailability;", "availability", "calendar_id", "Ljava/time/OffsetDateTime;", "Lcom/anthropic/claude/tool/model/EventDateTime;", "Lonf;", "with", "Lay6;", "end_time", "event_description", "event_id", "location", "Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemNudgesItem;", "nudges", "Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemRecurrence;", "recurrence", "Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemRecurrenceSpan;", "recurrence_span", "start_time", "Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemStatus;", "status", "title", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemAvailability;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemRecurrence;Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemRecurrenceSpan;Ljava/time/OffsetDateTime;Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemStatus;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/util/List;Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemAvailability;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemRecurrence;Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemRecurrenceSpan;Ljava/time/OffsetDateTime;Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemStatus;Ljava/lang/String;Lvnf;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/util/List;", "component3", "()Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemAvailability;", "component4", "()Ljava/lang/String;", "component5", "()Ljava/time/OffsetDateTime;", "component6", "component7", "component8", "component9", "component10", "()Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemRecurrence;", "component11", "()Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemRecurrenceSpan;", "component12", "component13", "()Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemStatus;", "component14", "copy", "(Ljava/lang/Boolean;Ljava/util/List;Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemAvailability;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemRecurrence;Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemRecurrenceSpan;Ljava/time/OffsetDateTime;Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemStatus;Ljava/lang/String;)Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItem;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItem;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/Boolean;", "getAll_day", "Ljava/util/List;", "getAttendees", "Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemAvailability;", "getAvailability", "Ljava/lang/String;", "getCalendar_id", "Ljava/time/OffsetDateTime;", "getEnd_time", "getEvent_description", "getEvent_id", "getLocation", "getNudges", "Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemRecurrence;", "getRecurrence", "Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemRecurrenceSpan;", "getRecurrence_span", "getStart_time", "Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemStatus;", "getStatus", "getTitle", "Companion", "n27", "o27", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class EventUpdateV0InputEventUpdatesItem {
    private static final kw9[] $childSerializers;
    public static final o27 Companion = new o27();
    private final Boolean all_day;
    private final List<String> attendees;
    private final EventUpdateV0InputEventUpdatesItemAvailability availability;
    private final String calendar_id;
    private final OffsetDateTime end_time;
    private final String event_description;
    private final String event_id;
    private final String location;
    private final List<EventUpdateV0InputEventUpdatesItemNudgesItem> nudges;
    private final EventUpdateV0InputEventUpdatesItemRecurrence recurrence;
    private final EventUpdateV0InputEventUpdatesItemRecurrenceSpan recurrence_span;
    private final OffsetDateTime start_time;
    private final EventUpdateV0InputEventUpdatesItemStatus status;
    private final String title;

    static {
        m17 m17Var = new m17(2);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, yb5.w(w1aVar, m17Var), null, null, null, null, null, null, yb5.w(w1aVar, new m17(3)), null, yb5.w(w1aVar, new m17(4)), null, null, null};
    }

    public /* synthetic */ EventUpdateV0InputEventUpdatesItem(int i, Boolean bool, List list, EventUpdateV0InputEventUpdatesItemAvailability eventUpdateV0InputEventUpdatesItemAvailability, String str, OffsetDateTime offsetDateTime, String str2, String str3, String str4, List list2, EventUpdateV0InputEventUpdatesItemRecurrence eventUpdateV0InputEventUpdatesItemRecurrence, EventUpdateV0InputEventUpdatesItemRecurrenceSpan eventUpdateV0InputEventUpdatesItemRecurrenceSpan, OffsetDateTime offsetDateTime2, EventUpdateV0InputEventUpdatesItemStatus eventUpdateV0InputEventUpdatesItemStatus, String str5, vnf vnfVar) {
        if (72 != (i & 72)) {
            gvj.f(i, 72, n27.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.all_day = null;
        } else {
            this.all_day = bool;
        }
        if ((i & 2) == 0) {
            this.attendees = null;
        } else {
            this.attendees = list;
        }
        if ((i & 4) == 0) {
            this.availability = null;
        } else {
            this.availability = eventUpdateV0InputEventUpdatesItemAvailability;
        }
        this.calendar_id = str;
        if ((i & 16) == 0) {
            this.end_time = null;
        } else {
            this.end_time = offsetDateTime;
        }
        if ((i & 32) == 0) {
            this.event_description = null;
        } else {
            this.event_description = str2;
        }
        this.event_id = str3;
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.location = null;
        } else {
            this.location = str4;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.nudges = null;
        } else {
            this.nudges = list2;
        }
        if ((i & 512) == 0) {
            this.recurrence = null;
        } else {
            this.recurrence = eventUpdateV0InputEventUpdatesItemRecurrence;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
            this.recurrence_span = null;
        } else {
            this.recurrence_span = eventUpdateV0InputEventUpdatesItemRecurrenceSpan;
        }
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 0) {
            this.start_time = null;
        } else {
            this.start_time = offsetDateTime2;
        }
        if ((i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0) {
            this.status = null;
        } else {
            this.status = eventUpdateV0InputEventUpdatesItemStatus;
        }
        if ((i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) == 0) {
            this.title = null;
        } else {
            this.title = str5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(r27.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return EventUpdateV0InputEventUpdatesItemRecurrenceSpan.Companion.serializer();
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(EventUpdateV0InputEventUpdatesItem self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.all_day != null) {
            output.B(serialDesc, 0, zt1.a, self.all_day);
        }
        if (output.E(serialDesc) || self.attendees != null) {
            output.B(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.attendees);
        }
        if (output.E(serialDesc) || self.availability != null) {
            output.B(serialDesc, 2, q27.d, self.availability);
        }
        output.q(serialDesc, 3, self.calendar_id);
        if (output.E(serialDesc) || self.end_time != null) {
            output.B(serialDesc, 4, ay6.a, self.end_time);
        }
        if (output.E(serialDesc) || self.event_description != null) {
            output.B(serialDesc, 5, srg.a, self.event_description);
        }
        output.q(serialDesc, 6, self.event_id);
        if (output.E(serialDesc) || self.location != null) {
            output.B(serialDesc, 7, srg.a, self.location);
        }
        if (output.E(serialDesc) || self.nudges != null) {
            output.B(serialDesc, 8, (znf) kw9VarArr[8].getValue(), self.nudges);
        }
        if (output.E(serialDesc) || self.recurrence != null) {
            output.B(serialDesc, 9, v27.a, self.recurrence);
        }
        if (output.E(serialDesc) || self.recurrence_span != null) {
            output.B(serialDesc, 10, (znf) kw9VarArr[10].getValue(), self.recurrence_span);
        }
        if (output.E(serialDesc) || self.start_time != null) {
            output.B(serialDesc, 11, ay6.a, self.start_time);
        }
        if (output.E(serialDesc) || self.status != null) {
            output.B(serialDesc, 12, l37.d, self.status);
        }
        if (!output.E(serialDesc) && self.title == null) {
            return;
        }
        output.B(serialDesc, 13, srg.a, self.title);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getAll_day() {
        return this.all_day;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final EventUpdateV0InputEventUpdatesItemRecurrence getRecurrence() {
        return this.recurrence;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final EventUpdateV0InputEventUpdatesItemRecurrenceSpan getRecurrence_span() {
        return this.recurrence_span;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final OffsetDateTime getStart_time() {
        return this.start_time;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final EventUpdateV0InputEventUpdatesItemStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<String> component2() {
        return this.attendees;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EventUpdateV0InputEventUpdatesItemAvailability getAvailability() {
        return this.availability;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCalendar_id() {
        return this.calendar_id;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OffsetDateTime getEnd_time() {
        return this.end_time;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEvent_description() {
        return this.event_description;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getEvent_id() {
        return this.event_id;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    public final List<EventUpdateV0InputEventUpdatesItemNudgesItem> component9() {
        return this.nudges;
    }

    public final EventUpdateV0InputEventUpdatesItem copy(Boolean all_day, List<String> attendees, EventUpdateV0InputEventUpdatesItemAvailability availability, String calendar_id, OffsetDateTime end_time, String event_description, String event_id, String location, List<EventUpdateV0InputEventUpdatesItemNudgesItem> nudges, EventUpdateV0InputEventUpdatesItemRecurrence recurrence, EventUpdateV0InputEventUpdatesItemRecurrenceSpan recurrence_span, OffsetDateTime start_time, EventUpdateV0InputEventUpdatesItemStatus status, String title) {
        calendar_id.getClass();
        event_id.getClass();
        return new EventUpdateV0InputEventUpdatesItem(all_day, attendees, availability, calendar_id, end_time, event_description, event_id, location, nudges, recurrence, recurrence_span, start_time, status, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventUpdateV0InputEventUpdatesItem)) {
            return false;
        }
        EventUpdateV0InputEventUpdatesItem eventUpdateV0InputEventUpdatesItem = (EventUpdateV0InputEventUpdatesItem) other;
        return x44.r(this.all_day, eventUpdateV0InputEventUpdatesItem.all_day) && x44.r(this.attendees, eventUpdateV0InputEventUpdatesItem.attendees) && this.availability == eventUpdateV0InputEventUpdatesItem.availability && x44.r(this.calendar_id, eventUpdateV0InputEventUpdatesItem.calendar_id) && x44.r(this.end_time, eventUpdateV0InputEventUpdatesItem.end_time) && x44.r(this.event_description, eventUpdateV0InputEventUpdatesItem.event_description) && x44.r(this.event_id, eventUpdateV0InputEventUpdatesItem.event_id) && x44.r(this.location, eventUpdateV0InputEventUpdatesItem.location) && x44.r(this.nudges, eventUpdateV0InputEventUpdatesItem.nudges) && x44.r(this.recurrence, eventUpdateV0InputEventUpdatesItem.recurrence) && x44.r(this.recurrence_span, eventUpdateV0InputEventUpdatesItem.recurrence_span) && x44.r(this.start_time, eventUpdateV0InputEventUpdatesItem.start_time) && this.status == eventUpdateV0InputEventUpdatesItem.status && x44.r(this.title, eventUpdateV0InputEventUpdatesItem.title);
    }

    public final Boolean getAll_day() {
        return this.all_day;
    }

    public final List<String> getAttendees() {
        return this.attendees;
    }

    public final EventUpdateV0InputEventUpdatesItemAvailability getAvailability() {
        return this.availability;
    }

    public final String getCalendar_id() {
        return this.calendar_id;
    }

    public final OffsetDateTime getEnd_time() {
        return this.end_time;
    }

    public final String getEvent_description() {
        return this.event_description;
    }

    public final String getEvent_id() {
        return this.event_id;
    }

    public final String getLocation() {
        return this.location;
    }

    public final List<EventUpdateV0InputEventUpdatesItemNudgesItem> getNudges() {
        return this.nudges;
    }

    public final EventUpdateV0InputEventUpdatesItemRecurrence getRecurrence() {
        return this.recurrence;
    }

    public final EventUpdateV0InputEventUpdatesItemRecurrenceSpan getRecurrence_span() {
        return this.recurrence_span;
    }

    public final OffsetDateTime getStart_time() {
        return this.start_time;
    }

    public final EventUpdateV0InputEventUpdatesItemStatus getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Boolean bool = this.all_day;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<String> list = this.attendees;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        EventUpdateV0InputEventUpdatesItemAvailability eventUpdateV0InputEventUpdatesItemAvailability = this.availability;
        int iL = kgh.l((iHashCode2 + (eventUpdateV0InputEventUpdatesItemAvailability == null ? 0 : eventUpdateV0InputEventUpdatesItemAvailability.hashCode())) * 31, 31, this.calendar_id);
        OffsetDateTime offsetDateTime = this.end_time;
        int iHashCode3 = (iL + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        String str = this.event_description;
        int iL2 = kgh.l((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.event_id);
        String str2 = this.location;
        int iHashCode4 = (iL2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<EventUpdateV0InputEventUpdatesItemNudgesItem> list2 = this.nudges;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        EventUpdateV0InputEventUpdatesItemRecurrence eventUpdateV0InputEventUpdatesItemRecurrence = this.recurrence;
        int iHashCode6 = (iHashCode5 + (eventUpdateV0InputEventUpdatesItemRecurrence == null ? 0 : eventUpdateV0InputEventUpdatesItemRecurrence.hashCode())) * 31;
        EventUpdateV0InputEventUpdatesItemRecurrenceSpan eventUpdateV0InputEventUpdatesItemRecurrenceSpan = this.recurrence_span;
        int iHashCode7 = (iHashCode6 + (eventUpdateV0InputEventUpdatesItemRecurrenceSpan == null ? 0 : eventUpdateV0InputEventUpdatesItemRecurrenceSpan.hashCode())) * 31;
        OffsetDateTime offsetDateTime2 = this.start_time;
        int iHashCode8 = (iHashCode7 + (offsetDateTime2 == null ? 0 : offsetDateTime2.hashCode())) * 31;
        EventUpdateV0InputEventUpdatesItemStatus eventUpdateV0InputEventUpdatesItemStatus = this.status;
        int iHashCode9 = (iHashCode8 + (eventUpdateV0InputEventUpdatesItemStatus == null ? 0 : eventUpdateV0InputEventUpdatesItemStatus.hashCode())) * 31;
        String str3 = this.title;
        return iHashCode9 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        Boolean bool = this.all_day;
        List<String> list = this.attendees;
        EventUpdateV0InputEventUpdatesItemAvailability eventUpdateV0InputEventUpdatesItemAvailability = this.availability;
        String str = this.calendar_id;
        OffsetDateTime offsetDateTime = this.end_time;
        String str2 = this.event_description;
        String str3 = this.event_id;
        String str4 = this.location;
        List<EventUpdateV0InputEventUpdatesItemNudgesItem> list2 = this.nudges;
        EventUpdateV0InputEventUpdatesItemRecurrence eventUpdateV0InputEventUpdatesItemRecurrence = this.recurrence;
        EventUpdateV0InputEventUpdatesItemRecurrenceSpan eventUpdateV0InputEventUpdatesItemRecurrenceSpan = this.recurrence_span;
        OffsetDateTime offsetDateTime2 = this.start_time;
        EventUpdateV0InputEventUpdatesItemStatus eventUpdateV0InputEventUpdatesItemStatus = this.status;
        String str5 = this.title;
        StringBuilder sb = new StringBuilder("EventUpdateV0InputEventUpdatesItem(all_day=");
        sb.append(bool);
        sb.append(", attendees=");
        sb.append(list);
        sb.append(", availability=");
        sb.append(eventUpdateV0InputEventUpdatesItemAvailability);
        sb.append(", calendar_id=");
        sb.append(str);
        sb.append(", end_time=");
        sb.append(offsetDateTime);
        sb.append(", event_description=");
        sb.append(str2);
        sb.append(", event_id=");
        kgh.u(sb, str3, ", location=", str4, ", nudges=");
        sb.append(list2);
        sb.append(", recurrence=");
        sb.append(eventUpdateV0InputEventUpdatesItemRecurrence);
        sb.append(", recurrence_span=");
        sb.append(eventUpdateV0InputEventUpdatesItemRecurrenceSpan);
        sb.append(", start_time=");
        sb.append(offsetDateTime2);
        sb.append(", status=");
        sb.append(eventUpdateV0InputEventUpdatesItemStatus);
        sb.append(", title=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    public EventUpdateV0InputEventUpdatesItem(Boolean bool, List<String> list, EventUpdateV0InputEventUpdatesItemAvailability eventUpdateV0InputEventUpdatesItemAvailability, String str, OffsetDateTime offsetDateTime, String str2, String str3, String str4, List<EventUpdateV0InputEventUpdatesItemNudgesItem> list2, EventUpdateV0InputEventUpdatesItemRecurrence eventUpdateV0InputEventUpdatesItemRecurrence, EventUpdateV0InputEventUpdatesItemRecurrenceSpan eventUpdateV0InputEventUpdatesItemRecurrenceSpan, OffsetDateTime offsetDateTime2, EventUpdateV0InputEventUpdatesItemStatus eventUpdateV0InputEventUpdatesItemStatus, String str5) {
        str.getClass();
        str3.getClass();
        this.all_day = bool;
        this.attendees = list;
        this.availability = eventUpdateV0InputEventUpdatesItemAvailability;
        this.calendar_id = str;
        this.end_time = offsetDateTime;
        this.event_description = str2;
        this.event_id = str3;
        this.location = str4;
        this.nudges = list2;
        this.recurrence = eventUpdateV0InputEventUpdatesItemRecurrence;
        this.recurrence_span = eventUpdateV0InputEventUpdatesItemRecurrenceSpan;
        this.start_time = offsetDateTime2;
        this.status = eventUpdateV0InputEventUpdatesItemStatus;
        this.title = str5;
    }

    public /* synthetic */ EventUpdateV0InputEventUpdatesItem(Boolean bool, List list, EventUpdateV0InputEventUpdatesItemAvailability eventUpdateV0InputEventUpdatesItemAvailability, String str, OffsetDateTime offsetDateTime, String str2, String str3, String str4, List list2, EventUpdateV0InputEventUpdatesItemRecurrence eventUpdateV0InputEventUpdatesItemRecurrence, EventUpdateV0InputEventUpdatesItemRecurrenceSpan eventUpdateV0InputEventUpdatesItemRecurrenceSpan, OffsetDateTime offsetDateTime2, EventUpdateV0InputEventUpdatesItemStatus eventUpdateV0InputEventUpdatesItemStatus, String str5, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : eventUpdateV0InputEventUpdatesItemAvailability, str, (i & 16) != 0 ? null : offsetDateTime, (i & 32) != 0 ? null : str2, str3, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : str4, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : list2, (i & 512) != 0 ? null : eventUpdateV0InputEventUpdatesItemRecurrence, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? null : eventUpdateV0InputEventUpdatesItemRecurrenceSpan, (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? null : offsetDateTime2, (i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? null : eventUpdateV0InputEventUpdatesItemStatus, (i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? null : str5);
    }
}
