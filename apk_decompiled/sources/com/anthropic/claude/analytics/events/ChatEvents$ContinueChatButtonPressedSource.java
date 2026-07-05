package com.anthropic.claude.analytics.events;

import defpackage.ao2;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.qo2;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$ContinueChatButtonPressedSource", "", "Lcom/anthropic/claude/analytics/events/ChatEvents$ContinueChatButtonPressedSource;", "<init>", "(Ljava/lang/String;I)V", "Companion", "qo2", "UNSPECIFIED", "TOAST", "DISCLAIMER", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ChatEvents$ContinueChatButtonPressedSource {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ChatEvents$ContinueChatButtonPressedSource[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final qo2 Companion;
    public static final ChatEvents$ContinueChatButtonPressedSource UNSPECIFIED = new ChatEvents$ContinueChatButtonPressedSource("UNSPECIFIED", 0);
    public static final ChatEvents$ContinueChatButtonPressedSource TOAST = new ChatEvents$ContinueChatButtonPressedSource("TOAST", 1);
    public static final ChatEvents$ContinueChatButtonPressedSource DISCLAIMER = new ChatEvents$ContinueChatButtonPressedSource("DISCLAIMER", 2);

    private static final /* synthetic */ ChatEvents$ContinueChatButtonPressedSource[] $values() {
        return new ChatEvents$ContinueChatButtonPressedSource[]{UNSPECIFIED, TOAST, DISCLAIMER};
    }

    static {
        ChatEvents$ContinueChatButtonPressedSource[] chatEvents$ContinueChatButtonPressedSourceArr$values = $values();
        $VALUES = chatEvents$ContinueChatButtonPressedSourceArr$values;
        $ENTRIES = wd6.n0(chatEvents$ContinueChatButtonPressedSourceArr$values);
        Companion = new qo2();
        $cachedSerializer$delegate = yb5.w(w1a.F, new ao2(6));
    }

    private ChatEvents$ContinueChatButtonPressedSource(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ChatEvents.ContinueChatButtonPressedSource", values(), new String[]{"unknown", "toast", "disclaimer"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ChatEvents$ContinueChatButtonPressedSource valueOf(String str) {
        return (ChatEvents$ContinueChatButtonPressedSource) Enum.valueOf(ChatEvents$ContinueChatButtonPressedSource.class, str);
    }

    public static ChatEvents$ContinueChatButtonPressedSource[] values() {
        return (ChatEvents$ContinueChatButtonPressedSource[]) $VALUES.clone();
    }
}
