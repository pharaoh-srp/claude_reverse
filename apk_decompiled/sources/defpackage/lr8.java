package defpackage;

import java.io.IOException;
import okio.Buffer;
import okio.ForwardingTimeout;
import okio.RealBufferedSource;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lr8 implements Source {
    public final vs8 E;
    public final ForwardingTimeout F;
    public boolean G;
    public final /* synthetic */ qr8 H;

    public lr8(qr8 qr8Var, vs8 vs8Var) {
        vs8Var.getClass();
        this.H = qr8Var;
        this.E = vs8Var;
        this.F = new ForwardingTimeout(((RealBufferedSource) qr8Var.c.F).E.getF());
    }

    @Override // okio.Source
    public long A0(Buffer buffer, long j) throws IOException {
        qr8 qr8Var = this.H;
        buffer.getClass();
        try {
            return ((RealBufferedSource) qr8Var.c.F).A0(buffer, j);
        } catch (IOException e) {
            qr8Var.b.e();
            this.c(qr8.g);
            throw e;
        }
    }

    public final void c(wg8 wg8Var) {
        hdc hdcVar;
        i25 i25Var;
        wg8Var.getClass();
        qr8 qr8Var = this.H;
        int i = qr8Var.d;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + qr8Var.d);
        }
        ForwardingTimeout forwardingTimeout = this.F;
        Timeout timeout = forwardingTimeout.f;
        forwardingTimeout.f = Timeout.e;
        timeout.c();
        timeout.d();
        qr8Var.f = wg8Var;
        qr8Var.d = 6;
        if (wg8Var.size() <= 0 || (hdcVar = qr8Var.a) == null || (i25Var = hdcVar.j) == null) {
            return;
        }
        js8.b(i25Var, this.E, wg8Var);
    }

    @Override // okio.Source
    /* JADX INFO: renamed from: l */
    public final Timeout getF() {
        return this.F;
    }
}
