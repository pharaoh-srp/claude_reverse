package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.vu3;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.wt3;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/anthropic/claude/analytics/events/CodeEvents$RefusalFallbackPromptChoice", "", "Lcom/anthropic/claude/analytics/events/CodeEvents$RefusalFallbackPromptChoice;", "<init>", "(Ljava/lang/String;I)V", "Companion", "vu3", "UNSPECIFIED", "RETRY_FALLBACK", "EDIT_PROMPT", "CANCELLED", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class CodeEvents$RefusalFallbackPromptChoice {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ CodeEvents$RefusalFallbackPromptChoice[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final vu3 Companion;
    public static final CodeEvents$RefusalFallbackPromptChoice UNSPECIFIED = new CodeEvents$RefusalFallbackPromptChoice("UNSPECIFIED", 0);
    public static final CodeEvents$RefusalFallbackPromptChoice RETRY_FALLBACK = new CodeEvents$RefusalFallbackPromptChoice("RETRY_FALLBACK", 1);
    public static final CodeEvents$RefusalFallbackPromptChoice EDIT_PROMPT = new CodeEvents$RefusalFallbackPromptChoice("EDIT_PROMPT", 2);
    public static final CodeEvents$RefusalFallbackPromptChoice CANCELLED = new CodeEvents$RefusalFallbackPromptChoice("CANCELLED", 3);

    private static final /* synthetic */ CodeEvents$RefusalFallbackPromptChoice[] $values() {
        return new CodeEvents$RefusalFallbackPromptChoice[]{UNSPECIFIED, RETRY_FALLBACK, EDIT_PROMPT, CANCELLED};
    }

    static {
        CodeEvents$RefusalFallbackPromptChoice[] codeEvents$RefusalFallbackPromptChoiceArr$values = $values();
        $VALUES = codeEvents$RefusalFallbackPromptChoiceArr$values;
        $ENTRIES = wd6.n0(codeEvents$RefusalFallbackPromptChoiceArr$values);
        Companion = new vu3();
        $cachedSerializer$delegate = yb5.w(w1a.F, new wt3(7));
    }

    private CodeEvents$RefusalFallbackPromptChoice(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.CodeEvents.RefusalFallbackPromptChoice", values(), new String[]{"unknown", "retry_fallback", "edit_prompt", "cancelled"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static CodeEvents$RefusalFallbackPromptChoice valueOf(String str) {
        return (CodeEvents$RefusalFallbackPromptChoice) Enum.valueOf(CodeEvents$RefusalFallbackPromptChoice.class, str);
    }

    public static CodeEvents$RefusalFallbackPromptChoice[] values() {
        return (CodeEvents$RefusalFallbackPromptChoice[]) $VALUES.clone();
    }
}
