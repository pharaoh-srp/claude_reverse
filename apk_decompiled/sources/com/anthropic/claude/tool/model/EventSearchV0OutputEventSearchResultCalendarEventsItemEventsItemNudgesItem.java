package com.anthropic.claude.tool.model;

import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import defpackage.a17;
import defpackage.b17;
import defpackage.d17;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0018¨\u0006*"}, d2 = {"Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem;", "", "Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItemMethod;", VerifyMagicLinkRequest.Credentials.DISCRIMINATOR, "", "minutes_before", "<init>", "(Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItemMethod;I)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItemMethod;ILvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItemMethod;", "component2", "()I", "copy", "(Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItemMethod;I)Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItemMethod;", "getMethod", "I", "getMinutes_before", "Companion", "a17", "b17", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem {
    public static final b17 Companion = new b17();
    private final EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItemMethod method;
    private final int minutes_before;

    public /* synthetic */ EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem(int i, EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItemMethod eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItemMethod, int i2, vnf vnfVar) {
        if (2 != (i & 2)) {
            gvj.f(i, 2, a17.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.method = null;
        } else {
            this.method = eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItemMethod;
        }
        this.minutes_before = i2;
    }

    public static /* synthetic */ EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem copy$default(EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem, EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItemMethod eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItemMethod, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItemMethod = eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem.method;
        }
        if ((i2 & 2) != 0) {
            i = eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem.minutes_before;
        }
        return eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem.copy(eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItemMethod, i);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.method != null) {
            output.B(serialDesc, 0, d17.d, self.method);
        }
        output.l(1, self.minutes_before, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItemMethod getMethod() {
        return this.method;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMinutes_before() {
        return this.minutes_before;
    }

    public final EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem copy(EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItemMethod method, int minutes_before) {
        return new EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem(method, minutes_before);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem)) {
            return false;
        }
        EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem = (EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem) other;
        return this.method == eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem.method && this.minutes_before == eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem.minutes_before;
    }

    public final EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItemMethod getMethod() {
        return this.method;
    }

    public final int getMinutes_before() {
        return this.minutes_before;
    }

    public int hashCode() {
        EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItemMethod eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItemMethod = this.method;
        return Integer.hashCode(this.minutes_before) + ((eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItemMethod == null ? 0 : eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItemMethod.hashCode()) * 31);
    }

    public String toString() {
        return "EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem(method=" + this.method + ", minutes_before=" + this.minutes_before + ")";
    }

    public EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem(EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItemMethod eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItemMethod, int i) {
        this.method = eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItemMethod;
        this.minutes_before = i;
    }

    public /* synthetic */ EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem(EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItemMethod eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItemMethod, int i, int i2, mq5 mq5Var) {
        this((i2 & 1) != 0 ? null : eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItemMethod, i);
    }
}
