package com.anthropic.claude.analytics.events;

import defpackage.ai3;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.wy2;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/anthropic/claude/analytics/events/ClaudeAiMessageEvents$FailureStage", "", "Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$FailureStage;", "<init>", "(Ljava/lang/String;I)V", "Companion", "ai3", "UNSPECIFIED", "CONVERSATION_CREATE", "COMPLETION_REQUEST", "COMPLETION_STREAMING", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ClaudeAiMessageEvents$FailureStage {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ClaudeAiMessageEvents$FailureStage[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final ai3 Companion;
    public static final ClaudeAiMessageEvents$FailureStage UNSPECIFIED = new ClaudeAiMessageEvents$FailureStage("UNSPECIFIED", 0);
    public static final ClaudeAiMessageEvents$FailureStage CONVERSATION_CREATE = new ClaudeAiMessageEvents$FailureStage("CONVERSATION_CREATE", 1);
    public static final ClaudeAiMessageEvents$FailureStage COMPLETION_REQUEST = new ClaudeAiMessageEvents$FailureStage("COMPLETION_REQUEST", 2);
    public static final ClaudeAiMessageEvents$FailureStage COMPLETION_STREAMING = new ClaudeAiMessageEvents$FailureStage("COMPLETION_STREAMING", 3);

    private static final /* synthetic */ ClaudeAiMessageEvents$FailureStage[] $values() {
        return new ClaudeAiMessageEvents$FailureStage[]{UNSPECIFIED, CONVERSATION_CREATE, COMPLETION_REQUEST, COMPLETION_STREAMING};
    }

    static {
        ClaudeAiMessageEvents$FailureStage[] claudeAiMessageEvents$FailureStageArr$values = $values();
        $VALUES = claudeAiMessageEvents$FailureStageArr$values;
        $ENTRIES = wd6.n0(claudeAiMessageEvents$FailureStageArr$values);
        Companion = new ai3();
        $cachedSerializer$delegate = yb5.w(w1a.F, new wy2(25));
    }

    private ClaudeAiMessageEvents$FailureStage(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ClaudeAiMessageEvents.FailureStage", values(), new String[]{"unspecified", "conversation_create", "completion_request", "completion_streaming"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ClaudeAiMessageEvents$FailureStage valueOf(String str) {
        return (ClaudeAiMessageEvents$FailureStage) Enum.valueOf(ClaudeAiMessageEvents$FailureStage.class, str);
    }

    public static ClaudeAiMessageEvents$FailureStage[] values() {
        return (ClaudeAiMessageEvents$FailureStage[]) $VALUES.clone();
    }
}
