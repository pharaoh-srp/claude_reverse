package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class qdc {
    public boolean b;
    public final ArrayList a = new ArrayList();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();

    public qdc(boolean z) {
        this.b = z;
    }

    public void a() {
    }

    public abstract void b();

    public void c(ab1 ab1Var) {
    }

    public void d(ab1 ab1Var) {
    }

    public final void e() throws Exception {
        CopyOnWriteArrayList copyOnWriteArrayList = this.c;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            vb7.C((AutoCloseable) it.next());
        }
        copyOnWriteArrayList.clear();
        ArrayList arrayList = this.a;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((pdc) it2.next()).e();
        }
        arrayList.clear();
    }

    public final void f(boolean z) {
        this.b = z;
        for (pdc pdcVar : this.a) {
            pdcVar.f(pdcVar.e && z);
        }
    }
}
