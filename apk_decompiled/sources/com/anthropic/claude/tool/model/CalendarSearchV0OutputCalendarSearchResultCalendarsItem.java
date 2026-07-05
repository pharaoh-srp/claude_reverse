package com.anthropic.claude.tool.model;

import defpackage.g82;
import defpackage.gvj;
import defpackage.h82;
import defpackage.ij0;
import defpackage.j82;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289BS\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ`\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010\u001fJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\b2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b2\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b3\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b\t\u0010#R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b5\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b6\u0010\u001f¨\u0006:"}, d2 = {"Lcom/anthropic/claude/tool/model/CalendarSearchV0OutputCalendarSearchResultCalendarsItem;", "", "Lcom/anthropic/claude/tool/model/CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel;", "access_level", "", "account_name", "color", "id", "", "is_primary", "name", "owner_account", "<init>", "(Lcom/anthropic/claude/tool/model/CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/tool/model/CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/CalendarSearchV0OutputCalendarSearchResultCalendarsItem;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/tool/model/CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Ljava/lang/Boolean;", "component6", "component7", "copy", "(Lcom/anthropic/claude/tool/model/CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/tool/model/CalendarSearchV0OutputCalendarSearchResultCalendarsItem;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/tool/model/CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel;", "getAccess_level", "Ljava/lang/String;", "getAccount_name", "getColor", "getId", "Ljava/lang/Boolean;", "getName", "getOwner_account", "Companion", "g82", "h82", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CalendarSearchV0OutputCalendarSearchResultCalendarsItem {
    public static final h82 Companion = new h82();
    private final CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel access_level;
    private final String account_name;
    private final String color;
    private final String id;
    private final Boolean is_primary;
    private final String name;
    private final String owner_account;

    public /* synthetic */ CalendarSearchV0OutputCalendarSearchResultCalendarsItem(int i, CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel calendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel, String str, String str2, String str3, Boolean bool, String str4, String str5, vnf vnfVar) {
        if (40 != (i & 40)) {
            gvj.f(i, 40, g82.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.access_level = null;
        } else {
            this.access_level = calendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel;
        }
        if ((i & 2) == 0) {
            this.account_name = null;
        } else {
            this.account_name = str;
        }
        if ((i & 4) == 0) {
            this.color = null;
        } else {
            this.color = str2;
        }
        this.id = str3;
        if ((i & 16) == 0) {
            this.is_primary = null;
        } else {
            this.is_primary = bool;
        }
        this.name = str4;
        if ((i & 64) == 0) {
            this.owner_account = null;
        } else {
            this.owner_account = str5;
        }
    }

    public static /* synthetic */ CalendarSearchV0OutputCalendarSearchResultCalendarsItem copy$default(CalendarSearchV0OutputCalendarSearchResultCalendarsItem calendarSearchV0OutputCalendarSearchResultCalendarsItem, CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel calendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel, String str, String str2, String str3, Boolean bool, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            calendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel = calendarSearchV0OutputCalendarSearchResultCalendarsItem.access_level;
        }
        if ((i & 2) != 0) {
            str = calendarSearchV0OutputCalendarSearchResultCalendarsItem.account_name;
        }
        if ((i & 4) != 0) {
            str2 = calendarSearchV0OutputCalendarSearchResultCalendarsItem.color;
        }
        if ((i & 8) != 0) {
            str3 = calendarSearchV0OutputCalendarSearchResultCalendarsItem.id;
        }
        if ((i & 16) != 0) {
            bool = calendarSearchV0OutputCalendarSearchResultCalendarsItem.is_primary;
        }
        if ((i & 32) != 0) {
            str4 = calendarSearchV0OutputCalendarSearchResultCalendarsItem.name;
        }
        if ((i & 64) != 0) {
            str5 = calendarSearchV0OutputCalendarSearchResultCalendarsItem.owner_account;
        }
        String str6 = str4;
        String str7 = str5;
        Boolean bool2 = bool;
        String str8 = str2;
        return calendarSearchV0OutputCalendarSearchResultCalendarsItem.copy(calendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel, str, str8, str3, bool2, str6, str7);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(CalendarSearchV0OutputCalendarSearchResultCalendarsItem self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.access_level != null) {
            output.B(serialDesc, 0, j82.d, self.access_level);
        }
        if (output.E(serialDesc) || self.account_name != null) {
            output.B(serialDesc, 1, srg.a, self.account_name);
        }
        if (output.E(serialDesc) || self.color != null) {
            output.B(serialDesc, 2, srg.a, self.color);
        }
        output.q(serialDesc, 3, self.id);
        if (output.E(serialDesc) || self.is_primary != null) {
            output.B(serialDesc, 4, zt1.a, self.is_primary);
        }
        output.q(serialDesc, 5, self.name);
        if (!output.E(serialDesc) && self.owner_account == null) {
            return;
        }
        output.B(serialDesc, 6, srg.a, self.owner_account);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel getAccess_level() {
        return this.access_level;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAccount_name() {
        return this.account_name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getIs_primary() {
        return this.is_primary;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOwner_account() {
        return this.owner_account;
    }

    public final CalendarSearchV0OutputCalendarSearchResultCalendarsItem copy(CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel access_level, String account_name, String color, String id, Boolean is_primary, String name, String owner_account) {
        id.getClass();
        name.getClass();
        return new CalendarSearchV0OutputCalendarSearchResultCalendarsItem(access_level, account_name, color, id, is_primary, name, owner_account);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalendarSearchV0OutputCalendarSearchResultCalendarsItem)) {
            return false;
        }
        CalendarSearchV0OutputCalendarSearchResultCalendarsItem calendarSearchV0OutputCalendarSearchResultCalendarsItem = (CalendarSearchV0OutputCalendarSearchResultCalendarsItem) other;
        return this.access_level == calendarSearchV0OutputCalendarSearchResultCalendarsItem.access_level && x44.r(this.account_name, calendarSearchV0OutputCalendarSearchResultCalendarsItem.account_name) && x44.r(this.color, calendarSearchV0OutputCalendarSearchResultCalendarsItem.color) && x44.r(this.id, calendarSearchV0OutputCalendarSearchResultCalendarsItem.id) && x44.r(this.is_primary, calendarSearchV0OutputCalendarSearchResultCalendarsItem.is_primary) && x44.r(this.name, calendarSearchV0OutputCalendarSearchResultCalendarsItem.name) && x44.r(this.owner_account, calendarSearchV0OutputCalendarSearchResultCalendarsItem.owner_account);
    }

    public final CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel getAccess_level() {
        return this.access_level;
    }

    public final String getAccount_name() {
        return this.account_name;
    }

    public final String getColor() {
        return this.color;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOwner_account() {
        return this.owner_account;
    }

    public int hashCode() {
        CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel calendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel = this.access_level;
        int iHashCode = (calendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel == null ? 0 : calendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel.hashCode()) * 31;
        String str = this.account_name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.color;
        int iL = kgh.l((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.id);
        Boolean bool = this.is_primary;
        int iL2 = kgh.l((iL + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.name);
        String str3 = this.owner_account;
        return iL2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final Boolean is_primary() {
        return this.is_primary;
    }

    public String toString() {
        CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel calendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel = this.access_level;
        String str = this.account_name;
        String str2 = this.color;
        String str3 = this.id;
        Boolean bool = this.is_primary;
        String str4 = this.name;
        String str5 = this.owner_account;
        StringBuilder sb = new StringBuilder("CalendarSearchV0OutputCalendarSearchResultCalendarsItem(access_level=");
        sb.append(calendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel);
        sb.append(", account_name=");
        sb.append(str);
        sb.append(", color=");
        kgh.u(sb, str2, ", id=", str3, ", is_primary=");
        sb.append(bool);
        sb.append(", name=");
        sb.append(str4);
        sb.append(", owner_account=");
        return ij0.m(sb, str5, ")");
    }

    public CalendarSearchV0OutputCalendarSearchResultCalendarsItem(CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel calendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel, String str, String str2, String str3, Boolean bool, String str4, String str5) {
        str3.getClass();
        str4.getClass();
        this.access_level = calendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel;
        this.account_name = str;
        this.color = str2;
        this.id = str3;
        this.is_primary = bool;
        this.name = str4;
        this.owner_account = str5;
    }

    public /* synthetic */ CalendarSearchV0OutputCalendarSearchResultCalendarsItem(CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel calendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel, String str, String str2, String str3, Boolean bool, String str4, String str5, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : calendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, str3, (i & 16) != 0 ? null : bool, str4, (i & 64) != 0 ? null : str5);
    }
}
