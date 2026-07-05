package defpackage;

import com.anthropic.claude.analytics.events.VoiceEvents$VoiceActivationMode;
import com.anthropic.claude.api.chat.InputMode;
import com.anthropic.claude.bell.PlaybackPace;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class h5j {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[PlaybackPace.values().length];
        try {
            iArr[PlaybackPace.SLOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlaybackPace.NORMAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlaybackPace.FAST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[VoiceEvents$VoiceActivationMode.values().length];
        try {
            iArr2[VoiceEvents$VoiceActivationMode.HANDS_FREE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[VoiceEvents$VoiceActivationMode.PUSH_TO_TALK.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[VoiceEvents$VoiceActivationMode.UNSPECIFIED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
        int[] iArr3 = new int[InputMode.values().length];
        try {
            iArr3[InputMode.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[InputMode.TEXT.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[InputMode.RETRY.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[InputMode.SPEECH_INPUT.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[InputMode.VOICE.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        c = iArr3;
    }
}
