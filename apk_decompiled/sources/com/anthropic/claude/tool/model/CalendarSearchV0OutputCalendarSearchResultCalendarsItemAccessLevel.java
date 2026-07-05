package com.anthropic.claude.tool.model;

import defpackage.fq6;
import defpackage.i82;
import defpackage.j82;
import defpackage.kw9;
import defpackage.ll1;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/tool/model/CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel;", "", "", "loggingName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getLoggingName", "()Ljava/lang/String;", "Companion", "i82", "OWNER", "READONLY", "READWRITE", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = j82.class)
public final class CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final i82 Companion;
    public static final CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel OWNER = new CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel("OWNER", 0, "owner");
    public static final CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel READONLY = new CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel("READONLY", 1, "readonly");
    public static final CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel READWRITE = new CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel("READWRITE", 2, "readwrite");
    private final String loggingName;

    private static final /* synthetic */ CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel[] $values() {
        return new CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel[]{OWNER, READONLY, READWRITE};
    }

    static {
        CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel[] calendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevelArr$values = $values();
        $VALUES = calendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevelArr$values;
        $ENTRIES = wd6.n0(calendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevelArr$values);
        Companion = new i82();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new ll1(20));
    }

    private CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel(String str, int i, String str2) {
        this.loggingName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.tool.model.CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel", values(), new String[]{"owner", "readonly", "readwrite"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel valueOf(String str) {
        return (CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel) Enum.valueOf(CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel.class, str);
    }

    public static CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel[] values() {
        return (CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel[]) $VALUES.clone();
    }

    public final String getLoggingName() {
        return this.loggingName;
    }
}
