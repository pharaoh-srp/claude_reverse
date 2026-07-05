package com.anthropic.claude.tool.model;

import defpackage.ebh;
import defpackage.fw6;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.s07;
import defpackage.t07;
import defpackage.u07;
import defpackage.uo0;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResult;", "Lcom/anthropic/claude/tool/model/EventSearchV0Output;", "", "Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItem;", "calendar_events", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResult;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResult;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getCalendar_events", "Companion", "s07", "t07", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class EventSearchV0OutputEventSearchResult implements EventSearchV0Output {
    private final List<EventSearchV0OutputEventSearchResultCalendarEventsItem> calendar_events;
    public static final t07 Companion = new t07();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new fw6(20))};

    public /* synthetic */ EventSearchV0OutputEventSearchResult(int i, List list, vnf vnfVar) {
        if (1 == (i & 1)) {
            this.calendar_events = list;
        } else {
            gvj.f(i, 1, s07.a.getDescriptor());
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(u07.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventSearchV0OutputEventSearchResult copy$default(EventSearchV0OutputEventSearchResult eventSearchV0OutputEventSearchResult, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = eventSearchV0OutputEventSearchResult.calendar_events;
        }
        return eventSearchV0OutputEventSearchResult.copy(list);
    }

    public final List<EventSearchV0OutputEventSearchResultCalendarEventsItem> component1() {
        return this.calendar_events;
    }

    public final EventSearchV0OutputEventSearchResult copy(List<EventSearchV0OutputEventSearchResultCalendarEventsItem> calendar_events) {
        calendar_events.getClass();
        return new EventSearchV0OutputEventSearchResult(calendar_events);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EventSearchV0OutputEventSearchResult) && x44.r(this.calendar_events, ((EventSearchV0OutputEventSearchResult) other).calendar_events);
    }

    public final List<EventSearchV0OutputEventSearchResultCalendarEventsItem> getCalendar_events() {
        return this.calendar_events;
    }

    public int hashCode() {
        return this.calendar_events.hashCode();
    }

    public String toString() {
        return ebh.n("EventSearchV0OutputEventSearchResult(calendar_events=", ")", this.calendar_events);
    }

    public EventSearchV0OutputEventSearchResult(List<EventSearchV0OutputEventSearchResultCalendarEventsItem> list) {
        list.getClass();
        this.calendar_events = list;
    }
}
