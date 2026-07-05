package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class wk6 extends zk6 {
    public long c;
    public v8g d;

    public wk6() {
        super(0, 3);
        this.c = 9205357640488583168L;
        this.d = u8g.a;
    }

    @Override // defpackage.qk6
    public final qk6 a() {
        wk6 wk6Var = new wk6();
        wk6Var.c = this.c;
        wk6Var.d = this.d;
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((qk6) it.next()).a());
        }
        wk6Var.b.addAll(arrayList2);
        return wk6Var;
    }

    @Override // defpackage.qk6
    public final q68 b() {
        q68 q68VarB;
        qk6 qk6Var = (qk6) w44.g1(this.b);
        return (qk6Var == null || (q68VarB = qk6Var.b()) == null) ? ovj.d(o68.a).d(new km8(p46.a)) : q68VarB;
    }

    @Override // defpackage.qk6
    public final void c(q68 q68Var) {
        throw new IllegalAccessError("You cannot set the modifier of an EmittableSizeBox");
    }

    public final String toString() {
        return "EmittableSizeBox(size=" + ((Object) za6.e(this.c)) + ", sizeMode=" + this.d + ", children=[\n" + d() + "\n])";
    }
}
