package com.anthropic.claude.tool.model;

import defpackage.fq6;
import defpackage.fw6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.uw6;
import defpackage.vw6;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/tool/model/EventCreateV1InputNewEventsItemAvailability;", "", "", "loggingName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getLoggingName", "()Ljava/lang/String;", "Companion", "uw6", "BUSY", "FREE", "TENTATIVE", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = vw6.class)
public final class EventCreateV1InputNewEventsItemAvailability {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ EventCreateV1InputNewEventsItemAvailability[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final uw6 Companion;
    private final String loggingName;
    public static final EventCreateV1InputNewEventsItemAvailability BUSY = new EventCreateV1InputNewEventsItemAvailability("BUSY", 0, "busy");
    public static final EventCreateV1InputNewEventsItemAvailability FREE = new EventCreateV1InputNewEventsItemAvailability("FREE", 1, "free");
    public static final EventCreateV1InputNewEventsItemAvailability TENTATIVE = new EventCreateV1InputNewEventsItemAvailability("TENTATIVE", 2, "tentative");

    private static final /* synthetic */ EventCreateV1InputNewEventsItemAvailability[] $values() {
        return new EventCreateV1InputNewEventsItemAvailability[]{BUSY, FREE, TENTATIVE};
    }

    static {
        EventCreateV1InputNewEventsItemAvailability[] eventCreateV1InputNewEventsItemAvailabilityArr$values = $values();
        $VALUES = eventCreateV1InputNewEventsItemAvailabilityArr$values;
        $ENTRIES = wd6.n0(eventCreateV1InputNewEventsItemAvailabilityArr$values);
        Companion = new uw6();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new fw6(5));
    }

    private EventCreateV1InputNewEventsItemAvailability(String str, int i, String str2) {
        this.loggingName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItemAvailability", values(), new String[]{"busy", "free", "tentative"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static EventCreateV1InputNewEventsItemAvailability valueOf(String str) {
        return (EventCreateV1InputNewEventsItemAvailability) Enum.valueOf(EventCreateV1InputNewEventsItemAvailability.class, str);
    }

    public static EventCreateV1InputNewEventsItemAvailability[] values() {
        return (EventCreateV1InputNewEventsItemAvailability[]) $VALUES.clone();
    }

    public final String getLoggingName() {
        return this.loggingName;
    }
}
