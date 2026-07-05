package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class sk6 extends zk6 {
    public q68 c;
    public int d;
    public int e;

    public sk6() {
        super(0, 3);
        this.c = o68.a;
        this.d = 0;
        this.e = 0;
    }

    @Override // defpackage.qk6
    public final qk6 a() {
        sk6 sk6Var = new sk6();
        sk6Var.c = this.c;
        sk6Var.d = this.d;
        sk6Var.e = this.e;
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((qk6) it.next()).a());
        }
        sk6Var.b.addAll(arrayList2);
        return sk6Var;
    }

    @Override // defpackage.qk6
    public final q68 b() {
        return this.c;
    }

    @Override // defpackage.qk6
    public final void c(q68 q68Var) {
        this.c = q68Var;
    }

    public final String toString() {
        return "EmittableColumn(modifier=" + this.c + ", verticalAlignment=" + ((Object) rt.b(this.d)) + ", horizontalAlignment=" + ((Object) pt.b(this.e)) + ", children=[\n" + d() + "\n])";
    }
}
