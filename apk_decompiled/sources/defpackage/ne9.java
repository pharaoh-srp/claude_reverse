package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.util.HashSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ne9 implements AutoCloseable {
    public final Object E;
    public final poj F;
    public final re9 G;
    public cc9 H;

    public ne9(re9 re9Var) {
        Object obj = new Object();
        this.E = obj;
        this.F = Build.VERSION.SDK_INT >= 30 ? new poj(new aq3()) : new poj(new tqh(29));
        new HashSet();
        this.G = re9Var;
        synchronized (obj) {
            this.H = new zf("isolate not initialized", 8, (char) 0);
        }
    }

    public static ne9 c(re9 re9Var, cm4 cm4Var) {
        ne9 ne9Var = new ne9(re9Var);
        synchronized (ne9Var.E) {
            try {
                re9 re9Var2 = ne9Var.G;
                re9Var2.getClass();
                ne9Var.H = new ig0(ne9Var, ne9Var.G.d(cm4Var, re9Var2.M.contains("JS_FEATURE_ISOLATE_CLIENT") ? new me9(ne9Var) : null));
            } catch (Throwable th) {
                throw th;
            }
        }
        ((bq3) ne9Var.F.E).f();
        return ne9Var;
    }

    public static ne9 d(re9 re9Var, String str) {
        ne9 ne9Var = new ne9(re9Var);
        ep1 ep1Var = new ep1(2, str);
        synchronized (ne9Var.E) {
            ne9Var.H = new ax5(6, ep1Var);
        }
        ((bq3) ne9Var.F.E).f();
        return ne9Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.E) {
            this.H.close();
            this.H = new zf("isolate closed", 8, (char) 0);
        }
        re9 re9Var = this.G;
        synchronized (re9Var.E) {
            re9Var.J.remove(this);
        }
        ((bq3) this.F.E).close();
    }

    public final saa e(String str) {
        saa saaVarC;
        Objects.requireNonNull(str);
        synchronized (this.E) {
            saaVarC = this.H.c(str);
        }
        return saaVarC;
    }

    public final boolean f(ep1 ep1Var) {
        synchronized (this.E) {
            try {
                if (ep1Var.c == 3) {
                    Log.e("JavaScriptIsolate", "isolate exceeded its heap memory limit - killing sandbox");
                    re9 re9Var = this.G;
                    Context context = re9Var.I;
                    qe9 qe9Var = (qe9) re9Var.H.getAndSet(null);
                    if (qe9Var != null) {
                        context.unbindService(qe9Var);
                    }
                    x44.N(context).execute(new fc(26, re9Var));
                }
                cc9 cc9Var = this.H;
                if (!cc9Var.a()) {
                    return false;
                }
                this.H = new ax5(6, ep1Var);
                cc9Var.b(ep1Var);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void finalize() throws Throwable {
        try {
            ((bq3) this.F.E).c();
            close();
        } finally {
            super.finalize();
        }
    }

    public final ep1 i() {
        synchronized (this.E) {
            try {
                ep1 ep1Var = new ep1(2, "sandbox dead");
                if (f(ep1Var)) {
                    return ep1Var;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
