package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public class hfa {
    public static final /* synthetic */ AtomicReferenceFieldUpdater E = AtomicReferenceFieldUpdater.newUpdater(hfa.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater F;
    public static final /* synthetic */ AtomicReferenceFieldUpdater G;
    public static final /* synthetic */ long H;
    public static final /* synthetic */ long I;
    public static final /* synthetic */ long J;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = yf4.a;
        H = unsafe.objectFieldOffset(hfa.class.getDeclaredField("_next$volatile"));
        F = AtomicReferenceFieldUpdater.newUpdater(hfa.class, Object.class, "_prev$volatile");
        I = unsafe.objectFieldOffset(hfa.class.getDeclaredField("_prev$volatile"));
        G = AtomicReferenceFieldUpdater.newUpdater(hfa.class, Object.class, "_removedRef$volatile");
        J = unsafe.objectFieldOffset(hfa.class.getDeclaredField("_removedRef$volatile"));
    }

    public static hfa i(hfa hfaVar) {
        while (hfaVar.n()) {
            F.getClass();
            hfaVar = (hfa) yf4.a.getObjectVolatile(hfaVar, I);
        }
        return hfaVar;
    }

    public final boolean e(hfa hfaVar, int i) {
        hfa hfaVarM;
        do {
            hfaVarM = m();
            if (hfaVarM instanceof f8a) {
                return (((f8a) hfaVarM).K & i) == 0 && hfaVarM.e(hfaVar, i);
            }
        } while (!hfaVarM.f(hfaVar, this));
        return true;
    }

    public final boolean f(hfa hfaVar, hfa hfaVar2) {
        F.getClass();
        Unsafe unsafe = yf4.a;
        unsafe.putObjectVolatile(hfaVar, I, this);
        E.getClass();
        long j = H;
        unsafe.putObjectVolatile(hfaVar, j, hfaVar2);
        while (true) {
            Unsafe unsafe2 = yf4.a;
            hfa hfaVar3 = this;
            hfa hfaVar4 = hfaVar;
            hfa hfaVar5 = hfaVar2;
            if (unsafe2.compareAndSwapObject(hfaVar3, H, hfaVar5, hfaVar4)) {
                hfaVar4.j(hfaVar5);
                return true;
            }
            if (unsafe2.getObjectVolatile(hfaVar3, j) != hfaVar5) {
                return false;
            }
            this = hfaVar3;
            hfaVar2 = hfaVar5;
            hfaVar = hfaVar4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        r9 = r4;
        r10 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.t5c r10) {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.hfa.F
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.yf4.a
            long r1 = defpackage.hfa.I
            r0.putObjectVolatile(r10, r1, r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.hfa.E
            r1.getClass()
            long r1 = defpackage.hfa.H
            r0.putObjectVolatile(r10, r1, r9)
        L16:
            java.lang.Object r0 = r9.k()
            if (r0 == r9) goto L1d
            return
        L1d:
            sun.misc.Unsafe r3 = defpackage.yf4.a
            long r5 = defpackage.hfa.H
            r7 = r9
            r4 = r9
            r8 = r10
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L2e
            r8.j(r4)
            return
        L2e:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            if (r9 == r4) goto L37
            r9 = r4
            r10 = r8
            goto L16
        L37:
            r9 = r4
            r10 = r8
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hfa.g(t5c):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.hfa h() {
        /*
            r15 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.hfa.F
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.yf4.a
            long r1 = defpackage.hfa.I
            java.lang.Object r0 = r0.getObjectVolatile(r15, r1)
            r7 = r0
            hfa r7 = (defpackage.hfa) r7
            r0 = 0
            r9 = r0
            r8 = r7
        L13:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = defpackage.hfa.E
            r3.getClass()
            if (r8 == 0) goto L85
            sun.misc.Unsafe r3 = defpackage.yf4.a
            long r4 = defpackage.hfa.H
            java.lang.Object r6 = r3.getObjectVolatile(r8, r4)
            if (r6 != r15) goto L40
            if (r7 != r8) goto L27
            goto L34
        L27:
            sun.misc.Unsafe r3 = defpackage.yf4.a
            long r5 = defpackage.hfa.I
            r4 = r15
            boolean r15 = r3.compareAndSwapObject(r4, r5, r7, r8)
            r14 = r7
            r7 = r4
            if (r15 == 0) goto L35
        L34:
            return r8
        L35:
            java.lang.Object r15 = r3.getObjectVolatile(r7, r1)
            if (r15 == r14) goto L3d
        L3b:
            r15 = r7
            goto L0
        L3d:
            r15 = r7
            r7 = r14
            goto L27
        L40:
            r14 = r7
            r7 = r15
            boolean r15 = r7.n()
            if (r15 == 0) goto L49
            return r0
        L49:
            boolean r15 = r6 instanceof defpackage.mfe
            if (r15 == 0) goto L7c
            if (r9 == 0) goto L6c
            mfe r6 = (defpackage.mfe) r6
            hfa r13 = r6.a
        L53:
            r12 = r8
            sun.misc.Unsafe r8 = defpackage.yf4.a
            long r10 = defpackage.hfa.H
            boolean r15 = r8.compareAndSwapObject(r9, r10, r12, r13)
            r3 = r8
            r8 = r12
            if (r15 == 0) goto L65
            r15 = r7
            r8 = r9
            r7 = r14
            r9 = r0
            goto L13
        L65:
            java.lang.Object r15 = r3.getObjectVolatile(r9, r4)
            if (r15 == r8) goto L53
            goto L3b
        L6c:
            if (r8 == 0) goto L78
            java.lang.Object r15 = r3.getObjectVolatile(r8, r1)
            r8 = r15
            hfa r8 = (defpackage.hfa) r8
        L75:
            r15 = r7
            r7 = r14
            goto L13
        L78:
            defpackage.mr9.o()
            return r0
        L7c:
            r6.getClass()
            r15 = r6
            hfa r15 = (defpackage.hfa) r15
            r9 = r8
            r8 = r15
            goto L75
        L85:
            defpackage.mr9.o()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hfa.h():hfa");
    }

    public final void j(hfa hfaVar) {
        hfa hfaVar2;
        while (true) {
            F.getClass();
            if (hfaVar == null) {
                mr9.o();
                return;
            }
            Unsafe unsafe = yf4.a;
            long j = I;
            hfa hfaVar3 = (hfa) unsafe.getObjectVolatile(hfaVar, j);
            if (this.k() != hfaVar) {
                return;
            }
            while (hfaVar != null) {
                Unsafe unsafe2 = yf4.a;
                hfaVar2 = this;
                hfa hfaVar4 = hfaVar;
                if (unsafe2.compareAndSwapObject(hfaVar4, I, hfaVar3, hfaVar2)) {
                    if (hfaVar2.n()) {
                        hfaVar4.h();
                        return;
                    }
                    return;
                } else {
                    if (hfaVar4 == null) {
                        mr9.o();
                        return;
                    }
                    hfaVar = hfaVar4;
                    if (unsafe2.getObjectVolatile(hfaVar4, j) != hfaVar3) {
                        break;
                    } else {
                        this = hfaVar2;
                    }
                }
            }
            mr9.o();
            return;
            this = hfaVar2;
        }
    }

    public final Object k() {
        E.getClass();
        return yf4.a.getObjectVolatile(this, H);
    }

    public final hfa l() {
        Object objK = k();
        mfe mfeVar = objK instanceof mfe ? (mfe) objK : null;
        if (mfeVar != null) {
            return mfeVar.a;
        }
        objK.getClass();
        return (hfa) objK;
    }

    public final hfa m() {
        hfa hfaVarH = h();
        if (hfaVarH != null) {
            return hfaVarH;
        }
        F.getClass();
        return i((hfa) yf4.a.getObjectVolatile(this, I));
    }

    public boolean n() {
        return k() instanceof mfe;
    }

    public final hfa o() {
        hfa hfaVar;
        while (true) {
            Object objK = this.k();
            if (objK instanceof mfe) {
                return ((mfe) objK).a;
            }
            if (objK == this) {
                return (hfa) objK;
            }
            objK.getClass();
            hfa hfaVar2 = (hfa) objK;
            mfe mfeVarP = hfaVar2.p();
            while (true) {
                E.getClass();
                Unsafe unsafe = yf4.a;
                long j = H;
                hfaVar = this;
                if (unsafe.compareAndSwapObject(hfaVar, j, objK, mfeVarP)) {
                    hfaVar2.h();
                    return null;
                }
                if (unsafe.getObjectVolatile(hfaVar, j) != objK) {
                    break;
                }
                this = hfaVar;
            }
            this = hfaVar;
        }
    }

    public final mfe p() {
        G.getClass();
        Unsafe unsafe = yf4.a;
        long j = J;
        mfe mfeVar = (mfe) unsafe.getObjectVolatile(this, j);
        if (mfeVar != null) {
            return mfeVar;
        }
        mfe mfeVar2 = new mfe(this);
        unsafe.putObjectVolatile(this, j, mfeVar2);
        return mfeVar2;
    }

    public String toString() {
        return new h24(this) + '@' + xn5.d0(this);
    }
}
