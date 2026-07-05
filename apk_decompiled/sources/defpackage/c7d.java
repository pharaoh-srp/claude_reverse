package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class c7d {
    public final b7d a;
    public final d87 b;
    public int c;
    public Object d;
    public final Looper e;
    public boolean f;

    public c7d(d87 d87Var, b7d b7dVar, mqh mqhVar, int i, Looper looper) {
        this.b = d87Var;
        this.a = b7dVar;
        this.e = looper;
    }

    public final synchronized void a(boolean z) {
        notifyAll();
    }

    public final void b() {
        fd9.M(!this.f);
        this.f = true;
        d87 d87Var = this.b;
        if (!d87Var.n0 && d87Var.N.getThread().isAlive()) {
            d87Var.L.b(14, this).b();
        } else {
            ysj.u("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }
}
