package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tl9 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ ul9 G;
    public final /* synthetic */ xl9 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tl9(ul9 ul9Var, xl9 xl9Var, int i) {
        super(0);
        this.F = i;
        this.G = ul9Var;
        this.H = xl9Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        xl9 xl9Var = this.H;
        ul9 ul9Var = this.G;
        switch (i) {
            case 0:
                Collection<yr9> collectionB = ul9Var.a().p().b();
                collectionB.getClass();
                ArrayList arrayList = new ArrayList(collectionB.size());
                for (yr9 yr9Var : collectionB) {
                    yr9Var.getClass();
                    arrayList.add(new fo9(yr9Var, new h16(yr9Var, ul9Var, xl9Var, 1)));
                }
                qqb qqbVarA = ul9Var.a();
                sxb sxbVar = or9.e;
                if (!or9.b(qqbVarA, okg.a) && !or9.b(qqbVarA, okg.b)) {
                    if (arrayList.isEmpty()) {
                        arrayList.add(new fo9(o06.e(ul9Var.a()).e(), qs7.W));
                    } else {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            int iM = m06.c(((fo9) it.next()).E).m();
                            sq6.a(iM);
                            if (iM == 2 || iM == 5) {
                            }
                        }
                        arrayList.add(new fo9(o06.e(ul9Var.a()).e(), qs7.W));
                    }
                }
                return gb9.r(arrayList);
            default:
                List listI0 = ul9Var.a().i0();
                listI0.getClass();
                List<qai> list = listI0;
                ArrayList arrayList2 = new ArrayList(x44.y(list, 10));
                for (qai qaiVar : list) {
                    qaiVar.getClass();
                    arrayList2.add(new go9(xl9Var, qaiVar));
                }
                return arrayList2;
        }
    }
}
