package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e61 implements Executor {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ e61(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                ((Handler) obj).post(runnable);
                break;
            default:
                ((k1h) obj).d(runnable);
                break;
        }
    }
}
