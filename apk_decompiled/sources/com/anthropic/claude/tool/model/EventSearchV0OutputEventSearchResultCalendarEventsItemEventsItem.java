package com.anthropic.claude.tool.model;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.a17;
import defpackage.ay6;
import defpackage.e17;
import defpackage.fw6;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.q17;
import defpackage.qy1;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w07;
import defpackage.w1a;
import defpackage.x07;
import defpackage.x44;
import defpackage.yb5;
import defpackage.z07;
import defpackage.znf;
import defpackage.zt1;
import java.time.OffsetDateTime;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 [2\u00020\u0001:\u0002\\]BË\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u001f\b\u0002\u0010\u000e\u001a\u0019\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0019\u0010\u0017\u001a\u00150\tj\u0002`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cB©\u0001\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001b\u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b&\u0010'J'\u0010(\u001a\u0019\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b,\u0010+J\u0012\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b-\u0010+J\u0018\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b.\u0010%J\u0012\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b/\u0010+J\u0012\u00100\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b0\u00101J#\u00102\u001a\u00150\tj\u0002`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\b2\u0010)J\u0012\u00103\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b5\u0010+JÚ\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u001f\b\u0002\u0010\u000e\u001a\u0019\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u001b\b\u0002\u0010\u0017\u001a\u00150\tj\u0002`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b8\u0010+J\u0010\u00109\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010<\u001a\u00020\u00022\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b<\u0010=J'\u0010F\u001a\u00020C2\u0006\u0010>\u001a\u00020\u00002\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020AH\u0001¢\u0006\u0004\bD\u0010ER\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010G\u001a\u0004\bH\u0010#R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010I\u001a\u0004\bJ\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010K\u001a\u0004\bL\u0010'R.\u0010\u000e\u001a\u0019\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010M\u001a\u0004\bN\u0010)R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010O\u001a\u0004\bP\u0010+R\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010O\u001a\u0004\bQ\u0010+R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010O\u001a\u0004\bR\u0010+R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010I\u001a\u0004\bS\u0010%R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010O\u001a\u0004\bT\u0010+R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010U\u001a\u0004\bV\u00101R*\u0010\u0017\u001a\u00150\tj\u0002`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006¢\u0006\f\n\u0004\b\u0017\u0010M\u001a\u0004\bW\u0010)R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010X\u001a\u0004\bY\u00104R\u0017\u0010\u001a\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010O\u001a\u0004\bZ\u0010+¨\u0006^"}, d2 = {"Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem;", "", "", "all_day", "", "", "attendees", "Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability;", "availability", "Ljava/time/OffsetDateTime;", "Lcom/anthropic/claude/tool/model/EventDateTime;", "Lonf;", "with", "Lay6;", "end_time", "event_description", "event_id", "location", "Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem;", "nudges", "organizer", "Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrence;", "recurrence", "start_time", "Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus;", "status", "title", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrence;Ljava/time/OffsetDateTime;Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/util/List;Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrence;Ljava/time/OffsetDateTime;Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus;Ljava/lang/String;Lvnf;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/util/List;", "component3", "()Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability;", "component4", "()Ljava/time/OffsetDateTime;", "component5", "()Ljava/lang/String;", "component6", "component7", "component8", "component9", "component10", "()Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrence;", "component11", "component12", "()Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus;", "component13", "copy", "(Ljava/lang/Boolean;Ljava/util/List;Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrence;Ljava/time/OffsetDateTime;Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus;Ljava/lang/String;)Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/Boolean;", "getAll_day", "Ljava/util/List;", "getAttendees", "Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability;", "getAvailability", "Ljava/time/OffsetDateTime;", "getEnd_time", "Ljava/lang/String;", "getEvent_description", "getEvent_id", "getLocation", "getNudges", "getOrganizer", "Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrence;", "getRecurrence", "getStart_time", "Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus;", "getStatus", "getTitle", "Companion", "w07", "x07", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem {
    private static final kw9[] $childSerializers;
    public static final x07 Companion = new x07();
    private final Boolean all_day;
    private final List<String> attendees;
    private final EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability availability;
    private final OffsetDateTime end_time;
    private final String event_description;
    private final String event_id;
    private final String location;
    private final List<EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem> nudges;
    private final String organizer;
    private final EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrence recurrence;
    private final OffsetDateTime start_time;
    private final EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus status;
    private final String title;

    static {
        fw6 fw6Var = new fw6(22);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, yb5.w(w1aVar, fw6Var), null, null, null, null, null, yb5.w(w1aVar, new fw6(23)), null, null, null, null, null};
    }

    public /* synthetic */ EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem(int i, Boolean bool, List list, EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability, OffsetDateTime offsetDateTime, String str, String str2, String str3, List list2, String str4, EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrence eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrence, OffsetDateTime offsetDateTime2, EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus, String str5, vnf vnfVar) {
        if (5152 != (i & 5152)) {
            gvj.f(i, 5152, w07.a.getDescriptor());
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
            this.availability = eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability;
        }
        if ((i & 8) == 0) {
            this.end_time = null;
        } else {
            this.end_time = offsetDateTime;
        }
        if ((i & 16) == 0) {
            this.event_description = null;
        } else {
            this.event_description = str;
        }
        this.event_id = str2;
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
            this.organizer = null;
        } else {
            this.organizer = str4;
        }
        if ((i & 512) == 0) {
            this.recurrence = null;
        } else {
            this.recurrence = eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrence;
        }
        this.start_time = offsetDateTime2;
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 0) {
            this.status = null;
        } else {
            this.status = eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus;
        }
        this.title = str5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(a17.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem copy$default(EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem, Boolean bool, List list, EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability, OffsetDateTime offsetDateTime, String str, String str2, String str3, List list2, String str4, EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrence eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrence, OffsetDateTime offsetDateTime2, EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem.all_day;
        }
        return eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem.copy(bool, (i & 2) != 0 ? eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem.attendees : list, (i & 4) != 0 ? eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem.availability : eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability, (i & 8) != 0 ? eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem.end_time : offsetDateTime, (i & 16) != 0 ? eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem.event_description : str, (i & 32) != 0 ? eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem.event_id : str2, (i & 64) != 0 ? eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem.location : str3, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem.nudges : list2, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem.organizer : str4, (i & 512) != 0 ? eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem.recurrence : eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrence, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem.start_time : offsetDateTime2, (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem.status : eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus, (i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem.title : str5);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.all_day != null) {
            output.B(serialDesc, 0, zt1.a, self.all_day);
        }
        if (output.E(serialDesc) || self.attendees != null) {
            output.B(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.attendees);
        }
        if (output.E(serialDesc) || self.availability != null) {
            output.B(serialDesc, 2, z07.d, self.availability);
        }
        if (output.E(serialDesc) || self.end_time != null) {
            output.B(serialDesc, 3, ay6.a, self.end_time);
        }
        if (output.E(serialDesc) || self.event_description != null) {
            output.B(serialDesc, 4, srg.a, self.event_description);
        }
        output.q(serialDesc, 5, self.event_id);
        if (output.E(serialDesc) || self.location != null) {
            output.B(serialDesc, 6, srg.a, self.location);
        }
        if (output.E(serialDesc) || self.nudges != null) {
            output.B(serialDesc, 7, (znf) kw9VarArr[7].getValue(), self.nudges);
        }
        if (output.E(serialDesc) || self.organizer != null) {
            output.B(serialDesc, 8, srg.a, self.organizer);
        }
        if (output.E(serialDesc) || self.recurrence != null) {
            output.B(serialDesc, 9, e17.a, self.recurrence);
        }
        output.r(serialDesc, 10, ay6.a, self.start_time);
        if (output.E(serialDesc) || self.status != null) {
            output.B(serialDesc, 11, q17.d, self.status);
        }
        output.q(serialDesc, 12, self.title);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getAll_day() {
        return this.all_day;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrence getRecurrence() {
        return this.recurrence;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final OffsetDateTime getStart_time() {
        return this.start_time;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<String> component2() {
        return this.attendees;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability getAvailability() {
        return this.availability;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final OffsetDateTime getEnd_time() {
        return this.end_time;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEvent_description() {
        return this.event_description;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEvent_id() {
        return this.event_id;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    public final List<EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem> component8() {
        return this.nudges;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getOrganizer() {
        return this.organizer;
    }

    public final EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem copy(Boolean all_day, List<String> attendees, EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability availability, OffsetDateTime end_time, String event_description, String event_id, String location, List<EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem> nudges, String organizer, EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrence recurrence, OffsetDateTime start_time, EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus status, String title) {
        event_id.getClass();
        start_time.getClass();
        title.getClass();
        return new EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem(all_day, attendees, availability, end_time, event_description, event_id, location, nudges, organizer, recurrence, start_time, status, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem)) {
            return false;
        }
        EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem = (EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem) other;
        return x44.r(this.all_day, eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem.all_day) && x44.r(this.attendees, eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem.attendees) && this.availability == eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem.availability && x44.r(this.end_time, eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem.end_time) && x44.r(this.event_description, eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem.event_description) && x44.r(this.event_id, eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem.event_id) && x44.r(this.location, eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem.location) && x44.r(this.nudges, eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem.nudges) && x44.r(this.organizer, eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem.organizer) && x44.r(this.recurrence, eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem.recurrence) && x44.r(this.start_time, eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem.start_time) && this.status == eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem.status && x44.r(this.title, eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem.title);
    }

    public final Boolean getAll_day() {
        return this.all_day;
    }

    public final List<String> getAttendees() {
        return this.attendees;
    }

    public final EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability getAvailability() {
        return this.availability;
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

    public final List<EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem> getNudges() {
        return this.nudges;
    }

    public final String getOrganizer() {
        return this.organizer;
    }

    public final EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrence getRecurrence() {
        return this.recurrence;
    }

    public final OffsetDateTime getStart_time() {
        return this.start_time;
    }

    public final EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus getStatus() {
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
        EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability = this.availability;
        int iHashCode3 = (iHashCode2 + (eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability == null ? 0 : eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability.hashCode())) * 31;
        OffsetDateTime offsetDateTime = this.end_time;
        int iHashCode4 = (iHashCode3 + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        String str = this.event_description;
        int iL = kgh.l((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31, 31, this.event_id);
        String str2 = this.location;
        int iHashCode5 = (iL + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem> list2 = this.nudges;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.organizer;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrence eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrence = this.recurrence;
        int iHashCode8 = (this.start_time.hashCode() + ((iHashCode7 + (eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrence == null ? 0 : eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrence.hashCode())) * 31)) * 31;
        EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus = this.status;
        return this.title.hashCode() + ((iHashCode8 + (eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus != null ? eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus.hashCode() : 0)) * 31);
    }

    public String toString() {
        Boolean bool = this.all_day;
        List<String> list = this.attendees;
        EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability = this.availability;
        OffsetDateTime offsetDateTime = this.end_time;
        String str = this.event_description;
        String str2 = this.event_id;
        String str3 = this.location;
        List<EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem> list2 = this.nudges;
        String str4 = this.organizer;
        EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrence eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrence = this.recurrence;
        OffsetDateTime offsetDateTime2 = this.start_time;
        EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus = this.status;
        String str5 = this.title;
        StringBuilder sb = new StringBuilder("EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem(all_day=");
        sb.append(bool);
        sb.append(", attendees=");
        sb.append(list);
        sb.append(", availability=");
        sb.append(eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability);
        sb.append(", end_time=");
        sb.append(offsetDateTime);
        sb.append(", event_description=");
        kgh.u(sb, str, ", event_id=", str2, ", location=");
        qy1.p(str3, ", nudges=", ", organizer=", sb, list2);
        sb.append(str4);
        sb.append(", recurrence=");
        sb.append(eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrence);
        sb.append(", start_time=");
        sb.append(offsetDateTime2);
        sb.append(", status=");
        sb.append(eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus);
        sb.append(", title=");
        return ij0.m(sb, str5, ")");
    }

    public EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem(Boolean bool, List<String> list, EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability, OffsetDateTime offsetDateTime, String str, String str2, String str3, List<EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem> list2, String str4, EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrence eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrence, OffsetDateTime offsetDateTime2, EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus, String str5) {
        str2.getClass();
        offsetDateTime2.getClass();
        str5.getClass();
        this.all_day = bool;
        this.attendees = list;
        this.availability = eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability;
        this.end_time = offsetDateTime;
        this.event_description = str;
        this.event_id = str2;
        this.location = str3;
        this.nudges = list2;
        this.organizer = str4;
        this.recurrence = eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrence;
        this.start_time = offsetDateTime2;
        this.status = eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus;
        this.title = str5;
    }

    public /* synthetic */ EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem(Boolean bool, List list, EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability, OffsetDateTime offsetDateTime, String str, String str2, String str3, List list2, String str4, EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrence eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrence, OffsetDateTime offsetDateTime2, EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus, String str5, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability, (i & 8) != 0 ? null : offsetDateTime, (i & 16) != 0 ? null : str, str2, (i & 64) != 0 ? null : str3, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : list2, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : str4, (i & 512) != 0 ? null : eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrence, offsetDateTime2, (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? null : eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus, str5);
    }
}
