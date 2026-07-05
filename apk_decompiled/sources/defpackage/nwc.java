package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class nwc implements rwc {
    public static final ArrayList q = new ArrayList(0);
    public static final AtomicIntegerFieldUpdater r = AtomicIntegerFieldUpdater.newUpdater(nwc.class, "g");
    public static final AtomicIntegerFieldUpdater s = AtomicIntegerFieldUpdater.newUpdater(nwc.class, "h");
    public static final AtomicIntegerFieldUpdater t = AtomicIntegerFieldUpdater.newUpdater(nwc.class, "i");
    public static final AtomicIntegerFieldUpdater u = AtomicIntegerFieldUpdater.newUpdater(nwc.class, "j");
    public static final AtomicLongFieldUpdater v = AtomicLongFieldUpdater.newUpdater(nwc.class, "k");
    public static final AtomicLongFieldUpdater w = AtomicLongFieldUpdater.newUpdater(nwc.class, "l");
    public static final AtomicReferenceFieldUpdater x = AtomicReferenceFieldUpdater.newUpdater(nwc.class, cf5.class, "m");
    public static final /* synthetic */ long y = yf4.a.objectFieldOffset(nwc.class.getDeclaredField("m"));
    public final nyj a;
    public final o35 b;
    public final swc c;
    public final boolean d;
    public final l35 e;
    public volatile long p;
    public volatile int g = 0;
    public volatile int h = 0;
    public volatile int i = 0;
    public volatile int j = 0;
    public volatile long k = 0;
    public volatile long l = 0;
    public volatile cf5 m = null;
    public volatile boolean n = false;
    public volatile long o = 0;
    public final ConcurrentLinkedDeque f = new ConcurrentLinkedDeque();

    static {
        AtomicLongFieldUpdater.newUpdater(nwc.class, "p");
    }

    public nwc(o35 o35Var, ef5 ef5Var, swc swcVar, ql8 ql8Var, boolean z) {
        this.b = o35Var;
        this.c = swcVar;
        this.e = (l35) o35Var.S.G;
        this.d = z;
        this.a = new nyj(nwc.class.getSimpleName(), o35Var.i0);
    }

    @Override // defpackage.rwc
    public final void a() {
        k(false);
    }

    @Override // defpackage.rwc
    public final cf5 b() {
        return this.m;
    }

    @Override // defpackage.rwc
    public final boolean c() {
        return 500000000 < System.nanoTime() - this.o;
    }

    @Override // defpackage.rwc
    public final long d() {
        long jMin = Long.MAX_VALUE;
        for (cf5 cf5Var : this.f) {
            if (cf5Var.f != 0) {
                jMin = Math.min(jMin, cf5Var.e + cf5Var.f);
            }
        }
        return jMin;
    }

    @Override // defpackage.rwc
    public final boolean e(boolean z) {
        int i = !z ? 1 : 0;
        return t.compareAndSet(this, i, 1 - i);
    }

    @Override // defpackage.rwc
    public final boolean f() {
        return !u.compareAndSet(this, 1, -1);
    }

    public final int g(ArrayList arrayList, boolean z) {
        long jH;
        ConcurrentLinkedDeque concurrentLinkedDeque = this.f;
        if (z) {
            jH = h();
            w.set(this, jH);
        } else {
            jH = 0;
        }
        boolean z2 = false;
        long j = 0;
        int i = 0;
        for (cf5 cf5Var = (cf5) concurrentLinkedDeque.pollFirst(); cf5Var != null; cf5Var = (cf5) concurrentLinkedDeque.pollFirst()) {
            if (z2 && cf5Var.c.H == j) {
                concurrentLinkedDeque.addFirst(cf5Var);
                return i;
            }
            if (cf5Var.f != 0) {
                arrayList.add(cf5Var);
                i++;
            } else {
                concurrentLinkedDeque.add(cf5Var);
                if (!z2) {
                    j = cf5Var.c.H;
                    z2 = true;
                }
                if (z) {
                    int i2 = (int) ((jH - cf5Var.e) / 1000000);
                    if (cf5Var.h >= 0) {
                        cf5Var.h = i2;
                    }
                    arrayList.add(cf5Var);
                }
            }
        }
        return i;
    }

    public final long h() {
        long jNanoTime = System.nanoTime();
        this.o = jNanoTime;
        o35 o35Var = this.b;
        long jMax = Math.max(0L, jNanoTime - o35Var.G) + o35Var.F;
        if (jNanoTime - o35Var.J >= o35Var.H) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long nanos = jMax - timeUnit.toNanos(jCurrentTimeMillis);
            if (Math.abs(o35Var.K + nanos) >= 1000000) {
                o35Var.K = -timeUnit.toNanos(nanos / 1000000);
            }
            o35Var.J = jNanoTime;
        }
        return jMax + o35Var.K;
    }

    public final void i(cf5 cf5Var) {
        nwc nwcVar;
        cf5 cf5Var2;
        while (true) {
            x.getClass();
            Unsafe unsafe = yf4.a;
            long j = y;
            nwcVar = this;
            cf5Var2 = cf5Var;
            if (unsafe.compareAndSwapObject(nwcVar, j, (Object) null, cf5Var2) || unsafe.getObjectVolatile(nwcVar, j) != null) {
                break;
            }
            this = nwcVar;
            cf5Var = cf5Var2;
        }
        s.incrementAndGet(nwcVar);
        swc swcVar = nwcVar.c;
        if (swcVar.d()) {
            nwcVar.f.addFirst(cf5Var2);
            if (u.compareAndSet(nwcVar, 0, 1)) {
                v.set(nwcVar, cf5Var2.e);
                swcVar.c(nwcVar);
            }
        }
    }

    public final void j() {
        if ((this.e.k instanceof cgd) && this.m != null && this.m.c.d().U == -128) {
            ((cgd) this.e.k).a(this.m);
        }
    }

    public final void k(boolean z) {
        ArrayList arrayList;
        int iG;
        if (this.f.isEmpty()) {
            return;
        }
        this.b.X.getClass();
        synchronized (this) {
            boolean z2 = true;
            if (!z) {
                try {
                    this.n = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i = this.g;
            if (3 != u.get(this)) {
                z2 = false;
            }
            if (z2) {
                i += this.h;
            }
            if (i <= 0 || (z && i < this.b.V)) {
                arrayList = q;
                iG = 0;
            } else {
                arrayList = new ArrayList(i);
                iG = g(arrayList, z2);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        r.addAndGet(this, -iG);
        o35 o35Var = this.b;
        if (arrayList.isEmpty()) {
            return;
        }
        o35Var.Q.getClass();
        nwc nwcVar = ((cf5) arrayList.get(0)).c.E;
        nwcVar.j();
        cf5 cf5Var = nwcVar.m;
        cf5 cf5Var2 = cf5Var == null ? (cf5) arrayList.get(0) : cf5Var;
        cf5Var2.getClass();
        boolean zB = nwcVar.e.k.b(cf5Var2);
        sij sijVar = o35Var.N;
        if (zB) {
            sijVar.J0(arrayList);
        } else {
            arrayList.size();
            sijVar.getClass();
        }
        if (cf5Var != null) {
            o35Var.l(cf5Var);
        }
    }
}
