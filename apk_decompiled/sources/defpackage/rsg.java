package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class rsg extends usg {
    public final ArrayList d;
    public int e;

    public rsg(av6 av6Var) {
        super(av6Var);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = 2;
        arrayList.add(av6Var);
        this.e = av6Var.a() + this.e;
    }

    @Override // defpackage.av6
    public final int a() {
        return this.e;
    }

    @Override // defpackage.usg, defpackage.av6
    public final void e() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((av6) it.next()).e();
        }
        super.e();
    }

    @Override // defpackage.usg
    public final boolean g(yj6 yj6Var, c5c c5cVar) {
        if (c5cVar == yj6Var) {
            return false;
        }
        ArrayList arrayList = this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (c5cVar == null || !((av6) arrayList.get(size)).d(yj6Var, c5cVar)) {
                return false;
            }
            c5cVar = c5cVar.G();
        }
        return true;
    }

    public final String toString() {
        return xrg.j(" > ", this.d);
    }
}
