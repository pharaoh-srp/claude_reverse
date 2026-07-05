package defpackage;

import com.anthropic.claude.api.chat.InputMode;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class at8 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[InputMode.values().length];
        try {
            iArr[InputMode.VOICE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InputMode.SPEECH_INPUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
