package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class zff implements pa2, agf, x5j {
    public static final /* synthetic */ AtomicReferenceFieldUpdater J = AtomicReferenceFieldUpdater.newUpdater(zff.class, Object.class, "state$volatile");
    public static final /* synthetic */ long K = yf4.a.objectFieldOffset(zff.class.getDeclaredField("state$volatile"));
    public final c45 E;
    public Object G;
    private volatile /* synthetic */ Object state$volatile = cgf.a;
    public ArrayList F = new ArrayList(2);
    public int H = -1;
    public Object I = cgf.d;

    public zff(c45 c45Var) {
        this.E = c45Var;
    }

    @Override // defpackage.x5j
    public final void a(lff lffVar, int i) {
        this.G = lffVar;
        this.H = i;
    }

    @Override // defpackage.pa2
    public final void b(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object objectVolatile;
        do {
            atomicReferenceFieldUpdater = J;
            atomicReferenceFieldUpdater.getClass();
            objectVolatile = yf4.a.getObjectVolatile(this, K);
            if (objectVolatile == cgf.b) {
                return;
            }
        } while (!gid.v(atomicReferenceFieldUpdater, this, objectVolatile));
        ArrayList arrayList = this.F;
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((xff) it.next()).a();
        }
        this.I = cgf.d;
        this.F = null;
    }

    public final void c(xff xffVar) {
        ArrayList<xff> arrayList = this.F;
        if (arrayList == null) {
            return;
        }
        for (xff xffVar2 : arrayList) {
            if (xffVar2 != xffVar) {
                xffVar2.a();
            }
        }
        J.getClass();
        yf4.a.putObjectVolatile(this, K, cgf.b);
        this.I = cgf.d;
        this.F = null;
    }

    public final Object d(vp4 vp4Var) {
        J.getClass();
        Object objectVolatile = yf4.a.getObjectVolatile(this, K);
        objectVolatile.getClass();
        xff xffVar = (xff) objectVolatile;
        Object obj = this.I;
        c(xffVar);
        rz7 rz7Var = xffVar.c;
        Object obj2 = xffVar.a;
        Object obj3 = xffVar.d;
        Object objInvoke = rz7Var.invoke(obj2, obj3, obj);
        uzg uzgVar = xffVar.e;
        return obj3 == cgf.e ? ((bz7) uzgVar).invoke(vp4Var) : ((pz7) uzgVar).invoke(objInvoke, vp4Var);
    }

    public final Object e(xzg xzgVar) {
        return i() ? d(xzgVar) : f(xzgVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.vp4 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.yff
            if (r0 == 0) goto L13
            r0 = r6
            yff r0 = (defpackage.yff) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            yff r0 = new yff
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.E
            int r1 = r0.G
            r2 = 2
            r3 = 1
            m45 r4 = defpackage.m45.E
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            defpackage.sf5.h0(r6)
            return r6
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            r5 = 0
            return r5
        L31:
            defpackage.sf5.h0(r6)
            goto L41
        L35:
            defpackage.sf5.h0(r6)
            r0.G = r3
            java.lang.Object r6 = r5.l(r0)
            if (r6 != r4) goto L41
            goto L49
        L41:
            r0.G = r2
            java.lang.Object r5 = r5.d(r0)
            if (r5 != r4) goto L4a
        L49:
            return r4
        L4a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zff.f(vp4):java.lang.Object");
    }

    public final xff g(Object obj) {
        Object next;
        ArrayList arrayList = this.F;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((xff) next).a == obj) {
                break;
            }
        }
        xff xffVar = (xff) next;
        if (xffVar != null) {
            return xffVar;
        }
        xh6.i(obj, " is not found", "Clause with object ");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(dpf dpfVar, pz7 pz7Var) {
        j(new xff(this, dpfVar.F, (rz7) dpfVar.G, (rz7) dpfVar.H, null, (xzg) pz7Var, (rz7) dpfVar.I), false);
    }

    public final boolean i() {
        J.getClass();
        return yf4.a.getObjectVolatile(this, K) instanceof xff;
    }

    public final void j(xff xffVar, boolean z) {
        Object obj = xffVar.a;
        J.getClass();
        Unsafe unsafe = yf4.a;
        long j = K;
        if (unsafe.getObjectVolatile(this, j) instanceof xff) {
            return;
        }
        if (!z) {
            ArrayList arrayList = this.F;
            arrayList.getClass();
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((xff) it.next()).a == obj) {
                        mr9.f(ij0.h("Cannot use select clauses on the same object: ", obj));
                        return;
                    }
                }
            }
        }
        xffVar.b.invoke(obj, this, xffVar.d);
        if (this.I != cgf.d) {
            yf4.a.putObjectVolatile(this, j, xffVar);
            return;
        }
        if (!z) {
            ArrayList arrayList2 = this.F;
            arrayList2.getClass();
            arrayList2.add(xffVar);
        }
        xffVar.g = this.G;
        xffVar.h = this.H;
        this.G = null;
        this.H = -1;
    }

    public final int k(Object obj, Object obj2) {
        zff zffVar;
        Unsafe unsafe;
        Unsafe unsafe2;
        while (true) {
            J.getClass();
            Unsafe unsafe3 = yf4.a;
            long j = K;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (objectVolatile instanceof ta2) {
                xff xffVarG = this.g(obj);
                if (xffVarG != null) {
                    rz7 rz7Var = xffVarG.f;
                    rz7 rz7Var2 = rz7Var != null ? (rz7) rz7Var.invoke(this, xffVarG.d, obj2) : null;
                    while (true) {
                        Unsafe unsafe4 = yf4.a;
                        zffVar = this;
                        if (unsafe4.compareAndSwapObject(zffVar, K, objectVolatile, xffVarG)) {
                            ta2 ta2Var = (ta2) objectVolatile;
                            zffVar.I = obj2;
                            sqb sqbVarH = ta2Var.h(iei.a, rz7Var2);
                            if (sqbVarH == null) {
                                zffVar.I = cgf.d;
                                return 2;
                            }
                            ta2Var.u(sqbVarH);
                            return 0;
                        }
                        if (unsafe4.getObjectVolatile(zffVar, j) != objectVolatile) {
                            break;
                        }
                        this = zffVar;
                    }
                } else {
                    continue;
                }
            } else {
                zffVar = this;
                if (x44.r(objectVolatile, cgf.b) || (objectVolatile instanceof xff)) {
                    return 3;
                }
                if (x44.r(objectVolatile, cgf.c)) {
                    return 2;
                }
                if (x44.r(objectVolatile, cgf.a)) {
                    List listW = x44.W(obj);
                    do {
                        unsafe2 = yf4.a;
                        if (unsafe2.compareAndSwapObject(zffVar, K, objectVolatile, listW)) {
                            return 1;
                        }
                    } while (unsafe2.getObjectVolatile(zffVar, j) == objectVolatile);
                } else {
                    if (!(objectVolatile instanceof List)) {
                        sz6.j(ij0.B("Unexpected state: ", objectVolatile));
                        return 0;
                    }
                    ArrayList arrayListB1 = w44.b1((Collection) objectVolatile, obj);
                    do {
                        unsafe = yf4.a;
                        if (unsafe.compareAndSwapObject(zffVar, K, objectVolatile, arrayListB1)) {
                            return 1;
                        }
                    } while (unsafe.getObjectVolatile(zffVar, j) == objectVolatile);
                }
            }
            this = zffVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        r0 = r10.r();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        if (r0 != defpackage.m45.E) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.yff r13) {
        /*
            r12 = this;
            ua2 r5 = new ua2
            tp4 r0 = defpackage.zni.I(r13)
            r6 = 1
            r5.<init>(r6, r0)
            r5.t()
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.zff.J
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.yf4.a
            long r7 = defpackage.zff.K
            java.lang.Object r4 = r0.getObjectVolatile(r12, r7)
            iei r9 = defpackage.iei.a
            r0 = r5
            sqb r5 = defpackage.cgf.a
            if (r4 != r5) goto L3b
            r5 = r0
        L22:
            sun.misc.Unsafe r0 = defpackage.yf4.a
            long r2 = defpackage.zff.K
            r1 = r12
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            r10 = r5
            if (r2 == 0) goto L32
            r10.x(r12)
            goto L8c
        L32:
            java.lang.Object r0 = r0.getObjectVolatile(r12, r7)
            if (r0 == r4) goto L39
            goto L72
        L39:
            r5 = r10
            goto L22
        L3b:
            r10 = r0
            boolean r0 = r4 instanceof java.util.List
            r11 = 0
            if (r0 == 0) goto L74
        L41:
            sun.misc.Unsafe r0 = defpackage.yf4.a
            long r2 = defpackage.zff.K
            r1 = r12
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r2 == 0) goto L6c
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r0 = r4.iterator()
        L52:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L72
            java.lang.Object r2 = r0.next()
            xff r2 = r12.g(r2)
            r2.getClass()
            r2.g = r11
            r3 = -1
            r2.h = r3
            r12.j(r2, r6)
            goto L52
        L6c:
            java.lang.Object r0 = r0.getObjectVolatile(r12, r7)
            if (r0 == r4) goto L41
        L72:
            r5 = r10
            goto Ld
        L74:
            boolean r0 = r4 instanceof defpackage.xff
            if (r0 == 0) goto L96
            xff r4 = (defpackage.xff) r4
            java.lang.Object r0 = r12.I
            rz7 r2 = r4.f
            if (r2 == 0) goto L89
            java.lang.Object r3 = r4.d
            java.lang.Object r0 = r2.invoke(r12, r3, r0)
            r11 = r0
            rz7 r11 = (defpackage.rz7) r11
        L89:
            r10.o(r9, r11)
        L8c:
            java.lang.Object r0 = r10.r()
            m45 r1 = defpackage.m45.E
            if (r0 != r1) goto L95
            return r0
        L95:
            return r9
        L96:
            java.lang.String r0 = "unexpected state: "
            java.lang.String r0 = defpackage.ij0.B(r0, r4)
            defpackage.sz6.j(r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zff.l(yff):java.lang.Object");
    }
}
