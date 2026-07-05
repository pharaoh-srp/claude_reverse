package defpackage;

import java.io.EOFException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public final class hub extends tie {
    public static final p8b e;
    public static final p8b f;
    public static final byte[] g;
    public static final byte[] h;
    public static final byte[] i;
    public final ByteString a;
    public final List b;
    public final p8b c;
    public long d;

    static {
        ide ideVar = p8b.e;
        e = nai.D("multipart/mixed");
        nai.D("multipart/alternative");
        nai.D("multipart/digest");
        nai.D("multipart/parallel");
        f = nai.D("multipart/form-data");
        g = new byte[]{58, 32};
        h = new byte[]{13, 10};
        i = new byte[]{45, 45};
    }

    public hub(ByteString byteString, p8b p8bVar, List list) {
        byteString.getClass();
        p8bVar.getClass();
        this.a = byteString;
        this.b = list;
        ide ideVar = p8b.e;
        this.c = nai.D(p8bVar + "; boundary=" + byteString.t());
        this.d = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a(BufferedSink bufferedSink, boolean z) throws EOFException {
        Buffer buffer;
        BufferedSink buffer2;
        if (z) {
            buffer2 = new Buffer();
            buffer = buffer2;
        } else {
            buffer = 0;
            buffer2 = bufferedSink;
        }
        List list = this.b;
        int size = list.size();
        long j = 0;
        int i2 = 0;
        while (true) {
            ByteString byteString = this.a;
            byte[] bArr = i;
            byte[] bArr2 = h;
            if (i2 >= size) {
                buffer2.getClass();
                buffer2.write(bArr);
                buffer2.z0(byteString);
                buffer2.write(bArr);
                buffer2.write(bArr2);
                if (!z) {
                    return j;
                }
                buffer.getClass();
                long j2 = j + buffer.F;
                buffer.c();
                return j2;
            }
            gub gubVar = (gub) list.get(i2);
            wg8 wg8Var = gubVar.a;
            tie tieVar = gubVar.b;
            buffer2.getClass();
            buffer2.write(bArr);
            buffer2.z0(byteString);
            buffer2.write(bArr2);
            int size2 = wg8Var.size();
            for (int i3 = 0; i3 < size2; i3++) {
                buffer2.W(wg8Var.e(i3)).write(g).W(wg8Var.k(i3)).write(bArr2);
            }
            p8b p8bVarContentType = tieVar.contentType();
            if (p8bVarContentType != null) {
                buffer2.W("Content-Type: ").W(p8bVarContentType.a).write(bArr2);
            }
            long jContentLength = tieVar.contentLength();
            if (jContentLength == -1 && z) {
                buffer.getClass();
                buffer.c();
                return -1L;
            }
            buffer2.write(bArr2);
            if (z) {
                j += jContentLength;
            } else {
                tieVar.writeTo(buffer2);
            }
            buffer2.write(bArr2);
            i2++;
        }
    }

    @Override // defpackage.tie
    public final long contentLength() throws EOFException {
        long j = this.d;
        if (j != -1) {
            return j;
        }
        long jA = a(null, true);
        this.d = jA;
        return jA;
    }

    @Override // defpackage.tie
    public final p8b contentType() {
        return this.c;
    }

    @Override // defpackage.tie
    public final boolean isOneShot() {
        List list = this.b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((gub) it.next()).b.isOneShot()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tie
    public final void writeTo(BufferedSink bufferedSink) throws EOFException {
        bufferedSink.getClass();
        a(bufferedSink, false);
    }
}
