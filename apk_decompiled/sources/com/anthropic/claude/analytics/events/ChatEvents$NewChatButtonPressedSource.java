package com.anthropic.claude.analytics.events;

import defpackage.ao2;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.rp2;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$NewChatButtonPressedSource", "", "Lcom/anthropic/claude/analytics/events/ChatEvents$NewChatButtonPressedSource;", "<init>", "(Ljava/lang/String;I)V", "Companion", "rp2", "UNSPECIFIED", "CHAT_LIST", "CHAT", "HOME", "PROJECT", "NEW_WINDOW_HOTKEY", "CHAT_INPUT_NOTICE", "TOAST", "DRAWER_FOOTER", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ChatEvents$NewChatButtonPressedSource {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ChatEvents$NewChatButtonPressedSource[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final rp2 Companion;
    public static final ChatEvents$NewChatButtonPressedSource UNSPECIFIED = new ChatEvents$NewChatButtonPressedSource("UNSPECIFIED", 0);
    public static final ChatEvents$NewChatButtonPressedSource CHAT_LIST = new ChatEvents$NewChatButtonPressedSource("CHAT_LIST", 1);
    public static final ChatEvents$NewChatButtonPressedSource CHAT = new ChatEvents$NewChatButtonPressedSource("CHAT", 2);
    public static final ChatEvents$NewChatButtonPressedSource HOME = new ChatEvents$NewChatButtonPressedSource("HOME", 3);
    public static final ChatEvents$NewChatButtonPressedSource PROJECT = new ChatEvents$NewChatButtonPressedSource("PROJECT", 4);
    public static final ChatEvents$NewChatButtonPressedSource NEW_WINDOW_HOTKEY = new ChatEvents$NewChatButtonPressedSource("NEW_WINDOW_HOTKEY", 5);
    public static final ChatEvents$NewChatButtonPressedSource CHAT_INPUT_NOTICE = new ChatEvents$NewChatButtonPressedSource("CHAT_INPUT_NOTICE", 6);
    public static final ChatEvents$NewChatButtonPressedSource TOAST = new ChatEvents$NewChatButtonPressedSource("TOAST", 7);
    public static final ChatEvents$NewChatButtonPressedSource DRAWER_FOOTER = new ChatEvents$NewChatButtonPressedSource("DRAWER_FOOTER", 8);

    private static final /* synthetic */ ChatEvents$NewChatButtonPressedSource[] $values() {
        return new ChatEvents$NewChatButtonPressedSource[]{UNSPECIFIED, CHAT_LIST, CHAT, HOME, PROJECT, NEW_WINDOW_HOTKEY, CHAT_INPUT_NOTICE, TOAST, DRAWER_FOOTER};
    }

    static {
        ChatEvents$NewChatButtonPressedSource[] chatEvents$NewChatButtonPressedSourceArr$values = $values();
        $VALUES = chatEvents$NewChatButtonPressedSourceArr$values;
        $ENTRIES = wd6.n0(chatEvents$NewChatButtonPressedSourceArr$values);
        Companion = new rp2();
        $cachedSerializer$delegate = yb5.w(w1a.F, new ao2(16));
    }

    private ChatEvents$NewChatButtonPressedSource(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ChatEvents.NewChatButtonPressedSource", values(), new String[]{"unknown", "chat_list", "chat", "home", "project", "new_window_hotkey", "chat_input_notice", "toast", "drawer_footer"}, new Annotation[][]{null, null, null, null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ChatEvents$NewChatButtonPressedSource valueOf(String str) {
        return (ChatEvents$NewChatButtonPressedSource) Enum.valueOf(ChatEvents$NewChatButtonPressedSource.class, str);
    }

    public static ChatEvents$NewChatButtonPressedSource[] values() {
        return (ChatEvents$NewChatButtonPressedSource[]) $VALUES.clone();
    }
}
