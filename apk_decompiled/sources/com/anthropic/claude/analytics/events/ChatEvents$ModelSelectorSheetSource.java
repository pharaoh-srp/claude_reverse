package com.anthropic.claude.analytics.events;

import defpackage.ao2;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.op2;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$ModelSelectorSheetSource", "", "Lcom/anthropic/claude/analytics/events/ChatEvents$ModelSelectorSheetSource;", "<init>", "(Ljava/lang/String;I)V", "Companion", "op2", "UNSPECIFIED", "CHAT_INPUT", "TOP_BAR", "ERROR_SNACKBAR", "VOICE_CONTROLS", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ChatEvents$ModelSelectorSheetSource {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ChatEvents$ModelSelectorSheetSource[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final op2 Companion;
    public static final ChatEvents$ModelSelectorSheetSource UNSPECIFIED = new ChatEvents$ModelSelectorSheetSource("UNSPECIFIED", 0);
    public static final ChatEvents$ModelSelectorSheetSource CHAT_INPUT = new ChatEvents$ModelSelectorSheetSource("CHAT_INPUT", 1);
    public static final ChatEvents$ModelSelectorSheetSource TOP_BAR = new ChatEvents$ModelSelectorSheetSource("TOP_BAR", 2);
    public static final ChatEvents$ModelSelectorSheetSource ERROR_SNACKBAR = new ChatEvents$ModelSelectorSheetSource("ERROR_SNACKBAR", 3);
    public static final ChatEvents$ModelSelectorSheetSource VOICE_CONTROLS = new ChatEvents$ModelSelectorSheetSource("VOICE_CONTROLS", 4);

    private static final /* synthetic */ ChatEvents$ModelSelectorSheetSource[] $values() {
        return new ChatEvents$ModelSelectorSheetSource[]{UNSPECIFIED, CHAT_INPUT, TOP_BAR, ERROR_SNACKBAR, VOICE_CONTROLS};
    }

    static {
        ChatEvents$ModelSelectorSheetSource[] chatEvents$ModelSelectorSheetSourceArr$values = $values();
        $VALUES = chatEvents$ModelSelectorSheetSourceArr$values;
        $ENTRIES = wd6.n0(chatEvents$ModelSelectorSheetSourceArr$values);
        Companion = new op2();
        $cachedSerializer$delegate = yb5.w(w1a.F, new ao2(14));
    }

    private ChatEvents$ModelSelectorSheetSource(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ChatEvents.ModelSelectorSheetSource", values(), new String[]{"unknown", "chat_input", "top_bar", "error_snackbar", "voice_controls"}, new Annotation[][]{null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ChatEvents$ModelSelectorSheetSource valueOf(String str) {
        return (ChatEvents$ModelSelectorSheetSource) Enum.valueOf(ChatEvents$ModelSelectorSheetSource.class, str);
    }

    public static ChatEvents$ModelSelectorSheetSource[] values() {
        return (ChatEvents$ModelSelectorSheetSource[]) $VALUES.clone();
    }
}
