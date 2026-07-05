package defpackage;

import okio.BufferedSource;

/* JADX INFO: loaded from: classes.dex */
public final class qqe extends rqe {
    public final /* synthetic */ p8b F;
    public final /* synthetic */ long G;
    public final /* synthetic */ BufferedSource H;

    public qqe(p8b p8bVar, long j, BufferedSource bufferedSource) {
        this.F = p8bVar;
        this.G = j;
        this.H = bufferedSource;
    }

    @Override // defpackage.rqe
    public final BufferedSource G0() {
        return this.H;
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
