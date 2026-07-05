package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class jxb extends ikf implements hxb {
    public static final /* synthetic */ AtomicReferenceFieldUpdater N = AtomicReferenceFieldUpdater.newUpdater(jxb.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long O = yf4.a.objectFieldOffset(jxb.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile;

    public jxb() {
        super(1);
        this.owner$volatile = kxb.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        r0.o(r1, r4.F);
     */
    @Override // defpackage.hxb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.tp4 r5) {
        /*
            r4 = this;
            boolean r0 = r4.h()
            iei r1 = defpackage.iei.a
            if (r0 == 0) goto L9
            goto L3b
        L9:
            tp4 r5 = defpackage.zni.I(r5)
            ua2 r5 = defpackage.yb5.t(r5)
            ixb r0 = new ixb     // Catch: java.lang.Throwable -> L3c
            r0.<init>(r4, r5)     // Catch: java.lang.Throwable -> L3c
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.ikf.K     // Catch: java.lang.Throwable -> L3c
            int r2 = r2.getAndDecrement(r4)     // Catch: java.lang.Throwable -> L3c
            int r3 = r4.E     // Catch: java.lang.Throwable -> L3c
            if (r2 > r3) goto L16
            if (r2 <= 0) goto L28
            cb0 r4 = r4.F     // Catch: java.lang.Throwable -> L3c
            r0.o(r1, r4)     // Catch: java.lang.Throwable -> L3c
            goto L2e
        L28:
            boolean r2 = r4.b(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L16
        L2e:
            java.lang.Object r4 = r5.r()
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L37
            goto L38
        L37:
            r4 = r1
        L38:
            if (r4 != r5) goto L3b
            return r4
        L3b:
            return r1
        L3c:
            r4 = move-exception
            r5.C()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jxb.c(tp4):java.lang.Object");
    }

    @Override // defpackage.hxb
    public final void d(Object obj) {
        while (this.g()) {
            N.getClass();
            Unsafe unsafe = yf4.a;
            long j = O;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            sqb sqbVar = kxb.a;
            if (objectVolatile != sqbVar) {
                if (objectVolatile != obj && obj != null) {
                    mr9.n("This mutex is locked by ", objectVolatile, ", but ", obj, " is expected");
                    return;
                }
                while (true) {
                    Unsafe unsafe2 = yf4.a;
                    jxb jxbVar = this;
                    if (unsafe2.compareAndSwapObject(jxbVar, O, objectVolatile, sqbVar)) {
                        jxbVar.e();
                        return;
                    } else {
                        if (unsafe2.getObjectVolatile(jxbVar, j) != objectVolatile) {
                            this = jxbVar;
                            break;
                        }
                        this = jxbVar;
                    }
                }
            }
        }
        sz6.j("This mutex is not locked");
    }

    public final boolean g() {
        return Math.max(ikf.K.get(this), 0) == 0;
    }

    public final boolean h() {
        int i = i();
        if (i == 0) {
            return true;
        }
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            sz6.j("unexpected");
            return false;
        }
        mr9.f("This mutex is already locked by the specified owner: null");
        return false;
    }

    public final int i() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ikf.K;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.E;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > i3) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else {
                if (i2 <= 0) {
                    return 1;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    N.getClass();
                    yf4.a.putObjectVolatile(this, O, (Object) null);
                    return 0;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(xn5.d0(this));
        sb.append("[isLocked=");
        sb.append(g());
        sb.append(",owner=");
        N.getClass();
        sb.append(yf4.a.getObjectVolatile(this, O));
        sb.append(']');
        return sb.toString();
    }
}
