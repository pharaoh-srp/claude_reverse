package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class ngj {
    public final AtomicReferenceArray a = new AtomicReferenceArray(FreeTypeConstants.FT_LOAD_PEDANTIC);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(ngj.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ long f = yf4.a.objectFieldOffset(ngj.class.getDeclaredField("lastScheduledTask$volatile"));
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(ngj.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(ngj.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(ngj.class, "blockingTasksInBuffer$volatile");

    public final b5h a(b5h b5hVar, boolean z) {
        if (z) {
            return b(b5hVar);
        }
        b.getClass();
        b5h b5hVar2 = (b5h) yf4.a.getAndSetObject(this, f, b5hVar);
        if (b5hVar2 == null) {
            return null;
        }
        return b(b5hVar2);
    }

    public final b5h b(b5h b5hVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return b5hVar;
        }
        if (b5hVar.F) {
            e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, b5hVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final int c() {
        b.getClass();
        Object objectVolatile = yf4.a.getObjectVolatile(this, f);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c;
        return objectVolatile != null ? (atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this)) + 1 : atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this);
    }

    public final void d(s78 s78Var) {
        b.getClass();
        b5h b5hVar = (b5h) yf4.a.getAndSetObject(this, f, (Object) null);
        if (b5hVar != null) {
            s78Var.a(b5hVar);
        }
        while (true) {
            b5h b5hVarF = f();
            if (b5hVarF == null) {
                return;
            } else {
                s78Var.a(b5hVarF);
            }
        }
    }

    public final b5h e() {
        b.getClass();
        b5h b5hVar = (b5h) yf4.a.getAndSetObject(this, f, (Object) null);
        return b5hVar == null ? f() : b5hVar;
    }

    public final b5h f() {
        b5h b5hVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (b5hVar = (b5h) this.a.getAndSet(i2, null)) != null) {
                if (b5hVar.F) {
                    e.decrementAndGet(this);
                }
                return b5hVar;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        r9 = defpackage.ngj.d.get(r4);
        r1 = defpackage.ngj.c.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r9 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (defpackage.ngj.e.get(r4) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        r1 = r1 - 1;
        r2 = r4.h(r1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if (r2 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        r4 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.b5h g() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.ngj.b
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.yf4.a
            long r1 = defpackage.ngj.f
            java.lang.Object r0 = r0.getObjectVolatile(r9, r1)
            r7 = r0
            b5h r7 = (defpackage.b5h) r7
            r0 = 1
            if (r7 != 0) goto L15
        L13:
            r4 = r9
            goto L30
        L15:
            boolean r3 = r7.F
            if (r3 != r0) goto L13
        L19:
            sun.misc.Unsafe r3 = defpackage.yf4.a
            long r5 = defpackage.ngj.f
            r8 = 0
            r4 = r9
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L26
            return r7
        L26:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            if (r9 == r7) goto L2e
            r9 = r4
            goto L0
        L2e:
            r9 = r4
            goto L19
        L30:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r9 = defpackage.ngj.d
            int r9 = r9.get(r4)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.ngj.c
            int r1 = r1.get(r4)
        L3c:
            if (r9 == r1) goto L50
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.ngj.e
            int r2 = r2.get(r4)
            if (r2 != 0) goto L47
            goto L50
        L47:
            int r1 = r1 + (-1)
            b5h r2 = r4.h(r1, r0)
            if (r2 == 0) goto L3c
            return r2
        L50:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ngj.g():b5h");
    }

    public final b5h h(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        b5h b5hVar = (b5h) atomicReferenceArray.get(i2);
        if (b5hVar != null && b5hVar.F == z) {
            while (!atomicReferenceArray.compareAndSet(i2, b5hVar, null)) {
                if (atomicReferenceArray.get(i2) != b5hVar) {
                }
            }
            if (z) {
                e.decrementAndGet(this);
            }
            return b5hVar;
        }
        return null;
    }

    public final long i(int i, dae daeVar) {
        ngj ngjVar;
        while (true) {
            b.getClass();
            Unsafe unsafe = yf4.a;
            long j = f;
            b5h b5hVar = (b5h) unsafe.getObjectVolatile(this, j);
            if (b5hVar == null) {
                return -2L;
            }
            if (((b5hVar.F ? 1 : 2) & i) == 0) {
                return -2L;
            }
            x9h.f.getClass();
            long jNanoTime = System.nanoTime() - b5hVar.E;
            long j2 = x9h.b;
            if (jNanoTime < j2) {
                return j2 - jNanoTime;
            }
            while (true) {
                Unsafe unsafe2 = yf4.a;
                ngjVar = this;
                if (unsafe2.compareAndSwapObject(ngjVar, f, b5hVar, (Object) null)) {
                    daeVar.E = b5hVar;
                    return -1L;
                }
                if (unsafe2.getObjectVolatile(ngjVar, j) != b5hVar) {
                    break;
                }
                this = ngjVar;
            }
            this = ngjVar;
        }
    }
}
