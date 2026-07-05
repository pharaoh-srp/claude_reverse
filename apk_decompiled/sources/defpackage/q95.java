package defpackage;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public interface q95 {
    boolean isAvailableOnDevice();

    void onClearCredential(zn3 zn3Var, CancellationSignal cancellationSignal, Executor executor, m95 m95Var);

    void onGetCredential(Context context, r38 r38Var, CancellationSignal cancellationSignal, Executor executor, m95 m95Var);
}
