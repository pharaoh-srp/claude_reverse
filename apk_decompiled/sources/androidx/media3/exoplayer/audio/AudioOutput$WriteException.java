package androidx.media3.exoplayer.audio;

import defpackage.grc;

/* JADX INFO: loaded from: classes2.dex */
public final class AudioOutput$WriteException extends Exception {
    public final int E;
    public final boolean F;

    public AudioOutput$WriteException(int i, boolean z) {
        super(grc.p(i, "AudioOutput write failed: "));
        this.F = z;
        this.E = i;
    }
}
