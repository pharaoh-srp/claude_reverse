package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public final class m6b implements l45, AutoCloseable {
    public final ppk E;
    public final fkg F;
    public final HandlerThread G;
    public final Handler H;
    public final ye8 I;
    public final c45 J;
    public final jxb K;
    public final int L;
    public final zy1 M;
    public final zy1 N;
    public final zy1 O;
    public final MediaCodec P;

    public m6b(ppk ppkVar, h86 h86Var) throws IOException {
        MediaCodec mediaCodecCreateEncoderByType;
        this.E = ppkVar;
        HandlerThread handlerThread = new HandlerThread("OpusCodecCallback");
        handlerThread.start();
        this.G = handlerThread;
        Handler handler = new Handler(handlerThread.getLooper());
        this.H = handler;
        int i = af8.a;
        this.I = new ye8(handler, "OpusCodecCallback", false);
        this.J = nai.Z(iuj.g(), h86Var.b());
        this.K = new jxb();
        this.L = FreeTypeConstants.FT_LOAD_MONOCHROME;
        tp4 tp4Var = null;
        this.M = wd6.P(Integer.MAX_VALUE, 6, null);
        this.N = wd6.P(Integer.MAX_VALUE, 6, null);
        this.O = wd6.P(Integer.MAX_VALUE, 6, null);
        j6b j6bVar = new j6b(this);
        int i2 = 17;
        if (ppkVar instanceof i6b) {
            if (((i6b) ppkVar).b == null) {
                wg6.i();
                throw null;
            }
            MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat("audio/opus", 16000, 1);
            mediaFormatCreateAudioFormat.setInteger("max-input-size", FreeTypeConstants.FT_LOAD_MONOCHROME);
            mediaFormatCreateAudioFormat.setInteger("bitrate", 96000);
            mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("audio/opus");
            mediaCodecCreateEncoderByType.setCallback(j6bVar, handler);
            mediaCodecCreateEncoderByType.configure(mediaFormatCreateAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            this.F = gb9.D(this, null, null, new mt4(this, tp4Var, i2), 3);
            mediaCodecCreateEncoderByType.start();
        } else {
            if (!(ppkVar instanceof h6b)) {
                wg6.i();
                throw null;
            }
            MediaFormat mediaFormatCreateAudioFormat2 = MediaFormat.createAudioFormat("audio/opus", 48000, 1);
            mediaFormatCreateAudioFormat2.getClass();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(19);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            ByteBuffer byteBufferOrder = byteBufferAllocate.order(byteOrder);
            byte[] bytes = "OpusHead".getBytes(dj2.a);
            bytes.getClass();
            byteBufferOrder.put(bytes);
            byteBufferOrder.put((byte) 1);
            byteBufferOrder.put((byte) 1);
            byteBufferOrder.putShort((short) 0);
            byteBufferOrder.putInt(48000);
            byteBufferOrder.putShort((short) 0);
            byteBufferOrder.put((byte) 0);
            byte[] bArrArray = byteBufferOrder.array();
            bArrArray.getClass();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrArray);
            ByteBuffer byteBufferPutLong = ByteBuffer.allocate(8).order(byteOrder).putLong(0L);
            byteBufferPutLong.flip();
            ByteBuffer byteBufferPutLong2 = ByteBuffer.allocate(8).order(byteOrder).putLong(80000000L);
            byteBufferPutLong2.flip();
            mediaFormatCreateAudioFormat2.setByteBuffer("csd-0", byteBufferWrap);
            mediaFormatCreateAudioFormat2.setByteBuffer("csd-1", byteBufferPutLong);
            mediaFormatCreateAudioFormat2.setByteBuffer("csd-2", byteBufferPutLong2);
            MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType("audio/opus");
            mediaCodecCreateDecoderByType.setCallback(j6bVar, handler);
            mediaCodecCreateDecoderByType.configure(mediaFormatCreateAudioFormat2, (Surface) null, (MediaCrypto) null, 0);
            this.F = gb9.D(this, null, null, new mt4(this, tp4Var, i2), 3);
            mediaCodecCreateDecoderByType.start();
            mediaCodecCreateEncoderByType = mediaCodecCreateDecoderByType;
        }
        this.P = mediaCodecCreateEncoderByType;
    }

    public final void c(short[] sArr) {
        sArr.getClass();
        if (!(this.E instanceof i6b)) {
            sz6.j("encode() is only available in Encode mode");
            return;
        }
        int length = sArr.length * 2;
        byte[] bArr = new byte[length];
        ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().put(sArr);
        int i = 0;
        while (i < length) {
            int iMin = Math.min(this.L + i, length);
            this.M.r(mp0.x0(bArr, i, iMin));
            i = iMin;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Throwable {
        gb9.V(im6.E, new al8(this, (tp4) null, 14));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.vp4 r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.k6b
            if (r0 == 0) goto L13
            r0 = r9
            k6b r0 = (defpackage.k6b) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            k6b r0 = new k6b
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.F
            int r1 = r0.H
            r2 = 2
            r3 = 1
            r4 = 0
            m45 r5 = defpackage.m45.E
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2f
            hxb r8 = r0.E
            defpackage.sf5.h0(r9)     // Catch: java.lang.Throwable -> L2d
            goto L66
        L2d:
            r9 = move-exception
            goto L70
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r8)
            return r4
        L35:
            hxb r1 = r0.E
            defpackage.sf5.h0(r9)
            r9 = r1
            goto L52
        L3c:
            defpackage.sf5.h0(r9)
            ppk r9 = r8.E
            boolean r9 = r9 instanceof defpackage.h6b
            if (r9 == 0) goto L74
            jxb r9 = r8.K
            r0.E = r9
            r0.H = r3
            java.lang.Object r1 = r9.c(r0)
            if (r1 != r5) goto L52
            goto L64
        L52:
            ye8 r1 = r8.I     // Catch: java.lang.Throwable -> L6c
            l6b r3 = new l6b     // Catch: java.lang.Throwable -> L6c
            r6 = 0
            r3.<init>(r8, r4, r6)     // Catch: java.lang.Throwable -> L6c
            r0.E = r9     // Catch: java.lang.Throwable -> L6c
            r0.H = r2     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r8 = defpackage.gb9.c0(r1, r3, r0)     // Catch: java.lang.Throwable -> L6c
            if (r8 != r5) goto L65
        L64:
            return r5
        L65:
            r8 = r9
        L66:
            r8.d(r4)
            iei r8 = defpackage.iei.a
            return r8
        L6c:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L70:
            r8.d(r4)
            throw r9
        L74:
            java.lang.String r8 = "flush() is only available in Decode mode"
            defpackage.sz6.j(r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m6b.d(vp4):java.lang.Object");
    }

    public final s41 e() {
        s41 s41Var;
        ppk ppkVar = this.E;
        i6b i6bVar = ppkVar instanceof i6b ? (i6b) ppkVar : null;
        if (i6bVar != null && (s41Var = i6bVar.b) != null) {
            return s41Var;
        }
        sz6.j("target is only available in encode mode.");
        return null;
    }

    @Override // defpackage.l45
    public final c45 getCoroutineContext() {
        return this.J;
    }
}
