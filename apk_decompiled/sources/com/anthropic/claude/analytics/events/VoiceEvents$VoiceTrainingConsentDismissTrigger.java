package com.anthropic.claude.analytics.events;

import defpackage.b4j;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentDismissTrigger", "", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentDismissTrigger;", "<init>", "(Ljava/lang/String;I)V", "Companion", "b4j", "UNSPECIFIED", "NOT_NOW_BUTTON", "SWIPE", "TOOLBAR_CLOSE", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class VoiceEvents$VoiceTrainingConsentDismissTrigger {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ VoiceEvents$VoiceTrainingConsentDismissTrigger[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final b4j Companion;
    public static final VoiceEvents$VoiceTrainingConsentDismissTrigger UNSPECIFIED = new VoiceEvents$VoiceTrainingConsentDismissTrigger("UNSPECIFIED", 0);
    public static final VoiceEvents$VoiceTrainingConsentDismissTrigger NOT_NOW_BUTTON = new VoiceEvents$VoiceTrainingConsentDismissTrigger("NOT_NOW_BUTTON", 1);
    public static final VoiceEvents$VoiceTrainingConsentDismissTrigger SWIPE = new VoiceEvents$VoiceTrainingConsentDismissTrigger("SWIPE", 2);
    public static final VoiceEvents$VoiceTrainingConsentDismissTrigger TOOLBAR_CLOSE = new VoiceEvents$VoiceTrainingConsentDismissTrigger("TOOLBAR_CLOSE", 3);

    private static final /* synthetic */ VoiceEvents$VoiceTrainingConsentDismissTrigger[] $values() {
        return new VoiceEvents$VoiceTrainingConsentDismissTrigger[]{UNSPECIFIED, NOT_NOW_BUTTON, SWIPE, TOOLBAR_CLOSE};
    }

    static {
        VoiceEvents$VoiceTrainingConsentDismissTrigger[] voiceEvents$VoiceTrainingConsentDismissTriggerArr$values = $values();
        $VALUES = voiceEvents$VoiceTrainingConsentDismissTriggerArr$values;
        $ENTRIES = wd6.n0(voiceEvents$VoiceTrainingConsentDismissTriggerArr$values);
        Companion = new b4j();
        $cachedSerializer$delegate = yb5.w(w1a.F, new p3j(9));
    }

    private VoiceEvents$VoiceTrainingConsentDismissTrigger(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.VoiceEvents.VoiceTrainingConsentDismissTrigger", values(), new String[]{"unknown", "not_now_button", "swipe", "toolbar_close"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static VoiceEvents$VoiceTrainingConsentDismissTrigger valueOf(String str) {
        return (VoiceEvents$VoiceTrainingConsentDismissTrigger) Enum.valueOf(VoiceEvents$VoiceTrainingConsentDismissTrigger.class, str);
    }

    public static VoiceEvents$VoiceTrainingConsentDismissTrigger[] values() {
        return (VoiceEvents$VoiceTrainingConsentDismissTrigger[]) $VALUES.clone();
    }
}
