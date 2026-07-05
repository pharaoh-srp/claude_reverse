package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c1a extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ d1a G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1a(d1a d1aVar, int i) {
        super(0);
        this.F = i;
        this.G = d1aVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        d1a d1aVar = this.G;
        switch (i) {
            case 0:
                uqb uqbVar = d1aVar.G;
                if (uqbVar.M) {
                    return Boolean.valueOf(j8.S((be4) uqbVar.O.getValue(), d1aVar.H));
                }
                ssj.r(uqbVar);
                throw null;
            case 1:
                uqb uqbVar2 = d1aVar.G;
                if (!uqbVar2.M) {
                    ssj.r(uqbVar2);
                    throw null;
                }
                be4 be4Var = (be4) uqbVar2.O.getValue();
                ww7 ww7Var = d1aVar.H;
                be4Var.getClass();
                ww7Var.getClass();
                ArrayList arrayList = new ArrayList();
                be4Var.b(ww7Var, arrayList);
                return arrayList;
            default:
                dfa dfaVar = d1aVar.J;
                wn9[] wn9VarArr = d1a.L;
                boolean zBooleanValue = ((Boolean) wd6.s0(dfaVar, wn9VarArr[1])).booleanValue();
                ww7 ww7Var2 = d1aVar.H;
                uqb uqbVar3 = d1aVar.G;
                if (zBooleanValue) {
                    return eab.b;
                }
                List list = (List) wd6.s0(d1aVar.I, wn9VarArr[0]);
                ArrayList arrayList2 = new ArrayList(x44.y(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((wmc) it.next()).G());
                }
                return sf5.r("package view scope for " + ww7Var2 + " in " + uqbVar3.getName(), w44.b1(arrayList2, new jvg(uqbVar3, ww7Var2)));
        }
    }
}
