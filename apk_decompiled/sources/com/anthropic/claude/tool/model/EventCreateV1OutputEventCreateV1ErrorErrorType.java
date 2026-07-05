package com.anthropic.claude.tool.model;

import defpackage.fq6;
import defpackage.fw6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.px6;
import defpackage.qx6;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/anthropic/claude/tool/model/EventCreateV1OutputEventCreateV1ErrorErrorType;", "", "", "loggingName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getLoggingName", "()Ljava/lang/String;", "Companion", "px6", "SYSTEM_PERMISSION_DENIED", "APP_PERMISSION_DENIED", "RESTRICTED_ACCESS", "CALENDAR_NOT_FOUND", "INVALID_DATA", "CREATE_FAILED", "ADD_ATTENDEES_NOT_SUPPORTED", "UNKNOWN", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = qx6.class)
public final class EventCreateV1OutputEventCreateV1ErrorErrorType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ EventCreateV1OutputEventCreateV1ErrorErrorType[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final px6 Companion;
    private final String loggingName;
    public static final EventCreateV1OutputEventCreateV1ErrorErrorType SYSTEM_PERMISSION_DENIED = new EventCreateV1OutputEventCreateV1ErrorErrorType("SYSTEM_PERMISSION_DENIED", 0, "system_permission_denied");
    public static final EventCreateV1OutputEventCreateV1ErrorErrorType APP_PERMISSION_DENIED = new EventCreateV1OutputEventCreateV1ErrorErrorType("APP_PERMISSION_DENIED", 1, "app_permission_denied");
    public static final EventCreateV1OutputEventCreateV1ErrorErrorType RESTRICTED_ACCESS = new EventCreateV1OutputEventCreateV1ErrorErrorType("RESTRICTED_ACCESS", 2, "restricted_access");
    public static final EventCreateV1OutputEventCreateV1ErrorErrorType CALENDAR_NOT_FOUND = new EventCreateV1OutputEventCreateV1ErrorErrorType("CALENDAR_NOT_FOUND", 3, "calendar_not_found");
    public static final EventCreateV1OutputEventCreateV1ErrorErrorType INVALID_DATA = new EventCreateV1OutputEventCreateV1ErrorErrorType("INVALID_DATA", 4, "invalid_data");
    public static final EventCreateV1OutputEventCreateV1ErrorErrorType CREATE_FAILED = new EventCreateV1OutputEventCreateV1ErrorErrorType("CREATE_FAILED", 5, "create_failed");
    public static final EventCreateV1OutputEventCreateV1ErrorErrorType ADD_ATTENDEES_NOT_SUPPORTED = new EventCreateV1OutputEventCreateV1ErrorErrorType("ADD_ATTENDEES_NOT_SUPPORTED", 6, "add_attendees_not_supported");
    public static final EventCreateV1OutputEventCreateV1ErrorErrorType UNKNOWN = new EventCreateV1OutputEventCreateV1ErrorErrorType("UNKNOWN", 7, "unknown");

    private static final /* synthetic */ EventCreateV1OutputEventCreateV1ErrorErrorType[] $values() {
        return new EventCreateV1OutputEventCreateV1ErrorErrorType[]{SYSTEM_PERMISSION_DENIED, APP_PERMISSION_DENIED, RESTRICTED_ACCESS, CALENDAR_NOT_FOUND, INVALID_DATA, CREATE_FAILED, ADD_ATTENDEES_NOT_SUPPORTED, UNKNOWN};
    }

    static {
        EventCreateV1OutputEventCreateV1ErrorErrorType[] eventCreateV1OutputEventCreateV1ErrorErrorTypeArr$values = $values();
        $VALUES = eventCreateV1OutputEventCreateV1ErrorErrorTypeArr$values;
        $ENTRIES = wd6.n0(eventCreateV1OutputEventCreateV1ErrorErrorTypeArr$values);
        Companion = new px6();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new fw6(13));
    }

    private EventCreateV1OutputEventCreateV1ErrorErrorType(String str, int i, String str2) {
        this.loggingName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.tool.model.EventCreateV1OutputEventCreateV1ErrorErrorType", values(), new String[]{"system_permission_denied", "app_permission_denied", "restricted_access", "calendar_not_found", "invalid_data", "create_failed", "add_attendees_not_supported", "unknown"}, new Annotation[][]{null, null, null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static EventCreateV1OutputEventCreateV1ErrorErrorType valueOf(String str) {
        return (EventCreateV1OutputEventCreateV1ErrorErrorType) Enum.valueOf(EventCreateV1OutputEventCreateV1ErrorErrorType.class, str);
    }

    public static EventCreateV1OutputEventCreateV1ErrorErrorType[] values() {
        return (EventCreateV1OutputEventCreateV1ErrorErrorType[]) $VALUES.clone();
    }

    public final String getLoggingName() {
        return this.loggingName;
    }
}
