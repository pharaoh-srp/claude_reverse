package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class f3k implements AutoCloseable {
    public final int G;
    public final Context H;
    public final float I;
    public int J = 13;
    public final long E = System.currentTimeMillis();
    public final long F = SystemClock.uptimeMillis();

    public f3k(Context context, int i, float f) {
        this.G = i;
        this.H = context;
        this.I = f;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Context context = this.H;
        if (nyj.H == null) {
            synchronized (nyj.I) {
                try {
                    if (nyj.H == null) {
                        nyj.H = new nyj(context);
                    }
                } finally {
                }
            }
        }
        nyj nyjVar = nyj.H;
        int i = this.J;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jUptimeMillis = SystemClock.uptimeMillis() - this.F;
        if (ThreadLocalRandom.current().nextFloat() < this.I) {
            int i2 = (int) jUptimeMillis;
            long j = this.E;
            int i3 = this.G;
            synchronized (nyjVar) {
                AtomicLong atomicLong = (AtomicLong) nyjVar.G;
                if (atomicLong.get() != -1 && SystemClock.uptimeMillis() - atomicLong.get() <= 1800000) {
                    return;
                }
                ((snj) nyjVar.F).e(new ibh(0, Arrays.asList(new vjb(i3, i, -1, j, jCurrentTimeMillis, null, null, 368, i2)))).a(new hsi(2, nyjVar));
            }
        }
    }
}
