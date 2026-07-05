package androidx.work;

import android.content.Context;
import defpackage.g2h;
import defpackage.mdj;
import defpackage.mpk;
import defpackage.o92;
import defpackage.p3j;
import defpackage.u95;
import defpackage.xaa;
import defpackage.zaa;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/Worker;", "Lzaa;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public abstract class Worker extends zaa {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // defpackage.zaa
    public final o92 a() {
        ExecutorService executorService = this.b.d;
        executorService.getClass();
        return mpk.J(new u95(executorService, 20, new p3j(this)));
    }

    @Override // defpackage.zaa
    public final o92 c() {
        ExecutorService executorService = this.b.d;
        executorService.getClass();
        return mpk.J(new u95(executorService, 20, new g2h(11, this)));
    }

    public abstract xaa d();
}
