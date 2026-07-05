package com.anthropic.claude.analytics.events;

import defpackage.b3e;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.rod;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"com/anthropic/claude/analytics/events/ReadAloudEvents$ReadAloudOutcome", "", "Lcom/anthropic/claude/analytics/events/ReadAloudEvents$ReadAloudOutcome;", "<init>", "(Ljava/lang/String;I)V", "Companion", "b3e", "UNSPECIFIED", "COMPLETED", "NO_AUDIO", "STOPPED", "FOCUS_DENIED", "ERROR", "AUDIO_ERROR", "TRUNCATED", "RATE_LIMITED", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ReadAloudEvents$ReadAloudOutcome {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ReadAloudEvents$ReadAloudOutcome[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final b3e Companion;
    public static final ReadAloudEvents$ReadAloudOutcome UNSPECIFIED = new ReadAloudEvents$ReadAloudOutcome("UNSPECIFIED", 0);
    public static final ReadAloudEvents$ReadAloudOutcome COMPLETED = new ReadAloudEvents$ReadAloudOutcome("COMPLETED", 1);
    public static final ReadAloudEvents$ReadAloudOutcome NO_AUDIO = new ReadAloudEvents$ReadAloudOutcome("NO_AUDIO", 2);
    public static final ReadAloudEvents$ReadAloudOutcome STOPPED = new ReadAloudEvents$ReadAloudOutcome("STOPPED", 3);
    public static final ReadAloudEvents$ReadAloudOutcome FOCUS_DENIED = new ReadAloudEvents$ReadAloudOutcome("FOCUS_DENIED", 4);
    public static final ReadAloudEvents$ReadAloudOutcome ERROR = new ReadAloudEvents$ReadAloudOutcome("ERROR", 5);
    public static final ReadAloudEvents$ReadAloudOutcome AUDIO_ERROR = new ReadAloudEvents$ReadAloudOutcome("AUDIO_ERROR", 6);
    public static final ReadAloudEvents$ReadAloudOutcome TRUNCATED = new ReadAloudEvents$ReadAloudOutcome("TRUNCATED", 7);
    public static final ReadAloudEvents$ReadAloudOutcome RATE_LIMITED = new ReadAloudEvents$ReadAloudOutcome("RATE_LIMITED", 8);

    private static final /* synthetic */ ReadAloudEvents$ReadAloudOutcome[] $values() {
        return new ReadAloudEvents$ReadAloudOutcome[]{UNSPECIFIED, COMPLETED, NO_AUDIO, STOPPED, FOCUS_DENIED, ERROR, AUDIO_ERROR, TRUNCATED, RATE_LIMITED};
    }

    static {
        ReadAloudEvents$ReadAloudOutcome[] readAloudEvents$ReadAloudOutcomeArr$values = $values();
        $VALUES = readAloudEvents$ReadAloudOutcomeArr$values;
        $ENTRIES = wd6.n0(readAloudEvents$ReadAloudOutcomeArr$values);
        Companion = new b3e();
        $cachedSerializer$delegate = yb5.w(w1a.F, new rod(19));
    }

    private ReadAloudEvents$ReadAloudOutcome(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ReadAloudEvents.ReadAloudOutcome", values(), new String[]{"unknown", "completed", "no_audio", "stopped", "focus_denied", "error", "audio_error", "truncated", "rate_limited"}, new Annotation[][]{null, null, null, null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ReadAloudEvents$ReadAloudOutcome valueOf(String str) {
        return (ReadAloudEvents$ReadAloudOutcome) Enum.valueOf(ReadAloudEvents$ReadAloudOutcome.class, str);
    }

    public static ReadAloudEvents$ReadAloudOutcome[] values() {
        return (ReadAloudEvents$ReadAloudOutcome[]) $VALUES.clone();
    }
}
