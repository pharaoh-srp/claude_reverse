package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.p3j;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.x3j;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/anthropic/claude/analytics/events/VoiceEvents$VoiceInputTrigger", "", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceInputTrigger;", "<init>", "(Ljava/lang/String;I)V", "Companion", "x3j", "UNSPECIFIED", "VAD", "PUSH_TO_TALK", "MUTE", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class VoiceEvents$VoiceInputTrigger {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ VoiceEvents$VoiceInputTrigger[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final x3j Companion;
    public static final VoiceEvents$VoiceInputTrigger UNSPECIFIED = new VoiceEvents$VoiceInputTrigger("UNSPECIFIED", 0);
    public static final VoiceEvents$VoiceInputTrigger VAD = new VoiceEvents$VoiceInputTrigger("VAD", 1);
    public static final VoiceEvents$VoiceInputTrigger PUSH_TO_TALK = new VoiceEvents$VoiceInputTrigger("PUSH_TO_TALK", 2);
    public static final VoiceEvents$VoiceInputTrigger MUTE = new VoiceEvents$VoiceInputTrigger("MUTE", 3);

    private static final /* synthetic */ VoiceEvents$VoiceInputTrigger[] $values() {
        return new VoiceEvents$VoiceInputTrigger[]{UNSPECIFIED, VAD, PUSH_TO_TALK, MUTE};
    }

    static {
        VoiceEvents$VoiceInputTrigger[] voiceEvents$VoiceInputTriggerArr$values = $values();
        $VALUES = voiceEvents$VoiceInputTriggerArr$values;
        $ENTRIES = wd6.n0(voiceEvents$VoiceInputTriggerArr$values);
        Companion = new x3j();
        $cachedSerializer$delegate = yb5.w(w1a.F, new p3j(7));
    }

    private VoiceEvents$VoiceInputTrigger(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.VoiceEvents.VoiceInputTrigger", values(), new String[]{"unknown", "vad", "push_to_talk", "mute"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static VoiceEvents$VoiceInputTrigger valueOf(String str) {
        return (VoiceEvents$VoiceInputTrigger) Enum.valueOf(VoiceEvents$VoiceInputTrigger.class, str);
    }

    public static VoiceEvents$VoiceInputTrigger[] values() {
        return (VoiceEvents$VoiceInputTrigger[]) $VALUES.clone();
    }
}
