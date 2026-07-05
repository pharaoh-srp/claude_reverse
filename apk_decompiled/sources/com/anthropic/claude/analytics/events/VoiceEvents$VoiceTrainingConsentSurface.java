package com.anthropic.claude.analytics.events;

import defpackage.d4j;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentSurface", "", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentSurface;", "<init>", "(Ljava/lang/String;I)V", "Companion", "d4j", "UNSPECIFIED", "SETTINGS", "MID_CALL_SETTINGS", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class VoiceEvents$VoiceTrainingConsentSurface {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ VoiceEvents$VoiceTrainingConsentSurface[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final d4j Companion;
    public static final VoiceEvents$VoiceTrainingConsentSurface UNSPECIFIED = new VoiceEvents$VoiceTrainingConsentSurface("UNSPECIFIED", 0);
    public static final VoiceEvents$VoiceTrainingConsentSurface SETTINGS = new VoiceEvents$VoiceTrainingConsentSurface("SETTINGS", 1);
    public static final VoiceEvents$VoiceTrainingConsentSurface MID_CALL_SETTINGS = new VoiceEvents$VoiceTrainingConsentSurface("MID_CALL_SETTINGS", 2);

    private static final /* synthetic */ VoiceEvents$VoiceTrainingConsentSurface[] $values() {
        return new VoiceEvents$VoiceTrainingConsentSurface[]{UNSPECIFIED, SETTINGS, MID_CALL_SETTINGS};
    }

    static {
        VoiceEvents$VoiceTrainingConsentSurface[] voiceEvents$VoiceTrainingConsentSurfaceArr$values = $values();
        $VALUES = voiceEvents$VoiceTrainingConsentSurfaceArr$values;
        $ENTRIES = wd6.n0(voiceEvents$VoiceTrainingConsentSurfaceArr$values);
        Companion = new d4j();
        $cachedSerializer$delegate = yb5.w(w1a.F, new p3j(11));
    }

    private VoiceEvents$VoiceTrainingConsentSurface(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.VoiceEvents.VoiceTrainingConsentSurface", values(), new String[]{"unknown", "settings", "mid_call_settings"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static VoiceEvents$VoiceTrainingConsentSurface valueOf(String str) {
        return (VoiceEvents$VoiceTrainingConsentSurface) Enum.valueOf(VoiceEvents$VoiceTrainingConsentSurface.class, str);
    }

    public static VoiceEvents$VoiceTrainingConsentSurface[] values() {
        return (VoiceEvents$VoiceTrainingConsentSurface[]) $VALUES.clone();
    }
}
