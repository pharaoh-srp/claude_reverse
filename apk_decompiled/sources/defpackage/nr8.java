package defpackage;

import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class nr8 extends lr8 {
    public long I;
    public boolean J;
    public final /* synthetic */ qr8 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr8(qr8 qr8Var, vs8 vs8Var) {
        super(qr8Var, vs8Var);
        vs8Var.getClass();
        this.K = qr8Var;
        this.I = -1L;
        this.J = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c5, code lost:
    
        if (r16.J == false) goto L48;
     */
    @Override // defpackage.lr8, okio.Source
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A0(okio.Buffer r17, long r18) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nr8.A0(okio.Buffer, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zH;
        if (this.G) {
            return;
        }
        if (this.J) {
            TimeZone timeZone = blj.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zH = blj.h(this, 100);
            } catch (IOException unused) {
                zH = false;
            }
            if (!zH) {
                this.K.b.e();
                c(qr8.g);
            }
        }
        this.G = true;
    }
}
