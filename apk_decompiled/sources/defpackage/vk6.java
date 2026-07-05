package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class vk6 extends zk6 {
    public q68 c;
    public int d;
    public int e;

    public vk6() {
        super(0, 3);
        this.c = o68.a;
        this.d = 0;
        this.e = 0;
    }

    @Override // defpackage.qk6
    public final qk6 a() {
        vk6 vk6Var = new vk6();
        vk6Var.c = this.c;
        vk6Var.d = this.d;
        vk6Var.e = this.e;
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((qk6) it.next()).a());
        }
        vk6Var.b.addAll(arrayList2);
        return vk6Var;
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
        return "EmittableRow(modifier=" + this.c + ", horizontalAlignment=" + ((Object) pt.b(this.d)) + ", verticalAlignment=" + ((Object) rt.b(this.e)) + ", children=[\n" + d() + "\n])";
    }
}
