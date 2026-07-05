package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
public final class nmk extends FutureTask implements Comparable {
    public final long E;
    public final boolean F;
    public final String G;
    public final /* synthetic */ wlk H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nmk(wlk wlkVar, Callable callable, boolean z) {
        super(callable);
        this.H = wlkVar;
        long andIncrement = wlk.O.getAndIncrement();
        this.E = andIncrement;
        this.G = "Task exception on worker thread";
        this.F = z;
        if (andIncrement == Long.MAX_VALUE) {
            wlkVar.b0().J.b("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        nmk nmkVar = (nmk) obj;
        boolean z = nmkVar.F;
        boolean z2 = this.F;
        if (z2 != z) {
            return z2 ? -1 : 1;
        }
        long j = nmkVar.E;
        long j2 = this.E;
        if (j2 < j) {
            return -1;
        }
        if (j2 > j) {
            return 1;
        }
        this.H.b0().K.c("Two tasks share the same index. index", Long.valueOf(j2));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        this.H.b0().J.c(this.G, th);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nmk(wlk wlkVar, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.H = wlkVar;
        long andIncrement = wlk.O.getAndIncrement();
        this.E = andIncrement;
        this.G = str;
        this.F = z;
        if (andIncrement == Long.MAX_VALUE) {
            wlkVar.b0().J.b("Tasks index overflow");
        }
    }
}
