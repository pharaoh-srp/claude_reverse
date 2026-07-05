package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.gi3;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.vs3;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/anthropic/claude/analytics/events/CodeEvents$CodePromptSuggestionSuppressReason", "", "Lcom/anthropic/claude/analytics/events/CodeEvents$CodePromptSuggestionSuppressReason;", "<init>", "(Ljava/lang/String;I)V", "Companion", "vs3", "UNSPECIFIED", "NOT_SUPPRESSED", "DISABLED", "BLANK", "DUPLICATE", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class CodeEvents$CodePromptSuggestionSuppressReason {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ CodeEvents$CodePromptSuggestionSuppressReason[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final vs3 Companion;
    public static final CodeEvents$CodePromptSuggestionSuppressReason UNSPECIFIED = new CodeEvents$CodePromptSuggestionSuppressReason("UNSPECIFIED", 0);
    public static final CodeEvents$CodePromptSuggestionSuppressReason NOT_SUPPRESSED = new CodeEvents$CodePromptSuggestionSuppressReason("NOT_SUPPRESSED", 1);
    public static final CodeEvents$CodePromptSuggestionSuppressReason DISABLED = new CodeEvents$CodePromptSuggestionSuppressReason("DISABLED", 2);
    public static final CodeEvents$CodePromptSuggestionSuppressReason BLANK = new CodeEvents$CodePromptSuggestionSuppressReason("BLANK", 3);
    public static final CodeEvents$CodePromptSuggestionSuppressReason DUPLICATE = new CodeEvents$CodePromptSuggestionSuppressReason("DUPLICATE", 4);

    private static final /* synthetic */ CodeEvents$CodePromptSuggestionSuppressReason[] $values() {
        return new CodeEvents$CodePromptSuggestionSuppressReason[]{UNSPECIFIED, NOT_SUPPRESSED, DISABLED, BLANK, DUPLICATE};
    }

    static {
        CodeEvents$CodePromptSuggestionSuppressReason[] codeEvents$CodePromptSuggestionSuppressReasonArr$values = $values();
        $VALUES = codeEvents$CodePromptSuggestionSuppressReasonArr$values;
        $ENTRIES = wd6.n0(codeEvents$CodePromptSuggestionSuppressReasonArr$values);
        Companion = new vs3();
        $cachedSerializer$delegate = yb5.w(w1a.F, new gi3(28));
    }

    private CodeEvents$CodePromptSuggestionSuppressReason(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.CodeEvents.CodePromptSuggestionSuppressReason", values(), new String[]{"unknown", "none", "disabled", "blank", "duplicate"}, new Annotation[][]{null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static CodeEvents$CodePromptSuggestionSuppressReason valueOf(String str) {
        return (CodeEvents$CodePromptSuggestionSuppressReason) Enum.valueOf(CodeEvents$CodePromptSuggestionSuppressReason.class, str);
    }

    public static CodeEvents$CodePromptSuggestionSuppressReason[] values() {
        return (CodeEvents$CodePromptSuggestionSuppressReason[]) $VALUES.clone();
    }
}
