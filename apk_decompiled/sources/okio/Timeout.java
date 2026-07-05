package okio;

import defpackage.mdj;
import defpackage.mr9;
import defpackage.sz6;
import defpackage.vb7;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokio/Timeout;", "", "Companion", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public class Timeout {
    public static final Timeout$Companion$NONE$1 e = new Timeout$Companion$NONE$1();
    public boolean a;
    public long b;
    public long c;
    public volatile Object d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokio/Timeout$Companion;", "", "Lokio/Timeout;", "NONE", "Lokio/Timeout;", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
    public static final class Companion {
        public static long a(long j, long j2) {
            return (j != 0 && (j2 == 0 || j < j2)) ? j : j2;
        }
    }

    public void a(Condition condition) throws InterruptedIOException {
        condition.getClass();
        try {
            boolean a = getA();
            long c = getC();
            if (!a && c == 0) {
                condition.await();
                return;
            }
            if (a && c != 0) {
                c = Math.min(c, e() - System.nanoTime());
            } else if (a) {
                c = e() - System.nanoTime();
            }
            if (c <= 0) {
                throw new InterruptedIOException("timeout");
            }
            Object obj = this.d;
            if (condition.awaitNanos(c) <= 0 && this.d == obj) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public void b() {
        this.d = new Object();
    }

    public Timeout c() {
        this.a = false;
        return this;
    }

    public Timeout d() {
        this.c = 0L;
        return this;
    }

    public long e() {
        if (this.a) {
            return this.b;
        }
        sz6.j("No deadline");
        return 0L;
    }

    public Timeout f(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public boolean getA() {
        return this.a;
    }

    public void h() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public Timeout i(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j >= 0) {
            this.c = timeUnit.toNanos(j);
            return this;
        }
        mr9.q(vb7.m(j, "timeout < 0: "));
        return null;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public long getC() {
        return this.c;
    }
}
