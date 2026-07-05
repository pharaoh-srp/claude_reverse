package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public abstract class qtj {
    public static volatile xnj d;
    public final jrk a;
    public final c5a b;
    public volatile long c;

    public qtj(jrk jrkVar) {
        dgj.v(jrkVar);
        this.a = jrkVar;
        this.b = new c5a(this, 4, jrkVar);
    }

    public final void a() {
        this.c = 0L;
        d().removeCallbacks(this.b);
    }

    public final void b(long j) {
        a();
        if (j >= 0) {
            this.a.zzb().getClass();
            this.c = System.currentTimeMillis();
            if (d().postDelayed(this.b, j)) {
                return;
            }
            this.a.b0().J.c("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    public abstract void c();

    public final Handler d() {
        xnj xnjVar;
        if (d != null) {
            return d;
        }
        synchronized (qtj.class) {
            try {
                if (d == null) {
                    d = new xnj(this.a.zza().getMainLooper(), 2);
                }
                xnjVar = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return xnjVar;
    }
}
