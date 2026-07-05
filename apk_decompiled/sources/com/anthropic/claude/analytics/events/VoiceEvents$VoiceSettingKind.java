package com.anthropic.claude.analytics.events;

import defpackage.a4j;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/anthropic/claude/analytics/events/VoiceEvents$VoiceSettingKind", "", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceSettingKind;", "<init>", "(Ljava/lang/String;I)V", "Companion", "a4j", "UNSPECIFIED", "ACTIVATION_MODE", "VOICE", "PLAYBACK_SPEED", "LANGUAGE", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class VoiceEvents$VoiceSettingKind {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ VoiceEvents$VoiceSettingKind[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final a4j Companion;
    public static final VoiceEvents$VoiceSettingKind UNSPECIFIED = new VoiceEvents$VoiceSettingKind("UNSPECIFIED", 0);
    public static final VoiceEvents$VoiceSettingKind ACTIVATION_MODE = new VoiceEvents$VoiceSettingKind("ACTIVATION_MODE", 1);
    public static final VoiceEvents$VoiceSettingKind VOICE = new VoiceEvents$VoiceSettingKind("VOICE", 2);
    public static final VoiceEvents$VoiceSettingKind PLAYBACK_SPEED = new VoiceEvents$VoiceSettingKind("PLAYBACK_SPEED", 3);
    public static final VoiceEvents$VoiceSettingKind LANGUAGE = new VoiceEvents$VoiceSettingKind("LANGUAGE", 4);

    private static final /* synthetic */ VoiceEvents$VoiceSettingKind[] $values() {
        return new VoiceEvents$VoiceSettingKind[]{UNSPECIFIED, ACTIVATION_MODE, VOICE, PLAYBACK_SPEED, LANGUAGE};
    }

    static {
        VoiceEvents$VoiceSettingKind[] voiceEvents$VoiceSettingKindArr$values = $values();
        $VALUES = voiceEvents$VoiceSettingKindArr$values;
        $ENTRIES = wd6.n0(voiceEvents$VoiceSettingKindArr$values);
        Companion = new a4j();
        $cachedSerializer$delegate = yb5.w(w1a.F, new p3j(8));
    }

    private VoiceEvents$VoiceSettingKind(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.VoiceEvents.VoiceSettingKind", values(), new String[]{"unknown", "activation_mode", "voice", "playback_speed", "language"}, new Annotation[][]{null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static VoiceEvents$VoiceSettingKind valueOf(String str) {
        return (VoiceEvents$VoiceSettingKind) Enum.valueOf(VoiceEvents$VoiceSettingKind.class, str);
    }

    public static VoiceEvents$VoiceSettingKind[] values() {
        return (VoiceEvents$VoiceSettingKind[]) $VALUES.clone();
    }
}
