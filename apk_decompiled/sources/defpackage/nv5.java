package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class nv5 {
    public final AtomicInteger a;
    public final AtomicInteger b;
    public final AtomicInteger c;

    public nv5() {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        AtomicInteger atomicInteger2 = new AtomicInteger(0);
        AtomicInteger atomicInteger3 = new AtomicInteger(0);
        this.a = atomicInteger;
        this.b = atomicInteger2;
        this.c = atomicInteger3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv5)) {
            return false;
        }
        nv5 nv5Var = (nv5) obj;
        return x44.r(this.a, nv5Var.a) && x44.r(this.b, nv5Var.b) && x44.r(this.c, nv5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SlowFramesTelemetry(slowFramesCount=" + this.a + ", ignoredFramesCount=" + this.b + ", missedFrameCount=" + this.c + ")";
    }
}
