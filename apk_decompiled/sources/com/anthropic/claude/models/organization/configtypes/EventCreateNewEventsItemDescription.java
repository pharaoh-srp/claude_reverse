package com.anthropic.claude.models.organization.configtypes;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.grc;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.lv6;
import defpackage.mdj;
import defpackage.mv6;
import defpackage.nv6;
import defpackage.onf;
import defpackage.rv6;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.y6a;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 K2\u00020\u0001:\u0002LMBo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013B\u009d\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001aJ\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001aJ\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001aJ\u0092\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001aJ\u0010\u0010,\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101J'\u0010:\u001a\u0002072\u0006\u00102\u001a\u00020\u00002\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0001¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010;\u001a\u0004\b=\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b>\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b?\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b@\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\bA\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\bB\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\bC\u0010\u001aR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010D\u001a\u0004\bE\u0010#R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010F\u001a\u0004\bG\u0010%R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\bH\u0010\u001aR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\bI\u0010\u001aR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010;\u001a\u0004\bJ\u0010\u001a¨\u0006N"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/EventCreateNewEventsItemDescription;", "", "", "description", "all_day", "attendees", "availability", "calendar_id", "end_time", "event_description", "location", "Lcom/anthropic/claude/models/organization/configtypes/EventCreateNewEventsItemNudgesArrayDescription;", "nudges", "Lcom/anthropic/claude/models/organization/configtypes/EventCreateNewEventsItemRecurrenceDescription;", "recurrence", "start_time", "status", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/models/organization/configtypes/EventCreateNewEventsItemNudgesArrayDescription;Lcom/anthropic/claude/models/organization/configtypes/EventCreateNewEventsItemRecurrenceDescription;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/models/organization/configtypes/EventCreateNewEventsItemNudgesArrayDescription;Lcom/anthropic/claude/models/organization/configtypes/EventCreateNewEventsItemRecurrenceDescription;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Lcom/anthropic/claude/models/organization/configtypes/EventCreateNewEventsItemNudgesArrayDescription;", "component10", "()Lcom/anthropic/claude/models/organization/configtypes/EventCreateNewEventsItemRecurrenceDescription;", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/models/organization/configtypes/EventCreateNewEventsItemNudgesArrayDescription;Lcom/anthropic/claude/models/organization/configtypes/EventCreateNewEventsItemRecurrenceDescription;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/models/organization/configtypes/EventCreateNewEventsItemDescription;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/EventCreateNewEventsItemDescription;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getDescription", "getAll_day", "getAttendees", "getAvailability", "getCalendar_id", "getEnd_time", "getEvent_description", "getLocation", "Lcom/anthropic/claude/models/organization/configtypes/EventCreateNewEventsItemNudgesArrayDescription;", "getNudges", "Lcom/anthropic/claude/models/organization/configtypes/EventCreateNewEventsItemRecurrenceDescription;", "getRecurrence", "getStart_time", "getStatus", "getTitle", "Companion", "lv6", "mv6", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class EventCreateNewEventsItemDescription {
    public static final int $stable = 0;
    public static final mv6 Companion = new mv6();
    private final String all_day;
    private final String attendees;
    private final String availability;
    private final String calendar_id;
    private final String description;
    private final String end_time;
    private final String event_description;
    private final String location;
    private final EventCreateNewEventsItemNudgesArrayDescription nudges;
    private final EventCreateNewEventsItemRecurrenceDescription recurrence;
    private final String start_time;
    private final String status;
    private final String title;

    public EventCreateNewEventsItemDescription(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, EventCreateNewEventsItemNudgesArrayDescription eventCreateNewEventsItemNudgesArrayDescription, EventCreateNewEventsItemRecurrenceDescription eventCreateNewEventsItemRecurrenceDescription, String str9, String str10, String str11) {
        y6a.s(str, str2, str3, str4, str5);
        str6.getClass();
        str7.getClass();
        str8.getClass();
        eventCreateNewEventsItemNudgesArrayDescription.getClass();
        eventCreateNewEventsItemRecurrenceDescription.getClass();
        grc.B(str9, str10, str11);
        this.description = str;
        this.all_day = str2;
        this.attendees = str3;
        this.availability = str4;
        this.calendar_id = str5;
        this.end_time = str6;
        this.event_description = str7;
        this.location = str8;
        this.nudges = eventCreateNewEventsItemNudgesArrayDescription;
        this.recurrence = eventCreateNewEventsItemRecurrenceDescription;
        this.start_time = str9;
        this.status = str10;
        this.title = str11;
    }

    public static /* synthetic */ EventCreateNewEventsItemDescription copy$default(EventCreateNewEventsItemDescription eventCreateNewEventsItemDescription, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, EventCreateNewEventsItemNudgesArrayDescription eventCreateNewEventsItemNudgesArrayDescription, EventCreateNewEventsItemRecurrenceDescription eventCreateNewEventsItemRecurrenceDescription, String str9, String str10, String str11, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventCreateNewEventsItemDescription.description;
        }
        return eventCreateNewEventsItemDescription.copy(str, (i & 2) != 0 ? eventCreateNewEventsItemDescription.all_day : str2, (i & 4) != 0 ? eventCreateNewEventsItemDescription.attendees : str3, (i & 8) != 0 ? eventCreateNewEventsItemDescription.availability : str4, (i & 16) != 0 ? eventCreateNewEventsItemDescription.calendar_id : str5, (i & 32) != 0 ? eventCreateNewEventsItemDescription.end_time : str6, (i & 64) != 0 ? eventCreateNewEventsItemDescription.event_description : str7, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? eventCreateNewEventsItemDescription.location : str8, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? eventCreateNewEventsItemDescription.nudges : eventCreateNewEventsItemNudgesArrayDescription, (i & 512) != 0 ? eventCreateNewEventsItemDescription.recurrence : eventCreateNewEventsItemRecurrenceDescription, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? eventCreateNewEventsItemDescription.start_time : str9, (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? eventCreateNewEventsItemDescription.status : str10, (i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? eventCreateNewEventsItemDescription.title : str11);
    }

    public static final /* synthetic */ void write$Self$models(EventCreateNewEventsItemDescription self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.description);
        output.q(serialDesc, 1, self.all_day);
        output.q(serialDesc, 2, self.attendees);
        output.q(serialDesc, 3, self.availability);
        output.q(serialDesc, 4, self.calendar_id);
        output.q(serialDesc, 5, self.end_time);
        output.q(serialDesc, 6, self.event_description);
        output.q(serialDesc, 7, self.location);
        output.r(serialDesc, 8, nv6.a, self.nudges);
        output.r(serialDesc, 9, rv6.a, self.recurrence);
        output.q(serialDesc, 10, self.start_time);
        output.q(serialDesc, 11, self.status);
        output.q(serialDesc, 12, self.title);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final EventCreateNewEventsItemRecurrenceDescription getRecurrence() {
        return this.recurrence;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getStart_time() {
        return this.start_time;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAll_day() {
        return this.all_day;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAttendees() {
        return this.attendees;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAvailability() {
        return this.availability;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCalendar_id() {
        return this.calendar_id;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEnd_time() {
        return this.end_time;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getEvent_description() {
        return this.event_description;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final EventCreateNewEventsItemNudgesArrayDescription getNudges() {
        return this.nudges;
    }

    public final EventCreateNewEventsItemDescription copy(String description, String all_day, String attendees, String availability, String calendar_id, String end_time, String event_description, String location, EventCreateNewEventsItemNudgesArrayDescription nudges, EventCreateNewEventsItemRecurrenceDescription recurrence, String start_time, String status, String title) {
        y6a.s(description, all_day, attendees, availability, calendar_id);
        end_time.getClass();
        event_description.getClass();
        location.getClass();
        nudges.getClass();
        recurrence.getClass();
        start_time.getClass();
        status.getClass();
        title.getClass();
        return new EventCreateNewEventsItemDescription(description, all_day, attendees, availability, calendar_id, end_time, event_description, location, nudges, recurrence, start_time, status, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventCreateNewEventsItemDescription)) {
            return false;
        }
        EventCreateNewEventsItemDescription eventCreateNewEventsItemDescription = (EventCreateNewEventsItemDescription) other;
        return x44.r(this.description, eventCreateNewEventsItemDescription.description) && x44.r(this.all_day, eventCreateNewEventsItemDescription.all_day) && x44.r(this.attendees, eventCreateNewEventsItemDescription.attendees) && x44.r(this.availability, eventCreateNewEventsItemDescription.availability) && x44.r(this.calendar_id, eventCreateNewEventsItemDescription.calendar_id) && x44.r(this.end_time, eventCreateNewEventsItemDescription.end_time) && x44.r(this.event_description, eventCreateNewEventsItemDescription.event_description) && x44.r(this.location, eventCreateNewEventsItemDescription.location) && x44.r(this.nudges, eventCreateNewEventsItemDescription.nudges) && x44.r(this.recurrence, eventCreateNewEventsItemDescription.recurrence) && x44.r(this.start_time, eventCreateNewEventsItemDescription.start_time) && x44.r(this.status, eventCreateNewEventsItemDescription.status) && x44.r(this.title, eventCreateNewEventsItemDescription.title);
    }

    public final String getAll_day() {
        return this.all_day;
    }

    public final String getAttendees() {
        return this.attendees;
    }

    public final String getAvailability() {
        return this.availability;
    }

    public final String getCalendar_id() {
        return this.calendar_id;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEnd_time() {
        return this.end_time;
    }

    public final String getEvent_description() {
        return this.event_description;
    }

    public final String getLocation() {
        return this.location;
    }

    public final EventCreateNewEventsItemNudgesArrayDescription getNudges() {
        return this.nudges;
    }

    public final EventCreateNewEventsItemRecurrenceDescription getRecurrence() {
        return this.recurrence;
    }

    public final String getStart_time() {
        return this.start_time;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode() + kgh.l(kgh.l((this.recurrence.hashCode() + ((this.nudges.hashCode() + kgh.l(kgh.l(kgh.l(kgh.l(kgh.l(kgh.l(kgh.l(this.description.hashCode() * 31, 31, this.all_day), 31, this.attendees), 31, this.availability), 31, this.calendar_id), 31, this.end_time), 31, this.event_description), 31, this.location)) * 31)) * 31, 31, this.start_time), 31, this.status);
    }

    public String toString() {
        String str = this.description;
        String str2 = this.all_day;
        String str3 = this.attendees;
        String str4 = this.availability;
        String str5 = this.calendar_id;
        String str6 = this.end_time;
        String str7 = this.event_description;
        String str8 = this.location;
        EventCreateNewEventsItemNudgesArrayDescription eventCreateNewEventsItemNudgesArrayDescription = this.nudges;
        EventCreateNewEventsItemRecurrenceDescription eventCreateNewEventsItemRecurrenceDescription = this.recurrence;
        String str9 = this.start_time;
        String str10 = this.status;
        String str11 = this.title;
        StringBuilder sbR = kgh.r("EventCreateNewEventsItemDescription(description=", str, ", all_day=", str2, ", attendees=");
        kgh.u(sbR, str3, ", availability=", str4, ", calendar_id=");
        kgh.u(sbR, str5, ", end_time=", str6, ", event_description=");
        kgh.u(sbR, str7, ", location=", str8, ", nudges=");
        sbR.append(eventCreateNewEventsItemNudgesArrayDescription);
        sbR.append(", recurrence=");
        sbR.append(eventCreateNewEventsItemRecurrenceDescription);
        sbR.append(", start_time=");
        kgh.u(sbR, str9, ", status=", str10, ", title=");
        return ij0.m(sbR, str11, ")");
    }

    public /* synthetic */ EventCreateNewEventsItemDescription(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, EventCreateNewEventsItemNudgesArrayDescription eventCreateNewEventsItemNudgesArrayDescription, EventCreateNewEventsItemRecurrenceDescription eventCreateNewEventsItemRecurrenceDescription, String str9, String str10, String str11, vnf vnfVar) {
        if (8191 != (i & 8191)) {
            gvj.f(i, 8191, lv6.a.getDescriptor());
            throw null;
        }
        this.description = str;
        this.all_day = str2;
        this.attendees = str3;
        this.availability = str4;
        this.calendar_id = str5;
        this.end_time = str6;
        this.event_description = str7;
        this.location = str8;
        this.nudges = eventCreateNewEventsItemNudgesArrayDescription;
        this.recurrence = eventCreateNewEventsItemRecurrenceDescription;
        this.start_time = str9;
        this.status = str10;
        this.title = str11;
    }
}
