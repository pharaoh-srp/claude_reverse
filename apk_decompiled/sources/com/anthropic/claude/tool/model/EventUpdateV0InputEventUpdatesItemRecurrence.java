package com.anthropic.claude.tool.model;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.e37;
import defpackage.e79;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.m17;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.uo0;
import defpackage.v27;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.w27;
import defpackage.x44;
import defpackage.y27;
import defpackage.yb5;
import defpackage.z27;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002FGBs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012B\u0081\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0018J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001aJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0018J\u0010\u0010$\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b$\u0010 J\u0082\u0001\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b'\u0010 J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-J'\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001¢\u0006\u0004\b4\u00105R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u0018R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b:\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b<\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\b>\u0010\u001eR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\b@\u0010 R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\bA\u0010\u0018R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\bB\u0010\u001aR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\bC\u0010\u0018R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010?\u001a\u0004\bD\u0010 ¨\u0006H"}, d2 = {"Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemRecurrence;", "", "", "day_of_month", "", "Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItem;", "days_of_week", "Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemRecurrenceEnd;", "end", "Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemRecurrenceFrequency;", "frequency", "", "human_readable_frequency", "interval", "months", "position", "rrule", "<init>", "(Ljava/lang/Integer;Ljava/util/List;Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemRecurrenceEnd;Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemRecurrenceFrequency;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/util/List;Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemRecurrenceEnd;Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemRecurrenceFrequency;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lvnf;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/util/List;", "component3", "()Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemRecurrenceEnd;", "component4", "()Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemRecurrenceFrequency;", "component5", "()Ljava/lang/String;", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/util/List;Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemRecurrenceEnd;Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemRecurrenceFrequency;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;)Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemRecurrence;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemRecurrence;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/Integer;", "getDay_of_month", "Ljava/util/List;", "getDays_of_week", "Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemRecurrenceEnd;", "getEnd", "Lcom/anthropic/claude/tool/model/EventUpdateV0InputEventUpdatesItemRecurrenceFrequency;", "getFrequency", "Ljava/lang/String;", "getHuman_readable_frequency", "getInterval", "getMonths", "getPosition", "getRrule", "Companion", "v27", "w27", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class EventUpdateV0InputEventUpdatesItemRecurrence {
    private static final kw9[] $childSerializers;
    public static final w27 Companion = new w27();
    private final Integer day_of_month;
    private final List<EventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItem> days_of_week;
    private final EventUpdateV0InputEventUpdatesItemRecurrenceEnd end;
    private final EventUpdateV0InputEventUpdatesItemRecurrenceFrequency frequency;
    private final String human_readable_frequency;
    private final Integer interval;
    private final List<Integer> months;
    private final Integer position;
    private final String rrule;

    static {
        m17 m17Var = new m17(7);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, yb5.w(w1aVar, m17Var), null, null, null, null, yb5.w(w1aVar, new m17(8)), null, null};
    }

    public /* synthetic */ EventUpdateV0InputEventUpdatesItemRecurrence(int i, Integer num, List list, EventUpdateV0InputEventUpdatesItemRecurrenceEnd eventUpdateV0InputEventUpdatesItemRecurrenceEnd, EventUpdateV0InputEventUpdatesItemRecurrenceFrequency eventUpdateV0InputEventUpdatesItemRecurrenceFrequency, String str, Integer num2, List list2, Integer num3, String str2, vnf vnfVar) {
        if (280 != (i & 280)) {
            gvj.f(i, 280, v27.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.day_of_month = null;
        } else {
            this.day_of_month = num;
        }
        if ((i & 2) == 0) {
            this.days_of_week = null;
        } else {
            this.days_of_week = list;
        }
        if ((i & 4) == 0) {
            this.end = null;
        } else {
            this.end = eventUpdateV0InputEventUpdatesItemRecurrenceEnd;
        }
        this.frequency = eventUpdateV0InputEventUpdatesItemRecurrenceFrequency;
        this.human_readable_frequency = str;
        if ((i & 32) == 0) {
            this.interval = null;
        } else {
            this.interval = num2;
        }
        if ((i & 64) == 0) {
            this.months = null;
        } else {
            this.months = list2;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.position = null;
        } else {
            this.position = num3;
        }
        this.rrule = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(y27.d, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(e79.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventUpdateV0InputEventUpdatesItemRecurrence copy$default(EventUpdateV0InputEventUpdatesItemRecurrence eventUpdateV0InputEventUpdatesItemRecurrence, Integer num, List list, EventUpdateV0InputEventUpdatesItemRecurrenceEnd eventUpdateV0InputEventUpdatesItemRecurrenceEnd, EventUpdateV0InputEventUpdatesItemRecurrenceFrequency eventUpdateV0InputEventUpdatesItemRecurrenceFrequency, String str, Integer num2, List list2, Integer num3, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = eventUpdateV0InputEventUpdatesItemRecurrence.day_of_month;
        }
        if ((i & 2) != 0) {
            list = eventUpdateV0InputEventUpdatesItemRecurrence.days_of_week;
        }
        if ((i & 4) != 0) {
            eventUpdateV0InputEventUpdatesItemRecurrenceEnd = eventUpdateV0InputEventUpdatesItemRecurrence.end;
        }
        if ((i & 8) != 0) {
            eventUpdateV0InputEventUpdatesItemRecurrenceFrequency = eventUpdateV0InputEventUpdatesItemRecurrence.frequency;
        }
        if ((i & 16) != 0) {
            str = eventUpdateV0InputEventUpdatesItemRecurrence.human_readable_frequency;
        }
        if ((i & 32) != 0) {
            num2 = eventUpdateV0InputEventUpdatesItemRecurrence.interval;
        }
        if ((i & 64) != 0) {
            list2 = eventUpdateV0InputEventUpdatesItemRecurrence.months;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            num3 = eventUpdateV0InputEventUpdatesItemRecurrence.position;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            str2 = eventUpdateV0InputEventUpdatesItemRecurrence.rrule;
        }
        Integer num4 = num3;
        String str3 = str2;
        Integer num5 = num2;
        List list3 = list2;
        String str4 = str;
        EventUpdateV0InputEventUpdatesItemRecurrenceEnd eventUpdateV0InputEventUpdatesItemRecurrenceEnd2 = eventUpdateV0InputEventUpdatesItemRecurrenceEnd;
        return eventUpdateV0InputEventUpdatesItemRecurrence.copy(num, list, eventUpdateV0InputEventUpdatesItemRecurrenceEnd2, eventUpdateV0InputEventUpdatesItemRecurrenceFrequency, str4, num5, list3, num4, str3);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(EventUpdateV0InputEventUpdatesItemRecurrence self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.day_of_month != null) {
            output.B(serialDesc, 0, e79.a, self.day_of_month);
        }
        if (output.E(serialDesc) || self.days_of_week != null) {
            output.B(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.days_of_week);
        }
        if (output.E(serialDesc) || self.end != null) {
            output.B(serialDesc, 2, z27.a, self.end);
        }
        output.r(serialDesc, 3, e37.d, self.frequency);
        output.q(serialDesc, 4, self.human_readable_frequency);
        if (output.E(serialDesc) || self.interval != null) {
            output.B(serialDesc, 5, e79.a, self.interval);
        }
        if (output.E(serialDesc) || self.months != null) {
            output.B(serialDesc, 6, (znf) kw9VarArr[6].getValue(), self.months);
        }
        if (output.E(serialDesc) || self.position != null) {
            output.B(serialDesc, 7, e79.a, self.position);
        }
        output.q(serialDesc, 8, self.rrule);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getDay_of_month() {
        return this.day_of_month;
    }

    public final List<EventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItem> component2() {
        return this.days_of_week;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EventUpdateV0InputEventUpdatesItemRecurrenceEnd getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final EventUpdateV0InputEventUpdatesItemRecurrenceFrequency getFrequency() {
        return this.frequency;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHuman_readable_frequency() {
        return this.human_readable_frequency;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getInterval() {
        return this.interval;
    }

    public final List<Integer> component7() {
        return this.months;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRrule() {
        return this.rrule;
    }

    public final EventUpdateV0InputEventUpdatesItemRecurrence copy(Integer day_of_month, List<? extends EventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItem> days_of_week, EventUpdateV0InputEventUpdatesItemRecurrenceEnd end, EventUpdateV0InputEventUpdatesItemRecurrenceFrequency frequency, String human_readable_frequency, Integer interval, List<Integer> months, Integer position, String rrule) {
        frequency.getClass();
        human_readable_frequency.getClass();
        rrule.getClass();
        return new EventUpdateV0InputEventUpdatesItemRecurrence(day_of_month, days_of_week, end, frequency, human_readable_frequency, interval, months, position, rrule);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventUpdateV0InputEventUpdatesItemRecurrence)) {
            return false;
        }
        EventUpdateV0InputEventUpdatesItemRecurrence eventUpdateV0InputEventUpdatesItemRecurrence = (EventUpdateV0InputEventUpdatesItemRecurrence) other;
        return x44.r(this.day_of_month, eventUpdateV0InputEventUpdatesItemRecurrence.day_of_month) && x44.r(this.days_of_week, eventUpdateV0InputEventUpdatesItemRecurrence.days_of_week) && x44.r(this.end, eventUpdateV0InputEventUpdatesItemRecurrence.end) && this.frequency == eventUpdateV0InputEventUpdatesItemRecurrence.frequency && x44.r(this.human_readable_frequency, eventUpdateV0InputEventUpdatesItemRecurrence.human_readable_frequency) && x44.r(this.interval, eventUpdateV0InputEventUpdatesItemRecurrence.interval) && x44.r(this.months, eventUpdateV0InputEventUpdatesItemRecurrence.months) && x44.r(this.position, eventUpdateV0InputEventUpdatesItemRecurrence.position) && x44.r(this.rrule, eventUpdateV0InputEventUpdatesItemRecurrence.rrule);
    }

    public final Integer getDay_of_month() {
        return this.day_of_month;
    }

    public final List<EventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItem> getDays_of_week() {
        return this.days_of_week;
    }

    public final EventUpdateV0InputEventUpdatesItemRecurrenceEnd getEnd() {
        return this.end;
    }

    public final EventUpdateV0InputEventUpdatesItemRecurrenceFrequency getFrequency() {
        return this.frequency;
    }

    public final String getHuman_readable_frequency() {
        return this.human_readable_frequency;
    }

    public final Integer getInterval() {
        return this.interval;
    }

    public final List<Integer> getMonths() {
        return this.months;
    }

    public final Integer getPosition() {
        return this.position;
    }

    public final String getRrule() {
        return this.rrule;
    }

    public int hashCode() {
        Integer num = this.day_of_month;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<EventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItem> list = this.days_of_week;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        EventUpdateV0InputEventUpdatesItemRecurrenceEnd eventUpdateV0InputEventUpdatesItemRecurrenceEnd = this.end;
        int iL = kgh.l((this.frequency.hashCode() + ((iHashCode2 + (eventUpdateV0InputEventUpdatesItemRecurrenceEnd == null ? 0 : eventUpdateV0InputEventUpdatesItemRecurrenceEnd.hashCode())) * 31)) * 31, 31, this.human_readable_frequency);
        Integer num2 = this.interval;
        int iHashCode3 = (iL + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<Integer> list2 = this.months;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num3 = this.position;
        return this.rrule.hashCode() + ((iHashCode4 + (num3 != null ? num3.hashCode() : 0)) * 31);
    }

    public String toString() {
        Integer num = this.day_of_month;
        List<EventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItem> list = this.days_of_week;
        EventUpdateV0InputEventUpdatesItemRecurrenceEnd eventUpdateV0InputEventUpdatesItemRecurrenceEnd = this.end;
        EventUpdateV0InputEventUpdatesItemRecurrenceFrequency eventUpdateV0InputEventUpdatesItemRecurrenceFrequency = this.frequency;
        String str = this.human_readable_frequency;
        Integer num2 = this.interval;
        List<Integer> list2 = this.months;
        Integer num3 = this.position;
        String str2 = this.rrule;
        StringBuilder sb = new StringBuilder("EventUpdateV0InputEventUpdatesItemRecurrence(day_of_month=");
        sb.append(num);
        sb.append(", days_of_week=");
        sb.append(list);
        sb.append(", end=");
        sb.append(eventUpdateV0InputEventUpdatesItemRecurrenceEnd);
        sb.append(", frequency=");
        sb.append(eventUpdateV0InputEventUpdatesItemRecurrenceFrequency);
        sb.append(", human_readable_frequency=");
        sb.append(str);
        sb.append(", interval=");
        sb.append(num2);
        sb.append(", months=");
        sb.append(list2);
        sb.append(", position=");
        sb.append(num3);
        sb.append(", rrule=");
        return ij0.m(sb, str2, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EventUpdateV0InputEventUpdatesItemRecurrence(Integer num, List<? extends EventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItem> list, EventUpdateV0InputEventUpdatesItemRecurrenceEnd eventUpdateV0InputEventUpdatesItemRecurrenceEnd, EventUpdateV0InputEventUpdatesItemRecurrenceFrequency eventUpdateV0InputEventUpdatesItemRecurrenceFrequency, String str, Integer num2, List<Integer> list2, Integer num3, String str2) {
        eventUpdateV0InputEventUpdatesItemRecurrenceFrequency.getClass();
        str.getClass();
        str2.getClass();
        this.day_of_month = num;
        this.days_of_week = list;
        this.end = eventUpdateV0InputEventUpdatesItemRecurrenceEnd;
        this.frequency = eventUpdateV0InputEventUpdatesItemRecurrenceFrequency;
        this.human_readable_frequency = str;
        this.interval = num2;
        this.months = list2;
        this.position = num3;
        this.rrule = str2;
    }

    public /* synthetic */ EventUpdateV0InputEventUpdatesItemRecurrence(Integer num, List list, EventUpdateV0InputEventUpdatesItemRecurrenceEnd eventUpdateV0InputEventUpdatesItemRecurrenceEnd, EventUpdateV0InputEventUpdatesItemRecurrenceFrequency eventUpdateV0InputEventUpdatesItemRecurrenceFrequency, String str, Integer num2, List list2, Integer num3, String str2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : eventUpdateV0InputEventUpdatesItemRecurrenceEnd, eventUpdateV0InputEventUpdatesItemRecurrenceFrequency, str, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : list2, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : num3, str2);
    }
}
