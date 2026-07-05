package com.anthropic.claude.tool.model;

import defpackage.fq6;
import defpackage.fw6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.xy6;
import defpackage.yb5;
import defpackage.yy6;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/anthropic/claude/tool/model/EventDeleteV0OutputEventDeleteErrorErrorType;", "", "", "loggingName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getLoggingName", "()Ljava/lang/String;", "Companion", "xy6", "SYSTEM_PERMISSION_DENIED", "APP_PERMISSION_DENIED", "RESTRICTED_ACCESS", "EVENT_NOT_FOUND", "CALENDAR_NOT_FOUND", "DELETE_FAILED", "UNKNOWN", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = yy6.class)
public final class EventDeleteV0OutputEventDeleteErrorErrorType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ EventDeleteV0OutputEventDeleteErrorErrorType[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final xy6 Companion;
    private final String loggingName;
    public static final EventDeleteV0OutputEventDeleteErrorErrorType SYSTEM_PERMISSION_DENIED = new EventDeleteV0OutputEventDeleteErrorErrorType("SYSTEM_PERMISSION_DENIED", 0, "system_permission_denied");
    public static final EventDeleteV0OutputEventDeleteErrorErrorType APP_PERMISSION_DENIED = new EventDeleteV0OutputEventDeleteErrorErrorType("APP_PERMISSION_DENIED", 1, "app_permission_denied");
    public static final EventDeleteV0OutputEventDeleteErrorErrorType RESTRICTED_ACCESS = new EventDeleteV0OutputEventDeleteErrorErrorType("RESTRICTED_ACCESS", 2, "restricted_access");
    public static final EventDeleteV0OutputEventDeleteErrorErrorType EVENT_NOT_FOUND = new EventDeleteV0OutputEventDeleteErrorErrorType("EVENT_NOT_FOUND", 3, "event_not_found");
    public static final EventDeleteV0OutputEventDeleteErrorErrorType CALENDAR_NOT_FOUND = new EventDeleteV0OutputEventDeleteErrorErrorType("CALENDAR_NOT_FOUND", 4, "calendar_not_found");
    public static final EventDeleteV0OutputEventDeleteErrorErrorType DELETE_FAILED = new EventDeleteV0OutputEventDeleteErrorErrorType("DELETE_FAILED", 5, "delete_failed");
    public static final EventDeleteV0OutputEventDeleteErrorErrorType UNKNOWN = new EventDeleteV0OutputEventDeleteErrorErrorType("UNKNOWN", 6, "unknown");

    private static final /* synthetic */ EventDeleteV0OutputEventDeleteErrorErrorType[] $values() {
        return new EventDeleteV0OutputEventDeleteErrorErrorType[]{SYSTEM_PERMISSION_DENIED, APP_PERMISSION_DENIED, RESTRICTED_ACCESS, EVENT_NOT_FOUND, CALENDAR_NOT_FOUND, DELETE_FAILED, UNKNOWN};
    }

    static {
        EventDeleteV0OutputEventDeleteErrorErrorType[] eventDeleteV0OutputEventDeleteErrorErrorTypeArr$values = $values();
        $VALUES = eventDeleteV0OutputEventDeleteErrorErrorTypeArr$values;
        $ENTRIES = wd6.n0(eventDeleteV0OutputEventDeleteErrorErrorTypeArr$values);
        Companion = new xy6();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new fw6(16));
    }

    private EventDeleteV0OutputEventDeleteErrorErrorType(String str, int i, String str2) {
        this.loggingName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.tool.model.EventDeleteV0OutputEventDeleteErrorErrorType", values(), new String[]{"system_permission_denied", "app_permission_denied", "restricted_access", "event_not_found", "calendar_not_found", "delete_failed", "unknown"}, new Annotation[][]{null, null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static EventDeleteV0OutputEventDeleteErrorErrorType valueOf(String str) {
        return (EventDeleteV0OutputEventDeleteErrorErrorType) Enum.valueOf(EventDeleteV0OutputEventDeleteErrorErrorType.class, str);
    }

    public static EventDeleteV0OutputEventDeleteErrorErrorType[] values() {
        return (EventDeleteV0OutputEventDeleteErrorErrorType[]) $VALUES.clone();
    }

    public final String getLoggingName() {
        return this.loggingName;
    }
}
