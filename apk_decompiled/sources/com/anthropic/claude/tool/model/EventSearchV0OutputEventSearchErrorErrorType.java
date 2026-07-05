package com.anthropic.claude.tool.model;

import defpackage.fq6;
import defpackage.fw6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.q07;
import defpackage.r07;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/anthropic/claude/tool/model/EventSearchV0OutputEventSearchErrorErrorType;", "", "", "loggingName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getLoggingName", "()Ljava/lang/String;", "Companion", "q07", "SYSTEM_PERMISSION_DENIED", "APP_PERMISSION_DENIED", "RESTRICTED_ACCESS", "CALENDAR_NOT_FOUND", "INVALID_DATE_RANGE", "SEARCH_FAILED", "UNKNOWN", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = r07.class)
public final class EventSearchV0OutputEventSearchErrorErrorType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ EventSearchV0OutputEventSearchErrorErrorType[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final q07 Companion;
    private final String loggingName;
    public static final EventSearchV0OutputEventSearchErrorErrorType SYSTEM_PERMISSION_DENIED = new EventSearchV0OutputEventSearchErrorErrorType("SYSTEM_PERMISSION_DENIED", 0, "system_permission_denied");
    public static final EventSearchV0OutputEventSearchErrorErrorType APP_PERMISSION_DENIED = new EventSearchV0OutputEventSearchErrorErrorType("APP_PERMISSION_DENIED", 1, "app_permission_denied");
    public static final EventSearchV0OutputEventSearchErrorErrorType RESTRICTED_ACCESS = new EventSearchV0OutputEventSearchErrorErrorType("RESTRICTED_ACCESS", 2, "restricted_access");
    public static final EventSearchV0OutputEventSearchErrorErrorType CALENDAR_NOT_FOUND = new EventSearchV0OutputEventSearchErrorErrorType("CALENDAR_NOT_FOUND", 3, "calendar_not_found");
    public static final EventSearchV0OutputEventSearchErrorErrorType INVALID_DATE_RANGE = new EventSearchV0OutputEventSearchErrorErrorType("INVALID_DATE_RANGE", 4, "invalid_date_range");
    public static final EventSearchV0OutputEventSearchErrorErrorType SEARCH_FAILED = new EventSearchV0OutputEventSearchErrorErrorType("SEARCH_FAILED", 5, "search_failed");
    public static final EventSearchV0OutputEventSearchErrorErrorType UNKNOWN = new EventSearchV0OutputEventSearchErrorErrorType("UNKNOWN", 6, "unknown");

    private static final /* synthetic */ EventSearchV0OutputEventSearchErrorErrorType[] $values() {
        return new EventSearchV0OutputEventSearchErrorErrorType[]{SYSTEM_PERMISSION_DENIED, APP_PERMISSION_DENIED, RESTRICTED_ACCESS, CALENDAR_NOT_FOUND, INVALID_DATE_RANGE, SEARCH_FAILED, UNKNOWN};
    }

    static {
        EventSearchV0OutputEventSearchErrorErrorType[] eventSearchV0OutputEventSearchErrorErrorTypeArr$values = $values();
        $VALUES = eventSearchV0OutputEventSearchErrorErrorTypeArr$values;
        $ENTRIES = wd6.n0(eventSearchV0OutputEventSearchErrorErrorTypeArr$values);
        Companion = new q07();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new fw6(19));
    }

    private EventSearchV0OutputEventSearchErrorErrorType(String str, int i, String str2) {
        this.loggingName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchErrorErrorType", values(), new String[]{"system_permission_denied", "app_permission_denied", "restricted_access", "calendar_not_found", "invalid_date_range", "search_failed", "unknown"}, new Annotation[][]{null, null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static EventSearchV0OutputEventSearchErrorErrorType valueOf(String str) {
        return (EventSearchV0OutputEventSearchErrorErrorType) Enum.valueOf(EventSearchV0OutputEventSearchErrorErrorType.class, str);
    }

    public static EventSearchV0OutputEventSearchErrorErrorType[] values() {
        return (EventSearchV0OutputEventSearchErrorErrorType[]) $VALUES.clone();
    }

    public final String getLoggingName() {
        return this.loggingName;
    }
}
