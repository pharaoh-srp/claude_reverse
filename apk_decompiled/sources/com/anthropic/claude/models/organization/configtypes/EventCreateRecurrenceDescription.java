package com.anthropic.claude.models.organization.configtypes;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.vv6;
import defpackage.wv6;
import defpackage.x44;
import defpackage.xv6;
import defpackage.y6a;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@ABW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fB\u007f\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001fJt\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b5\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b6\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010#R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b9\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b:\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b;\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b<\u0010\u001fR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b=\u0010\u001fR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b>\u0010\u001f¨\u0006B"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/EventCreateRecurrenceDescription;", "", "", "description", "day_of_month", "days_of_week", "Lcom/anthropic/claude/models/organization/configtypes/EventCreateRecurrenceEndDescription;", "end", "frequency", "human_readable_frequency", "interval", "months", "position", "rrule", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/models/organization/configtypes/EventCreateRecurrenceEndDescription;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/models/organization/configtypes/EventCreateRecurrenceEndDescription;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/EventCreateRecurrenceDescription;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/anthropic/claude/models/organization/configtypes/EventCreateRecurrenceEndDescription;", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/models/organization/configtypes/EventCreateRecurrenceEndDescription;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/models/organization/configtypes/EventCreateRecurrenceDescription;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDescription", "getDay_of_month", "getDays_of_week", "Lcom/anthropic/claude/models/organization/configtypes/EventCreateRecurrenceEndDescription;", "getEnd", "getFrequency", "getHuman_readable_frequency", "getInterval", "getMonths", "getPosition", "getRrule", "Companion", "vv6", "wv6", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class EventCreateRecurrenceDescription {
    public static final int $stable = 0;
    public static final wv6 Companion = new wv6();
    private final String day_of_month;
    private final String days_of_week;
    private final String description;
    private final EventCreateRecurrenceEndDescription end;
    private final String frequency;
    private final String human_readable_frequency;
    private final String interval;
    private final String months;
    private final String position;
    private final String rrule;

    public EventCreateRecurrenceDescription(String str, String str2, String str3, EventCreateRecurrenceEndDescription eventCreateRecurrenceEndDescription, String str4, String str5, String str6, String str7, String str8, String str9) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        eventCreateRecurrenceEndDescription.getClass();
        str4.getClass();
        y6a.s(str5, str6, str7, str8, str9);
        this.description = str;
        this.day_of_month = str2;
        this.days_of_week = str3;
        this.end = eventCreateRecurrenceEndDescription;
        this.frequency = str4;
        this.human_readable_frequency = str5;
        this.interval = str6;
        this.months = str7;
        this.position = str8;
        this.rrule = str9;
    }

    public static /* synthetic */ EventCreateRecurrenceDescription copy$default(EventCreateRecurrenceDescription eventCreateRecurrenceDescription, String str, String str2, String str3, EventCreateRecurrenceEndDescription eventCreateRecurrenceEndDescription, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventCreateRecurrenceDescription.description;
        }
        if ((i & 2) != 0) {
            str2 = eventCreateRecurrenceDescription.day_of_month;
        }
        if ((i & 4) != 0) {
            str3 = eventCreateRecurrenceDescription.days_of_week;
        }
        if ((i & 8) != 0) {
            eventCreateRecurrenceEndDescription = eventCreateRecurrenceDescription.end;
        }
        if ((i & 16) != 0) {
            str4 = eventCreateRecurrenceDescription.frequency;
        }
        if ((i & 32) != 0) {
            str5 = eventCreateRecurrenceDescription.human_readable_frequency;
        }
        if ((i & 64) != 0) {
            str6 = eventCreateRecurrenceDescription.interval;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            str7 = eventCreateRecurrenceDescription.months;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            str8 = eventCreateRecurrenceDescription.position;
        }
        if ((i & 512) != 0) {
            str9 = eventCreateRecurrenceDescription.rrule;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str4;
        String str15 = str5;
        return eventCreateRecurrenceDescription.copy(str, str2, str3, eventCreateRecurrenceEndDescription, str14, str15, str12, str13, str10, str11);
    }

    public static final /* synthetic */ void write$Self$models(EventCreateRecurrenceDescription self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.description);
        output.q(serialDesc, 1, self.day_of_month);
        output.q(serialDesc, 2, self.days_of_week);
        output.r(serialDesc, 3, xv6.a, self.end);
        output.q(serialDesc, 4, self.frequency);
        output.q(serialDesc, 5, self.human_readable_frequency);
        output.q(serialDesc, 6, self.interval);
        output.q(serialDesc, 7, self.months);
        output.q(serialDesc, 8, self.position);
        output.q(serialDesc, 9, self.rrule);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getRrule() {
        return this.rrule;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDay_of_month() {
        return this.day_of_month;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDays_of_week() {
        return this.days_of_week;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final EventCreateRecurrenceEndDescription getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFrequency() {
        return this.frequency;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getHuman_readable_frequency() {
        return this.human_readable_frequency;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getInterval() {
        return this.interval;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMonths() {
        return this.months;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPosition() {
        return this.position;
    }

    public final EventCreateRecurrenceDescription copy(String description, String day_of_month, String days_of_week, EventCreateRecurrenceEndDescription end, String frequency, String human_readable_frequency, String interval, String months, String position, String rrule) {
        description.getClass();
        day_of_month.getClass();
        days_of_week.getClass();
        end.getClass();
        frequency.getClass();
        human_readable_frequency.getClass();
        interval.getClass();
        months.getClass();
        position.getClass();
        rrule.getClass();
        return new EventCreateRecurrenceDescription(description, day_of_month, days_of_week, end, frequency, human_readable_frequency, interval, months, position, rrule);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventCreateRecurrenceDescription)) {
            return false;
        }
        EventCreateRecurrenceDescription eventCreateRecurrenceDescription = (EventCreateRecurrenceDescription) other;
        return x44.r(this.description, eventCreateRecurrenceDescription.description) && x44.r(this.day_of_month, eventCreateRecurrenceDescription.day_of_month) && x44.r(this.days_of_week, eventCreateRecurrenceDescription.days_of_week) && x44.r(this.end, eventCreateRecurrenceDescription.end) && x44.r(this.frequency, eventCreateRecurrenceDescription.frequency) && x44.r(this.human_readable_frequency, eventCreateRecurrenceDescription.human_readable_frequency) && x44.r(this.interval, eventCreateRecurrenceDescription.interval) && x44.r(this.months, eventCreateRecurrenceDescription.months) && x44.r(this.position, eventCreateRecurrenceDescription.position) && x44.r(this.rrule, eventCreateRecurrenceDescription.rrule);
    }

    public final String getDay_of_month() {
        return this.day_of_month;
    }

    public final String getDays_of_week() {
        return this.days_of_week;
    }

    public final String getDescription() {
        return this.description;
    }

    public final EventCreateRecurrenceEndDescription getEnd() {
        return this.end;
    }

    public final String getFrequency() {
        return this.frequency;
    }

    public final String getHuman_readable_frequency() {
        return this.human_readable_frequency;
    }

    public final String getInterval() {
        return this.interval;
    }

    public final String getMonths() {
        return this.months;
    }

    public final String getPosition() {
        return this.position;
    }

    public final String getRrule() {
        return this.rrule;
    }

    public int hashCode() {
        return this.rrule.hashCode() + kgh.l(kgh.l(kgh.l(kgh.l(kgh.l((this.end.hashCode() + kgh.l(kgh.l(this.description.hashCode() * 31, 31, this.day_of_month), 31, this.days_of_week)) * 31, 31, this.frequency), 31, this.human_readable_frequency), 31, this.interval), 31, this.months), 31, this.position);
    }

    public String toString() {
        String str = this.description;
        String str2 = this.day_of_month;
        String str3 = this.days_of_week;
        EventCreateRecurrenceEndDescription eventCreateRecurrenceEndDescription = this.end;
        String str4 = this.frequency;
        String str5 = this.human_readable_frequency;
        String str6 = this.interval;
        String str7 = this.months;
        String str8 = this.position;
        String str9 = this.rrule;
        StringBuilder sbR = kgh.r("EventCreateRecurrenceDescription(description=", str, ", day_of_month=", str2, ", days_of_week=");
        sbR.append(str3);
        sbR.append(", end=");
        sbR.append(eventCreateRecurrenceEndDescription);
        sbR.append(", frequency=");
        kgh.u(sbR, str4, ", human_readable_frequency=", str5, ", interval=");
        kgh.u(sbR, str6, ", months=", str7, ", position=");
        return vb7.t(sbR, str8, ", rrule=", str9, ")");
    }

    public /* synthetic */ EventCreateRecurrenceDescription(int i, String str, String str2, String str3, EventCreateRecurrenceEndDescription eventCreateRecurrenceEndDescription, String str4, String str5, String str6, String str7, String str8, String str9, vnf vnfVar) {
        if (1023 != (i & 1023)) {
            gvj.f(i, 1023, vv6.a.getDescriptor());
            throw null;
        }
        this.description = str;
        this.day_of_month = str2;
        this.days_of_week = str3;
        this.end = eventCreateRecurrenceEndDescription;
        this.frequency = str4;
        this.human_readable_frequency = str5;
        this.interval = str6;
        this.months = str7;
        this.position = str8;
        this.rrule = str9;
    }
}
