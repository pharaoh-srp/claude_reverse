package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class qq1 extends vxi {
    public Executor b;
    public x41 c;
    public xv8 d;
    public c61 e;
    public epk f;
    public ive g;
    public pq1 h;
    public String i;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public bvb p;
    public bvb q;
    public bvb r;
    public bvb s;
    public bvb t;
    public bvb v;
    public bvb x;
    public bvb y;
    public int j = 0;
    public boolean u = true;
    public int w = 0;

    public static void j(bvb bvbVar, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            bvbVar.i(obj);
        } else {
            bvbVar.g(obj);
        }
    }

    public final int e() {
        return this.d != null ? 15 : 0;
    }

    public final void f(xp1 xp1Var) {
        if (this.q == null) {
            this.q = new bvb();
        }
        j(this.q, xp1Var);
    }

    public final void g(CharSequence charSequence) {
        if (this.y == null) {
            this.y = new bvb();
        }
        j(this.y, charSequence);
    }

    public final void h(int i) {
        if (this.x == null) {
            this.x = new bvb();
        }
        j(this.x, Integer.valueOf(i));
    }

    public final void i(boolean z) {
        if (this.t == null) {
            this.t = new bvb();
        }
        j(this.t, Boolean.valueOf(z));
    }
}
