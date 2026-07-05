package defpackage;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rid implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ Context F;

    public /* synthetic */ rid(Context context, int i) {
        this.E = i;
        this.F = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        int i2 = 1;
        Context context = this.F;
        switch (i) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new rid(context, i2));
                break;
            default:
                pid.b(context, new ao0(1), pid.a, false);
                break;
        }
    }
}
