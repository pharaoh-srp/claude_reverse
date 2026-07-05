package com.anthropic.claude.models.organization.configtypes;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.gvj;
import defpackage.hv6;
import defpackage.iv6;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.vv6;
import defpackage.x44;
import defpackage.y6a;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:;BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rBk\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001dJ`\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b3\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b4\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010#R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b7\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b8\u0010\u001d¨\u0006<"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/EventCreateInputDescriptions;", "", "", "tool_description", "all_day", "description", "end_time", "location", "Lcom/anthropic/claude/models/organization/configtypes/EventCreateRecurrenceDescription;", "recurrence", "start_time", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/models/organization/configtypes/EventCreateRecurrenceDescription;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/models/organization/configtypes/EventCreateRecurrenceDescription;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/EventCreateInputDescriptions;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/anthropic/claude/models/organization/configtypes/EventCreateRecurrenceDescription;", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/models/organization/configtypes/EventCreateRecurrenceDescription;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/models/organization/configtypes/EventCreateInputDescriptions;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTool_description", "getAll_day", "getDescription", "getEnd_time", "getLocation", "Lcom/anthropic/claude/models/organization/configtypes/EventCreateRecurrenceDescription;", "getRecurrence", "getStart_time", "getTitle", "Companion", "hv6", "iv6", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class EventCreateInputDescriptions {
    public static final int $stable = 0;
    public static final iv6 Companion = new iv6();
    private final String all_day;
    private final String description;
    private final String end_time;
    private final String location;
    private final EventCreateRecurrenceDescription recurrence;
    private final String start_time;
    private final String title;
    private final String tool_description;

    public /* synthetic */ EventCreateInputDescriptions(int i, String str, String str2, String str3, String str4, String str5, EventCreateRecurrenceDescription eventCreateRecurrenceDescription, String str6, String str7, vnf vnfVar) {
        if (255 != (i & 255)) {
            gvj.f(i, 255, hv6.a.getDescriptor());
            throw null;
        }
        this.tool_description = str;
        this.all_day = str2;
        this.description = str3;
        this.end_time = str4;
        this.location = str5;
        this.recurrence = eventCreateRecurrenceDescription;
        this.start_time = str6;
        this.title = str7;
    }

    public static /* synthetic */ EventCreateInputDescriptions copy$default(EventCreateInputDescriptions eventCreateInputDescriptions, String str, String str2, String str3, String str4, String str5, EventCreateRecurrenceDescription eventCreateRecurrenceDescription, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventCreateInputDescriptions.tool_description;
        }
        if ((i & 2) != 0) {
            str2 = eventCreateInputDescriptions.all_day;
        }
        if ((i & 4) != 0) {
            str3 = eventCreateInputDescriptions.description;
        }
        if ((i & 8) != 0) {
            str4 = eventCreateInputDescriptions.end_time;
        }
        if ((i & 16) != 0) {
            str5 = eventCreateInputDescriptions.location;
        }
        if ((i & 32) != 0) {
            eventCreateRecurrenceDescription = eventCreateInputDescriptions.recurrence;
        }
        if ((i & 64) != 0) {
            str6 = eventCreateInputDescriptions.start_time;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            str7 = eventCreateInputDescriptions.title;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        EventCreateRecurrenceDescription eventCreateRecurrenceDescription2 = eventCreateRecurrenceDescription;
        return eventCreateInputDescriptions.copy(str, str2, str3, str4, str10, eventCreateRecurrenceDescription2, str8, str9);
    }

    public static final /* synthetic */ void write$Self$models(EventCreateInputDescriptions self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.tool_description);
        output.q(serialDesc, 1, self.all_day);
        output.q(serialDesc, 2, self.description);
        output.q(serialDesc, 3, self.end_time);
        output.q(serialDesc, 4, self.location);
        output.r(serialDesc, 5, vv6.a, self.recurrence);
        output.q(serialDesc, 6, self.start_time);
        output.q(serialDesc, 7, self.title);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTool_description() {
        return this.tool_description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAll_day() {
        return this.all_day;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEnd_time() {
        return this.end_time;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final EventCreateRecurrenceDescription getRecurrence() {
        return this.recurrence;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStart_time() {
        return this.start_time;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final EventCreateInputDescriptions copy(String tool_description, String all_day, String description, String end_time, String location, EventCreateRecurrenceDescription recurrence, String start_time, String title) {
        y6a.s(tool_description, all_day, description, end_time, location);
        recurrence.getClass();
        start_time.getClass();
        title.getClass();
        return new EventCreateInputDescriptions(tool_description, all_day, description, end_time, location, recurrence, start_time, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventCreateInputDescriptions)) {
            return false;
        }
        EventCreateInputDescriptions eventCreateInputDescriptions = (EventCreateInputDescriptions) other;
        return x44.r(this.tool_description, eventCreateInputDescriptions.tool_description) && x44.r(this.all_day, eventCreateInputDescriptions.all_day) && x44.r(this.description, eventCreateInputDescriptions.description) && x44.r(this.end_time, eventCreateInputDescriptions.end_time) && x44.r(this.location, eventCreateInputDescriptions.location) && x44.r(this.recurrence, eventCreateInputDescriptions.recurrence) && x44.r(this.start_time, eventCreateInputDescriptions.start_time) && x44.r(this.title, eventCreateInputDescriptions.title);
    }

    public final String getAll_day() {
        return this.all_day;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEnd_time() {
        return this.end_time;
    }

    public final String getLocation() {
        return this.location;
    }

    public final EventCreateRecurrenceDescription getRecurrence() {
        return this.recurrence;
    }

    public final String getStart_time() {
        return this.start_time;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTool_description() {
        return this.tool_description;
    }

    public int hashCode() {
        return this.title.hashCode() + kgh.l((this.recurrence.hashCode() + kgh.l(kgh.l(kgh.l(kgh.l(this.tool_description.hashCode() * 31, 31, this.all_day), 31, this.description), 31, this.end_time), 31, this.location)) * 31, 31, this.start_time);
    }

    public String toString() {
        String str = this.tool_description;
        String str2 = this.all_day;
        String str3 = this.description;
        String str4 = this.end_time;
        String str5 = this.location;
        EventCreateRecurrenceDescription eventCreateRecurrenceDescription = this.recurrence;
        String str6 = this.start_time;
        String str7 = this.title;
        StringBuilder sbR = kgh.r("EventCreateInputDescriptions(tool_description=", str, ", all_day=", str2, ", description=");
        kgh.u(sbR, str3, ", end_time=", str4, ", location=");
        sbR.append(str5);
        sbR.append(", recurrence=");
        sbR.append(eventCreateRecurrenceDescription);
        sbR.append(", start_time=");
        return vb7.t(sbR, str6, ", title=", str7, ")");
    }

    public EventCreateInputDescriptions(String str, String str2, String str3, String str4, String str5, EventCreateRecurrenceDescription eventCreateRecurrenceDescription, String str6, String str7) {
        y6a.s(str, str2, str3, str4, str5);
        eventCreateRecurrenceDescription.getClass();
        str6.getClass();
        str7.getClass();
        this.tool_description = str;
        this.all_day = str2;
        this.description = str3;
        this.end_time = str4;
        this.location = str5;
        this.recurrence = eventCreateRecurrenceDescription;
        this.start_time = str6;
        this.title = str7;
    }
}
