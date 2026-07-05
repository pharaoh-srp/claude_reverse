package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class jfe extends zk6 {
    public final int c;
    public q68 d;

    public jfe(int i) {
        super(i, 2);
        this.c = i;
        this.d = o68.a;
    }

    @Override // defpackage.qk6
    public final qk6 a() {
        jfe jfeVar = new jfe(this.c);
        jfeVar.d = this.d;
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((qk6) it.next()).a());
        }
        jfeVar.b.addAll(arrayList2);
        return jfeVar;
    }

    @Override // defpackage.qk6
    public final q68 b() {
        return this.d;
    }

    @Override // defpackage.qk6
    public final void c(q68 q68Var) {
        this.d = q68Var;
    }

    public final String toString() {
        return "RemoteViewsRoot(modifier=" + this.d + ", children=[\n" + d() + "\n])";
    }
}
