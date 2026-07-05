package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.xq2;
import defpackage.yb5;
import defpackage.yx2;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/anthropic/claude/analytics/events/ChatListEvents$ConversationSearchVersion", "", "Lcom/anthropic/claude/analytics/events/ChatListEvents$ConversationSearchVersion;", "<init>", "(Ljava/lang/String;I)V", "Companion", "yx2", "UNSPECIFIED", "V1", "V2", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ChatListEvents$ConversationSearchVersion {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ChatListEvents$ConversationSearchVersion[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final yx2 Companion;
    public static final ChatListEvents$ConversationSearchVersion UNSPECIFIED = new ChatListEvents$ConversationSearchVersion("UNSPECIFIED", 0);
    public static final ChatListEvents$ConversationSearchVersion V1 = new ChatListEvents$ConversationSearchVersion("V1", 1);
    public static final ChatListEvents$ConversationSearchVersion V2 = new ChatListEvents$ConversationSearchVersion("V2", 2);

    private static final /* synthetic */ ChatListEvents$ConversationSearchVersion[] $values() {
        return new ChatListEvents$ConversationSearchVersion[]{UNSPECIFIED, V1, V2};
    }

    static {
        ChatListEvents$ConversationSearchVersion[] chatListEvents$ConversationSearchVersionArr$values = $values();
        $VALUES = chatListEvents$ConversationSearchVersionArr$values;
        $ENTRIES = wd6.n0(chatListEvents$ConversationSearchVersionArr$values);
        Companion = new yx2();
        $cachedSerializer$delegate = yb5.w(w1a.F, new xq2(21));
    }

    private ChatListEvents$ConversationSearchVersion(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ChatListEvents.ConversationSearchVersion", values(), new String[]{"unspecified", "v1", "v2"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ChatListEvents$ConversationSearchVersion valueOf(String str) {
        return (ChatListEvents$ConversationSearchVersion) Enum.valueOf(ChatListEvents$ConversationSearchVersion.class, str);
    }

    public static ChatListEvents$ConversationSearchVersion[] values() {
        return (ChatListEvents$ConversationSearchVersion[]) $VALUES.clone();
    }
}
