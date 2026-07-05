package defpackage;

import com.squareup.wire.internal.MathMethodsKt;
import java.io.IOException;
import java.net.SocketTimeoutException;
import okio.AsyncTimeout;

/* JADX INFO: loaded from: classes.dex */
public final class fs8 extends AsyncTimeout {
    public final /* synthetic */ gs8 o;

    public fs8(gs8 gs8Var) {
        this.o = gs8Var;
    }

    @Override // okio.AsyncTimeout
    public final IOException m(IOException iOException) {
        return new SocketTimeoutException("timeout");
    }

    @Override // okio.AsyncTimeout
    public final void n() {
        this.o.f(xr6.CANCEL);
        zr8 zr8Var = this.o.F;
        synchronized (zr8Var) {
            long j = zr8Var.S;
            long j2 = zr8Var.R;
            if (j < j2) {
                return;
            }
            zr8Var.R = j2 + 1;
            zr8Var.T = System.nanoTime() + MathMethodsKt.NANOS_PER_SECOND;
            m7h.b(zr8Var.L, ij0.m(new StringBuilder(), zr8Var.G, " ping"), 0L, new xi4(20, zr8Var), 6);
        }
    }

    public final void o() {
        if (l()) {
            throw m(null);
        }
    }
}
