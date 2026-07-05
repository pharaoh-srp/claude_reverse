package defpackage;

import java.io.IOException;
import okio.BufferedSource;
import okio.RealBufferedSource;

/* JADX INFO: loaded from: classes.dex */
public final class ddc extends rqe {
    public final rqe F;
    public final RealBufferedSource G;
    public IOException H;

    public ddc(rqe rqeVar) {
        this.F = rqeVar;
        this.G = new RealBufferedSource(new cdc(this, rqeVar.G0()));
    }

    @Override // defpackage.rqe
    public final BufferedSource G0() {
        return this.G;
    }

    @Override // defpackage.rqe, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.F.close();
    }

    @Override // defpackage.rqe
    public final long d() {
        return this.F.d();
    }

    @Override // defpackage.rqe
    public final p8b e() {
        return this.F.e();
    }
}
