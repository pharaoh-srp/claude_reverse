package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bs4 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ List F;
    public final /* synthetic */ bz7 G;

    public /* synthetic */ bs4(bz7 bz7Var, List list) {
        this.E = 2;
        this.G = bz7Var;
        this.F = list;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        int i2 = 0;
        iei ieiVar = iei.a;
        bz7 bz7Var = this.G;
        List list = this.F;
        switch (i) {
            case 0:
                j0a j0aVar = (j0a) obj;
                j0aVar.getClass();
                j0aVar.W(list.size(), new z04(new fc4(17), 7, list), new tq(list, 11), new ta4(802480018, true, new es4(i2, bz7Var, list)));
                return ieiVar;
            case 1:
                j0a j0aVar2 = (j0a) obj;
                j0aVar2.getClass();
                for (Object obj2 : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        x44.n0();
                        throw null;
                    }
                    rbb rbbVar = (rbb) obj2;
                    int i4 = 2;
                    if (i2 > 0) {
                        j0a.V(j0aVar2, grc.p(i2, "gap-"), null, npk.c, 2);
                    }
                    j0a.V(j0aVar2, grc.p(i2, "header-"), null, new ta4(-1769748496, true, new lca(3, rbbVar)), 2);
                    List list2 = rbbVar.b;
                    j0aVar2.W(list2.size(), new z04(new oua(i4), 25, list2), new tq(list2, 24), new ta4(2039820996, true, new lp(list2, rbbVar, bz7Var, 8)));
                    i2 = i3;
                }
                return ieiVar;
            case 2:
                bz7Var.invoke(list.get(wd6.e0(mwa.L(((Float) obj).floatValue()), 0, x44.M(list))));
                return ieiVar;
            default:
                j0a j0aVar3 = (j0a) obj;
                j0aVar3.getClass();
                j0aVar3.W(list.size(), new zkd(new d6f(15), 6, list), new tq(list, 29), new ta4(802480018, true, new es4(4, bz7Var, list)));
                return ieiVar;
        }
    }

    public /* synthetic */ bs4(int i, bz7 bz7Var, List list) {
        this.E = i;
        this.F = list;
        this.G = bz7Var;
    }
}
