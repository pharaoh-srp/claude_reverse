package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.kr2;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$StreamingMessageCompletionStatus", "", "Lcom/anthropic/claude/analytics/events/ChatEvents$StreamingMessageCompletionStatus;", "<init>", "(Ljava/lang/String;I)V", "Companion", "kr2", "UNSPECIFIED", "SUCCESS", "FAILED", "ABANDONED", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ChatEvents$StreamingMessageCompletionStatus {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ChatEvents$StreamingMessageCompletionStatus[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final kr2 Companion;
    public static final ChatEvents$StreamingMessageCompletionStatus UNSPECIFIED = new ChatEvents$StreamingMessageCompletionStatus("UNSPECIFIED", 0);
    public static final ChatEvents$StreamingMessageCompletionStatus SUCCESS = new ChatEvents$StreamingMessageCompletionStatus("SUCCESS", 1);
    public static final ChatEvents$StreamingMessageCompletionStatus FAILED = new ChatEvents$StreamingMessageCompletionStatus("FAILED", 2);
    public static final ChatEvents$StreamingMessageCompletionStatus ABANDONED = new ChatEvents$StreamingMessageCompletionStatus("ABANDONED", 3);

    private static final /* synthetic */ ChatEvents$StreamingMessageCompletionStatus[] $values() {
        return new ChatEvents$StreamingMessageCompletionStatus[]{UNSPECIFIED, SUCCESS, FAILED, ABANDONED};
    }

    static {
        ChatEvents$StreamingMessageCompletionStatus[] chatEvents$StreamingMessageCompletionStatusArr$values = $values();
        $VALUES = chatEvents$StreamingMessageCompletionStatusArr$values;
        $ENTRIES = wd6.n0(chatEvents$StreamingMessageCompletionStatusArr$values);
        Companion = new kr2();
        $cachedSerializer$delegate = yb5.w(w1a.F, new xq2(7));
    }

    private ChatEvents$StreamingMessageCompletionStatus(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ChatEvents.StreamingMessageCompletionStatus", values(), new String[]{"unknown", "success", "failed", "abandoned"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ChatEvents$StreamingMessageCompletionStatus valueOf(String str) {
        return (ChatEvents$StreamingMessageCompletionStatus) Enum.valueOf(ChatEvents$StreamingMessageCompletionStatus.class, str);
    }

    public static ChatEvents$StreamingMessageCompletionStatus[] values() {
        return (ChatEvents$StreamingMessageCompletionStatus[]) $VALUES.clone();
    }
}
