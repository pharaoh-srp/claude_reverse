package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.DeflaterSink;

/* JADX INFO: loaded from: classes3.dex */
public final class e7j implements Closeable {
    public final BufferedSink E;
    public final Random F;
    public final boolean G;
    public final boolean H;
    public final long I;
    public final Buffer J;
    public final Buffer K;
    public boolean L;
    public qfb M;
    public final byte[] N;
    public final Buffer.UnsafeCursor O;

    public e7j(BufferedSink bufferedSink, Random random, boolean z, boolean z2, long j) {
        bufferedSink.getClass();
        this.E = bufferedSink;
        this.F = random;
        this.G = z;
        this.H = z2;
        this.I = j;
        this.J = new Buffer();
        this.K = bufferedSink.getF();
        this.N = new byte[4];
        this.O = new Buffer.UnsafeCursor();
    }

    public final void c(int i, ByteString byteString) throws IOException {
        if (this.L) {
            xh6.c("closed");
            return;
        }
        int iE = byteString.e();
        if (iE > 125) {
            sz6.p("Payload size must be less than or equal to 125");
            return;
        }
        int i2 = i | FreeTypeConstants.FT_LOAD_PEDANTIC;
        Buffer buffer = this.K;
        buffer.B0(i2);
        buffer.B0(iE | FreeTypeConstants.FT_LOAD_PEDANTIC);
        byte[] bArr = this.N;
        bArr.getClass();
        this.F.nextBytes(bArr);
        buffer.m1202write(bArr, 0, bArr.length);
        if (iE > 0) {
            long j = buffer.F;
            buffer.r0(byteString);
            Buffer.UnsafeCursor unsafeCursor = this.O;
            unsafeCursor.getClass();
            buffer.H(unsafeCursor);
            unsafeCursor.d(j);
            a7j.a(unsafeCursor, bArr);
            unsafeCursor.close();
        }
        this.E.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        qfb qfbVar = this.M;
        if (qfbVar != null) {
            zkj.b(qfbVar);
        }
        zkj.b(this.E);
    }

    public final void d(int i, ByteString byteString) throws IOException {
        if (this.L) {
            xh6.c("closed");
            return;
        }
        Buffer buffer = this.J;
        buffer.r0(byteString);
        int i2 = i | FreeTypeConstants.FT_LOAD_PEDANTIC;
        if (this.G && byteString.E.length >= this.I) {
            qfb qfbVar = this.M;
            if (qfbVar == null) {
                qfbVar = new qfb(this.H);
                this.M = qfbVar;
            }
            DeflaterSink deflaterSink = qfbVar.H;
            Buffer buffer2 = qfbVar.F;
            if (buffer2.F != 0) {
                sz6.p("Failed requirement.");
                return;
            }
            if (qfbVar.E) {
                qfbVar.G.reset();
            }
            deflaterSink.c0(buffer, buffer.F);
            deflaterSink.flush();
            ByteString byteString2 = rfb.a;
            if (buffer2.x(byteString2.e(), buffer2.F - ((long) byteString2.E.length), byteString2)) {
                long j = buffer2.F - 4;
                Buffer.UnsafeCursor unsafeCursor = new Buffer.UnsafeCursor();
                buffer2.H(unsafeCursor);
                try {
                    unsafeCursor.c(j);
                    unsafeCursor.close();
                } finally {
                }
            } else {
                buffer2.B0(0);
            }
            buffer.c0(buffer2, buffer2.F);
            i2 = i | 192;
        }
        long j2 = buffer.F;
        Buffer buffer3 = this.K;
        buffer3.B0(i2);
        if (j2 <= 125) {
            buffer3.B0(((int) j2) | FreeTypeConstants.FT_LOAD_PEDANTIC);
        } else if (j2 <= 65535) {
            buffer3.B0(254);
            buffer3.R0((int) j2);
        } else {
            buffer3.B0(255);
            buffer3.Q0(j2);
        }
        byte[] bArr = this.N;
        bArr.getClass();
        this.F.nextBytes(bArr);
        buffer3.m1202write(bArr, 0, bArr.length);
        if (j2 > 0) {
            Buffer.UnsafeCursor unsafeCursor2 = this.O;
            unsafeCursor2.getClass();
            buffer.H(unsafeCursor2);
            unsafeCursor2.d(0L);
            a7j.a(unsafeCursor2, bArr);
            unsafeCursor2.close();
        }
        buffer3.c0(buffer, j2);
        this.E.flush();
    }
}
