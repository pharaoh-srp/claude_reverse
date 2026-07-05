package androidx.media3.exoplayer.audio;

import defpackage.jw7;

/* JADX INFO: loaded from: classes2.dex */
public final class AudioSink$ConfigurationException extends Exception {
    public final jw7 E;

    public AudioSink$ConfigurationException(Exception exc, jw7 jw7Var) {
        super(exc);
        this.E = jw7Var;
    }

    public AudioSink$ConfigurationException(String str, jw7 jw7Var) {
        super(str);
        this.E = jw7Var;
    }
}
