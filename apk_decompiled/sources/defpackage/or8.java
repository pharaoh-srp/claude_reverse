package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import okio.Buffer;

/* JADX INFO: loaded from: classes3.dex */
public final class or8 extends lr8 {
    public long I;
    public final /* synthetic */ qr8 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or8(qr8 qr8Var, vs8 vs8Var, long j) {
        super(qr8Var, vs8Var);
        vs8Var.getClass();
        this.J = qr8Var;
        this.I = j;
        if (j == 0) {
            c(wg8.F);
        }
    }

    @Override // defpackage.lr8, okio.Source
    public final long A0(Buffer buffer, long j) throws IOException {
        buffer.getClass();
        if (j < 0) {
            mr9.q(vb7.m(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.G) {
            sz6.j("closed");
            return 0L;
        }
        long j2 = this.I;
        if (j2 == 0) {
            return -1L;
        }
        long jA0 = super.A0(buffer, Math.min(j2, j));
        if (jA0 == -1) {
            this.J.b.e();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            c(qr8.g);
            throw protocolException;
        }
        long j3 = this.I - jA0;
        this.I = j3;
        if (j3 == 0) {
            c(wg8.F);
        }
        return jA0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zH;
        if (this.G) {
            return;
        }
        if (this.I != 0) {
            TimeZone timeZone = blj.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zH = blj.h(this, 100);
            } catch (IOException unused) {
                zH = false;
            }
            if (!zH) {
                this.J.b.e();
                c(qr8.g);
            }
        }
        this.G = true;
    }
}
