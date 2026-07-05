package defpackage;

import com.anthropic.claude.sessions.types.SdkControlResponseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public class vf9 implements lf9 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater E = AtomicReferenceFieldUpdater.newUpdater(vf9.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater F;
    public static final /* synthetic */ long G;
    public static final /* synthetic */ long H;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = yf4.a;
        H = unsafe.objectFieldOffset(vf9.class.getDeclaredField("_state$volatile"));
        F = AtomicReferenceFieldUpdater.newUpdater(vf9.class, Object.class, "_parentHandle$volatile");
        G = unsafe.objectFieldOffset(vf9.class.getDeclaredField("_parentHandle$volatile"));
    }

    public vf9(boolean z) {
        this._state$volatile = z ? wf9.g : wf9.f;
    }

    public static ne3 f0(hfa hfaVar) {
        while (hfaVar.n()) {
            hfaVar = hfaVar.m();
        }
        while (true) {
            hfaVar = hfaVar.l();
            if (!hfaVar.n()) {
                if (hfaVar instanceof ne3) {
                    return (ne3) hfaVar;
                }
                if (hfaVar instanceof t5c) {
                    return null;
                }
            }
        }
    }

    public static String o0(Object obj) {
        if (!(obj instanceof rf9)) {
            return obj instanceof j09 ? ((j09) obj).c() ? "Active" : "New" : obj instanceof e94 ? "Cancelled" : "Completed";
        }
        rf9 rf9Var = (rf9) obj;
        return rf9Var.f() ? "Cancelling" : rf9.F.get(rf9Var) == 1 ? "Completing" : "Active";
    }

    public final boolean A(Throwable th) {
        if (a0()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        me3 me3VarQ = Q();
        return (me3VarQ == null || me3VarQ == d6c.E) ? z : me3VarQ.b(th) || z;
    }

    public String B() {
        return "Job was cancelled";
    }

    public boolean C(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return y(th) && L();
    }

    public boolean D(SdkControlResponseEvent.Response response) {
        return c0(response);
    }

    @Override // defpackage.lf9
    public final y86 D0(bz7 bz7Var) {
        return Y(true, new yb9(bz7Var));
    }

    public final void E(j09 j09Var, Object obj) {
        me3 me3VarQ = Q();
        if (me3VarQ != null) {
            me3VarQ.a();
            m0(d6c.E);
        }
        CompletionHandlerException completionHandlerException = null;
        e94 e94Var = obj instanceof e94 ? (e94) obj : null;
        Throwable th = e94Var != null ? e94Var.a : null;
        if (j09Var instanceof nf9) {
            try {
                ((nf9) j09Var).s(th);
                return;
            } catch (Throwable th2) {
                W(new CompletionHandlerException("Exception in completion handler " + j09Var + " for " + this, th2));
                return;
            }
        }
        t5c t5cVarD = j09Var.d();
        if (t5cVarD != null) {
            t5cVarD.e(new f8a(1), 1);
            Object objK = t5cVarD.k();
            objK.getClass();
            for (hfa hfaVarL = (hfa) objK; !hfaVarL.equals(t5cVarD); hfaVarL = hfaVarL.l()) {
                if (hfaVarL instanceof nf9) {
                    try {
                        ((nf9) hfaVarL).s(th);
                    } catch (Throwable th3) {
                        if (completionHandlerException != null) {
                            mwa.p(completionHandlerException, th3);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + hfaVarL + " for " + this, th3);
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                W(completionHandlerException);
            }
        }
    }

    public final Throwable F(Object obj) {
        Throwable thE;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        vf9 vf9Var = (vf9) obj;
        Object objU = vf9Var.U();
        if (objU instanceof rf9) {
            thE = ((rf9) objU).e();
        } else if (objU instanceof e94) {
            thE = ((e94) objU).a;
        } else {
            if (objU instanceof j09) {
                sz6.j(ij0.B("Cannot be cancelling child in this state: ", objU));
                return null;
            }
            thE = null;
        }
        CancellationException cancellationException = thE instanceof CancellationException ? (CancellationException) thE : null;
        return cancellationException == null ? new JobCancellationException("Parent job is ".concat(o0(objU)), thE, vf9Var) : cancellationException;
    }

    public final Object G(rf9 rf9Var, Object obj) throws Throwable {
        rf9 rf9Var2;
        Throwable th;
        Throwable thJ;
        vf9 vf9Var;
        rf9 rf9Var3;
        e94 e94Var = obj instanceof e94 ? (e94) obj : null;
        Throwable th2 = e94Var != null ? e94Var.a : null;
        synchronized (rf9Var) {
            try {
                rf9Var.f();
                ArrayList<Throwable> arrayListG = rf9Var.g(th2);
                thJ = J(rf9Var, arrayListG);
                if (thJ != null) {
                    try {
                        if (arrayListG.size() > 1) {
                            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListG.size()));
                            for (Throwable th3 : arrayListG) {
                                if (th3 != thJ && th3 != thJ && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                                    mwa.p(thJ, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        rf9Var2 = rf9Var;
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                rf9Var2 = rf9Var;
                th = th5;
            }
        }
        if (thJ != null && thJ != th2) {
            obj = new e94(thJ, false);
        }
        if (thJ != null && (A(thJ) || V(thJ))) {
            obj.getClass();
            e94.b.compareAndSet((e94) obj, 0, 1);
        }
        h0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = E;
        Object n09Var = obj instanceof j09 ? new n09((j09) obj) : obj;
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe = yf4.a;
            long j = H;
            vf9Var = this;
            rf9Var3 = rf9Var;
            if (unsafe.compareAndSwapObject(vf9Var, j, rf9Var3, n09Var) || unsafe.getObjectVolatile(vf9Var, j) != rf9Var3) {
                break;
            }
            this = vf9Var;
            rf9Var = rf9Var3;
        }
        vf9Var.E(rf9Var3, obj);
        return obj;
    }

    @Override // defpackage.lf9
    public final CancellationException H() {
        CancellationException cancellationException;
        Object objU = U();
        if (objU instanceof rf9) {
            Throwable thE = ((rf9) objU).e();
            if (thE == null) {
                xh6.d("Job is still new or active: ", this);
                return null;
            }
            String strConcat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = thE instanceof CancellationException ? (CancellationException) thE : null;
            return cancellationException == null ? new JobCancellationException(strConcat, thE, this) : cancellationException;
        }
        if (objU instanceof j09) {
            xh6.d("Job is still new or active: ", this);
            return null;
        }
        if (!(objU instanceof e94)) {
            return new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((e94) objU).a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new JobCancellationException(B(), th, this) : cancellationException;
    }

    public final Object I() throws Throwable {
        Object objU = U();
        if (objU instanceof j09) {
            sz6.j("This job has not completed yet");
            return null;
        }
        if (objU instanceof e94) {
            throw ((e94) objU).a;
        }
        return wf9.a(objU);
    }

    public final Throwable J(rf9 rf9Var, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (rf9Var.f()) {
                return new JobCancellationException(B(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    @Override // defpackage.c45
    public final Object K(pz7 pz7Var, Object obj) {
        return pz7Var.invoke(obj, this);
    }

    public boolean L() {
        return true;
    }

    public final dpf M() {
        tf9 tf9Var = tf9.E;
        nai.n(3, tf9Var);
        uf9 uf9Var = uf9.E;
        nai.n(3, uf9Var);
        return new dpf(this, tf9Var, uf9Var, null, 19);
    }

    public boolean N() {
        return this instanceof v84;
    }

    public final t5c O(j09 j09Var) {
        t5c t5cVarD = j09Var.d();
        if (t5cVarD != null) {
            return t5cVarD;
        }
        if (j09Var instanceof cm6) {
            return new t5c();
        }
        if (j09Var instanceof nf9) {
            j0((nf9) j09Var);
            return null;
        }
        xh6.d("State should have list: ", j09Var);
        return null;
    }

    public final me3 Q() {
        F.getClass();
        return (me3) yf4.a.getObjectVolatile(this, G);
    }

    @Override // defpackage.c45
    public final c45 S(b45 b45Var) {
        return nai.W(this, b45Var);
    }

    public final Object U() {
        E.getClass();
        return yf4.a.getObjectVolatile(this, H);
    }

    public boolean V(Throwable th) {
        return false;
    }

    public void W(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    public final void X(lf9 lf9Var) {
        d6c d6cVar = d6c.E;
        if (lf9Var == null) {
            m0(d6cVar);
            return;
        }
        lf9Var.start();
        me3 me3VarI = lf9Var.i(this);
        m0(me3VarI);
        if (Z()) {
            me3VarI.a();
            m0(d6cVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x009f, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.y86 Y(boolean r8, defpackage.nf9 r9) {
        /*
            r7 = this;
            r9.K = r7
        L2:
            java.lang.Object r4 = r7.U()
            boolean r0 = r4 instanceof defpackage.cm6
            if (r0 == 0) goto L44
            r0 = r4
            cm6 r0 = (defpackage.cm6) r0
            boolean r1 = r0.E
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = defpackage.vf9.E
            if (r1 == 0) goto L30
        L13:
            r6.getClass()
            sun.misc.Unsafe r0 = defpackage.yf4.a
            long r2 = defpackage.vf9.H
            r1 = r7
            r5 = r9
            boolean r7 = r0.compareAndSwapObject(r1, r2, r4, r5)
            r9 = r1
            if (r7 == 0) goto L25
            goto L85
        L25:
            java.lang.Object r7 = r0.getObjectVolatile(r9, r2)
            if (r7 == r4) goto L2d
            goto L86
        L2d:
            r7 = r9
            r9 = r5
            goto L13
        L30:
            r5 = r9
            r9 = r7
            t5c r7 = new t5c
            r7.<init>()
            if (r1 == 0) goto L3a
            goto L40
        L3a:
            b09 r1 = new b09
            r1.<init>(r7)
            r7 = r1
        L40:
            defpackage.ms6.z(r6, r9, r0, r7)
            goto L86
        L44:
            r5 = r9
            r9 = r7
            boolean r7 = r4 instanceof defpackage.j09
            d6c r0 = defpackage.d6c.E
            r1 = 0
            if (r7 == 0) goto L8a
            r7 = r4
            j09 r7 = (defpackage.j09) r7
            t5c r2 = r7.d()
            if (r2 != 0) goto L5c
            nf9 r4 = (defpackage.nf9) r4
            r9.j0(r4)
            goto L86
        L5c:
            boolean r3 = r5.r()
            if (r3 == 0) goto L7e
            boolean r3 = r7 instanceof defpackage.rf9
            if (r3 == 0) goto L69
            rf9 r7 = (defpackage.rf9) r7
            goto L6a
        L69:
            r7 = r1
        L6a:
            if (r7 == 0) goto L70
            java.lang.Throwable r1 = r7.e()
        L70:
            if (r1 != 0) goto L78
            r7 = 5
            boolean r7 = r2.e(r5, r7)
            goto L83
        L78:
            if (r8 == 0) goto L9f
            r5.s(r1)
            return r0
        L7e:
            r7 = 1
            boolean r7 = r2.e(r5, r7)
        L83:
            if (r7 == 0) goto L86
        L85:
            return r5
        L86:
            r7 = r9
            r9 = r5
            goto L2
        L8a:
            if (r8 == 0) goto L9f
            java.lang.Object r7 = r9.U()
            boolean r8 = r7 instanceof defpackage.e94
            if (r8 == 0) goto L97
            e94 r7 = (defpackage.e94) r7
            goto L98
        L97:
            r7 = r1
        L98:
            if (r7 == 0) goto L9c
            java.lang.Throwable r1 = r7.a
        L9c:
            r5.s(r1)
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vf9.Y(boolean, nf9):y86");
    }

    public final boolean Z() {
        return !(U() instanceof j09);
    }

    public boolean a0() {
        return this instanceof yr1;
    }

    @Override // defpackage.lf9
    public boolean c() {
        Object objU = U();
        return (objU instanceof j09) && ((j09) objU).c();
    }

    public final boolean c0(Object obj) {
        Object objS0;
        do {
            objS0 = s0(U(), obj);
            if (objS0 == wf9.a) {
                return false;
            }
            if (objS0 == wf9.b) {
                return true;
            }
        } while (objS0 == wf9.c);
        t(objS0);
        return true;
    }

    @Override // defpackage.lf9, defpackage.d6e
    public void d(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(B(), null, this);
        }
        z(cancellationException);
    }

    public final Object d0(Object obj) {
        Object objS0;
        do {
            objS0 = s0(U(), obj);
            if (objS0 == wf9.a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                e94 e94Var = obj instanceof e94 ? (e94) obj : null;
                throw new IllegalStateException(str, e94Var != null ? e94Var.a : null);
            }
        } while (objS0 == wf9.c);
        return objS0;
    }

    public Object e() {
        return I();
    }

    public String e0() {
        return getClass().getSimpleName();
    }

    public dpf f() {
        return M();
    }

    public final void g0(t5c t5cVar, Throwable th) {
        t5cVar.e(new f8a(4), 4);
        Object objK = t5cVar.k();
        objK.getClass();
        CompletionHandlerException completionHandlerException = null;
        for (hfa hfaVarL = (hfa) objK; !hfaVarL.equals(t5cVar); hfaVarL = hfaVarL.l()) {
            if ((hfaVarL instanceof nf9) && ((nf9) hfaVarL).r()) {
                try {
                    ((nf9) hfaVarL).s(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        mwa.p(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + hfaVarL + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            W(completionHandlerException);
        }
        A(th);
    }

    @Override // defpackage.a45
    public final b45 getKey() {
        return dd8.J;
    }

    public void h0(Object obj) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0089, code lost:
    
        return r5;
     */
    @Override // defpackage.lf9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.me3 i(defpackage.vf9 r8) {
        /*
            r7 = this;
            ne3 r5 = new ne3
            r5.<init>(r8)
            r5.K = r7
        L7:
            java.lang.Object r4 = r7.U()
            boolean r8 = r4 instanceof defpackage.cm6
            if (r8 == 0) goto L44
            r8 = r4
            cm6 r8 = (defpackage.cm6) r8
            boolean r0 = r8.E
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = defpackage.vf9.E
            if (r0 == 0) goto L31
        L18:
            r6.getClass()
            sun.misc.Unsafe r0 = defpackage.yf4.a
            long r2 = defpackage.vf9.H
            r1 = r7
            boolean r7 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r7 == 0) goto L28
            goto L89
        L28:
            java.lang.Object r7 = r0.getObjectVolatile(r1, r2)
            if (r7 == r4) goto L2f
            goto L5a
        L2f:
            r7 = r1
            goto L18
        L31:
            r1 = r7
            t5c r7 = new t5c
            r7.<init>()
            if (r0 == 0) goto L3a
            goto L40
        L3a:
            b09 r0 = new b09
            r0.<init>(r7)
            r7 = r0
        L40:
            defpackage.ms6.z(r6, r1, r8, r7)
            goto L5a
        L44:
            r1 = r7
            boolean r7 = r4 instanceof defpackage.j09
            d6c r8 = defpackage.d6c.E
            r0 = 0
            if (r7 == 0) goto L8b
            r7 = r4
            j09 r7 = (defpackage.j09) r7
            t5c r7 = r7.d()
            if (r7 != 0) goto L5c
            nf9 r4 = (defpackage.nf9) r4
            r1.j0(r4)
        L5a:
            r7 = r1
            goto L7
        L5c:
            r2 = 7
            boolean r2 = r7.e(r5, r2)
            if (r2 == 0) goto L64
            goto L89
        L64:
            r2 = 3
            boolean r7 = r7.e(r5, r2)
            java.lang.Object r1 = r1.U()
            boolean r2 = r1 instanceof defpackage.rf9
            if (r2 == 0) goto L78
            rf9 r1 = (defpackage.rf9) r1
            java.lang.Throwable r0 = r1.e()
            goto L84
        L78:
            boolean r2 = r1 instanceof defpackage.e94
            if (r2 == 0) goto L7f
            e94 r1 = (defpackage.e94) r1
            goto L80
        L7f:
            r1 = r0
        L80:
            if (r1 == 0) goto L84
            java.lang.Throwable r0 = r1.a
        L84:
            r5.s(r0)
            if (r7 == 0) goto L8a
        L89:
            return r5
        L8a:
            return r8
        L8b:
            java.lang.Object r7 = r1.U()
            boolean r1 = r7 instanceof defpackage.e94
            if (r1 == 0) goto L96
            e94 r7 = (defpackage.e94) r7
            goto L97
        L96:
            r7 = r0
        L97:
            if (r7 == 0) goto L9b
            java.lang.Throwable r0 = r7.a
        L9b:
            r5.s(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vf9.i(vf9):me3");
    }

    public void i0() {
    }

    @Override // defpackage.lf9
    public final boolean isCancelled() {
        Object objU = U();
        if (objU instanceof e94) {
            return true;
        }
        return (objU instanceof rf9) && ((rf9) objU).f();
    }

    @Override // defpackage.lf9
    public final y86 j(boolean z, boolean z2, ty4 ty4Var) {
        return Y(z2, z ? new xb9(ty4Var) : new yb9(ty4Var));
    }

    public final void j0(nf9 nf9Var) {
        nf9Var.g(new t5c());
        hfa hfaVarL = nf9Var.l();
        while (true) {
            E.getClass();
            Unsafe unsafe = yf4.a;
            long j = H;
            vf9 vf9Var = this;
            nf9 nf9Var2 = nf9Var;
            if (unsafe.compareAndSwapObject(vf9Var, j, nf9Var2, hfaVarL) || unsafe.getObjectVolatile(vf9Var, j) != nf9Var2) {
                return;
            }
            this = vf9Var;
            nf9Var = nf9Var2;
        }
    }

    public final void k0(nf9 nf9Var) {
        vf9 vf9Var;
        while (true) {
            Object objU = this.U();
            if (!(objU instanceof nf9)) {
                if (!(objU instanceof j09) || ((j09) objU).d() == null) {
                    return;
                }
                nf9Var.o();
                return;
            }
            if (objU != nf9Var) {
                return;
            }
            while (true) {
                E.getClass();
                Unsafe unsafe = yf4.a;
                long j = H;
                vf9Var = this;
                if (unsafe.compareAndSwapObject(vf9Var, j, objU, wf9.g)) {
                    return;
                }
                if (unsafe.getObjectVolatile(vf9Var, j) != objU) {
                    break;
                } else {
                    this = vf9Var;
                }
            }
            this = vf9Var;
        }
    }

    public final void m0(me3 me3Var) {
        F.getClass();
        yf4.a.putObjectVolatile(this, G, me3Var);
    }

    @Override // defpackage.lf9
    public final Object n(tp4 tp4Var) {
        Object objU;
        iei ieiVar;
        do {
            objU = U();
            boolean z = objU instanceof j09;
            ieiVar = iei.a;
            if (!z) {
                knk.u(tp4Var.getContext());
                return ieiVar;
            }
        } while (n0(objU) < 0);
        ua2 ua2Var = new ua2(1, zni.I(tp4Var));
        ua2Var.t();
        ua2Var.x(new oa2(1, knk.A(this, new mre(ua2Var))));
        Object objR = ua2Var.r();
        m45 m45Var = m45.E;
        if (objR != m45Var) {
            objR = ieiVar;
        }
        return objR == m45Var ? objR : ieiVar;
    }

    public final int n0(Object obj) {
        Unsafe unsafe;
        boolean z = obj instanceof cm6;
        long j = H;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = E;
        if (!z) {
            vf9 vf9Var = this;
            Object obj2 = obj;
            if (!(obj2 instanceof b09)) {
                return 0;
            }
            t5c t5cVar = ((b09) obj2).E;
            do {
                atomicReferenceFieldUpdater.getClass();
                vf9 vf9Var2 = vf9Var;
                unsafe = yf4.a;
                Object obj3 = obj2;
                boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(vf9Var2, H, obj3, t5cVar);
                vf9Var = vf9Var2;
                obj2 = obj3;
                if (zCompareAndSwapObject) {
                    vf9Var.i0();
                    return 1;
                }
            } while (unsafe.getObjectVolatile(vf9Var, j) == obj2);
            return -1;
        }
        if (((cm6) obj).E) {
            return 0;
        }
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe2 = yf4.a;
            vf9 vf9Var3 = this;
            Object obj4 = obj;
            if (unsafe2.compareAndSwapObject(vf9Var3, H, obj4, wf9.g)) {
                vf9Var3.i0();
                return 1;
            }
            if (unsafe2.getObjectVolatile(vf9Var3, j) != obj4) {
                return -1;
            }
            this = vf9Var3;
            obj = obj4;
        }
    }

    public final boolean p0(j09 j09Var, Object obj) {
        Object n09Var = obj instanceof j09 ? new n09((j09) obj) : obj;
        while (true) {
            E.getClass();
            Unsafe unsafe = yf4.a;
            long j = H;
            vf9 vf9Var = this;
            j09 j09Var2 = j09Var;
            if (unsafe.compareAndSwapObject(vf9Var, j, j09Var2, n09Var)) {
                vf9Var.h0(obj);
                vf9Var.E(j09Var2, obj);
                return true;
            }
            if (unsafe.getObjectVolatile(vf9Var, j) != j09Var2) {
                return false;
            }
            this = vf9Var;
            j09Var = j09Var2;
        }
    }

    public final boolean q0(j09 j09Var, Throwable th) {
        t5c t5cVarO = O(j09Var);
        if (t5cVarO == null) {
            return false;
        }
        rf9 rf9Var = new rf9(t5cVarO, th);
        while (true) {
            E.getClass();
            Unsafe unsafe = yf4.a;
            long j = H;
            vf9 vf9Var = this;
            j09 j09Var2 = j09Var;
            if (unsafe.compareAndSwapObject(vf9Var, j, j09Var2, rf9Var)) {
                vf9Var.g0(t5cVarO, th);
                return true;
            }
            if (unsafe.getObjectVolatile(vf9Var, j) != j09Var2) {
                return false;
            }
            this = vf9Var;
            j09Var = j09Var2;
        }
    }

    @Override // defpackage.c45
    public final c45 r0(c45 c45Var) {
        return nai.Z(this, c45Var);
    }

    public final Object s0(Object obj, Object obj2) {
        if (!(obj instanceof j09)) {
            return wf9.a;
        }
        if (((obj instanceof cm6) || (obj instanceof nf9)) && !(obj instanceof ne3) && !(obj2 instanceof e94)) {
            return p0((j09) obj, obj2) ? obj2 : wf9.c;
        }
        j09 j09Var = (j09) obj;
        t5c t5cVarO = O(j09Var);
        if (t5cVarO == null) {
            return wf9.c;
        }
        rf9 rf9Var = j09Var instanceof rf9 ? (rf9) j09Var : null;
        if (rf9Var == null) {
            rf9Var = new rf9(t5cVarO, null);
        }
        synchronized (rf9Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = rf9.F;
            if (atomicIntegerFieldUpdater.get(rf9Var) == 1) {
                return wf9.a;
            }
            atomicIntegerFieldUpdater.set(rf9Var, 1);
            if (rf9Var != j09Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = E;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, j09Var, rf9Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != j09Var) {
                        return wf9.c;
                    }
                }
            }
            boolean zF = rf9Var.f();
            e94 e94Var = obj2 instanceof e94 ? (e94) obj2 : null;
            if (e94Var != null) {
                rf9Var.a(e94Var.a);
            }
            Throwable thE = zF ? null : rf9Var.e();
            if (thE != null) {
                g0(t5cVarO, thE);
            }
            ne3 ne3VarF0 = f0(t5cVarO);
            if (ne3VarF0 != null && t0(rf9Var, ne3VarF0, obj2)) {
                return wf9.b;
            }
            t5cVarO.e(new f8a(2), 2);
            ne3 ne3VarF02 = f0(t5cVarO);
            return (ne3VarF02 == null || !t0(rf9Var, ne3VarF02, obj2)) ? G(rf9Var, obj2) : wf9.b;
        }
    }

    @Override // defpackage.lf9
    public final boolean start() {
        int iN0;
        do {
            iN0 = n0(U());
            if (iN0 == 0) {
                return false;
            }
        } while (iN0 != 1);
        return true;
    }

    public void t(Object obj) {
    }

    public final boolean t0(rf9 rf9Var, ne3 ne3Var, Object obj) {
        while (ne3Var.L.Y(false, new qf9(this, rf9Var, ne3Var, obj)) == d6c.E) {
            ne3Var = f0(ne3Var);
            if (ne3Var == null) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(e0() + '{' + o0(U()) + '}');
        sb.append('@');
        sb.append(xn5.d0(this));
        return sb.toString();
    }

    public void v(Object obj) {
        t(obj);
    }

    public final Object w(tp4 tp4Var) throws Throwable {
        Object objU;
        do {
            objU = U();
            if (!(objU instanceof j09)) {
                if (objU instanceof e94) {
                    throw ((e94) objU).a;
                }
                return wf9.a(objU);
            }
        } while (n0(objU) < 0);
        pf9 pf9Var = new pf9(zni.I(tp4Var), this);
        pf9Var.t();
        pf9Var.x(new oa2(1, knk.A(this, new lre(pf9Var))));
        return pf9Var.r();
    }

    @Override // defpackage.c45
    public final a45 x0(b45 b45Var) {
        return nai.C(this, b45Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        r0 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c A[PHI: r0
      0x003c: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v9 java.lang.Object) binds: [B:3:0x0008, B:16:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean y(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vf9.y(java.lang.Object):boolean");
    }

    public void z(CancellationException cancellationException) {
        y(cancellationException);
    }
}
