package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.p3j;
import defpackage.u3j;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/anthropic/claude/analytics/events/VoiceEvents$VoiceEntrySource", "", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceEntrySource;", "<init>", "(Ljava/lang/String;I)V", "Companion", "u3j", "UNSPECIFIED", "CHAT_BUTTON", "WIDGET", "APP_INTENT", "RETRY", "CAR_PLAY", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class VoiceEvents$VoiceEntrySource {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ VoiceEvents$VoiceEntrySource[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final u3j Companion;
    public static final VoiceEvents$VoiceEntrySource UNSPECIFIED = new VoiceEvents$VoiceEntrySource("UNSPECIFIED", 0);
    public static final VoiceEvents$VoiceEntrySource CHAT_BUTTON = new VoiceEvents$VoiceEntrySource("CHAT_BUTTON", 1);
    public static final VoiceEvents$VoiceEntrySource WIDGET = new VoiceEvents$VoiceEntrySource("WIDGET", 2);
    public static final VoiceEvents$VoiceEntrySource APP_INTENT = new VoiceEvents$VoiceEntrySource("APP_INTENT", 3);
    public static final VoiceEvents$VoiceEntrySource RETRY = new VoiceEvents$VoiceEntrySource("RETRY", 4);
    public static final VoiceEvents$VoiceEntrySource CAR_PLAY = new VoiceEvents$VoiceEntrySource("CAR_PLAY", 5);

    private static final /* synthetic */ VoiceEvents$VoiceEntrySource[] $values() {
        return new VoiceEvents$VoiceEntrySource[]{UNSPECIFIED, CHAT_BUTTON, WIDGET, APP_INTENT, RETRY, CAR_PLAY};
    }

    static {
        VoiceEvents$VoiceEntrySource[] voiceEvents$VoiceEntrySourceArr$values = $values();
        $VALUES = voiceEvents$VoiceEntrySourceArr$values;
        $ENTRIES = wd6.n0(voiceEvents$VoiceEntrySourceArr$values);
        Companion = new u3j();
        $cachedSerializer$delegate = yb5.w(w1a.F, new p3j(4));
    }

    private VoiceEvents$VoiceEntrySource(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.VoiceEvents.VoiceEntrySource", values(), new String[]{"unknown", "chat_button", "widget", "app_intent", "retry", "car_play"}, new Annotation[][]{null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static VoiceEvents$VoiceEntrySource valueOf(String str) {
        return (VoiceEvents$VoiceEntrySource) Enum.valueOf(VoiceEvents$VoiceEntrySource.class, str);
    }

    public static VoiceEvents$VoiceEntrySource[] values() {
        return (VoiceEvents$VoiceEntrySource[]) $VALUES.clone();
    }
}
