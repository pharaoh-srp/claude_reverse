package defpackage;

import android.os.SystemClock;
import io.sentry.android.core.internal.util.d;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class sd6 {
    public long a;
    public int b;
    public Object c;
    public Object d;
    public final Object e;

    public sd6(long j, int i) {
        this.d = new AtomicInteger(0);
        this.e = new AtomicLong(0L);
        this.c = d.E;
        this.a = j;
        this.b = i <= 0 ? 1 : i;
    }

    public boolean a() {
        AtomicInteger atomicInteger = (AtomicInteger) this.d;
        ((d) this.c).getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        AtomicLong atomicLong = (AtomicLong) this.e;
        if (atomicLong.get() == 0 || atomicLong.get() + this.a <= jUptimeMillis) {
            atomicInteger.set(0);
            atomicLong.set(jUptimeMillis);
            return false;
        }
        if (atomicInteger.incrementAndGet() < this.b) {
            return false;
        }
        atomicInteger.set(0);
        return true;
    }

    public sd6() {
        this.a = 0L;
        this.b = 0;
        this.e = new ib2();
    }
}
