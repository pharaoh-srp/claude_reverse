package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.media3.decoder.DecoderException;
import defpackage.g6b;

/* JADX INFO: loaded from: classes2.dex */
public class MediaCodecDecoderException extends DecoderException {
    public final int E;

    public MediaCodecDecoderException(IllegalStateException illegalStateException, g6b g6bVar) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(g6bVar == null ? null : g6bVar.a);
        super(sb.toString(), illegalStateException);
        boolean z = illegalStateException instanceof MediaCodec.CodecException;
        if (z) {
            ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.E = z ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
    }
}
