package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class wuk implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ long F;
    public final /* synthetic */ jsk G;

    public /* synthetic */ wuk(jsk jskVar, long j, int i) {
        this.E = i;
        this.F = j;
        this.G = jskVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        long j = this.F;
        jsk jskVar = this.G;
        switch (i) {
            case 0:
                jskVar.I0().P.b(j);
                jskVar.b0().Q.c("Session timeout duration set", Long.valueOf(j));
                break;
            default:
                jskVar.T0(j, true);
                ((umk) jskVar.E).n().S0(new AtomicReference());
                break;
        }
    }
}
