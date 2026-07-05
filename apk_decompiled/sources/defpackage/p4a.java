package defpackage;

import android.os.Looper;
import androidx.lifecycle.DefaultLifecycleObserver;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p4a extends c4a {
    public final boolean b;
    public we7 c = new we7();
    public a4a d;
    public final WeakReference e;
    public int f;
    public boolean g;
    public boolean h;
    public final ArrayList i;
    public final amg j;

    public p4a(m4a m4aVar, boolean z) {
        this.b = z;
        a4a a4aVar = a4a.F;
        this.d = a4aVar;
        this.i = new ArrayList();
        this.e = new WeakReference(m4aVar);
        this.j = bmg.a(a4aVar);
    }

    @Override // defpackage.c4a
    public final void a(l4a l4aVar) {
        i4a k2aVar;
        m4a m4aVar;
        l4aVar.getClass();
        e("addObserver");
        a4a a4aVar = this.d;
        a4a a4aVar2 = a4a.E;
        if (a4aVar != a4aVar2) {
            a4aVar2 = a4a.F;
        }
        o4a o4aVar = new o4a();
        HashMap map = y4a.a;
        boolean z = l4aVar instanceof i4a;
        boolean z2 = l4aVar instanceof DefaultLifecycleObserver;
        Object obj = null;
        if (z && z2) {
            k2aVar = new bs5((DefaultLifecycleObserver) l4aVar, (i4a) l4aVar);
        } else if (z2) {
            k2aVar = new bs5((DefaultLifecycleObserver) l4aVar, null);
        } else if (z) {
            k2aVar = (i4a) l4aVar;
        } else {
            Class<?> cls = l4aVar.getClass();
            if (y4a.b(cls) == 2) {
                Object obj2 = y4a.b.get(cls);
                obj2.getClass();
                List list = (List) obj2;
                if (list.size() == 1) {
                    y4a.a((Constructor) list.get(0), l4aVar);
                    throw null;
                }
                int size = list.size();
                w18[] w18VarArr = new w18[size];
                if (size > 0) {
                    y4a.a((Constructor) list.get(0), l4aVar);
                    throw null;
                }
                k2aVar = new wd4(i, w18VarArr);
            } else {
                k2aVar = new k2a(l4aVar);
            }
        }
        o4aVar.b = k2aVar;
        o4aVar.a = a4aVar2;
        we7 we7Var = this.c;
        e3f e3fVarA = we7Var.a(l4aVar);
        if (e3fVarA != null) {
            obj = e3fVarA.F;
        } else {
            HashMap map2 = we7Var.I;
            e3f e3fVar = new e3f(l4aVar, o4aVar);
            we7Var.H++;
            e3f e3fVar2 = we7Var.F;
            if (e3fVar2 == null) {
                we7Var.E = e3fVar;
                we7Var.F = e3fVar;
            } else {
                e3fVar2.G = e3fVar;
                e3fVar.H = e3fVar2;
                we7Var.F = e3fVar;
            }
            map2.put(l4aVar, e3fVar);
        }
        if (((o4a) obj) == null && (m4aVar = (m4a) this.e.get()) != null) {
            i = (this.f != 0 || this.g) ? 1 : 0;
            a4a a4aVarD = d(l4aVar);
            this.f++;
            while (o4aVar.a.compareTo(a4aVarD) < 0 && this.c.I.containsKey(l4aVar)) {
                a4a a4aVar3 = o4aVar.a;
                ArrayList arrayList = this.i;
                arrayList.add(a4aVar3);
                w3a w3aVar = y3a.Companion;
                a4a a4aVar4 = o4aVar.a;
                w3aVar.getClass();
                y3a y3aVarB = w3a.b(a4aVar4);
                if (y3aVarB == null) {
                    xh6.n("no event up from ", o4aVar.a);
                    return;
                } else {
                    o4aVar.a(m4aVar, y3aVarB);
                    arrayList.remove(arrayList.size() - 1);
                    a4aVarD = d(l4aVar);
                }
            }
            if (i == 0) {
                i();
            }
            this.f--;
        }
    }

    @Override // defpackage.c4a
    public final a4a b() {
        return this.d;
    }

    @Override // defpackage.c4a
    public final void c(l4a l4aVar) {
        l4aVar.getClass();
        e("removeObserver");
        this.c.b(l4aVar);
    }

    public final a4a d(l4a l4aVar) {
        HashMap map = this.c.I;
        e3f e3fVar = map.containsKey(l4aVar) ? ((e3f) map.get(l4aVar)).H : null;
        a4a a4aVar = e3fVar != null ? ((o4a) e3fVar.F).a : null;
        ArrayList arrayList = this.i;
        a4a a4aVar2 = arrayList.isEmpty() ? null : (a4a) arrayList.get(arrayList.size() - 1);
        a4a a4aVar3 = this.d;
        a4aVar3.getClass();
        if (a4aVar == null || a4aVar.compareTo(a4aVar3) >= 0) {
            a4aVar = a4aVar3;
        }
        return (a4aVar2 == null || a4aVar2.compareTo(a4aVar) >= 0) ? a4aVar : a4aVar2;
    }

    public final void e(String str) {
        if (this.b) {
            bo0.T().f.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            mr9.f(ij0.j("Method ", str, " must be called on the main thread"));
        }
    }

    public final void f(y3a y3aVar) {
        y3aVar.getClass();
        e("handleLifecycleEvent");
        g(y3aVar.a());
    }

    public final void g(a4a a4aVar) {
        if (this.d == a4aVar) {
            return;
        }
        m4a m4aVar = (m4a) this.e.get();
        a4a a4aVar2 = this.d;
        a4aVar2.getClass();
        a4a a4aVar3 = a4a.F;
        a4a a4aVar4 = a4a.E;
        if (a4aVar2 == a4aVar3 && a4aVar == a4aVar4) {
            throw new IllegalStateException(("State must be at least '" + a4a.G + "' to be moved to '" + a4aVar + "' in component " + m4aVar).toString());
        }
        if (a4aVar2 == a4aVar4 && a4aVar2 != a4aVar) {
            throw new IllegalStateException(("State is '" + a4aVar4 + "' and cannot be moved to `" + a4aVar + "` in component " + m4aVar).toString());
        }
        this.d = a4aVar;
        if (this.g || this.f != 0) {
            this.h = true;
            return;
        }
        this.g = true;
        i();
        this.g = false;
        if (this.d == a4aVar4) {
            this.c = new we7();
        }
    }

    public final void h(a4a a4aVar) {
        e("setCurrentState");
        g(a4aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r8.h = false;
        r8.j.m(r8.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p4a.i():void");
    }
}
