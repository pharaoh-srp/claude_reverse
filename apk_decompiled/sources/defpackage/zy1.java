package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public class zy1 implements gh2 {
    public static final /* synthetic */ AtomicLongFieldUpdater F = AtomicLongFieldUpdater.newUpdater(zy1.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater G = AtomicLongFieldUpdater.newUpdater(zy1.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater H = AtomicLongFieldUpdater.newUpdater(zy1.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater I = AtomicLongFieldUpdater.newUpdater(zy1.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater J = AtomicReferenceFieldUpdater.newUpdater(zy1.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater K;
    public static final /* synthetic */ AtomicReferenceFieldUpdater L;
    public static final /* synthetic */ AtomicReferenceFieldUpdater M;
    public static final /* synthetic */ AtomicReferenceFieldUpdater N;
    public static final /* synthetic */ long O;
    public static final /* synthetic */ long P;
    public static final /* synthetic */ long Q;
    public static final /* synthetic */ long R;
    public static final /* synthetic */ long S;
    public final int E;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
        Unsafe unsafe = yf4.a;
        S = unsafe.objectFieldOffset(zy1.class.getDeclaredField("sendSegment$volatile"));
        K = AtomicReferenceFieldUpdater.newUpdater(zy1.class, Object.class, "receiveSegment$volatile");
        R = unsafe.objectFieldOffset(zy1.class.getDeclaredField("receiveSegment$volatile"));
        L = AtomicReferenceFieldUpdater.newUpdater(zy1.class, Object.class, "bufferEndSegment$volatile");
        P = unsafe.objectFieldOffset(zy1.class.getDeclaredField("bufferEndSegment$volatile"));
        M = AtomicReferenceFieldUpdater.newUpdater(zy1.class, Object.class, "_closeCause$volatile");
        O = unsafe.objectFieldOffset(zy1.class.getDeclaredField("_closeCause$volatile"));
        N = AtomicReferenceFieldUpdater.newUpdater(zy1.class, Object.class, "closeHandler$volatile");
        Q = unsafe.objectFieldOffset(zy1.class.getDeclaredField("closeHandler$volatile"));
    }

    public zy1(int i) {
        this.E = i;
        if (i < 0) {
            mr9.q(grc.u("Invalid channel capacity: ", i, ", should be >=0"));
            throw null;
        }
        bi2 bi2Var = bz1.a;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = H.get(this);
        bi2 bi2Var2 = new bi2(0L, null, this, 3);
        this.sendSegment$volatile = bi2Var2;
        this.receiveSegment$volatile = bi2Var2;
        if (G()) {
            bi2Var2 = bz1.a;
            bi2Var2.getClass();
        }
        this.bufferEndSegment$volatile = bi2Var2;
        this._closeCause$volatile = bz1.s;
    }

    public static void A(zy1 zy1Var) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = I;
        if ((atomicLongFieldUpdater.addAndGet(zy1Var, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(zy1Var) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static Object J(zy1 zy1Var, tp4 tp4Var) throws Throwable {
        bi2 bi2Var;
        Throwable th;
        bi2 bi2Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = K;
        atomicReferenceFieldUpdater.getClass();
        if (zy1Var == null) {
            mr9.o();
            return null;
        }
        bi2 bi2Var3 = (bi2) yf4.a.getObjectVolatile(zy1Var, R);
        while (!zy1Var.a()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = G;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(zy1Var);
            long j = bz1.b;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (bi2Var3.I != j2) {
                bi2 bi2VarT = zy1Var.t(j2, bi2Var3);
                if (bi2VarT == null) {
                    continue;
                } else {
                    bi2Var = bi2VarT;
                }
            } else {
                bi2Var = bi2Var3;
            }
            zy1 zy1Var2 = zy1Var;
            Object objR = zy1Var2.R(bi2Var, i, andIncrement, null);
            sqb sqbVar = bz1.m;
            if (objR == sqbVar) {
                sz6.j("unexpected");
                return null;
            }
            sqb sqbVar2 = bz1.o;
            if (objR == sqbVar2) {
                if (andIncrement < zy1Var2.y()) {
                    bi2Var.a();
                }
                zy1Var = zy1Var2;
                bi2Var3 = bi2Var;
            } else {
                if (objR != bz1.n) {
                    bi2Var.a();
                    return objR;
                }
                ua2 ua2VarT = yb5.t(zni.I(tp4Var));
                try {
                    Object objR2 = zy1Var2.R(bi2Var, i, andIncrement, ua2VarT);
                    if (objR2 == sqbVar) {
                        ua2VarT.a(bi2Var, i);
                    } else {
                        if (objR2 == sqbVar2) {
                            if (andIncrement < zy1Var2.y()) {
                                bi2Var.a();
                            }
                            bi2 bi2Var4 = (bi2) atomicReferenceFieldUpdater.get(zy1Var2);
                            while (true) {
                                if (zy1Var2.a()) {
                                    ua2VarT.resumeWith(new hre(zy1Var2.w()));
                                    break;
                                }
                                ua2 ua2Var = ua2VarT;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(zy1Var2);
                                    long j3 = bz1.b;
                                    long j4 = andIncrement2 / j3;
                                    int i2 = (int) (andIncrement2 % j3);
                                    if (bi2Var4.I != j4) {
                                        try {
                                            bi2 bi2VarT2 = zy1Var2.t(j4, bi2Var4);
                                            if (bi2VarT2 == null) {
                                                ua2VarT = ua2Var;
                                            } else {
                                                bi2Var2 = bi2VarT2;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            ua2VarT = ua2Var;
                                            ua2VarT.C();
                                            throw th;
                                        }
                                    } else {
                                        bi2Var2 = bi2Var4;
                                    }
                                    zy1 zy1Var3 = zy1Var2;
                                    objR2 = zy1Var3.R(bi2Var2, i2, andIncrement2, ua2Var);
                                    zy1Var2 = zy1Var3;
                                    bi2 bi2Var5 = bi2Var2;
                                    ua2VarT = ua2Var;
                                    if (objR2 == bz1.m) {
                                        ua2VarT.a(bi2Var5, i2);
                                        break;
                                    }
                                    if (objR2 == bz1.o) {
                                        if (andIncrement2 < zy1Var2.y()) {
                                            bi2Var5.a();
                                        }
                                        bi2Var4 = bi2Var5;
                                    } else {
                                        if (objR2 == bz1.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        bi2Var5.a();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    ua2VarT = ua2Var;
                                    th = th;
                                    ua2VarT.C();
                                    throw th;
                                }
                            }
                        } else {
                            bi2Var.a();
                        }
                        ua2VarT.o(objR2, null);
                    }
                    return ua2VarT.r();
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable thW = zy1Var.w();
        int i3 = vjg.a;
        throw thW;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object K(defpackage.zy1 r13, defpackage.vp4 r14) {
        /*
            boolean r0 = r14 instanceof defpackage.xy1
            if (r0 == 0) goto L14
            r0 = r14
            xy1 r0 = (defpackage.xy1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.G = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            xy1 r0 = new xy1
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.E
            int r0 = r6.G
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L2c
            defpackage.sf5.h0(r14)
            ai2 r14 = (defpackage.ai2) r14
            java.lang.Object r13 = r14.a
            return r13
        L2c:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r13)
            return r1
        L32:
            defpackage.sf5.h0(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = defpackage.zy1.K
            r14.getClass()
            sun.misc.Unsafe r14 = defpackage.yf4.a
            long r3 = defpackage.zy1.R
            java.lang.Object r14 = r14.getObjectVolatile(r13, r3)
            bi2 r14 = (defpackage.bi2) r14
        L44:
            boolean r0 = r13.a()
            if (r0 == 0) goto L54
            java.lang.Throwable r13 = r13.v()
            yh2 r14 = new yh2
            r14.<init>(r13)
            return r14
        L54:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.zy1.G
            long r4 = r0.getAndIncrement(r13)
            int r0 = defpackage.bz1.b
            long r7 = (long) r0
            long r9 = r4 / r7
            long r7 = r4 % r7
            int r3 = (int) r7
            long r7 = r14.I
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 == 0) goto L71
            bi2 r0 = r13.t(r9, r14)
            if (r0 != 0) goto L6f
            goto L44
        L6f:
            r8 = r0
            goto L72
        L71:
            r8 = r14
        L72:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = r7.R(r8, r9, r10, r12)
            sqb r14 = defpackage.bz1.m
            if (r13 == r14) goto La6
            sqb r14 = defpackage.bz1.o
            if (r13 != r14) goto L90
            long r13 = r7.y()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L8d
            r8.a()
        L8d:
            r13 = r7
            r14 = r8
            goto L44
        L90:
            sqb r14 = defpackage.bz1.n
            if (r13 != r14) goto La2
            r6.G = r2
            r1 = r7
            r2 = r8
            java.lang.Object r13 = r1.L(r2, r3, r4, r6)
            m45 r14 = defpackage.m45.E
            if (r13 != r14) goto La1
            return r14
        La1:
            return r13
        La2:
            r8.a()
            return r13
        La6:
            java.lang.String r13 = "unexpected"
            defpackage.sz6.j(r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy1.K(zy1, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0158 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object O(defpackage.zy1 r26, java.lang.Object r27, defpackage.tp4 r28) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy1.O(zy1, java.lang.Object, tp4):java.lang.Object");
    }

    public static final void c(zy1 zy1Var, Object obj, ua2 ua2Var) {
        ua2Var.resumeWith(new hre(zy1Var.x()));
    }

    public static final int e(zy1 zy1Var, bi2 bi2Var, int i, Object obj, long j, Object obj2, boolean z) {
        bi2Var.s(i, obj);
        if (z) {
            return zy1Var.S(bi2Var, i, obj, j, obj2, z);
        }
        Object objQ = bi2Var.q(i);
        if (objQ == null) {
            if (zy1Var.f(j)) {
                if (bi2Var.p(null, i, bz1.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (bi2Var.p(null, i, obj2)) {
                    return 2;
                }
            }
        } else if (objQ instanceof x5j) {
            bi2Var.s(i, null);
            if (zy1Var.P(objQ, obj)) {
                bi2Var.t(i, bz1.i);
                return 0;
            }
            sqb sqbVar = bz1.k;
            if (bi2Var.L.getAndSet((i * 2) + 1, sqbVar) == sqbVar) {
                return 5;
            }
            bi2Var.r(i, true);
            return 5;
        }
        return zy1Var.S(bi2Var, i, obj, j, obj2, z);
    }

    public final void B() {
        Object objectVolatile;
        zy1 zy1Var;
        loop0: while (true) {
            N.getClass();
            Unsafe unsafe = yf4.a;
            long j = Q;
            objectVolatile = unsafe.getObjectVolatile(this, j);
            sqb sqbVar = objectVolatile == null ? bz1.q : bz1.r;
            while (true) {
                Unsafe unsafe2 = yf4.a;
                zy1Var = this;
                if (unsafe2.compareAndSwapObject(zy1Var, Q, objectVolatile, sqbVar)) {
                    break loop0;
                } else if (unsafe2.getObjectVolatile(zy1Var, j) != objectVolatile) {
                    break;
                } else {
                    this = zy1Var;
                }
            }
            this = zy1Var;
        }
        if (objectVolatile == null) {
            return;
        }
        nai.n(1, objectVolatile);
        ((bz7) objectVolatile).invoke(zy1Var.v());
    }

    public final void C(bz7 bz7Var) {
        Unsafe unsafe;
        while (true) {
            N.getClass();
            Unsafe unsafe2 = yf4.a;
            zy1 zy1Var = this;
            if (unsafe2.compareAndSwapObject(zy1Var, Q, (Object) null, bz7Var)) {
                return;
            }
            long j = Q;
            if (unsafe2.getObjectVolatile(zy1Var, j) != null) {
                while (true) {
                    Object objectVolatile = yf4.a.getObjectVolatile(zy1Var, j);
                    sqb sqbVar = bz1.q;
                    if (objectVolatile != sqbVar) {
                        if (objectVolatile == bz1.r) {
                            sz6.j("Another handler was already registered and successfully invoked");
                            return;
                        } else {
                            sz6.j(ij0.B("Another handler is already registered: ", objectVolatile));
                            return;
                        }
                    }
                    sqb sqbVar2 = bz1.r;
                    do {
                        zy1 zy1Var2 = zy1Var;
                        unsafe = yf4.a;
                        boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(zy1Var2, Q, sqbVar, sqbVar2);
                        zy1Var = zy1Var2;
                        if (zCompareAndSwapObject) {
                            bz7Var.invoke(zy1Var.v());
                            return;
                        }
                    } while (unsafe.getObjectVolatile(zy1Var, j) == sqbVar);
                }
            } else {
                this = zy1Var;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a3, code lost:
    
        r10 = (defpackage.bi2) r10.f();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean D(long r10, boolean r12) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy1.D(long, boolean):boolean");
    }

    public final boolean E() {
        return D(F.get(this), false);
    }

    public boolean F() {
        return false;
    }

    public final boolean G() {
        long j = H.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(long r5, defpackage.bi2 r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.I
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            gf4 r0 = r7.d()
            bi2 r0 = (defpackage.bi2) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.g()
            if (r5 == 0) goto L22
            gf4 r5 = r7.d()
            bi2 r5 = (defpackage.bi2) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.zy1.L
            r5.getClass()
            sun.misc.Unsafe r6 = defpackage.yf4.a
            long r0 = defpackage.zy1.P
            java.lang.Object r6 = r6.getObjectVolatile(r4, r0)
            lff r6 = (defpackage.lff) r6
            long r0 = r6.I
            long r2 = r7.I
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L3a
            goto L50
        L3a:
            boolean r0 = r7.o()
            if (r0 != 0) goto L41
            goto L11
        L41:
            boolean r5 = defpackage.qy1.v(r5, r4, r6, r7)
            if (r5 == 0) goto L51
            boolean r4 = r6.k()
            if (r4 == 0) goto L50
            r6.i()
        L50:
            return
        L51:
            boolean r5 = r7.k()
            if (r5 == 0) goto L22
            r7.i()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy1.H(long, bi2):void");
    }

    public final Object I(tp4 tp4Var, Object obj) {
        ua2 ua2Var = new ua2(1, zni.I(tp4Var));
        ua2Var.t();
        ua2Var.resumeWith(new hre(x()));
        Object objR = ua2Var.r();
        return objR == m45.E ? objR : iei.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L(defpackage.bi2 r10, int r11, long r12, defpackage.vp4 r14) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy1.L(bi2, int, long, vp4):java.lang.Object");
    }

    public final void M(agf agfVar) {
        bi2 bi2Var;
        zy1 zy1Var;
        agf agfVar2;
        int i;
        K.getClass();
        bi2 bi2Var2 = (bi2) yf4.a.getObjectVolatile(this, R);
        while (!this.a()) {
            long andIncrement = G.getAndIncrement(this);
            long j = bz1.b;
            long j2 = andIncrement / j;
            int i2 = (int) (andIncrement % j);
            if (bi2Var2.I != j2) {
                bi2 bi2VarT = this.t(j2, bi2Var2);
                if (bi2VarT == null) {
                    continue;
                } else {
                    bi2Var = bi2VarT;
                    agfVar2 = agfVar;
                    i = i2;
                    zy1Var = this;
                }
            } else {
                bi2Var = bi2Var2;
                zy1Var = this;
                agfVar2 = agfVar;
                i = i2;
            }
            Object objR = zy1Var.R(bi2Var, i, andIncrement, agfVar2);
            bi2Var2 = bi2Var;
            if (objR == bz1.m) {
                x5j x5jVar = agfVar2 instanceof x5j ? (x5j) agfVar2 : null;
                if (x5jVar != null) {
                    x5jVar.a(bi2Var2, i);
                    return;
                }
                return;
            }
            if (objR != bz1.o) {
                if (objR == bz1.n) {
                    sz6.j("unexpected");
                    return;
                } else {
                    bi2Var2.a();
                    ((zff) agfVar2).I = objR;
                    return;
                }
            }
            if (andIncrement < zy1Var.y()) {
                bi2Var2.a();
            }
            this = zy1Var;
            agfVar = agfVar2;
        }
        ((zff) agfVar).I = bz1.l;
    }

    public final void N(x5j x5jVar, boolean z) {
        if (x5jVar instanceof ta2) {
            ((tp4) x5jVar).resumeWith(new hre(z ? w() : x()));
            return;
        }
        if (x5jVar instanceof c6e) {
            ((c6e) x5jVar).E.resumeWith(new ai2(new yh2(v())));
            return;
        }
        if (!(x5jVar instanceof sy1)) {
            if (x5jVar instanceof agf) {
                ((zff) ((agf) x5jVar)).k(this, bz1.l);
                return;
            } else {
                xh6.d("Unexpected waiter: ", x5jVar);
                return;
            }
        }
        sy1 sy1Var = (sy1) x5jVar;
        ua2 ua2Var = sy1Var.F;
        ua2Var.getClass();
        sy1Var.F = null;
        sy1Var.E = bz1.l;
        Throwable thV = sy1Var.G.v();
        if (thV == null) {
            ua2Var.resumeWith(Boolean.FALSE);
        } else {
            ua2Var.resumeWith(new hre(thV));
        }
    }

    public final boolean P(Object obj, Object obj2) {
        if (obj instanceof agf) {
            return ((zff) ((agf) obj)).k(this, obj2) == 0;
        }
        if (obj instanceof c6e) {
            return bz1.a(((c6e) obj).E, new ai2(obj2), null);
        }
        if (!(obj instanceof sy1)) {
            if (obj instanceof ta2) {
                return bz1.a((ta2) obj, obj2, null);
            }
            sz6.j(ij0.B("Unexpected receiver type: ", obj));
            return false;
        }
        sy1 sy1Var = (sy1) obj;
        ua2 ua2Var = sy1Var.F;
        ua2Var.getClass();
        sy1Var.F = null;
        sy1Var.E = obj2;
        Boolean bool = Boolean.TRUE;
        sy1Var.G.getClass();
        return bz1.a(ua2Var, bool, null);
    }

    public final boolean Q(Object obj, bi2 bi2Var, int i) {
        o8i o8iVar;
        boolean z = obj instanceof ta2;
        iei ieiVar = iei.a;
        if (z) {
            return bz1.a((ta2) obj, ieiVar, null);
        }
        if (!(obj instanceof agf)) {
            sz6.j(ij0.B("Unexpected waiter: ", obj));
            return false;
        }
        int iK = ((zff) obj).k(this, ieiVar);
        o8i o8iVar2 = o8i.E;
        o8i o8iVar3 = o8i.F;
        if (iK == 0) {
            o8iVar = o8iVar2;
        } else if (iK == 1) {
            o8iVar = o8iVar3;
        } else if (iK == 2) {
            o8iVar = o8i.G;
        } else {
            if (iK != 3) {
                mr9.p(iK, "Unexpected internal result: ");
                return false;
            }
            o8iVar = o8i.H;
        }
        if (o8iVar == o8iVar3) {
            bi2Var.s(i, null);
        }
        return o8iVar == o8iVar2;
    }

    public final Object R(bi2 bi2Var, int i, long j, Object obj) {
        Object objQ = bi2Var.q(i);
        AtomicReferenceArray atomicReferenceArray = bi2Var.L;
        AtomicLongFieldUpdater atomicLongFieldUpdater = F;
        if (objQ == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return bz1.n;
                }
                if (bi2Var.p(objQ, i, obj)) {
                    o();
                    return bz1.m;
                }
            }
        } else if (objQ == bz1.d && bi2Var.p(objQ, i, bz1.i)) {
            o();
            Object obj2 = atomicReferenceArray.get(i * 2);
            bi2Var.s(i, null);
            return obj2;
        }
        while (true) {
            Object objQ2 = bi2Var.q(i);
            if (objQ2 == null || objQ2 == bz1.e) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (bi2Var.p(objQ2, i, bz1.h)) {
                        o();
                        return bz1.o;
                    }
                } else {
                    if (obj == null) {
                        return bz1.n;
                    }
                    if (bi2Var.p(objQ2, i, obj)) {
                        o();
                        return bz1.m;
                    }
                }
            } else {
                if (objQ2 != bz1.d) {
                    sqb sqbVar = bz1.j;
                    if (objQ2 != sqbVar && objQ2 != bz1.h) {
                        if (objQ2 == bz1.l) {
                            o();
                            return bz1.o;
                        }
                        if (objQ2 != bz1.g && bi2Var.p(objQ2, i, bz1.f)) {
                            boolean z = objQ2 instanceof y5j;
                            if (z) {
                                objQ2 = ((y5j) objQ2).a;
                            }
                            if (Q(objQ2, bi2Var, i)) {
                                bi2Var.t(i, bz1.i);
                                o();
                                Object obj3 = atomicReferenceArray.get(i * 2);
                                bi2Var.s(i, null);
                                return obj3;
                            }
                            bi2Var.t(i, sqbVar);
                            bi2Var.n();
                            if (z) {
                                o();
                            }
                            return bz1.o;
                        }
                    }
                    return bz1.o;
                }
                if (bi2Var.p(objQ2, i, bz1.i)) {
                    o();
                    Object obj4 = atomicReferenceArray.get(i * 2);
                    bi2Var.s(i, null);
                    return obj4;
                }
            }
        }
    }

    public final int S(bi2 bi2Var, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object objQ = bi2Var.q(i);
            if (objQ == null) {
                if (!f(j) || z) {
                    if (z) {
                        if (bi2Var.p(null, i, bz1.j)) {
                            bi2Var.n();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (bi2Var.p(null, i, obj2)) {
                            return 2;
                        }
                    }
                } else if (bi2Var.p(null, i, bz1.d)) {
                    break;
                }
            } else {
                if (objQ != bz1.e) {
                    sqb sqbVar = bz1.k;
                    if (objQ == sqbVar) {
                        bi2Var.s(i, null);
                        return 5;
                    }
                    if (objQ == bz1.h) {
                        bi2Var.s(i, null);
                        return 5;
                    }
                    if (objQ == bz1.l) {
                        bi2Var.s(i, null);
                        E();
                        return 4;
                    }
                    bi2Var.s(i, null);
                    if (objQ instanceof y5j) {
                        objQ = ((y5j) objQ).a;
                    }
                    if (P(objQ, obj)) {
                        bi2Var.t(i, bz1.i);
                        return 0;
                    }
                    if (bi2Var.L.getAndSet((i * 2) + 1, sqbVar) != sqbVar) {
                        bi2Var.r(i, true);
                    }
                    return 5;
                }
                if (bi2Var.p(objQ, i, bz1.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void T(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        zy1 zy1Var = this;
        if (zy1Var.G()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = H;
            if (atomicLongFieldUpdater.get(zy1Var) > j) {
                break;
            } else {
                zy1Var = this;
            }
        }
        int i = bz1.c;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = I;
            if (i2 < i) {
                long j2 = atomicLongFieldUpdater.get(zy1Var);
                if (j2 == (4611686018427387903L & atomicLongFieldUpdater2.get(zy1Var)) && j2 == atomicLongFieldUpdater.get(zy1Var)) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    long j3 = atomicLongFieldUpdater2.get(zy1Var);
                    if (atomicLongFieldUpdater2.compareAndSet(zy1Var, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        zy1Var = this;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(zy1Var);
                    long j5 = atomicLongFieldUpdater2.get(zy1Var);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(zy1Var)) {
                        break;
                    }
                    if (z) {
                        zy1Var = this;
                    } else {
                        zy1Var = this;
                        atomicLongFieldUpdater2.compareAndSet(zy1Var, j5, 4611686018427387904L + j6);
                    }
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(zy1Var);
                    if (atomicLongFieldUpdater2.compareAndSet(zy1Var, j7, j7 & 4611686018427387903L)) {
                        return;
                    } else {
                        zy1Var = this;
                    }
                }
            }
        }
    }

    @Override // defpackage.d6e
    public final boolean a() {
        return D(F.get(this), true);
    }

    @Override // defpackage.mkf
    public Object b(tp4 tp4Var, Object obj) {
        return O(this, obj, tp4Var);
    }

    @Override // defpackage.d6e
    public final void d(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        i(cancellationException, true);
    }

    public final boolean f(long j) {
        return j < H.get(this) || j < G.get(this) + ((long) this.E);
    }

    @Override // defpackage.d6e
    public final dpf g() {
        ty1 ty1Var = ty1.E;
        nai.n(3, ty1Var);
        uy1 uy1Var = uy1.E;
        nai.n(3, uy1Var);
        return new dpf(this, ty1Var, uy1Var, null, 19);
    }

    public final bi2 h() {
        L.getClass();
        Unsafe unsafe = yf4.a;
        Object objectVolatile = unsafe.getObjectVolatile(this, P);
        J.getClass();
        bi2 bi2Var = (bi2) unsafe.getObjectVolatile(this, S);
        if (bi2Var.I > ((bi2) objectVolatile).I) {
            objectVolatile = bi2Var;
        }
        K.getClass();
        bi2 bi2Var2 = (bi2) unsafe.getObjectVolatile(this, R);
        if (bi2Var2.I > ((bi2) objectVolatile).I) {
            objectVolatile = bi2Var2;
        }
        gf4 gf4Var = (gf4) objectVolatile;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = gf4.E;
            Object objE = gf4Var.e();
            if (objE == ff4.a) {
                break;
            }
            gf4 gf4Var2 = (gf4) objE;
            if (gf4Var2 != null) {
                gf4Var = gf4Var2;
            } else if (gf4Var.h()) {
                break;
            }
        }
        return (bi2) gf4Var;
    }

    public final boolean i(Throwable th, boolean z) {
        zy1 zy1Var;
        boolean z2;
        long j;
        long j2;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = F;
        if (z) {
            while (true) {
                long j4 = atomicLongFieldUpdater.get(this);
                if (((int) (j4 >> 60)) != 0) {
                    break;
                }
                bi2 bi2Var = bz1.a;
                zy1Var = this;
                if (atomicLongFieldUpdater.compareAndSet(zy1Var, j4, (j4 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                this = zy1Var;
            }
        } else {
            zy1Var = this;
        }
        sqb sqbVar = bz1.s;
        while (true) {
            M.getClass();
            zy1 zy1Var2 = zy1Var;
            Unsafe unsafe = yf4.a;
            long j5 = O;
            Throwable th2 = th;
            boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(zy1Var2, j5, sqbVar, th2);
            zy1Var = zy1Var2;
            if (zCompareAndSwapObject) {
                z2 = true;
                break;
            }
            if (unsafe.getObjectVolatile(zy1Var, j5) != sqbVar) {
                z2 = false;
                break;
            }
            th = th2;
        }
        if (z) {
            do {
                j3 = atomicLongFieldUpdater.get(zy1Var);
            } while (!atomicLongFieldUpdater.compareAndSet(zy1Var, j3, 3458764513820540928L + (j3 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(zy1Var);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = (j & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = (j & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(zy1Var, j, j2));
        }
        zy1Var.E();
        if (z2) {
            zy1Var.B();
        }
        return z2;
    }

    @Override // defpackage.d6e
    public final sy1 iterator() {
        return new sy1(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        r1 = (defpackage.bi2) r1.f();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.bi2 j(long r12) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy1.j(long):bi2");
    }

    @Override // defpackage.d6e
    public final dpf k() {
        vy1 vy1Var = vy1.E;
        nai.n(3, vy1Var);
        wy1 wy1Var = wy1.E;
        nai.n(3, wy1Var);
        return new dpf(this, vy1Var, wy1Var, null, 19);
    }

    @Override // defpackage.d6e
    public final Object l() {
        bi2 bi2Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = G;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = F.get(this);
        if (D(j2, true)) {
            return new yh2(v());
        }
        long j3 = j2 & 1152921504606846975L;
        zh2 zh2Var = ai2.b;
        if (j >= j3) {
            return zh2Var;
        }
        Object obj = bz1.k;
        K.getClass();
        bi2 bi2Var2 = (bi2) yf4.a.getObjectVolatile(this, R);
        while (!this.a()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = bz1.b;
            long j5 = andIncrement / j4;
            int i = (int) (andIncrement % j4);
            if (bi2Var2.I != j5) {
                bi2 bi2VarT = this.t(j5, bi2Var2);
                if (bi2VarT == null) {
                    continue;
                } else {
                    bi2Var = bi2VarT;
                }
            } else {
                bi2Var = bi2Var2;
            }
            zy1 zy1Var = this;
            Object objR = zy1Var.R(bi2Var, i, andIncrement, obj);
            bi2Var2 = bi2Var;
            if (objR == bz1.m) {
                x5j x5jVar = obj instanceof x5j ? (x5j) obj : null;
                if (x5jVar != null) {
                    x5jVar.a(bi2Var2, i);
                }
                zy1Var.T(andIncrement);
                bi2Var2.n();
                return zh2Var;
            }
            if (objR != bz1.o) {
                if (objR != bz1.n) {
                    bi2Var2.a();
                    return objR;
                }
                sz6.j("unexpected");
                return null;
            }
            if (andIncrement < zy1Var.y()) {
                bi2Var2.a();
            }
            this = zy1Var;
        }
        return new yh2(this.v());
    }

    @Override // defpackage.mkf
    public final boolean m(Throwable th) {
        return i(th, false);
    }

    public final void n(long j) {
        K.getClass();
        bi2 bi2Var = (bi2) yf4.a.getObjectVolatile(this, R);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = G;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(((long) this.E) + j2, H.get(this))) {
                return;
            }
            zy1 zy1Var = this;
            if (atomicLongFieldUpdater.compareAndSet(zy1Var, j2, 1 + j2)) {
                long j3 = bz1.b;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (bi2Var.I != j4) {
                    bi2 bi2VarT = zy1Var.t(j4, bi2Var);
                    if (bi2VarT != null) {
                        bi2Var = bi2VarT;
                    }
                }
                bi2 bi2Var2 = bi2Var;
                if (zy1Var.R(bi2Var2, i, j2, null) != bz1.o || j2 < zy1Var.y()) {
                    bi2Var2.a();
                }
                this = zy1Var;
                bi2Var = bi2Var2;
            }
            this = zy1Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f5, code lost:
    
        A(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f8, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o() {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy1.o():void");
    }

    @Override // defpackage.d6e
    public final Object p(xzg xzgVar) {
        return J(this, xzgVar);
    }

    public final bi2 q(long j, bi2 bi2Var, long j2) {
        Object objA;
        bi2 bi2Var2 = bz1.a;
        az1 az1Var = az1.E;
        loop0: while (true) {
            objA = ff4.a(bi2Var, j, az1Var);
            if (!nai.M(objA)) {
                lff lffVarH = nai.H(objA);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = L;
                    atomicReferenceFieldUpdater.getClass();
                    lff lffVar = (lff) yf4.a.getObjectVolatile(this, P);
                    if (lffVar.I >= lffVarH.I) {
                        break loop0;
                    }
                    if (!lffVarH.o()) {
                        break;
                    }
                    if (qy1.w(atomicReferenceFieldUpdater, this, lffVar, lffVarH)) {
                        if (lffVar.k()) {
                            lffVar.i();
                        }
                    } else if (lffVarH.k()) {
                        lffVarH.i();
                    }
                }
            } else {
                break;
            }
        }
        if (nai.M(objA)) {
            E();
            H(j, bi2Var);
            A(this);
            return null;
        }
        bi2 bi2Var3 = (bi2) nai.H(objA);
        long j3 = bi2Var3.I;
        if (j3 <= j) {
            return bi2Var3;
        }
        long j4 = j3 * ((long) bz1.b);
        if (!H.compareAndSet(this, j2 + 1, j4)) {
            A(this);
            return null;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = I;
        if ((atomicLongFieldUpdater.addAndGet(this, j4 - j2) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c3 A[SYNTHETIC] */
    @Override // defpackage.mkf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(java.lang.Object r16) {
        /*
            r15 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = defpackage.zy1.F
            long r1 = r8.get(r15)
            r9 = 0
            boolean r3 = r15.D(r1, r9)
            r10 = 1
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r3 == 0) goto L15
            r1 = r9
            goto L1b
        L15:
            long r1 = r1 & r11
            boolean r1 = r15.f(r1)
            r1 = r1 ^ r10
        L1b:
            zh2 r13 = defpackage.ai2.b
            if (r1 == 0) goto L20
            return r13
        L20:
            sqb r6 = defpackage.bz1.j
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.zy1.J
            r1.getClass()
            sun.misc.Unsafe r1 = defpackage.yf4.a
            long r2 = defpackage.zy1.S
            java.lang.Object r1 = r1.getObjectVolatile(r15, r2)
            bi2 r1 = (defpackage.bi2) r1
        L31:
            long r2 = r8.getAndIncrement(r15)
            long r4 = r2 & r11
            boolean r7 = r15.D(r2, r9)
            int r14 = defpackage.bz1.b
            long r2 = (long) r14
            long r11 = r4 / r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r9 = r1.I
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L64
            bi2 r3 = r15.u(r11, r1)
            if (r3 != 0) goto L63
            if (r7 == 0) goto L5b
            java.lang.Throwable r0 = r15.x()
            yh2 r1 = new yh2
            r1.<init>(r0)
            return r1
        L5b:
            r9 = 0
            r10 = 1
        L5d:
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            goto L31
        L63:
            r1 = r3
        L64:
            r0 = r15
            r3 = r16
            int r9 = e(r0, r1, r2, r3, r4, r6, r7)
            iei r3 = defpackage.iei.a
            if (r9 == 0) goto Lc3
            r10 = 1
            if (r9 == r10) goto Lc2
            r3 = 2
            r11 = 0
            if (r9 == r3) goto La2
            r2 = 3
            if (r9 == r2) goto L9c
            r2 = 4
            if (r9 == r2) goto L85
            r2 = 5
            if (r9 == r2) goto L80
            goto L83
        L80:
            r1.a()
        L83:
            r9 = 0
            goto L5d
        L85:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = defpackage.zy1.G
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L92
            r1.a()
        L92:
            java.lang.Throwable r0 = r15.x()
            yh2 r1 = new yh2
            r1.<init>(r0)
            return r1
        L9c:
            java.lang.String r0 = "unexpected"
            defpackage.sz6.j(r0)
            return r11
        La2:
            if (r7 == 0) goto Lb1
            r1.n()
            java.lang.Throwable r0 = r15.x()
            yh2 r1 = new yh2
            r1.<init>(r0)
            return r1
        Lb1:
            boolean r0 = r6 instanceof defpackage.x5j
            if (r0 == 0) goto Lb8
            r11 = r6
            x5j r11 = (defpackage.x5j) r11
        Lb8:
            if (r11 == 0) goto Lbe
            int r2 = r2 + r14
            r11.a(r1, r2)
        Lbe:
            r1.n()
            return r13
        Lc2:
            return r3
        Lc3:
            r1.a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy1.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.d6e
    public final Object s(xzg xzgVar) {
        return K(this, xzgVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d0, code lost:
    
        if (r8.k() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d2, code lost:
    
        r8.i();
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0107 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.bi2 t(long r16, defpackage.bi2 r18) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy1.t(long, bi2):bi2");
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x01cb, code lost:
    
        r15 = r8;
        r3 = (defpackage.bi2) r3.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d3, code lost:
    
        if (r3 != null) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy1.toString():java.lang.String");
    }

    public final bi2 u(long j, bi2 bi2Var) {
        Object objA;
        long j2;
        long j3;
        Unsafe unsafe;
        bi2 bi2Var2 = bz1.a;
        az1 az1Var = az1.E;
        loop0: while (true) {
            objA = ff4.a(bi2Var, j, az1Var);
            if (!nai.M(objA)) {
                lff lffVarH = nai.H(objA);
                while (true) {
                    J.getClass();
                    Unsafe unsafe2 = yf4.a;
                    long j4 = S;
                    lff lffVar = (lff) unsafe2.getObjectVolatile(this, j4);
                    if (lffVar.I >= lffVarH.I) {
                        break loop0;
                    }
                    if (!lffVarH.o()) {
                        break;
                    }
                    do {
                        unsafe = yf4.a;
                        if (unsafe.compareAndSwapObject(this, S, lffVar, lffVarH)) {
                            if (lffVar.k()) {
                                lffVar.i();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j4) == lffVar);
                    if (lffVarH.k()) {
                        lffVarH.i();
                    }
                }
            } else {
                break;
            }
        }
        boolean zM = nai.M(objA);
        AtomicLongFieldUpdater atomicLongFieldUpdater = G;
        if (zM) {
            E();
            if (bi2Var.I * ((long) bz1.b) < atomicLongFieldUpdater.get(this)) {
                bi2Var.a();
                return null;
            }
        } else {
            bi2 bi2Var3 = (bi2) nai.H(objA);
            long j5 = bi2Var3.I;
            if (j5 <= j) {
                return bi2Var3;
            }
            long j6 = j5 * ((long) bz1.b);
            do {
                j2 = F.get(this);
                j3 = 1152921504606846975L & j2;
                if (j3 >= j6) {
                    break;
                }
            } while (!F.compareAndSet(this, j2, j3 + (((long) ((int) (j2 >> 60))) << 60)));
            if (j5 * ((long) bz1.b) < atomicLongFieldUpdater.get(this)) {
                bi2Var3.a();
            }
        }
        return null;
    }

    public final Throwable v() {
        M.getClass();
        return (Throwable) yf4.a.getObjectVolatile(this, O);
    }

    public final Throwable w() {
        Throwable thV = v();
        return thV == null ? new ClosedReceiveChannelException() : thV;
    }

    public final Throwable x() {
        Throwable thV = v();
        return thV == null ? new ClosedSendChannelException("Channel was closed") : thV;
    }

    public final long y() {
        return F.get(this) & 1152921504606846975L;
    }

    public final boolean z() {
        while (true) {
            K.getClass();
            Unsafe unsafe = yf4.a;
            long j = R;
            bi2 bi2VarT = (bi2) unsafe.getObjectVolatile(this, j);
            AtomicLongFieldUpdater atomicLongFieldUpdater = G;
            long j2 = atomicLongFieldUpdater.get(this);
            if (y() <= j2) {
                return false;
            }
            long j3 = bz1.b;
            long j4 = j2 / j3;
            if (bi2VarT.I == j4 || (bi2VarT = t(j4, bi2VarT)) != null) {
                bi2VarT.a();
                int i = (int) (j2 % j3);
                while (true) {
                    Object objQ = bi2VarT.q(i);
                    if (objQ == null || objQ == bz1.e) {
                        if (bi2VarT.p(objQ, i, bz1.h)) {
                            o();
                            break;
                        }
                    } else {
                        if (objQ == bz1.d) {
                            return true;
                        }
                        if (objQ != bz1.j && objQ != bz1.l && objQ != bz1.i && objQ != bz1.h) {
                            if (objQ == bz1.g) {
                                return true;
                            }
                            if (objQ != bz1.f && j2 == atomicLongFieldUpdater.get(this)) {
                                return true;
                            }
                        }
                    }
                }
                G.compareAndSet(this, j2, j2 + 1);
            } else if (((bi2) unsafe.getObjectVolatile(this, j)).I < j4) {
                return false;
            }
        }
    }
}
