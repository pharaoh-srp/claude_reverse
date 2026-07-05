package defpackage;

import okio.BufferedSource;

/* JADX INFO: loaded from: classes.dex */
public final class edc extends rqe {
    public final p8b F;
    public final long G;

    public edc(p8b p8bVar, long j) {
        this.F = p8bVar;
        this.G = j;
    }

    @Override // defpackage.rqe
    public final BufferedSource G0() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }

    @Override // defpackage.rqe
    public final long d() {
        return this.G;
    }

    @Override // defpackage.rqe
    public final p8b e() {
        return this.F;
    }
}
