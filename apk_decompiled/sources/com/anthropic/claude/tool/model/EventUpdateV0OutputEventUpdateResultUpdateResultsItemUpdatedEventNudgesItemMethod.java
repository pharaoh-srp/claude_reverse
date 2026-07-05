package com.anthropic.claude.tool.model;

import defpackage.d47;
import defpackage.e47;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.m17;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/anthropic/claude/tool/model/EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItemMethod;", "", "", "loggingName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getLoggingName", "()Ljava/lang/String;", "Companion", "d47", "FALLBACK", "NOTIFICATION", "EMAIL", "SMS", "ALARM", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = e47.class)
public final class EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItemMethod {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItemMethod[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final d47 Companion;
    private final String loggingName;
    public static final EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItemMethod FALLBACK = new EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItemMethod("FALLBACK", 0, "fallback");
    public static final EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItemMethod NOTIFICATION = new EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItemMethod("NOTIFICATION", 1, "notification");
    public static final EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItemMethod EMAIL = new EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItemMethod("EMAIL", 2, "email");
    public static final EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItemMethod SMS = new EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItemMethod("SMS", 3, "sms");
    public static final EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItemMethod ALARM = new EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItemMethod("ALARM", 4, "alarm");

    private static final /* synthetic */ EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItemMethod[] $values() {
        return new EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItemMethod[]{FALLBACK, NOTIFICATION, EMAIL, SMS, ALARM};
    }

    static {
        EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItemMethod[] eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItemMethodArr$values = $values();
        $VALUES = eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItemMethodArr$values;
        $ENTRIES = wd6.n0(eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItemMethodArr$values);
        Companion = new d47();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new m17(18));
    }

    private EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItemMethod(String str, int i, String str2) {
        this.loggingName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItemMethod", values(), new String[]{"fallback", "notification", "email", "sms", "alarm"}, new Annotation[][]{null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItemMethod valueOf(String str) {
        return (EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItemMethod) Enum.valueOf(EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItemMethod.class, str);
    }

    public static EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItemMethod[] values() {
        return (EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItemMethod[]) $VALUES.clone();
    }

    public final String getLoggingName() {
        return this.loggingName;
    }
}
