package com.anthropic.claude.analytics.events;

import defpackage.ao2;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import defpackage.zp2;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$PollingRecoveryOutcome", "", "Lcom/anthropic/claude/analytics/events/ChatEvents$PollingRecoveryOutcome;", "<init>", "(Ljava/lang/String;I)V", "Companion", "zp2", "UNSPECIFIED", "SUCCESS", "EXHAUSTED", "CANCELLED", "SKIPPED", "SUPERSEDED", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ChatEvents$PollingRecoveryOutcome {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ChatEvents$PollingRecoveryOutcome[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final zp2 Companion;
    public static final ChatEvents$PollingRecoveryOutcome UNSPECIFIED = new ChatEvents$PollingRecoveryOutcome("UNSPECIFIED", 0);
    public static final ChatEvents$PollingRecoveryOutcome SUCCESS = new ChatEvents$PollingRecoveryOutcome("SUCCESS", 1);
    public static final ChatEvents$PollingRecoveryOutcome EXHAUSTED = new ChatEvents$PollingRecoveryOutcome("EXHAUSTED", 2);
    public static final ChatEvents$PollingRecoveryOutcome CANCELLED = new ChatEvents$PollingRecoveryOutcome("CANCELLED", 3);
    public static final ChatEvents$PollingRecoveryOutcome SKIPPED = new ChatEvents$PollingRecoveryOutcome("SKIPPED", 4);
    public static final ChatEvents$PollingRecoveryOutcome SUPERSEDED = new ChatEvents$PollingRecoveryOutcome("SUPERSEDED", 5);

    private static final /* synthetic */ ChatEvents$PollingRecoveryOutcome[] $values() {
        return new ChatEvents$PollingRecoveryOutcome[]{UNSPECIFIED, SUCCESS, EXHAUSTED, CANCELLED, SKIPPED, SUPERSEDED};
    }

    static {
        ChatEvents$PollingRecoveryOutcome[] chatEvents$PollingRecoveryOutcomeArr$values = $values();
        $VALUES = chatEvents$PollingRecoveryOutcomeArr$values;
        $ENTRIES = wd6.n0(chatEvents$PollingRecoveryOutcomeArr$values);
        Companion = new zp2();
        $cachedSerializer$delegate = yb5.w(w1a.F, new ao2(21));
    }

    private ChatEvents$PollingRecoveryOutcome(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ChatEvents.PollingRecoveryOutcome", values(), new String[]{"unknown", "success", "exhausted", "cancelled", "skipped", "superseded"}, new Annotation[][]{null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ChatEvents$PollingRecoveryOutcome valueOf(String str) {
        return (ChatEvents$PollingRecoveryOutcome) Enum.valueOf(ChatEvents$PollingRecoveryOutcome.class, str);
    }

    public static ChatEvents$PollingRecoveryOutcome[] values() {
        return (ChatEvents$PollingRecoveryOutcome[]) $VALUES.clone();
    }
}
