package defpackage;

import android.os.SystemClock;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class gkg implements b6b {
    public long E;
    public long F;
    public boolean G;
    public final Object H;
    public Object I;

    public gkg(long j, long j2, boolean z, File file, HashMap map) {
        this.E = j;
        this.H = file;
        this.F = j2;
        this.I = map;
        this.G = z;
    }

    @Override // defpackage.b6b
    public void a(l6d l6dVar) {
        if (this.G) {
            d(b());
        }
        this.I = l6dVar;
    }

    @Override // defpackage.b6b
    public long b() {
        long j = this.E;
        if (!this.G) {
            return j;
        }
        ((g1h) this.H).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.F;
        l6d l6dVar = (l6d) this.I;
        return (l6dVar.a == 1.0f ? tpi.C(jElapsedRealtime) : jElapsedRealtime * ((long) l6dVar.c)) + j;
    }

    public void d(long j) {
        this.E = j;
        if (this.G) {
            ((g1h) this.H).getClass();
            this.F = SystemClock.elapsedRealtime();
        }
    }

    @Override // defpackage.b6b
    public l6d e() {
        return (l6d) this.I;
    }

    public void f() {
        if (this.G) {
            return;
        }
        ((g1h) this.H).getClass();
        this.F = SystemClock.elapsedRealtime();
        this.G = true;
    }

    public gkg(g1h g1hVar) {
        this.H = g1hVar;
        this.I = l6d.d;
    }
}
