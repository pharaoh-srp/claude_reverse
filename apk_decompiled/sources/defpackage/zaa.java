package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zaa {
    public final Context a;
    public final WorkerParameters b;
    public final AtomicInteger c = new AtomicInteger(-256);
    public boolean d;

    public zaa(Context context, WorkerParameters workerParameters) {
        this.a = context;
        this.b = workerParameters;
    }

    public abstract o92 a();

    public final boolean b() {
        return this.d;
    }

    public abstract o92 c();
}
