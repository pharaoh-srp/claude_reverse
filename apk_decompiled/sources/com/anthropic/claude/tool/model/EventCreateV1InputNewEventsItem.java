package com.anthropic.claude.tool.model;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.ax6;
import defpackage.ay6;
import defpackage.fw6;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.lx6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qy1;
import defpackage.srg;
import defpackage.sw6;
import defpackage.tw6;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.vw6;
import defpackage.w1a;
import defpackage.ww6;
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
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 X2\u00020\u0001:\u0002YZBÃ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u001f\b\u0002\u0010\u000f\u001a\u0019\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0019\u0010\u0016\u001a\u00150\nj\u0002`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bB\u009f\u0001\b\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001a\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b'\u0010(J'\u0010)\u001a\u0019\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b+\u0010(J\u0012\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b,\u0010(J\u0018\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b-\u0010$J\u0012\u0010.\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b.\u0010/J#\u00100\u001a\u00150\nj\u0002`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003¢\u0006\u0004\b0\u0010*J\u0012\u00101\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b3\u0010(JÐ\u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u001f\b\u0002\u0010\u000f\u001a\u0019\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u001b\b\u0002\u0010\u0016\u001a\u00150\nj\u0002`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b6\u0010(J\u0010\u00107\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b7\u00108J\u001a\u0010:\u001a\u00020\u00022\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b:\u0010;J'\u0010D\u001a\u00020A2\u0006\u0010<\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0001¢\u0006\u0004\bB\u0010CR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010E\u001a\u0004\bF\u0010\"R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010G\u001a\u0004\bH\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010I\u001a\u0004\bJ\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010K\u001a\u0004\bL\u0010(R.\u0010\u000f\u001a\u0019\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010M\u001a\u0004\bN\u0010*R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010K\u001a\u0004\bO\u0010(R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010K\u001a\u0004\bP\u0010(R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010G\u001a\u0004\bQ\u0010$R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010R\u001a\u0004\bS\u0010/R*\u0010\u0016\u001a\u00150\nj\u0002`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006¢\u0006\f\n\u0004\b\u0016\u0010M\u001a\u0004\bT\u0010*R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010U\u001a\u0004\bV\u00102R\u0017\u0010\u0019\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010K\u001a\u0004\bW\u0010(¨\u0006["}, d2 = {"Lcom/anthropic/claude/tool/model/EventCreateV1InputNewEventsItem;", "", "", "all_day", "", "", "attendees", "Lcom/anthropic/claude/tool/model/EventCreateV1InputNewEventsItemAvailability;", "availability", "calendar_id", "Ljava/time/OffsetDateTime;", "Lcom/anthropic/claude/tool/model/EventDateTime;", "Lonf;", "with", "Lay6;", "end_time", "event_description", "location", "Lcom/anthropic/claude/tool/model/EventCreateV1InputNewEventsItemNudgesItem;", "nudges", "Lcom/anthropic/claude/tool/model/EventCreateV1InputNewEventsItemRecurrence;", "recurrence", "start_time", "Lcom/anthropic/claude/tool/model/EventCreateV1InputNewEventsItemStatus;", "status", "title", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;Lcom/anthropic/claude/tool/model/EventCreateV1InputNewEventsItemAvailability;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/anthropic/claude/tool/model/EventCreateV1InputNewEventsItemRecurrence;Ljava/time/OffsetDateTime;Lcom/anthropic/claude/tool/model/EventCreateV1InputNewEventsItemStatus;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/util/List;Lcom/anthropic/claude/tool/model/EventCreateV1InputNewEventsItemAvailability;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/anthropic/claude/tool/model/EventCreateV1InputNewEventsItemRecurrence;Ljava/time/OffsetDateTime;Lcom/anthropic/claude/tool/model/EventCreateV1InputNewEventsItemStatus;Ljava/lang/String;Lvnf;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/util/List;", "component3", "()Lcom/anthropic/claude/tool/model/EventCreateV1InputNewEventsItemAvailability;", "component4", "()Ljava/lang/String;", "component5", "()Ljava/time/OffsetDateTime;", "component6", "component7", "component8", "component9", "()Lcom/anthropic/claude/tool/model/EventCreateV1InputNewEventsItemRecurrence;", "component10", "component11", "()Lcom/anthropic/claude/tool/model/EventCreateV1InputNewEventsItemStatus;", "component12", "copy", "(Ljava/lang/Boolean;Ljava/util/List;Lcom/anthropic/claude/tool/model/EventCreateV1InputNewEventsItemAvailability;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/anthropic/claude/tool/model/EventCreateV1InputNewEventsItemRecurrence;Ljava/time/OffsetDateTime;Lcom/anthropic/claude/tool/model/EventCreateV1InputNewEventsItemStatus;Ljava/lang/String;)Lcom/anthropic/claude/tool/model/EventCreateV1InputNewEventsItem;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/EventCreateV1InputNewEventsItem;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/Boolean;", "getAll_day", "Ljava/util/List;", "getAttendees", "Lcom/anthropic/claude/tool/model/EventCreateV1InputNewEventsItemAvailability;", "getAvailability", "Ljava/lang/String;", "getCalendar_id", "Ljava/time/OffsetDateTime;", "getEnd_time", "getEvent_description", "getLocation", "getNudges", "Lcom/anthropic/claude/tool/model/EventCreateV1InputNewEventsItemRecurrence;", "getRecurrence", "getStart_time", "Lcom/anthropic/claude/tool/model/EventCreateV1InputNewEventsItemStatus;", "getStatus", "getTitle", "Companion", "sw6", "tw6", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class EventCreateV1InputNewEventsItem {
    private static final kw9[] $childSerializers;
    public static final tw6 Companion = new tw6();
    private final Boolean all_day;
    private final List<String> attendees;
    private final EventCreateV1InputNewEventsItemAvailability availability;
    private final String calendar_id;
    private final OffsetDateTime end_time;
    private final String event_description;
    private final String location;
    private final List<EventCreateV1InputNewEventsItemNudgesItem> nudges;
    private final EventCreateV1InputNewEventsItemRecurrence recurrence;
    private final OffsetDateTime start_time;
    private final EventCreateV1InputNewEventsItemStatus status;
    private final String title;

    static {
        fw6 fw6Var = new fw6(3);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, yb5.w(w1aVar, fw6Var), null, null, null, null, null, yb5.w(w1aVar, new fw6(4)), null, null, null, null};
    }

    public /* synthetic */ EventCreateV1InputNewEventsItem(int i, Boolean bool, List list, EventCreateV1InputNewEventsItemAvailability eventCreateV1InputNewEventsItemAvailability, String str, OffsetDateTime offsetDateTime, String str2, String str3, List list2, EventCreateV1InputNewEventsItemRecurrence eventCreateV1InputNewEventsItemRecurrence, OffsetDateTime offsetDateTime2, EventCreateV1InputNewEventsItemStatus eventCreateV1InputNewEventsItemStatus, String str4, vnf vnfVar) {
        if (2560 != (i & 2560)) {
            gvj.f(i, 2560, sw6.a.getDescriptor());
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
            this.availability = eventCreateV1InputNewEventsItemAvailability;
        }
        if ((i & 8) == 0) {
            this.calendar_id = null;
        } else {
            this.calendar_id = str;
        }
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
        if ((i & 64) == 0) {
            this.location = null;
        } else {
            this.location = str3;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.nudges = null;
        } else {
            this.nudges = list2;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.recurrence = null;
        } else {
            this.recurrence = eventCreateV1InputNewEventsItemRecurrence;
        }
        this.start_time = offsetDateTime2;
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
            this.status = null;
        } else {
            this.status = eventCreateV1InputNewEventsItemStatus;
        }
        this.title = str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(ww6.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventCreateV1InputNewEventsItem copy$default(EventCreateV1InputNewEventsItem eventCreateV1InputNewEventsItem, Boolean bool, List list, EventCreateV1InputNewEventsItemAvailability eventCreateV1InputNewEventsItemAvailability, String str, OffsetDateTime offsetDateTime, String str2, String str3, List list2, EventCreateV1InputNewEventsItemRecurrence eventCreateV1InputNewEventsItemRecurrence, OffsetDateTime offsetDateTime2, EventCreateV1InputNewEventsItemStatus eventCreateV1InputNewEventsItemStatus, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = eventCreateV1InputNewEventsItem.all_day;
        }
        if ((i & 2) != 0) {
            list = eventCreateV1InputNewEventsItem.attendees;
        }
        if ((i & 4) != 0) {
            eventCreateV1InputNewEventsItemAvailability = eventCreateV1InputNewEventsItem.availability;
        }
        if ((i & 8) != 0) {
            str = eventCreateV1InputNewEventsItem.calendar_id;
        }
        if ((i & 16) != 0) {
            offsetDateTime = eventCreateV1InputNewEventsItem.end_time;
        }
        if ((i & 32) != 0) {
            str2 = eventCreateV1InputNewEventsItem.event_description;
        }
        if ((i & 64) != 0) {
            str3 = eventCreateV1InputNewEventsItem.location;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            list2 = eventCreateV1InputNewEventsItem.nudges;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            eventCreateV1InputNewEventsItemRecurrence = eventCreateV1InputNewEventsItem.recurrence;
        }
        if ((i & 512) != 0) {
            offsetDateTime2 = eventCreateV1InputNewEventsItem.start_time;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
            eventCreateV1InputNewEventsItemStatus = eventCreateV1InputNewEventsItem.status;
        }
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0) {
            str4 = eventCreateV1InputNewEventsItem.title;
        }
        EventCreateV1InputNewEventsItemStatus eventCreateV1InputNewEventsItemStatus2 = eventCreateV1InputNewEventsItemStatus;
        String str5 = str4;
        EventCreateV1InputNewEventsItemRecurrence eventCreateV1InputNewEventsItemRecurrence2 = eventCreateV1InputNewEventsItemRecurrence;
        OffsetDateTime offsetDateTime3 = offsetDateTime2;
        String str6 = str3;
        List list3 = list2;
        OffsetDateTime offsetDateTime4 = offsetDateTime;
        String str7 = str2;
        return eventCreateV1InputNewEventsItem.copy(bool, list, eventCreateV1InputNewEventsItemAvailability, str, offsetDateTime4, str7, str6, list3, eventCreateV1InputNewEventsItemRecurrence2, offsetDateTime3, eventCreateV1InputNewEventsItemStatus2, str5);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(EventCreateV1InputNewEventsItem self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.all_day != null) {
            output.B(serialDesc, 0, zt1.a, self.all_day);
        }
        if (output.E(serialDesc) || self.attendees != null) {
            output.B(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.attendees);
        }
        if (output.E(serialDesc) || self.availability != null) {
            output.B(serialDesc, 2, vw6.d, self.availability);
        }
        if (output.E(serialDesc) || self.calendar_id != null) {
            output.B(serialDesc, 3, srg.a, self.calendar_id);
        }
        if (output.E(serialDesc) || self.end_time != null) {
            output.B(serialDesc, 4, ay6.a, self.end_time);
        }
        if (output.E(serialDesc) || self.event_description != null) {
            output.B(serialDesc, 5, srg.a, self.event_description);
        }
        if (output.E(serialDesc) || self.location != null) {
            output.B(serialDesc, 6, srg.a, self.location);
        }
        if (output.E(serialDesc) || self.nudges != null) {
            output.B(serialDesc, 7, (znf) kw9VarArr[7].getValue(), self.nudges);
        }
        if (output.E(serialDesc) || self.recurrence != null) {
            output.B(serialDesc, 8, ax6.a, self.recurrence);
        }
        output.r(serialDesc, 9, ay6.a, self.start_time);
        if (output.E(serialDesc) || self.status != null) {
            output.B(serialDesc, 10, lx6.d, self.status);
        }
        output.q(serialDesc, 11, self.title);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getAll_day() {
        return this.all_day;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final OffsetDateTime getStart_time() {
        return this.start_time;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final EventCreateV1InputNewEventsItemStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<String> component2() {
        return this.attendees;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EventCreateV1InputNewEventsItemAvailability getAvailability() {
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
    public final String getLocation() {
        return this.location;
    }

    public final List<EventCreateV1InputNewEventsItemNudgesItem> component8() {
        return this.nudges;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final EventCreateV1InputNewEventsItemRecurrence getRecurrence() {
        return this.recurrence;
    }

    public final EventCreateV1InputNewEventsItem copy(Boolean all_day, List<String> attendees, EventCreateV1InputNewEventsItemAvailability availability, String calendar_id, OffsetDateTime end_time, String event_description, String location, List<EventCreateV1InputNewEventsItemNudgesItem> nudges, EventCreateV1InputNewEventsItemRecurrence recurrence, OffsetDateTime start_time, EventCreateV1InputNewEventsItemStatus status, String title) {
        start_time.getClass();
        title.getClass();
        return new EventCreateV1InputNewEventsItem(all_day, attendees, availability, calendar_id, end_time, event_description, location, nudges, recurrence, start_time, status, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventCreateV1InputNewEventsItem)) {
            return false;
        }
        EventCreateV1InputNewEventsItem eventCreateV1InputNewEventsItem = (EventCreateV1InputNewEventsItem) other;
        return x44.r(this.all_day, eventCreateV1InputNewEventsItem.all_day) && x44.r(this.attendees, eventCreateV1InputNewEventsItem.attendees) && this.availability == eventCreateV1InputNewEventsItem.availability && x44.r(this.calendar_id, eventCreateV1InputNewEventsItem.calendar_id) && x44.r(this.end_time, eventCreateV1InputNewEventsItem.end_time) && x44.r(this.event_description, eventCreateV1InputNewEventsItem.event_description) && x44.r(this.location, eventCreateV1InputNewEventsItem.location) && x44.r(this.nudges, eventCreateV1InputNewEventsItem.nudges) && x44.r(this.recurrence, eventCreateV1InputNewEventsItem.recurrence) && x44.r(this.start_time, eventCreateV1InputNewEventsItem.start_time) && this.status == eventCreateV1InputNewEventsItem.status && x44.r(this.title, eventCreateV1InputNewEventsItem.title);
    }

    public final Boolean getAll_day() {
        return this.all_day;
    }

    public final List<String> getAttendees() {
        return this.attendees;
    }

    public final EventCreateV1InputNewEventsItemAvailability getAvailability() {
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

    public final String getLocation() {
        return this.location;
    }

    public final List<EventCreateV1InputNewEventsItemNudgesItem> getNudges() {
        return this.nudges;
    }

    public final EventCreateV1InputNewEventsItemRecurrence getRecurrence() {
        return this.recurrence;
    }

    public final OffsetDateTime getStart_time() {
        return this.start_time;
    }

    public final EventCreateV1InputNewEventsItemStatus getStatus() {
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
        EventCreateV1InputNewEventsItemAvailability eventCreateV1InputNewEventsItemAvailability = this.availability;
        int iHashCode3 = (iHashCode2 + (eventCreateV1InputNewEventsItemAvailability == null ? 0 : eventCreateV1InputNewEventsItemAvailability.hashCode())) * 31;
        String str = this.calendar_id;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        OffsetDateTime offsetDateTime = this.end_time;
        int iHashCode5 = (iHashCode4 + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        String str2 = this.event_description;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.location;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<EventCreateV1InputNewEventsItemNudgesItem> list2 = this.nudges;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        EventCreateV1InputNewEventsItemRecurrence eventCreateV1InputNewEventsItemRecurrence = this.recurrence;
        int iHashCode9 = (this.start_time.hashCode() + ((iHashCode8 + (eventCreateV1InputNewEventsItemRecurrence == null ? 0 : eventCreateV1InputNewEventsItemRecurrence.hashCode())) * 31)) * 31;
        EventCreateV1InputNewEventsItemStatus eventCreateV1InputNewEventsItemStatus = this.status;
        return this.title.hashCode() + ((iHashCode9 + (eventCreateV1InputNewEventsItemStatus != null ? eventCreateV1InputNewEventsItemStatus.hashCode() : 0)) * 31);
    }

    public String toString() {
        Boolean bool = this.all_day;
        List<String> list = this.attendees;
        EventCreateV1InputNewEventsItemAvailability eventCreateV1InputNewEventsItemAvailability = this.availability;
        String str = this.calendar_id;
        OffsetDateTime offsetDateTime = this.end_time;
        String str2 = this.event_description;
        String str3 = this.location;
        List<EventCreateV1InputNewEventsItemNudgesItem> list2 = this.nudges;
        EventCreateV1InputNewEventsItemRecurrence eventCreateV1InputNewEventsItemRecurrence = this.recurrence;
        OffsetDateTime offsetDateTime2 = this.start_time;
        EventCreateV1InputNewEventsItemStatus eventCreateV1InputNewEventsItemStatus = this.status;
        String str4 = this.title;
        StringBuilder sb = new StringBuilder("EventCreateV1InputNewEventsItem(all_day=");
        sb.append(bool);
        sb.append(", attendees=");
        sb.append(list);
        sb.append(", availability=");
        sb.append(eventCreateV1InputNewEventsItemAvailability);
        sb.append(", calendar_id=");
        sb.append(str);
        sb.append(", end_time=");
        sb.append(offsetDateTime);
        sb.append(", event_description=");
        sb.append(str2);
        sb.append(", location=");
        qy1.p(str3, ", nudges=", ", recurrence=", sb, list2);
        sb.append(eventCreateV1InputNewEventsItemRecurrence);
        sb.append(", start_time=");
        sb.append(offsetDateTime2);
        sb.append(", status=");
        sb.append(eventCreateV1InputNewEventsItemStatus);
        sb.append(", title=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public EventCreateV1InputNewEventsItem(Boolean bool, List<String> list, EventCreateV1InputNewEventsItemAvailability eventCreateV1InputNewEventsItemAvailability, String str, OffsetDateTime offsetDateTime, String str2, String str3, List<EventCreateV1InputNewEventsItemNudgesItem> list2, EventCreateV1InputNewEventsItemRecurrence eventCreateV1InputNewEventsItemRecurrence, OffsetDateTime offsetDateTime2, EventCreateV1InputNewEventsItemStatus eventCreateV1InputNewEventsItemStatus, String str4) {
        offsetDateTime2.getClass();
        str4.getClass();
        this.all_day = bool;
        this.attendees = list;
        this.availability = eventCreateV1InputNewEventsItemAvailability;
        this.calendar_id = str;
        this.end_time = offsetDateTime;
        this.event_description = str2;
        this.location = str3;
        this.nudges = list2;
        this.recurrence = eventCreateV1InputNewEventsItemRecurrence;
        this.start_time = offsetDateTime2;
        this.status = eventCreateV1InputNewEventsItemStatus;
        this.title = str4;
    }

    public /* synthetic */ EventCreateV1InputNewEventsItem(Boolean bool, List list, EventCreateV1InputNewEventsItemAvailability eventCreateV1InputNewEventsItemAvailability, String str, OffsetDateTime offsetDateTime, String str2, String str3, List list2, EventCreateV1InputNewEventsItemRecurrence eventCreateV1InputNewEventsItemRecurrence, OffsetDateTime offsetDateTime2, EventCreateV1InputNewEventsItemStatus eventCreateV1InputNewEventsItemStatus, String str4, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : eventCreateV1InputNewEventsItemAvailability, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : offsetDateTime, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : list2, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : eventCreateV1InputNewEventsItemRecurrence, offsetDateTime2, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? null : eventCreateV1InputNewEventsItemStatus, str4);
    }
}
