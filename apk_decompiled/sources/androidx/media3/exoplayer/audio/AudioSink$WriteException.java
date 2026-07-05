package androidx.media3.exoplayer.audio;

import defpackage.grc;
import defpackage.jw7;

/* JADX INFO: loaded from: classes2.dex */
public final class AudioSink$WriteException extends Exception {
    public final int E;
    public final boolean F;
    public final jw7 G;

    public AudioSink$WriteException(int i, jw7 jw7Var, boolean z) {
        super(grc.p(i, "AudioTrack write failed: "));
        this.F = z;
        this.E = i;
        this.G = jw7Var;
    }
}
