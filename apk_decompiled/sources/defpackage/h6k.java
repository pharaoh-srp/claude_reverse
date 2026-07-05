package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public abstract class h6k implements Runnable {
    public final long E;
    public final long F;
    public final boolean G;
    public final /* synthetic */ j6k H;

    public h6k(j6k j6kVar, boolean z) {
        this.H = j6kVar;
        j6kVar.b.getClass();
        this.E = System.currentTimeMillis();
        j6kVar.b.getClass();
        this.F = SystemClock.elapsedRealtime();
        this.G = z;
    }

    public abstract void a();

    public void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        j6k j6kVar = this.H;
        if (j6kVar.f) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e) {
            j6kVar.b(e, false, this.G);
            b();
        }
    }
}
