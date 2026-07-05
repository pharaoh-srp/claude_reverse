package com.anthropic.claude.tool.model;

import defpackage.fw6;
import defpackage.gid;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.u07;
import defpackage.uo0;
import defpackage.v07;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w07;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ6\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001c¨\u0006."}, d2 = {"Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItem;", "", "", "calendar_id", "calendar_name", "", "Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem;", "events", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItem;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItem;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCalendar_id", "getCalendar_name", "Ljava/util/List;", "getEvents", "Companion", "u07", "v07", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class EventSearchV0OutputEventSearchResultCalendarEventsItem {
    private final String calendar_id;
    private final String calendar_name;
    private final List<EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem> events;
    public static final v07 Companion = new v07();
    private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new fw6(21))};

    public /* synthetic */ EventSearchV0OutputEventSearchResultCalendarEventsItem(int i, String str, String str2, List list, vnf vnfVar) {
        if (5 != (i & 5)) {
            gvj.f(i, 5, u07.a.getDescriptor());
            throw null;
        }
        this.calendar_id = str;
        if ((i & 2) == 0) {
            this.calendar_name = null;
        } else {
            this.calendar_name = str2;
        }
        this.events = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(w07.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventSearchV0OutputEventSearchResultCalendarEventsItem copy$default(EventSearchV0OutputEventSearchResultCalendarEventsItem eventSearchV0OutputEventSearchResultCalendarEventsItem, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventSearchV0OutputEventSearchResultCalendarEventsItem.calendar_id;
        }
        if ((i & 2) != 0) {
            str2 = eventSearchV0OutputEventSearchResultCalendarEventsItem.calendar_name;
        }
        if ((i & 4) != 0) {
            list = eventSearchV0OutputEventSearchResultCalendarEventsItem.events;
        }
        return eventSearchV0OutputEventSearchResultCalendarEventsItem.copy(str, str2, list);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(EventSearchV0OutputEventSearchResultCalendarEventsItem self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.calendar_id);
        if (output.E(serialDesc) || self.calendar_name != null) {
            output.B(serialDesc, 1, srg.a, self.calendar_name);
        }
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.events);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCalendar_id() {
        return this.calendar_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCalendar_name() {
        return this.calendar_name;
    }

    public final List<EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem> component3() {
        return this.events;
    }

    public final EventSearchV0OutputEventSearchResultCalendarEventsItem copy(String calendar_id, String calendar_name, List<EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem> events) {
        calendar_id.getClass();
        events.getClass();
        return new EventSearchV0OutputEventSearchResultCalendarEventsItem(calendar_id, calendar_name, events);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventSearchV0OutputEventSearchResultCalendarEventsItem)) {
            return false;
        }
        EventSearchV0OutputEventSearchResultCalendarEventsItem eventSearchV0OutputEventSearchResultCalendarEventsItem = (EventSearchV0OutputEventSearchResultCalendarEventsItem) other;
        return x44.r(this.calendar_id, eventSearchV0OutputEventSearchResultCalendarEventsItem.calendar_id) && x44.r(this.calendar_name, eventSearchV0OutputEventSearchResultCalendarEventsItem.calendar_name) && x44.r(this.events, eventSearchV0OutputEventSearchResultCalendarEventsItem.events);
    }

    public final String getCalendar_id() {
        return this.calendar_id;
    }

    public final String getCalendar_name() {
        return this.calendar_name;
    }

    public final List<EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem> getEvents() {
        return this.events;
    }

    public int hashCode() {
        int iHashCode = this.calendar_id.hashCode() * 31;
        String str = this.calendar_name;
        return this.events.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.calendar_id;
        String str2 = this.calendar_name;
        return gid.q(kgh.r("EventSearchV0OutputEventSearchResultCalendarEventsItem(calendar_id=", str, ", calendar_name=", str2, ", events="), this.events, ")");
    }

    public EventSearchV0OutputEventSearchResultCalendarEventsItem(String str, String str2, List<EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem> list) {
        str.getClass();
        list.getClass();
        this.calendar_id = str;
        this.calendar_name = str2;
        this.events = list;
    }

    public /* synthetic */ EventSearchV0OutputEventSearchResultCalendarEventsItem(String str, String str2, List list, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, list);
    }
}
