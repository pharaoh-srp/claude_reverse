package com.anthropic.claude.analytics.events;

import defpackage.c4j;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentState", "", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentState;", "<init>", "(Ljava/lang/String;I)V", "Companion", "c4j", "UNSPECIFIED", "UNDECIDED", "DECLINED", "REQUEST_PER_SESSION", "ALWAYS_SHARE", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class VoiceEvents$VoiceTrainingConsentState {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ VoiceEvents$VoiceTrainingConsentState[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final c4j Companion;
    public static final VoiceEvents$VoiceTrainingConsentState UNSPECIFIED = new VoiceEvents$VoiceTrainingConsentState("UNSPECIFIED", 0);
    public static final VoiceEvents$VoiceTrainingConsentState UNDECIDED = new VoiceEvents$VoiceTrainingConsentState("UNDECIDED", 1);
    public static final VoiceEvents$VoiceTrainingConsentState DECLINED = new VoiceEvents$VoiceTrainingConsentState("DECLINED", 2);
    public static final VoiceEvents$VoiceTrainingConsentState REQUEST_PER_SESSION = new VoiceEvents$VoiceTrainingConsentState("REQUEST_PER_SESSION", 3);
    public static final VoiceEvents$VoiceTrainingConsentState ALWAYS_SHARE = new VoiceEvents$VoiceTrainingConsentState("ALWAYS_SHARE", 4);

    private static final /* synthetic */ VoiceEvents$VoiceTrainingConsentState[] $values() {
        return new VoiceEvents$VoiceTrainingConsentState[]{UNSPECIFIED, UNDECIDED, DECLINED, REQUEST_PER_SESSION, ALWAYS_SHARE};
    }

    static {
        VoiceEvents$VoiceTrainingConsentState[] voiceEvents$VoiceTrainingConsentStateArr$values = $values();
        $VALUES = voiceEvents$VoiceTrainingConsentStateArr$values;
        $ENTRIES = wd6.n0(voiceEvents$VoiceTrainingConsentStateArr$values);
        Companion = new c4j();
        $cachedSerializer$delegate = yb5.w(w1a.F, new p3j(10));
    }

    private VoiceEvents$VoiceTrainingConsentState(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.VoiceEvents.VoiceTrainingConsentState", values(), new String[]{"unknown", "undecided", "declined", "request_per_session", "always_share"}, new Annotation[][]{null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static VoiceEvents$VoiceTrainingConsentState valueOf(String str) {
        return (VoiceEvents$VoiceTrainingConsentState) Enum.valueOf(VoiceEvents$VoiceTrainingConsentState.class, str);
    }

    public static VoiceEvents$VoiceTrainingConsentState[] values() {
        return (VoiceEvents$VoiceTrainingConsentState[]) $VALUES.clone();
    }
}
