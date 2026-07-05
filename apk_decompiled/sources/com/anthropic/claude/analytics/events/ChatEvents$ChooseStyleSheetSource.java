package com.anthropic.claude.analytics.events;

import defpackage.ao2;
import defpackage.fq6;
import defpackage.io2;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$ChooseStyleSheetSource", "", "Lcom/anthropic/claude/analytics/events/ChatEvents$ChooseStyleSheetSource;", "<init>", "(Ljava/lang/String;I)V", "Companion", "io2", "UNSPECIFIED", "CHAT_INPUT", "ADD_CONTEXT", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ChatEvents$ChooseStyleSheetSource {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ChatEvents$ChooseStyleSheetSource[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final io2 Companion;
    public static final ChatEvents$ChooseStyleSheetSource UNSPECIFIED = new ChatEvents$ChooseStyleSheetSource("UNSPECIFIED", 0);
    public static final ChatEvents$ChooseStyleSheetSource CHAT_INPUT = new ChatEvents$ChooseStyleSheetSource("CHAT_INPUT", 1);
    public static final ChatEvents$ChooseStyleSheetSource ADD_CONTEXT = new ChatEvents$ChooseStyleSheetSource("ADD_CONTEXT", 2);

    private static final /* synthetic */ ChatEvents$ChooseStyleSheetSource[] $values() {
        return new ChatEvents$ChooseStyleSheetSource[]{UNSPECIFIED, CHAT_INPUT, ADD_CONTEXT};
    }

    static {
        ChatEvents$ChooseStyleSheetSource[] chatEvents$ChooseStyleSheetSourceArr$values = $values();
        $VALUES = chatEvents$ChooseStyleSheetSourceArr$values;
        $ENTRIES = wd6.n0(chatEvents$ChooseStyleSheetSourceArr$values);
        Companion = new io2();
        $cachedSerializer$delegate = yb5.w(w1a.F, new ao2(2));
    }

    private ChatEvents$ChooseStyleSheetSource(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ChatEvents.ChooseStyleSheetSource", values(), new String[]{"unknown", "chat_input", "add_context"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ChatEvents$ChooseStyleSheetSource valueOf(String str) {
        return (ChatEvents$ChooseStyleSheetSource) Enum.valueOf(ChatEvents$ChooseStyleSheetSource.class, str);
    }

    public static ChatEvents$ChooseStyleSheetSource[] values() {
        return (ChatEvents$ChooseStyleSheetSource[]) $VALUES.clone();
    }
}
