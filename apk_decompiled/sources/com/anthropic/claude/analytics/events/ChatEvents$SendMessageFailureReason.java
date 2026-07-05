package com.anthropic.claude.analytics.events;

import defpackage.ar2;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$SendMessageFailureReason", "", "Lcom/anthropic/claude/analytics/events/ChatEvents$SendMessageFailureReason;", "<init>", "(Ljava/lang/String;I)V", "Companion", "ar2", "UNSPECIFIED", "SERVER_SENT_ERROR", "SERVER_SENT_CONNECTION_EXCEPTION", "CLIENT_EXCEPTION", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ChatEvents$SendMessageFailureReason {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ChatEvents$SendMessageFailureReason[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final ar2 Companion;
    public static final ChatEvents$SendMessageFailureReason UNSPECIFIED = new ChatEvents$SendMessageFailureReason("UNSPECIFIED", 0);
    public static final ChatEvents$SendMessageFailureReason SERVER_SENT_ERROR = new ChatEvents$SendMessageFailureReason("SERVER_SENT_ERROR", 1);
    public static final ChatEvents$SendMessageFailureReason SERVER_SENT_CONNECTION_EXCEPTION = new ChatEvents$SendMessageFailureReason("SERVER_SENT_CONNECTION_EXCEPTION", 2);
    public static final ChatEvents$SendMessageFailureReason CLIENT_EXCEPTION = new ChatEvents$SendMessageFailureReason("CLIENT_EXCEPTION", 3);

    private static final /* synthetic */ ChatEvents$SendMessageFailureReason[] $values() {
        return new ChatEvents$SendMessageFailureReason[]{UNSPECIFIED, SERVER_SENT_ERROR, SERVER_SENT_CONNECTION_EXCEPTION, CLIENT_EXCEPTION};
    }

    static {
        ChatEvents$SendMessageFailureReason[] chatEvents$SendMessageFailureReasonArr$values = $values();
        $VALUES = chatEvents$SendMessageFailureReasonArr$values;
        $ENTRIES = wd6.n0(chatEvents$SendMessageFailureReasonArr$values);
        Companion = new ar2();
        $cachedSerializer$delegate = yb5.w(w1a.F, new xq2(2));
    }

    private ChatEvents$SendMessageFailureReason(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ChatEvents.SendMessageFailureReason", values(), new String[]{"unspecified", "server_sent_error", "server_sent_connection_exception", "client_exception"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ChatEvents$SendMessageFailureReason valueOf(String str) {
        return (ChatEvents$SendMessageFailureReason) Enum.valueOf(ChatEvents$SendMessageFailureReason.class, str);
    }

    public static ChatEvents$SendMessageFailureReason[] values() {
        return (ChatEvents$SendMessageFailureReason[]) $VALUES.clone();
    }
}
