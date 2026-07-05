package defpackage;

import androidx.compose.runtime.ComposeRuntimeError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class x7e extends ge4 {
    public static final amg A = bmg.a(gzc.H);
    public static final AtomicReference B = new AtomicReference(Boolean.FALSE);
    public long a;
    public final a70 b;
    public final w3c c;
    public final Object d;
    public lf9 e;
    public Throwable f;
    public final ArrayList g;
    public List h;
    public fwb i;
    public final wwb j;
    public final ArrayList k;
    public final ArrayList l;
    public final ewb m;
    public final q28 n;
    public final ewb o;
    public final ewb p;
    public ArrayList q;
    public fwb r;
    public ua2 s;
    public final amg t;
    public boolean u;
    public final amg v;
    public final w3c w;
    public final mf9 x;
    public final c45 y;
    public final dd8 z;

    public x7e(c45 c45Var) {
        a70 a70Var = new a70(new s7e(this, 0));
        this.b = a70Var;
        this.c = new w3c(new s7e(this, 1));
        this.d = new Object();
        this.g = new ArrayList();
        this.i = new fwb();
        this.j = new wwb(0, new le4[16]);
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new ewb();
        this.n = new q28(15);
        this.o = new ewb();
        this.p = new ewb();
        this.t = bmg.a(null);
        this.v = bmg.a(u7e.G);
        this.w = new w3c((byte) 0, 9);
        mf9 mf9Var = new mf9((lf9) c45Var.x0(dd8.J));
        mf9Var.D0(new tz9(19, this));
        this.x = mf9Var;
        this.y = c45Var.r0(a70Var).r0(mf9Var);
        this.z = new dd8(26);
    }

    public static final void G(ArrayList arrayList, x7e x7eVar, le4 le4Var) {
        arrayList.clear();
        synchronized (x7eVar.d) {
            Iterator it = x7eVar.l.iterator();
            while (it.hasNext()) {
                ksb ksbVar = (ksb) it.next();
                if (ksbVar.b().equals(le4Var)) {
                    arrayList.add(ksbVar);
                    it.remove();
                }
            }
        }
    }

    public static void w(kwb kwbVar) {
        try {
            if (kwbVar.w() instanceof scg) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            kwbVar.c();
        }
    }

    public final boolean A() {
        return this.j.G != 0 || z() || B() || this.m.j();
    }

    public final boolean B() {
        return !this.u && (((t11) ((el5) this.c.G).G).get() & 134217727) > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.d
            monitor-enter(r0)
            fwb r1 = r2.i     // Catch: java.lang.Throwable -> L21
            boolean r1 = r1.i()     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L23
            wwb r1 = r2.j     // Catch: java.lang.Throwable -> L21
            int r1 = r1.G     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L12
            goto L23
        L12:
            boolean r1 = r2.z()     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L23
            boolean r2 = r2.B()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L1f
            goto L23
        L1f:
            r2 = 0
            goto L24
        L21:
            r2 = move-exception
            goto L26
        L23:
            r2 = 1
        L24:
            monitor-exit(r0)
            return r2
        L26:
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x7e.C():boolean");
    }

    public final List D() {
        List list = this.h;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this.g;
        List arrayList2 = arrayList.isEmpty() ? lm6.E : new ArrayList(arrayList);
        this.h = arrayList2;
        return arrayList2;
    }

    public final void E() {
        ta2 ta2VarY;
        synchronized (this.d) {
            ta2VarY = y();
            if (((u7e) this.v.getValue()).compareTo(u7e.F) <= 0) {
                throw gjk.b("Recomposer shutdown; frame clock awaiter will never resume", this.f);
            }
        }
        if (ta2VarY != null) {
            ((ua2) ta2VarY).resumeWith(iei.a);
        }
    }

    public final void F(le4 le4Var) {
        synchronized (this.d) {
            ArrayList arrayList = this.l;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((ksb) arrayList.get(i)).b().equals(le4Var)) {
                    ArrayList arrayList2 = new ArrayList();
                    G(arrayList2, this, le4Var);
                    while (!arrayList2.isEmpty()) {
                        H(arrayList2, null);
                        G(arrayList2, this, le4Var);
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0141, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0146, code lost:
    
        if (r4 >= r3) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0150, code lost:
    
        if (((defpackage.cpc) r10.get(r4)).F == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0152, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0155, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0163, code lost:
    
        if (r8 >= r4) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0165, code lost:
    
        r11 = (defpackage.cpc) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x016d, code lost:
    
        if (r11.F != null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x016f, code lost:
    
        r11 = (defpackage.ksb) r11.E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0179, code lost:
    
        r4 = r17.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x017b, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x017c, code lost:
    
        defpackage.b54.t0(r17.l, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0181, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0182, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0190, code lost:
    
        if (r8 >= r4) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0192, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019b, code lost:
    
        if (((defpackage.cpc) r11).F == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x019d, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a0, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a3, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List H(java.util.List r18, defpackage.fwb r19) {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x7e.H(java.util.List, fwb):java.util.List");
    }

    public final le4 I(le4 le4Var, fwb fwbVar) {
        kwb kwbVarC;
        if (le4Var.Z.F || le4Var.a0 == 3) {
            return null;
        }
        fwb fwbVar2 = this.r;
        if (fwbVar2 == null || !fwbVar2.c(le4Var)) {
            tz9 tz9Var = new tz9(18, le4Var);
            vk3 vk3Var = new vk3(le4Var, 26, fwbVar);
            rcg rcgVarJ = ycg.j();
            kwb kwbVar = rcgVarJ instanceof kwb ? (kwb) rcgVarJ : null;
            if (kwbVar == null || (kwbVarC = kwbVar.C(tz9Var, vk3Var)) == null) {
                sz6.j("Cannot create a mutable snapshot of an read-only snapshot");
            } else {
                try {
                    rcg rcgVarJ2 = kwbVarC.j();
                    if (fwbVar != null) {
                        try {
                            if (fwbVar.i()) {
                                vc8 vc8Var = new vc8(fwbVar, 19, le4Var);
                                e18 e18Var = le4Var.Z;
                                if (e18Var.F) {
                                    pd4.a("Preparing a composition while composing is not supported");
                                }
                                e18Var.F = true;
                                try {
                                    vc8Var.a();
                                    e18Var.F = false;
                                } catch (Throwable th) {
                                    e18Var.F = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            rcg.q(rcgVarJ2);
                            throw th2;
                        }
                    }
                    boolean zW = le4Var.w();
                    rcg.q(rcgVarJ2);
                    if (zW) {
                        return le4Var;
                    }
                } finally {
                    w(kwbVarC);
                }
            }
        }
        return null;
    }

    public final void J(Throwable th, le4 le4Var) throws Throwable {
        if (!((Boolean) B.get()).booleanValue() || (th instanceof ComposeRuntimeError)) {
            synchronized (this.d) {
                cvj.i("Error was captured in composition.", th);
                t7e t7eVar = (t7e) this.t.getValue();
                if (t7eVar != null) {
                    throw t7eVar.a();
                }
                amg amgVar = this.t;
                t7e t7eVar2 = new t7e(th);
                amgVar.getClass();
                amgVar.n(null, t7eVar2);
            }
            throw th;
        }
        synchronized (this.d) {
            try {
                cvj.i("Error was captured in composition while live edit was enabled.", th);
                this.k.clear();
                this.j.h();
                this.i = new fwb();
                this.l.clear();
                this.m.a();
                this.o.a();
                amg amgVar2 = this.t;
                t7e t7eVar3 = new t7e(th);
                amgVar2.getClass();
                amgVar2.n(null, t7eVar3);
                if (le4Var != null) {
                    L(le4Var);
                }
                if (y() != null) {
                    pd4.a("expected to go to inactive state due to composition error");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean K() {
        boolean zA;
        synchronized (this.d) {
            if (this.i.h()) {
                return A();
            }
            List listD = D();
            w6f w6fVar = new w6f(this.i);
            this.i = new fwb();
            try {
                int size = listD.size();
                for (int i = 0; i < size; i++) {
                    ((le4) listD.get(i)).x(w6fVar);
                    if (((u7e) this.v.getValue()).compareTo(u7e.F) <= 0) {
                        break;
                    }
                }
                synchronized (this.d) {
                    if (y() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zA = A();
                }
                return zA;
            } catch (Throwable th) {
                synchronized (this.d) {
                    fwb fwbVar = this.i;
                    fwbVar.getClass();
                    Iterator<E> it = w6fVar.iterator();
                    while (it.hasNext()) {
                        fwbVar.l(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void L(le4 le4Var) {
        ArrayList arrayList = this.q;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.q = arrayList;
        }
        if (!arrayList.contains(le4Var)) {
            arrayList.add(le4Var);
        }
        if (this.g.remove(le4Var)) {
            this.h = null;
        }
    }

    public final Object M(xzg xzgVar) throws Throwable {
        Object objC0 = gb9.c0(this.b, new x25(this, new w7e(this, null), j8.O(xzgVar.getContext()), null, 3), xzgVar);
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        if (objC0 != m45Var) {
            objC0 = ieiVar;
        }
        return objC0 == m45Var ? objC0 : ieiVar;
    }

    @Override // defpackage.ge4
    public final void a(le4 le4Var, pz7 pz7Var) throws Throwable {
        u7e u7eVar;
        boolean zContains;
        kwb kwbVarC;
        boolean z = le4Var.Z.F;
        synchronized (this.d) {
            u7e u7eVar2 = (u7e) this.v.getValue();
            u7eVar = u7e.F;
            zContains = u7eVar2.compareTo(u7eVar) > 0 ? true ^ D().contains(le4Var) : true;
        }
        try {
            tz9 tz9Var = new tz9(18, le4Var);
            vk3 vk3Var = new vk3(le4Var, 26, (Object) null);
            rcg rcgVarJ = ycg.j();
            kwb kwbVar = rcgVarJ instanceof kwb ? (kwb) rcgVarJ : null;
            if (kwbVar == null || (kwbVarC = kwbVar.C(tz9Var, vk3Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                rcg rcgVarJ2 = kwbVarC.j();
                try {
                    le4Var.k(pz7Var);
                    synchronized (this.d) {
                        if (((u7e) this.v.getValue()).compareTo(u7eVar) > 0 && !D().contains(le4Var)) {
                            this.g.add(le4Var);
                            this.h = null;
                        }
                    }
                    if (!z) {
                        ycg.j().m();
                    }
                    try {
                        F(le4Var);
                        try {
                            le4Var.e();
                            le4Var.g();
                            if (z) {
                                return;
                            }
                            ycg.j().m();
                        } catch (Throwable th) {
                            J(th, null);
                        }
                    } catch (Throwable th2) {
                        J(th2, le4Var);
                    }
                } finally {
                    rcg.q(rcgVarJ2);
                }
            } finally {
                w(kwbVarC);
            }
        } catch (Throwable th3) {
            if (zContains) {
                synchronized (this.d) {
                }
            }
            J(th3, le4Var);
        }
    }

    @Override // defpackage.ge4
    public final fwb b(le4 le4Var, k5g k5gVar, pz7 pz7Var) {
        w3c w3cVar = this.w;
        try {
            k5g k5gVar2 = le4Var.T;
            le4Var.T = k5gVar;
            try {
                a(le4Var, pz7Var);
                fwb fwbVar = (fwb) w3cVar.get();
                if (fwbVar == null) {
                    fwbVar = v6f.a;
                    fwbVar.getClass();
                }
                return fwbVar;
            } finally {
                le4Var.T = k5gVar2;
            }
        } finally {
            w3cVar.c(null);
        }
    }

    @Override // defpackage.ge4
    public final boolean d() {
        return ((Boolean) B.get()).booleanValue();
    }

    @Override // defpackage.ge4
    public final boolean e() {
        return false;
    }

    @Override // defpackage.ge4
    public final boolean f() {
        return pd4.a == 2;
    }

    @Override // defpackage.ge4
    public final long g() {
        return 1000L;
    }

    @Override // defpackage.ge4
    public final fe4 h() {
        return null;
    }

    @Override // defpackage.ge4
    public final c45 j() {
        return this.y;
    }

    @Override // defpackage.ge4
    public final boolean k() {
        return !(pd4.a == 0);
    }

    @Override // defpackage.ge4
    public final void l(le4 le4Var) {
        ta2 ta2VarY;
        synchronized (this.d) {
            if (this.j.i(le4Var)) {
                ta2VarY = null;
            } else {
                this.j.b(le4Var);
                ta2VarY = y();
            }
        }
        if (ta2VarY != null) {
            ((ua2) ta2VarY).resumeWith(iei.a);
        }
    }

    @Override // defpackage.ge4
    public final jsb m(ksb ksbVar) {
        jsb jsbVar;
        synchronized (this.d) {
            jsbVar = (jsb) this.o.k(ksbVar);
        }
        return jsbVar;
    }

    @Override // defpackage.ge4
    public final fwb n(le4 le4Var, k5g k5gVar, fwb fwbVar) {
        w3c w3cVar = this.w;
        try {
            K();
            le4Var.x(new w6f(fwbVar));
            k5g k5gVar2 = le4Var.T;
            le4Var.T = k5gVar;
            try {
                le4 le4VarI = I(le4Var, null);
                if (le4VarI != null) {
                    F(le4Var);
                    le4VarI.e();
                    le4VarI.g();
                }
                fwb fwbVar2 = (fwb) w3cVar.get();
                if (fwbVar2 == null) {
                    fwbVar2 = v6f.a;
                    fwbVar2.getClass();
                }
                return fwbVar2;
            } finally {
                le4Var.T = k5gVar2;
            }
        } finally {
            w3cVar.c(null);
        }
    }

    @Override // defpackage.ge4
    public final void o(Set set) {
    }

    @Override // defpackage.ge4
    public final void q(r7e r7eVar) {
        w3c w3cVar = this.w;
        fwb fwbVar = (fwb) w3cVar.get();
        if (fwbVar == null) {
            fwb fwbVar2 = v6f.a;
            fwbVar = new fwb();
            w3cVar.c(fwbVar);
        }
        fwbVar.a(r7eVar);
    }

    @Override // defpackage.ge4
    public final void r(le4 le4Var) {
        synchronized (this.d) {
            try {
                fwb fwbVar = this.r;
                if (fwbVar == null) {
                    fwb fwbVar2 = v6f.a;
                    fwbVar = new fwb();
                    this.r = fwbVar;
                }
                fwbVar.a(le4Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ge4
    public final za2 s(v01 v01Var) {
        w3c w3cVar = this.c;
        return ((el5) w3cVar.G).m(new v3c(v01Var), (vc8) w3cVar.H);
    }

    @Override // defpackage.ge4
    public final void v(le4 le4Var) {
        synchronized (this.d) {
            if (this.g.remove(le4Var)) {
                this.h = null;
            }
            this.j.l(le4Var);
            this.k.remove(le4Var);
        }
    }

    public final void x() {
        synchronized (this.d) {
            if (((u7e) this.v.getValue()).compareTo(u7e.I) >= 0) {
                amg amgVar = this.v;
                u7e u7eVar = u7e.F;
                amgVar.getClass();
                amgVar.n(null, u7eVar);
            }
        }
        this.x.d(null);
    }

    public final ta2 y() {
        amg amgVar = this.v;
        int iCompareTo = ((u7e) amgVar.getValue()).compareTo(u7e.F);
        amg amgVar2 = this.t;
        ArrayList arrayList = this.l;
        ArrayList arrayList2 = this.k;
        wwb wwbVar = this.j;
        if (iCompareTo > 0) {
            Object value = amgVar2.getValue();
            u7e u7eVar = u7e.J;
            u7e u7eVar2 = u7e.G;
            if (value == null) {
                if (this.e == null) {
                    this.i = new fwb();
                    wwbVar.h();
                    if (z() || B()) {
                        u7eVar2 = u7e.H;
                    }
                } else {
                    u7eVar2 = (wwbVar.G != 0 || this.i.i() || !arrayList2.isEmpty() || !arrayList.isEmpty() || z() || B() || this.m.j()) ? u7eVar : u7e.I;
                }
            }
            amgVar.n(null, u7eVar2);
            if (u7eVar2 != u7eVar) {
                return null;
            }
            ua2 ua2Var = this.s;
            this.s = null;
            return ua2Var;
        }
        List listD = D();
        int size = listD.size();
        for (int i = 0; i < size; i++) {
        }
        this.g.clear();
        this.h = lm6.E;
        this.i = new fwb();
        wwbVar.h();
        arrayList2.clear();
        arrayList.clear();
        this.q = null;
        ua2 ua2Var2 = this.s;
        if (ua2Var2 != null) {
            ua2Var2.q(null);
        }
        this.s = null;
        amgVar2.m(null);
        return null;
    }

    public final boolean z() {
        return !this.u && (((t11) ((el5) this.b.G).G).get() & 134217727) > 0;
    }
}
