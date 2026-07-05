package defpackage;

import okio.BufferedSource;

/* JADX INFO: loaded from: classes3.dex */
public final class rb5 extends rqe {
    public final rqe F;
    public final f4e G;
    public final /* synthetic */ sb5 H;

    public rb5(sb5 sb5Var, rqe rqeVar, f4e f4eVar) {
        this.H = sb5Var;
        this.F = rqeVar;
        this.G = f4eVar;
    }

    @Override // defpackage.rqe
    public final BufferedSource G0() {
        return this.F.G0();
    }

    @Override // defpackage.rqe, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.F.close();
        this.H.F.remove(this.G);
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
