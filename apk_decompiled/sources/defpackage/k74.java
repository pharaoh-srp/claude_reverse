package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k74 extends av6 {
    public boolean e;
    public int c = 0;
    public int d = 0;
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();

    @Override // defpackage.av6
    public final int a() {
        return this.d;
    }

    @Override // defpackage.av6
    public final void e() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((av6) it.next()).e();
        }
    }

    @Override // defpackage.av6
    public final boolean f() {
        return this.e;
    }

    public final void g() {
        ArrayList<av6> arrayList = this.a;
        this.c = arrayList.size();
        this.d = 0;
        for (av6 av6Var : arrayList) {
            this.d = av6Var.a() + this.d;
        }
        ArrayList arrayList2 = this.b;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        arrayList2.sort(Comparator.comparingInt(new h74()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((av6) it.next()).f()) {
                this.e = true;
                return;
            }
        }
    }
}
