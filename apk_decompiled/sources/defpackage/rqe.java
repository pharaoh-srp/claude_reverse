package defpackage;

import java.io.Closeable;
import java.io.IOException;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public abstract class rqe implements Closeable {
    public static final qqe E;

    static {
        ByteString byteString = ByteString.H;
        byteString.getClass();
        Buffer buffer = new Buffer();
        buffer.r0(byteString);
        E = new qqe(null, byteString.E.length, buffer);
    }

    public abstract BufferedSource G0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final byte[] c() throws IOException {
        long jD = d();
        byte[] th = null;
        if (jD > 2147483647L) {
            xh6.c(vb7.m(jD, "Cannot buffer entire body for content length: "));
            return null;
        }
        BufferedSource bufferedSourceG0 = G0();
        try {
            byte[] bArrB = bufferedSourceG0.B();
            try {
                bufferedSourceG0.close();
            } catch (Throwable th2) {
                th = th2;
            }
            byte[] bArr = th;
            th = bArrB;
            th = bArr;
        } catch (Throwable th3) {
            th = th3;
            if (bufferedSourceG0 != null) {
                try {
                    bufferedSourceG0.close();
                } catch (Throwable th4) {
                    mwa.p(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int length = th.length;
        if (jD == -1 || jD == length) {
            return th;
        }
        throw new IOException("Content-Length (" + jD + ") and stream length (" + length + ") disagree");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zkj.b(G0());
    }

    public abstract long d();

    public abstract p8b e();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013 A[Catch: all -> 0x0026, TryCatch #1 {all -> 0x0026, blocks: (B:3:0x0005, B:5:0x000b, B:8:0x0015, B:7:0x0013), top: B:24:0x0005 }] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String f() {
        /*
            r4 = this;
            okio.BufferedSource r0 = r4.G0()
            r1 = 0
            p8b r4 = r4.e()     // Catch: java.lang.Throwable -> L26
            if (r4 == 0) goto L13
            ide r2 = defpackage.p8b.e     // Catch: java.lang.Throwable -> L26
            java.nio.charset.Charset r4 = r4.a(r1)     // Catch: java.lang.Throwable -> L26
            if (r4 != 0) goto L15
        L13:
            java.nio.charset.Charset r4 = defpackage.dj2.a     // Catch: java.lang.Throwable -> L26
        L15:
            java.nio.charset.Charset r4 = defpackage.blj.g(r0, r4)     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = r0.Z(r4)     // Catch: java.lang.Throwable -> L26
            r0.close()     // Catch: java.lang.Throwable -> L21
            goto L22
        L21:
            r1 = move-exception
        L22:
            r3 = r1
            r1 = r4
            r4 = r3
            goto L31
        L26:
            r4 = move-exception
            if (r0 == 0) goto L31
            r0.close()     // Catch: java.lang.Throwable -> L2d
            goto L31
        L2d:
            r0 = move-exception
            defpackage.mwa.p(r4, r0)
        L31:
            if (r4 != 0) goto L34
            return r1
        L34:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rqe.f():java.lang.String");
    }
}
