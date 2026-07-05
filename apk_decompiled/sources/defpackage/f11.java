package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class f11 implements Runnable {
    public static Handler J;
    public final /* synthetic */ goj I;
    public volatile int F = 1;
    public final AtomicBoolean G = new AtomicBoolean();
    public final AtomicBoolean H = new AtomicBoolean();
    public final una E = new una(this, new eqb(0, this));

    public f11(goj gojVar) {
        this.I = gojVar;
    }

    public final void a(Object obj) {
        Handler handler;
        synchronized (f11.class) {
            try {
                if (J == null) {
                    J = new Handler(Looper.getMainLooper());
                }
                handler = J;
            } catch (Throwable th) {
                throw th;
            }
        }
        handler.post(new t08(this, obj, false, 5));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.I.b();
    }
}
