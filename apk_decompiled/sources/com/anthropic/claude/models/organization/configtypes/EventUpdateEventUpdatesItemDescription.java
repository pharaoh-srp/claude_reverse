package com.anthropic.claude.models.organization.configtypes;

import defpackage.d27;
import defpackage.gvj;
import defpackage.h27;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x17;
import defpackage.x44;
import defpackage.y17;
import defpackage.y6a;
import defpackage.z17;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 T2\u00020\u0001:\u0002UVB\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016B±\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001dJ\u0010\u0010&\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001dJ\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u001dJ\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\u001dJ¦\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010\u001dJ\u0010\u00102\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107J'\u0010@\u001a\u00020=2\u0006\u00108\u001a\u00020\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;H\u0001¢\u0006\u0004\b>\u0010?R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010A\u001a\u0004\bC\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bD\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010A\u001a\u0004\bE\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010A\u001a\u0004\bF\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010A\u001a\u0004\bG\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010A\u001a\u0004\bH\u0010\u001dR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010A\u001a\u0004\bI\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010A\u001a\u0004\bJ\u0010\u001dR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010K\u001a\u0004\bL\u0010'R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010M\u001a\u0004\bN\u0010)R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010O\u001a\u0004\bP\u0010+R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010A\u001a\u0004\bQ\u0010\u001dR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010A\u001a\u0004\bR\u0010\u001dR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010A\u001a\u0004\bS\u0010\u001d¨\u0006W"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/EventUpdateEventUpdatesItemDescription;", "", "", "description", "all_day", "attendees", "availability", "calendar_id", "end_time", "event_description", "event_id", "location", "Lcom/anthropic/claude/models/organization/configtypes/EventUpdateEventUpdatesItemNudgesArrayDescription;", "nudges", "Lcom/anthropic/claude/models/organization/configtypes/EventUpdateEventUpdatesItemRecurrenceDescription;", "recurrence", "Lcom/anthropic/claude/models/organization/configtypes/EventUpdateEventUpdatesItemRecurrenceSpanDescription;", "recurrence_span", "start_time", "status", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/models/organization/configtypes/EventUpdateEventUpdatesItemNudgesArrayDescription;Lcom/anthropic/claude/models/organization/configtypes/EventUpdateEventUpdatesItemRecurrenceDescription;Lcom/anthropic/claude/models/organization/configtypes/EventUpdateEventUpdatesItemRecurrenceSpanDescription;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/models/organization/configtypes/EventUpdateEventUpdatesItemNudgesArrayDescription;Lcom/anthropic/claude/models/organization/configtypes/EventUpdateEventUpdatesItemRecurrenceDescription;Lcom/anthropic/claude/models/organization/configtypes/EventUpdateEventUpdatesItemRecurrenceSpanDescription;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "()Lcom/anthropic/claude/models/organization/configtypes/EventUpdateEventUpdatesItemNudgesArrayDescription;", "component11", "()Lcom/anthropic/claude/models/organization/configtypes/EventUpdateEventUpdatesItemRecurrenceDescription;", "component12", "()Lcom/anthropic/claude/models/organization/configtypes/EventUpdateEventUpdatesItemRecurrenceSpanDescription;", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/models/organization/configtypes/EventUpdateEventUpdatesItemNudgesArrayDescription;Lcom/anthropic/claude/models/organization/configtypes/EventUpdateEventUpdatesItemRecurrenceDescription;Lcom/anthropic/claude/models/organization/configtypes/EventUpdateEventUpdatesItemRecurrenceSpanDescription;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/models/organization/configtypes/EventUpdateEventUpdatesItemDescription;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/EventUpdateEventUpdatesItemDescription;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getDescription", "getAll_day", "getAttendees", "getAvailability", "getCalendar_id", "getEnd_time", "getEvent_description", "getEvent_id", "getLocation", "Lcom/anthropic/claude/models/organization/configtypes/EventUpdateEventUpdatesItemNudgesArrayDescription;", "getNudges", "Lcom/anthropic/claude/models/organization/configtypes/EventUpdateEventUpdatesItemRecurrenceDescription;", "getRecurrence", "Lcom/anthropic/claude/models/organization/configtypes/EventUpdateEventUpdatesItemRecurrenceSpanDescription;", "getRecurrence_span", "getStart_time", "getStatus", "getTitle", "Companion", "x17", "y17", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class EventUpdateEventUpdatesItemDescription {
    public static final int $stable = 0;
    public static final y17 Companion = new y17();
    private final String all_day;
    private final String attendees;
    private final String availability;
    private final String calendar_id;
    private final String description;
    private final String end_time;
    private final String event_description;
    private final String event_id;
    private final String location;
    private final EventUpdateEventUpdatesItemNudgesArrayDescription nudges;
    private final EventUpdateEventUpdatesItemRecurrenceDescription recurrence;
    private final EventUpdateEventUpdatesItemRecurrenceSpanDescription recurrence_span;
    private final String start_time;
    private final String status;
    private final String title;

    public EventUpdateEventUpdatesItemDescription(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, EventUpdateEventUpdatesItemNudgesArrayDescription eventUpdateEventUpdatesItemNudgesArrayDescription, EventUpdateEventUpdatesItemRecurrenceDescription eventUpdateEventUpdatesItemRecurrenceDescription, EventUpdateEventUpdatesItemRecurrenceSpanDescription eventUpdateEventUpdatesItemRecurrenceSpanDescription, String str10, String str11, String str12) {
        y6a.s(str, str2, str3, str4, str5);
        str6.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        eventUpdateEventUpdatesItemNudgesArrayDescription.getClass();
        eventUpdateEventUpdatesItemRecurrenceDescription.getClass();
        eventUpdateEventUpdatesItemRecurrenceSpanDescription.getClass();
        str10.getClass();
        str11.getClass();
        str12.getClass();
        this.description = str;
        this.all_day = str2;
        this.attendees = str3;
        this.availability = str4;
        this.calendar_id = str5;
        this.end_time = str6;
        this.event_description = str7;
        this.event_id = str8;
        this.location = str9;
        this.nudges = eventUpdateEventUpdatesItemNudgesArrayDescription;
        this.recurrence = eventUpdateEventUpdatesItemRecurrenceDescription;
        this.recurrence_span = eventUpdateEventUpdatesItemRecurrenceSpanDescription;
        this.start_time = str10;
        this.status = str11;
        this.title = str12;
    }

    public static final /* synthetic */ void write$Self$models(EventUpdateEventUpdatesItemDescription self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.description);
        output.q(serialDesc, 1, self.all_day);
        output.q(serialDesc, 2, self.attendees);
        output.q(serialDesc, 3, self.availability);
        output.q(serialDesc, 4, self.calendar_id);
        output.q(serialDesc, 5, self.end_time);
        output.q(serialDesc, 6, self.event_description);
        output.q(serialDesc, 7, self.event_id);
        output.q(serialDesc, 8, self.location);
        output.r(serialDesc, 9, z17.a, self.nudges);
        output.r(serialDesc, 10, d27.a, self.recurrence);
        output.r(serialDesc, 11, h27.a, self.recurrence_span);
        output.q(serialDesc, 12, self.start_time);
        output.q(serialDesc, 13, self.status);
        output.q(serialDesc, 14, self.title);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final EventUpdateEventUpdatesItemNudgesArrayDescription getNudges() {
        return this.nudges;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final EventUpdateEventUpdatesItemRecurrenceDescription getRecurrence() {
        return this.recurrence;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final EventUpdateEventUpdatesItemRecurrenceSpanDescription getRecurrence_span() {
        return this.recurrence_span;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getStart_time() {
        return this.start_time;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
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
    public final String getEvent_id() {
        return this.event_id;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    public final EventUpdateEventUpdatesItemDescription copy(String description, String all_day, String attendees, String availability, String calendar_id, String end_time, String event_description, String event_id, String location, EventUpdateEventUpdatesItemNudgesArrayDescription nudges, EventUpdateEventUpdatesItemRecurrenceDescription recurrence, EventUpdateEventUpdatesItemRecurrenceSpanDescription recurrence_span, String start_time, String status, String title) {
        y6a.s(description, all_day, attendees, availability, calendar_id);
        end_time.getClass();
        event_description.getClass();
        event_id.getClass();
        location.getClass();
        nudges.getClass();
        recurrence.getClass();
        recurrence_span.getClass();
        start_time.getClass();
        status.getClass();
        title.getClass();
        return new EventUpdateEventUpdatesItemDescription(description, all_day, attendees, availability, calendar_id, end_time, event_description, event_id, location, nudges, recurrence, recurrence_span, start_time, status, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventUpdateEventUpdatesItemDescription)) {
            return false;
        }
        EventUpdateEventUpdatesItemDescription eventUpdateEventUpdatesItemDescription = (EventUpdateEventUpdatesItemDescription) other;
        return x44.r(this.description, eventUpdateEventUpdatesItemDescription.description) && x44.r(this.all_day, eventUpdateEventUpdatesItemDescription.all_day) && x44.r(this.attendees, eventUpdateEventUpdatesItemDescription.attendees) && x44.r(this.availability, eventUpdateEventUpdatesItemDescription.availability) && x44.r(this.calendar_id, eventUpdateEventUpdatesItemDescription.calendar_id) && x44.r(this.end_time, eventUpdateEventUpdatesItemDescription.end_time) && x44.r(this.event_description, eventUpdateEventUpdatesItemDescription.event_description) && x44.r(this.event_id, eventUpdateEventUpdatesItemDescription.event_id) && x44.r(this.location, eventUpdateEventUpdatesItemDescription.location) && x44.r(this.nudges, eventUpdateEventUpdatesItemDescription.nudges) && x44.r(this.recurrence, eventUpdateEventUpdatesItemDescription.recurrence) && x44.r(this.recurrence_span, eventUpdateEventUpdatesItemDescription.recurrence_span) && x44.r(this.start_time, eventUpdateEventUpdatesItemDescription.start_time) && x44.r(this.status, eventUpdateEventUpdatesItemDescription.status) && x44.r(this.title, eventUpdateEventUpdatesItemDescription.title);
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

    public final String getEvent_id() {
        return this.event_id;
    }

    public final String getLocation() {
        return this.location;
    }

    public final EventUpdateEventUpdatesItemNudgesArrayDescription getNudges() {
        return this.nudges;
    }

    public final EventUpdateEventUpdatesItemRecurrenceDescription getRecurrence() {
        return this.recurrence;
    }

    public final EventUpdateEventUpdatesItemRecurrenceSpanDescription getRecurrence_span() {
        return this.recurrence_span;
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
        return this.title.hashCode() + kgh.l(kgh.l((this.recurrence_span.hashCode() + ((this.recurrence.hashCode() + ((this.nudges.hashCode() + kgh.l(kgh.l(kgh.l(kgh.l(kgh.l(kgh.l(kgh.l(kgh.l(this.description.hashCode() * 31, 31, this.all_day), 31, this.attendees), 31, this.availability), 31, this.calendar_id), 31, this.end_time), 31, this.event_description), 31, this.event_id), 31, this.location)) * 31)) * 31)) * 31, 31, this.start_time), 31, this.status);
    }

    public String toString() {
        String str = this.description;
        String str2 = this.all_day;
        String str3 = this.attendees;
        String str4 = this.availability;
        String str5 = this.calendar_id;
        String str6 = this.end_time;
        String str7 = this.event_description;
        String str8 = this.event_id;
        String str9 = this.location;
        EventUpdateEventUpdatesItemNudgesArrayDescription eventUpdateEventUpdatesItemNudgesArrayDescription = this.nudges;
        EventUpdateEventUpdatesItemRecurrenceDescription eventUpdateEventUpdatesItemRecurrenceDescription = this.recurrence;
        EventUpdateEventUpdatesItemRecurrenceSpanDescription eventUpdateEventUpdatesItemRecurrenceSpanDescription = this.recurrence_span;
        String str10 = this.start_time;
        String str11 = this.status;
        String str12 = this.title;
        StringBuilder sbR = kgh.r("EventUpdateEventUpdatesItemDescription(description=", str, ", all_day=", str2, ", attendees=");
        kgh.u(sbR, str3, ", availability=", str4, ", calendar_id=");
        kgh.u(sbR, str5, ", end_time=", str6, ", event_description=");
        kgh.u(sbR, str7, ", event_id=", str8, ", location=");
        sbR.append(str9);
        sbR.append(", nudges=");
        sbR.append(eventUpdateEventUpdatesItemNudgesArrayDescription);
        sbR.append(", recurrence=");
        sbR.append(eventUpdateEventUpdatesItemRecurrenceDescription);
        sbR.append(", recurrence_span=");
        sbR.append(eventUpdateEventUpdatesItemRecurrenceSpanDescription);
        sbR.append(", start_time=");
        kgh.u(sbR, str10, ", status=", str11, ", title=");
        return ij0.m(sbR, str12, ")");
    }

    public /* synthetic */ EventUpdateEventUpdatesItemDescription(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, EventUpdateEventUpdatesItemNudgesArrayDescription eventUpdateEventUpdatesItemNudgesArrayDescription, EventUpdateEventUpdatesItemRecurrenceDescription eventUpdateEventUpdatesItemRecurrenceDescription, EventUpdateEventUpdatesItemRecurrenceSpanDescription eventUpdateEventUpdatesItemRecurrenceSpanDescription, String str10, String str11, String str12, vnf vnfVar) {
        if (32767 != (i & 32767)) {
            gvj.f(i, 32767, x17.a.getDescriptor());
            throw null;
        }
        this.description = str;
        this.all_day = str2;
        this.attendees = str3;
        this.availability = str4;
        this.calendar_id = str5;
        this.end_time = str6;
        this.event_description = str7;
        this.event_id = str8;
        this.location = str9;
        this.nudges = eventUpdateEventUpdatesItemNudgesArrayDescription;
        this.recurrence = eventUpdateEventUpdatesItemRecurrenceDescription;
        this.recurrence_span = eventUpdateEventUpdatesItemRecurrenceSpanDescription;
        this.start_time = str10;
        this.status = str11;
        this.title = str12;
    }
}
