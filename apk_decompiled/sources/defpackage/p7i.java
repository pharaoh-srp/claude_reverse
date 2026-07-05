package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class p7i implements ym4, ge1 {
    public final boolean a;
    public final ArrayList b = new ArrayList();
    public final int c;
    public final g54 d;
    public final g54 e;
    public final g54 f;

    public p7i(le1 le1Var, g1g g1gVar) {
        this.a = g1gVar.e;
        this.c = g1gVar.a;
        g54 g54VarA = g1gVar.b.a();
        this.d = g54VarA;
        g54 g54VarA2 = g1gVar.c.a();
        this.e = g54VarA2;
        g54 g54VarA3 = g1gVar.d.a();
        this.f = g54VarA3;
        le1Var.d(g54VarA);
        le1Var.d(g54VarA2);
        le1Var.d(g54VarA3);
        g54VarA.a(this);
        g54VarA2.a(this);
        g54VarA3.a(this);
    }

    @Override // defpackage.ge1
    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            ((ge1) arrayList.get(i)).a();
            i++;
        }
    }

    @Override // defpackage.ym4
    public final void b(List list, List list2) {
    }

    public final void d(ge1 ge1Var) {
        this.b.add(ge1Var);
    }
}
