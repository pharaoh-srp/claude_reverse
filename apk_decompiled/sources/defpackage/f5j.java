package defpackage;

import com.anthropic.claude.analytics.events.VoiceEvents$VoiceFocusResult;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class f5j {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[VoiceEvents$VoiceFocusResult.values().length];
        try {
            iArr[VoiceEvents$VoiceFocusResult.GRANTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VoiceEvents$VoiceFocusResult.DENIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VoiceEvents$VoiceFocusResult.GAIN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[VoiceEvents$VoiceFocusResult.LOSS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[VoiceEvents$VoiceFocusResult.LOSS_TRANSIENT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[VoiceEvents$VoiceFocusResult.LOSS_TRANSIENT_CAN_DUCK.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[VoiceEvents$VoiceFocusResult.UNSPECIFIED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
