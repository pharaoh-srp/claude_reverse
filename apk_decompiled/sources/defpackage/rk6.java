package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class rk6 extends zk6 {
    public q68 c;
    public st d;

    public rk6() {
        super(0, 3);
        this.c = o68.a;
        this.d = st.c;
    }

    @Override // defpackage.qk6
    public final qk6 a() {
        rk6 rk6Var = new rk6();
        rk6Var.c = this.c;
        rk6Var.d = this.d;
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((qk6) it.next()).a());
        }
        rk6Var.b.addAll(arrayList2);
        return rk6Var;
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
        return "EmittableBox(modifier=" + this.c + ", contentAlignment=" + this.d + "children=[\n" + d() + "\n])";
    }
}
