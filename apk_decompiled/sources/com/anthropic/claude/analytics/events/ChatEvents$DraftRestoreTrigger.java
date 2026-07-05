package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.rc1;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import defpackage.yo2;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$DraftRestoreTrigger", "", "Lcom/anthropic/claude/analytics/events/ChatEvents$DraftRestoreTrigger;", "<init>", "(Ljava/lang/String;I)V", "Companion", "yo2", "UNSPECIFIED", "SCREEN_ENTRY", "SEND_FAILURE", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ChatEvents$DraftRestoreTrigger {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ChatEvents$DraftRestoreTrigger[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final yo2 Companion;
    public static final ChatEvents$DraftRestoreTrigger UNSPECIFIED = new ChatEvents$DraftRestoreTrigger("UNSPECIFIED", 0);
    public static final ChatEvents$DraftRestoreTrigger SCREEN_ENTRY = new ChatEvents$DraftRestoreTrigger("SCREEN_ENTRY", 1);
    public static final ChatEvents$DraftRestoreTrigger SEND_FAILURE = new ChatEvents$DraftRestoreTrigger("SEND_FAILURE", 2);

    private static final /* synthetic */ ChatEvents$DraftRestoreTrigger[] $values() {
        return new ChatEvents$DraftRestoreTrigger[]{UNSPECIFIED, SCREEN_ENTRY, SEND_FAILURE};
    }

    static {
        ChatEvents$DraftRestoreTrigger[] chatEvents$DraftRestoreTriggerArr$values = $values();
        $VALUES = chatEvents$DraftRestoreTriggerArr$values;
        $ENTRIES = wd6.n0(chatEvents$DraftRestoreTriggerArr$values);
        Companion = new yo2();
        $cachedSerializer$delegate = yb5.w(w1a.F, new rc1(13));
    }

    private ChatEvents$DraftRestoreTrigger(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ChatEvents.DraftRestoreTrigger", values(), new String[]{"unknown", "screen_entry", "send_failure"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ChatEvents$DraftRestoreTrigger valueOf(String str) {
        return (ChatEvents$DraftRestoreTrigger) Enum.valueOf(ChatEvents$DraftRestoreTrigger.class, str);
    }

    public static ChatEvents$DraftRestoreTrigger[] values() {
        return (ChatEvents$DraftRestoreTrigger[]) $VALUES.clone();
    }
}
