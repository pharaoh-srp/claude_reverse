package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.p3j;
import defpackage.s3j;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode", "", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;", "<init>", "(Ljava/lang/String;I)V", "Companion", "s3j", "UNSPECIFIED", "HANDS_FREE", "PUSH_TO_TALK", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class VoiceEvents$VoiceActivationMode {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ VoiceEvents$VoiceActivationMode[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final s3j Companion;
    public static final VoiceEvents$VoiceActivationMode UNSPECIFIED = new VoiceEvents$VoiceActivationMode("UNSPECIFIED", 0);
    public static final VoiceEvents$VoiceActivationMode HANDS_FREE = new VoiceEvents$VoiceActivationMode("HANDS_FREE", 1);
    public static final VoiceEvents$VoiceActivationMode PUSH_TO_TALK = new VoiceEvents$VoiceActivationMode("PUSH_TO_TALK", 2);

    private static final /* synthetic */ VoiceEvents$VoiceActivationMode[] $values() {
        return new VoiceEvents$VoiceActivationMode[]{UNSPECIFIED, HANDS_FREE, PUSH_TO_TALK};
    }

    static {
        VoiceEvents$VoiceActivationMode[] voiceEvents$VoiceActivationModeArr$values = $values();
        $VALUES = voiceEvents$VoiceActivationModeArr$values;
        $ENTRIES = wd6.n0(voiceEvents$VoiceActivationModeArr$values);
        Companion = new s3j();
        $cachedSerializer$delegate = yb5.w(w1a.F, new p3j(2));
    }

    private VoiceEvents$VoiceActivationMode(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.VoiceEvents.VoiceActivationMode", values(), new String[]{"unknown", "hands_free", "push_to_talk"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static VoiceEvents$VoiceActivationMode valueOf(String str) {
        return (VoiceEvents$VoiceActivationMode) Enum.valueOf(VoiceEvents$VoiceActivationMode.class, str);
    }

    public static VoiceEvents$VoiceActivationMode[] values() {
        return (VoiceEvents$VoiceActivationMode[]) $VALUES.clone();
    }
}
