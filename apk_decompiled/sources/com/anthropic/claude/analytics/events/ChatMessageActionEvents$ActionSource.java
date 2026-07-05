package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.vy2;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/anthropic/claude/analytics/events/ChatMessageActionEvents$ActionSource", "", "Lcom/anthropic/claude/analytics/events/ChatMessageActionEvents$ActionSource;", "<init>", "(Ljava/lang/String;I)V", "Companion", "vy2", "UNSPECIFIED", "LONG_PRESS", "FOOTER_ACTION_BAR", "TOOL_USE", "OVERFLOW_MENU", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ChatMessageActionEvents$ActionSource {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ChatMessageActionEvents$ActionSource[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final vy2 Companion;
    public static final ChatMessageActionEvents$ActionSource UNSPECIFIED = new ChatMessageActionEvents$ActionSource("UNSPECIFIED", 0);
    public static final ChatMessageActionEvents$ActionSource LONG_PRESS = new ChatMessageActionEvents$ActionSource("LONG_PRESS", 1);
    public static final ChatMessageActionEvents$ActionSource FOOTER_ACTION_BAR = new ChatMessageActionEvents$ActionSource("FOOTER_ACTION_BAR", 2);
    public static final ChatMessageActionEvents$ActionSource TOOL_USE = new ChatMessageActionEvents$ActionSource("TOOL_USE", 3);
    public static final ChatMessageActionEvents$ActionSource OVERFLOW_MENU = new ChatMessageActionEvents$ActionSource("OVERFLOW_MENU", 4);

    private static final /* synthetic */ ChatMessageActionEvents$ActionSource[] $values() {
        return new ChatMessageActionEvents$ActionSource[]{UNSPECIFIED, LONG_PRESS, FOOTER_ACTION_BAR, TOOL_USE, OVERFLOW_MENU};
    }

    static {
        ChatMessageActionEvents$ActionSource[] chatMessageActionEvents$ActionSourceArr$values = $values();
        $VALUES = chatMessageActionEvents$ActionSourceArr$values;
        $ENTRIES = wd6.n0(chatMessageActionEvents$ActionSourceArr$values);
        Companion = new vy2();
        $cachedSerializer$delegate = yb5.w(w1a.F, new xq2(29));
    }

    private ChatMessageActionEvents$ActionSource(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ChatMessageActionEvents.ActionSource", values(), new String[]{"unknown_source", "long_press", "footer_action_bar", "tool_use", "overflow_menu"}, new Annotation[][]{null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ChatMessageActionEvents$ActionSource valueOf(String str) {
        return (ChatMessageActionEvents$ActionSource) Enum.valueOf(ChatMessageActionEvents$ActionSource.class, str);
    }

    public static ChatMessageActionEvents$ActionSource[] values() {
        return (ChatMessageActionEvents$ActionSource[]) $VALUES.clone();
    }
}
