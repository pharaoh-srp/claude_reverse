package com.anthropic.claude.analytics.events;

import defpackage.dr2;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.xq2;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$SendRetryOutcome", "", "Lcom/anthropic/claude/analytics/events/ChatEvents$SendRetryOutcome;", "<init>", "(Ljava/lang/String;I)V", "Companion", "dr2", "UNSPECIFIED", "SUCCESS", "EXHAUSTED", "CANCELLED", "POLLING_FALLBACK", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ChatEvents$SendRetryOutcome {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ChatEvents$SendRetryOutcome[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final dr2 Companion;
    public static final ChatEvents$SendRetryOutcome UNSPECIFIED = new ChatEvents$SendRetryOutcome("UNSPECIFIED", 0);
    public static final ChatEvents$SendRetryOutcome SUCCESS = new ChatEvents$SendRetryOutcome("SUCCESS", 1);
    public static final ChatEvents$SendRetryOutcome EXHAUSTED = new ChatEvents$SendRetryOutcome("EXHAUSTED", 2);
    public static final ChatEvents$SendRetryOutcome CANCELLED = new ChatEvents$SendRetryOutcome("CANCELLED", 3);
    public static final ChatEvents$SendRetryOutcome POLLING_FALLBACK = new ChatEvents$SendRetryOutcome("POLLING_FALLBACK", 4);

    private static final /* synthetic */ ChatEvents$SendRetryOutcome[] $values() {
        return new ChatEvents$SendRetryOutcome[]{UNSPECIFIED, SUCCESS, EXHAUSTED, CANCELLED, POLLING_FALLBACK};
    }

    static {
        ChatEvents$SendRetryOutcome[] chatEvents$SendRetryOutcomeArr$values = $values();
        $VALUES = chatEvents$SendRetryOutcomeArr$values;
        $ENTRIES = wd6.n0(chatEvents$SendRetryOutcomeArr$values);
        Companion = new dr2();
        $cachedSerializer$delegate = yb5.w(w1a.F, new xq2(4));
    }

    private ChatEvents$SendRetryOutcome(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ChatEvents.SendRetryOutcome", values(), new String[]{"unknown", "success", "exhausted", "cancelled", "polling_fallback"}, new Annotation[][]{null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ChatEvents$SendRetryOutcome valueOf(String str) {
        return (ChatEvents$SendRetryOutcome) Enum.valueOf(ChatEvents$SendRetryOutcome.class, str);
    }

    public static ChatEvents$SendRetryOutcome[] values() {
        return (ChatEvents$SendRetryOutcome[]) $VALUES.clone();
    }
}
