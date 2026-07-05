package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class j6b extends MediaCodec.Callback {
    public final /* synthetic */ m6b a;

    public j6b(m6b m6bVar) {
        this.a = m6bVar;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        fkg fkgVar;
        mediaCodec.getClass();
        codecException.getClass();
        zfa.a.getClass();
        if (yfa.b()) {
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (!arrayList.isEmpty()) {
                zfa.a.getClass();
                String strI = ij0.i("MediaCodec async error: ", codecException.getMessage());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfa.DEBUG, "OpusCodec", strI);
                }
            }
        }
        if (codecException.isTransient() || (fkgVar = this.a.F) == null) {
            return;
        }
        fkgVar.d(null);
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        mediaCodec.getClass();
        this.a.O.r(Integer.valueOf(i));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        mediaCodec.getClass();
        bufferInfo.getClass();
        try {
            if (bufferInfo.size > 0) {
                ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(i);
                if (outputBuffer == null) {
                    return;
                }
                byte[] bArr = new byte[bufferInfo.size];
                outputBuffer.get(bArr);
                this.a.N.r(bArr);
            }
            mediaCodec.releaseOutputBuffer(i, false);
        } catch (MediaCodec.CodecException unused) {
        } catch (IllegalStateException unused2) {
            List list = xah.a;
            xah.e(4, "stale output buffer index after flush", "OpusCodec", null);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        mediaCodec.getClass();
        mediaFormat.getClass();
    }
}
