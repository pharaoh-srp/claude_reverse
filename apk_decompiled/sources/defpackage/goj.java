package defpackage;

import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class goj {
    public yba a;
    public boolean b = false;
    public boolean c = false;
    public boolean d = true;
    public boolean e = false;
    public Executor f;
    public volatile f11 g;
    public volatile f11 h;
    public final Semaphore i;
    public final Set j;

    public goj(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.i = new Semaphore(0);
        this.j = set;
    }

    public final void a() {
        if (this.g != null) {
            boolean z = this.b;
            if (!z) {
                if (z) {
                    c();
                } else {
                    this.e = true;
                }
            }
            f11 f11Var = this.h;
            f11 f11Var2 = this.g;
            if (f11Var != null) {
                f11Var2.getClass();
                this.g = null;
                return;
            }
            f11Var2.getClass();
            f11 f11Var3 = this.g;
            f11Var3.G.set(true);
            if (f11Var3.E.cancel(false)) {
                this.h = this.g;
            }
            this.g = null;
        }
    }

    public final void b() {
        if (this.h != null || this.g == null) {
            return;
        }
        this.g.getClass();
        if (this.f == null) {
            this.f = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        f11 f11Var = this.g;
        Executor executor = this.f;
        if (f11Var.F == 1) {
            f11Var.F = 2;
            executor.execute(f11Var.E);
            return;
        }
        int iF = sq6.F(f11Var.F);
        if (iF == 1) {
            sz6.j("Cannot execute task: the task is already running.");
        } else if (iF != 2) {
            sz6.j("We should never reach this state");
        } else {
            sz6.j("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
    }

    public final void c() {
        a();
        this.g = new f11(this);
        b();
    }

    public final void d() {
        Iterator it = this.j.iterator();
        if (it.hasNext()) {
            ((mmj) it.next()).getClass();
            mr9.x();
            return;
        }
        try {
            this.i.tryAcquire(0, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=0}");
        return sb.toString();
    }
}
