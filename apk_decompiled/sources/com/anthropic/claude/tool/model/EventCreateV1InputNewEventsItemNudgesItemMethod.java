package com.anthropic.claude.tool.model;

import defpackage.fq6;
import defpackage.fw6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import defpackage.yw6;
import defpackage.zw6;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/anthropic/claude/tool/model/EventCreateV1InputNewEventsItemNudgesItemMethod;", "", "", "loggingName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getLoggingName", "()Ljava/lang/String;", "Companion", "yw6", "FALLBACK", "NOTIFICATION", "EMAIL", "SMS", "ALARM", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = zw6.class)
public final class EventCreateV1InputNewEventsItemNudgesItemMethod {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ EventCreateV1InputNewEventsItemNudgesItemMethod[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final yw6 Companion;
    private final String loggingName;
    public static final EventCreateV1InputNewEventsItemNudgesItemMethod FALLBACK = new EventCreateV1InputNewEventsItemNudgesItemMethod("FALLBACK", 0, "fallback");
    public static final EventCreateV1InputNewEventsItemNudgesItemMethod NOTIFICATION = new EventCreateV1InputNewEventsItemNudgesItemMethod("NOTIFICATION", 1, "notification");
    public static final EventCreateV1InputNewEventsItemNudgesItemMethod EMAIL = new EventCreateV1InputNewEventsItemNudgesItemMethod("EMAIL", 2, "email");
    public static final EventCreateV1InputNewEventsItemNudgesItemMethod SMS = new EventCreateV1InputNewEventsItemNudgesItemMethod("SMS", 3, "sms");
    public static final EventCreateV1InputNewEventsItemNudgesItemMethod ALARM = new EventCreateV1InputNewEventsItemNudgesItemMethod("ALARM", 4, "alarm");

    private static final /* synthetic */ EventCreateV1InputNewEventsItemNudgesItemMethod[] $values() {
        return new EventCreateV1InputNewEventsItemNudgesItemMethod[]{FALLBACK, NOTIFICATION, EMAIL, SMS, ALARM};
    }

    static {
        EventCreateV1InputNewEventsItemNudgesItemMethod[] eventCreateV1InputNewEventsItemNudgesItemMethodArr$values = $values();
        $VALUES = eventCreateV1InputNewEventsItemNudgesItemMethodArr$values;
        $ENTRIES = wd6.n0(eventCreateV1InputNewEventsItemNudgesItemMethodArr$values);
        Companion = new yw6();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new fw6(6));
    }

    private EventCreateV1InputNewEventsItemNudgesItemMethod(String str, int i, String str2) {
        this.loggingName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItemNudgesItemMethod", values(), new String[]{"fallback", "notification", "email", "sms", "alarm"}, new Annotation[][]{null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static EventCreateV1InputNewEventsItemNudgesItemMethod valueOf(String str) {
        return (EventCreateV1InputNewEventsItemNudgesItemMethod) Enum.valueOf(EventCreateV1InputNewEventsItemNudgesItemMethod.class, str);
    }

    public static EventCreateV1InputNewEventsItemNudgesItemMethod[] values() {
        return (EventCreateV1InputNewEventsItemNudgesItemMethod[]) $VALUES.clone();
    }

    public final String getLoggingName() {
        return this.loggingName;
    }
}
