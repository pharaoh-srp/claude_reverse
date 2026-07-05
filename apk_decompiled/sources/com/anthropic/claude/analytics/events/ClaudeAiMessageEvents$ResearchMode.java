package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.gi3;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.ni3;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/anthropic/claude/analytics/events/ClaudeAiMessageEvents$ResearchMode", "", "Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$ResearchMode;", "<init>", "(Ljava/lang/String;I)V", "Companion", "ni3", "UNSPECIFIED", "DISABLED", "ADVANCED", "LIGHT", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ClaudeAiMessageEvents$ResearchMode {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ClaudeAiMessageEvents$ResearchMode[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final ni3 Companion;
    public static final ClaudeAiMessageEvents$ResearchMode UNSPECIFIED = new ClaudeAiMessageEvents$ResearchMode("UNSPECIFIED", 0);
    public static final ClaudeAiMessageEvents$ResearchMode DISABLED = new ClaudeAiMessageEvents$ResearchMode("DISABLED", 1);
    public static final ClaudeAiMessageEvents$ResearchMode ADVANCED = new ClaudeAiMessageEvents$ResearchMode("ADVANCED", 2);
    public static final ClaudeAiMessageEvents$ResearchMode LIGHT = new ClaudeAiMessageEvents$ResearchMode("LIGHT", 3);

    private static final /* synthetic */ ClaudeAiMessageEvents$ResearchMode[] $values() {
        return new ClaudeAiMessageEvents$ResearchMode[]{UNSPECIFIED, DISABLED, ADVANCED, LIGHT};
    }

    static {
        ClaudeAiMessageEvents$ResearchMode[] claudeAiMessageEvents$ResearchModeArr$values = $values();
        $VALUES = claudeAiMessageEvents$ResearchModeArr$values;
        $ENTRIES = wd6.n0(claudeAiMessageEvents$ResearchModeArr$values);
        Companion = new ni3();
        $cachedSerializer$delegate = yb5.w(w1a.F, new gi3(4));
    }

    private ClaudeAiMessageEvents$ResearchMode(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ClaudeAiMessageEvents.ResearchMode", values(), new String[]{"unspecified", "disabled", "advanced", "light"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ClaudeAiMessageEvents$ResearchMode valueOf(String str) {
        return (ClaudeAiMessageEvents$ResearchMode) Enum.valueOf(ClaudeAiMessageEvents$ResearchMode.class, str);
    }

    public static ClaudeAiMessageEvents$ResearchMode[] values() {
        return (ClaudeAiMessageEvents$ResearchMode[]) $VALUES.clone();
    }
}
