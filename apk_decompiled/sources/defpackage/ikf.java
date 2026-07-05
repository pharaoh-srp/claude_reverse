package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public class ikf {
    public static final /* synthetic */ AtomicReferenceFieldUpdater G = AtomicReferenceFieldUpdater.newUpdater(ikf.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater H;
    public static final /* synthetic */ AtomicReferenceFieldUpdater I;
    public static final /* synthetic */ AtomicLongFieldUpdater J;
    public static final /* synthetic */ AtomicIntegerFieldUpdater K;
    public static final /* synthetic */ long L;
    public static final /* synthetic */ long M;
    public final int E;
    public final cb0 F;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = yf4.a;
        L = unsafe.objectFieldOffset(ikf.class.getDeclaredField("head$volatile"));
        H = AtomicLongFieldUpdater.newUpdater(ikf.class, "deqIdx$volatile");
        I = AtomicReferenceFieldUpdater.newUpdater(ikf.class, Object.class, "tail$volatile");
        M = unsafe.objectFieldOffset(ikf.class.getDeclaredField("tail$volatile"));
        J = AtomicLongFieldUpdater.newUpdater(ikf.class, "enqIdx$volatile");
        K = AtomicIntegerFieldUpdater.newUpdater(ikf.class, "_availablePermits$volatile");
    }

    public ikf(int i) {
        this.E = i;
        if (i <= 0) {
            mr9.q(grc.p(i, "Semaphore should have at least 1 permit, but had "));
            throw null;
        }
        if (i < 0) {
            mr9.q(grc.p(i, "The number of acquired permits should be in 0.."));
            throw null;
        }
        lkf lkfVar = new lkf(0L, null, 2);
        this.head$volatile = lkfVar;
        this.tail$volatile = lkfVar;
        this._availablePermits$volatile = i;
        this.F = new cb0(3, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r5.o(r3, r4.F);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.vp4 r5) {
        /*
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.ikf.K
            int r1 = r0.getAndDecrement(r4)
            int r2 = r4.E
            if (r1 > r2) goto L0
            iei r3 = defpackage.iei.a
            if (r1 <= 0) goto Lf
            goto L3e
        Lf:
            tp4 r5 = defpackage.zni.I(r5)
            ua2 r5 = defpackage.yb5.t(r5)
            boolean r1 = r4.b(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L31
        L1d:
            int r1 = r0.getAndDecrement(r4)     // Catch: java.lang.Throwable -> L3f
            if (r1 > r2) goto L1d
            if (r1 <= 0) goto L2b
            cb0 r4 = r4.F     // Catch: java.lang.Throwable -> L3f
            r5.o(r3, r4)     // Catch: java.lang.Throwable -> L3f
            goto L31
        L2b:
            boolean r1 = r4.b(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L1d
        L31:
            java.lang.Object r4 = r5.r()
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L3a
            goto L3b
        L3a:
            r4 = r3
        L3b:
            if (r4 != r5) goto L3e
            return r4
        L3e:
            return r3
        L3f:
            r4 = move-exception
            r5.C()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ikf.a(vp4):java.lang.Object");
    }

    public final boolean b(x5j x5jVar) {
        Object objA;
        Unsafe unsafe;
        ikf ikfVar = this;
        I.getClass();
        Unsafe unsafe2 = yf4.a;
        long j = M;
        lkf lkfVar = (lkf) unsafe2.getObjectVolatile(ikfVar, j);
        long andIncrement = J.getAndIncrement(ikfVar);
        gkf gkfVar = gkf.E;
        long j2 = andIncrement / ((long) kkf.f);
        loop0: while (true) {
            objA = ff4.a(lkfVar, j2, gkfVar);
            if (nai.M(objA)) {
                break;
            }
            lff lffVarH = nai.H(objA);
            while (true) {
                lff lffVar = (lff) yf4.a.getObjectVolatile(ikfVar, j);
                if (lffVar.I >= lffVarH.I) {
                    ikfVar = this;
                    break loop0;
                }
                if (!lffVarH.o()) {
                    break;
                }
                do {
                    unsafe = yf4.a;
                    ikfVar = this;
                    if (unsafe.compareAndSwapObject(ikfVar, M, lffVar, lffVarH)) {
                        if (lffVar.k()) {
                            lffVar.i();
                        }
                    }
                } while (unsafe.getObjectVolatile(ikfVar, j) == lffVar);
                if (lffVarH.k()) {
                    lffVarH.i();
                }
            }
            ikfVar = this;
        }
        lkf lkfVar2 = (lkf) nai.H(objA);
        AtomicReferenceArray atomicReferenceArray = lkfVar2.K;
        int i = (int) (andIncrement % ((long) kkf.f));
        while (!atomicReferenceArray.compareAndSet(i, null, x5jVar)) {
            if (atomicReferenceArray.get(i) != null) {
                sqb sqbVar = kkf.b;
                sqb sqbVar2 = kkf.c;
                while (!atomicReferenceArray.compareAndSet(i, sqbVar, sqbVar2)) {
                    if (atomicReferenceArray.get(i) != sqbVar) {
                        return false;
                    }
                }
                ((ta2) x5jVar).o(iei.a, ikfVar.F);
                return true;
            }
        }
        x5jVar.a(lkfVar2, i);
        return true;
    }

    public final void e() {
        int i;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = K;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.E;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                mr9.p(i2, "The number of released permits cannot be greater than ");
                return;
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!f());
    }

    public final boolean f() {
        Object objA;
        Unsafe unsafe;
        G.getClass();
        Unsafe unsafe2 = yf4.a;
        long j = L;
        lkf lkfVar = (lkf) unsafe2.getObjectVolatile(this, j);
        long andIncrement = H.getAndIncrement(this);
        long j2 = andIncrement / ((long) kkf.f);
        hkf hkfVar = hkf.E;
        loop0: while (true) {
            objA = ff4.a(lkfVar, j2, hkfVar);
            if (nai.M(objA)) {
                break;
            }
            lff lffVarH = nai.H(objA);
            while (true) {
                lff lffVar = (lff) yf4.a.getObjectVolatile(this, j);
                if (lffVar.I >= lffVarH.I) {
                    break loop0;
                }
                if (!lffVarH.o()) {
                    break;
                }
                do {
                    unsafe = yf4.a;
                    if (unsafe.compareAndSwapObject(this, L, lffVar, lffVarH)) {
                        if (lffVar.k()) {
                            lffVar.i();
                        }
                    }
                } while (unsafe.getObjectVolatile(this, j) == lffVar);
                if (lffVarH.k()) {
                    lffVarH.i();
                }
            }
        }
        lkf lkfVar2 = (lkf) nai.H(objA);
        AtomicReferenceArray atomicReferenceArray = lkfVar2.K;
        lkfVar2.a();
        boolean z = false;
        if (lkfVar2.I <= j2) {
            int i = (int) (andIncrement % ((long) kkf.f));
            Object andSet = atomicReferenceArray.getAndSet(i, kkf.b);
            if (andSet == null) {
                int i2 = kkf.a;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (atomicReferenceArray.get(i) == kkf.c) {
                        return true;
                    }
                }
                sqb sqbVar = kkf.b;
                sqb sqbVar2 = kkf.d;
                while (true) {
                    if (atomicReferenceArray.compareAndSet(i, sqbVar, sqbVar2)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceArray.get(i) != sqbVar) {
                        break;
                    }
                }
                return !z;
            }
            if (andSet != kkf.e) {
                boolean z2 = andSet instanceof ta2;
                iei ieiVar = iei.a;
                if (!z2) {
                    if (andSet instanceof agf) {
                        return ((zff) ((agf) andSet)).k(this, ieiVar) == 0;
                    }
                    sz6.j(ij0.B("unexpected: ", andSet));
                    return false;
                }
                ta2 ta2Var = (ta2) andSet;
                sqb sqbVarH = ta2Var.h(ieiVar, this.F);
                if (sqbVarH != null) {
                    ta2Var.u(sqbVarH);
                    return true;
                }
            }
        }
        return false;
    }
}
