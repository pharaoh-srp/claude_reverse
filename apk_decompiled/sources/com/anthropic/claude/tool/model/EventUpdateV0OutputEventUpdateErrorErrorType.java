package com.anthropic.claude.tool.model;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.m17;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.p37;
import defpackage.q37;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/anthropic/claude/tool/model/EventUpdateV0OutputEventUpdateErrorErrorType;", "", "", "loggingName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getLoggingName", "()Ljava/lang/String;", "Companion", "p37", "SYSTEM_PERMISSION_DENIED", "APP_PERMISSION_DENIED", "RESTRICTED_ACCESS", "EVENT_NOT_FOUND", "CALENDAR_NOT_FOUND", "INVALID_DATA", "UPDATE_FAILED", "EDIT_ATTENDEES_NOT_SUPPORTED", "UNKNOWN", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = q37.class)
public final class EventUpdateV0OutputEventUpdateErrorErrorType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ EventUpdateV0OutputEventUpdateErrorErrorType[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final p37 Companion;
    private final String loggingName;
    public static final EventUpdateV0OutputEventUpdateErrorErrorType SYSTEM_PERMISSION_DENIED = new EventUpdateV0OutputEventUpdateErrorErrorType("SYSTEM_PERMISSION_DENIED", 0, "system_permission_denied");
    public static final EventUpdateV0OutputEventUpdateErrorErrorType APP_PERMISSION_DENIED = new EventUpdateV0OutputEventUpdateErrorErrorType("APP_PERMISSION_DENIED", 1, "app_permission_denied");
    public static final EventUpdateV0OutputEventUpdateErrorErrorType RESTRICTED_ACCESS = new EventUpdateV0OutputEventUpdateErrorErrorType("RESTRICTED_ACCESS", 2, "restricted_access");
    public static final EventUpdateV0OutputEventUpdateErrorErrorType EVENT_NOT_FOUND = new EventUpdateV0OutputEventUpdateErrorErrorType("EVENT_NOT_FOUND", 3, "event_not_found");
    public static final EventUpdateV0OutputEventUpdateErrorErrorType CALENDAR_NOT_FOUND = new EventUpdateV0OutputEventUpdateErrorErrorType("CALENDAR_NOT_FOUND", 4, "calendar_not_found");
    public static final EventUpdateV0OutputEventUpdateErrorErrorType INVALID_DATA = new EventUpdateV0OutputEventUpdateErrorErrorType("INVALID_DATA", 5, "invalid_data");
    public static final EventUpdateV0OutputEventUpdateErrorErrorType UPDATE_FAILED = new EventUpdateV0OutputEventUpdateErrorErrorType("UPDATE_FAILED", 6, "update_failed");
    public static final EventUpdateV0OutputEventUpdateErrorErrorType EDIT_ATTENDEES_NOT_SUPPORTED = new EventUpdateV0OutputEventUpdateErrorErrorType("EDIT_ATTENDEES_NOT_SUPPORTED", 7, "edit_attendees_not_supported");
    public static final EventUpdateV0OutputEventUpdateErrorErrorType UNKNOWN = new EventUpdateV0OutputEventUpdateErrorErrorType("UNKNOWN", 8, "unknown");

    private static final /* synthetic */ EventUpdateV0OutputEventUpdateErrorErrorType[] $values() {
        return new EventUpdateV0OutputEventUpdateErrorErrorType[]{SYSTEM_PERMISSION_DENIED, APP_PERMISSION_DENIED, RESTRICTED_ACCESS, EVENT_NOT_FOUND, CALENDAR_NOT_FOUND, INVALID_DATA, UPDATE_FAILED, EDIT_ATTENDEES_NOT_SUPPORTED, UNKNOWN};
    }

    static {
        EventUpdateV0OutputEventUpdateErrorErrorType[] eventUpdateV0OutputEventUpdateErrorErrorTypeArr$values = $values();
        $VALUES = eventUpdateV0OutputEventUpdateErrorErrorTypeArr$values;
        $ENTRIES = wd6.n0(eventUpdateV0OutputEventUpdateErrorErrorTypeArr$values);
        Companion = new p37();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new m17(13));
    }

    private EventUpdateV0OutputEventUpdateErrorErrorType(String str, int i, String str2) {
        this.loggingName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateErrorErrorType", values(), new String[]{"system_permission_denied", "app_permission_denied", "restricted_access", "event_not_found", "calendar_not_found", "invalid_data", "update_failed", "edit_attendees_not_supported", "unknown"}, new Annotation[][]{null, null, null, null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static EventUpdateV0OutputEventUpdateErrorErrorType valueOf(String str) {
        return (EventUpdateV0OutputEventUpdateErrorErrorType) Enum.valueOf(EventUpdateV0OutputEventUpdateErrorErrorType.class, str);
    }

    public static EventUpdateV0OutputEventUpdateErrorErrorType[] values() {
        return (EventUpdateV0OutputEventUpdateErrorErrorType[]) $VALUES.clone();
    }

    public final String getLoggingName() {
        return this.loggingName;
    }
}
