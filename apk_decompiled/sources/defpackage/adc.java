package defpackage;

import com.google.net.cronet.okhttptransport.CronetTimeoutException;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import okio.Buffer;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: classes3.dex */
public final class adc implements Source {
    public ByteBuffer E = ByteBuffer.allocateDirect(FreeTypeConstants.FT_LOAD_NO_AUTOHINT);
    public volatile boolean F = false;
    public final /* synthetic */ bdc G;

    public adc(bdc bdcVar) {
        this.G = bdcVar;
    }

    @Override // okio.Source
    public final long A0(Buffer buffer, long j) throws IOException {
        zcc zccVar;
        if (this.G.c.get()) {
            xh6.c("The request was canceled!");
            return 0L;
        }
        fd9.C("sink == null", buffer != null);
        fd9.D("byteCount < 0: %s", j >= 0, j);
        fd9.L("closed", !this.F);
        if (this.G.b.get()) {
            return -1L;
        }
        if (j < this.E.limit()) {
            this.E.limit((int) j);
        }
        this.G.h.read(this.E);
        try {
            bdc bdcVar = this.G;
            zccVar = (zcc) bdcVar.d.poll(bdcVar.f, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            zccVar = null;
        }
        if (zccVar == null) {
            this.G.h.cancel();
            throw new CronetTimeoutException();
        }
        int iF = sq6.F(zccVar.a);
        if (iF == 0) {
            zccVar.b.flip();
            int iWrite = buffer.write(zccVar.b);
            zccVar.b.clear();
            return iWrite;
        }
        if (iF == 1) {
            this.G.b.set(true);
            this.E = null;
            return -1L;
        }
        if (iF == 2) {
            this.G.b.set(true);
            this.E = null;
            throw new IOException(zccVar.c);
        }
        if (iF != 3) {
            sz6.h("The switch block above is exhaustive!");
            return 0L;
        }
        this.E = null;
        xh6.c("The request was canceled!");
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.F) {
            return;
        }
        this.F = true;
        if (this.G.b.get()) {
            return;
        }
        this.G.h.cancel();
    }

    @Override // okio.Source
    /* JADX INFO: renamed from: l */
    public final Timeout getF() {
        return Timeout.e;
    }
}
