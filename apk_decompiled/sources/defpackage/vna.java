package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class vna {
    public static final Executor e;
    public final LinkedHashSet a = new LinkedHashSet(1);
    public final LinkedHashSet b = new LinkedHashSet(1);
    public final Handler c = new Handler(Looper.getMainLooper());
    public volatile tna d = null;

    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            e = new ao0(1);
        } else {
            e = Executors.newCachedThreadPool(new wna());
        }
    }

    public vna(Callable callable) {
        Executor executor = e;
        una unaVar = new una(callable);
        unaVar.F = this;
        executor.execute(unaVar);
    }

    public final synchronized void a(sna snaVar) {
        Throwable th;
        try {
            tna tnaVar = this.d;
            if (tnaVar != null && (th = tnaVar.b) != null) {
                snaVar.onResult(th);
            }
            this.b.add(snaVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(sna snaVar) {
        bna bnaVar;
        try {
            tna tnaVar = this.d;
            if (tnaVar != null && (bnaVar = tnaVar.a) != null) {
                snaVar.onResult(bnaVar);
            }
            this.a.add(snaVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c() {
        tna tnaVar = this.d;
        if (tnaVar == null) {
            return;
        }
        bna bnaVar = tnaVar.a;
        if (bnaVar != null) {
            synchronized (this) {
                Iterator it = new ArrayList(this.a).iterator();
                while (it.hasNext()) {
                    ((sna) it.next()).onResult(bnaVar);
                }
            }
            return;
        }
        Throwable th = tnaVar.b;
        synchronized (this) {
            ArrayList arrayList = new ArrayList(this.b);
            if (arrayList.isEmpty()) {
                oga.b("Lottie encountered an error but no failure listener was added:", th);
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((sna) it2.next()).onResult(th);
            }
        }
    }

    public final void d(tna tnaVar) {
        if (this.d != null) {
            sz6.j("A task may only be set once.");
            return;
        }
        this.d = tnaVar;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            c();
        } else {
            this.c.post(new fc(29, this));
        }
    }

    public vna(bna bnaVar) {
        d(new tna(bnaVar));
    }
}
