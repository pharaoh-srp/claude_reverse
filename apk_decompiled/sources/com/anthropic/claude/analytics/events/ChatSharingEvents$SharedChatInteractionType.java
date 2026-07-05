package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mb3;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.wy2;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/anthropic/claude/analytics/events/ChatSharingEvents$SharedChatInteractionType", "", "Lcom/anthropic/claude/analytics/events/ChatSharingEvents$SharedChatInteractionType;", "<init>", "(Ljava/lang/String;I)V", "Companion", "mb3", "UNSPECIFIED", "REPORT", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ChatSharingEvents$SharedChatInteractionType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ChatSharingEvents$SharedChatInteractionType[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final mb3 Companion;
    public static final ChatSharingEvents$SharedChatInteractionType UNSPECIFIED = new ChatSharingEvents$SharedChatInteractionType("UNSPECIFIED", 0);
    public static final ChatSharingEvents$SharedChatInteractionType REPORT = new ChatSharingEvents$SharedChatInteractionType("REPORT", 1);

    private static final /* synthetic */ ChatSharingEvents$SharedChatInteractionType[] $values() {
        return new ChatSharingEvents$SharedChatInteractionType[]{UNSPECIFIED, REPORT};
    }

    static {
        ChatSharingEvents$SharedChatInteractionType[] chatSharingEvents$SharedChatInteractionTypeArr$values = $values();
        $VALUES = chatSharingEvents$SharedChatInteractionTypeArr$values;
        $ENTRIES = wd6.n0(chatSharingEvents$SharedChatInteractionTypeArr$values);
        Companion = new mb3();
        $cachedSerializer$delegate = yb5.w(w1a.F, new wy2(16));
    }

    private ChatSharingEvents$SharedChatInteractionType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ChatSharingEvents.SharedChatInteractionType", values(), new String[]{"unspecified", "report"}, new Annotation[][]{null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ChatSharingEvents$SharedChatInteractionType valueOf(String str) {
        return (ChatSharingEvents$SharedChatInteractionType) Enum.valueOf(ChatSharingEvents$SharedChatInteractionType.class, str);
    }

    public static ChatSharingEvents$SharedChatInteractionType[] values() {
        return (ChatSharingEvents$SharedChatInteractionType[]) $VALUES.clone();
    }
}
