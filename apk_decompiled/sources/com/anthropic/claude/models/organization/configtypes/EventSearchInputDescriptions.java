package com.anthropic.claude.models.organization.configtypes;

import defpackage.gvj;
import defpackage.j07;
import defpackage.k07;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.y6a;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJL\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u001a¨\u00063"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/EventSearchInputDescriptions;", "", "", "tool_description", "calendar_id", "end_time", "include_all_day", "limit", "start_time", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/EventSearchInputDescriptions;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/models/organization/configtypes/EventSearchInputDescriptions;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTool_description", "getCalendar_id", "getEnd_time", "getInclude_all_day", "getLimit", "getStart_time", "Companion", "j07", "k07", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class EventSearchInputDescriptions {
    public static final int $stable = 0;
    public static final k07 Companion = new k07();
    private final String calendar_id;
    private final String end_time;
    private final String include_all_day;
    private final String limit;
    private final String start_time;
    private final String tool_description;

    public /* synthetic */ EventSearchInputDescriptions(int i, String str, String str2, String str3, String str4, String str5, String str6, vnf vnfVar) {
        if (63 != (i & 63)) {
            gvj.f(i, 63, j07.a.getDescriptor());
            throw null;
        }
        this.tool_description = str;
        this.calendar_id = str2;
        this.end_time = str3;
        this.include_all_day = str4;
        this.limit = str5;
        this.start_time = str6;
    }

    public static /* synthetic */ EventSearchInputDescriptions copy$default(EventSearchInputDescriptions eventSearchInputDescriptions, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventSearchInputDescriptions.tool_description;
        }
        if ((i & 2) != 0) {
            str2 = eventSearchInputDescriptions.calendar_id;
        }
        if ((i & 4) != 0) {
            str3 = eventSearchInputDescriptions.end_time;
        }
        if ((i & 8) != 0) {
            str4 = eventSearchInputDescriptions.include_all_day;
        }
        if ((i & 16) != 0) {
            str5 = eventSearchInputDescriptions.limit;
        }
        if ((i & 32) != 0) {
            str6 = eventSearchInputDescriptions.start_time;
        }
        String str7 = str5;
        String str8 = str6;
        return eventSearchInputDescriptions.copy(str, str2, str3, str4, str7, str8);
    }

    public static final /* synthetic */ void write$Self$models(EventSearchInputDescriptions self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.tool_description);
        output.q(serialDesc, 1, self.calendar_id);
        output.q(serialDesc, 2, self.end_time);
        output.q(serialDesc, 3, self.include_all_day);
        output.q(serialDesc, 4, self.limit);
        output.q(serialDesc, 5, self.start_time);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTool_description() {
        return this.tool_description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCalendar_id() {
        return this.calendar_id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEnd_time() {
        return this.end_time;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getInclude_all_day() {
        return this.include_all_day;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStart_time() {
        return this.start_time;
    }

    public final EventSearchInputDescriptions copy(String tool_description, String calendar_id, String end_time, String include_all_day, String limit, String start_time) {
        y6a.s(tool_description, calendar_id, end_time, include_all_day, limit);
        start_time.getClass();
        return new EventSearchInputDescriptions(tool_description, calendar_id, end_time, include_all_day, limit, start_time);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventSearchInputDescriptions)) {
            return false;
        }
        EventSearchInputDescriptions eventSearchInputDescriptions = (EventSearchInputDescriptions) other;
        return x44.r(this.tool_description, eventSearchInputDescriptions.tool_description) && x44.r(this.calendar_id, eventSearchInputDescriptions.calendar_id) && x44.r(this.end_time, eventSearchInputDescriptions.end_time) && x44.r(this.include_all_day, eventSearchInputDescriptions.include_all_day) && x44.r(this.limit, eventSearchInputDescriptions.limit) && x44.r(this.start_time, eventSearchInputDescriptions.start_time);
    }

    public final String getCalendar_id() {
        return this.calendar_id;
    }

    public final String getEnd_time() {
        return this.end_time;
    }

    public final String getInclude_all_day() {
        return this.include_all_day;
    }

    public final String getLimit() {
        return this.limit;
    }

    public final String getStart_time() {
        return this.start_time;
    }

    public final String getTool_description() {
        return this.tool_description;
    }

    public int hashCode() {
        return this.start_time.hashCode() + kgh.l(kgh.l(kgh.l(kgh.l(this.tool_description.hashCode() * 31, 31, this.calendar_id), 31, this.end_time), 31, this.include_all_day), 31, this.limit);
    }

    public String toString() {
        String str = this.tool_description;
        String str2 = this.calendar_id;
        String str3 = this.end_time;
        String str4 = this.include_all_day;
        String str5 = this.limit;
        String str6 = this.start_time;
        StringBuilder sbR = kgh.r("EventSearchInputDescriptions(tool_description=", str, ", calendar_id=", str2, ", end_time=");
        kgh.u(sbR, str3, ", include_all_day=", str4, ", limit=");
        return vb7.t(sbR, str5, ", start_time=", str6, ")");
    }

    public EventSearchInputDescriptions(String str, String str2, String str3, String str4, String str5, String str6) {
        y6a.s(str, str2, str3, str4, str5);
        str6.getClass();
        this.tool_description = str;
        this.calendar_id = str2;
        this.end_time = str3;
        this.include_all_day = str4;
        this.limit = str5;
        this.start_time = str6;
    }
}
