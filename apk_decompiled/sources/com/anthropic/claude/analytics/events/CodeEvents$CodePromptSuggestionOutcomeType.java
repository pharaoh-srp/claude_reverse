package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.gi3;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.os3;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/anthropic/claude/analytics/events/CodeEvents$CodePromptSuggestionOutcomeType", "", "Lcom/anthropic/claude/analytics/events/CodeEvents$CodePromptSuggestionOutcomeType;", "<init>", "(Ljava/lang/String;I)V", "Companion", "os3", "UNSPECIFIED", "ACCEPTED", "IGNORED", "DISMISSED", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class CodeEvents$CodePromptSuggestionOutcomeType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ CodeEvents$CodePromptSuggestionOutcomeType[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final os3 Companion;
    public static final CodeEvents$CodePromptSuggestionOutcomeType UNSPECIFIED = new CodeEvents$CodePromptSuggestionOutcomeType("UNSPECIFIED", 0);
    public static final CodeEvents$CodePromptSuggestionOutcomeType ACCEPTED = new CodeEvents$CodePromptSuggestionOutcomeType("ACCEPTED", 1);
    public static final CodeEvents$CodePromptSuggestionOutcomeType IGNORED = new CodeEvents$CodePromptSuggestionOutcomeType("IGNORED", 2);
    public static final CodeEvents$CodePromptSuggestionOutcomeType DISMISSED = new CodeEvents$CodePromptSuggestionOutcomeType("DISMISSED", 3);

    private static final /* synthetic */ CodeEvents$CodePromptSuggestionOutcomeType[] $values() {
        return new CodeEvents$CodePromptSuggestionOutcomeType[]{UNSPECIFIED, ACCEPTED, IGNORED, DISMISSED};
    }

    static {
        CodeEvents$CodePromptSuggestionOutcomeType[] codeEvents$CodePromptSuggestionOutcomeTypeArr$values = $values();
        $VALUES = codeEvents$CodePromptSuggestionOutcomeTypeArr$values;
        $ENTRIES = wd6.n0(codeEvents$CodePromptSuggestionOutcomeTypeArr$values);
        Companion = new os3();
        $cachedSerializer$delegate = yb5.w(w1a.F, new gi3(26));
    }

    private CodeEvents$CodePromptSuggestionOutcomeType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.CodeEvents.CodePromptSuggestionOutcomeType", values(), new String[]{"unknown", "accepted", "ignored", "dismissed"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static CodeEvents$CodePromptSuggestionOutcomeType valueOf(String str) {
        return (CodeEvents$CodePromptSuggestionOutcomeType) Enum.valueOf(CodeEvents$CodePromptSuggestionOutcomeType.class, str);
    }

    public static CodeEvents$CodePromptSuggestionOutcomeType[] values() {
        return (CodeEvents$CodePromptSuggestionOutcomeType[]) $VALUES.clone();
    }
}
