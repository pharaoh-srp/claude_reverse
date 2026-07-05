package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class me1 {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final tg6 c;
    public final tg6 d;
    public Looper e;
    public mqh f;
    public z6d g;

    public me1() {
        int i = 0;
        z7b z7bVar = null;
        this.c = new tg6(new CopyOnWriteArrayList(), i, z7bVar);
        this.d = new tg6(new CopyOnWriteArrayList(), i, z7bVar);
    }

    public abstract s7b a(z7b z7bVar, xv8 xv8Var, long j);

    public final void b(a8b a8bVar) {
        HashSet hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(a8bVar);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        c();
    }

    public void c() {
    }

    public final void d(a8b a8bVar) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(a8bVar);
        if (zIsEmpty) {
            e();
        }
    }

    public void e() {
    }

    public mqh f() {
        return null;
    }

    public abstract j7b g();

    public boolean h() {
        return true;
    }

    public abstract void i();

    public final void j(a8b a8bVar, yp5 yp5Var, z6d z6dVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.e;
        fd9.E(looper == null || looper == looperMyLooper);
        this.g = z6dVar;
        mqh mqhVar = this.f;
        this.a.add(a8bVar);
        if (this.e == null) {
            this.e = looperMyLooper;
            this.b.add(a8bVar);
            k(yp5Var);
        } else if (mqhVar != null) {
            d(a8bVar);
            a8bVar.a(this, mqhVar);
        }
    }

    public abstract void k(yp5 yp5Var);

    public final void l(mqh mqhVar) {
        this.f = mqhVar;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((a8b) it.next()).a(this, mqhVar);
        }
    }

    public abstract void m(s7b s7bVar);

    public final void n(a8b a8bVar) {
        ArrayList arrayList = this.a;
        arrayList.remove(a8bVar);
        if (!arrayList.isEmpty()) {
            b(a8bVar);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        o();
    }

    public abstract void o();

    public final void p(ug6 ug6Var) {
        CopyOnWriteArrayList<sg6> copyOnWriteArrayList = this.d.c;
        for (sg6 sg6Var : copyOnWriteArrayList) {
            if (sg6Var.a == ug6Var) {
                copyOnWriteArrayList.remove(sg6Var);
            }
        }
    }

    public final void q(f8b f8bVar) {
        CopyOnWriteArrayList<e8b> copyOnWriteArrayList = this.c.c;
        for (e8b e8bVar : copyOnWriteArrayList) {
            if (e8bVar.b == f8bVar) {
                copyOnWriteArrayList.remove(e8bVar);
            }
        }
    }

    public abstract void r(j7b j7bVar);
}
