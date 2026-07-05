package androidx.media3.common.audio;

import defpackage.i51;

/* JADX INFO: loaded from: classes2.dex */
public final class AudioProcessor$UnhandledAudioFormatException extends Exception {
    public AudioProcessor$UnhandledAudioFormatException(String str, i51 i51Var) {
        super(str + " " + i51Var);
    }

    public AudioProcessor$UnhandledAudioFormatException(i51 i51Var) {
        this("Unhandled input format:", i51Var);
    }
}
