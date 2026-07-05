package com.anthropic.claude.analytics.events;

import defpackage.a3e;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import defpackage.zcd;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/anthropic/claude/analytics/events/ReadAloudEvents$ReadAloudInterruptReason", "", "Lcom/anthropic/claude/analytics/events/ReadAloudEvents$ReadAloudInterruptReason;", "<init>", "(Ljava/lang/String;I)V", "Companion", "a3e", "UNSPECIFIED", "USER_STOP", "SYSTEM_INTERRUPTION", "ROUTE_CHANGE", "FOCUS_LOSS", "NEW_MESSAGE", "USER_PAUSE", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ReadAloudEvents$ReadAloudInterruptReason {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ReadAloudEvents$ReadAloudInterruptReason[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final a3e Companion;
    public static final ReadAloudEvents$ReadAloudInterruptReason UNSPECIFIED = new ReadAloudEvents$ReadAloudInterruptReason("UNSPECIFIED", 0);
    public static final ReadAloudEvents$ReadAloudInterruptReason USER_STOP = new ReadAloudEvents$ReadAloudInterruptReason("USER_STOP", 1);
    public static final ReadAloudEvents$ReadAloudInterruptReason SYSTEM_INTERRUPTION = new ReadAloudEvents$ReadAloudInterruptReason("SYSTEM_INTERRUPTION", 2);
    public static final ReadAloudEvents$ReadAloudInterruptReason ROUTE_CHANGE = new ReadAloudEvents$ReadAloudInterruptReason("ROUTE_CHANGE", 3);
    public static final ReadAloudEvents$ReadAloudInterruptReason FOCUS_LOSS = new ReadAloudEvents$ReadAloudInterruptReason("FOCUS_LOSS", 4);
    public static final ReadAloudEvents$ReadAloudInterruptReason NEW_MESSAGE = new ReadAloudEvents$ReadAloudInterruptReason("NEW_MESSAGE", 5);
    public static final ReadAloudEvents$ReadAloudInterruptReason USER_PAUSE = new ReadAloudEvents$ReadAloudInterruptReason("USER_PAUSE", 6);

    private static final /* synthetic */ ReadAloudEvents$ReadAloudInterruptReason[] $values() {
        return new ReadAloudEvents$ReadAloudInterruptReason[]{UNSPECIFIED, USER_STOP, SYSTEM_INTERRUPTION, ROUTE_CHANGE, FOCUS_LOSS, NEW_MESSAGE, USER_PAUSE};
    }

    static {
        ReadAloudEvents$ReadAloudInterruptReason[] readAloudEvents$ReadAloudInterruptReasonArr$values = $values();
        $VALUES = readAloudEvents$ReadAloudInterruptReasonArr$values;
        $ENTRIES = wd6.n0(readAloudEvents$ReadAloudInterruptReasonArr$values);
        Companion = new a3e();
        $cachedSerializer$delegate = yb5.w(w1a.F, new zcd(7));
    }

    private ReadAloudEvents$ReadAloudInterruptReason(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ReadAloudEvents.ReadAloudInterruptReason", values(), new String[]{"unknown", "user_stop", "system_interruption", "route_change", "focus_loss", "new_message", "user_pause"}, new Annotation[][]{null, null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ReadAloudEvents$ReadAloudInterruptReason valueOf(String str) {
        return (ReadAloudEvents$ReadAloudInterruptReason) Enum.valueOf(ReadAloudEvents$ReadAloudInterruptReason.class, str);
    }

    public static ReadAloudEvents$ReadAloudInterruptReason[] values() {
        return (ReadAloudEvents$ReadAloudInterruptReason[]) $VALUES.clone();
    }
}
