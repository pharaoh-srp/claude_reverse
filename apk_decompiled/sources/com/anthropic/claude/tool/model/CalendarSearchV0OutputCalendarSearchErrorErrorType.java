package com.anthropic.claude.tool.model;

import defpackage.c82;
import defpackage.d82;
import defpackage.fq6;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/anthropic/claude/tool/model/CalendarSearchV0OutputCalendarSearchErrorErrorType;", "", "", "loggingName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getLoggingName", "()Ljava/lang/String;", "Companion", "c82", "SYSTEM_PERMISSION_DENIED", "APP_PERMISSION_DENIED", "RESTRICTED_ACCESS", "CALENDAR_NOT_FOUND", "ACCESS_ERROR", "UNKNOWN", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = d82.class)
public final class CalendarSearchV0OutputCalendarSearchErrorErrorType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ CalendarSearchV0OutputCalendarSearchErrorErrorType[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final c82 Companion;
    private final String loggingName;
    public static final CalendarSearchV0OutputCalendarSearchErrorErrorType SYSTEM_PERMISSION_DENIED = new CalendarSearchV0OutputCalendarSearchErrorErrorType("SYSTEM_PERMISSION_DENIED", 0, "system_permission_denied");
    public static final CalendarSearchV0OutputCalendarSearchErrorErrorType APP_PERMISSION_DENIED = new CalendarSearchV0OutputCalendarSearchErrorErrorType("APP_PERMISSION_DENIED", 1, "app_permission_denied");
    public static final CalendarSearchV0OutputCalendarSearchErrorErrorType RESTRICTED_ACCESS = new CalendarSearchV0OutputCalendarSearchErrorErrorType("RESTRICTED_ACCESS", 2, "restricted_access");
    public static final CalendarSearchV0OutputCalendarSearchErrorErrorType CALENDAR_NOT_FOUND = new CalendarSearchV0OutputCalendarSearchErrorErrorType("CALENDAR_NOT_FOUND", 3, "calendar_not_found");
    public static final CalendarSearchV0OutputCalendarSearchErrorErrorType ACCESS_ERROR = new CalendarSearchV0OutputCalendarSearchErrorErrorType("ACCESS_ERROR", 4, "access_error");
    public static final CalendarSearchV0OutputCalendarSearchErrorErrorType UNKNOWN = new CalendarSearchV0OutputCalendarSearchErrorErrorType("UNKNOWN", 5, "unknown");

    private static final /* synthetic */ CalendarSearchV0OutputCalendarSearchErrorErrorType[] $values() {
        return new CalendarSearchV0OutputCalendarSearchErrorErrorType[]{SYSTEM_PERMISSION_DENIED, APP_PERMISSION_DENIED, RESTRICTED_ACCESS, CALENDAR_NOT_FOUND, ACCESS_ERROR, UNKNOWN};
    }

    static {
        CalendarSearchV0OutputCalendarSearchErrorErrorType[] calendarSearchV0OutputCalendarSearchErrorErrorTypeArr$values = $values();
        $VALUES = calendarSearchV0OutputCalendarSearchErrorErrorTypeArr$values;
        $ENTRIES = wd6.n0(calendarSearchV0OutputCalendarSearchErrorErrorTypeArr$values);
        Companion = new c82();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new ll1(18));
    }

    private CalendarSearchV0OutputCalendarSearchErrorErrorType(String str, int i, String str2) {
        this.loggingName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.tool.model.CalendarSearchV0OutputCalendarSearchErrorErrorType", values(), new String[]{"system_permission_denied", "app_permission_denied", "restricted_access", "calendar_not_found", "access_error", "unknown"}, new Annotation[][]{null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static CalendarSearchV0OutputCalendarSearchErrorErrorType valueOf(String str) {
        return (CalendarSearchV0OutputCalendarSearchErrorErrorType) Enum.valueOf(CalendarSearchV0OutputCalendarSearchErrorErrorType.class, str);
    }

    public static CalendarSearchV0OutputCalendarSearchErrorErrorType[] values() {
        return (CalendarSearchV0OutputCalendarSearchErrorErrorType[]) $VALUES.clone();
    }

    public final String getLoggingName() {
        return this.loggingName;
    }
}
