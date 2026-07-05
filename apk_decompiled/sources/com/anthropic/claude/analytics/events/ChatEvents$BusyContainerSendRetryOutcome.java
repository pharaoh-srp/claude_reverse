package com.anthropic.claude.analytics.events;

import defpackage.ao2;
import defpackage.bo2;
import defpackage.fq6;
import defpackage.kw9;
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
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$BusyContainerSendRetryOutcome", "", "Lcom/anthropic/claude/analytics/events/ChatEvents$BusyContainerSendRetryOutcome;", "<init>", "(Ljava/lang/String;I)V", "Companion", "bo2", "UNSPECIFIED", "RECOVERED", "STILL_BUSY", "STOP_FAILED", "OTHER_ERROR", "CANCELLED", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ChatEvents$BusyContainerSendRetryOutcome {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ChatEvents$BusyContainerSendRetryOutcome[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final bo2 Companion;
    public static final ChatEvents$BusyContainerSendRetryOutcome UNSPECIFIED = new ChatEvents$BusyContainerSendRetryOutcome("UNSPECIFIED", 0);
    public static final ChatEvents$BusyContainerSendRetryOutcome RECOVERED = new ChatEvents$BusyContainerSendRetryOutcome("RECOVERED", 1);
    public static final ChatEvents$BusyContainerSendRetryOutcome STILL_BUSY = new ChatEvents$BusyContainerSendRetryOutcome("STILL_BUSY", 2);
    public static final ChatEvents$BusyContainerSendRetryOutcome STOP_FAILED = new ChatEvents$BusyContainerSendRetryOutcome("STOP_FAILED", 3);
    public static final ChatEvents$BusyContainerSendRetryOutcome OTHER_ERROR = new ChatEvents$BusyContainerSendRetryOutcome("OTHER_ERROR", 4);
    public static final ChatEvents$BusyContainerSendRetryOutcome CANCELLED = new ChatEvents$BusyContainerSendRetryOutcome("CANCELLED", 5);

    private static final /* synthetic */ ChatEvents$BusyContainerSendRetryOutcome[] $values() {
        return new ChatEvents$BusyContainerSendRetryOutcome[]{UNSPECIFIED, RECOVERED, STILL_BUSY, STOP_FAILED, OTHER_ERROR, CANCELLED};
    }

    static {
        ChatEvents$BusyContainerSendRetryOutcome[] chatEvents$BusyContainerSendRetryOutcomeArr$values = $values();
        $VALUES = chatEvents$BusyContainerSendRetryOutcomeArr$values;
        $ENTRIES = wd6.n0(chatEvents$BusyContainerSendRetryOutcomeArr$values);
        Companion = new bo2();
        $cachedSerializer$delegate = yb5.w(w1a.F, new ao2(0));
    }

    private ChatEvents$BusyContainerSendRetryOutcome(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ChatEvents.BusyContainerSendRetryOutcome", values(), new String[]{"unknown", "recovered", "still_busy", "stop_failed", "other_error", "cancelled"}, new Annotation[][]{null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ChatEvents$BusyContainerSendRetryOutcome valueOf(String str) {
        return (ChatEvents$BusyContainerSendRetryOutcome) Enum.valueOf(ChatEvents$BusyContainerSendRetryOutcome.class, str);
    }

    public static ChatEvents$BusyContainerSendRetryOutcome[] values() {
        return (ChatEvents$BusyContainerSendRetryOutcome[]) $VALUES.clone();
    }
}
