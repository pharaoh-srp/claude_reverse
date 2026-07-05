package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.vx2;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/anthropic/claude/analytics/events/ChatListEvents$ConversationSearchOutcome", "", "Lcom/anthropic/claude/analytics/events/ChatListEvents$ConversationSearchOutcome;", "<init>", "(Ljava/lang/String;I)V", "Companion", "vx2", "UNSPECIFIED", "CLICKED", "ABANDONED", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ChatListEvents$ConversationSearchOutcome {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ChatListEvents$ConversationSearchOutcome[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final vx2 Companion;
    public static final ChatListEvents$ConversationSearchOutcome UNSPECIFIED = new ChatListEvents$ConversationSearchOutcome("UNSPECIFIED", 0);
    public static final ChatListEvents$ConversationSearchOutcome CLICKED = new ChatListEvents$ConversationSearchOutcome("CLICKED", 1);
    public static final ChatListEvents$ConversationSearchOutcome ABANDONED = new ChatListEvents$ConversationSearchOutcome("ABANDONED", 2);

    private static final /* synthetic */ ChatListEvents$ConversationSearchOutcome[] $values() {
        return new ChatListEvents$ConversationSearchOutcome[]{UNSPECIFIED, CLICKED, ABANDONED};
    }

    static {
        ChatListEvents$ConversationSearchOutcome[] chatListEvents$ConversationSearchOutcomeArr$values = $values();
        $VALUES = chatListEvents$ConversationSearchOutcomeArr$values;
        $ENTRIES = wd6.n0(chatListEvents$ConversationSearchOutcomeArr$values);
        Companion = new vx2();
        $cachedSerializer$delegate = yb5.w(w1a.F, new xq2(17));
    }

    private ChatListEvents$ConversationSearchOutcome(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ChatListEvents.ConversationSearchOutcome", values(), new String[]{"unspecified", "clicked", "abandoned"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ChatListEvents$ConversationSearchOutcome valueOf(String str) {
        return (ChatListEvents$ConversationSearchOutcome) Enum.valueOf(ChatListEvents$ConversationSearchOutcome.class, str);
    }

    public static ChatListEvents$ConversationSearchOutcome[] values() {
        return (ChatListEvents$ConversationSearchOutcome[]) $VALUES.clone();
    }
}
