package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class fmj {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ BasePendingResult b;
    public final /* synthetic */ Object c;

    public fmj(cbf cbfVar, BasePendingResult basePendingResult) {
        this.c = cbfVar;
        this.b = basePendingResult;
    }

    public final void a(Status status) {
        kre kreVar;
        switch (this.a) {
            case 0:
                ((Map) ((cbf) this.c).F).remove(this.b);
                return;
            default:
                if (!status.l0()) {
                    ((j5h) this.c).a(zh4.r(status));
                    return;
                }
                BasePendingResult basePendingResult = this.b;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                dgj.x("Result has already been consumed.", !basePendingResult.g);
                try {
                    if (!basePendingResult.b.await(0L, timeUnit)) {
                        basePendingResult.c(Status.L);
                    }
                } catch (InterruptedException unused) {
                    basePendingResult.c(Status.J);
                }
                dgj.x("Result is not ready.", basePendingResult.d());
                synchronized (basePendingResult.a) {
                    dgj.x("Result has already been consumed.", !basePendingResult.g);
                    dgj.x("Result is not ready.", basePendingResult.d());
                    kreVar = basePendingResult.e;
                    basePendingResult.e = null;
                    basePendingResult.g = true;
                    break;
                }
                if (basePendingResult.d.getAndSet(null) != null) {
                    mr9.o();
                    return;
                } else {
                    dgj.v(kreVar);
                    ((j5h) this.c).b(null);
                    return;
                }
        }
    }

    public fmj(BasePendingResult basePendingResult, j5h j5hVar, zl4 zl4Var) {
        this.b = basePendingResult;
        this.c = j5hVar;
    }
}
