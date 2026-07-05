package io.sentry.cache;

import io.sentry.t5;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ g F;
    public final /* synthetic */ Comparable G;

    public /* synthetic */ f(g gVar, Comparable comparable, int i) {
        this.E = i;
        this.F = gVar;
        this.G = comparable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        Comparable comparable = this.G;
        g gVar = this.F;
        switch (i) {
            case 0:
                String str = (String) comparable;
                if (str != null) {
                    gVar.d("transaction.json", str);
                } else {
                    gVar.a("transaction.json");
                }
                break;
            default:
                try {
                    ((io.sentry.cache.tape.g) gVar.b.a()).e((io.sentry.g) comparable);
                } catch (IOException e) {
                    gVar.a.getLogger().d(t5.ERROR, "Failed to add breadcrumb to file queue", e);
                }
                break;
        }
    }
}
