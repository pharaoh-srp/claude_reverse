package defpackage;

import java.util.concurrent.CompletableFuture;

/* JADX INFO: loaded from: classes3.dex */
public final class y84 extends CompletableFuture {
    public final fdc E;

    public y84(fdc fdcVar) {
        this.E = fdcVar;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (z) {
            this.E.cancel();
        }
        return super.cancel(z);
    }
}
