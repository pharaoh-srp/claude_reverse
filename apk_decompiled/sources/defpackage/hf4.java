package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class hf4 {
    public final g1h a;
    public boolean b;

    public hf4() {
        this(g1h.a);
    }

    public final synchronized void a() {
        boolean z = false;
        while (!this.b) {
            try {
                this.a.getClass();
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean b(long j) {
        if (j <= 0) {
            return this.b;
        }
        this.a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = j + jElapsedRealtime;
        if (j2 < jElapsedRealtime) {
            a();
        } else {
            boolean z = false;
            while (!this.b && jElapsedRealtime < j2) {
                try {
                    this.a.getClass();
                    wait(j2 - jElapsedRealtime);
                } catch (InterruptedException unused) {
                    z = true;
                }
                this.a.getClass();
                jElapsedRealtime = SystemClock.elapsedRealtime();
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        return this.b;
    }

    public final synchronized boolean c() {
        if (this.b) {
            return false;
        }
        this.b = true;
        notifyAll();
        return true;
    }

    public hf4(g1h g1hVar) {
        this.a = g1hVar;
    }
}
