package androidx.media3.exoplayer.audio;

import defpackage.jw7;
import defpackage.qy1;
import defpackage.vb7;

/* JADX INFO: loaded from: classes2.dex */
public final class AudioSink$InitializationException extends Exception {
    public final boolean E;

    /* JADX WARN: Illegal instructions before constructor call */
    public AudioSink$InitializationException(int i, int i2, int i3, int i4, jw7 jw7Var, boolean z, AudioOutputProvider$InitializationException audioOutputProvider$InitializationException) {
        StringBuilder sbV = vb7.v("AudioTrack init failed 0 Config(", ", ", i, i2, ", ");
        qy1.k(i3, i4, ", ", ") ", sbV);
        sbV.append(jw7Var);
        sbV.append(z ? " (recoverable)" : "");
        super(sbV.toString(), audioOutputProvider$InitializationException);
        this.E = z;
    }
}
