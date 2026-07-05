package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import okio.Buffer;
import okio.ForwardingSource;
import okio.Source;

/* JADX INFO: loaded from: classes.dex */
public final class v47 extends ForwardingSource {
    public final long F;
    public final boolean G;
    public long H;
    public boolean I;
    public boolean J;
    public boolean K;
    public final /* synthetic */ w47 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v47(w47 w47Var, Source source, long j, boolean z) {
        super(source);
        source.getClass();
        this.L = w47Var;
        this.F = j;
        this.G = z;
        this.I = true;
        if (j == 0) {
            c(null);
        }
    }

    @Override // okio.ForwardingSource, okio.Source
    public final long A0(Buffer buffer, long j) throws IOException {
        buffer.getClass();
        if (this.K) {
            sz6.j("closed");
            return 0L;
        }
        try {
            long jA0 = this.E.A0(buffer, j);
            if (this.I) {
                this.I = false;
                ((f4e) this.L.c).I.v((f4e) this.L.c);
            }
            if (jA0 == -1) {
                c(null);
                return -1L;
            }
            long j2 = this.H + jA0;
            long j3 = this.F;
            if (j3 != -1 && j2 > j3) {
                throw new ProtocolException("expected " + this.F + " bytes but received " + j2);
            }
            this.H = j2;
            if (((y47) this.L.e).d()) {
                c(null);
            }
            return jA0;
        } catch (IOException e) {
            IOException iOExceptionC = c(e);
            iOExceptionC.getClass();
            throw iOExceptionC;
        }
    }

    public final IOException c(IOException iOException) {
        if (this.J) {
            return iOException;
        }
        this.J = true;
        if (iOException == null && this.I) {
            this.I = false;
            ((f4e) this.L.c).I.v((f4e) this.L.c);
        }
        return w47.a(this.L, this.H, this.G, false, iOException, 8);
    }

    @Override // okio.ForwardingSource, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.K) {
            return;
        }
        this.K = true;
        try {
            super.close();
            c(null);
        } catch (IOException e) {
            IOException iOExceptionC = c(e);
            iOExceptionC.getClass();
            throw iOExceptionC;
        }
    }
}
