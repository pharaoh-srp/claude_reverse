package androidx.media3.exoplayer.mediacodec;

import defpackage.g6b;
import defpackage.jw7;

/* JADX INFO: loaded from: classes2.dex */
public class MediaCodecRenderer$DecoderInitializationException extends Exception {
    public final String E;
    public final boolean F;
    public final g6b G;
    public final String H;

    public MediaCodecRenderer$DecoderInitializationException(jw7 jw7Var, MediaCodecUtil$DecoderQueryException mediaCodecUtil$DecoderQueryException, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + jw7Var, mediaCodecUtil$DecoderQueryException, jw7Var.o, z, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i));
    }

    public MediaCodecRenderer$DecoderInitializationException(String str, Throwable th, String str2, boolean z, g6b g6bVar, String str3) {
        super(str, th);
        this.E = str2;
        this.F = z;
        this.G = g6bVar;
        this.H = str3;
    }
}
