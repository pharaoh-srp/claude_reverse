package com.anthropic.claude.analytics.events;

import defpackage.ao2;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.rq2;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$RetryCompletionReason", "", "Lcom/anthropic/claude/analytics/events/ChatEvents$RetryCompletionReason;", "<init>", "(Ljava/lang/String;I)V", "Companion", "rq2", "UNSPECIFIED", "CHAT_FOOTER", "FALLBACK_MODEL", "PARTIAL_RESPONSE_ERROR", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ChatEvents$RetryCompletionReason {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ChatEvents$RetryCompletionReason[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final rq2 Companion;
    public static final ChatEvents$RetryCompletionReason UNSPECIFIED = new ChatEvents$RetryCompletionReason("UNSPECIFIED", 0);
    public static final ChatEvents$RetryCompletionReason CHAT_FOOTER = new ChatEvents$RetryCompletionReason("CHAT_FOOTER", 1);
    public static final ChatEvents$RetryCompletionReason FALLBACK_MODEL = new ChatEvents$RetryCompletionReason("FALLBACK_MODEL", 2);
    public static final ChatEvents$RetryCompletionReason PARTIAL_RESPONSE_ERROR = new ChatEvents$RetryCompletionReason("PARTIAL_RESPONSE_ERROR", 3);

    private static final /* synthetic */ ChatEvents$RetryCompletionReason[] $values() {
        return new ChatEvents$RetryCompletionReason[]{UNSPECIFIED, CHAT_FOOTER, FALLBACK_MODEL, PARTIAL_RESPONSE_ERROR};
    }

    static {
        ChatEvents$RetryCompletionReason[] chatEvents$RetryCompletionReasonArr$values = $values();
        $VALUES = chatEvents$RetryCompletionReasonArr$values;
        $ENTRIES = wd6.n0(chatEvents$RetryCompletionReasonArr$values);
        Companion = new rq2();
        $cachedSerializer$delegate = yb5.w(w1a.F, new ao2(26));
    }

    private ChatEvents$RetryCompletionReason(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ChatEvents.RetryCompletionReason", values(), new String[]{"unspecified", "chat_footer", "fallback_model", "partial_response_error"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ChatEvents$RetryCompletionReason valueOf(String str) {
        return (ChatEvents$RetryCompletionReason) Enum.valueOf(ChatEvents$RetryCompletionReason.class, str);
    }

    public static ChatEvents$RetryCompletionReason[] values() {
        return (ChatEvents$RetryCompletionReason[]) $VALUES.clone();
    }
}
