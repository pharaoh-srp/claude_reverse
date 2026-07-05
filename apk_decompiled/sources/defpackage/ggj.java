package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class ggj {
    public final knf a;
    public final e45 b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final j3f d = new j3f(1, this);

    public ggj(ExecutorService executorService) {
        knf knfVar = new knf(executorService, 0);
        this.a = knfVar;
        this.b = d4c.N(knfVar);
    }
}
