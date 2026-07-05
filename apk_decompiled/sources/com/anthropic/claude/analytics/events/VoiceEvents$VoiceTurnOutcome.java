package com.anthropic.claude.analytics.events;

import defpackage.e4j;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.p3j;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/anthropic/claude/analytics/events/VoiceEvents$VoiceTurnOutcome", "", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTurnOutcome;", "<init>", "(Ljava/lang/String;I)V", "Companion", "e4j", "UNSPECIFIED", "COMPLETED", "SPEAK_INTERRUPT", "BUTTON_INTERRUPT", "ERROR", "CONNECTION_INTERRUPTED", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class VoiceEvents$VoiceTurnOutcome {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ VoiceEvents$VoiceTurnOutcome[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final e4j Companion;
    public static final VoiceEvents$VoiceTurnOutcome UNSPECIFIED = new VoiceEvents$VoiceTurnOutcome("UNSPECIFIED", 0);
    public static final VoiceEvents$VoiceTurnOutcome COMPLETED = new VoiceEvents$VoiceTurnOutcome("COMPLETED", 1);
    public static final VoiceEvents$VoiceTurnOutcome SPEAK_INTERRUPT = new VoiceEvents$VoiceTurnOutcome("SPEAK_INTERRUPT", 2);
    public static final VoiceEvents$VoiceTurnOutcome BUTTON_INTERRUPT = new VoiceEvents$VoiceTurnOutcome("BUTTON_INTERRUPT", 3);
    public static final VoiceEvents$VoiceTurnOutcome ERROR = new VoiceEvents$VoiceTurnOutcome("ERROR", 4);
    public static final VoiceEvents$VoiceTurnOutcome CONNECTION_INTERRUPTED = new VoiceEvents$VoiceTurnOutcome("CONNECTION_INTERRUPTED", 5);

    private static final /* synthetic */ VoiceEvents$VoiceTurnOutcome[] $values() {
        return new VoiceEvents$VoiceTurnOutcome[]{UNSPECIFIED, COMPLETED, SPEAK_INTERRUPT, BUTTON_INTERRUPT, ERROR, CONNECTION_INTERRUPTED};
    }

    static {
        VoiceEvents$VoiceTurnOutcome[] voiceEvents$VoiceTurnOutcomeArr$values = $values();
        $VALUES = voiceEvents$VoiceTurnOutcomeArr$values;
        $ENTRIES = wd6.n0(voiceEvents$VoiceTurnOutcomeArr$values);
        Companion = new e4j();
        $cachedSerializer$delegate = yb5.w(w1a.F, new p3j(12));
    }

    private VoiceEvents$VoiceTurnOutcome(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.VoiceEvents.VoiceTurnOutcome", values(), new String[]{"unknown", "completed", "speak_interrupt", "button_interrupt", "error", "connection_interrupted"}, new Annotation[][]{null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static VoiceEvents$VoiceTurnOutcome valueOf(String str) {
        return (VoiceEvents$VoiceTurnOutcome) Enum.valueOf(VoiceEvents$VoiceTurnOutcome.class, str);
    }

    public static VoiceEvents$VoiceTurnOutcome[] values() {
        return (VoiceEvents$VoiceTurnOutcome[]) $VALUES.clone();
    }
}
