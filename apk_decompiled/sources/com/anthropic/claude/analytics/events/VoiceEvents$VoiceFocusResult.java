package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.p3j;
import defpackage.w1a;
import defpackage.w3j;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/anthropic/claude/analytics/events/VoiceEvents$VoiceFocusResult", "", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceFocusResult;", "<init>", "(Ljava/lang/String;I)V", "Companion", "w3j", "UNSPECIFIED", "GRANTED", "DENIED", "LOSS", "LOSS_TRANSIENT", "LOSS_TRANSIENT_CAN_DUCK", "GAIN", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class VoiceEvents$VoiceFocusResult {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ VoiceEvents$VoiceFocusResult[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final w3j Companion;
    public static final VoiceEvents$VoiceFocusResult UNSPECIFIED = new VoiceEvents$VoiceFocusResult("UNSPECIFIED", 0);
    public static final VoiceEvents$VoiceFocusResult GRANTED = new VoiceEvents$VoiceFocusResult("GRANTED", 1);
    public static final VoiceEvents$VoiceFocusResult DENIED = new VoiceEvents$VoiceFocusResult("DENIED", 2);
    public static final VoiceEvents$VoiceFocusResult LOSS = new VoiceEvents$VoiceFocusResult("LOSS", 3);
    public static final VoiceEvents$VoiceFocusResult LOSS_TRANSIENT = new VoiceEvents$VoiceFocusResult("LOSS_TRANSIENT", 4);
    public static final VoiceEvents$VoiceFocusResult LOSS_TRANSIENT_CAN_DUCK = new VoiceEvents$VoiceFocusResult("LOSS_TRANSIENT_CAN_DUCK", 5);
    public static final VoiceEvents$VoiceFocusResult GAIN = new VoiceEvents$VoiceFocusResult("GAIN", 6);

    private static final /* synthetic */ VoiceEvents$VoiceFocusResult[] $values() {
        return new VoiceEvents$VoiceFocusResult[]{UNSPECIFIED, GRANTED, DENIED, LOSS, LOSS_TRANSIENT, LOSS_TRANSIENT_CAN_DUCK, GAIN};
    }

    static {
        VoiceEvents$VoiceFocusResult[] voiceEvents$VoiceFocusResultArr$values = $values();
        $VALUES = voiceEvents$VoiceFocusResultArr$values;
        $ENTRIES = wd6.n0(voiceEvents$VoiceFocusResultArr$values);
        Companion = new w3j();
        $cachedSerializer$delegate = yb5.w(w1a.F, new p3j(6));
    }

    private VoiceEvents$VoiceFocusResult(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.VoiceEvents.VoiceFocusResult", values(), new String[]{"unknown", "granted", "denied", "loss", "loss_transient", "loss_transient_can_duck", "gain"}, new Annotation[][]{null, null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static VoiceEvents$VoiceFocusResult valueOf(String str) {
        return (VoiceEvents$VoiceFocusResult) Enum.valueOf(VoiceEvents$VoiceFocusResult.class, str);
    }

    public static VoiceEvents$VoiceFocusResult[] values() {
        return (VoiceEvents$VoiceFocusResult[]) $VALUES.clone();
    }
}
