package com.anthropic.claude.analytics.events;

import defpackage.bi3;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/anthropic/claude/analytics/events/ClaudeAiMessageEvents$FailureType", "", "Lcom/anthropic/claude/analytics/events/ClaudeAiMessageEvents$FailureType;", "<init>", "(Ljava/lang/String;I)V", "Companion", "bi3", "UNSPECIFIED", "HTTP_ERROR", "STREAM_ERROR", "NETWORK_ERROR", "TIMEOUT", "ABORTED", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ClaudeAiMessageEvents$FailureType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ClaudeAiMessageEvents$FailureType[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final bi3 Companion;
    public static final ClaudeAiMessageEvents$FailureType UNSPECIFIED = new ClaudeAiMessageEvents$FailureType("UNSPECIFIED", 0);
    public static final ClaudeAiMessageEvents$FailureType HTTP_ERROR = new ClaudeAiMessageEvents$FailureType("HTTP_ERROR", 1);
    public static final ClaudeAiMessageEvents$FailureType STREAM_ERROR = new ClaudeAiMessageEvents$FailureType("STREAM_ERROR", 2);
    public static final ClaudeAiMessageEvents$FailureType NETWORK_ERROR = new ClaudeAiMessageEvents$FailureType("NETWORK_ERROR", 3);
    public static final ClaudeAiMessageEvents$FailureType TIMEOUT = new ClaudeAiMessageEvents$FailureType("TIMEOUT", 4);
    public static final ClaudeAiMessageEvents$FailureType ABORTED = new ClaudeAiMessageEvents$FailureType("ABORTED", 5);

    private static final /* synthetic */ ClaudeAiMessageEvents$FailureType[] $values() {
        return new ClaudeAiMessageEvents$FailureType[]{UNSPECIFIED, HTTP_ERROR, STREAM_ERROR, NETWORK_ERROR, TIMEOUT, ABORTED};
    }

    static {
        ClaudeAiMessageEvents$FailureType[] claudeAiMessageEvents$FailureTypeArr$values = $values();
        $VALUES = claudeAiMessageEvents$FailureTypeArr$values;
        $ENTRIES = wd6.n0(claudeAiMessageEvents$FailureTypeArr$values);
        Companion = new bi3();
        $cachedSerializer$delegate = yb5.w(w1a.F, new wy2(26));
    }

    private ClaudeAiMessageEvents$FailureType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ClaudeAiMessageEvents.FailureType", values(), new String[]{"unspecified", "http_error", "stream_error", "network_error", "timeout", "aborted"}, new Annotation[][]{null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ClaudeAiMessageEvents$FailureType valueOf(String str) {
        return (ClaudeAiMessageEvents$FailureType) Enum.valueOf(ClaudeAiMessageEvents$FailureType.class, str);
    }

    public static ClaudeAiMessageEvents$FailureType[] values() {
        return (ClaudeAiMessageEvents$FailureType[]) $VALUES.clone();
    }
}
