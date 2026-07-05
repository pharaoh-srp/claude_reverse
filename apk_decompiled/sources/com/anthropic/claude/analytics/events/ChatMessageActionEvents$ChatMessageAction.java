package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.wy2;
import defpackage.xy2;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/anthropic/claude/analytics/events/ChatMessageActionEvents$ChatMessageAction", "", "Lcom/anthropic/claude/analytics/events/ChatMessageActionEvents$ChatMessageAction;", "<init>", "(Ljava/lang/String;I)V", "Companion", "xy2", "UNSPECIFIED", "COPY", "FEEDBACK_POSITIVE", "FEEDBACK_NEGATIVE", "MESSAGE_RETRY", "SELECT", "SHARE", "SPEAK", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ChatMessageActionEvents$ChatMessageAction {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ChatMessageActionEvents$ChatMessageAction[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final xy2 Companion;
    public static final ChatMessageActionEvents$ChatMessageAction UNSPECIFIED = new ChatMessageActionEvents$ChatMessageAction("UNSPECIFIED", 0);
    public static final ChatMessageActionEvents$ChatMessageAction COPY = new ChatMessageActionEvents$ChatMessageAction("COPY", 1);
    public static final ChatMessageActionEvents$ChatMessageAction FEEDBACK_POSITIVE = new ChatMessageActionEvents$ChatMessageAction("FEEDBACK_POSITIVE", 2);
    public static final ChatMessageActionEvents$ChatMessageAction FEEDBACK_NEGATIVE = new ChatMessageActionEvents$ChatMessageAction("FEEDBACK_NEGATIVE", 3);
    public static final ChatMessageActionEvents$ChatMessageAction MESSAGE_RETRY = new ChatMessageActionEvents$ChatMessageAction("MESSAGE_RETRY", 4);
    public static final ChatMessageActionEvents$ChatMessageAction SELECT = new ChatMessageActionEvents$ChatMessageAction("SELECT", 5);
    public static final ChatMessageActionEvents$ChatMessageAction SHARE = new ChatMessageActionEvents$ChatMessageAction("SHARE", 6);
    public static final ChatMessageActionEvents$ChatMessageAction SPEAK = new ChatMessageActionEvents$ChatMessageAction("SPEAK", 7);

    private static final /* synthetic */ ChatMessageActionEvents$ChatMessageAction[] $values() {
        return new ChatMessageActionEvents$ChatMessageAction[]{UNSPECIFIED, COPY, FEEDBACK_POSITIVE, FEEDBACK_NEGATIVE, MESSAGE_RETRY, SELECT, SHARE, SPEAK};
    }

    static {
        ChatMessageActionEvents$ChatMessageAction[] chatMessageActionEvents$ChatMessageActionArr$values = $values();
        $VALUES = chatMessageActionEvents$ChatMessageActionArr$values;
        $ENTRIES = wd6.n0(chatMessageActionEvents$ChatMessageActionArr$values);
        Companion = new xy2();
        $cachedSerializer$delegate = yb5.w(w1a.F, new wy2(0));
    }

    private ChatMessageActionEvents$ChatMessageAction(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ChatMessageActionEvents.ChatMessageAction", values(), new String[]{"unknown_action", "copy", "feedback_positive", "feedback_negative", "message_retry", "select", "share", "speak"}, new Annotation[][]{null, null, null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ChatMessageActionEvents$ChatMessageAction valueOf(String str) {
        return (ChatMessageActionEvents$ChatMessageAction) Enum.valueOf(ChatMessageActionEvents$ChatMessageAction.class, str);
    }

    public static ChatMessageActionEvents$ChatMessageAction[] values() {
        return (ChatMessageActionEvents$ChatMessageAction[]) $VALUES.clone();
    }
}
