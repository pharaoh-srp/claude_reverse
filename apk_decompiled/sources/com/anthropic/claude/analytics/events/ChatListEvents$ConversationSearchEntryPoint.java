package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.ux2;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/anthropic/claude/analytics/events/ChatListEvents$ConversationSearchEntryPoint", "", "Lcom/anthropic/claude/analytics/events/ChatListEvents$ConversationSearchEntryPoint;", "<init>", "(Ljava/lang/String;I)V", "Companion", "ux2", "UNSPECIFIED", "SIDEBAR", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ChatListEvents$ConversationSearchEntryPoint {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ChatListEvents$ConversationSearchEntryPoint[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final ux2 Companion;
    public static final ChatListEvents$ConversationSearchEntryPoint UNSPECIFIED = new ChatListEvents$ConversationSearchEntryPoint("UNSPECIFIED", 0);
    public static final ChatListEvents$ConversationSearchEntryPoint SIDEBAR = new ChatListEvents$ConversationSearchEntryPoint("SIDEBAR", 1);

    private static final /* synthetic */ ChatListEvents$ConversationSearchEntryPoint[] $values() {
        return new ChatListEvents$ConversationSearchEntryPoint[]{UNSPECIFIED, SIDEBAR};
    }

    static {
        ChatListEvents$ConversationSearchEntryPoint[] chatListEvents$ConversationSearchEntryPointArr$values = $values();
        $VALUES = chatListEvents$ConversationSearchEntryPointArr$values;
        $ENTRIES = wd6.n0(chatListEvents$ConversationSearchEntryPointArr$values);
        Companion = new ux2();
        $cachedSerializer$delegate = yb5.w(w1a.F, new xq2(16));
    }

    private ChatListEvents$ConversationSearchEntryPoint(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ChatListEvents.ConversationSearchEntryPoint", values(), new String[]{"unspecified", "sidebar"}, new Annotation[][]{null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ChatListEvents$ConversationSearchEntryPoint valueOf(String str) {
        return (ChatListEvents$ConversationSearchEntryPoint) Enum.valueOf(ChatListEvents$ConversationSearchEntryPoint.class, str);
    }

    public static ChatListEvents$ConversationSearchEntryPoint[] values() {
        return (ChatListEvents$ConversationSearchEntryPoint[]) $VALUES.clone();
    }
}
