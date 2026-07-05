package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public class ua2 extends c86 implements ta2, n45, x5j {
    public static final /* synthetic */ AtomicIntegerFieldUpdater J = AtomicIntegerFieldUpdater.newUpdater(ua2.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater K = AtomicReferenceFieldUpdater.newUpdater(ua2.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater L;
    public static final /* synthetic */ long M;
    public static final /* synthetic */ long N;
    public final tp4 H;
    public final c45 I;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = yf4.a;
        N = unsafe.objectFieldOffset(ua2.class.getDeclaredField("_state$volatile"));
        L = AtomicReferenceFieldUpdater.newUpdater(ua2.class, Object.class, "_parentHandle$volatile");
        M = unsafe.objectFieldOffset(ua2.class.getDeclaredField("_parentHandle$volatile"));
    }

    public ua2(int i, tp4 tp4Var) {
        super(i);
        this.H = tp4Var;
        this.I = tp4Var.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = vb.E;
    }

    public static void A(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public static Object G(q6c q6cVar, Object obj, int i, rz7 rz7Var) {
        if (obj instanceof e94) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (rz7Var != null || (q6cVar instanceof pa2)) {
            return new c94(obj, q6cVar instanceof pa2 ? (pa2) q6cVar : null, rz7Var, (Throwable) null, 16);
        }
        return obj;
    }

    public String B() {
        return "CancellableContinuation";
    }

    public final void C() {
        Throwable thN;
        tp4 tp4Var = this.H;
        z76 z76Var = tp4Var instanceof z76 ? (z76) tp4Var : null;
        if (z76Var == null || (thN = z76Var.n(this)) == null) {
            return;
        }
        l();
        q(thN);
    }

    public final boolean D() {
        K.getClass();
        Unsafe unsafe = yf4.a;
        long j = N;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if ((objectVolatile instanceof c94) && ((c94) objectVolatile).d != null) {
            l();
            return false;
        }
        J.set(this, 536870911);
        unsafe.putObjectVolatile(this, j, vb.E);
        return true;
    }

    public final void E(int i, rz7 rz7Var, Object obj) {
        ua2 ua2Var;
        while (true) {
            K.getClass();
            Unsafe unsafe = yf4.a;
            long j = N;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof q6c)) {
                ua2 ua2Var2 = this;
                if (objectVolatile instanceof bb2) {
                    bb2 bb2Var = (bb2) objectVolatile;
                    if (bb2.c.compareAndSet(bb2Var, 0, 1)) {
                        if (rz7Var != null) {
                            ua2Var2.j(rz7Var, bb2Var.a, obj);
                            return;
                        }
                        return;
                    }
                }
                sz6.j(ij0.B("Already resumed, but proposed with update ", obj));
                return;
            }
            Object objG = G((q6c) objectVolatile, obj, i, rz7Var);
            while (true) {
                Unsafe unsafe2 = yf4.a;
                ua2Var = this;
                if (unsafe2.compareAndSwapObject(ua2Var, N, objectVolatile, objG)) {
                    if (!ua2Var.z()) {
                        ua2Var.l();
                    }
                    ua2Var.m(i);
                    return;
                } else if (unsafe2.getObjectVolatile(ua2Var, j) != objectVolatile) {
                    break;
                } else {
                    this = ua2Var;
                }
            }
            this = ua2Var;
        }
    }

    public final void F(e45 e45Var, Object obj) {
        tp4 tp4Var = this.H;
        z76 z76Var = tp4Var instanceof z76 ? (z76) tp4Var : null;
        E((z76Var != null ? z76Var.H : null) == e45Var ? 4 : this.G, null, obj);
    }

    public final sqb H(Object obj, rz7 rz7Var) {
        ua2 ua2Var;
        while (true) {
            K.getClass();
            Unsafe unsafe = yf4.a;
            long j = N;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof q6c)) {
                return null;
            }
            Object objG = G((q6c) objectVolatile, obj, this.G, rz7Var);
            while (true) {
                Unsafe unsafe2 = yf4.a;
                ua2Var = this;
                if (unsafe2.compareAndSwapObject(ua2Var, N, objectVolatile, objG)) {
                    boolean z = ua2Var.z();
                    sqb sqbVar = va2.a;
                    if (!z) {
                        ua2Var.l();
                    }
                    return sqbVar;
                }
                if (unsafe2.getObjectVolatile(ua2Var, j) != objectVolatile) {
                    break;
                }
                this = ua2Var;
            }
            this = ua2Var;
        }
    }

    @Override // defpackage.x5j
    public final void a(lff lffVar, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = J;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                sz6.j("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        x(lffVar);
    }

    @Override // defpackage.c86
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        ua2 ua2Var;
        while (true) {
            K.getClass();
            Unsafe unsafe = yf4.a;
            long j = N;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof q6c) {
                sz6.j("Not completed");
                return;
            }
            if (objectVolatile instanceof e94) {
                return;
            }
            if (objectVolatile instanceof c94) {
                c94 c94Var = (c94) objectVolatile;
                if (c94Var.e != null) {
                    sz6.j("Must be called at most once");
                    return;
                }
                c94 c94VarA = c94.a(c94Var, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = yf4.a;
                    ua2 ua2Var2 = this;
                    if (unsafe2.compareAndSwapObject(ua2Var2, N, objectVolatile, c94VarA)) {
                        pa2 pa2Var = c94Var.b;
                        if (pa2Var != null) {
                            ua2Var2.i(pa2Var, cancellationException);
                        }
                        rz7 rz7Var = c94Var.c;
                        if (rz7Var != null) {
                            ua2Var2.j(rz7Var, cancellationException, c94Var.a);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(ua2Var2, j) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        ua2Var = ua2Var2;
                        break;
                    }
                    this = ua2Var2;
                }
            } else {
                ua2 ua2Var3 = this;
                CancellationException cancellationException3 = cancellationException;
                c94 c94Var2 = new c94(objectVolatile, (pa2) null, (rz7) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    c94 c94Var3 = c94Var2;
                    Unsafe unsafe3 = yf4.a;
                    ua2Var = ua2Var3;
                    boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(ua2Var, N, objectVolatile, c94Var3);
                    c94Var2 = c94Var3;
                    if (zCompareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(ua2Var, j) != objectVolatile) {
                        break;
                    } else {
                        ua2Var3 = ua2Var;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = ua2Var;
        }
    }

    @Override // defpackage.c86
    public final tp4 c() {
        return this.H;
    }

    @Override // defpackage.c86
    public final Throwable d(Object obj) {
        Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    @Override // defpackage.c86
    public final Object e(Object obj) {
        return obj instanceof c94 ? ((c94) obj).a : obj;
    }

    @Override // defpackage.c86
    public final Object g() {
        return s();
    }

    @Override // defpackage.n45
    public final n45 getCallerFrame() {
        tp4 tp4Var = this.H;
        if (tp4Var instanceof n45) {
            return (n45) tp4Var;
        }
        return null;
    }

    @Override // defpackage.tp4
    public final c45 getContext() {
        return this.I;
    }

    @Override // defpackage.ta2
    public final sqb h(Object obj, rz7 rz7Var) {
        return H(obj, rz7Var);
    }

    public final void i(pa2 pa2Var, Throwable th) {
        try {
            pa2Var.b(th);
        } catch (Throwable th2) {
            dgj.G(this.I, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void j(rz7 rz7Var, Throwable th, Object obj) {
        c45 c45Var = this.I;
        try {
            rz7Var.invoke(th, obj, c45Var);
        } catch (Throwable th2) {
            dgj.G(c45Var, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void k(lff lffVar, Throwable th) {
        c45 c45Var = this.I;
        int i = J.get(this) & 536870911;
        if (i == 536870911) {
            sz6.j("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            lffVar.m(i, c45Var);
        } catch (Throwable th2) {
            dgj.G(c45Var, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void l() {
        y86 y86VarP = p();
        if (y86VarP == null) {
            return;
        }
        y86VarP.a();
        L.getClass();
        yf4.a.putObjectVolatile(this, M, d6c.E);
    }

    public final void m(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = J;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    sz6.j("Already resumed");
                    return;
                }
                boolean z = i == 4;
                tp4 tp4Var = this.H;
                if (!z && (tp4Var instanceof z76)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.G;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        z76 z76Var = (z76) tp4Var;
                        e45 e45Var = z76Var.H;
                        c45 context = z76Var.I.getContext();
                        if (a86.c(e45Var, context)) {
                            a86.b(e45Var, context, this);
                            return;
                        }
                        vz6 vz6VarA = vnh.a();
                        if (vz6VarA.G >= 4294967296L) {
                            vz6VarA.T0(this);
                            return;
                        }
                        vz6VarA.U0(true);
                        try {
                            dgj.O(this, tp4Var, true);
                            do {
                            } while (vz6VarA.W0());
                        } finally {
                            try {
                            } finally {
                            }
                        }
                        return;
                    }
                }
                dgj.O(this, tp4Var, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public Throwable n(vf9 vf9Var) {
        return vf9Var.H();
    }

    @Override // defpackage.ta2
    public final void o(Object obj, rz7 rz7Var) {
        E(this.G, rz7Var, obj);
    }

    public final y86 p() {
        L.getClass();
        return (y86) yf4.a.getObjectVolatile(this, M);
    }

    @Override // defpackage.ta2
    public final boolean q(Throwable th) {
        Throwable cancellationException;
        ua2 ua2Var;
        while (true) {
            K.getClass();
            Unsafe unsafe = yf4.a;
            long j = N;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof q6c)) {
                return false;
            }
            boolean z = (objectVolatile instanceof pa2) || (objectVolatile instanceof lff);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            bb2 bb2Var = new bb2(cancellationException, z);
            while (true) {
                Unsafe unsafe2 = yf4.a;
                ua2Var = this;
                if (unsafe2.compareAndSwapObject(ua2Var, N, objectVolatile, bb2Var)) {
                    q6c q6cVar = (q6c) objectVolatile;
                    if (q6cVar instanceof pa2) {
                        ua2Var.i((pa2) objectVolatile, th);
                    } else if (q6cVar instanceof lff) {
                        ua2Var.k((lff) objectVolatile, th);
                    }
                    if (!ua2Var.z()) {
                        ua2Var.l();
                    }
                    ua2Var.m(ua2Var.G);
                    return true;
                }
                if (unsafe2.getObjectVolatile(ua2Var, j) != objectVolatile) {
                    break;
                }
                this = ua2Var;
            }
            this = ua2Var;
        }
    }

    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        lf9 lf9Var;
        boolean z = z();
        do {
            atomicIntegerFieldUpdater = J;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    sz6.j("Already suspended");
                    return null;
                }
                if (z) {
                    C();
                }
                Object objS = s();
                if (objS instanceof e94) {
                    throw ((e94) objS).a;
                }
                int i3 = this.G;
                if ((i3 != 1 && i3 != 2) || (lf9Var = (lf9) this.I.x0(dd8.J)) == null || lf9Var.c()) {
                    return e(objS);
                }
                CancellationException cancellationExceptionH = lf9Var.H();
                b(cancellationExceptionH);
                throw cancellationExceptionH;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (p() == null) {
            v();
        }
        if (z) {
            C();
        }
        return m45.E;
    }

    @Override // defpackage.tp4
    public final void resumeWith(Object obj) {
        Throwable thA = jre.a(obj);
        if (thA != null) {
            obj = new e94(thA, false);
        }
        E(this.G, null, obj);
    }

    public final Object s() {
        K.getClass();
        return yf4.a.getObjectVolatile(this, N);
    }

    public final void t() {
        y86 y86VarV = v();
        if (y86VarV != null && y()) {
            y86VarV.a();
            L.getClass();
            yf4.a.putObjectVolatile(this, M, d6c.E);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(B());
        sb.append('(');
        sb.append(xn5.v0(this.H));
        sb.append("){");
        Object objS = s();
        sb.append(objS instanceof q6c ? "Active" : objS instanceof bb2 ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(xn5.d0(this));
        return sb.toString();
    }

    @Override // defpackage.ta2
    public final void u(Object obj) {
        m(this.G);
    }

    public final y86 v() {
        lf9 lf9Var = (lf9) this.I.x0(dd8.J);
        if (lf9Var == null) {
            return null;
        }
        y86 y86VarA = knk.A(lf9Var, new le3(this));
        while (true) {
            L.getClass();
            Unsafe unsafe = yf4.a;
            long j = M;
            ua2 ua2Var = this;
            if (unsafe.compareAndSwapObject(ua2Var, j, (Object) null, y86VarA) || unsafe.getObjectVolatile(ua2Var, j) != null) {
                break;
            }
            this = ua2Var;
        }
        return y86VarA;
    }

    public final void w(bz7 bz7Var) {
        x(new oa2(0, bz7Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ce, code lost:
    
        A(r11, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d1, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(defpackage.q6c r11) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ua2.x(q6c):void");
    }

    public final boolean y() {
        return !(s() instanceof q6c);
    }

    public final boolean z() {
        return this.G == 2 && ((z76) this.H).l();
    }
}
